package f;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f۴۱۹۶a = Logger.getLogger(l.class.getName());

    private l() {
    }

    public static e a(s source) {
        return new n(source);
    }

    public static d a(r sink) {
        return new m(sink);
    }

    public static r a(OutputStream out) {
        return a(out, new t());
    }

    private static r a(OutputStream out, t timeout) {
        if (out == null) {
            throw new IllegalArgumentException("out == null");
        } else if (timeout != null) {
            return new a(timeout, out);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements r {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t f۴۱۹۷c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ OutputStream f۴۱۹۸d;

        a(t tVar, OutputStream outputStream) {
            this.f۴۱۹۷c = tVar;
            this.f۴۱۹۸d = outputStream;
        }

        @Override // f.r
        public void a(c source, long byteCount) {
            u.a(source.f۴۱۷۷d, 0, byteCount);
            while (byteCount > 0) {
                this.f۴۱۹۷c.e();
                o head = source.f۴۱۷۶c;
                int toCopy = (int) Math.min(byteCount, (long) (head.f۴۲۱۰c - head.f۴۲۰۹b));
                this.f۴۱۹۸d.write(head.f۴۲۰۸a, head.f۴۲۰۹b, toCopy);
                head.f۴۲۰۹b += toCopy;
                byteCount -= (long) toCopy;
                source.f۴۱۷۷d -= (long) toCopy;
                if (head.f۴۲۰۹b == head.f۴۲۱۰c) {
                    source.f۴۱۷۶c = head.b();
                    p.a(head);
                }
            }
        }

        @Override // f.r, java.io.Flushable
        public void flush() {
            this.f۴۱۹۸d.flush();
        }

        @Override // java.io.Closeable, f.r, java.lang.AutoCloseable
        public void close() {
            this.f۴۱۹۸d.close();
        }

        @Override // f.r
        public t b() {
            return this.f۴۱۹۷c;
        }

        public String toString() {
            return "sink(" + this.f۴۱۹۸d + ")";
        }
    }

    public static r a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            a timeout = c(socket);
            return timeout.a(a(socket.getOutputStream(), timeout));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static s a(InputStream in) {
        return a(in, new t());
    }

    private static s a(InputStream in, t timeout) {
        if (in == null) {
            throw new IllegalArgumentException("in == null");
        } else if (timeout != null) {
            return new b(timeout, in);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements s {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t f۴۱۹۹c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ InputStream f۴۲۰۰d;

        b(t tVar, InputStream inputStream) {
            this.f۴۱۹۹c = tVar;
            this.f۴۲۰۰d = inputStream;
        }

        @Override // f.s
        public long b(c sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            } else if (byteCount == 0) {
                return 0;
            } else {
                try {
                    this.f۴۱۹۹c.e();
                    o tail = sink.b(1);
                    int bytesRead = this.f۴۲۰۰d.read(tail.f۴۲۰۸a, tail.f۴۲۱۰c, (int) Math.min(byteCount, (long) (8192 - tail.f۴۲۱۰c)));
                    if (bytesRead == -1) {
                        return -1;
                    }
                    tail.f۴۲۱۰c += bytesRead;
                    sink.f۴۱۷۷d += (long) bytesRead;
                    return (long) bytesRead;
                } catch (AssertionError e2) {
                    if (l.a(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }
        }

        @Override // java.io.Closeable, f.s, java.lang.AutoCloseable
        public void close() {
            this.f۴۲۰۰d.close();
        }

        @Override // f.s
        public t b() {
            return this.f۴۱۹۹c;
        }

        public String toString() {
            return "source(" + this.f۴۲۰۰d + ")";
        }
    }

    public static s c(File file) {
        if (file != null) {
            return a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static r b(File file) {
        if (file != null) {
            return a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static r a(File file) {
        if (file != null) {
            return a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    class c implements r {
        c() {
        }

        @Override // f.r
        public void a(c source, long byteCount) {
            source.skip(byteCount);
        }

        @Override // f.r, java.io.Flushable
        public void flush() {
        }

        @Override // f.r
        public t b() {
            return t.f۴۲۱۸d;
        }

        @Override // java.io.Closeable, f.r, java.lang.AutoCloseable
        public void close() {
        }
    }

    public static r a() {
        return new c();
    }

    public static s b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            a timeout = c(socket);
            return timeout.a(a(socket.getInputStream(), timeout));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends a {
        final /* synthetic */ Socket k;

        d(Socket socket) {
            this.k = socket;
        }

        /* access modifiers changed from: protected */
        @Override // f.a
        public IOException b(IOException cause) {
            InterruptedIOException ioe = new SocketTimeoutException("timeout");
            if (cause != null) {
                ioe.initCause(cause);
            }
            return ioe;
        }

        /* access modifiers changed from: protected */
        @Override // f.a
        public void i() {
            try {
                this.k.close();
            } catch (Exception e2) {
                Logger logger = l.f۴۱۹۶a;
                Level level = Level.WARNING;
                logger.log(level, "Failed to close timed out socket " + this.k, (Throwable) e2);
            } catch (AssertionError e3) {
                if (l.a(e3)) {
                    Logger logger2 = l.f۴۱۹۶a;
                    Level level2 = Level.WARNING;
                    logger2.log(level2, "Failed to close timed out socket " + this.k, (Throwable) e3);
                    return;
                }
                throw e3;
            }
        }
    }

    private static a c(Socket socket) {
        return new d(socket);
    }

    static boolean a(AssertionError e2) {
        return (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) ? false : true;
    }
}
