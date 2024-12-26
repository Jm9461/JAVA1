package p۱۶۳me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable */
public class HorizontalProgressDrawable extends BaseProgressLayerDrawable<SingleHorizontalProgressDrawable, HorizontalProgressBackgroundDrawable> {
    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable, p۱۶۳me.zhanghai.android.materialprogressbar.BaseProgressLayerDrawable
    public /* bridge */ /* synthetic */ boolean getShowBackground() {
        return super.getShowBackground();
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable, p۱۶۳me.zhanghai.android.materialprogressbar.BaseProgressLayerDrawable
    public /* bridge */ /* synthetic */ boolean getUseIntrinsicPadding() {
        return super.getUseIntrinsicPadding();
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable, p۱۶۳me.zhanghai.android.materialprogressbar.BaseProgressLayerDrawable
    public /* bridge */ /* synthetic */ void setShowBackground(boolean z) {
        super.setShowBackground(z);
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.TintableDrawable, p۱۶۳me.zhanghai.android.materialprogressbar.BaseProgressLayerDrawable
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void setTint(int i) {
        super.setTint(i);
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.TintableDrawable, p۱۶۳me.zhanghai.android.materialprogressbar.BaseProgressLayerDrawable
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.TintableDrawable, p۱۶۳me.zhanghai.android.materialprogressbar.BaseProgressLayerDrawable
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // p۱۶۳me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable, p۱۶۳me.zhanghai.android.materialprogressbar.BaseProgressLayerDrawable
    public /* bridge */ /* synthetic */ void setUseIntrinsicPadding(boolean z) {
        super.setUseIntrinsicPadding(z);
    }

    public HorizontalProgressDrawable(Context context) {
        super(new Drawable[]{new HorizontalProgressBackgroundDrawable(context), new SingleHorizontalProgressDrawable(context), new SingleHorizontalProgressDrawable(context)}, context);
    }
}
