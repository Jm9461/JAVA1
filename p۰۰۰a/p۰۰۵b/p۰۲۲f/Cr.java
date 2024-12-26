package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: a.b.f.r  reason: invalid class name */
class Cr {

    /* renamed from: a  reason: contains not printable characters */
    private static final boolean f۸۶۲۷a = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: b  reason: contains not printable characters */
    private static final boolean f۸۶۲۸b = (Build.VERSION.SDK_INT >= 18);

    /* renamed from: c  reason: contains not printable characters */
    private static final boolean f۸۶۲۹c;

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 28) {
            z = false;
        }
        f۸۶۲۹c = z;
    }

    /* renamed from: a  reason: contains not printable characters */
    static View m۱۰۴۰۱a(ViewGroup sceneRoot, View view, View parent) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-parent.getScrollX()), (float) (-parent.getScrollY()));
        Cd0.m۱۰۲۱۷a(view, matrix);
        Cd0.m۱۰۲۱۹b(sceneRoot, matrix);
        RectF bounds = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(bounds);
        int left = Math.round(bounds.left);
        int top = Math.round(bounds.top);
        int right = Math.round(bounds.right);
        int bottom = Math.round(bounds.bottom);
        ImageView copy = new ImageView(view.getContext());
        copy.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmap = m۱۰۴۰۰a(view, matrix, bounds, sceneRoot);
        if (bitmap != null) {
            copy.setImageBitmap(bitmap);
        }
        copy.measure(View.MeasureSpec.makeMeasureSpec(right - left, 1073741824), View.MeasureSpec.makeMeasureSpec(bottom - top, 1073741824));
        copy.layout(left, top, right, bottom);
        return copy;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Bitmap m۱۰۴۰۰a(View view, Matrix matrix, RectF bounds, ViewGroup sceneRoot) {
        boolean sceneRootIsAttached;
        boolean addToOverlay;
        if (f۸۶۲۷a) {
            addToOverlay = !view.isAttachedToWindow();
            sceneRootIsAttached = sceneRoot == null ? false : sceneRoot.isAttachedToWindow();
        } else {
            addToOverlay = false;
            sceneRootIsAttached = false;
        }
        ViewGroup parent = null;
        int indexInParent = 0;
        if (f۸۶۲۸b && addToOverlay) {
            if (!sceneRootIsAttached) {
                return null;
            }
            parent = (ViewGroup) view.getParent();
            indexInParent = parent.indexOfChild(view);
            sceneRoot.getOverlay().add(view);
        }
        Bitmap bitmap = null;
        int bitmapWidth = Math.round(bounds.width());
        int bitmapHeight = Math.round(bounds.height());
        if (bitmapWidth > 0 && bitmapHeight > 0) {
            float scale = Math.min(1.0f, 1048576.0f / ((float) (bitmapWidth * bitmapHeight)));
            int bitmapWidth2 = Math.round(((float) bitmapWidth) * scale);
            int bitmapHeight2 = Math.round(((float) bitmapHeight) * scale);
            matrix.postTranslate(-bounds.left, -bounds.top);
            matrix.postScale(scale, scale);
            if (f۸۶۲۹c) {
                Picture picture = new Picture();
                Canvas canvas = picture.beginRecording(bitmapWidth2, bitmapHeight2);
                canvas.concat(matrix);
                view.draw(canvas);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(bitmapWidth2, bitmapHeight2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmap);
                canvas2.concat(matrix);
                view.draw(canvas2);
            }
        }
        if (f۸۶۲۸b && addToOverlay) {
            sceneRoot.getOverlay().remove(view);
            parent.addView(view, indexInParent);
        }
        return bitmap;
    }

    /* renamed from: a  reason: contains not printable characters */
    static Animator m۱۰۳۹۹a(Animator animator1, Animator animator2) {
        if (animator1 == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator1;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator1, animator2);
        return animatorSet;
    }
}
