package b.f.a.d;

import android.graphics.Canvas;
import android.view.View;

public class b implements a {
    @Override // b.f.a.d.a
    public void a(Canvas canvas, float currentFillPhase, View view) {
        canvas.clipRect(0.0f, ((float) (view.getBottom() - view.getTop())) * (1.0f - currentFillPhase), (float) view.getRight(), (float) view.getBottom());
    }
}
