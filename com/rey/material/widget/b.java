package com.rey.material.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.v4.widget.n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class b {
    private static Method D;
    private Handler A = new Handler();
    private Rect B = new Rect();
    private boolean C;

    /* renamed from: a  reason: collision with root package name */
    private Context f۳۴۴۵a;

    /* renamed from: b  reason: collision with root package name */
    private d f۳۴۴۶b;

    /* renamed from: c  reason: collision with root package name */
    private ListAdapter f۳۴۴۷c;

    /* renamed from: d  reason: collision with root package name */
    private d f۳۴۴۸d;

    /* renamed from: e  reason: collision with root package name */
    private int f۳۴۴۹e = -2;

    /* renamed from: f  reason: collision with root package name */
    private int f۳۴۵۰f = -2;

    /* renamed from: g  reason: collision with root package name */
    private int f۳۴۵۱g;

    /* renamed from: h  reason: collision with root package name */
    private int f۳۴۵۲h;
    private boolean i;
    private int j;
    private int k;
    private int l = 0;
    private boolean m = false;
    private boolean n = false;
    int o = Integer.MAX_VALUE;
    private View p;
    private int q = 0;
    private DataSetObserver r;
    private View s;
    private Drawable t;
    private AdapterView.OnItemClickListener u;
    private AdapterView.OnItemSelectedListener v;
    private final i w = new i(this, null);
    private final h x = new h(this, null);
    private final g y = new g(this, null);
    private final e z = new e(this, null);

    static {
        try {
            D = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }

    public b(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f۳۴۴۵a = context;
        TypedArray a2 = context.obtainStyledAttributes(attrs, b.j.a.c.ListPopupWindow, defStyleAttr, defStyleRes);
        this.f۳۴۵۱g = a2.getDimensionPixelOffset(b.j.a.c.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f۳۴۵۲h = a2.getDimensionPixelOffset(b.j.a.c.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f۳۴۵۲h != 0) {
            this.i = true;
        }
        a2.recycle();
        this.f۳۴۴۶b = new d(context, attrs, defStyleAttr);
        this.f۳۴۴۶b.setInputMethodMode(1);
        a.b.g.f.e.b(this.f۳۴۴۵a.getResources().getConfiguration().locale);
    }

    public void d(int id) {
        this.j = id;
    }

    public void e(int offset) {
        this.k = offset;
    }

    public void a(Drawable background) {
        this.f۳۴۴۶b.setBackgroundDrawable(background);
    }

    public Drawable d() {
        return this.f۳۴۴۶b.getBackground();
    }

    public void a(ListAdapter adapter) {
        DataSetObserver dataSetObserver = this.r;
        if (dataSetObserver == null) {
            this.r = new f(this, null);
        } else {
            ListAdapter listAdapter = this.f۳۴۴۷c;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f۳۴۴۷c = adapter;
        if (this.f۳۴۴۷c != null) {
            adapter.registerDataSetObserver(this.r);
        }
        d dVar = this.f۳۴۴۸d;
        if (dVar != null) {
            dVar.setAdapter(this.f۳۴۴۷c);
        }
    }

    public void f(int position) {
        this.q = position;
    }

    public void a(boolean modal) {
        this.C = modal;
        this.f۳۴۴۶b.setFocusable(modal);
    }

    public View c() {
        return this.s;
    }

    public void a(View anchor) {
        this.s = anchor;
    }

    public int e() {
        return this.f۳۴۵۱g;
    }

    public void b(int offset) {
        this.f۳۴۵۱g = offset;
    }

    public int g() {
        if (!this.i) {
            return 0;
        }
        return this.f۳۴۵۲h;
    }

    public void g(int offset) {
        this.f۳۴۵۲h = offset;
        this.i = true;
    }

    public int h() {
        return this.f۳۴۵۰f;
    }

    public void h(int width) {
        this.f۳۴۵۰f = width;
    }

    public void a(int width) {
        Drawable popupBackground = this.f۳۴۴۶b.getBackground();
        if (popupBackground != null) {
            popupBackground.getPadding(this.B);
            Rect rect = this.B;
            this.f۳۴۵۰f = rect.left + rect.right + width;
            return;
        }
        h(width);
    }

    public void k() {
        int widthSpec;
        int heightSpec;
        int height = l();
        int widthSpec2 = 0;
        int heightSpec2 = 0;
        boolean noInputMethod = i();
        boolean z2 = true;
        int i2 = -1;
        if (this.f۳۴۴۶b.isShowing()) {
            int i3 = this.f۳۴۵۰f;
            if (i3 == -1) {
                widthSpec = -1;
            } else if (i3 == -2) {
                widthSpec = c().getWidth();
            } else {
                widthSpec = this.f۳۴۵۰f;
            }
            int i4 = this.f۳۴۴۹e;
            if (i4 == -1) {
                heightSpec = noInputMethod ? height : -1;
                if (noInputMethod) {
                    d dVar = this.f۳۴۴۶b;
                    if (this.f۳۴۵۰f != -1) {
                        i2 = 0;
                    }
                    dVar.setWindowLayoutMode(i2, 0);
                } else {
                    this.f۳۴۴۶b.setWindowLayoutMode(this.f۳۴۵۰f == -1 ? -1 : 0, -1);
                }
            } else {
                heightSpec = i4 == -2 ? height : this.f۳۴۴۹e;
            }
            d dVar2 = this.f۳۴۴۶b;
            if (this.n || this.m) {
                z2 = false;
            }
            dVar2.setOutsideTouchable(z2);
            this.f۳۴۴۶b.update(c(), this.f۳۴۵۱g, this.f۳۴۵۲h, widthSpec, heightSpec);
            return;
        }
        int i5 = this.f۳۴۵۰f;
        if (i5 == -1) {
            widthSpec2 = -1;
        } else if (i5 == -2) {
            this.f۳۴۴۶b.setWidth(c().getWidth());
        } else {
            this.f۳۴۴۶b.setWidth(i5);
        }
        int i6 = this.f۳۴۴۹e;
        if (i6 == -1) {
            heightSpec2 = -1;
        } else if (i6 == -2) {
            this.f۳۴۴۶b.setHeight(height);
        } else {
            this.f۳۴۴۶b.setHeight(i6);
        }
        this.f۳۴۴۶b.setWindowLayoutMode(widthSpec2, heightSpec2);
        b(true);
        d dVar3 = this.f۳۴۴۶b;
        if (this.n || this.m) {
            z2 = false;
        }
        dVar3.setOutsideTouchable(z2);
        this.f۳۴۴۶b.setTouchInterceptor(this.x);
        n.a(this.f۳۴۴۶b, c(), this.f۳۴۵۱g, this.f۳۴۵۲h, this.l);
        this.f۳۴۴۸d.setSelection(-1);
        if (!this.C || this.f۳۴۴۸d.a()) {
            a();
        }
        if (!this.C) {
            this.A.post(this.z);
        }
        if (this.j != 0) {
            this.f۳۴۴۶b.getContentView().getViewTreeObserver().addOnPreDrawListener(new a());
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        public boolean onPreDraw() {
            b.this.f۳۴۴۶b.getContentView().getViewTreeObserver().removeOnPreDrawListener(this);
            int count = b.this.f۳۴۴۸d.getChildCount();
            for (int i = 0; i < count; i++) {
                View v = b.this.f۳۴۴۸d.getChildAt(i);
                Animation anim = AnimationUtils.loadAnimation(b.this.f۳۴۴۵a, b.this.j);
                anim.setStartOffset((long) (b.this.k * i));
                v.startAnimation(anim);
            }
            return false;
        }
    }

    public void b() {
        this.f۳۴۴۶b.dismiss();
        m();
        this.f۳۴۴۶b.setContentView(null);
        this.f۳۴۴۸d = null;
        this.A.removeCallbacks(this.w);
    }

    public void a(PopupWindow.OnDismissListener listener) {
        this.f۳۴۴۶b.setOnDismissListener(listener);
    }

    private void m() {
        View view = this.p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.p);
            }
        }
    }

    public void c(int mode) {
        this.f۳۴۴۶b.setInputMethodMode(mode);
    }

    public void a() {
        d list = this.f۳۴۴۸d;
        if (list != null) {
            list.f۳۴۵۶d = true;
            list.requestLayout();
        }
    }

    public boolean j() {
        return this.f۳۴۴۶b.isShowing();
    }

    public boolean i() {
        return this.f۳۴۴۶b.getInputMethodMode() == 2;
    }

    public c f() {
        return this.f۳۴۴۸d;
    }

    private int a(String resourceName) {
        int resourceId = this.f۳۴۴۵a.getResources().getIdentifier(resourceName, "dimen", "android");
        if (resourceId > 0) {
            return this.f۳۴۴۵a.getResources().getDimensionPixelSize(resourceId);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v22, resolved type: android.widget.LinearLayout */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.rey.material.widget.b$d, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int l() {
        /*
        // Method dump skipped, instructions count: 390
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rey.material.widget.b.l():int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.rey.material.widget.b$b  reason: collision with other inner class name */
    public class RunnableC۰۱۱۰b implements Runnable {
        RunnableC۰۱۱۰b() {
        }

        public void run() {
            View view = b.this.c();
            if (view != null && view.getWindowToken() != null) {
                b.this.k();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements AdapterView.OnItemSelectedListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
            d dropDownList;
            if (position != -1 && (dropDownList = b.this.f۳۴۴۸d) != null) {
                dropDownList.f۳۴۵۶d = false;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static class d extends c {

        /* renamed from: d  reason: collision with root package name */
        private boolean f۳۴۵۶d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f۳۴۵۷e;

        public d(Context context, boolean hijackFocus) {
            super(context, null, b.j.a.a.dropDownListViewStyle);
            this.f۳۴۵۷e = hijackFocus;
            setCacheColorHint(0);
        }

        public boolean a() {
            return (this.f۳۴۵۷e && this.f۳۴۵۶d) || super.isInTouchMode();
        }
    }

    /* access modifiers changed from: private */
    public class f extends DataSetObserver {
        private f() {
        }

        /* synthetic */ f(b x0, a x1) {
            this();
        }

        public void onChanged() {
            if (b.this.j()) {
                b.this.k();
            }
        }

        public void onInvalidated() {
            b.this.b();
        }
    }

    /* access modifiers changed from: private */
    public class e implements Runnable {
        private e() {
        }

        /* synthetic */ e(b x0, a x1) {
            this();
        }

        public void run() {
            b.this.a();
        }
    }

    /* access modifiers changed from: private */
    public class i implements Runnable {
        private i() {
        }

        /* synthetic */ i(b x0, a x1) {
            this();
        }

        public void run() {
            if (b.this.f۳۴۴۸d != null && b.this.f۳۴۴۸d.getCount() > b.this.f۳۴۴۸d.getChildCount()) {
                int childCount = b.this.f۳۴۴۸d.getChildCount();
                b bVar = b.this;
                if (childCount <= bVar.o) {
                    bVar.f۳۴۴۶b.setInputMethodMode(2);
                    b.this.k();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public class h implements View.OnTouchListener {
        private h() {
        }

        /* synthetic */ h(b x0, a x1) {
            this();
        }

        public boolean onTouch(View v, MotionEvent event) {
            int action = event.getAction();
            int x = (int) event.getX();
            int y = (int) event.getY();
            if (action == 0 && b.this.f۳۴۴۶b != null && b.this.f۳۴۴۶b.isShowing() && x >= 0 && x < b.this.f۳۴۴۶b.getWidth() && y >= 0 && y < b.this.f۳۴۴۶b.getHeight()) {
                b.this.A.postDelayed(b.this.w, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                b.this.A.removeCallbacks(b.this.w);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    public class g implements AbsListView.OnScrollListener {
        private g() {
        }

        /* synthetic */ g(b x0, a x1) {
            this();
        }

        public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        }

        public void onScrollStateChanged(AbsListView view, int scrollState) {
            if (scrollState == 1 && !b.this.i() && b.this.f۳۴۴۶b.getContentView() != null) {
                b.this.A.removeCallbacks(b.this.w);
                b.this.w.run();
            }
        }
    }

    private void b(boolean clip) {
        Method method = D;
        if (method != null) {
            try {
                method.invoke(this.f۳۴۴۶b, Boolean.valueOf(clip));
            } catch (Exception e2) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        } else if (clip && Build.VERSION.SDK_INT >= 3) {
            this.f۳۴۴۶b.setClippingEnabled(false);
        }
    }
}
