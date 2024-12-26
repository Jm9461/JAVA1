package com.lawyer_smartCalendar.a;

import android.support.v4.app.f;
import android.support.v4.app.k;
import android.support.v4.app.p;
import com.lawyer_smartCalendar.c.q;
import com.lawyer_smartCalendar.c.r;

public class b0 extends p {

    /* renamed from: h  reason: collision with root package name */
    int f۲۹۲۷h;

    public b0(k fm, int NumOfTabs) {
        super(fm);
        this.f۲۹۲۷h = NumOfTabs;
    }

    @Override // android.support.v4.app.p
    public f c(int position) {
        if (position == 0) {
            return new q();
        }
        if (position != 1) {
            return null;
        }
        return new r();
    }

    @Override // android.support.v4.view.q
    public int a() {
        return this.f۲۹۲۷h;
    }
}
