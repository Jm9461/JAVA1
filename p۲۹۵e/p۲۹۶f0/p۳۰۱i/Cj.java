package p۲۹۵e.p۲۹۶f0.p۳۰۱i;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p۲۹۵e.p۲۹۶f0.p۳۰۱i.Cd;
import p۳۰۵f.Cc;
import p۳۰۵f.InterfaceCd;

/* renamed from: e.f0.i.j, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cj implements Closeable {

    /* renamed from: i, reason: contains not printable characters */
    private static final Logger f۱۶۰۲۶i = Logger.getLogger(Ce.class.getName());

    /* renamed from: c, reason: contains not printable characters */
    private final InterfaceCd f۱۶۰۲۷c;

    /* renamed from: d, reason: contains not printable characters */
    private final boolean f۱۶۰۲۸d;

    /* renamed from: g, reason: contains not printable characters */
    private boolean f۱۶۰۳۱g;

    /* renamed from: e, reason: contains not printable characters */
    private final Cc f۱۶۰۲۹e = new Cc();

    /* renamed from: h, reason: contains not printable characters */
    final Cd.b f۱۶۰۳۲h = new Cd.b(this.f۱۶۰۲۹e);

    /* renamed from: f, reason: contains not printable characters */
    private int f۱۶۰۳۰f = 16384;

    Cj(InterfaceCd sink, boolean client) {
        this.f۱۶۰۲۷c = sink;
        this.f۱۶۰۲۸d = client;
    }

    /* renamed from: l, reason: contains not printable characters */
    public synchronized void m۱۶۹۲۵l() {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        }
        if (this.f۱۶۰۲۸d) {
            if (f۱۶۰۲۶i.isLoggable(Level.FINE)) {
                f۱۶۰۲۶i.fine(p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۳۵a(">> CONNECTION %s", Ce.f۱۵۹۱۰a.mo۱۷۴۶۷b()));
            }
            this.f۱۶۰۲۷c.write(Ce.f۱۵۹۱۰a.mo۱۷۴۷۳h());
            this.f۱۶۰۲۷c.flush();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public synchronized void m۱۶۹۱۹a(Cm peerSettings) {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        }
        this.f۱۶۰۳۰f = peerSettings.m۱۶۹۴۸c(this.f۱۶۰۳۰f);
        if (peerSettings.m۱۶۹۴۵b() != -1) {
            this.f۱۶۰۳۲h.m۱۶۷۸۰a(peerSettings.m۱۶۹۴۵b());
        }
        m۱۶۹۱۴a(0, 0, (byte) 4, (byte) 1);
        this.f۱۶۰۲۷c.flush();
    }

    /* renamed from: a, reason: contains not printable characters */
    public synchronized void m۱۶۹۱۵a(int streamId, int promisedStreamId, List<Cc> list) {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        }
        this.f۱۶۰۳۲h.m۱۶۷۸۳a(list);
        long byteCount = this.f۱۶۰۲۹e.m۱۷۳۳۲q();
        byte flags = 4;
        int length = (int) Math.min(this.f۱۶۰۳۰f - 4, byteCount);
        if (byteCount != length) {
            flags = 0;
        }
        m۱۶۹۱۴a(streamId, length + 4, (byte) 5, flags);
        this.f۱۶۰۲۷c.writeInt(Integer.MAX_VALUE & promisedStreamId);
        this.f۱۶۰۲۷c.mo۱۷۴۷۵a(this.f۱۶۰۲۹e, length);
        if (byteCount > length) {
            m۱۶۹۱۲b(streamId, byteCount - length);
        }
    }

    public synchronized void flush() {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        }
        this.f۱۶۰۲۷c.flush();
    }

    /* renamed from: a, reason: contains not printable characters */
    public synchronized void m۱۶۹۲۱a(boolean outFinished, int streamId, int associatedStreamId, List<Cc> list) {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        }
        m۱۶۹۲۳a(outFinished, streamId, list);
    }

    /* renamed from: a, reason: contains not printable characters */
    public synchronized void m۱۶۹۱۷a(int streamId, EnumCb errorCode) {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        }
        if (errorCode.f۱۵۸۸۱c == -1) {
            throw new IllegalArgumentException();
        }
        m۱۶۹۱۴a(streamId, 4, (byte) 3, (byte) 0);
        this.f۱۶۰۲۷c.writeInt(errorCode.f۱۵۸۸۱c);
        this.f۱۶۰۲۷c.flush();
    }

    /* renamed from: m, reason: contains not printable characters */
    public int m۱۶۹۲۶m() {
        return this.f۱۶۰۳۰f;
    }

    /* renamed from: a, reason: contains not printable characters */
    public synchronized void m۱۶۹۲۲a(boolean outFinished, int streamId, Cc source, int byteCount) {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        }
        byte flags = outFinished ? (byte) (0 | 1) : (byte) 0;
        m۱۶۹۱۳a(streamId, flags, source, byteCount);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۹۱۳a(int streamId, byte flags, Cc buffer, int byteCount) {
        m۱۶۹۱۴a(streamId, byteCount, (byte) 0, flags);
        if (byteCount > 0) {
            this.f۱۶۰۲۷c.mo۱۷۴۷۵a(buffer, byteCount);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public synchronized void m۱۶۹۲۴b(Cm settings) {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        }
        int length = settings.m۱۶۹۴۹d() * 6;
        m۱۶۹۱۴a(0, length, (byte) 4, (byte) 0);
        for (int i = 0; i < 10; i++) {
            if (settings.m۱۶۹۵۰d(i)) {
                int id = i;
                if (id == 4) {
                    id = 3;
                } else if (id == 7) {
                    id = 4;
                }
                this.f۱۶۰۲۷c.writeShort(id);
                this.f۱۶۰۲۷c.writeInt(settings.m۱۶۹۴۱a(i));
            }
        }
        this.f۱۶۰۲۷c.flush();
    }

    /* renamed from: a, reason: contains not printable characters */
    public synchronized void m۱۶۹۲۰a(boolean ack, int payload1, int payload2) {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        }
        byte flags = ack ? (byte) 1 : (byte) 0;
        m۱۶۹۱۴a(0, 8, (byte) 6, flags);
        this.f۱۶۰۲۷c.writeInt(payload1);
        this.f۱۶۰۲۷c.writeInt(payload2);
        this.f۱۶۰۲۷c.flush();
    }

    /* renamed from: a, reason: contains not printable characters */
    public synchronized void m۱۶۹۱۸a(int lastGoodStreamId, EnumCb errorCode, byte[] debugData) {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        }
        if (errorCode.f۱۵۸۸۱c == -1) {
            Ce.m۱۶۷۸۴a("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        int length = debugData.length + 8;
        m۱۶۹۱۴a(0, length, (byte) 7, (byte) 0);
        this.f۱۶۰۲۷c.writeInt(lastGoodStreamId);
        this.f۱۶۰۲۷c.writeInt(errorCode.f۱۵۸۸۱c);
        if (debugData.length > 0) {
            this.f۱۶۰۲۷c.write(debugData);
        }
        this.f۱۶۰۲۷c.flush();
    }

    /* renamed from: a, reason: contains not printable characters */
    public synchronized void m۱۶۹۱۶a(int streamId, long windowSizeIncrement) {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        }
        if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
            Ce.m۱۶۷۸۴a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(windowSizeIncrement));
            throw null;
        }
        m۱۶۹۱۴a(streamId, 4, (byte) 8, (byte) 0);
        this.f۱۶۰۲۷c.writeInt((int) windowSizeIncrement);
        this.f۱۶۰۲۷c.flush();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۹۱۴a(int streamId, int length, byte type, byte flags) {
        if (f۱۶۰۲۶i.isLoggable(Level.FINE)) {
            f۱۶۰۲۶i.fine(Ce.m۱۶۷۸۶a(false, streamId, length, type, flags));
        }
        int i = this.f۱۶۰۳۰f;
        if (length > i) {
            Ce.m۱۶۷۸۴a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i), Integer.valueOf(length));
            throw null;
        }
        if ((Integer.MIN_VALUE & streamId) != 0) {
            Ce.m۱۶۷۸۴a("reserved bit set: %s", Integer.valueOf(streamId));
            throw null;
        }
        m۱۶۹۱۱a(this.f۱۶۰۲۷c, length);
        this.f۱۶۰۲۷c.writeByte(type & 255);
        this.f۱۶۰۲۷c.writeByte(flags & 255);
        this.f۱۶۰۲۷c.writeInt(Integer.MAX_VALUE & streamId);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f۱۶۰۳۱g = true;
        this.f۱۶۰۲۷c.close();
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۶۹۱۱a(InterfaceCd sink, int i) {
        sink.writeByte((i >>> 16) & 255);
        sink.writeByte((i >>> 8) & 255);
        sink.writeByte(i & 255);
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۶۹۱۲b(int streamId, long byteCount) {
        while (byteCount > 0) {
            int length = (int) Math.min(this.f۱۶۰۳۰f, byteCount);
            byteCount -= length;
            m۱۶۹۱۴a(streamId, length, (byte) 9, byteCount == 0 ? (byte) 4 : (byte) 0);
            this.f۱۶۰۲۷c.mo۱۷۴۷۵a(this.f۱۶۰۲۹e, length);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۹۲۳a(boolean outFinished, int streamId, List<Cc> list) {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        }
        this.f۱۶۰۳۲h.m۱۶۷۸۳a(list);
        long byteCount = this.f۱۶۰۲۹e.m۱۷۳۳۲q();
        int length = (int) Math.min(this.f۱۶۰۳۰f, byteCount);
        byte flags = byteCount == ((long) length) ? (byte) 4 : (byte) 0;
        if (outFinished) {
            flags = (byte) (flags | 1);
        }
        m۱۶۹۱۴a(streamId, length, (byte) 1, flags);
        this.f۱۶۰۲۷c.mo۱۷۴۷۵a(this.f۱۶۰۲۹e, length);
        if (byteCount > length) {
            m۱۶۹۱۲b(streamId, byteCount - length);
        }
    }
}
