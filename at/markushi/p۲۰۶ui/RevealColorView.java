package at.markushi.p۲۰۶ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import at.markushi.p۲۰۶ui.p۲۰۷a.Ca;

/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class RevealColorView extends ViewGroup {

    /* renamed from: c, reason: contains not printable characters */
    private View f۱۲۴۴۵c;

    /* renamed from: d, reason: contains not printable characters */
    private ShapeDrawable f۱۲۴۴۶d;

    public RevealColorView(Context context) {
        this(context, null);
    }

    public RevealColorView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RevealColorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (isInEditMode()) {
            return;
        }
        this.f۱۲۴۴۵c = new View(context);
        addView(this.f۱۲۴۴۵c);
        this.f۱۲۴۴۶d = new ShapeDrawable(new OvalShape());
        Ca.m۱۳۷۳۱a(this.f۱۲۴۴۵c, this.f۱۲۴۴۶d);
        this.f۱۲۴۴۵c.setVisibility(4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View view = this.f۱۲۴۴۵c;
        view.layout(left, top, view.getMeasuredWidth() + left, this.f۱۲۴۴۵c.getMeasuredHeight() + top);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        setMeasuredDimension(width, height);
        float circleSize = ((float) Math.sqrt((width * width) + (height * height))) * 2.0f;
        int size = (int) (circleSize / 8.0f);
        int sizeSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        this.f۱۲۴۴۵c.measure(sizeSpec, sizeSpec);
    }
}
