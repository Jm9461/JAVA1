package com.lawyer_smartCalendar.p۲۸۸c;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.AbstractCq;
import android.support.v4.app.ComponentCallbacksCf;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.Ca;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Ce;

/* renamed from: com.lawyer_smartCalendar.c.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCd extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0, reason: contains not printable characters */
    private AHBottomNavigation f۱۴۵۰۷a0;

    /* renamed from: b0, reason: contains not printable characters */
    private AbstractCq f۱۴۵۰۸b0;

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(2131492985, container, false);
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۵۰۱a(View view, Bundle savedInstanceState) {
        super.mo۱۵۵۰۱a(view, savedInstanceState);
        this.f۱۴۵۰۷a0 = (AHBottomNavigation) view.findViewById(2131296329);
        m۱۵۴۳۳d0();
        this.f۱۴۵۰۸b0 = m۱۰۱۲۷d().m۱۰۱۹۲e().mo۱۰۳۰۶a();
        ViewOnClickListenerCo fragmentTabNoteList = new ViewOnClickListenerCo();
        this.f۱۴۵۰۸b0.mo۱۰۴۱۱b(2131296450, fragmentTabNoteList);
        Ce.f۱۴۷۸۶e = fragmentTabNoteList;
        this.f۱۴۵۰۸b0.mo۱۰۴۰۵a();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* renamed from: d0, reason: contains not printable characters */
    public void m۱۵۴۳۳d0() {
        Ca item1 = new Ca(2131755111, 2131230879, 2131099898);
        Ca item2 = new Ca(2131755112, 2131230877, 2131099898);
        Ca item3 = new Ca(2131755113, 2131230878, 2131099898);
        Ca item4 = new Ca(2131755114, 2131230880, 2131099898);
        Ca item5 = new Ca(2131755115, 2131230876, 2131099898);
        this.f۱۴۵۰۷a0.m۱۴۷۲۲a(item1);
        this.f۱۴۵۰۷a0.m۱۴۷۲۲a(item2);
        this.f۱۴۵۰۷a0.m۱۴۷۲۲a(item3);
        this.f۱۴۵۰۷a0.m۱۴۷۲۲a(item4);
        this.f۱۴۵۰۷a0.m۱۴۷۲۲a(item5);
        this.f۱۴۵۰۷a0.setForceTint(false);
        this.f۱۴۵۰۷a0.setTitleState(AHBottomNavigation.EnumCh.ALWAYS_SHOW);
        this.f۱۴۵۰۷a0.setAccentColor(Color.parseColor(Cc.m۱۵۶۶۳d()));
        this.f۱۴۵۰۷a0.m۱۴۷۲۰a(30.0f, 30.0f);
        this.f۱۴۵۰۷a0.setOnTabSelectedListener(new a());
    }

    /* renamed from: com.lawyer_smartCalendar.c.d$a */
    class a implements AHBottomNavigation.InterfaceCg {
        a() {
        }

        @Override // com.aurelhubert.ahbottomnavigation.AHBottomNavigation.InterfaceCg
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۵۴۳۴a(int position, boolean wasSelected) {
            switch (position) {
                case 0:
                    ViewOnClickListenerCd viewOnClickListenerCd = ViewOnClickListenerCd.this;
                    viewOnClickListenerCd.f۱۴۵۰۸b0 = viewOnClickListenerCd.m۱۰۱۲۷d().m۱۰۱۹۲e().mo۱۰۳۰۶a();
                    ViewOnClickListenerCo fragmentTabNoteList = new ViewOnClickListenerCo();
                    ViewOnClickListenerCd.this.f۱۴۵۰۸b0.mo۱۰۴۱۱b(2131296450, fragmentTabNoteList);
                    Ce.f۱۴۷۸۶e = fragmentTabNoteList;
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "note";
                    break;
                case 1:
                    ViewOnClickListenerCd viewOnClickListenerCd2 = ViewOnClickListenerCd.this;
                    viewOnClickListenerCd2.f۱۴۵۰۸b0 = viewOnClickListenerCd2.m۱۰۱۲۷d().m۱۰۱۹۲e().mo۱۰۳۰۶a();
                    ViewOnClickListenerCn fragmentTabDocumentList = new ViewOnClickListenerCn();
                    ViewOnClickListenerCd.this.f۱۴۵۰۸b0.mo۱۰۴۱۱b(2131296450, fragmentTabDocumentList);
                    Ce.f۱۴۷۸۷f = fragmentTabDocumentList;
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
                case 2:
                    ViewOnClickListenerCd viewOnClickListenerCd3 = ViewOnClickListenerCd.this;
                    viewOnClickListenerCd3.f۱۴۵۰۸b0 = viewOnClickListenerCd3.m۱۰۱۲۷d().m۱۰۱۹۲e().mo۱۰۳۰۶a();
                    ViewOnClickListenerCp fragmentTabPaymentList = new ViewOnClickListenerCp();
                    ViewOnClickListenerCd.this.f۱۴۵۰۸b0.mo۱۰۴۱۱b(2131296450, fragmentTabPaymentList);
                    Ce.f۱۴۷۸۸g = fragmentTabPaymentList;
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
                case 3:
                    ViewOnClickListenerCd viewOnClickListenerCd4 = ViewOnClickListenerCd.this;
                    viewOnClickListenerCd4.f۱۴۵۰۸b0 = viewOnClickListenerCd4.m۱۰۱۲۷d().m۱۰۱۹۲e().mo۱۰۳۰۶a();
                    ViewOnClickListenerCd.this.f۱۴۵۰۸b0.mo۱۰۴۱۱b(2131296450, new ViewOnClickListenerCs());
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
                case 4:
                    ViewOnClickListenerCd viewOnClickListenerCd5 = ViewOnClickListenerCd.this;
                    viewOnClickListenerCd5.f۱۴۵۰۸b0 = viewOnClickListenerCd5.m۱۰۱۲۷d().m۱۰۱۹۲e().mo۱۰۳۰۶a();
                    ViewOnClickListenerCd.this.f۱۴۵۰۸b0.mo۱۰۴۱۱b(2131296450, new ViewOnClickListenerCe());
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
                case 5:
                    ViewOnClickListenerCd viewOnClickListenerCd6 = ViewOnClickListenerCd.this;
                    viewOnClickListenerCd6.f۱۴۵۰۸b0 = viewOnClickListenerCd6.m۱۰۱۲۷d().m۱۰۱۹۲e().mo۱۰۳۰۶a();
                    ViewOnClickListenerCd.this.f۱۴۵۰۸b0.mo۱۰۴۱۱b(2131296450, new ViewOnClickListenerCt());
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
                case 6:
                    ViewOnClickListenerCd viewOnClickListenerCd7 = ViewOnClickListenerCd.this;
                    viewOnClickListenerCd7.f۱۴۵۰۸b0 = viewOnClickListenerCd7.m۱۰۱۲۷d().m۱۰۱۹۲e().mo۱۰۳۰۶a();
                    ViewOnClickListenerCd.this.f۱۴۵۰۸b0.mo۱۰۴۱۱b(2131296450, new ViewOnClickListenerCt());
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
                case 7:
                    ViewOnClickListenerCd viewOnClickListenerCd8 = ViewOnClickListenerCd.this;
                    viewOnClickListenerCd8.f۱۴۵۰۸b0 = viewOnClickListenerCd8.m۱۰۱۲۷d().m۱۰۱۹۲e().mo۱۰۳۰۶a();
                    ViewOnClickListenerCd.this.f۱۴۵۰۸b0.mo۱۰۴۱۱b(2131296450, new ViewOnClickListenerCt());
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
            }
            ViewOnClickListenerCd.this.f۱۴۵۰۸b0.mo۱۰۴۰۵a();
            return true;
        }
    }
}
