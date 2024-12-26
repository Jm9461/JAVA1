package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.view.View;

public class e extends View {
    public e(Context context) {
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
        ConstraintLayout.a params = (ConstraintLayout.a) getLayoutParams();
        params.f۵۷۴a = margin;
        setLayoutParams(params);
    }

    public void setGuidelineEnd(int margin) {
        ConstraintLayout.a params = (ConstraintLayout.a) getLayoutParams();
        params.f۵۷۵b = margin;
        setLayoutParams(params);
    }

    public void setGuidelinePercent(float ratio) {
        ConstraintLayout.a params = (ConstraintLayout.a) getLayoutParams();
        params.f۵۷۶c = ratio;
        setLayoutParams(params);
    }
}
