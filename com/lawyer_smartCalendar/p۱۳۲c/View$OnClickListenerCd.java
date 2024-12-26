package com.lawyer_smartCalendar.p۱۳۲c;

import android.graphics.Color;
import android.os.Bundle;
import android.support.p۰۴۳v4.app.AbstractCq;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Ce;

/* renamed from: com.lawyer_smartCalendar.c.d  reason: invalid class name */
public class View$OnClickListenerCd extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private AHBottomNavigation f۱۴۵۰۷a0;

    /* renamed from: b0  reason: contains not printable characters */
    private AbstractCq f۱۴۵۰۸b0;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۰۹a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment_tab4, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۱۰a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        this.f۱۴۵۰۷a0 = (AHBottomNavigation) view.findViewById(R.id.bottom_navigation);
        m۱۷۵۱۱d0();
        this.f۱۴۵۰۸b0 = m۱۲۱۹۷d().m۱۲۲۶۲e().m۱۲۳۲۰a();
        View$OnClickListenerCo fragmentTabNoteList = new View$OnClickListenerCo();
        this.f۱۴۵۰۸b0.m۱۲۴۸۱b(R.id.frame_fragment_containers, fragmentTabNoteList);
        Ce.f۱۴۷۸۶e = fragmentTabNoteList;
        this.f۱۴۵۰۸b0.m۱۲۴۷۵a();
    }

    public void onClick(View view) {
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۱۱d0() {
        com.aurelhubert.ahbottomnavigation.Ca item1 = new com.aurelhubert.ahbottomnavigation.Ca(R.string.lastTabSubMenu1, R.drawable.ic_bottom_note, R.color.white);
        com.aurelhubert.ahbottomnavigation.Ca item2 = new com.aurelhubert.ahbottomnavigation.Ca(R.string.lastTabSubMenu2, R.drawable.ic_bottom_document, R.color.white);
        com.aurelhubert.ahbottomnavigation.Ca item3 = new com.aurelhubert.ahbottomnavigation.Ca(R.string.lastTabSubMenu3, R.drawable.ic_bottom_income, R.color.white);
        com.aurelhubert.ahbottomnavigation.Ca item4 = new com.aurelhubert.ahbottomnavigation.Ca(R.string.lastTabSubMenu4, R.drawable.ic_bottom_tax, R.color.white);
        com.aurelhubert.ahbottomnavigation.Ca item5 = new com.aurelhubert.ahbottomnavigation.Ca(R.string.lastTabSubMenu5, R.drawable.ic_bottom_account, R.color.white);
        this.f۱۴۵۰۷a0.m۱۶۷۹۸a(item1);
        this.f۱۴۵۰۷a0.m۱۶۷۹۸a(item2);
        this.f۱۴۵۰۷a0.m۱۶۷۹۸a(item3);
        this.f۱۴۵۰۷a0.m۱۶۷۹۸a(item4);
        this.f۱۴۵۰۷a0.m۱۶۷۹۸a(item5);
        this.f۱۴۵۰۷a0.setForceTint(false);
        this.f۱۴۵۰۷a0.setTitleState(AHBottomNavigation.EnumCh.ALWAYS_SHOW);
        this.f۱۴۵۰۷a0.setAccentColor(Color.parseColor(Cc.m۱۷۷۴۱d()));
        this.f۱۴۵۰۷a0.m۱۶۷۹۶a(30.0f, 30.0f);
        this.f۱۴۵۰۷a0.setOnTabSelectedListener(new Ca());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lawyer_smartCalendar.c.d$a  reason: invalid class name */
    public class Ca implements AHBottomNavigation.AbstractCg {
        Ca() {
        }

        @Override // com.aurelhubert.ahbottomnavigation.AHBottomNavigation.AbstractCg
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۵۱۲a(int position, boolean wasSelected) {
            switch (position) {
                case 0:
                    View$OnClickListenerCd dVar = View$OnClickListenerCd.this;
                    dVar.f۱۴۵۰۸b0 = dVar.m۱۲۱۹۷d().m۱۲۲۶۲e().m۱۲۳۲۰a();
                    View$OnClickListenerCo fragmentTabNoteList = new View$OnClickListenerCo();
                    View$OnClickListenerCd.this.f۱۴۵۰۸b0.m۱۲۴۸۱b(R.id.frame_fragment_containers, fragmentTabNoteList);
                    Ce.f۱۴۷۸۶e = fragmentTabNoteList;
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "note";
                    break;
                case 1:
                    View$OnClickListenerCd dVar2 = View$OnClickListenerCd.this;
                    dVar2.f۱۴۵۰۸b0 = dVar2.m۱۲۱۹۷d().m۱۲۲۶۲e().m۱۲۳۲۰a();
                    View$OnClickListenerCn fragmentTabDocumentList = new View$OnClickListenerCn();
                    View$OnClickListenerCd.this.f۱۴۵۰۸b0.m۱۲۴۸۱b(R.id.frame_fragment_containers, fragmentTabDocumentList);
                    Ce.f۱۴۷۸۷f = fragmentTabDocumentList;
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
                case 2:
                    View$OnClickListenerCd dVar3 = View$OnClickListenerCd.this;
                    dVar3.f۱۴۵۰۸b0 = dVar3.m۱۲۱۹۷d().m۱۲۲۶۲e().m۱۲۳۲۰a();
                    View$OnClickListenerCp fragmentTabPaymentList = new View$OnClickListenerCp();
                    View$OnClickListenerCd.this.f۱۴۵۰۸b0.m۱۲۴۸۱b(R.id.frame_fragment_containers, fragmentTabPaymentList);
                    Ce.f۱۴۷۸۸g = fragmentTabPaymentList;
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
                case 3:
                    View$OnClickListenerCd dVar4 = View$OnClickListenerCd.this;
                    dVar4.f۱۴۵۰۸b0 = dVar4.m۱۲۱۹۷d().m۱۲۲۶۲e().m۱۲۳۲۰a();
                    View$OnClickListenerCd.this.f۱۴۵۰۸b0.m۱۲۴۸۱b(R.id.frame_fragment_containers, new View$OnClickListenerCs());
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
                case 4:
                    View$OnClickListenerCd dVar5 = View$OnClickListenerCd.this;
                    dVar5.f۱۴۵۰۸b0 = dVar5.m۱۲۱۹۷d().m۱۲۲۶۲e().m۱۲۳۲۰a();
                    View$OnClickListenerCd.this.f۱۴۵۰۸b0.m۱۲۴۸۱b(R.id.frame_fragment_containers, new View$OnClickListenerCe());
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
                case 5:
                    View$OnClickListenerCd dVar6 = View$OnClickListenerCd.this;
                    dVar6.f۱۴۵۰۸b0 = dVar6.m۱۲۱۹۷d().m۱۲۲۶۲e().m۱۲۳۲۰a();
                    View$OnClickListenerCd.this.f۱۴۵۰۸b0.m۱۲۴۸۱b(R.id.frame_fragment_containers, new View$OnClickListenerCt());
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
                case 6:
                    View$OnClickListenerCd dVar7 = View$OnClickListenerCd.this;
                    dVar7.f۱۴۵۰۸b0 = dVar7.m۱۲۱۹۷d().m۱۲۲۶۲e().m۱۲۳۲۰a();
                    View$OnClickListenerCd.this.f۱۴۵۰۸b0.m۱۲۴۸۱b(R.id.frame_fragment_containers, new View$OnClickListenerCt());
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
                case 7:
                    View$OnClickListenerCd dVar8 = View$OnClickListenerCd.this;
                    dVar8.f۱۴۵۰۸b0 = dVar8.m۱۲۱۹۷d().m۱۲۲۶۲e().m۱۲۳۲۰a();
                    View$OnClickListenerCd.this.f۱۴۵۰۸b0.m۱۲۴۸۱b(R.id.frame_fragment_containers, new View$OnClickListenerCt());
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    break;
            }
            View$OnClickListenerCd.this.f۱۴۵۰۸b0.m۱۲۴۷۵a();
            return true;
        }
    }
}
