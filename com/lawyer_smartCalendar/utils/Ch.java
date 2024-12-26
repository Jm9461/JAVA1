package com.lawyer_smartCalendar.utils;

import android.content.Context;
import p۱۲۵c.p۱۲۶a.p۱۲۷a.Cd;

/* renamed from: com.lawyer_smartCalendar.utils.h  reason: invalid class name */
public class Ch {
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۵۲a(Context ctx) {
        Cd.Ca b = Cd.Ca.m۱۶۶۱۶b();
        b.m۱۶۶۱۸a(new Cf(ctx).m۱۷۷۴۶a());
        b.m۱۶۶۱۷a(16);
        b.m۱۶۶۱۹a();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۵۳a(Context ctx, String type, String message) {
        char c;
        m۱۷۷۵۲a(ctx);
        switch (type.hashCode()) {
            case -1867169789:
                if (type.equals("success")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1039745817:
                if (type.equals("normal")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3237038:
                if (type.equals("info")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 96784904:
                if (type.equals("error")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1124446108:
                if (type.equals("warning")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            Cd.m۱۶۵۹۸a(ctx, message, 0, true).show();
        } else if (c == 1) {
            Cd.m۱۶۶۰۶c(ctx, message, 0, true).show();
        } else if (c == 2) {
            Cd.m۱۶۶۰۳b(ctx, message, 0, true).show();
        } else if (c == 3) {
            Cd.m۱۶۶۰۹d(ctx, message, 0, true).show();
        } else if (c == 4) {
            Cd.m۱۶۵۹۶a(ctx, message, 0).show();
        }
    }
}
