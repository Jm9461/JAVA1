package p۲۰۸b.p۲۴۹f.p۲۵۰a;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.support.v4.view.Cu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.text.ParseException;
import p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۱d.Cb;
import p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۱d.InterfaceCa;
import p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۴g.Ca;

/* renamed from: b.f.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends View {

    /* renamed from: c, reason: contains not printable characters */
    private int f۱۲۸۱۵c;

    /* renamed from: d, reason: contains not printable characters */
    private int f۱۲۸۱۶d;

    /* renamed from: e, reason: contains not printable characters */
    private int f۱۲۸۱۷e;

    /* renamed from: f, reason: contains not printable characters */
    private int f۱۲۸۱۸f;

    /* renamed from: g, reason: contains not printable characters */
    private int f۱۲۸۱۹g;

    /* renamed from: h, reason: contains not printable characters */
    private int f۱۲۸۲۰h;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۲۸۲۱i;

    /* renamed from: j, reason: contains not printable characters */
    private InterfaceCa f۱۲۸۲۲j;

    /* renamed from: k, reason: contains not printable characters */
    private String f۱۲۸۲۳k;

    /* renamed from: l, reason: contains not printable characters */
    private Cc f۱۲۸۲۴l;

    /* renamed from: m, reason: contains not printable characters */
    private Paint f۱۲۸۲۵m;

    /* renamed from: n, reason: contains not printable characters */
    private Paint f۱۲۸۲۶n;

    /* renamed from: o, reason: contains not printable characters */
    private int f۱۲۸۲۷o;

    /* renamed from: p, reason: contains not printable characters */
    private long f۱۲۸۲۸p;

    /* renamed from: q, reason: contains not printable characters */
    private int f۱۲۸۲۹q;

    /* renamed from: r, reason: contains not printable characters */
    private int f۱۲۸۳۰r;

    /* renamed from: s, reason: contains not printable characters */
    private Interpolator f۱۲۸۳۱s;

    /* renamed from: t, reason: contains not printable characters */
    private p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۳f.InterfaceCa f۱۲۸۳۲t;

    Ca(ViewGroup parent, ViewGroup.LayoutParams params, int strokeColor, int fillColor, int strokeWidth, int originalWidth, int originalHeight, int strokeDrawingDuration, int fillDuration, InterfaceCa transform, String svgPath) {
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
        m۱۴۰۷۸g();
        parent.addView(this, params);
    }

    /* renamed from: g, reason: contains not printable characters */
    private void m۱۴۰۷۸g() {
        this.f۱۲۸۲۷o = 0;
        m۱۴۰۷۹h();
        m۱۴۰۸۰i();
        this.f۱۲۸۳۱s = new DecelerateInterpolator();
        setLayerType(1, null);
    }

    /* renamed from: h, reason: contains not printable characters */
    private void m۱۴۰۷۹h() {
        this.f۱۲۸۲۵m = new Paint();
        this.f۱۲۸۲۵m.setStyle(Paint.Style.STROKE);
        this.f۱۲۸۲۵m.setAntiAlias(true);
        this.f۱۲۸۲۵m.setStrokeWidth(this.f۱۲۸۱۷e);
        this.f۱۲۸۲۵m.setColor(this.f۱۲۸۱۵c);
    }

    /* renamed from: i, reason: contains not printable characters */
    private void m۱۴۰۸۰i() {
        this.f۱۲۸۲۶n = new Paint();
        this.f۱۲۸۲۶n.setAntiAlias(true);
        this.f۱۲۸۲۶n.setStyle(Paint.Style.FILL);
        this.f۱۲۸۲۶n.setColor(this.f۱۲۸۱۶d);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۴۰۸۳b() {
        m۱۴۰۷۷f();
        this.f۱۲۸۲۸p = System.currentTimeMillis();
        m۱۴۰۷۲a(1);
        Cu.m۱۰۹۰۰B(this);
    }

    /* renamed from: f, reason: contains not printable characters */
    private void m۱۴۰۷۷f() {
        m۱۴۰۷۵d();
        m۱۴۰۷۶e();
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۴۰۷۵d() {
        if (this.f۱۲۸۱۸f <= 0 || this.f۱۲۸۱۹g <= 0) {
            throw new IllegalArgumentException("You must provide the original image dimensions in order map the coordinates properly.");
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    private void m۱۴۰۷۶e() {
        if (this.f۱۲۸۲۴l == null) {
            throw new IllegalArgumentException("You must provide a not empty path in order to draw the view properly.");
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h2, int oldw, int oldh) {
        super.onSizeChanged(w, h2, oldw, oldh);
        this.f۱۲۸۲۹q = w;
        this.f۱۲۸۳۰r = h2;
        m۱۴۰۷۴c();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!m۱۴۰۸۱a()) {
            return;
        }
        long elapsedTime = System.currentTimeMillis() - this.f۱۲۸۲۸p;
        float phase = p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۵h.Ca.m۱۴۱۱۳a(0.0f, 1.0f, (elapsedTime * 1.0f) / this.f۱۲۸۲۰h);
        float distance = this.f۱۲۸۳۱s.getInterpolation(phase) * this.f۱۲۸۲۴l.f۱۲۸۴۵b;
        this.f۱۲۸۲۵m.setPathEffect(m۱۴۰۷۱a(distance));
        canvas.drawPath(this.f۱۲۸۲۴l.f۱۲۸۴۴a, this.f۱۲۸۲۵m);
        if (m۱۴۰۸۲a(elapsedTime)) {
            if (this.f۱۲۸۲۷o < 2) {
                m۱۴۰۷۲a(2);
            }
            float fillPhase = p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۵h.Ca.m۱۴۱۱۳a(0.0f, 1.0f, ((elapsedTime - this.f۱۲۸۲۰h) * 1.0f) / this.f۱۲۸۲۱i);
            this.f۱۲۸۲۲j.mo۱۴۰۹۷a(canvas, fillPhase, this);
            canvas.drawPath(this.f۱۲۸۲۴l.f۱۲۸۴۴a, this.f۱۲۸۲۶n);
        }
        if (m۱۴۰۷۳b(elapsedTime)) {
            Cu.m۱۰۹۰۰B(this);
        } else {
            m۱۴۰۷۲a(3);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۴۰۸۱a() {
        return (this.f۱۲۸۲۷o == 0 || this.f۱۲۸۲۴l == null) ? false : true;
    }

    /* renamed from: a, reason: contains not printable characters */
    private PathEffect m۱۴۰۷۱a(float distance) {
        return new DashPathEffect(new float[]{distance, this.f۱۲۸۲۴l.f۱۲۸۴۵b}, 0.0f);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۴۰۸۲a(long elapsedTime) {
        return elapsedTime > ((long) this.f۱۲۸۲۰h);
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۱۴۰۷۳b(long elapsedTime) {
        return elapsedTime < ((long) (this.f۱۲۸۲۰h + this.f۱۲۸۲۱i));
    }

    public void setOnStateChangeListener(p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۳f.InterfaceCa onStateChangeListener) {
        this.f۱۲۸۳۲t = onStateChangeListener;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۴۰۷۲a(int state) {
        if (this.f۱۲۸۲۷o == state) {
            return;
        }
        this.f۱۲۸۲۷o = state;
        p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۳f.InterfaceCa interfaceCa = this.f۱۲۸۳۲t;
        if (interfaceCa != null) {
            interfaceCa.mo۱۴۴۵۶a(state);
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

    public void setClippingTransform(InterfaceCa transform) {
        this.f۱۲۸۲۲j = transform == null ? new Cb() : transform;
    }

    public void setSvgPath(String svgPath) {
        if (svgPath == null || svgPath.length() == 0) {
            throw new IllegalArgumentException("You must provide a not empty path in order to draw the view properly.");
        }
        this.f۱۲۸۲۳k = svgPath;
        m۱۴۰۷۴c();
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۴۰۷۴c() {
        p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۴g.Cb parser = getPathParser();
        this.f۱۲۸۲۴l = new Cc();
        try {
            this.f۱۲۸۲۴l.f۱۲۸۴۴a = parser.m۱۴۱۱۱a(this.f۱۲۸۲۳k);
        } catch (ParseException e2) {
            this.f۱۲۸۲۴l.f۱۲۸۴۴a = new Path();
        }
        PathMeasure pm = new PathMeasure(this.f۱۲۸۲۴l.f۱۲۸۴۴a, true);
        do {
            Cc cc = this.f۱۲۸۲۴l;
            cc.f۱۲۸۴۵b = Math.max(cc.f۱۲۸۴۵b, pm.getLength());
        } while (pm.nextContour());
    }

    private p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۴g.Cb getPathParser() {
        Ca.b builder = new Ca.b();
        builder.m۱۴۱۰۳b(this.f۱۲۸۱۸f);
        builder.m۱۴۱۰۱a(this.f۱۲۸۱۹g);
        builder.m۱۴۱۰۵d(this.f۱۲۸۲۹q);
        builder.m۱۴۱۰۴c(this.f۱۲۸۳۰r);
        return builder.m۱۴۱۰۲a();
    }
}
