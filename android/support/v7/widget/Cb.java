package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cb extends Drawable {

    /* renamed from: a, reason: contains not printable characters */
    final ActionBarContainer f۱۱۹۱۳a;

    public Cb(ActionBarContainer container) {
        this.f۱۱۹۱۳a = container;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f۱۱۹۱۳a;
        if (actionBarContainer.f۱۱۳۷۸j) {
            Drawable drawable = actionBarContainer.f۱۱۳۷۷i;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f۱۱۳۷۵g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f۱۱۹۱۳a;
        Drawable drawable3 = actionBarContainer2.f۱۱۳۷۶h;
        if (drawable3 != null && actionBarContainer2.f۱۱۳۷۹k) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f۱۱۹۱۳a;
        if (actionBarContainer.f۱۱۳۷۸j) {
            Drawable drawable = actionBarContainer.f۱۱۳۷۷i;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f۱۱۳۷۵g;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }
}
