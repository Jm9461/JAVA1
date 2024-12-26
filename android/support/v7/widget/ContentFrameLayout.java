package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f۱۷۸۶c;

    /* renamed from: d  reason: collision with root package name */
    private TypedValue f۱۷۸۷d;

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f۱۷۸۸e;

    /* renamed from: f  reason: collision with root package name */
    private TypedValue f۱۷۸۹f;

    /* renamed from: g  reason: collision with root package name */
    private TypedValue f۱۷۹۰g;

    /* renamed from: h  reason: collision with root package name */
    private TypedValue f۱۷۹۱h;
    private final Rect i;
    private a j;

    public interface a {
        void a();

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
        this.i = new Rect();
    }

    public void a(Rect insets) {
        fitSystemWindows(insets);
    }

    public void setAttachListener(a attachListener) {
        this.j = attachListener;
    }

    public void a(int left, int top, int right, int bottom) {
        this.i.set(left, top, right, bottom);
        if (u.y(this)) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i2;
        int i3;
        int i4;
        DisplayMetrics metrics = getContext().getResources().getDisplayMetrics();
        boolean isPortrait = metrics.widthPixels < metrics.heightPixels;
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        boolean fixedWidth = false;
        if (widthMode == Integer.MIN_VALUE) {
            TypedValue tvw = isPortrait ? this.f۱۷۸۹f : this.f۱۷۸۸e;
            if (!(tvw == null || (i4 = tvw.type) == 0)) {
                int w = 0;
                if (i4 == 5) {
                    w = (int) tvw.getDimension(metrics);
                } else if (i4 == 6) {
                    int i5 = metrics.widthPixels;
                    w = (int) tvw.getFraction((float) i5, (float) i5);
                }
                if (w > 0) {
                    Rect rect = this.i;
                    widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(w - (rect.left + rect.right), View.MeasureSpec.getSize(widthMeasureSpec)), 1073741824);
                    fixedWidth = true;
                }
            }
        }
        if (heightMode == Integer.MIN_VALUE) {
            TypedValue tvh = isPortrait ? this.f۱۷۹۰g : this.f۱۷۹۱h;
            if (!(tvh == null || (i3 = tvh.type) == 0)) {
                int h2 = 0;
                if (i3 == 5) {
                    h2 = (int) tvh.getDimension(metrics);
                } else if (i3 == 6) {
                    int i6 = metrics.heightPixels;
                    h2 = (int) tvh.getFraction((float) i6, (float) i6);
                }
                if (h2 > 0) {
                    Rect rect2 = this.i;
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(h2 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(heightMeasureSpec)), 1073741824);
                }
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMeasuredWidth();
        boolean measure = false;
        int widthMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        if (!fixedWidth && widthMode == Integer.MIN_VALUE) {
            TypedValue tv = isPortrait ? this.f۱۷۸۷d : this.f۱۷۸۶c;
            if (!(tv == null || (i2 = tv.type) == 0)) {
                int min = 0;
                if (i2 == 5) {
                    min = (int) tv.getDimension(metrics);
                } else if (i2 == 6) {
                    int i7 = metrics.widthPixels;
                    min = (int) tv.getFraction((float) i7, (float) i7);
                }
                if (min > 0) {
                    Rect rect3 = this.i;
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
        if (this.f۱۷۸۶c == null) {
            this.f۱۷۸۶c = new TypedValue();
        }
        return this.f۱۷۸۶c;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f۱۷۸۷d == null) {
            this.f۱۷۸۷d = new TypedValue();
        }
        return this.f۱۷۸۷d;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f۱۷۸۸e == null) {
            this.f۱۷۸۸e = new TypedValue();
        }
        return this.f۱۷۸۸e;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f۱۷۸۹f == null) {
            this.f۱۷۸۹f = new TypedValue();
        }
        return this.f۱۷۸۹f;
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f۱۷۹۰g == null) {
            this.f۱۷۹۰g = new TypedValue();
        }
        return this.f۱۷۹۰g;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f۱۷۹۱h == null) {
            this.f۱۷۹۱h = new TypedValue();
        }
        return this.f۱۷۹۱h;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.j;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.j;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }
}
