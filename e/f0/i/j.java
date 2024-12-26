package e.f0.i;

import e.f0.i.d;
import f.c;
import f.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public final class j implements Closeable {
    private static final Logger i = Logger.getLogger(e.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private final d f۳۹۹۳c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f۳۹۹۴d;

    /* renamed from: e  reason: collision with root package name */
    private final c f۳۹۹۵e = new c();

    /* renamed from: f  reason: collision with root package name */
    private int f۳۹۹۶f = 16384;

    /* renamed from: g  reason: collision with root package name */
    private boolean f۳۹۹۷g;

    /* renamed from: h  reason: collision with root package name */
    final d.b f۳۹۹۸h = new d.b(this.f۳۹۹۵e);

    j(f.d sink, boolean client) {
        this.f۳۹۹۳c = sink;
        this.f۳۹۹۴d = client;
    }

    public synchronized void l() {
        if (this.f۳۹۹۷g) {
            throw new IOException("closed");
        } else if (this.f۳۹۹۴d) {
            if (i.isLoggable(Level.FINE)) {
                i.fine(e.f0.c.a(">> CONNECTION %s", e.f۳۹۰۲a.b()));
            }
            this.f۳۹۹۳c.write(e.f۳۹۰۲a.h());
            this.f۳۹۹۳c.flush();
        }
    }

    public synchronized void a(m peerSettings) {
        if (!this.f۳۹۹۷g) {
            this.f۳۹۹۶f = peerSettings.c(this.f۳۹۹۶f);
            if (peerSettings.b() != -1) {
                this.f۳۹۹۸h.a(peerSettings.b());
            }
            a(0, 0, (byte) 4, (byte) 1);
            this.f۳۹۹۳c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int streamId, int promisedStreamId, List<c> list) {
        if (!this.f۳۹۹۷g) {
            this.f۳۹۹۸h.a(list);
            long byteCount = this.f۳۹۹۵e.q();
            byte flags = 4;
            int length = (int) Math.min((long) (this.f۳۹۹۶f - 4), byteCount);
            if (byteCount != ((long) length)) {
                flags = 0;
            }
            a(streamId, length + 4, (byte) 5, flags);
            this.f۳۹۹۳c.writeInt(Integer.MAX_VALUE & promisedStreamId);
            this.f۳۹۹۳c.a(this.f۳۹۹۵e, (long) length);
            if (byteCount > ((long) length)) {
                b(streamId, byteCount - ((long) length));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void flush() {
        if (!this.f۳۹۹۷g) {
            this.f۳۹۹۳c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean outFinished, int streamId, int associatedStreamId, List<c> list) {
        if (!this.f۳۹۹۷g) {
            a(outFinished, streamId, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int streamId, b errorCode) {
        if (this.f۳۹۹۷g) {
            throw new IOException("closed");
        } else if (errorCode.f۳۸۷۵c != -1) {
            a(streamId, 4, (byte) 3, (byte) 0);
            this.f۳۹۹۳c.writeInt(errorCode.f۳۸۷۵c);
            this.f۳۹۹۳c.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int m() {
        return this.f۳۹۹۶f;
    }

    public synchronized void a(boolean outFinished, int streamId, c source, int byteCount) {
        if (!this.f۳۹۹۷g) {
            byte flags = 0;
            if (outFinished) {
                flags = (byte) (0 | 1);
            }
            a(streamId, flags, source, byteCount);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int streamId, byte flags, c buffer, int byteCount) {
        a(streamId, byteCount, (byte) 0, flags);
        if (byteCount > 0) {
            this.f۳۹۹۳c.a(buffer, (long) byteCount);
        }
    }

    public synchronized void b(m settings) {
        if (!this.f۳۹۹۷g) {
            a(0, settings.d() * 6, (byte) 4, (byte) 0);
            for (int i2 = 0; i2 < 10; i2++) {
                if (settings.d(i2)) {
                    int id = i2;
                    if (id == 4) {
                        id = 3;
                    } else if (id == 7) {
                        id = 4;
                    }
                    this.f۳۹۹۳c.writeShort(id);
                    this.f۳۹۹۳c.writeInt(settings.a(i2));
                }
            }
            this.f۳۹۹۳c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean ack, int payload1, int payload2) {
        if (!this.f۳۹۹۷g) {
            a(0, 8, (byte) 6, ack ? (byte) 1 : 0);
            this.f۳۹۹۳c.writeInt(payload1);
            this.f۳۹۹۳c.writeInt(payload2);
            this.f۳۹۹۳c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int lastGoodStreamId, b errorCode, byte[] debugData) {
        if (this.f۳۹۹۷g) {
            throw new IOException("closed");
        } else if (errorCode.f۳۸۷۵c != -1) {
            a(0, debugData.length + 8, (byte) 7, (byte) 0);
            this.f۳۹۹۳c.writeInt(lastGoodStreamId);
            this.f۳۹۹۳c.writeInt(errorCode.f۳۸۷۵c);
            if (debugData.length > 0) {
                this.f۳۹۹۳c.write(debugData);
            }
            this.f۳۹۹۳c.flush();
        } else {
            e.a("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    public synchronized void a(int streamId, long windowSizeIncrement) {
        if (this.f۳۹۹۷g) {
            throw new IOException("closed");
        } else if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
            e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(windowSizeIncrement));
            throw null;
        } else {
            a(streamId, 4, (byte) 8, (byte) 0);
            this.f۳۹۹۳c.writeInt((int) windowSizeIncrement);
            this.f۳۹۹۳c.flush();
        }
    }

    public void a(int streamId, int length, byte type, byte flags) {
        if (i.isLoggable(Level.FINE)) {
            i.fine(e.a(false, streamId, length, type, flags));
        }
        int i2 = this.f۳۹۹۶f;
        if (length > i2) {
            e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i2), Integer.valueOf(length));
            throw null;
        } else if ((Integer.MIN_VALUE & streamId) == 0) {
            a(this.f۳۹۹۳c, length);
            this.f۳۹۹۳c.writeByte(type & 255);
            this.f۳۹۹۳c.writeByte(flags & 255);
            this.f۳۹۹۳c.writeInt(Integer.MAX_VALUE & streamId);
        } else {
            e.a("reserved bit set: %s", Integer.valueOf(streamId));
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f۳۹۹۷g = true;
        this.f۳۹۹۳c.close();
    }

    private static void a(f.d sink, int i2) {
        sink.writeByte((i2 >>> 16) & 255);
        sink.writeByte((i2 >>> 8) & 255);
        sink.writeByte(i2 & 255);
    }

    private void b(int streamId, long byteCount) {
        while (byteCount > 0) {
            int length = (int) Math.min((long) this.f۳۹۹۶f, byteCount);
            byteCount -= (long) length;
            a(streamId, length, (byte) 9, byteCount == 0 ? (byte) 4 : 0);
            this.f۳۹۹۳c.a(this.f۳۹۹۵e, (long) length);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean outFinished, int streamId, List<c> list) {
        if (!this.f۳۹۹۷g) {
            this.f۳۹۹۸h.a(list);
            long byteCount = this.f۳۹۹۵e.q();
            int length = (int) Math.min((long) this.f۳۹۹۶f, byteCount);
            byte flags = byteCount == ((long) length) ? (byte) 4 : 0;
            if (outFinished) {
                flags = (byte) (flags | 1);
            }
            a(streamId, length, (byte) 1, flags);
            this.f۳۹۹۳c.a(this.f۳۹۹۵e, (long) length);
            if (byteCount > ((long) length)) {
                b(streamId, byteCount - ((long) length));
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
