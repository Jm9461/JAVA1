package p۱۶۳me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;

/* access modifiers changed from: package-private */
/* renamed from: me.zhanghai.android.materialprogressbar.HorizontalProgressBackgroundDrawable */
public class HorizontalProgressBackgroundDrawable extends BaseSingleHorizontalProgressDrawable implements ShowBackgroundDrawable {
    private boolean mShow = true;

    public HorizontalProgressBackgroundDrawable(Context context) {
        super(context);
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return this.mShow;
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean show) {
        if (this.mShow != show) {
            this.mShow = show;
            invalidateSelf();
        }
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseDrawable
    public void draw(Canvas canvas) {
        if (this.mShow) {
            super.draw(canvas);
        }
    }
}
