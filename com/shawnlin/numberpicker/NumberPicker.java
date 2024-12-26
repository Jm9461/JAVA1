package com.shawnlin.numberpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.text.DecimalFormatSymbols;
import java.util.Formatter;
import java.util.Locale;

public class NumberPicker extends LinearLayout {

    /* renamed from: s0  reason: contains not printable characters */
    private static final Cg f۱۵۲۴۲s0 = new Cg();

    /* renamed from: A  reason: contains not printable characters */
    private final SparseArray<String> f۱۵۲۴۳A;

    /* renamed from: B  reason: contains not printable characters */
    private int f۱۵۲۴۴B;

    /* renamed from: C  reason: contains not printable characters */
    private int f۱۵۲۴۵C;

    /* renamed from: D  reason: contains not printable characters */
    private int f۱۵۲۴۶D;

    /* renamed from: E  reason: contains not printable characters */
    private int[] f۱۵۲۴۷E;

    /* renamed from: F  reason: contains not printable characters */
    private final Paint f۱۵۲۴۸F;

    /* renamed from: G  reason: contains not printable characters */
    private int f۱۵۲۴۹G;

    /* renamed from: H  reason: contains not printable characters */
    private int f۱۵۲۵۰H;

    /* renamed from: I  reason: contains not printable characters */
    private int f۱۵۲۵۱I;

    /* renamed from: J  reason: contains not printable characters */
    private final Ce f۱۵۲۵۲J;

    /* renamed from: K  reason: contains not printable characters */
    private final Ce f۱۵۲۵۳K;

    /* renamed from: L  reason: contains not printable characters */
    private int f۱۵۲۵۴L;

    /* renamed from: M  reason: contains not printable characters */
    private int f۱۵۲۵۵M;

    /* renamed from: N  reason: contains not printable characters */
    private RunnableCf f۱۵۲۵۶N;

    /* renamed from: O  reason: contains not printable characters */
    private RunnableCb f۱۵۲۵۷O;

    /* renamed from: P  reason: contains not printable characters */
    private float f۱۵۲۵۸P;

    /* renamed from: Q  reason: contains not printable characters */
    private float f۱۵۲۵۹Q;

    /* renamed from: R  reason: contains not printable characters */
    private float f۱۵۲۶۰R;

    /* renamed from: S  reason: contains not printable characters */
    private float f۱۵۲۶۱S;

    /* renamed from: T  reason: contains not printable characters */
    private VelocityTracker f۱۵۲۶۲T;

    /* renamed from: U  reason: contains not printable characters */
    private int f۱۵۲۶۳U;

    /* renamed from: V  reason: contains not printable characters */
    private int f۱۵۲۶۴V;

    /* renamed from: W  reason: contains not printable characters */
    private int f۱۵۲۶۵W;

    /* renamed from: a0  reason: contains not printable characters */
    private boolean f۱۵۲۶۶a0;

    /* renamed from: b0  reason: contains not printable characters */
    private Drawable f۱۵۲۶۷b0;

    /* renamed from: c  reason: contains not printable characters */
    private final EditText f۱۵۲۶۸c;

    /* renamed from: c0  reason: contains not printable characters */
    private int f۱۵۲۶۹c0;

    /* renamed from: d  reason: contains not printable characters */
    private float f۱۵۲۷۰d;

    /* renamed from: d0  reason: contains not printable characters */
    private int f۱۵۲۷۱d0;

    /* renamed from: e  reason: contains not printable characters */
    private float f۱۵۲۷۲e;

    /* renamed from: e0  reason: contains not printable characters */
    private int f۱۵۲۷۳e0;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۵۲۷۴f;

    /* renamed from: f0  reason: contains not printable characters */
    private int f۱۵۲۷۵f0;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۵۲۷۶g;

    /* renamed from: g0  reason: contains not printable characters */
    private int f۱۵۲۷۷g0;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۵۲۷۸h;

    /* renamed from: h0  reason: contains not printable characters */
    private int f۱۵۲۷۹h0;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۵۲۸۰i;

    /* renamed from: i0  reason: contains not printable characters */
    private int f۱۵۲۸۱i0;

    /* renamed from: j  reason: contains not printable characters */
    private final boolean f۱۵۲۸۲j;

    /* renamed from: j0  reason: contains not printable characters */
    private int f۱۵۲۸۳j0;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۵۲۸۴k;

    /* renamed from: k0  reason: contains not printable characters */
    private int f۱۵۲۸۵k0;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۵۲۸۶l;

    /* renamed from: l0  reason: contains not printable characters */
    private float f۱۵۲۸۷l0;

    /* renamed from: m  reason: contains not printable characters */
    private float f۱۵۲۸۸m;

    /* renamed from: m0  reason: contains not printable characters */
    private float f۱۵۲۸۹m0;

    /* renamed from: n  reason: contains not printable characters */
    private float f۱۵۲۹۰n;

    /* renamed from: n0  reason: contains not printable characters */
    private int f۱۵۲۹۱n0;

    /* renamed from: o  reason: contains not printable characters */
    private Typeface f۱۵۲۹۲o;

    /* renamed from: o0  reason: contains not printable characters */
    private int f۱۵۲۹۳o0;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۵۲۹۴p;

    /* renamed from: p0  reason: contains not printable characters */
    private boolean f۱۵۲۹۵p0;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۵۲۹۶q;

    /* renamed from: q0  reason: contains not printable characters */
    private boolean f۱۵۲۹۷q0;

    /* renamed from: r  reason: contains not printable characters */
    private String[] f۱۵۲۹۸r;

    /* renamed from: r0  reason: contains not printable characters */
    private Context f۱۵۲۹۹r0;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۵۳۰۰s;

    /* renamed from: t  reason: contains not printable characters */
    private int f۱۵۳۰۱t;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۵۳۰۲u;

    /* renamed from: v  reason: contains not printable characters */
    private View.OnClickListener f۱۵۳۰۳v;

    /* renamed from: w  reason: contains not printable characters */
    private AbstractCe f۱۵۳۰۴w;

    /* renamed from: x  reason: contains not printable characters */
    private AbstractCd f۱۵۳۰۵x;

    /* renamed from: y  reason: contains not printable characters */
    private AbstractCc f۱۵۳۰۶y;

    /* renamed from: z  reason: contains not printable characters */
    private long f۱۵۳۰۷z;

    /* renamed from: com.shawnlin.numberpicker.NumberPicker$c  reason: invalid class name */
    public interface AbstractCc {
        /* renamed from: a  reason: contains not printable characters */
        String m۱۸۲۲۱a(int i);
    }

    /* renamed from: com.shawnlin.numberpicker.NumberPicker$d  reason: invalid class name */
    public interface AbstractCd {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۲۲۲a(NumberPicker numberPicker, int i);
    }

