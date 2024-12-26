package p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ci;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* renamed from: a.b.h.d.a.d  reason: invalid class name */
public class Cd extends Drawable {

    /* renamed from: m  reason: contains not printable characters */
    private static final float f۸۸۶۲m = ((float) Math.toRadians(45.0d));

    /* renamed from: a  reason: contains not printable characters */
    private final Paint f۸۸۶۳a = new Paint();

    /* renamed from: b  reason: contains not printable characters */
    private float f۸۸۶۴b;

    /* renamed from: c  reason: contains not printable characters */
    private float f۸۸۶۵c;

    /* renamed from: d  reason: contains not printable characters */
    private float f۸۸۶۶d;

    /* renamed from: e  reason: contains not printable characters */
    private float f۸۸۶۷e;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۸۸۶۸f;

    /* renamed from: g  reason: contains not printable characters */
    private final Path f۸۸۶۹g = new Path();

    /* renamed from: h  reason: contains not printable characters */
    private final int f۸۸۷۰h;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۸۸۷۱i = false;

    /* renamed from: j  reason: contains not printable characters */
    private float f۸۸۷۲j;

    /* renamed from: k  reason: contains not printable characters */
    private float f۸۸۷۳k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۸۸۷۴l = 2;

    public Cd(Context context) {
        this.f۸۸۶۳a.setStyle(Paint.Style.STROKE);
        this.f۸۸۶۳a.setStrokeJoin(Paint.Join.MITER);
        this.f۸۸۶۳a.setStrokeCap(Paint.Cap.BUTT);
        this.f۸۸۶۳a.setAntiAlias(true);
        TypedArray a = context.getTheme().obtainStyledAttributes(null, Cj.DrawerArrowToggle, Ca.drawerArrowStyle, Ci.Base_Widget_AppCompat_DrawerArrowToggle);
        m۱۰۷۵۱a(a.getColor(Cj.DrawerArrowToggle_color, 0));
        m۱۰۷۵۰a(a.getDimension(Cj.DrawerArrowToggle_thickness, 0.0f));
        m۱۰۷۵۲a(a.getBoolean(Cj.DrawerArrowToggle_spinBars, true));
        m۱۰۷۵۳b((float) Math.round(a.getDimension(Cj.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f۸۸۷۰h = a.getDimensionPixelSize(Cj.DrawerArrowToggle_drawableSize, 0);
        this.f۸۸۶۵c = (float) Math.round(a.getDimension(Cj.DrawerArrowToggle_barLength, 0.0f));
        this.f۸۸۶۴b = (float) Math.round(a.getDimension(Cj.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f۸۸۶۶d = a.getDimension(Cj.DrawerArrowToggle_arrowShaftLength, 0.0f);
        a.recycle();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۷۵۱a(int color) {
        if (color != this.f۸۸۶۳a.getColor()) {
            this.f۸۸۶۳a.setColor(color);
            invalidateSelf();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۷۵۰a(float width) {
        if (this.f۸۸۶۳a.getStrokeWidth() != width) {
            this.f۸۸۶۳a.setStrokeWidth(width);
            double d = (double) (width / 2.0f);
            double cos = Math.cos((double) f۸۸۶۲m);
            Double.isNaN(d);
            this.f۸۸۷۳k = (float) (d * cos);
            invalidateSelf();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۷۵۳b(float gap) {
        if (gap != this.f۸۸۶۷e) {
            this.f۸۸۶۷e = gap;
            invalidateSelf();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۷۵۲a(boolean enabled) {
        if (this.f۸۸۶۸f != enabled) {
            this.f۸۸۶۸f = enabled;
            invalidateSelf();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۷۵۴b(boolean verticalMirror) {
        if (this.f۸۸۷۱i != verticalMirror) {
            this.f۸۸۷۱i = verticalMirror;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        boolean flipToPointRight;
        Rect bounds = getBounds();
        int i = this.f۸۸۷۴l;
        if (i == 0) {
            flipToPointRight = false;
        } else if (i != 1) {
            boolean z = false;
            if (i != 3) {
                if (android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۹e(this) == 1) {
                    z = true;
                }
                flipToPointRight = z;
            } else {
                if (android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۹e(this) == 0) {
                    z = true;
                }
                flipToPointRight = z;
            }
        } else {
            flipToPointRight = true;
        }
        float f = this.f۸۸۶۴b;
        float arrowHeadBarLength = m۱۰۷۴۹a(this.f۸۸۶۵c, (float) Math.sqrt((double) (f * f * 2.0f)), this.f۸۸۷۲j);
        float arrowShaftLength = m۱۰۷۴۹a(this.f۸۸۶۵c, this.f۸۸۶۶d, this.f۸۸۷۲j);
        float arrowShaftCut = (float) Math.round(m۱۰۷۴۹a(0.0f, this.f۸۸۷۳k, this.f۸۸۷۲j));
        float rotation = m۱۰۷۴۹a(0.0f, f۸۸۶۲m, this.f۸۸۷۲j);
        float canvasRotate = m۱۰۷۴۹a(flipToPointRight ? 0.0f : -180.0f, flipToPointRight ? 180.0f : 0.0f, this.f۸۸۷۲j);
        double d = (double) arrowHeadBarLength;
        double cos = Math.cos((double) rotation);
        Double.isNaN(d);
        float arrowWidth = (float) Math.round(d * cos);
        double d2 = (double) arrowHeadBarLength;
        double sin = Math.sin((double) rotation);
        Double.isNaN(d2);
        float arrowHeight = (float) Math.round(d2 * sin);
        this.f۸۸۶۹g.rewind();
        float topBottomBarOffset = m۱۰۷۴۹a(this.f۸۸۶۷e + this.f۸۸۶۳a.getStrokeWidth(), -this.f۸۸۷۳k, this.f۸۸۷۲j);
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
        float height = ((float) bounds.height()) - (3.0f * barThickness);
        float f2 = this.f۸۸۶۷e;
        canvas.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f2))) / 4) * 2)) + (1.5f * barThickness) + f2);
        if (this.f۸۸۶۸f) {
            canvas.rotate(((float) (this.f۸۸۷۱i ^ flipToPointRight ? -1 : 1)) * canvasRotate);
        } else if (flipToPointRight) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f۸۸۶۹g, this.f۸۸۶۳a);
        canvas.restore();
    }

    public void setAlpha(int alpha) {
        if (alpha != this.f۸۸۶۳a.getAlpha()) {
            this.f۸۸۶۳a.setAlpha(alpha);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f۸۸۶۳a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return this.f۸۸۷۰h;
    }

    public int getIntrinsicWidth() {
        return this.f۸۸۷۰h;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۷۵۵c(float progress) {
        if (this.f۸۸۷۲j != progress) {
            this.f۸۸۷۲j = progress;
            invalidateSelf();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static float m۱۰۷۴۹a(float a, float b, float t) {
        return ((b - a) * t) + a;
    }
}
