package com.github.clans.fab;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

public class FloatingActionMenu extends ViewGroup {

    /* renamed from: A  reason: contains not printable characters */
    private int f۱۳۵۷۷A;

    /* renamed from: B  reason: contains not printable characters */
    private boolean f۱۳۵۷۸B;

    /* renamed from: C  reason: contains not printable characters */
    private int f۱۳۵۷۹C;

    /* renamed from: D  reason: contains not printable characters */
    private float f۱۳۵۸۰D;

    /* renamed from: E  reason: contains not printable characters */
    private float f۱۳۵۸۱E;

    /* renamed from: F  reason: contains not printable characters */
    private float f۱۳۵۸۲F;

    /* renamed from: G  reason: contains not printable characters */
    private int f۱۳۵۸۳G;

    /* renamed from: H  reason: contains not printable characters */
    private int f۱۳۵۸۴H;

    /* renamed from: I  reason: contains not printable characters */
    private int f۱۳۵۸۵I;

    /* renamed from: J  reason: contains not printable characters */
    private Drawable f۱۳۵۸۶J;

    /* renamed from: K  reason: contains not printable characters */
    private int f۱۳۵۸۷K;

    /* renamed from: L  reason: contains not printable characters */
    private Interpolator f۱۳۵۸۸L;

    /* renamed from: M  reason: contains not printable characters */
    private Interpolator f۱۳۵۸۹M;

    /* renamed from: N  reason: contains not printable characters */
    private boolean f۱۳۵۹۰N;

    /* renamed from: O  reason: contains not printable characters */
    private boolean f۱۳۵۹۱O;

    /* renamed from: P  reason: contains not printable characters */
    private int f۱۳۵۹۲P;

    /* renamed from: Q  reason: contains not printable characters */
    private int f۱۳۵۹۳Q;

    /* renamed from: R  reason: contains not printable characters */
    private int f۱۳۵۹۴R;

    /* renamed from: S  reason: contains not printable characters */
    private int f۱۳۵۹۵S;

    /* renamed from: T  reason: contains not printable characters */
    private Typeface f۱۳۵۹۶T;

    /* renamed from: U  reason: contains not printable characters */
    private boolean f۱۳۵۹۷U;

    /* renamed from: V  reason: contains not printable characters */
    private ImageView f۱۳۵۹۸V;

    /* renamed from: W  reason: contains not printable characters */
    private boolean f۱۳۵۹۹W;

    /* renamed from: a0  reason: contains not printable characters */
    private int f۱۳۶۰۰a0;

    /* renamed from: b0  reason: contains not printable characters */
    private AbstractCh f۱۳۶۰۱b0;

    /* renamed from: c  reason: contains not printable characters */
    private AnimatorSet f۱۳۶۰۲c;

    /* renamed from: c0  reason: contains not printable characters */
    private ValueAnimator f۱۳۶۰۳c0;

    /* renamed from: d  reason: contains not printable characters */
    private AnimatorSet f۱۳۶۰۴d;

    /* renamed from: d0  reason: contains not printable characters */
    private ValueAnimator f۱۳۶۰۵d0;

    /* renamed from: e  reason: contains not printable characters */
    private AnimatorSet f۱۳۶۰۶e;

    /* renamed from: e0  reason: contains not printable characters */
    private int f۱۳۶۰۷e0;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۳۶۰۸f;

    /* renamed from: f0  reason: contains not printable characters */
    private int f۱۳۶۰۹f0;

    /* renamed from: g  reason: contains not printable characters */
    private FloatingActionButton f۱۳۶۱۰g;

    /* renamed from: g0  reason: contains not printable characters */
    private Context f۱۳۶۱۱g0;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۳۶۱۲h;

    /* renamed from: h0  reason: contains not printable characters */
    private String f۱۳۶۱۳h0;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۳۶۱۴i;

    /* renamed from: i0  reason: contains not printable characters */
    private boolean f۱۳۶۱۵i0;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۳۶۱۶j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۳۶۱۷k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۱۳۶۱۸l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۱۳۶۱۹m;

    /* renamed from: n  reason: contains not printable characters */
    private Handler f۱۳۶۲۰n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۳۶۲۱o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۳۶۲۲p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۳۶۲۳q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۳۶۲۴r;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۳۶۲۵s;

    /* renamed from: t  reason: contains not printable characters */
    private int f۱۳۶۲۶t;

    /* renamed from: u  reason: contains not printable characters */
    private ColorStateList f۱۳۶۲۷u;

    /* renamed from: v  reason: contains not printable characters */
    private float f۱۳۶۲۸v;

    /* renamed from: w  reason: contains not printable characters */
    private int f۱۳۶۲۹w;

    /* renamed from: x  reason: contains not printable characters */
    private boolean f۱۳۶۳۰x;

    /* renamed from: y  reason: contains not printable characters */
    private int f۱۳۶۳۱y;

    /* renamed from: z  reason: contains not printable characters */
    private int f۱۳۶۳۲z;

    /* renamed from: com.github.clans.fab.FloatingActionMenu$h  reason: invalid class name */
    public interface AbstractCh {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۶۹۳۲a(boolean z);
    }

    public FloatingActionMenu(Context context) {
        this(context, null);
    }

