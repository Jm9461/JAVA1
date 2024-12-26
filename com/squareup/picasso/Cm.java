package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: com.squareup.picasso.m  reason: invalid class name */
public final class Cm implements AbstractCd {

    /* renamed from: a  reason: contains not printable characters */
    final LruCache<String, Cb> f۱۵۴۵۰a;

    public Cm(Context context) {
        this(Cd0.m۱۸۳۰۹a(context));
    }

    /* renamed from: com.squareup.picasso.m$a  reason: invalid class name */
    class Ca extends LruCache<String, Cb> {
        Ca(Cm this$0, int x0) {
            super(x0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a  reason: contains not printable characters */
        public int sizeOf(String key, Cb value) {
            return value.f۱۵۴۵۲b;
        }
    }

    public Cm(int maxByteCount) {
        this.f۱۵۴۵۰a = new Ca(this, maxByteCount);
    }

    @Override // com.squareup.picasso.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public Bitmap m۱۸۳۷۰a(String key) {
        Cb bitmapAndSize = this.f۱۵۴۵۰a.get(key);
        if (bitmapAndSize != null) {
            return bitmapAndSize.f۱۵۴۵۱a;
        }
        return null;
    }

    @Override // com.squareup.picasso.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۷۱a(String key, Bitmap bitmap) {
        if (key == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int byteCount = Cd0.m۱۸۳۱۱a(bitmap);
        if (byteCount > m۱۸۳۶۹a()) {
            this.f۱۵۴۵۰a.remove(key);
        } else {
            this.f۱۵۴۵۰a.put(key, new Cb(bitmap, byteCount));
        }
    }

    @Override // com.squareup.picasso.AbstractCd
    public int size() {
        return this.f۱۵۴۵۰a.size();
    }

    @Override // com.squareup.picasso.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۸۳۶۹a() {
        return this.f۱۵۴۵۰a.maxSize();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.m$b  reason: invalid class name */
    public static final class Cb {

        /* renamed from: a  reason: contains not printable characters */
        final Bitmap f۱۵۴۵۱a;

        /* renamed from: b  reason: contains not printable characters */
        final int f۱۵۴۵۲b;

        Cb(Bitmap bitmap, int byteCount) {
            this.f۱۵۴۵۱a = bitmap;
            this.f۱۵۴۵۲b = byteCount;
        }
    }
}
