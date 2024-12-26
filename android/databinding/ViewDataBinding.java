package android.databinding;

import android.annotation.TargetApi;
import android.arch.lifecycle.AbstractCc;
import android.arch.lifecycle.AbstractCd;
import android.arch.lifecycle.AbstractCe;
import android.arch.lifecycle.AbstractCl;
import android.databinding.Cb;
import android.os.Build;
import android.os.Handler;
import android.view.Choreographer;
import android.view.View;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class ViewDataBinding extends Ca {

    /* renamed from: k  reason: contains not printable characters */
    static int f۹۰۰۳k = Build.VERSION.SDK_INT;

    /* renamed from: l  reason: contains not printable characters */
    private static final boolean f۹۰۰۴l = (f۹۰۰۳k >= 16);

    /* renamed from: a  reason: contains not printable characters */
    private final Runnable f۹۰۰۵a;

    /* renamed from: b  reason: contains not printable characters */
    private boolean f۹۰۰۶b;

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۹۰۰۷c;

    /* renamed from: d  reason: contains not printable characters */
    private Cb<Object, ViewDataBinding, Void> f۹۰۰۸d;

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۹۰۰۹e;

    /* renamed from: f  reason: contains not printable characters */
    private Choreographer f۹۰۱۰f;

    /* renamed from: g  reason: contains not printable characters */
    private final Choreographer.FrameCallback f۹۰۱۱g;

    /* renamed from: h  reason: contains not printable characters */
    private Handler f۹۰۱۲h;

    /* renamed from: i  reason: contains not printable characters */
    private ViewDataBinding f۹۰۱۳i;

    /* renamed from: j  reason: contains not printable characters */
    private AbstractCe f۹۰۱۴j;

    /* renamed from: android.databinding.ViewDataBinding$g  reason: invalid class name */
    private interface AbstractCg {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۰۹۴۰a();

    /* renamed from: c  reason: contains not printable characters */
    public abstract boolean m۱۰۹۴۲c();

    static {
        "binding_".length();
        new Ca();
        new Cb();
        new Cc();
        new Cd();
        new Ce();
        new ReferenceQueue();
        if (Build.VERSION.SDK_INT >= 19) {
            new View$OnAttachStateChangeListenerCf();
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$a  reason: invalid class name */
    static class Ca implements AbstractCg {
        Ca() {
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$b  reason: invalid class name */
    static class Cb implements AbstractCg {
        Cb() {
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$c  reason: invalid class name */
    static class Cc implements AbstractCg {
        Cc() {
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$d  reason: invalid class name */
    static class Cd implements AbstractCg {
        Cd() {
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$e  reason: invalid class name */
    static class Ce extends Cb.AbstractCa<Object, ViewDataBinding, Void> {
        Ce() {
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$f  reason: invalid class name */
    static class View$OnAttachStateChangeListenerCf implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerCf() {
        }

        @TargetApi(19)
        public void onViewAttachedToWindow(View v) {
            ViewDataBinding.m۱۰۹۳۷a(v).f۹۰۰۵a.run();
            v.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View v) {
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۹۴۱b() {
        ViewDataBinding viewDataBinding = this.f۹۰۱۳i;
        if (viewDataBinding == null) {
            m۱۰۹۳۹e();
        } else {
            viewDataBinding.m۱۰۹۴۱b();
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۰۹۳۹e() {
        if (this.f۹۰۰۹e) {
            m۱۰۹۴۳d();
        } else if (m۱۰۹۴۲c()) {
            this.f۹۰۰۹e = true;
            this.f۹۰۰۷c = false;
            Cb<Object, ViewDataBinding, Void> bVar = this.f۹۰۰۸d;
            if (bVar == null) {
                if (!this.f۹۰۰۷c) {
                    m۱۰۹۴۰a();
                    Cb<Object, ViewDataBinding, Void> bVar2 = this.f۹۰۰۸d;
                    if (bVar2 != null) {
                        bVar2.m۱۰۹۴۴a(this, 3, null);
                        throw null;
                    }
                }
                this.f۹۰۰۹e = false;
                return;
            }
            bVar.m۱۰۹۴۴a(this, 1, null);
            throw null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static ViewDataBinding m۱۰۹۳۷a(View v) {
        if (v != null) {
            return (ViewDataBinding) v.getTag(p۰۵۲b.p۰۵۷b.p۰۵۸a.p۰۵۹a.Ca.dataBinding);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (android.databinding.ViewDataBinding.f۹۰۰۴l == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r3.f۹۰۱۰f.postFrameCallback(r3.f۹۰۱۱g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r3.f۹۰۱۲h.post(r3.f۹۰۰۵a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* renamed from: d  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۰۹۴۳d() {
        /*
            r3 = this;
            android.databinding.ViewDataBinding r0 = r3.f۹۰۱۳i
            if (r0 == 0) goto L_0x0008
            r0.m۱۰۹۴۳d()
            goto L_0x003b
        L_0x0008:
            android.arch.lifecycle.e r0 = r3.f۹۰۱۴j
            if (r0 == 0) goto L_0x001d
            android.arch.lifecycle.c r1 = r0.m۱۰۸۹۱a()
            android.arch.lifecycle.c$b r1 = r1.m۱۰۸۸۷a()
            android.arch.lifecycle.c$b r2 = android.arch.lifecycle.AbstractCc.EnumCb.STARTED
            boolean r2 = r1.m۱۰۸۹۰a(r2)
            if (r2 != 0) goto L_0x001d
            return
        L_0x001d:
            monitor-enter(r3)
            boolean r1 = r3.f۹۰۰۶b     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0024
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            return
        L_0x0024:
            r1 = 1
            r3.f۹۰۰۶b = r1     // Catch:{ all -> 0x003c }
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            boolean r1 = android.databinding.ViewDataBinding.f۹۰۰۴l
            if (r1 == 0) goto L_0x0034
            android.view.Choreographer r1 = r3.f۹۰۱۰f
            android.view.Choreographer$FrameCallback r2 = r3.f۹۰۱۱g
            r1.postFrameCallback(r2)
            goto L_0x003b
        L_0x0034:
            android.os.Handler r1 = r3.f۹۰۱۲h
            java.lang.Runnable r2 = r3.f۹۰۰۵a
            r1.post(r2)
        L_0x003b:
            return
        L_0x003c:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.databinding.ViewDataBinding.m۱۰۹۴۳d():void");
    }

    static class OnStartListener implements AbstractCd {

        /* renamed from: a  reason: contains not printable characters */
        final WeakReference<ViewDataBinding> f۹۰۱۵a;

        @AbstractCl(AbstractCc.EnumCa.ON_START)
        public void onStart() {
            ViewDataBinding dataBinding = this.f۹۰۱۵a.get();
            if (dataBinding != null) {
                dataBinding.m۱۰۹۴۱b();
            }
        }
    }
}
