package com.lawyer_smartCalendar.p۲۸۶a;

import android.support.v4.app.AbstractCk;
import android.support.v4.app.AbstractCp;
import android.support.v4.app.ComponentCallbacksCf;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCa;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCb;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCc;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCd;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCt;
import com.lawyer_smartCalendar.utils.Ce;

/* renamed from: com.lawyer_smartCalendar.a.y, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cy extends AbstractCp {

    /* renamed from: h, reason: contains not printable characters */
    int f۱۴۰۲۶h;

    public Cy(AbstractCk fm, int NumOfTabs) {
        super(fm);
        this.f۱۴۰۲۶h = NumOfTabs;
    }

    @Override // android.support.v4.app.AbstractCp
    /* renamed from: c, reason: contains not printable characters */
    public ComponentCallbacksCf mo۱۷۶۴۹c(int position) {
        switch (position) {
            case 0:
                ViewOnClickListenerCt tab7 = new ViewOnClickListenerCt();
                return tab7;
            case 1:
                ViewOnClickListenerCt tab6 = new ViewOnClickListenerCt();
                return tab6;
            case 2:
                ViewOnClickListenerCt tab5 = new ViewOnClickListenerCt();
                return tab5;
            case 3:
                ViewOnClickListenerCd tab4 = new ViewOnClickListenerCd();
                return tab4;
            case 4:
                ViewOnClickListenerCc tab3 = new ViewOnClickListenerCc();
                Ce.f۱۴۷۸۵d = tab3;
                return tab3;
            case 5:
                ViewOnClickListenerCb tab2 = new ViewOnClickListenerCb();
                Ce.f۱۴۷۸۴c = tab2;
                return tab2;
            case 6:
                ViewOnClickListenerCa tab1 = new ViewOnClickListenerCa();
                Ce.f۱۴۷۸۳b = tab1;
                return tab1;
            default:
                return null;
        }
    }

    @Override // android.support.v4.view.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۴۸a() {
        return this.f۱۴۰۲۶h;
    }
}
