package com.afollestad.materialdialogs.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.Cg;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.Ci;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.Ck;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.Cn;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCo;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca;

public class MDRootLayout extends ViewGroup {

    /* renamed from: c  reason: contains not printable characters */
    private final MDButton[] f۱۳۲۹۰c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۳۲۹۱d;

    /* renamed from: e  reason: contains not printable characters */
    private View f۱۳۲۹۲e;

    /* renamed from: f  reason: contains not printable characters */
    private View f۱۳۲۹۳f;

    /* renamed from: g  reason: contains not printable characters */
    private boolean f۱۳۲۹۴g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۳۲۹۵h;

    /* renamed from: i  reason: contains not printable characters */
    private EnumCo f۱۳۲۹۶i;

    /* renamed from: j  reason: contains not printable characters */
    private boolean f۱۳۲۹۷j;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۱۳۲۹۸k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۱۳۲۹۹l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۱۳۳۰۰m;

    /* renamed from: n  reason: contains not printable characters */
    private int f۱۳۳۰۱n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۳۳۰۲o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۳۳۰۳p;

    /* renamed from: q  reason: contains not printable characters */
    private EnumCe f۱۳۳۰۴q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۳۳۰۵r;

    /* renamed from: s  reason: contains not printable characters */
    private Paint f۱۳۳۰۶s;

    /* renamed from: t  reason: contains not printable characters */
    private ViewTreeObserver.OnScrollChangedListener f۱۳۳۰۷t;

    /* renamed from: u  reason: contains not printable characters */
    private ViewTreeObserver.OnScrollChangedListener f۱۳۳۰۸u;

    /* renamed from: v  reason: contains not printable characters */
    private int f۱۳۳۰۹v;

    public MDRootLayout(Context context) {
        super(context);
        this.f۱۳۲۹۰c = new MDButton[3];
        this.f۱۳۲۹۴g = false;
        this.f۱۳۲۹۵h = false;
        this.f۱۳۲۹۶i = EnumCo.ADAPTIVE;
        this.f۱۳۲۹۷j = false;
        this.f۱۳۲۹۸k = true;
        this.f۱۳۳۰۴q = EnumCe.START;
        m۱۶۷۴۱a(context, (AttributeSet) null, 0);
    }

