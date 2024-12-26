package android.support.p۰۴۳v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.k  reason: invalid class name */
public class Ck {
    /* renamed from: a  reason: contains not printable characters */
    public static ColorStateList m۱۳۲۸۵a(ImageView view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getImageTintList();
        }
        if (view instanceof AbstractCr) {
            return ((AbstractCr) view).getSupportImageTintList();
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۲۸۶a(ImageView view, ColorStateList tintList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setImageTintList(tintList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable imageViewDrawable = view.getDrawable();
                boolean hasTint = (view.getImageTintList() == null || view.getImageTintMode() == null) ? false : true;
                if (imageViewDrawable != null && hasTint) {
                    if (imageViewDrawable.isStateful()) {
                        imageViewDrawable.setState(view.getDrawableState());
                    }
                    view.setImageDrawable(imageViewDrawable);
                }
            }
        } else if (view instanceof AbstractCr) {
            ((AbstractCr) view).setSupportImageTintList(tintList);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static PorterDuff.Mode m۱۳۲۸۸b(ImageView view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getImageTintMode();
        }
        if (view instanceof AbstractCr) {
            return ((AbstractCr) view).getSupportImageTintMode();
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۲۸۷a(ImageView view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable imageViewDrawable = view.getDrawable();
                boolean hasTint = (view.getImageTintList() == null || view.getImageTintMode() == null) ? false : true;
                if (imageViewDrawable != null && hasTint) {
                    if (imageViewDrawable.isStateful()) {
                        imageViewDrawable.setState(view.getDrawableState());
                    }
                    view.setImageDrawable(imageViewDrawable);
                }
            }
        } else if (view instanceof AbstractCr) {
            ((AbstractCr) view).setSupportImageTintMode(mode);
        }
    }
}
