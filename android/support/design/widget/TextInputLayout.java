package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.internal.Cg;
import android.support.design.internal.Ch;
import android.support.p۰۴۳v4.view.AbstractCa;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.widget.Cp;
import android.support.p۰۴۷v7.widget.AppCompatTextView;
import android.support.p۰۴۷v7.widget.Ch0;
import android.support.p۰۴۷v7.widget.Cj1;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cb;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cf;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ci;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cj;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck;

public class TextInputLayout extends LinearLayout {

    /* renamed from: A  reason: contains not printable characters */
    private final int f۹۷۸۸A;

    /* renamed from: B  reason: contains not printable characters */
    private int f۹۷۸۹B;

    /* renamed from: C  reason: contains not printable characters */
    private int f۹۷۹۰C;

    /* renamed from: D  reason: contains not printable characters */
    private Drawable f۹۷۹۱D;

    /* renamed from: E  reason: contains not printable characters */
    private final Rect f۹۷۹۲E;

    /* renamed from: F  reason: contains not printable characters */
    private final RectF f۹۷۹۳F;

    /* renamed from: G  reason: contains not printable characters */
    private Typeface f۹۷۹۴G;

    /* renamed from: H  reason: contains not printable characters */
    private boolean f۹۷۹۵H;

    /* renamed from: I  reason: contains not printable characters */
    private Drawable f۹۷۹۶I;

    /* renamed from: J  reason: contains not printable characters */
    private CharSequence f۹۷۹۷J;

    /* renamed from: K  reason: contains not printable characters */
    private CheckableImageButton f۹۷۹۸K;

    /* renamed from: L  reason: contains not printable characters */
    private boolean f۹۷۹۹L;

    /* renamed from: M  reason: contains not printable characters */
    private Drawable f۹۸۰۰M;

    /* renamed from: N  reason: contains not printable characters */
    private Drawable f۹۸۰۱N;

    /* renamed from: O  reason: contains not printable characters */
    private ColorStateList f۹۸۰۲O;

    /* renamed from: P  reason: contains not printable characters */
    private boolean f۹۸۰۳P;

    /* renamed from: Q  reason: contains not printable characters */
    private PorterDuff.Mode f۹۸۰۴Q;

    /* renamed from: R  reason: contains not printable characters */
    private boolean f۹۸۰۵R;

    /* renamed from: S  reason: contains not printable characters */
    private ColorStateList f۹۸۰۶S;

    /* renamed from: T  reason: contains not printable characters */
    private ColorStateList f۹۸۰۷T;

    /* renamed from: U  reason: contains not printable characters */
    private final int f۹۸۰۸U;

    /* renamed from: V  reason: contains not printable characters */
    private final int f۹۸۰۹V;

    /* renamed from: W  reason: contains not printable characters */
    private int f۹۸۱۰W;

    /* renamed from: a0  reason: contains not printable characters */
    private final int f۹۸۱۱a0;

    /* renamed from: b0  reason: contains not printable characters */
    private boolean f۹۸۱۲b0;

    /* renamed from: c  reason: contains not printable characters */
    private final FrameLayout f۹۸۱۳c;

    /* renamed from: c0  reason: contains not printable characters */
    final Ch f۹۸۱۴c0;

    /* renamed from: d  reason: contains not printable characters */
    EditText f۹۸۱۵d;

    /* renamed from: d0  reason: contains not printable characters */
    private boolean f۹۸۱۶d0;

    /* renamed from: e  reason: contains not printable characters */
    private CharSequence f۹۸۱۷e;

    /* renamed from: e0  reason: contains not printable characters */
    private ValueAnimator f۹۸۱۸e0;

    /* renamed from: f  reason: contains not printable characters */
    private final Cp f۹۸۱۹f;

    /* renamed from: f0  reason: contains not printable characters */
    private boolean f۹۸۲۰f0;

    /* renamed from: g  reason: contains not printable characters */
    boolean f۹۸۲۱g;

    /* renamed from: g0  reason: contains not printable characters */
    private boolean f۹۸۲۲g0;

    /* renamed from: h  reason: contains not printable characters */
    private int f۹۸۲۳h;

    /* renamed from: h0  reason: contains not printable characters */
    private boolean f۹۸۲۴h0;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۹۸۲۵i;

    /* renamed from: j  reason: contains not printable characters */
    private TextView f۹۸۲۶j;

    /* renamed from: k  reason: contains not printable characters */
    private final int f۹۸۲۷k;

    /* renamed from: l  reason: contains not printable characters */
    private final int f۹۸۲۸l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۹۸۲۹m;

    /* renamed from: n  reason: contains not printable characters */
    private CharSequence f۹۸۳۰n;

    /* renamed from: o  reason: contains not printable characters */
    private boolean f۹۸۳۱o;

    /* renamed from: p  reason: contains not printable characters */
    private GradientDrawable f۹۸۳۲p;

    /* renamed from: q  reason: contains not printable characters */
    private final int f۹۸۳۳q;

    /* renamed from: r  reason: contains not printable characters */
    private final int f۹۸۳۴r;

    /* renamed from: s  reason: contains not printable characters */
    private int f۹۸۳۵s;

    /* renamed from: t  reason: contains not printable characters */
    private final int f۹۸۳۶t;

    /* renamed from: u  reason: contains not printable characters */
    private float f۹۸۳۷u;

    /* renamed from: v  reason: contains not printable characters */
    private float f۹۸۳۸v;

    /* renamed from: w  reason: contains not printable characters */
    private float f۹۸۳۹w;

    /* renamed from: x  reason: contains not printable characters */
    private float f۹۸۴۰x;

    /* renamed from: y  reason: contains not printable characters */
    private int f۹۸۴۱y;

