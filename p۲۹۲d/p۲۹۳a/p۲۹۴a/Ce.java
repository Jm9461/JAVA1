package p۲۹۲d.p۲۹۳a.p۲۹۴a;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import java.lang.ref.WeakReference;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.Ci;
import p۲۹۲d.p۲۹۳a.p۲۹۴a.InterfaceCa;

/* renamed from: d.a.a.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ce {

    /* renamed from: a, reason: contains not printable characters */
    private static final boolean f۱۵۵۹۸a;

    static {
        f۱۵۵۹۸a = Build.VERSION.SDK_INT >= 21;
    }

    @TargetApi(21)
    /* renamed from: a, reason: contains not printable characters */
    public static AbstractCb m۱۶۴۰۹a(View view, int centerX, int centerY, float startRadius, float endRadius) {
        if (!(view.getParent() instanceof InterfaceCa)) {
            throw new IllegalArgumentException("View must be inside RevealFrameLayout or RevealLinearLayout.");
        }
        InterfaceCa revealLayout = (InterfaceCa) view.getParent();
        revealLayout.mo۱۷۵۸۵a(new InterfaceCa.d(centerX, centerY, startRadius, endRadius, new WeakReference(view)));
        if (f۱۵۵۹۸a) {
            return new Cc(ViewAnimationUtils.createCircularReveal(view, centerX, centerY, startRadius, endRadius), revealLayout);
        }
        Ci reveal = Ci.m۱۴۱۷۳a(revealLayout, InterfaceCa.f۱۵۵۸۷b, startRadius, endRadius);
        reveal.m۱۴۱۱۸a(m۱۶۴۰۸a(revealLayout));
        return new Cd(reveal, revealLayout);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static AbstractCa.a m۱۶۴۰۸a(InterfaceCa target) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return new InterfaceCa.c(target);
        }
        if (i >= 14) {
            return new InterfaceCa.b(target);
        }
        return new InterfaceCa.a(target);
    }

    /* renamed from: d.a.a.e$a */
    static class a implements AbstractCa.a {
        a() {
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۶۴۱۰b(AbstractCa animation) {
        }
    }
}
