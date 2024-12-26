package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g;

import android.util.Log;
import java.io.Writer;

/* renamed from: a.b.g.g.e  reason: invalid class name */
public class Ce extends Writer {

    /* renamed from: c  reason: contains not printable characters */
    private final String f۸۷۴۷c;

    /* renamed from: d  reason: contains not printable characters */
    private StringBuilder f۸۷۴۸d = new StringBuilder(128);

    public Ce(String tag) {
        this.f۸۷۴۷c = tag;
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        m۱۰۵۹۳l();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m۱۰۵۹۳l();
    }

    @Override // java.io.Writer
    public void write(char[] buf, int offset, int count) {
        for (int i = 0; i < count; i++) {
            char c = buf[offset + i];
            if (c == '\n') {
                m۱۰۵۹۳l();
            } else {
                this.f۸۷۴۸d.append(c);
            }
        }
    }

    /* renamed from: l  reason: contains not printable characters */
    private void m۱۰۵۹۳l() {
        if (this.f۸۷۴۸d.length() > 0) {
            Log.d(this.f۸۷۴۷c, this.f۸۷۴۸d.toString());
            StringBuilder sb = this.f۸۷۴۸d;
            sb.delete(0, sb.length());
        }
    }
}
