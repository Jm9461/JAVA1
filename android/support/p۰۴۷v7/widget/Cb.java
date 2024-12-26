package android.support.p۰۴۷v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.b  reason: invalid class name */
public class Cb extends Drawable {

    /* renamed from: a  reason: contains not printable characters */
    final ActionBarContainer f۱۱۹۱۳a;

    public Cb(ActionBarContainer container) {
        this.f۱۱۹۱۳a = container;
    }

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

    public void setAlpha(int alpha) {
    }

    public void setColorFilter(ColorFilter cf) {
    }

    public int getOpacity() {
        return 0;
    }

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
