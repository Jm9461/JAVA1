package p۳۰۶g;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: g.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Ci extends AbstractCa {

    /* renamed from: d, reason: contains not printable characters */
    private final RandomAccessFile f۱۶۳۳۵d;

    public Ci(InterfaceCe pullTransport, File file) {
        super(pullTransport, file);
        this.f۱۶۳۳۵d = m۱۷۵۳۵a(file);
    }

    /* renamed from: a, reason: contains not printable characters */
    private RandomAccessFile m۱۷۵۳۵a(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            return randomAccessFile;
        } catch (FileNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p۳۰۶g.AbstractCa, p۳۰۶g.InterfaceCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۵۳۷a() {
        super.mo۱۷۵۳۷a();
        try {
            m۱۷۵۳۶e();
        } catch (IOException e2) {
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    private void m۱۷۵۳۶e() {
        long totalAudioLen = new FileInputStream(this.f۱۶۳۱۹b).getChannel().size();
        try {
            this.f۱۶۳۳۵d.seek(0L);
            this.f۱۶۳۳۵d.write(new Cj(this.f۱۶۳۱۸a.mo۱۷۵۲۴a(), totalAudioLen).m۱۷۵۳۹a());
            this.f۱۶۳۳۵d.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
