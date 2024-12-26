package android.support.v7.widget;

import a.b.h.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.t;
import android.support.v4.widget.r;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class m extends ImageButton implements t, r {

    /* renamed from: c  reason: collision with root package name */
    private final f f۲۱۵۳c;

    /* renamed from: d  reason: collision with root package name */
    private final n f۲۱۵۴d;

    public m(Context context) {
        this(context, null);
    }

    public m(Context context, AttributeSet attrs) {
        this(context, attrs, a.imageButtonStyle);
    }

    public m(Context context, AttributeSet attrs, int defStyleAttr) {
        super(g1.b(context), attrs, defStyleAttr);
        this.f۲۱۵۳c = new f(this);
        this.f۲۱۵۳c.a(attrs, defStyleAttr);
        this.f۲۱۵۴d = new n(this);
        this.f۲۱۵۴d.a(attrs, defStyleAttr);
    }

    public void setImageResource(int resId) {
        this.f۲۱۵۴d.a(resId);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        n nVar = this.f۲۱۵۴d;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        n nVar = this.f۲۱۵۴d;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f۲۱۵۴d;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        f fVar = this.f۲۱۵۳c;
        if (fVar != null) {
            fVar.a(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        f fVar = this.f۲۱۵۳c;
        if (fVar != null) {
            fVar.a(background);
        }
    }

    @Override // android.support.v4.view.t
    public void setSupportBackgroundTintList(ColorStateList tint) {
        f fVar = this.f۲۱۵۳c;
        if (fVar != null) {
            fVar.b(tint);
        }
    }

    @Override // android.support.v4.view.t
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f۲۱۵۳c;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    @Override // android.support.v4.view.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        f fVar = this.f۲۱۵۳c;
        if (fVar != null) {
            fVar.a(tintMode);
        }
    }

    @Override // android.support.v4.view.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f۲۱۵۳c;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // android.support.v4.widget.r
    public void setSupportImageTintList(ColorStateList tint) {
        n nVar = this.f۲۱۵۴d;
        if (nVar != null) {
            nVar.a(tint);
        }
    }

    @Override // android.support.v4.widget.r
    public ColorStateList getSupportImageTintList() {
        n nVar = this.f۲۱۵۴d;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    @Override // android.support.v4.widget.r
    public void setSupportImageTintMode(PorterDuff.Mode tintMode) {
        n nVar = this.f۲۱۵۴d;
        if (nVar != null) {
            nVar.a(tintMode);
        }
    }

    @Override // android.support.v4.widget.r
    public PorterDuff.Mode getSupportImageTintMode() {
        n nVar = this.f۲۱۵۴d;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f۲۱۵۳c;
        if (fVar != null) {
            fVar.a();
        }
        n nVar = this.f۲۱۵۴d;
        if (nVar != null) {
            nVar.a();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f۲۱۵۴d.d() && super.hasOverlappingRendering();
    }
}