    public FloatingActionMenu(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FloatingActionMenu(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۳۶۰۲c = new AnimatorSet();
        this.f۱۳۶۰۴d = new AnimatorSet();
        this.f۱۳۶۰۸f = Cg.m۱۶۹۵۹a(getContext(), 0.0f);
        this.f۱۳۶۱۴i = Cg.m۱۶۹۵۹a(getContext(), 0.0f);
        this.f۱۳۶۱۶j = Cg.m۱۶۹۵۹a(getContext(), 0.0f);
        this.f۱۳۶۲۰n = new Handler();
        this.f۱۳۶۲۳q = Cg.m۱۶۹۵۹a(getContext(), 4.0f);
        this.f۱۳۶۲۴r = Cg.m۱۶۹۵۹a(getContext(), 8.0f);
        this.f۱۳۶۲۵s = Cg.m۱۶۹۵۹a(getContext(), 4.0f);
        this.f۱۳۶۲۶t = Cg.m۱۶۹۵۹a(getContext(), 8.0f);
        this.f۱۳۶۲۹w = Cg.m۱۶۹۵۹a(getContext(), 3.0f);
        this.f۱۳۵۸۰D = 4.0f;
        this.f۱۳۵۸۱E = 1.0f;
        this.f۱۳۵۸۲F = 3.0f;
        this.f۱۳۵۹۰N = true;
        this.f۱۳۵۹۷U = true;
        m۱۶۹۱۵a(context, attrs);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۹۱۵a(Context context, AttributeSet attrs) {
        TypedArray attr = context.obtainStyledAttributes(attrs, Cf.FloatingActionMenu, 0, 0);
        this.f۱۳۶۰۸f = attr.getDimensionPixelSize(Cf.FloatingActionMenu_menu_buttonSpacing, this.f۱۳۶۰۸f);
        this.f۱۳۶۱۴i = attr.getDimensionPixelSize(Cf.FloatingActionMenu_menu_labels_margin, this.f۱۳۶۱۴i);
        this.f۱۳۶۰۹f0 = attr.getInt(Cf.FloatingActionMenu_menu_labels_position, 0);
        this.f۱۳۶۲۱o = attr.getResourceId(Cf.FloatingActionMenu_menu_labels_showAnimation, this.f۱۳۶۰۹f0 == 0 ? Cb.fab_slide_in_from_right : Cb.fab_slide_in_from_left);
        this.f۱۳۶۲۲p = attr.getResourceId(Cf.FloatingActionMenu_menu_labels_hideAnimation, this.f۱۳۶۰۹f0 == 0 ? Cb.fab_slide_out_to_right : Cb.fab_slide_out_to_left);
        this.f۱۳۶۲۳q = attr.getDimensionPixelSize(Cf.FloatingActionMenu_menu_labels_paddingTop, this.f۱۳۶۲۳q);
        this.f۱۳۶۲۴r = attr.getDimensionPixelSize(Cf.FloatingActionMenu_menu_labels_paddingRight, this.f۱۳۶۲۴r);
        this.f۱۳۶۲۵s = attr.getDimensionPixelSize(Cf.FloatingActionMenu_menu_labels_paddingBottom, this.f۱۳۶۲۵s);
        this.f۱۳۶۲۶t = attr.getDimensionPixelSize(Cf.FloatingActionMenu_menu_labels_paddingLeft, this.f۱۳۶۲۶t);
        this.f۱۳۶۲۷u = attr.getColorStateList(Cf.FloatingActionMenu_menu_labels_textColor);
        if (this.f۱۳۶۲۷u == null) {
            this.f۱۳۶۲۷u = ColorStateList.valueOf(-1);
        }
        this.f۱۳۶۲۸v = attr.getDimension(Cf.FloatingActionMenu_menu_labels_textSize, getResources().getDimension(Cc.labels_text_size));
        this.f۱۳۶۲۹w = attr.getDimensionPixelSize(Cf.FloatingActionMenu_menu_labels_cornerRadius, this.f۱۳۶۲۹w);
        this.f۱۳۶۳۰x = attr.getBoolean(Cf.FloatingActionMenu_menu_labels_showShadow, true);
        this.f۱۳۶۳۱y = attr.getColor(Cf.FloatingActionMenu_menu_labels_colorNormal, -13421773);
        this.f۱۳۶۳۲z = attr.getColor(Cf.FloatingActionMenu_menu_labels_colorPressed, -12303292);
        this.f۱۳۵۷۷A = attr.getColor(Cf.FloatingActionMenu_menu_labels_colorRipple, 1728053247);
        this.f۱۳۵۷۸B = attr.getBoolean(Cf.FloatingActionMenu_menu_showShadow, true);
        this.f۱۳۵۷۹C = attr.getColor(Cf.FloatingActionMenu_menu_shadowColor, 1711276032);
        this.f۱۳۵۸۰D = attr.getDimension(Cf.FloatingActionMenu_menu_shadowRadius, this.f۱۳۵۸۰D);
        this.f۱۳۵۸۱E = attr.getDimension(Cf.FloatingActionMenu_menu_shadowXOffset, this.f۱۳۵۸۱E);
        this.f۱۳۵۸۲F = attr.getDimension(Cf.FloatingActionMenu_menu_shadowYOffset, this.f۱۳۵۸۲F);
        this.f۱۳۵۸۳G = attr.getColor(Cf.FloatingActionMenu_menu_colorNormal, -2473162);
        this.f۱۳۵۸۴H = attr.getColor(Cf.FloatingActionMenu_menu_colorPressed, -1617853);
        this.f۱۳۵۸۵I = attr.getColor(Cf.FloatingActionMenu_menu_colorRipple, -1711276033);
        this.f۱۳۵۸۷K = attr.getInt(Cf.FloatingActionMenu_menu_animationDelayPerItem, 50);
        this.f۱۳۵۸۶J = attr.getDrawable(Cf.FloatingActionMenu_menu_icon);
        if (this.f۱۳۵۸۶J == null) {
            this.f۱۳۵۸۶J = getResources().getDrawable(Cd.fab_add);
        }
        this.f۱۳۵۹۱O = attr.getBoolean(Cf.FloatingActionMenu_menu_labels_singleLine, false);
        this.f۱۳۵۹۲P = attr.getInt(Cf.FloatingActionMenu_menu_labels_ellipsize, 0);
        this.f۱۳۵۹۳Q = attr.getInt(Cf.FloatingActionMenu_menu_labels_maxLines, -1);
        this.f۱۳۵۹۴R = attr.getInt(Cf.FloatingActionMenu_menu_fab_size, 0);
        this.f۱۳۵۹۵S = attr.getResourceId(Cf.FloatingActionMenu_menu_labels_style, 0);
        String customFont = attr.getString(Cf.FloatingActionMenu_menu_labels_customFont);
        try {
            if (!TextUtils.isEmpty(customFont)) {
                this.f۱۳۵۹۶T = Typeface.createFromAsset(getContext().getAssets(), customFont);
            }
            this.f۱۳۶۰۰a0 = attr.getInt(Cf.FloatingActionMenu_menu_openDirection, 0);
            this.f۱۳۶۰۷e0 = attr.getColor(Cf.FloatingActionMenu_menu_backgroundColor, 0);
            if (attr.hasValue(Cf.FloatingActionMenu_menu_fab_label)) {
                this.f۱۳۶۱۵i0 = true;
                this.f۱۳۶۱۳h0 = attr.getString(Cf.FloatingActionMenu_menu_fab_label);
            }
            if (attr.hasValue(Cf.FloatingActionMenu_menu_labels_padding)) {
                m۱۶۹۲۲b(attr.getDimensionPixelSize(Cf.FloatingActionMenu_menu_labels_padding, 0));
            }
            this.f۱۳۵۸۸L = new OvershootInterpolator();
            this.f۱۳۵۸۹M = new AnticipateInterpolator();
            this.f۱۳۶۱۱g0 = new ContextThemeWrapper(getContext(), this.f۱۳۵۹۵S);
            m۱۶۹۲۶e();
            m۱۶۹۲۵d();
            m۱۶۹۱۶a(attr);
            attr.recycle();
        } catch (RuntimeException ex) {
            throw new IllegalArgumentException("Unable to load specified custom font: " + customFont, ex);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۹۱۶a(TypedArray attr) {
        int showResId = attr.getResourceId(Cf.FloatingActionMenu_menu_fab_show_animation, Cb.fab_scale_up);
        setMenuButtonShowAnimation(AnimationUtils.loadAnimation(getContext(), showResId));
        AnimationUtils.loadAnimation(getContext(), showResId);
        int hideResId = attr.getResourceId(Cf.FloatingActionMenu_menu_fab_hide_animation, Cb.fab_scale_down);
        setMenuButtonHideAnimation(AnimationUtils.loadAnimation(getContext(), hideResId));
        AnimationUtils.loadAnimation(getContext(), hideResId);
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۶۹۲۶e() {
        int maxAlpha = Color.alpha(this.f۱۳۶۰۷e0);
        int red = Color.red(this.f۱۳۶۰۷e0);
        int green = Color.green(this.f۱۳۶۰۷e0);
        int blue = Color.blue(this.f۱۳۶۰۷e0);
        this.f۱۳۶۰۳c0 = ValueAnimator.ofInt(0, maxAlpha);
        this.f۱۳۶۰۳c0.setDuration(300L);
        this.f۱۳۶۰۳c0.addUpdateListener(new Ca(red, green, blue));
        this.f۱۳۶۰۵d0 = ValueAnimator.ofInt(maxAlpha, 0);
        this.f۱۳۶۰۵d0.setDuration(300L);
        this.f۱۳۶۰۵d0.addUpdateListener(new Cb(red, green, blue));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.clans.fab.FloatingActionMenu$a  reason: invalid class name */
    public class Ca implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ int f۱۳۶۳۳a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ int f۱۳۶۳۴b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ int f۱۳۶۳۵c;

        Ca(int i, int i2, int i3) {
            this.f۱۳۶۳۳a = i;
            this.f۱۳۶۳۴b = i2;
            this.f۱۳۶۳۵c = i3;
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            FloatingActionMenu.this.setBackgroundColor(Color.argb(((Integer) animation.getAnimatedValue()).intValue(), this.f۱۳۶۳۳a, this.f۱۳۶۳۴b, this.f۱۳۶۳۵c));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.clans.fab.FloatingActionMenu$b  reason: invalid class name */
    public class Cb implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ int f۱۳۶۳۷a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ int f۱۳۶۳۸b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ int f۱۳۶۳۹c;

        Cb(int i, int i2, int i3) {
            this.f۱۳۶۳۷a = i;
            this.f۱۳۶۳۸b = i2;
            this.f۱۳۶۳۹c = i3;
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            FloatingActionMenu.this.setBackgroundColor(Color.argb(((Integer) animation.getAnimatedValue()).intValue(), this.f۱۳۶۳۷a, this.f۱۳۶۳۸b, this.f۱۳۶۳۹c));
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private boolean m۱۶۹۲۷f() {
        return this.f۱۳۶۰۷e0 != 0;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۹۲۲b(int padding) {
        this.f۱۳۶۲۳q = padding;
        this.f۱۳۶۲۴r = padding;
        this.f۱۳۶۲۵s = padding;
        this.f۱۳۶۲۶t = padding;
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۶۹۲۵d() {
        this.f۱۳۶۱۰g = new FloatingActionButton(getContext());
        FloatingActionButton floatingActionButton = this.f۱۳۶۱۰g;
        boolean z = this.f۱۳۵۷۸B;
        floatingActionButton.f۱۳۵۳۱d = z;
        if (z) {
            floatingActionButton.f۱۳۵۳۳f = Cg.m۱۶۹۵۹a(getContext(), this.f۱۳۵۸۰D);
            this.f۱۳۶۱۰g.f۱۳۵۳۴g = Cg.m۱۶۹۵۹a(getContext(), this.f۱۳۵۸۱E);
            this.f۱۳۶۱۰g.f۱۳۵۳۵h = Cg.m۱۶۹۵۹a(getContext(), this.f۱۳۵۸۲F);
        }
        this.f۱۳۶۱۰g.m۱۶۹۰۱a(this.f۱۳۵۸۳G, this.f۱۳۵۸۴H, this.f۱۳۵۸۵I);
        FloatingActionButton floatingActionButton2 = this.f۱۳۶۱۰g;
        floatingActionButton2.f۱۳۵۳۲e = this.f۱۳۵۷۹C;
        floatingActionButton2.f۱۳۵۳۰c = this.f۱۳۵۹۴R;
        floatingActionButton2.m۱۶۹۱۲i();
        this.f۱۳۶۱۰g.setLabelText(this.f۱۳۶۱۳h0);
        this.f۱۳۵۹۸V = new ImageView(getContext());
        this.f۱۳۵۹۸V.setImageDrawable(this.f۱۳۵۸۶J);
        addView(this.f۱۳۶۱۰g, super.generateDefaultLayoutParams());
        addView(this.f۱۳۵۹۸V);
        m۱۶۹۲۱b();
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۹۲۱b() {
        float collapseAngle;
        float expandAngle = 135.0f;
        if (this.f۱۳۶۰۰a0 == 0) {
            collapseAngle = this.f۱۳۶۰۹f0 == 0 ? -135.0f : 135.0f;
            if (this.f۱۳۶۰۹f0 == 0) {
                expandAngle = -135.0f;
            }
        } else {
            collapseAngle = this.f۱۳۶۰۹f0 == 0 ? 135.0f : -135.0f;
            if (this.f۱۳۶۰۹f0 != 0) {
                expandAngle = -135.0f;
            }
        }
        ObjectAnimator collapseAnimator = ObjectAnimator.ofFloat(this.f۱۳۵۹۸V, "rotation", collapseAngle, 0.0f);
        this.f۱۳۶۰۲c.play(ObjectAnimator.ofFloat(this.f۱۳۵۹۸V, "rotation", 0.0f, expandAngle));
        this.f۱۳۶۰۴d.play(collapseAnimator);
        this.f۱۳۶۰۲c.setInterpolator(this.f۱۳۵۸۸L);
        this.f۱۳۶۰۴d.setInterpolator(this.f۱۳۵۸۹M);
        this.f۱۳۶۰۲c.setDuration(300L);
        this.f۱۳۶۰۴d.setDuration(300L);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.f۱۳۶۱۲h = 0;
        int maxLabelWidth = 0;
        measureChildWithMargins(this.f۱۳۵۹۸V, widthMeasureSpec, 0, heightMeasureSpec, 0);
        for (int i = 0; i < this.f۱۳۶۱۷k; i++) {
            View child = getChildAt(i);
            if (!(child.getVisibility() == 8 || child == this.f۱۳۵۹۸V)) {
                measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
                this.f۱۳۶۱۲h = Math.max(this.f۱۳۶۱۲h, child.getMeasuredWidth());
            }
        }
        int i2 = 0;
        int height = 0;
        while (true) {
            int i3 = 1;
            if (i2 >= this.f۱۳۶۱۷k) {
                break;
            }
            View child2 = getChildAt(i2);
            if (!(child2.getVisibility() == 8 || child2 == this.f۱۳۵۹۸V)) {
                int usedWidth = 0 + child2.getMeasuredWidth();
                int height2 = height + child2.getMeasuredHeight();
                Ca label = (Ca) child2.getTag(Ce.fab_label);
                if (label != null) {
                    int measuredWidth = this.f۱۳۶۱۲h - child2.getMeasuredWidth();
                    if (!this.f۱۳۶۱۵i0) {
                        i3 = 2;
                    }
                    int labelOffset = measuredWidth / i3;
                    measureChildWithMargins(label, widthMeasureSpec, child2.getMeasuredWidth() + label.m۱۶۹۵۲b() + this.f۱۳۶۱۴i + labelOffset, heightMeasureSpec, 0);
                    maxLabelWidth = Math.max(maxLabelWidth, usedWidth + label.getMeasuredWidth() + labelOffset);
                    height = height2;
                } else {
                    height = height2;
                }
            }
            i2++;
        }
        int width = Math.max(this.f۱۳۶۱۲h, this.f۱۳۶۱۴i + maxLabelWidth) + getPaddingLeft() + getPaddingRight();
        int height3 = m۱۶۹۱۴a(height + (this.f۱۳۶۰۸f * (this.f۱۳۶۱۷k - 1)) + getPaddingTop() + getPaddingBottom());
        if (getLayoutParams().width == -1) {
            width = ViewGroup.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        }
        if (getLayoutParams().height == -1) {
            height3 = ViewGroup.getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec);
        }
        setMeasuredDimension(width, height3);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int buttonsHorizontalCenter;
        int menuButtonTop;
        int menuButtonLeft;
        int menuButtonTop2;
        int buttonsHorizontalCenter2;
        int i;
        int labelXAwayFromButton;
        if (this.f۱۳۶۰۹f0 == 0) {
            buttonsHorizontalCenter = ((r - l) - (this.f۱۳۶۱۲h / 2)) - getPaddingRight();
        } else {
            buttonsHorizontalCenter = (this.f۱۳۶۱۲h / 2) + getPaddingLeft();
        }
        boolean z = false;
        boolean openUp = this.f۱۳۶۰۰a0 == 0;
        if (openUp) {
            menuButtonTop = ((b - t) - this.f۱۳۶۱۰g.getMeasuredHeight()) - getPaddingBottom();
        } else {
            menuButtonTop = getPaddingTop();
        }
        int menuButtonLeft2 = buttonsHorizontalCenter - (this.f۱۳۶۱۰g.getMeasuredWidth() / 2);
        FloatingActionButton floatingActionButton = this.f۱۳۶۱۰g;
        floatingActionButton.layout(menuButtonLeft2, menuButtonTop, floatingActionButton.getMeasuredWidth() + menuButtonLeft2, this.f۱۳۶۱۰g.getMeasuredHeight() + menuButtonTop);
        int imageLeft = buttonsHorizontalCenter - (this.f۱۳۵۹۸V.getMeasuredWidth() / 2);
        int imageTop = ((this.f۱۳۶۱۰g.getMeasuredHeight() / 2) + menuButtonTop) - (this.f۱۳۵۹۸V.getMeasuredHeight() / 2);
        ImageView imageView = this.f۱۳۵۹۸V;
        imageView.layout(imageLeft, imageTop, imageView.getMeasuredWidth() + imageLeft, this.f۱۳۵۹۸V.getMeasuredHeight() + imageTop);
        int nextY = openUp ? this.f۱۳۶۱۰g.getMeasuredHeight() + menuButtonTop + this.f۱۳۶۰۸f : menuButtonTop;
        int i2 = this.f۱۳۶۱۷k - 1;
        while (i2 >= 0) {
            View child = getChildAt(i2);
            if (child != this.f۱۳۵۹۸V) {
                FloatingActionButton fab = (FloatingActionButton) child;
                if (fab.getVisibility() != 8) {
                    int childX = buttonsHorizontalCenter - (fab.getMeasuredWidth() / 2);
                    int childY = openUp ? (nextY - fab.getMeasuredHeight()) - this.f۱۳۶۰۸f : nextY;
                    if (fab != this.f۱۳۶۱۰g) {
                        fab.layout(childX, childY, fab.getMeasuredWidth() + childX, fab.getMeasuredHeight() + childY);
                        if (!this.f۱۳۶۱۹m) {
                            fab.m۱۶۹۰۳a(z);
                        }
                    }
                    View label = (View) fab.getTag(Ce.fab_label);
                    if (label != null) {
                        int labelsOffset = ((this.f۱۳۶۱۵i0 ? this.f۱۳۶۱۲h : fab.getMeasuredWidth()) / 2) + this.f۱۳۶۱۴i;
                        int labelXNearButton = this.f۱۳۶۰۹f0 == 0 ? buttonsHorizontalCenter - labelsOffset : buttonsHorizontalCenter + labelsOffset;
                        buttonsHorizontalCenter2 = buttonsHorizontalCenter;
                        if (this.f۱۳۶۰۹f0 == 0) {
                            labelXAwayFromButton = labelXNearButton - label.getMeasuredWidth();
                        } else {
                            labelXAwayFromButton = label.getMeasuredWidth() + labelXNearButton;
                        }
                        int labelLeft = this.f۱۳۶۰۹f0 == 0 ? labelXAwayFromButton : labelXNearButton;
                        int labelRight = this.f۱۳۶۰۹f0 == 0 ? labelXNearButton : labelXAwayFromButton;
                        menuButtonTop2 = menuButtonTop;
                        int labelTop = (childY - this.f۱۳۶۱۶j) + ((fab.getMeasuredHeight() - label.getMeasuredHeight()) / 2);
                        menuButtonLeft = menuButtonLeft2;
                        label.layout(labelLeft, labelTop, labelRight, labelTop + label.getMeasuredHeight());
                        if (!this.f۱۳۶۱۹m) {
                            label.setVisibility(4);
                        }
                    } else {
                        buttonsHorizontalCenter2 = buttonsHorizontalCenter;
                        menuButtonTop2 = menuButtonTop;
                        menuButtonLeft = menuButtonLeft2;
                    }
                    if (openUp) {
                        i = childY - this.f۱۳۶۰۸f;
                    } else {
                        i = child.getMeasuredHeight() + childY + this.f۱۳۶۰۸f;
                    }
                    nextY = i;
                    i2--;
                    buttonsHorizontalCenter = buttonsHorizontalCenter2;
                    menuButtonTop = menuButtonTop2;
                    menuButtonLeft2 = menuButtonLeft;
                    z = false;
                }
            }
            buttonsHorizontalCenter2 = buttonsHorizontalCenter;
            menuButtonTop2 = menuButtonTop;
            menuButtonLeft = menuButtonLeft2;
            i2--;
            buttonsHorizontalCenter = buttonsHorizontalCenter2;
            menuButtonTop = menuButtonTop2;
            menuButtonLeft2 = menuButtonLeft;
            z = false;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۶۹۱۴a(int dimension) {
        double d = (double) dimension;
        Double.isNaN(d);
        double d2 = (double) dimension;
        Double.isNaN(d2);
        return (int) ((d * 0.03d) + d2);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        bringChildToFront(this.f۱۳۶۱۰g);
        bringChildToFront(this.f۱۳۵۹۸V);
        this.f۱۳۶۱۷k = getChildCount();
        m۱۶۹۲۴c();
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۶۹۲۴c() {
        for (int i = 0; i < this.f۱۳۶۱۷k; i++) {
            if (getChildAt(i) != this.f۱۳۵۹۸V) {
                FloatingActionButton fab = (FloatingActionButton) getChildAt(i);
                if (fab.getTag(Ce.fab_label) == null) {
                    m۱۶۹۱۷a(fab);
                    FloatingActionButton floatingActionButton = this.f۱۳۶۱۰g;
                    if (fab == floatingActionButton) {
                        floatingActionButton.setOnClickListener(new View$OnClickListenerCc());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.clans.fab.FloatingActionMenu$c  reason: invalid class name */
    public class View$OnClickListenerCc implements View.OnClickListener {
        View$OnClickListenerCc() {
        }

        public void onClick(View v) {
            FloatingActionMenu floatingActionMenu = FloatingActionMenu.this;
            floatingActionMenu.m۱۶۹۳۱c(floatingActionMenu.f۱۳۵۹۰N);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۹۱۷a(FloatingActionButton fab) {
        String text = fab.getLabelText();
        if (!TextUtils.isEmpty(text)) {
            Ca label = new Ca(this.f۱۳۶۱۱g0);
            label.setClickable(true);
            label.setFab(fab);
            label.setShowAnimation(AnimationUtils.loadAnimation(getContext(), this.f۱۳۶۲۱o));
            label.setHideAnimation(AnimationUtils.loadAnimation(getContext(), this.f۱۳۶۲۲p));
            if (this.f۱۳۵۹۵S > 0) {
                label.setTextAppearance(getContext(), this.f۱۳۵۹۵S);
                label.setShowShadow(false);
                label.setUsingStyle(true);
            } else {
                label.m۱۶۹۵۰a(this.f۱۳۶۳۱y, this.f۱۳۶۳۲z, this.f۱۳۵۷۷A);
                label.setShowShadow(this.f۱۳۶۳۰x);
                label.setCornerRadius(this.f۱۳۶۲۹w);
                if (this.f۱۳۵۹۲P > 0) {
                    setLabelEllipsize(label);
                }
                label.setMaxLines(this.f۱۳۵۹۳Q);
                label.m۱۶۹۵۷f();
                label.setTextSize(0, this.f۱۳۶۲۸v);
                label.setTextColor(this.f۱۳۶۲۷u);
                int left = this.f۱۳۶۲۶t;
                int top = this.f۱۳۶۲۳q;
                if (this.f۱۳۶۳۰x) {
                    left += fab.getShadowRadius() + Math.abs(fab.getShadowXOffset());
                    top += fab.getShadowRadius() + Math.abs(fab.getShadowYOffset());
                }
                label.setPadding(left, top, this.f۱۳۶۲۶t, this.f۱۳۶۲۳q);
                if (this.f۱۳۵۹۳Q < 0 || this.f۱۳۵۹۱O) {
                    label.setSingleLine(this.f۱۳۵۹۱O);
                }
            }
            Typeface typeface = this.f۱۳۵۹۶T;
            if (typeface != null) {
                label.setTypeface(typeface);
            }
            label.setText(text);
            label.setOnClickListener(fab.getOnClickListener());
            addView(label);
            fab.setTag(Ce.fab_label, label);
        }
    }

    private void setLabelEllipsize(Ca label) {
        int i = this.f۱۳۵۹۲P;
        if (i == 1) {
            label.setEllipsize(TextUtils.TruncateAt.START);
        } else if (i == 2) {
            label.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i == 3) {
            label.setEllipsize(TextUtils.TruncateAt.END);
        } else if (i == 4) {
            label.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.MarginLayoutParams generateLayoutParams(AttributeSet attrs) {
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.MarginLayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new ViewGroup.MarginLayoutParams(p);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.MarginLayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof ViewGroup.MarginLayoutParams;
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (!this.f۱۳۵۹۹W) {
            return super.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action == 0) {
            return m۱۶۹۲۹a();
        }
        if (action != 1) {
            return false;
        }
        m۱۶۹۲۸a(this.f۱۳۵۹۰N);
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۶۹۲۹a() {
        return this.f۱۳۶۱۸l;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۶۹۳۱c(boolean animate) {
        if (m۱۶۹۲۹a()) {
            m۱۶۹۲۸a(animate);
        } else {
            m۱۶۹۳۰b(animate);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۹۳۰b(boolean animate) {
        if (!m۱۶۹۲۹a()) {
            if (m۱۶۹۲۷f()) {
                this.f۱۳۶۰۳c0.start();
            }
            if (this.f۱۳۵۹۷U) {
                AnimatorSet animatorSet = this.f۱۳۶۰۶e;
                if (animatorSet != null) {
                    animatorSet.start();
                } else {
                    this.f۱۳۶۰۴d.cancel();
                    this.f۱۳۶۰۲c.start();
                }
            }
            int delay = 0;
            int counter = 0;
            this.f۱۳۶۱۹m = true;
            for (int i = getChildCount() - 1; i >= 0; i--) {
                View child = getChildAt(i);
                if ((child instanceof FloatingActionButton) && child.getVisibility() != 8) {
                    counter++;
                    this.f۱۳۶۲۰n.postDelayed(new RunnableCd((FloatingActionButton) child, animate), (long) delay);
                    delay += this.f۱۳۵۸۷K;
                }
            }
            this.f۱۳۶۲۰n.postDelayed(new RunnableCe(), (long) (this.f۱۳۵۸۷K * (counter + 1)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.clans.fab.FloatingActionMenu$d  reason: invalid class name */
    public class RunnableCd implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ FloatingActionButton f۱۳۶۴۲c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۳۶۴۳d;

        RunnableCd(FloatingActionButton floatingActionButton, boolean z) {
            this.f۱۳۶۴۲c = floatingActionButton;
            this.f۱۳۶۴۳d = z;
        }

        public void run() {
            if (!FloatingActionMenu.this.m۱۶۹۲۹a()) {
                if (this.f۱۳۶۴۲c != FloatingActionMenu.this.f۱۳۶۱۰g) {
                    this.f۱۳۶۴۲c.m۱۶۹۰۵b(this.f۱۳۶۴۳d);
                }
                Ca label = (Ca) this.f۱۳۶۴۲c.getTag(Ce.fab_label);
                if (label != null && label.m۱۶۹۵۴c()) {
                    label.m۱۶۹۵۳b(this.f۱۳۶۴۳d);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.clans.fab.FloatingActionMenu$e  reason: invalid class name */
    public class RunnableCe implements Runnable {
        RunnableCe() {
        }

        public void run() {
            FloatingActionMenu.this.f۱۳۶۱۸l = true;
            if (FloatingActionMenu.this.f۱۳۶۰۱b0 != null) {
                FloatingActionMenu.this.f۱۳۶۰۱b0.m۱۶۹۳۲a(true);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۹۲۸a(boolean animate) {
        if (m۱۶۹۲۹a()) {
            if (m۱۶۹۲۷f()) {
                this.f۱۳۶۰۵d0.start();
            }
            if (this.f۱۳۵۹۷U) {
                AnimatorSet animatorSet = this.f۱۳۶۰۶e;
                if (animatorSet != null) {
                    animatorSet.start();
                } else {
                    this.f۱۳۶۰۴d.start();
                    this.f۱۳۶۰۲c.cancel();
                }
            }
            int delay = 0;
            int counter = 0;
            this.f۱۳۶۱۹m = false;
            for (int i = 0; i < getChildCount(); i++) {
                View child = getChildAt(i);
                if ((child instanceof FloatingActionButton) && child.getVisibility() != 8) {
                    counter++;
                    this.f۱۳۶۲۰n.postDelayed(new RunnableCf((FloatingActionButton) child, animate), (long) delay);
                    delay += this.f۱۳۵۸۷K;
                }
            }
            this.f۱۳۶۲۰n.postDelayed(new RunnableCg(), (long) (this.f۱۳۵۸۷K * (counter + 1)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.clans.fab.FloatingActionMenu$f  reason: invalid class name */
    public class RunnableCf implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ FloatingActionButton f۱۳۶۴۶c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۳۶۴۷d;

        RunnableCf(FloatingActionButton floatingActionButton, boolean z) {
            this.f۱۳۶۴۶c = floatingActionButton;
            this.f۱۳۶۴۷d = z;
        }

        public void run() {
            if (FloatingActionMenu.this.m۱۶۹۲۹a()) {
                if (this.f۱۳۶۴۶c != FloatingActionMenu.this.f۱۳۶۱۰g) {
                    this.f۱۳۶۴۶c.m۱۶۹۰۳a(this.f۱۳۶۴۷d);
                }
                Ca label = (Ca) this.f۱۳۶۴۶c.getTag(Ce.fab_label);
                if (label != null && label.m۱۶۹۵۴c()) {
                    label.m۱۶۹۵۱a(this.f۱۳۶۴۷d);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.clans.fab.FloatingActionMenu$g  reason: invalid class name */
    public class RunnableCg implements Runnable {
        RunnableCg() {
        }

        public void run() {
            FloatingActionMenu.this.f۱۳۶۱۸l = false;
            if (FloatingActionMenu.this.f۱۳۶۰۱b0 != null) {
                FloatingActionMenu.this.f۱۳۶۰۱b0.m۱۶۹۳۲a(false);
            }
        }
    }

    public void setIconAnimationInterpolator(Interpolator interpolator) {
        this.f۱۳۶۰۲c.setInterpolator(interpolator);
        this.f۱۳۶۰۴d.setInterpolator(interpolator);
    }

    public void setIconAnimationOpenInterpolator(Interpolator openInterpolator) {
        this.f۱۳۶۰۲c.setInterpolator(openInterpolator);
    }

    public void setIconAnimationCloseInterpolator(Interpolator closeInterpolator) {
        this.f۱۳۶۰۴d.setInterpolator(closeInterpolator);
    }

    public void setAnimated(boolean animated) {
        this.f۱۳۵۹۰N = animated;
        long j = 300;
        this.f۱۳۶۰۲c.setDuration(animated ? 300 : 0);
        AnimatorSet animatorSet = this.f۱۳۶۰۴d;
        if (!animated) {
            j = 0;
        }
        animatorSet.setDuration(j);
    }

    public void setAnimationDelayPerItem(int animationDelayPerItem) {
        this.f۱۳۵۸۷K = animationDelayPerItem;
    }

    public int getAnimationDelayPerItem() {
        return this.f۱۳۵۸۷K;
    }

    public void setOnMenuToggleListener(AbstractCh listener) {
        this.f۱۳۶۰۱b0 = listener;
    }

    public void setIconAnimated(boolean animated) {
        this.f۱۳۵۹۷U = animated;
    }

    public ImageView getMenuIconView() {
        return this.f۱۳۵۹۸V;
    }

    public void setIconToggleAnimatorSet(AnimatorSet toggleAnimatorSet) {
        this.f۱۳۶۰۶e = toggleAnimatorSet;
    }

    public AnimatorSet getIconToggleAnimatorSet() {
        return this.f۱۳۶۰۶e;
    }

    public void setMenuButtonShowAnimation(Animation showAnimation) {
        this.f۱۳۶۱۰g.setShowAnimation(showAnimation);
    }

    public void setMenuButtonHideAnimation(Animation hideAnimation) {
        this.f۱۳۶۱۰g.setHideAnimation(hideAnimation);
    }

    public void setClosedOnTouchOutside(boolean close) {
        this.f۱۳۵۹۹W = close;
    }

    public void setMenuButtonColorNormal(int color) {
        this.f۱۳۵۸۳G = color;
        this.f۱۳۶۱۰g.setColorNormal(color);
    }

    public void setMenuButtonColorNormalResId(int colorResId) {
        this.f۱۳۵۸۳G = getResources().getColor(colorResId);
        this.f۱۳۶۱۰g.setColorNormalResId(colorResId);
    }

    public int getMenuButtonColorNormal() {
        return this.f۱۳۵۸۳G;
    }

    public void setMenuButtonColorPressed(int color) {
        this.f۱۳۵۸۴H = color;
        this.f۱۳۶۱۰g.setColorPressed(color);
    }

    public void setMenuButtonColorPressedResId(int colorResId) {
        this.f۱۳۵۸۴H = getResources().getColor(colorResId);
        this.f۱۳۶۱۰g.setColorPressedResId(colorResId);
    }

    public int getMenuButtonColorPressed() {
        return this.f۱۳۵۸۴H;
    }

    public void setMenuButtonColorRipple(int color) {
        this.f۱۳۵۸۵I = color;
        this.f۱۳۶۱۰g.setColorRipple(color);
    }

    public void setMenuButtonColorRippleResId(int colorResId) {
        this.f۱۳۵۸۵I = getResources().getColor(colorResId);
        this.f۱۳۶۱۰g.setColorRippleResId(colorResId);
    }

    public int getMenuButtonColorRipple() {
        return this.f۱۳۵۸۵I;
    }

    public void setMenuButtonLabelText(String text) {
        this.f۱۳۶۱۰g.setLabelText(text);
    }

    public String getMenuButtonLabelText() {
        return this.f۱۳۶۱۳h0;
    }

    public void setOnMenuButtonClickListener(View.OnClickListener clickListener) {
        this.f۱۳۶۱۰g.setOnClickListener(clickListener);
    }

    public void setOnMenuButtonLongClickListener(View.OnLongClickListener longClickListener) {
        this.f۱۳۶۱۰g.setOnLongClickListener(longClickListener);
    }
}
