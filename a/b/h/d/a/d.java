package a.b.h.d.a;

import a.b.h.a.a;
import a.b.h.a.i;
import a.b.h.a.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class d extends Drawable {
    private static final float m = ((float) Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    private final Paint f۴۵۳a = new Paint();

    /* renamed from: b  reason: collision with root package name */
    private float f۴۵۴b;

    /* renamed from: c  reason: collision with root package name */
    private float f۴۵۵c;

    /* renamed from: d  reason: collision with root package name */
    private float f۴۵۶d;

    /* renamed from: e  reason: collision with root package name */
    private float f۴۵۷e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f۴۵۸f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f۴۵۹g = new Path();

    /* renamed from: h  reason: collision with root package name */
    private final int f۴۶۰h;
    private boolean i = false;
    private float j;
    private float k;
    private int l = 2;

    public d(Context context) {
        this.f۴۵۳a.setStyle(Paint.Style.STROKE);
        this.f۴۵۳a.setStrokeJoin(Paint.Join.MITER);
        this.f۴۵۳a.setStrokeCap(Paint.Cap.BUTT);
        this.f۴۵۳a.setAntiAlias(true);
        TypedArray a2 = context.getTheme().obtainStyledAttributes(null, j.DrawerArrowToggle, a.drawerArrowStyle, i.Base_Widget_AppCompat_DrawerArrowToggle);
        a(a2.getColor(j.DrawerArrowToggle_color, 0));
        a(a2.getDimension(j.DrawerArrowToggle_thickness, 0.0f));
        a(a2.getBoolean(j.DrawerArrowToggle_spinBars, true));
        b((float) Math.round(a2.getDimension(j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f۴۶۰h = a2.getDimensionPixelSize(j.DrawerArrowToggle_drawableSize, 0);
        this.f۴۵۵c = (float) Math.round(a2.getDimension(j.DrawerArrowToggle_barLength, 0.0f));
        this.f۴۵۴b = (float) Math.round(a2.getDimension(j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f۴۵۶d = a2.getDimension(j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        a2.recycle();
    }

    public void a(int color) {
        if (color != this.f۴۵۳a.getColor()) {
            this.f۴۵۳a.setColor(color);
            invalidateSelf();
        }
    }

    public void a(float width) {
        if (this.f۴۵۳a.getStrokeWidth() != width) {
            this.f۴۵۳a.setStrokeWidth(width);
            double d2 = (double) (width / 2.0f);
            double cos = Math.cos((double) m);
            Double.isNaN(d2);
            this.k = (float) (d2 * cos);
            invalidateSelf();
        }
    }

    public void b(float gap) {
        if (gap != this.f۴۵۷e) {
            this.f۴۵۷e = gap;
            invalidateSelf();
        }
    }

    public void a(boolean enabled) {
        if (this.f۴۵۸f != enabled) {
            this.f۴۵۸f = enabled;
            invalidateSelf();
        }
    }

    public void b(boolean verticalMirror) {
        if (this.i != verticalMirror) {
            this.i = verticalMirror;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        boolean flipToPointRight;
        Rect bounds = getBounds();
        int i2 = this.l;
        if (i2 == 0) {
            flipToPointRight = false;
        } else if (i2 != 1) {
            boolean z = false;
            if (i2 != 3) {
                if (android.support.v4.graphics.drawable.a.e(this) == 1) {
                    z = true;
                }
                flipToPointRight = z;
            } else {
                if (android.support.v4.graphics.drawable.a.e(this) == 0) {
                    z = true;
                }
                flipToPointRight = z;
            }
        } else {
            flipToPointRight = true;
        }
        float f2 = this.f۴۵۴b;
        float arrowHeadBarLength = a(this.f۴۵۵c, (float) Math.sqrt((double) (f2 * f2 * 2.0f)), this.j);
        float arrowShaftLength = a(this.f۴۵۵c, this.f۴۵۶d, this.j);
        float arrowShaftCut = (float) Math.round(a(0.0f, this.k, this.j));
        float rotation = a(0.0f, m, this.j);
        float canvasRotate = a(flipToPointRight ? 0.0f : -180.0f, flipToPointRight ? 180.0f : 0.0f, this.j);
        double d2 = (double) arrowHeadBarLength;
        double cos = Math.cos((double) rotation);
        Double.isNaN(d2);
        float arrowWidth = (float) Math.round(d2 * cos);
        double d3 = (double) arrowHeadBarLength;
        double sin = Math.sin((double) rotation);
        Double.isNaN(d3);
        float arrowHeight = (float) Math.round(d3 * sin);
        this.f۴۵۹g.rewind();
        float topBottomBarOffset = a(this.f۴۵۷e + this.f۴۵۳a.getStrokeWidth(), -this.k, this.j);
        float arrowEdge = (-arrowShaftLength) / 2.0f;
        this.f۴۵۹g.moveTo(arrowEdge + arrowShaftCut, 0.0f);
        this.f۴۵۹g.rLineTo(arrowShaftLength - (arrowShaftCut * 2.0f), 0.0f);
        this.f۴۵۹g.moveTo(arrowEdge, topBottomBarOffset);
        this.f۴۵۹g.rLineTo(arrowWidth, arrowHeight);
        this.f۴۵۹g.moveTo(arrowEdge, -topBottomBarOffset);
        this.f۴۵۹g.rLineTo(arrowWidth, -arrowHeight);
        this.f۴۵۹g.close();
        canvas.save();
        float barThickness = this.f۴۵۳a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * barThickness);
        float f3 = this.f۴۵۷e;
        canvas.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f3))) / 4) * 2)) + (1.5f * barThickness) + f3);
        if (this.f۴۵۸f) {
            canvas.rotate(((float) (this.i ^ flipToPointRight ? -1 : 1)) * canvasRotate);
        } else if (flipToPointRight) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f۴۵۹g, this.f۴۵۳a);
        canvas.restore();
    }

    public void setAlpha(int alpha) {
        if (alpha != this.f۴۵۳a.getAlpha()) {
            this.f۴۵۳a.setAlpha(alpha);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f۴۵۳a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return this.f۴۶۰h;
    }

    public int getIntrinsicWidth() {
        return this.f۴۶۰h;
    }

    public int getOpacity() {
        return -3;
    }

    public void c(float progress) {
        if (this.j != progress) {
            this.j = progress;
            invalidateSelf();
        }
    }

    private static float a(float a2, float b2, float t) {
        return ((b2 - a2) * t) + a2;
    }
}
