package android.support.p۰۴۷v7.widget;

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
import android.support.p۰۴۳v4.graphics.drawable.AbstractCc;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.r  reason: invalid class name */
public class Cr {

    /* renamed from: c  reason: contains not printable characters */
    private static final int[] f۱۲۳۲۱c = {16843067, 16843068};

    /* renamed from: a  reason: contains not printable characters */
    private final ProgressBar f۱۲۳۲۲a;

    /* renamed from: b  reason: contains not printable characters */
    private Bitmap f۱۲۳۲۳b;

    Cr(ProgressBar view) {
        this.f۱۲۳۲۲a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۵۵۸a(AttributeSet attrs, int defStyleAttr) {
        Cj1 a = Cj1.m۱۵۳۴۵a(this.f۱۲۳۲۲a.getContext(), attrs, f۱۲۳۲۱c, defStyleAttr, 0);
        Drawable drawable = a.m۱۵۳۵۶c(0);
        if (drawable != null) {
            this.f۱۲۳۲۲a.setIndeterminateDrawable(m۱۵۵۵۴a(drawable));
        }
        Drawable drawable2 = a.m۱۵۳۵۶c(1);
        if (drawable2 != null) {
            this.f۱۲۳۲۲a.setProgressDrawable(m۱۵۵۵۵a(drawable2, false));
        }
        a.m۱۵۳۵۰a();
    }

    /* renamed from: a  reason: contains not printable characters */
    private Drawable m۱۵۵۵۵a(Drawable drawable, boolean clip) {
        if (drawable instanceof AbstractCc) {
            Drawable inner = ((AbstractCc) drawable).m۱۲۷۲۳a();
            if (inner != null) {
                ((AbstractCc) drawable).m۱۲۷۲۴a(m۱۵۵۵۵a(inner, clip));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable background = (LayerDrawable) drawable;
            int N = background.getNumberOfLayers();
            Drawable[] outDrawables = new Drawable[N];
            for (int i = 0; i < N; i++) {
                int id = background.getId(i);
                outDrawables[i] = m۱۵۵۵۵a(background.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable newBg = new LayerDrawable(outDrawables);
            for (int i2 = 0; i2 < N; i2++) {
                newBg.setId(i2, background.getId(i2));
            }
            return newBg;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap tileBitmap = bitmapDrawable.getBitmap();
            if (this.f۱۲۳۲۳b == null) {
                this.f۱۲۳۲۳b = tileBitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m۱۵۵۵۶b());
            shapeDrawable.getPaint().setShader(new BitmapShader(tileBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return clip ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Drawable m۱۵۵۵۴a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable background = (AnimationDrawable) drawable;
        int N = background.getNumberOfFrames();
        AnimationDrawable newBg = new AnimationDrawable();
        newBg.setOneShot(background.isOneShot());
        for (int i = 0; i < N; i++) {
            Drawable frame = m۱۵۵۵۵a(background.getFrame(i), true);
            frame.setLevel(10000);
            newBg.addFrame(frame, background.getDuration(i));
        }
        newBg.setLevel(10000);
        return newBg;
    }

    /* renamed from: b  reason: contains not printable characters */
    private Shape m۱۵۵۵۶b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Bitmap m۱۵۵۵۷a() {
        return this.f۱۲۳۲۳b;
    }
}
