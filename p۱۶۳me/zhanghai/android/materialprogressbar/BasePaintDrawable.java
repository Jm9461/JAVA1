package p۱۶۳me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* access modifiers changed from: package-private */
/* renamed from: me.zhanghai.android.materialprogressbar.BasePaintDrawable */
public abstract class BasePaintDrawable extends BaseDrawable {
    private Paint mPaint;

    /* access modifiers changed from: protected */
    public abstract void onDraw(Canvas canvas, int i, int i2, Paint paint);

    /* access modifiers changed from: protected */
    public abstract void onPreparePaint(Paint paint);

    BasePaintDrawable() {
    }

    /* access modifiers changed from: protected */
    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseDrawable
    public final void onDraw(Canvas canvas, int width, int height) {
        if (this.mPaint == null) {
            this.mPaint = new Paint();
            this.mPaint.setAntiAlias(true);
            this.mPaint.setColor(-16777216);
            onPreparePaint(this.mPaint);
        }
        this.mPaint.setAlpha(this.mAlpha);
        this.mPaint.setColorFilter(getColorFilterForDrawing());
        onDraw(canvas, width, height, this.mPaint);
    }
}
