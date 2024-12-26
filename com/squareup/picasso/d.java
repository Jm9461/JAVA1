package com.squareup.picasso;

import android.graphics.Bitmap;

public interface d {
    int a();

    Bitmap a(String str);

    void a(String str, Bitmap bitmap);

    int size();

    static class a implements d {
        a() {
        }

        @Override // com.squareup.picasso.d
        public Bitmap a(String key) {
            return null;
        }

        @Override // com.squareup.picasso.d
        public void a(String key, Bitmap bitmap) {
        }

        @Override // com.squareup.picasso.d
        public int size() {
            return 0;
        }

        @Override // com.squareup.picasso.d
        public int a() {
            return 0;
        }
    }

    static {
        new a();
    }
}
