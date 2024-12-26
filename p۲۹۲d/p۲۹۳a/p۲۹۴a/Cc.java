package p۲۹۲d.p۲۹۳a.p۲۹۴a;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb;

@TargetApi(11)
/* renamed from: d.a.a.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cc extends AbstractCb {

    /* renamed from: a, reason: contains not printable characters */
    WeakReference<Animator> f۱۵۵۹۴a;

    Cc(Animator animator, InterfaceCa target) {
        super(target);
        this.f۱۵۵۹۴a = new WeakReference<>(animator);
    }

    @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۴۰۱a() {
        Animator a2 = this.f۱۵۵۹۴a.get();
        if (a2 != null) {
            a2.start();
        }
    }

    @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۴۰۲a(int duration) {
        Animator a2 = this.f۱۵۵۹۴a.get();
        if (a2 != null) {
            a2.setDuration(duration);
        }
    }

    @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۴۰۳a(Interpolator value) {
        Animator a2 = this.f۱۵۵۹۴a.get();
        if (a2 != null) {
            a2.setInterpolator(value);
        }
    }

    @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۴۰۴a(AbstractCb.a listener) {
        Animator a2 = this.f۱۵۵۹۴a.get();
        if (a2 == null) {
            return;
        }
        if (listener == null) {
            a2.addListener(null);
        } else {
            a2.addListener(new a(this, listener));
        }
    }

    /* renamed from: d.a.a.c$a */
    class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ AbstractCb.a f۱۵۵۹۵a;

        a(Cc this$0, AbstractCb.a aVar) {
            this.f۱۵۵۹۵a = aVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            this.f۱۵۵۹۵a.mo۱۶۳۹۶d();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.f۱۵۵۹۵a.mo۱۶۳۹۳a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.f۱۵۵۹۵a.mo۱۶۳۹۴b();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            this.f۱۵۵۹۵a.mo۱۶۳۹۵c();
        }
    }
}
