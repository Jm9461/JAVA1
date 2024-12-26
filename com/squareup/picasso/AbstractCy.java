package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Ct;
import p۱۴۹f.AbstractCs;

/* renamed from: com.squareup.picasso.y  reason: invalid class name */
public abstract class AbstractCy {
    /* renamed from: a  reason: contains not printable characters */
    public abstract Ca m۱۸۴۴۵a(Cw wVar, int i);

    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۸۴۴۶a(Cw wVar);

    /* renamed from: com.squareup.picasso.y$a  reason: invalid class name */
    public static final class Ca {

        /* renamed from: a  reason: contains not printable characters */
        private final Ct.EnumCe f۱۵۵۸۲a;

        /* renamed from: b  reason: contains not printable characters */
        private final Bitmap f۱۵۵۸۳b;

        /* renamed from: c  reason: contains not printable characters */
        private final AbstractCs f۱۵۵۸۴c;

        /* renamed from: d  reason: contains not printable characters */
        private final int f۱۵۵۸۵d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Ca(Bitmap bitmap, Ct.EnumCe loadedFrom) {
            this(bitmap, null, loadedFrom, 0);
            Cd0.m۱۸۳۱۵a(bitmap, "bitmap == null");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Ca(AbstractCs source, Ct.EnumCe loadedFrom) {
            this(null, source, loadedFrom, 0);
            Cd0.m۱۸۳۱۵a(source, "source == null");
        }

        Ca(Bitmap bitmap, AbstractCs source, Ct.EnumCe loadedFrom, int exifOrientation) {
            if ((bitmap != null) != (source == null ? false : true)) {
                this.f۱۵۵۸۳b = bitmap;
                this.f۱۵۵۸۴c = source;
                Cd0.m۱۸۳۱۵a(loadedFrom, "loadedFrom == null");
                this.f۱۵۵۸۲a = loadedFrom;
                this.f۱۵۵۸۵d = exifOrientation;
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a  reason: contains not printable characters */
        public Bitmap m۱۸۴۴۹a() {
            return this.f۱۵۵۸۳b;
        }

        /* renamed from: d  reason: contains not printable characters */
        public AbstractCs m۱۸۴۵۲d() {
            return this.f۱۵۵۸۴c;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Ct.EnumCe m۱۸۴۵۱c() {
            return this.f۱۵۵۸۲a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۸۴۵۰b() {
            return this.f۱۵۵۸۵d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۸۴۴۴a() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۴۴۷a(boolean airplaneMode, NetworkInfo info2) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۸۴۴۸b() {
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    static BitmapFactory.Options m۱۸۴۴۳b(Cw data) {
        boolean justBounds = data.m۱۸۴۲۱c();
        boolean hasConfig = data.f۱۵۵۵۰s != null;
        BitmapFactory.Options options = null;
        if (justBounds || hasConfig || data.f۱۵۵۴۹r) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = justBounds;
            boolean z = data.f۱۵۵۴۹r;
            options.inInputShareable = z;
            options.inPurgeable = z;
            if (hasConfig) {
                options.inPreferredConfig = data.f۱۵۵۵۰s;
            }
        }
        return options;
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۸۴۴۲a(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۸۴۴۱a(int reqWidth, int reqHeight, BitmapFactory.Options options, Cw request) {
        m۱۸۴۴۰a(reqWidth, reqHeight, options.outWidth, options.outHeight, options, request);
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۸۴۴۰a(int reqWidth, int reqHeight, int width, int height, BitmapFactory.Options options, Cw request) {
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
                if (request.f۱۵۵۴۳l) {
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
