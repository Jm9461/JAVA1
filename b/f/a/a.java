package b.f.a;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.support.v4.view.u;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import b.f.a.d.b;
import b.f.a.g.a;
import java.text.ParseException;

public class a extends View {

    /* renamed from: c  reason: collision with root package name */
    private int f۲۴۹۰c;

    /* renamed from: d  reason: collision with root package name */
    private int f۲۴۹۱d;

    /* renamed from: e  reason: collision with root package name */
    private int f۲۴۹۲e;

    /* renamed from: f  reason: collision with root package name */
    private int f۲۴۹۳f;

    /* renamed from: g  reason: collision with root package name */
    private int f۲۴۹۴g;

    /* renamed from: h  reason: collision with root package name */
    private int f۲۴۹۵h;
    private int i;
    private b.f.a.d.a j;
    private String k;
    private c l;
    private Paint m;
    private Paint n;
    private int o;
    private long p;
    private int q;
    private int r;
    private Interpolator s;
    private b.f.a.f.a t;

    a(ViewGroup parent, ViewGroup.LayoutParams params, int strokeColor, int fillColor, int strokeWidth, int originalWidth, int originalHeight, int strokeDrawingDuration, int fillDuration, b.f.a.d.a transform, String svgPath) {
        super(parent.getContext());
        this.f۲۴۹۰c = strokeColor;
        this.f۲۴۹۱d = fillColor;
        this.f۲۴۹۲e = strokeWidth;
        this.f۲۴۹۵h = strokeDrawingDuration;
        this.i = fillDuration;
        this.j = transform;
        this.f۲۴۹۳f = originalWidth;
        this.f۲۴۹۴g = originalHeight;
        this.k = svgPath;
        g();
        parent.addView(this, params);
    }

    private void g() {
        this.o = 0;
        h();
        i();
        this.s = new DecelerateInterpolator();
        setLayerType(1, null);
    }

    private void h() {
        this.m = new Paint();
        this.m.setStyle(Paint.Style.STROKE);
        this.m.setAntiAlias(true);
        this.m.setStrokeWidth((float) this.f۲۴۹۲e);
        this.m.setColor(this.f۲۴۹۰c);
    }

    private void i() {
        this.n = new Paint();
        this.n.setAntiAlias(true);
        this.n.setStyle(Paint.Style.FILL);
        this.n.setColor(this.f۲۴۹۱d);
    }

    public void b() {
        f();
        this.p = System.currentTimeMillis();
        a(1);
        u.B(this);
    }

    private void f() {
        d();
        e();
    }

    private void d() {
        if (this.f۲۴۹۳f <= 0 || this.f۲۴۹۴g <= 0) {
            throw new IllegalArgumentException("You must provide the original image dimensions in order map the coordinates properly.");
        }
    }

    private void e() {
        if (this.l == null) {
            throw new IllegalArgumentException("You must provide a not empty path in order to draw the view properly.");
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h2, int oldw, int oldh) {
        super.onSizeChanged(w, h2, oldw, oldh);
        this.q = w;
        this.r = h2;
        c();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (a()) {
            long elapsedTime = System.currentTimeMillis() - this.p;
            this.m.setPathEffect(a(this.s.getInterpolation(b.f.a.h.a.a(0.0f, 1.0f, (((float) elapsedTime) * 1.0f) / ((float) this.f۲۴۹۵h))) * this.l.f۲۵۰۵b));
            canvas.drawPath(this.l.f۲۵۰۴a, this.m);
            if (a(elapsedTime)) {
                if (this.o < 2) {
                    a(2);
                }
                this.j.a(canvas, b.f.a.h.a.a(0.0f, 1.0f, (((float) (elapsedTime - ((long) this.f۲۴۹۵h))) * 1.0f) / ((float) this.i)), this);
                canvas.drawPath(this.l.f۲۵۰۴a, this.n);
            }
            if (b(elapsedTime)) {
                u.B(this);
            } else {
                a(3);
            }
        }
    }

    public boolean a() {
        return (this.o == 0 || this.l == null) ? false : true;
    }

    private PathEffect a(float distance) {
        return new DashPathEffect(new float[]{distance, this.l.f۲۵۰۵b}, 0.0f);
    }

    public boolean a(long elapsedTime) {
        return elapsedTime > ((long) this.f۲۴۹۵h);
    }

    private boolean b(long elapsedTime) {
        return elapsedTime < ((long) (this.f۲۴۹۵h + this.i));
    }

    public void setOnStateChangeListener(b.f.a.f.a onStateChangeListener) {
        this.t = onStateChangeListener;
    }

    private void a(int state) {
        if (this.o != state) {
            this.o = state;
            b.f.a.f.a aVar = this.t;
            if (aVar != null) {
                aVar.a(state);
            }
        }
    }

    public void setStrokeColor(int strokeColor) {
        this.f۲۴۹۰c = strokeColor;
    }

    public void setFillColor(int fillColor) {
        this.f۲۴۹۱d = fillColor;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.f۲۴۹۲e = strokeWidth;
    }

    public void setStrokeDrawingDuration(int duration) {
        this.f۲۴۹۵h = duration;
    }

    public void setFillDuration(int duration) {
        this.i = duration;
    }

    public void setClippingTransform(b.f.a.d.a transform) {
        this.j = transform == null ? new b() : transform;
    }

    public void setSvgPath(String svgPath) {
        if (svgPath == null || svgPath.length() == 0) {
            throw new IllegalArgumentException("You must provide a not empty path in order to draw the view properly.");
        }
        this.k = svgPath;
        c();
    }

    private void c() {
        b.f.a.g.b parser = getPathParser();
        this.l = new c();
        try {
            this.l.f۲۵۰۴a = parser.a(this.k);
        } catch (ParseException e2) {
            this.l.f۲۵۰۴a = new Path();
        }
        PathMeasure pm = new PathMeasure(this.l.f۲۵۰۴a, true);
        do {
            c cVar = this.l;
            cVar.f۲۵۰۵b = Math.max(cVar.f۲۵۰۵b, pm.getLength());
        } while (pm.nextContour());
    }

    private b.f.a.g.b getPathParser() {
        a.b builder = new a.b();
        builder.b(this.f۲۴۹۳f);
        builder.a(this.f۲۴۹۴g);
        builder.d(this.q);
        builder.c(this.r);
        return builder.a();
    }
}
