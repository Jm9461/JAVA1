package android.support.constraint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.view.View;

/* renamed from: android.support.constraint.f  reason: invalid class name */
public class Cf extends View {

    /* renamed from: c  reason: contains not printable characters */
    private int f۹۱۹۹c;

    /* renamed from: d  reason: contains not printable characters */
    private View f۹۲۰۰d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۹۲۰۱e;

    public void setEmptyVisibility(int visibility) {
        this.f۹۲۰۱e = visibility;
    }

    public int getEmptyVisibility() {
        return this.f۹۲۰۱e;
    }

    public View getContent() {
        return this.f۹۲۰۰d;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect r = new Rect();
            canvas.getClipBounds(r);
            paint.setTextSize((float) r.height());
            int cHeight = r.height();
            int cWidth = r.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, "?".length(), r);
            canvas.drawText("?", ((((float) cWidth) / 2.0f) - (((float) r.width()) / 2.0f)) - ((float) r.left), ((((float) cHeight) / 2.0f) + (((float) r.height()) / 2.0f)) - ((float) r.bottom), paint);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۹۷۹b(ConstraintLayout container) {
        if (this.f۹۱۹۹c == -1 && !isInEditMode()) {
            setVisibility(this.f۹۲۰۱e);
        }
        this.f۹۲۰۰d = container.findViewById(this.f۹۱۹۹c);
        View view = this.f۹۲۰۰d;
        if (view != null) {
            ((ConstraintLayout.Ca) view.getLayoutParams()).f۹۰۶۱Z = true;
            this.f۹۲۰۰d.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int id) {
        View v;
        if (this.f۹۱۹۹c != id) {
            View view = this.f۹۲۰۰d;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.Ca) this.f۹۲۰۰d.getLayoutParams()).f۹۰۶۱Z = false;
                this.f۹۲۰۰d = null;
            }
            this.f۹۱۹۹c = id;
            if (id != -1 && (v = ((View) getParent()).findViewById(id)) != null) {
                v.setVisibility(8);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۷۸a(ConstraintLayout container) {
        if (this.f۹۲۰۰d != null) {
            ConstraintLayout.Ca layoutParams = (ConstraintLayout.Ca) getLayoutParams();
            ConstraintLayout.Ca layoutParamsContent = (ConstraintLayout.Ca) this.f۹۲۰۰d.getLayoutParams();
            layoutParamsContent.f۹۰۸۳k0.m۱۱۱۴۸j(0);
            layoutParams.f۹۰۸۳k0.m۱۱۱۵۰k(layoutParamsContent.f۹۰۸۳k0.m۱۱۱۶۳t());
            layoutParams.f۹۰۸۳k0.m۱۱۱۳۰c(layoutParamsContent.f۹۰۸۳k0.m۱۱۱۴۵i());
            layoutParamsContent.f۹۰۸۳k0.m۱۱۱۴۸j(8);
        }
    }
}
