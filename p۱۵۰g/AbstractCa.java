package p۱۵۰g;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: g.a  reason: invalid class name */
abstract class AbstractCa implements AbstractCf {

    /* renamed from: a  reason: contains not printable characters */
    protected final AbstractCe f۱۶۳۱۸a;

    /* renamed from: b  reason: contains not printable characters */
    protected final File f۱۶۳۱۹b;

    /* renamed from: c  reason: contains not printable characters */
    private final OutputStream f۱۶۳۲۰c;

    protected AbstractCa(AbstractCe pullTransport, File file) {
        this.f۱۶۳۱۸a = pullTransport;
        this.f۱۶۳۱۹b = file;
        this.f۱۶۳۲۰c = m۱۹۵۷۴a(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g.a$a  reason: invalid class name */
    public class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            try {
                AbstractCa.this.f۱۶۳۱۸a.m۱۹۶۰۰a(AbstractCa.this.f۱۶۳۲۰c);
            } catch (IOException e) {
                new RuntimeException(e);
            }
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۹۵۷۸d() {
        new Thread(new RunnableCa()).start();
    }

    /* renamed from: a  reason: contains not printable characters */
    private OutputStream m۱۹۵۷۴a(File file) {
        if (file != null) {
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException("could not build OutputStream from this file" + file.getName(), e);
            }
        } else {
            throw new RuntimeException("file is null !");
        }
    }

    @Override // p۱۵۰g.AbstractCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۵۷۵a() {
        this.f۱۶۳۱۸a.stop();
    }

    @Override // p۱۵۰g.AbstractCf
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۹۵۷۶b() {
        this.f۱۶۳۱۸a.m۱۹۵۹۹a().m۱۹۵۸۵a(false);
    }

    @Override // p۱۵۰g.AbstractCf
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۹۵۷۷c() {
        this.f۱۶۳۱۸a.m۱۹۵۹۹a().m۱۹۵۸۵a(true);
        m۱۹۵۷۸d();
    }
}
