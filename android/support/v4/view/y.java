package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f۱۳۸۳a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f۱۳۸۴b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f۱۳۸۵c = null;

    /* renamed from: d  reason: collision with root package name */
    int f۱۳۸۶d = -1;

    y(View view) {
        this.f۱۳۸۳a = new WeakReference<>(view);
    }

    static class c implements z {

        /* renamed from: a  reason: collision with root package name */
        y f۱۳۹۱a;

        /* renamed from: b  reason: collision with root package name */
        boolean f۱۳۹۲b;

        c(y vpa) {
            this.f۱۳۹۱a = vpa;
        }

        @Override // android.support.v4.view.z
        public void b(View view) {
            this.f۱۳۹۲b = false;
            if (this.f۱۳۹۱a.f۱۳۸۶d > -1) {
                view.setLayerType(2, null);
            }
            y yVar = this.f۱۳۹۱a;
            if (yVar.f۱۳۸۴b != null) {
                Runnable startAction = yVar.f۱۳۸۴b;
                yVar.f۱۳۸۴b = null;
                startAction.run();
            }
            Object listenerTag = view.getTag(2113929216);
            z listener = null;
            if (listenerTag instanceof z) {
                listener = (z) listenerTag;
            }
            if (listener != null) {
                listener.b(view);
            }
        }

        @Override // android.support.v4.view.z
        public void a(View view) {
            int i = this.f۱۳۹۱a.f۱۳۸۶d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f۱۳۹۱a.f۱۳۸۶d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f۱۳۹۲b) {
                y yVar = this.f۱۳۹۱a;
                if (yVar.f۱۳۸۵c != null) {
                    Runnable endAction = yVar.f۱۳۸۵c;
                    yVar.f۱۳۸۵c = null;
                    endAction.run();
                }
                Object listenerTag = view.getTag(2113929216);
                z listener = null;
                if (listenerTag instanceof z) {
                    listener = (z) listenerTag;
                }
                if (listener != null) {
                    listener.a(view);
                }
                this.f۱۳۹۲b = true;
            }
        }

        @Override // android.support.v4.view.z
        public void c(View view) {
            Object listenerTag = view.getTag(2113929216);
            z listener = null;
            if (listenerTag instanceof z) {
                listener = (z) listenerTag;
            }
            if (listener != null) {
                listener.c(view);
            }
        }
    }

    public y a(long value) {
        View view = this.f۱۳۸۳a.get();
        if (view != null) {
            view.animate().setDuration(value);
        }
        return this;
    }

    public y a(float value) {
        View view = this.f۱۳۸۳a.get();
        if (view != null) {
            view.animate().alpha(value);
        }
        return this;
    }

    public y b(float value) {
        View view = this.f۱۳۸۳a.get();
        if (view != null) {
            view.animate().translationY(value);
        }
        return this;
    }

    public long b() {
        View view = this.f۱۳۸۳a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public y a(Interpolator value) {
        View view = this.f۱۳۸۳a.get();
        if (view != null) {
            view.animate().setInterpolator(value);
        }
        return this;
    }

    public y b(long value) {
        View view = this.f۱۳۸۳a.get();
        if (view != null) {
            view.animate().setStartDelay(value);
        }
        return this;
    }

    public void a() {
        View view = this.f۱۳۸۳a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public void c() {
        View view = this.f۱۳۸۳a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public y a(z listener) {
        View view = this.f۱۳۸۳a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                a(view, listener);
            } else {
                view.setTag(2113929216, listener);
                a(view, new c(this));
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f۱۳۸۷a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f۱۳۸۸b;

        a(y this$0, z zVar, View view) {
            this.f۱۳۸۷a = zVar;
            this.f۱۳۸۸b = view;
        }

        public void onAnimationCancel(Animator animation) {
            this.f۱۳۸۷a.c(this.f۱۳۸۸b);
        }

        public void onAnimationEnd(Animator animation) {
            this.f۱۳۸۷a.a(this.f۱۳۸۸b);
        }

        public void onAnimationStart(Animator animation) {
            this.f۱۳۸۷a.b(this.f۱۳۸۸b);
        }
    }

    private void a(View view, z listener) {
        if (listener != null) {
            view.animate().setListener(new a(this, listener, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public y a(b0 listener) {
        View view = this.f۱۳۸۳a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            ValueAnimator.AnimatorUpdateListener wrapped = null;
            if (listener != null) {
                wrapped = new b(this, listener, view);
            }
            view.animate().setUpdateListener(wrapped);
        }
        return this;
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f۱۳۸۹a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f۱۳۹۰b;

        b(y this$0, b0 b0Var, View view) {
            this.f۱۳۸۹a = b0Var;
            this.f۱۳۹۰b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f۱۳۸۹a.a(this.f۱۳۹۰b);
        }
    }
}
