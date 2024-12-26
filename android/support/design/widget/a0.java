package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class a0 extends ImageButton {

    /* renamed from: c  reason: collision with root package name */
    private int f۹۱۹c;

    public a0(Context context) {
        this(context, null);
    }

    public a0(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public a0(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۹۱۹c = getVisibility();
    }

    public void setVisibility(int visibility) {
        a(visibility, true);
    }

    public final void a(int visibility, boolean fromUser) {
        super.setVisibility(visibility);
        if (fromUser) {
            this.f۹۱۹c = visibility;
        }
    }

    public final int getUserSetVisibility() {
        return this.f۹۱۹c;
    }
}
