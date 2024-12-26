package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p۰۴۳v4.view.AbstractCt;
import android.support.p۰۴۳v4.view.Cu;
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

/* renamed from: android.support.v7.widget.v  reason: invalid class name */
public class Cv extends Spinner implements AbstractCt {

    /* renamed from: k  reason: contains not printable characters */
    private static final int[] f۱۲۳۵۰k = {16843505};

    /* renamed from: c  reason: contains not printable characters */
    private final Cf f۱۲۳۵۱c;

    /* renamed from: d  reason: contains not printable characters */
    private final Context f۱۲۳۵۲d;

    /* renamed from: e  reason: contains not printable characters */
    private AbstractView$OnTouchListenerCl0 f۱۲۳۵۳e;

    /* renamed from: f  reason: contains not printable characters */
    private SpinnerAdapter f۱۲۳۵۴f;

    /* renamed from: g  reason: contains not printable characters */
    private final boolean f۱۲۳۵۵g;

    /* renamed from: h  reason: contains not printable characters */
    Cc f۱۲۳۵۶h;

    /* renamed from: i  reason: contains not printable characters */
    int f۱۲۳۵۷i;

    /* renamed from: j  reason: contains not printable characters */
    final Rect f۱۲۳۵۸j;

    public Cv(Context context, AttributeSet attrs) {
        this(context, attrs, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.spinnerStyle);
    }

