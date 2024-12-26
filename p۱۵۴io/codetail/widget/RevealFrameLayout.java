package p۱۵۴io.codetail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCa;

/* renamed from: io.codetail.widget.RevealFrameLayout */
public class RevealFrameLayout extends FrameLayout implements AbstractCa {

    /* renamed from: c  reason: contains not printable characters */
    private Path f۱۶۳۶۵c;

    /* renamed from: d  reason: contains not printable characters */
    private final Rect f۱۶۳۶۶d;

    /* renamed from: e  reason: contains not printable characters */
    private AbstractCa.Cd f۱۶۳۶۷e;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۱۶۳۶۸f;

    /* renamed from: g  reason: contains not printable characters */
    private float f۱۶۳۶۹g;

    public RevealFrameLayout(Context context) {
        this(context, null);
    }

    public RevealFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RevealFrameLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f۱۶۳۶۶d = new Rect();
        this.f۱۶۳۶۵c = new Path();
    }

    @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۹۶۶۳b() {
        this.f۱۶۳۶۸f = true;
    }

    @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۶۶۱a() {
        this.f۱۶۳۶۸f = false;
        invalidate(this.f۱۶۳۶۶d);
    }

    @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCa
    public void setRevealRadius(float radius) {
        this.f۱۶۳۶۹g = radius;
        invalidate(this.f۱۶۳۶۶d);
    }

    @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCa
    public float getRevealRadius() {
        return this.f۱۶۳۶۹g;
    }

    @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۶۶۲a(AbstractCa.Cd info2) {
        info2.m۱۸۴۶۳a().getHitRect(this.f۱۶۳۶۶d);
        this.f۱۶۳۶۷e = info2;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        if (!this.f۱۶۳۶۸f || child != this.f۱۶۳۶۷e.m۱۸۴۶۳a()) {
            return super.drawChild(canvas, child, drawingTime);
        }
        int state = canvas.save();
        this.f۱۶۳۶۵c.reset();
        Path path = this.f۱۶۳۶۵c;
        AbstractCa.Cd dVar = this.f۱۶۳۶۷e;
        path.addCircle((float) dVar.f۱۵۵۹۱a, (float) dVar.f۱۵۵۹۲b, this.f۱۶۳۶۹g, Path.Direction.CW);
        canvas.clipPath(this.f۱۶۳۶۵c);
        boolean isInvalided = super.drawChild(canvas, child, drawingTime);
        canvas.restoreToCount(state);
        return isInvalided;
    }
}
