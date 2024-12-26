package android.support.p۰۴۳v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.view.y  reason: invalid class name */
public final class Cy {

    /* renamed from: a  reason: contains not printable characters */
    private WeakReference<View> f۱۰۶۳۸a;

    /* renamed from: b  reason: contains not printable characters */
    Runnable f۱۰۶۳۹b = null;

    /* renamed from: c  reason: contains not printable characters */
    Runnable f۱۰۶۴۰c = null;

    /* renamed from: d  reason: contains not printable characters */
    int f۱۰۶۴۱d = -1;

    Cy(View view) {
        this.f۱۰۶۳۸a = new WeakReference<>(view);
    }

    /* renamed from: android.support.v4.view.y$c  reason: invalid class name */
    static class Cc implements AbstractCz {

        /* renamed from: a  reason: contains not printable characters */
        Cy f۱۰۶۴۶a;

        /* renamed from: b  reason: contains not printable characters */
        boolean f۱۰۶۴۷b;

        Cc(Cy vpa) {
            this.f۱۰۶۴۶a = vpa;
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۳۰۶۴b(View view) {
            this.f۱۰۶۴۷b = false;
            if (this.f۱۰۶۴۶a.f۱۰۶۴۱d > -1) {
                view.setLayerType(2, null);
            }
            Cy yVar = this.f۱۰۶۴۶a;
            if (yVar.f۱۰۶۳۹b != null) {
                Runnable startAction = yVar.f۱۰۶۳۹b;
                yVar.f۱۰۶۳۹b = null;
                startAction.run();
            }
            Object listenerTag = view.getTag(2113929216);
            AbstractCz listener = null;
            if (listenerTag instanceof AbstractCz) {
                listener = (AbstractCz) listenerTag;
            }
            if (listener != null) {
                listener.m۱۳۰۶۷b(view);
            }
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۰۶۳a(View view) {
            int i = this.f۱۰۶۴۶a.f۱۰۶۴۱d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f۱۰۶۴۶a.f۱۰۶۴۱d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f۱۰۶۴۷b) {
                Cy yVar = this.f۱۰۶۴۶a;
                if (yVar.f۱۰۶۴۰c != null) {
                    Runnable endAction = yVar.f۱۰۶۴۰c;
                    yVar.f۱۰۶۴۰c = null;
                    endAction.run();
                }
                Object listenerTag = view.getTag(2113929216);
                AbstractCz listener = null;
                if (listenerTag instanceof AbstractCz) {
                    listener = (AbstractCz) listenerTag;
                }
                if (listener != null) {
                    listener.m۱۳۰۶۶a(view);
                }
                this.f۱۰۶۴۷b = true;
            }
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۳۰۶۵c(View view) {
            Object listenerTag = view.getTag(2113929216);
            AbstractCz listener = null;
            if (listenerTag instanceof AbstractCz) {
                listener = (AbstractCz) listenerTag;
            }
            if (listener != null) {
                listener.m۱۳۰۶۸c(view);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cy m۱۳۰۵۴a(long value) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().setDuration(value);
        }
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cy m۱۳۰۵۳a(float value) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().alpha(value);
        }
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cy m۱۳۰۶۰b(float value) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().translationY(value);
        }
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public long m۱۳۰۵۹b() {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cy m۱۳۰۵۷a(Interpolator value) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().setInterpolator(value);
        }
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cy m۱۳۰۶۱b(long value) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().setStartDelay(value);
        }
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۰۵۸a() {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۰۶۲c() {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cy m۱۳۰۵۶a(AbstractCz listener) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m۱۳۰۵۲a(view, listener);
            } else {
                view.setTag(2113929216, listener);
                m۱۳۰۵۲a(view, new Cc(this));
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.y$a  reason: invalid class name */
    public class Ca extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCz f۱۰۶۴۲a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۶۴۳b;

        Ca(Cy this$0, AbstractCz zVar, View view) {
            this.f۱۰۶۴۲a = zVar;
            this.f۱۰۶۴۳b = view;
        }

        public void onAnimationCancel(Animator animation) {
            this.f۱۰۶۴۲a.m۱۳۰۶۸c(this.f۱۰۶۴۳b);
        }

        public void onAnimationEnd(Animator animation) {
            this.f۱۰۶۴۲a.m۱۳۰۶۶a(this.f۱۰۶۴۳b);
        }

        public void onAnimationStart(Animator animation) {
            this.f۱۰۶۴۲a.m۱۳۰۶۷b(this.f۱۰۶۴۳b);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۰۵۲a(View view, AbstractCz listener) {
        if (listener != null) {
            view.animate().setListener(new Ca(this, listener, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cy m۱۳۰۵۵a(AbstractCb0 listener) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            ValueAnimator.AnimatorUpdateListener wrapped = null;
            if (listener != null) {
                wrapped = new Cb(this, listener, view);
            }
            view.animate().setUpdateListener(wrapped);
        }
        return this;
    }

    /* renamed from: android.support.v4.view.y$b  reason: invalid class name */
    class Cb implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCb0 f۱۰۶۴۴a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۶۴۵b;

        Cb(Cy this$0, AbstractCb0 b0Var, View view) {
            this.f۱۰۶۴۴a = b0Var;
            this.f۱۰۶۴۵b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f۱۰۶۴۴a.m۱۲۸۰۴a(this.f۱۰۶۴۵b);
        }
    }
}
