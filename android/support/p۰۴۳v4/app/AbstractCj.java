package android.support.p۰۴۳v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cm;

/* renamed from: android.support.v4.app.j  reason: invalid class name */
public abstract class AbstractCj<E> extends AbstractCh {

    /* renamed from: a  reason: contains not printable characters */
    private final Activity f۱۰۲۲۱a;

    /* renamed from: b  reason: contains not printable characters */
    private final Context f۱۰۲۲۲b;

    /* renamed from: c  reason: contains not printable characters */
    private final Handler f۱۰۲۲۳c;

    /* renamed from: d  reason: contains not printable characters */
    final LayoutInflater$Factory2Cl f۱۰۲۲۴d;

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۳۰۵a(ComponentCallbacksCf fVar);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۳۰۶a(ComponentCallbacksCf fVar, Intent intent, int i, Bundle bundle);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۳۰۷a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b  reason: contains not printable characters */
    public abstract boolean m۱۲۳۰۹b(ComponentCallbacksCf fVar);

    /* renamed from: f  reason: contains not printable characters */
    public abstract LayoutInflater m۱۲۳۱۳f();

    /* renamed from: g  reason: contains not printable characters */
    public abstract int m۱۲۳۱۴g();

    /* renamed from: h  reason: contains not printable characters */
    public abstract boolean m۱۲۳۱۵h();

    /* renamed from: i  reason: contains not printable characters */
    public abstract void m۱۲۳۱۶i();

    AbstractCj(ActivityCg activity) {
        this(activity, activity, activity.f۱۰۲۰۵d, 0);
    }

    AbstractCj(Activity activity, Context context, Handler handler, int windowAnimations) {
        this.f۱۰۲۲۴d = new LayoutInflater$Factory2Cl();
        this.f۱۰۲۲۱a = activity;
        Cm.m۱۰۶۴۳a(context, "context == null");
        this.f۱۰۲۲۲b = context;
        Cm.m۱۰۶۴۳a(handler, "handler == null");
        this.f۱۰۲۲۳c = handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public Activity m۱۲۳۰۸b() {
        return this.f۱۰۲۲۱a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public Context m۱۲۳۱۰c() {
        return this.f۱۰۲۲۲b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public Handler m۱۲۳۱۲e() {
        return this.f۱۰۲۲۳c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public LayoutInflater$Factory2Cl m۱۲۳۱۱d() {
        return this.f۱۰۲۲۴d;
    }
}
