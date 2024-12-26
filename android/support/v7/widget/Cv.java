package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.Cu;
import android.support.v4.view.InterfaceCt;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;

/* renamed from: android.support.v7.widget.v, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cv extends Spinner implements InterfaceCt {

    /* renamed from: k, reason: contains not printable characters */
    private static final int[] f۱۲۳۵۰k = {R.attr.spinnerMode};

    /* renamed from: c, reason: contains not printable characters */
    private final Cf f۱۲۳۵۱c;

    /* renamed from: d, reason: contains not printable characters */
    private final Context f۱۲۳۵۲d;

    /* renamed from: e, reason: contains not printable characters */
    private AbstractViewOnTouchListenerCl0 f۱۲۳۵۳e;

    /* renamed from: f, reason: contains not printable characters */
    private SpinnerAdapter f۱۲۳۵۴f;

    /* renamed from: g, reason: contains not printable characters */
    private final boolean f۱۲۳۵۵g;

    /* renamed from: h, reason: contains not printable characters */
    c f۱۲۳۵۶h;

    /* renamed from: i, reason: contains not printable characters */
    int f۱۲۳۵۷i;

    /* renamed from: j, reason: contains not printable characters */
    final Rect f۱۲۳۵۸j;

    public Cv(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.spinnerStyle);
    }

    public Cv(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, -1);
    }

    public Cv(Context context, AttributeSet attrs, int defStyleAttr, int mode) {
        this(context, attrs, defStyleAttr, mode, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r3 == null) goto L۳۳;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Cv(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f۱۲۳۵۸j = r0
            int[] r0 = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.Spinner
            r1 = 0
            android.support.v7.widget.j1 r0 = android.support.v7.widget.Cj1.m۱۳۲۷۵a(r9, r10, r0, r11, r1)
            android.support.v7.widget.f r2 = new android.support.v7.widget.f
            r2.<init>(r8)
            r8.f۱۲۳۵۱c = r2
            r2 = 0
            if (r13 == 0) goto L23
            a.b.h.f.d r3 = new a.b.h.f.d
            r3.<init>(r9, r13)
            r8.f۱۲۳۵۲d = r3
            goto L3e
        L23:
            int r3 = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.Spinner_popupTheme
            int r3 = r0.m۱۳۲۹۳g(r3, r1)
            if (r3 == 0) goto L33
            a.b.h.f.d r4 = new a.b.h.f.d
            r4.<init>(r9, r3)
            r8.f۱۲۳۵۲d = r4
            goto L3e
        L33:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 >= r5) goto L3b
            r4 = r9
            goto L3c
        L3b:
            r4 = r2
        L3c:
            r8.f۱۲۳۵۲d = r4
        L3e:
            android.content.Context r3 = r8.f۱۲۳۵۲d
            r4 = 1
            if (r3 == 0) goto Lab
            r3 = -1
            if (r12 != r3) goto L73
            r3 = 0
            int[] r5 = android.support.v7.widget.Cv.f۱۲۳۵۰k     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            android.content.res.TypedArray r5 = r9.obtainStyledAttributes(r10, r5, r11, r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            r3 = r5
            boolean r5 = r3.hasValue(r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            if (r5 == 0) goto L59
            int r5 = r3.getInt(r1, r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            r12 = r5
        L59:
            if (r3 == 0) goto L73
        L5b:
            r3.recycle()
            goto L73
        L5f:
            r1 = move-exception
            goto L6d
        L61:
            r5 = move-exception
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L73
            goto L5b
        L6d:
            if (r3 == 0) goto L72
            r3.recycle()
        L72:
            throw r1
        L73:
            if (r12 != r4) goto Lab
            android.support.v7.widget.v$c r3 = new android.support.v7.widget.v$c
            android.content.Context r5 = r8.f۱۲۳۵۲d
            r3.<init>(r5, r10, r11)
            android.content.Context r5 = r8.f۱۲۳۵۲d
            int[] r6 = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.Spinner
            android.support.v7.widget.j1 r1 = android.support.v7.widget.Cj1.m۱۳۲۷۵a(r5, r10, r6, r11, r1)
            int r5 = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.Spinner_android_dropDownWidth
            r6 = -2
            int r5 = r1.m۱۳۲۹۱f(r5, r6)
            r8.f۱۲۳۵۷i = r5
            int r5 = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r5 = r1.m۱۳۲۸۴b(r5)
            r3.m۱۳۴۱۹a(r5)
            int r5 = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.Spinner_android_prompt
            java.lang.String r5 = r0.m۱۳۲۸۸d(r5)
            r3.m۱۳۵۷۳a(r5)
            r1.m۱۳۲۸۰a()
            r8.f۱۲۳۵۶h = r3
            android.support.v7.widget.v$a r5 = new android.support.v7.widget.v$a
            r5.<init>(r8, r3)
            r8.f۱۲۳۵۳e = r5
        Lab:
            int r1 = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.Spinner_android_entries
            java.lang.CharSequence[] r1 = r0.m۱۳۲۹۲f(r1)
            if (r1 == 0) goto Lc3
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r9, r5, r1)
            int r5 = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cg.support_simple_spinner_dropdown_item
            r3.setDropDownViewResource(r5)
            r8.setAdapter(r3)
        Lc3:
            r0.m۱۳۲۸۰a()
            r8.f۱۲۳۵۵g = r4
            android.widget.SpinnerAdapter r3 = r8.f۱۲۳۵۴f
            if (r3 == 0) goto Ld1
            r8.setAdapter(r3)
            r8.f۱۲۳۵۴f = r2
        Ld1:
            android.support.v7.widget.f r2 = r8.f۱۲۳۵۱c
            r2.m۱۳۱۳۲a(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Cv.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: android.support.v7.widget.v$a */
    class a extends AbstractViewOnTouchListenerCl0 {

        /* renamed from: l, reason: contains not printable characters */
        final /* synthetic */ c f۱۲۳۵۹l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View src, c cVar) {
            super(src);
            this.f۱۲۳۵۹l = cVar;
        }

        @Override // android.support.v7.widget.AbstractViewOnTouchListenerCl0
        /* renamed from: a, reason: contains not printable characters */
        public android.support.v7.view.menu.InterfaceCt mo۱۳۵۶۹a() {
            return this.f۱۲۳۵۹l;
        }

        @Override // android.support.v7.widget.AbstractViewOnTouchListenerCl0
        /* renamed from: b, reason: contains not printable characters */
        public boolean mo۱۳۵۷۰b() {
            if (!Cv.this.f۱۲۳۵۶h.mo۱۳۴۳۳e()) {
                Cv.this.f۱۲۳۵۶h.mo۱۳۵۷۵d();
                return true;
            }
            return true;
        }
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        if (this.f۱۲۳۵۶h != null) {
            return this.f۱۲۳۵۲d;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable background) {
        c cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            cVar.m۱۳۴۱۹a(background);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(background);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int resId) {
        setPopupBackgroundDrawable(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۴c(getPopupContext(), resId));
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        c cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            return cVar.m۱۳۴۲۸c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int pixels) {
        c cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            cVar.m۱۳۴۳۹h(pixels);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(pixels);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        c cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            return cVar.m۱۳۴۳۸h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int pixels) {
        c cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            cVar.m۱۳۴۳۱d(pixels);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(pixels);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        c cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            return cVar.m۱۳۴۳۶g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int pixels) {
        if (this.f۱۲۳۵۶h != null) {
            this.f۱۲۳۵۷i = pixels;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(pixels);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f۱۲۳۵۶h != null) {
            return this.f۱۲۳۵۷i;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @Override // android.widget.AdapterView
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
            this.f۱۲۳۵۶h.mo۱۳۵۷۲a(new b(adapter, popupContext.getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f۱۲۳۵۶h;
        if (cVar != null && cVar.mo۱۳۴۳۳e()) {
            this.f۱۲۳۵۶h.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractViewOnTouchListenerCl0 abstractViewOnTouchListenerCl0 = this.f۱۲۳۵۳e;
        if (abstractViewOnTouchListenerCl0 != null && abstractViewOnTouchListenerCl0.onTouch(this, event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f۱۲۳۵۶h == null || View.MeasureSpec.getMode(widthMeasureSpec) != Integer.MIN_VALUE) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(Math.min(Math.max(measuredWidth, m۱۳۵۶۸a(getAdapter(), getBackground())), View.MeasureSpec.getSize(widthMeasureSpec)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        c cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            if (!cVar.mo۱۳۴۳۳e()) {
                this.f۱۲۳۵۶h.mo۱۳۵۷۵d();
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence prompt) {
        c cVar = this.f۱۲۳۵۶h;
        if (cVar != null) {
            cVar.m۱۳۵۷۳a(prompt);
        } else {
            super.setPrompt(prompt);
        }
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        c cVar = this.f۱۲۳۵۶h;
        return cVar != null ? cVar.m۱۳۵۷۷m() : super.getPrompt();
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        Cf cf = this.f۱۲۳۵۱c;
        if (cf != null) {
            cf.m۱۳۱۲۸a(resId);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        Cf cf = this.f۱۲۳۵۱c;
        if (cf != null) {
            cf.m۱۳۱۳۱a(background);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public void setSupportBackgroundTintList(ColorStateList tint) {
        Cf cf = this.f۱۲۳۵۱c;
        if (cf != null) {
            cf.m۱۳۱۳۴b(tint);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public ColorStateList getSupportBackgroundTintList() {
        Cf cf = this.f۱۲۳۵۱c;
        if (cf != null) {
            return cf.m۱۳۱۳۳b();
        }
        return null;
    }

    @Override // android.support.v4.view.InterfaceCt
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        Cf cf = this.f۱۲۳۵۱c;
        if (cf != null) {
            cf.m۱۳۱۳۰a(tintMode);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Cf cf = this.f۱۲۳۵۱c;
        if (cf != null) {
            return cf.m۱۳۱۳۵c();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Cf cf = this.f۱۲۳۵۱c;
        if (cf != null) {
            cf.m۱۳۱۲۷a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    int m۱۳۵۶۸a(SpinnerAdapter adapter, Drawable background) {
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
        int count = end - start;
        for (int i = Math.max(0, start - (15 - count)); i < end; i++) {
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
        if (background != null) {
            background.getPadding(this.f۱۲۳۵۸j);
            Rect rect = this.f۱۲۳۵۸j;
            return width + rect.left + rect.right;
        }
        return width;
    }

    /* renamed from: android.support.v7.widget.v$b */
    private static class b implements ListAdapter, SpinnerAdapter {

        /* renamed from: c, reason: contains not printable characters */
        private SpinnerAdapter f۱۲۳۶۱c;

        /* renamed from: d, reason: contains not printable characters */
        private ListAdapter f۱۲۳۶۲d;

        public b(SpinnerAdapter adapter, Resources.Theme dropDownTheme) {
            this.f۱۲۳۶۱c = adapter;
            if (adapter instanceof ListAdapter) {
                this.f۱۲۳۶۲d = (ListAdapter) adapter;
            }
            if (dropDownTheme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (adapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedAdapter = (ThemedSpinnerAdapter) adapter;
                    if (themedAdapter.getDropDownViewTheme() != dropDownTheme) {
                        themedAdapter.setDropDownViewTheme(dropDownTheme);
                        return;
                    }
                    return;
                }
                if (adapter instanceof InterfaceCf1) {
                    InterfaceCf1 themedAdapter2 = (InterfaceCf1) adapter;
                    if (themedAdapter2.getDropDownViewTheme() == null) {
                        themedAdapter2.setDropDownViewTheme(dropDownTheme);
                    }
                }
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(position);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(position);
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            return getDropDownView(position, convertView, parent);
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(position, convertView, parent);
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(observer);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f۱۲۳۶۱c;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(observer);
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter adapter = this.f۱۲۳۶۲d;
            if (adapter != null) {
                return adapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int position) {
            ListAdapter adapter = this.f۱۲۳۶۲d;
            if (adapter != null) {
                return adapter.isEnabled(position);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int position) {
            return 0;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    /* renamed from: android.support.v7.widget.v$c */
    private class c extends Cp0 {

        /* renamed from: K, reason: contains not printable characters */
        private CharSequence f۱۲۳۶۳K;

        /* renamed from: L, reason: contains not printable characters */
        ListAdapter f۱۲۳۶۴L;

        /* renamed from: M, reason: contains not printable characters */
        private final Rect f۱۲۳۶۵M;

        public c(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            this.f۱۲۳۶۵M = new Rect();
            m۱۳۴۲۰a(Cv.this);
            m۱۳۴۲۴a(true);
            m۱۳۴۳۵f(0);
            m۱۳۴۲۱a(new a(Cv.this));
        }

        /* renamed from: android.support.v7.widget.v$c$a */
        class a implements AdapterView.OnItemClickListener {
            a(Cv cv) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Cv.this.setSelection(position);
                if (Cv.this.getOnItemClickListener() != null) {
                    c cVar = c.this;
                    Cv.this.performItemClick(v, position, cVar.f۱۲۳۶۴L.getItemId(position));
                }
                c.this.dismiss();
            }
        }

        @Override // android.support.v7.widget.Cp0
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۵۷۲a(ListAdapter adapter) {
            super.mo۱۳۵۷۲a(adapter);
            this.f۱۲۳۶۴L = adapter;
        }

        /* renamed from: m, reason: contains not printable characters */
        public CharSequence m۱۳۵۷۷m() {
            return this.f۱۲۳۶۳K;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۱۳۵۷۳a(CharSequence hintText) {
            this.f۱۲۳۶۳K = hintText;
        }

        /* renamed from: l, reason: contains not printable characters */
        void m۱۳۵۷۶l() {
            int hOffset;
            Drawable background = m۱۳۴۲۸c();
            int hOffset2 = 0;
            if (background != null) {
                background.getPadding(Cv.this.f۱۲۳۵۸j);
                hOffset2 = Cr1.m۱۳۴۹۷a(Cv.this) ? Cv.this.f۱۲۳۵۸j.right : -Cv.this.f۱۲۳۵۸j.left;
            } else {
                Rect rect = Cv.this.f۱۲۳۵۸j;
                rect.right = 0;
                rect.left = 0;
            }
            int spinnerPaddingLeft = Cv.this.getPaddingLeft();
            int spinnerPaddingRight = Cv.this.getPaddingRight();
            int spinnerWidth = Cv.this.getWidth();
            Cv cv = Cv.this;
            int i = cv.f۱۲۳۵۷i;
            if (i == -2) {
                int contentWidth = cv.m۱۳۵۶۸a((SpinnerAdapter) this.f۱۲۳۶۴L, m۱۳۴۲۸c());
                int i2 = Cv.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = Cv.this.f۱۲۳۵۸j;
                int contentWidthLimit = (i2 - rect2.left) - rect2.right;
                if (contentWidth > contentWidthLimit) {
                    contentWidth = contentWidthLimit;
                }
                m۱۳۴۲۶b(Math.max(contentWidth, (spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight));
            } else if (i == -1) {
                m۱۳۴۲۶b((spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight);
            } else {
                m۱۳۴۲۶b(i);
            }
            if (Cr1.m۱۳۴۹۷a(Cv.this)) {
                hOffset = hOffset2 + ((spinnerWidth - spinnerPaddingRight) - m۱۳۴۴۰i());
            } else {
                hOffset = hOffset2 + spinnerPaddingLeft;
            }
            m۱۳۴۳۱d(hOffset);
        }

        @Override // android.support.v7.widget.Cp0, android.support.v7.view.menu.InterfaceCt
        /* renamed from: d, reason: contains not printable characters */
        public void mo۱۳۵۷۵d() {
            ViewTreeObserver vto;
            boolean wasShowing = mo۱۳۴۳۳e();
            m۱۳۵۷۶l();
            m۱۳۴۳۲e(2);
            super.mo۱۳۵۷۵d();
            ListView listView = mo۱۳۴۳۴f();
            listView.setChoiceMode(1);
            m۱۳۴۳۷g(Cv.this.getSelectedItemPosition());
            if (!wasShowing && (vto = Cv.this.getViewTreeObserver()) != null) {
                ViewTreeObserver.OnGlobalLayoutListener layoutListener = new b();
                vto.addOnGlobalLayoutListener(layoutListener);
                m۱۳۴۲۳a(new C۱۴۲۹c(layoutListener));
            }
        }

        /* renamed from: android.support.v7.widget.v$c$b */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                c cVar = c.this;
                if (!cVar.m۱۳۵۷۴b(Cv.this)) {
                    c.this.dismiss();
                } else {
                    c.this.m۱۳۵۷۶l();
                    c.super.mo۱۳۵۷۵d();
                }
            }
        }

        /* renamed from: android.support.v7.widget.v$c$c, reason: collision with other inner class name */
        class C۱۴۲۹c implements PopupWindow.OnDismissListener {

            /* renamed from: c, reason: contains not printable characters */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f۱۲۳۶۹c;

            C۱۴۲۹c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f۱۲۳۶۹c = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver vto = Cv.this.getViewTreeObserver();
                if (vto != null) {
                    vto.removeGlobalOnLayoutListener(this.f۱۲۳۶۹c);
                }
            }
        }

        /* renamed from: b, reason: contains not printable characters */
        boolean m۱۳۵۷۴b(View view) {
            return Cu.m۱۰۹۵۷x(view) && view.getGlobalVisibleRect(this.f۱۲۳۶۵M);
        }
    }
}
