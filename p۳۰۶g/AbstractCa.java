package p۳۰۶g;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: g.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
abstract class AbstractCa implements InterfaceCf {

    /* renamed from: a, reason: contains not printable characters */
    protected final InterfaceCe f۱۶۳۱۸a;

    /* renamed from: b, reason: contains not printable characters */
    protected final File f۱۶۳۱۹b;

    /* renamed from: c, reason: contains not printable characters */
    private final OutputStream f۱۶۳۲۰c;

    protected AbstractCa(InterfaceCe pullTransport, File file) {
        this.f۱۶۳۱۸a = pullTransport;
        this.f۱۶۳۱۹b = file;
        this.f۱۶۳۲۰c = m۱۷۴۹۷a(file);
    }

    /* renamed from: g.a$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractCa.this.f۱۶۳۱۸a.mo۱۷۵۲۷a(AbstractCa.this.f۱۶۳۲۰c);
            } catch (IOException e2) {
                new RuntimeException(e2);
            }
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۷۵۰۱d() {
        new Thread(new a()).start();
    }

    /* renamed from: a, reason: contains not printable characters */
    private OutputStream m۱۷۴۹۷a(File file) {
        if (file == null) {
            throw new RuntimeException("file is null !");
        }
        try {
            OutputStream outputStream = new FileOutputStream(file);
            return outputStream;
        } catch (FileNotFoundException e2) {
            throw new RuntimeException("could not build OutputStream from this file" + file.getName(), e2);
        }
    }

    @Override // p۳۰۶g.InterfaceCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۵۳۷a() {
        this.f۱۶۳۱۸a.stop();
    }

    @Override // p۳۰۶g.InterfaceCf
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۷۵۳۲b() {
        this.f۱۶۳۱۸a.mo۱۷۵۲۴a().mo۱۷۵۱۵a(false);
    }

    @Override // p۳۰۶g.InterfaceCf
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۷۵۳۳c() {
        this.f۱۶۳۱۸a.mo۱۷۵۲۴a().mo۱۷۵۱۵a(true);
        m۱۷۵۰۱d();
    }
}
