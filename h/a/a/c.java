package h.a.a;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* access modifiers changed from: package-private */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static String f۴۲۴۸a = "EasyImage";

    /* renamed from: b  reason: collision with root package name */
    public static String f۴۲۴۹b = "Temp";

    public static String c(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("pl.aprilapps.folder_name", f۴۲۴۸a);
    }

    public static File g(Context context) {
        File dir = PreferenceManager.getDefaultSharedPreferences(context).getBoolean("pl.aprilapps.public_temp", false) ? f(context) : d(context);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    public static File e(Context context) {
        return context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    }

    public static File f(Context context) {
        File publicTempDir = new File(new File(b(context), c(context)), f۴۲۴۹b);
        if (!publicTempDir.exists()) {
            publicTempDir.mkdirs();
        }
        return publicTempDir;
    }

    private static File d(Context context) {
        File privateTempDir = new File(context.getApplicationContext().getCacheDir(), c(context));
        if (!privateTempDir.exists()) {
            privateTempDir.mkdirs();
        }
        return privateTempDir;
    }

    public static void a(InputStream in, File file) {
        try {
            OutputStream out = new FileOutputStream(file);
            byte[] buf = new byte[1024];
            while (true) {
                int len = in.read(buf);
                if (len > 0) {
                    out.write(buf, 0, len);
                } else {
                    out.close();
                    in.close();
                    return;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static File b(Context context, Uri photoUri) {
        InputStream pictureInputStream = context.getContentResolver().openInputStream(photoUri);
        File directory = g(context);
        File photoFile = new File(directory, UUID.randomUUID().toString() + "." + a(context, photoUri));
        photoFile.createNewFile();
        a(pictureInputStream, photoFile);
        return photoFile;
    }

    public static String b(Context context) {
        File publicAppExternalDir = e(context);
        String defaultFolderLocation = null;
        if (publicAppExternalDir != null) {
            defaultFolderLocation = publicAppExternalDir.getPath();
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getString("pl.aprilapps.folder_location", defaultFolderLocation);
    }

    public static File a(Context context) {
        File cacheDir = context.getCacheDir();
        if (a()) {
            cacheDir = context.getExternalCacheDir();
        }
        File dir = new File(cacheDir, f۴۲۴۸a);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return File.createTempFile(UUID.randomUUID().toString(), ".jpg", dir);
    }

    private static boolean a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* JADX INFO: Multiple debug info for r0v7 java.lang.String: [D('mime' android.webkit.MimeTypeMap), D('extension' java.lang.String)] */
    public static String a(Context context, Uri uri) {
        if (uri.getScheme().equals("content")) {
            return MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
        }
        return MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
    }
}
