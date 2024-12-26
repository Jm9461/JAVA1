package com.squareup.picasso;

import android.graphics.Bitmap;

/* renamed from: com.squareup.picasso.d  reason: invalid class name */
public interface AbstractCd {
    /* renamed from: a  reason: contains not printable characters */
    int m۱۸۳۰۳a();

    /* renamed from: a  reason: contains not printable characters */
    Bitmap m۱۸۳۰۴a(String str);

    /* renamed from: a  reason: contains not printable characters */
    void m۱۸۳۰۵a(String str, Bitmap bitmap);

    int size();

    /* renamed from: com.squareup.picasso.d$a  reason: invalid class name */
    static class Ca implements AbstractCd {
        Ca() {
        }

        @Override // com.squareup.picasso.AbstractCd
        /* renamed from: a  reason: contains not printable characters */
        public Bitmap m۱۸۳۰۷a(String key) {
            return null;
        }

        @Override // com.squareup.picasso.AbstractCd
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۳۰۸a(String key, Bitmap bitmap) {
        }

        @Override // com.squareup.picasso.AbstractCd
        public int size() {
            return 0;
        }

        @Override // com.squareup.picasso.AbstractCd
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۸۳۰۶a() {
            return 0;
        }
    }

    static {
        new Ca();
    }
}
