package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

/* renamed from: a.b.g.a.d  reason: invalid class name */
class Cd extends Ch {
    Cd() {
    }

    /* renamed from: a  reason: contains not printable characters */
    private File m۱۰۴۴۱a(ParcelFileDescriptor fd) {
        try {
            String path = Os.readlink("/proc/self/fd/" + fd.getFd());
            if (OsConstants.S_ISREG(Os.stat(path).st_mode)) {
                return new File(path);
            }
            return null;
        } catch (ErrnoException e) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
        r6.addSuppressed(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0055, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0056, code lost:
        if (r3 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005c, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005d, code lost:
        r4.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0060, code lost:
        throw r5;
     */
    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ch
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface m۱۰۴۴۲a(android.content.Context r10, android.os.CancellationSignal r11, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cb.Cf[] r12, int r13) {
        /*
            r9 = this;
            int r0 = r12.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            a.b.g.e.b$f r0 = r9.m۱۰۴۷۰a(r12, r13)
            android.content.ContentResolver r2 = r10.getContentResolver()
            android.net.Uri r3 = r0.m۱۰۵۲۲c()     // Catch:{ IOException -> 0x0061 }
            java.lang.String r4 = "r"
            android.os.ParcelFileDescriptor r3 = r2.openFileDescriptor(r3, r4, r11)     // Catch:{ IOException -> 0x0061 }
            java.io.File r4 = r9.m۱۰۴۴۱a(r3)     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x0031
            boolean r5 = r4.canRead()     // Catch:{ all -> 0x0053 }
            if (r5 != 0) goto L_0x0027
            goto L_0x0031
        L_0x0027:
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r4)     // Catch:{ all -> 0x0053 }
            if (r3 == 0) goto L_0x0030
            r3.close()
        L_0x0030:
            return r5
        L_0x0031:
            java.io.FileInputStream r5 = new java.io.FileInputStream
            java.io.FileDescriptor r6 = r3.getFileDescriptor()
            r5.<init>(r6)
            android.graphics.Typeface r6 = super.m۱۰۴۷۴a(r10, r5)     // Catch:{ all -> 0x0047 }
            r5.close()
            if (r3 == 0) goto L_0x0046
            r3.close()
        L_0x0046:
            return r6
        L_0x0047:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r7 = move-exception
            r5.close()     // Catch:{ all -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r8 = move-exception
            r6.addSuppressed(r8)
        L_0x0052:
            throw r7
        L_0x0053:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r5 = move-exception
            if (r3 == 0) goto L_0x0060
            r3.close()     // Catch:{ all -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r6 = move-exception
            r4.addSuppressed(r6)
        L_0x0060:
            throw r5
        L_0x0061:
            r3 = move-exception
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Cd.m۱۰۴۴۲a(android.content.Context, android.os.CancellationSignal, a.b.g.e.b$f[], int):android.graphics.Typeface");
    }
}
