package com.rey.material.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۳d.Ca;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.Cb;

public class Spinner extends Ca implements Ca.AbstractCc {

    /* renamed from: A  reason: contains not printable characters */
    private View$OnClickListenerCd f۱۵۱۴۷A;

    /* renamed from: B  reason: contains not printable characters */
    private Cj f۱۵۱۴۸B = new Cj(this, null);

    /* renamed from: C  reason: contains not printable characters */
    private boolean f۱۵۱۴۹C;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۱۵۱۵۰f;

    /* renamed from: g  reason: contains not printable characters */
    private TextView f۱۵۱۵۱g;

    /* renamed from: h  reason: contains not printable characters */
    private SpinnerAdapter f۱۵۱۵۲h;

    /* renamed from: i  reason: contains not printable characters */
    private AbstractCf f۱۵۱۵۳i;

    /* renamed from: j  reason: contains not printable characters */
    private AbstractCg f۱۵۱۵۴j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۵۱۵۵k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۵۱۵۶l;

    /* renamed from: m  reason: contains not printable characters */
    private Ce f۱۵۱۵۷m;

    /* renamed from: n  reason: contains not printable characters */
    private int f۱۵۱۵۸n;

    /* renamed from: o  reason: contains not printable characters */
    private p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.Ca f۱۵۱۵۹o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۵۱۶۰p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۵۱۶۱q;

    /* renamed from: r  reason: contains not printable characters */
    private boolean f۱۵۱۶۲r;

    /* renamed from: s  reason: contains not printable characters */
    private Cb f۱۵۱۶۳s;

    /* renamed from: t  reason: contains not printable characters */
    private int f۱۵۱۶۴t;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۵۱۶۵u;

    /* renamed from: v  reason: contains not printable characters */
    private int f۱۵۱۶۶v;

    /* renamed from: w  reason: contains not printable characters */
    private boolean f۱۵۱۶۷w;

    /* renamed from: x  reason: contains not printable characters */
    private int f۱۵۱۶۸x;

    /* renamed from: y  reason: contains not printable characters */
    private Ch f۱۵۱۶۹y = new Ch(this, null);

    /* renamed from: z  reason: contains not printable characters */
    private Rect f۱۵۱۷۰z = new Rect();

    /* renamed from: com.rey.material.widget.Spinner$f  reason: invalid class name */
    public interface AbstractCf {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۸۱۱۹a(Spinner spinner, View view, int i, long j);
    }

    /* renamed from: com.rey.material.widget.Spinner$g  reason: invalid class name */
    public interface AbstractCg {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۱۲۰a(Spinner spinner, View view, int i, long j);
    }

    public Spinner(Context context) {
        super(context, null, p۰۵۲b.p۱۱۱j.p۱۱۲a.Ca.listPopupWindowStyle);
    }

    public Spinner(Context context, AttributeSet attrs) {
        super(context, attrs, p۰۵۲b.p۱۱۱j.p۱۱۲a.Ca.listPopupWindowStyle);
    }

