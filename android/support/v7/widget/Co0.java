package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.Cd;
import android.support.v4.view.Cu;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;

/* renamed from: android.support.v7.widget.o0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Co0 extends ViewGroup {

    /* renamed from: c, reason: contains not printable characters */
    private boolean f۱۲۲۴۳c;

    /* renamed from: d, reason: contains not printable characters */
    private int f۱۲۲۴۴d;

    /* renamed from: e, reason: contains not printable characters */
    private int f۱۲۲۴۵e;

    /* renamed from: f, reason: contains not printable characters */
    private int f۱۲۲۴۶f;

    /* renamed from: g, reason: contains not printable characters */
    private int f۱۲۲۴۷g;

    /* renamed from: h, reason: contains not printable characters */
    private int f۱۲۲۴۸h;

    /* renamed from: i, reason: contains not printable characters */
    private float f۱۲۲۴۹i;

    /* renamed from: j, reason: contains not printable characters */
    private boolean f۱۲۲۵۰j;

    /* renamed from: k, reason: contains not printable characters */
    private int[] f۱۲۲۵۱k;

    /* renamed from: l, reason: contains not printable characters */
    private int[] f۱۲۲۵۲l;

    /* renamed from: m, reason: contains not printable characters */
    private Drawable f۱۲۲۵۳m;

    /* renamed from: n, reason: contains not printable characters */
    private int f۱۲۲۵۴n;

    /* renamed from: o, reason: contains not printable characters */
    private int f۱۲۲۵۵o;

    /* renamed from: p, reason: contains not printable characters */
    private int f۱۲۲۵۶p;

    /* renamed from: q, reason: contains not printable characters */
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
        Cj1 a2 = Cj1.m۱۳۲۷۵a(context, attrs, Cj.LinearLayoutCompat, defStyleAttr, 0);
        int index = a2.m۱۳۲۸۷d(Cj.LinearLayoutCompat_android_orientation, -1);
        if (index >= 0) {
            setOrientation(index);
        }
        int index2 = a2.m۱۳۲۸۷d(Cj.LinearLayoutCompat_android_gravity, -1);
        if (index2 >= 0) {
            setGravity(index2);
        }
        boolean baselineAligned = a2.m۱۳۲۸۱a(Cj.LinearLayoutCompat_android_baselineAligned, true);
        if (!baselineAligned) {
            setBaselineAligned(baselineAligned);
        }
        this.f۱۲۲۴۹i = a2.m۱۳۲۸۲b(Cj.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f۱۲۲۴۴d = a2.m۱۳۲۸۷d(Cj.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f۱۲۲۵۰j = a2.m۱۳۲۸۱a(Cj.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a2.m۱۳۲۸۴b(Cj.LinearLayoutCompat_divider));
        this.f۱۲۲۵۶p = a2.m۱۳۲۸۷d(Cj.LinearLayoutCompat_showDividers, 0);
        this.f۱۲۲۵۷q = a2.m۱۳۲۸۵c(Cj.LinearLayoutCompat_dividerPadding, 0);
        a2.m۱۳۲۸۰a();
    }

    public void setShowDividers(int showDividers) {
        if (showDividers != this.f۱۲۲۵۶p) {
            requestLayout();
        }
        this.f۱۲۲۵۶p = showDividers;
    }

    @Override // android.view.ViewGroup
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
        if (divider == this.f۱۲۲۵۳m) {
            return;
        }
        this.f۱۲۲۵۳m = divider;
        if (divider != null) {
            this.f۱۲۲۵۴n = divider.getIntrinsicWidth();
            this.f۱۲۲۵۵o = divider.getIntrinsicHeight();
        } else {
            this.f۱۲۲۵۴n = 0;
            this.f۱۲۲۵۵o = 0;
        }
        setWillNotDraw(divider == null);
        requestLayout();
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

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f۱۲۲۵۳m == null) {
            return;
        }
        if (this.f۱۲۲۴۶f == 1) {
            m۱۳۴۰۴b(canvas);
        } else {
            m۱۳۳۹۸a(canvas);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۳۴۰۴b(Canvas canvas) {
        int bottom;
        int count = getVirtualChildCount();
        for (int i = 0; i < count; i++) {
            View child = m۱۳۳۹۵a(i);
            if (child != null && child.getVisibility() != 8 && m۱۳۴۰۶b(i)) {
                a lp = (a) child.getLayoutParams();
                int top = (child.getTop() - ((ViewGroup.MarginLayoutParams) lp).topMargin) - this.f۱۲۲۵۵o;
                m۱۳۳۹۹a(canvas, top);
            }
        }
        if (m۱۳۴۰۶b(count)) {
            View child2 = m۱۳۳۹۵a(count - 1);
            if (child2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f۱۲۲۵۵o;
            } else {
                a lp2 = (a) child2.getLayoutParams();
                bottom = child2.getBottom() + ((ViewGroup.MarginLayoutParams) lp2).bottomMargin;
            }
            m۱۳۳۹۹a(canvas, bottom);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۳۹۸a(Canvas canvas) {
        int position;
        int position2;
        int count = getVirtualChildCount();
        boolean isLayoutRtl = Cr1.m۱۳۴۹۷a(this);
        for (int i = 0; i < count; i++) {
            View child = m۱۳۳۹۵a(i);
            if (child != null && child.getVisibility() != 8 && m۱۳۴۰۶b(i)) {
                a lp = (a) child.getLayoutParams();
                if (isLayoutRtl) {
                    position2 = child.getRight() + ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                } else {
                    int position3 = child.getLeft();
                    position2 = (position3 - ((ViewGroup.MarginLayoutParams) lp).leftMargin) - this.f۱۲۲۵۴n;
                }
                m۱۳۴۰۵b(canvas, position2);
            }
        }
        if (m۱۳۴۰۶b(count)) {
            View child2 = m۱۳۳۹۵a(count - 1);
            if (child2 == null) {
                if (isLayoutRtl) {
                    position = getPaddingLeft();
                } else {
                    int position4 = getWidth();
                    position = (position4 - getPaddingRight()) - this.f۱۲۲۵۴n;
                }
            } else {
                a lp2 = (a) child2.getLayoutParams();
                if (isLayoutRtl) {
                    position = (child2.getLeft() - ((ViewGroup.MarginLayoutParams) lp2).leftMargin) - this.f۱۲۲۵۴n;
                } else {
                    int position5 = child2.getRight();
                    position = position5 + ((ViewGroup.MarginLayoutParams) lp2).rightMargin;
                }
            }
            m۱۳۴۰۵b(canvas, position);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۳۹۹a(Canvas canvas, int top) {
        this.f۱۲۲۵۳m.setBounds(getPaddingLeft() + this.f۱۲۲۵۷q, top, (getWidth() - getPaddingRight()) - this.f۱۲۲۵۷q, this.f۱۲۲۵۵o + top);
        this.f۱۲۲۵۳m.draw(canvas);
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۳۴۰۵b(Canvas canvas, int left) {
        this.f۱۲۲۵۳m.setBounds(left, getPaddingTop() + this.f۱۲۲۵۷q, this.f۱۲۲۵۴n + left, (getHeight() - getPaddingBottom()) - this.f۱۲۲۵۷q);
        this.f۱۲۲۵۳m.draw(canvas);
    }

    public void setBaselineAligned(boolean baselineAligned) {
        this.f۱۲۲۴۳c = baselineAligned;
    }

    public void setMeasureWithLargestChildEnabled(boolean enabled) {
        this.f۱۲۲۵۰j = enabled;
    }

    @Override // android.view.View
    public int getBaseline() {
        int majorGravity;
        if (this.f۱۲۲۴۴d < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.f۱۲۲۴۴d;
        if (childCount <= i) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View child = getChildAt(i);
        int childBaseline = child.getBaseline();
        if (childBaseline == -1) {
            if (this.f۱۲۲۴۴d == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int childTop = this.f۱۲۲۴۵e;
        if (this.f۱۲۲۴۶f == 1 && (majorGravity = this.f۱۲۲۴۷g & 112) != 48) {
            if (majorGravity == 16) {
                childTop += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f۱۲۲۴۸h) / 2;
            } else if (majorGravity == 80) {
                childTop = ((getBottom() - getTop()) - getPaddingBottom()) - this.f۱۲۲۴۸h;
            }
        }
        a lp = (a) child.getLayoutParams();
        return ((ViewGroup.MarginLayoutParams) lp).topMargin + childTop + childBaseline;
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

    /* renamed from: a, reason: contains not printable characters */
    View m۱۳۳۹۵a(int index) {
        return getChildAt(index);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f۱۲۲۴۹i;
    }

    public void setWeightSum(float weightSum) {
        this.f۱۲۲۴۹i = Math.max(0.0f, weightSum);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f۱۲۲۴۶f == 1) {
            m۱۳۴۰۲b(widthMeasureSpec, heightMeasureSpec);
        } else {
            m۱۳۳۹۶a(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    protected boolean m۱۳۴۰۶b(int childIndex) {
        if (childIndex == 0) {
            return (this.f۱۲۲۵۶p & 1) != 0;
        }
        if (childIndex == getChildCount()) {
            return (this.f۱۲۲۵۶p & 4) != 0;
        }
        if ((this.f۱۲۲۵۶p & 2) == 0) {
            return false;
        }
        for (int i = childIndex - 1; i >= 0; i--) {
            if (getChildAt(i).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* renamed from: b, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m۱۳۴۰۲b(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Co0.m۱۳۴۰۲b(int, int):void");
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۳۳۹۲d(int count, int heightMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i = 0; i < count; i++) {
            View child = m۱۳۳۹۵a(i);
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

    /* JADX WARN: Removed duplicated region for block: B:153:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x062b  */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m۱۳۳۹۶a(int r47, int r48) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Co0.m۱۳۳۹۶a(int, int):void");
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۳۳۹۱c(int count, int widthMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i = 0; i < count; i++) {
            View child = m۱۳۳۹۵a(i);
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

    /* renamed from: a, reason: contains not printable characters */
    int m۱۳۳۹۴a(View child, int index) {
        return 0;
    }

    /* renamed from: c, reason: contains not printable characters */
    int m۱۳۴۰۷c(int childIndex) {
        return 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۴۰۰a(View child, int childIndex, int widthMeasureSpec, int totalWidth, int heightMeasureSpec, int totalHeight) {
        measureChildWithMargins(child, widthMeasureSpec, totalWidth, heightMeasureSpec, totalHeight);
    }

    /* renamed from: a, reason: contains not printable characters */
    int m۱۳۳۹۳a(View child) {
        return 0;
    }

    /* renamed from: b, reason: contains not printable characters */
    int m۱۳۴۰۱b(View child) {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b2) {
        if (this.f۱۲۲۴۶f == 1) {
            m۱۳۴۰۳b(l, t, r, b2);
        } else {
            m۱۳۳۹۷a(l, t, r, b2);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۳۴۰۳b(int left, int top, int right, int bottom) {
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
            int childTop2 = getPaddingTop();
            childTop = childTop2 + (((bottom - top) - this.f۱۲۲۴۸h) / 2);
        } else if (majorGravity == 80) {
            int childTop3 = getPaddingTop();
            childTop = ((childTop3 + bottom) - top) - this.f۱۲۲۴۸h;
        } else {
            childTop = getPaddingTop();
        }
        int i2 = 0;
        while (i2 < count) {
            View child = m۱۳۳۹۵a(i2);
            if (child == null) {
                childTop += m۱۳۴۰۷c(i2);
                paddingLeft = paddingLeft2;
            } else if (child.getVisibility() == 8) {
                paddingLeft = paddingLeft2;
            } else {
                int childWidth = child.getMeasuredWidth();
                int childHeight = child.getMeasuredHeight();
                a lp = (a) child.getLayoutParams();
                int gravity2 = lp.f۱۲۲۵۹b;
                if (gravity2 >= 0) {
                    gravity = gravity2;
                } else {
                    gravity = minorGravity;
                }
                int layoutDirection = Cu.m۱۰۹۴۴k(this);
                int absoluteGravity = Cd.m۱۰۷۵۵a(gravity, layoutDirection);
                int i3 = absoluteGravity & 7;
                if (i3 == 1) {
                    int childLeft2 = childSpace - childWidth;
                    childLeft = (((childLeft2 / 2) + paddingLeft2) + ((ViewGroup.MarginLayoutParams) lp).leftMargin) - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                } else if (i3 == 5) {
                    int childLeft3 = childRight - childWidth;
                    childLeft = childLeft3 - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                } else {
                    childLeft = ((ViewGroup.MarginLayoutParams) lp).leftMargin + paddingLeft2;
                }
                if (m۱۳۴۰۶b(i2)) {
                    childTop += this.f۱۲۲۵۵o;
                }
                int childTop4 = childTop + ((ViewGroup.MarginLayoutParams) lp).topMargin;
                int childTop5 = m۱۳۳۹۳a(child);
                int layoutDirection2 = childLeft;
                paddingLeft = paddingLeft2;
                m۱۳۳۹۰a(child, layoutDirection2, childTop4 + childTop5, childWidth, childHeight);
                int childTop6 = childTop4 + childHeight + ((ViewGroup.MarginLayoutParams) lp).bottomMargin + m۱۳۴۰۱b(child);
                i2 += m۱۳۳۹۴a(child, i2);
                childTop = childTop6;
            }
            i2++;
            paddingLeft2 = paddingLeft;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m۱۳۳۹۷a(int r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Co0.m۱۳۳۹۷a(int, int, int, int):void");
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۳۹۰a(View child, int left, int top, int width, int height) {
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
            this.f۱۲۲۴۷g = ((-8388616) & i) | gravity;
            requestLayout();
        }
    }

    public void setVerticalGravity(int verticalGravity) {
        int gravity = verticalGravity & 112;
        int i = this.f۱۲۲۴۷g;
        if ((i & 112) != gravity) {
            this.f۱۲۲۴۷g = (i & (-113)) | gravity;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attrs) {
        return new a(getContext(), attrs);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        int i = this.f۱۲۲۴۶f;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams p) {
        return new a(p);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof a;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(Co0.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info2) {
        super.onInitializeAccessibilityNodeInfo(info2);
        info2.setClassName(Co0.class.getName());
    }

    /* renamed from: android.support.v7.widget.o0$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: contains not printable characters */
        public float f۱۲۲۵۸a;

        /* renamed from: b, reason: contains not printable characters */
        public int f۱۲۲۵۹b;

        public a(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            this.f۱۲۲۵۹b = -1;
            TypedArray a2 = c2.obtainStyledAttributes(attrs, Cj.LinearLayoutCompat_Layout);
            this.f۱۲۲۵۸a = a2.getFloat(Cj.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f۱۲۲۵۹b = a2.getInt(Cj.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            a2.recycle();
        }

        public a(int width, int height) {
            super(width, height);
            this.f۱۲۲۵۹b = -1;
            this.f۱۲۲۵۸a = 0.0f;
        }

        public a(ViewGroup.LayoutParams p) {
            super(p);
            this.f۱۲۲۵۹b = -1;
        }
    }
}
