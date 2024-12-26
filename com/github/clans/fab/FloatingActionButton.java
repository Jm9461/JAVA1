package com.github.clans.fab;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

public class FloatingActionButton extends ImageButton {

    /* renamed from: a0  reason: contains not printable characters */
    private static final Xfermode f۱۳۵۰۶a0 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);

    /* renamed from: A  reason: contains not printable characters */
    private float f۱۳۵۰۷A;

    /* renamed from: B  reason: contains not printable characters */
    private float f۱۳۵۰۸B;

    /* renamed from: C  reason: contains not printable characters */
    private boolean f۱۳۵۰۹C;

    /* renamed from: D  reason: contains not printable characters */
    private RectF f۱۳۵۱۰D;

    /* renamed from: E  reason: contains not printable characters */
    private Paint f۱۳۵۱۱E;

    /* renamed from: F  reason: contains not printable characters */
    private Paint f۱۳۵۱۲F;

    /* renamed from: G  reason: contains not printable characters */
    private boolean f۱۳۵۱۳G;

    /* renamed from: H  reason: contains not printable characters */
    private long f۱۳۵۱۴H;

    /* renamed from: I  reason: contains not printable characters */
    private float f۱۳۵۱۵I;

    /* renamed from: J  reason: contains not printable characters */
    private long f۱۳۵۱۶J;

    /* renamed from: K  reason: contains not printable characters */
    private double f۱۳۵۱۷K;

    /* renamed from: L  reason: contains not printable characters */
    private boolean f۱۳۵۱۸L;

    /* renamed from: M  reason: contains not printable characters */
    private int f۱۳۵۱۹M;

    /* renamed from: N  reason: contains not printable characters */
    private float f۱۳۵۲۰N;

    /* renamed from: O  reason: contains not printable characters */
    private float f۱۳۵۲۱O;

    /* renamed from: P  reason: contains not printable characters */
    private float f۱۳۵۲۲P;

    /* renamed from: Q  reason: contains not printable characters */
    private int f۱۳۵۲۳Q;

    /* renamed from: R  reason: contains not printable characters */
    private boolean f۱۳۵۲۴R;

    /* renamed from: S  reason: contains not printable characters */
    private boolean f۱۳۵۲۵S;

    /* renamed from: T  reason: contains not printable characters */
    private boolean f۱۳۵۲۶T;

    /* renamed from: U  reason: contains not printable characters */
    private int f۱۳۵۲۷U;

    /* renamed from: V  reason: contains not printable characters */
    private boolean f۱۳۵۲۸V;

    /* renamed from: W  reason: contains not printable characters */
    GestureDetector f۱۳۵۲۹W;

    /* renamed from: c  reason: contains not printable characters */
    int f۱۳۵۳۰c;

    /* renamed from: d  reason: contains not printable characters */
    boolean f۱۳۵۳۱d;

    /* renamed from: e  reason: contains not printable characters */
    int f۱۳۵۳۲e;

    /* renamed from: f  reason: contains not printable characters */
    int f۱۳۵۳۳f;

    /* renamed from: g  reason: contains not printable characters */
    int f۱۳۵۳۴g;

    /* renamed from: h  reason: contains not printable characters */
    int f۱۳۵۳۵h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۳۵۳۶i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۳۵۳۷j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۳۵۳۸k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۳۵۳۹l;

    /* renamed from: m  reason: contains not printable characters */
    private Drawable f۱۳۵۴۰m;

    /* renamed from: n  reason: contains not printable characters */
    private int f۱۳۵۴۱n;

    /* renamed from: o  reason: contains not printable characters */
    private Animation f۱۳۵۴۲o;

    /* renamed from: p  reason: contains not printable characters */
    private Animation f۱۳۵۴۳p;

    /* renamed from: q  reason: contains not printable characters */
    private String f۱۳۵۴۴q;

    /* renamed from: r  reason: contains not printable characters */
    private View.OnClickListener f۱۳۵۴۵r;

    /* renamed from: s  reason: contains not printable characters */
    private Drawable f۱۳۵۴۶s;

    /* renamed from: t  reason: contains not printable characters */
    private boolean f۱۳۵۴۷t;

    /* renamed from: u  reason: contains not printable characters */
    private boolean f۱۳۵۴۸u;

    /* renamed from: v  reason: contains not printable characters */
    private boolean f۱۳۵۴۹v;

    /* renamed from: w  reason: contains not printable characters */
    private int f۱۳۵۵۰w;

    /* renamed from: x  reason: contains not printable characters */
    private int f۱۳۵۵۱x;

    /* renamed from: y  reason: contains not printable characters */
    private int f۱۳۵۵۲y;

    /* renamed from: z  reason: contains not printable characters */
    private boolean f۱۳۵۵۳z;

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۳۵۳۳f = Cg.m۱۶۹۵۹a(getContext(), 4.0f);
        this.f۱۳۵۳۴g = Cg.m۱۶۹۵۹a(getContext(), 1.0f);
        this.f۱۳۵۳۵h = Cg.m۱۶۹۵۹a(getContext(), 3.0f);
        this.f۱۳۵۴۱n = Cg.m۱۶۹۵۹a(getContext(), 24.0f);
        this.f۱۳۵۵۰w = Cg.m۱۶۹۵۹a(getContext(), 6.0f);
        this.f۱۳۵۰۷A = -1.0f;
        this.f۱۳۵۰۸B = -1.0f;
        this.f۱۳۵۱۰D = new RectF();
        this.f۱۳۵۱۱E = new Paint(1);
        this.f۱۳۵۱۲F = new Paint(1);
        this.f۱۳۵۱۵I = 195.0f;
        this.f۱۳۵۱۶J = 0;
        this.f۱۳۵۱۸L = true;
        this.f۱۳۵۱۹M = 16;
        this.f۱۳۵۲۷U = 100;
        this.f۱۳۵۲۹W = new GestureDetector(getContext(), new Cb());
        m۱۶۸۷۸a(context, attrs, defStyleAttr);
    }

    @TargetApi(21)
    public FloatingActionButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.f۱۳۵۳۳f = Cg.m۱۶۹۵۹a(getContext(), 4.0f);
        this.f۱۳۵۳۴g = Cg.m۱۶۹۵۹a(getContext(), 1.0f);
        this.f۱۳۵۳۵h = Cg.m۱۶۹۵۹a(getContext(), 3.0f);
        this.f۱۳۵۴۱n = Cg.m۱۶۹۵۹a(getContext(), 24.0f);
        this.f۱۳۵۵۰w = Cg.m۱۶۹۵۹a(getContext(), 6.0f);
        this.f۱۳۵۰۷A = -1.0f;
        this.f۱۳۵۰۸B = -1.0f;
        this.f۱۳۵۱۰D = new RectF();
        this.f۱۳۵۱۱E = new Paint(1);
        this.f۱۳۵۱۲F = new Paint(1);
        this.f۱۳۵۱۵I = 195.0f;
        this.f۱۳۵۱۶J = 0;
        this.f۱۳۵۱۸L = true;
        this.f۱۳۵۱۹M = 16;
        this.f۱۳۵۲۷U = 100;
        this.f۱۳۵۲۹W = new GestureDetector(getContext(), new Cb());
        m۱۶۸۷۸a(context, attrs, defStyleAttr);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۸۷۸a(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray attr = context.obtainStyledAttributes(attrs, Cf.FloatingActionButton, defStyleAttr, 0);
        this.f۱۳۵۳۶i = attr.getColor(Cf.FloatingActionButton_fab_colorNormal, -2473162);
        this.f۱۳۵۳۷j = attr.getColor(Cf.FloatingActionButton_fab_colorPressed, -1617853);
        this.f۱۳۵۳۸k = attr.getColor(Cf.FloatingActionButton_fab_colorDisabled, -5592406);
        this.f۱۳۵۳۹l = attr.getColor(Cf.FloatingActionButton_fab_colorRipple, -1711276033);
        this.f۱۳۵۳۱d = attr.getBoolean(Cf.FloatingActionButton_fab_showShadow, true);
        this.f۱۳۵۳۲e = attr.getColor(Cf.FloatingActionButton_fab_shadowColor, 1711276032);
        this.f۱۳۵۳۳f = attr.getDimensionPixelSize(Cf.FloatingActionButton_fab_shadowRadius, this.f۱۳۵۳۳f);
        this.f۱۳۵۳۴g = attr.getDimensionPixelSize(Cf.FloatingActionButton_fab_shadowXOffset, this.f۱۳۵۳۴g);
        this.f۱۳۵۳۵h = attr.getDimensionPixelSize(Cf.FloatingActionButton_fab_shadowYOffset, this.f۱۳۵۳۵h);
        this.f۱۳۵۳۰c = attr.getInt(Cf.FloatingActionButton_fab_size, 0);
        this.f۱۳۵۴۴q = attr.getString(Cf.FloatingActionButton_fab_label);
        this.f۱۳۵۲۵S = attr.getBoolean(Cf.FloatingActionButton_fab_progress_indeterminate, false);
        this.f۱۳۵۵۱x = attr.getColor(Cf.FloatingActionButton_fab_progress_color, -16738680);
        this.f۱۳۵۵۲y = attr.getColor(Cf.FloatingActionButton_fab_progress_backgroundColor, 1291845632);
        this.f۱۳۵۲۷U = attr.getInt(Cf.FloatingActionButton_fab_progress_max, this.f۱۳۵۲۷U);
        this.f۱۳۵۲۸V = attr.getBoolean(Cf.FloatingActionButton_fab_progress_showBackground, true);
        if (attr.hasValue(Cf.FloatingActionButton_fab_progress)) {
            this.f۱۳۵۲۳Q = attr.getInt(Cf.FloatingActionButton_fab_progress, 0);
            this.f۱۳۵۲۶T = true;
        }
        if (attr.hasValue(Cf.FloatingActionButton_fab_elevationCompat)) {
            float elevation = (float) attr.getDimensionPixelOffset(Cf.FloatingActionButton_fab_elevationCompat, 0);
            if (isInEditMode()) {
                setElevation(elevation);
            } else {
                setElevationCompat(elevation);
            }
        }
        m۱۶۸۸۱b(attr);
        m۱۶۸۷۹a(attr);
        attr.recycle();
        if (isInEditMode()) {
            if (this.f۱۳۵۲۵S) {
                setIndeterminate(true);
            } else if (this.f۱۳۵۲۶T) {
                m۱۶۸۹۶p();
                m۱۶۹۰۲a(this.f۱۳۵۲۳Q, false);
            }
        }
        setClickable(true);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۸۸۱b(TypedArray attr) {
        this.f۱۳۵۴۲o = AnimationUtils.loadAnimation(getContext(), attr.getResourceId(Cf.FloatingActionButton_fab_showAnimation, Cb.fab_scale_up));
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۸۷۹a(TypedArray attr) {
        this.f۱۳۵۴۳p = AnimationUtils.loadAnimation(getContext(), attr.getResourceId(Cf.FloatingActionButton_fab_hideAnimation, Cb.fab_scale_down));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getCircleSize() {
        return getResources().getDimensionPixelSize(this.f۱۳۵۳۰c == 0 ? Cc.fab_size_normal : Cc.fab_size_mini);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: n  reason: contains not printable characters */
    private int m۱۶۸۹۴n() {
        int width = getCircleSize() + m۱۶۹۰۴b();
        if (this.f۱۳۵۴۹v) {
            return width + (this.f۱۳۵۵۰w * 2);
        }
        return width;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m  reason: contains not printable characters */
    private int m۱۶۸۹۳m() {
        int height = getCircleSize() + m۱۶۹۰۰a();
        if (this.f۱۳۵۴۹v) {
            return height + (this.f۱۳۵۵۰w * 2);
        }
        return height;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۶۹۰۴b() {
        if (m۱۶۹۰۶c()) {
            return getShadowX() * 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۶۹۰۰a() {
        if (m۱۶۹۰۶c()) {
            return getShadowY() * 2;
        }
        return 0;
    }

    private int getShadowX() {
        return this.f۱۳۵۳۳f + Math.abs(this.f۱۳۵۳۴g);
    }

    private int getShadowY() {
        return this.f۱۳۵۳۳f + Math.abs(this.f۱۳۵۳۵h);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: k  reason: contains not printable characters */
    private float m۱۶۸۹۱k() {
        return (float) (getMeasuredWidth() / 2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: l  reason: contains not printable characters */
    private float m۱۶۸۹۲l() {
        return (float) (getMeasuredHeight() / 2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(m۱۶۸۹۴n(), m۱۶۸۹۳m());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f۱۳۵۴۹v) {
            if (this.f۱۳۵۲۸V) {
                canvas.drawArc(this.f۱۳۵۱۰D, 360.0f, 360.0f, false, this.f۱۳۵۱۱E);
            }
            boolean shouldInvalidate = false;
            if (this.f۱۳۵۱۳G) {
                shouldInvalidate = true;
                long deltaTime = SystemClock.uptimeMillis() - this.f۱۳۵۱۴H;
                m۱۶۸۷۷a(deltaTime);
                this.f۱۳۵۲۱O += (((float) deltaTime) * this.f۱۳۵۱۵I) / 1000.0f;
                float f = this.f۱۳۵۲۱O;
                if (f > 360.0f) {
                    this.f۱۳۵۲۱O = f - 360.0f;
                }
                this.f۱۳۵۱۴H = SystemClock.uptimeMillis();
                float from = this.f۱۳۵۲۱O - 90.0f;
                float to = ((float) this.f۱۳۵۱۹M) + this.f۱۳۵۲۰N;
                if (isInEditMode()) {
                    from = 0.0f;
                    to = 135.0f;
                }
                canvas.drawArc(this.f۱۳۵۱۰D, from, to, false, this.f۱۳۵۱۲F);
            } else {
                if (this.f۱۳۵۲۱O != this.f۱۳۵۲۲P) {
                    shouldInvalidate = true;
                    float deltaNormalized = this.f۱۳۵۱۵I * (((float) (SystemClock.uptimeMillis() - this.f۱۳۵۱۴H)) / 1000.0f);
                    float f2 = this.f۱۳۵۲۱O;
                    float f3 = this.f۱۳۵۲۲P;
                    if (f2 > f3) {
                        this.f۱۳۵۲۱O = Math.max(f2 - deltaNormalized, f3);
                    } else {
                        this.f۱۳۵۲۱O = Math.min(f2 + deltaNormalized, f3);
                    }
                    this.f۱۳۵۱۴H = SystemClock.uptimeMillis();
                }
                canvas.drawArc(this.f۱۳۵۱۰D, -90.0f, this.f۱۳۵۲۱O, false, this.f۱۳۵۱۲F);
            }
            if (shouldInvalidate) {
                invalidate();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۸۷۷a(long deltaTimeInMillis) {
        long j = this.f۱۳۵۱۶J;
        if (j >= 200) {
            double d = this.f۱۳۵۱۷K;
            double d2 = (double) deltaTimeInMillis;
            Double.isNaN(d2);
            this.f۱۳۵۱۷K = d + d2;
            double d3 = this.f۱۳۵۱۷K;
            if (d3 > 500.0d) {
                this.f۱۳۵۱۷K = d3 - 500.0d;
                this.f۱۳۵۱۶J = 0;
                this.f۱۳۵۱۸L = !this.f۱۳۵۱۸L;
            }
            float distance = (((float) Math.cos(((this.f۱۳۵۱۷K / 500.0d) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
            float length = (float) (270 - this.f۱۳۵۱۹M);
            if (this.f۱۳۵۱۸L) {
                this.f۱۳۵۲۰N = distance * length;
                return;
            }
            float newLength = (1.0f - distance) * length;
            this.f۱۳۵۲۱O += this.f۱۳۵۲۰N - newLength;
            this.f۱۳۵۲۰N = newLength;
            return;
        }
        this.f۱۳۵۱۶J = j + deltaTimeInMillis;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        m۱۶۸۹۶p();
        if (this.f۱۳۵۲۵S) {
            setIndeterminate(true);
            this.f۱۳۵۲۵S = false;
        } else if (this.f۱۳۵۲۶T) {
            m۱۶۹۰۲a(this.f۱۳۵۲۳Q, this.f۱۳۵۲۴R);
            this.f۱۳۵۲۶T = false;
        } else if (this.f۱۳۵۵۳z) {
            m۱۶۸۹۹s();
            this.f۱۳۵۵۳z = false;
        }
        super.onSizeChanged(w, h, oldw, oldh);
        m۱۶۸۹۸r();
        m۱۶۸۹۷q();
        m۱۶۹۱۲i();
    }

    @TargetApi(21)
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        if ((params instanceof ViewGroup.MarginLayoutParams) && this.f۱۳۵۴۸u) {
            ((ViewGroup.MarginLayoutParams) params).leftMargin += getShadowX();
            ((ViewGroup.MarginLayoutParams) params).topMargin += getShadowY();
            ((ViewGroup.MarginLayoutParams) params).rightMargin += getShadowX();
            ((ViewGroup.MarginLayoutParams) params).bottomMargin += getShadowY();
        }
        super.setLayoutParams(params);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public void m۱۶۹۱۲i() {
        LayerDrawable layerDrawable;
        int iconSize;
        int circleInsetVertical;
        int circleInsetVertical2;
        int circleInsetVertical3 = 0;
        if (m۱۶۹۰۶c()) {
            layerDrawable = new LayerDrawable(new Drawable[]{new Cf(this, null), m۱۶۸۹۵o(), getIconDrawable()});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{m۱۶۸۹۵o(), getIconDrawable()});
        }
        if (getIconDrawable() != null) {
            iconSize = Math.max(getIconDrawable().getIntrinsicWidth(), getIconDrawable().getIntrinsicHeight());
        } else {
            iconSize = -1;
        }
        int iconOffset = (getCircleSize() - (iconSize > 0 ? iconSize : this.f۱۳۵۴۱n)) / 2;
        int circleInsetHorizontal = m۱۶۹۰۶c() ? this.f۱۳۵۳۳f + Math.abs(this.f۱۳۵۳۴g) : 0;
        if (m۱۶۹۰۶c()) {
            circleInsetVertical3 = this.f۱۳۵۳۳f + Math.abs(this.f۱۳۵۳۵h);
        }
        if (this.f۱۳۵۴۹v) {
            int i = this.f۱۳۵۵۰w;
            circleInsetVertical = circleInsetVertical3 + i;
            circleInsetVertical2 = circleInsetHorizontal + i;
        } else {
            circleInsetVertical = circleInsetVertical3;
            circleInsetVertical2 = circleInsetHorizontal;
        }
        layerDrawable.setLayerInset(m۱۶۹۰۶c() ? 2 : 1, circleInsetVertical2 + iconOffset, circleInsetVertical + iconOffset, circleInsetVertical2 + iconOffset, circleInsetVertical + iconOffset);
        setBackgroundCompat(layerDrawable);
    }

    /* access modifiers changed from: protected */
    public Drawable getIconDrawable() {
        Drawable drawable = this.f۱۳۵۴۰m;
        if (drawable != null) {
            return drawable;
        }
        return new ColorDrawable(0);
    }

    @TargetApi(21)
    /* renamed from: o  reason: contains not printable characters */
    private Drawable m۱۶۸۹۵o() {
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(new int[]{-16842910}, m۱۶۸۷۶a(this.f۱۳۵۳۸k));
        drawable.addState(new int[]{16842919}, m۱۶۸۷۶a(this.f۱۳۵۳۷j));
        drawable.addState(new int[0], m۱۶۸۷۶a(this.f۱۳۵۳۶i));
        if (Cg.m۱۶۹۶۱b()) {
            RippleDrawable ripple = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.f۱۳۵۳۹l}), drawable, null);
            setOutlineProvider(new Ca(this));
            setClipToOutline(true);
            this.f۱۳۵۴۶s = ripple;
            return ripple;
        }
        this.f۱۳۵۴۶s = drawable;
        return drawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.clans.fab.FloatingActionButton$a  reason: invalid class name */
    public class Ca extends ViewOutlineProvider {
        Ca(FloatingActionButton this$0) {
        }

        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private Drawable m۱۶۸۷۶a(int color) {
        Cd shapeDrawable = new Cd(this, new OvalShape(), null);
        shapeDrawable.getPaint().setColor(color);
        return shapeDrawable;
    }

    @TargetApi(16)
    private void setBackgroundCompat(Drawable drawable) {
        if (Cg.m۱۶۹۶۰a()) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: p  reason: contains not printable characters */
    private void m۱۶۸۹۶p() {
        if (!this.f۱۳۵۰۹C) {
            if (this.f۱۳۵۰۷A == -1.0f) {
                this.f۱۳۵۰۷A = getX();
            }
            if (this.f۱۳۵۰۸B == -1.0f) {
                this.f۱۳۵۰۸B = getY();
            }
            this.f۱۳۵۰۹C = true;
        }
    }

    /* renamed from: s  reason: contains not printable characters */
    private void m۱۶۸۹۹s() {
        float y;
        float x;
        if (this.f۱۳۵۴۹v) {
            x = this.f۱۳۵۰۷A > getX() ? getX() + ((float) this.f۱۳۵۵۰w) : getX() - ((float) this.f۱۳۵۵۰w);
            y = this.f۱۳۵۰۸B > getY() ? getY() + ((float) this.f۱۳۵۵۰w) : getY() - ((float) this.f۱۳۵۵۰w);
        } else {
            x = this.f۱۳۵۰۷A;
            y = this.f۱۳۵۰۸B;
        }
        setX(x);
        setY(y);
    }

    /* renamed from: q  reason: contains not printable characters */
    private void m۱۶۸۹۷q() {
        this.f۱۳۵۱۱E.setColor(this.f۱۳۵۵۲y);
        this.f۱۳۵۱۱E.setStyle(Paint.Style.STROKE);
        this.f۱۳۵۱۱E.setStrokeWidth((float) this.f۱۳۵۵۰w);
        this.f۱۳۵۱۲F.setColor(this.f۱۳۵۵۱x);
        this.f۱۳۵۱۲F.setStyle(Paint.Style.STROKE);
        this.f۱۳۵۱۲F.setStrokeWidth((float) this.f۱۳۵۵۰w);
    }

    /* renamed from: r  reason: contains not printable characters */
    private void m۱۶۸۹۸r() {
        int circleInsetVertical = 0;
        int circleInsetHorizontal = m۱۶۹۰۶c() ? getShadowX() : 0;
        if (m۱۶۹۰۶c()) {
            circleInsetVertical = getShadowY();
        }
        int i = this.f۱۳۵۵۰w;
        this.f۱۳۵۱۰D = new RectF((float) ((i / 2) + circleInsetHorizontal), (float) ((i / 2) + circleInsetVertical), (float) ((m۱۶۸۹۴n() - circleInsetHorizontal) - (this.f۱۳۵۵۰w / 2)), (float) ((m۱۶۸۹۳m() - circleInsetVertical) - (this.f۱۳۵۵۰w / 2)));
    }

    /* access modifiers changed from: package-private */
    public Animation getShowAnimation() {
        return this.f۱۳۵۴۲o;
    }

    /* access modifiers changed from: package-private */
    public Animation getHideAnimation() {
        return this.f۱۳۵۴۳p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۶۹۱۱h() {
        this.f۱۳۵۴۳p.cancel();
        startAnimation(this.f۱۳۵۴۲o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۶۹۱۰g() {
        this.f۱۳۵۴۲o.cancel();
        startAnimation(this.f۱۳۵۴۳p);
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener getOnClickListener() {
        return this.f۱۳۵۴۵r;
    }

    /* access modifiers changed from: package-private */
    public Ca getLabelView() {
        return (Ca) getTag(Ce.fab_label);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۹۰۱a(int colorNormal, int colorPressed, int colorRipple) {
        this.f۱۳۵۳۶i = colorNormal;
        this.f۱۳۵۳۷j = colorPressed;
        this.f۱۳۵۳۹l = colorRipple;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(21)
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۶۹۰۸e() {
        Drawable drawable = this.f۱۳۵۴۶s;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{16842910, 16842919});
        } else if (Cg.m۱۶۹۶۱b()) {
            RippleDrawable ripple = (RippleDrawable) this.f۱۳۵۴۶s;
            ripple.setState(new int[]{16842910, 16842919});
            ripple.setHotspot(m۱۶۸۹۱k(), m۱۶۸۹۲l());
            ripple.setVisible(true, true);
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(21)
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۶۹۰۹f() {
        Drawable drawable = this.f۱۳۵۴۶s;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{16842910});
        } else if (Cg.m۱۶۹۶۱b()) {
            RippleDrawable ripple = (RippleDrawable) this.f۱۳۵۴۶s;
            ripple.setState(new int[]{16842910});
            ripple.setHotspot(m۱۶۸۹۱k(), m۱۶۸۹۲l());
            ripple.setVisible(true, true);
        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (this.f۱۳۵۴۵r != null && isEnabled()) {
            Ca label = (Ca) getTag(Ce.fab_label);
            if (label == null) {
                return super.onTouchEvent(event);
            }
            int action = event.getAction();
            if (action == 1) {
                if (label != null) {
                    label.m۱۶۹۵۶e();
                }
                m۱۶۹۰۹f();
            } else if (action == 3) {
                if (label != null) {
                    label.m۱۶۹۵۶e();
                }
                m۱۶۹۰۹f();
            }
            this.f۱۳۵۲۹W.onTouchEvent(event);
        }
        return super.onTouchEvent(event);
    }

    /* renamed from: com.github.clans.fab.FloatingActionButton$b  reason: invalid class name */
    class Cb extends GestureDetector.SimpleOnGestureListener {
        Cb() {
        }

        public boolean onDown(MotionEvent e) {
            Ca label = (Ca) FloatingActionButton.this.getTag(Ce.fab_label);
            if (label != null) {
                label.m۱۶۹۵۵d();
            }
            FloatingActionButton.this.m۱۶۹۰۸e();
            return super.onDown(e);
        }

        public boolean onSingleTapUp(MotionEvent e) {
            Ca label = (Ca) FloatingActionButton.this.getTag(Ce.fab_label);
            if (label != null) {
                label.m۱۶۹۵۶e();
            }
            FloatingActionButton.this.m۱۶۹۰۹f();
            return super.onSingleTapUp(e);
        }
    }

    public Parcelable onSaveInstanceState() {
        Ce ss = new Ce(super.onSaveInstanceState());
        ss.f۱۳۵۵۹c = this.f۱۳۵۲۱O;
        ss.f۱۳۵۶۰d = this.f۱۳۵۲۲P;
        ss.f۱۳۵۶۱e = this.f۱۳۵۱۵I;
        ss.f۱۳۵۶۳g = this.f۱۳۵۵۰w;
        ss.f۱۳۵۶۴h = this.f۱۳۵۵۱x;
        ss.f۱۳۵۶۵i = this.f۱۳۵۵۲y;
        boolean z = this.f۱۳۵۱۳G;
        ss.f۱۳۵۶۹m = z;
        ss.f۱۳۵۷۰n = this.f۱۳۵۴۹v && this.f۱۳۵۲۳Q > 0 && !z;
        ss.f۱۳۵۶۲f = this.f۱۳۵۲۳Q;
        ss.f۱۳۵۷۱o = this.f۱۳۵۲۴R;
        ss.f۱۳۵۷۲p = this.f۱۳۵۲۸V;
        return ss;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof Ce)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Ce ss = (Ce) state;
        super.onRestoreInstanceState(ss.getSuperState());
        this.f۱۳۵۲۱O = ss.f۱۳۵۵۹c;
        this.f۱۳۵۲۲P = ss.f۱۳۵۶۰d;
        this.f۱۳۵۱۵I = ss.f۱۳۵۶۱e;
        this.f۱۳۵۵۰w = ss.f۱۳۵۶۳g;
        this.f۱۳۵۵۱x = ss.f۱۳۵۶۴h;
        this.f۱۳۵۵۲y = ss.f۱۳۵۶۵i;
        this.f۱۳۵۲۵S = ss.f۱۳۵۶۹m;
        this.f۱۳۵۲۶T = ss.f۱۳۵۷۰n;
        this.f۱۳۵۲۳Q = ss.f۱۳۵۶۲f;
        this.f۱۳۵۲۴R = ss.f۱۳۵۷۱o;
        this.f۱۳۵۲۸V = ss.f۱۳۵۷۲p;
        this.f۱۳۵۱۴H = SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.github.clans.fab.FloatingActionButton$d  reason: invalid class name */
    public class Cd extends ShapeDrawable {

        /* renamed from: a  reason: contains not printable characters */
        private int f۱۳۵۵۶a;

        /* renamed from: b  reason: contains not printable characters */
        private int f۱۳۵۵۷b;

        /* synthetic */ Cd(FloatingActionButton x0, Shape x1, Ca x2) {
            this(x1);
        }

        private Cd(Shape s) {
            super(s);
            int i = 0;
            this.f۱۳۵۵۶a = FloatingActionButton.this.m۱۶۹۰۶c() ? FloatingActionButton.this.f۱۳۵۳۳f + Math.abs(FloatingActionButton.this.f۱۳۵۳۴g) : 0;
            this.f۱۳۵۵۷b = FloatingActionButton.this.m۱۶۹۰۶c() ? Math.abs(FloatingActionButton.this.f۱۳۵۳۵h) + FloatingActionButton.this.f۱۳۵۳۳f : i;
            if (FloatingActionButton.this.f۱۳۵۴۹v) {
                this.f۱۳۵۵۶a += FloatingActionButton.this.f۱۳۵۵۰w;
                this.f۱۳۵۵۷b += FloatingActionButton.this.f۱۳۵۵۰w;
            }
        }

        public void draw(Canvas canvas) {
            setBounds(this.f۱۳۵۵۶a, this.f۱۳۵۵۷b, FloatingActionButton.this.m۱۶۸۹۴n() - this.f۱۳۵۵۶a, FloatingActionButton.this.m۱۶۸۹۳m() - this.f۱۳۵۵۷b);
            super.draw(canvas);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.github.clans.fab.FloatingActionButton$f  reason: invalid class name */
    public class Cf extends Drawable {

        /* renamed from: a  reason: contains not printable characters */
        private Paint f۱۳۵۷۳a;

        /* renamed from: b  reason: contains not printable characters */
        private Paint f۱۳۵۷۴b;

        /* renamed from: c  reason: contains not printable characters */
        private float f۱۳۵۷۵c;

        /* synthetic */ Cf(FloatingActionButton x0, Ca x1) {
            this();
        }

        private Cf() {
            this.f۱۳۵۷۳a = new Paint(1);
            this.f۱۳۵۷۴b = new Paint(1);
            m۱۶۹۱۳a();
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۶۹۱۳a() {
            FloatingActionButton.this.setLayerType(1, null);
            this.f۱۳۵۷۳a.setStyle(Paint.Style.FILL);
            this.f۱۳۵۷۳a.setColor(FloatingActionButton.this.f۱۳۵۳۶i);
            this.f۱۳۵۷۴b.setXfermode(FloatingActionButton.f۱۳۵۰۶a0);
            if (!FloatingActionButton.this.isInEditMode()) {
                Paint paint = this.f۱۳۵۷۳a;
                FloatingActionButton floatingActionButton = FloatingActionButton.this;
                paint.setShadowLayer((float) floatingActionButton.f۱۳۵۳۳f, (float) floatingActionButton.f۱۳۵۳۴g, (float) floatingActionButton.f۱۳۵۳۵h, floatingActionButton.f۱۳۵۳۲e);
            }
            this.f۱۳۵۷۵c = (float) (FloatingActionButton.this.getCircleSize() / 2);
            if (FloatingActionButton.this.f۱۳۵۴۹v && FloatingActionButton.this.f۱۳۵۲۸V) {
                this.f۱۳۵۷۵c += (float) FloatingActionButton.this.f۱۳۵۵۰w;
            }
        }

        public void draw(Canvas canvas) {
            canvas.drawCircle(FloatingActionButton.this.m۱۶۸۹۱k(), FloatingActionButton.this.m۱۶۸۹۲l(), this.f۱۳۵۷۵c, this.f۱۳۵۷۳a);
            canvas.drawCircle(FloatingActionButton.this.m۱۶۸۹۱k(), FloatingActionButton.this.m۱۶۸۹۲l(), this.f۱۳۵۷۵c, this.f۱۳۵۷۴b);
        }

        public void setAlpha(int alpha) {
        }

        public void setColorFilter(ColorFilter cf) {
        }

        public int getOpacity() {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.clans.fab.FloatingActionButton$e  reason: invalid class name */
    public static class Ce extends View.BaseSavedState {
        public static final Parcelable.Creator<Ce> CREATOR = new Ca();

        /* renamed from: c  reason: contains not printable characters */
        float f۱۳۵۵۹c;

        /* renamed from: d  reason: contains not printable characters */
        float f۱۳۵۶۰d;

        /* renamed from: e  reason: contains not printable characters */
        float f۱۳۵۶۱e;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۳۵۶۲f;

        /* renamed from: g  reason: contains not printable characters */
        int f۱۳۵۶۳g;

        /* renamed from: h  reason: contains not printable characters */
        int f۱۳۵۶۴h;

        /* renamed from: i  reason: contains not printable characters */
        int f۱۳۵۶۵i;

        /* renamed from: j  reason: contains not printable characters */
        boolean f۱۳۵۶۶j;

        /* renamed from: k  reason: contains not printable characters */
        boolean f۱۳۵۶۷k;

        /* renamed from: l  reason: contains not printable characters */
        boolean f۱۳۵۶۸l;

        /* renamed from: m  reason: contains not printable characters */
        boolean f۱۳۵۶۹m;

        /* renamed from: n  reason: contains not printable characters */
        boolean f۱۳۵۷۰n;

        /* renamed from: o  reason: contains not printable characters */
        boolean f۱۳۵۷۱o;

        /* renamed from: p  reason: contains not printable characters */
        boolean f۱۳۵۷۲p;

        /* synthetic */ Ce(Parcel x0, Ca x1) {
            this(x0);
        }

        Ce(Parcelable superState) {
            super(superState);
        }

        private Ce(Parcel in) {
            super(in);
            this.f۱۳۵۵۹c = in.readFloat();
            this.f۱۳۵۶۰d = in.readFloat();
            boolean z = true;
            this.f۱۳۵۶۶j = in.readInt() != 0;
            this.f۱۳۵۶۱e = in.readFloat();
            this.f۱۳۵۶۲f = in.readInt();
            this.f۱۳۵۶۳g = in.readInt();
            this.f۱۳۵۶۴h = in.readInt();
            this.f۱۳۵۶۵i = in.readInt();
            this.f۱۳۵۶۷k = in.readInt() != 0;
            this.f۱۳۵۶۸l = in.readInt() != 0;
            this.f۱۳۵۶۹m = in.readInt() != 0;
            this.f۱۳۵۷۰n = in.readInt() != 0;
            this.f۱۳۵۷۱o = in.readInt() != 0;
            this.f۱۳۵۷۲p = in.readInt() == 0 ? false : z;
        }

        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeFloat(this.f۱۳۵۵۹c);
            out.writeFloat(this.f۱۳۵۶۰d);
            out.writeInt(this.f۱۳۵۶۶j ? 1 : 0);
            out.writeFloat(this.f۱۳۵۶۱e);
            out.writeInt(this.f۱۳۵۶۲f);
            out.writeInt(this.f۱۳۵۶۳g);
            out.writeInt(this.f۱۳۵۶۴h);
            out.writeInt(this.f۱۳۵۶۵i);
            out.writeInt(this.f۱۳۵۶۷k ? 1 : 0);
            out.writeInt(this.f۱۳۵۶۸l ? 1 : 0);
            out.writeInt(this.f۱۳۵۶۹m ? 1 : 0);
            out.writeInt(this.f۱۳۵۷۰n ? 1 : 0);
            out.writeInt(this.f۱۳۵۷۱o ? 1 : 0);
            out.writeInt(this.f۱۳۵۷۲p ? 1 : 0);
        }

        /* renamed from: com.github.clans.fab.FloatingActionButton$e$a  reason: invalid class name */
        static class Ca implements Parcelable.Creator<Ce> {
            Ca() {
            }

            @Override // android.os.Parcelable.Creator
            public Ce createFromParcel(Parcel in) {
                return new Ce(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public Ce[] newArray(int size) {
                return new Ce[size];
            }
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f۱۳۵۴۰m != drawable) {
            this.f۱۳۵۴۰m = drawable;
            m۱۶۹۱۲i();
        }
    }

    public void setImageResource(int resId) {
        Drawable drawable = getResources().getDrawable(resId);
        if (this.f۱۳۵۴۰m != drawable) {
            this.f۱۳۵۴۰m = drawable;
            m۱۶۹۱۲i();
        }
    }

    public void setOnClickListener(View.OnClickListener l) {
        super.setOnClickListener(l);
        this.f۱۳۵۴۵r = l;
        View label = (View) getTag(Ce.fab_label);
        if (label != null) {
            label.setOnClickListener(new View$OnClickListenerCc());
        }
    }

    /* renamed from: com.github.clans.fab.FloatingActionButton$c  reason: invalid class name */
    class View$OnClickListenerCc implements View.OnClickListener {
        View$OnClickListenerCc() {
        }

        public void onClick(View v) {
            if (FloatingActionButton.this.f۱۳۵۴۵r != null) {
                FloatingActionButton.this.f۱۳۵۴۵r.onClick(FloatingActionButton.this);
            }
        }
    }

    public void setButtonSize(int size) {
        if (size != 0 && size != 1) {
            throw new IllegalArgumentException("Use @FabSize constants only!");
        } else if (this.f۱۳۵۳۰c != size) {
            this.f۱۳۵۳۰c = size;
            m۱۶۹۱۲i();
        }
    }

    public int getButtonSize() {
        return this.f۱۳۵۳۰c;
    }

    public void setColorNormal(int color) {
        if (this.f۱۳۵۳۶i != color) {
            this.f۱۳۵۳۶i = color;
            m۱۶۹۱۲i();
        }
    }

    public void setColorNormalResId(int colorResId) {
        setColorNormal(getResources().getColor(colorResId));
    }

    public int getColorNormal() {
        return this.f۱۳۵۳۶i;
    }

    public void setColorPressed(int color) {
        if (color != this.f۱۳۵۳۷j) {
            this.f۱۳۵۳۷j = color;
            m۱۶۹۱۲i();
        }
    }

    public void setColorPressedResId(int colorResId) {
        setColorPressed(getResources().getColor(colorResId));
    }

    public int getColorPressed() {
        return this.f۱۳۵۳۷j;
    }

    public void setColorRipple(int color) {
        if (color != this.f۱۳۵۳۹l) {
            this.f۱۳۵۳۹l = color;
            m۱۶۹۱۲i();
        }
    }

    public void setColorRippleResId(int colorResId) {
        setColorRipple(getResources().getColor(colorResId));
    }

    public int getColorRipple() {
        return this.f۱۳۵۳۹l;
    }

    public void setColorDisabled(int color) {
        if (color != this.f۱۳۵۳۸k) {
            this.f۱۳۵۳۸k = color;
            m۱۶۹۱۲i();
        }
    }

    public void setColorDisabledResId(int colorResId) {
        setColorDisabled(getResources().getColor(colorResId));
    }

    public int getColorDisabled() {
        return this.f۱۳۵۳۸k;
    }

    public void setShowShadow(boolean show) {
        if (this.f۱۳۵۳۱d != show) {
            this.f۱۳۵۳۱d = show;
            m۱۶۹۱۲i();
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۶۹۰۶c() {
        return !this.f۱۳۵۴۷t && this.f۱۳۵۳۱d;
    }

    public void setShadowRadius(int dimenResId) {
        int shadowRadius = getResources().getDimensionPixelSize(dimenResId);
        if (this.f۱۳۵۳۳f != shadowRadius) {
            this.f۱۳۵۳۳f = shadowRadius;
            requestLayout();
            m۱۶۹۱۲i();
        }
    }

    public void setShadowRadius(float shadowRadiusDp) {
        this.f۱۳۵۳۳f = Cg.m۱۶۹۵۹a(getContext(), shadowRadiusDp);
        requestLayout();
        m۱۶۹۱۲i();
    }

    public int getShadowRadius() {
        return this.f۱۳۵۳۳f;
    }

    public void setShadowXOffset(int dimenResId) {
        int shadowXOffset = getResources().getDimensionPixelSize(dimenResId);
        if (this.f۱۳۵۳۴g != shadowXOffset) {
            this.f۱۳۵۳۴g = shadowXOffset;
            requestLayout();
            m۱۶۹۱۲i();
        }
    }

    public void setShadowXOffset(float shadowXOffsetDp) {
        this.f۱۳۵۳۴g = Cg.m۱۶۹۵۹a(getContext(), shadowXOffsetDp);
        requestLayout();
        m۱۶۹۱۲i();
    }

    public int getShadowXOffset() {
        return this.f۱۳۵۳۴g;
    }

    public void setShadowYOffset(int dimenResId) {
        int shadowYOffset = getResources().getDimensionPixelSize(dimenResId);
        if (this.f۱۳۵۳۵h != shadowYOffset) {
            this.f۱۳۵۳۵h = shadowYOffset;
            requestLayout();
            m۱۶۹۱۲i();
        }
    }

    public void setShadowYOffset(float shadowYOffsetDp) {
        this.f۱۳۵۳۵h = Cg.m۱۶۹۵۹a(getContext(), shadowYOffsetDp);
        requestLayout();
        m۱۶۹۱۲i();
    }

    public int getShadowYOffset() {
        return this.f۱۳۵۳۵h;
    }

    public void setShadowColorResource(int colorResId) {
        int shadowColor = getResources().getColor(colorResId);
        if (this.f۱۳۵۳۲e != shadowColor) {
            this.f۱۳۵۳۲e = shadowColor;
            m۱۶۹۱۲i();
        }
    }

    public void setShadowColor(int color) {
        if (this.f۱۳۵۳۲e != color) {
            this.f۱۳۵۳۲e = color;
            m۱۶۹۱۲i();
        }
    }

    public int getShadowColor() {
        return this.f۱۳۵۳۲e;
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۶۹۰۷d() {
        return getVisibility() == 4;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۹۰۵b(boolean animate) {
        if (m۱۶۹۰۷d()) {
            if (animate) {
                m۱۶۹۱۱h();
            }
            super.setVisibility(0);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۹۰۳a(boolean animate) {
        if (!m۱۶۹۰۷d()) {
            if (animate) {
                m۱۶۹۱۰g();
            }
            super.setVisibility(4);
        }
    }

    public void setLabelText(String text) {
        this.f۱۳۵۴۴q = text;
        TextView labelView = getLabelView();
        if (labelView != null) {
            labelView.setText(text);
        }
    }

    public String getLabelText() {
        return this.f۱۳۵۴۴q;
    }

    public void setShowAnimation(Animation showAnimation) {
        this.f۱۳۵۴۲o = showAnimation;
    }

    public void setHideAnimation(Animation hideAnimation) {
        this.f۱۳۵۴۳p = hideAnimation;
    }

    public void setLabelVisibility(int visibility) {
        Ca labelView = getLabelView();
        if (labelView != null) {
            labelView.setVisibility(visibility);
            labelView.setHandleVisibilityChanges(visibility == 0);
        }
    }

    public int getLabelVisibility() {
        TextView labelView = getLabelView();
        if (labelView != null) {
            return labelView.getVisibility();
        }
        return -1;
    }

    public void setElevation(float elevation) {
        if (Cg.m۱۶۹۶۱b() && elevation > 0.0f) {
            super.setElevation(elevation);
            if (!isInEditMode()) {
                this.f۱۳۵۴۷t = true;
                this.f۱۳۵۳۱d = false;
            }
            m۱۶۹۱۲i();
        }
    }

    @TargetApi(21)
    public void setElevationCompat(float elevation) {
        this.f۱۳۵۳۲e = 637534208;
        this.f۱۳۵۳۳f = Math.round(elevation / 2.0f);
        this.f۱۳۵۳۴g = 0;
        this.f۱۳۵۳۵h = Math.round(this.f۱۳۵۳۰c == 0 ? elevation : elevation / 2.0f);
        if (Cg.m۱۶۹۶۱b()) {
            super.setElevation(elevation);
            this.f۱۳۵۴۸u = true;
            this.f۱۳۵۳۱d = false;
            m۱۶۹۱۲i();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f۱۳۵۳۱d = true;
        m۱۶۹۱۲i();
    }

    public synchronized void setIndeterminate(boolean indeterminate) {
        if (!indeterminate) {
            this.f۱۳۵۲۱O = 0.0f;
        }
        this.f۱۳۵۴۹v = indeterminate;
        this.f۱۳۵۵۳z = true;
        this.f۱۳۵۱۳G = indeterminate;
        this.f۱۳۵۱۴H = SystemClock.uptimeMillis();
        m۱۶۸۹۸r();
        m۱۶۹۱۲i();
    }

    public synchronized void setMax(int max) {
        this.f۱۳۵۲۷U = max;
    }

    public synchronized int getMax() {
        return this.f۱۳۵۲۷U;
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۶۹۰۲a(int progress, boolean animate) {
        if (!this.f۱۳۵۱۳G) {
            this.f۱۳۵۲۳Q = progress;
            this.f۱۳۵۲۴R = animate;
            if (!this.f۱۳۵۰۹C) {
                this.f۱۳۵۲۶T = true;
                return;
            }
            this.f۱۳۵۴۹v = true;
            this.f۱۳۵۵۳z = true;
            m۱۶۸۹۸r();
            m۱۶۸۹۶p();
            m۱۶۹۱۲i();
            if (progress < 0) {
                progress = 0;
            } else if (progress > this.f۱۳۵۲۷U) {
                progress = this.f۱۳۵۲۷U;
            }
            if (((float) progress) != this.f۱۳۵۲۲P) {
                this.f۱۳۵۲۲P = this.f۱۳۵۲۷U > 0 ? (((float) progress) / ((float) this.f۱۳۵۲۷U)) * 360.0f : 0.0f;
                this.f۱۳۵۱۴H = SystemClock.uptimeMillis();
                if (!animate) {
                    this.f۱۳۵۲۱O = this.f۱۳۵۲۲P;
                }
                invalidate();
            }
        }
    }

    public synchronized int getProgress() {
        return this.f۱۳۵۱۳G ? 0 : this.f۱۳۵۲۳Q;
    }

    public synchronized void setShowProgressBackground(boolean show) {
        this.f۱۳۵۲۸V = show;
    }

    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Ca label = (Ca) getTag(Ce.fab_label);
        if (label != null) {
            label.setEnabled(enabled);
        }
    }

    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        Ca label = (Ca) getTag(Ce.fab_label);
        if (label != null) {
            label.setVisibility(visibility);
        }
    }

    public void setLabelTextColor(int color) {
        getLabelView().setTextColor(color);
    }

    public void setLabelTextColor(ColorStateList colors) {
        getLabelView().setTextColor(colors);
    }
}
