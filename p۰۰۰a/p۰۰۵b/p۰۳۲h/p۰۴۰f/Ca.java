package p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cb;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cd;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* renamed from: a.b.h.f.a  reason: invalid class name */
public class Ca {

    /* renamed from: a  reason: contains not printable characters */
    private Context f۸۸۷۸a;

    /* renamed from: a  reason: contains not printable characters */
    public static Ca m۱۰۷۶۴a(Context context) {
        return new Ca(context);
    }

    private Ca(Context context) {
        this.f۸۸۷۸a = context;
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۰۷۶۷c() {
        Configuration configuration = this.f۸۸۷۸a.getResources().getConfiguration();
        int widthDp = configuration.screenWidthDp;
        int heightDp = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || widthDp > 600) {
            return 5;
        }
        if (widthDp > 960 && heightDp > 720) {
            return 5;
        }
        if (widthDp > 720 && heightDp > 960) {
            return 5;
        }
        if (widthDp >= 500) {
            return 4;
        }
        if (widthDp > 640 && heightDp > 480) {
            return 4;
        }
        if (widthDp > 480 && heightDp > 640) {
            return 4;
        }
        if (widthDp >= 360) {
            return 3;
        }
        return 2;
    }

    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۰۷۷۱g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f۸۸۷۸a).hasPermanentMenuKey();
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۰۷۶۶b() {
        return this.f۸۸۷۸a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۰۷۷۰f() {
        return this.f۸۸۷۸a.getResources().getBoolean(Cb.abc_action_bar_embed_tabs);
    }

    /* renamed from: e  reason: contains not printable characters */
    public int m۱۰۷۶۹e() {
        TypedArray a = this.f۸۸۷۸a.obtainStyledAttributes(null, Cj.ActionBar, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionBarStyle, 0);
        int height = a.getLayoutDimension(Cj.ActionBar_height, 0);
        Resources r = this.f۸۸۷۸a.getResources();
        if (!m۱۰۷۷۰f()) {
            height = Math.min(height, r.getDimensionPixelSize(Cd.abc_action_bar_stacked_max_height));
        }
        a.recycle();
        return height;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۰۷۶۵a() {
        return this.f۸۸۷۸a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۰۷۶۸d() {
        return this.f۸۸۷۸a.getResources().getDimensionPixelSize(Cd.abc_action_bar_stacked_tab_max_width);
    }
}
