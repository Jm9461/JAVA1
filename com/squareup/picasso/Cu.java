package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.Ct;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.u  reason: invalid class name */
public final class Cu extends BitmapDrawable {

    /* renamed from: h  reason: contains not printable characters */
    private static final Paint f۱۵۵۲۲h = new Paint();

    /* renamed from: a  reason: contains not printable characters */
    private final boolean f۱۵۵۲۳a;

    /* renamed from: b  reason: contains not printable characters */
    private final float f۱۵۵۲۴b;

    /* renamed from: c  reason: contains not printable characters */
    private final Ct.EnumCe f۱۵۵۲۵c;

    /* renamed from: d  reason: contains not printable characters */
    Drawable f۱۵۵۲۶d;

    /* renamed from: e  reason: contains not printable characters */
    long f۱۵۵۲۷e;

    /* renamed from: f  reason: contains not printable characters */
    boolean f۱۵۵۲۸f;

    /* renamed from: g  reason: contains not printable characters */
    int f۱۵۵۲۹g = 255;

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۸۴۱۴a(ImageView target, Context context, Bitmap bitmap, Ct.EnumCe loadedFrom, boolean noFade, boolean debugging) {
        Drawable placeholder = target.getDrawable();
        if (placeholder instanceof Animatable) {
            ((Animatable) placeholder).stop();
        }
        target.setImageDrawable(new Cu(context, bitmap, placeholder, loadedFrom, noFade, debugging));
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۸۴۱۵a(ImageView target, Drawable placeholderDrawable) {
        target.setImageDrawable(placeholderDrawable);
        if (target.getDrawable() instanceof Animatable) {
            ((Animatable) target.getDrawable()).start();
        }
    }

    Cu(Context context, Bitmap bitmap, Drawable placeholder, Ct.EnumCe loadedFrom, boolean noFade, boolean debugging) {
        super(context.getResources(), bitmap);
        this.f۱۵۵۲۳a = debugging;
        this.f۱۵۵۲۴b = context.getResources().getDisplayMetrics().density;
        this.f۱۵۵۲۵c = loadedFrom;
        if (loadedFrom != Ct.EnumCe.MEMORY && !noFade) {
            this.f۱۵۵۲۶d = placeholder;
            this.f۱۵۵۲۸f = true;
            this.f۱۵۵۲۷e = SystemClock.uptimeMillis();
        }
    }

    public void draw(Canvas canvas) {
        if (!this.f۱۵۵۲۸f) {
            super.draw(canvas);
        } else {
            float normalized = ((float) (SystemClock.uptimeMillis() - this.f۱۵۵۲۷e)) / 200.0f;
            if (normalized >= 1.0f) {
                this.f۱۵۵۲۸f = false;
                this.f۱۵۵۲۶d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f۱۵۵۲۶d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f۱۵۵۲۹g) * normalized));
                super.draw(canvas);
                super.setAlpha(this.f۱۵۵۲۹g);
            }
        }
        if (this.f۱۵۵۲۳a) {
            m۱۸۴۱۳a(canvas);
        }
    }

    public void setAlpha(int alpha) {
        this.f۱۵۵۲۹g = alpha;
        Drawable drawable = this.f۱۵۵۲۶d;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        }
        super.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        Drawable drawable = this.f۱۵۵۲۶d;
        if (drawable != null) {
            drawable.setColorFilter(cf);
        }
        super.setColorFilter(cf);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۱۵۵۲۶d;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
        super.onBoundsChange(bounds);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۴۱۳a(Canvas canvas) {
        f۱۵۵۲۲h.setColor(-1);
        canvas.drawPath(m۱۸۴۱۲a(0, 0, (int) (this.f۱۵۵۲۴b * 16.0f)), f۱۵۵۲۲h);
        f۱۵۵۲۲h.setColor(this.f۱۵۵۲۵c.f۱۵۵۱۶c);
        canvas.drawPath(m۱۸۴۱۲a(0, 0, (int) (this.f۱۵۵۲۴b * 15.0f)), f۱۵۵۲۲h);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Path m۱۸۴۱۲a(int x1, int y1, int width) {
        Path path = new Path();
        path.moveTo((float) x1, (float) y1);
        path.lineTo((float) (x1 + width), (float) y1);
        path.lineTo((float) x1, (float) (y1 + width));
        return path;
    }
}
