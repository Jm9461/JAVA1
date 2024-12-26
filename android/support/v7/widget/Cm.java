package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.InterfaceCt;
import android.support.v4.widget.InterfaceCr;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;

/* renamed from: android.support.v7.widget.m, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cm extends ImageButton implements InterfaceCt, InterfaceCr {

    /* renamed from: c, reason: contains not printable characters */
    private final Cf f۱۲۱۹۱c;

    /* renamed from: d, reason: contains not printable characters */
    private final Cn f۱۲۱۹۲d;

    public Cm(Context context) {
        this(context, null);
    }

    public Cm(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.imageButtonStyle);
    }

    public Cm(Context context, AttributeSet attrs, int defStyleAttr) {
        super(Cg1.m۱۳۱۸۳b(context), attrs, defStyleAttr);
        this.f۱۲۱۹۱c = new Cf(this);
        this.f۱۲۱۹۱c.m۱۳۱۳۲a(attrs, defStyleAttr);
        this.f۱۲۱۹۲d = new Cn(this);
        this.f۱۲۱۹۲d.m۱۳۳۷۹a(attrs, defStyleAttr);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int resId) {
        this.f۱۲۱۹۲d.m۱۳۳۷۶a(resId);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        Cn cn = this.f۱۲۱۹۲d;
        if (cn != null) {
            cn.m۱۳۳۷۵a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        Cn cn = this.f۱۲۱۹۲d;
        if (cn != null) {
            cn.m۱۳۳۷۵a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        Cn cn = this.f۱۲۱۹۲d;
        if (cn != null) {
            cn.m۱۳۳۷۵a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        Cf cf = this.f۱۲۱۹۱c;
        if (cf != null) {
            cf.m۱۳۱۲۸a(resId);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        Cf cf = this.f۱۲۱۹۱c;
        if (cf != null) {
            cf.m۱۳۱۳۱a(background);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public void setSupportBackgroundTintList(ColorStateList tint) {
        Cf cf = this.f۱۲۱۹۱c;
        if (cf != null) {
            cf.m۱۳۱۳۴b(tint);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public ColorStateList getSupportBackgroundTintList() {
        Cf cf = this.f۱۲۱۹۱c;
        if (cf != null) {
            return cf.m۱۳۱۳۳b();
        }
        return null;
    }

    @Override // android.support.v4.view.InterfaceCt
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        Cf cf = this.f۱۲۱۹۱c;
        if (cf != null) {
            cf.m۱۳۱۳۰a(tintMode);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Cf cf = this.f۱۲۱۹۱c;
        if (cf != null) {
            return cf.m۱۳۱۳۵c();
        }
        return null;
    }

    @Override // android.support.v4.widget.InterfaceCr
    public void setSupportImageTintList(ColorStateList tint) {
        Cn cn = this.f۱۲۱۹۲d;
        if (cn != null) {
            cn.m۱۳۳۷۷a(tint);
        }
    }

    @Override // android.support.v4.widget.InterfaceCr
    public ColorStateList getSupportImageTintList() {
        Cn cn = this.f۱۲۱۹۲d;
        if (cn != null) {
            return cn.m۱۳۳۸۰b();
        }
        return null;
    }

    @Override // android.support.v4.widget.InterfaceCr
    public void setSupportImageTintMode(PorterDuff.Mode tintMode) {
        Cn cn = this.f۱۲۱۹۲d;
        if (cn != null) {
            cn.m۱۳۳۷۸a(tintMode);
        }
    }

    @Override // android.support.v4.widget.InterfaceCr
    public PorterDuff.Mode getSupportImageTintMode() {
        Cn cn = this.f۱۲۱۹۲d;
        if (cn != null) {
            return cn.m۱۳۳۸۱c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Cf cf = this.f۱۲۱۹۱c;
        if (cf != null) {
            cf.m۱۳۱۲۷a();
        }
        Cn cn = this.f۱۲۱۹۲d;
        if (cn != null) {
            cn.m۱۳۳۷۵a();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f۱۲۱۹۲d.m۱۳۳۸۲d() && super.hasOverlappingRendering();
    }
}