    /* renamed from: z  reason: contains not printable characters */
    private final int f۹۸۴۲z;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attrs) {
        this(context, attrs, Cb.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۹۸۱۹f = new Cp(this);
        this.f۹۷۹۲E = new Rect();
        this.f۹۷۹۳F = new RectF();
        this.f۹۸۱۴c0 = new Ch(this);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.f۹۸۱۳c = new FrameLayout(context);
        this.f۹۸۱۳c.setAddStatesFromChildren(true);
        addView(this.f۹۸۱۳c);
        this.f۹۸۱۴c0.m۱۱۸۴۶b(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.f۸۲۵۱a);
        this.f۹۸۱۴c0.m۱۱۸۳۵a(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.f۸۲۵۱a);
        this.f۹۸۱۴c0.m۱۱۸۴۴b(8388659);
        Cj1 a = Cg.m۱۱۳۶۱d(context, attrs, Ck.TextInputLayout, defStyleAttr, Cj.Widget_Design_TextInputLayout, new int[0]);
        this.f۹۸۲۹m = a.m۱۵۳۵۱a(Ck.TextInputLayout_hintEnabled, true);
        setHint(a.m۱۵۳۶۰e(Ck.TextInputLayout_android_hint));
        this.f۹۸۱۶d0 = a.m۱۵۳۵۱a(Ck.TextInputLayout_hintAnimationEnabled, true);
        this.f۹۸۳۳q = context.getResources().getDimensionPixelOffset(p۰۰۰a.p۰۰۵b.p۰۰۸c.Cd.mtrl_textinput_box_bottom_offset);
        this.f۹۸۳۴r = context.getResources().getDimensionPixelOffset(p۰۰۰a.p۰۰۵b.p۰۰۸c.Cd.mtrl_textinput_box_label_cutout_padding);
        this.f۹۸۳۶t = a.m۱۵۳۵۳b(Ck.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f۹۸۳۷u = a.m۱۵۳۴۶a(Ck.TextInputLayout_boxCornerRadiusTopStart, 0.0f);
        this.f۹۸۳۸v = a.m۱۵۳۴۶a(Ck.TextInputLayout_boxCornerRadiusTopEnd, 0.0f);
        this.f۹۸۳۹w = a.m۱۵۳۴۶a(Ck.TextInputLayout_boxCornerRadiusBottomEnd, 0.0f);
        this.f۹۸۴۰x = a.m۱۵۳۴۶a(Ck.TextInputLayout_boxCornerRadiusBottomStart, 0.0f);
        this.f۹۷۹۰C = a.m۱۵۳۴۷a(Ck.TextInputLayout_boxBackgroundColor, 0);
        this.f۹۸۱۰W = a.m۱۵۳۴۷a(Ck.TextInputLayout_boxStrokeColor, 0);
        this.f۹۸۴۲z = context.getResources().getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۸c.Cd.mtrl_textinput_box_stroke_width_default);
        this.f۹۷۸۸A = context.getResources().getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۸c.Cd.mtrl_textinput_box_stroke_width_focused);
        this.f۹۸۴۱y = this.f۹۸۴۲z;
        setBoxBackgroundMode(a.m۱۵۳۵۷d(Ck.TextInputLayout_boxBackgroundMode, 0));
        if (a.m۱۵۳۶۴g(Ck.TextInputLayout_android_textColorHint)) {
            ColorStateList a2 = a.m۱۵۳۴۸a(Ck.TextInputLayout_android_textColorHint);
            this.f۹۸۰۷T = a2;
            this.f۹۸۰۶S = a2;
        }
        this.f۹۸۰۸U = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, p۰۰۰a.p۰۰۵b.p۰۰۸c.Cc.mtrl_textinput_default_box_stroke_color);
        this.f۹۸۱۱a0 = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, p۰۰۰a.p۰۰۵b.p۰۰۸c.Cc.mtrl_textinput_disabled_color);
        this.f۹۸۰۹V = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, p۰۰۰a.p۰۰۵b.p۰۰۸c.Cc.mtrl_textinput_hovered_box_stroke_color);
        if (a.m۱۵۳۶۳g(Ck.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(a.m۱۵۳۶۳g(Ck.TextInputLayout_hintTextAppearance, 0));
        }
        int errorTextAppearance = a.m۱۵۳۶۳g(Ck.TextInputLayout_errorTextAppearance, 0);
        boolean errorEnabled = a.m۱۵۳۵۱a(Ck.TextInputLayout_errorEnabled, false);
        int helperTextTextAppearance = a.m۱۵۳۶۳g(Ck.TextInputLayout_helperTextTextAppearance, 0);
        boolean helperTextEnabled = a.m۱۵۳۵۱a(Ck.TextInputLayout_helperTextEnabled, false);
        CharSequence helperText = a.m۱۵۳۶۰e(Ck.TextInputLayout_helperText);
        boolean counterEnabled = a.m۱۵۳۵۱a(Ck.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(a.m۱۵۳۵۷d(Ck.TextInputLayout_counterMaxLength, -1));
        this.f۹۸۲۸l = a.m۱۵۳۶۳g(Ck.TextInputLayout_counterTextAppearance, 0);
        this.f۹۸۲۷k = a.m۱۵۳۶۳g(Ck.TextInputLayout_counterOverflowTextAppearance, 0);
        this.f۹۷۹۵H = a.m۱۵۳۵۱a(Ck.TextInputLayout_passwordToggleEnabled, false);
        this.f۹۷۹۶I = a.m۱۵۳۵۴b(Ck.TextInputLayout_passwordToggleDrawable);
        this.f۹۷۹۷J = a.m۱۵۳۶۰e(Ck.TextInputLayout_passwordToggleContentDescription);
        if (a.m۱۵۳۶۴g(Ck.TextInputLayout_passwordToggleTint)) {
            this.f۹۸۰۳P = true;
            this.f۹۸۰۲O = a.m۱۵۳۴۸a(Ck.TextInputLayout_passwordToggleTint);
        }
        if (a.m۱۵۳۶۴g(Ck.TextInputLayout_passwordToggleTintMode)) {
            this.f۹۸۰۵R = true;
            this.f۹۸۰۴Q = Ch.m۱۱۳۶۲a(a.m۱۵۳۵۷d(Ck.TextInputLayout_passwordToggleTintMode, -1), null);
        }
        a.m۱۵۳۵۰a();
        setHelperTextEnabled(helperTextEnabled);
        setHelperText(helperText);
        setHelperTextTextAppearance(helperTextTextAppearance);
        setErrorEnabled(errorEnabled);
        setErrorTextAppearance(errorTextAppearance);
        setCounterEnabled(counterEnabled);
        m۱۱۷۷۰f();
        Cu.m۱۳۰۰۷f(this, 2);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (child instanceof EditText) {
            FrameLayout.LayoutParams flp = new FrameLayout.LayoutParams(params);
            flp.gravity = (flp.gravity & -113) | 16;
            this.f۹۸۱۳c.addView(child, flp);
            this.f۹۸۱۳c.setLayoutParams(params);
            m۱۱۷۸۴t();
            setEditText((EditText) child);
            return;
        }
        super.addView(child, index, params);
    }

    private Drawable getBoxBackground() {
        int i = this.f۹۸۳۵s;
        if (i == 1 || i == 2) {
            return this.f۹۸۳۲p;
        }
        throw new IllegalStateException();
    }

    public void setBoxBackgroundMode(int boxBackgroundMode) {
        if (boxBackgroundMode != this.f۹۸۳۵s) {
            this.f۹۸۳۵s = boxBackgroundMode;
            m۱۱۷۷۹o();
        }
    }

    /* renamed from: o  reason: contains not printable characters */
    private void m۱۱۷۷۹o() {
        m۱۱۷۷۱g();
        if (this.f۹۸۳۵s != 0) {
            m۱۱۷۸۴t();
        }
        m۱۱۷۸۶v();
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۱۷۷۱g() {
        int i = this.f۹۸۳۵s;
        if (i == 0) {
            this.f۹۸۳۲p = null;
        } else if (i == 2 && this.f۹۸۲۹m && !(this.f۹۸۳۲p instanceof Ci)) {
            this.f۹۸۳۲p = new Ci();
        } else if (!(this.f۹۸۳۲p instanceof GradientDrawable)) {
            this.f۹۸۳۲p = new GradientDrawable();
        }
    }

    public void setBoxStrokeColor(int boxStrokeColor) {
        if (this.f۹۸۱۰W != boxStrokeColor) {
            this.f۹۸۱۰W = boxStrokeColor;
            m۱۱۷۹۵d();
        }
    }

    public int getBoxStrokeColor() {
        return this.f۹۸۱۰W;
    }

    public void setBoxBackgroundColorResource(int boxBackgroundColorId) {
        setBoxBackgroundColor(android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(getContext(), boxBackgroundColorId));
    }

    public void setBoxBackgroundColor(int boxBackgroundColor) {
        if (this.f۹۷۹۰C != boxBackgroundColor) {
            this.f۹۷۹۰C = boxBackgroundColor;
            m۱۱۷۶۹e();
        }
    }

    public int getBoxBackgroundColor() {
        return this.f۹۷۹۰C;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f۹۸۳۷u;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f۹۸۳۸v;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f۹۸۳۹w;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f۹۸۴۰x;
    }

    private float[] getCornerRadiiAsArray() {
        if (!Ch.m۱۱۳۶۳a(this)) {
            float f = this.f۹۸۳۷u;
            float f2 = this.f۹۸۳۸v;
            float f3 = this.f۹۸۳۹w;
            float f4 = this.f۹۸۴۰x;
            return new float[]{f, f, f2, f2, f3, f3, f4, f4};
        }
        float f5 = this.f۹۸۳۸v;
        float f6 = this.f۹۸۳۷u;
        float f7 = this.f۹۸۴۰x;
        float f8 = this.f۹۸۳۹w;
        return new float[]{f5, f5, f6, f6, f7, f7, f8, f8};
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f۹۷۹۴G) {
            this.f۹۷۹۴G = typeface;
            this.f۹۸۱۴c0.m۱۱۸۳۹a(typeface);
            this.f۹۸۱۹f.m۱۱۹۷۶a(typeface);
            TextView textView = this.f۹۸۲۶j;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public Typeface getTypeface() {
        return this.f۹۷۹۴G;
    }

    public void dispatchProvideAutofillStructure(ViewStructure structure, int flags) {
        EditText editText;
        if (this.f۹۸۱۷e == null || (editText = this.f۹۸۱۵d) == null) {
            super.dispatchProvideAutofillStructure(structure, flags);
            return;
        }
        boolean wasProvidingHint = this.f۹۸۳۱o;
        this.f۹۸۳۱o = false;
        CharSequence hint = editText.getHint();
        this.f۹۸۱۵d.setHint(this.f۹۸۱۷e);
        try {
            super.dispatchProvideAutofillStructure(structure, flags);
        } finally {
            this.f۹۸۱۵d.setHint(hint);
            this.f۹۸۳۱o = wasProvidingHint;
        }
    }

    private void setEditText(EditText editText) {
        if (this.f۹۸۱۵d == null) {
            if (!(editText instanceof Cw)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f۹۸۱۵d = editText;
            m۱۱۷۷۹o();
            setTextInputAccessibilityDelegate(new Cd(this));
            if (!m۱۱۷۷۸n()) {
                this.f۹۸۱۴c0.m۱۱۸۳۹a(this.f۹۸۱۵d.getTypeface());
            }
            this.f۹۸۱۴c0.m۱۱۸۳۲a(this.f۹۸۱۵d.getTextSize());
            int editTextGravity = this.f۹۸۱۵d.getGravity();
            this.f۹۸۱۴c0.m۱۱۸۴۴b((editTextGravity & -113) | 48);
            this.f۹۸۱۴c0.m۱۱۸۴۹c(editTextGravity);
            this.f۹۸۱۵d.addTextChangedListener(new Ca());
            if (this.f۹۸۰۶S == null) {
                this.f۹۸۰۶S = this.f۹۸۱۵d.getHintTextColors();
            }
            if (this.f۹۸۲۹m) {
                if (TextUtils.isEmpty(this.f۹۸۳۰n)) {
                    this.f۹۸۱۷e = this.f۹۸۱۵d.getHint();
                    setHint(this.f۹۸۱۷e);
                    this.f۹۸۱۵d.setHint((CharSequence) null);
                }
                this.f۹۸۳۱o = true;
            }
            if (this.f۹۸۲۶j != null) {
                m۱۱۷۸۸a(this.f۹۸۱۵d.getText().length());
            }
            this.f۹۸۱۹f.m۱۱۹۷۴a();
            m۱۱۷۸۵u();
            m۱۱۷۶۵a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.TextInputLayout$a  reason: invalid class name */
    public class Ca implements TextWatcher {
        Ca() {
        }

        public void afterTextChanged(Editable s) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m۱۱۷۹۲b(!textInputLayout.f۹۸۲۴h0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f۹۸۲۱g) {
                textInputLayout2.m۱۱۷۸۸a(s.length());
            }
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    }

    /* renamed from: t  reason: contains not printable characters */
    private void m۱۱۷۸۴t() {
        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) this.f۹۸۱۳c.getLayoutParams();
        int newTopMargin = m۱۱۷۷۴j();
        if (newTopMargin != lp.topMargin) {
            lp.topMargin = newTopMargin;
            this.f۹۸۱۳c.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۷۹۲b(boolean animate) {
        m۱۱۷۶۵a(animate, false);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۷۶۵a(boolean animate, boolean force) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f۹۸۱۵d;
        boolean hasFocus = true;
        boolean hasText = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f۹۸۱۵d;
        if (editText2 == null || !editText2.hasFocus()) {
            hasFocus = false;
        }
        boolean errorShouldBeShown = this.f۹۸۱۹f.m۱۱۹۸۸c();
        ColorStateList colorStateList2 = this.f۹۸۰۶S;
        if (colorStateList2 != null) {
            this.f۹۸۱۴c0.m۱۱۸۳۶a(colorStateList2);
            this.f۹۸۱۴c0.m۱۱۸۴۷b(this.f۹۸۰۶S);
        }
        if (!isEnabled) {
            this.f۹۸۱۴c0.m۱۱۸۳۶a(ColorStateList.valueOf(this.f۹۸۱۱a0));
            this.f۹۸۱۴c0.m۱۱۸۴۷b(ColorStateList.valueOf(this.f۹۸۱۱a0));
        } else if (errorShouldBeShown) {
            this.f۹۸۱۴c0.m۱۱۸۳۶a(this.f۹۸۱۹f.m۱۱۹۹۱f());
        } else if (this.f۹۸۲۵i && (textView = this.f۹۸۲۶j) != null) {
            this.f۹۸۱۴c0.m۱۱۸۳۶a(textView.getTextColors());
        } else if (hasFocus && (colorStateList = this.f۹۸۰۷T) != null) {
            this.f۹۸۱۴c0.m۱۱۸۳۶a(colorStateList);
        }
        if (hasText || (isEnabled() && (hasFocus || errorShouldBeShown))) {
            if (force || this.f۹۸۱۲b0) {
                m۱۱۷۶۷c(animate);
            }
        } else if (force || !this.f۹۸۱۲b0) {
            m۱۱۷۶۸d(animate);
        }
    }

    public EditText getEditText() {
        return this.f۹۸۱۵d;
    }

    public void setHint(CharSequence hint) {
        if (this.f۹۸۲۹m) {
            setHintInternal(hint);
            sendAccessibilityEvent(2048);
        }
    }

    private void setHintInternal(CharSequence hint) {
        if (!TextUtils.equals(hint, this.f۹۸۳۰n)) {
            this.f۹۸۳۰n = hint;
            this.f۹۸۱۴c0.m۱۱۸۴۰a(hint);
            if (!this.f۹۸۱۲b0) {
                m۱۱۷۸۰p();
            }
        }
    }

    public CharSequence getHint() {
        if (this.f۹۸۲۹m) {
            return this.f۹۸۳۰n;
        }
        return null;
    }

    public void setHintEnabled(boolean enabled) {
        if (enabled != this.f۹۸۲۹m) {
            this.f۹۸۲۹m = enabled;
            if (!this.f۹۸۲۹m) {
                this.f۹۸۳۱o = false;
                if (!TextUtils.isEmpty(this.f۹۸۳۰n) && TextUtils.isEmpty(this.f۹۸۱۵d.getHint())) {
                    this.f۹۸۱۵d.setHint(this.f۹۸۳۰n);
                }
                setHintInternal(null);
            } else {
                CharSequence editTextHint = this.f۹۸۱۵d.getHint();
                if (!TextUtils.isEmpty(editTextHint)) {
                    if (TextUtils.isEmpty(this.f۹۸۳۰n)) {
                        setHint(editTextHint);
                    }
                    this.f۹۸۱۵d.setHint((CharSequence) null);
                }
                this.f۹۸۳۱o = true;
            }
            if (this.f۹۸۱۵d != null) {
                m۱۱۷۸۴t();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۷۹۳b() {
        return this.f۹۸۳۱o;
    }

    public void setHintTextAppearance(int resId) {
        this.f۹۸۱۴c0.m۱۱۸۳۳a(resId);
        this.f۹۸۰۷T = this.f۹۸۱۴c0.m۱۱۸۴۲b();
        if (this.f۹۸۱۵d != null) {
            m۱۱۷۹۲b(false);
            m۱۱۷۸۴t();
        }
    }

    public void setDefaultHintTextColor(ColorStateList textColor) {
        this.f۹۸۰۶S = textColor;
        this.f۹۸۰۷T = textColor;
        if (this.f۹۸۱۵d != null) {
            m۱۱۷۹۲b(false);
        }
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f۹۸۰۶S;
    }

    public void setErrorEnabled(boolean enabled) {
        this.f۹۸۱۹f.m۱۱۹۷۹a(enabled);
    }

    public void setErrorTextAppearance(int resId) {
        this.f۹۸۱۹f.m۱۱۹۸۲b(resId);
    }

    public void setErrorTextColor(ColorStateList textColors) {
        this.f۹۸۱۹f.m۱۱۹۷۵a(textColors);
    }

    public int getErrorCurrentTextColors() {
        return this.f۹۸۱۹f.m۱۱۹۹۰e();
    }

    public void setHelperTextTextAppearance(int resId) {
        this.f۹۸۱۹f.m۱۱۹۸۷c(resId);
    }

    public void setHelperTextEnabled(boolean enabled) {
        this.f۹۸۱۹f.m۱۱۹۸۶b(enabled);
    }

    public void setHelperText(CharSequence helperText) {
        if (!TextUtils.isEmpty(helperText)) {
            if (!m۱۱۷۹۱a()) {
                setHelperTextEnabled(true);
            }
            this.f۹۸۱۹f.m۱۱۹۸۵b(helperText);
        } else if (m۱۱۷۹۱a()) {
            setHelperTextEnabled(false);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۷۹۱a() {
        return this.f۹۸۱۹f.m۱۱۹۹۷l();
    }

    public void setHelperTextColor(ColorStateList textColors) {
        this.f۹۸۱۹f.m۱۱۹۸۳b(textColors);
    }

    public int getHelperTextCurrentTextColor() {
        return this.f۹۸۱۹f.m۱۱۹۹۳h();
    }

    public void setError(CharSequence errorText) {
        if (!this.f۹۸۱۹f.m۱۱۹۹۶k()) {
            if (!TextUtils.isEmpty(errorText)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(errorText)) {
            this.f۹۸۱۹f.m۱۱۹۷۸a(errorText);
        } else {
            this.f۹۸۱۹f.m۱۱۹۹۴i();
        }
    }

    public void setCounterEnabled(boolean enabled) {
        if (this.f۹۸۲۱g != enabled) {
            if (enabled) {
                this.f۹۸۲۶j = new AppCompatTextView(getContext());
                this.f۹۸۲۶j.setId(Cf.textinput_counter);
                Typeface typeface = this.f۹۷۹۴G;
                if (typeface != null) {
                    this.f۹۸۲۶j.setTypeface(typeface);
                }
                this.f۹۸۲۶j.setMaxLines(1);
                m۱۱۷۸۹a(this.f۹۸۲۶j, this.f۹۸۲۸l);
                this.f۹۸۱۹f.m۱۱۹۷۷a(this.f۹۸۲۶j, 2);
                EditText editText = this.f۹۸۱۵d;
                if (editText == null) {
                    m۱۱۷۸۸a(0);
                } else {
                    m۱۱۷۸۸a(editText.getText().length());
                }
            } else {
                this.f۹۸۱۹f.m۱۱۹۸۴b(this.f۹۸۲۶j, 2);
                this.f۹۸۲۶j = null;
            }
            this.f۹۸۲۱g = enabled;
        }
    }

    public void setCounterMaxLength(int maxLength) {
        if (this.f۹۸۲۳h != maxLength) {
            if (maxLength > 0) {
                this.f۹۸۲۳h = maxLength;
            } else {
                this.f۹۸۲۳h = -1;
            }
            if (this.f۹۸۲۱g) {
                EditText editText = this.f۹۸۱۵d;
                m۱۱۷۸۸a(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setEnabled(boolean enabled) {
        m۱۱۷۶۴a(this, enabled);
        super.setEnabled(enabled);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۱۷۶۴a(ViewGroup vg, boolean enabled) {
        int count = vg.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = vg.getChildAt(i);
            child.setEnabled(enabled);
            if (child instanceof ViewGroup) {
                m۱۱۷۶۴a((ViewGroup) child, enabled);
            }
        }
    }

    public int getCounterMaxLength() {
        return this.f۹۸۲۳h;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f۹۸۲۱g || !this.f۹۸۲۵i || (textView = this.f۹۸۲۶j) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۷۸۸a(int length) {
        boolean wasCounterOverflowed = this.f۹۸۲۵i;
        if (this.f۹۸۲۳h == -1) {
            this.f۹۸۲۶j.setText(String.valueOf(length));
            this.f۹۸۲۶j.setContentDescription(null);
            this.f۹۸۲۵i = false;
        } else {
            if (Cu.m۱۲۹۹۵b(this.f۹۸۲۶j) == 1) {
                Cu.m۱۳۰۰۵e(this.f۹۸۲۶j, 0);
            }
            this.f۹۸۲۵i = length > this.f۹۸۲۳h;
            boolean z = this.f۹۸۲۵i;
            if (wasCounterOverflowed != z) {
                m۱۱۷۸۹a(this.f۹۸۲۶j, z ? this.f۹۸۲۷k : this.f۹۸۲۸l);
                if (this.f۹۸۲۵i) {
                    Cu.m۱۳۰۰۵e(this.f۹۸۲۶j, 1);
                }
            }
            this.f۹۸۲۶j.setText(getContext().getString(Ci.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f۹۸۲۳h)));
            this.f۹۸۲۶j.setContentDescription(getContext().getString(Ci.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f۹۸۲۳h)));
        }
        if (this.f۹۸۱۵d != null && wasCounterOverflowed != this.f۹۸۲۵i) {
            m۱۱۷۹۲b(false);
            m۱۱۷۹۵d();
            m۱۱۷۹۴c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۷۸۹a(TextView textView, int textAppearance) {
        boolean useDefaultColor = false;
        try {
            Cp.m۱۳۳۱۲d(textView, textAppearance);
            if (Build.VERSION.SDK_INT >= 23 && textView.getTextColors().getDefaultColor() == -65281) {
                useDefaultColor = true;
            }
        } catch (Exception e) {
            useDefaultColor = true;
        }
        if (useDefaultColor) {
            Cp.m۱۳۳۱۲d(textView, Cj.TextAppearance_AppCompat_Caption);
            textView.setTextColor(android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(getContext(), p۰۰۰a.p۰۰۵b.p۰۰۸c.Cc.design_error));
        }
    }

    /* renamed from: v  reason: contains not printable characters */
    private void m۱۱۷۸۶v() {
        if (this.f۹۸۳۵s != 0 && this.f۹۸۳۲p != null && this.f۹۸۱۵d != null && getRight() != 0) {
            int left = this.f۹۸۱۵d.getLeft();
            int top = m۱۱۷۷۲h();
            int right = this.f۹۸۱۵d.getRight();
            int bottom = this.f۹۸۱۵d.getBottom() + this.f۹۸۳۳q;
            if (this.f۹۸۳۵s == 2) {
                int i = this.f۹۷۸۸A;
                left += i / 2;
                top -= i / 2;
                right -= i / 2;
                bottom += i / 2;
            }
            this.f۹۸۳۲p.setBounds(left, top, right, bottom);
            m۱۱۷۶۹e();
            m۱۱۷۸۳s();
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    private int m۱۱۷۷۲h() {
        EditText editText = this.f۹۸۱۵d;
        if (editText == null) {
            return 0;
        }
        int i = this.f۹۸۳۵s;
        if (i == 1) {
            return editText.getTop();
        }
        if (i != 2) {
            return 0;
        }
        return editText.getTop() + m۱۱۷۷۴j();
    }

    /* renamed from: j  reason: contains not printable characters */
    private int m۱۱۷۷۴j() {
        if (!this.f۹۸۲۹m) {
            return 0;
        }
        int i = this.f۹۸۳۵s;
        if (i == 0 || i == 1) {
            return (int) this.f۹۸۱۴c0.m۱۱۸۴۸c();
        }
        if (i != 2) {
            return 0;
        }
        return (int) (this.f۹۸۱۴c0.m۱۱۸۴۸c() / 2.0f);
    }

    /* renamed from: i  reason: contains not printable characters */
    private int m۱۱۷۷۳i() {
        int i = this.f۹۸۳۵s;
        if (i == 1) {
            return getBoxBackground().getBounds().top + this.f۹۸۳۶t;
        }
        if (i != 2) {
            return getPaddingTop();
        }
        return getBoxBackground().getBounds().top - m۱۱۷۷۴j();
    }

    /* renamed from: s  reason: contains not printable characters */
    private void m۱۱۷۸۳s() {
        Drawable editTextBackground;
        EditText editText = this.f۹۸۱۵d;
        if (editText != null && (editTextBackground = editText.getBackground()) != null) {
            if (Ch0.m۱۵۲۵۵a(editTextBackground)) {
                editTextBackground = editTextBackground.mutate();
            }
            Cj.m۱۱۸۶۴a(this, this.f۹۸۱۵d, new Rect());
            Rect editTextBackgroundBounds = editTextBackground.getBounds();
            if (editTextBackgroundBounds.left != editTextBackgroundBounds.right) {
                Rect editTextBackgroundPadding = new Rect();
                editTextBackground.getPadding(editTextBackgroundPadding);
                editTextBackground.setBounds(editTextBackgroundBounds.left - editTextBackgroundPadding.left, editTextBackgroundBounds.top, editTextBackgroundBounds.right + (editTextBackgroundPadding.right * 2), this.f۹۸۱۵d.getBottom());
            }
        }
    }

    /* renamed from: q  reason: contains not printable characters */
    private void m۱۱۷۸۱q() {
        int i = this.f۹۸۳۵s;
        if (i == 1) {
            this.f۹۸۴۱y = 0;
        } else if (i == 2 && this.f۹۸۱۰W == 0) {
            this.f۹۸۱۰W = this.f۹۸۰۷T.getColorForState(getDrawableState(), this.f۹۸۰۷T.getDefaultColor());
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۱۷۶۹e() {
        int i;
        Drawable drawable;
        if (this.f۹۸۳۲p != null) {
            m۱۱۷۸۱q();
            EditText editText = this.f۹۸۱۵d;
            if (editText != null && this.f۹۸۳۵s == 2) {
                if (editText.getBackground() != null) {
                    this.f۹۷۹۱D = this.f۹۸۱۵d.getBackground();
                }
                Cu.m۱۲۹۸۴a(this.f۹۸۱۵d, (Drawable) null);
            }
            EditText editText2 = this.f۹۸۱۵d;
            if (!(editText2 == null || this.f۹۸۳۵s != 1 || (drawable = this.f۹۷۹۱D) == null)) {
                Cu.m۱۲۹۸۴a(editText2, drawable);
            }
            int i2 = this.f۹۸۴۱y;
            if (i2 > -1 && (i = this.f۹۷۸۹B) != 0) {
                this.f۹۸۳۲p.setStroke(i2, i);
            }
            this.f۹۸۳۲p.setCornerRadii(getCornerRadiiAsArray());
            this.f۹۸۳۲p.setColor(this.f۹۷۹۰C);
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۷۹۴c() {
        Drawable editTextBackground;
        TextView textView;
        EditText editText = this.f۹۸۱۵d;
        if (editText != null && (editTextBackground = editText.getBackground()) != null) {
            m۱۱۷۷۷m();
            if (Ch0.m۱۵۲۵۵a(editTextBackground)) {
                editTextBackground = editTextBackground.mutate();
            }
            if (this.f۹۸۱۹f.m۱۱۹۸۸c()) {
                editTextBackground.setColorFilter(android.support.p۰۴۷v7.widget.Cj.m۱۵۲۸۳a(this.f۹۸۱۹f.m۱۱۹۹۰e(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f۹۸۲۵i || (textView = this.f۹۸۲۶j) == null) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۵b(editTextBackground);
                this.f۹۸۱۵d.refreshDrawableState();
            } else {
                editTextBackground.setColorFilter(android.support.p۰۴۷v7.widget.Cj.m۱۵۲۸۳a(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    private void m۱۱۷۷۷m() {
        Drawable bg;
        int sdk = Build.VERSION.SDK_INT;
        if ((sdk == 21 || sdk == 22) && (bg = this.f۹۸۱۵d.getBackground()) != null && !this.f۹۸۲۰f0) {
            Drawable newBg = bg.getConstantState().newDrawable();
            if (bg instanceof DrawableContainer) {
                this.f۹۸۲۰f0 = Ck.m۱۱۸۶۷a((DrawableContainer) bg, newBg.getConstantState());
            }
            if (!this.f۹۸۲۰f0) {
                Cu.m۱۲۹۸۴a(this.f۹۸۱۵d, newBg);
                this.f۹۸۲۰f0 = true;
                m۱۱۷۷۹o();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.TextInputLayout$e  reason: invalid class name */
    public static class Ce extends AbstractCa {
        public static final Parcelable.Creator<Ce> CREATOR = new Ca();

        /* renamed from: e  reason: contains not printable characters */
        CharSequence f۹۸۴۷e;

        /* renamed from: f  reason: contains not printable characters */
        boolean f۹۸۴۸f;

        Ce(Parcelable superState) {
            super(superState);
        }

        Ce(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f۹۸۴۷e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(source);
            this.f۹۸۴۸f = source.readInt() != 1 ? false : true;
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCa
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            TextUtils.writeToParcel(this.f۹۸۴۷e, dest, flags);
            dest.writeInt(this.f۹۸۴۸f ? 1 : 0);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f۹۸۴۷e) + "}";
        }

        /* renamed from: android.support.design.widget.TextInputLayout$e$a  reason: invalid class name */
        static class Ca implements Parcelable.ClassLoaderCreator<Ce> {
            Ca() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public Ce createFromParcel(Parcel in, ClassLoader loader) {
                return new Ce(in, loader);
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

    public Parcelable onSaveInstanceState() {
        Ce ss = new Ce(super.onSaveInstanceState());
        if (this.f۹۸۱۹f.m۱۱۹۸۸c()) {
            ss.f۹۸۴۷e = getError();
        }
        ss.f۹۸۴۸f = this.f۹۷۹۹L;
        return ss;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof Ce)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Ce ss = (Ce) state;
        super.onRestoreInstanceState(ss.m۱۲۷۹۱a());
        setError(ss.f۹۸۴۷e);
        if (ss.f۹۸۴۸f) {
            m۱۱۷۹۰a(true);
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        this.f۹۸۲۴h0 = true;
        super.dispatchRestoreInstanceState(container);
        this.f۹۸۲۴h0 = false;
    }

    public CharSequence getError() {
        if (this.f۹۸۱۹f.m۱۱۹۹۶k()) {
            return this.f۹۸۱۹f.m۱۱۹۸۹d();
        }
        return null;
    }

    public CharSequence getHelperText() {
        if (this.f۹۸۱۹f.m۱۱۹۹۷l()) {
            return this.f۹۸۱۹f.m۱۱۹۹۲g();
        }
        return null;
    }

    public void setHintAnimationEnabled(boolean enabled) {
        this.f۹۸۱۶d0 = enabled;
    }

    public void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.f۹۸۳۲p;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.f۹۸۲۹m) {
            this.f۹۸۱۴c0.m۱۱۸۳۷a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        m۱۱۷۸۵u();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /* renamed from: u  reason: contains not printable characters */
    private void m۱۱۷۸۵u() {
        if (this.f۹۸۱۵d != null) {
            if (m۱۱۷۸۲r()) {
                if (this.f۹۷۹۸K == null) {
                    this.f۹۷۹۸K = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ch.design_text_input_password_icon, (ViewGroup) this.f۹۸۱۳c, false);
                    this.f۹۷۹۸K.setImageDrawable(this.f۹۷۹۶I);
                    this.f۹۷۹۸K.setContentDescription(this.f۹۷۹۷J);
                    this.f۹۸۱۳c.addView(this.f۹۷۹۸K);
                    this.f۹۷۹۸K.setOnClickListener(new View$OnClickListenerCb());
                }
                EditText editText = this.f۹۸۱۵d;
                if (editText != null && Cu.m۱۳۰۱۵l(editText) <= 0) {
                    this.f۹۸۱۵d.setMinimumHeight(Cu.m۱۳۰۱۵l(this.f۹۷۹۸K));
                }
                this.f۹۷۹۸K.setVisibility(0);
                this.f۹۷۹۸K.setChecked(this.f۹۷۹۹L);
                if (this.f۹۸۰۰M == null) {
                    this.f۹۸۰۰M = new ColorDrawable();
                }
                this.f۹۸۰۰M.setBounds(0, 0, this.f۹۷۹۸K.getMeasuredWidth(), 1);
                Drawable[] compounds = Cp.m۱۳۳۰۶a(this.f۹۸۱۵d);
                if (compounds[2] != this.f۹۸۰۰M) {
                    this.f۹۸۰۱N = compounds[2];
                }
                Cp.m۱۳۳۰۵a(this.f۹۸۱۵d, compounds[0], compounds[1], this.f۹۸۰۰M, compounds[3]);
                this.f۹۷۹۸K.setPadding(this.f۹۸۱۵d.getPaddingLeft(), this.f۹۸۱۵d.getPaddingTop(), this.f۹۸۱۵d.getPaddingRight(), this.f۹۸۱۵d.getPaddingBottom());
                return;
            }
            CheckableImageButton checkableImageButton = this.f۹۷۹۸K;
            if (checkableImageButton != null && checkableImageButton.getVisibility() == 0) {
                this.f۹۷۹۸K.setVisibility(8);
            }
            if (this.f۹۸۰۰M != null) {
                Drawable[] compounds2 = Cp.m۱۳۳۰۶a(this.f۹۸۱۵d);
                if (compounds2[2] == this.f۹۸۰۰M) {
                    Cp.m۱۳۳۰۵a(this.f۹۸۱۵d, compounds2[0], compounds2[1], this.f۹۸۰۱N, compounds2[3]);
                    this.f۹۸۰۰M = null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.TextInputLayout$b  reason: invalid class name */
    public class View$OnClickListenerCb implements View.OnClickListener {
        View$OnClickListenerCb() {
        }

        public void onClick(View view) {
            TextInputLayout.this.m۱۱۷۹۰a(false);
        }
    }

    public void setPasswordVisibilityToggleDrawable(int resId) {
        setPasswordVisibilityToggleDrawable(resId != 0 ? p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(getContext(), resId) : null);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable icon) {
        this.f۹۷۹۶I = icon;
        CheckableImageButton checkableImageButton = this.f۹۷۹۸K;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(icon);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int resId) {
        setPasswordVisibilityToggleContentDescription(resId != 0 ? getResources().getText(resId) : null);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence description) {
        this.f۹۷۹۷J = description;
        CheckableImageButton checkableImageButton = this.f۹۷۹۸K;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(description);
        }
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f۹۷۹۶I;
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f۹۷۹۷J;
    }

    public void setPasswordVisibilityToggleEnabled(boolean enabled) {
        EditText editText;
        if (this.f۹۷۹۵H != enabled) {
            this.f۹۷۹۵H = enabled;
            if (!enabled && this.f۹۷۹۹L && (editText = this.f۹۸۱۵d) != null) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f۹۷۹۹L = false;
            m۱۱۷۸۵u();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList tintList) {
        this.f۹۸۰۲O = tintList;
        this.f۹۸۰۳P = true;
        m۱۱۷۷۰f();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f۹۸۰۴Q = mode;
        this.f۹۸۰۵R = true;
        m۱۱۷۷۰f();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۷۹۰a(boolean shouldSkipAnimations) {
        if (this.f۹۷۹۵H) {
            int selection = this.f۹۸۱۵d.getSelectionEnd();
            if (m۱۱۷۷۸n()) {
                this.f۹۸۱۵d.setTransformationMethod(null);
                this.f۹۷۹۹L = true;
            } else {
                this.f۹۸۱۵d.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f۹۷۹۹L = false;
            }
            this.f۹۷۹۸K.setChecked(this.f۹۷۹۹L);
            if (shouldSkipAnimations) {
                this.f۹۷۹۸K.jumpDrawablesToCurrentState();
            }
            this.f۹۸۱۵d.setSelection(selection);
        }
    }

    public void setTextInputAccessibilityDelegate(Cd delegate) {
        EditText editText = this.f۹۸۱۵d;
        if (editText != null) {
            Cu.m۱۲۹۸۵a(editText, delegate);
        }
    }

    /* renamed from: n  reason: contains not printable characters */
    private boolean m۱۱۷۷۸n() {
        EditText editText = this.f۹۸۱۵d;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: r  reason: contains not printable characters */
    private boolean m۱۱۷۸۲r() {
        return this.f۹۷۹۵H && (m۱۱۷۷۸n() || this.f۹۷۹۹L);
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۱۷۷۰f() {
        Drawable drawable;
        if (this.f۹۷۹۶I == null) {
            return;
        }
        if (this.f۹۸۰۳P || this.f۹۸۰۵R) {
            this.f۹۷۹۶I = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(this.f۹۷۹۶I).mutate();
            if (this.f۹۸۰۳P) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(this.f۹۷۹۶I, this.f۹۸۰۲O);
            }
            if (this.f۹۸۰۵R) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(this.f۹۷۹۶I, this.f۹۸۰۴Q);
            }
            CheckableImageButton checkableImageButton = this.f۹۷۹۸K;
            if (checkableImageButton != null && checkableImageButton.getDrawable() != (drawable = this.f۹۷۹۶I)) {
                this.f۹۷۹۸K.setImageDrawable(drawable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        EditText editText;
        super.onLayout(changed, left, top, right, bottom);
        if (this.f۹۸۳۲p != null) {
            m۱۱۷۸۶v();
        }
        if (this.f۹۸۲۹m && (editText = this.f۹۸۱۵d) != null) {
            Rect rect = this.f۹۷۹۲E;
            Cj.m۱۱۸۶۴a(this, editText, rect);
            int l = rect.left + this.f۹۸۱۵d.getCompoundPaddingLeft();
            int r = rect.right - this.f۹۸۱۵d.getCompoundPaddingRight();
            int t = m۱۱۷۷۳i();
            this.f۹۸۱۴c0.m۱۱۸۴۵b(l, rect.top + this.f۹۸۱۵d.getCompoundPaddingTop(), r, rect.bottom - this.f۹۸۱۵d.getCompoundPaddingBottom());
            this.f۹۸۱۴c0.m۱۱۸۳۴a(l, t, r, (bottom - top) - getPaddingBottom());
            this.f۹۸۱۴c0.m۱۱۸۵۴h();
            if (m۱۱۷۷۶l() && !this.f۹۸۱۲b0) {
                m۱۱۷۸۰p();
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۱۷۶۷c(boolean animate) {
        ValueAnimator valueAnimator = this.f۹۸۱۸e0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f۹۸۱۸e0.cancel();
        }
        if (!animate || !this.f۹۸۱۶d0) {
            this.f۹۸۱۴c0.m۱۱۸۴۳b(1.0f);
        } else {
            m۱۱۷۸۷a(1.0f);
        }
        this.f۹۸۱۲b0 = false;
        if (m۱۱۷۷۶l()) {
            m۱۱۷۸۰p();
        }
    }

    /* renamed from: l  reason: contains not printable characters */
    private boolean m۱۱۷۷۶l() {
        return this.f۹۸۲۹m && !TextUtils.isEmpty(this.f۹۸۳۰n) && (this.f۹۸۳۲p instanceof Ci);
    }

    /* renamed from: p  reason: contains not printable characters */
    private void m۱۱۷۸۰p() {
        if (m۱۱۷۷۶l()) {
            RectF cutoutBounds = this.f۹۷۹۳F;
            this.f۹۸۱۴c0.m۱۱۸۳۸a(cutoutBounds);
            m۱۱۷۶۳a(cutoutBounds);
            ((Ci) this.f۹۸۳۲p).m۱۱۸۶۱a(cutoutBounds);
        }
    }

    /* renamed from: k  reason: contains not printable characters */
    private void m۱۱۷۷۵k() {
        if (m۱۱۷۷۶l()) {
            ((Ci) this.f۹۸۳۲p).m۱۱۸۶۳b();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۷۶۳a(RectF cutoutBounds) {
        float f = cutoutBounds.left;
        int i = this.f۹۸۳۴r;
        cutoutBounds.left = f - ((float) i);
        cutoutBounds.top -= (float) i;
        cutoutBounds.right += (float) i;
        cutoutBounds.bottom += (float) i;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f۹۸۲۲g0) {
            boolean z = true;
            this.f۹۸۲۲g0 = true;
            super.drawableStateChanged();
            int[] state = getDrawableState();
            boolean changed = false;
            if (!Cu.m۱۳۰۲۸y(this) || !isEnabled()) {
                z = false;
            }
            m۱۱۷۹۲b(z);
            m۱۱۷۹۴c();
            m۱۱۷۸۶v();
            m۱۱۷۹۵d();
            Ch hVar = this.f۹۸۱۴c0;
            if (hVar != null) {
                changed = false | hVar.m۱۱۸۴۱a(state);
            }
            if (changed) {
                invalidate();
            }
            this.f۹۸۲۲g0 = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۱۷۹۵d() {
        TextView textView;
        if (this.f۹۸۳۲p != null && this.f۹۸۳۵s != 0) {
            EditText editText = this.f۹۸۱۵d;
            boolean isHovered = true;
            boolean hasFocus = editText != null && editText.hasFocus();
            EditText editText2 = this.f۹۸۱۵d;
            if (editText2 == null || !editText2.isHovered()) {
                isHovered = false;
            }
            if (this.f۹۸۳۵s == 2) {
                if (!isEnabled()) {
                    this.f۹۷۸۹B = this.f۹۸۱۱a0;
                } else if (this.f۹۸۱۹f.m۱۱۹۸۸c()) {
                    this.f۹۷۸۹B = this.f۹۸۱۹f.m۱۱۹۹۰e();
                } else if (this.f۹۸۲۵i && (textView = this.f۹۸۲۶j) != null) {
                    this.f۹۷۸۹B = textView.getCurrentTextColor();
                } else if (hasFocus) {
                    this.f۹۷۸۹B = this.f۹۸۱۰W;
                } else if (isHovered) {
                    this.f۹۷۸۹B = this.f۹۸۰۹V;
                } else {
                    this.f۹۷۸۹B = this.f۹۸۰۸U;
                }
                if ((isHovered || hasFocus) && isEnabled()) {
                    this.f۹۸۴۱y = this.f۹۷۸۸A;
                } else {
                    this.f۹۸۴۱y = this.f۹۸۴۲z;
                }
                m۱۱۷۶۹e();
            }
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۱۷۶۸d(boolean animate) {
        ValueAnimator valueAnimator = this.f۹۸۱۸e0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f۹۸۱۸e0.cancel();
        }
        if (!animate || !this.f۹۸۱۶d0) {
            this.f۹۸۱۴c0.m۱۱۸۴۳b(0.0f);
        } else {
            m۱۱۷۸۷a(0.0f);
        }
        if (m۱۱۷۷۶l() && ((Ci) this.f۹۸۳۲p).m۱۱۸۶۲a()) {
            m۱۱۷۷۵k();
        }
        this.f۹۸۱۲b0 = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۷۸۷a(float target) {
        if (this.f۹۸۱۴c0.m۱۱۸۵۱e() != target) {
            if (this.f۹۸۱۸e0 == null) {
                this.f۹۸۱۸e0 = new ValueAnimator();
                this.f۹۸۱۸e0.setInterpolator(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.f۸۲۵۲b);
                this.f۹۸۱۸e0.setDuration(167L);
                this.f۹۸۱۸e0.addUpdateListener(new Cc());
            }
            this.f۹۸۱۸e0.setFloatValues(this.f۹۸۱۴c0.m۱۱۸۵۱e(), target);
            this.f۹۸۱۸e0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.TextInputLayout$c  reason: invalid class name */
    public class Cc implements ValueAnimator.AnimatorUpdateListener {
        Cc() {
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            TextInputLayout.this.f۹۸۱۴c0.m۱۱۸۴۳b(((Float) animator.getAnimatedValue()).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f۹۸۱۴c0.m۱۱۸۵۰d();
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f۹۸۱۴c0.m۱۱۸۴۸c();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f۹۸۱۹f.m۱۱۹۹۰e();
    }

    /* renamed from: android.support.design.widget.TextInputLayout$d  reason: invalid class name */
    public static class Cd extends android.support.p۰۴۳v4.view.Cb {

        /* renamed from: c  reason: contains not printable characters */
        private final TextInputLayout f۹۸۴۶c;

        public Cd(TextInputLayout layout) {
            this.f۹۸۴۶c = layout;
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۷۹۶a(View host, android.support.p۰۴۳v4.view.p۰۴۵d0.Cc info2) {
            super.m۱۲۷۹۷a(host, info2);
            EditText editText = this.f۹۸۴۶c.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hintText = this.f۹۸۴۶c.getHint();
            CharSequence errorText = this.f۹۸۴۶c.getError();
            CharSequence counterDesc = this.f۹۸۴۶c.getCounterOverflowDescription();
            boolean showingText = !TextUtils.isEmpty(text);
            boolean hasHint = !TextUtils.isEmpty(hintText);
            boolean showingError = !TextUtils.isEmpty(errorText);
            boolean z = false;
            boolean contentInvalid = showingError || !TextUtils.isEmpty(counterDesc);
            if (showingText) {
                info2.m۱۲۸۶۷f(text);
            } else if (hasHint) {
                info2.m۱۲۸۶۷f(hintText);
            }
            if (hasHint) {
                info2.m۱۲۸۶۱d(hintText);
                if (!showingText && hasHint) {
                    z = true;
                }
                info2.m۱۲۸۸۱m(z);
            }
            if (contentInvalid) {
                info2.m۱۲۸۵۷c(showingError ? errorText : counterDesc);
                info2.m۱۲۸۶۵e(true);
            }
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۱۷۹۷c(View host, AccessibilityEvent event) {
            super.m۱۲۸۰۲c(host, event);
            EditText editText = this.f۹۸۴۶c.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence eventText = TextUtils.isEmpty(text) ? this.f۹۸۴۶c.getHint() : text;
            if (!TextUtils.isEmpty(eventText)) {
                event.getText().add(eventText);
            }
        }
    }
}
