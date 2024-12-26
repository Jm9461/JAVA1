package com.lawyer_smartCalendar.utils;

import android.content.Context;
import c.a.a.d;

public class h {
    public void a(Context ctx) {
        d.a b2 = d.a.b();
        b2.a(new f(ctx).a());
        b2.a(16);
        b2.a();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(Context ctx, String type, String message) {
        char c2;
        a(ctx);
        switch (type.hashCode()) {
            case -1867169789:
                if (type.equals("success")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1039745817:
                if (type.equals("normal")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3237038:
                if (type.equals("info")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 96784904:
                if (type.equals("error")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1124446108:
                if (type.equals("warning")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            d.a(ctx, message, 0, true).show();
        } else if (c2 == 1) {
            d.c(ctx, message, 0, true).show();
        } else if (c2 == 2) {
            d.b(ctx, message, 0, true).show();
        } else if (c2 == 3) {
            d.d(ctx, message, 0, true).show();
        } else if (c2 == 4) {
            d.a(ctx, message, 0).show();
        }
    }
}
