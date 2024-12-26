package com.heinrichreimersoftware.materialintro.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.p۰۴۳v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Arrays;

public class InkPageIndicator extends View implements ViewPager.AbstractCj, View.OnAttachStateChangeListener {

    /* renamed from: A  reason: contains not printable characters */
    private final Paint f۱۳۶۷۸A;

    /* renamed from: B  reason: contains not printable characters */
    private final Paint f۱۳۶۷۹B;

    /* renamed from: C  reason: contains not printable characters */
    private final Path f۱۳۶۸۰C;

    /* renamed from: D  reason: contains not printable characters */
    private final Path f۱۳۶۸۱D;

    /* renamed from: E  reason: contains not printable characters */
    private final Path f۱۳۶۸۲E;

    /* renamed from: F  reason: contains not printable characters */
    private final Path f۱۳۶۸۳F;

    /* renamed from: G  reason: contains not printable characters */
    private final RectF f۱۳۶۸۴G;

    /* renamed from: H  reason: contains not printable characters */
    private Cf f۱۳۶۸۵H;

    /* renamed from: I  reason: contains not printable characters */
    private Cg[] f۱۳۶۸۶I;

    /* renamed from: J  reason: contains not printable characters */
    private final Interpolator f۱۳۶۸۷J;

    /* renamed from: K  reason: contains not printable characters */
    float f۱۳۶۸۸K;

    /* renamed from: L  reason: contains not printable characters */
    float f۱۳۶۸۹L;

    /* renamed from: M  reason: contains not printable characters */
    float f۱۳۶۹۰M;

    /* renamed from: N  reason: contains not printable characters */
    float f۱۳۶۹۱N;

    /* renamed from: O  reason: contains not printable characters */
    float f۱۳۶۹۲O;

    /* renamed from: P  reason: contains not printable characters */
    float f۱۳۶۹۳P;

    /* renamed from: Q  reason: contains not printable characters */
    float f۱۳۶۹۴Q;

    /* renamed from: R  reason: contains not printable characters */
    float f۱۳۶۹۵R;

    /* renamed from: S  reason: contains not printable characters */
    private boolean f۱۳۶۹۶S;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۳۶۹۷c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۳۶۹۸d;

    /* renamed from: e  reason: contains not printable characters */
    private long f۱۳۶۹۹e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۳۷۰۰f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۳۷۰۱g;

    /* renamed from: h  reason: contains not printable characters */
    private float f۱۳۷۰۲h;

    /* renamed from: i  reason: contains not printable characters */
    private float f۱۳۷۰۳i;

    /* renamed from: j  reason: contains not printable characters */
    private long f۱۳۷۰۴j;

    /* renamed from: k  reason: contains not printable characters */
    private float f۱۳۷۰۵k;

    /* renamed from: l  reason: contains not printable characters */
    private float f۱۳۷۰۶l;

    /* renamed from: m  reason: contains not printable characters */
    private float f۱۳۷۰۷m;

    /* renamed from: n  reason: contains not printable characters */
    private ViewPager f۱۳۷۰۸n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۳۷۰۹o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۳۷۱۰p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۳۷۱۱q;

    /* renamed from: r  reason: contains not printable characters */
    private float f۱۳۷۱۲r;

    /* renamed from: s  reason: contains not printable characters */
    private boolean f۱۳۷۱۳s;

    /* renamed from: t  reason: contains not printable characters */
    private float[] f۱۳۷۱۴t;

    /* renamed from: u  reason: contains not printable characters */
    private float[] f۱۳۷۱۵u;

    /* renamed from: v  reason: contains not printable characters */
    private float f۱۳۷۱۶v;

    /* renamed from: w  reason: contains not printable characters */
    private float f۱۳۷۱۷w;

    /* renamed from: x  reason: contains not printable characters */
    private float[] f۱۳۷۱۸x;

    /* renamed from: y  reason: contains not printable characters */
    private boolean f۱۳۷۱۹y;

    /* renamed from: z  reason: contains not printable characters */
    private boolean f۱۳۷۲۰z;

    public InkPageIndicator(Context context) {
        this(context, null, 0);
    }

