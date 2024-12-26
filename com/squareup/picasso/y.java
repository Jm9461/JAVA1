package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.t;
import f.s;

public abstract class y {
    public abstract a a(w wVar, int i);

    public abstract boolean a(w wVar);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final t.e f۳۶۴۷a;

        /* renamed from: b  reason: collision with root package name */
        private final Bitmap f۳۶۴۸b;

        /* renamed from: c  reason: collision with root package name */
        private final s f۳۶۴۹c;

        /* renamed from: d  reason: collision with root package name */
        private final int f۳۶۵۰d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap, t.e loadedFrom) {
            this(bitmap, null, loadedFrom, 0);
            d0.a(bitmap, "bitmap == null");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(s source, t.e loadedFrom) {
            this(null, source, loadedFrom, 0);
            d0.a(source, "source == null");
        }

        a(Bitmap bitmap, s source, t.e loadedFrom, int exifOrientation) {
            if ((bitmap != null) != (source == null ? false : true)) {
                this.f۳۶۴۸b = bitmap;
                this.f۳۶۴۹c = source;
                d0.a(loadedFrom, "loadedFrom == null");
                this.f۳۶۴۷a = loadedFrom;
                this.f۳۶۵۰d = exifOrientation;
                return;
            }
            throw new AssertionError();
        }

        public Bitmap a() {
            return this.f۳۶۴۸b;
        }

        public s d() {
            return this.f۳۶۴۹c;
        }

        public t.e c() {
            return this.f۳۶۴۷a;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f۳۶۵۰d;
        }
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean a(boolean airplaneMode, NetworkInfo info2) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return false;
    }

    static BitmapFactory.Options b(w data) {
        boolean justBounds = data.c();
        boolean hasConfig = data.s != null;
        BitmapFactory.Options options = null;
        if (justBounds || hasConfig || data.r) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = justBounds;
            boolean z = data.r;
            options.inInputShareable = z;
            options.inPurgeable = z;
            if (hasConfig) {
                options.inPreferredConfig = data.s;
            }
        }
        return options;
    }

    static boolean a(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    static void a(int reqWidth, int reqHeight, BitmapFactory.Options options, w request) {
        a(reqWidth, reqHeight, options.outWidth, options.outHeight, options, request);
    }

    static void a(int reqWidth, int reqHeight, int width, int height, BitmapFactory.Options options, w request) {
        int i;
        int sampleSize = 1;
        if (height > reqHeight || width > reqWidth) {
            if (reqHeight == 0) {
                sampleSize = (int) Math.floor((double) (((float) width) / ((float) reqWidth)));
            } else if (reqWidth == 0) {
                sampleSize = (int) Math.floor((double) (((float) height) / ((float) reqHeight)));
            } else {
                int heightRatio = (int) Math.floor((double) (((float) height) / ((float) reqHeight)));
                int widthRatio = (int) Math.floor((double) (((float) width) / ((float) reqWidth)));
                if (request.l) {
                    i = Math.max(heightRatio, widthRatio);
                } else {
                    i = Math.min(heightRatio, widthRatio);
                }
                sampleSize = i;
            }
        }
        options.inSampleSize = sampleSize;
        options.inJustDecodeBounds = false;
    }
}
