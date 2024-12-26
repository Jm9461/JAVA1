package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.k;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.q;
import android.support.v7.widget.o0;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends o0 implements h.b, q {
    private int A;
    private int B;
    e C;
    private h r;
    private Context s;
    private int t;
    private boolean u;
    private c v;
    private p.a w;
    h.a x;
    private boolean y;
    private int z;

    public interface a {
        boolean b();

        boolean c();
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBaselineAligned(false);
        float density = context.getResources().getDisplayMetrics().density;
        this.A = (int) (56.0f * density);
        this.B = (int) (4.0f * density);
        this.s = context;
        this.t = 0;
    }

    public void setPopupTheme(int resId) {
        if (this.t != resId) {
            this.t = resId;
            if (resId == 0) {
                this.s = getContext();
            } else {
                this.s = new ContextThemeWrapper(getContext(), resId);
            }
        }
    }

    public int getPopupTheme() {
        return this.t;
    }

    public void setPresenter(c presenter) {
        this.v = presenter;
        this.v.a(this);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        c cVar = this.v;
        if (cVar != null) {
            cVar.a(false);
            if (this.v.j()) {
                this.v.g();
                this.v.k();
            }
        }
    }

    public void setOnMenuItemClickListener(e listener) {
        this.C = listener;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.widget.o0
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        h hVar;
        boolean wasFormatted = this.y;
        this.y = View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824;
        if (wasFormatted != this.y) {
            this.z = 0;
        }
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        if (!(!this.y || (hVar = this.r) == null || widthSize == this.z)) {
            this.z = widthSize;
            hVar.b(true);
        }
        int childCount = getChildCount();
        if (!this.y || childCount <= 0) {
            for (int i = 0; i < childCount; i++) {
                c lp = (c) getChildAt(i).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) lp).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) lp).leftMargin = 0;
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        c(widthMeasureSpec, heightMeasureSpec);
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(int r41, int r42) {
        /*
        // Method dump skipped, instructions count: 695
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.c(int, int):void");
    }

    static int a(View child, int cellSize, int cellsRemaining, int parentHeightMeasureSpec, int parentHeightPadding) {
        c lp = (c) child.getLayoutParams();
        int childHeightSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(parentHeightMeasureSpec) - parentHeightPadding, View.MeasureSpec.getMode(parentHeightMeasureSpec));
        ActionMenuItemView itemView = child instanceof ActionMenuItemView ? (ActionMenuItemView) child : null;
        boolean expandable = false;
        boolean hasText = itemView != null && itemView.d();
        int cellsUsed = 0;
        if (cellsRemaining > 0 && (!hasText || cellsRemaining >= 2)) {
            child.measure(View.MeasureSpec.makeMeasureSpec(cellSize * cellsRemaining, Integer.MIN_VALUE), childHeightSpec);
            int measuredWidth = child.getMeasuredWidth();
            cellsUsed = measuredWidth / cellSize;
            if (measuredWidth % cellSize != 0) {
                cellsUsed++;
            }
            if (hasText && cellsUsed < 2) {
                cellsUsed = 2;
            }
        }
        if (!lp.f۱۷۶۱c && hasText) {
            expandable = true;
        }
        lp.f۱۷۶۴f = expandable;
        lp.f۱۷۶۲d = cellsUsed;
        child.measure(View.MeasureSpec.makeMeasureSpec(cellsUsed * cellSize, 1073741824), childHeightSpec);
        return cellsUsed;
    }

    /* JADX INFO: Multiple debug info for r9v10 int: [D('isLayoutRtl' boolean), D('t' int)] */
    /* JADX INFO: Multiple debug info for r2v10 int: [D('b' int), D('midVertical' int)] */
    /* access modifiers changed from: protected */
    @Override // android.support.v7.widget.o0
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i;
        int overflowWidth;
        int dividerWidth;
        boolean isLayoutRtl;
        int midVertical;
        int r2;
        int l;
        ActionMenuView actionMenuView = this;
        if (!actionMenuView.y) {
            super.onLayout(changed, left, top, right, bottom);
            return;
        }
        int childCount = getChildCount();
        int midVertical2 = (bottom - top) / 2;
        int dividerWidth2 = getDividerWidth();
        int overflowWidth2 = 0;
        int nonOverflowWidth = 0;
        int nonOverflowCount = 0;
        int widthRemaining = ((right - left) - getPaddingRight()) - getPaddingLeft();
        int i2 = 0;
        boolean isLayoutRtl2 = r1.a(this);
        int i3 = 0;
        while (true) {
            i = 8;
            if (i3 >= childCount) {
                break;
            }
            View v2 = actionMenuView.getChildAt(i3);
            if (v2.getVisibility() == 8) {
                midVertical = midVertical2;
                isLayoutRtl = isLayoutRtl2;
            } else {
                c p = (c) v2.getLayoutParams();
                if (p.f۱۷۶۱c) {
                    overflowWidth2 = v2.getMeasuredWidth();
                    if (actionMenuView.d(i3)) {
                        overflowWidth2 += dividerWidth2;
                    }
                    int height = v2.getMeasuredHeight();
                    if (isLayoutRtl2) {
                        l = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) p).leftMargin;
                        r2 = l + overflowWidth2;
                    } else {
                        r2 = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) p).rightMargin;
                        l = r2 - overflowWidth2;
                    }
                    isLayoutRtl = isLayoutRtl2;
                    int t2 = midVertical2 - (height / 2);
                    midVertical = midVertical2;
                    v2.layout(l, t2, r2, t2 + height);
                    widthRemaining -= overflowWidth2;
                    i2 = 1;
                } else {
                    midVertical = midVertical2;
                    isLayoutRtl = isLayoutRtl2;
                    int size = v2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) p).leftMargin + ((ViewGroup.MarginLayoutParams) p).rightMargin;
                    nonOverflowWidth += size;
                    widthRemaining -= size;
                    if (actionMenuView.d(i3)) {
                        nonOverflowWidth += dividerWidth2;
                    }
                    nonOverflowCount++;
                }
            }
            i3++;
            midVertical2 = midVertical;
            isLayoutRtl2 = isLayoutRtl;
        }
        if (childCount == 1 && i2 == 0) {
            View v3 = actionMenuView.getChildAt(0);
            int width = v3.getMeasuredWidth();
            int height2 = v3.getMeasuredHeight();
            int l2 = ((right - left) / 2) - (width / 2);
            int t3 = midVertical2 - (height2 / 2);
            v3.layout(l2, t3, l2 + width, t3 + height2);
            return;
        }
        int spacerCount = nonOverflowCount - (i2 ^ 1);
        int spacerSize = Math.max(0, spacerCount > 0 ? widthRemaining / spacerCount : 0);
        if (isLayoutRtl2) {
            int startRight = getWidth() - getPaddingRight();
            int i4 = 0;
            while (i4 < childCount) {
                View v4 = actionMenuView.getChildAt(i4);
                c lp = (c) v4.getLayoutParams();
                if (v4.getVisibility() == i) {
                    dividerWidth = dividerWidth2;
                    overflowWidth = overflowWidth2;
                } else if (lp.f۱۷۶۱c) {
                    dividerWidth = dividerWidth2;
                    overflowWidth = overflowWidth2;
                } else {
                    int startRight2 = startRight - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                    int width2 = v4.getMeasuredWidth();
                    int height3 = v4.getMeasuredHeight();
                    int t4 = midVertical2 - (height3 / 2);
                    dividerWidth = dividerWidth2;
                    overflowWidth = overflowWidth2;
                    v4.layout(startRight2 - width2, t4, startRight2, t4 + height3);
                    startRight = startRight2 - ((((ViewGroup.MarginLayoutParams) lp).leftMargin + width2) + spacerSize);
                }
                i4++;
                dividerWidth2 = dividerWidth;
                overflowWidth2 = overflowWidth;
                i = 8;
            }
            return;
        }
        int startLeft = getPaddingLeft();
        int i5 = 0;
        while (i5 < childCount) {
            View v5 = actionMenuView.getChildAt(i5);
            c lp2 = (c) v5.getLayoutParams();
            if (v5.getVisibility() != 8 && !lp2.f۱۷۶۱c) {
                int startLeft2 = startLeft + ((ViewGroup.MarginLayoutParams) lp2).leftMargin;
                int width3 = v5.getMeasuredWidth();
                int height4 = v5.getMeasuredHeight();
                int t5 = midVertical2 - (height4 / 2);
                v5.layout(startLeft2, t5, startLeft2 + width3, t5 + height4);
                startLeft = startLeft2 + ((ViewGroup.MarginLayoutParams) lp2).rightMargin + width3 + spacerSize;
            }
            i5++;
            actionMenuView = this;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    public void setOverflowIcon(Drawable icon) {
        getMenu();
        this.v.a(icon);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.v.f();
    }

    public boolean i() {
        return this.u;
    }

    public void setOverflowReserved(boolean reserveOverflow) {
        this.u = reserveOverflow;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.widget.o0, android.support.v7.widget.o0
    public c generateDefaultLayoutParams() {
        c params = new c(-2, -2);
        params.f۲۲۰۶b = 16;
        return params;
    }

    @Override // android.support.v7.widget.o0, android.support.v7.widget.o0, android.view.ViewGroup
    public c generateLayoutParams(AttributeSet attrs) {
        return new c(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.widget.o0, android.support.v7.widget.o0, android.view.ViewGroup
    public c generateLayoutParams(ViewGroup.LayoutParams p) {
        if (p == null) {
            return generateDefaultLayoutParams();
        }
        c result = p instanceof c ? new c((c) p) : new c(p);
        if (result.f۲۲۰۶b <= 0) {
            result.f۲۲۰۶b = 16;
        }
        return result;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.widget.o0
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p != null && (p instanceof c);
    }

    public c e() {
        c result = generateDefaultLayoutParams();
        result.f۱۷۶۱c = true;
        return result;
    }

    @Override // android.support.v7.view.menu.h.b
    public boolean a(k item) {
        return this.r.a(item, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.support.v7.view.menu.q
    public void a(h menu) {
        this.r = menu;
    }

    public Menu getMenu() {
        if (this.r == null) {
            Context context = getContext();
            this.r = new h(context);
            this.r.a(new d());
            this.v = new c(context);
            this.v.c(true);
            c cVar = this.v;
            p.a aVar = this.w;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.a(aVar);
            this.r.a(this.v, this.s);
            this.v.a(this);
        }
        return this.r;
    }

    public void a(p.a pcb, h.a mcb) {
        this.w = pcb;
        this.x = mcb;
    }

    public h j() {
        return this.r;
    }

    public boolean k() {
        c cVar = this.v;
        return cVar != null && cVar.k();
    }

    public boolean f() {
        c cVar = this.v;
        return cVar != null && cVar.g();
    }

    public boolean h() {
        c cVar = this.v;
        return cVar != null && cVar.j();
    }

    public boolean g() {
        c cVar = this.v;
        return cVar != null && cVar.i();
    }

    public void d() {
        c cVar = this.v;
        if (cVar != null) {
            cVar.e();
        }
    }

    /* access modifiers changed from: protected */
    public boolean d(int childIndex) {
        if (childIndex == 0) {
            return false;
        }
        View childBefore = getChildAt(childIndex - 1);
        View child = getChildAt(childIndex);
        boolean result = false;
        if (childIndex < getChildCount() && (childBefore instanceof a)) {
            result = false | ((a) childBefore).b();
        }
        if (childIndex <= 0 || !(child instanceof a)) {
            return result;
        }
        return result | ((a) child).c();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return false;
    }

    public void setExpandedActionViewsExclusive(boolean exclusive) {
        this.v.b(exclusive);
    }

    /* access modifiers changed from: private */
    public class d implements h.a {
        d() {
        }

        @Override // android.support.v7.view.menu.h.a
        public boolean a(h menu, MenuItem item) {
            e eVar = ActionMenuView.this.C;
            return eVar != null && eVar.onMenuItemClick(item);
        }

        @Override // android.support.v7.view.menu.h.a
        public void a(h menu) {
            h.a aVar = ActionMenuView.this.x;
            if (aVar != null) {
                aVar.a(menu);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class b implements p.a {
        b() {
        }

        @Override // android.support.v7.view.menu.p.a
        public void a(h menu, boolean allMenusAreClosing) {
        }

        @Override // android.support.v7.view.menu.p.a
        public boolean a(h subMenu) {
            return false;
        }
    }

    public static class c extends o0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public boolean f۱۷۶۱c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public int f۱۷۶۲d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public int f۱۷۶۳e;
        @ViewDebug.ExportedProperty

        /* renamed from: f  reason: collision with root package name */
        public boolean f۱۷۶۴f;
        @ViewDebug.ExportedProperty

        /* renamed from: g  reason: collision with root package name */
        public boolean f۱۷۶۵g;

        /* renamed from: h  reason: collision with root package name */
        boolean f۱۷۶۶h;

        public c(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }

        public c(ViewGroup.LayoutParams other) {
            super(other);
        }

        public c(c other) {
            super(other);
            this.f۱۷۶۱c = other.f۱۷۶۱c;
        }

        public c(int width, int height) {
            super(width, height);
            this.f۱۷۶۱c = false;
        }
    }
}
