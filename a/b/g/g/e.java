package a.b.g.g;

import android.util.Log;
import java.io.Writer;

public class e extends Writer {

    /* renamed from: c  reason: collision with root package name */
    private final String f۳۷۹c;

    /* renamed from: d  reason: collision with root package name */
    private StringBuilder f۳۸۰d = new StringBuilder(128);

    public e(String tag) {
        this.f۳۷۹c = tag;
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        l();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        l();
    }

    @Override // java.io.Writer
    public void write(char[] buf, int offset, int count) {
        for (int i = 0; i < count; i++) {
            char c2 = buf[offset + i];
            if (c2 == '\n') {
                l();
            } else {
                this.f۳۸۰d.append(c2);
            }
        }
    }

    private void l() {
        if (this.f۳۸۰d.length() > 0) {
            Log.d(this.f۳۷۹c, this.f۳۸۰d.toString());
            StringBuilder sb = this.f۳۸۰d;
            sb.delete(0, sb.length());
        }
    }
}
