package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca;

/* renamed from: android.support.v7.widget.s  reason: invalid class name */
public class Cs extends RatingBar {

    /* renamed from: c  reason: contains not printable characters */
    private final Cr f۱۲۳۳۱c;

    public Cs(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.ratingBarStyle);
    }

    public Cs(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۲۳۳۱c = new Cr(this);
        this.f۱۲۳۳۱c.m۱۵۵۵۸a(attrs, defStyleAttr);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Bitmap sampleTile = this.f۱۲۳۳۱c.m۱۵۵۵۷a();
        if (sampleTile != null) {
            setMeasuredDimension(View.resolveSizeAndState(sampleTile.getWidth() * getNumStars(), widthMeasureSpec, 0), getMeasuredHeight());
        }
    }
}
