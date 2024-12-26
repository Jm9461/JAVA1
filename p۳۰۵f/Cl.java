package p۳۰۵f;

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

/* renamed from: f.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cl {

    /* renamed from: a, reason: contains not printable characters */
    static final Logger f۱۶۲۸۹a = Logger.getLogger(Cl.class.getName());

    private Cl() {
    }

    /* renamed from: a, reason: contains not printable characters */
    public static InterfaceCe m۱۷۴۰۳a(InterfaceCs source) {
        return new Cn(source);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static InterfaceCd m۱۷۴۰۲a(InterfaceCr sink) {
        return new Cm(sink);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static InterfaceCr m۱۷۴۰۶a(OutputStream out) {
        return m۱۷۴۰۷a(out, new Ct());
    }

    /* renamed from: a, reason: contains not printable characters */
    private static InterfaceCr m۱۷۴۰۷a(OutputStream out, Ct timeout) {
        if (out == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (timeout == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new a(timeout, out);
    }

    /* renamed from: f.l$a */
    final class a implements InterfaceCr {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ Ct f۱۶۲۹۰c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ OutputStream f۱۶۲۹۱d;

        a(Ct ct, OutputStream outputStream) {
            this.f۱۶۲۹۰c = ct;
            this.f۱۶۲۹۱d = outputStream;
        }

        @Override // p۳۰۵f.InterfaceCr
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۴۷۵a(Cc source, long byteCount) {
            Cu.m۱۷۴۹۲a(source.f۱۶۲۷۰d, 0L, byteCount);
            while (byteCount > 0) {
                this.f۱۶۲۹۰c.mo۱۷۴۸۹e();
                Co head = source.f۱۶۲۶۹c;
                int toCopy = (int) Math.min(byteCount, head.f۱۶۳۰۴c - head.f۱۶۳۰۳b);
                this.f۱۶۲۹۱d.write(head.f۱۶۳۰۲a, head.f۱۶۳۰۳b, toCopy);
                head.f۱۶۳۰۳b += toCopy;
                byteCount -= toCopy;
                source.f۱۶۲۷۰d -= toCopy;
                if (head.f۱۶۳۰۳b == head.f۱۶۳۰۴c) {
                    source.f۱۶۲۶۹c = head.m۱۷۴۵۵b();
                    Cp.m۱۷۴۵۸a(head);
                }
            }
        }

        @Override // p۳۰۵f.InterfaceCr, java.io.Flushable
        public void flush() {
            this.f۱۶۲۹۱d.flush();
        }

        @Override // p۳۰۵f.InterfaceCr, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f۱۶۲۹۱d.close();
        }

        @Override // p۳۰۵f.InterfaceCr
        /* renamed from: b, reason: contains not printable characters */
        public Ct mo۱۷۴۷۶b() {
            return this.f۱۶۲۹۰c;
        }

        public String toString() {
            return "sink(" + this.f۱۶۲۹۱d + ")";
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static InterfaceCr m۱۷۴۰۸a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        Ca timeout = m۱۷۴۱۴c(socket);
        InterfaceCr sink = m۱۷۴۰۷a(socket.getOutputStream(), timeout);
        return timeout.m۱۷۲۷۲a(sink);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static InterfaceCs m۱۷۴۰۹a(InputStream in) {
        return m۱۷۴۱۰a(in, new Ct());
    }

    /* renamed from: a, reason: contains not printable characters */
    private static InterfaceCs m۱۷۴۱۰a(InputStream in, Ct timeout) {
        if (in == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (timeout == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new b(timeout, in);
    }

    /* renamed from: f.l$b */
    final class b implements InterfaceCs {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ Ct f۱۶۲۹۲c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ InputStream f۱۶۲۹۳d;

        b(Ct ct, InputStream inputStream) {
            this.f۱۶۲۹۲c = ct;
            this.f۱۶۲۹۳d = inputStream;
        }

        @Override // p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public long mo۱۷۴۷۷b(Cc sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            }
            if (byteCount == 0) {
                return 0L;
            }
            try {
                this.f۱۶۲۹۲c.mo۱۷۴۸۹e();
                Co tail = sink.m۱۷۳۰۷b(1);
                int maxToCopy = (int) Math.min(byteCount, 8192 - tail.f۱۶۳۰۴c);
                int bytesRead = this.f۱۶۲۹۳d.read(tail.f۱۶۳۰۲a, tail.f۱۶۳۰۴c, maxToCopy);
                if (bytesRead == -1) {
                    return -1L;
                }
                tail.f۱۶۳۰۴c += bytesRead;
                sink.f۱۶۲۷۰d += bytesRead;
                return bytesRead;
            } catch (AssertionError e2) {
                if (Cl.m۱۷۴۱۱a(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }

        @Override // p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f۱۶۲۹۳d.close();
        }

        @Override // p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public Ct mo۱۷۴۷۸b() {
            return this.f۱۶۲۹۲c;
        }

        public String toString() {
            return "source(" + this.f۱۶۲۹۳d + ")";
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public static InterfaceCs m۱۷۴۱۵c(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return m۱۷۴۰۹a(new FileInputStream(file));
    }

    /* renamed from: b, reason: contains not printable characters */
    public static InterfaceCr m۱۷۴۱۲b(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return m۱۷۴۰۶a(new FileOutputStream(file));
    }

    /* renamed from: a, reason: contains not printable characters */
    public static InterfaceCr m۱۷۴۰۵a(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return m۱۷۴۰۶a(new FileOutputStream(file, true));
    }

    /* renamed from: f.l$c */
    final class c implements InterfaceCr {
        c() {
        }

        @Override // p۳۰۵f.InterfaceCr
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۴۷۵a(Cc source, long byteCount) {
            source.skip(byteCount);
        }

        @Override // p۳۰۵f.InterfaceCr, java.io.Flushable
        public void flush() {
        }

        @Override // p۳۰۵f.InterfaceCr
        /* renamed from: b, reason: contains not printable characters */
        public Ct mo۱۷۴۷۶b() {
            return Ct.f۱۶۳۱۳d;
        }

        @Override // p۳۰۵f.InterfaceCr, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static InterfaceCr m۱۷۴۰۴a() {
        return new c();
    }

    /* renamed from: b, reason: contains not printable characters */
    public static InterfaceCs m۱۷۴۱۳b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        Ca timeout = m۱۷۴۱۴c(socket);
        InterfaceCs source = m۱۷۴۱۰a(socket.getInputStream(), timeout);
        return timeout.m۱۷۲۷۳a(source);
    }

    /* renamed from: f.l$d */
    final class d extends Ca {

        /* renamed from: k, reason: contains not printable characters */
        final /* synthetic */ Socket f۱۶۲۹۴k;

        d(Socket socket) {
            this.f۱۶۲۹۴k = socket;
        }

        @Override // p۳۰۵f.Ca
        /* renamed from: b, reason: contains not printable characters */
        protected IOException mo۱۷۴۲۲b(IOException cause) {
            InterruptedIOException ioe = new SocketTimeoutException("timeout");
            if (cause != null) {
                ioe.initCause(cause);
            }
            return ioe;
        }

        @Override // p۳۰۵f.Ca
        /* renamed from: i, reason: contains not printable characters */
        protected void mo۱۷۴۲۳i() {
            try {
                this.f۱۶۲۹۴k.close();
            } catch (AssertionError e2) {
                if (Cl.m۱۷۴۱۱a(e2)) {
                    Cl.f۱۶۲۸۹a.log(Level.WARNING, "Failed to close timed out socket " + this.f۱۶۲۹۴k, (Throwable) e2);
                    return;
                }
                throw e2;
            } catch (Exception e3) {
                Cl.f۱۶۲۸۹a.log(Level.WARNING, "Failed to close timed out socket " + this.f۱۶۲۹۴k, (Throwable) e3);
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private static Ca m۱۷۴۱۴c(Socket socket) {
        return new d(socket);
    }

    /* renamed from: a, reason: contains not printable characters */
    static boolean m۱۷۴۱۱a(AssertionError e2) {
        return (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) ? false : true;
    }
}
