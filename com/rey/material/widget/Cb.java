package com.rey.material.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.p۰۴۳v4.widget.Cn;
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
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۰f.Ce;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.Ca;

/* renamed from: com.rey.material.widget.b  reason: invalid class name */
public class Cb {

    /* renamed from: D  reason: contains not printable characters */
    private static Method f۱۵۱۹۵D;

    /* renamed from: A  reason: contains not printable characters */
    private Handler f۱۵۱۹۶A = new Handler();

    /* renamed from: B  reason: contains not printable characters */
    private Rect f۱۵۱۹۷B = new Rect();

    /* renamed from: C  reason: contains not printable characters */
    private boolean f۱۵۱۹۸C;

    /* renamed from: a  reason: contains not printable characters */
    private Context f۱۵۱۹۹a;

    /* renamed from: b  reason: contains not printable characters */
    private Cd f۱۵۲۰۰b;

    /* renamed from: c  reason: contains not printable characters */
    private ListAdapter f۱۵۲۰۱c;

    /* renamed from: d  reason: contains not printable characters */
    private Cd f۱۵۲۰۲d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۵۲۰۳e = -2;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۵۲۰۴f = -2;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۵۲۰۵g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۵۲۰۶h;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۱۵۲۰۷i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۵۲۰۸j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۵۲۰۹k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۵۲۱۰l = 0;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۱۵۲۱۱m = false;

    /* renamed from: n  reason: contains not printable characters */
    private boolean f۱۵۲۱۲n = false;

    /* renamed from: o  reason: contains not printable characters */
    int f۱۵۲۱۳o = Integer.MAX_VALUE;

    /* renamed from: p  reason: contains not printable characters */
    private View f۱۵۲۱۴p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۵۲۱۵q = 0;

    /* renamed from: r  reason: contains not printable characters */
    private DataSetObserver f۱۵۲۱۶r;

    /* renamed from: s  reason: contains not printable characters */
    private View f۱۵۲۱۷s;

    /* renamed from: t  reason: contains not printable characters */
    private Drawable f۱۵۲۱۸t;

    /* renamed from: u  reason: contains not printable characters */
    private AdapterView.OnItemClickListener f۱۵۲۱۹u;

    /* renamed from: v  reason: contains not printable characters */
    private AdapterView.OnItemSelectedListener f۱۵۲۲۰v;

    /* renamed from: w  reason: contains not printable characters */
    private final RunnableCi f۱۵۲۲۱w = new RunnableCi(this, null);

    /* renamed from: x  reason: contains not printable characters */
    private final View$OnTouchListenerCh f۱۵۲۲۲x = new View$OnTouchListenerCh(this, null);

    /* renamed from: y  reason: contains not printable characters */
    private final Cg f۱۵۲۲۳y = new Cg(this, null);

    /* renamed from: z  reason: contains not printable characters */
    private final RunnableCe f۱۵۲۲۴z = new RunnableCe(this, null);

