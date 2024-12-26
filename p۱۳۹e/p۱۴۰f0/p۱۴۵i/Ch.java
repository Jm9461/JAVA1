package p۱۳۹e.p۱۴۰f0.p۱۴۵i;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p۱۳۹e.p۱۴۰f0.Cc;
import p۱۳۹e.p۱۴۰f0.p۱۴۵i.Cd;
import p۱۴۹f.AbstractCe;
import p۱۴۹f.AbstractCs;
import p۱۴۹f.Cf;
import p۱۴۹f.Ct;

/* access modifiers changed from: package-private */
/* renamed from: e.f0.i.h  reason: invalid class name */
public final class Ch implements Closeable {

    /* renamed from: g  reason: contains not printable characters */
    static final Logger f۱۵۹۹۳g = Logger.getLogger(Ce.class.getName());

    /* renamed from: c  reason: contains not printable characters */
    private final AbstractCe f۱۵۹۹۴c;

    /* renamed from: d  reason: contains not printable characters */
    private final Ca f۱۵۹۹۵d = new Ca(this.f۱۵۹۹۴c);

    /* renamed from: e  reason: contains not printable characters */
    private final boolean f۱۵۹۹۶e;

    /* renamed from: f  reason: contains not printable characters */
    final Cd.Ca f۱۵۹۹۷f = new Cd.Ca(4096, this.f۱۵۹۹۵d);

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.i.h$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۹۵۰a();

        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۹۵۱a(int i, int i2, int i3, boolean z);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۹۵۲a(int i, int i2, List<Cc> list);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۹۵۳a(int i, long j);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۹۵۴a(int i, EnumCb bVar);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۹۵۵a(int i, EnumCb bVar, Cf fVar);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۹۵۶a(boolean z, int i, int i2);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۹۵۷a(boolean z, int i, int i2, List<Cc> list);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۹۵۸a(boolean z, int i, AbstractCe eVar, int i2);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۹۵۹a(boolean z, Cm mVar);
    }

    Ch(AbstractCe source, boolean client) {
        this.f۱۵۹۹۴c = source;
        this.f۱۵۹۹۶e = client;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۹۴۵a(AbstractCb handler) {
        if (!this.f۱۵۹۹۶e) {
            Cf connectionPreface = this.f۱۵۹۹۴c.m۱۹۴۲۰b((long) Ce.f۱۵۹۱۰a.m۱۹۴۵۱f());
            if (f۱۵۹۹۳g.isLoggable(Level.FINE)) {
                f۱۵۹۹۳g.fine(Cc.m۱۸۶۱۴a("<< CONNECTION %s", connectionPreface.m۱۹۴۴۶b()));
            }
            if (!Ce.f۱۵۹۱۰a.equals(connectionPreface)) {
                Ce.m۱۸۸۶۶b("Expected a connection header but was %s", connectionPreface.m۱۹۴۵۴i());
                throw null;
            }
        } else if (!m۱۸۹۴۶a(true, handler)) {
            Ce.m۱۸۸۶۶b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۹۴۶a(boolean requireSettings, AbstractCb handler) {
        try {
            this.f۱۵۹۹۴c.m۱۹۴۲۳d(9);
            int length = m۱۸۹۳۳a(this.f۱۵۹۹۴c);
            if (length < 0 || length > 16384) {
                Ce.m۱۸۸۶۶b("FRAME_SIZE_ERROR: %s", Integer.valueOf(length));
                throw null;
            }
            byte type = (byte) (this.f۱۵۹۹۴c.readByte() & 255);
            if (!requireSettings || type == 4) {
                byte flags = (byte) (this.f۱۵۹۹۴c.readByte() & 255);
                int streamId = this.f۱۵۹۹۴c.readInt() & Integer.MAX_VALUE;
                if (f۱۵۹۹۳g.isLoggable(Level.FINE)) {
                    f۱۵۹۹۳g.fine(Ce.m۱۸۸۶۵a(true, streamId, length, type, flags));
                }
                switch (type) {
                    case 0:
                        m۱۸۹۳۶a(handler, length, flags, streamId);
                        break;
                    case 1:
                        m۱۸۹۳۸c(handler, length, flags, streamId);
                        break;
                    case 2:
                        m۱۸۹۴۰e(handler, length, flags, streamId);
                        break;
                    case 3:
                        m۱۸۹۴۲g(handler, length, flags, streamId);
                        break;
                    case 4:
                        m۱۸۹۴۳h(handler, length, flags, streamId);
                        break;
                    case 5:
                        m۱۸۹۴۱f(handler, length, flags, streamId);
                        break;
                    case 6:
                        m۱۸۹۳۹d(handler, length, flags, streamId);
                        break;
                    case 7:
                        m۱۸۹۳۷b(handler, length, flags, streamId);
                        break;
                    case 8:
                        m۱۸۹۴۴i(handler, length, flags, streamId);
                        break;
                    default:
                        this.f۱۵۹۹۴c.skip((long) length);
                        break;
                }
                return true;
            }
            Ce.m۱۸۸۶۶b("Expected a SETTINGS frame but was %s", Byte.valueOf(type));
            throw null;
        } catch (IOException e) {
            return false;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۸۹۳۸c(AbstractCb handler, int length, byte flags, int streamId) {
        short padding = 0;
        if (streamId != 0) {
            boolean endStream = (flags & 1) != 0;
            if ((flags & 8) != 0) {
                padding = (short) (this.f۱۵۹۹۴c.readByte() & 255);
            }
            if ((flags & 32) != 0) {
                m۱۸۹۳۵a(handler, streamId);
                length -= 5;
            }
            handler.m۱۸۹۵۷a(endStream, streamId, -1, (List<Cc>) m۱۸۹۳۴a(m۱۸۹۳۲a(length, flags, padding), padding, flags, streamId));
            return;
        }
        Ce.m۱۸۸۶۶b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: a  reason: contains not printable characters */
    private List<Cc> m۱۸۹۳۴a(int length, short padding, byte flags, int streamId) {
        Ca aVar = this.f۱۵۹۹۵d;
        aVar.f۱۶۰۰۲g = length;
        aVar.f۱۵۹۹۹d = length;
        aVar.f۱۶۰۰۳h = padding;
        aVar.f۱۶۰۰۰e = flags;
        aVar.f۱۶۰۰۱f = streamId;
        this.f۱۵۹۹۷f.m۱۸۸۵۴c();
        return this.f۱۵۹۹۷f.m۱۸۸۵۲a();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۹۳۶a(AbstractCb handler, int length, byte flags, int streamId) {
        short padding = 0;
        if (streamId != 0) {
            boolean gzipped = true;
            boolean inFinished = (flags & 1) != 0;
            if ((flags & 32) == 0) {
                gzipped = false;
            }
            if (!gzipped) {
                if ((flags & 8) != 0) {
                    padding = (short) (this.f۱۵۹۹۴c.readByte() & 255);
                }
                handler.m۱۸۹۵۸a(inFinished, streamId, this.f۱۵۹۹۴c, m۱۸۹۳۲a(length, flags, padding));
                this.f۱۵۹۹۴c.skip((long) padding);
                return;
            }
            Ce.m۱۸۸۶۶b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        Ce.m۱۸۸۶۶b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۸۹۴۰e(AbstractCb handler, int length, byte flags, int streamId) {
        if (length != 5) {
            Ce.m۱۸۸۶۶b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(length));
            throw null;
        } else if (streamId != 0) {
            m۱۸۹۳۵a(handler, streamId);
        } else {
            Ce.m۱۸۸۶۶b("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۹۳۵a(AbstractCb handler, int streamId) {
        int w1 = this.f۱۵۹۹۴c.readInt();
        handler.m۱۸۹۵۱a(streamId, Integer.MAX_VALUE & w1, (this.f۱۵۹۹۴c.readByte() & 255) + 1, (Integer.MIN_VALUE & w1) != 0);
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۸۹۴۲g(AbstractCb handler, int length, byte flags, int streamId) {
        if (length != 4) {
            Ce.m۱۸۸۶۶b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(length));
            throw null;
        } else if (streamId != 0) {
            int errorCodeInt = this.f۱۵۹۹۴c.readInt();
            EnumCb errorCode = EnumCb.m۱۸۸۳۵a(errorCodeInt);
            if (errorCode != null) {
                handler.m۱۸۹۵۴a(streamId, errorCode);
                return;
            }
            Ce.m۱۸۸۶۶b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(errorCodeInt));
            throw null;
        } else {
            Ce.m۱۸۸۶۶b("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    private void m۱۸۹۴۳h(AbstractCb handler, int length, byte flags, int streamId) {
        if (streamId != 0) {
            Ce.m۱۸۸۶۶b("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((flags & 1) != 0) {
            if (length == 0) {
                handler.m۱۸۹۵۰a();
            } else {
                Ce.m۱۸۸۶۶b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        } else if (length % 6 == 0) {
            Cm settings = new Cm();
            for (int i = 0; i < length; i += 6) {
                int id = this.f۱۵۹۹۴c.readShort() & 65535;
                int value = this.f۱۵۹۹۴c.readInt();
                switch (id) {
                    case 2:
                        if (!(value == 0 || value == 1)) {
                            Ce.m۱۸۸۶۶b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            throw null;
                        }
                    case 3:
                        id = 4;
                        break;
                    case 4:
                        id = 7;
                        if (value >= 0) {
                            break;
                        } else {
                            Ce.m۱۸۸۶۶b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    case 5:
                        if (value >= 16384 && value <= 16777215) {
                            break;
                        } else {
                            Ce.m۱۸۸۶۶b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(value));
                            throw null;
                        }
                        break;
                }
                settings.m۱۹۰۲۱a(id, value);
            }
            handler.m۱۸۹۵۹a(false, settings);
        } else {
            Ce.m۱۸۸۶۶b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(length));
            throw null;
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۸۹۴۱f(AbstractCb handler, int length, byte flags, int streamId) {
        short padding = 0;
        if (streamId != 0) {
            if ((flags & 8) != 0) {
                padding = (short) (this.f۱۵۹۹۴c.readByte() & 255);
            }
            handler.m۱۸۹۵۲a(streamId, this.f۱۵۹۹۴c.readInt() & Integer.MAX_VALUE, (List<Cc>) m۱۸۹۳۴a(m۱۸۹۳۲a(length - 4, flags, padding), padding, flags, streamId));
            return;
        }
        Ce.m۱۸۸۶۶b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۸۹۳۹d(AbstractCb handler, int length, byte flags, int streamId) {
        boolean ack = false;
        if (length != 8) {
            Ce.m۱۸۸۶۶b("TYPE_PING length != 8: %s", Integer.valueOf(length));
            throw null;
        } else if (streamId == 0) {
            int payload1 = this.f۱۵۹۹۴c.readInt();
            int payload2 = this.f۱۵۹۹۴c.readInt();
            if ((flags & 1) != 0) {
                ack = true;
            }
            handler.m۱۸۹۵۶a(ack, payload1, payload2);
        } else {
            Ce.m۱۸۸۶۶b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۸۹۳۷b(AbstractCb handler, int length, byte flags, int streamId) {
        if (length < 8) {
            Ce.m۱۸۸۶۶b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(length));
            throw null;
        } else if (streamId == 0) {
            int lastStreamId = this.f۱۵۹۹۴c.readInt();
            int errorCodeInt = this.f۱۵۹۹۴c.readInt();
            int opaqueDataLength = length - 8;
            EnumCb errorCode = EnumCb.m۱۸۸۳۵a(errorCodeInt);
            if (errorCode != null) {
                Cf debugData = Cf.f۱۶۲۷۳g;
                if (opaqueDataLength > 0) {
                    debugData = this.f۱۵۹۹۴c.m۱۹۴۲۰b((long) opaqueDataLength);
                }
                handler.m۱۸۹۵۵a(lastStreamId, errorCode, debugData);
                return;
            }
            Ce.m۱۸۸۶۶b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(errorCodeInt));
            throw null;
        } else {
            Ce.m۱۸۸۶۶b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: i  reason: contains not printable characters */
    private void m۱۸۹۴۴i(AbstractCb handler, int length, byte flags, int streamId) {
        if (length == 4) {
            long increment = ((long) this.f۱۵۹۹۴c.readInt()) & 2147483647L;
            if (increment != 0) {
                handler.m۱۸۹۵۳a(streamId, increment);
                return;
            }
            Ce.m۱۸۸۶۶b("windowSizeIncrement was 0", Long.valueOf(increment));
            throw null;
        }
        Ce.m۱۸۸۶۶b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(length));
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f۱۵۹۹۴c.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.i.h$a  reason: invalid class name */
    public static final class Ca implements AbstractCs {

        /* renamed from: c  reason: contains not printable characters */
        private final AbstractCe f۱۵۹۹۸c;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۵۹۹۹d;

        /* renamed from: e  reason: contains not printable characters */
        byte f۱۶۰۰۰e;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۶۰۰۱f;

        /* renamed from: g  reason: contains not printable characters */
        int f۱۶۰۰۲g;

        /* renamed from: h  reason: contains not printable characters */
        short f۱۶۰۰۳h;

        Ca(AbstractCe source) {
            this.f۱۵۹۹۸c = source;
        }

        @Override // p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public long m۱۸۹۴۸b(p۱۴۹f.Cc sink, long byteCount) {
            while (true) {
                int i = this.f۱۶۰۰۲g;
                if (i == 0) {
                    this.f۱۵۹۹۸c.skip((long) this.f۱۶۰۰۳h);
                    this.f۱۶۰۰۳h = 0;
                    if ((this.f۱۶۰۰۰e & 4) != 0) {
                        return -1;
                    }
                    m۱۸۹۴۷d();
                } else {
                    long read = this.f۱۵۹۹۸c.m۱۹۵۵۴b(sink, Math.min(byteCount, (long) i));
                    if (read == -1) {
                        return -1;
                    }
                    this.f۱۶۰۰۲g = (int) (((long) this.f۱۶۰۰۲g) - read);
                    return read;
                }
            }
        }

        @Override // p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public Ct m۱۸۹۴۹b() {
            return this.f۱۵۹۹۸c.m۱۹۵۵۵b();
        }

        @Override // java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: d  reason: contains not printable characters */
        private void m۱۸۹۴۷d() {
            int previousStreamId = this.f۱۶۰۰۱f;
            int a = Ch.m۱۸۹۳۳a(this.f۱۵۹۹۸c);
            this.f۱۶۰۰۲g = a;
            this.f۱۵۹۹۹d = a;
            byte type = (byte) (this.f۱۵۹۹۸c.readByte() & 255);
            this.f۱۶۰۰۰e = (byte) (this.f۱۵۹۹۸c.readByte() & 255);
            if (Ch.f۱۵۹۹۳g.isLoggable(Level.FINE)) {
                Ch.f۱۵۹۹۳g.fine(Ce.m۱۸۸۶۵a(true, this.f۱۶۰۰۱f, this.f۱۵۹۹۹d, type, this.f۱۶۰۰۰e));
            }
            this.f۱۶۰۰۱f = this.f۱۵۹۹۸c.readInt() & Integer.MAX_VALUE;
            if (type != 9) {
                Ce.m۱۸۸۶۶b("%s != TYPE_CONTINUATION", Byte.valueOf(type));
                throw null;
            } else if (this.f۱۶۰۰۱f != previousStreamId) {
                Ce.m۱۸۸۶۶b("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۸۹۳۳a(AbstractCe source) {
        return ((source.readByte() & 255) << 16) | ((source.readByte() & 255) << 8) | (source.readByte() & 255);
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۸۹۳۲a(int length, byte flags, short padding) {
        if ((flags & 8) != 0) {
            length--;
        }
        if (padding <= length) {
            return (short) (length - padding);
        }
        Ce.m۱۸۸۶۶b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(padding), Integer.valueOf(length));
        throw null;
    }
}
