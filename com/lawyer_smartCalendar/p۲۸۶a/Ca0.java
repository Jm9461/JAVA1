package com.lawyer_smartCalendar.p۲۸۶a;

import android.support.v4.app.AbstractCk;
import android.support.v4.app.AbstractCp;
import android.support.v4.app.ComponentCallbacksCf;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCj;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCk;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCl;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCm;

/* renamed from: com.lawyer_smartCalendar.a.a0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca0 extends AbstractCp {

    /* renamed from: h, reason: contains not printable characters */
    int f۱۳۷۵۹h;

    public Ca0(AbstractCk fm, int NumOfTabs) {
        super(fm);
        this.f۱۳۷۵۹h = NumOfTabs;
    }

    @Override // android.support.v4.app.AbstractCp
    /* renamed from: c, reason: contains not printable characters */
    public ComponentCallbacksCf mo۱۷۶۴۹c(int position) {
        if (position == 0) {
            ViewOnClickListenerCl tab4 = new ViewOnClickListenerCl();
            return tab4;
        }
        if (position == 1) {
            ViewOnClickListenerCm tab3 = new ViewOnClickListenerCm();
            return tab3;
        }
        if (position == 2) {
            ViewOnClickListenerCj tab2 = new ViewOnClickListenerCj();
            return tab2;
        }
        if (position == 3) {
            ViewOnClickListenerCk tab1 = new ViewOnClickListenerCk();
            return tab1;
        }
        return null;
    }

    @Override // android.support.v4.view.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۴۸a() {
        return this.f۱۳۷۵۹h;
    }
}
