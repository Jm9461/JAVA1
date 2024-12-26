package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p۰۴۳v4.view.AbstractCt;
import android.support.p۰۴۳v4.widget.AbstractCr;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca;

/* renamed from: android.support.v7.widget.m  reason: invalid class name */
public class Cm extends ImageButton implements AbstractCt, AbstractCr {

    /* renamed from: c  reason: contains not printable characters */
    private final Cf f۱۲۱۹۱c;

    /* renamed from: d  reason: contains not printable characters */
    private final Cn f۱۲۱۹۲d;

    public Cm(Context context) {
        this(context, null);
    }

    public Cm(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.imageButtonStyle);
    }

    public Cm(Context context, AttributeSet attrs, int defStyleAttr) {
        super(Cg1.m۱۵۲۵۳b(context), attrs, defStyleAttr);
        this.f۱۲۱۹۱c = new Cf(this);
        this.f۱۲۱۹۱c.m۱۵۲۰۲a(attrs, defStyleAttr);
        this.f۱۲۱۹۲d = new Cn(this);
        this.f۱۲۱۹۲d.m۱۵۴۴۹a(attrs, defStyleAttr);
    }

    public void setImageResource(int resId) {
        this.f۱۲۱۹۲d.m۱۵۴۴۶a(resId);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        Cn nVar = this.f۱۲۱۹۲d;
        if (nVar != null) {
            nVar.m۱۵۴۴۵a();
        }
    }

    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        Cn nVar = this.f۱۲۱۹۲d;
        if (nVar != null) {
            nVar.m۱۵۴۴۵a();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        Cn nVar = this.f۱۲۱۹۲d;
        if (nVar != null) {
            nVar.m۱۵۴۴۵a();
        }
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        Cf fVar = this.f۱۲۱۹۱c;
        if (fVar != null) {
            fVar.m۱۵۱۹۸a(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        Cf fVar = this.f۱۲۱۹۱c;
        if (fVar != null) {
            fVar.m۱۵۲۰۱a(background);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintList(ColorStateList tint) {
        Cf fVar = this.f۱۲۱۹۱c;
        if (fVar != null) {
            fVar.m۱۵۲۰۴b(tint);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public ColorStateList getSupportBackgroundTintList() {
        Cf fVar = this.f۱۲۱۹۱c;
        if (fVar != null) {
            return fVar.m۱۵۲۰۳b();
        }
        return null;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        Cf fVar = this.f۱۲۱۹۱c;
        if (fVar != null) {
            fVar.m۱۵۲۰۰a(tintMode);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Cf fVar = this.f۱۲۱۹۱c;
        if (fVar != null) {
            return fVar.m۱۵۲۰۵c();
        }
        return null;
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCr
    public void setSupportImageTintList(ColorStateList tint) {
        Cn nVar = this.f۱۲۱۹۲d;
        if (nVar != null) {
            nVar.m۱۵۴۴۷a(tint);
        }
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCr
    public ColorStateList getSupportImageTintList() {
        Cn nVar = this.f۱۲۱۹۲d;
        if (nVar != null) {
            return nVar.m۱۵۴۵۰b();
        }
        return null;
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCr
    public void setSupportImageTintMode(PorterDuff.Mode tintMode) {
        Cn nVar = this.f۱۲۱۹۲d;
        if (nVar != null) {
            nVar.m۱۵۴۴۸a(tintMode);
        }
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCr
    public PorterDuff.Mode getSupportImageTintMode() {
        Cn nVar = this.f۱۲۱۹۲d;
        if (nVar != null) {
            return nVar.m۱۵۴۵۱c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Cf fVar = this.f۱۲۱۹۱c;
        if (fVar != null) {
            fVar.m۱۵۱۹۷a();
        }
        Cn nVar = this.f۱۲۱۹۲d;
        if (nVar != null) {
            nVar.m۱۵۴۴۵a();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f۱۲۱۹۲d.m۱۵۴۵۲d() && super.hasOverlappingRendering();
    }
}
