package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;

/* renamed from: android.support.v7.widget.s, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cs extends RatingBar {

    /* renamed from: c, reason: contains not printable characters */
    private final Cr f۱۲۳۳۱c;

    public Cs(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.ratingBarStyle);
    }

    public Cs(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۲۳۳۱c = new Cr(this);
        this.f۱۲۳۳۱c.mo۱۳۵۵۸a(attrs, defStyleAttr);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Bitmap sampleTile = this.f۱۲۳۳۱c.m۱۳۴۸۷a();
        if (sampleTile != null) {
            int width = sampleTile.getWidth() * getNumStars();
            setMeasuredDimension(View.resolveSizeAndState(width, widthMeasureSpec, 0), getMeasuredHeight());
        }
    }
}
