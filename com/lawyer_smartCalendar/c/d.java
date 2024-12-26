package com.lawyer_smartCalendar.c;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.f;
import android.support.v4.app.q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.utils.c;
import com.lawyer_smartCalendar.utils.e;

public class d extends f implements View.OnClickListener {
    private AHBottomNavigation a0;
    private q b0;

    @Override // android.support.v4.app.f
    public View a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment_tab4, container, false);
    }

    @Override // android.support.v4.app.f
    public void a(View view, Bundle savedInstanceState) {
        super.a(view, savedInstanceState);
        this.a0 = (AHBottomNavigation) view.findViewById(R.id.bottom_navigation);
        d0();
        this.b0 = d().e().a();
        o fragmentTabNoteList = new o();
        this.b0.b(R.id.frame_fragment_containers, fragmentTabNoteList);
        e.f۳۲۶۰e = fragmentTabNoteList;
        this.b0.a();
    }

    public void onClick(View view) {
    }

    public void d0() {
        com.aurelhubert.ahbottomnavigation.a item1 = new com.aurelhubert.ahbottomnavigation.a(R.string.lastTabSubMenu1, R.drawable.ic_bottom_note, R.color.white);
        com.aurelhubert.ahbottomnavigation.a item2 = new com.aurelhubert.ahbottomnavigation.a(R.string.lastTabSubMenu2, R.drawable.ic_bottom_document, R.color.white);
        com.aurelhubert.ahbottomnavigation.a item3 = new com.aurelhubert.ahbottomnavigation.a(R.string.lastTabSubMenu3, R.drawable.ic_bottom_income, R.color.white);
        com.aurelhubert.ahbottomnavigation.a item4 = new com.aurelhubert.ahbottomnavigation.a(R.string.lastTabSubMenu4, R.drawable.ic_bottom_tax, R.color.white);
        com.aurelhubert.ahbottomnavigation.a item5 = new com.aurelhubert.ahbottomnavigation.a(R.string.lastTabSubMenu5, R.drawable.ic_bottom_account, R.color.white);
        this.a0.a(item1);
        this.a0.a(item2);
        this.a0.a(item3);
        this.a0.a(item4);
        this.a0.a(item5);
        this.a0.setForceTint(false);
        this.a0.setTitleState(AHBottomNavigation.h.ALWAYS_SHOW);
        this.a0.setAccentColor(Color.parseColor(c.d()));
        this.a0.a(30.0f, 30.0f);
        this.a0.setOnTabSelectedListener(new a());
    }

    /* access modifiers changed from: package-private */
    public class a implements AHBottomNavigation.g {
        a() {
        }

        @Override // com.aurelhubert.ahbottomnavigation.AHBottomNavigation.g
        public boolean a(int position, boolean wasSelected) {
            switch (position) {
                case 0:
                    d dVar = d.this;
                    dVar.b0 = dVar.d().e().a();
                    o fragmentTabNoteList = new o();
                    d.this.b0.b(R.id.frame_fragment_containers, fragmentTabNoteList);
                    e.f۳۲۶۰e = fragmentTabNoteList;
                    e.f۳۲۵۶a.r = "note";
                    break;
                case 1:
                    d dVar2 = d.this;
                    dVar2.b0 = dVar2.d().e().a();
                    n fragmentTabDocumentList = new n();
                    d.this.b0.b(R.id.frame_fragment_containers, fragmentTabDocumentList);
                    e.f۳۲۶۱f = fragmentTabDocumentList;
                    e.f۳۲۵۶a.r = "none";
                    break;
                case 2:
                    d dVar3 = d.this;
                    dVar3.b0 = dVar3.d().e().a();
                    p fragmentTabPaymentList = new p();
                    d.this.b0.b(R.id.frame_fragment_containers, fragmentTabPaymentList);
                    e.f۳۲۶۲g = fragmentTabPaymentList;
                    e.f۳۲۵۶a.r = "none";
                    break;
                case 3:
                    d dVar4 = d.this;
                    dVar4.b0 = dVar4.d().e().a();
                    d.this.b0.b(R.id.frame_fragment_containers, new s());
                    e.f۳۲۵۶a.r = "none";
                    break;
                case 4:
                    d dVar5 = d.this;
                    dVar5.b0 = dVar5.d().e().a();
                    d.this.b0.b(R.id.frame_fragment_containers, new e());
                    e.f۳۲۵۶a.r = "none";
                    break;
                case 5:
                    d dVar6 = d.this;
                    dVar6.b0 = dVar6.d().e().a();
                    d.this.b0.b(R.id.frame_fragment_containers, new t());
                    e.f۳۲۵۶a.r = "none";
                    break;
                case 6:
                    d dVar7 = d.this;
                    dVar7.b0 = dVar7.d().e().a();
                    d.this.b0.b(R.id.frame_fragment_containers, new t());
                    e.f۳۲۵۶a.r = "none";
                    break;
                case 7:
                    d dVar8 = d.this;
                    dVar8.b0 = dVar8.d().e().a();
                    d.this.b0.b(R.id.frame_fragment_containers, new t());
                    e.f۳۲۵۶a.r = "none";
                    break;
            }
            d.this.b0.a();
            return true;
        }
    }
}
