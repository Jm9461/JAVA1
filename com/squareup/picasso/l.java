package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.t;

/* access modifiers changed from: package-private */
public class l extends a<ImageView> {
    e m;

    l(t picasso, ImageView imageView, w data, int memoryPolicy, int networkPolicy, int errorResId, Drawable errorDrawable, String key, Object tag, e callback, boolean noFade) {
        super(picasso, imageView, data, memoryPolicy, networkPolicy, errorResId, errorDrawable, key, tag, noFade);
        this.m = callback;
    }

    @Override // com.squareup.picasso.a
    public void a(Bitmap result, t.e from) {
        if (result != null) {
            ImageView target = this.f۳۴۹۵c.get();
            if (target != null) {
                t tVar = this.f۳۴۹۳a;
                u.a(target, tVar.f۳۵۸۹e, result, from, this.f۳۴۹۶d, tVar.m);
                e eVar = this.m;
                if (eVar != null) {
                    eVar.a();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // com.squareup.picasso.a
    public void a(Exception e2) {
        ImageView target = this.f۳۴۹۵c.get();
        if (target != null) {
            Drawable placeholder = target.getDrawable();
            if (placeholder instanceof Animatable) {
                ((Animatable) placeholder).stop();
            }
            int i = this.f۳۴۹۹g;
            if (i != 0) {
                target.setImageResource(i);
            } else {
                Drawable drawable = this.f۳۵۰۰h;
                if (drawable != null) {
                    target.setImageDrawable(drawable);
                }
            }
            e eVar = this.m;
            if (eVar != null) {
                eVar.a(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.a
    public void a() {
        super.a();
        if (this.m != null) {
            this.m = null;
        }
    }
}
