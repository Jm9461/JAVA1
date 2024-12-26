package p۱۵۰g;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* access modifiers changed from: package-private */
/* renamed from: g.i  reason: invalid class name */
public final class Ci extends AbstractCa {

    /* renamed from: d  reason: contains not printable characters */
    private final RandomAccessFile f۱۶۳۳۵d;

    public Ci(AbstractCe pullTransport, File file) {
        super(pullTransport, file);
        this.f۱۶۳۳۵d = m۱۹۶۱۲a(file);
    }

    /* renamed from: a  reason: contains not printable characters */
    private RandomAccessFile m۱۹۶۱۲a(File file) {
        try {
            return new RandomAccessFile(file, "rw");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p۱۵۰g.AbstractCa, p۱۵۰g.AbstractCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۶۱۴a() {
        super.m۱۹۵۷۵a();
        try {
            m۱۹۶۱۳e();
        } catch (IOException e) {
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۹۶۱۳e() {
        long totalAudioLen = new FileInputStream(this.f۱۶۳۱۹b).getChannel().size();
        try {
            this.f۱۶۳۳۵d.seek(0);
            this.f۱۶۳۳۵d.write(new Cj(this.f۱۶۳۱۸a.m۱۹۵۹۹a(), totalAudioLen).m۱۹۶۱۶a());
            this.f۱۶۳۳۵d.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
