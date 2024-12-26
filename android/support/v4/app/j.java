package android.support.v4.app;

import a.b.g.g.m;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class j<E> extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f۱۱۰۰a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f۱۱۰۱b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f۱۱۰۲c;

    /* renamed from: d  reason: collision with root package name */
    final l f۱۱۰۳d;

    /* access modifiers changed from: package-private */
    public abstract void a(f fVar);

    public abstract void a(f fVar, Intent intent, int i, Bundle bundle);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract boolean b(f fVar);

    public abstract LayoutInflater f();

    public abstract int g();

    public abstract boolean h();

    public abstract void i();

    j(g activity) {
        this(activity, activity, activity.f۱۰۹۰d, 0);
    }

    j(Activity activity, Context context, Handler handler, int windowAnimations) {
        this.f۱۱۰۳d = new l();
        this.f۱۱۰۰a = activity;
        m.a(context, "context == null");
        this.f۱۱۰۱b = context;
        m.a(handler, "handler == null");
        this.f۱۱۰۲c = handler;
    }

    /* access modifiers changed from: package-private */
    public Activity b() {
        return this.f۱۱۰۰a;
    }

    /* access modifiers changed from: package-private */
    public Context c() {
        return this.f۱۱۰۱b;
    }

    /* access modifiers changed from: package-private */
    public Handler e() {
        return this.f۱۱۰۲c;
    }

    /* access modifiers changed from: package-private */
    public l d() {
        return this.f۱۱۰۳d;
    }
}
