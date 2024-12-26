package android.support.v7.widget;

import a.b.h.a.d;
import a.b.h.a.f;
import a.b.h.a.g;
import a.b.h.a.i;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* access modifiers changed from: package-private */
public class n1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f۲۱۹۰a;

    /* renamed from: b  reason: collision with root package name */
    private final View f۲۱۹۱b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f۲۱۹۲c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f۲۱۹۳d = new WindowManager.LayoutParams();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f۲۱۹۴e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f۲۱۹۵f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private final int[] f۲۱۹۶g = new int[2];

    n1(Context context) {
        this.f۲۱۹۰a = context;
        this.f۲۱۹۱b = LayoutInflater.from(this.f۲۱۹۰a).inflate(g.abc_tooltip, (ViewGroup) null);
        this.f۲۱۹۲c = (TextView) this.f۲۱۹۱b.findViewById(f.message);
        this.f۲۱۹۳d.setTitle(getClass().getSimpleName());
        this.f۲۱۹۳d.packageName = this.f۲۱۹۰a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f۲۱۹۳d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* access modifiers changed from: package-private */
    public void a(View anchorView, int anchorX, int anchorY, boolean fromTouch, CharSequence tooltipText) {
        if (b()) {
            a();
        }
        this.f۲۱۹۲c.setText(tooltipText);
        a(anchorView, anchorX, anchorY, fromTouch, this.f۲۱۹۳d);
        ((WindowManager) this.f۲۱۹۰a.getSystemService("window")).addView(this.f۲۱۹۱b, this.f۲۱۹۳d);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (b()) {
            ((WindowManager) this.f۲۱۹۰a.getSystemService("window")).removeView(this.f۲۱۹۱b);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f۲۱۹۱b.getParent() != null;
    }

    private void a(View anchorView, int anchorX, int anchorY, boolean fromTouch, WindowManager.LayoutParams outParams) {
        int offsetX;
        int offsetBelow;
        int offsetExtra;
        int statusBarHeight;
        outParams.token = anchorView.getApplicationWindowToken();
        int tooltipPreciseAnchorThreshold = this.f۲۱۹۰a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_threshold);
        if (anchorView.getWidth() >= tooltipPreciseAnchorThreshold) {
            offsetX = anchorX;
        } else {
            offsetX = anchorView.getWidth() / 2;
        }
        if (anchorView.getHeight() >= tooltipPreciseAnchorThreshold) {
            int offsetExtra2 = this.f۲۱۹۰a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_extra_offset);
            offsetBelow = anchorY + offsetExtra2;
            offsetExtra = anchorY - offsetExtra2;
        } else {
            offsetBelow = anchorView.getHeight();
            offsetExtra = 0;
        }
        outParams.gravity = 49;
        int tooltipOffset = this.f۲۱۹۰a.getResources().getDimensionPixelOffset(fromTouch ? d.tooltip_y_offset_touch : d.tooltip_y_offset_non_touch);
        View appView = a(anchorView);
        if (appView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        appView.getWindowVisibleDisplayFrame(this.f۲۱۹۴e);
        Rect rect = this.f۲۱۹۴e;
        if (rect.left < 0 && rect.top < 0) {
            Resources res = this.f۲۱۹۰a.getResources();
            int resourceId = res.getIdentifier("status_bar_height", "dimen", "android");
            if (resourceId != 0) {
                statusBarHeight = res.getDimensionPixelSize(resourceId);
            } else {
                statusBarHeight = 0;
            }
            DisplayMetrics metrics = res.getDisplayMetrics();
            this.f۲۱۹۴e.set(0, statusBarHeight, metrics.widthPixels, metrics.heightPixels);
        }
        appView.getLocationOnScreen(this.f۲۱۹۶g);
        anchorView.getLocationOnScreen(this.f۲۱۹۵f);
        int[] iArr = this.f۲۱۹۵f;
        int i = iArr[0];
        int[] iArr2 = this.f۲۱۹۶g;
        iArr[0] = i - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        outParams.x = (iArr[0] + offsetX) - (appView.getWidth() / 2);
        int spec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f۲۱۹۱b.measure(spec, spec);
        int tooltipHeight = this.f۲۱۹۱b.getMeasuredHeight();
        int[] iArr3 = this.f۲۱۹۵f;
        int yAbove = ((iArr3[1] + offsetExtra) - tooltipOffset) - tooltipHeight;
        int yBelow = iArr3[1] + offsetBelow + tooltipOffset;
        if (fromTouch) {
            if (yAbove >= 0) {
                outParams.y = yAbove;
            } else {
                outParams.y = yBelow;
            }
        } else if (yBelow + tooltipHeight <= this.f۲۱۹۴e.height()) {
            outParams.y = yBelow;
        } else {
            outParams.y = yAbove;
        }
    }

    private static View a(View anchorView) {
        View rootView = anchorView.getRootView();
        ViewGroup.LayoutParams lp = rootView.getLayoutParams();
        if ((lp instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) lp).type == 2) {
            return rootView;
        }
        for (Context context = anchorView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
