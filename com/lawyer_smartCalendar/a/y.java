package com.lawyer_smartCalendar.a;

import android.support.v4.app.f;
import android.support.v4.app.k;
import android.support.v4.app.p;
import com.lawyer_smartCalendar.c.a;
import com.lawyer_smartCalendar.c.b;
import com.lawyer_smartCalendar.c.c;
import com.lawyer_smartCalendar.c.d;
import com.lawyer_smartCalendar.c.t;
import com.lawyer_smartCalendar.utils.e;

public class y extends p {

    /* renamed from: h  reason: collision with root package name */
    int f۳۰۶۸h;

    public y(k fm, int NumOfTabs) {
        super(fm);
        this.f۳۰۶۸h = NumOfTabs;
    }

    @Override // android.support.v4.app.p
    public f c(int position) {
        switch (position) {
            case 0:
                return new t();
            case 1:
                return new t();
            case 2:
                return new t();
            case 3:
                return new d();
            case 4:
                c tab3 = new c();
                e.f۳۲۵۹d = tab3;
                return tab3;
            case 5:
                b tab2 = new b();
                e.f۳۲۵۸c = tab2;
                return tab2;
            case 6:
                a tab1 = new a();
                e.f۳۲۵۷b = tab1;
                return tab1;
            default:
                return null;
        }
    }

    @Override // android.support.v4.view.q
    public int a() {
        return this.f۳۰۶۸h;
    }
}
