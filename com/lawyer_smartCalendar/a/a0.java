package com.lawyer_smartCalendar.a;

import android.support.v4.app.f;
import android.support.v4.app.k;
import android.support.v4.app.p;
import com.lawyer_smartCalendar.c.j;
import com.lawyer_smartCalendar.c.l;
import com.lawyer_smartCalendar.c.m;

public class a0 extends p {

    /* renamed from: h  reason: collision with root package name */
    int f۲۹۲۲h;

    public a0(k fm, int NumOfTabs) {
        super(fm);
        this.f۲۹۲۲h = NumOfTabs;
    }

    @Override // android.support.v4.app.p
    public f c(int position) {
        if (position == 0) {
            return new l();
        }
        if (position == 1) {
            return new m();
        }
        if (position == 2) {
            return new j();
        }
        if (position != 3) {
            return null;
        }
        return new com.lawyer_smartCalendar.c.k();
    }

    @Override // android.support.v4.view.q
    public int a() {
        return this.f۲۹۲۲h;
    }
}
