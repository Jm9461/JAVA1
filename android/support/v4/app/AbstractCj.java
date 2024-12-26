package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cm;

/* renamed from: android.support.v4.app.j, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCj<E> extends AbstractCh {

    /* renamed from: a, reason: contains not printable characters */
    private final Activity f۱۰۲۲۱a;

    /* renamed from: b, reason: contains not printable characters */
    private final Context f۱۰۲۲۲b;

    /* renamed from: c, reason: contains not printable characters */
    private final Handler f۱۰۲۲۳c;

    /* renamed from: d, reason: contains not printable characters */
    final LayoutInflaterFactory2Cl f۱۰۲۲۴d;

    /* renamed from: a, reason: contains not printable characters */
    abstract void mo۱۰۲۳۵a(ComponentCallbacksCf componentCallbacksCf);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۰۲۳۶a(ComponentCallbacksCf componentCallbacksCf, Intent intent, int i, Bundle bundle);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۰۲۳۷a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b, reason: contains not printable characters */
    public abstract boolean mo۱۰۲۳۹b(ComponentCallbacksCf componentCallbacksCf);

    /* renamed from: f, reason: contains not printable characters */
    public abstract LayoutInflater mo۱۰۲۴۳f();

    /* renamed from: g, reason: contains not printable characters */
    public abstract int mo۱۰۲۴۴g();

    /* renamed from: h, reason: contains not printable characters */
    public abstract boolean mo۱۰۲۴۵h();

    /* renamed from: i, reason: contains not printable characters */
    public abstract void mo۱۰۲۴۶i();

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.app.j != android.support.v4.app.FragmentHostCallback<E> */
    AbstractCj(ActivityCg activity) {
        this(activity, activity, activity.f۱۰۲۰۵d, 0);
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.app.j != android.support.v4.app.FragmentHostCallback<E> */
    AbstractCj(Activity activity, Context context, Handler handler, int windowAnimations) {
        this.f۱۰۲۲۴d = new LayoutInflaterFactory2Cl();
        this.f۱۰۲۲۱a = activity;
        Cm.m۸۵۷۳a(context, "context == null");
        this.f۱۰۲۲۲b = context;
        Cm.m۸۵۷۳a(handler, "handler == null");
        this.f۱۰۲۲۳c = handler;
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.app.j != android.support.v4.app.FragmentHostCallback<E> */
    /* renamed from: b, reason: contains not printable characters */
    Activity m۱۰۲۳۸b() {
        return this.f۱۰۲۲۱a;
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.app.j != android.support.v4.app.FragmentHostCallback<E> */
    /* renamed from: c, reason: contains not printable characters */
    Context m۱۰۲۴۰c() {
        return this.f۱۰۲۲۲b;
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.app.j != android.support.v4.app.FragmentHostCallback<E> */
    /* renamed from: e, reason: contains not printable characters */
    Handler m۱۰۲۴۲e() {
        return this.f۱۰۲۲۳c;
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.app.j != android.support.v4.app.FragmentHostCallback<E> */
    /* renamed from: d, reason: contains not printable characters */
    LayoutInflaterFactory2Cl m۱۰۲۴۱d() {
        return this.f۱۰۲۲۴d;
    }
}
