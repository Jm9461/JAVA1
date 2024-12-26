package p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ci;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;

/* renamed from: a.b.h.d.a.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cd extends Drawable {

    /* renamed from: m, reason: contains not printable characters */
    private static final float f۸۸۶۲m = (float) Math.toRadians(45.0d);

    /* renamed from: b, reason: contains not printable characters */
    private float f۸۸۶۴b;

    /* renamed from: c, reason: contains not printable characters */
    private float f۸۸۶۵c;

    /* renamed from: d, reason: contains not printable characters */
    private float f۸۸۶۶d;

    /* renamed from: e, reason: contains not printable characters */
    private float f۸۸۶۷e;

    /* renamed from: f, reason: contains not printable characters */
    private boolean f۸۸۶۸f;

    /* renamed from: h, reason: contains not printable characters */
    private final int f۸۸۷۰h;

    /* renamed from: j, reason: contains not printable characters */
    private float f۸۸۷۲j;

    /* renamed from: k, reason: contains not printable characters */
    private float f۸۸۷۳k;

    /* renamed from: a, reason: contains not printable characters */
    private final Paint f۸۸۶۳a = new Paint();

    /* renamed from: g, reason: contains not printable characters */
    private final Path f۸۸۶۹g = new Path();

    /* renamed from: i, reason: contains not printable characters */
    private boolean f۸۸۷۱i = false;

    /* renamed from: l, reason: contains not printable characters */
    private int f۸۸۷۴l = 2;

    public Cd(Context context) {
        this.f۸۸۶۳a.setStyle(Paint.Style.STROKE);
        this.f۸۸۶۳a.setStrokeJoin(Paint.Join.MITER);
        this.f۸۸۶۳a.setStrokeCap(Paint.Cap.BUTT);
        this.f۸۸۶۳a.setAntiAlias(true);
        TypedArray a2 = context.getTheme().obtainStyledAttributes(null, Cj.DrawerArrowToggle, Ca.drawerArrowStyle, Ci.Base_Widget_AppCompat_DrawerArrowToggle);
        m۸۶۸۲a(a2.getColor(Cj.DrawerArrowToggle_color, 0));
        m۸۶۸۱a(a2.getDimension(Cj.DrawerArrowToggle_thickness, 0.0f));
        m۸۶۸۳a(a2.getBoolean(Cj.DrawerArrowToggle_spinBars, true));
        m۸۶۸۴b(Math.round(a2.getDimension(Cj.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f۸۸۷۰h = a2.getDimensionPixelSize(Cj.DrawerArrowToggle_drawableSize, 0);
        this.f۸۸۶۵c = Math.round(a2.getDimension(Cj.DrawerArrowToggle_barLength, 0.0f));
        this.f۸۸۶۴b = Math.round(a2.getDimension(Cj.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f۸۸۶۶d = a2.getDimension(Cj.DrawerArrowToggle_arrowShaftLength, 0.0f);
        a2.recycle();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۶۸۲a(int color) {
        if (color != this.f۸۸۶۳a.getColor()) {
            this.f۸۸۶۳a.setColor(color);
            invalidateSelf();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۶۸۱a(float width) {
        if (this.f۸۸۶۳a.getStrokeWidth() != width) {
            this.f۸۸۶۳a.setStrokeWidth(width);
            double d2 = width / 2.0f;
            double cos = Math.cos(f۸۸۶۲m);
            Double.isNaN(d2);
            this.f۸۸۷۳k = (float) (d2 * cos);
            invalidateSelf();
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۸۶۸۴b(float gap) {
        if (gap != this.f۸۸۶۷e) {
            this.f۸۸۶۷e = gap;
            invalidateSelf();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۶۸۳a(boolean enabled) {
        if (this.f۸۸۶۸f != enabled) {
            this.f۸۸۶۸f = enabled;
            invalidateSelf();
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۸۶۸۵b(boolean verticalMirror) {
        if (this.f۸۸۷۱i != verticalMirror) {
            this.f۸۸۷۱i = verticalMirror;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean flipToPointRight;
        Rect bounds = getBounds();
        int i = this.f۸۸۷۴l;
        if (i == 0) {
            flipToPointRight = false;
        } else if (i != 1) {
            if (i == 3) {
                flipToPointRight = android.support.v4.graphics.drawable.Ca.m۱۰۶۴۹e(this) == 0;
            } else {
                flipToPointRight = android.support.v4.graphics.drawable.Ca.m۱۰۶۴۹e(this) == 1;
            }
        } else {
            flipToPointRight = true;
        }
        float f2 = this.f۸۸۶۴b;
        float arrowHeadBarLength = m۸۶۸۰a(this.f۸۸۶۵c, (float) Math.sqrt(f2 * f2 * 2.0f), this.f۸۸۷۲j);
        float arrowShaftLength = m۸۶۸۰a(this.f۸۸۶۵c, this.f۸۸۶۶d, this.f۸۸۷۲j);
        float arrowShaftCut = Math.round(m۸۶۸۰a(0.0f, this.f۸۸۷۳k, this.f۸۸۷۲j));
        float rotation = m۸۶۸۰a(0.0f, f۸۸۶۲m, this.f۸۸۷۲j);
        float canvasRotate = m۸۶۸۰a(flipToPointRight ? 0.0f : -180.0f, flipToPointRight ? 180.0f : 0.0f, this.f۸۸۷۲j);
        double d2 = arrowHeadBarLength;
        double cos = Math.cos(rotation);
        Double.isNaN(d2);
        float arrowWidth = Math.round(d2 * cos);
        double d3 = arrowHeadBarLength;
        double sin = Math.sin(rotation);
        Double.isNaN(d3);
        float arrowHeight = Math.round(d3 * sin);
        this.f۸۸۶۹g.rewind();
        float topBottomBarOffset = m۸۶۸۰a(this.f۸۸۶۷e + this.f۸۸۶۳a.getStrokeWidth(), -this.f۸۸۷۳k, this.f۸۸۷۲j);
        float arrowEdge = (-arrowShaftLength) / 2.0f;
        this.f۸۸۶۹g.moveTo(arrowEdge + arrowShaftCut, 0.0f);
        this.f۸۸۶۹g.rLineTo(arrowShaftLength - (arrowShaftCut * 2.0f), 0.0f);
        this.f۸۸۶۹g.moveTo(arrowEdge, topBottomBarOffset);
        this.f۸۸۶۹g.rLineTo(arrowWidth, arrowHeight);
        this.f۸۸۶۹g.moveTo(arrowEdge, -topBottomBarOffset);
        this.f۸۸۶۹g.rLineTo(arrowWidth, -arrowHeight);
        this.f۸۸۶۹g.close();
        canvas.save();
        float barThickness = this.f۸۸۶۳a.getStrokeWidth();
        float f3 = this.f۸۸۶۷e;
        int remainingSpace = (int) ((bounds.height() - (3.0f * barThickness)) - (2.0f * f3));
        float yOffset = (remainingSpace / 4) * 2;
        canvas.translate(bounds.centerX(), yOffset + (1.5f * barThickness) + f3);
        if (this.f۸۸۶۸f) {
            canvas.rotate((this.f۸۸۷۱i ^ flipToPointRight ? -1 : 1) * canvasRotate);
        } else if (flipToPointRight) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f۸۸۶۹g, this.f۸۸۶۳a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        if (alpha != this.f۸۸۶۳a.getAlpha()) {
            this.f۸۸۶۳a.setAlpha(alpha);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f۸۸۶۳a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f۸۸۷۰h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f۸۸۷۰h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۸۶۸۶c(float progress) {
        if (this.f۸۸۷۲j != progress) {
            this.f۸۸۷۲j = progress;
            invalidateSelf();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static float m۸۶۸۰a(float a2, float b2, float t) {
        return ((b2 - a2) * t) + a2;
    }
}