    static {
        try {
            f۱۵۱۹۵D = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }

    public Cb(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f۱۵۱۹۹a = context;
        TypedArray a = context.obtainStyledAttributes(attrs, p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.ListPopupWindow, defStyleAttr, defStyleRes);
        this.f۱۵۲۰۵g = a.getDimensionPixelOffset(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f۱۵۲۰۶h = a.getDimensionPixelOffset(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f۱۵۲۰۶h != 0) {
            this.f۱۵۲۰۷i = true;
        }
        a.recycle();
        this.f۱۵۲۰۰b = new Cd(context, attrs, defStyleAttr);
        this.f۱۵۲۰۰b.setInputMethodMode(1);
        Ce.m۱۰۵۵۶b(this.f۱۵۱۹۹a.getResources().getConfiguration().locale);
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۸۱۵۶d(int id) {
        this.f۱۵۲۰۸j = id;
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۸۱۵۸e(int offset) {
        this.f۱۵۲۰۹k = offset;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۴۶a(Drawable background) {
        this.f۱۵۲۰۰b.setBackgroundDrawable(background);
    }

    /* renamed from: d  reason: contains not printable characters */
    public Drawable m۱۸۱۵۵d() {
        return this.f۱۵۲۰۰b.getBackground();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۴۸a(ListAdapter adapter) {
        DataSetObserver dataSetObserver = this.f۱۵۲۱۶r;
        if (dataSetObserver == null) {
            this.f۱۵۲۱۶r = new Cf(this, null);
        } else {
            ListAdapter listAdapter = this.f۱۵۲۰۱c;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f۱۵۲۰۱c = adapter;
        if (this.f۱۵۲۰۱c != null) {
            adapter.registerDataSetObserver(this.f۱۵۲۱۶r);
        }
        Cd dVar = this.f۱۵۲۰۲d;
        if (dVar != null) {
            dVar.setAdapter(this.f۱۵۲۰۱c);
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    public void m۱۸۱۶۰f(int position) {
        this.f۱۵۲۱۵q = position;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۵۰a(boolean modal) {
        this.f۱۵۱۹۸C = modal;
        this.f۱۵۲۰۰b.setFocusable(modal);
    }

    /* renamed from: c  reason: contains not printable characters */
    public View m۱۸۱۵۳c() {
        return this.f۱۵۲۱۷s;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۴۷a(View anchor) {
        this.f۱۵۲۱۷s = anchor;
    }

    /* renamed from: e  reason: contains not printable characters */
    public int m۱۸۱۵۷e() {
        return this.f۱۵۲۰۵g;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۱۵۲b(int offset) {
        this.f۱۵۲۰۵g = offset;
    }

    /* renamed from: g  reason: contains not printable characters */
    public int m۱۸۱۶۱g() {
        if (!this.f۱۵۲۰۷i) {
            return 0;
        }
        return this.f۱۵۲۰۶h;
    }

    /* renamed from: g  reason: contains not printable characters */
    public void m۱۸۱۶۲g(int offset) {
        this.f۱۵۲۰۶h = offset;
        this.f۱۵۲۰۷i = true;
    }

    /* renamed from: h  reason: contains not printable characters */
    public int m۱۸۱۶۳h() {
        return this.f۱۵۲۰۴f;
    }

    /* renamed from: h  reason: contains not printable characters */
    public void m۱۸۱۶۴h(int width) {
        this.f۱۵۲۰۴f = width;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۴۵a(int width) {
        Drawable popupBackground = this.f۱۵۲۰۰b.getBackground();
        if (popupBackground != null) {
            popupBackground.getPadding(this.f۱۵۱۹۷B);
            Rect rect = this.f۱۵۱۹۷B;
            this.f۱۵۲۰۴f = rect.left + rect.right + width;
            return;
        }
        m۱۸۱۶۴h(width);
    }

    /* renamed from: k  reason: contains not printable characters */
    public void m۱۸۱۶۷k() {
        int widthSpec;
        int heightSpec;
        int height = m۱۸۱۴۲l();
        int widthSpec2 = 0;
        int heightSpec2 = 0;
        boolean noInputMethod = m۱۸۱۶۵i();
        boolean z = true;
        int i = -1;
        if (this.f۱۵۲۰۰b.isShowing()) {
            int i2 = this.f۱۵۲۰۴f;
            if (i2 == -1) {
                widthSpec = -1;
            } else if (i2 == -2) {
                widthSpec = m۱۸۱۵۳c().getWidth();
            } else {
                widthSpec = this.f۱۵۲۰۴f;
            }
            int i3 = this.f۱۵۲۰۳e;
            if (i3 == -1) {
                heightSpec = noInputMethod ? height : -1;
                if (noInputMethod) {
                    Cd dVar = this.f۱۵۲۰۰b;
                    if (this.f۱۵۲۰۴f != -1) {
                        i = 0;
                    }
                    dVar.setWindowLayoutMode(i, 0);
                } else {
                    this.f۱۵۲۰۰b.setWindowLayoutMode(this.f۱۵۲۰۴f == -1 ? -1 : 0, -1);
                }
            } else {
                heightSpec = i3 == -2 ? height : this.f۱۵۲۰۳e;
            }
            Cd dVar2 = this.f۱۵۲۰۰b;
            if (this.f۱۵۲۱۲n || this.f۱۵۲۱۱m) {
                z = false;
            }
            dVar2.setOutsideTouchable(z);
            this.f۱۵۲۰۰b.update(m۱۸۱۵۳c(), this.f۱۵۲۰۵g, this.f۱۵۲۰۶h, widthSpec, heightSpec);
            return;
        }
        int i4 = this.f۱۵۲۰۴f;
        if (i4 == -1) {
            widthSpec2 = -1;
        } else if (i4 == -2) {
            this.f۱۵۲۰۰b.setWidth(m۱۸۱۵۳c().getWidth());
        } else {
            this.f۱۵۲۰۰b.setWidth(i4);
        }
        int i5 = this.f۱۵۲۰۳e;
        if (i5 == -1) {
            heightSpec2 = -1;
        } else if (i5 == -2) {
            this.f۱۵۲۰۰b.setHeight(height);
        } else {
            this.f۱۵۲۰۰b.setHeight(i5);
        }
        this.f۱۵۲۰۰b.setWindowLayoutMode(widthSpec2, heightSpec2);
        m۱۸۱۳۶b(true);
        Cd dVar3 = this.f۱۵۲۰۰b;
        if (this.f۱۵۲۱۲n || this.f۱۵۲۱۱m) {
            z = false;
        }
        dVar3.setOutsideTouchable(z);
        this.f۱۵۲۰۰b.setTouchInterceptor(this.f۱۵۲۲۲x);
        Cn.m۱۳۲۹۴a(this.f۱۵۲۰۰b, m۱۸۱۵۳c(), this.f۱۵۲۰۵g, this.f۱۵۲۰۶h, this.f۱۵۲۱۰l);
        this.f۱۵۲۰۲d.setSelection(-1);
        if (!this.f۱۵۱۹۸C || this.f۱۵۲۰۲d.m۱۸۱۶۹a()) {
            m۱۸۱۴۴a();
        }
        if (!this.f۱۵۱۹۸C) {
            this.f۱۵۱۹۶A.post(this.f۱۵۲۲۴z);
        }
        if (this.f۱۵۲۰۸j != 0) {
            this.f۱۵۲۰۰b.getContentView().getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerCa());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.rey.material.widget.b$a  reason: invalid class name */
    public class ViewTreeObserver$OnPreDrawListenerCa implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerCa() {
        }

        public boolean onPreDraw() {
            Cb.this.f۱۵۲۰۰b.getContentView().getViewTreeObserver().removeOnPreDrawListener(this);
            int count = Cb.this.f۱۵۲۰۲d.getChildCount();
            for (int i = 0; i < count; i++) {
                View v = Cb.this.f۱۵۲۰۲d.getChildAt(i);
                Animation anim = AnimationUtils.loadAnimation(Cb.this.f۱۵۱۹۹a, Cb.this.f۱۵۲۰۸j);
                anim.setStartOffset((long) (Cb.this.f۱۵۲۰۹k * i));
                v.startAnimation(anim);
            }
            return false;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۱۵۱b() {
        this.f۱۵۲۰۰b.dismiss();
        m۱۸۱۴۳m();
        this.f۱۵۲۰۰b.setContentView(null);
        this.f۱۵۲۰۲d = null;
        this.f۱۵۱۹۶A.removeCallbacks(this.f۱۵۲۲۱w);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۴۹a(PopupWindow.OnDismissListener listener) {
        this.f۱۵۲۰۰b.setOnDismissListener(listener);
    }

    /* renamed from: m  reason: contains not printable characters */
    private void m۱۸۱۴۳m() {
        View view = this.f۱۵۲۱۴p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f۱۵۲۱۴p);
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۸۱۵۴c(int mode) {
        this.f۱۵۲۰۰b.setInputMethodMode(mode);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۴۴a() {
        Cd list = this.f۱۵۲۰۲d;
        if (list != null) {
            list.f۱۵۲۲۸d = true;
            list.requestLayout();
        }
    }

    /* renamed from: j  reason: contains not printable characters */
    public boolean m۱۸۱۶۶j() {
        return this.f۱۵۲۰۰b.isShowing();
    }

    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۸۱۶۵i() {
        return this.f۱۵۲۰۰b.getInputMethodMode() == 2;
    }

    /* renamed from: f  reason: contains not printable characters */
    public Cc m۱۸۱۵۹f() {
        return this.f۱۵۲۰۲d;
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۸۱۳۳a(String resourceName) {
        int resourceId = this.f۱۵۱۹۹a.getResources().getIdentifier(resourceName, "dimen", "android");
        if (resourceId > 0) {
            return this.f۱۵۱۹۹a.getResources().getDimensionPixelSize(resourceId);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v22, resolved type: android.widget.LinearLayout */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.rey.material.widget.b$d, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: l  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m۱۸۱۴۲l() {
        /*
        // Method dump skipped, instructions count: 390
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rey.material.widget.Cb.m۱۸۱۴۲l():int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.rey.material.widget.b$b  reason: invalid class name */
    public class RunnableCb implements Runnable {
        RunnableCb() {
        }

        public void run() {
            View view = Cb.this.m۱۸۱۵۳c();
            if (view != null && view.getWindowToken() != null) {
                Cb.this.m۱۸۱۶۷k();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.rey.material.widget.b$c  reason: invalid class name */
    public class Cc implements AdapterView.OnItemSelectedListener {
        Cc() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
            Cd dropDownList;
            if (position != -1 && (dropDownList = Cb.this.f۱۵۲۰۲d) != null) {
                dropDownList.f۱۵۲۲۸d = false;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.rey.material.widget.b$d  reason: invalid class name */
    public static class Cd extends Cc {

        /* renamed from: d  reason: contains not printable characters */
        private boolean f۱۵۲۲۸d;

        /* renamed from: e  reason: contains not printable characters */
        private boolean f۱۵۲۲۹e;

        public Cd(Context context, boolean hijackFocus) {
            super(context, null, Ca.dropDownListViewStyle);
            this.f۱۵۲۲۹e = hijackFocus;
            setCacheColorHint(0);
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۸۱۶۹a() {
            return (this.f۱۵۲۲۹e && this.f۱۵۲۲۸d) || super.isInTouchMode();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.rey.material.widget.b$f  reason: invalid class name */
    public class Cf extends DataSetObserver {
        private Cf() {
        }

        /* synthetic */ Cf(Cb x0, ViewTreeObserver$OnPreDrawListenerCa x1) {
            this();
        }

        public void onChanged() {
            if (Cb.this.m۱۸۱۶۶j()) {
                Cb.this.m۱۸۱۶۷k();
            }
        }

        public void onInvalidated() {
            Cb.this.m۱۸۱۵۱b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.rey.material.widget.b$e  reason: invalid class name */
    public class RunnableCe implements Runnable {
        private RunnableCe() {
        }

        /* synthetic */ RunnableCe(Cb x0, ViewTreeObserver$OnPreDrawListenerCa x1) {
            this();
        }

        public void run() {
            Cb.this.m۱۸۱۴۴a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.rey.material.widget.b$i  reason: invalid class name */
    public class RunnableCi implements Runnable {
        private RunnableCi() {
        }

        /* synthetic */ RunnableCi(Cb x0, ViewTreeObserver$OnPreDrawListenerCa x1) {
            this();
        }

        public void run() {
            if (Cb.this.f۱۵۲۰۲d != null && Cb.this.f۱۵۲۰۲d.getCount() > Cb.this.f۱۵۲۰۲d.getChildCount()) {
                int childCount = Cb.this.f۱۵۲۰۲d.getChildCount();
                Cb bVar = Cb.this;
                if (childCount <= bVar.f۱۵۲۱۳o) {
                    bVar.f۱۵۲۰۰b.setInputMethodMode(2);
                    Cb.this.m۱۸۱۶۷k();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.rey.material.widget.b$h  reason: invalid class name */
    public class View$OnTouchListenerCh implements View.OnTouchListener {
        private View$OnTouchListenerCh() {
        }

        /* synthetic */ View$OnTouchListenerCh(Cb x0, ViewTreeObserver$OnPreDrawListenerCa x1) {
            this();
        }

        public boolean onTouch(View v, MotionEvent event) {
            int action = event.getAction();
            int x = (int) event.getX();
            int y = (int) event.getY();
            if (action == 0 && Cb.this.f۱۵۲۰۰b != null && Cb.this.f۱۵۲۰۰b.isShowing() && x >= 0 && x < Cb.this.f۱۵۲۰۰b.getWidth() && y >= 0 && y < Cb.this.f۱۵۲۰۰b.getHeight()) {
                Cb.this.f۱۵۱۹۶A.postDelayed(Cb.this.f۱۵۲۲۱w, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                Cb.this.f۱۵۱۹۶A.removeCallbacks(Cb.this.f۱۵۲۲۱w);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.rey.material.widget.b$g  reason: invalid class name */
    public class Cg implements AbsListView.OnScrollListener {
        private Cg() {
        }

        /* synthetic */ Cg(Cb x0, ViewTreeObserver$OnPreDrawListenerCa x1) {
            this();
        }

        public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        }

        public void onScrollStateChanged(AbsListView view, int scrollState) {
            if (scrollState == 1 && !Cb.this.m۱۸۱۶۵i() && Cb.this.f۱۵۲۰۰b.getContentView() != null) {
                Cb.this.f۱۵۱۹۶A.removeCallbacks(Cb.this.f۱۵۲۲۱w);
                Cb.this.f۱۵۲۲۱w.run();
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۸۱۳۶b(boolean clip) {
        Method method = f۱۵۱۹۵D;
        if (method != null) {
            try {
                method.invoke(this.f۱۵۲۰۰b, Boolean.valueOf(clip));
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        } else if (clip && Build.VERSION.SDK_INT >= 3) {
            this.f۱۵۲۰۰b.setClippingEnabled(false);
        }
    }
}
