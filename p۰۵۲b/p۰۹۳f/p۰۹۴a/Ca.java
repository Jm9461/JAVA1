package p۰۵۲b.p۰۹۳f.p۰۹۴a;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.support.p۰۴۳v4.view.Cu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.text.ParseException;
import p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۵d.AbstractCa;
import p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۵d.Cb;
import p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۸g.Ca;

/* renamed from: b.f.a.a  reason: invalid class name */
public class Ca extends View {

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۲۸۱۵c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۲۸۱۶d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۲۸۱۷e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۲۸۱۸f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۲۸۱۹g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۲۸۲۰h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۲۸۲۱i;

    /* renamed from: j  reason: contains not printable characters */
    private AbstractCa f۱۲۸۲۲j;

    /* renamed from: k  reason: contains not printable characters */
    private String f۱۲۸۲۳k;

    /* renamed from: l  reason: contains not printable characters */
    private Cc f۱۲۸۲۴l;

    /* renamed from: m  reason: contains not printable characters */
    private Paint f۱۲۸۲۵m;

    /* renamed from: n  reason: contains not printable characters */
    private Paint f۱۲۸۲۶n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۲۸۲۷o;

    /* renamed from: p  reason: contains not printable characters */
    private long f۱۲۸۲۸p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۲۸۲۹q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۲۸۳۰r;

    /* renamed from: s  reason: contains not printable characters */
    private Interpolator f۱۲۸۳۱s;

    /* renamed from: t  reason: contains not printable characters */
    private p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۷f.AbstractCa f۱۲۸۳۲t;

