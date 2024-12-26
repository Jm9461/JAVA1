package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;

/* renamed from: android.support.v7.widget.t, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ct extends SeekBar {

    /* renamed from: c, reason: contains not printable characters */
    private final Cu f۱۲۳۳۳c;

    public Ct(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.seekBarStyle);
    }

    public Ct(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۲۳۳۳c = new Cu(this);
        this.f۱۲۳۳۳c.mo۱۳۵۵۸a(attrs, defStyleAttr);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f۱۲۳۳۳c.m۱۳۵۵۶a(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f۱۲۳۳۳c.m۱۳۵۵۹b();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f۱۲۳۳۳c.m۱۳۵۶۰c();
    }
}
