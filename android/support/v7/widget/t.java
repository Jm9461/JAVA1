package android.support.v7.widget;

import a.b.h.a.a;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class t extends SeekBar {

    /* renamed from: c  reason: collision with root package name */
    private final u f۲۲۴۶c;

    public t(Context context, AttributeSet attrs) {
        this(context, attrs, a.seekBarStyle);
    }

    public t(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۲۲۴۶c = new u(this);
        this.f۲۲۴۶c.a(attrs, defStyleAttr);
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f۲۲۴۶c.a(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f۲۲۴۶c.b();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f۲۲۴۶c.c();
    }
}