    /* renamed from: com.shawnlin.numberpicker.NumberPicker$e  reason: invalid class name */
    public interface AbstractCe {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۲۲۳a(NumberPicker numberPicker, int i, int i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.shawnlin.numberpicker.NumberPicker$f  reason: invalid class name */
    public class RunnableCf implements Runnable {
    }

    /* renamed from: com.shawnlin.numberpicker.NumberPicker$g  reason: invalid class name */
    private static class Cg implements AbstractCc {

        /* renamed from: a  reason: contains not printable characters */
        final StringBuilder f۱۵۳۱۱a = new StringBuilder();

        /* renamed from: b  reason: contains not printable characters */
        char f۱۵۳۱۲b;

        /* renamed from: c  reason: contains not printable characters */
        Formatter f۱۵۳۱۳c;

        /* renamed from: d  reason: contains not printable characters */
        final Object[] f۱۵۳۱۴d = new Object[1];

        Cg() {
            m۱۸۲۲۶c(Locale.getDefault());
        }

        /* renamed from: c  reason: contains not printable characters */
        private void m۱۸۲۲۶c(Locale locale) {
            this.f۱۵۳۱۳c = m۱۸۲۲۴a(locale);
            this.f۱۵۳۱۲b = m۱۸۲۲۵b(locale);
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public String m۱۸۲۲۷a(int value) {
            Locale currentLocale = Locale.getDefault();
            if (this.f۱۵۳۱۲b != m۱۸۲۲۵b(currentLocale)) {
                m۱۸۲۲۶c(currentLocale);
            }
            this.f۱۵۳۱۴d[0] = Integer.valueOf(value);
            StringBuilder sb = this.f۱۵۳۱۱a;
            sb.delete(0, sb.length());
            this.f۱۵۳۱۳c.format("%02d", this.f۱۵۳۱۴d);
            return this.f۱۵۳۱۳c.toString();
        }

        /* renamed from: b  reason: contains not printable characters */
        private static char m۱۸۲۲۵b(Locale locale) {
            return new DecimalFormatSymbols(locale).getZeroDigit();
        }

        /* renamed from: a  reason: contains not printable characters */
        private Formatter m۱۸۲۲۴a(Locale locale) {
            return new Formatter(this.f۱۵۳۱۱a, locale);
        }
    }

    public static final AbstractCc getTwoDigitFormatter() {
        return f۱۵۲۴۲s0;
    }

    public NumberPicker(Context context) {
        this(context, null);
    }

    public NumberPicker(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NumberPicker(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        this.f۱۵۲۸۴k = -16777216;
        this.f۱۵۲۸۶l = -16777216;
        this.f۱۵۲۸۸m = 25.0f;
        this.f۱۵۲۹۰n = 25.0f;
        this.f۱۵۳۰۰s = 1;
        this.f۱۵۳۰۱t = 100;
        this.f۱۵۳۰۷z = 300;
        this.f۱۵۲۴۳A = new SparseArray<>();
        this.f۱۵۲۴۴B = 3;
        this.f۱۵۲۴۵C = 3;
        int i = this.f۱۵۲۴۴B;
        this.f۱۵۲۴۶D = i / 2;
        this.f۱۵۲۴۷E = new int[i];
        this.f۱۵۲۵۰H = Integer.MIN_VALUE;
        this.f۱۵۲۶۹c0 = -16777216;
        this.f۱۵۲۷۵f0 = 0;
        this.f۱۵۲۸۵k0 = -1;
        this.f۱۵۲۹۵p0 = true;
        this.f۱۵۲۹۷q0 = true;
        this.f۱۵۲۹۹r0 = context;
        TypedArray attributesArray = context.obtainStyledAttributes(attrs, Cd.NumberPicker, defStyle, 0);
        this.f۱۵۲۶۷b0 = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(context, Ca.np_numberpicker_selection_divider);
        this.f۱۵۲۶۹c0 = attributesArray.getColor(Cd.NumberPicker_np_dividerColor, this.f۱۵۲۶۹c0);
        this.f۱۵۲۷۱d0 = attributesArray.getDimensionPixelSize(Cd.NumberPicker_np_dividerDistance, (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
        this.f۱۵۲۷۳e0 = attributesArray.getDimensionPixelSize(Cd.NumberPicker_np_dividerThickness, (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.f۱۵۲۹۳o0 = attributesArray.getInt(Cd.NumberPicker_np_order, 0);
        this.f۱۵۲۹۱n0 = attributesArray.getInt(Cd.NumberPicker_np_orientation, 1);
        this.f۱۵۲۸۷l0 = (float) attributesArray.getDimensionPixelSize(Cd.NumberPicker_np_width, -1);
        this.f۱۵۲۸۹m0 = (float) attributesArray.getDimensionPixelSize(Cd.NumberPicker_np_height, -1);
        m۱۸۲۱۰j();
        this.f۱۵۲۸۲j = true;
        this.f۱۵۳۰۲u = attributesArray.getInt(Cd.NumberPicker_np_value, this.f۱۵۳۰۲u);
        this.f۱۵۳۰۱t = attributesArray.getInt(Cd.NumberPicker_np_max, this.f۱۵۳۰۱t);
        this.f۱۵۳۰۰s = attributesArray.getInt(Cd.NumberPicker_np_min, this.f۱۵۳۰۰s);
        this.f۱۵۲۸۴k = attributesArray.getColor(Cd.NumberPicker_np_selectedTextColor, this.f۱۵۲۸۴k);
        this.f۱۵۲۹۰n = attributesArray.getDimension(Cd.NumberPicker_np_selectedTextSize, m۱۸۲۰۰d(this.f۱۵۲۹۰n));
        this.f۱۵۲۸۶l = attributesArray.getColor(Cd.NumberPicker_np_textColor, this.f۱۵۲۸۶l);
        this.f۱۵۲۸۸m = attributesArray.getDimension(Cd.NumberPicker_np_textSize, m۱۸۲۰۰d(this.f۱۵۲۸۸m));
        this.f۱۵۲۹۲o = Typeface.create(attributesArray.getString(Cd.NumberPicker_np_typeface), 0);
        this.f۱۵۳۰۶y = m۱۸۱۸۴a(attributesArray.getString(Cd.NumberPicker_np_formatter));
        this.f۱۵۲۹۵p0 = attributesArray.getBoolean(Cd.NumberPicker_np_fadingEdgeEnabled, this.f۱۵۲۹۵p0);
        this.f۱۵۲۹۷q0 = attributesArray.getBoolean(Cd.NumberPicker_np_scrollerEnabled, this.f۱۵۲۹۷q0);
        this.f۱۵۲۴۴B = attributesArray.getInt(Cd.NumberPicker_np_wheelItemCount, this.f۱۵۲۴۴B);
        setWillNotDraw(false);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(Cc.number_picker_with_selector_wheel, (ViewGroup) this, true);
        this.f۱۵۲۶۸c = (EditText) findViewById(Cb.np__numberpicker_input);
        this.f۱۵۲۶۸c.setEnabled(false);
        this.f۱۵۲۶۸c.setFocusable(false);
        this.f۱۵۲۶۸c.setImeOptions(1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f۱۵۲۴۸F = paint;
        setSelectedTextColor(this.f۱۵۲۸۴k);
        setTextColor(this.f۱۵۲۸۶l);
        setTextSize(this.f۱۵۲۸۸m);
        setSelectedTextSize(this.f۱۵۲۹۰n);
        setTypeface(this.f۱۵۲۹۲o);
        setFormatter(this.f۱۵۳۰۶y);
        m۱۸۲۱۲l();
        setValue(this.f۱۵۳۰۲u);
        setMaxValue(this.f۱۵۳۰۱t);
        setMinValue(this.f۱۵۳۰۰s);
        setDividerColor(this.f۱۵۲۶۹c0);
        setWheelItemCount(this.f۱۵۲۴۴B);
        this.f۱۵۲۶۶a0 = attributesArray.getBoolean(Cd.NumberPicker_np_wrapSelectorWheel, this.f۱۵۲۶۶a0);
        setWrapSelectorWheel(this.f۱۵۲۶۶a0);
        float f = this.f۱۵۲۸۷l0;
        if (f == -1.0f || this.f۱۵۲۸۹m0 == -1.0f) {
            float f2 = this.f۱۵۲۸۷l0;
            if (f2 != -1.0f) {
                setScaleX(f2 / ((float) this.f۱۵۲۷۸h));
                setScaleY(this.f۱۵۲۸۷l0 / ((float) this.f۱۵۲۷۸h));
            } else {
                float f3 = this.f۱۵۲۸۹m0;
                if (f3 != -1.0f) {
                    setScaleX(f3 / ((float) this.f۱۵۲۷۶g));
                    setScaleY(this.f۱۵۲۸۹m0 / ((float) this.f۱۵۲۷۶g));
                }
            }
        } else {
            setScaleX(f / ((float) this.f۱۵۲۷۸h));
            setScaleY(this.f۱۵۲۸۹m0 / ((float) this.f۱۵۲۷۶g));
        }
        ViewConfiguration configuration = ViewConfiguration.get(context);
        this.f۱۵۲۶۳U = configuration.getScaledTouchSlop();
        this.f۱۵۲۶۴V = configuration.getScaledMinimumFlingVelocity();
        this.f۱۵۲۶۵W = configuration.getScaledMaximumFlingVelocity() / 8;
        this.f۱۵۲۵۲J = new Ce(context, null, true);
        this.f۱۵۲۵۳K = new Ce(context, new DecelerateInterpolator(2.5f));
        if (Build.VERSION.SDK_INT >= 16 && getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        attributesArray.recycle();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int msrdWdth = getMeasuredWidth();
        int msrdHght = getMeasuredHeight();
        int inptTxtMsrdWdth = this.f۱۵۲۶۸c.getMeasuredWidth();
        int inptTxtMsrdHght = this.f۱۵۲۶۸c.getMeasuredHeight();
        int inptTxtLeft = (msrdWdth - inptTxtMsrdWdth) / 2;
        int inptTxtTop = (msrdHght - inptTxtMsrdHght) / 2;
        this.f۱۵۲۶۸c.layout(inptTxtLeft, inptTxtTop, inptTxtLeft + inptTxtMsrdWdth, inptTxtTop + inptTxtMsrdHght);
        this.f۱۵۲۷۰d = this.f۱۵۲۶۸c.getX() + ((float) (this.f۱۵۲۶۸c.getMeasuredWidth() / 2));
        this.f۱۵۲۷۲e = this.f۱۵۲۶۸c.getY() + ((float) (this.f۱۵۲۶۸c.getMeasuredHeight() / 2));
        if (changed) {
            m۱۸۲۰۵f();
            m۱۸۲۰۴e();
            if (m۱۸۲۱۶b()) {
                int width = getWidth();
                int i = this.f۱۵۲۷۱d0;
                int i2 = this.f۱۵۲۷۳e0;
                this.f۱۵۲۸۱i0 = ((width - i) / 2) - i2;
                this.f۱۵۲۸۳j0 = this.f۱۵۲۸۱i0 + (i2 * 2) + i;
                return;
            }
            int height = getHeight();
            int i3 = this.f۱۵۲۷۱d0;
            int i4 = this.f۱۵۲۷۳e0;
            this.f۱۵۲۷۷g0 = ((height - i3) / 2) - i4;
            this.f۱۵۲۷۹h0 = this.f۱۵۲۷۷g0 + (i4 * 2) + i3;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(m۱۸۱۹۳b(widthMeasureSpec, this.f۱۵۲۸۰i), m۱۸۱۹۳b(heightMeasureSpec, this.f۱۵۲۷۶g));
        setMeasuredDimension(m۱۸۱۸۲a(this.f۱۵۲۷۸h, getMeasuredWidth(), widthMeasureSpec), m۱۸۱۸۲a(this.f۱۵۲۷۴f, getMeasuredHeight(), heightMeasureSpec));
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۸۱۹۱a(Ce scroller) {
        scroller.m۱۸۲۳۲a(true);
        if (m۱۸۲۱۶b()) {
            int amountToScroll = scroller.m۱۸۲۳۷e() - scroller.m۱۸۲۳۵c();
            int overshootAdjustment = this.f۱۵۲۵۰H - ((this.f۱۵۲۵۱I + amountToScroll) % this.f۱۵۲۴۹G);
            if (overshootAdjustment != 0) {
                int abs = Math.abs(overshootAdjustment);
                int i = this.f۱۵۲۴۹G;
                if (abs > i / 2) {
                    if (overshootAdjustment > 0) {
                        overshootAdjustment -= i;
                    } else {
                        overshootAdjustment += i;
                    }
                }
                scrollBy(amountToScroll + overshootAdjustment, 0);
                return true;
            }
        } else {
            int amountToScroll2 = scroller.m۱۸۲۳۸f() - scroller.m۱۸۲۳۶d();
            int overshootAdjustment2 = this.f۱۵۲۵۰H - ((this.f۱۵۲۵۱I + amountToScroll2) % this.f۱۵۲۴۹G);
            if (overshootAdjustment2 != 0) {
                int abs2 = Math.abs(overshootAdjustment2);
                int i2 = this.f۱۵۲۴۹G;
                if (abs2 > i2 / 2) {
                    if (overshootAdjustment2 > 0) {
                        overshootAdjustment2 -= i2;
                    } else {
                        overshootAdjustment2 += i2;
                    }
                }
                scrollBy(0, amountToScroll2 + overshootAdjustment2);
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (!isEnabled() || (event.getAction() & 255) != 0) {
            return false;
        }
        m۱۸۲۰۸h();
        this.f۱۵۲۶۸c.setVisibility(4);
        if (m۱۸۲۱۶b()) {
            float x = event.getX();
            this.f۱۵۲۵۸P = x;
            this.f۱۵۲۶۰R = x;
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!this.f۱۵۲۵۲J.m۱۸۲۴۱i()) {
                this.f۱۵۲۵۲J.m۱۸۲۳۲a(true);
                this.f۱۵۲۵۳K.m۱۸۲۳۲a(true);
                m۱۸۲۰۶f(0);
            } else if (!this.f۱۵۲۵۳K.m۱۸۲۴۱i()) {
                this.f۱۵۲۵۲J.m۱۸۲۳۲a(true);
                this.f۱۵۲۵۳K.m۱۸۲۳۲a(true);
            } else {
                float f = this.f۱۵۲۵۸P;
                if (f < ((float) this.f۱۵۲۸۱i0) || f > ((float) this.f۱۵۲۸۳j0)) {
                    float f2 = this.f۱۵۲۵۸P;
                    if (f2 < ((float) this.f۱۵۲۸۱i0)) {
                        m۱۸۱۸۹a(false, (long) ViewConfiguration.getLongPressTimeout());
                    } else if (f2 > ((float) this.f۱۵۲۸۳j0)) {
                        m۱۸۱۸۹a(true, (long) ViewConfiguration.getLongPressTimeout());
                    }
                } else {
                    View.OnClickListener onClickListener = this.f۱۵۳۰۳v;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                }
            }
            return true;
        }
        float y = event.getY();
        this.f۱۵۲۵۹Q = y;
        this.f۱۵۲۶۱S = y;
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!this.f۱۵۲۵۲J.m۱۸۲۴۱i()) {
            this.f۱۵۲۵۲J.m۱۸۲۳۲a(true);
            this.f۱۵۲۵۳K.m۱۸۲۳۲a(true);
            m۱۸۲۰۶f(0);
        } else if (!this.f۱۵۲۵۳K.m۱۸۲۴۱i()) {
            this.f۱۵۲۵۲J.m۱۸۲۳۲a(true);
            this.f۱۵۲۵۳K.m۱۸۲۳۲a(true);
        } else {
            float f3 = this.f۱۵۲۵۹Q;
            if (f3 < ((float) this.f۱۵۲۷۷g0) || f3 > ((float) this.f۱۵۲۷۹h0)) {
                float f4 = this.f۱۵۲۵۹Q;
                if (f4 < ((float) this.f۱۵۲۷۷g0)) {
                    m۱۸۱۸۹a(false, (long) ViewConfiguration.getLongPressTimeout());
                } else if (f4 > ((float) this.f۱۵۲۷۹h0)) {
                    m۱۸۱۸۹a(true, (long) ViewConfiguration.getLongPressTimeout());
                }
            } else {
                View.OnClickListener onClickListener2 = this.f۱۵۳۰۳v;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(this);
                }
            }
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (!isEnabled() || !m۱۸۲۱۷c()) {
            return false;
        }
        if (this.f۱۵۲۶۲T == null) {
            this.f۱۵۲۶۲T = VelocityTracker.obtain();
        }
        this.f۱۵۲۶۲T.addMovement(event);
        int action = event.getAction() & 255;
        if (action == 1) {
            m۱۸۲۰۹i();
            VelocityTracker velocityTracker = this.f۱۵۲۶۲T;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f۱۵۲۶۵W);
            if (m۱۸۲۱۶b()) {
                int initialVelocity = (int) velocityTracker.getXVelocity();
                if (Math.abs(initialVelocity) > this.f۱۵۲۶۴V) {
                    m۱۸۱۹۴b(initialVelocity);
                    m۱۸۲۰۶f(2);
                } else {
                    int eventX = (int) event.getX();
                    if (((int) Math.abs(((float) eventX) - this.f۱۵۲۵۸P)) <= this.f۱۵۲۶۳U) {
                        int selectorIndexOffset = (eventX / this.f۱۵۲۴۹G) - this.f۱۵۲۴۶D;
                        if (selectorIndexOffset > 0) {
                            m۱۸۱۸۸a(true);
                        } else if (selectorIndexOffset < 0) {
                            m۱۸۱۸۸a(false);
                        } else {
                            m۱۸۲۰۲d();
                        }
                    } else {
                        m۱۸۲۰۲d();
                    }
                    m۱۸۲۰۶f(0);
                }
            } else {
                int initialVelocity2 = (int) velocityTracker.getYVelocity();
                if (Math.abs(initialVelocity2) > this.f۱۵۲۶۴V) {
                    m۱۸۱۹۴b(initialVelocity2);
                    m۱۸۲۰۶f(2);
                } else {
                    int eventY = (int) event.getY();
                    if (((int) Math.abs(((float) eventY) - this.f۱۵۲۵۹Q)) <= this.f۱۵۲۶۳U) {
                        int selectorIndexOffset2 = (eventY / this.f۱۵۲۴۹G) - this.f۱۵۲۴۶D;
                        if (selectorIndexOffset2 > 0) {
                            m۱۸۱۸۸a(true);
                        } else if (selectorIndexOffset2 < 0) {
                            m۱۸۱۸۸a(false);
                        } else {
                            m۱۸۲۰۲d();
                        }
                    } else {
                        m۱۸۲۰۲d();
                    }
                    m۱۸۲۰۶f(0);
                }
            }
            this.f۱۵۲۶۲T.recycle();
            this.f۱۵۲۶۲T = null;
        } else if (action == 2) {
            if (m۱۸۲۱۶b()) {
                float currentMoveX = event.getX();
                if (this.f۱۵۲۷۵f0 == 1) {
                    scrollBy((int) (currentMoveX - this.f۱۵۲۶۰R), 0);
                    invalidate();
                } else if (((int) Math.abs(currentMoveX - this.f۱۵۲۵۸P)) > this.f۱۵۲۶۳U) {
                    m۱۸۲۰۸h();
                    m۱۸۲۰۶f(1);
                }
                this.f۱۵۲۶۰R = currentMoveX;
            } else {
                float currentMoveY = event.getY();
                if (this.f۱۵۲۷۵f0 == 1) {
                    scrollBy(0, (int) (currentMoveY - this.f۱۵۲۶۱S));
                    invalidate();
                } else if (((int) Math.abs(currentMoveY - this.f۱۵۲۵۹Q)) > this.f۱۵۲۶۳U) {
                    m۱۸۲۰۸h();
                    m۱۸۲۰۶f(1);
                }
                this.f۱۵۲۶۱S = currentMoveY;
            }
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent event) {
        int action = event.getAction() & 255;
        if (action == 1 || action == 3) {
            m۱۸۲۰۸h();
        }
        return super.dispatchTouchEvent(event);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        requestFocus();
        r5.f۱۵۲۸۵k0 = r0;
        m۱۸۲۰۸h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r5.f۱۵۲۵۲J.m۱۸۲۴۱i() == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r0 != 20) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        m۱۸۱۸۸a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shawnlin.numberpicker.NumberPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchTrackballEvent(MotionEvent event) {
        int action = event.getAction() & 255;
        if (action == 1 || action == 3) {
            m۱۸۲۰۸h();
        }
        return super.dispatchTrackballEvent(event);
    }

    public void computeScroll() {
        if (m۱۸۲۱۷c()) {
            Ce scroller = this.f۱۵۲۵۲J;
            if (scroller.m۱۸۲۴۱i()) {
                scroller = this.f۱۵۲۵۳K;
                if (scroller.m۱۸۲۴۱i()) {
                    return;
                }
            }
            scroller.m۱۸۲۳۳a();
            if (m۱۸۲۱۶b()) {
                int currentScrollerX = scroller.m۱۸۲۳۵c();
                if (this.f۱۵۲۵۴L == 0) {
                    this.f۱۵۲۵۴L = scroller.m۱۸۲۳۹g();
                }
                scrollBy(currentScrollerX - this.f۱۵۲۵۴L, 0);
                this.f۱۵۲۵۴L = currentScrollerX;
            } else {
                int currentScrollerY = scroller.m۱۸۲۳۶d();
                if (this.f۱۵۲۵۵M == 0) {
                    this.f۱۵۲۵۵M = scroller.m۱۸۲۴۰h();
                }
                scrollBy(0, currentScrollerY - this.f۱۵۲۵۵M);
                this.f۱۵۲۵۵M = currentScrollerY;
            }
            if (scroller.m۱۸۲۴۱i()) {
                m۱۸۱۹۵b(scroller);
            } else {
                postInvalidate();
            }
        }
    }

    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.f۱۵۲۶۸c.setEnabled(enabled);
    }

    public void scrollBy(int x, int y) {
        int gap;
        if (m۱۸۲۱۷c()) {
            int[] selectorIndices = getSelectorIndices();
            if (m۱۸۲۱۶b()) {
                if (m۱۸۲۱۵a()) {
                    if (!this.f۱۵۲۶۶a0 && x > 0 && selectorIndices[this.f۱۵۲۴۶D] <= this.f۱۵۳۰۰s) {
                        this.f۱۵۲۵۱I = this.f۱۵۲۵۰H;
                        return;
                    } else if (!this.f۱۵۲۶۶a0 && x < 0 && selectorIndices[this.f۱۵۲۴۶D] >= this.f۱۵۳۰۱t) {
                        this.f۱۵۲۵۱I = this.f۱۵۲۵۰H;
                        return;
                    }
                } else if (!this.f۱۵۲۶۶a0 && x > 0 && selectorIndices[this.f۱۵۲۴۶D] >= this.f۱۵۳۰۱t) {
                    this.f۱۵۲۵۱I = this.f۱۵۲۵۰H;
                    return;
                } else if (!this.f۱۵۲۶۶a0 && x < 0 && selectorIndices[this.f۱۵۲۴۶D] <= this.f۱۵۳۰۰s) {
                    this.f۱۵۲۵۱I = this.f۱۵۲۵۰H;
                    return;
                }
                this.f۱۵۲۵۱I += x;
                gap = this.f۱۵۲۹۴p;
            } else {
                if (m۱۸۲۱۵a()) {
                    if (!this.f۱۵۲۶۶a0 && y > 0 && selectorIndices[this.f۱۵۲۴۶D] <= this.f۱۵۳۰۰s) {
                        this.f۱۵۲۵۱I = this.f۱۵۲۵۰H;
                        return;
                    } else if (!this.f۱۵۲۶۶a0 && y < 0 && selectorIndices[this.f۱۵۲۴۶D] >= this.f۱۵۳۰۱t) {
                        this.f۱۵۲۵۱I = this.f۱۵۲۵۰H;
                        return;
                    }
                } else if (!this.f۱۵۲۶۶a0 && y > 0 && selectorIndices[this.f۱۵۲۴۶D] >= this.f۱۵۳۰۱t) {
                    this.f۱۵۲۵۱I = this.f۱۵۲۵۰H;
                    return;
                } else if (!this.f۱۵۲۶۶a0 && y < 0 && selectorIndices[this.f۱۵۲۴۶D] <= this.f۱۵۳۰۰s) {
                    this.f۱۵۲۵۱I = this.f۱۵۲۵۰H;
                    return;
                }
                this.f۱۵۲۵۱I += y;
                gap = this.f۱۵۲۹۶q;
            }
            while (true) {
                int i = this.f۱۵۲۵۱I;
                if (i - this.f۱۵۲۵۰H <= gap) {
                    break;
                }
                this.f۱۵۲۵۱I = i - this.f۱۵۲۴۹G;
                if (m۱۸۲۱۵a()) {
                    m۱۸۱۹۰a(selectorIndices);
                } else {
                    m۱۸۱۹۶b(selectorIndices);
                }
                m۱۸۱۸۶a(selectorIndices[this.f۱۵۲۴۶D], true);
                if (!this.f۱۵۲۶۶a0 && selectorIndices[this.f۱۵۲۴۶D] < this.f۱۵۳۰۰s) {
                    this.f۱۵۲۵۱I = this.f۱۵۲۵۰H;
                }
            }
            while (true) {
                int i2 = this.f۱۵۲۵۱I;
                if (i2 - this.f۱۵۲۵۰H < (-gap)) {
                    this.f۱۵۲۵۱I = i2 + this.f۱۵۲۴۹G;
                    if (m۱۸۲۱۵a()) {
                        m۱۸۱۹۶b(selectorIndices);
                    } else {
                        m۱۸۱۹۰a(selectorIndices);
                    }
                    m۱۸۱۸۶a(selectorIndices[this.f۱۵۲۴۶D], true);
                    if (!this.f۱۵۲۶۶a0 && selectorIndices[this.f۱۵۲۴۶D] > this.f۱۵۳۰۱t) {
                        this.f۱۵۲۵۱I = this.f۱۵۲۵۰H;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f۱۵۳۰۳v = onClickListener;
    }

    public void setOnValueChangedListener(AbstractCe onValueChangedListener) {
        this.f۱۵۳۰۴w = onValueChangedListener;
    }

    public void setOnScrollListener(AbstractCd onScrollListener) {
        this.f۱۵۳۰۵x = onScrollListener;
    }

    public void setFormatter(AbstractCc formatter) {
        if (formatter != this.f۱۵۳۰۶y) {
            this.f۱۵۳۰۶y = formatter;
            m۱۸۲۰۷g();
            m۱۸۲۱۲l();
        }
    }

    public void setValue(int value) {
        m۱۸۱۸۶a(value, false);
    }

    private float getMaxTextSize() {
        return Math.max(this.f۱۵۲۸۸m, this.f۱۵۲۹۰n);
    }

    /* renamed from: a  reason: contains not printable characters */
    private float m۱۸۱۸۱a(Paint.FontMetrics fontMetrics) {
        if (fontMetrics == null) {
            return 0.0f;
        }
        return Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    /* renamed from: k  reason: contains not printable characters */
    private void m۱۸۲۱۱k() {
        if (this.f۱۵۲۸۲j) {
            this.f۱۵۲۴۸F.setTextSize(getMaxTextSize());
            int maxTextWidth = 0;
            String[] strArr = this.f۱۵۲۹۸r;
            if (strArr == null) {
                float maxDigitWidth = 0.0f;
                for (int i = 0; i <= 9; i++) {
                    float digitWidth = this.f۱۵۲۴۸F.measureText(m۱۸۲۰۱d(i));
                    if (digitWidth > maxDigitWidth) {
                        maxDigitWidth = digitWidth;
                    }
                }
                int numberOfDigits = 0;
                for (int current = this.f۱۵۳۰۱t; current > 0; current /= 10) {
                    numberOfDigits++;
                }
                maxTextWidth = (int) (((float) numberOfDigits) * maxDigitWidth);
            } else {
                int valueCount = strArr.length;
                for (int i2 = 0; i2 < valueCount; i2++) {
                    float textWidth = this.f۱۵۲۴۸F.measureText(this.f۱۵۲۹۸r[i2]);
                    if (textWidth > ((float) maxTextWidth)) {
                        maxTextWidth = (int) textWidth;
                    }
                }
            }
            int maxTextWidth2 = maxTextWidth + this.f۱۵۲۶۸c.getPaddingLeft() + this.f۱۵۲۶۸c.getPaddingRight();
            if (this.f۱۵۲۸۰i != maxTextWidth2) {
                int i3 = this.f۱۵۲۷۸h;
                if (maxTextWidth2 > i3) {
                    this.f۱۵۲۸۰i = maxTextWidth2;
                } else {
                    this.f۱۵۲۸۰i = i3;
                }
                invalidate();
            }
        }
    }

    public boolean getWrapSelectorWheel() {
        return this.f۱۵۲۶۶a0;
    }

    public void setWrapSelectorWheel(boolean wrapSelectorWheel) {
        boolean wrappingAllowed = this.f۱۵۳۰۱t - this.f۱۵۳۰۰s >= this.f۱۵۲۴۷E.length;
        if ((!wrapSelectorWheel || wrappingAllowed) && wrapSelectorWheel != this.f۱۵۲۶۶a0) {
            this.f۱۵۲۶۶a0 = wrapSelectorWheel;
        }
    }

    public void setOnLongPressUpdateInterval(long intervalMillis) {
        this.f۱۵۳۰۷z = intervalMillis;
    }

    public int getValue() {
        return this.f۱۵۳۰۲u;
    }

    public int getMinValue() {
        return this.f۱۵۳۰۰s;
    }

    public void setMinValue(int minValue) {
        this.f۱۵۳۰۰s = minValue;
        int i = this.f۱۵۳۰۰s;
        if (i > this.f۱۵۳۰۲u) {
            this.f۱۵۳۰۲u = i;
        }
        setWrapSelectorWheel(this.f۱۵۳۰۱t - this.f۱۵۳۰۰s > this.f۱۵۲۴۷E.length);
        m۱۸۲۰۷g();
        m۱۸۲۱۲l();
        m۱۸۲۱۱k();
        invalidate();
    }

    public int getMaxValue() {
        return this.f۱۵۳۰۱t;
    }

    public void setMaxValue(int maxValue) {
        if (maxValue >= 0) {
            this.f۱۵۳۰۱t = maxValue;
            int i = this.f۱۵۳۰۱t;
            if (i < this.f۱۵۳۰۲u) {
                this.f۱۵۳۰۲u = i;
            }
            setWrapSelectorWheel(this.f۱۵۳۰۱t - this.f۱۵۳۰۰s > this.f۱۵۲۴۷E.length);
            m۱۸۲۰۷g();
            m۱۸۲۱۲l();
            m۱۸۲۱۱k();
            invalidate();
            return;
        }
        throw new IllegalArgumentException("maxValue must be >= 0");
    }

    public String[] getDisplayedValues() {
        return this.f۱۵۲۹۸r;
    }

    public void setDisplayedValues(String[] displayedValues) {
        if (this.f۱۵۲۹۸r != displayedValues) {
            this.f۱۵۲۹۸r = displayedValues;
            if (this.f۱۵۲۹۸r != null) {
                this.f۱۵۲۶۸c.setRawInputType(524289);
            } else {
                this.f۱۵۲۶۸c.setRawInputType(2);
            }
            m۱۸۲۱۲l();
            m۱۸۲۰۷g();
            m۱۸۲۱۱k();
        }
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        return (m۱۸۲۱۶b() || !this.f۱۵۲۹۵p0) ? 0.0f : 0.9f;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        return (m۱۸۲۱۶b() || !this.f۱۵۲۹۵p0) ? 0.0f : 0.9f;
    }

    /* access modifiers changed from: protected */
    public float getLeftFadingEdgeStrength() {
        return (!m۱۸۲۱۶b() || !this.f۱۵۲۹۵p0) ? 0.0f : 0.9f;
    }

    /* access modifiers changed from: protected */
    public float getRightFadingEdgeStrength() {
        return (!m۱۸۲۱۶b() || !this.f۱۵۲۹۵p0) ? 0.0f : 0.9f;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m۱۸۲۰۸h();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float y;
        float x;
        canvas.save();
        if (m۱۸۲۱۶b()) {
            x = (float) this.f۱۵۲۵۱I;
            y = (float) (this.f۱۵۲۶۸c.getBaseline() + this.f۱۵۲۶۸c.getTop());
            if (this.f۱۵۲۴۵C < 3) {
                canvas.clipRect(this.f۱۵۲۸۱i0, 0, this.f۱۵۲۸۳j0, getBottom());
            }
        } else {
            x = (float) ((getRight() - getLeft()) / 2);
            y = (float) this.f۱۵۲۵۱I;
            if (this.f۱۵۲۴۵C < 3) {
                canvas.clipRect(0, this.f۱۵۲۷۷g0, getRight(), this.f۱۵۲۷۹h0);
            }
        }
        int[] selectorIndices = getSelectorIndices();
        for (int i = 0; i < selectorIndices.length; i++) {
            if (i == this.f۱۵۲۴۶D) {
                this.f۱۵۲۴۸F.setTextSize(this.f۱۵۲۹۰n);
                this.f۱۵۲۴۸F.setColor(this.f۱۵۲۸۴k);
            } else {
                this.f۱۵۲۴۸F.setTextSize(this.f۱۵۲۸۸m);
                this.f۱۵۲۴۸F.setColor(this.f۱۵۲۸۶l);
            }
            String scrollSelectorValue = this.f۱۵۲۴۳A.get(selectorIndices[m۱۸۲۱۵a() ? i : (selectorIndices.length - i) - 1]);
            if (!(i == this.f۱۵۲۴۶D && this.f۱۵۲۶۸c.getVisibility() == 0)) {
                if (m۱۸۲۱۶b()) {
                    canvas.drawText(scrollSelectorValue, x, y, this.f۱۵۲۴۸F);
                } else {
                    canvas.drawText(scrollSelectorValue, x, m۱۸۱۸۱a(this.f۱۵۲۴۸F.getFontMetrics()) + y, this.f۱۵۲۴۸F);
                }
            }
            if (m۱۸۲۱۶b()) {
                x += (float) this.f۱۵۲۴۹G;
            } else {
                y += (float) this.f۱۵۲۴۹G;
            }
        }
        canvas.restore();
        if (this.f۱۵۲۶۷b0 == null) {
            return;
        }
        if (m۱۸۲۱۶b()) {
            int leftOfLeftDivider = this.f۱۵۲۸۱i0;
            this.f۱۵۲۶۷b0.setBounds(leftOfLeftDivider, 0, this.f۱۵۲۷۳e0 + leftOfLeftDivider, getBottom());
            this.f۱۵۲۶۷b0.draw(canvas);
            int rightOfRightDivider = this.f۱۵۲۸۳j0;
            this.f۱۵۲۶۷b0.setBounds(rightOfRightDivider - this.f۱۵۲۷۳e0, 0, rightOfRightDivider, getBottom());
            this.f۱۵۲۶۷b0.draw(canvas);
            return;
        }
        int topOfTopDivider = this.f۱۵۲۷۷g0;
        this.f۱۵۲۶۷b0.setBounds(0, topOfTopDivider, getRight(), this.f۱۵۲۷۳e0 + topOfTopDivider);
        this.f۱۵۲۶۷b0.draw(canvas);
        int bottomOfBottomDivider = this.f۱۵۲۷۹h0;
        this.f۱۵۲۶۷b0.setBounds(0, bottomOfBottomDivider - this.f۱۵۲۷۳e0, getRight(), bottomOfBottomDivider);
        this.f۱۵۲۶۷b0.draw(canvas);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(NumberPicker.class.getName());
        event.setScrollable(m۱۸۲۱۷c());
        int i = this.f۱۵۳۰۰s;
        int i2 = this.f۱۵۲۴۹G;
        int scroll = (this.f۱۵۳۰۲u + i) * i2;
        int maxScroll = (this.f۱۵۳۰۱t - i) * i2;
        if (m۱۸۲۱۶b()) {
            event.setScrollX(scroll);
            event.setMaxScrollX(maxScroll);
            return;
        }
        event.setScrollY(scroll);
        event.setMaxScrollY(maxScroll);
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۸۱۹۳b(int measureSpec, int maxSize) {
        if (maxSize == -1) {
            return measureSpec;
        }
        int size = View.MeasureSpec.getSize(measureSpec);
        int mode = View.MeasureSpec.getMode(measureSpec);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, maxSize), 1073741824);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(maxSize, 1073741824);
        }
        if (mode == 1073741824) {
            return measureSpec;
        }
        throw new IllegalArgumentException("Unknown measure mode: " + mode);
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۸۱۸۲a(int minSize, int measuredSize, int measureSpec) {
        if (minSize != -1) {
            return resolveSizeAndState(Math.max(minSize, measuredSize), measureSpec, 0);
        }
        return measuredSize;
    }

    public static int resolveSizeAndState(int size, int measureSpec, int childMeasuredState) {
        int result = size;
        int specMode = View.MeasureSpec.getMode(measureSpec);
        int specSize = View.MeasureSpec.getSize(measureSpec);
        if (specMode != Integer.MIN_VALUE) {
            if (specMode == 0) {
                result = size;
            } else if (specMode == 1073741824) {
                result = specSize;
            }
        } else if (specSize < size) {
            result = specSize | 16777216;
        } else {
            result = size;
        }
        return (-16777216 & childMeasuredState) | result;
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۸۲۰۷g() {
        this.f۱۵۲۴۳A.clear();
        int[] selectorIndices = getSelectorIndices();
        int current = getValue();
        for (int i = 0; i < this.f۱۵۲۴۷E.length; i++) {
            int selectorIndex = (i - this.f۱۵۲۴۶D) + current;
            if (this.f۱۵۲۶۶a0) {
                selectorIndex = m۱۸۲۰۳e(selectorIndex);
            }
            selectorIndices[i] = selectorIndex;
            m۱۸۱۸۵a(selectorIndices[i]);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۱۸۶a(int current, boolean notifyChange) {
        int current2;
        if (this.f۱۵۳۰۲u != current) {
            if (this.f۱۵۲۶۶a0) {
                current2 = m۱۸۲۰۳e(current);
            } else {
                current2 = Math.min(Math.max(current, this.f۱۵۳۰۰s), this.f۱۵۳۰۱t);
            }
            int previous = this.f۱۵۳۰۲u;
            this.f۱۵۳۰۲u = current2;
            m۱۸۲۱۲l();
            if (notifyChange) {
                m۱۸۱۹۹c(previous, current2);
            }
            m۱۸۲۰۷g();
            invalidate();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۱۸۸a(boolean increment) {
        this.f۱۵۲۶۸c.setVisibility(4);
        if (!m۱۸۱۹۱a(this.f۱۵۲۵۲J)) {
            m۱۸۱۹۱a(this.f۱۵۲۵۳K);
        }
        if (m۱۸۲۱۶b()) {
            this.f۱۵۲۵۴L = 0;
            if (increment) {
                this.f۱۵۲۵۲J.m۱۸۲۳۰a(0, 0, -this.f۱۵۲۴۹G, 0, 300);
            } else {
                this.f۱۵۲۵۲J.m۱۸۲۳۰a(0, 0, this.f۱۵۲۴۹G, 0, 300);
            }
        } else {
            this.f۱۵۲۵۵M = 0;
            if (increment) {
                this.f۱۵۲۵۲J.m۱۸۲۳۰a(0, 0, 0, -this.f۱۵۲۴۹G, 300);
            } else {
                this.f۱۵۲۵۲J.m۱۸۲۳۰a(0, 0, 0, this.f۱۵۲۴۹G, 300);
            }
        }
        invalidate();
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۸۲۰۵f() {
        m۱۸۲۰۷g();
        int[] selectorIndices = getSelectorIndices();
        int totalTextSize = ((selectorIndices.length - 1) * ((int) this.f۱۵۲۸۸m)) + ((int) this.f۱۵۲۹۰n);
        float textGapCount = (float) selectorIndices.length;
        if (m۱۸۲۱۶b()) {
            this.f۱۵۲۹۴p = (int) (((float) ((getRight() - getLeft()) - totalTextSize)) / textGapCount);
            this.f۱۵۲۴۹G = ((int) getMaxTextSize()) + this.f۱۵۲۹۴p;
            this.f۱۵۲۵۰H = ((int) this.f۱۵۲۷۰d) - (this.f۱۵۲۴۹G * this.f۱۵۲۴۶D);
        } else {
            this.f۱۵۲۹۶q = (int) (((float) ((getBottom() - getTop()) - totalTextSize)) / textGapCount);
            this.f۱۵۲۴۹G = ((int) getMaxTextSize()) + this.f۱۵۲۹۶q;
            this.f۱۵۲۵۰H = ((int) this.f۱۵۲۷۲e) - (this.f۱۵۲۴۹G * this.f۱۵۲۴۶D);
        }
        this.f۱۵۲۵۱I = this.f۱۵۲۵۰H;
        m۱۸۲۱۲l();
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۸۲۰۴e() {
        if (m۱۸۲۱۶b()) {
            setHorizontalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getRight() - getLeft()) - ((int) this.f۱۵۲۸۸m)) / 2);
            return;
        }
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(((getBottom() - getTop()) - ((int) this.f۱۵۲۸۸m)) / 2);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۸۱۹۵b(Ce scroller) {
        if (scroller == this.f۱۵۲۵۲J) {
            if (!m۱۸۲۰۲d()) {
                m۱۸۲۱۲l();
            }
            m۱۸۲۰۶f(0);
        } else if (this.f۱۵۲۷۵f0 != 1) {
            m۱۸۲۱۲l();
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۸۲۰۶f(int scrollState) {
        if (this.f۱۵۲۷۵f0 != scrollState) {
            this.f۱۵۲۷۵f0 = scrollState;
            AbstractCd dVar = this.f۱۵۳۰۵x;
            if (dVar != null) {
                dVar.m۱۸۲۲۲a(this, scrollState);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۸۱۹۴b(int velocity) {
        if (m۱۸۲۱۶b()) {
            this.f۱۵۲۵۴L = 0;
            if (velocity > 0) {
                this.f۱۵۲۵۲J.m۱۸۲۳۱a(0, 0, velocity, 0, 0, Integer.MAX_VALUE, 0, 0);
            } else {
                this.f۱۵۲۵۲J.m۱۸۲۳۱a(Integer.MAX_VALUE, 0, velocity, 0, 0, Integer.MAX_VALUE, 0, 0);
            }
        } else {
            this.f۱۵۲۵۵M = 0;
            if (velocity > 0) {
                this.f۱۵۲۵۲J.m۱۸۲۳۱a(0, 0, 0, velocity, 0, 0, 0, Integer.MAX_VALUE);
            } else {
                this.f۱۵۲۵۲J.m۱۸۲۳۱a(0, Integer.MAX_VALUE, 0, velocity, 0, 0, 0, Integer.MAX_VALUE);
            }
        }
        invalidate();
    }

    /* renamed from: e  reason: contains not printable characters */
    private int m۱۸۲۰۳e(int selectorIndex) {
        int i = this.f۱۵۳۰۱t;
        if (selectorIndex > i) {
            int i2 = this.f۱۵۳۰۰s;
            return (i2 + ((selectorIndex - i) % (i - i2))) - 1;
        }
        int i3 = this.f۱۵۳۰۰s;
        if (selectorIndex < i3) {
            return (i - ((i3 - selectorIndex) % (i - i3))) + 1;
        }
        return selectorIndex;
    }

    private int[] getSelectorIndices() {
        return this.f۱۵۲۴۷E;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۸۱۹۶b(int[] selectorIndices) {
        for (int i = 0; i < selectorIndices.length - 1; i++) {
            selectorIndices[i] = selectorIndices[i + 1];
        }
        int nextScrollSelectorIndex = selectorIndices[selectorIndices.length - 2] + 1;
        if (this.f۱۵۲۶۶a0 && nextScrollSelectorIndex > this.f۱۵۳۰۱t) {
            nextScrollSelectorIndex = this.f۱۵۳۰۰s;
        }
        selectorIndices[selectorIndices.length - 1] = nextScrollSelectorIndex;
        m۱۸۱۸۵a(nextScrollSelectorIndex);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۱۹۰a(int[] selectorIndices) {
        for (int i = selectorIndices.length - 1; i > 0; i--) {
            selectorIndices[i] = selectorIndices[i - 1];
        }
        int nextScrollSelectorIndex = selectorIndices[1] - 1;
        if (this.f۱۵۲۶۶a0 && nextScrollSelectorIndex < this.f۱۵۳۰۰s) {
            nextScrollSelectorIndex = this.f۱۵۳۰۱t;
        }
        selectorIndices[0] = nextScrollSelectorIndex;
        m۱۸۱۸۵a(nextScrollSelectorIndex);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۱۸۵a(int selectorIndex) {
        String scrollSelectorValue;
        SparseArray<String> cache = this.f۱۵۲۴۳A;
        if (cache.get(selectorIndex) == null) {
            int i = this.f۱۵۳۰۰s;
            if (selectorIndex < i || selectorIndex > this.f۱۵۳۰۱t) {
                scrollSelectorValue = "";
            } else {
                String[] strArr = this.f۱۵۲۹۸r;
                if (strArr != null) {
                    scrollSelectorValue = strArr[selectorIndex - i];
                } else {
                    scrollSelectorValue = m۱۸۱۹۸c(selectorIndex);
                }
            }
            cache.put(selectorIndex, scrollSelectorValue);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private String m۱۸۱۹۸c(int value) {
        AbstractCc cVar = this.f۱۵۳۰۶y;
        return cVar != null ? cVar.m۱۸۲۲۱a(value) : m۱۸۲۰۱d(value);
    }

    /* renamed from: l  reason: contains not printable characters */
    private boolean m۱۸۲۱۲l() {
        String[] strArr = this.f۱۵۲۹۸r;
        String text = strArr == null ? m۱۸۱۹۸c(this.f۱۵۳۰۲u) : strArr[this.f۱۵۳۰۲u - this.f۱۵۳۰۰s];
        if (TextUtils.isEmpty(text) || text.equals(this.f۱۵۲۶۸c.getText().toString())) {
            return false;
        }
        this.f۱۵۲۶۸c.setText(text);
        return true;
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۸۱۹۹c(int previous, int current) {
        AbstractCe eVar = this.f۱۵۳۰۴w;
        if (eVar != null) {
            eVar.m۱۸۲۲۳a(this, previous, this.f۱۵۳۰۲u);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۱۸۹a(boolean increment, long delayMillis) {
        RunnableCb bVar = this.f۱۵۲۵۷O;
        if (bVar == null) {
            this.f۱۵۲۵۷O = new RunnableCb();
        } else {
            removeCallbacks(bVar);
        }
        this.f۱۵۲۵۷O.m۱۸۲۲۰a(increment);
        postDelayed(this.f۱۵۲۵۷O, delayMillis);
    }

    /* renamed from: i  reason: contains not printable characters */
    private void m۱۸۲۰۹i() {
        RunnableCb bVar = this.f۱۵۲۵۷O;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    private void m۱۸۲۰۸h() {
        RunnableCb bVar = this.f۱۵۲۵۷O;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        RunnableCf fVar = this.f۱۵۲۵۶N;
        if (fVar != null) {
            removeCallbacks(fVar);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۸۲۰۲d() {
        int delta = this.f۱۵۲۵۰H - this.f۱۵۲۵۱I;
        if (delta == 0) {
            return false;
        }
        int abs = Math.abs(delta);
        int i = this.f۱۵۲۴۹G;
        if (abs > i / 2) {
            if (delta > 0) {
                i = -i;
            }
            delta += i;
        }
        if (m۱۸۲۱۶b()) {
            this.f۱۵۲۵۴L = 0;
            this.f۱۵۲۵۳K.m۱۸۲۳۰a(0, 0, delta, 0, 800);
        } else {
            this.f۱۵۲۵۵M = 0;
            this.f۱۵۲۵۳K.m۱۸۲۳۰a(0, 0, 0, delta, 800);
        }
        invalidate();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.shawnlin.numberpicker.NumberPicker$b  reason: invalid class name */
    public class RunnableCb implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        private boolean f۱۵۳۰۹c;

        RunnableCb() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a  reason: contains not printable characters */
        private void m۱۸۲۲۰a(boolean increment) {
            this.f۱۵۳۰۹c = increment;
        }

        public void run() {
            NumberPicker.this.m۱۸۱۸۸a((NumberPicker) this.f۱۵۳۰۹c);
            NumberPicker numberPicker = NumberPicker.this;
            numberPicker.postDelayed(this, numberPicker.f۱۵۳۰۷z);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private String m۱۸۲۰۱d(int value) {
        return String.format(Locale.getDefault(), "%d", Integer.valueOf(value));
    }

    /* renamed from: j  reason: contains not printable characters */
    private void m۱۸۲۱۰j() {
        if (m۱۸۲۱۶b()) {
            this.f۱۵۲۷۴f = -1;
            this.f۱۵۲۷۶g = (int) m۱۸۱۸۰a(64.0f);
            this.f۱۵۲۷۸h = (int) m۱۸۱۸۰a(180.0f);
            this.f۱۵۲۸۰i = -1;
            return;
        }
        this.f۱۵۲۷۴f = -1;
        this.f۱۵۲۷۶g = (int) m۱۸۱۸۰a(180.0f);
        this.f۱۵۲۷۸h = (int) m۱۸۱۸۰a(64.0f);
        this.f۱۵۲۸۰i = -1;
    }

    public void setDividerColor(int color) {
        this.f۱۵۲۶۹c0 = color;
        this.f۱۵۲۶۷b0 = new ColorDrawable(color);
    }

    public void setDividerColorResource(int colorId) {
        setDividerColor(android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(this.f۱۵۲۹۹r0, colorId));
    }

    public void setDividerDistance(int distance) {
        this.f۱۵۲۷۱d0 = (int) m۱۸۱۸۰a((float) distance);
    }

    public void setDividerThickness(int thickness) {
        this.f۱۵۲۷۳e0 = (int) m۱۸۱۸۰a((float) thickness);
    }

    public void setOrder(int order) {
        this.f۱۵۲۹۳o0 = order;
    }

    public void setOrientation(int orientation) {
        this.f۱۵۲۹۱n0 = orientation;
        m۱۸۲۱۰j();
    }

    public void setWheelItemCount(int count) {
        if (count >= 1) {
            this.f۱۵۲۴۵C = count;
            int i = 3;
            if (count >= 3) {
                i = count;
            }
            this.f۱۵۲۴۴B = i;
            int i2 = this.f۱۵۲۴۴B;
            this.f۱۵۲۴۶D = i2 / 2;
            this.f۱۵۲۴۷E = new int[i2];
            return;
        }
        throw new IllegalArgumentException("Wheel item count must be >= 1");
    }

    public void setFormatter(String formatter) {
        if (!TextUtils.isEmpty(formatter)) {
            setFormatter(m۱۸۱۸۴a(formatter));
        }
    }

    public void setFormatter(int stringId) {
        setFormatter(getResources().getString(stringId));
    }

    public void setFadingEdgeEnabled(boolean fadingEdgeEnabled) {
        this.f۱۵۲۹۵p0 = fadingEdgeEnabled;
    }

    public void setScrollerEnabled(boolean scrollerEnabled) {
        this.f۱۵۲۹۷q0 = scrollerEnabled;
    }

    public void setSelectedTextColor(int color) {
        this.f۱۵۲۸۴k = color;
        this.f۱۵۲۶۸c.setTextColor(this.f۱۵۲۸۴k);
    }

    public void setSelectedTextColorResource(int colorId) {
        setSelectedTextColor(android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(this.f۱۵۲۹۹r0, colorId));
    }

    public void setSelectedTextSize(float textSize) {
        this.f۱۵۲۹۰n = textSize;
        this.f۱۵۲۶۸c.setTextSize(m۱۸۱۹۷c(this.f۱۵۲۹۰n));
    }

    public void setSelectedTextSize(int dimenId) {
        setSelectedTextSize(getResources().getDimension(dimenId));
    }

    public void setTextColor(int color) {
        this.f۱۵۲۸۶l = color;
        this.f۱۵۲۴۸F.setColor(this.f۱۵۲۸۶l);
    }

    public void setTextColorResource(int colorId) {
        setTextColor(android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(this.f۱۵۲۹۹r0, colorId));
    }

    public void setTextSize(float textSize) {
        this.f۱۵۲۸۸m = textSize;
        this.f۱۵۲۴۸F.setTextSize(this.f۱۵۲۸۸m);
    }

    public void setTextSize(int dimenId) {
        setTextSize(getResources().getDimension(dimenId));
    }

    public void setTypeface(Typeface typeface) {
        this.f۱۵۲۹۲o = typeface;
        Typeface typeface2 = this.f۱۵۲۹۲o;
        if (typeface2 != null) {
            this.f۱۵۲۶۸c.setTypeface(typeface2);
            this.f۱۵۲۴۸F.setTypeface(this.f۱۵۲۹۲o);
            return;
        }
        this.f۱۵۲۶۸c.setTypeface(Typeface.MONOSPACE);
        this.f۱۵۲۴۸F.setTypeface(Typeface.MONOSPACE);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۲۱۴a(String string, int style) {
        if (!TextUtils.isEmpty(string)) {
            setTypeface(Typeface.create(string, style));
        }
    }

    public void setTypeface(String string) {
        m۱۸۲۱۴a(string, 0);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۲۱۳a(int stringId, int style) {
        m۱۸۲۱۴a(getResources().getString(stringId), style);
    }

    public void setTypeface(int stringId) {
        m۱۸۲۱۳a(stringId, 0);
    }

    /* renamed from: a  reason: contains not printable characters */
    private AbstractCc m۱۸۱۸۴a(String formatter) {
        if (TextUtils.isEmpty(formatter)) {
            return null;
        }
        return new Ca(this, formatter);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.shawnlin.numberpicker.NumberPicker$a  reason: invalid class name */
    public class Ca implements AbstractCc {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ String f۱۵۳۰۸a;

        Ca(NumberPicker this$0, String str) {
            this.f۱۵۳۰۸a = str;
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public String m۱۸۲۱۸a(int i) {
            return String.format(Locale.getDefault(), this.f۱۵۳۰۸a, Integer.valueOf(i));
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private float m۱۸۱۸۰a(float dp) {
        return getResources().getDisplayMetrics().density * dp;
    }

    /* renamed from: b  reason: contains not printable characters */
    private float m۱۸۱۹۲b(float px) {
        return px / getResources().getDisplayMetrics().density;
    }

    /* renamed from: d  reason: contains not printable characters */
    private float m۱۸۲۰۰d(float sp) {
        return TypedValue.applyDimension(2, sp, getResources().getDisplayMetrics());
    }

    /* renamed from: c  reason: contains not printable characters */
    private float m۱۸۱۹۷c(float px) {
        return px / getResources().getDisplayMetrics().scaledDensity;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۸۲۱۶b() {
        return getOrientation() == 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۲۱۵a() {
        return getOrder() == 0;
    }

    public int getDividerColor() {
        return this.f۱۵۲۶۹c0;
    }

    public float getDividerDistance() {
        return m۱۸۱۹۲b((float) this.f۱۵۲۷۱d0);
    }

    public float getDividerThickness() {
        return m۱۸۱۹۲b((float) this.f۱۵۲۷۳e0);
    }

    public int getOrder() {
        return this.f۱۵۲۹۳o0;
    }

    public int getOrientation() {
        return this.f۱۵۲۹۱n0;
    }

    public int getWheelItemCount() {
        return this.f۱۵۲۴۴B;
    }

    public AbstractCc getFormatter() {
        return this.f۱۵۳۰۶y;
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۸۲۱۷c() {
        return this.f۱۵۲۹۷q0;
    }

    public int getSelectedTextColor() {
        return this.f۱۵۲۸۴k;
    }

    public float getSelectedTextSize() {
        return this.f۱۵۲۹۰n;
    }

    public int getTextColor() {
        return this.f۱۵۲۸۶l;
    }

    public float getTextSize() {
        return m۱۸۲۰۰d(this.f۱۵۲۸۸m);
    }

    public Typeface getTypeface() {
        return this.f۱۵۲۹۲o;
    }
}
