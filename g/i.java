package g;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* access modifiers changed from: package-private */
public final class i extends a {

    /* renamed from: d  reason: collision with root package name */
    private final RandomAccessFile f۴۲۴۰d;

    public i(e pullTransport, File file) {
        super(pullTransport, file);
        this.f۴۲۴۰d = a(file);
    }

    private RandomAccessFile a(File file) {
        try {
            return new RandomAccessFile(file, "rw");
        } catch (FileNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // g.a, g.f
    public void a() {
        super.a();
        try {
            e();
        } catch (IOException e2) {
        }
    }

    private void e() {
        long totalAudioLen = new FileInputStream(this.f۴۲۲۴b).getChannel().size();
        try {
            this.f۴۲۴۰d.seek(0);
            this.f۴۲۴۰d.write(new j(this.f۴۲۲۳a.a(), totalAudioLen).a());
            this.f۴۲۴۰d.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
