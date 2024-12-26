package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.v4.content.p۲۰۲e.Cc;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۸e.Cb;

/* renamed from: a.b.g.a.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ch {

    /* renamed from: a.b.g.a.h$c */
    private interface c<T> {
        /* renamed from: a, reason: contains not printable characters */
        int mo۸۴۱۴a(T t);

        /* renamed from: b, reason: contains not printable characters */
        boolean mo۸۴۱۵b(T t);
    }

    Ch() {
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.a.h$c != android.support.v4.graphics.TypefaceCompatBaseImpl$StyleExtractor<T> */
    /* renamed from: a, reason: contains not printable characters */
    private static <T> T m۸۴۰۴a(T[] fonts, int style, c<T> cVar) {
        int targetWeight = (style & 1) == 0 ? 400 : 700;
        boolean isTargetItalic = (style & 2) != 0;
        int bestScore = Integer.MAX_VALUE;
        T best = null;
        for (T font : fonts) {
            int score = (Math.abs(cVar.mo۸۴۱۴a(font) - targetWeight) * 2) + (cVar.mo۸۴۱۵b(font) == isTargetItalic ? 0 : 1);
            if (best == null || bestScore > score) {
                best = font;
                bestScore = score;
            }
        }
        return best;
    }

    /* renamed from: a.b.g.a.h$a */
    class a implements c<Cb.f> {
        a(Ch this$0) {
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ch.c
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public int mo۸۴۱۴a(Cb.f info2) {
            return info2.m۸۴۵۲d();
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ch.c
        /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo۸۴۱۵b(Cb.f info2) {
            return info2.m۸۴۵۳e();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    protected Cb.f m۸۴۰۵a(Cb.f[] fonts, int style) {
        return (Cb.f) m۸۴۰۴a(fonts, style, new a(this));
    }

    /* renamed from: a, reason: contains not printable characters */
    protected Typeface m۸۴۰۹a(Context context, InputStream is) {
        File tmpFile = Ci.m۸۴۱۶a(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!Ci.m۸۴۲۲a(tmpFile, is)) {
                return null;
            }
            return Typeface.createFromFile(tmpFile.getPath());
        } catch (RuntimeException e2) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public Typeface mo۸۴۰۷a(Context context, CancellationSignal cancellationSignal, Cb.f[] fonts, int style) {
        if (fonts.length < 1) {
            return null;
        }
        Cb.f font = m۸۴۰۵a(fonts, style);
        InputStream is = null;
        try {
            is = context.getContentResolver().openInputStream(font.m۸۴۵۱c());
            return m۸۴۰۹a(context, is);
        } catch (IOException e2) {
            return null;
        } finally {
            Ci.m۸۴۲۰a(is);
        }
    }

    /* renamed from: a.b.g.a.h$b */
    class b implements c<Cc.c> {
        b(Ch this$0) {
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ch.c
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public int mo۸۴۱۴a(Cc.c entry) {
            return entry.m۱۰۵۹۹e();
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ch.c
        /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo۸۴۱۵b(Cc.c entry) {
            return entry.m۱۰۶۰۰f();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private Cc.c m۸۴۰۳a(Cc.b entry, int style) {
        return (Cc.c) m۸۴۰۴a(entry.m۱۰۵۹۴a(), style, new b(this));
    }

    /* renamed from: a, reason: contains not printable characters */
    public Typeface mo۸۴۰۸a(Context context, Cc.b entry, Resources resources, int style) {
        Cc.c best = m۸۴۰۳a(entry, style);
        if (best == null) {
            return null;
        }
        return Cc.m۸۳۷۱a(context, resources, best.m۱۰۵۹۶b(), best.m۱۰۵۹۵a(), style);
    }

    /* renamed from: a, reason: contains not printable characters */
    public Typeface mo۸۴۰۶a(Context context, Resources resources, int id, String path, int style) {
        File tmpFile = Ci.m۸۴۱۶a(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!Ci.m۸۴۲۱a(tmpFile, resources, id)) {
                return null;
            }
            return Typeface.createFromFile(tmpFile.getPath());
        } catch (RuntimeException e2) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }
}
