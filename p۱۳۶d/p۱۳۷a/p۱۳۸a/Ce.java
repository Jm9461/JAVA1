package p۱۳۶d.p۱۳۷a.p۱۳۸a;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import java.lang.ref.WeakReference;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.Ci;
import p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCa;

/* renamed from: d.a.a.e  reason: invalid class name */
public class Ce {

    /* renamed from: a  reason: contains not printable characters */
    private static final boolean f۱۵۵۹۸a = (Build.VERSION.SDK_INT >= 21);

    @TargetApi(21)
    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCb m۱۸۴۸۸a(View view, int centerX, int centerY, float startRadius, float endRadius) {
        if (view.getParent() instanceof AbstractCa) {
            AbstractCa revealLayout = (AbstractCa) view.getParent();
            revealLayout.m۱۸۴۵۷a(new AbstractCa.Cd(centerX, centerY, startRadius, endRadius, new WeakReference(view)));
            if (f۱۵۵۹۸a) {
                return new Cc(ViewAnimationUtils.createCircularReveal(view, centerX, centerY, startRadius, endRadius), revealLayout);
            }
            Ci reveal = Ci.m۱۶۲۳۸a(revealLayout, AbstractCa.f۱۵۵۸۷b, startRadius, endRadius);
            reveal.m۱۶۱۸۹a(m۱۸۴۸۷a(revealLayout));
            return new Cd(reveal, revealLayout);
        }
        throw new IllegalArgumentException("View must be inside RevealFrameLayout or RevealLinearLayout.");
    }

    /* renamed from: a  reason: contains not printable characters */
    private static AbstractCa.AbstractCa m۱۸۴۸۷a(AbstractCa target) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return new AbstractCa.Cc(target);
        }
        if (i >= 14) {
            return new AbstractCa.Cb(target);
        }
        return new AbstractCa.Ca(target);
    }

    /* renamed from: d.a.a.e$a  reason: invalid class name */
    static class Ca implements AbstractCa.AbstractCa {
        Ca() {
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۸۴۸۹b(p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa animation) {
        }
    }
}
