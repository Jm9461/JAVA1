package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Ct;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.a  reason: invalid class name */
public abstract class AbstractCa<T> {

    /* renamed from: a  reason: contains not printable characters */
    final Ct f۱۵۳۴۶a;

    /* renamed from: b  reason: contains not printable characters */
    final Cw f۱۵۳۴۷b;

    /* renamed from: c  reason: contains not printable characters */
    final WeakReference<T> f۱۵۳۴۸c;

    /* renamed from: d  reason: contains not printable characters */
    final boolean f۱۵۳۴۹d;

    /* renamed from: e  reason: contains not printable characters */
    final int f۱۵۳۵۰e;

    /* renamed from: f  reason: contains not printable characters */
    final int f۱۵۳۵۱f;

    /* renamed from: g  reason: contains not printable characters */
    final int f۱۵۳۵۲g;

    /* renamed from: h  reason: contains not printable characters */
    final Drawable f۱۵۳۵۳h;

    /* renamed from: i  reason: contains not printable characters */
    final String f۱۵۳۵۴i;

    /* renamed from: j  reason: contains not printable characters */
    final Object f۱۵۳۵۵j;

    /* renamed from: k  reason: contains not printable characters */
    boolean f۱۵۳۵۶k;

    /* renamed from: l  reason: contains not printable characters */
    boolean f۱۵۳۵۷l;

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۸۲۴۴a(Bitmap bitmap, Ct.EnumCe eVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۸۲۴۵a(Exception exc);

    /* renamed from: com.squareup.picasso.a$a  reason: invalid class name */
    static class Ca<M> extends WeakReference<M> {

        /* renamed from: a  reason: contains not printable characters */
        final AbstractCa f۱۵۳۵۸a;

        Ca(AbstractCa action, M referent, ReferenceQueue<? super M> q) {
            super(referent, q);
            this.f۱۵۳۵۸a = action;
        }
    }

    AbstractCa(Ct picasso, T target, Cw request, int memoryPolicy, int networkPolicy, int errorResId, Drawable errorDrawable, String key, Object tag, boolean noFade) {
        this.f۱۵۳۴۶a = picasso;
        this.f۱۵۳۴۷b = request;
        this.f۱۵۳۴۸c = target == null ? null : new Ca(this, target, picasso.f۱۵۴۹۴k);
        this.f۱۵۳۵۰e = memoryPolicy;
        this.f۱۵۳۵۱f = networkPolicy;
        this.f۱۵۳۴۹d = noFade;
        this.f۱۵۳۵۲g = errorResId;
        this.f۱۵۳۵۳h = errorDrawable;
        this.f۱۵۳۵۴i = key;
        this.f۱۵۳۵۵j = tag != null ? tag : this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۲۴۳a() {
        this.f۱۵۳۵۷l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public Cw m۱۸۲۵۱g() {
        return this.f۱۵۳۴۷b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public T m۱۸۲۵۳i() {
        WeakReference<T> weakReference = this.f۱۵۳۴۸c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public String m۱۸۲۴۶b() {
        return this.f۱۵۳۵۴i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j  reason: contains not printable characters */
    public boolean m۱۸۲۵۴j() {
        return this.f۱۵۳۵۷l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k  reason: contains not printable characters */
    public boolean m۱۸۲۵۵k() {
        return this.f۱۵۳۵۶k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۸۲۴۷c() {
        return this.f۱۵۳۵۰e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public int m۱۸۲۴۸d() {
        return this.f۱۵۳۵۱f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public Ct m۱۸۲۴۹e() {
        return this.f۱۵۳۴۶a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public Ct.EnumCf m۱۸۲۵۰f() {
        return this.f۱۵۳۴۷b.f۱۵۵۵۱t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public Object m۱۸۲۵۲h() {
        return this.f۱۵۳۵۵j;
    }
}
