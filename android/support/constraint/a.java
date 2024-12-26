package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

public class a extends b {
    private int i = 0;
    private int j = 0;
    private android.support.constraint.i.j.a k;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public int getType() {
        return this.i;
    }

    public void setType(int type) {
        this.i = type;
        this.j = type;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.i;
            if (i2 == 5) {
                this.j = 0;
            } else if (i2 == 6) {
                this.j = 1;
            }
        } else {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                int i3 = this.i;
                if (i3 == 5) {
                    this.j = 1;
                } else if (i3 == 6) {
                    this.j = 0;
                }
            } else {
                int i4 = this.i;
                if (i4 == 5) {
                    this.j = 0;
                } else if (i4 == 6) {
                    this.j = 1;
                }
            }
        }
        this.k.p(this.j);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.constraint.b
    public void a(AttributeSet attrs) {
        super.a(attrs);
        this.k = new android.support.constraint.i.j.a();
        if (attrs != null) {
            TypedArray a2 = getContext().obtainStyledAttributes(attrs, h.ConstraintLayout_Layout);
            int N = a2.getIndexCount();
            for (int i2 = 0; i2 < N; i2++) {
                int attr = a2.getIndex(i2);
                if (attr == h.ConstraintLayout_Layout_barrierDirection) {
                    setType(a2.getInt(attr, 0));
                } else if (attr == h.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.k.c(a2.getBoolean(attr, true));
                }
            }
        }
        this.f۵۸۶f = this.k;
        a();
    }
}
