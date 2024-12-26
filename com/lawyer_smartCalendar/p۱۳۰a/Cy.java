package com.lawyer_smartCalendar.p۱۳۰a;

import android.support.p۰۴۳v4.app.AbstractCk;
import android.support.p۰۴۳v4.app.AbstractCp;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCa;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCb;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCc;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCd;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCt;
import com.lawyer_smartCalendar.utils.Ce;

/* renamed from: com.lawyer_smartCalendar.a.y  reason: invalid class name */
public class Cy extends AbstractCp {

    /* renamed from: h  reason: contains not printable characters */
    int f۱۴۰۲۶h;

    public Cy(AbstractCk fm, int NumOfTabs) {
        super(fm);
        this.f۱۴۰۲۶h = NumOfTabs;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCp
    /* renamed from: c  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۷۲۹۲c(int position) {
        switch (position) {
            case 0:
                return new View$OnClickListenerCt();
            case 1:
                return new View$OnClickListenerCt();
            case 2:
                return new View$OnClickListenerCt();
            case 3:
                return new View$OnClickListenerCd();
            case 4:
                View$OnClickListenerCc tab3 = new View$OnClickListenerCc();
                Ce.f۱۴۷۸۵d = tab3;
                return tab3;
            case 5:
                View$OnClickListenerCb tab2 = new View$OnClickListenerCb();
                Ce.f۱۴۷۸۴c = tab2;
                return tab2;
            case 6:
                View$OnClickListenerCa tab1 = new View$OnClickListenerCa();
                Ce.f۱۴۷۸۳b = tab1;
                return tab1;
            default:
                return null;
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۲۹۱a() {
        return this.f۱۴۰۲۶h;
    }
}
