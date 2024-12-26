package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.ContentFrameLayout */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: c  reason: contains not printable characters */
    private TypedValue f۱۱۴۶۴c;

    /* renamed from: d  reason: contains not printable characters */
    private TypedValue f۱۱۴۶۵d;

    /* renamed from: e  reason: contains not printable characters */
    private TypedValue f۱۱۴۶۶e;

    /* renamed from: f  reason: contains not printable characters */
    private TypedValue f۱۱۴۶۷f;

    /* renamed from: g  reason: contains not printable characters */
    private TypedValue f۱۱۴۶۸g;

    /* renamed from: h  reason: contains not printable characters */
    private TypedValue f۱۱۴۶۹h;

    /* renamed from: i  reason: contains not printable characters */
    private final Rect f۱۱۴۷۰i;

    /* renamed from: j  reason: contains not printable characters */
    private AbstractCa f۱۱۴۷۱j;

    /* renamed from: android.support.v7.widget.ContentFrameLayout$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۴۰۹۱a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۱۴۷۰i = new Rect();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۰۹۰a(Rect insets) {
        fitSystemWindows(insets);
    }

    public void setAttachListener(AbstractCa attachListener) {
        this.f۱۱۴۷۱j = attachListener;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۰۸۹a(int left, int top, int right, int bottom) {
        this.f۱۱۴۷۰i.set(left, top, right, bottom);
        if (Cu.m۱۳۰۲۸y(this)) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        int i2;
        int i3;
        DisplayMetrics metrics = getContext().getResources().getDisplayMetrics();
        boolean isPortrait = metrics.widthPixels < metrics.heightPixels;
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        boolean fixedWidth = false;
        if (widthMode == Integer.MIN_VALUE) {
            TypedValue tvw = isPortrait ? this.f۱۱۴۶۷f : this.f۱۱۴۶۶e;
            if (!(tvw == null || (i3 = tvw.type) == 0)) {
                int w = 0;
                if (i3 == 5) {
                    w = (int) tvw.getDimension(metrics);
                } else if (i3 == 6) {
                    int i4 = metrics.widthPixels;
                    w = (int) tvw.getFraction((float) i4, (float) i4);
                }
                if (w > 0) {
                    Rect rect = this.f۱۱۴۷۰i;
                    widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(w - (rect.left + rect.right), View.MeasureSpec.getSize(widthMeasureSpec)), 1073741824);
                    fixedWidth = true;
                }
            }
        }
        if (heightMode == Integer.MIN_VALUE) {
            TypedValue tvh = isPortrait ? this.f۱۱۴۶۸g : this.f۱۱۴۶۹h;
            if (!(tvh == null || (i2 = tvh.type) == 0)) {
                int h = 0;
                if (i2 == 5) {
                    h = (int) tvh.getDimension(metrics);
                } else if (i2 == 6) {
                    int i5 = metrics.heightPixels;
                    h = (int) tvh.getFraction((float) i5, (float) i5);
                }
                if (h > 0) {
                    Rect rect2 = this.f۱۱۴۷۰i;
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(h - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(heightMeasureSpec)), 1073741824);
                }
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMeasuredWidth();
        boolean measure = false;
        int widthMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        if (!fixedWidth && widthMode == Integer.MIN_VALUE) {
            TypedValue tv = isPortrait ? this.f۱۱۴۶۵d : this.f۱۱۴۶۴c;
            if (!(tv == null || (i = tv.type) == 0)) {
                int min = 0;
                if (i == 5) {
                    min = (int) tv.getDimension(metrics);
                } else if (i == 6) {
                    int i6 = metrics.widthPixels;
                    min = (int) tv.getFraction((float) i6, (float) i6);
                }
                if (min > 0) {
                    Rect rect3 = this.f۱۱۴۷۰i;
                    min -= rect3.left + rect3.right;
                }
                if (width < min) {
                    widthMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
                    measure = true;
                }
            }
        }
        if (measure) {
            super.onMeasure(widthMeasureSpec2, heightMeasureSpec);
        }
    }

    public TypedValue getMinWidthMajor() {
        if (this.f۱۱۴۶۴c == null) {
            this.f۱۱۴۶۴c = new TypedValue();
        }
        return this.f۱۱۴۶۴c;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f۱۱۴۶۵d == null) {
            this.f۱۱۴۶۵d = new TypedValue();
        }
        return this.f۱۱۴۶۵d;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f۱۱۴۶۶e == null) {
            this.f۱۱۴۶۶e = new TypedValue();
        }
        return this.f۱۱۴۶۶e;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f۱۱۴۶۷f == null) {
            this.f۱۱۴۶۷f = new TypedValue();
        }
        return this.f۱۱۴۶۷f;
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f۱۱۴۶۸g == null) {
            this.f۱۱۴۶۸g = new TypedValue();
        }
        return this.f۱۱۴۶۸g;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f۱۱۴۶۹h == null) {
            this.f۱۱۴۶۹h = new TypedValue();
        }
        return this.f۱۱۴۶۹h;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractCa aVar = this.f۱۱۴۷۱j;
        if (aVar != null) {
            aVar.m۱۴۰۹۱a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractCa aVar = this.f۱۱۴۷۱j;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }
}
