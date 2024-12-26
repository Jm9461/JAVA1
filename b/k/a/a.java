package b.k.a;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class a {
    public a(Context context) {
    }

    public String a() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public boolean a(String path) {
        File directory = new File(path);
        if (!directory.exists()) {
            return directory.mkdirs();
        }
        Log.w("Storage", "Directory '" + path + "' already exists");
        return false;
    }

    public boolean b(String path) {
        return new File(path).delete();
    }

    public File c(String path) {
        return new File(path);
    }

    public boolean a(String fromPath, String toPath) {
        File file = c(fromPath);
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
            a(inStream);
            a(outStream);
            return true;
        } catch (Exception e2) {
            Log.e("Storage", "Failed copy", e2);
            a(inStream);
            a(outStream);
            return false;
        } catch (Throwable th) {
            a(inStream);
            a(outStream);
            throw th;
        }
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
            }
        }
    }
}
