package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.k, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ck {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public static ColorStateList m۱۱۲۱۵a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof InterfaceCr) {
            return ((InterfaceCr) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۱۲۱۶a(ImageView imageView, ColorStateList tintList) {
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(tintList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable imageViewDrawable = imageView.getDrawable();
                boolean hasTint = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (imageViewDrawable != null && hasTint) {
                    if (imageViewDrawable.isStateful()) {
                        imageViewDrawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(imageViewDrawable);
                    return;
                }
                return;
            }
            return;
        }
        if (imageView instanceof InterfaceCr) {
            ((InterfaceCr) imageView).setSupportImageTintList(tintList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b, reason: contains not printable characters */
    public static PorterDuff.Mode m۱۱۲۱۸b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof InterfaceCr) {
            return ((InterfaceCr) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۱۲۱۷a(ImageView imageView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable imageViewDrawable = imageView.getDrawable();
                boolean hasTint = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (imageViewDrawable != null && hasTint) {
                    if (imageViewDrawable.isStateful()) {
                        imageViewDrawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(imageViewDrawable);
                    return;
                }
                return;
            }
            return;
        }
        if (imageView instanceof InterfaceCr) {
            ((InterfaceCr) imageView).setSupportImageTintMode(mode);
        }
    }
}