    public Spinner(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /* access modifiers changed from: protected */
    @Override // com.rey.material.widget.Ca
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۱۱۰b(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f۱۵۱۵۰f = false;
        this.f۱۵۱۵۸n = -2;
        this.f۱۵۱۶۲r = false;
        this.f۱۵۱۶۶v = 17;
        this.f۱۵۱۶۷w = false;
        this.f۱۵۱۶۸x = -1;
        this.f۱۵۱۴۹C = false;
        setWillNotDraw(false);
        this.f۱۵۱۵۷m = new Ce(context, attrs, defStyleAttr, defStyleRes);
        this.f۱۵۱۵۷m.m۱۸۱۵۰a(true);
        if (isInEditMode()) {
            m۱۸۱۲۹a(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cb.Material_Widget_Spinner);
        }
        setOnClickListener(new View$OnClickListenerCa());
        super.m۱۸۱۳۲b(context, attrs, defStyleAttr, defStyleRes);
    }

    /* renamed from: com.rey.material.widget.Spinner$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View v) {
            Spinner.this.m۱۸۱۰۲d();
        }
    }

    private TextView getLabelView() {
        if (this.f۱۵۱۵۱g == null) {
            this.f۱۵۱۵۱g = new TextView(getContext());
            if (Build.VERSION.SDK_INT >= 17) {
                this.f۱۵۱۵۱g.setTextDirection(this.f۱۵۱۴۹C ? 4 : 3);
            }
            this.f۱۵۱۵۱g.setSingleLine(true);
            this.f۱۵۱۵۱g.setDuplicateParentStateEnabled(true);
        }
        return this.f۱۵۱۵۱g;
    }

    /* JADX INFO: Multiple debug info for r2v49 android.view.animation.Interpolator: [D('resId' int), D('arrowInterpolator' android.view.animation.Interpolator)] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ef  */
    @Override // com.rey.material.widget.Ca
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۸۱۰۸a(android.content.Context r24, android.util.AttributeSet r25, int r26, int r27) {
        /*
        // Method dump skipped, instructions count: 768
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rey.material.widget.Spinner.m۱۸۱۰۸a(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int layoutDirection) {
        boolean rtl = true;
        if (layoutDirection != 1) {
            rtl = false;
        }
        if (this.f۱۵۱۴۹C != rtl) {
            this.f۱۵۱۴۹C = rtl;
            TextView textView = this.f۱۵۱۵۱g;
            if (textView != null && Build.VERSION.SDK_INT >= 17) {
                textView.setTextDirection(this.f۱۵۱۴۹C ? 4 : 3);
            }
            requestLayout();
        }
    }

    public View getSelectedView() {
        View v = getChildAt(getChildCount() - 1);
        if (v == this.f۱۵۱۵۱g) {
            return null;
        }
        return v;
    }

    public void setSelection(int position) {
        SpinnerAdapter spinnerAdapter = this.f۱۵۱۵۲h;
        if (spinnerAdapter != null) {
            position = Math.max(0, Math.min(position, spinnerAdapter.getCount() - 1));
        }
        if (this.f۱۵۱۶۸x != position) {
            this.f۱۵۱۶۸x = position;
            AbstractCg gVar = this.f۱۵۱۵۴j;
            if (gVar != null) {
                View selectedView = getSelectedView();
                SpinnerAdapter spinnerAdapter2 = this.f۱۵۱۵۲h;
                gVar.m۱۸۱۲۰a(this, selectedView, position, spinnerAdapter2 == null ? -1 : spinnerAdapter2.getItemId(position));
            }
            m۱۸۰۹۸b();
        }
    }

    public int getSelectedItemPosition() {
        return this.f۱۵۱۶۸x;
    }

    public Object getSelectedItem() {
        SpinnerAdapter spinnerAdapter = this.f۱۵۱۵۲h;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(this.f۱۵۱۶۸x);
    }

    public SpinnerAdapter getAdapter() {
        return this.f۱۵۱۵۲h;
    }

    public void setAdapter(SpinnerAdapter adapter) {
        SpinnerAdapter spinnerAdapter = this.f۱۵۱۵۲h;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(this.f۱۵۱۴۸B);
        }
        this.f۱۵۱۶۹y.m۱۸۱۲۲a();
        this.f۱۵۱۵۲h = adapter;
        this.f۱۵۱۵۲h.registerDataSetObserver(this.f۱۵۱۴۸B);
        m۱۸۰۹۷a();
        Ce eVar = this.f۱۵۱۵۷m;
        if (eVar != null) {
            eVar.m۱۸۱۱۵a(new View$OnClickListenerCd(adapter));
        } else {
            this.f۱۵۱۴۷A = new View$OnClickListenerCd(adapter);
        }
    }

    public void setPopupBackgroundDrawable(Drawable background) {
        this.f۱۵۱۵۷m.m۱۸۱۴۶a(background);
    }

    public void setPopupBackgroundResource(int resId) {
        setPopupBackgroundDrawable(getContext().getDrawable(resId));
    }

    public Drawable getPopupBackground() {
        return this.f۱۵۱۵۷m.m۱۸۱۵۵d();
    }

    public void setDropDownVerticalOffset(int pixels) {
        this.f۱۵۱۵۷m.m۱۸۱۶۲g(pixels);
    }

    public int getDropDownVerticalOffset() {
        return this.f۱۵۱۵۷m.m۱۸۱۶۱g();
    }

    public void setDropDownHorizontalOffset(int pixels) {
        this.f۱۵۱۵۷m.m۱۸۱۵۲b(pixels);
    }

    public int getDropDownHorizontalOffset() {
        return this.f۱۵۱۵۷m.m۱۸۱۵۷e();
    }

    public void setDropDownWidth(int pixels) {
        this.f۱۵۱۵۸n = pixels;
    }

    public int getDropDownWidth() {
        return this.f۱۵۱۵۸n;
    }

    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (this.f۱۵۱۶۷w) {
            int count = getChildCount();
            for (int i = 0; i < count; i++) {
                getChildAt(i).setEnabled(enabled);
            }
        }
    }

    public void setMinimumHeight(int minHeight) {
        this.f۱۵۱۵۶l = minHeight;
        super.setMinimumHeight(minHeight);
    }

    public void setMinimumWidth(int minWidth) {
        this.f۱۵۱۵۵k = minWidth;
        super.setMinimumWidth(minWidth);
    }

    public void setGravity(int gravity) {
        if (this.f۱۵۱۶۶v != gravity) {
            if ((gravity & 7) == 0) {
                gravity |= 8388611;
            }
            this.f۱۵۱۶۶v = gravity;
            requestLayout();
        }
    }

    public int getBaseline() {
        int childBaseline;
        View child = getSelectedView();
        if (child == null || (childBaseline = child.getBaseline()) < 0) {
            return -1;
        }
        int paddingTop = getPaddingTop();
        TextView textView = this.f۱۵۱۵۱g;
        if (textView != null) {
            paddingTop += textView.getMeasuredHeight();
        }
        int remainHeight = ((getMeasuredHeight() - paddingTop) - getPaddingBottom()) - getDividerDrawableHeight();
        int verticalGravity = this.f۱۵۱۶۶v & 112;
        if (verticalGravity == 48) {
            return paddingTop + childBaseline;
        }
        if (verticalGravity != 80) {
            return ((remainHeight - child.getMeasuredHeight()) / 2) + paddingTop + childBaseline;
        }
        return ((paddingTop + remainHeight) - child.getMeasuredHeight()) + childBaseline;
    }

    /* access modifiers changed from: protected */
    @Override // com.rey.material.widget.Ca
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Ce eVar = this.f۱۵۱۵۷m;
        if (eVar != null && eVar.m۱۸۱۶۶j()) {
            this.f۱۵۱۵۷m.m۱۸۱۵۱b();
        }
    }

    public void setOnItemClickListener(AbstractCf l) {
        this.f۱۵۱۵۳i = l;
    }

    public void setOnItemSelectedListener(AbstractCg l) {
        this.f۱۵۱۵۴j = l;
    }

    public boolean onInterceptTouchEvent(MotionEvent event) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || this.f۱۵۱۵۹o == who || this.f۱۵۱۶۳s == who;
    }

