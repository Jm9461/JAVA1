package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.view.Cu;
import android.support.v4.widget.Cn;
import android.support.v7.view.menu.InterfaceCt;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;

/* renamed from: android.support.v7.widget.p0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cp0 implements InterfaceCt {

    /* renamed from: H, reason: contains not printable characters */
    private static Method f۱۲۲۶۵H;

    /* renamed from: I, reason: contains not printable characters */
    private static Method f۱۲۲۶۶I;

    /* renamed from: J, reason: contains not printable characters */
    private static Method f۱۲۲۶۷J;

    /* renamed from: A, reason: contains not printable characters */
    private final e f۱۲۲۶۸A;

    /* renamed from: B, reason: contains not printable characters */
    private final c f۱۲۲۶۹B;

    /* renamed from: C, reason: contains not printable characters */
    final Handler f۱۲۲۷۰C;

    /* renamed from: D, reason: contains not printable characters */
    private final Rect f۱۲۲۷۱D;

    /* renamed from: E, reason: contains not printable characters */
    private Rect f۱۲۲۷۲E;

    /* renamed from: F, reason: contains not printable characters */
    private boolean f۱۲۲۷۳F;

    /* renamed from: G, reason: contains not printable characters */
    PopupWindow f۱۲۲۷۴G;

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۲۲۷۵c;

    /* renamed from: d, reason: contains not printable characters */
    private ListAdapter f۱۲۲۷۶d;

    /* renamed from: e, reason: contains not printable characters */
    Ci0 f۱۲۲۷۷e;

    /* renamed from: f, reason: contains not printable characters */
    private int f۱۲۲۷۸f;

    /* renamed from: g, reason: contains not printable characters */
    private int f۱۲۲۷۹g;

    /* renamed from: h, reason: contains not printable characters */
    private int f۱۲۲۸۰h;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۲۲۸۱i;

    /* renamed from: j, reason: contains not printable characters */
    private int f۱۲۲۸۲j;

    /* renamed from: k, reason: contains not printable characters */
    private boolean f۱۲۲۸۳k;

    /* renamed from: l, reason: contains not printable characters */
    private boolean f۱۲۲۸۴l;

    /* renamed from: m, reason: contains not printable characters */
    private boolean f۱۲۲۸۵m;

    /* renamed from: n, reason: contains not printable characters */
    private int f۱۲۲۸۶n;

    /* renamed from: o, reason: contains not printable characters */
    private boolean f۱۲۲۸۷o;

    /* renamed from: p, reason: contains not printable characters */
    private boolean f۱۲۲۸۸p;

    /* renamed from: q, reason: contains not printable characters */
    int f۱۲۲۸۹q;

    /* renamed from: r, reason: contains not printable characters */
    private View f۱۲۲۹۰r;

    /* renamed from: s, reason: contains not printable characters */
    private int f۱۲۲۹۱s;

    /* renamed from: t, reason: contains not printable characters */
    private DataSetObserver f۱۲۲۹۲t;

    /* renamed from: u, reason: contains not printable characters */
    private View f۱۲۲۹۳u;

    /* renamed from: v, reason: contains not printable characters */
    private Drawable f۱۲۲۹۴v;

    /* renamed from: w, reason: contains not printable characters */
    private AdapterView.OnItemClickListener f۱۲۲۹۵w;

    /* renamed from: x, reason: contains not printable characters */
    private AdapterView.OnItemSelectedListener f۱۲۲۹۶x;

    /* renamed from: y, reason: contains not printable characters */
    final g f۱۲۲۹۷y;

    /* renamed from: z, reason: contains not printable characters */
    private final f f۱۲۲۹۸z;

    static {
        try {
            f۱۲۲۶۵H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f۱۲۲۶۶I = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException e3) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f۱۲۲۶۷J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException e4) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public Cp0(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public Cp0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f۱۲۲۷۸f = -2;
        this.f۱۲۲۷۹g = -2;
        this.f۱۲۲۸۲j = 1002;
        this.f۱۲۲۸۶n = 0;
        this.f۱۲۲۸۷o = false;
        this.f۱۲۲۸۸p = false;
        this.f۱۲۲۸۹q = Integer.MAX_VALUE;
        this.f۱۲۲۹۱s = 0;
        this.f۱۲۲۹۷y = new g();
        this.f۱۲۲۹۸z = new f();
        this.f۱۲۲۶۸A = new e();
        this.f۱۲۲۶۹B = new c();
        this.f۱۲۲۷۱D = new Rect();
        this.f۱۲۲۷۵c = context;
        this.f۱۲۲۷۰C = new Handler(context.getMainLooper());
        TypedArray a2 = context.obtainStyledAttributes(attrs, Cj.ListPopupWindow, defStyleAttr, defStyleRes);
        this.f۱۲۲۸۰h = a2.getDimensionPixelOffset(Cj.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f۱۲۲۸۱i = a2.getDimensionPixelOffset(Cj.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f۱۲۲۸۱i != 0) {
            this.f۱۲۲۸۳k = true;
        }
        a2.recycle();
        this.f۱۲۲۷۴G = new Cq(context, attrs, defStyleAttr, defStyleRes);
        this.f۱۲۲۷۴G.setInputMethodMode(1);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۵۷۲a(ListAdapter adapter) {
        DataSetObserver dataSetObserver = this.f۱۲۲۹۲t;
        if (dataSetObserver == null) {
            this.f۱۲۲۹۲t = new d();
        } else {
            ListAdapter listAdapter = this.f۱۲۲۷۶d;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f۱۲۲۷۶d = adapter;
        if (adapter != null) {
            adapter.registerDataSetObserver(this.f۱۲۲۹۲t);
        }
        Ci0 ci0 = this.f۱۲۲۷۷e;
        if (ci0 != null) {
            ci0.setAdapter(this.f۱۲۲۷۶d);
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    public void m۱۳۴۳۵f(int position) {
        this.f۱۲۲۹۱s = position;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۴۲۴a(boolean modal) {
        this.f۱۲۲۷۳F = modal;
        this.f۱۲۲۷۴G.setFocusable(modal);
    }

    /* renamed from: k, reason: contains not printable characters */
    public boolean m۱۳۴۴۳k() {
        return this.f۱۲۲۷۳F;
    }

    /* renamed from: c, reason: contains not printable characters */
    public Drawable m۱۳۴۲۸c() {
        return this.f۱۲۲۷۴G.getBackground();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۴۱۹a(Drawable d2) {
        this.f۱۲۲۷۴G.setBackgroundDrawable(d2);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۴۱۷a(int animationStyle) {
        this.f۱۲۲۷۴G.setAnimationStyle(animationStyle);
    }

    /* renamed from: b, reason: contains not printable characters */
    public View m۱۳۴۲۵b() {
        return this.f۱۲۲۹۳u;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۴۲۰a(View anchor) {
        this.f۱۲۲۹۳u = anchor;
    }

    /* renamed from: g, reason: contains not printable characters */
    public int m۱۳۴۳۶g() {
        return this.f۱۲۲۸۰h;
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۳۴۳۱d(int offset) {
        this.f۱۲۲۸۰h = offset;
    }

    /* renamed from: h, reason: contains not printable characters */
    public int m۱۳۴۳۸h() {
        if (!this.f۱۲۲۸۳k) {
            return 0;
        }
        return this.f۱۲۲۸۱i;
    }

    /* renamed from: h, reason: contains not printable characters */
    public void m۱۳۴۳۹h(int offset) {
        this.f۱۲۲۸۱i = offset;
        this.f۱۲۲۸۳k = true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۴۱۸a(Rect bounds) {
        this.f۱۲۲۷۲E = bounds;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۳۴۲۹c(int gravity) {
        this.f۱۲۲۸۶n = gravity;
    }

    /* renamed from: i, reason: contains not printable characters */
    public int m۱۳۴۴۰i() {
        return this.f۱۲۲۷۹g;
    }

    /* renamed from: i, reason: contains not printable characters */
    public void m۱۳۴۴۱i(int width) {
        this.f۱۲۲۷۹g = width;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۳۴۲۶b(int width) {
        Drawable popupBackground = this.f۱۲۲۷۴G.getBackground();
        if (popupBackground != null) {
            popupBackground.getPadding(this.f۱۲۲۷۱D);
            Rect rect = this.f۱۲۲۷۱D;
            this.f۱۲۲۷۹g = rect.left + rect.right + width;
            return;
        }
        m۱۳۴۴۱i(width);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۴۲۱a(AdapterView.OnItemClickListener clickListener) {
        this.f۱۲۲۹۵w = clickListener;
    }

    @Override // android.support.v7.view.menu.InterfaceCt
    /* renamed from: d, reason: contains not printable characters */
    public void mo۱۳۵۷۵d() {
        int widthSpec;
        int heightSpec;
        int widthSpec2;
        int heightSpec2;
        int height = m۱۳۴۱۳l();
        boolean noInputMethod = m۱۳۴۴۲j();
        Cn.m۱۱۲۲۳a(this.f۱۲۲۷۴G, this.f۱۲۲۸۲j);
        if (this.f۱۲۲۷۴G.isShowing()) {
            if (!Cu.m۱۰۹۵۷x(m۱۳۴۲۵b())) {
                return;
            }
            int widthSpec3 = this.f۱۲۲۷۹g;
            if (widthSpec3 == -1) {
                widthSpec2 = -1;
            } else if (widthSpec3 == -2) {
                widthSpec2 = m۱۳۴۲۵b().getWidth();
            } else {
                widthSpec2 = this.f۱۲۲۷۹g;
            }
            int i = this.f۱۲۲۷۸f;
            if (i == -1) {
                heightSpec2 = noInputMethod ? height : -1;
                if (noInputMethod) {
                    this.f۱۲۲۷۴G.setWidth(this.f۱۲۲۷۹g == -1 ? -1 : 0);
                    this.f۱۲۲۷۴G.setHeight(0);
                } else {
                    this.f۱۲۲۷۴G.setWidth(this.f۱۲۲۷۹g == -1 ? -1 : 0);
                    this.f۱۲۲۷۴G.setHeight(-1);
                }
            } else {
                heightSpec2 = i == -2 ? height : this.f۱۲۲۷۸f;
            }
            this.f۱۲۲۷۴G.setOutsideTouchable((this.f۱۲۲۸۸p || this.f۱۲۲۸۷o) ? false : true);
            this.f۱۲۲۷۴G.update(m۱۳۴۲۵b(), this.f۱۲۲۸۰h, this.f۱۲۲۸۱i, widthSpec2 < 0 ? -1 : widthSpec2, heightSpec2 < 0 ? -1 : heightSpec2);
            return;
        }
        int widthSpec4 = this.f۱۲۲۷۹g;
        if (widthSpec4 == -1) {
            widthSpec = -1;
        } else if (widthSpec4 == -2) {
            widthSpec = m۱۳۴۲۵b().getWidth();
        } else {
            widthSpec = this.f۱۲۲۷۹g;
        }
        int i2 = this.f۱۲۲۷۸f;
        if (i2 == -1) {
            heightSpec = -1;
        } else if (i2 == -2) {
            heightSpec = height;
        } else {
            heightSpec = this.f۱۲۲۷۸f;
        }
        this.f۱۲۲۷۴G.setWidth(widthSpec);
        this.f۱۲۲۷۴G.setHeight(heightSpec);
        m۱۳۴۱۲c(true);
        this.f۱۲۲۷۴G.setOutsideTouchable((this.f۱۲۲۸۸p || this.f۱۲۲۸۷o) ? false : true);
        this.f۱۲۲۷۴G.setTouchInterceptor(this.f۱۲۲۹۸z);
        if (this.f۱۲۲۸۵m) {
            Cn.m۱۱۲۲۵a(this.f۱۲۲۷۴G, this.f۱۲۲۸۴l);
        }
        Method method = f۱۲۲۶۷J;
        if (method != null) {
            try {
                method.invoke(this.f۱۲۲۷۴G, this.f۱۲۲۷۲E);
            } catch (Exception e2) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
            }
        }
        Cn.m۱۱۲۲۴a(this.f۱۲۲۷۴G, m۱۳۴۲۵b(), this.f۱۲۲۸۰h, this.f۱۲۲۸۱i, this.f۱۲۲۸۶n);
        this.f۱۲۲۷۷e.setSelection(-1);
        if (!this.f۱۲۲۷۳F || this.f۱۲۲۷۷e.isInTouchMode()) {
            m۱۳۴۱۶a();
        }
        if (!this.f۱۲۲۷۳F) {
            this.f۱۲۲۷۰C.post(this.f۱۲۲۶۹B);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceCt
    public void dismiss() {
        this.f۱۲۲۷۴G.dismiss();
        m۱۳۴۱۴m();
        this.f۱۲۲۷۴G.setContentView(null);
        this.f۱۲۲۷۷e = null;
        this.f۱۲۲۷۰C.removeCallbacks(this.f۱۲۲۹۷y);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۴۲۳a(PopupWindow.OnDismissListener listener) {
        this.f۱۲۲۷۴G.setOnDismissListener(listener);
    }

    /* renamed from: m, reason: contains not printable characters */
    private void m۱۳۴۱۴m() {
        View view = this.f۱۲۲۹۰r;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup group = (ViewGroup) parent;
                group.removeView(this.f۱۲۲۹۰r);
            }
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    public void m۱۳۴۳۲e(int mode) {
        this.f۱۲۲۷۴G.setInputMethodMode(mode);
    }

    /* renamed from: g, reason: contains not printable characters */
    public void m۱۳۴۳۷g(int position) {
        Ci0 list = this.f۱۲۲۷۷e;
        if (mo۱۳۴۳۳e() && list != null) {
            list.setListSelectionHidden(false);
            list.setSelection(position);
            if (list.getChoiceMode() != 0) {
                list.setItemChecked(position, true);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۴۱۶a() {
        Ci0 list = this.f۱۲۲۷۷e;
        if (list != null) {
            list.setListSelectionHidden(true);
            list.requestLayout();
        }
    }

    @Override // android.support.v7.view.menu.InterfaceCt
    /* renamed from: e, reason: contains not printable characters */
    public boolean mo۱۳۴۳۳e() {
        return this.f۱۲۲۷۴G.isShowing();
    }

    /* renamed from: j, reason: contains not printable characters */
    public boolean m۱۳۴۴۲j() {
        return this.f۱۲۲۷۴G.getInputMethodMode() == 2;
    }

    @Override // android.support.v7.view.menu.InterfaceCt
    /* renamed from: f, reason: contains not printable characters */
    public ListView mo۱۳۴۳۴f() {
        return this.f۱۲۲۷۷e;
    }

    /* renamed from: a, reason: contains not printable characters */
    Ci0 mo۱۳۴۸۹a(Context context, boolean hijackFocus) {
        return new Ci0(context, hijackFocus);
    }

    /* renamed from: l, reason: contains not printable characters */
    private int m۱۳۴۱۳l() {
        int padding;
        int childWidthSpec;
        int widthMode;
        int widthSize;
        int otherHeights = 0;
        if (this.f۱۲۲۷۷e == null) {
            Context context = this.f۱۲۲۷۵c;
            new a();
            this.f۱۲۲۷۷e = mo۱۳۴۸۹a(context, !this.f۱۲۲۷۳F);
            Drawable drawable = this.f۱۲۲۹۴v;
            if (drawable != null) {
                this.f۱۲۲۷۷e.setSelector(drawable);
            }
            this.f۱۲۲۷۷e.setAdapter(this.f۱۲۲۷۶d);
            this.f۱۲۲۷۷e.setOnItemClickListener(this.f۱۲۲۹۵w);
            this.f۱۲۲۷۷e.setFocusable(true);
            this.f۱۲۲۷۷e.setFocusableInTouchMode(true);
            this.f۱۲۲۷۷e.setOnItemSelectedListener(new b());
            this.f۱۲۲۷۷e.setOnScrollListener(this.f۱۲۲۶۸A);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f۱۲۲۹۶x;
            if (onItemSelectedListener != null) {
                this.f۱۲۲۷۷e.setOnItemSelectedListener(onItemSelectedListener);
            }
            ViewGroup dropDownView = this.f۱۲۲۷۷e;
            View hintView = this.f۱۲۲۹۰r;
            if (hintView != null) {
                LinearLayout hintContainer = new LinearLayout(context);
                hintContainer.setOrientation(1);
                LinearLayout.LayoutParams hintParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i = this.f۱۲۲۹۱s;
                if (i == 0) {
                    hintContainer.addView(hintView);
                    hintContainer.addView(dropDownView, hintParams);
                } else if (i == 1) {
                    hintContainer.addView(dropDownView, hintParams);
                    hintContainer.addView(hintView);
                } else {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f۱۲۲۹۱s);
                }
                if (this.f۱۲۲۷۹g >= 0) {
                    widthMode = Integer.MIN_VALUE;
                    widthSize = this.f۱۲۲۷۹g;
                } else {
                    widthMode = 0;
                    widthSize = 0;
                }
                int widthSpec = View.MeasureSpec.makeMeasureSpec(widthSize, widthMode);
                hintView.measure(widthSpec, 0);
                LinearLayout.LayoutParams hintParams2 = (LinearLayout.LayoutParams) hintView.getLayoutParams();
                dropDownView = hintContainer;
                otherHeights = hintView.getMeasuredHeight() + hintParams2.topMargin + hintParams2.bottomMargin;
            }
            this.f۱۲۲۷۴G.setContentView(dropDownView);
        } else {
            View view = this.f۱۲۲۹۰r;
            if (view != null) {
                LinearLayout.LayoutParams hintParams3 = (LinearLayout.LayoutParams) view.getLayoutParams();
                otherHeights = view.getMeasuredHeight() + hintParams3.topMargin + hintParams3.bottomMargin;
            }
        }
        Drawable background = this.f۱۲۲۷۴G.getBackground();
        if (background != null) {
            background.getPadding(this.f۱۲۲۷۱D);
            Rect rect = this.f۱۲۲۷۱D;
            int i2 = rect.top;
            padding = rect.bottom + i2;
            if (!this.f۱۲۲۸۳k) {
                this.f۱۲۲۸۱i = -i2;
            }
        } else {
            this.f۱۲۲۷۱D.setEmpty();
            padding = 0;
        }
        boolean ignoreBottomDecorations = this.f۱۲۲۷۴G.getInputMethodMode() == 2;
        int maxHeight = m۱۳۴۱۱a(m۱۳۴۲۵b(), this.f۱۲۲۸۱i, ignoreBottomDecorations);
        if (this.f۱۲۲۸۷o || this.f۱۲۲۷۸f == -1) {
            int childWidthSpec2 = maxHeight + padding;
            return childWidthSpec2;
        }
        int i3 = this.f۱۲۲۷۹g;
        if (i3 == -2) {
            int i4 = this.f۱۲۲۷۵c.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f۱۲۲۷۱D;
            childWidthSpec = View.MeasureSpec.makeMeasureSpec(i4 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i3 == -1) {
            int i5 = this.f۱۲۲۷۵c.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f۱۲۲۷۱D;
            childWidthSpec = View.MeasureSpec.makeMeasureSpec(i5 - (rect3.left + rect3.right), 1073741824);
        } else {
            childWidthSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        int listContent = this.f۱۲۲۷۷e.m۱۳۲۰۶a(childWidthSpec, 0, -1, maxHeight - otherHeights, -1);
        if (listContent > 0) {
            int listPadding = this.f۱۲۲۷۷e.getPaddingTop() + this.f۱۲۲۷۷e.getPaddingBottom();
            otherHeights += padding + listPadding;
        }
        int listPadding2 = listContent + otherHeights;
        return listPadding2;
    }

    /* renamed from: android.support.v7.widget.p0$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = Cp0.this.m۱۳۴۲۵b();
            if (view != null && view.getWindowToken() != null) {
                Cp0.this.mo۱۳۵۷۵d();
            }
        }
    }

    /* renamed from: android.support.v7.widget.p0$b */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Ci0 dropDownList;
            if (position != -1 && (dropDownList = Cp0.this.f۱۲۲۷۷e) != null) {
                dropDownList.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> parent) {
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۳۴۲۷b(boolean overlapAnchor) {
        this.f۱۲۲۸۵m = true;
        this.f۱۲۲۸۴l = overlapAnchor;
    }

    /* renamed from: android.support.v7.widget.p0$d */
    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (Cp0.this.mo۱۳۴۳۳e()) {
                Cp0.this.mo۱۳۵۷۵d();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            Cp0.this.dismiss();
        }
    }

    /* renamed from: android.support.v7.widget.p0$c */
    private class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Cp0.this.m۱۳۴۱۶a();
        }
    }

    /* renamed from: android.support.v7.widget.p0$g */
    private class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Ci0 ci0 = Cp0.this.f۱۲۲۷۷e;
            if (ci0 != null && Cu.m۱۰۹۵۷x(ci0) && Cp0.this.f۱۲۲۷۷e.getCount() > Cp0.this.f۱۲۲۷۷e.getChildCount()) {
                int childCount = Cp0.this.f۱۲۲۷۷e.getChildCount();
                Cp0 cp0 = Cp0.this;
                if (childCount <= cp0.f۱۲۲۸۹q) {
                    cp0.f۱۲۲۷۴G.setInputMethodMode(2);
                    Cp0.this.mo۱۳۵۷۵d();
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.p0$f */
    private class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v, MotionEvent event) {
            PopupWindow popupWindow;
            int action = event.getAction();
            int x = (int) event.getX();
            int y = (int) event.getY();
            if (action == 0 && (popupWindow = Cp0.this.f۱۲۲۷۴G) != null && popupWindow.isShowing() && x >= 0 && x < Cp0.this.f۱۲۲۷۴G.getWidth() && y >= 0 && y < Cp0.this.f۱۲۲۷۴G.getHeight()) {
                Cp0 cp0 = Cp0.this;
                cp0.f۱۲۲۷۰C.postDelayed(cp0.f۱۲۲۹۷y, 250L);
                return false;
            }
            if (action == 1) {
                Cp0 cp02 = Cp0.this;
                cp02.f۱۲۲۷۰C.removeCallbacks(cp02.f۱۲۲۹۷y);
                return false;
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.p0$e */
    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView view, int scrollState) {
            if (scrollState == 1 && !Cp0.this.m۱۳۴۴۲j() && Cp0.this.f۱۲۲۷۴G.getContentView() != null) {
                Cp0 cp0 = Cp0.this;
                cp0.f۱۲۲۷۰C.removeCallbacks(cp0.f۱۲۲۹۷y);
                Cp0.this.f۱۲۲۹۷y.run();
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۳۴۱۲c(boolean clip) {
        Method method = f۱۲۲۶۵H;
        if (method != null) {
            try {
                method.invoke(this.f۱۲۲۷۴G, Boolean.valueOf(clip));
            } catch (Exception e2) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private int m۱۳۴۱۱a(View anchor, int yOffset, boolean ignoreBottomDecorations) {
        Method method = f۱۲۲۶۶I;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f۱۲۲۷۴G, anchor, Integer.valueOf(yOffset), Boolean.valueOf(ignoreBottomDecorations))).intValue();
            } catch (Exception e2) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f۱۲۲۷۴G.getMaxAvailableHeight(anchor, yOffset);
    }
}
