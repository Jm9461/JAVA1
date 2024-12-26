package com.lawyer_smartCalendar.p۲۸۶a;

import android.support.v4.app.AbstractCk;
import android.support.v4.app.AbstractCp;
import android.support.v4.app.ComponentCallbacksCf;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCq;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCr;

/* renamed from: com.lawyer_smartCalendar.a.b0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb0 extends AbstractCp {

    /* renamed from: h, reason: contains not printable characters */
    int f۱۳۷۶۶h;

    public Cb0(AbstractCk fm, int NumOfTabs) {
        super(fm);
        this.f۱۳۷۶۶h = NumOfTabs;
    }

    @Override // android.support.v4.app.AbstractCp
    /* renamed from: c, reason: contains not printable characters */
    public ComponentCallbacksCf mo۱۷۶۴۹c(int position) {
        if (position == 0) {
            ViewOnClickListenerCq tab1 = new ViewOnClickListenerCq();
            return tab1;
        }
        if (position == 1) {
            ViewOnClickListenerCr tab2 = new ViewOnClickListenerCr();
            return tab2;
        }
        return null;
    }

    @Override // android.support.v4.view.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۴۸a() {
        return this.f۱۳۷۶۶h;
    }
}
