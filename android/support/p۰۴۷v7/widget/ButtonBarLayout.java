package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* renamed from: android.support.v7.widget.ButtonBarLayout */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۱۱۴۵۰c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۱۴۵۱d = -1;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۱۴۵۲e = 0;

    public ButtonBarLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta = context.obtainStyledAttributes(attrs, Cj.ButtonBarLayout);
        this.f۱۱۴۵۰c = ta.getBoolean(Cj.ButtonBarLayout_allowStacking, true);
        ta.recycle();
    }

    public void setAllowStacking(boolean allowStacking) {
        if (this.f۱۱۴۵۰c != allowStacking) {
            this.f۱۱۴۵۰c = allowStacking;
            if (!this.f۱۱۴۵۰c && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int initialWidthMeasureSpec;
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        if (this.f۱۱۴۵۰c) {
            if (widthSize > this.f۱۱۴۵۱d && m۱۴۰۷۸a()) {
                setStacked(false);
            }
            this.f۱۱۴۵۱d = widthSize;
        }
        boolean needsRemeasure = false;
        if (m۱۴۰۷۸a() || View.MeasureSpec.getMode(widthMeasureSpec) != 1073741824) {
            initialWidthMeasureSpec = widthMeasureSpec;
        } else {
            initialWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(widthSize, Integer.MIN_VALUE);
            needsRemeasure = true;
        }
        super.onMeasure(initialWidthMeasureSpec, heightMeasureSpec);
        if (this.f۱۱۴۵۰c && !m۱۴۰۷۸a()) {
            if ((-16777216 & getMeasuredWidthAndState()) == 16777216) {
                setStacked(true);
                needsRemeasure = true;
            }
        }
        if (needsRemeasure) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
        int minHeight = 0;
        int firstVisible = m۱۴۰۷۷a(0);
        if (firstVisible >= 0) {
            View firstButton = getChildAt(firstVisible);
            LinearLayout.LayoutParams firstParams = (LinearLayout.LayoutParams) firstButton.getLayoutParams();
            minHeight = 0 + getPaddingTop() + firstButton.getMeasuredHeight() + firstParams.topMargin + firstParams.bottomMargin;
            if (m۱۴۰۷۸a()) {
                int secondVisible = m۱۴۰۷۷a(firstVisible + 1);
                if (secondVisible >= 0) {
                    minHeight += getChildAt(secondVisible).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                minHeight += getPaddingBottom();
            }
        }
        if (Cu.m۱۳۰۱۵l(this) != minHeight) {
            setMinimumHeight(minHeight);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۴۰۷۷a(int index) {
        int count = getChildCount();
        for (int i = index; i < count; i++) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
        }
        return -1;
    }

    public int getMinimumHeight() {
        return Math.max(this.f۱۱۴۵۲e, super.getMinimumHeight());
    }

    private void setStacked(boolean stacked) {
        setOrientation(stacked ? 1 : 0);
        setGravity(stacked ? 5 : 80);
        View spacer = findViewById(Cf.spacer);
        if (spacer != null) {
            spacer.setVisibility(stacked ? 8 : 4);
        }
        for (int i = getChildCount() - 2; i >= 0; i--) {
            bringChildToFront(getChildAt(i));
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۴۰۷۸a() {
        return getOrientation() == 1;
    }
}
