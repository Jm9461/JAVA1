package a.b.h.f;

import a.b.h.a.b;
import a.b.h.a.d;
import a.b.h.a.j;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f۴۶۱a;

    public static a a(Context context) {
        return new a(context);
    }

    private a(Context context) {
        this.f۴۶۱a = context;
    }

    public int c() {
        Configuration configuration = this.f۴۶۱a.getResources().getConfiguration();
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

    public boolean g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f۴۶۱a).hasPermanentMenuKey();
    }

    public int b() {
        return this.f۴۶۱a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean f() {
        return this.f۴۶۱a.getResources().getBoolean(b.abc_action_bar_embed_tabs);
    }

    public int e() {
        TypedArray a2 = this.f۴۶۱a.obtainStyledAttributes(null, j.ActionBar, a.b.h.a.a.actionBarStyle, 0);
        int height = a2.getLayoutDimension(j.ActionBar_height, 0);
        Resources r = this.f۴۶۱a.getResources();
        if (!f()) {
            height = Math.min(height, r.getDimensionPixelSize(d.abc_action_bar_stacked_max_height));
        }
        a2.recycle();
        return height;
    }

    public boolean a() {
        return this.f۴۶۱a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int d() {
        return this.f۴۶۱a.getResources().getDimensionPixelSize(d.abc_action_bar_stacked_tab_max_width);
    }
}
