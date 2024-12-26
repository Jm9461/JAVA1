package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: a.b.g.a.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ci {
    /* renamed from: a, reason: contains not printable characters */
    public static File m۸۴۱۶a(Context context) {
        String prefix = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(context.getCacheDir(), prefix + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static ByteBuffer m۸۴۱۹a(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            try {
                FileChannel channel = fis.getChannel();
                long size = channel.size();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, size);
                fis.close();
                return map;
            } finally {
            }
        } catch (IOException e2) {
            return null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static ByteBuffer m۸۴۱۸a(Context context, CancellationSignal cancellationSignal, Uri uri) {
        ContentResolver resolver = context.getContentResolver();
        try {
            ParcelFileDescriptor pfd = resolver.openFileDescriptor(uri, "r", cancellationSignal);
            if (pfd != null) {
                try {
                    FileInputStream fis = new FileInputStream(pfd.getFileDescriptor());
                    try {
                        FileChannel channel = fis.getChannel();
                        long size = channel.size();
                        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, size);
                        fis.close();
                        if (pfd != null) {
                            pfd.close();
                        }
                        return map;
                    } finally {
                    }
                } finally {
                }
            } else {
                if (pfd != null) {
                    pfd.close();
                }
                return null;
            }
        } catch (IOException e2) {
            return null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static ByteBuffer m۸۴۱۷a(Context context, Resources res, int id) {
        File tmpFile = m۸۴۱۶a(context);
        ByteBuffer byteBuffer = null;
        if (tmpFile == null) {
            return null;
        }
        try {
            if (m۸۴۲۱a(tmpFile, res, id)) {
                byteBuffer = m۸۴۱۹a(tmpFile);
            }
            return byteBuffer;
        } finally {
            tmpFile.delete();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۸۴۲۲a(File file, InputStream is) {
        FileOutputStream os = null;
        StrictMode.ThreadPolicy old = StrictMode.allowThreadDiskWrites();
        try {
            os = new FileOutputStream(file, false);
            byte[] buffer = new byte[1024];
            while (true) {
                int readLen = is.read(buffer);
                if (readLen == -1) {
                    return true;
                }
                os.write(buffer, 0, readLen);
            }
        } catch (IOException e2) {
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e2.getMessage());
            return false;
        } finally {
            m۸۴۲۰a(os);
            StrictMode.setThreadPolicy(old);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۸۴۲۱a(File file, Resources res, int id) {
        InputStream is = null;
        try {
            is = res.openRawResource(id);
            return m۸۴۲۲a(file, is);
        } finally {
            m۸۴۲۰a(is);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۸۴۲۰a(Closeable c2) {
        if (c2 != null) {
            try {
                c2.close();
            } catch (IOException e2) {
            }
        }
    }
}