    public InkPageIndicator(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public InkPageIndicator(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f۱۳۷۰۹o = 0;
        this.f۱۳۷۱۰p = 0;
        this.f۱۳۶۹۶S = false;
        int density = (int) context.getResources().getDisplayMetrics().density;
        TypedArray a = getContext().obtainStyledAttributes(attrs, p۰۵۲b.p۱۰۰g.p۱۰۱a.Ca.InkPageIndicator, defStyle, 0);
        this.f۱۳۶۹۷c = a.getDimensionPixelSize(p۰۵۲b.p۱۰۰g.p۱۰۱a.Ca.InkPageIndicator_dotDiameter, density * 8);
        this.f۱۳۷۰۲h = (float) (this.f۱۳۶۹۷c / 2);
        this.f۱۳۷۰۳i = this.f۱۳۷۰۲h / 2.0f;
        this.f۱۳۶۹۸d = a.getDimensionPixelSize(p۰۵۲b.p۱۰۰g.p۱۰۱a.Ca.InkPageIndicator_dotGap, density * 12);
        this.f۱۳۶۹۹e = (long) a.getInteger(p۰۵۲b.p۱۰۰g.p۱۰۱a.Ca.InkPageIndicator_animationDuration, 400);
        this.f۱۳۷۰۴j = this.f۱۳۶۹۹e / 2;
        this.f۱۳۷۰۰f = a.getColor(p۰۵۲b.p۱۰۰g.p۱۰۱a.Ca.InkPageIndicator_pageIndicatorColor, -2130706433);
        this.f۱۳۷۰۱g = a.getColor(p۰۵۲b.p۱۰۰g.p۱۰۱a.Ca.InkPageIndicator_currentPageIndicatorColor, -1);
        a.recycle();
        this.f۱۳۶۷۸A = new Paint(1);
        this.f۱۳۶۷۸A.setColor(this.f۱۳۷۰۰f);
        this.f۱۳۶۷۹B = new Paint(1);
        this.f۱۳۶۷۹B.setColor(this.f۱۳۷۰۱g);
        this.f۱۳۶۸۷J = p۰۵۲b.p۱۰۰g.p۱۰۱a.p۱۰۲b.Ca.m۱۶۱۸۵a(context);
        this.f۱۳۶۸۰C = new Path();
        this.f۱۳۶۸۱D = new Path();
        this.f۱۳۶۸۲E = new Path();
        this.f۱۳۶۸۳F = new Path();
        this.f۱۳۶۸۴G = new RectF();
        addOnAttachStateChangeListener(this);
    }

    public int getPageIndicatorColor() {
        return this.f۱۳۶۷۸A.getColor();
    }

    public void setPageIndicatorColor(int pageIndicatorColor) {
        this.f۱۳۶۷۸A.setColor(pageIndicatorColor);
        invalidate();
    }

    public int getCurrentPageIndicatorColor() {
        return this.f۱۳۶۷۹B.getColor();
    }

    public void setCurrentPageIndicatorColor(int currentPageIndicatorColor) {
        this.f۱۳۶۷۹B.setColor(currentPageIndicatorColor);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f۱۳۷۰۸n = viewPager;
        viewPager.m۱۲۷۶۶a((ViewPager.AbstractCj) this);
        setPageCount(viewPager.getAdapter().m۱۲۹۵۱a());
        viewPager.getAdapter().m۱۲۹۵۵a((DataSetObserver) new Ca());
    }

    /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$a  reason: invalid class name */
    class Ca extends DataSetObserver {
        Ca() {
        }

        public void onChanged() {
            InkPageIndicator inkPageIndicator = InkPageIndicator.this;
            inkPageIndicator.setPageCount(inkPageIndicator.f۱۳۷۰۸n.getAdapter().m۱۲۹۵۱a());
            InkPageIndicator.this.invalidate();
        }
    }

    @Override // android.support.p۰۴۳v4.view.ViewPager.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۰۱۳a(int position, float positionOffset, int positionOffsetPixels) {
        if (this.f۱۳۷۱۹y) {
            float fraction = positionOffset;
            int currentPosition = this.f۱۳۷۲۰z ? this.f۱۳۷۱۱q : this.f۱۳۷۱۰p;
            int leftDotPosition = position;
            if (currentPosition != position) {
                fraction = 1.0f - positionOffset;
                if (fraction == 1.0f) {
                    leftDotPosition = Math.min(currentPosition, position);
                }
            }
            m۱۶۹۹۷b(leftDotPosition, fraction);
        }
    }

    @Override // android.support.p۰۴۳v4.view.ViewPager.AbstractCj
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۰۱۴b(int position) {
        if (this.f۱۳۷۱۹y) {
            setSelectedPage(position);
        } else {
            m۱۷۰۰۱c();
        }
    }

