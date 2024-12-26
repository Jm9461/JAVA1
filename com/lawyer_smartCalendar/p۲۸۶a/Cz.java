package com.lawyer_smartCalendar.p۲۸۶a;

import android.support.v4.app.AbstractCk;
import android.support.v4.app.AbstractCp;
import android.support.v4.app.ComponentCallbacksCf;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCf;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCg;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCh;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCi;

/* renamed from: com.lawyer_smartCalendar.a.z, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cz extends AbstractCp {

    /* renamed from: h, reason: contains not printable characters */
    int f۱۴۰۲۷h;

    public Cz(AbstractCk fm, int NumOfTabs) {
        super(fm);
        this.f۱۴۰۲۷h = NumOfTabs;
    }

    @Override // android.support.v4.app.AbstractCp
    /* renamed from: c, reason: contains not printable characters */
    public ComponentCallbacksCf mo۱۷۶۴۹c(int position) {
        if (position == 0) {
            ViewOnClickListenerCg tab2 = new ViewOnClickListenerCg();
            return tab2;
        }
        if (position == 1) {
            ViewOnClickListenerCh tab4 = new ViewOnClickListenerCh();
            return tab4;
        }
        if (position == 2) {
            ViewOnClickListenerCi tab3 = new ViewOnClickListenerCi();
            return tab3;
        }
        if (position == 3) {
            ViewOnClickListenerCf tab1 = new ViewOnClickListenerCf();
            return tab1;
        }
        return null;
    }

    @Override // android.support.v4.view.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۴۸a() {
        return this.f۱۴۰۲۷h;
    }
}
