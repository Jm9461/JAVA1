package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Ct;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.l  reason: invalid class name */
public class Cl extends AbstractCa<ImageView> {

    /* renamed from: m  reason: contains not printable characters */
    AbstractCe f۱۵۴۴۹m;

    Cl(Ct picasso, ImageView imageView, Cw data, int memoryPolicy, int networkPolicy, int errorResId, Drawable errorDrawable, String key, Object tag, AbstractCe callback, boolean noFade) {
        super(picasso, imageView, data, memoryPolicy, networkPolicy, errorResId, errorDrawable, key, tag, noFade);
        this.f۱۵۴۴۹m = callback;
    }

    @Override // com.squareup.picasso.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۶۷a(Bitmap result, Ct.EnumCe from) {
        if (result != null) {
            ImageView target = this.f۱۵۳۴۸c.get();
            if (target != null) {
                Ct tVar = this.f۱۵۳۴۶a;
                Cu.m۱۸۴۱۴a(target, tVar.f۱۵۴۸۸e, result, from, this.f۱۵۳۴۹d, tVar.f۱۵۴۹۶m);
                AbstractCe eVar = this.f۱۵۴۴۹m;
                if (eVar != null) {
                    eVar.m۱۸۳۲۹a();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // com.squareup.picasso.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۶۸a(Exception e) {
        ImageView target = this.f۱۵۳۴۸c.get();
        if (target != null) {
            Drawable placeholder = target.getDrawable();
            if (placeholder instanceof Animatable) {
                ((Animatable) placeholder).stop();
            }
            int i = this.f۱۵۳۵۲g;
            if (i != 0) {
                target.setImageResource(i);
            } else {
                Drawable drawable = this.f۱۵۳۵۳h;
                if (drawable != null) {
                    target.setImageDrawable(drawable);
                }
            }
            AbstractCe eVar = this.f۱۵۴۴۹m;
            if (eVar != null) {
                eVar.m۱۸۳۳۰a(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۶۶a() {
        super.m۱۸۲۴۳a();
        if (this.f۱۵۴۴۹m != null) {
            this.f۱۵۴۴۹m = null;
        }
    }
}
