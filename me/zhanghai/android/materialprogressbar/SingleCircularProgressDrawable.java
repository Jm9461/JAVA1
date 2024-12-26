package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

class SingleCircularProgressDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private static final float START_ANGLE_MAX_DYNAMIC = 360.0f;
    private static final float START_ANGLE_MAX_NORMAL = 0.0f;
    private static final float SWEEP_ANGLE_MAX = 360.0f;
    private boolean mShowBackground;
    private final float mStartAngleMax;

    SingleCircularProgressDrawable(int style) {
        if (style == 0) {
            this.mStartAngleMax = START_ANGLE_MAX_NORMAL;
        } else if (style == 1) {
            this.mStartAngleMax = 360.0f;
        } else {
            throw new IllegalArgumentException("Invalid value for style");
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int level) {
        invalidateSelf();
        return true;
    }

    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean show) {
        if (this.mShowBackground != show) {
            this.mShowBackground = show;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    @Override // me.zhanghai.android.materialprogressbar.BaseSingleCircularProgressDrawable
    public void onDrawRing(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level != 0) {
            float ratio = ((float) level) / 10000.0f;
            float startAngle = this.mStartAngleMax * ratio;
            float sweepAngle = 360.0f * ratio;
            drawRing(canvas, paint, startAngle, sweepAngle);
            if (this.mShowBackground) {
                drawRing(canvas, paint, startAngle, sweepAngle);
            }
        }
    }
}
