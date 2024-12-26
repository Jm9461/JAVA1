package android.support.v7.view.menu;

import a.b.g.b.a.a;
import a.b.g.b.a.b;
import a.b.g.b.a.c;
import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public final class r {
    public static Menu a(Context context, a supportMenu) {
        return new s(context, supportMenu);
    }

    public static MenuItem a(Context context, b supportMenuItem) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new m(context, supportMenuItem);
        }
        return new l(context, supportMenuItem);
    }

    public static SubMenu a(Context context, c supportSubMenu) {
        return new w(context, supportSubMenu);
    }
}
