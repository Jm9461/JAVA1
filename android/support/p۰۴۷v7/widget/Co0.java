package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.Cd;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* renamed from: android.support.v7.widget.o0  reason: invalid class name */
public class Co0 extends ViewGroup {

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۱۲۲۴۳c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۲۲۴۴d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۲۲۴۵e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۲۲۴۶f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۲۲۴۷g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۲۲۴۸h;

    /* renamed from: i  reason: contains not printable characters */
    private float f۱۲۲۴۹i;

    /* renamed from: j  reason: contains not printable characters */
    private boolean f۱۲۲۵۰j;

    /* renamed from: k  reason: contains not printable characters */
    private int[] f۱۲۲۵۱k;

    /* renamed from: l  reason: contains not printable characters */
    private int[] f۱۲۲۵۲l;

    /* renamed from: m  reason: contains not printable characters */
    private Drawable f۱۲۲۵۳m;

    /* renamed from: n  reason: contains not printable characters */
    private int f۱۲۲۵۴n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۲۲۵۵o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۲۲۵۶p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۲۲۵۷q;

    public Co0(Context context) {
        this(context, null);
    }

    public Co0(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Co0(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۲۲۴۳c = true;
        this.f۱۲۲۴۴d = -1;
        this.f۱۲۲۴۵e = 0;
        this.f۱۲۲۴۷g = 8388659;
        Cj1 a = Cj1.m۱۵۳۴۵a(context, attrs, Cj.LinearLayoutCompat, defStyleAttr, 0);
        int index = a.m۱۵۳۵۷d(Cj.LinearLayoutCompat_android_orientation, -1);
        if (index >= 0) {
            setOrientation(index);
        }
        int index2 = a.m۱۵۳۵۷d(Cj.LinearLayoutCompat_android_gravity, -1);
        if (index2 >= 0) {
            setGravity(index2);
        }
        boolean baselineAligned = a.m۱۵۳۵۱a(Cj.LinearLayoutCompat_android_baselineAligned, true);
        if (!baselineAligned) {
            setBaselineAligned(baselineAligned);
        }
        this.f۱۲۲۴۹i = a.m۱۵۳۵۲b(Cj.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f۱۲۲۴۴d = a.m۱۵۳۵۷d(Cj.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f۱۲۲۵۰j = a.m۱۵۳۵۱a(Cj.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.m۱۵۳۵۴b(Cj.LinearLayoutCompat_divider));
        this.f۱۲۲۵۶p = a.m۱۵۳۵۷d(Cj.LinearLayoutCompat_showDividers, 0);
        this.f۱۲۲۵۷q = a.m۱۵۳۵۵c(Cj.LinearLayoutCompat_dividerPadding, 0);
        a.m۱۵۳۵۰a();
    }

    public void setShowDividers(int showDividers) {
        if (showDividers != this.f۱۲۲۵۶p) {
            requestLayout();
        }
        this.f۱۲۲۵۶p = showDividers;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.f۱۲۲۵۶p;
    }

    public Drawable getDividerDrawable() {
        return this.f۱۲۲۵۳m;
    }

    public void setDividerDrawable(Drawable divider) {
        if (divider != this.f۱۲۲۵۳m) {
            this.f۱۲۲۵۳m = divider;
            boolean z = false;
            if (divider != null) {
                this.f۱۲۲۵۴n = divider.getIntrinsicWidth();
                this.f۱۲۲۵۵o = divider.getIntrinsicHeight();
            } else {
                this.f۱۲۲۵۴n = 0;
                this.f۱۲۲۵۵o = 0;
            }
            if (divider == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int padding) {
        this.f۱۲۲۵۷q = padding;
    }

    public int getDividerPadding() {
        return this.f۱۲۲۵۷q;
    }

    public int getDividerWidth() {
        return this.f۱۲۲۵۴n;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f۱۲۲۵۳m != null) {
            if (this.f۱۲۲۴۶f == 1) {
                m۱۵۴۷۴b(canvas);
            } else {
                m۱۵۴۶۸a(canvas);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۴۷۴b(Canvas canvas) {
        int bottom;
        int count = getVirtualChildCount();
        for (int i = 0; i < count; i++) {
            View child = m۱۵۴۶۵a(i);
            if (!(child == null || child.getVisibility() == 8 || !m۱۵۴۷۶b(i))) {
                m۱۵۴۶۹a(canvas, (child.getTop() - ((ViewGroup.MarginLayoutParams) ((Ca) child.getLayoutParams())).topMargin) - this.f۱۲۲۵۵o);
            }
        }
        if (m۱۵۴۷۶b(count)) {
            View child2 = m۱۵۴۶۵a(count - 1);
            if (child2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f۱۲۲۵۵o;
            } else {
                bottom = child2.getBottom() + ((ViewGroup.MarginLayoutParams) ((Ca) child2.getLayoutParams())).bottomMargin;
            }
            m۱۵۴۶۹a(canvas, bottom);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۴۶۸a(Canvas canvas) {
        int position;
        int position2;
        int count = getVirtualChildCount();
        boolean isLayoutRtl = Cr1.m۱۵۵۶۷a(this);
        for (int i = 0; i < count; i++) {
            View child = m۱۵۴۶۵a(i);
            if (!(child == null || child.getVisibility() == 8 || !m۱۵۴۷۶b(i))) {
                Ca lp = (Ca) child.getLayoutParams();
                if (isLayoutRtl) {
                    position2 = child.getRight() + ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                } else {
                    position2 = (child.getLeft() - ((ViewGroup.MarginLayoutParams) lp).leftMargin) - this.f۱۲۲۵۴n;
                }
                m۱۵۴۷۵b(canvas, position2);
            }
        }
        if (m۱۵۴۷۶b(count)) {
            View child2 = m۱۵۴۶۵a(count - 1);
            if (child2 != null) {
                Ca lp2 = (Ca) child2.getLayoutParams();
                if (isLayoutRtl) {
                    position = (child2.getLeft() - ((ViewGroup.MarginLayoutParams) lp2).leftMargin) - this.f۱۲۲۵۴n;
                } else {
                    position = child2.getRight() + ((ViewGroup.MarginLayoutParams) lp2).rightMargin;
                }
            } else if (isLayoutRtl) {
                position = getPaddingLeft();
            } else {
                position = (getWidth() - getPaddingRight()) - this.f۱۲۲۵۴n;
            }
            m۱۵۴۷۵b(canvas, position);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۴۶۹a(Canvas canvas, int top) {
        this.f۱۲۲۵۳m.setBounds(getPaddingLeft() + this.f۱۲۲۵۷q, top, (getWidth() - getPaddingRight()) - this.f۱۲۲۵۷q, this.f۱۲۲۵۵o + top);
        this.f۱۲۲۵۳m.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۴۷۵b(Canvas canvas, int left) {
        this.f۱۲۲۵۳m.setBounds(left, getPaddingTop() + this.f۱۲۲۵۷q, this.f۱۲۲۵۴n + left, (getHeight() - getPaddingBottom()) - this.f۱۲۲۵۷q);
        this.f۱۲۲۵۳m.draw(canvas);
    }

    public void setBaselineAligned(boolean baselineAligned) {
        this.f۱۲۲۴۳c = baselineAligned;
    }

    public void setMeasureWithLargestChildEnabled(boolean enabled) {
        this.f۱۲۲۵۰j = enabled;
    }

    public int getBaseline() {
        int majorGravity;
        if (this.f۱۲۲۴۴d < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.f۱۲۲۴۴d;
        if (childCount > i) {
            View child = getChildAt(i);
            int childBaseline = child.getBaseline();
            if (childBaseline != -1) {
                int childTop = this.f۱۲۲۴۵e;
                if (this.f۱۲۲۴۶f == 1 && (majorGravity = this.f۱۲۲۴۷g & 112) != 48) {
                    if (majorGravity == 16) {
                        childTop += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f۱۲۲۴۸h) / 2;
                    } else if (majorGravity == 80) {
                        childTop = ((getBottom() - getTop()) - getPaddingBottom()) - this.f۱۲۲۴۸h;
                    }
                }
                return ((ViewGroup.MarginLayoutParams) ((Ca) child.getLayoutParams())).topMargin + childTop + childBaseline;
            } else if (this.f۱۲۲۴۴d == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f۱۲۲۴۴d;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f۱۲۲۴۴d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۵۴۶۵a(int index) {
        return getChildAt(index);
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f۱۲۲۴۹i;
    }

    public void setWeightSum(float weightSum) {
        this.f۱۲۲۴۹i = Math.max(0.0f, weightSum);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f۱۲۲۴۶f == 1) {
            m۱۵۴۷۲b(widthMeasureSpec, heightMeasureSpec);
        } else {
            m۱۵۴۶۶a(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۵۴۷۶b(int childIndex) {
        if (childIndex == 0) {
            if ((this.f۱۲۲۵۶p & 1) != 0) {
                return true;
            }
            return false;
        } else if (childIndex == getChildCount()) {
            if ((this.f۱۲۲۵۶p & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f۱۲۲۵۶p & 2) == 0) {
            return false;
        } else {
            for (int i = childIndex - 1; i >= 0; i--) {
                if (getChildAt(i).getVisibility() != 8) {
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
    /* renamed from: b  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۵۴۷۲b(int r39, int r40) {
        /*
        // Method dump skipped, instructions count: 1119
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.Co0.m۱۵۴۷۲b(int, int):void");
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۵۴۶۲d(int count, int heightMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i = 0; i < count; i++) {
            View child = m۱۵۴۶۵a(i);
            if (child.getVisibility() != 8) {
                Ca lp = (Ca) child.getLayoutParams();
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
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۵۴۶۶a(int r47, int r48) {
        /*
        // Method dump skipped, instructions count: 1584
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.Co0.m۱۵۴۶۶a(int, int):void");
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۵۴۶۱c(int count, int widthMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i = 0; i < count; i++) {
            View child = m۱۵۴۶۵a(i);
            if (child.getVisibility() != 8) {
                Ca lp = (Ca) child.getLayoutParams();
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
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۵۴۶۴a(View child, int index) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۵۴۷۷c(int childIndex) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۴۷۰a(View child, int childIndex, int widthMeasureSpec, int totalWidth, int heightMeasureSpec, int totalHeight) {
        measureChildWithMargins(child, widthMeasureSpec, totalWidth, heightMeasureSpec, totalHeight);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۵۴۶۳a(View child) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۵۴۷۱b(View child) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        if (this.f۱۲۲۴۶f == 1) {
            m۱۵۴۷۳b(l, t, r, b);
        } else {
            m۱۵۴۶۷a(l, t, r, b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۴۷۳b(int left, int top, int right, int bottom) {
        int childTop;
        int paddingLeft;
        int gravity;
        int childLeft;
        int paddingLeft2 = getPaddingLeft();
        int width = right - left;
        int childRight = width - getPaddingRight();
        int childSpace = (width - paddingLeft2) - getPaddingRight();
        int count = getVirtualChildCount();
        int i = this.f۱۲۲۴۷g;
        int majorGravity = i & 112;
        int minorGravity = i & 8388615;
        if (majorGravity == 16) {
            childTop = getPaddingTop() + (((bottom - top) - this.f۱۲۲۴۸h) / 2);
        } else if (majorGravity != 80) {
            childTop = getPaddingTop();
        } else {
            childTop = ((getPaddingTop() + bottom) - top) - this.f۱۲۲۴۸h;
        }
        int i2 = 0;
        while (i2 < count) {
            View child = m۱۵۴۶۵a(i2);
            if (child == null) {
                childTop += m۱۵۴۷۷c(i2);
                paddingLeft = paddingLeft2;
            } else if (child.getVisibility() != 8) {
                int childWidth = child.getMeasuredWidth();
                int childHeight = child.getMeasuredHeight();
                Ca lp = (Ca) child.getLayoutParams();
                int gravity2 = lp.f۱۲۲۵۹b;
                if (gravity2 < 0) {
                    gravity = minorGravity;
                } else {
                    gravity = gravity2;
                }
                int a = Cd.m۱۲۸۲۵a(gravity, Cu.m۱۳۰۱۴k(this)) & 7;
                if (a == 1) {
                    childLeft = ((((childSpace - childWidth) / 2) + paddingLeft2) + ((ViewGroup.MarginLayoutParams) lp).leftMargin) - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                } else if (a != 5) {
                    childLeft = ((ViewGroup.MarginLayoutParams) lp).leftMargin + paddingLeft2;
                } else {
                    childLeft = (childRight - childWidth) - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                }
                if (m۱۵۴۷۶b(i2)) {
                    childTop += this.f۱۲۲۵۵o;
                }
                int childTop2 = childTop + ((ViewGroup.MarginLayoutParams) lp).topMargin;
                paddingLeft = paddingLeft2;
                m۱۵۴۶۰a(child, childLeft, childTop2 + m۱۵۴۶۳a(child), childWidth, childHeight);
                int childTop3 = childTop2 + childHeight + ((ViewGroup.MarginLayoutParams) lp).bottomMargin + m۱۵۴۷۱b(child);
                i2 += m۱۵۴۶۴a(child, i2);
                childTop = childTop3;
            } else {
                paddingLeft = paddingLeft2;
            }
            i2++;
            paddingLeft2 = paddingLeft;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011a  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۵۴۶۷a(int r34, int r35, int r36, int r37) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.Co0.m۱۵۴۶۷a(int, int, int, int):void");
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۴۶۰a(View child, int left, int top, int width, int height) {
        child.layout(left, top, left + width, top + height);
    }

    public void setOrientation(int orientation) {
        if (this.f۱۲۲۴۶f != orientation) {
            this.f۱۲۲۴۶f = orientation;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.f۱۲۲۴۶f;
    }

    public void setGravity(int gravity) {
        if (this.f۱۲۲۴۷g != gravity) {
            if ((8388615 & gravity) == 0) {
                gravity |= 8388611;
            }
            if ((gravity & 112) == 0) {
                gravity |= 48;
            }
            this.f۱۲۲۴۷g = gravity;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.f۱۲۲۴۷g;
    }

    public void setHorizontalGravity(int horizontalGravity) {
        int gravity = horizontalGravity & 8388615;
        int i = this.f۱۲۲۴۷g;
        if ((8388615 & i) != gravity) {
            this.f۱۲۲۴۷g = (-8388616 & i) | gravity;
            requestLayout();
        }
    }

    public void setVerticalGravity(int verticalGravity) {
        int gravity = verticalGravity & 112;
        int i = this.f۱۲۲۴۷g;
        if ((i & 112) != gravity) {
            this.f۱۲۲۴۷g = (i & -113) | gravity;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public Ca generateLayoutParams(AttributeSet attrs) {
        return new Ca(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    public Ca generateDefaultLayoutParams() {
        int i = this.f۱۲۲۴۶f;
        if (i == 0) {
            return new Ca(-2, -2);
        }
        if (i == 1) {
            return new Ca(-1, -2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public Ca generateLayoutParams(ViewGroup.LayoutParams p) {
        return new Ca(p);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof Ca;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(Co0.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info2) {
        super.onInitializeAccessibilityNodeInfo(info2);
        info2.setClassName(Co0.class.getName());
    }

    /* renamed from: android.support.v7.widget.o0$a  reason: invalid class name */
    public static class Ca extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: contains not printable characters */
        public float f۱۲۲۵۸a;

        /* renamed from: b  reason: contains not printable characters */
        public int f۱۲۲۵۹b;

        public Ca(Context c, AttributeSet attrs) {
            super(c, attrs);
            this.f۱۲۲۵۹b = -1;
            TypedArray a = c.obtainStyledAttributes(attrs, Cj.LinearLayoutCompat_Layout);
            this.f۱۲۲۵۸a = a.getFloat(Cj.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f۱۲۲۵۹b = a.getInt(Cj.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            a.recycle();
        }

        public Ca(int width, int height) {
            super(width, height);
            this.f۱۲۲۵۹b = -1;
            this.f۱۲۲۵۸a = 0.0f;
        }

        public Ca(ViewGroup.LayoutParams p) {
            super(p);
            this.f۱۲۲۵۹b = -1;
        }
    }
}
