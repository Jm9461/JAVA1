package com.lawyer_smartCalendar.a;

import android.support.v4.app.f;
import android.support.v4.app.k;
import android.support.v4.app.p;
import com.lawyer_smartCalendar.c.g;
import com.lawyer_smartCalendar.c.h;
import com.lawyer_smartCalendar.c.i;

public class z extends p {

    /* renamed from: h  reason: collision with root package name */
    int f۳۰۶۹h;

    public z(k fm, int NumOfTabs) {
        super(fm);
        this.f۳۰۶۹h = NumOfTabs;
    }

    @Override // android.support.v4.app.p
    public f c(int position) {
        if (position == 0) {
            return new g();
        }
        if (position == 1) {
            return new h();
        }
        if (position == 2) {
            return new i();
        }
        if (position != 3) {
            return null;
        }
        return new com.lawyer_smartCalendar.c.f();
    }

    @Override // android.support.v4.view.q
    public int a() {
        return this.f۳۰۶۹h;
    }
}
