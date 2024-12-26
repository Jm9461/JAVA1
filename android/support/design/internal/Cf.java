package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.AbstractCp;
import android.support.p۰۴۳v4.view.Cc0;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cj;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck;

/* renamed from: android.support.design.internal.f  reason: invalid class name */
public class Cf extends FrameLayout {

    /* renamed from: c  reason: contains not printable characters */
    Drawable f۹۵۱۲c;

    /* renamed from: d  reason: contains not printable characters */
    Rect f۹۵۱۳d;

    /* renamed from: e  reason: contains not printable characters */
    private Rect f۹۵۱۴e;

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۳۵۱a(Cc0 c0Var) {
        throw null;
    }

    public Cf(Context context) {
        this(context, null);
    }

    public Cf(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Cf(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۹۵۱۴e = new Rect();
        TypedArray a = Cg.m۱۱۳۶۰c(context, attrs, Ck.ScrimInsetsFrameLayout, defStyleAttr, Cj.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f۹۵۱۲c = a.getDrawable(Ck.ScrimInsetsFrameLayout_insetForeground);
        a.recycle();
        setWillNotDraw(true);
        Cu.m۱۲۹۸۷a(this, new Ca());
    }

    /* renamed from: android.support.design.internal.f$a  reason: invalid class name */
    class Ca implements AbstractCp {
        Ca() {
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCp
        /* renamed from: a  reason: contains not printable characters */
        public Cc0 m۱۱۳۵۲a(View v, Cc0 insets) {
            Cf fVar = Cf.this;
            if (fVar.f۹۵۱۳d == null) {
                fVar.f۹۵۱۳d = new Rect();
            }
            Cf.this.f۹۵۱۳d.set(insets.m۱۲۸۲۰c(), insets.m۱۲۸۲۲e(), insets.m۱۲۸۲۱d(), insets.m۱۲۸۱۹b());
            Cf.this.m۱۱۳۵۱a(insets);
            Cf.this.setWillNotDraw(!insets.m۱۲۸۲۳f() || Cf.this.f۹۵۱۲c == null);
            Cu.m۱۲۹۷۰B(Cf.this);
            return insets.m۱۲۸۱۷a();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f۹۵۱۳d != null && this.f۹۵۱۲c != null) {
            int sc = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f۹۵۱۴e.set(0, 0, width, this.f۹۵۱۳d.top);
            this.f۹۵۱۲c.setBounds(this.f۹۵۱۴e);
            this.f۹۵۱۲c.draw(canvas);
            this.f۹۵۱۴e.set(0, height - this.f۹۵۱۳d.bottom, width, height);
            this.f۹۵۱۲c.setBounds(this.f۹۵۱۴e);
            this.f۹۵۱۲c.draw(canvas);
            Rect rect = this.f۹۵۱۴e;
            Rect rect2 = this.f۹۵۱۳d;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f۹۵۱۲c.setBounds(this.f۹۵۱۴e);
            this.f۹۵۱۲c.draw(canvas);
            Rect rect3 = this.f۹۵۱۴e;
            Rect rect4 = this.f۹۵۱۳d;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f۹۵۱۲c.setBounds(this.f۹۵۱۴e);
            this.f۹۵۱۲c.draw(canvas);
            canvas.restoreToCount(sc);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f۹۵۱۲c;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f۹۵۱۲c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }
}
