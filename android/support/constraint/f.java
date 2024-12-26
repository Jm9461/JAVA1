package android.support.constraint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.view.View;

public class f extends View {

    /* renamed from: c  reason: collision with root package name */
    private int f۶۰۱c;

    /* renamed from: d  reason: collision with root package name */
    private View f۶۰۲d;

    /* renamed from: e  reason: collision with root package name */
    private int f۶۰۳e;

    public void setEmptyVisibility(int visibility) {
        this.f۶۰۳e = visibility;
    }

    public int getEmptyVisibility() {
        return this.f۶۰۳e;
    }

    public View getContent() {
        return this.f۶۰۲d;
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

    public void b(ConstraintLayout container) {
        if (this.f۶۰۱c == -1 && !isInEditMode()) {
            setVisibility(this.f۶۰۳e);
        }
        this.f۶۰۲d = container.findViewById(this.f۶۰۱c);
        View view = this.f۶۰۲d;
        if (view != null) {
            ((ConstraintLayout.a) view.getLayoutParams()).Z = true;
            this.f۶۰۲d.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int id) {
        View v;
        if (this.f۶۰۱c != id) {
            View view = this.f۶۰۲d;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.a) this.f۶۰۲d.getLayoutParams()).Z = false;
                this.f۶۰۲d = null;
            }
            this.f۶۰۱c = id;
            if (id != -1 && (v = ((View) getParent()).findViewById(id)) != null) {
                v.setVisibility(8);
            }
        }
    }

    public void a(ConstraintLayout container) {
        if (this.f۶۰۲d != null) {
            ConstraintLayout.a layoutParams = (ConstraintLayout.a) getLayoutParams();
            ConstraintLayout.a layoutParamsContent = (ConstraintLayout.a) this.f۶۰۲d.getLayoutParams();
            layoutParamsContent.k0.j(0);
            layoutParams.k0.k(layoutParamsContent.k0.t());
            layoutParams.k0.c(layoutParamsContent.k0.i());
            layoutParamsContent.k0.j(8);
        }
    }
}
