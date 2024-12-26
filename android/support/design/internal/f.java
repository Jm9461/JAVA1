package android.support.design.internal;

import a.b.c.j;
import a.b.c.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.c0;
import android.support.v4.view.p;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class f extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    Drawable f۷۴۹c;

    /* renamed from: d  reason: collision with root package name */
    Rect f۷۵۰d;

    /* renamed from: e  reason: collision with root package name */
    private Rect f۷۵۱e;

    /* access modifiers changed from: protected */
    public void a(c0 c0Var) {
        throw null;
    }

    public f(Context context) {
        this(context, null);
    }

    public f(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public f(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۷۵۱e = new Rect();
        TypedArray a2 = g.c(context, attrs, k.ScrimInsetsFrameLayout, defStyleAttr, j.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f۷۴۹c = a2.getDrawable(k.ScrimInsetsFrameLayout_insetForeground);
        a2.recycle();
        setWillNotDraw(true);
        u.a(this, new a());
    }

    class a implements p {
        a() {
        }

        @Override // android.support.v4.view.p
        public c0 a(View v, c0 insets) {
            f fVar = f.this;
            if (fVar.f۷۵۰d == null) {
                fVar.f۷۵۰d = new Rect();
            }
            f.this.f۷۵۰d.set(insets.c(), insets.e(), insets.d(), insets.b());
            f.this.a(insets);
            f.this.setWillNotDraw(!insets.f() || f.this.f۷۴۹c == null);
            u.B(f.this);
            return insets.a();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f۷۵۰d != null && this.f۷۴۹c != null) {
            int sc = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f۷۵۱e.set(0, 0, width, this.f۷۵۰d.top);
            this.f۷۴۹c.setBounds(this.f۷۵۱e);
            this.f۷۴۹c.draw(canvas);
            this.f۷۵۱e.set(0, height - this.f۷۵۰d.bottom, width, height);
            this.f۷۴۹c.setBounds(this.f۷۵۱e);
            this.f۷۴۹c.draw(canvas);
            Rect rect = this.f۷۵۱e;
            Rect rect2 = this.f۷۵۰d;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f۷۴۹c.setBounds(this.f۷۵۱e);
            this.f۷۴۹c.draw(canvas);
            Rect rect3 = this.f۷۵۱e;
            Rect rect4 = this.f۷۵۰d;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f۷۴۹c.setBounds(this.f۷۵۱e);
            this.f۷۴۹c.draw(canvas);
            canvas.restoreToCount(sc);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f۷۴۹c;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f۷۴۹c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }
}
