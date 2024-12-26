package g;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

abstract class a implements f {

    /* renamed from: a  reason: collision with root package name */
    protected final e f۴۲۲۳a;

    /* renamed from: b  reason: collision with root package name */
    protected final File f۴۲۲۴b;

    /* renamed from: c  reason: collision with root package name */
    private final OutputStream f۴۲۲۵c;

    protected a(e pullTransport, File file) {
        this.f۴۲۲۳a = pullTransport;
        this.f۴۲۲۴b = file;
        this.f۴۲۲۵c = a(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g.a$a  reason: collision with other inner class name */
    public class RunnableC۰۱۲۵a implements Runnable {
        RunnableC۰۱۲۵a() {
        }

        public void run() {
            try {
                a.this.f۴۲۲۳a.a(a.this.f۴۲۲۵c);
            } catch (IOException e2) {
                new RuntimeException(e2);
            }
        }
    }

    public void d() {
        new Thread(new RunnableC۰۱۲۵a()).start();
    }

    private OutputStream a(File file) {
        if (file != null) {
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e2) {
                throw new RuntimeException("could not build OutputStream from this file" + file.getName(), e2);
            }
        } else {
            throw new RuntimeException("file is null !");
        }
    }

    @Override // g.f
    public void a() {
        this.f۴۲۲۳a.stop();
    }

    @Override // g.f
    public void b() {
        this.f۴۲۲۳a.a().a(false);
    }

    @Override // g.f
    public void c() {
        this.f۴۲۲۳a.a().a(true);
        d();
    }
}
