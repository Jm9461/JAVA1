package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca;

/* renamed from: android.support.v7.widget.t  reason: invalid class name */
public class Ct extends SeekBar {

    /* renamed from: c  reason: contains not printable characters */
    private final Cu f۱۲۳۳۳c;

    public Ct(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.seekBarStyle);
    }

    public Ct(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۲۳۳۳c = new Cu(this);
        this.f۱۲۳۳۳c.m۱۵۶۲۸a(attrs, defStyleAttr);
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f۱۲۳۳۳c.m۱۵۶۲۶a(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f۱۲۳۳۳c.m۱۵۶۲۹b();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f۱۲۳۳۳c.m۱۵۶۳۰c();
    }
}
