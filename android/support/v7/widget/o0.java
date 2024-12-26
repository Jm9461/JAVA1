package android.support.v7.widget;

import a.b.h.a.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.d;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class o0 extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    private boolean f۲۱۹۹c;

    /* renamed from: d  reason: collision with root package name */
    private int f۲۲۰۰d;

    /* renamed from: e  reason: collision with root package name */
    private int f۲۲۰۱e;

    /* renamed from: f  reason: collision with root package name */
    private int f۲۲۰۲f;

    /* renamed from: g  reason: collision with root package name */
    private int f۲۲۰۳g;

    /* renamed from: h  reason: collision with root package name */
    private int f۲۲۰۴h;
    private float i;
    private boolean j;
    private int[] k;
    private int[] l;
    private Drawable m;
    private int n;
    private int o;
    private int p;
    private int q;

    public o0(Context context) {
        this(context, null);
    }

    public o0(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public o0(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۲۱۹۹c = true;
        this.f۲۲۰۰d = -1;
        this.f۲۲۰۱e = 0;
        this.f۲۲۰۳g = 8388659;
        j1 a2 = j1.a(context, attrs, j.LinearLayoutCompat, defStyleAttr, 0);
        int index = a2.d(j.LinearLayoutCompat_android_orientation, -1);
        if (index >= 0) {
            setOrientation(index);
        }
        int index2 = a2.d(j.LinearLayoutCompat_android_gravity, -1);
        if (index2 >= 0) {
            setGravity(index2);
        }
        boolean baselineAligned = a2.a(j.LinearLayoutCompat_android_baselineAligned, true);
        if (!baselineAligned) {
            setBaselineAligned(baselineAligned);
        }
        this.i = a2.b(j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f۲۲۰۰d = a2.d(j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.j = a2.a(j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a2.b(j.LinearLayoutCompat_divider));
        this.p = a2.d(j.LinearLayoutCompat_showDividers, 0);
        this.q = a2.c(j.LinearLayoutCompat_dividerPadding, 0);
        a2.a();
    }

    public void setShowDividers(int showDividers) {
        if (showDividers != this.p) {
            requestLayout();
        }
        this.p = showDividers;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.p;
    }

    public Drawable getDividerDrawable() {
        return this.m;
    }

    public void setDividerDrawable(Drawable divider) {
        if (divider != this.m) {
            this.m = divider;
            boolean z = false;
            if (divider != null) {
                this.n = divider.getIntrinsicWidth();
                this.o = divider.getIntrinsicHeight();
            } else {
                this.n = 0;
                this.o = 0;
            }
            if (divider == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int padding) {
        this.q = padding;
    }

    public int getDividerPadding() {
        return this.q;
    }

    public int getDividerWidth() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.m != null) {
            if (this.f۲۲۰۲f == 1) {
                b(canvas);
            } else {
                a(canvas);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Canvas canvas) {
        int bottom;
        int count = getVirtualChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = a(i2);
            if (!(child == null || child.getVisibility() == 8 || !b(i2))) {
                a(canvas, (child.getTop() - ((ViewGroup.MarginLayoutParams) ((a) child.getLayoutParams())).topMargin) - this.o);
            }
        }
        if (b(count)) {
            View child2 = a(count - 1);
            if (child2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.o;
            } else {
                bottom = child2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) child2.getLayoutParams())).bottomMargin;
            }
            a(canvas, bottom);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        int position;
        int position2;
        int count = getVirtualChildCount();
        boolean isLayoutRtl = r1.a(this);
        for (int i2 = 0; i2 < count; i2++) {
            View child = a(i2);
            if (!(child == null || child.getVisibility() == 8 || !b(i2))) {
                a lp = (a) child.getLayoutParams();
                if (isLayoutRtl) {
                    position2 = child.getRight() + ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                } else {
                    position2 = (child.getLeft() - ((ViewGroup.MarginLayoutParams) lp).leftMargin) - this.n;
                }
                b(canvas, position2);
            }
        }
        if (b(count)) {
            View child2 = a(count - 1);
            if (child2 != null) {
                a lp2 = (a) child2.getLayoutParams();
                if (isLayoutRtl) {
                    position = (child2.getLeft() - ((ViewGroup.MarginLayoutParams) lp2).leftMargin) - this.n;
                } else {
                    position = child2.getRight() + ((ViewGroup.MarginLayoutParams) lp2).rightMargin;
                }
            } else if (isLayoutRtl) {
                position = getPaddingLeft();
            } else {
                position = (getWidth() - getPaddingRight()) - this.n;
            }
            b(canvas, position);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Canvas canvas, int top) {
        this.m.setBounds(getPaddingLeft() + this.q, top, (getWidth() - getPaddingRight()) - this.q, this.o + top);
        this.m.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    public void b(Canvas canvas, int left) {
        this.m.setBounds(left, getPaddingTop() + this.q, this.n + left, (getHeight() - getPaddingBottom()) - this.q);
        this.m.draw(canvas);
    }

    public void setBaselineAligned(boolean baselineAligned) {
        this.f۲۱۹۹c = baselineAligned;
    }

    public void setMeasureWithLargestChildEnabled(boolean enabled) {
        this.j = enabled;
    }

    public int getBaseline() {
        int majorGravity;
        if (this.f۲۲۰۰d < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f۲۲۰۰d;
        if (childCount > i2) {
            View child = getChildAt(i2);
            int childBaseline = child.getBaseline();
            if (childBaseline != -1) {
                int childTop = this.f۲۲۰۱e;
                if (this.f۲۲۰۲f == 1 && (majorGravity = this.f۲۲۰۳g & 112) != 48) {
                    if (majorGravity == 16) {
                        childTop += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f۲۲۰۴h) / 2;
                    } else if (majorGravity == 80) {
                        childTop = ((getBottom() - getTop()) - getPaddingBottom()) - this.f۲۲۰۴h;
                    }
                }
                return ((ViewGroup.MarginLayoutParams) ((a) child.getLayoutParams())).topMargin + childTop + childBaseline;
            } else if (this.f۲۲۰۰d == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f۲۲۰۰d;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f۲۲۰۰d = i2;
    }

    /* access modifiers changed from: package-private */
    public View a(int index) {
        return getChildAt(index);
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.i;
    }

    public void setWeightSum(float weightSum) {
        this.i = Math.max(0.0f, weightSum);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f۲۲۰۲f == 1) {
            b(widthMeasureSpec, heightMeasureSpec);
        } else {
            a(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(int childIndex) {
        if (childIndex == 0) {
            if ((this.p & 1) != 0) {
                return true;
            }
            return false;
        } else if (childIndex == getChildCount()) {
            if ((this.p & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.p & 2) == 0) {
            return false;
        } else {
            for (int i2 = childIndex - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Multiple debug info for r13v2 int: [D('largestChildHeight' int), D('heightMode' int)] */
    /* JADX INFO: Multiple debug info for r11v2 int: [D('weightedMaxWidth' int), D('count' int)] */
    /* JADX INFO: Multiple debug info for r13v15 'largestChildHeight'  int: [D('largestChildHeight' int), D('heightMode' int)] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(int r39, int r40) {
        /*
        // Method dump skipped, instructions count: 1119
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.o0.b(int, int):void");
    }

    private void d(int count, int heightMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i2 = 0; i2 < count; i2++) {
            View child = a(i2);
            if (child.getVisibility() != 8) {
                a lp = (a) child.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) lp).width == -1) {
                    int oldHeight = ((ViewGroup.MarginLayoutParams) lp).height;
                    ((ViewGroup.MarginLayoutParams) lp).height = child.getMeasuredHeight();
                    measureChildWithMargins(child, uniformMeasureSpec, 0, heightMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) lp).height = oldHeight;
                }
            }
        }
    }

    /* JADX INFO: Multiple debug info for r14v1 boolean: [D('skippedMeasure' boolean), D('useLargestChild' boolean)] */
    /* JADX INFO: Multiple debug info for r12v2 int: [D('widthMode' int), D('weightedMaxHeight' int)] */
    /* JADX INFO: Multiple debug info for r2v3 int: [D('weightedMaxHeight' int), D('maxHeight' int)] */
    /* JADX INFO: Multiple debug info for r3v3 int: [D('alternativeMaxHeight' int), D('largestChildWidth' int)] */
    /* JADX INFO: Multiple debug info for r2v29 int: [D('maxHeight' int), D('totalLength' int)] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0623  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x062b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r47, int r48) {
        /*
        // Method dump skipped, instructions count: 1584
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.o0.a(int, int):void");
    }

    private void c(int count, int widthMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i2 = 0; i2 < count; i2++) {
            View child = a(i2);
            if (child.getVisibility() != 8) {
                a lp = (a) child.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) lp).height == -1) {
                    int oldWidth = ((ViewGroup.MarginLayoutParams) lp).width;
                    ((ViewGroup.MarginLayoutParams) lp).width = child.getMeasuredWidth();
                    measureChildWithMargins(child, widthMeasureSpec, 0, uniformMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) lp).width = oldWidth;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a(View child, int index) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int c(int childIndex) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void a(View child, int childIndex, int widthMeasureSpec, int totalWidth, int heightMeasureSpec, int totalHeight) {
        measureChildWithMargins(child, widthMeasureSpec, totalWidth, heightMeasureSpec, totalHeight);
    }

    /* access modifiers changed from: package-private */
    public int a(View child) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int b(View child) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l2, int t, int r, int b2) {
        if (this.f۲۲۰۲f == 1) {
            b(l2, t, r, b2);
        } else {
            a(l2, t, r, b2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int left, int top, int right, int bottom) {
        int childTop;
        int paddingLeft;
        int gravity;
        int childLeft;
        int paddingLeft2 = getPaddingLeft();
        int width = right - left;
        int childRight = width - getPaddingRight();
        int childSpace = (width - paddingLeft2) - getPaddingRight();
        int count = getVirtualChildCount();
        int i2 = this.f۲۲۰۳g;
        int majorGravity = i2 & 112;
        int minorGravity = i2 & 8388615;
        if (majorGravity == 16) {
            childTop = getPaddingTop() + (((bottom - top) - this.f۲۲۰۴h) / 2);
        } else if (majorGravity != 80) {
            childTop = getPaddingTop();
        } else {
            childTop = ((getPaddingTop() + bottom) - top) - this.f۲۲۰۴h;
        }
        int i3 = 0;
        while (i3 < count) {
            View child = a(i3);
            if (child == null) {
                childTop += c(i3);
                paddingLeft = paddingLeft2;
            } else if (child.getVisibility() != 8) {
                int childWidth = child.getMeasuredWidth();
                int childHeight = child.getMeasuredHeight();
                a lp = (a) child.getLayoutParams();
                int gravity2 = lp.f۲۲۰۶b;
                if (gravity2 < 0) {
                    gravity = minorGravity;
                } else {
                    gravity = gravity2;
                }
                int a2 = d.a(gravity, u.k(this)) & 7;
                if (a2 == 1) {
                    childLeft = ((((childSpace - childWidth) / 2) + paddingLeft2) + ((ViewGroup.MarginLayoutParams) lp).leftMargin) - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                } else if (a2 != 5) {
                    childLeft = ((ViewGroup.MarginLayoutParams) lp).leftMargin + paddingLeft2;
                } else {
                    childLeft = (childRight - childWidth) - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                }
                if (b(i3)) {
                    childTop += this.o;
                }
                int childTop2 = childTop + ((ViewGroup.MarginLayoutParams) lp).topMargin;
                paddingLeft = paddingLeft2;
                a(child, childLeft, childTop2 + a(child), childWidth, childHeight);
                int childTop3 = childTop2 + childHeight + ((ViewGroup.MarginLayoutParams) lp).bottomMargin + b(child);
                i3 += a(child, i3);
                childTop = childTop3;
            } else {
                paddingLeft = paddingLeft2;
            }
            i3++;
            paddingLeft2 = paddingLeft;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r34, int r35, int r36, int r37) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.o0.a(int, int, int, int):void");
    }

    private void a(View child, int left, int top, int width, int height) {
        child.layout(left, top, left + width, top + height);
    }

    public void setOrientation(int orientation) {
        if (this.f۲۲۰۲f != orientation) {
            this.f۲۲۰۲f = orientation;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.f۲۲۰۲f;
    }

    public void setGravity(int gravity) {
        if (this.f۲۲۰۳g != gravity) {
            if ((8388615 & gravity) == 0) {
                gravity |= 8388611;
            }
            if ((gravity & 112) == 0) {
                gravity |= 48;
            }
            this.f۲۲۰۳g = gravity;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.f۲۲۰۳g;
    }

    public void setHorizontalGravity(int horizontalGravity) {
        int gravity = horizontalGravity & 8388615;
        int i2 = this.f۲۲۰۳g;
        if ((8388615 & i2) != gravity) {
            this.f۲۲۰۳g = (-8388616 & i2) | gravity;
            requestLayout();
        }
    }

    public void setVerticalGravity(int verticalGravity) {
        int gravity = verticalGravity & 112;
        int i2 = this.f۲۲۰۳g;
        if ((i2 & 112) != gravity) {
            this.f۲۲۰۳g = (i2 & -113) | gravity;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attrs) {
        return new a(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    public a generateDefaultLayoutParams() {
        int i2 = this.f۲۲۰۲f;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams p2) {
        return new a(p2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return p2 instanceof a;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(o0.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info2) {
        super.onInitializeAccessibilityNodeInfo(info2);
        info2.setClassName(o0.class.getName());
    }

    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public float f۲۲۰۵a;

        /* renamed from: b  reason: collision with root package name */
        public int f۲۲۰۶b;

        public a(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            this.f۲۲۰۶b = -1;
            TypedArray a2 = c2.obtainStyledAttributes(attrs, j.LinearLayoutCompat_Layout);
            this.f۲۲۰۵a = a2.getFloat(j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f۲۲۰۶b = a2.getInt(j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            a2.recycle();
        }

        public a(int width, int height) {
            super(width, height);
            this.f۲۲۰۶b = -1;
            this.f۲۲۰۵a = 0.0f;
        }

        public a(ViewGroup.LayoutParams p) {
            super(p);
            this.f۲۲۰۶b = -1;
        }
    }
}
