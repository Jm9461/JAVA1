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

/* renamed from: android.support.design.widget.i  reason: invalid class name */
class Ci extends GradientDrawable {

    /* renamed from: a  reason: contains not printable characters */
    private final Paint f۹۹۲۵a = new Paint(1);

    /* renamed from: b  reason: contains not printable characters */
    private final RectF f۹۹۲۶b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۹۹۲۷c;

    Ci() {
        m۱۱۸۵۸c();
        this.f۹۹۲۶b = new RectF();
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۱۸۵۸c() {
        this.f۹۹۲۵a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f۹۹۲۵a.setColor(-1);
        this.f۹۹۲۵a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۸۶۲a() {
        return !this.f۹۹۲۶b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۶۰a(float left, float top, float right, float bottom) {
        RectF rectF = this.f۹۹۲۶b;
        if (left != rectF.left || top != rectF.top || right != rectF.right || bottom != rectF.bottom) {
            this.f۹۹۲۶b.set(left, top, right, bottom);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۶۱a(RectF bounds) {
        m۱۱۸۶۰a(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۸۶۳b() {
        m۱۱۸۶۰a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void draw(Canvas canvas) {
        m۱۱۸۵۷b(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f۹۹۲۶b, this.f۹۹۲۵a);
        m۱۱۸۵۵a(canvas);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۱۸۵۷b(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m۱۱۸۵۶a(callback)) {
            ((View) callback).setLayerType(2, null);
        } else {
            m۱۱۸۵۹c(canvas);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۱۸۵۹c(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f۹۹۲۷c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        } else {
            this.f۹۹۲۷c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۸۵۵a(Canvas canvas) {
        if (!m۱۱۸۵۶a(getCallback())) {
            canvas.restoreToCount(this.f۹۹۲۷c);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۱۸۵۶a(Drawable.Callback callback) {
        return callback instanceof View;
    }
}