    public MDRootLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f۱۳۲۹۰c = new MDButton[3];
        this.f۱۳۲۹۴g = false;
        this.f۱۳۲۹۵h = false;
        this.f۱۳۲۹۶i = EnumCo.ADAPTIVE;
        this.f۱۳۲۹۷j = false;
        this.f۱۳۲۹۸k = true;
        this.f۱۳۳۰۴q = EnumCe.START;
        m۱۶۷۴۱a(context, attrs, 0);
    }

    @TargetApi(11)
    public MDRootLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۳۲۹۰c = new MDButton[3];
        this.f۱۳۲۹۴g = false;
        this.f۱۳۲۹۵h = false;
        this.f۱۳۲۹۶i = EnumCo.ADAPTIVE;
        this.f۱۳۲۹۷j = false;
        this.f۱۳۲۹۸k = true;
        this.f۱۳۳۰۴q = EnumCe.START;
        m۱۶۷۴۱a(context, attrs, defStyleAttr);
    }

    @TargetApi(21)
    public MDRootLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.f۱۳۲۹۰c = new MDButton[3];
        this.f۱۳۲۹۴g = false;
        this.f۱۳۲۹۵h = false;
        this.f۱۳۲۹۶i = EnumCo.ADAPTIVE;
        this.f۱۳۲۹۷j = false;
        this.f۱۳۲۹۸k = true;
        this.f۱۳۳۰۴q = EnumCe.START;
        m۱۶۷۴۱a(context, attrs, defStyleAttr);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۶۷۵۰a(View v) {
        boolean visible = true;
        boolean visible2 = (v == null || v.getVisibility() == 8) ? false : true;
        if (!visible2 || !(v instanceof MDButton)) {
            return visible2;
        }
        if (((MDButton) v).getText().toString().trim().length() <= 0) {
            visible = false;
        }
        return visible;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۶۷۴۹a(RecyclerView view) {
        return (view == null || view.getLayoutManager() == null || !view.getLayoutManager().m۱۴۵۶۸b()) ? false : true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۶۷۵۳a(ScrollView sv) {
        if (sv.getChildCount() != 0 && (sv.getMeasuredHeight() - sv.getPaddingTop()) - sv.getPaddingBottom() < sv.getChildAt(0).getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b  reason: contains not printable characters */
    public static boolean m۱۶۷۵۸b(WebView view) {
        return ((float) view.getMeasuredHeight()) < ((float) view.getContentHeight()) * view.getScale();
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۶۷۵۲a(AdapterView lv) {
        if (lv.getLastVisiblePosition() == -1) {
            return false;
        }
        boolean firstItemVisible = lv.getFirstVisiblePosition() == 0;
        boolean lastItemVisible = lv.getLastVisiblePosition() == lv.getCount() - 1;
        if (!firstItemVisible || !lastItemVisible || lv.getChildCount() <= 0 || lv.getChildAt(0).getTop() < lv.getPaddingTop() || lv.getChildAt(lv.getChildCount() - 1).getBottom() > lv.getHeight() - lv.getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static View m۱۶۷۴۰a(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int i = viewGroup.getChildCount() - 1; i >= 0; i--) {
            View child = viewGroup.getChildAt(i);
            if (child.getVisibility() == 0 && child.getBottom() == viewGroup.getMeasuredHeight()) {
                return child;
            }
        }
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    private static View m۱۶۷۵۶b(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int i = viewGroup.getChildCount() - 1; i >= 0; i--) {
            View child = viewGroup.getChildAt(i);
            if (child.getVisibility() == 0 && child.getTop() == 0) {
                return child;
            }
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۷۴۱a(Context context, AttributeSet attrs, int defStyleAttr) {
        Resources r = context.getResources();
        TypedArray a = context.obtainStyledAttributes(attrs, Cn.MDRootLayout, defStyleAttr, 0);
        this.f۱۳۲۹۹l = a.getBoolean(Cn.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        a.recycle();
        this.f۱۳۳۰۱n = r.getDimensionPixelSize(Ci.md_notitle_vertical_padding);
        this.f۱۳۳۰۲o = r.getDimensionPixelSize(Ci.md_button_frame_vertical_padding);
        this.f۱۳۳۰۵r = r.getDimensionPixelSize(Ci.md_button_padding_frame_side);
        this.f۱۳۳۰۳p = r.getDimensionPixelSize(Ci.md_button_height);
        this.f۱۳۳۰۶s = new Paint();
        this.f۱۳۳۰۹v = r.getDimensionPixelSize(Ci.md_divider_height);
        this.f۱۳۳۰۶s.setColor(Ca.m۱۵۹۰۶e(context, Cg.md_divider_color));
        setWillNotDraw(false);
    }

    public void setMaxHeight(int maxHeight) {
        this.f۱۳۲۹۱d = maxHeight;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۷۶۰a() {
        this.f۱۳۳۰۰m = true;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i = 0; i < getChildCount(); i++) {
            View v = getChildAt(i);
            if (v.getId() == Ck.md_titleFrame) {
                this.f۱۳۲۹۲e = v;
            } else if (v.getId() == Ck.md_buttonDefaultNeutral) {
                this.f۱۳۲۹۰c[0] = (MDButton) v;
            } else if (v.getId() == Ck.md_buttonDefaultNegative) {
                this.f۱۳۲۹۰c[1] = (MDButton) v;
            } else if (v.getId() == Ck.md_buttonDefaultPositive) {
                this.f۱۳۲۹۰c[2] = (MDButton) v;
            } else {
                this.f۱۳۲۹۳f = v;
            }
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        boolean stacked;
        int fullPadding;
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        if (height > this.f۱۳۲۹۱d) {
            height = this.f۱۳۲۹۱d;
        }
        this.f۱۳۲۹۸k = true;
        boolean buttonBarPadding = false;
        EnumCo oVar = this.f۱۳۲۹۶i;
        if (oVar == EnumCo.ALWAYS) {
            stacked = true;
        } else if (oVar == EnumCo.NEVER) {
            stacked = false;
        } else {
            int buttonsWidth = 0;
            MDButton[] mDButtonArr = this.f۱۳۲۹۰c;
            boolean hasButtons = false;
            for (MDButton button : mDButtonArr) {
                if (button != null && m۱۶۷۵۰a(button)) {
                    button.m۱۶۷۳۹a(false, false);
                    measureChild(button, widthMeasureSpec, heightMeasureSpec);
                    buttonsWidth += button.getMeasuredWidth();
                    hasButtons = true;
                }
            }
            stacked = buttonsWidth > width - (getContext().getResources().getDimensionPixelSize(Ci.md_neutral_button_margin) * 2);
            buttonBarPadding = hasButtons;
        }
        int stackedHeight = 0;
        this.f۱۳۲۹۷j = stacked;
        if (stacked) {
            MDButton[] mDButtonArr2 = this.f۱۳۲۹۰c;
            int stackedHeight2 = 0;
            boolean hasButtons2 = buttonBarPadding;
            for (MDButton button2 : mDButtonArr2) {
                if (button2 != null && m۱۶۷۵۰a(button2)) {
                    button2.m۱۶۷۳۹a(true, false);
                    measureChild(button2, widthMeasureSpec, heightMeasureSpec);
                    stackedHeight2 += button2.getMeasuredHeight();
                    hasButtons2 = true;
                }
            }
            buttonBarPadding = hasButtons2;
            stackedHeight = stackedHeight2;
        }
        int availableHeight = height;
        int minPadding = 0;
        if (!buttonBarPadding) {
            fullPadding = 0 + (this.f۱۳۳۰۲o * 2);
        } else if (this.f۱۳۲۹۷j) {
            availableHeight -= stackedHeight;
            int i = this.f۱۳۳۰۲o;
            fullPadding = 0 + (i * 2);
            minPadding = 0 + (i * 2);
        } else {
            availableHeight -= this.f۱۳۳۰۳p;
            fullPadding = 0 + (this.f۱۳۳۰۲o * 2);
        }
        if (m۱۶۷۵۰a(this.f۱۳۲۹۲e)) {
            this.f۱۳۲۹۲e.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), 0);
            availableHeight -= this.f۱۳۲۹۲e.getMeasuredHeight();
        } else if (!this.f۱۳۳۰۰m) {
            fullPadding += this.f۱۳۳۰۱n;
        }
        if (m۱۶۷۵۰a(this.f۱۳۲۹۳f)) {
            this.f۱۳۲۹۳f.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(availableHeight - minPadding, Integer.MIN_VALUE));
            if (this.f۱۳۲۹۳f.getMeasuredHeight() > availableHeight - fullPadding) {
                this.f۱۳۲۹۸k = false;
                availableHeight = 0;
            } else if (!this.f۱۳۲۹۹l || m۱۶۷۵۰a(this.f۱۳۲۹۲e) || buttonBarPadding) {
                this.f۱۳۲۹۸k = true;
                availableHeight -= this.f۱۳۲۹۳f.getMeasuredHeight() + fullPadding;
            } else {
                this.f۱۳۲۹۸k = false;
                availableHeight -= this.f۱۳۲۹۳f.getMeasuredHeight() + minPadding;
            }
        }
        setMeasuredDimension(width, height - availableHeight);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f۱۳۲۹۳f;
        if (view != null) {
            if (this.f۱۳۲۹۴g) {
                int y = view.getTop();
                canvas.drawRect(0.0f, (float) (y - this.f۱۳۳۰۹v), (float) getMeasuredWidth(), (float) y, this.f۱۳۳۰۶s);
            }
            if (this.f۱۳۲۹۵h) {
                int y2 = this.f۱۳۲۹۳f.getBottom();
                canvas.drawRect(0.0f, (float) y2, (float) getMeasuredWidth(), (float) (this.f۱۳۳۰۹v + y2), this.f۱۳۳۰۶s);
            }
        }
    }

    /* JADX INFO: Multiple debug info for r4v5 int: [D('b' int), D('barBottom' int)] */
    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int bl;
        int br;
        int br2;
        int bl2;
        int br3;
        int bl3;
        int t2 = t;
        if (m۱۶۷۵۰a(this.f۱۳۲۹۲e)) {
            int height = this.f۱۳۲۹۲e.getMeasuredHeight();
            this.f۱۳۲۹۲e.layout(l, t2, r, t2 + height);
            t2 += height;
        } else if (!this.f۱۳۳۰۰m && this.f۱۳۲۹۸k) {
            t2 += this.f۱۳۳۰۱n;
        }
        if (m۱۶۷۵۰a(this.f۱۳۲۹۳f)) {
            View view = this.f۱۳۲۹۳f;
            view.layout(l, t2, r, view.getMeasuredHeight() + t2);
        }
        if (this.f۱۳۲۹۷j) {
            int b2 = b - this.f۱۳۳۰۲o;
            MDButton[] mDButtonArr = this.f۱۳۲۹۰c;
            for (MDButton mButton : mDButtonArr) {
                if (m۱۶۷۵۰a(mButton)) {
                    mButton.layout(l, b2 - mButton.getMeasuredHeight(), r, b2);
                    b2 -= mButton.getMeasuredHeight();
                }
            }
        } else {
            int barBottom = b;
            if (this.f۱۳۲۹۸k) {
                barBottom -= this.f۱۳۳۰۲o;
            }
            int barTop = barBottom - this.f۱۳۳۰۳p;
            int offset = this.f۱۳۳۰۵r;
            int neutralLeft = -1;
            int neutralRight = -1;
            if (m۱۶۷۵۰a(this.f۱۳۲۹۰c[2])) {
                if (this.f۱۳۳۰۴q == EnumCe.END) {
                    bl3 = l + offset;
                    br3 = this.f۱۳۲۹۰c[2].getMeasuredWidth() + bl3;
                } else {
                    br3 = r - offset;
                    bl3 = br3 - this.f۱۳۲۹۰c[2].getMeasuredWidth();
                    neutralRight = bl3;
                }
                this.f۱۳۲۹۰c[2].layout(bl3, barTop, br3, barBottom);
                offset += this.f۱۳۲۹۰c[2].getMeasuredWidth();
            }
            if (m۱۶۷۵۰a(this.f۱۳۲۹۰c[1])) {
                EnumCe eVar = this.f۱۳۳۰۴q;
                if (eVar == EnumCe.END) {
                    bl2 = l + offset;
                    br2 = this.f۱۳۲۹۰c[1].getMeasuredWidth() + bl2;
                } else if (eVar == EnumCe.START) {
                    br2 = r - offset;
                    bl2 = br2 - this.f۱۳۲۹۰c[1].getMeasuredWidth();
                } else {
                    bl2 = this.f۱۳۳۰۵r + l;
                    br2 = this.f۱۳۲۹۰c[1].getMeasuredWidth() + bl2;
                    neutralLeft = br2;
                }
                this.f۱۳۲۹۰c[1].layout(bl2, barTop, br2, barBottom);
            }
            if (m۱۶۷۵۰a(this.f۱۳۲۹۰c[0])) {
                EnumCe eVar2 = this.f۱۳۳۰۴q;
                if (eVar2 == EnumCe.END) {
                    br = r - this.f۱۳۳۰۵r;
                    bl = br - this.f۱۳۲۹۰c[0].getMeasuredWidth();
                } else if (eVar2 == EnumCe.START) {
                    bl = l + this.f۱۳۳۰۵r;
                    br = this.f۱۳۲۹۰c[0].getMeasuredWidth() + bl;
                } else {
                    if (neutralLeft == -1 && neutralRight != -1) {
                        neutralLeft = neutralRight - this.f۱۳۲۹۰c[0].getMeasuredWidth();
                    } else if (neutralRight == -1 && neutralLeft != -1) {
                        neutralRight = this.f۱۳۲۹۰c[0].getMeasuredWidth() + neutralLeft;
                    } else if (neutralRight == -1) {
                        int neutralLeft2 = ((r - l) / 2) - (this.f۱۳۲۹۰c[0].getMeasuredWidth() / 2);
                        neutralRight = this.f۱۳۲۹۰c[0].getMeasuredWidth() + neutralLeft2;
                        neutralLeft = neutralLeft2;
                    }
                    bl = neutralLeft;
                    br = neutralRight;
                }
                this.f۱۳۲۹۰c[0].layout(bl, barTop, br, barBottom);
            }
        }
        m۱۶۷۴۲a(this.f۱۳۲۹۳f, true, true);
    }

    public void setStackingBehavior(EnumCo behavior) {
        this.f۱۳۲۹۶i = behavior;
        invalidate();
    }

    public void setDividerColor(int color) {
        this.f۱۳۳۰۶s.setColor(color);
        invalidate();
    }

    public void setButtonGravity(EnumCe gravity) {
        this.f۱۳۳۰۴q = gravity;
        m۱۶۷۵۷b();
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۷۵۷b() {
        if (Build.VERSION.SDK_INT >= 17 && getResources().getConfiguration().getLayoutDirection() == 1) {
            int i = Cd.f۱۳۳۲۲a[this.f۱۳۳۰۴q.ordinal()];
            if (i == 1) {
                this.f۱۳۳۰۴q = EnumCe.END;
            } else if (i == 2) {
                this.f۱۳۳۰۴q = EnumCe.START;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$d  reason: invalid class name */
    public static /* synthetic */ class Cd {

        /* renamed from: a  reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۳۳۲۲a = new int[EnumCe.values().length];

        static {
            try {
                f۱۳۳۲۲a[EnumCe.START.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f۱۳۳۲۲a[EnumCe.END.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public void setButtonStackedGravity(EnumCe gravity) {
        MDButton[] mDButtonArr = this.f۱۳۲۹۰c;
        for (MDButton mButton : mDButtonArr) {
            if (mButton != null) {
                mButton.setStackedGravity(gravity);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۷۴۲a(View view, boolean setForTop, boolean setForBottom) {
        if (view != null) {
            if (view instanceof ScrollView) {
                ScrollView sv = (ScrollView) view;
                if (m۱۶۷۵۳a(sv)) {
                    m۱۶۷۴۳a((ViewGroup) sv, setForTop, setForBottom);
                    return;
                }
                if (setForTop) {
                    this.f۱۳۲۹۴g = false;
                }
                if (setForBottom) {
                    this.f۱۳۲۹۵h = false;
                }
            } else if (view instanceof AdapterView) {
                AdapterView sv2 = (AdapterView) view;
                if (m۱۶۷۵۲a(sv2)) {
                    m۱۶۷۴۳a((ViewGroup) sv2, setForTop, setForBottom);
                    return;
                }
                if (setForTop) {
                    this.f۱۳۲۹۴g = false;
                }
                if (setForBottom) {
                    this.f۱۳۲۹۵h = false;
                }
            } else if (view instanceof WebView) {
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerCa(view, setForTop, setForBottom));
            } else if (view instanceof RecyclerView) {
                boolean canScroll = m۱۶۷۴۹a((RecyclerView) view);
                if (setForTop) {
                    this.f۱۳۲۹۴g = canScroll;
                }
                if (setForBottom) {
                    this.f۱۳۲۹۵h = canScroll;
                }
                if (canScroll) {
                    m۱۶۷۴۳a((ViewGroup) view, setForTop, setForBottom);
                }
            } else if (view instanceof ViewGroup) {
                View topView = m۱۶۷۵۶b((ViewGroup) view);
                m۱۶۷۴۲a(topView, setForTop, setForBottom);
                View bottomView = m۱۶۷۴۰a((ViewGroup) view);
                if (bottomView != topView) {
                    m۱۶۷۴۲a(bottomView, false, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$a  reason: invalid class name */
    public class ViewTreeObserver$OnPreDrawListenerCa implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View f۱۳۳۱۰c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۳۳۱۱d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۳۳۱۲e;

        ViewTreeObserver$OnPreDrawListenerCa(View view, boolean z, boolean z2) {
            this.f۱۳۳۱۰c = view;
            this.f۱۳۳۱۱d = z;
            this.f۱۳۳۱۲e = z2;
        }

        public boolean onPreDraw() {
            if (this.f۱۳۳۱۰c.getMeasuredHeight() == 0) {
                return true;
            }
            if (!MDRootLayout.m۱۶۷۵۸b((WebView) this.f۱۳۳۱۰c)) {
                if (this.f۱۳۳۱۱d) {
                    MDRootLayout.this.f۱۳۲۹۴g = false;
                }
                if (this.f۱۳۳۱۲e) {
                    MDRootLayout.this.f۱۳۲۹۵h = false;
                }
            } else {
                MDRootLayout.this.m۱۶۷۴۳a((MDRootLayout) ((ViewGroup) this.f۱۳۳۱۰c), (ViewGroup) this.f۱۳۳۱۱d, this.f۱۳۳۱۲e);
            }
            this.f۱۳۳۱۰c.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۷۴۳a(ViewGroup vg, boolean setForTop, boolean setForBottom) {
        if ((!setForBottom && this.f۱۳۳۰۷t == null) || (setForBottom && this.f۱۳۳۰۸u == null)) {
            if (vg instanceof RecyclerView) {
                Cb bVar = new Cb(vg, setForTop, setForBottom);
                ((RecyclerView) vg).m۱۴۲۸۸a(bVar);
                bVar.m۱۶۷۶۱a((RecyclerView) vg, 0, 0);
                return;
            }
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver$OnScrollChangedListenerCc(vg, setForTop, setForBottom);
            if (!setForBottom) {
                this.f۱۳۳۰۷t = onScrollChangedListener;
                vg.getViewTreeObserver().addOnScrollChangedListener(this.f۱۳۳۰۷t);
            } else {
                this.f۱۳۳۰۸u = onScrollChangedListener;
                vg.getViewTreeObserver().addOnScrollChangedListener(this.f۱۳۳۰۸u);
            }
            onScrollChangedListener.onScrollChanged();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$b  reason: invalid class name */
    public class Cb extends RecyclerView.AbstractCt {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ ViewGroup f۱۳۳۱۴a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۳۳۱۵b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۳۳۱۶c;

        Cb(ViewGroup viewGroup, boolean z, boolean z2) {
            this.f۱۳۳۱۴a = viewGroup;
            this.f۱۳۳۱۵b = z;
            this.f۱۳۳۱۶c = z2;
        }

        @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCt
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۷۶۱a(RecyclerView recyclerView, int dx, int dy) {
            super.m۱۴۶۵۳a(recyclerView, dx, dy);
            boolean hasButtons = false;
            MDButton[] mDButtonArr = MDRootLayout.this.f۱۳۲۹۰c;
            int length = mDButtonArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    MDButton button = mDButtonArr[i];
                    if (button != null && button.getVisibility() != 8) {
                        hasButtons = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.m۱۶۷۴۴a((MDRootLayout) this.f۱۳۳۱۴a, (ViewGroup) this.f۱۳۳۱۵b, this.f۱۳۳۱۶c, hasButtons);
            MDRootLayout.this.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$c  reason: invalid class name */
    public class ViewTreeObserver$OnScrollChangedListenerCc implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ ViewGroup f۱۳۳۱۸a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۳۳۱۹b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۳۳۲۰c;

        ViewTreeObserver$OnScrollChangedListenerCc(ViewGroup viewGroup, boolean z, boolean z2) {
            this.f۱۳۳۱۸a = viewGroup;
            this.f۱۳۳۱۹b = z;
            this.f۱۳۳۲۰c = z2;
        }

        public void onScrollChanged() {
            boolean hasButtons = false;
            MDButton[] mDButtonArr = MDRootLayout.this.f۱۳۲۹۰c;
            int length = mDButtonArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    MDButton button = mDButtonArr[i];
                    if (button != null && button.getVisibility() != 8) {
                        hasButtons = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.f۱۳۳۱۸a;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.m۱۶۷۴۵a((MDRootLayout) ((WebView) viewGroup), (WebView) this.f۱۳۳۱۹b, this.f۱۳۳۲۰c, hasButtons);
            } else {
                MDRootLayout.this.m۱۶۷۴۴a((MDRootLayout) viewGroup, (ViewGroup) this.f۱۳۳۱۹b, this.f۱۳۳۲۰c, hasButtons);
            }
            MDRootLayout.this.invalidate();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۷۴۴a(ViewGroup view, boolean setForTop, boolean setForBottom, boolean hasButtons) {
        boolean z = true;
        if (setForTop && view.getChildCount() > 0) {
            View view2 = this.f۱۳۲۹۲e;
            this.f۱۳۲۹۴g = (view2 == null || view2.getVisibility() == 8 || view.getScrollY() + view.getPaddingTop() <= view.getChildAt(0).getTop()) ? false : true;
        }
        if (setForBottom && view.getChildCount() > 0) {
            if (!hasButtons || (view.getScrollY() + view.getHeight()) - view.getPaddingBottom() >= view.getChildAt(view.getChildCount() - 1).getBottom()) {
                z = false;
            }
            this.f۱۳۲۹۵h = z;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۷۴۵a(WebView view, boolean setForTop, boolean setForBottom, boolean hasButtons) {
        boolean z = true;
        if (setForTop) {
            View view2 = this.f۱۳۲۹۲e;
            this.f۱۳۲۹۴g = (view2 == null || view2.getVisibility() == 8 || view.getScrollY() + view.getPaddingTop() <= 0) ? false : true;
        }
        if (setForBottom) {
            if (!hasButtons || ((float) ((view.getScrollY() + view.getMeasuredHeight()) - view.getPaddingBottom())) >= ((float) view.getContentHeight()) * view.getScale()) {
                z = false;
            }
            this.f۱۳۲۹۵h = z;
        }
    }
}
