package p۱۳۹e.p۱۴۰f0.p۱۴۵i;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p۱۳۹e.p۱۴۰f0.p۱۴۵i.Cd;
import p۱۴۹f.AbstractCd;
import p۱۴۹f.Cc;

/* access modifiers changed from: package-private */
/* renamed from: e.f0.i.j  reason: invalid class name */
public final class Cj implements Closeable {

    /* renamed from: i  reason: contains not printable characters */
    private static final Logger f۱۶۰۲۶i = Logger.getLogger(Ce.class.getName());

    /* renamed from: c  reason: contains not printable characters */
    private final AbstractCd f۱۶۰۲۷c;

    /* renamed from: d  reason: contains not printable characters */
    private final boolean f۱۶۰۲۸d;

    /* renamed from: e  reason: contains not printable characters */
    private final Cc f۱۶۰۲۹e = new Cc();

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۶۰۳۰f = 16384;

    /* renamed from: g  reason: contains not printable characters */
    private boolean f۱۶۰۳۱g;

    /* renamed from: h  reason: contains not printable characters */
    final Cd.Cb f۱۶۰۳۲h = new Cd.Cb(this.f۱۶۰۲۹e);

    Cj(AbstractCd sink, boolean client) {
        this.f۱۶۰۲۷c = sink;
        this.f۱۶۰۲۸d = client;
    }

