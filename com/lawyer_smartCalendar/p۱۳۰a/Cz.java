package com.lawyer_smartCalendar.p۱۳۰a;

import android.support.p۰۴۳v4.app.AbstractCk;
import android.support.p۰۴۳v4.app.AbstractCp;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCf;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCg;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCh;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCi;

/* renamed from: com.lawyer_smartCalendar.a.z  reason: invalid class name */
public class Cz extends AbstractCp {

    /* renamed from: h  reason: contains not printable characters */
    int f۱۴۰۲۷h;

    public Cz(AbstractCk fm, int NumOfTabs) {
        super(fm);
        this.f۱۴۰۲۷h = NumOfTabs;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCp
    /* renamed from: c  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۷۲۹۴c(int position) {
        if (position == 0) {
            return new View$OnClickListenerCg();
        }
        if (position == 1) {
            return new View$OnClickListenerCh();
        }
        if (position == 2) {
            return new View$OnClickListenerCi();
        }
        if (position != 3) {
            return null;
        }
        return new View$OnClickListenerCf();
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۲۹۳a() {
        return this.f۱۴۰۲۷h;
    }
}
