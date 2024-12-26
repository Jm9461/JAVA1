package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.view.y, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cy {

    /* renamed from: a, reason: contains not printable characters */
    private WeakReference<View> f۱۰۶۳۸a;

    /* renamed from: b, reason: contains not printable characters */
    Runnable f۱۰۶۳۹b = null;

    /* renamed from: c, reason: contains not printable characters */
    Runnable f۱۰۶۴۰c = null;

    /* renamed from: d, reason: contains not printable characters */
    int f۱۰۶۴۱d = -1;

    Cy(View view) {
        this.f۱۰۶۳۸a = new WeakReference<>(view);
    }

    /* renamed from: android.support.v4.view.y$c */
    static class c implements InterfaceCz {

        /* renamed from: a, reason: contains not printable characters */
        Cy f۱۰۶۴۶a;

        /* renamed from: b, reason: contains not printable characters */
        boolean f۱۰۶۴۷b;

        c(Cy vpa) {
            this.f۱۰۶۴۶a = vpa;
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۵۷۹۶b(View view) {
            this.f۱۰۶۴۷b = false;
            if (this.f۱۰۶۴۶a.f۱۰۶۴۱d > -1) {
                view.setLayerType(2, null);
            }
            Cy cy = this.f۱۰۶۴۶a;
            if (cy.f۱۰۶۳۹b != null) {
                Runnable startAction = cy.f۱۰۶۳۹b;
                cy.f۱۰۶۳۹b = null;
                startAction.run();
            }
            Object listenerTag = view.getTag(2113929216);
            InterfaceCz listener = null;
            if (listenerTag instanceof InterfaceCz) {
                listener = (InterfaceCz) listenerTag;
            }
            if (listener != null) {
                listener.mo۱۵۷۹۶b(view);
            }
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۵۷۹۵a(View view) {
            int i = this.f۱۰۶۴۶a.f۱۰۶۴۱d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f۱۰۶۴۶a.f۱۰۶۴۱d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f۱۰۶۴۷b) {
                Cy cy = this.f۱۰۶۴۶a;
                if (cy.f۱۰۶۴۰c != null) {
                    Runnable endAction = cy.f۱۰۶۴۰c;
                    cy.f۱۰۶۴۰c = null;
                    endAction.run();
                }
                Object listenerTag = view.getTag(2113929216);
                InterfaceCz listener = null;
                if (listenerTag instanceof InterfaceCz) {
                    listener = (InterfaceCz) listenerTag;
                }
                if (listener != null) {
                    listener.mo۱۵۷۹۵a(view);
                }
                this.f۱۰۶۴۷b = true;
            }
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: c, reason: contains not printable characters */
        public void mo۱۵۷۹۷c(View view) {
            Object listenerTag = view.getTag(2113929216);
            InterfaceCz listener = null;
            if (listenerTag instanceof InterfaceCz) {
                listener = (InterfaceCz) listenerTag;
            }
            if (listener != null) {
                listener.mo۱۵۷۹۷c(view);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cy m۱۰۹۸۴a(long value) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().setDuration(value);
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cy m۱۰۹۸۳a(float value) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().alpha(value);
        }
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cy m۱۰۹۹۰b(float value) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().translationY(value);
        }
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public long m۱۰۹۸۹b() {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cy m۱۰۹۸۷a(Interpolator value) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().setInterpolator(value);
        }
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cy m۱۰۹۹۱b(long value) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().setStartDelay(value);
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۹۸۸a() {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۰۹۹۲c() {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cy m۱۰۹۸۶a(InterfaceCz listener) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m۱۰۹۸۲a(view, listener);
            } else {
                view.setTag(2113929216, listener);
                m۱۰۹۸۲a(view, new c(this));
            }
        }
        return this;
    }

    /* renamed from: android.support.v4.view.y$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ InterfaceCz f۱۰۶۴۲a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ View f۱۰۶۴۳b;

        a(Cy this$0, InterfaceCz interfaceCz, View view) {
            this.f۱۰۶۴۲a = interfaceCz;
            this.f۱۰۶۴۳b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.f۱۰۶۴۲a.mo۱۵۷۹۷c(this.f۱۰۶۴۳b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.f۱۰۶۴۲a.mo۱۵۷۹۵a(this.f۱۰۶۴۳b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            this.f۱۰۶۴۲a.mo۱۵۷۹۶b(this.f۱۰۶۴۳b);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۰۹۸۲a(View view, InterfaceCz listener) {
        if (listener != null) {
            view.animate().setListener(new a(this, listener, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cy m۱۰۹۸۵a(InterfaceCb0 listener) {
        View view = this.f۱۰۶۳۸a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            ValueAnimator.AnimatorUpdateListener wrapped = null;
            if (listener != null) {
                wrapped = new b(this, listener, view);
            }
            view.animate().setUpdateListener(wrapped);
        }
        return this;
    }

    /* renamed from: android.support.v4.view.y$b */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ InterfaceCb0 f۱۰۶۴۴a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ View f۱۰۶۴۵b;

        b(Cy this$0, InterfaceCb0 interfaceCb0, View view) {
            this.f۱۰۶۴۴a = interfaceCb0;
            this.f۱۰۶۴۵b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f۱۰۶۴۴a.mo۱۴۷۴۹a(this.f۱۰۶۴۵b);
        }
    }
}
