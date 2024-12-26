package android.support.v7.widget;

import a.b.h.b.b;
import a.b.h.b.d;
import a.b.h.b.e;
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

public class CardView extends FrameLayout {
    private static final int[] j = {16842801};
    private static final c0 k;

    /* renamed from: c  reason: collision with root package name */
    private boolean f۱۷۷۸c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f۱۷۷۹d;

    /* renamed from: e  reason: collision with root package name */
    int f۱۷۸۰e;

    /* renamed from: f  reason: collision with root package name */
    int f۱۷۸۱f;

    /* renamed from: g  reason: collision with root package name */
    final Rect f۱۷۸۲g;

    /* renamed from: h  reason: collision with root package name */
    final Rect f۱۷۸۳h;
    private final b0 i;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            k = new z();
        } else if (i2 >= 17) {
            k = new y();
        } else {
            k = new a0();
        }
        k.a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attrs) {
        this(context, attrs, a.b.h.b.a.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        ColorStateList backgroundColor;
        float maxElevation;
        int i2;
        this.f۱۷۸۲g = new Rect();
        this.f۱۷۸۳h = new Rect();
        this.i = new a();
        TypedArray a2 = context.obtainStyledAttributes(attrs, e.CardView, defStyleAttr, d.CardView);
        if (a2.hasValue(e.CardView_cardBackgroundColor)) {
            backgroundColor = a2.getColorStateList(e.CardView_cardBackgroundColor);
        } else {
            TypedArray aa = getContext().obtainStyledAttributes(j);
            int themeColorBackground = aa.getColor(0, 0);
            aa.recycle();
            float[] hsv = new float[3];
            Color.colorToHSV(themeColorBackground, hsv);
            if (hsv[2] > 0.5f) {
                i2 = getResources().getColor(b.cardview_light_background);
            } else {
                i2 = getResources().getColor(b.cardview_dark_background);
            }
            backgroundColor = ColorStateList.valueOf(i2);
        }
        float radius = a2.getDimension(e.CardView_cardCornerRadius, 0.0f);
        float elevation = a2.getDimension(e.CardView_cardElevation, 0.0f);
        float maxElevation2 = a2.getDimension(e.CardView_cardMaxElevation, 0.0f);
        this.f۱۷۷۸c = a2.getBoolean(e.CardView_cardUseCompatPadding, false);
        this.f۱۷۷۹d = a2.getBoolean(e.CardView_cardPreventCornerOverlap, true);
        int defaultPadding = a2.getDimensionPixelSize(e.CardView_contentPadding, 0);
        this.f۱۷۸۲g.left = a2.getDimensionPixelSize(e.CardView_contentPaddingLeft, defaultPadding);
        this.f۱۷۸۲g.top = a2.getDimensionPixelSize(e.CardView_contentPaddingTop, defaultPadding);
        this.f۱۷۸۲g.right = a2.getDimensionPixelSize(e.CardView_contentPaddingRight, defaultPadding);
        this.f۱۷۸۲g.bottom = a2.getDimensionPixelSize(e.CardView_contentPaddingBottom, defaultPadding);
        if (elevation > maxElevation2) {
            maxElevation = elevation;
        } else {
            maxElevation = maxElevation2;
        }
        this.f۱۷۸۰e = a2.getDimensionPixelSize(e.CardView_android_minWidth, 0);
        this.f۱۷۸۱f = a2.getDimensionPixelSize(e.CardView_android_minHeight, 0);
        a2.recycle();
        k.a(this.i, context, backgroundColor, radius, elevation, maxElevation);
    }

    public void setPadding(int left, int top, int right, int bottom) {
    }

    public void setPaddingRelative(int start, int top, int end, int bottom) {
    }

    public boolean getUseCompatPadding() {
        return this.f۱۷۷۸c;
    }

    public void setUseCompatPadding(boolean useCompatPadding) {
        if (this.f۱۷۷۸c != useCompatPadding) {
            this.f۱۷۷۸c = useCompatPadding;
            k.c(this.i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!(k instanceof z)) {
            int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
            if (widthMode == Integer.MIN_VALUE || widthMode == 1073741824) {
                widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) k.b(this.i)), View.MeasureSpec.getSize(widthMeasureSpec)), widthMode);
            }
            int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
            if (heightMode == Integer.MIN_VALUE || heightMode == 1073741824) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) k.a(this.i)), View.MeasureSpec.getSize(heightMeasureSpec)), heightMode);
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setMinimumWidth(int minWidth) {
        this.f۱۷۸۰e = minWidth;
        super.setMinimumWidth(minWidth);
    }

    public void setMinimumHeight(int minHeight) {
        this.f۱۷۸۱f = minHeight;
        super.setMinimumHeight(minHeight);
    }

    public void setCardBackgroundColor(int color) {
        k.a(this.i, ColorStateList.valueOf(color));
    }

    public void setCardBackgroundColor(ColorStateList color) {
        k.a(this.i, color);
    }

    public ColorStateList getCardBackgroundColor() {
        return k.e(this.i);
    }

    public int getContentPaddingLeft() {
        return this.f۱۷۸۲g.left;
    }

    public int getContentPaddingRight() {
        return this.f۱۷۸۲g.right;
    }

    public int getContentPaddingTop() {
        return this.f۱۷۸۲g.top;
    }

    public int getContentPaddingBottom() {
        return this.f۱۷۸۲g.bottom;
    }

    public void setRadius(float radius) {
        k.a(this.i, radius);
    }

    public float getRadius() {
        return k.g(this.i);
    }

    public void setCardElevation(float elevation) {
        k.b(this.i, elevation);
    }

    public float getCardElevation() {
        return k.d(this.i);
    }

    public void setMaxCardElevation(float maxElevation) {
        k.c(this.i, maxElevation);
    }

    public float getMaxCardElevation() {
        return k.h(this.i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f۱۷۷۹d;
    }

    public void setPreventCornerOverlap(boolean preventCornerOverlap) {
        if (preventCornerOverlap != this.f۱۷۷۹d) {
            this.f۱۷۷۹d = preventCornerOverlap;
            k.f(this.i);
        }
    }

    class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f۱۷۸۴a;

        a() {
        }

        @Override // android.support.v7.widget.b0
        public void a(Drawable drawable) {
            this.f۱۷۸۴a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // android.support.v7.widget.b0
        public boolean b() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // android.support.v7.widget.b0
        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // android.support.v7.widget.b0
        public void a(int left, int top, int right, int bottom) {
            CardView.this.f۱۷۸۳h.set(left, top, right, bottom);
            CardView cardView = CardView.this;
            Rect rect = cardView.f۱۷۸۲g;
            CardView.super.setPadding(rect.left + left, rect.top + top, rect.right + right, rect.bottom + bottom);
        }

        @Override // android.support.v7.widget.b0
        public void a(int width, int height) {
            CardView cardView = CardView.this;
            if (width > cardView.f۱۷۸۰e) {
                CardView.super.setMinimumWidth(width);
            }
            CardView cardView2 = CardView.this;
            if (height > cardView2.f۱۷۸۱f) {
                CardView.super.setMinimumHeight(height);
            }
        }

        @Override // android.support.v7.widget.b0
        public Drawable c() {
            return this.f۱۷۸۴a;
        }

        @Override // android.support.v7.widget.b0
        public View a() {
            return CardView.this;
        }
    }
}
