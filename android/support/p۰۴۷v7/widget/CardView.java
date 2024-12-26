package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۴b.Cb;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۴b.Cd;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۴b.Ce;

/* renamed from: android.support.v7.widget.CardView */
public class CardView extends FrameLayout {

    /* renamed from: j  reason: contains not printable characters */
    private static final int[] f۱۱۴۵۳j = {16842801};

    /* renamed from: k  reason: contains not printable characters */
    private static final AbstractCc0 f۱۱۴۵۴k;

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۱۱۴۵۵c;

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۱۴۵۶d;

    /* renamed from: e  reason: contains not printable characters */
    int f۱۱۴۵۷e;

    /* renamed from: f  reason: contains not printable characters */
    int f۱۱۴۵۸f;

    /* renamed from: g  reason: contains not printable characters */
    final Rect f۱۱۴۵۹g;

    /* renamed from: h  reason: contains not printable characters */
    final Rect f۱۱۴۶۰h;

    /* renamed from: i  reason: contains not printable characters */
    private final AbstractCb0 f۱۱۴۶۱i;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f۱۱۴۵۴k = new Cz();
        } else if (i >= 17) {
            f۱۱۴۵۴k = new Cy();
        } else {
            f۱۱۴۵۴k = new Ca0();
        }
        f۱۱۴۵۴k.m۱۵۰۴۹a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attrs) {
        this(context, attrs, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۴b.Ca.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        ColorStateList backgroundColor;
        float maxElevation;
        int i;
        this.f۱۱۴۵۹g = new Rect();
        this.f۱۱۴۶۰h = new Rect();
        this.f۱۱۴۶۱i = new Ca();
        TypedArray a = context.obtainStyledAttributes(attrs, Ce.CardView, defStyleAttr, Cd.CardView);
        if (a.hasValue(Ce.CardView_cardBackgroundColor)) {
            backgroundColor = a.getColorStateList(Ce.CardView_cardBackgroundColor);
        } else {
            TypedArray aa = getContext().obtainStyledAttributes(f۱۱۴۵۳j);
            int themeColorBackground = aa.getColor(0, 0);
            aa.recycle();
            float[] hsv = new float[3];
            Color.colorToHSV(themeColorBackground, hsv);
            if (hsv[2] > 0.5f) {
                i = getResources().getColor(Cb.cardview_light_background);
            } else {
                i = getResources().getColor(Cb.cardview_dark_background);
            }
            backgroundColor = ColorStateList.valueOf(i);
        }
        float radius = a.getDimension(Ce.CardView_cardCornerRadius, 0.0f);
        float elevation = a.getDimension(Ce.CardView_cardElevation, 0.0f);
        float maxElevation2 = a.getDimension(Ce.CardView_cardMaxElevation, 0.0f);
        this.f۱۱۴۵۵c = a.getBoolean(Ce.CardView_cardUseCompatPadding, false);
        this.f۱۱۴۵۶d = a.getBoolean(Ce.CardView_cardPreventCornerOverlap, true);
        int defaultPadding = a.getDimensionPixelSize(Ce.CardView_contentPadding, 0);
        this.f۱۱۴۵۹g.left = a.getDimensionPixelSize(Ce.CardView_contentPaddingLeft, defaultPadding);
        this.f۱۱۴۵۹g.top = a.getDimensionPixelSize(Ce.CardView_contentPaddingTop, defaultPadding);
        this.f۱۱۴۵۹g.right = a.getDimensionPixelSize(Ce.CardView_contentPaddingRight, defaultPadding);
        this.f۱۱۴۵۹g.bottom = a.getDimensionPixelSize(Ce.CardView_contentPaddingBottom, defaultPadding);
        if (elevation > maxElevation2) {
            maxElevation = elevation;
        } else {
            maxElevation = maxElevation2;
        }
        this.f۱۱۴۵۷e = a.getDimensionPixelSize(Ce.CardView_android_minWidth, 0);
        this.f۱۱۴۵۸f = a.getDimensionPixelSize(Ce.CardView_android_minHeight, 0);
        a.recycle();
        f۱۱۴۵۴k.m۱۵۰۵۱a(this.f۱۱۴۶۱i, context, backgroundColor, radius, elevation, maxElevation);
    }

    public void setPadding(int left, int top, int right, int bottom) {
    }

    public void setPaddingRelative(int start, int top, int end, int bottom) {
    }

    public boolean getUseCompatPadding() {
        return this.f۱۱۴۵۵c;
    }

    public void setUseCompatPadding(boolean useCompatPadding) {
        if (this.f۱۱۴۵۵c != useCompatPadding) {
            this.f۱۱۴۵۵c = useCompatPadding;
            f۱۱۴۵۴k.m۱۵۰۵۵c(this.f۱۱۴۶۱i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!(f۱۱۴۵۴k instanceof Cz)) {
            int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
            if (widthMode == Integer.MIN_VALUE || widthMode == 1073741824) {
                widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f۱۱۴۵۴k.m۱۵۰۵۳b(this.f۱۱۴۶۱i)), View.MeasureSpec.getSize(widthMeasureSpec)), widthMode);
            }
            int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
            if (heightMode == Integer.MIN_VALUE || heightMode == 1073741824) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f۱۱۴۵۴k.m۱۵۰۴۸a(this.f۱۱۴۶۱i)), View.MeasureSpec.getSize(heightMeasureSpec)), heightMode);
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setMinimumWidth(int minWidth) {
        this.f۱۱۴۵۷e = minWidth;
        super.setMinimumWidth(minWidth);
    }

    public void setMinimumHeight(int minHeight) {
        this.f۱۱۴۵۸f = minHeight;
        super.setMinimumHeight(minHeight);
    }

    public void setCardBackgroundColor(int color) {
        f۱۱۴۵۴k.m۱۵۰۵۲a(this.f۱۱۴۶۱i, ColorStateList.valueOf(color));
    }

    public void setCardBackgroundColor(ColorStateList color) {
        f۱۱۴۵۴k.m۱۵۰۵۲a(this.f۱۱۴۶۱i, color);
    }

    public ColorStateList getCardBackgroundColor() {
        return f۱۱۴۵۴k.m۱۵۰۵۸e(this.f۱۱۴۶۱i);
    }

    public int getContentPaddingLeft() {
        return this.f۱۱۴۵۹g.left;
    }

    public int getContentPaddingRight() {
        return this.f۱۱۴۵۹g.right;
    }

    public int getContentPaddingTop() {
        return this.f۱۱۴۵۹g.top;
    }

    public int getContentPaddingBottom() {
        return this.f۱۱۴۵۹g.bottom;
    }

    public void setRadius(float radius) {
        f۱۱۴۵۴k.m۱۵۰۵۰a(this.f۱۱۴۶۱i, radius);
    }

    public float getRadius() {
        return f۱۱۴۵۴k.m۱۵۰۶۰g(this.f۱۱۴۶۱i);
    }

    public void setCardElevation(float elevation) {
        f۱۱۴۵۴k.m۱۵۰۵۴b(this.f۱۱۴۶۱i, elevation);
    }

    public float getCardElevation() {
        return f۱۱۴۵۴k.m۱۵۰۵۷d(this.f۱۱۴۶۱i);
    }

    public void setMaxCardElevation(float maxElevation) {
        f۱۱۴۵۴k.m۱۵۰۵۶c(this.f۱۱۴۶۱i, maxElevation);
    }

    public float getMaxCardElevation() {
        return f۱۱۴۵۴k.m۱۵۰۶۱h(this.f۱۱۴۶۱i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f۱۱۴۵۶d;
    }

    public void setPreventCornerOverlap(boolean preventCornerOverlap) {
        if (preventCornerOverlap != this.f۱۱۴۵۶d) {
            this.f۱۱۴۵۶d = preventCornerOverlap;
            f۱۱۴۵۴k.m۱۵۰۵۹f(this.f۱۱۴۶۱i);
        }
    }

    /* renamed from: android.support.v7.widget.CardView$a  reason: invalid class name */
    class Ca implements AbstractCb0 {

        /* renamed from: a  reason: contains not printable characters */
        private Drawable f۱۱۴۶۲a;

        Ca() {
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCb0
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۰۸۵a(Drawable drawable) {
            this.f۱۱۴۶۲a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCb0
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۴۰۸۶b() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCb0
        /* renamed from: d  reason: contains not printable characters */
        public boolean m۱۴۰۸۸d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCb0
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۰۸۴a(int left, int top, int right, int bottom) {
            CardView.this.f۱۱۴۶۰h.set(left, top, right, bottom);
            CardView cardView = CardView.this;
            Rect rect = cardView.f۱۱۴۵۹g;
            CardView.super.setPadding(rect.left + left, rect.top + top, rect.right + right, rect.bottom + bottom);
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCb0
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۰۸۳a(int width, int height) {
            CardView cardView = CardView.this;
            if (width > cardView.f۱۱۴۵۷e) {
                CardView.super.setMinimumWidth(width);
            }
            CardView cardView2 = CardView.this;
            if (height > cardView2.f۱۱۴۵۸f) {
                CardView.super.setMinimumHeight(height);
            }
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCb0
        /* renamed from: c  reason: contains not printable characters */
        public Drawable m۱۴۰۸۷c() {
            return this.f۱۱۴۶۲a;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCb0
        /* renamed from: a  reason: contains not printable characters */
        public View m۱۴۰۸۲a() {
            return CardView.this;
        }
    }
}