    Ca(ViewGroup parent, ViewGroup.LayoutParams params, int strokeColor, int fillColor, int strokeWidth, int originalWidth, int originalHeight, int strokeDrawingDuration, int fillDuration, AbstractCa transform, String svgPath) {
        super(parent.getContext());
        this.f۱۲۸۱۵c = strokeColor;
        this.f۱۲۸۱۶d = fillColor;
        this.f۱۲۸۱۷e = strokeWidth;
        this.f۱۲۸۲۰h = strokeDrawingDuration;
        this.f۱۲۸۲۱i = fillDuration;
        this.f۱۲۸۲۲j = transform;
        this.f۱۲۸۱۸f = originalWidth;
        this.f۱۲۸۱۹g = originalHeight;
        this.f۱۲۸۲۳k = svgPath;
        m۱۶۱۴۹g();
        parent.addView(this, params);
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۶۱۴۹g() {
        this.f۱۲۸۲۷o = 0;
        m۱۶۱۵۰h();
        m۱۶۱۵۱i();
        this.f۱۲۸۳۱s = new DecelerateInterpolator();
        setLayerType(1, null);
    }

    /* renamed from: h  reason: contains not printable characters */
    private void m۱۶۱۵۰h() {
        this.f۱۲۸۲۵m = new Paint();
        this.f۱۲۸۲۵m.setStyle(Paint.Style.STROKE);
        this.f۱۲۸۲۵m.setAntiAlias(true);
        this.f۱۲۸۲۵m.setStrokeWidth((float) this.f۱۲۸۱۷e);
        this.f۱۲۸۲۵m.setColor(this.f۱۲۸۱۵c);
    }

    /* renamed from: i  reason: contains not printable characters */
    private void m۱۶۱۵۱i() {
        this.f۱۲۸۲۶n = new Paint();
        this.f۱۲۸۲۶n.setAntiAlias(true);
        this.f۱۲۸۲۶n.setStyle(Paint.Style.FILL);
        this.f۱۲۸۲۶n.setColor(this.f۱۲۸۱۶d);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۱۵۴b() {
        m۱۶۱۴۸f();
        this.f۱۲۸۲۸p = System.currentTimeMillis();
        m۱۶۱۴۳a(1);
        Cu.m۱۲۹۷۰B(this);
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۶۱۴۸f() {
        m۱۶۱۴۶d();
        m۱۶۱۴۷e();
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۶۱۴۶d() {
        if (this.f۱۲۸۱۸f <= 0 || this.f۱۲۸۱۹g <= 0) {
            throw new IllegalArgumentException("You must provide the original image dimensions in order map the coordinates properly.");
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۶۱۴۷e() {
        if (this.f۱۲۸۲۴l == null) {
            throw new IllegalArgumentException("You must provide a not empty path in order to draw the view properly.");
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.f۱۲۸۲۹q = w;
        this.f۱۲۸۳۰r = h;
        m۱۶۱۴۵c();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (m۱۶۱۵۲a()) {
            long elapsedTime = System.currentTimeMillis() - this.f۱۲۸۲۸p;
            this.f۱۲۸۲۵m.setPathEffect(m۱۶۱۴۲a(this.f۱۲۸۳۱s.getInterpolation(p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۹h.Ca.m۱۶۱۸۴a(0.0f, 1.0f, (((float) elapsedTime) * 1.0f) / ((float) this.f۱۲۸۲۰h))) * this.f۱۲۸۲۴l.f۱۲۸۴۵b));
            canvas.drawPath(this.f۱۲۸۲۴l.f۱۲۸۴۴a, this.f۱۲۸۲۵m);
            if (m۱۶۱۵۳a(elapsedTime)) {
                if (this.f۱۲۸۲۷o < 2) {
                    m۱۶۱۴۳a(2);
                }
                this.f۱۲۸۲۲j.m۱۶۱۶۷a(canvas, p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۹h.Ca.m۱۶۱۸۴a(0.0f, 1.0f, (((float) (elapsedTime - ((long) this.f۱۲۸۲۰h))) * 1.0f) / ((float) this.f۱۲۸۲۱i)), this);
                canvas.drawPath(this.f۱۲۸۲۴l.f۱۲۸۴۴a, this.f۱۲۸۲۶n);
            }
            if (m۱۶۱۴۴b(elapsedTime)) {
                Cu.m۱۲۹۷۰B(this);
            } else {
                m۱۶۱۴۳a(3);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۶۱۵۲a() {
        return (this.f۱۲۸۲۷o == 0 || this.f۱۲۸۲۴l == null) ? false : true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private PathEffect m۱۶۱۴۲a(float distance) {
        return new DashPathEffect(new float[]{distance, this.f۱۲۸۲۴l.f۱۲۸۴۵b}, 0.0f);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۶۱۵۳a(long elapsedTime) {
        return elapsedTime > ((long) this.f۱۲۸۲۰h);
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۶۱۴۴b(long elapsedTime) {
        return elapsedTime < ((long) (this.f۱۲۸۲۰h + this.f۱۲۸۲۱i));
    }

    public void setOnStateChangeListener(p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۷f.AbstractCa onStateChangeListener) {
        this.f۱۲۸۳۲t = onStateChangeListener;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۱۴۳a(int state) {
        if (this.f۱۲۸۲۷o != state) {
            this.f۱۲۸۲۷o = state;
            p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۷f.AbstractCa aVar = this.f۱۲۸۳۲t;
            if (aVar != null) {
                aVar.m۱۶۱۶۹a(state);
            }
        }
    }

    public void setStrokeColor(int strokeColor) {
        this.f۱۲۸۱۵c = strokeColor;
    }

    public void setFillColor(int fillColor) {
        this.f۱۲۸۱۶d = fillColor;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.f۱۲۸۱۷e = strokeWidth;
    }

    public void setStrokeDrawingDuration(int duration) {
        this.f۱۲۸۲۰h = duration;
    }

    public void setFillDuration(int duration) {
        this.f۱۲۸۲۱i = duration;
    }

    public void setClippingTransform(AbstractCa transform) {
        this.f۱۲۸۲۲j = transform == null ? new Cb() : transform;
    }

    public void setSvgPath(String svgPath) {
        if (svgPath == null || svgPath.length() == 0) {
            throw new IllegalArgumentException("You must provide a not empty path in order to draw the view properly.");
        }
        this.f۱۲۸۲۳k = svgPath;
        m۱۶۱۴۵c();
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۶۱۴۵c() {
        p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۸g.Cb parser = getPathParser();
        this.f۱۲۸۲۴l = new Cc();
        try {
            this.f۱۲۸۲۴l.f۱۲۸۴۴a = parser.m۱۶۱۸۲a(this.f۱۲۸۲۳k);
        } catch (ParseException e) {
            this.f۱۲۸۲۴l.f۱۲۸۴۴a = new Path();
        }
        PathMeasure pm = new PathMeasure(this.f۱۲۸۲۴l.f۱۲۸۴۴a, true);
        do {
            Cc cVar = this.f۱۲۸۲۴l;
            cVar.f۱۲۸۴۵b = Math.max(cVar.f۱۲۸۴۵b, pm.getLength());
        } while (pm.nextContour());
    }

    private p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۸g.Cb getPathParser() {
        Ca.Cb builder = new Ca.Cb();
        builder.m۱۶۱۷۴b(this.f۱۲۸۱۸f);
        builder.m۱۶۱۷۲a(this.f۱۲۸۱۹g);
        builder.m۱۶۱۷۶d(this.f۱۲۸۲۹q);
        builder.m۱۶۱۷۵c(this.f۱۲۸۳۰r);
        return builder.m۱۶۱۷۳a();
    }
}
