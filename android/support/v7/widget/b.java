package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
public class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final ActionBarContainer f۱۹۷۷a;

    public b(ActionBarContainer container) {
        this.f۱۹۷۷a = container;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f۱۹۷۷a;
        if (actionBarContainer.j) {
            Drawable drawable = actionBarContainer.i;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f۱۷۴۹g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f۱۹۷۷a;
        Drawable drawable3 = actionBarContainer2.f۱۷۵۰h;
        if (drawable3 != null && actionBarContainer2.k) {
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
        ActionBarContainer actionBarContainer = this.f۱۹۷۷a;
        if (actionBarContainer.j) {
            Drawable drawable = actionBarContainer.i;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f۱۷۴۹g;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }
}
