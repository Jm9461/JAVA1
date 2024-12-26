package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۸e.Cb;

/* renamed from: a.b.g.a.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cd extends Ch {
    Cd() {
    }

    /* renamed from: a, reason: contains not printable characters */
    private File m۸۳۷۶a(ParcelFileDescriptor fd) {
        try {
            String path = Os.readlink("/proc/self/fd/" + fd.getFd());
            if (!OsConstants.S_ISREG(Os.stat(path).st_mode)) {
                return null;
            }
            return new File(path);
        } catch (ErrnoException e2) {
            return null;
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ch
    /* renamed from: a, reason: contains not printable characters */
    public Typeface mo۸۴۰۷a(Context context, CancellationSignal cancellationSignal, Cb.f[] fonts, int style) {
        if (fonts.length < 1) {
            return null;
        }
        Cb.f bestFont = m۸۴۰۵a(fonts, style);
        ContentResolver resolver = context.getContentResolver();
        try {
            ParcelFileDescriptor pfd = resolver.openFileDescriptor(bestFont.m۸۴۵۱c(), "r", cancellationSignal);
            try {
                File file = m۸۳۷۶a(pfd);
                if (file != null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (pfd != null) {
                        pfd.close();
                    }
                    return createFromFile;
                }
                FileInputStream fis = new FileInputStream(pfd.getFileDescriptor());
                try {
                    Typeface typeface = super.m۸۴۰۹a(context, fis);
                    fis.close();
                    if (pfd != null) {
                        pfd.close();
                    }
                    return typeface;
                } finally {
                }
            } finally {
            }
        } catch (IOException e2) {
            return null;
        }
    }
}
