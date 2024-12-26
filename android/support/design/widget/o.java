package android.support.design.widget;

import a.b.g.c.a;
import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.c0;
import android.support.v4.view.d;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

abstract class o extends x<View> {

    /* renamed from: d  reason: collision with root package name */
    final Rect f۹۸۷d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    final Rect f۹۸۸e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private int f۹۸۹f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f۹۹۰g;

    /* access modifiers changed from: package-private */
    public abstract View a(List<View> list);

    /* access modifiers changed from: package-private */
    public abstract float b(View view);

    public o() {
    }

    public o(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // android.support.design.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout parent, View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        int availableHeight;
        int childLpHeight = child.getLayoutParams().height;
        if (childLpHeight != -1 && childLpHeight != -2) {
            return false;
        }
        View header = a(parent.b(child));
        if (header == null) {
            return false;
        }
        if (u.h(header) && !u.h(child)) {
            u.a(child, true);
            if (u.h(child)) {
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
        parent.a(child, parentWidthMeasureSpec, widthUsed, View.MeasureSpec.makeMeasureSpec((availableHeight - header.getMeasuredHeight()) + c(header), childLpHeight == -1 ? 1073741824 : Integer.MIN_VALUE), heightUsed);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.design.widget.x
    public void b(CoordinatorLayout parent, View child, int layoutDirection) {
        View header = a(parent.b(child));
        if (header != null) {
            CoordinatorLayout.f lp = (CoordinatorLayout.f) child.getLayoutParams();
            Rect available = this.f۹۸۷d;
            available.set(parent.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lp).leftMargin, header.getBottom() + ((ViewGroup.MarginLayoutParams) lp).topMargin, (parent.getWidth() - parent.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) lp).rightMargin, ((parent.getHeight() + header.getBottom()) - parent.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
            c0 parentInsets = parent.getLastWindowInsets();
            if (parentInsets != null && u.h(parent) && !u.h(child)) {
                available.left += parentInsets.c();
                available.right -= parentInsets.d();
            }
            Rect out = this.f۹۸۸e;
            d.a(c(lp.f۸۲۴c), child.getMeasuredWidth(), child.getMeasuredHeight(), available, out, layoutDirection);
            int overlap = a(header);
            child.layout(out.left, out.top - overlap, out.right, out.bottom - overlap);
            this.f۹۸۹f = out.top - header.getBottom();
            return;
        }
        super.b(parent, child, layoutDirection);
        this.f۹۸۹f = 0;
    }

    /* access modifiers changed from: package-private */
    public final int a(View header) {
        if (this.f۹۹۰g == 0) {
            return 0;
        }
        float b2 = b(header);
        int i = this.f۹۹۰g;
        return a.a((int) (b2 * ((float) i)), 0, i);
    }

    private static int c(int gravity) {
        if (gravity == 0) {
            return 8388659;
        }
        return gravity;
    }

    /* access modifiers changed from: package-private */
    public int c(View v) {
        return v.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return this.f۹۸۹f;
    }

    public final void b(int overlayTop) {
        this.f۹۹۰g = overlayTop;
    }

    public final int c() {
        return this.f۹۹۰g;
    }
}