    private int getArrowDrawableWidth() {
        if (this.f۱۵۱۵۹o != null) {
            return this.f۱۵۱۶۰p + (this.f۱۵۱۶۱q * 2);
        }
        return 0;
    }

    private int getDividerDrawableHeight() {
        int i = this.f۱۵۱۶۴t;
        if (i > 0) {
            return i + this.f۱۵۱۶۵u;
        }
        return 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۸۰۹۳a(int availableSize, int size) {
        if (size != -2) {
            if (size != -1) {
                return View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            }
            if (availableSize > 0) {
                return View.MeasureSpec.makeMeasureSpec(availableSize, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        } else if (availableSize > 0) {
            return View.MeasureSpec.makeMeasureSpec(availableSize, Integer.MIN_VALUE);
        } else {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int hs;
        int viewWidth;
        int viewHeight;
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int paddingHorizontal = getPaddingLeft() + getPaddingRight() + getArrowDrawableWidth();
        int paddingVertical = getPaddingTop() + getPaddingBottom() + getDividerDrawableHeight();
        int labelWidth = 0;
        int labelHeight = 0;
        TextView textView = this.f۱۵۱۵۱g;
        if (!(textView == null || textView.getLayoutParams() == null)) {
            this.f۱۵۱۵۱g.measure(View.MeasureSpec.makeMeasureSpec(widthMode == 0 ? 0 : widthSize - paddingHorizontal, widthMode), View.MeasureSpec.makeMeasureSpec(0, 0));
            labelWidth = this.f۱۵۱۵۱g.getMeasuredWidth();
            labelHeight = this.f۱۵۱۵۱g.getMeasuredHeight();
        }
        int width = 0;
        int height = 0;
        View v = getSelectedView();
        if (v != null) {
            ViewGroup.LayoutParams params = v.getLayoutParams();
            int ws = m۱۸۰۹۳a(widthSize - paddingHorizontal, params.width);
            hs = m۱۸۰۹۳a((heightSize - paddingVertical) - this.f۱۵۱۵۱g.getMeasuredHeight(), params.height);
            v.measure(ws, hs);
            width = v.getMeasuredWidth();
            height = v.getMeasuredHeight();
        } else {
            hs = 0;
        }
        int width2 = Math.max(this.f۱۵۱۵۵k, Math.max(labelWidth, width) + paddingHorizontal);
        int height2 = Math.max(this.f۱۵۱۵۶l, height + labelHeight + paddingVertical);
        if (widthMode == Integer.MIN_VALUE) {
            width2 = Math.min(widthSize, width2);
        } else if (widthMode == 1073741824) {
            width2 = widthSize;
        }
        if (heightMode == Integer.MIN_VALUE) {
            height2 = Math.min(heightSize, height2);
        } else if (heightMode == 1073741824) {
            height2 = heightSize;
        }
        setMeasuredDimension(width2, height2);
        if (v != null) {
            ViewGroup.LayoutParams params2 = v.getLayoutParams();
            int i = params2.width;
            if (i == -2) {
                viewWidth = v.getMeasuredWidth();
            } else if (i != -1) {
                viewWidth = params2.width;
            } else {
                viewWidth = width2 - paddingHorizontal;
            }
            int i2 = params2.height;
            if (i2 == -2) {
                viewHeight = v.getMeasuredHeight();
            } else if (i2 != -1) {
                viewHeight = params2.height;
            } else {
                viewHeight = (height2 - labelHeight) - paddingVertical;
            }
            if (v.getMeasuredWidth() != viewWidth || v.getMeasuredHeight() != viewHeight) {
                v.measure(View.MeasureSpec.makeMeasureSpec(viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(viewHeight, 1073741824));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int x;
        int y;
        int w = r - l;
        int h = b - t;
        int arrowWidth = getArrowDrawableWidth();
        if (this.f۱۵۱۵۹o != null) {
            int paddingTop = getPaddingTop();
            TextView textView = this.f۱۵۱۵۱g;
            int top = paddingTop + (textView == null ? 0 : textView.getMeasuredHeight());
            int bottom = (h - getDividerDrawableHeight()) - getPaddingBottom();
            if (this.f۱۵۱۴۹C) {
                this.f۱۵۱۵۹o.setBounds(getPaddingLeft(), top, getPaddingLeft() + arrowWidth, bottom);
            } else {
                this.f۱۵۱۵۹o.setBounds((getWidth() - getPaddingRight()) - arrowWidth, top, getWidth() - getPaddingRight(), bottom);
            }
        }
        Cb bVar = this.f۱۵۱۶۳s;
        if (bVar != null) {
            bVar.setBounds(getPaddingLeft(), (h - this.f۱۵۱۶۴t) - getPaddingBottom(), w - getPaddingRight(), h - getPaddingBottom());
        }
        int childLeft = this.f۱۵۱۴۹C ? getPaddingLeft() + arrowWidth : getPaddingLeft();
        int childRight = this.f۱۵۱۴۹C ? w - getPaddingRight() : (w - getPaddingRight()) - arrowWidth;
        int childTop = getPaddingTop();
        int childBottom = h - getPaddingBottom();
        TextView textView2 = this.f۱۵۱۵۱g;
        if (textView2 != null) {
            if (this.f۱۵۱۴۹C) {
                textView2.layout(childRight - textView2.getMeasuredWidth(), childTop, childRight, this.f۱۵۱۵۱g.getMeasuredHeight() + childTop);
            } else {
                textView2.layout(childLeft, childTop, textView2.getMeasuredWidth() + childLeft, this.f۱۵۱۵۱g.getMeasuredHeight() + childTop);
            }
            childTop += this.f۱۵۱۵۱g.getMeasuredHeight();
        }
        View v = getSelectedView();
        if (v != null) {
            int horizontalGravity = this.f۱۵۱۶۶v & 7;
            if (horizontalGravity == 8388611) {
                horizontalGravity = this.f۱۵۱۴۹C ? 5 : 3;
            } else if (horizontalGravity == 8388613) {
                horizontalGravity = this.f۱۵۱۴۹C ? 3 : 5;
            }
            if (horizontalGravity == 1) {
                x = (((childRight - childLeft) - v.getMeasuredWidth()) / 2) + childLeft;
            } else if (horizontalGravity == 3) {
                x = childLeft;
            } else if (horizontalGravity != 5) {
                x = (((childRight - childLeft) - v.getMeasuredWidth()) / 2) + childLeft;
            } else {
                x = childRight - v.getMeasuredWidth();
            }
            int verticalGravity = this.f۱۵۱۶۶v & 112;
            if (verticalGravity == 16) {
                y = (((childBottom - childTop) - v.getMeasuredHeight()) / 2) + childTop;
            } else if (verticalGravity == 48) {
                y = childTop;
            } else if (verticalGravity != 80) {
                y = (((childBottom - childTop) - v.getMeasuredHeight()) / 2) + childTop;
            } else {
                y = childBottom - v.getMeasuredHeight();
            }
            v.layout(x, y, v.getMeasuredWidth() + x, v.getMeasuredHeight() + y);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Cb bVar = this.f۱۵۱۶۳s;
        if (bVar != null) {
            bVar.draw(canvas);
        }
        p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.Ca aVar = this.f۱۵۱۵۹o;
        if (aVar != null) {
            aVar.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.Ca aVar = this.f۱۵۱۵۹o;
        if (aVar != null) {
            aVar.setState(getDrawableState());
        }
        Cb bVar = this.f۱۵۱۶۳s;
        if (bVar != null) {
            bVar.setState(getDrawableState());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۱۰۹a(View view, int position, long id) {
        AbstractCf fVar = this.f۱۵۱۵۳i;
        if (fVar == null) {
            setSelection(position);
            return false;
        } else if (!fVar.m۱۸۱۱۹a(this, view, position, id)) {
            return true;
        } else {
            setSelection(position);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۰۹۷a() {
        int i = this.f۱۵۱۶۸x;
        if (i == -1) {
            setSelection(0);
        } else if (i < this.f۱۵۱۵۲h.getCount()) {
            m۱۸۰۹۸b();
        } else {
            setSelection(this.f۱۵۱۵۲h.getCount() - 1);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b  reason: contains not printable characters */
    private void m۱۸۰۹۸b() {
        if (this.f۱۵۱۵۲h != null) {
            if (this.f۱۵۱۵۱g == null) {
                removeAllViews();
            } else {
                for (int i = getChildCount() - 1; i > 0; i--) {
                    removeViewAt(i);
                }
            }
            int type = this.f۱۵۱۵۲h.getItemViewType(this.f۱۵۱۶۸x);
            View v = this.f۱۵۱۵۲h.getView(this.f۱۵۱۶۸x, this.f۱۵۱۶۹y.m۱۸۱۲۱a(type), this);
            v.setFocusable(false);
            v.setClickable(false);
            if (v.getParent() != null) {
                ((ViewGroup) v.getParent()).removeView(v);
            }
            super.addView(v);
            this.f۱۵۱۶۹y.m۱۸۱۲۳a(type, v);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d  reason: contains not printable characters */
    private void m۱۸۱۰۲d() {
        if (!this.f۱۵۱۵۷m.m۱۸۱۶۶j()) {
            this.f۱۵۱۵۷m.m۱۸۱۱۷k();
            Cc lv = this.f۱۵۱۵۷m.m۱۸۱۵۹f();
            if (lv != null) {
                if (Build.VERSION.SDK_INT >= 11) {
                    lv.setChoiceMode(1);
                }
                lv.setSelection(getSelectedItemPosition());
                if (this.f۱۵۱۵۹o != null && this.f۱۵۱۶۲r) {
                    lv.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerCb(lv));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.rey.material.widget.Spinner$b  reason: invalid class name */
    public class ViewTreeObserver$OnPreDrawListenerCb implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ Cc f۱۵۱۷۲c;

        ViewTreeObserver$OnPreDrawListenerCb(Cc cVar) {
            this.f۱۵۱۷۲c = cVar;
        }

        public boolean onPreDraw() {
            this.f۱۵۱۷۲c.getViewTreeObserver().removeOnPreDrawListener(this);
            Spinner.this.f۱۵۱۵۹o.m۱۶۴۳۹a(p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.Ca.f۱۲۹۹۵q, true);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c  reason: contains not printable characters */
    private void m۱۸۱۰۱c() {
        p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.Ca aVar = this.f۱۵۱۵۹o;
        if (aVar != null) {
            aVar.m۱۶۴۳۹a(p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.Ca.f۱۲۹۹۴p, true);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private int m۱۸۰۹۴a(SpinnerAdapter adapter, Drawable background) {
        if (adapter == null) {
            return 0;
        }
        int width = 0;
        View itemView = null;
        int itemType = 0;
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
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
                itemView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            }
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            width = Math.max(width, itemView.getMeasuredWidth());
        }
        if (background == null) {
            return width;
        }
        background.getPadding(this.f۱۵۱۷۰z);
        Rect rect = this.f۱۵۱۷۰z;
        return width + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.rey.material.widget.Spinner$i  reason: invalid class name */
    public static class Ci extends View.BaseSavedState {
        public static final Parcelable.Creator<Ci> CREATOR = new Ca();

        /* renamed from: c  reason: contains not printable characters */
        int f۱۵۱۸۵c;

        /* renamed from: d  reason: contains not printable characters */
        boolean f۱۵۱۸۶d;

        Ci(Parcelable superState) {
            super(superState);
        }

        Ci(Parcel in) {
            super(in);
            this.f۱۵۱۸۵c = in.readInt();
            this.f۱۵۱۸۶d = in.readByte() != 0;
        }

        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f۱۵۱۸۵c);
            out.writeByte(this.f۱۵۱۸۶d ? (byte) 1 : 0);
        }

        public String toString() {
            return "AbsSpinner.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f۱۵۱۸۵c + " showDropdown=" + this.f۱۵۱۸۶d + "}";
        }

        /* renamed from: com.rey.material.widget.Spinner$i$a  reason: invalid class name */
        static class Ca implements Parcelable.Creator<Ci> {
            Ca() {
            }

            @Override // android.os.Parcelable.Creator
            public Ci createFromParcel(Parcel in) {
                return new Ci(in);
            }

            @Override // android.os.Parcelable.Creator
            public Ci[] newArray(int size) {
                return new Ci[size];
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Ci ss = new Ci(super.onSaveInstanceState());
        ss.f۱۵۱۸۵c = getSelectedItemPosition();
        Ce eVar = this.f۱۵۱۵۷m;
        ss.f۱۵۱۸۶d = eVar != null && eVar.m۱۸۱۶۶j();
        return ss;
    }

    public void onRestoreInstanceState(Parcelable state) {
        ViewTreeObserver vto;
        Ci ss = (Ci) state;
        super.onRestoreInstanceState(ss.getSuperState());
        setSelection(ss.f۱۵۱۸۵c);
        if (ss.f۱۵۱۸۶d && (vto = getViewTreeObserver()) != null) {
            vto.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerCc());
        }
    }

    /* renamed from: com.rey.material.widget.Spinner$c  reason: invalid class name */
    class ViewTreeObserver$OnGlobalLayoutListenerCc implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerCc() {
        }

        public void onGlobalLayout() {
            Spinner.this.m۱۸۱۰۲d();
            ViewTreeObserver vto = Spinner.this.getViewTreeObserver();
            if (vto != null) {
                vto.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.rey.material.widget.Spinner$j  reason: invalid class name */
    public class Cj extends DataSetObserver {
        private Cj() {
        }

        /* synthetic */ Cj(Spinner x0, View$OnClickListenerCa x1) {
            this();
        }

        public void onChanged() {
            Spinner.this.m۱۸۰۹۷a();
        }

        public void onInvalidated() {
            Spinner.this.m۱۸۰۹۸b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.rey.material.widget.Spinner$h  reason: invalid class name */
    public class Ch {

        /* renamed from: a  reason: contains not printable characters */
        private final SparseArray<View> f۱۵۱۸۴a;

        private Ch(Spinner spinner) {
            this.f۱۵۱۸۴a = new SparseArray<>();
        }

        /* synthetic */ Ch(Spinner x0, View$OnClickListenerCa x1) {
            this(x0);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۱۲۳a(int type, View v) {
            this.f۱۵۱۸۴a.put(type, v);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public View m۱۸۱۲۱a(int type) {
            View result = this.f۱۵۱۸۴a.get(type);
            if (result != null) {
                this.f۱۵۱۸۴a.delete(type);
            }
            return result;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۱۲۲a() {
            this.f۱۵۱۸۴a.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.rey.material.widget.Spinner$d  reason: invalid class name */
    public static class View$OnClickListenerCd implements ListAdapter, SpinnerAdapter, View.OnClickListener {

        /* renamed from: c  reason: contains not printable characters */
        private SpinnerAdapter f۱۵۱۷۵c;

        /* renamed from: d  reason: contains not printable characters */
        private ListAdapter f۱۵۱۷۶d;

        /* renamed from: e  reason: contains not printable characters */
        private AdapterView.OnItemClickListener f۱۵۱۷۷e;

        public View$OnClickListenerCd(SpinnerAdapter adapter) {
            this.f۱۵۱۷۵c = adapter;
            if (adapter instanceof ListAdapter) {
                this.f۱۵۱۷۶d = (ListAdapter) adapter;
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۱۱۱a(AdapterView.OnItemClickListener listener) {
            this.f۱۵۱۷۷e = listener;
        }

        public void onClick(View v) {
            int position = ((Integer) v.getTag()).intValue();
            AdapterView.OnItemClickListener onItemClickListener = this.f۱۵۱۷۷e;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(null, v, position, 0);
            }
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f۱۵۱۷۵c;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public Object getItem(int position) {
            SpinnerAdapter spinnerAdapter = this.f۱۵۱۷۵c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(position);
        }

        public long getItemId(int position) {
            SpinnerAdapter spinnerAdapter = this.f۱۵۱۷۵c;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(position);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            View v = getDropDownView(position, convertView, parent);
            v.setOnClickListener(this);
            v.setTag(Integer.valueOf(position));
            return v;
        }

        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            SpinnerAdapter spinnerAdapter = this.f۱۵۱۷۵c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(position, convertView, parent);
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f۱۵۱۷۵c;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean areAllItemsEnabled() {
            ListAdapter adapter = this.f۱۵۱۷۶d;
            return adapter == null || adapter.areAllItemsEnabled();
        }

        public boolean isEnabled(int position) {
            ListAdapter adapter = this.f۱۵۱۷۶d;
            return adapter == null || adapter.isEnabled(position);
        }

        public int getItemViewType(int position) {
            ListAdapter adapter = this.f۱۵۱۷۶d;
            if (adapter != null) {
                return adapter.getItemViewType(position);
            }
            return 0;
        }

        public int getViewTypeCount() {
            ListAdapter adapter = this.f۱۵۱۷۶d;
            if (adapter != null) {
                return adapter.getViewTypeCount();
            }
            return 1;
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public void registerDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f۱۵۱۷۵c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(observer);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f۱۵۱۷۵c;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(observer);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.rey.material.widget.Spinner$e  reason: invalid class name */
    public class Ce extends Cb {

        /* renamed from: E  reason: contains not printable characters */
        private View$OnClickListenerCd f۱۵۱۷۸E;

        /* renamed from: F  reason: contains not printable characters */
        private ViewTreeObserver.OnGlobalLayoutListener f۱۵۱۷۹F = new ViewTreeObserver$OnGlobalLayoutListenerCa();

        /* renamed from: com.rey.material.widget.Spinner$e$a  reason: invalid class name */
        class ViewTreeObserver$OnGlobalLayoutListenerCa implements ViewTreeObserver.OnGlobalLayoutListener {
            ViewTreeObserver$OnGlobalLayoutListenerCa() {
            }

            public void onGlobalLayout() {
                Ce.this.m۱۸۱۱۸l();
                Ce.super.m۱۸۱۶۷k();
            }
        }

        public Ce(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            super(context, attrs, defStyleAttr, defStyleRes);
            m۱۸۱۴۷a(Spinner.this);
            m۱۸۱۵۰a(true);
            m۱۸۱۶۰f(0);
            m۱۸۱۴۹a(new Cb(Spinner.this));
        }

        /* renamed from: com.rey.material.widget.Spinner$e$b  reason: invalid class name */
        class Cb implements PopupWindow.OnDismissListener {
            Cb(Spinner spinner) {
            }

            @TargetApi(16)
            public void onDismiss() {
                ViewTreeObserver vto = Spinner.this.getViewTreeObserver();
                if (vto != null) {
                    if (Build.VERSION.SDK_INT >= 16) {
                        vto.removeOnGlobalLayoutListener(Ce.this.f۱۵۱۷۹F);
                    } else {
                        vto.removeGlobalOnLayoutListener(Ce.this.f۱۵۱۷۹F);
                    }
                }
                Spinner.this.m۱۸۱۰۱c();
            }
        }

        @Override // com.rey.material.widget.Cb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۱۱۵a(ListAdapter adapter) {
            super.m۱۸۱۴۸a(adapter);
            this.f۱۵۱۷۸E = (View$OnClickListenerCd) adapter;
            this.f۱۵۱۷۸E.m۱۸۱۱۱a(new Cc());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.rey.material.widget.Spinner$e$c  reason: invalid class name */
        public class Cc implements AdapterView.OnItemClickListener {
            Cc() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                Ce eVar = Ce.this;
                Spinner.this.m۱۸۱۰۹a(v, position, eVar.f۱۵۱۷۸E.getItemId(position));
                Ce.this.m۱۸۱۵۱b();
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۱۱۶a(CharSequence hintText) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l  reason: contains not printable characters */
        public void m۱۸۱۱۸l() {
            int hOffset;
            Drawable background = m۱۸۱۵۵d();
            int hOffset2 = 0;
            if (background != null) {
                background.getPadding(Spinner.this.f۱۵۱۷۰z);
                hOffset2 = Spinner.this.f۱۵۱۴۹C ? Spinner.this.f۱۵۱۷۰z.right : -Spinner.this.f۱۵۱۷۰z.left;
            } else {
                Rect rect = Spinner.this.f۱۵۱۷۰z;
                Spinner.this.f۱۵۱۷۰z.right = 0;
                rect.left = 0;
            }
            int spinnerPaddingLeft = Spinner.this.getPaddingLeft();
            int spinnerPaddingRight = Spinner.this.getPaddingRight();
            int spinnerWidth = Spinner.this.getWidth();
            if (Spinner.this.f۱۵۱۵۸n == -2) {
                int contentWidth = Spinner.this.m۱۸۰۹۴a((Spinner) this.f۱۵۱۷۸E, (SpinnerAdapter) m۱۸۱۵۵d());
                int contentWidthLimit = (Spinner.this.getContext().getResources().getDisplayMetrics().widthPixels - Spinner.this.f۱۵۱۷۰z.left) - Spinner.this.f۱۵۱۷۰z.right;
                if (contentWidth > contentWidthLimit) {
                    contentWidth = contentWidthLimit;
                }
                m۱۸۱۴۵a(Math.max(contentWidth, (spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight));
            } else if (Spinner.this.f۱۵۱۵۸n == -1) {
                m۱۸۱۴۵a((spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight);
            } else {
                m۱۸۱۴۵a(Spinner.this.f۱۵۱۵۸n);
            }
            if (Spinner.this.f۱۵۱۴۹C) {
                hOffset = hOffset2 + ((spinnerWidth - spinnerPaddingRight) - m۱۸۱۶۳h());
            } else {
                hOffset = hOffset2 + spinnerPaddingLeft;
            }
            m۱۸۱۵۲b(hOffset);
        }

        @Override // com.rey.material.widget.Cb
        /* renamed from: k  reason: contains not printable characters */
        public void m۱۸۱۱۷k() {
            ViewTreeObserver vto;
            boolean wasShowing = m۱۸۱۶۶j();
            m۱۸۱۱۸l();
            m۱۸۱۵۴c(2);
            super.m۱۸۱۶۷k();
            if (!wasShowing && (vto = Spinner.this.getViewTreeObserver()) != null) {
                vto.addOnGlobalLayoutListener(this.f۱۵۱۷۹F);
            }
        }
    }
}
