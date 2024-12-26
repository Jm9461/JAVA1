package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.view.View;

/* renamed from: android.support.constraint.e  reason: invalid class name */
public class Ce extends View {
    public Ce(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setVisibility(int visibility) {
    }

    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int margin) {
        ConstraintLayout.Ca params = (ConstraintLayout.Ca) getLayoutParams();
        params.f۹۰۶۲a = margin;
        setLayoutParams(params);
    }

    public void setGuidelineEnd(int margin) {
        ConstraintLayout.Ca params = (ConstraintLayout.Ca) getLayoutParams();
        params.f۹۰۶۴b = margin;
        setLayoutParams(params);
    }

    public void setGuidelinePercent(float ratio) {
        ConstraintLayout.Ca params = (ConstraintLayout.Ca) getLayoutParams();
        params.f۹۰۶۶c = ratio;
        setLayoutParams(params);
    }
}
