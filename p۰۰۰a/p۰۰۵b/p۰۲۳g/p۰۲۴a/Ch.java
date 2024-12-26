package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.p۰۴۳v4.content.p۰۴۴e.Cc;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cb;

/* access modifiers changed from: package-private */
/* renamed from: a.b.g.a.h  reason: invalid class name */
public class Ch {

    /* access modifiers changed from: private */
    /* renamed from: a.b.g.a.h$c  reason: invalid class name */
    public interface AbstractCc<T> {
        /* renamed from: a  reason: contains not printable characters */
        int m۱۰۴۸۳a(T t);

        /* renamed from: b  reason: contains not printable characters */
        boolean m۱۰۴۸۴b(T t);
    }

    Ch() {
    }

    /* renamed from: a  reason: contains not printable characters */
    private static <T> T m۱۰۴۶۹a(T[] fonts, int style, AbstractCc<T> cVar) {
        int targetWeight = (style & 1) == 0 ? 400 : 700;
        boolean isTargetItalic = (style & 2) != 0;
        int bestScore = Integer.MAX_VALUE;
        T best = null;
        for (T font : fonts) {
            int score = (Math.abs(cVar.m۱۰۴۸۳a(font) - targetWeight) * 2) + (cVar.m۱۰۴۸۴b(font) == isTargetItalic ? 0 : 1);
            if (best == null || bestScore > score) {
                best = font;
                bestScore = score;
            }
        }
        return best;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.g.a.h$a  reason: invalid class name */
    public class Ca implements AbstractCc<Cb.Cf> {
        Ca(Ch this$0) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۴۷۶a(Cb.Cf info2) {
            return info2.m۱۰۵۲۳d();
        }

        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۰۴۷۸b(Cb.Cf info2) {
            return info2.m۱۰۵۲۴e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public Cb.Cf m۱۰۴۷۰a(Cb.Cf[] fonts, int style) {
        return (Cb.Cf) m۱۰۴۶۹a(fonts, style, new Ca(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public Typeface m۱۰۴۷۴a(Context context, InputStream is) {
        File tmpFile = Ci.m۱۰۴۸۵a(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!Ci.m۱۰۴۹۱a(tmpFile, is)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(tmpFile.getPath());
            tmpFile.delete();
            return createFromFile;
        } catch (RuntimeException e) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Typeface m۱۰۴۷۲a(Context context, CancellationSignal cancellationSignal, Cb.Cf[] fonts, int style) {
        if (fonts.length < 1) {
            return null;
        }
        InputStream is = null;
        try {
            is = context.getContentResolver().openInputStream(m۱۰۴۷۰a(fonts, style).m۱۰۵۲۲c());
            return m۱۰۴۷۴a(context, is);
        } catch (IOException e) {
            return null;
        } finally {
            Ci.m۱۰۴۸۹a(is);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.g.a.h$b  reason: invalid class name */
    public class Cb implements AbstractCc<Cc.Cc> {
        Cb(Ch this$0) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۴۸۰a(Cc.Cc entry) {
            return entry.m۱۲۶۶۹e();
        }

        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۰۴۸۲b(Cc.Cc entry) {
            return entry.m۱۲۶۷۰f();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private Cc.Cc m۱۰۴۶۸a(Cc.Cb entry, int style) {
        return (Cc.Cc) m۱۰۴۶۹a(entry.m۱۲۶۶۴a(), style, new Cb(this));
    }

    /* renamed from: a  reason: contains not printable characters */
    public Typeface m۱۰۴۷۳a(Context context, Cc.Cb entry, Resources resources, int style) {
        Cc.Cc best = m۱۰۴۶۸a(entry, style);
        if (best == null) {
            return null;
        }
        return Cc.m۱۰۴۳۶a(context, resources, best.m۱۲۶۶۶b(), best.m۱۲۶۶۵a(), style);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Typeface m۱۰۴۷۱a(Context context, Resources resources, int id, String path, int style) {
        File tmpFile = Ci.m۱۰۴۸۵a(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!Ci.m۱۰۴۹۰a(tmpFile, resources, id)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(tmpFile.getPath());
            tmpFile.delete();
            return createFromFile;
        } catch (RuntimeException e) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }
}
