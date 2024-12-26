package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    final t f۳۴۹۳a;

    /* renamed from: b  reason: collision with root package name */
    final w f۳۴۹۴b;

    /* renamed from: c  reason: collision with root package name */
    final WeakReference<T> f۳۴۹۵c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f۳۴۹۶d;

    /* renamed from: e  reason: collision with root package name */
    final int f۳۴۹۷e;

    /* renamed from: f  reason: collision with root package name */
    final int f۳۴۹۸f;

    /* renamed from: g  reason: collision with root package name */
    final int f۳۴۹۹g;

    /* renamed from: h  reason: collision with root package name */
    final Drawable f۳۵۰۰h;
    final String i;
    final Object j;
    boolean k;
    boolean l;

    /* access modifiers changed from: package-private */
    public abstract void a(Bitmap bitmap, t.e eVar);

    /* access modifiers changed from: package-private */
    public abstract void a(Exception exc);

    /* renamed from: com.squareup.picasso.a$a  reason: collision with other inner class name */
    static class C۰۱۱۱a<M> extends WeakReference<M> {

        /* renamed from: a  reason: collision with root package name */
        final a f۳۵۰۱a;

        C۰۱۱۱a(a action, M referent, ReferenceQueue<? super M> q) {
            super(referent, q);
            this.f۳۵۰۱a = action;
        }
    }

    a(t picasso, T target, w request, int memoryPolicy, int networkPolicy, int errorResId, Drawable errorDrawable, String key, Object tag, boolean noFade) {
        this.f۳۴۹۳a = picasso;
        this.f۳۴۹۴b = request;
        this.f۳۴۹۵c = target == null ? null : new C۰۱۱۱a(this, target, picasso.k);
        this.f۳۴۹۷e = memoryPolicy;
        this.f۳۴۹۸f = networkPolicy;
        this.f۳۴۹۶d = noFade;
        this.f۳۴۹۹g = errorResId;
        this.f۳۵۰۰h = errorDrawable;
        this.i = key;
        this.j = tag != null ? tag : this;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.l = true;
    }

    /* access modifiers changed from: package-private */
    public w g() {
        return this.f۳۴۹۴b;
    }

    /* access modifiers changed from: package-private */
    public T i() {
        WeakReference<T> weakReference = this.f۳۴۹۵c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f۳۴۹۷e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f۳۴۹۸f;
    }

    /* access modifiers changed from: package-private */
    public t e() {
        return this.f۳۴۹۳a;
    }

    /* access modifiers changed from: package-private */
    public t.f f() {
        return this.f۳۴۹۴b.t;
    }

    /* access modifiers changed from: package-private */
    public Object h() {
        return this.j;
    }
}
