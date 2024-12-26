package at.markushi.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import at.markushi.ui.a.a;

public class RevealColorView extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    private View f۲۳۲۸c;

    /* renamed from: d  reason: collision with root package name */
    private ShapeDrawable f۲۳۲۹d;

    public RevealColorView(Context context) {
        this(context, null);
    }

    public RevealColorView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RevealColorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            this.f۲۳۲۸c = new View(context);
            addView(this.f۲۳۲۸c);
            this.f۲۳۲۹d = new ShapeDrawable(new OvalShape());
            a.a(this.f۲۳۲۸c, this.f۲۳۲۹d);
            this.f۲۳۲۸c.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View view = this.f۲۳۲۸c;
        view.layout(left, top, view.getMeasuredWidth() + left, this.f۲۳۲۸c.getMeasuredHeight() + top);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        setMeasuredDimension(width, height);
        int sizeSpec = View.MeasureSpec.makeMeasureSpec((int) ((((float) Math.sqrt((double) ((width * width) + (height * height)))) * 2.0f) / 8.0f), 1073741824);
        this.f۲۳۲۸c.measure(sizeSpec, sizeSpec);
    }
}
