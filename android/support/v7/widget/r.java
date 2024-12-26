package android.support.v7.widget;

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
import android.support.v4.graphics.drawable.c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* access modifiers changed from: package-private */
public class r {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f۲۲۴۰c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    private final ProgressBar f۲۲۴۱a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f۲۲۴۲b;

    r(ProgressBar view) {
        this.f۲۲۴۱a = view;
    }

    /* access modifiers changed from: package-private */
    public void a(AttributeSet attrs, int defStyleAttr) {
        j1 a2 = j1.a(this.f۲۲۴۱a.getContext(), attrs, f۲۲۴۰c, defStyleAttr, 0);
        Drawable drawable = a2.c(0);
        if (drawable != null) {
            this.f۲۲۴۱a.setIndeterminateDrawable(a(drawable));
        }
        Drawable drawable2 = a2.c(1);
        if (drawable2 != null) {
            this.f۲۲۴۱a.setProgressDrawable(a(drawable2, false));
        }
        a2.a();
    }

    private Drawable a(Drawable drawable, boolean clip) {
        if (drawable instanceof c) {
            Drawable inner = ((c) drawable).a();
            if (inner != null) {
                ((c) drawable).a(a(inner, clip));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable background = (LayerDrawable) drawable;
            int N = background.getNumberOfLayers();
            Drawable[] outDrawables = new Drawable[N];
            for (int i = 0; i < N; i++) {
                int id = background.getId(i);
                outDrawables[i] = a(background.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable newBg = new LayerDrawable(outDrawables);
            for (int i2 = 0; i2 < N; i2++) {
                newBg.setId(i2, background.getId(i2));
            }
            return newBg;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap tileBitmap = bitmapDrawable.getBitmap();
            if (this.f۲۲۴۲b == null) {
                this.f۲۲۴۲b = tileBitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(b());
            shapeDrawable.getPaint().setShader(new BitmapShader(tileBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return clip ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    private Drawable a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable background = (AnimationDrawable) drawable;
        int N = background.getNumberOfFrames();
        AnimationDrawable newBg = new AnimationDrawable();
        newBg.setOneShot(background.isOneShot());
        for (int i = 0; i < N; i++) {
            Drawable frame = a(background.getFrame(i), true);
            frame.setLevel(10000);
            newBg.addFrame(frame, background.getDuration(i));
        }
        newBg.setLevel(10000);
        return newBg;
    }

    private Shape b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* access modifiers changed from: package-private */
    public Bitmap a() {
        return this.f۲۲۴۲b;
    }
}
