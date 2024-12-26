package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cd;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cf;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۷s.AbstractCa;

public class SnackbarContentLayout extends LinearLayout implements AbstractCa {

    /* renamed from: c  reason: contains not printable characters */
    private TextView f۹۶۸۶c;

    /* renamed from: d  reason: contains not printable characters */
    private Button f۹۶۸۷d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۹۶۸۸e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۹۶۸۹f;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, Ck.SnackbarLayout);
        this.f۹۶۸۸e = a.getDimensionPixelSize(Ck.SnackbarLayout_android_maxWidth, -1);
        this.f۹۶۸۹f = a.getDimensionPixelSize(Ck.SnackbarLayout_maxActionInlineWidth, -1);
        a.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f۹۶۸۶c = (TextView) findViewById(Cf.snackbar_text);
        this.f۹۶۸۷d = (Button) findViewById(Cf.snackbar_action);
    }

    public TextView getMessageView() {
        return this.f۹۶۸۶c;
    }

    public Button getActionView() {
        return this.f۹۶۸۷d;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f۹۶۸۸e > 0 && getMeasuredWidth() > (i = this.f۹۶۸۸e)) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
        int multiLineVPadding = getResources().getDimensionPixelSize(Cd.design_snackbar_padding_vertical_2lines);
        int singleLineVPadding = getResources().getDimensionPixelSize(Cd.design_snackbar_padding_vertical);
        boolean isMultiLine = this.f۹۶۸۶c.getLayout().getLineCount() > 1;
        boolean remeasure = false;
        if (!isMultiLine || this.f۹۶۸۹f <= 0 || this.f۹۶۸۷d.getMeasuredWidth() <= this.f۹۶۸۹f) {
            int messagePadding = isMultiLine ? multiLineVPadding : singleLineVPadding;
            if (m۱۱۶۵۵a(0, messagePadding, messagePadding)) {
                remeasure = true;
            }
        } else if (m۱۱۶۵۵a(1, multiLineVPadding, multiLineVPadding - singleLineVPadding)) {
            remeasure = true;
        }
        if (remeasure) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۱۶۵۵a(int orientation, int messagePadTop, int messagePadBottom) {
        boolean changed = false;
        if (orientation != getOrientation()) {
            setOrientation(orientation);
            changed = true;
        }
        if (this.f۹۶۸۶c.getPaddingTop() == messagePadTop && this.f۹۶۸۶c.getPaddingBottom() == messagePadBottom) {
            return changed;
        }
        m۱۱۶۵۴a(this.f۹۶۸۶c, messagePadTop, messagePadBottom);
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۱۶۵۴a(View view, int topPadding, int bottomPadding) {
        if (Cu.m۱۲۹۶۹A(view)) {
            Cu.m۱۲۹۸۰a(view, Cu.m۱۳۰۱۸o(view), topPadding, Cu.m۱۳۰۱۷n(view), bottomPadding);
        } else {
            view.setPadding(view.getPaddingLeft(), topPadding, view.getPaddingRight(), bottomPadding);
        }
    }
}
