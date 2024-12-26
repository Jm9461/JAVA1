package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g;

import android.util.Log;
import java.io.Writer;

/* renamed from: a.b.g.g.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ce extends Writer {

    /* renamed from: c, reason: contains not printable characters */
    private final String f۸۷۴۷c;

    /* renamed from: d, reason: contains not printable characters */
    private StringBuilder f۸۷۴۸d = new StringBuilder(128);

    public Ce(String tag) {
        this.f۸۷۴۷c = tag;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m۸۵۲۲l();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m۸۵۲۲l();
    }

    @Override // java.io.Writer
    public void write(char[] buf, int offset, int count) {
        for (int i = 0; i < count; i++) {
            char c2 = buf[offset + i];
            if (c2 == '\n') {
                m۸۵۲۲l();
            } else {
                this.f۸۷۴۸d.append(c2);
            }
        }
    }

    /* renamed from: l, reason: contains not printable characters */
    private void m۸۵۲۲l() {
        if (this.f۸۷۴۸d.length() > 0) {
            Log.d(this.f۸۷۴۷c, this.f۸۷۴۸d.toString());
            StringBuilder sb = this.f۸۷۴۸d;
            sb.delete(0, sb.length());
        }
    }
}
