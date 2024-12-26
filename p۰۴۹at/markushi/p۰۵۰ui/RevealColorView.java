package p۰۴۹at.markushi.p۰۵۰ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p۰۴۹at.markushi.p۰۵۰ui.p۰۵۱a.Ca;

/* renamed from: at.markushi.ui.RevealColorView */
public class RevealColorView extends ViewGroup {

    /* renamed from: c  reason: contains not printable characters */
    private View f۱۲۴۴۵c;

    /* renamed from: d  reason: contains not printable characters */
    private ShapeDrawable f۱۲۴۴۶d;

    public RevealColorView(Context context) {
        this(context, null);
    }

    public RevealColorView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RevealColorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            this.f۱۲۴۴۵c = new View(context);
            addView(this.f۱۲۴۴۵c);
            this.f۱۲۴۴۶d = new ShapeDrawable(new OvalShape());
            Ca.m۱۵۸۰۱a(this.f۱۲۴۴۵c, this.f۱۲۴۴۶d);
            this.f۱۲۴۴۵c.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View view = this.f۱۲۴۴۵c;
        view.layout(left, top, view.getMeasuredWidth() + left, this.f۱۲۴۴۵c.getMeasuredHeight() + top);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        setMeasuredDimension(width, height);
        int sizeSpec = View.MeasureSpec.makeMeasureSpec((int) ((((float) Math.sqrt((double) ((width * width) + (height * height)))) * 2.0f) / 8.0f), 1073741824);
        this.f۱۲۴۴۵c.measure(sizeSpec, sizeSpec);
    }
}
