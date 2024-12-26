package d.a.a;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;
import d.a.a.b;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
@TargetApi(11)
public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<Animator> f۳۶۵۹a;

    c(Animator animator, a target) {
        super(target);
        this.f۳۶۵۹a = new WeakReference<>(animator);
    }

    @Override // d.a.a.b
    public void a() {
        Animator a2 = this.f۳۶۵۹a.get();
        if (a2 != null) {
            a2.start();
        }
    }

    @Override // d.a.a.b
    public void a(int duration) {
        Animator a2 = this.f۳۶۵۹a.get();
        if (a2 != null) {
            a2.setDuration((long) duration);
        }
    }

    @Override // d.a.a.b
    public void a(Interpolator value) {
        Animator a2 = this.f۳۶۵۹a.get();
        if (a2 != null) {
            a2.setInterpolator(value);
        }
    }

    @Override // d.a.a.b
    public void a(b.a listener) {
        Animator a2 = this.f۳۶۵۹a.get();
        if (a2 != null) {
            if (listener == null) {
                a2.addListener(null);
            } else {
                a2.addListener(new a(this, listener));
            }
        }
    }

    class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f۳۶۶۰a;

        a(c this$0, b.a aVar) {
            this.f۳۶۶۰a = aVar;
        }

        public void onAnimationStart(Animator animation) {
            this.f۳۶۶۰a.d();
        }

        public void onAnimationEnd(Animator animation) {
            this.f۳۶۶۰a.a();
        }

        public void onAnimationCancel(Animator animation) {
            this.f۳۶۶۰a.b();
        }

        public void onAnimationRepeat(Animator animation) {
            this.f۳۶۶۰a.c();
        }
    }
}
