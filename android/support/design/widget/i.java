package android.support.design.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;

class i extends GradientDrawable {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f۹۴۹a = new Paint(1);

    /* renamed from: b  reason: collision with root package name */
    private final RectF f۹۵۰b;

    /* renamed from: c  reason: collision with root package name */
    private int f۹۵۱c;

    i() {
        c();
        this.f۹۵۰b = new RectF();
    }

    private void c() {
        this.f۹۴۹a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f۹۴۹a.setColor(-1);
        this.f۹۴۹a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return !this.f۹۵۰b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void a(float left, float top, float right, float bottom) {
        RectF rectF = this.f۹۵۰b;
        if (left != rectF.left || top != rectF.top || right != rectF.right || bottom != rectF.bottom) {
            this.f۹۵۰b.set(left, top, right, bottom);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(RectF bounds) {
        a(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void draw(Canvas canvas) {
        b(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f۹۵۰b, this.f۹۴۹a);
        a(canvas);
    }

    private void b(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (a(callback)) {
            ((View) callback).setLayerType(2, null);
        } else {
            c(canvas);
        }
    }

    private void c(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f۹۵۱c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        } else {
            this.f۹۵۱c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
        }
    }

    private void a(Canvas canvas) {
        if (!a(getCallback())) {
            canvas.restoreToCount(this.f۹۵۱c);
        }
    }

    private boolean a(Drawable.Callback callback) {
        return callback instanceof View;
    }
}