    public Cv(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, -1);
    }

    public Cv(Context context, AttributeSet attrs, int defStyleAttr, int mode) {
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
    public Cv(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.Cv.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: android.support.v7.widget.v$a  reason: invalid class name */
    class Ca extends AbstractView$OnTouchListenerCl0 {

        /* renamed from: l  reason: contains not printable characters */
        final /* synthetic */ Cc f۱۲۳۵۹l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Ca(View src, Cc cVar) {
            super(src);
            this.f۱۲۳۵۹l = cVar;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractView$OnTouchListenerCl0
        /* renamed from: a  reason: contains not printable characters */
        public android.support.p۰۴۷v7.view.menu.AbstractCt m۱۵۶۳۹a() {
            return this.f۱۲۳۵۹l;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractView$OnTouchListenerCl0
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۵۶۴۰b() {
            if (Cv.this.f۱۲۳۵۶h.m۱۵۵۰۳e()) {
                return true;
            }
            Cv.this.f۱۲۳۵۶h.m۱۵۶۴۵d();
            return true;
        }
    }

    public Context getPopupContext() {
        if (this.f۱۲۳۵۶h != null) {
            return this.f۱۲۳۵۲d;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public void setPopupBackgroundDrawable(Drawable background) {
        Cc cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            cVar.m۱۵۴۸۹a(background);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(background);
        }
    }

    public void setPopupBackgroundResource(int resId) {
        setPopupBackgroundDrawable(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(getPopupContext(), resId));
    }

    public Drawable getPopupBackground() {
        Cc cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            return cVar.m۱۵۴۹۸c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public void setDropDownVerticalOffset(int pixels) {
        Cc cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            cVar.m۱۵۵۰۹h(pixels);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(pixels);
        }
    }

    public int getDropDownVerticalOffset() {
        Cc cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            return cVar.m۱۵۵۰۸h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public void setDropDownHorizontalOffset(int pixels) {
        Cc cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            cVar.m۱۵۵۰۱d(pixels);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(pixels);
        }
    }

    public int getDropDownHorizontalOffset() {
        Cc cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            return cVar.m۱۵۵۰۶g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public void setDropDownWidth(int pixels) {
        if (this.f۱۲۳۵۶h != null) {
            this.f۱۲۳۵۷i = pixels;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(pixels);
        }
    }

    public int getDropDownWidth() {
        if (this.f۱۲۳۵۶h != null) {
            return this.f۱۲۳۵۷i;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter adapter) {
        if (!this.f۱۲۳۵۵g) {
            this.f۱۲۳۵۴f = adapter;
            return;
        }
        super.setAdapter(adapter);
        if (this.f۱۲۳۵۶h != null) {
            Context popupContext = this.f۱۲۳۵۲d;
            if (popupContext == null) {
                popupContext = getContext();
            }
            this.f۱۲۳۵۶h.m۱۵۶۴۲a(new Cb(adapter, popupContext.getTheme()));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Cc cVar = this.f۱۲۳۵۶h;
        if (cVar != null && cVar.m۱۵۵۰۳e()) {
            this.f۱۲۳۵۶h.dismiss();
        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        AbstractView$OnTouchListenerCl0 l0Var = this.f۱۲۳۵۳e;
        if (l0Var == null || !l0Var.onTouch(this, event)) {
            return super.onTouchEvent(event);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f۱۲۳۵۶h != null && View.MeasureSpec.getMode(widthMeasureSpec) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m۱۵۶۳۸a(getAdapter(), getBackground())), View.MeasureSpec.getSize(widthMeasureSpec)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        Cc cVar = this.f۱۲۳۵۶h;
        if (cVar == null) {
            return super.performClick();
        }
        if (cVar.m۱۵۵۰۳e()) {
            return true;
        }
        this.f۱۲۳۵۶h.m۱۵۶۴۵d();
        return true;
    }

    public void setPrompt(CharSequence prompt) {
        Cc cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            cVar.m۱۵۶۴۳a(prompt);
        } else {
            super.setPrompt(prompt);
        }
    }

    public CharSequence getPrompt() {
        Cc cVar = this.f۱۲۳۵۶h;
        return cVar != null ? cVar.m۱۵۶۴۷m() : super.getPrompt();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        Cf fVar = this.f۱۲۳۵۱c;
        if (fVar != null) {
            fVar.m۱۵۱۹۸a(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        Cf fVar = this.f۱۲۳۵۱c;
        if (fVar != null) {
            fVar.m۱۵۲۰۱a(background);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintList(ColorStateList tint) {
        Cf fVar = this.f۱۲۳۵۱c;
        if (fVar != null) {
            fVar.m۱۵۲۰۴b(tint);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public ColorStateList getSupportBackgroundTintList() {
        Cf fVar = this.f۱۲۳۵۱c;
        if (fVar != null) {
            return fVar.m۱۵۲۰۳b();
        }
        return null;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        Cf fVar = this.f۱۲۳۵۱c;
        if (fVar != null) {
            fVar.m۱۵۲۰۰a(tintMode);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Cf fVar = this.f۱۲۳۵۱c;
        if (fVar != null) {
            return fVar.m۱۵۲۰۵c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Cf fVar = this.f۱۲۳۵۱c;
        if (fVar != null) {
            fVar.m۱۵۱۹۷a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۵۶۳۸a(SpinnerAdapter adapter, Drawable background) {
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
        for (int i = Math.max(0, start - (15 - (end - start))); i < end; i++) {
            int positionType = adapter.getItemViewType(i);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            itemView = adapter.getView(i, itemView, this);
            if (itemView.getLayoutParams() == null) {
                itemView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            width = Math.max(width, itemView.getMeasuredWidth());
        }
        if (background == null) {
            return width;
        }
        background.getPadding(this.f۱۲۳۵۸j);
        Rect rect = this.f۱۲۳۵۸j;
        return width + rect.left + rect.right;
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.v$b  reason: invalid class name */
    public static class Cb implements ListAdapter, SpinnerAdapter {

        /* renamed from: c  reason: contains not printable characters */
        private SpinnerAdapter f۱۲۳۶۱c;

        /* renamed from: d  reason: contains not printable characters */
        private ListAdapter f۱۲۳۶۲d;

        public Cb(SpinnerAdapter adapter, Resources.Theme dropDownTheme) {
            this.f۱۲۳۶۱c = adapter;
            if (adapter instanceof ListAdapter) {
                this.f۱۲۳۶۲d = (ListAdapter) adapter;
            }
            if (dropDownTheme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (adapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedAdapter = (ThemedSpinnerAdapter) adapter;
                if (themedAdapter.getDropDownViewTheme() != dropDownTheme) {
                    themedAdapter.setDropDownViewTheme(dropDownTheme);
                }
            } else if (adapter instanceof AbstractCf1) {
                AbstractCf1 themedAdapter2 = (AbstractCf1) adapter;
                if (themedAdapter2.getDropDownViewTheme() == null) {
                    themedAdapter2.setDropDownViewTheme(dropDownTheme);
                }
            }
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public Object getItem(int position) {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(position);
        }

        public long getItemId(int position) {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(position);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            return getDropDownView(position, convertView, parent);
        }

        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(position, convertView, parent);
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public void registerDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(observer);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(observer);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter adapter = this.f۱۲۳۶۲d;
            if (adapter != null) {
                return adapter.areAllItemsEnabled();
            }
            return true;
        }

        public boolean isEnabled(int position) {
            ListAdapter adapter = this.f۱۲۳۶۲d;
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
    /* renamed from: android.support.v7.widget.v$c  reason: invalid class name */
    public class Cc extends Cp0 {

        /* renamed from: K  reason: contains not printable characters */
        private CharSequence f۱۲۳۶۳K;

        /* renamed from: L  reason: contains not printable characters */
        ListAdapter f۱۲۳۶۴L;

        /* renamed from: M  reason: contains not printable characters */
        private final Rect f۱۲۳۶۵M = new Rect();

        public Cc(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            m۱۵۴۹۰a(Cv.this);
            m۱۵۴۹۴a(true);
            m۱۵۵۰۵f(0);
            m۱۵۴۹۱a(new Ca(Cv.this));
        }

        /* renamed from: android.support.v7.widget.v$c$a  reason: invalid class name */
        class Ca implements AdapterView.OnItemClickListener {
            Ca(Cv vVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                Cv.this.setSelection(position);
                if (Cv.this.getOnItemClickListener() != null) {
                    Cc cVar = Cc.this;
                    Cv.this.performItemClick(v, position, cVar.f۱۲۳۶۴L.getItemId(position));
                }
                Cc.this.dismiss();
            }
        }

        @Override // android.support.p۰۴۷v7.widget.Cp0
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۶۴۲a(ListAdapter adapter) {
            super.m۱۵۴۹۲a(adapter);
            this.f۱۲۳۶۴L = adapter;
        }

        /* renamed from: m  reason: contains not printable characters */
        public CharSequence m۱۵۶۴۷m() {
            return this.f۱۲۳۶۳K;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۶۴۳a(CharSequence hintText) {
            this.f۱۲۳۶۳K = hintText;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l  reason: contains not printable characters */
        public void m۱۵۶۴۶l() {
            int hOffset;
            Drawable background = m۱۵۴۹۸c();
            int hOffset2 = 0;
            if (background != null) {
                background.getPadding(Cv.this.f۱۲۳۵۸j);
                hOffset2 = Cr1.m۱۵۵۶۷a(Cv.this) ? Cv.this.f۱۲۳۵۸j.right : -Cv.this.f۱۲۳۵۸j.left;
            } else {
                Rect rect = Cv.this.f۱۲۳۵۸j;
                rect.right = 0;
                rect.left = 0;
            }
            int spinnerPaddingLeft = Cv.this.getPaddingLeft();
            int spinnerPaddingRight = Cv.this.getPaddingRight();
            int spinnerWidth = Cv.this.getWidth();
            Cv vVar = Cv.this;
            int i = vVar.f۱۲۳۵۷i;
            if (i == -2) {
                int contentWidth = vVar.m۱۵۶۳۸a((SpinnerAdapter) this.f۱۲۳۶۴L, m۱۵۴۹۸c());
                int i2 = Cv.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = Cv.this.f۱۲۳۵۸j;
                int contentWidthLimit = (i2 - rect2.left) - rect2.right;
                if (contentWidth > contentWidthLimit) {
                    contentWidth = contentWidthLimit;
                }
                m۱۵۴۹۶b(Math.max(contentWidth, (spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight));
            } else if (i == -1) {
                m۱۵۴۹۶b((spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight);
            } else {
                m۱۵۴۹۶b(i);
            }
            if (Cr1.m۱۵۵۶۷a(Cv.this)) {
                hOffset = hOffset2 + ((spinnerWidth - spinnerPaddingRight) - m۱۵۵۱۰i());
            } else {
                hOffset = hOffset2 + spinnerPaddingLeft;
            }
            m۱۵۵۰۱d(hOffset);
        }

        @Override // android.support.p۰۴۷v7.widget.Cp0, android.support.p۰۴۷v7.view.menu.AbstractCt
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۵۶۴۵d() {
            ViewTreeObserver vto;
            boolean wasShowing = m۱۵۵۰۳e();
            m۱۵۶۴۶l();
            m۱۵۵۰۲e(2);
            super.m۱۵۵۰۰d();
            m۱۵۵۰۴f().setChoiceMode(1);
            m۱۵۵۰۷g(Cv.this.getSelectedItemPosition());
            if (!wasShowing && (vto = Cv.this.getViewTreeObserver()) != null) {
                ViewTreeObserver.OnGlobalLayoutListener layoutListener = new ViewTreeObserver$OnGlobalLayoutListenerCb();
                vto.addOnGlobalLayoutListener(layoutListener);
                m۱۵۴۹۳a(new Cc(layoutListener));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v7.widget.v$c$b  reason: invalid class name */
        public class ViewTreeObserver$OnGlobalLayoutListenerCb implements ViewTreeObserver.OnGlobalLayoutListener {
            ViewTreeObserver$OnGlobalLayoutListenerCb() {
            }

            public void onGlobalLayout() {
                Cc cVar = Cc.this;
                if (!cVar.m۱۵۶۴۴b(Cv.this)) {
                    Cc.this.dismiss();
                    return;
                }
                Cc.this.m۱۵۶۴۶l();
                Cc.super.m۱۵۵۰۰d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v7.widget.v$c$c  reason: invalid class name */
        public class Cc implements PopupWindow.OnDismissListener {

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f۱۲۳۶۹c;

            Cc(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f۱۲۳۶۹c = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver vto = Cv.this.getViewTreeObserver();
                if (vto != null) {
                    vto.removeGlobalOnLayoutListener(this.f۱۲۳۶۹c);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۵۶۴۴b(View view) {
            return Cu.m۱۳۰۲۷x(view) && view.getGlobalVisibleRect(this.f۱۲۳۶۵M);
        }
    }
}
