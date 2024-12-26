package a.b.g.a;

import a.b.g.e.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.v4.content.e.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public class h {

    /* access modifiers changed from: private */
    public interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    h() {
    }

    private static <T> T a(T[] fonts, int style, c<T> cVar) {
        int targetWeight = (style & 1) == 0 ? 400 : 700;
        boolean isTargetItalic = (style & 2) != 0;
        int bestScore = Integer.MAX_VALUE;
        T best = null;
        for (T font : fonts) {
            int score = (Math.abs(cVar.a(font) - targetWeight) * 2) + (cVar.b(font) == isTargetItalic ? 0 : 1);
            if (best == null || bestScore > score) {
                best = font;
                bestScore = score;
            }
        }
        return best;
    }

    /* access modifiers changed from: package-private */
    public class a implements c<b.f> {
        a(h this$0) {
        }

        public int a(b.f info2) {
            return info2.d();
        }

        public boolean b(b.f info2) {
            return info2.e();
        }
    }

    /* access modifiers changed from: protected */
    public b.f a(b.f[] fonts, int style) {
        return (b.f) a(fonts, style, new a(this));
    }

    /* access modifiers changed from: protected */
    public Typeface a(Context context, InputStream is) {
        File tmpFile = i.a(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!i.a(tmpFile, is)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(tmpFile.getPath());
            tmpFile.delete();
            return createFromFile;
        } catch (RuntimeException e2) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fonts, int style) {
        if (fonts.length < 1) {
            return null;
        }
        InputStream is = null;
        try {
            is = context.getContentResolver().openInputStream(a(fonts, style).c());
            return a(context, is);
        } catch (IOException e2) {
            return null;
        } finally {
            i.a(is);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements c<c.C۰۰۲۸c> {
        b(h this$0) {
        }

        public int a(c.C۰۰۲۸c entry) {
            return entry.e();
        }

        public boolean b(c.C۰۰۲۸c entry) {
            return entry.f();
        }
    }

    private c.C۰۰۲۸c a(c.b entry, int style) {
        return (c.C۰۰۲۸c) a(entry.a(), style, new b(this));
    }

    public Typeface a(Context context, c.b entry, Resources resources, int style) {
        c.C۰۰۲۸c best = a(entry, style);
        if (best == null) {
            return null;
        }
        return c.a(context, resources, best.b(), best.a(), style);
    }

    public Typeface a(Context context, Resources resources, int id, String path, int style) {
        File tmpFile = i.a(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!i.a(tmpFile, resources, id)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(tmpFile.getPath());
            tmpFile.delete();
            return createFromFile;
        } catch (RuntimeException e2) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }
}
