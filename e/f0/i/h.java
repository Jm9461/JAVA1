package e.f0.i;

import e.f0.c;
import e.f0.i.d;
import f.e;
import f.f;
import f.s;
import f.t;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public final class h implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    static final Logger f۳۹۶۴g = Logger.getLogger(e.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private final e f۳۹۶۵c;

    /* renamed from: d  reason: collision with root package name */
    private final a f۳۹۶۶d = new a(this.f۳۹۶۵c);

    /* renamed from: e  reason: collision with root package name */
    private final boolean f۳۹۶۷e;

    /* renamed from: f  reason: collision with root package name */
    final d.a f۳۹۶۸f = new d.a(4096, this.f۳۹۶۶d);

    /* access modifiers changed from: package-private */
    public interface b {
        void a();

        void a(int i, int i2, int i3, boolean z);

        void a(int i, int i2, List<c> list);

        void a(int i, long j);

        void a(int i, b bVar);

        void a(int i, b bVar, f fVar);

        void a(boolean z, int i, int i2);

        void a(boolean z, int i, int i2, List<c> list);

        void a(boolean z, int i, e eVar, int i2);

        void a(boolean z, m mVar);
    }

    h(e source, boolean client) {
        this.f۳۹۶۵c = source;
        this.f۳۹۶۷e = client;
    }

    public void a(b handler) {
        if (!this.f۳۹۶۷e) {
            f connectionPreface = this.f۳۹۶۵c.b((long) e.f۳۹۰۲a.f());
            if (f۳۹۶۴g.isLoggable(Level.FINE)) {
                f۳۹۶۴g.fine(c.a("<< CONNECTION %s", connectionPreface.b()));
            }
            if (!e.f۳۹۰۲a.equals(connectionPreface)) {
                e.b("Expected a connection header but was %s", connectionPreface.i());
                throw null;
            }
        } else if (!a(true, handler)) {
            e.b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    public boolean a(boolean requireSettings, b handler) {
        try {
            this.f۳۹۶۵c.d(9);
            int length = a(this.f۳۹۶۵c);
            if (length < 0 || length > 16384) {
                e.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(length));
                throw null;
            }
            byte type = (byte) (this.f۳۹۶۵c.readByte() & 255);
            if (!requireSettings || type == 4) {
                byte flags = (byte) (this.f۳۹۶۵c.readByte() & 255);
                int streamId = this.f۳۹۶۵c.readInt() & Integer.MAX_VALUE;
                if (f۳۹۶۴g.isLoggable(Level.FINE)) {
                    f۳۹۶۴g.fine(e.a(true, streamId, length, type, flags));
                }
                switch (type) {
                    case 0:
                        a(handler, length, flags, streamId);
                        break;
                    case 1:
                        c(handler, length, flags, streamId);
                        break;
                    case 2:
                        e(handler, length, flags, streamId);
                        break;
                    case 3:
                        g(handler, length, flags, streamId);
                        break;
                    case 4:
                        h(handler, length, flags, streamId);
                        break;
                    case 5:
                        f(handler, length, flags, streamId);
                        break;
                    case 6:
                        d(handler, length, flags, streamId);
                        break;
                    case 7:
                        b(handler, length, flags, streamId);
                        break;
                    case 8:
                        i(handler, length, flags, streamId);
                        break;
                    default:
                        this.f۳۹۶۵c.skip((long) length);
                        break;
                }
                return true;
            }
            e.b("Expected a SETTINGS frame but was %s", Byte.valueOf(type));
            throw null;
        } catch (IOException e2) {
            return false;
        }
    }

    private void c(b handler, int length, byte flags, int streamId) {
        short padding = 0;
        if (streamId != 0) {
            boolean endStream = (flags & 1) != 0;
            if ((flags & 8) != 0) {
                padding = (short) (this.f۳۹۶۵c.readByte() & 255);
            }
            if ((flags & 32) != 0) {
                a(handler, streamId);
                length -= 5;
            }
            handler.a(endStream, streamId, -1, (List<c>) a(a(length, flags, padding), padding, flags, streamId));
            return;
        }
        e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    private List<c> a(int length, short padding, byte flags, int streamId) {
        a aVar = this.f۳۹۶۶d;
        aVar.f۳۹۷۳g = length;
        aVar.f۳۹۷۰d = length;
        aVar.f۳۹۷۴h = padding;
        aVar.f۳۹۷۱e = flags;
        aVar.f۳۹۷۲f = streamId;
        this.f۳۹۶۸f.c();
        return this.f۳۹۶۸f.a();
    }

    private void a(b handler, int length, byte flags, int streamId) {
        short padding = 0;
        if (streamId != 0) {
            boolean gzipped = true;
            boolean inFinished = (flags & 1) != 0;
            if ((flags & 32) == 0) {
                gzipped = false;
            }
            if (!gzipped) {
                if ((flags & 8) != 0) {
                    padding = (short) (this.f۳۹۶۵c.readByte() & 255);
                }
                handler.a(inFinished, streamId, this.f۳۹۶۵c, a(length, flags, padding));
                this.f۳۹۶۵c.skip((long) padding);
                return;
            }
            e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        e.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    private void e(b handler, int length, byte flags, int streamId) {
        if (length != 5) {
            e.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(length));
            throw null;
        } else if (streamId != 0) {
            a(handler, streamId);
        } else {
            e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void a(b handler, int streamId) {
        int w1 = this.f۳۹۶۵c.readInt();
        handler.a(streamId, Integer.MAX_VALUE & w1, (this.f۳۹۶۵c.readByte() & 255) + 1, (Integer.MIN_VALUE & w1) != 0);
    }

    private void g(b handler, int length, byte flags, int streamId) {
        if (length != 4) {
            e.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(length));
            throw null;
        } else if (streamId != 0) {
            int errorCodeInt = this.f۳۹۶۵c.readInt();
            b errorCode = b.a(errorCodeInt);
            if (errorCode != null) {
                handler.a(streamId, errorCode);
                return;
            }
            e.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(errorCodeInt));
            throw null;
        } else {
            e.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void h(b handler, int length, byte flags, int streamId) {
        if (streamId != 0) {
            e.b("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((flags & 1) != 0) {
            if (length == 0) {
                handler.a();
            } else {
                e.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        } else if (length % 6 == 0) {
            m settings = new m();
            for (int i = 0; i < length; i += 6) {
                int id = this.f۳۹۶۵c.readShort() & 65535;
                int value = this.f۳۹۶۵c.readInt();
                switch (id) {
                    case 2:
                        if (!(value == 0 || value == 1)) {
                            e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
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
                            e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    case 5:
                        if (value >= 16384 && value <= 16777215) {
                            break;
                        } else {
                            e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(value));
                            throw null;
                        }
                        break;
                }
                settings.a(id, value);
            }
            handler.a(false, settings);
        } else {
            e.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(length));
            throw null;
        }
    }

    private void f(b handler, int length, byte flags, int streamId) {
        short padding = 0;
        if (streamId != 0) {
            if ((flags & 8) != 0) {
                padding = (short) (this.f۳۹۶۵c.readByte() & 255);
            }
            handler.a(streamId, this.f۳۹۶۵c.readInt() & Integer.MAX_VALUE, (List<c>) a(a(length - 4, flags, padding), padding, flags, streamId));
            return;
        }
        e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    private void d(b handler, int length, byte flags, int streamId) {
        boolean ack = false;
        if (length != 8) {
            e.b("TYPE_PING length != 8: %s", Integer.valueOf(length));
            throw null;
        } else if (streamId == 0) {
            int payload1 = this.f۳۹۶۵c.readInt();
            int payload2 = this.f۳۹۶۵c.readInt();
            if ((flags & 1) != 0) {
                ack = true;
            }
            handler.a(ack, payload1, payload2);
        } else {
            e.b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    private void b(b handler, int length, byte flags, int streamId) {
        if (length < 8) {
            e.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(length));
            throw null;
        } else if (streamId == 0) {
            int lastStreamId = this.f۳۹۶۵c.readInt();
            int errorCodeInt = this.f۳۹۶۵c.readInt();
            int opaqueDataLength = length - 8;
            b errorCode = b.a(errorCodeInt);
            if (errorCode != null) {
                f debugData = f.f۴۱۸۰g;
                if (opaqueDataLength > 0) {
                    debugData = this.f۳۹۶۵c.b((long) opaqueDataLength);
                }
                handler.a(lastStreamId, errorCode, debugData);
                return;
            }
            e.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(errorCodeInt));
            throw null;
        } else {
            e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    private void i(b handler, int length, byte flags, int streamId) {
        if (length == 4) {
            long increment = ((long) this.f۳۹۶۵c.readInt()) & 2147483647L;
            if (increment != 0) {
                handler.a(streamId, increment);
                return;
            }
            e.b("windowSizeIncrement was 0", Long.valueOf(increment));
            throw null;
        }
        e.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(length));
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f۳۹۶۵c.close();
    }

    /* access modifiers changed from: package-private */
    public static final class a implements s {

        /* renamed from: c  reason: collision with root package name */
        private final e f۳۹۶۹c;

        /* renamed from: d  reason: collision with root package name */
        int f۳۹۷۰d;

        /* renamed from: e  reason: collision with root package name */
        byte f۳۹۷۱e;

        /* renamed from: f  reason: collision with root package name */
        int f۳۹۷۲f;

        /* renamed from: g  reason: collision with root package name */
        int f۳۹۷۳g;

        /* renamed from: h  reason: collision with root package name */
        short f۳۹۷۴h;

        a(e source) {
            this.f۳۹۶۹c = source;
        }

        @Override // f.s
        public long b(f.c sink, long byteCount) {
            while (true) {
                int i = this.f۳۹۷۳g;
                if (i == 0) {
                    this.f۳۹۶۹c.skip((long) this.f۳۹۷۴h);
                    this.f۳۹۷۴h = 0;
                    if ((this.f۳۹۷۱e & 4) != 0) {
                        return -1;
                    }
                    d();
                } else {
                    long read = this.f۳۹۶۹c.b(sink, Math.min(byteCount, (long) i));
                    if (read == -1) {
                        return -1;
                    }
                    this.f۳۹۷۳g = (int) (((long) this.f۳۹۷۳g) - read);
                    return read;
                }
            }
        }

        @Override // f.s
        public t b() {
            return this.f۳۹۶۹c.b();
        }

        @Override // java.io.Closeable, f.s, java.lang.AutoCloseable
        public void close() {
        }

        private void d() {
            int previousStreamId = this.f۳۹۷۲f;
            int a2 = h.a(this.f۳۹۶۹c);
            this.f۳۹۷۳g = a2;
            this.f۳۹۷۰d = a2;
            byte type = (byte) (this.f۳۹۶۹c.readByte() & 255);
            this.f۳۹۷۱e = (byte) (this.f۳۹۶۹c.readByte() & 255);
            if (h.f۳۹۶۴g.isLoggable(Level.FINE)) {
                h.f۳۹۶۴g.fine(e.a(true, this.f۳۹۷۲f, this.f۳۹۷۰d, type, this.f۳۹۷۱e));
            }
            this.f۳۹۷۲f = this.f۳۹۶۹c.readInt() & Integer.MAX_VALUE;
            if (type != 9) {
                e.b("%s != TYPE_CONTINUATION", Byte.valueOf(type));
                throw null;
            } else if (this.f۳۹۷۲f != previousStreamId) {
                e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }
    }

    static int a(e source) {
        return ((source.readByte() & 255) << 16) | ((source.readByte() & 255) << 8) | (source.readByte() & 255);
    }

    static int a(int length, byte flags, short padding) {
        if ((flags & 8) != 0) {
            length--;
        }
        if (padding <= length) {
            return (short) (length - padding);
        }
        e.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(padding), Integer.valueOf(length));
        throw null;
    }
}
