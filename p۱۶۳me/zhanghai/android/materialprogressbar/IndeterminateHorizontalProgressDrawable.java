package p۱۶۳me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.Keep;
import p۱۶۳me.zhanghai.android.materialprogressbar.internal.ThemeUtils;

/* renamed from: me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable */
public class IndeterminateHorizontalProgressDrawable extends BaseIndeterminateProgressDrawable implements MaterialProgressDrawable, ShowBackgroundDrawable {
    private static final int PADDED_INTRINSIC_HEIGHT_DP = 16;
    private static final int PROGRESS_INTRINSIC_HEIGHT_DP = 4;
    private static final RectTransformX RECT_1_TRANSFORM_X = new RectTransformX(-522.6f, 0.1f);
    private static final RectTransformX RECT_2_TRANSFORM_X = new RectTransformX(-197.6f, 0.1f);
    private static final RectF RECT_BOUND = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);
    private static final RectF RECT_PROGRESS = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);
    private float mBackgroundAlpha;
    private int mPaddedIntrinsicHeight;
    private int mProgressIntrinsicHeight;
    private RectTransformX mRect1TransformX = new RectTransformX(RECT_1_TRANSFORM_X);
    private RectTransformX mRect2TransformX = new RectTransformX(RECT_2_TRANSFORM_X);
    private boolean mShowBackground = true;

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseDrawable, p۱۶۳me.zhanghai.android.materialprogressbar.BaseIndeterminateProgressDrawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseDrawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseDrawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseDrawable
    public /* bridge */ /* synthetic */ Drawable.ConstantState getConstantState() {
        return super.getConstantState();
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseDrawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseProgressDrawable, p۱۶۳me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable
    public /* bridge */ /* synthetic */ boolean getUseIntrinsicPadding() {
        return super.getUseIntrinsicPadding();
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseIndeterminateProgressDrawable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseDrawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseDrawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseDrawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.TintableDrawable, p۱۶۳me.zhanghai.android.materialprogressbar.BaseDrawable
    public /* bridge */ /* synthetic */ void setTint(int i) {
        super.setTint(i);
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.TintableDrawable, p۱۶۳me.zhanghai.android.materialprogressbar.BaseDrawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.TintableDrawable, p۱۶۳me.zhanghai.android.materialprogressbar.BaseDrawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseProgressDrawable, p۱۶۳me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable
    public /* bridge */ /* synthetic */ void setUseIntrinsicPadding(boolean z) {
        super.setUseIntrinsicPadding(z);
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseIndeterminateProgressDrawable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BaseIndeterminateProgressDrawable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public IndeterminateHorizontalProgressDrawable(Context context) {
        super(context);
        float density = context.getResources().getDisplayMetrics().density;
        this.mProgressIntrinsicHeight = Math.round(4.0f * density);
        this.mPaddedIntrinsicHeight = Math.round(16.0f * density);
        this.mBackgroundAlpha = ThemeUtils.getFloatFromAttrRes(16842803, 0.0f, context);
        this.mAnimators = new Animator[]{Animators.createIndeterminateHorizontalRect1(this.mRect1TransformX), Animators.createIndeterminateHorizontalRect2(this.mRect2TransformX)};
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean show) {
        if (this.mShowBackground != show) {
            this.mShowBackground = show;
            invalidateSelf();
        }
    }

    public int getIntrinsicHeight() {
        return this.mUseIntrinsicPadding ? this.mPaddedIntrinsicHeight : this.mProgressIntrinsicHeight;
    }

    /* access modifiers changed from: protected */
    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BasePaintDrawable
    public void onPreparePaint(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    /* access modifiers changed from: protected */
    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.BasePaintDrawable
    public void onDraw(Canvas canvas, int width, int height, Paint paint) {
        if (this.mUseIntrinsicPadding) {
            canvas.scale(((float) width) / RECT_PADDED_BOUND.width(), ((float) height) / RECT_PADDED_BOUND.height());
            canvas.translate(RECT_PADDED_BOUND.width() / 2.0f, RECT_PADDED_BOUND.height() / 2.0f);
        } else {
            canvas.scale(((float) width) / RECT_BOUND.width(), ((float) height) / RECT_BOUND.height());
            canvas.translate(RECT_BOUND.width() / 2.0f, RECT_BOUND.height() / 2.0f);
        }
        if (this.mShowBackground) {
            paint.setAlpha(Math.round(((float) this.mAlpha) * this.mBackgroundAlpha));
            drawBackgroundRect(canvas, paint);
            paint.setAlpha(this.mAlpha);
        }
        drawProgressRect(canvas, this.mRect2TransformX, paint);
        drawProgressRect(canvas, this.mRect1TransformX, paint);
    }

    private static void drawBackgroundRect(Canvas canvas, Paint paint) {
        canvas.drawRect(RECT_BOUND, paint);
    }

    private static void drawProgressRect(Canvas canvas, RectTransformX transformX, Paint paint) {
        int saveCount = canvas.save();
        canvas.translate(transformX.mTranslateX, 0.0f);
        canvas.scale(transformX.mScaleX, 1.0f);
        canvas.drawRect(RECT_PROGRESS, paint);
        canvas.restoreToCount(saveCount);
    }

    /* access modifiers changed from: private */
    /* renamed from: me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable$RectTransformX */
    public static class RectTransformX {
        public float mScaleX;
        public float mTranslateX;

        public RectTransformX(float translateX, float scaleX) {
            this.mTranslateX = translateX;
            this.mScaleX = scaleX;
        }

        public RectTransformX(RectTransformX that) {
            this.mTranslateX = that.mTranslateX;
            this.mScaleX = that.mScaleX;
        }

        @Keep
        public void setTranslateX(float translateX) {
            this.mTranslateX = translateX;
        }

        @Keep
        public void setScaleX(float scaleX) {
            this.mScaleX = scaleX;
        }
    }
}