    @Override // android.support.p۰۴۳v4.view.ViewPager.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۰۱۲a(int state) {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPageCount(int pages) {
        this.f۱۳۷۰۹o = pages;
        m۱۶۹۸۸a(getWidth(), getHeight());
        m۱۶۹۹۶b();
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h, int oldW, int oldH) {
        m۱۶۹۸۸a(w, h);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۹۸۸a(int width, int height) {
        if (this.f۱۳۶۹۶S) {
            int left = getPaddingLeft();
            float middle = ((float) getPaddingTop()) + (((float) (height - getPaddingBottom())) / 2.0f);
            float startLeft = ((((float) left) + (((float) (width - getPaddingRight())) / 2.0f)) - (((float) getRequiredWidth()) / 2.0f)) + this.f۱۳۷۰۲h;
            this.f۱۳۷۱۴t = new float[Math.max(1, this.f۱۳۷۰۹o)];
            for (int i = 0; i < this.f۱۳۷۰۹o; i++) {
                this.f۱۳۷۱۴t[i] = ((float) ((this.f۱۳۶۹۷c + this.f۱۳۶۹۸d) * i)) + startLeft;
            }
            float f = this.f۱۳۷۰۲h;
            this.f۱۳۷۰۵k = middle - f;
            this.f۱۳۷۰۶l = middle;
            this.f۱۳۷۰۷m = f + middle;
            m۱۷۰۰۱c();
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۷۰۰۱c() {
        ViewPager viewPager = this.f۱۳۷۰۸n;
        if (viewPager != null) {
            this.f۱۳۷۱۰p = viewPager.getCurrentItem();
        } else {
            this.f۱۳۷۱۰p = 0;
        }
        float[] fArr = this.f۱۳۷۱۴t;
        if (fArr != null) {
            this.f۱۳۷۱۲r = fArr[Math.max(0, Math.min(this.f۱۳۷۱۰p, fArr.length - 1))];
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۹۹۶b() {
        this.f۱۳۷۱۵u = new float[Math.max(this.f۱۳۷۰۹o - 1, 0)];
        Arrays.fill(this.f۱۳۷۱۵u, 0.0f);
        this.f۱۳۷۱۸x = new float[this.f۱۳۷۰۹o];
        Arrays.fill(this.f۱۳۷۱۸x, 0.0f);
        this.f۱۳۷۱۶v = -1.0f;
        this.f۱۳۷۱۷w = -1.0f;
        this.f۱۳۷۱۳s = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int height;
        int width;
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            height = Math.min(desiredHeight, View.MeasureSpec.getSize(heightMeasureSpec));
        } else if (mode != 1073741824) {
            height = desiredHeight;
        } else {
            height = View.MeasureSpec.getSize(heightMeasureSpec);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode2 == Integer.MIN_VALUE) {
            width = Math.min(desiredWidth, View.MeasureSpec.getSize(widthMeasureSpec));
        } else if (mode2 != 1073741824) {
            width = desiredWidth;
        } else {
            width = View.MeasureSpec.getSize(widthMeasureSpec);
        }
        setMeasuredDimension(width, height);
        if (!this.f۱۳۶۹۶S) {
            this.f۱۳۶۹۶S = true;
        }
    }

    private int getDesiredHeight() {
        return getPaddingTop() + this.f۱۳۶۹۷c + getPaddingBottom();
    }

    private int getRequiredWidth() {
        int i = this.f۱۳۷۰۹o;
        return (this.f۱۳۶۹۷c * i) + ((i - 1) * this.f۱۳۶۹۸d);
    }

    private int getDesiredWidth() {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    public void onViewAttachedToWindow(View view) {
        this.f۱۳۷۱۹y = true;
    }

    public void onViewDetachedFromWindow(View view) {
        this.f۱۳۷۱۹y = false;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f۱۳۷۰۸n != null && this.f۱۳۷۰۹o != 0) {
            m۱۶۹۹۸b(canvas);
            m۱۶۹۸۹a(canvas);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۹۹۸b(Canvas canvas) {
        this.f۱۳۶۸۰C.rewind();
        int page = 0;
        while (true) {
            int i = this.f۱۳۷۰۹o;
            if (page >= i) {
                break;
            }
            int nextXIndex = page == i + -1 ? page : page + 1;
            float[] fArr = this.f۱۳۷۱۴t;
            Path unselectedPath = m۱۶۹۸۴a(page, fArr[page], fArr[nextXIndex], page == this.f۱۳۷۰۹o + -1 ? -1.0f : this.f۱۳۷۱۵u[page], this.f۱۳۷۱۸x[page]);
            if (Build.VERSION.SDK_INT >= 19) {
                this.f۱۳۶۸۰C.op(unselectedPath, Path.Op.UNION);
            } else {
                this.f۱۳۶۸۰C.addPath(unselectedPath);
            }
            page++;
        }
        if (this.f۱۳۷۱۶v != -1.0f) {
            Path retreatingJoinPath = getRetreatingJoinPath();
            if (Build.VERSION.SDK_INT >= 19) {
                this.f۱۳۶۸۰C.op(retreatingJoinPath, Path.Op.UNION);
            } else {
                this.f۱۳۶۸۰C.addPath(retreatingJoinPath);
            }
        }
        canvas.drawPath(this.f۱۳۶۸۰C, this.f۱۳۶۷۸A);
    }

    /* renamed from: a  reason: contains not printable characters */
    private Path m۱۶۹۸۴a(int page, float centerX, float nextCenterX, float joiningFraction, float dotRevealFraction) {
        this.f۱۳۶۸۱D.rewind();
        if ((joiningFraction == 0.0f || joiningFraction == -1.0f) && dotRevealFraction == 0.0f && (page != this.f۱۳۷۱۰p || !this.f۱۳۷۱۳s)) {
            this.f۱۳۶۸۱D.addCircle(this.f۱۳۷۱۴t[page], this.f۱۳۷۰۶l, this.f۱۳۷۰۲h, Path.Direction.CW);
        }
        if (joiningFraction > 0.0f && joiningFraction <= 0.5f && this.f۱۳۷۱۶v == -1.0f) {
            this.f۱۳۶۸۲E.rewind();
            this.f۱۳۶۸۲E.moveTo(centerX, this.f۱۳۷۰۷m);
            RectF rectF = this.f۱۳۶۸۴G;
            float f = this.f۱۳۷۰۲h;
            rectF.set(centerX - f, this.f۱۳۷۰۵k, f + centerX, this.f۱۳۷۰۷m);
            this.f۱۳۶۸۲E.arcTo(this.f۱۳۶۸۴G, 90.0f, 180.0f, true);
            this.f۱۳۶۸۸K = this.f۱۳۷۰۲h + centerX + (((float) this.f۱۳۶۹۸d) * joiningFraction);
            this.f۱۳۶۸۹L = this.f۱۳۷۰۶l;
            float f2 = this.f۱۳۷۰۳i;
            this.f۱۳۶۹۲O = centerX + f2;
            this.f۱۳۶۹۳P = this.f۱۳۷۰۵k;
            float f3 = this.f۱۳۶۸۸K;
            this.f۱۳۶۹۴Q = f3;
            float f4 = this.f۱۳۶۸۹L;
            this.f۱۳۶۹۵R = f4 - f2;
            this.f۱۳۶۸۲E.cubicTo(this.f۱۳۶۹۲O, this.f۱۳۶۹۳P, this.f۱۳۶۹۴Q, this.f۱۳۶۹۵R, f3, f4);
            this.f۱۳۶۹۰M = centerX;
            float f5 = this.f۱۳۷۰۷m;
            this.f۱۳۶۹۱N = f5;
            this.f۱۳۶۹۲O = this.f۱۳۶۸۸K;
            float f6 = this.f۱۳۶۸۹L;
            float f7 = this.f۱۳۷۰۳i;
            this.f۱۳۶۹۳P = f6 + f7;
            this.f۱۳۶۹۴Q = centerX + f7;
            this.f۱۳۶۹۵R = f5;
            this.f۱۳۶۸۲E.cubicTo(this.f۱۳۶۹۲O, this.f۱۳۶۹۳P, this.f۱۳۶۹۴Q, this.f۱۳۶۹۵R, this.f۱۳۶۹۰M, this.f۱۳۶۹۱N);
            if (Build.VERSION.SDK_INT >= 19) {
                this.f۱۳۶۸۱D.op(this.f۱۳۶۸۲E, Path.Op.UNION);
            } else {
                this.f۱۳۶۸۱D.addPath(this.f۱۳۶۸۲E);
            }
            this.f۱۳۶۸۳F.rewind();
            this.f۱۳۶۸۳F.moveTo(nextCenterX, this.f۱۳۷۰۷m);
            RectF rectF2 = this.f۱۳۶۸۴G;
            float f8 = this.f۱۳۷۰۲h;
            rectF2.set(nextCenterX - f8, this.f۱۳۷۰۵k, f8 + nextCenterX, this.f۱۳۷۰۷m);
            this.f۱۳۶۸۳F.arcTo(this.f۱۳۶۸۴G, 90.0f, -180.0f, true);
            this.f۱۳۶۸۸K = (nextCenterX - this.f۱۳۷۰۲h) - (((float) this.f۱۳۶۹۸d) * joiningFraction);
            this.f۱۳۶۸۹L = this.f۱۳۷۰۶l;
            float f9 = this.f۱۳۷۰۳i;
            this.f۱۳۶۹۲O = nextCenterX - f9;
            this.f۱۳۶۹۳P = this.f۱۳۷۰۵k;
            float f10 = this.f۱۳۶۸۸K;
            this.f۱۳۶۹۴Q = f10;
            float f11 = this.f۱۳۶۸۹L;
            this.f۱۳۶۹۵R = f11 - f9;
            this.f۱۳۶۸۳F.cubicTo(this.f۱۳۶۹۲O, this.f۱۳۶۹۳P, this.f۱۳۶۹۴Q, this.f۱۳۶۹۵R, f10, f11);
            this.f۱۳۶۹۰M = nextCenterX;
            float f12 = this.f۱۳۷۰۷m;
            this.f۱۳۶۹۱N = f12;
            this.f۱۳۶۹۲O = this.f۱۳۶۸۸K;
            float f13 = this.f۱۳۶۸۹L;
            float f14 = this.f۱۳۷۰۳i;
            this.f۱۳۶۹۳P = f13 + f14;
            float f15 = this.f۱۳۶۹۰M;
            this.f۱۳۶۹۴Q = f15 - f14;
            this.f۱۳۶۹۵R = f12;
            this.f۱۳۶۸۳F.cubicTo(this.f۱۳۶۹۲O, this.f۱۳۶۹۳P, this.f۱۳۶۹۴Q, this.f۱۳۶۹۵R, f15, this.f۱۳۶۹۱N);
            if (Build.VERSION.SDK_INT >= 19) {
                this.f۱۳۶۸۱D.op(this.f۱۳۶۸۳F, Path.Op.UNION);
            } else {
                this.f۱۳۶۸۱D.addPath(this.f۱۳۶۸۳F);
            }
        }
        if (joiningFraction > 0.5f && joiningFraction < 1.0f && this.f۱۳۷۱۶v == -1.0f) {
            float adjustedFraction = (joiningFraction - 0.2f) * 1.25f;
            this.f۱۳۶۸۱D.moveTo(centerX, this.f۱۳۷۰۷m);
            RectF rectF3 = this.f۱۳۶۸۴G;
            float f16 = this.f۱۳۷۰۲h;
            rectF3.set(centerX - f16, this.f۱۳۷۰۵k, f16 + centerX, this.f۱۳۷۰۷m);
            this.f۱۳۶۸۱D.arcTo(this.f۱۳۶۸۴G, 90.0f, 180.0f, true);
            float f17 = this.f۱۳۷۰۲h;
            this.f۱۳۶۸۸K = centerX + f17 + ((float) (this.f۱۳۶۹۸d / 2));
            this.f۱۳۶۸۹L = this.f۱۳۷۰۶l - (adjustedFraction * f17);
            float f18 = this.f۱۳۶۸۸K;
            this.f۱۳۶۹۲O = f18 - (adjustedFraction * f17);
            this.f۱۳۶۹۳P = this.f۱۳۷۰۵k;
            this.f۱۳۶۹۴Q = f18 - ((1.0f - adjustedFraction) * f17);
            float f19 = this.f۱۳۶۸۹L;
            this.f۱۳۶۹۵R = f19;
            this.f۱۳۶۸۱D.cubicTo(this.f۱۳۶۹۲O, this.f۱۳۶۹۳P, this.f۱۳۶۹۴Q, this.f۱۳۶۹۵R, f18, f19);
            this.f۱۳۶۹۰M = nextCenterX;
            float f20 = this.f۱۳۷۰۵k;
            this.f۱۳۶۹۱N = f20;
            float f21 = this.f۱۳۶۸۸K;
            float f22 = this.f۱۳۷۰۲h;
            this.f۱۳۶۹۲O = ((1.0f - adjustedFraction) * f22) + f21;
            this.f۱۳۶۹۳P = this.f۱۳۶۸۹L;
            this.f۱۳۶۹۴Q = f21 + (f22 * adjustedFraction);
            this.f۱۳۶۹۵R = f20;
            this.f۱۳۶۸۱D.cubicTo(this.f۱۳۶۹۲O, this.f۱۳۶۹۳P, this.f۱۳۶۹۴Q, this.f۱۳۶۹۵R, this.f۱۳۶۹۰M, this.f۱۳۶۹۱N);
            RectF rectF4 = this.f۱۳۶۸۴G;
            float f23 = this.f۱۳۷۰۲h;
            rectF4.set(nextCenterX - f23, this.f۱۳۷۰۵k, f23 + nextCenterX, this.f۱۳۷۰۷m);
            this.f۱۳۶۸۱D.arcTo(this.f۱۳۶۸۴G, 270.0f, 180.0f, true);
            float f24 = this.f۱۳۷۰۶l;
            float f25 = this.f۱۳۷۰۲h;
            this.f۱۳۶۸۹L = f24 + (adjustedFraction * f25);
            float f26 = this.f۱۳۶۸۸K;
            this.f۱۳۶۹۲O = (adjustedFraction * f25) + f26;
            this.f۱۳۶۹۳P = this.f۱۳۷۰۷m;
            this.f۱۳۶۹۴Q = ((1.0f - adjustedFraction) * f25) + f26;
            float f27 = this.f۱۳۶۸۹L;
            this.f۱۳۶۹۵R = f27;
            this.f۱۳۶۸۱D.cubicTo(this.f۱۳۶۹۲O, this.f۱۳۶۹۳P, this.f۱۳۶۹۴Q, this.f۱۳۶۹۵R, f26, f27);
            this.f۱۳۶۹۰M = centerX;
            this.f۱۳۶۹۱N = this.f۱۳۷۰۷m;
            float f28 = this.f۱۳۶۸۸K;
            float f29 = this.f۱۳۷۰۲h;
            this.f۱۳۶۹۲O = f28 - ((1.0f - adjustedFraction) * f29);
            this.f۱۳۶۹۳P = this.f۱۳۶۸۹L;
            this.f۱۳۶۹۴Q = f28 - (f29 * adjustedFraction);
            float f30 = this.f۱۳۶۹۱N;
            this.f۱۳۶۹۵R = f30;
            this.f۱۳۶۸۱D.cubicTo(this.f۱۳۶۹۲O, this.f۱۳۶۹۳P, this.f۱۳۶۹۴Q, this.f۱۳۶۹۵R, this.f۱۳۶۹۰M, f30);
        }
        if (joiningFraction == 1.0f && this.f۱۳۷۱۶v == -1.0f) {
            RectF rectF5 = this.f۱۳۶۸۴G;
            float f31 = this.f۱۳۷۰۲h;
            rectF5.set(centerX - f31, this.f۱۳۷۰۵k, f31 + nextCenterX, this.f۱۳۷۰۷m);
            Path path = this.f۱۳۶۸۱D;
            RectF rectF6 = this.f۱۳۶۸۴G;
            float f32 = this.f۱۳۷۰۲h;
            path.addRoundRect(rectF6, f32, f32, Path.Direction.CW);
        }
        if (dotRevealFraction > 1.0E-5f) {
            this.f۱۳۶۸۱D.addCircle(centerX, this.f۱۳۷۰۶l, this.f۱۳۷۰۲h * dotRevealFraction, Path.Direction.CW);
        }
        return this.f۱۳۶۸۱D;
    }

    private Path getRetreatingJoinPath() {
        this.f۱۳۶۸۱D.rewind();
        this.f۱۳۶۸۴G.set(this.f۱۳۷۱۶v, this.f۱۳۷۰۵k, this.f۱۳۷۱۷w, this.f۱۳۷۰۷m);
        Path path = this.f۱۳۶۸۱D;
        RectF rectF = this.f۱۳۶۸۴G;
        float f = this.f۱۳۷۰۲h;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        return this.f۱۳۶۸۱D;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۹۸۹a(Canvas canvas) {
        canvas.drawCircle(this.f۱۳۷۱۲r, this.f۱۳۷۰۶l, this.f۱۳۷۰۲h, this.f۱۳۶۷۹B);
    }

    private void setSelectedPage(int now) {
        int now2 = Math.min(now, this.f۱۳۷۰۹o - 1);
        int i = this.f۱۳۷۱۰p;
        if (now2 != i) {
            this.f۱۳۷۲۰z = true;
            this.f۱۳۷۱۱q = i;
            this.f۱۳۷۱۰p = now2;
            int steps = Math.abs(now2 - this.f۱۳۷۱۱q);
            if (steps > 1) {
                if (now2 > this.f۱۳۷۱۱q) {
                    for (int i2 = 0; i2 < steps; i2++) {
                        m۱۶۹۹۷b(this.f۱۳۷۱۱q + i2, 1.0f);
                    }
                } else {
                    for (int i3 = -1; i3 > (-steps); i3--) {
                        m۱۶۹۹۷b(this.f۱۳۷۱۱q + i3, 1.0f);
                    }
                }
            }
            if (getVisibility() == 0) {
                m۱۶۹۸۳a(this.f۱۳۷۱۴t[now2], this.f۱۳۷۱۱q, now2, steps).start();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private ValueAnimator m۱۶۹۸۳a(float moveTo, int was, int now, int steps) {
        ValueAnimator moveSelected = ValueAnimator.ofFloat(this.f۱۳۷۱۲r, moveTo);
        this.f۱۳۶۸۵H = new Cf(was, now, steps, now > was ? new Ci(this, moveTo - ((moveTo - this.f۱۳۷۱۲r) * 0.25f)) : new Ce(this, ((this.f۱۳۷۱۲r - moveTo) * 0.25f) + moveTo));
        this.f۱۳۶۸۵H.addListener(new Cb());
        moveSelected.addUpdateListener(new Cc());
        moveSelected.addListener(new Cd());
        moveSelected.setStartDelay(this.f۱۳۷۱۳s ? this.f۱۳۶۹۹e / 4 : 0);
        moveSelected.setDuration((this.f۱۳۶۹۹e * 3) / 4);
        moveSelected.setInterpolator(this.f۱۳۶۸۷J);
        return moveSelected;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$b  reason: invalid class name */
    public class Cb extends AnimatorListenerAdapter {
        Cb() {
        }

        public void onAnimationEnd(Animator animation) {
            InkPageIndicator.this.m۱۶۹۹۶b();
            InkPageIndicator.this.f۱۳۷۲۰z = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$c  reason: invalid class name */
    public class Cc implements ValueAnimator.AnimatorUpdateListener {
        Cc() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            InkPageIndicator.this.f۱۳۷۱۲r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InkPageIndicator.this.f۱۳۶۸۵H.m۱۷۰۱۷a(InkPageIndicator.this.f۱۳۷۱۲r);
            if (Build.VERSION.SDK_INT >= 16) {
                InkPageIndicator.this.postInvalidateOnAnimation();
            } else {
                InkPageIndicator.this.postInvalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$d  reason: invalid class name */
    public class Cd extends AnimatorListenerAdapter {
        Cd() {
        }

        public void onAnimationStart(Animator animation) {
            InkPageIndicator.this.f۱۳۷۱۳s = false;
        }

        public void onAnimationEnd(Animator animation) {
            InkPageIndicator.this.f۱۳۷۱۳s = true;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۹۹۷b(int leftDot, float fraction) {
        float[] fArr = this.f۱۳۷۱۵u;
        if (leftDot < fArr.length) {
            fArr[leftDot] = fraction;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۹۸۶a() {
        Arrays.fill(this.f۱۳۷۱۵u, 0.0f);
        if (Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation();
        } else {
            postInvalidate();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۹۸۷a(int dot, float fraction) {
        this.f۱۳۷۱۸x[dot] = fraction;
        if (Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation();
        } else {
            postInvalidate();
        }
    }

    /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$h  reason: invalid class name */
    public abstract class AbstractCh extends ValueAnimator {

        /* renamed from: c  reason: contains not printable characters */
        protected boolean f۱۳۷۳۶c = false;

        /* renamed from: d  reason: contains not printable characters */
        protected AbstractCj f۱۳۷۳۷d;

        public AbstractCh(InkPageIndicator this$0, AbstractCj predicate) {
            this.f۱۳۷۳۷d = predicate;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۰۱۷a(float currentValue) {
            if (!this.f۱۳۷۳۶c && this.f۱۳۷۳۷d.m۱۷۰۱۹a(currentValue)) {
                start();
                this.f۱۳۷۳۶c = true;
            }
        }
    }

    /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$f  reason: invalid class name */
    public class Cf extends AbstractCh {
        public Cf(int was, int now, int steps, AbstractCj predicate) {
            super(InkPageIndicator.this, predicate);
            float initialX1;
            float finalX1;
            float initialX2;
            float finalX2;
            setDuration(InkPageIndicator.this.f۱۳۷۰۴j);
            setInterpolator(InkPageIndicator.this.f۱۳۶۸۷J);
            if (now > was) {
                initialX1 = Math.min(InkPageIndicator.this.f۱۳۷۱۴t[was], InkPageIndicator.this.f۱۳۷۱۲r) - InkPageIndicator.this.f۱۳۷۰۲h;
            } else {
                initialX1 = InkPageIndicator.this.f۱۳۷۱۴t[now] - InkPageIndicator.this.f۱۳۷۰۲h;
            }
            if (now > was) {
                finalX1 = InkPageIndicator.this.f۱۳۷۱۴t[now] - InkPageIndicator.this.f۱۳۷۰۲h;
            } else {
                finalX1 = InkPageIndicator.this.f۱۳۷۱۴t[now] - InkPageIndicator.this.f۱۳۷۰۲h;
            }
            if (now > was) {
                initialX2 = InkPageIndicator.this.f۱۳۷۱۴t[now] + InkPageIndicator.this.f۱۳۷۰۲h;
            } else {
                initialX2 = Math.max(InkPageIndicator.this.f۱۳۷۱۴t[was], InkPageIndicator.this.f۱۳۷۱۲r) + InkPageIndicator.this.f۱۳۷۰۲h;
            }
            if (now > was) {
                finalX2 = InkPageIndicator.this.f۱۳۷۱۴t[now] + InkPageIndicator.this.f۱۳۷۰۲h;
            } else {
                finalX2 = InkPageIndicator.this.f۱۳۷۱۴t[now] + InkPageIndicator.this.f۱۳۷۰۲h;
            }
            InkPageIndicator.this.f۱۳۶۸۶I = new Cg[steps];
            int[] dotsToHide = new int[steps];
            if (initialX1 != finalX1) {
                setFloatValues(initialX1, finalX1);
                for (int i = 0; i < steps; i++) {
                    InkPageIndicator.this.f۱۳۶۸۶I[i] = new Cg(was + i, new Ci(InkPageIndicator.this, InkPageIndicator.this.f۱۳۷۱۴t[was + i]));
                    dotsToHide[i] = was + i;
                }
                addUpdateListener(new Ca(InkPageIndicator.this));
            } else {
                setFloatValues(initialX2, finalX2);
                for (int i2 = 0; i2 < steps; i2++) {
                    InkPageIndicator.this.f۱۳۶۸۶I[i2] = new Cg(was - i2, new Ce(InkPageIndicator.this, InkPageIndicator.this.f۱۳۷۱۴t[was - i2]));
                    dotsToHide[i2] = was - i2;
                }
                addUpdateListener(new Cb(InkPageIndicator.this));
            }
            addListener(new Cc(InkPageIndicator.this, dotsToHide, initialX1, initialX2));
        }

        /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$f$a  reason: invalid class name */
        class Ca implements ValueAnimator.AnimatorUpdateListener {
            Ca(InkPageIndicator inkPageIndicator) {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                InkPageIndicator.this.f۱۳۷۱۶v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (Build.VERSION.SDK_INT >= 16) {
                    InkPageIndicator.this.postInvalidateOnAnimation();
                } else {
                    InkPageIndicator.this.postInvalidate();
                }
                for (Cg pendingReveal : InkPageIndicator.this.f۱۳۶۸۶I) {
                    pendingReveal.m۱۷۰۱۷a(InkPageIndicator.this.f۱۳۷۱۶v);
                }
            }
        }

        /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$f$b  reason: invalid class name */
        class Cb implements ValueAnimator.AnimatorUpdateListener {
            Cb(InkPageIndicator inkPageIndicator) {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                InkPageIndicator.this.f۱۳۷۱۷w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (Build.VERSION.SDK_INT >= 16) {
                    InkPageIndicator.this.postInvalidateOnAnimation();
                } else {
                    InkPageIndicator.this.postInvalidate();
                }
                for (Cg pendingReveal : InkPageIndicator.this.f۱۳۶۸۶I) {
                    pendingReveal.m۱۷۰۱۷a(InkPageIndicator.this.f۱۳۷۱۷w);
                }
            }
        }

        /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$f$c  reason: invalid class name */
        class Cc extends AnimatorListenerAdapter {

            /* renamed from: a  reason: contains not printable characters */
            final /* synthetic */ int[] f۱۳۷۲۸a;

            /* renamed from: b  reason: contains not printable characters */
            final /* synthetic */ float f۱۳۷۲۹b;

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ float f۱۳۷۳۰c;

            Cc(InkPageIndicator inkPageIndicator, int[] iArr, float f, float f2) {
                this.f۱۳۷۲۸a = iArr;
                this.f۱۳۷۲۹b = f;
                this.f۱۳۷۳۰c = f2;
            }

            public void onAnimationStart(Animator animation) {
                InkPageIndicator.this.m۱۶۹۸۶a();
                for (int dot : this.f۱۳۷۲۸a) {
                    InkPageIndicator.this.m۱۶۹۸۷a((InkPageIndicator) dot, 1.0E-5f);
                }
                InkPageIndicator.this.f۱۳۷۱۶v = this.f۱۳۷۲۹b;
                InkPageIndicator.this.f۱۳۷۱۷w = this.f۱۳۷۳۰c;
                if (Build.VERSION.SDK_INT >= 16) {
                    InkPageIndicator.this.postInvalidateOnAnimation();
                } else {
                    InkPageIndicator.this.postInvalidate();
                }
            }

            public void onAnimationEnd(Animator animation) {
                InkPageIndicator.this.f۱۳۷۱۶v = -1.0f;
                InkPageIndicator.this.f۱۳۷۱۷w = -1.0f;
                if (Build.VERSION.SDK_INT >= 16) {
                    InkPageIndicator.this.postInvalidateOnAnimation();
                } else {
                    InkPageIndicator.this.postInvalidate();
                }
            }
        }
    }

    /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$g  reason: invalid class name */
    public class Cg extends AbstractCh {

        /* renamed from: e  reason: contains not printable characters */
        private int f۱۳۷۳۲e;

        public Cg(int dot, AbstractCj predicate) {
            super(InkPageIndicator.this, predicate);
            setFloatValues(1.0E-5f, 1.0f);
            this.f۱۳۷۳۲e = dot;
            setDuration(InkPageIndicator.this.f۱۳۷۰۴j);
            setInterpolator(InkPageIndicator.this.f۱۳۶۸۷J);
            addUpdateListener(new Ca(InkPageIndicator.this));
            addListener(new Cb(InkPageIndicator.this));
        }

        /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$g$a  reason: invalid class name */
        class Ca implements ValueAnimator.AnimatorUpdateListener {
            Ca(InkPageIndicator inkPageIndicator) {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Cg gVar = Cg.this;
                InkPageIndicator.this.m۱۶۹۸۷a((InkPageIndicator) gVar.f۱۳۷۳۲e, (int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }

        /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$g$b  reason: invalid class name */
        class Cb extends AnimatorListenerAdapter {
            Cb(InkPageIndicator inkPageIndicator) {
            }

            public void onAnimationEnd(Animator animation) {
                Cg gVar = Cg.this;
                InkPageIndicator.this.m۱۶۹۸۷a((InkPageIndicator) gVar.f۱۳۷۳۲e, 0.0f);
                if (Build.VERSION.SDK_INT >= 16) {
                    InkPageIndicator.this.postInvalidateOnAnimation();
                } else {
                    InkPageIndicator.this.postInvalidate();
                }
            }
        }
    }

    /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$j  reason: invalid class name */
    public abstract class AbstractCj {

        /* renamed from: a  reason: contains not printable characters */
        protected float f۱۳۷۳۸a;

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public abstract boolean m۱۷۰۱۹a(float f);

        public AbstractCj(InkPageIndicator this$0, float thresholdValue) {
            this.f۱۳۷۳۸a = thresholdValue;
        }
    }

    /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$i  reason: invalid class name */
    public class Ci extends AbstractCj {
        public Ci(InkPageIndicator this$0, float thresholdValue) {
            super(this$0, thresholdValue);
        }

        /* access modifiers changed from: package-private */
        @Override // com.heinrichreimersoftware.materialintro.view.InkPageIndicator.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۰۱۸a(float currentValue) {
            return currentValue > this.f۱۳۷۳۸a;
        }
    }

    /* renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$e  reason: invalid class name */
    public class Ce extends AbstractCj {
        public Ce(InkPageIndicator this$0, float thresholdValue) {
            super(this$0, thresholdValue);
        }

        /* access modifiers changed from: package-private */
        @Override // com.heinrichreimersoftware.materialintro.view.InkPageIndicator.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۰۱۵a(float currentValue) {
            return currentValue < this.f۱۳۷۳۸a;
        }
    }
}
