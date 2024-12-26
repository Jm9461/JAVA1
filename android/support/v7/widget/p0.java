package android.support.v7.widget;

import a.b.h.a.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.view.u;
import android.support.v4.widget.n;
import android.support.v7.view.menu.t;
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

public class p0 implements t {
    private static Method H;
    private static Method I = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
    private static Method J;
    private final e A;
    private final c B;
    final Handler C;
    private final Rect D;
    private Rect E;
    private boolean F;
    PopupWindow G;

    /* renamed from: c  reason: collision with root package name */
    private Context f۲۲۱۲c;

    /* renamed from: d  reason: collision with root package name */
    private ListAdapter f۲۲۱۳d;

    /* renamed from: e  reason: collision with root package name */
    i0 f۲۲۱۴e;

    /* renamed from: f  reason: collision with root package name */
    private int f۲۲۱۵f;

    /* renamed from: g  reason: collision with root package name */
    private int f۲۲۱۶g;

    /* renamed from: h  reason: collision with root package name */
    private int f۲۲۱۷h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    int q;
    private View r;
    private int s;
    private DataSetObserver t;
    private View u;
    private Drawable v;
    private AdapterView.OnItemClickListener w;
    private AdapterView.OnItemSelectedListener x;
    final g y;
    private final f z;

