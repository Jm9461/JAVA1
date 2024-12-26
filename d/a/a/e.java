package d.a.a;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import b.h.a.a;
import b.h.a.i;
import d.a.a.a;
import java.lang.ref.WeakReference;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f۳۶۶۳a = (Build.VERSION.SDK_INT >= 21);

    @TargetApi(21)
    public static b a(View view, int centerX, int centerY, float startRadius, float endRadius) {
        if (view.getParent() instanceof a) {
            a revealLayout = (a) view.getParent();
            revealLayout.a(new a.d(centerX, centerY, startRadius, endRadius, new WeakReference(view)));
            if (f۳۶۶۳a) {
                return new c(ViewAnimationUtils.createCircularReveal(view, centerX, centerY, startRadius, endRadius), revealLayout);
            }
            i reveal = i.a(revealLayout, a.f۳۶۵۲b, startRadius, endRadius);
            reveal.a(a(revealLayout));
            return new d(reveal, revealLayout);
        }
        throw new IllegalArgumentException("View must be inside RevealFrameLayout or RevealLinearLayout.");
    }

    private static a.AbstractC۰۰۵۲a a(a target) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return new a.c(target);
        }
        if (i >= 14) {
            return new a.b(target);
        }
        return new a.C۰۱۱۵a(target);
    }

    static class a implements a.AbstractC۰۰۵۲a {
        a() {
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void b(b.h.a.a animation) {
        }
    }
}
