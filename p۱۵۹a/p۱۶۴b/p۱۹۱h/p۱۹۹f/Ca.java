package p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cb;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cd;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;

/* renamed from: a.b.h.f.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {

    /* renamed from: a, reason: contains not printable characters */
    private Context f۸۸۷۸a;

    /* renamed from: a, reason: contains not printable characters */
    public static Ca m۸۶۹۵a(Context context) {
        return new Ca(context);
    }

    private Ca(Context context) {
        this.f۸۸۷۸a = context;
    }

    /* renamed from: c, reason: contains not printable characters */
    public int m۸۶۹۸c() {
        Configuration configuration = this.f۸۸۷۸a.getResources().getConfiguration();
        int widthDp = configuration.screenWidthDp;
        int heightDp = configuration.screenHeightDp;
        int smallest = configuration.smallestScreenWidthDp;
        if (smallest > 600 || widthDp > 600) {
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

    /* renamed from: g, reason: contains not printable characters */
    public boolean m۸۷۰۲g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f۸۸۷۸a).hasPermanentMenuKey();
    }

    /* renamed from: b, reason: contains not printable characters */
    public int m۸۶۹۷b() {
        return this.f۸۸۷۸a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: f, reason: contains not printable characters */
    public boolean m۸۷۰۱f() {
        return this.f۸۸۷۸a.getResources().getBoolean(Cb.abc_action_bar_embed_tabs);
    }

    /* renamed from: e, reason: contains not printable characters */
    public int m۸۷۰۰e() {
        TypedArray a2 = this.f۸۸۷۸a.obtainStyledAttributes(null, Cj.ActionBar, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.actionBarStyle, 0);
        int height = a2.getLayoutDimension(Cj.ActionBar_height, 0);
        Resources r = this.f۸۸۷۸a.getResources();
        if (!m۸۷۰۱f()) {
            height = Math.min(height, r.getDimensionPixelSize(Cd.abc_action_bar_stacked_max_height));
        }
        a2.recycle();
        return height;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۸۶۹۶a() {
        return this.f۸۸۷۸a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: d, reason: contains not printable characters */
    public int m۸۶۹۹d() {
        return this.f۸۸۷۸a.getResources().getDimensionPixelSize(Cd.abc_action_bar_stacked_tab_max_width);
    }
}
