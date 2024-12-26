package p۲۹۵e.p۲۹۶f0.p۳۰۱i;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p۲۹۵e.p۲۹۶f0.Cc;
import p۲۹۵e.p۲۹۶f0.p۳۰۱i.Cd;
import p۳۰۵f.Cf;
import p۳۰۵f.Ct;
import p۳۰۵f.InterfaceCe;
import p۳۰۵f.InterfaceCs;

/* renamed from: e.f0.i.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Ch implements Closeable {

    /* renamed from: g, reason: contains not printable characters */
    static final Logger f۱۵۹۹۳g = Logger.getLogger(Ce.class.getName());

    /* renamed from: c, reason: contains not printable characters */
    private final InterfaceCe f۱۵۹۹۴c;

    /* renamed from: d, reason: contains not printable characters */
    private final a f۱۵۹۹۵d;

    /* renamed from: e, reason: contains not printable characters */
    private final boolean f۱۵۹۹۶e;

    /* renamed from: f, reason: contains not printable characters */
    final Cd.a f۱۵۹۹۷f;

    /* renamed from: e.f0.i.h$b */
    interface b {
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۶۸۷۱a();

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۶۸۷۲a(int i, int i2, int i3, boolean z);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۶۸۷۳a(int i, int i2, List<Cc> list);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۶۸۷۴a(int i, long j);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۶۸۷۵a(int i, EnumCb enumCb);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۶۸۷۶a(int i, EnumCb enumCb, Cf cf);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۶۸۷۷a(boolean z, int i, int i2);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۶۸۷۸a(boolean z, int i, int i2, List<Cc> list);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۶۸۷۹a(boolean z, int i, InterfaceCe interfaceCe, int i2);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۶۸۸۰a(boolean z, Cm cm);
    }

    Ch(InterfaceCe source, boolean client) {
        this.f۱۵۹۹۴c = source;
        this.f۱۵۹۹۶e = client;
        this.f۱۵۹۹۵d = new a(this.f۱۵۹۹۴c);
        this.f۱۵۹۹۷f = new Cd.a(4096, this.f۱۵۹۹۵d);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۸۶۶a(b handler) {
        if (this.f۱۵۹۹۶e) {
            if (!m۱۶۸۶۷a(true, handler)) {
                Ce.m۱۶۷۸۷b("Required SETTINGS preface not received", new Object[0]);
                throw null;
            }
        } else {
            Cf connectionPreface = this.f۱۵۹۹۴c.mo۱۷۴۳۸b(Ce.f۱۵۹۱۰a.mo۱۷۴۷۱f());
            if (f۱۵۹۹۳g.isLoggable(Level.FINE)) {
                f۱۵۹۹۳g.fine(Cc.m۱۶۵۳۵a("<< CONNECTION %s", connectionPreface.mo۱۷۴۶۷b()));
            }
            if (!Ce.f۱۵۹۱۰a.equals(connectionPreface)) {
                Ce.m۱۶۷۸۷b("Expected a connection header but was %s", connectionPreface.mo۱۷۴۷۴i());
                throw null;
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۶۸۶۷a(boolean requireSettings, b handler) {
        try {
            this.f۱۵۹۹۴c.mo۱۷۴۴۲d(9L);
            int length = m۱۶۸۵۴a(this.f۱۵۹۹۴c);
            if (length < 0 || length > 16384) {
                Ce.m۱۶۷۸۷b("FRAME_SIZE_ERROR: %s", Integer.valueOf(length));
                throw null;
            }
            byte type = (byte) (this.f۱۵۹۹۴c.readByte() & 255);
            if (requireSettings && type != 4) {
                Ce.m۱۶۷۸۷b("Expected a SETTINGS frame but was %s", Byte.valueOf(type));
                throw null;
            }
            byte flags = (byte) (this.f۱۵۹۹۴c.readByte() & 255);
            int streamId = this.f۱۵۹۹۴c.readInt() & Integer.MAX_VALUE;
            if (f۱۵۹۹۳g.isLoggable(Level.FINE)) {
                f۱۵۹۹۳g.fine(Ce.m۱۶۷۸۶a(true, streamId, length, type, flags));
            }
            switch (type) {
                case 0:
                    m۱۶۸۵۷a(handler, length, flags, streamId);
                    return true;
                case 1:
                    m۱۶۸۵۹c(handler, length, flags, streamId);
                    return true;
                case 2:
                    m۱۶۸۶۱e(handler, length, flags, streamId);
                    return true;
                case 3:
                    m۱۶۸۶۳g(handler, length, flags, streamId);
                    return true;
                case 4:
                    m۱۶۸۶۴h(handler, length, flags, streamId);
                    return true;
                case 5:
                    m۱۶۸۶۲f(handler, length, flags, streamId);
                    return true;
                case 6:
                    m۱۶۸۶۰d(handler, length, flags, streamId);
                    return true;
                case 7:
                    m۱۶۸۵۸b(handler, length, flags, streamId);
                    return true;
                case 8:
                    m۱۶۸۶۵i(handler, length, flags, streamId);
                    return true;
                default:
                    this.f۱۵۹۹۴c.skip(length);
                    return true;
            }
        } catch (IOException e2) {
            return false;
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۶۸۵۹c(b handler, int length, byte flags, int streamId) {
        if (streamId == 0) {
            Ce.m۱۶۷۸۷b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean endStream = (flags & 1) != 0;
        short padding = (flags & 8) != 0 ? (short) (this.f۱۵۹۹۴c.readByte() & 255) : (short) 0;
        if ((flags & 32) != 0) {
            m۱۶۸۵۶a(handler, streamId);
            length -= 5;
        }
        handler.mo۱۶۸۷۸a(endStream, streamId, -1, m۱۶۸۵۵a(m۱۶۸۵۳a(length, flags, padding), padding, flags, streamId));
    }

    /* renamed from: a, reason: contains not printable characters */
    private List<Cc> m۱۶۸۵۵a(int length, short padding, byte flags, int streamId) {
        a aVar = this.f۱۵۹۹۵d;
        aVar.f۱۶۰۰۲g = length;
        aVar.f۱۵۹۹۹d = length;
        aVar.f۱۶۰۰۳h = padding;
        aVar.f۱۶۰۰۰e = flags;
        aVar.f۱۶۰۰۱f = streamId;
        this.f۱۵۹۹۷f.m۱۶۷۷۵c();
        return this.f۱۵۹۹۷f.m۱۶۷۷۳a();
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۶۸۵۷a(b handler, int length, byte flags, int streamId) {
        if (streamId == 0) {
            Ce.m۱۶۷۸۷b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
            throw null;
        }
        boolean inFinished = (flags & 1) != 0;
        boolean gzipped = (flags & 32) != 0;
        if (gzipped) {
            Ce.m۱۶۷۸۷b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short padding = (flags & 8) != 0 ? (short) (this.f۱۵۹۹۴c.readByte() & 255) : (short) 0;
        handler.mo۱۶۸۷۹a(inFinished, streamId, this.f۱۵۹۹۴c, m۱۶۸۵۳a(length, flags, padding));
        this.f۱۵۹۹۴c.skip(padding);
    }

    /* renamed from: e, reason: contains not printable characters */
    private void m۱۶۸۶۱e(b handler, int length, byte flags, int streamId) {
        if (length != 5) {
            Ce.m۱۶۷۸۷b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(length));
            throw null;
        }
        if (streamId == 0) {
            Ce.m۱۶۷۸۷b("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
        m۱۶۸۵۶a(handler, streamId);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۶۸۵۶a(b handler, int streamId) {
        int w1 = this.f۱۵۹۹۴c.readInt();
        boolean exclusive = (Integer.MIN_VALUE & w1) != 0;
        int streamDependency = Integer.MAX_VALUE & w1;
        int weight = (this.f۱۵۹۹۴c.readByte() & 255) + 1;
        handler.mo۱۶۸۷۲a(streamId, streamDependency, weight, exclusive);
    }

    /* renamed from: g, reason: contains not printable characters */
    private void m۱۶۸۶۳g(b handler, int length, byte flags, int streamId) {
        if (length != 4) {
            Ce.m۱۶۷۸۷b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(length));
            throw null;
        }
        if (streamId == 0) {
            Ce.m۱۶۷۸۷b("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int errorCodeInt = this.f۱۵۹۹۴c.readInt();
        EnumCb errorCode = EnumCb.m۱۶۷۵۶a(errorCodeInt);
        if (errorCode == null) {
            Ce.m۱۶۷۸۷b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(errorCodeInt));
            throw null;
        }
        handler.mo۱۶۸۷۵a(streamId, errorCode);
    }

    /* renamed from: h, reason: contains not printable characters */
    private void m۱۶۸۶۴h(b handler, int length, byte flags, int streamId) {
        if (streamId != 0) {
            Ce.m۱۶۷۸۷b("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((flags & 1) != 0) {
            if (length != 0) {
                Ce.m۱۶۷۸۷b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
            handler.mo۱۶۸۷۱a();
            return;
        }
        if (length % 6 != 0) {
            Ce.m۱۶۷۸۷b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(length));
            throw null;
        }
        Cm settings = new Cm();
        for (int i = 0; i < length; i += 6) {
            int id = this.f۱۵۹۹۴c.readShort() & 65535;
            int value = this.f۱۵۹۹۴c.readInt();
            switch (id) {
                case 2:
                    if (value != 0 && value != 1) {
                        Ce.m۱۶۷۸۷b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        throw null;
                    }
                    break;
                case 3:
                    id = 4;
                    break;
                case 4:
                    id = 7;
                    if (value < 0) {
                        Ce.m۱۶۷۸۷b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                    break;
                case 5:
                    if (value < 16384 || value > 16777215) {
                        Ce.m۱۶۷۸۷b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(value));
                        throw null;
                    }
                    break;
                    break;
            }
            settings.m۱۶۹۴۲a(id, value);
        }
        handler.mo۱۶۸۸۰a(false, settings);
    }

    /* renamed from: f, reason: contains not printable characters */
    private void m۱۶۸۶۲f(b handler, int length, byte flags, int streamId) {
        if (streamId == 0) {
            Ce.m۱۶۷۸۷b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short padding = (flags & 8) != 0 ? (short) (this.f۱۵۹۹۴c.readByte() & 255) : (short) 0;
        int promisedStreamId = this.f۱۵۹۹۴c.readInt() & Integer.MAX_VALUE;
        handler.mo۱۶۸۷۳a(streamId, promisedStreamId, m۱۶۸۵۵a(m۱۶۸۵۳a(length - 4, flags, padding), padding, flags, streamId));
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۶۸۶۰d(b handler, int length, byte flags, int streamId) {
        if (length != 8) {
            Ce.m۱۶۷۸۷b("TYPE_PING length != 8: %s", Integer.valueOf(length));
            throw null;
        }
        if (streamId != 0) {
            Ce.m۱۶۷۸۷b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        int payload1 = this.f۱۵۹۹۴c.readInt();
        int payload2 = this.f۱۵۹۹۴c.readInt();
        boolean ack = (flags & 1) != 0;
        handler.mo۱۶۸۷۷a(ack, payload1, payload2);
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۶۸۵۸b(b handler, int length, byte flags, int streamId) {
        if (length < 8) {
            Ce.m۱۶۷۸۷b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(length));
            throw null;
        }
        if (streamId != 0) {
            Ce.m۱۶۷۸۷b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int lastStreamId = this.f۱۵۹۹۴c.readInt();
        int errorCodeInt = this.f۱۵۹۹۴c.readInt();
        int opaqueDataLength = length - 8;
        EnumCb errorCode = EnumCb.m۱۶۷۵۶a(errorCodeInt);
        if (errorCode == null) {
            Ce.m۱۶۷۸۷b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(errorCodeInt));
            throw null;
        }
        Cf debugData = Cf.f۱۶۲۷۳g;
        if (opaqueDataLength > 0) {
            debugData = this.f۱۵۹۹۴c.mo۱۷۴۳۸b(opaqueDataLength);
        }
        handler.mo۱۶۸۷۶a(lastStreamId, errorCode, debugData);
    }

    /* renamed from: i, reason: contains not printable characters */
    private void m۱۶۸۶۵i(b handler, int length, byte flags, int streamId) {
        if (length != 4) {
            Ce.m۱۶۷۸۷b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(length));
            throw null;
        }
        long increment = this.f۱۵۹۹۴c.readInt() & 2147483647L;
        if (increment == 0) {
            Ce.m۱۶۷۸۷b("windowSizeIncrement was 0", Long.valueOf(increment));
            throw null;
        }
        handler.mo۱۶۸۷۴a(streamId, increment);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f۱۵۹۹۴c.close();
    }

    /* renamed from: e.f0.i.h$a */
    static final class a implements InterfaceCs {

        /* renamed from: c, reason: contains not printable characters */
        private final InterfaceCe f۱۵۹۹۸c;

        /* renamed from: d, reason: contains not printable characters */
        int f۱۵۹۹۹d;

        /* renamed from: e, reason: contains not printable characters */
        byte f۱۶۰۰۰e;

        /* renamed from: f, reason: contains not printable characters */
        int f۱۶۰۰۱f;

        /* renamed from: g, reason: contains not printable characters */
        int f۱۶۰۰۲g;

        /* renamed from: h, reason: contains not printable characters */
        short f۱۶۰۰۳h;

        a(InterfaceCe source) {
            this.f۱۵۹۹۸c = source;
        }

        @Override // p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public long mo۱۷۴۷۷b(p۳۰۵f.Cc sink, long byteCount) {
            while (true) {
                int i = this.f۱۶۰۰۲g;
                if (i == 0) {
                    this.f۱۵۹۹۸c.skip(this.f۱۶۰۰۳h);
                    this.f۱۶۰۰۳h = (short) 0;
                    if ((this.f۱۶۰۰۰e & 4) != 0) {
                        return -1L;
                    }
                    m۱۶۸۶۸d();
                } else {
                    long read = this.f۱۵۹۹۸c.mo۱۷۴۷۷b(sink, Math.min(byteCount, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.f۱۶۰۰۲g = (int) (this.f۱۶۰۰۲g - read);
                    return read;
                }
            }
        }

        @Override // p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public Ct mo۱۷۴۷۸b() {
            return this.f۱۵۹۹۸c.mo۱۷۴۷۸b();
        }

        @Override // p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: d, reason: contains not printable characters */
        private void m۱۶۸۶۸d() {
            int previousStreamId = this.f۱۶۰۰۱f;
            int i = Ch.m۱۶۸۵۴a(this.f۱۵۹۹۸c);
            this.f۱۶۰۰۲g = i;
            this.f۱۵۹۹۹d = i;
            byte type = (byte) (this.f۱۵۹۹۸c.readByte() & 255);
            this.f۱۶۰۰۰e = (byte) (this.f۱۵۹۹۸c.readByte() & 255);
            if (Ch.f۱۵۹۹۳g.isLoggable(Level.FINE)) {
                Ch.f۱۵۹۹۳g.fine(Ce.m۱۶۷۸۶a(true, this.f۱۶۰۰۱f, this.f۱۵۹۹۹d, type, this.f۱۶۰۰۰e));
            }
            this.f۱۶۰۰۱f = this.f۱۵۹۹۸c.readInt() & Integer.MAX_VALUE;
            if (type != 9) {
                Ce.m۱۶۷۸۷b("%s != TYPE_CONTINUATION", Byte.valueOf(type));
                throw null;
            }
            if (this.f۱۶۰۰۱f != previousStreamId) {
                Ce.m۱۶۷۸۷b("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static int m۱۶۸۵۴a(InterfaceCe source) {
        return ((source.readByte() & 255) << 16) | ((source.readByte() & 255) << 8) | (source.readByte() & 255);
    }

    /* renamed from: a, reason: contains not printable characters */
    static int m۱۶۸۵۳a(int length, byte flags, short padding) {
        if ((flags & 8) != 0) {
            length--;
        }
        if (padding > length) {
            Ce.m۱۶۷۸۷b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(padding), Integer.valueOf(length));
            throw null;
        }
        return (short) (length - padding);
    }
}
