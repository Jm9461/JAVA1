package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.t;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public class v extends Spinner implements t {
    private static final int[] k = {16843505};

    /* renamed from: c  reason: collision with root package name */
    private final f f۲۲۶۲c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f۲۲۶۳d;

    /* renamed from: e  reason: collision with root package name */
    private l0 f۲۲۶۴e;

    /* renamed from: f  reason: collision with root package name */
    private SpinnerAdapter f۲۲۶۵f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f۲۲۶۶g;

    /* renamed from: h  reason: collision with root package name */
    c f۲۲۶۷h;
    int i;
    final Rect j;

    public v(Context context, AttributeSet attrs) {
        this(context, attrs, a.b.h.a.a.spinnerStyle);
    }

    public v(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, -1);
    }

    public v(Context context, AttributeSet attrs, int defStyleAttr, int mode) {
        this(context, attrs, defStyleAttr, mode, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r3 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        r3.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (0 == 0) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.v.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    class a extends l0 {
        final /* synthetic */ c l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View src, c cVar) {
            super(src);
            this.l = cVar;
        }

        @Override // android.support.v7.widget.l0
        public android.support.v7.view.menu.t a() {
            return this.l;
        }

        @Override // android.support.v7.widget.l0
        public boolean b() {
            if (v.this.f۲۲۶۷h.e()) {
                return true;
            }
            v.this.f۲۲۶۷h.d();
            return true;
        }
    }

    public Context getPopupContext() {
        if (this.f۲۲۶۷h != null) {
            return this.f۲۲۶۳d;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public void setPopupBackgroundDrawable(Drawable background) {
        c cVar = this.f۲۲۶۷h;
        if (cVar != null) {
            cVar.a(background);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(background);
        }
    }

    public void setPopupBackgroundResource(int resId) {
        setPopupBackgroundDrawable(a.b.h.c.a.a.c(getPopupContext(), resId));
    }

    public Drawable getPopupBackground() {
        c cVar = this.f۲۲۶۷h;
        if (cVar != null) {
            return cVar.c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public void setDropDownVerticalOffset(int pixels) {
        c cVar = this.f۲۲۶۷h;
        if (cVar != null) {
            cVar.h(pixels);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(pixels);
        }
    }

    public int getDropDownVerticalOffset() {
        c cVar = this.f۲۲۶۷h;
        if (cVar != null) {
            return cVar.h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public void setDropDownHorizontalOffset(int pixels) {
        c cVar = this.f۲۲۶۷h;
        if (cVar != null) {
            cVar.d(pixels);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(pixels);
        }
    }

    public int getDropDownHorizontalOffset() {
        c cVar = this.f۲۲۶۷h;
        if (cVar != null) {
            return cVar.g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public void setDropDownWidth(int pixels) {
        if (this.f۲۲۶۷h != null) {
            this.i = pixels;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(pixels);
        }
    }

    public int getDropDownWidth() {
        if (this.f۲۲۶۷h != null) {
            return this.i;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter adapter) {
        if (!this.f۲۲۶۶g) {
            this.f۲۲۶۵f = adapter;
            return;
        }
        super.setAdapter(adapter);
        if (this.f۲۲۶۷h != null) {
            Context popupContext = this.f۲۲۶۳d;
            if (popupContext == null) {
                popupContext = getContext();
            }
            this.f۲۲۶۷h.a(new b(adapter, popupContext.getTheme()));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f۲۲۶۷h;
        if (cVar != null && cVar.e()) {
            this.f۲۲۶۷h.dismiss();
        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        l0 l0Var = this.f۲۲۶۴e;
        if (l0Var == null || !l0Var.onTouch(this, event)) {
            return super.onTouchEvent(event);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f۲۲۶۷h != null && View.MeasureSpec.getMode(widthMeasureSpec) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(widthMeasureSpec)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        c cVar = this.f۲۲۶۷h;
        if (cVar == null) {
            return super.performClick();
        }
        if (cVar.e()) {
            return true;
        }
        this.f۲۲۶۷h.d();
        return true;
    }

    public void setPrompt(CharSequence prompt) {
        c cVar = this.f۲۲۶۷h;
        if (cVar != null) {
            cVar.a(prompt);
        } else {
            super.setPrompt(prompt);
        }
    }

    public CharSequence getPrompt() {
        c cVar = this.f۲۲۶۷h;
        return cVar != null ? cVar.m() : super.getPrompt();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        f fVar = this.f۲۲۶۲c;
        if (fVar != null) {
            fVar.a(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        f fVar = this.f۲۲۶۲c;
        if (fVar != null) {
            fVar.a(background);
        }
    }

    @Override // android.support.v4.view.t
    public void setSupportBackgroundTintList(ColorStateList tint) {
        f fVar = this.f۲۲۶۲c;
        if (fVar != null) {
            fVar.b(tint);
        }
    }

    @Override // android.support.v4.view.t
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f۲۲۶۲c;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    @Override // android.support.v4.view.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        f fVar = this.f۲۲۶۲c;
        if (fVar != null) {
            fVar.a(tintMode);
        }
    }

    @Override // android.support.v4.view.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f۲۲۶۲c;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f۲۲۶۲c;
        if (fVar != null) {
            fVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter adapter, Drawable background) {
        if (adapter == null) {
            return 0;
        }
        int width = 0;
        View itemView = null;
        int itemType = 0;
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int start = Math.max(0, getSelectedItemPosition());
        int end = Math.min(adapter.getCount(), start + 15);
        for (int i2 = Math.max(0, start - (15 - (end - start))); i2 < end; i2++) {
            int positionType = adapter.getItemViewType(i2);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            itemView = adapter.getView(i2, itemView, this);
            if (itemView.getLayoutParams() == null) {
                itemView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            width = Math.max(width, itemView.getMeasuredWidth());
        }
        if (background == null) {
            return width;
        }
        background.getPadding(this.j);
        Rect rect = this.j;
        return width + rect.left + rect.right;
    }

    /* access modifiers changed from: private */
    public static class b implements ListAdapter, SpinnerAdapter {

        /* renamed from: c  reason: collision with root package name */
        private SpinnerAdapter f۲۲۶۸c;

        /* renamed from: d  reason: collision with root package name */
        private ListAdapter f۲۲۶۹d;

        public b(SpinnerAdapter adapter, Resources.Theme dropDownTheme) {
            this.f۲۲۶۸c = adapter;
            if (adapter instanceof ListAdapter) {
                this.f۲۲۶۹d = (ListAdapter) adapter;
            }
            if (dropDownTheme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (adapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedAdapter = (ThemedSpinnerAdapter) adapter;
                if (themedAdapter.getDropDownViewTheme() != dropDownTheme) {
                    themedAdapter.setDropDownViewTheme(dropDownTheme);
                }
            } else if (adapter instanceof f1) {
                f1 themedAdapter2 = (f1) adapter;
                if (themedAdapter2.getDropDownViewTheme() == null) {
                    themedAdapter2.setDropDownViewTheme(dropDownTheme);
                }
            }
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f۲۲۶۸c;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public Object getItem(int position) {
            SpinnerAdapter spinnerAdapter = this.f۲۲۶۸c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(position);
        }

        public long getItemId(int position) {
            SpinnerAdapter spinnerAdapter = this.f۲۲۶۸c;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(position);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            return getDropDownView(position, convertView, parent);
        }

        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            SpinnerAdapter spinnerAdapter = this.f۲۲۶۸c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(position, convertView, parent);
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f۲۲۶۸c;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public void registerDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f۲۲۶۸c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(observer);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f۲۲۶۸c;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(observer);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter adapter = this.f۲۲۶۹d;
            if (adapter != null) {
                return adapter.areAllItemsEnabled();
            }
            return true;
        }

        public boolean isEnabled(int position) {
            ListAdapter adapter = this.f۲۲۶۹d;
            if (adapter != null) {
                return adapter.isEnabled(position);
            }
            return true;
        }

        public int getItemViewType(int position) {
            return 0;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    /* access modifiers changed from: private */
    public class c extends p0 {
        private CharSequence K;
        ListAdapter L;
        private final Rect M = new Rect();

        public c(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            a(v.this);
            a(true);
            f(0);
            a(new a(v.this));
        }

        class a implements AdapterView.OnItemClickListener {
            a(v vVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                v.this.setSelection(position);
                if (v.this.getOnItemClickListener() != null) {
                    c cVar = c.this;
                    v.this.performItemClick(v, position, cVar.L.getItemId(position));
                }
                c.this.dismiss();
            }
        }

        @Override // android.support.v7.widget.p0
        public void a(ListAdapter adapter) {
            super.a(adapter);
            this.L = adapter;
        }

        public CharSequence m() {
            return this.K;
        }

        public void a(CharSequence hintText) {
            this.K = hintText;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            int hOffset;
            Drawable background = c();
            int hOffset2 = 0;
            if (background != null) {
                background.getPadding(v.this.j);
                hOffset2 = r1.a(v.this) ? v.this.j.right : -v.this.j.left;
            } else {
                Rect rect = v.this.j;
                rect.right = 0;
                rect.left = 0;
            }
            int spinnerPaddingLeft = v.this.getPaddingLeft();
            int spinnerPaddingRight = v.this.getPaddingRight();
            int spinnerWidth = v.this.getWidth();
            v vVar = v.this;
            int i = vVar.i;
            if (i == -2) {
                int contentWidth = vVar.a((SpinnerAdapter) this.L, c());
                int i2 = v.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = v.this.j;
                int contentWidthLimit = (i2 - rect2.left) - rect2.right;
                if (contentWidth > contentWidthLimit) {
                    contentWidth = contentWidthLimit;
                }
                b(Math.max(contentWidth, (spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight));
            } else if (i == -1) {
                b((spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight);
            } else {
                b(i);
            }
            if (r1.a(v.this)) {
                hOffset = hOffset2 + ((spinnerWidth - spinnerPaddingRight) - i());
            } else {
                hOffset = hOffset2 + spinnerPaddingLeft;
            }
            d(hOffset);
        }

        @Override // android.support.v7.widget.p0, android.support.v7.view.menu.t
        public void d() {
            ViewTreeObserver vto;
            boolean wasShowing = e();
            l();
            e(2);
            super.d();
            f().setChoiceMode(1);
            g(v.this.getSelectedItemPosition());
            if (!wasShowing && (vto = v.this.getViewTreeObserver()) != null) {
                ViewTreeObserver.OnGlobalLayoutListener layoutListener = new b();
                vto.addOnGlobalLayoutListener(layoutListener);
                a(new C۰۰۴۰c(layoutListener));
            }
        }

        /* access modifiers changed from: package-private */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                c cVar = c.this;
                if (!cVar.b(v.this)) {
                    c.this.dismiss();
                    return;
                }
                c.this.l();
                c.super.d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v7.widget.v$c$c  reason: collision with other inner class name */
        public class C۰۰۴۰c implements PopupWindow.OnDismissListener {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f۲۲۷۲c;

            C۰۰۴۰c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f۲۲۷۲c = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver vto = v.this.getViewTreeObserver();
                if (vto != null) {
                    vto.removeGlobalOnLayoutListener(this.f۲۲۷۲c);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view) {
            return u.x(view) && view.getGlobalVisibleRect(this.M);
        }
    }
}
