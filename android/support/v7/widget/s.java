package android.support.v7.widget;

import a.b.h.a.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public class s extends RatingBar {

    /* renamed from: c  reason: collision with root package name */
    private final r f۲۲۴۴c;

    public s(Context context, AttributeSet attrs) {
        this(context, attrs, a.ratingBarStyle);
    }

    public s(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۲۲۴۴c = new r(this);
        this.f۲۲۴۴c.a(attrs, defStyleAttr);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Bitmap sampleTile = this.f۲۲۴۴c.a();
        if (sampleTile != null) {
            setMeasuredDimension(View.resolveSizeAndState(sampleTile.getWidth() * getNumStars(), widthMeasureSpec, 0), getMeasuredHeight());
        }
    }
}
