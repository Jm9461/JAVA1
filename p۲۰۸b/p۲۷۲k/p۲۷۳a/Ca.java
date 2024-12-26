package p۲۰۸b.p۲۷۲k.p۲۷۳a;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: b.k.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {
    public Ca(Context context) {
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۴۴۴۱a() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۴۴۴۲a(String path) {
        File directory = new File(path);
        if (directory.exists()) {
            Log.w("Storage", "Directory '" + path + "' already exists");
            return false;
        }
        return directory.mkdirs();
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۴۴۴۴b(String path) {
        File file = new File(path);
        return file.delete();
    }

    /* renamed from: c, reason: contains not printable characters */
    public File m۱۴۴۴۵c(String path) {
        return new File(path);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۴۴۴۳a(String fromPath, String toPath) {
        File file = m۱۴۴۴۵c(fromPath);
        if (!file.isFile()) {
            return false;
        }
        FileInputStream inStream = null;
        FileOutputStream outStream = null;
        try {
            try {
                inStream = new FileInputStream(file);
                outStream = new FileOutputStream(new File(toPath));
                FileChannel inChannel = inStream.getChannel();
                FileChannel outChannel = outStream.getChannel();
                inChannel.transferTo(0L, inChannel.size(), outChannel);
                m۱۴۴۴۰a(inStream);
                m۱۴۴۴۰a(outStream);
                return true;
            } catch (Exception e2) {
                Log.e("Storage", "Failed copy", e2);
                m۱۴۴۴۰a(inStream);
                m۱۴۴۴۰a(outStream);
                return false;
            }
        } catch (Throwable th) {
            m۱۴۴۴۰a(inStream);
            m۱۴۴۴۰a(outStream);
            throw th;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۴۴۴۰a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
            }
        }
    }
}
