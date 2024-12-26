package android.support.v7.widget;

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
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cd;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cf;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cg;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ci;

/* renamed from: android.support.v7.widget.n1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cn1 {

    /* renamed from: a, reason: contains not printable characters */
    private final Context f۱۲۲۳۴a;

    /* renamed from: b, reason: contains not printable characters */
    private final View f۱۲۲۳۵b;

    /* renamed from: c, reason: contains not printable characters */
    private final TextView f۱۲۲۳۶c;

    /* renamed from: d, reason: contains not printable characters */
    private final WindowManager.LayoutParams f۱۲۲۳۷d = new WindowManager.LayoutParams();

    /* renamed from: e, reason: contains not printable characters */
    private final Rect f۱۲۲۳۸e = new Rect();

    /* renamed from: f, reason: contains not printable characters */
    private final int[] f۱۲۲۳۹f = new int[2];

    /* renamed from: g, reason: contains not printable characters */
    private final int[] f۱۲۲۴۰g = new int[2];

    Cn1(Context context) {
        this.f۱۲۲۳۴a = context;
        this.f۱۲۲۳۵b = LayoutInflater.from(this.f۱۲۲۳۴a).inflate(Cg.abc_tooltip, (ViewGroup) null);
        this.f۱۲۲۳۶c = (TextView) this.f۱۲۲۳۵b.findViewById(Cf.message);
        this.f۱۲۲۳۷d.setTitle(getClass().getSimpleName());
        this.f۱۲۲۳۷d.packageName = this.f۱۲۲۳۴a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f۱۲۲۳۷d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = Ci.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۳۸۸a(View anchorView, int anchorX, int anchorY, boolean fromTouch, CharSequence tooltipText) {
        if (m۱۳۳۸۹b()) {
            m۱۳۳۸۷a();
        }
        this.f۱۲۲۳۶c.setText(tooltipText);
        m۱۳۳۸۶a(anchorView, anchorX, anchorY, fromTouch, this.f۱۲۲۳۷d);
        WindowManager wm = (WindowManager) this.f۱۲۲۳۴a.getSystemService("window");
        wm.addView(this.f۱۲۲۳۵b, this.f۱۲۲۳۷d);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۳۸۷a() {
        if (!m۱۳۳۸۹b()) {
            return;
        }
        WindowManager wm = (WindowManager) this.f۱۲۲۳۴a.getSystemService("window");
        wm.removeView(this.f۱۲۲۳۵b);
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۱۳۳۸۹b() {
        return this.f۱۲۲۳۵b.getParent() != null;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۳۸۶a(View anchorView, int anchorX, int anchorY, boolean fromTouch, WindowManager.LayoutParams outParams) {
        int offsetX;
        int offsetBelow;
        int offsetExtra;
        int statusBarHeight;
        outParams.token = anchorView.getApplicationWindowToken();
        int tooltipPreciseAnchorThreshold = this.f۱۲۲۳۴a.getResources().getDimensionPixelOffset(Cd.tooltip_precise_anchor_threshold);
        if (anchorView.getWidth() >= tooltipPreciseAnchorThreshold) {
            offsetX = anchorX;
        } else {
            int offsetX2 = anchorView.getWidth();
            offsetX = offsetX2 / 2;
        }
        if (anchorView.getHeight() >= tooltipPreciseAnchorThreshold) {
            int offsetExtra2 = this.f۱۲۲۳۴a.getResources().getDimensionPixelOffset(Cd.tooltip_precise_anchor_extra_offset);
            offsetBelow = anchorY + offsetExtra2;
            offsetExtra = anchorY - offsetExtra2;
        } else {
            offsetBelow = anchorView.getHeight();
            offsetExtra = 0;
        }
        outParams.gravity = 49;
        int tooltipOffset = this.f۱۲۲۳۴a.getResources().getDimensionPixelOffset(fromTouch ? Cd.tooltip_y_offset_touch : Cd.tooltip_y_offset_non_touch);
        View appView = m۱۳۳۸۵a(anchorView);
        if (appView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        appView.getWindowVisibleDisplayFrame(this.f۱۲۲۳۸e);
        Rect rect = this.f۱۲۲۳۸e;
        if (rect.left < 0 && rect.top < 0) {
            Resources res = this.f۱۲۲۳۴a.getResources();
            int resourceId = res.getIdentifier("status_bar_height", "dimen", "android");
            if (resourceId != 0) {
                statusBarHeight = res.getDimensionPixelSize(resourceId);
            } else {
                statusBarHeight = 0;
            }
            DisplayMetrics metrics = res.getDisplayMetrics();
            this.f۱۲۲۳۸e.set(0, statusBarHeight, metrics.widthPixels, metrics.heightPixels);
        }
        appView.getLocationOnScreen(this.f۱۲۲۴۰g);
        anchorView.getLocationOnScreen(this.f۱۲۲۳۹f);
        int[] iArr = this.f۱۲۲۳۹f;
        int i = iArr[0];
        int[] iArr2 = this.f۱۲۲۴۰g;
        iArr[0] = i - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        outParams.x = (iArr[0] + offsetX) - (appView.getWidth() / 2);
        int spec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f۱۲۲۳۵b.measure(spec, spec);
        int tooltipHeight = this.f۱۲۲۳۵b.getMeasuredHeight();
        int[] iArr3 = this.f۱۲۲۳۹f;
        int yAbove = ((iArr3[1] + offsetExtra) - tooltipOffset) - tooltipHeight;
        int yBelow = iArr3[1] + offsetBelow + tooltipOffset;
        if (!fromTouch) {
            if (yBelow + tooltipHeight <= this.f۱۲۲۳۸e.height()) {
                outParams.y = yBelow;
                return;
            } else {
                outParams.y = yAbove;
                return;
            }
        }
        if (yAbove >= 0) {
            outParams.y = yAbove;
        } else {
            outParams.y = yBelow;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static View m۱۳۳۸۵a(View anchorView) {
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
