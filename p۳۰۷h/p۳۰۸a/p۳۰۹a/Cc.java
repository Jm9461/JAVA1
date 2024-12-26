package p۳۰۷h.p۳۰۸a.p۳۰۹a;

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

/* renamed from: h.a.a.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cc {

    /* renamed from: a, reason: contains not printable characters */
    public static String f۱۶۳۴۳a = "EasyImage";

    /* renamed from: b, reason: contains not printable characters */
    public static String f۱۶۳۴۴b = "Temp";

    /* renamed from: c, reason: contains not printable characters */
    public static String m۱۷۵۷۰c(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("pl.aprilapps.folder_name", f۱۶۳۴۳a);
    }

    /* renamed from: g, reason: contains not printable characters */
    public static File m۱۷۵۷۴g(Context context) {
        boolean publicTemp = PreferenceManager.getDefaultSharedPreferences(context).getBoolean("pl.aprilapps.public_temp", false);
        File dir = publicTemp ? m۱۷۵۷۳f(context) : m۱۷۵۷۱d(context);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    /* renamed from: e, reason: contains not printable characters */
    public static File m۱۷۵۷۲e(Context context) {
        return context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    }

    /* renamed from: f, reason: contains not printable characters */
    public static File m۱۷۵۷۳f(Context context) {
        File cameraPicturesDir = new File(m۱۷۵۶۹b(context), m۱۷۵۷۰c(context));
        File publicTempDir = new File(cameraPicturesDir, f۱۶۳۴۴b);
        if (!publicTempDir.exists()) {
            publicTempDir.mkdirs();
        }
        return publicTempDir;
    }

    /* renamed from: d, reason: contains not printable characters */
    private static File m۱۷۵۷۱d(Context context) {
        File privateTempDir = new File(context.getApplicationContext().getCacheDir(), m۱۷۵۷۰c(context));
        if (!privateTempDir.exists()) {
            privateTempDir.mkdirs();
        }
        return privateTempDir;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۷۵۶۶a(InputStream in, File file) {
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

    /* renamed from: b, reason: contains not printable characters */
    public static File m۱۷۵۶۸b(Context context, Uri photoUri) {
        InputStream pictureInputStream = context.getContentResolver().openInputStream(photoUri);
        File directory = m۱۷۵۷۴g(context);
        File photoFile = new File(directory, UUID.randomUUID().toString() + "." + m۱۷۵۶۵a(context, photoUri));
        photoFile.createNewFile();
        m۱۷۵۶۶a(pictureInputStream, photoFile);
        return photoFile;
    }

    /* renamed from: b, reason: contains not printable characters */
    public static String m۱۷۵۶۹b(Context context) {
        File publicAppExternalDir = m۱۷۵۷۲e(context);
        String defaultFolderLocation = null;
        if (publicAppExternalDir != null) {
            defaultFolderLocation = publicAppExternalDir.getPath();
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getString("pl.aprilapps.folder_location", defaultFolderLocation);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static File m۱۷۵۶۴a(Context context) {
        File cacheDir = context.getCacheDir();
        if (m۱۷۵۶۷a()) {
            cacheDir = context.getExternalCacheDir();
        }
        File dir = new File(cacheDir, f۱۶۳۴۳a);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File imageFile = File.createTempFile(UUID.randomUUID().toString(), ".jpg", dir);
        return imageFile;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۷۵۶۷a() {
        String state = Environment.getExternalStorageState();
        return "mounted".equals(state);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String m۱۷۵۶۵a(Context context, Uri uri) {
        if (uri.getScheme().equals("content")) {
            MimeTypeMap mime = MimeTypeMap.getSingleton();
            String extension = mime.getExtensionFromMimeType(context.getContentResolver().getType(uri));
            return extension;
        }
        String extension2 = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
        return extension2;
    }
}
