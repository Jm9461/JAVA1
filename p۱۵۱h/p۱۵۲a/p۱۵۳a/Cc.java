package p۱۵۱h.p۱۵۲a.p۱۵۳a;

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
/* renamed from: h.a.a.c  reason: invalid class name */
public class Cc {

    /* renamed from: a  reason: contains not printable characters */
    public static String f۱۶۳۴۳a = "EasyImage";

    /* renamed from: b  reason: contains not printable characters */
    public static String f۱۶۳۴۴b = "Temp";

    /* renamed from: c  reason: contains not printable characters */
    public static String m۱۹۶۴۷c(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("pl.aprilapps.folder_name", f۱۶۳۴۳a);
    }

    /* renamed from: g  reason: contains not printable characters */
    public static File m۱۹۶۵۱g(Context context) {
        File dir = PreferenceManager.getDefaultSharedPreferences(context).getBoolean("pl.aprilapps.public_temp", false) ? m۱۹۶۵۰f(context) : m۱۹۶۴۸d(context);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    /* renamed from: e  reason: contains not printable characters */
    public static File m۱۹۶۴۹e(Context context) {
        return context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    }

    /* renamed from: f  reason: contains not printable characters */
    public static File m۱۹۶۵۰f(Context context) {
        File publicTempDir = new File(new File(m۱۹۶۴۶b(context), m۱۹۶۴۷c(context)), f۱۶۳۴۴b);
        if (!publicTempDir.exists()) {
            publicTempDir.mkdirs();
        }
        return publicTempDir;
    }

    /* renamed from: d  reason: contains not printable characters */
    private static File m۱۹۶۴۸d(Context context) {
        File privateTempDir = new File(context.getApplicationContext().getCacheDir(), m۱۹۶۴۷c(context));
        if (!privateTempDir.exists()) {
            privateTempDir.mkdirs();
        }
        return privateTempDir;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۹۶۴۳a(InputStream in, File file) {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static File m۱۹۶۴۵b(Context context, Uri photoUri) {
        InputStream pictureInputStream = context.getContentResolver().openInputStream(photoUri);
        File directory = m۱۹۶۵۱g(context);
        File photoFile = new File(directory, UUID.randomUUID().toString() + "." + m۱۹۶۴۲a(context, photoUri));
        photoFile.createNewFile();
        m۱۹۶۴۳a(pictureInputStream, photoFile);
        return photoFile;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static String m۱۹۶۴۶b(Context context) {
        File publicAppExternalDir = m۱۹۶۴۹e(context);
        String defaultFolderLocation = null;
        if (publicAppExternalDir != null) {
            defaultFolderLocation = publicAppExternalDir.getPath();
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getString("pl.aprilapps.folder_location", defaultFolderLocation);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static File m۱۹۶۴۱a(Context context) {
        File cacheDir = context.getCacheDir();
        if (m۱۹۶۴۴a()) {
            cacheDir = context.getExternalCacheDir();
        }
        File dir = new File(cacheDir, f۱۶۳۴۳a);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return File.createTempFile(UUID.randomUUID().toString(), ".jpg", dir);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۹۶۴۴a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* JADX INFO: Multiple debug info for r0v7 java.lang.String: [D('mime' android.webkit.MimeTypeMap), D('extension' java.lang.String)] */
    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۹۶۴۲a(Context context, Uri uri) {
        if (uri.getScheme().equals("content")) {
            return MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
        }
        return MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
    }
}