    /* renamed from: l  reason: contains not printable characters */
    public synchronized void m۱۹۰۰۴l() {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        } else if (this.f۱۶۰۲۸d) {
            if (f۱۶۰۲۶i.isLoggable(Level.FINE)) {
                f۱۶۰۲۶i.fine(p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۴a(">> CONNECTION %s", Ce.f۱۵۹۱۰a.m۱۹۴۴۶b()));
            }
            this.f۱۶۰۲۷c.write(Ce.f۱۵۹۱۰a.m۱۹۴۵۳h());
            this.f۱۶۰۲۷c.flush();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۸۹۹۸a(Cm peerSettings) {
        if (!this.f۱۶۰۳۱g) {
            this.f۱۶۰۳۰f = peerSettings.m۱۹۰۲۷c(this.f۱۶۰۳۰f);
            if (peerSettings.m۱۹۰۲۴b() != -1) {
                this.f۱۶۰۳۲h.m۱۸۸۵۹a(peerSettings.m۱۹۰۲۴b());
            }
            m۱۸۹۹۳a(0, 0, (byte) 4, (byte) 1);
            this.f۱۶۰۲۷c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۸۹۹۴a(int streamId, int promisedStreamId, List<Cc> list) {
        if (!this.f۱۶۰۳۱g) {
            this.f۱۶۰۳۲h.m۱۸۸۶۲a(list);
            long byteCount = this.f۱۶۰۲۹e.m۱۹۴۱۰q();
            byte flags = 4;
            int length = (int) Math.min((long) (this.f۱۶۰۳۰f - 4), byteCount);
            if (byteCount != ((long) length)) {
                flags = 0;
            }
            m۱۸۹۹۳a(streamId, length + 4, (byte) 5, flags);
            this.f۱۶۰۲۷c.writeInt(Integer.MAX_VALUE & promisedStreamId);
            this.f۱۶۰۲۷c.m۱۹۵۵۲a(this.f۱۶۰۲۹e, (long) length);
            if (byteCount > ((long) length)) {
                m۱۸۹۹۱b(streamId, byteCount - ((long) length));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void flush() {
        if (!this.f۱۶۰۳۱g) {
            this.f۱۶۰۲۷c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۹۰۰۰a(boolean outFinished, int streamId, int associatedStreamId, List<Cc> list) {
        if (!this.f۱۶۰۳۱g) {
            m۱۹۰۰۲a(outFinished, streamId, list);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۸۹۹۶a(int streamId, EnumCb errorCode) {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        } else if (errorCode.f۱۵۸۸۱c != -1) {
            m۱۸۹۹۳a(streamId, 4, (byte) 3, (byte) 0);
            this.f۱۶۰۲۷c.writeInt(errorCode.f۱۵۸۸۱c);
            this.f۱۶۰۲۷c.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    public int m۱۹۰۰۵m() {
        return this.f۱۶۰۳۰f;
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۹۰۰۱a(boolean outFinished, int streamId, Cc source, int byteCount) {
        if (!this.f۱۶۰۳۱g) {
            byte flags = 0;
            if (outFinished) {
                flags = (byte) (0 | 1);
            }
            m۱۸۹۹۲a(streamId, flags, source, byteCount);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۹۹۲a(int streamId, byte flags, Cc buffer, int byteCount) {
        m۱۸۹۹۳a(streamId, byteCount, (byte) 0, flags);
        if (byteCount > 0) {
            this.f۱۶۰۲۷c.m۱۹۵۵۲a(buffer, (long) byteCount);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public synchronized void m۱۹۰۰۳b(Cm settings) {
        if (!this.f۱۶۰۳۱g) {
            m۱۸۹۹۳a(0, settings.m۱۹۰۲۸d() * 6, (byte) 4, (byte) 0);
            for (int i = 0; i < 10; i++) {
                if (settings.m۱۹۰۲۹d(i)) {
                    int id = i;
                    if (id == 4) {
                        id = 3;
                    } else if (id == 7) {
                        id = 4;
                    }
                    this.f۱۶۰۲۷c.writeShort(id);
                    this.f۱۶۰۲۷c.writeInt(settings.m۱۹۰۲۰a(i));
                }
            }
            this.f۱۶۰۲۷c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۸۹۹۹a(boolean ack, int payload1, int payload2) {
        if (!this.f۱۶۰۳۱g) {
            m۱۸۹۹۳a(0, 8, (byte) 6, ack ? (byte) 1 : 0);
            this.f۱۶۰۲۷c.writeInt(payload1);
            this.f۱۶۰۲۷c.writeInt(payload2);
            this.f۱۶۰۲۷c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۸۹۹۷a(int lastGoodStreamId, EnumCb errorCode, byte[] debugData) {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        } else if (errorCode.f۱۵۸۸۱c != -1) {
            m۱۸۹۹۳a(0, debugData.length + 8, (byte) 7, (byte) 0);
            this.f۱۶۰۲۷c.writeInt(lastGoodStreamId);
            this.f۱۶۰۲۷c.writeInt(errorCode.f۱۵۸۸۱c);
            if (debugData.length > 0) {
                this.f۱۶۰۲۷c.write(debugData);
            }
            this.f۱۶۰۲۷c.flush();
        } else {
            Ce.m۱۸۸۶۳a("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۸۹۹۵a(int streamId, long windowSizeIncrement) {
        if (this.f۱۶۰۳۱g) {
            throw new IOException("closed");
        } else if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
            Ce.m۱۸۸۶۳a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(windowSizeIncrement));
            throw null;
        } else {
            m۱۸۹۹۳a(streamId, 4, (byte) 8, (byte) 0);
            this.f۱۶۰۲۷c.writeInt((int) windowSizeIncrement);
            this.f۱۶۰۲۷c.flush();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۹۹۳a(int streamId, int length, byte type, byte flags) {
        if (f۱۶۰۲۶i.isLoggable(Level.FINE)) {
            f۱۶۰۲۶i.fine(Ce.m۱۸۸۶۵a(false, streamId, length, type, flags));
        }
        int i = this.f۱۶۰۳۰f;
        if (length > i) {
            Ce.m۱۸۸۶۳a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i), Integer.valueOf(length));
            throw null;
        } else if ((Integer.MIN_VALUE & streamId) == 0) {
            m۱۸۹۹۰a(this.f۱۶۰۲۷c, length);
            this.f۱۶۰۲۷c.writeByte(type & 255);
            this.f۱۶۰۲۷c.writeByte(flags & 255);
            this.f۱۶۰۲۷c.writeInt(Integer.MAX_VALUE & streamId);
        } else {
            Ce.m۱۸۸۶۳a("reserved bit set: %s", Integer.valueOf(streamId));
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f۱۶۰۳۱g = true;
        this.f۱۶۰۲۷c.close();
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۸۹۹۰a(AbstractCd sink, int i) {
        sink.writeByte((i >>> 16) & 255);
        sink.writeByte((i >>> 8) & 255);
        sink.writeByte(i & 255);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۸۹۹۱b(int streamId, long byteCount) {
        while (byteCount > 0) {
            int length = (int) Math.min((long) this.f۱۶۰۳۰f, byteCount);
            byteCount -= (long) length;
            m۱۸۹۹۳a(streamId, length, (byte) 9, byteCount == 0 ? (byte) 4 : 0);
            this.f۱۶۰۲۷c.m۱۹۵۵۲a(this.f۱۶۰۲۹e, (long) length);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۰۲a(boolean outFinished, int streamId, List<Cc> list) {
        if (!this.f۱۶۰۳۱g) {
            this.f۱۶۰۳۲h.m۱۸۸۶۲a(list);
            long byteCount = this.f۱۶۰۲۹e.m۱۹۴۱۰q();
            int length = (int) Math.min((long) this.f۱۶۰۳۰f, byteCount);
            byte flags = byteCount == ((long) length) ? (byte) 4 : 0;
            if (outFinished) {
                flags = (byte) (flags | 1);
            }
            m۱۸۹۹۳a(streamId, length, (byte) 1, flags);
            this.f۱۶۰۲۷c.m۱۹۵۵۲a(this.f۱۶۰۲۹e, (long) length);
            if (byteCount > ((long) length)) {
                m۱۸۹۹۱b(streamId, byteCount - ((long) length));
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
