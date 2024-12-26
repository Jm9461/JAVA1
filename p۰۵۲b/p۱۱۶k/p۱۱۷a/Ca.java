package p۰۵۲b.p۱۱۶k.p۱۱۷a;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: b.k.a.a  reason: invalid class name */
public class Ca {
    public Ca(Context context) {
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۶۵۱۶a() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۶۵۱۷a(String path) {
        File directory = new File(path);
        if (!directory.exists()) {
            return directory.mkdirs();
        }
        Log.w("Storage", "Directory '" + path + "' already exists");
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۶۵۱۹b(String path) {
        return new File(path).delete();
    }

    /* renamed from: c  reason: contains not printable characters */
    public File m۱۶۵۲۰c(String path) {
        return new File(path);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۶۵۱۸a(String fromPath, String toPath) {
        File file = m۱۶۵۲۰c(fromPath);
        if (!file.isFile()) {
            return false;
        }
        FileInputStream inStream = null;
        FileOutputStream outStream = null;
        try {
            inStream = new FileInputStream(file);
            outStream = new FileOutputStream(new File(toPath));
            FileChannel inChannel = inStream.getChannel();
            inChannel.transferTo(0, inChannel.size(), outStream.getChannel());
            m۱۶۵۱۵a(inStream);
            m۱۶۵۱۵a(outStream);
            return true;
        } catch (Exception e) {
            Log.e("Storage", "Failed copy", e);
            m۱۶۵۱۵a(inStream);
            m۱۶۵۱۵a(outStream);
            return false;
        } catch (Throwable th) {
            m۱۶۵۱۵a(inStream);
            m۱۶۵۱۵a(outStream);
            throw th;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۵۱۵a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }
}
