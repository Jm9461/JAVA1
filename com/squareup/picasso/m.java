package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

public final class m implements d {

    /* renamed from: a  reason: collision with root package name */
    final LruCache<String, b> f۳۵۵۵a;

    public m(Context context) {
        this(d0.a(context));
    }

    class a extends LruCache<String, b> {
        a(m this$0, int x0) {
            super(x0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(String key, b value) {
            return value.f۳۵۵۷b;
        }
    }

    public m(int maxByteCount) {
        this.f۳۵۵۵a = new a(this, maxByteCount);
    }

    @Override // com.squareup.picasso.d
    public Bitmap a(String key) {
        b bitmapAndSize = this.f۳۵۵۵a.get(key);
        if (bitmapAndSize != null) {
            return bitmapAndSize.f۳۵۵۶a;
        }
        return null;
    }

    @Override // com.squareup.picasso.d
    public void a(String key, Bitmap bitmap) {
        if (key == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int byteCount = d0.a(bitmap);
        if (byteCount > a()) {
            this.f۳۵۵۵a.remove(key);
        } else {
            this.f۳۵۵۵a.put(key, new b(bitmap, byteCount));
        }
    }

    @Override // com.squareup.picasso.d
    public int size() {
        return this.f۳۵۵۵a.size();
    }

    @Override // com.squareup.picasso.d
    public int a() {
        return this.f۳۵۵۵a.maxSize();
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final Bitmap f۳۵۵۶a;

        /* renamed from: b  reason: collision with root package name */
        final int f۳۵۵۷b;

        b(Bitmap bitmap, int byteCount) {
            this.f۳۵۵۶a = bitmap;
            this.f۳۵۵۷b = byteCount;
        }
    }
}