    static {
        try {
            H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
        } catch (NoSuchMethodException e3) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException e4) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public p0(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public p0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f۲۲۱۵f = -2;
        this.f۲۲۱۶g = -2;
        this.j = 1002;
        this.n = 0;
        this.o = false;
        this.p = false;
        this.q = Integer.MAX_VALUE;
        this.s = 0;
        this.y = new g();
        this.z = new f();
        this.A = new e();
        this.B = new c();
        this.D = new Rect();
        this.f۲۲۱۲c = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray a2 = context.obtainStyledAttributes(attrs, j.ListPopupWindow, defStyleAttr, defStyleRes);
        this.f۲۲۱۷h = a2.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.i = a2.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.i != 0) {
            this.k = true;
        }
        a2.recycle();
        this.G = new q(context, attrs, defStyleAttr, defStyleRes);
        this.G.setInputMethodMode(1);
    }

    public void a(ListAdapter adapter) {
        DataSetObserver dataSetObserver = this.t;
        if (dataSetObserver == null) {
            this.t = new d();
        } else {
            ListAdapter listAdapter = this.f۲۲۱۳d;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f۲۲۱۳d = adapter;
        if (adapter != null) {
            adapter.registerDataSetObserver(this.t);
        }
        i0 i0Var = this.f۲۲۱۴e;
        if (i0Var != null) {
            i0Var.setAdapter(this.f۲۲۱۳d);
        }
    }

    public void f(int position) {
        this.s = position;
    }

    public void a(boolean modal) {
        this.F = modal;
        this.G.setFocusable(modal);
    }

    public boolean k() {
        return this.F;
    }

    public Drawable c() {
        return this.G.getBackground();
    }

    public void a(Drawable d2) {
        this.G.setBackgroundDrawable(d2);
    }

    public void a(int animationStyle) {
        this.G.setAnimationStyle(animationStyle);
    }

    public View b() {
        return this.u;
    }

    public void a(View anchor) {
        this.u = anchor;
    }

    public int g() {
        return this.f۲۲۱۷h;
    }

    public void d(int offset) {
        this.f۲۲۱۷h = offset;
    }

    public int h() {
        if (!this.k) {
            return 0;
        }
        return this.i;
    }

    public void h(int offset) {
        this.i = offset;
        this.k = true;
    }

    public void a(Rect bounds) {
        this.E = bounds;
    }

    public void c(int gravity) {
        this.n = gravity;
    }

    public int i() {
        return this.f۲۲۱۶g;
    }

    public void i(int width) {
        this.f۲۲۱۶g = width;
    }

    public void b(int width) {
        Drawable popupBackground = this.G.getBackground();
        if (popupBackground != null) {
            popupBackground.getPadding(this.D);
            Rect rect = this.D;
            this.f۲۲۱۶g = rect.left + rect.right + width;
            return;
        }
        i(width);
    }

    public void a(AdapterView.OnItemClickListener clickListener) {
        this.w = clickListener;
    }

    @Override // android.support.v7.view.menu.t
    public void d() {
        int widthSpec;
        int heightSpec;
        int widthSpec2;
        int heightSpec2;
        int height = l();
        boolean noInputMethod = j();
        n.a(this.G, this.j);
        boolean z2 = true;
        if (!this.G.isShowing()) {
            int widthSpec3 = this.f۲۲۱۶g;
            if (widthSpec3 == -1) {
                widthSpec = -1;
            } else if (widthSpec3 == -2) {
                widthSpec = b().getWidth();
            } else {
                widthSpec = this.f۲۲۱۶g;
            }
            int i2 = this.f۲۲۱۵f;
            if (i2 == -1) {
                heightSpec = -1;
            } else if (i2 == -2) {
                heightSpec = height;
            } else {
                heightSpec = this.f۲۲۱۵f;
            }
            this.G.setWidth(widthSpec);
            this.G.setHeight(heightSpec);
            c(true);
            this.G.setOutsideTouchable(!this.p && !this.o);
            this.G.setTouchInterceptor(this.z);
            if (this.m) {
                n.a(this.G, this.l);
            }
            Method method = J;
            if (method != null) {
                try {
                    method.invoke(this.G, this.E);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
            n.a(this.G, b(), this.f۲۲۱۷h, this.i, this.n);
            this.f۲۲۱۴e.setSelection(-1);
            if (!this.F || this.f۲۲۱۴e.isInTouchMode()) {
                a();
            }
            if (!this.F) {
                this.C.post(this.B);
            }
        } else if (u.x(b())) {
            int widthSpec4 = this.f۲۲۱۶g;
            if (widthSpec4 == -1) {
                widthSpec2 = -1;
            } else if (widthSpec4 == -2) {
                widthSpec2 = b().getWidth();
            } else {
                widthSpec2 = this.f۲۲۱۶g;
            }
            int i3 = this.f۲۲۱۵f;
            if (i3 == -1) {
                heightSpec2 = noInputMethod ? height : -1;
                if (noInputMethod) {
                    this.G.setWidth(this.f۲۲۱۶g == -1 ? -1 : 0);
                    this.G.setHeight(0);
                } else {
                    this.G.setWidth(this.f۲۲۱۶g == -1 ? -1 : 0);
                    this.G.setHeight(-1);
                }
            } else {
                heightSpec2 = i3 == -2 ? height : this.f۲۲۱۵f;
            }
            PopupWindow popupWindow = this.G;
            if (this.p || this.o) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.G.update(b(), this.f۲۲۱۷h, this.i, widthSpec2 < 0 ? -1 : widthSpec2, heightSpec2 < 0 ? -1 : heightSpec2);
        }
    }

    @Override // android.support.v7.view.menu.t
    public void dismiss() {
        this.G.dismiss();
        m();
        this.G.setContentView(null);
        this.f۲۲۱۴e = null;
        this.C.removeCallbacks(this.y);
    }

    public void a(PopupWindow.OnDismissListener listener) {
        this.G.setOnDismissListener(listener);
    }

    private void m() {
        View view = this.r;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.r);
            }
        }
    }

    public void e(int mode) {
        this.G.setInputMethodMode(mode);
    }

    public void g(int position) {
        i0 list = this.f۲۲۱۴e;
        if (e() && list != null) {
            list.setListSelectionHidden(false);
            list.setSelection(position);
            if (list.getChoiceMode() != 0) {
                list.setItemChecked(position, true);
            }
        }
    }

    public void a() {
        i0 list = this.f۲۲۱۴e;
        if (list != null) {
            list.setListSelectionHidden(true);
            list.requestLayout();
        }
    }

    @Override // android.support.v7.view.menu.t
    public boolean e() {
        return this.G.isShowing();
    }

    public boolean j() {
        return this.G.getInputMethodMode() == 2;
    }

    @Override // android.support.v7.view.menu.t
    public ListView f() {
        return this.f۲۲۱۴e;
    }

    /* access modifiers changed from: package-private */
    public i0 a(Context context, boolean hijackFocus) {
        return new i0(context, hijackFocus);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v18, resolved type: android.widget.LinearLayout */
    /* JADX WARN: Multi-variable type inference failed */
    private int l() {
        int padding;
        int childWidthSpec;
        int widthSize;
        int widthMode;
        int otherHeights = 0;
        boolean ignoreBottomDecorations = false;
        if (this.f۲۲۱۴e == null) {
            Context context = this.f۲۲۱۲c;
            new a();
            this.f۲۲۱۴e = a(context, !this.F);
            Drawable drawable = this.v;
            if (drawable != null) {
                this.f۲۲۱۴e.setSelector(drawable);
            }
            this.f۲۲۱۴e.setAdapter(this.f۲۲۱۳d);
            this.f۲۲۱۴e.setOnItemClickListener(this.w);
            this.f۲۲۱۴e.setFocusable(true);
            this.f۲۲۱۴e.setFocusableInTouchMode(true);
            this.f۲۲۱۴e.setOnItemSelectedListener(new b());
            this.f۲۲۱۴e.setOnScrollListener(this.A);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.x;
            if (onItemSelectedListener != null) {
                this.f۲۲۱۴e.setOnItemSelectedListener(onItemSelectedListener);
            }
            ViewGroup dropDownView = this.f۲۲۱۴e;
            View hintView = this.r;
            if (hintView != null) {
                LinearLayout hintContainer = new LinearLayout(context);
                hintContainer.setOrientation(1);
                LinearLayout.LayoutParams hintParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i2 = this.s;
                if (i2 == 0) {
                    hintContainer.addView(hintView);
                    hintContainer.addView(dropDownView, hintParams);
                } else if (i2 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.s);
                } else {
                    hintContainer.addView(dropDownView, hintParams);
                    hintContainer.addView(hintView);
                }
                if (this.f۲۲۱۶g >= 0) {
                    widthMode = Integer.MIN_VALUE;
                    widthSize = this.f۲۲۱۶g;
                } else {
                    widthMode = 0;
                    widthSize = 0;
                }
                hintView.measure(View.MeasureSpec.makeMeasureSpec(widthSize, widthMode), 0);
                LinearLayout.LayoutParams hintParams2 = (LinearLayout.LayoutParams) hintView.getLayoutParams();
                dropDownView = hintContainer;
                otherHeights = hintView.getMeasuredHeight() + hintParams2.topMargin + hintParams2.bottomMargin;
            }
            this.G.setContentView(dropDownView);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.G.getContentView();
            View view = this.r;
            if (view != null) {
                LinearLayout.LayoutParams hintParams3 = (LinearLayout.LayoutParams) view.getLayoutParams();
                otherHeights = view.getMeasuredHeight() + hintParams3.topMargin + hintParams3.bottomMargin;
            }
        }
        Drawable background = this.G.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            Rect rect = this.D;
            int i3 = rect.top;
            padding = rect.bottom + i3;
            if (!this.k) {
                this.i = -i3;
            }
        } else {
            this.D.setEmpty();
            padding = 0;
        }
        if (this.G.getInputMethodMode() == 2) {
            ignoreBottomDecorations = true;
        }
        int maxHeight = a(b(), this.i, ignoreBottomDecorations);
        if (this.o || this.f۲۲۱۵f == -1) {
            return maxHeight + padding;
        }
        int i4 = this.f۲۲۱۶g;
        if (i4 == -2) {
            int i5 = this.f۲۲۱۲c.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.D;
            childWidthSpec = View.MeasureSpec.makeMeasureSpec(i5 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i4 != -1) {
            childWidthSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else {
            int i6 = this.f۲۲۱۲c.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.D;
            childWidthSpec = View.MeasureSpec.makeMeasureSpec(i6 - (rect3.left + rect3.right), 1073741824);
        }
        int listContent = this.f۲۲۱۴e.a(childWidthSpec, 0, -1, maxHeight - otherHeights, -1);
        if (listContent > 0) {
            otherHeights += padding + this.f۲۲۱۴e.getPaddingTop() + this.f۲۲۱۴e.getPaddingBottom();
        }
        return listContent + otherHeights;
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        public void run() {
            View view = p0.this.b();
            if (view != null && view.getWindowToken() != null) {
                p0.this.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
            i0 dropDownList;
            if (position != -1 && (dropDownList = p0.this.f۲۲۱۴e) != null) {
                dropDownList.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public void b(boolean overlapAnchor) {
        this.m = true;
        this.l = overlapAnchor;
    }

    /* access modifiers changed from: private */
    public class d extends DataSetObserver {
        d() {
        }

        public void onChanged() {
            if (p0.this.e()) {
                p0.this.d();
            }
        }

        public void onInvalidated() {
            p0.this.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public class c implements Runnable {
        c() {
        }

        public void run() {
            p0.this.a();
        }
    }

    /* access modifiers changed from: private */
    public class g implements Runnable {
        g() {
        }

        public void run() {
            i0 i0Var = p0.this.f۲۲۱۴e;
            if (i0Var != null && u.x(i0Var) && p0.this.f۲۲۱۴e.getCount() > p0.this.f۲۲۱۴e.getChildCount()) {
                int childCount = p0.this.f۲۲۱۴e.getChildCount();
                p0 p0Var = p0.this;
                if (childCount <= p0Var.q) {
                    p0Var.G.setInputMethodMode(2);
                    p0.this.d();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public class f implements View.OnTouchListener {
        f() {
        }

        public boolean onTouch(View v, MotionEvent event) {
            PopupWindow popupWindow;
            int action = event.getAction();
            int x = (int) event.getX();
            int y = (int) event.getY();
            if (action == 0 && (popupWindow = p0.this.G) != null && popupWindow.isShowing() && x >= 0 && x < p0.this.G.getWidth() && y >= 0 && y < p0.this.G.getHeight()) {
                p0 p0Var = p0.this;
                p0Var.C.postDelayed(p0Var.y, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                p0 p0Var2 = p0.this;
                p0Var2.C.removeCallbacks(p0Var2.y);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        }

        public void onScrollStateChanged(AbsListView view, int scrollState) {
            if (scrollState == 1 && !p0.this.j() && p0.this.G.getContentView() != null) {
                p0 p0Var = p0.this;
                p0Var.C.removeCallbacks(p0Var.y);
                p0.this.y.run();
            }
        }
    }

    private void c(boolean clip) {
        Method method = H;
        if (method != null) {
            try {
                method.invoke(this.G, Boolean.valueOf(clip));
            } catch (Exception e2) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int a(View anchor, int yOffset, boolean ignoreBottomDecorations) {
        Method method = I;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.G, anchor, Integer.valueOf(yOffset), Boolean.valueOf(ignoreBottomDecorations))).intValue();
            } catch (Exception e2) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.G.getMaxAvailableHeight(anchor, yOffset);
    }
}
