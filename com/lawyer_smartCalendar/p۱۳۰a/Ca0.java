package com.lawyer_smartCalendar.p۱۳۰a;

import android.support.p۰۴۳v4.app.AbstractCk;
import android.support.p۰۴۳v4.app.AbstractCp;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCj;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCk;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCl;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCm;

/* renamed from: com.lawyer_smartCalendar.a.a0  reason: invalid class name */
public class Ca0 extends AbstractCp {

    /* renamed from: h  reason: contains not printable characters */
    int f۱۳۷۵۹h;

    public Ca0(AbstractCk fm, int NumOfTabs) {
        super(fm);
        this.f۱۳۷۵۹h = NumOfTabs;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCp
    /* renamed from: c  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۷۰۳۶c(int position) {
        if (position == 0) {
            return new View$OnClickListenerCl();
        }
        if (position == 1) {
            return new View$OnClickListenerCm();
        }
        if (position == 2) {
            return new View$OnClickListenerCj();
        }
        if (position != 3) {
            return null;
        }
        return new View$OnClickListenerCk();
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۰۳۵a() {
        return this.f۱۳۷۵۹h;
    }
}
