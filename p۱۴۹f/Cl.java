package p۱۴۹f;

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

/* renamed from: f.l  reason: invalid class name */
public final class Cl {

    /* renamed from: a  reason: contains not printable characters */
    static final Logger f۱۶۲۸۹a = Logger.getLogger(Cl.class.getName());

    private Cl() {
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCe m۱۹۴۸۰a(AbstractCs source) {
        return new Cn(source);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCd m۱۹۴۷۹a(AbstractCr sink) {
        return new Cm(sink);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCr m۱۹۴۸۳a(OutputStream out) {
        return m۱۹۴۸۴a(out, new Ct());
    }

    /* renamed from: a  reason: contains not printable characters */
    private static AbstractCr m۱۹۴۸۴a(OutputStream out, Ct timeout) {
        if (out == null) {
            throw new IllegalArgumentException("out == null");
        } else if (timeout != null) {
            return new Ca(timeout, out);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.l$a  reason: invalid class name */
    public class Ca implements AbstractCr {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ Ct f۱۶۲۹۰c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ OutputStream f۱۶۲۹۱d;

        Ca(Ct tVar, OutputStream outputStream) {
            this.f۱۶۲۹۰c = tVar;
            this.f۱۶۲۹۱d = outputStream;
        }

        @Override // p۱۴۹f.AbstractCr
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۴۹۳a(Cc source, long byteCount) {
            Cu.m۱۹۵۶۹a(source.f۱۶۲۷۰d, 0, byteCount);
            while (byteCount > 0) {
                this.f۱۶۲۹۰c.m۱۹۵۶۲e();
                Co head = source.f۱۶۲۶۹c;
                int toCopy = (int) Math.min(byteCount, (long) (head.f۱۶۳۰۴c - head.f۱۶۳۰۳b));
                this.f۱۶۲۹۱d.write(head.f۱۶۳۰۲a, head.f۱۶۳۰۳b, toCopy);
                head.f۱۶۳۰۳b += toCopy;
                byteCount -= (long) toCopy;
                source.f۱۶۲۷۰d -= (long) toCopy;
                if (head.f۱۶۳۰۳b == head.f۱۶۳۰۴c) {
                    source.f۱۶۲۶۹c = head.m۱۹۵۳۲b();
                    Cp.m۱۹۵۳۵a(head);
                }
            }
        }

        @Override // p۱۴۹f.AbstractCr, java.io.Flushable
        public void flush() {
            this.f۱۶۲۹۱d.flush();
        }

        @Override // java.io.Closeable, p۱۴۹f.AbstractCr, java.lang.AutoCloseable
        public void close() {
            this.f۱۶۲۹۱d.close();
        }

        @Override // p۱۴۹f.AbstractCr
        /* renamed from: b  reason: contains not printable characters */
        public Ct m۱۹۴۹۴b() {
            return this.f۱۶۲۹۰c;
        }

        public String toString() {
            return "sink(" + this.f۱۶۲۹۱d + ")";
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCr m۱۹۴۸۵a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            Ca timeout = m۱۹۴۹۱c(socket);
            return timeout.m۱۹۳۵۰a(m۱۹۴۸۴a(socket.getOutputStream(), timeout));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCs m۱۹۴۸۶a(InputStream in) {
        return m۱۹۴۸۷a(in, new Ct());
    }

    /* renamed from: a  reason: contains not printable characters */
    private static AbstractCs m۱۹۴۸۷a(InputStream in, Ct timeout) {
        if (in == null) {
            throw new IllegalArgumentException("in == null");
        } else if (timeout != null) {
            return new Cb(timeout, in);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.l$b  reason: invalid class name */
    public class Cb implements AbstractCs {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ Ct f۱۶۲۹۲c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ InputStream f۱۶۲۹۳d;

        Cb(Ct tVar, InputStream inputStream) {
            this.f۱۶۲۹۲c = tVar;
            this.f۱۶۲۹۳d = inputStream;
        }

        @Override // p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public long m۱۹۴۹۵b(Cc sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            } else if (byteCount == 0) {
                return 0;
            } else {
                try {
                    this.f۱۶۲۹۲c.m۱۹۵۶۲e();
                    Co tail = sink.m۱۹۳۸۵b(1);
                    int bytesRead = this.f۱۶۲۹۳d.read(tail.f۱۶۳۰۲a, tail.f۱۶۳۰۴c, (int) Math.min(byteCount, (long) (8192 - tail.f۱۶۳۰۴c)));
                    if (bytesRead == -1) {
                        return -1;
                    }
                    tail.f۱۶۳۰۴c += bytesRead;
                    sink.f۱۶۲۷۰d += (long) bytesRead;
                    return (long) bytesRead;
                } catch (AssertionError e) {
                    if (Cl.m۱۹۴۸۸a(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        @Override // java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable
        public void close() {
            this.f۱۶۲۹۳d.close();
        }

        @Override // p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public Ct m۱۹۴۹۶b() {
            return this.f۱۶۲۹۲c;
        }

        public String toString() {
            return "source(" + this.f۱۶۲۹۳d + ")";
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public static AbstractCs m۱۹۴۹۲c(File file) {
        if (file != null) {
            return m۱۹۴۸۶a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: b  reason: contains not printable characters */
    public static AbstractCr m۱۹۴۸۹b(File file) {
        if (file != null) {
            return m۱۹۴۸۳a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCr m۱۹۴۸۲a(File file) {
        if (file != null) {
            return m۱۹۴۸۳a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: f.l$c  reason: invalid class name */
    class Cc implements AbstractCr {
        Cc() {
        }

        @Override // p۱۴۹f.AbstractCr
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۴۹۷a(Cc source, long byteCount) {
            source.skip(byteCount);
        }

        @Override // p۱۴۹f.AbstractCr, java.io.Flushable
        public void flush() {
        }

        @Override // p۱۴۹f.AbstractCr
        /* renamed from: b  reason: contains not printable characters */
        public Ct m۱۹۴۹۸b() {
            return Ct.f۱۶۳۱۳d;
        }

        @Override // java.io.Closeable, p۱۴۹f.AbstractCr, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCr m۱۹۴۸۱a() {
        return new Cc();
    }

    /* renamed from: b  reason: contains not printable characters */
    public static AbstractCs m۱۹۴۹۰b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            Ca timeout = m۱۹۴۹۱c(socket);
            return timeout.m۱۹۳۵۱a(m۱۹۴۸۷a(socket.getInputStream(), timeout));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.l$d  reason: invalid class name */
    public class Cd extends Ca {

        /* renamed from: k  reason: contains not printable characters */
        final /* synthetic */ Socket f۱۶۲۹۴k;

        Cd(Socket socket) {
            this.f۱۶۲۹۴k = socket;
        }

        /* access modifiers changed from: protected */
        @Override // p۱۴۹f.Ca
        /* renamed from: b  reason: contains not printable characters */
        public IOException m۱۹۴۹۹b(IOException cause) {
            InterruptedIOException ioe = new SocketTimeoutException("timeout");
            if (cause != null) {
                ioe.initCause(cause);
            }
            return ioe;
        }

        /* access modifiers changed from: protected */
        @Override // p۱۴۹f.Ca
        /* renamed from: i  reason: contains not printable characters */
        public void m۱۹۵۰۰i() {
            try {
                this.f۱۶۲۹۴k.close();
            } catch (Exception e) {
                Logger logger = Cl.f۱۶۲۸۹a;
                Level level = Level.WARNING;
                logger.log(level, "Failed to close timed out socket " + this.f۱۶۲۹۴k, (Throwable) e);
            } catch (AssertionError e2) {
                if (Cl.m۱۹۴۸۸a(e2)) {
                    Logger logger2 = Cl.f۱۶۲۸۹a;
                    Level level2 = Level.WARNING;
                    logger2.log(level2, "Failed to close timed out socket " + this.f۱۶۲۹۴k, (Throwable) e2);
                    return;
                }
                throw e2;
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private static Ca m۱۹۴۹۱c(Socket socket) {
        return new Cd(socket);
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۹۴۸۸a(AssertionError e) {
        return (e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed")) ? false : true;
    }
}
