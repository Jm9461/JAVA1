package com.lawyer_smartCalendar.p۱۳۰a;

import android.support.p۰۴۳v4.app.AbstractCk;
import android.support.p۰۴۳v4.app.AbstractCp;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCq;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCr;

/* renamed from: com.lawyer_smartCalendar.a.b0  reason: invalid class name */
public class Cb0 extends AbstractCp {

    /* renamed from: h  reason: contains not printable characters */
    int f۱۳۷۶۶h;

    public Cb0(AbstractCk fm, int NumOfTabs) {
        super(fm);
        this.f۱۳۷۶۶h = NumOfTabs;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCp
    /* renamed from: c  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۷۰۴۷c(int position) {
        if (position == 0) {
            return new View$OnClickListenerCq();
        }
        if (position != 1) {
            return null;
        }
        return new View$OnClickListenerCr();
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۰۴۶a() {
        return this.f۱۳۷۶۶h;
    }
}
