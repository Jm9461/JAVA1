package p۱۳۶d.p۱۳۷a.p۱۳۸a;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb;

/* access modifiers changed from: package-private */
@TargetApi(11)
/* renamed from: d.a.a.c  reason: invalid class name */
public final class Cc extends AbstractCb {

    /* renamed from: a  reason: contains not printable characters */
    WeakReference<Animator> f۱۵۵۹۴a;

    Cc(Animator animator, AbstractCa target) {
        super(target);
        this.f۱۵۵۹۴a = new WeakReference<>(animator);
    }

    @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۷۶a() {
        Animator a = this.f۱۵۵۹۴a.get();
        if (a != null) {
            a.start();
        }
    }

    @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۷۷a(int duration) {
        Animator a = this.f۱۵۵۹۴a.get();
        if (a != null) {
            a.setDuration((long) duration);
        }
    }

    @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۷۸a(Interpolator value) {
        Animator a = this.f۱۵۵۹۴a.get();
        if (a != null) {
            a.setInterpolator(value);
        }
    }

    @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۷۹a(AbstractCb.AbstractCa listener) {
        Animator a = this.f۱۵۵۹۴a.get();
        if (a != null) {
            if (listener == null) {
                a.addListener(null);
            } else {
                a.addListener(new Ca(this, listener));
            }
        }
    }

    /* renamed from: d.a.a.c$a  reason: invalid class name */
    class Ca implements Animator.AnimatorListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCb.AbstractCa f۱۵۵۹۵a;

        Ca(Cc this$0, AbstractCb.AbstractCa aVar) {
            this.f۱۵۵۹۵a = aVar;
        }

        public void onAnimationStart(Animator animation) {
            this.f۱۵۵۹۵a.m۱۸۴۷۵d();
        }

        public void onAnimationEnd(Animator animation) {
            this.f۱۵۵۹۵a.m۱۸۴۷۲a();
        }

        public void onAnimationCancel(Animator animation) {
            this.f۱۵۵۹۵a.m۱۸۴۷۳b();
        }

        public void onAnimationRepeat(Animator animation) {
            this.f۱۵۵۹۵a.m۱۸۴۷۴c();
        }
    }
}
