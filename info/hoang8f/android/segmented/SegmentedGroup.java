package info.hoang8f.android.segmented;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class SegmentedGroup extends RadioGroup {

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۶۳۴۵c;

    /* renamed from: d  reason: contains not printable characters */
    private Resources f۱۶۳۴۶d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۶۳۴۷e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۶۳۴۸f;

    /* renamed from: g  reason: contains not printable characters */
    private Ca f۱۶۳۴۹g;

    /* renamed from: h  reason: contains not printable characters */
    private Float f۱۶۳۵۰h;

    public SegmentedGroup(Context context) {
        super(context);
        this.f۱۶۳۴۸f = -1;
        this.f۱۶۳۴۶d = getResources();
        this.f۱۶۳۴۷e = this.f۱۶۳۴۶d.getColor(Ca.radio_button_selected_color);
        this.f۱۶۳۴۵c = (int) getResources().getDimension(Cb.radio_button_stroke_border);
        this.f۱۶۳۵۰h = Float.valueOf(getResources().getDimension(Cb.radio_button_conner_radius));
        this.f۱۶۳۴۹g = new Ca(this.f۱۶۳۵۰h.floatValue());
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۹۶۵۲a(AttributeSet attrs) {
        TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(attrs, Cd.SegmentedGroup, 0, 0);
        try {
            this.f۱۶۳۴۵c = (int) typedArray.getDimension(Cd.SegmentedGroup_sc_border_width, getResources().getDimension(Cb.radio_button_stroke_border));
            this.f۱۶۳۵۰h = Float.valueOf(typedArray.getDimension(Cd.SegmentedGroup_sc_corner_radius, getResources().getDimension(Cb.radio_button_conner_radius)));
            this.f۱۶۳۴۷e = typedArray.getColor(Cd.SegmentedGroup_sc_tint_color, getResources().getColor(Ca.radio_button_selected_color));
            this.f۱۶۳۴۸f = typedArray.getColor(Cd.SegmentedGroup_sc_checked_text_color, getResources().getColor(17170443));
        } finally {
            typedArray.recycle();
        }
    }

    public SegmentedGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f۱۶۳۴۸f = -1;
        this.f۱۶۳۴۶d = getResources();
        this.f۱۶۳۴۷e = this.f۱۶۳۴۶d.getColor(Ca.radio_button_selected_color);
        this.f۱۶۳۴۵c = (int) getResources().getDimension(Cb.radio_button_stroke_border);
        this.f۱۶۳۵۰h = Float.valueOf(getResources().getDimension(Cb.radio_button_conner_radius));
        m۱۹۶۵۲a(attrs);
        this.f۱۶۳۴۹g = new Ca(this.f۱۶۳۵۰h.floatValue());
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m۱۹۶۵۴a();
    }

    public void setTintColor(int tintColor) {
        this.f۱۶۳۴۷e = tintColor;
        m۱۹۶۵۴a();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۶۵۴a() {
        int count = super.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            m۱۹۶۵۳a(child);
            if (i != count - 1) {
                RadioGroup.LayoutParams initParams = (RadioGroup.LayoutParams) child.getLayoutParams();
                RadioGroup.LayoutParams params = new RadioGroup.LayoutParams(initParams.width, initParams.height, initParams.weight);
                if (getOrientation() == 0) {
                    params.setMargins(0, 0, -this.f۱۶۳۴۵c, 0);
                } else {
                    params.setMargins(0, 0, 0, -this.f۱۶۳۴۵c);
                }
                child.setLayoutParams(params);
            } else {
                return;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۹۶۵۳a(View view) {
        int checked = this.f۱۶۳۴۹g.m۱۹۶۵۸a();
        int unchecked = this.f۱۶۳۴۹g.m۱۹۶۶۰b();
        ((Button) view).setTextColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[]{-16842919, -16842912}, new int[]{-16842919, 16842912}}, new int[]{-7829368, this.f۱۶۳۴۷e, this.f۱۶۳۴۸f}));
        Drawable checkedDrawable = this.f۱۶۳۴۶d.getDrawable(checked).mutate();
        Drawable uncheckedDrawable = this.f۱۶۳۴۶d.getDrawable(unchecked).mutate();
        ((GradientDrawable) checkedDrawable).setColor(this.f۱۶۳۴۷e);
        ((GradientDrawable) checkedDrawable).setStroke(this.f۱۶۳۴۵c, this.f۱۶۳۴۷e);
        ((GradientDrawable) uncheckedDrawable).setStroke(this.f۱۶۳۴۵c, this.f۱۶۳۴۷e);
        ((GradientDrawable) checkedDrawable).setCornerRadii(this.f۱۶۳۴۹g.m۱۹۶۵۹a(view));
        ((GradientDrawable) uncheckedDrawable).setCornerRadii(this.f۱۶۳۴۹g.m۱۹۶۵۹a(view));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842912}, uncheckedDrawable);
        stateListDrawable.addState(new int[]{16842912}, checkedDrawable);
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(stateListDrawable);
        } else {
            view.setBackgroundDrawable(stateListDrawable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: info.hoang8f.android.segmented.SegmentedGroup$a  reason: invalid class name */
    public class Ca {

        /* renamed from: a  reason: contains not printable characters */
        private int f۱۶۳۵۱a = -1;

        /* renamed from: b  reason: contains not printable characters */
        private int f۱۶۳۵۲b = -1;

        /* renamed from: c  reason: contains not printable characters */
        private final int f۱۶۳۵۳c = Cc.radio_checked;

        /* renamed from: d  reason: contains not printable characters */
        private final int f۱۶۳۵۴d = Cc.radio_unchecked;

        /* renamed from: e  reason: contains not printable characters */
        private float f۱۶۳۵۵e;

        /* renamed from: f  reason: contains not printable characters */
        private final float f۱۶۳۵۶f = TypedValue.applyDimension(1, 0.1f, SegmentedGroup.this.getResources().getDisplayMetrics());

        /* renamed from: g  reason: contains not printable characters */
        private final float[] f۱۶۳۵۷g;

        /* renamed from: h  reason: contains not printable characters */
        private final float[] f۱۶۳۵۸h;

        /* renamed from: i  reason: contains not printable characters */
        private final float[] f۱۶۳۵۹i;

        /* renamed from: j  reason: contains not printable characters */
        private final float[] f۱۶۳۶۰j;

        /* renamed from: k  reason: contains not printable characters */
        private final float[] f۱۶۳۶۱k;

        /* renamed from: l  reason: contains not printable characters */
        private final float[] f۱۶۳۶۲l;

        /* renamed from: m  reason: contains not printable characters */
        private float[] f۱۶۳۶۳m;

        public Ca(float cornerRadius) {
            this.f۱۶۳۵۵e = cornerRadius;
            float f = this.f۱۶۳۵۵e;
            float f2 = this.f۱۶۳۵۶f;
            this.f۱۶۳۵۷g = new float[]{f, f, f2, f2, f2, f2, f, f};
            this.f۱۶۳۵۸h = new float[]{f2, f2, f, f, f, f, f2, f2};
            this.f۱۶۳۵۹i = new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
            this.f۱۶۳۶۰j = new float[]{f, f, f, f, f, f, f, f};
            this.f۱۶۳۶۱k = new float[]{f, f, f, f, f2, f2, f2, f2};
            this.f۱۶۳۶۲l = new float[]{f2, f2, f2, f2, f, f, f, f};
        }

        /* renamed from: c  reason: contains not printable characters */
        private int m۱۹۶۵۷c() {
            return SegmentedGroup.this.getChildCount();
        }

        /* renamed from: b  reason: contains not printable characters */
        private int m۱۹۶۵۶b(View view) {
            return SegmentedGroup.this.indexOfChild(view);
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۹۶۵۵a(int newChildren, int newChild) {
            if (this.f۱۶۳۵۱a != newChildren || this.f۱۶۳۵۲b != newChild) {
                this.f۱۶۳۵۱a = newChildren;
                this.f۱۶۳۵۲b = newChild;
                int i = this.f۱۶۳۵۱a;
                if (i == 1) {
                    this.f۱۶۳۶۳m = this.f۱۶۳۶۰j;
                    return;
                }
                int i2 = this.f۱۶۳۵۲b;
                if (i2 == 0) {
                    this.f۱۶۳۶۳m = SegmentedGroup.this.getOrientation() == 0 ? this.f۱۶۳۵۷g : this.f۱۶۳۶۱k;
                } else if (i2 == i - 1) {
                    this.f۱۶۳۶۳m = SegmentedGroup.this.getOrientation() == 0 ? this.f۱۶۳۵۸h : this.f۱۶۳۶۲l;
                } else {
                    this.f۱۶۳۶۳m = this.f۱۶۳۵۹i;
                }
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۹۶۵۸a() {
            return this.f۱۶۳۵۳c;
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۹۶۶۰b() {
            return this.f۱۶۳۵۴d;
        }

        /* renamed from: a  reason: contains not printable characters */
        public float[] m۱۹۶۵۹a(View view) {
            m۱۹۶۵۵a(m۱۹۶۵۷c(), m۱۹۶۵۶b(view));
            return this.f۱۶۳۶۳m;
        }
    }
}
