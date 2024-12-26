package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.support.p۰۴۳v4.view.Cc0;
import android.support.p۰۴۳v4.view.Cd;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۷c.Ca;

/* renamed from: android.support.design.widget.o  reason: invalid class name */
abstract class AbstractCo extends Cx<View> {

    /* renamed from: d  reason: contains not printable characters */
    final Rect f۹۹۹۲d = new Rect();

    /* renamed from: e  reason: contains not printable characters */
    final Rect f۹۹۹۳e = new Rect();

    /* renamed from: f  reason: contains not printable characters */
    private int f۹۹۹۴f = 0;

    /* renamed from: g  reason: contains not printable characters */
    private int f۹۹۹۵g;

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public abstract View m۱۱۹۵۲a(List<View> list);

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public abstract float m۱۱۹۵۴b(View view);

    public AbstractCo() {
    }

    public AbstractCo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۹۵۳a(CoordinatorLayout parent, View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        int availableHeight;
        int childLpHeight = child.getLayoutParams().height;
        if (childLpHeight != -1 && childLpHeight != -2) {
            return false;
        }
        View header = m۱۱۹۵۲a(parent.m۱۱۵۴۸b(child));
        if (header == null) {
            return false;
        }
        if (Cu.m۱۳۰۱۱h(header) && !Cu.m۱۳۰۱۱h(child)) {
            Cu.m۱۲۹۹۲a(child, true);
            if (Cu.m۱۳۰۱۱h(child)) {
                child.requestLayout();
                return true;
            }
        }
        int availableHeight2 = View.MeasureSpec.getSize(parentHeightMeasureSpec);
        if (availableHeight2 == 0) {
            availableHeight = parent.getHeight();
        } else {
            availableHeight = availableHeight2;
        }
        parent.m۱۱۵۴۰a(child, parentWidthMeasureSpec, widthUsed, View.MeasureSpec.makeMeasureSpec((availableHeight - header.getMeasuredHeight()) + m۱۱۹۵۸c(header), childLpHeight == -1 ? 1073741824 : Integer.MIN_VALUE), heightUsed);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.design.widget.Cx
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۹۵۶b(CoordinatorLayout parent, View child, int layoutDirection) {
        View header = m۱۱۹۵۲a(parent.m۱۱۵۴۸b(child));
        if (header != null) {
            CoordinatorLayout.Cf lp = (CoordinatorLayout.Cf) child.getLayoutParams();
            Rect available = this.f۹۹۹۲d;
            available.set(parent.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lp).leftMargin, header.getBottom() + ((ViewGroup.MarginLayoutParams) lp).topMargin, (parent.getWidth() - parent.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) lp).rightMargin, ((parent.getHeight() + header.getBottom()) - parent.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
            Cc0 parentInsets = parent.getLastWindowInsets();
            if (parentInsets != null && Cu.m۱۳۰۱۱h(parent) && !Cu.m۱۳۰۱۱h(child)) {
                available.left += parentInsets.m۱۲۸۲۰c();
                available.right -= parentInsets.m۱۲۸۲۱d();
            }
            Rect out = this.f۹۹۹۳e;
            Cd.m۱۲۸۲۶a(m۱۱۹۵۰c(lp.f۹۶۳۸c), child.getMeasuredWidth(), child.getMeasuredHeight(), available, out, layoutDirection);
            int overlap = m۱۱۹۵۱a(header);
            child.layout(out.left, out.top - overlap, out.right, out.bottom - overlap);
            this.f۹۹۹۴f = out.top - header.getBottom();
            return;
        }
        super.m۱۲۰۳۴b(parent, child, layoutDirection);
        this.f۹۹۹۴f = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final int m۱۱۹۵۱a(View header) {
        if (this.f۹۹۹۵g == 0) {
            return 0;
        }
        float b = m۱۱۹۵۴b(header);
        int i = this.f۹۹۹۵g;
        return Ca.m۱۰۴۹۵a((int) (b * ((float) i)), 0, i);
    }

    /* renamed from: c  reason: contains not printable characters */
    private static int m۱۱۹۵۰c(int gravity) {
        if (gravity == 0) {
            return 8388659;
        }
        return gravity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۱۹۵۸c(View v) {
        return v.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public final int m۱۱۹۵۹d() {
        return this.f۹۹۹۴f;
    }

    /* renamed from: b  reason: contains not printable characters */
    public final void m۱۱۹۵۵b(int overlayTop) {
        this.f۹۹۹۵g = overlayTop;
    }

    /* renamed from: c  reason: contains not printable characters */
    public final int m۱۱۹۵۷c() {
        return this.f۹۹۹۵g;
    }
}
