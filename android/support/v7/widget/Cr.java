package android.support.v7.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.graphics.drawable.InterfaceCc;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v7.widget.r, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cr {

    /* renamed from: c, reason: contains not printable characters */
    private static final int[] f۱۲۳۲۱c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: contains not printable characters */
    private final ProgressBar f۱۲۳۲۲a;

    /* renamed from: b, reason: contains not printable characters */
    private Bitmap f۱۲۳۲۳b;

    Cr(ProgressBar view) {
        this.f۱۲۳۲۲a = view;
    }

    /* renamed from: a, reason: contains not printable characters */
    void mo۱۳۵۵۸a(AttributeSet attrs, int defStyleAttr) {
        Cj1 a2 = Cj1.m۱۳۲۷۵a(this.f۱۲۳۲۲a.getContext(), attrs, f۱۲۳۲۱c, defStyleAttr, 0);
        Drawable drawable = a2.m۱۳۲۸۶c(0);
        if (drawable != null) {
            this.f۱۲۳۲۲a.setIndeterminateDrawable(m۱۳۴۸۴a(drawable));
        }
        Drawable drawable2 = a2.m۱۳۲۸۶c(1);
        if (drawable2 != null) {
            this.f۱۲۳۲۲a.setProgressDrawable(m۱۳۴۸۵a(drawable2, false));
        }
        a2.m۱۳۲۸۰a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    private Drawable m۱۳۴۸۵a(Drawable drawable, boolean clip) {
        if (drawable instanceof InterfaceCc) {
            Drawable inner = ((InterfaceCc) drawable).mo۱۰۶۵۷a();
            if (inner != null) {
                ((InterfaceCc) drawable).mo۱۰۶۵۸a(m۱۳۴۸۵a(inner, clip));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable background = (LayerDrawable) drawable;
                int N = background.getNumberOfLayers();
                Drawable[] outDrawables = new Drawable[N];
                for (int i = 0; i < N; i++) {
                    int id = background.getId(i);
                    outDrawables[i] = m۱۳۴۸۵a(background.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable newBg = new LayerDrawable(outDrawables);
                for (int i2 = 0; i2 < N; i2++) {
                    newBg.setId(i2, background.getId(i2));
                }
                return newBg;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap tileBitmap = bitmapDrawable.getBitmap();
                if (this.f۱۲۳۲۳b == null) {
                    this.f۱۲۳۲۳b = tileBitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m۱۳۴۸۶b());
                BitmapShader bitmapShader = new BitmapShader(tileBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
                shapeDrawable.getPaint().setShader(bitmapShader);
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return clip ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* renamed from: a, reason: contains not printable characters */
    private Drawable m۱۳۴۸۴a(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable background = (AnimationDrawable) drawable;
            int N = background.getNumberOfFrames();
            AnimationDrawable newBg = new AnimationDrawable();
            newBg.setOneShot(background.isOneShot());
            for (int i = 0; i < N; i++) {
                Drawable frame = m۱۳۴۸۵a(background.getFrame(i), true);
                frame.setLevel(10000);
                newBg.addFrame(frame, background.getDuration(i));
            }
            newBg.setLevel(10000);
            return newBg;
        }
        return drawable;
    }

    /* renamed from: b, reason: contains not printable characters */
    private Shape m۱۳۴۸۶b() {
        float[] roundedCorners = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
        return new RoundRectShape(roundedCorners, null, null);
    }

    /* renamed from: a, reason: contains not printable characters */
    Bitmap m۱۳۴۸۷a() {
        return this.f۱۲۳۲۳b;
    }
}
