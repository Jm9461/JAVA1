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
import com.squareup.picasso.t;

/* access modifiers changed from: package-private */
public final class u extends BitmapDrawable {

    /* renamed from: h  reason: collision with root package name */
    private static final Paint f۳۶۱۴h = new Paint();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f۳۶۱۵a;

    /* renamed from: b  reason: collision with root package name */
    private final float f۳۶۱۶b;

    /* renamed from: c  reason: collision with root package name */
    private final t.e f۳۶۱۷c;

    /* renamed from: d  reason: collision with root package name */
    Drawable f۳۶۱۸d;

    /* renamed from: e  reason: collision with root package name */
    long f۳۶۱۹e;

    /* renamed from: f  reason: collision with root package name */
    boolean f۳۶۲۰f;

    /* renamed from: g  reason: collision with root package name */
    int f۳۶۲۱g = 255;

    static void a(ImageView target, Context context, Bitmap bitmap, t.e loadedFrom, boolean noFade, boolean debugging) {
        Drawable placeholder = target.getDrawable();
        if (placeholder instanceof Animatable) {
            ((Animatable) placeholder).stop();
        }
        target.setImageDrawable(new u(context, bitmap, placeholder, loadedFrom, noFade, debugging));
    }

    static void a(ImageView target, Drawable placeholderDrawable) {
        target.setImageDrawable(placeholderDrawable);
        if (target.getDrawable() instanceof Animatable) {
            ((Animatable) target.getDrawable()).start();
        }
    }

    u(Context context, Bitmap bitmap, Drawable placeholder, t.e loadedFrom, boolean noFade, boolean debugging) {
        super(context.getResources(), bitmap);
        this.f۳۶۱۵a = debugging;
        this.f۳۶۱۶b = context.getResources().getDisplayMetrics().density;
        this.f۳۶۱۷c = loadedFrom;
        if (loadedFrom != t.e.MEMORY && !noFade) {
            this.f۳۶۱۸d = placeholder;
            this.f۳۶۲۰f = true;
            this.f۳۶۱۹e = SystemClock.uptimeMillis();
        }
    }

    public void draw(Canvas canvas) {
        if (!this.f۳۶۲۰f) {
            super.draw(canvas);
        } else {
            float normalized = ((float) (SystemClock.uptimeMillis() - this.f۳۶۱۹e)) / 200.0f;
            if (normalized >= 1.0f) {
                this.f۳۶۲۰f = false;
                this.f۳۶۱۸d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f۳۶۱۸d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f۳۶۲۱g) * normalized));
                super.draw(canvas);
                super.setAlpha(this.f۳۶۲۱g);
            }
        }
        if (this.f۳۶۱۵a) {
            a(canvas);
        }
    }

    public void setAlpha(int alpha) {
        this.f۳۶۲۱g = alpha;
        Drawable drawable = this.f۳۶۱۸d;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        }
        super.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        Drawable drawable = this.f۳۶۱۸d;
        if (drawable != null) {
            drawable.setColorFilter(cf);
        }
        super.setColorFilter(cf);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۳۶۱۸d;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
        super.onBoundsChange(bounds);
    }

    private void a(Canvas canvas) {
        f۳۶۱۴h.setColor(-1);
        canvas.drawPath(a(0, 0, (int) (this.f۳۶۱۶b * 16.0f)), f۳۶۱۴h);
        f۳۶۱۴h.setColor(this.f۳۶۱۷c.f۳۶۰۸c);
        canvas.drawPath(a(0, 0, (int) (this.f۳۶۱۶b * 15.0f)), f۳۶۱۴h);
    }

    private static Path a(int x1, int y1, int width) {
        Path path = new Path();
        path.moveTo((float) x1, (float) y1);
        path.lineTo((float) (x1 + width), (float) y1);
        path.lineTo((float) x1, (float) (y1 + width));
        return path;
    }
}
