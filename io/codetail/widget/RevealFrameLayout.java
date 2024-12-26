package io.codetail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import d.a.a.a;

public class RevealFrameLayout extends FrameLayout implements a {

    /* renamed from: c  reason: collision with root package name */
    private Path f۴۲۶۴c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f۴۲۶۵d;

    /* renamed from: e  reason: collision with root package name */
    private a.d f۴۲۶۶e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f۴۲۶۷f;

    /* renamed from: g  reason: collision with root package name */
    private float f۴۲۶۸g;

    public RevealFrameLayout(Context context) {
        this(context, null);
    }

    public RevealFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RevealFrameLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f۴۲۶۵d = new Rect();
        this.f۴۲۶۴c = new Path();
    }

    @Override // d.a.a.a
    public void b() {
        this.f۴۲۶۷f = true;
    }

    @Override // d.a.a.a
    public void a() {
        this.f۴۲۶۷f = false;
        invalidate(this.f۴۲۶۵d);
    }

    @Override // d.a.a.a
    public void setRevealRadius(float radius) {
        this.f۴۲۶۸g = radius;
        invalidate(this.f۴۲۶۵d);
    }

    @Override // d.a.a.a
    public float getRevealRadius() {
        return this.f۴۲۶۸g;
    }

    @Override // d.a.a.a
    public void a(a.d info2) {
        info2.a().getHitRect(this.f۴۲۶۵d);
        this.f۴۲۶۶e = info2;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        if (!this.f۴۲۶۷f || child != this.f۴۲۶۶e.a()) {
            return super.drawChild(canvas, child, drawingTime);
        }
        int state = canvas.save();
        this.f۴۲۶۴c.reset();
        Path path = this.f۴۲۶۴c;
        a.d dVar = this.f۴۲۶۶e;
        path.addCircle((float) dVar.f۳۶۵۶a, (float) dVar.f۳۶۵۷b, this.f۴۲۶۸g, Path.Direction.CW);
        canvas.clipPath(this.f۴۲۶۴c);
        boolean isInvalided = super.drawChild(canvas, child, drawingTime);
        canvas.restoreToCount(state);
        return isInvalided;
    }
}
