package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.p۰۴۳v4.view.ViewPager;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.p۱۳۰a.Cz;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Ce;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class CaseDetailActivity extends ActivityCe {

    /* renamed from: r  reason: contains not printable characters */
    public String f۱۴۲۱۴r = "";

    /* renamed from: s  reason: contains not printable characters */
    private Ci f۱۴۲۱۵s;

    /* renamed from: t  reason: contains not printable characters */
    private TabLayout f۱۴۲۱۶t;

    /* renamed from: u  reason: contains not printable characters */
    private boolean f۱۴۲۱۷u = false;

    /* renamed from: v  reason: contains not printable characters */
    private int f۱۴۲۱۸v = 250;

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(17432576, 17432577);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۷۴۰۶m();
            this.f۱۴۲۱۷u = true;
        }
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onBackPressed() {
        if (this.f۱۴۲۱۷u) {
            setResult(-1);
        }
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.action_delete) {
            View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(this);
            dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
            dVar.m۱۵۸۵۸b(EnumCe.CENTER);
            dVar.m۱۵۸۴۷a(EnumCe.END);
            dVar.m۱۵۸۷۶j(R.color.colorPrimaryDark);
            dVar.m۱۵۸۵۰a("آیا برای حذف این مورد اطمینان دارید؟");
            dVar.m۱۵۸۷۲f(R.color.dialogCancelColor);
            dVar.m۱۵۸۵۶b(R.color.dialog_delete_color);
            dVar.m۱۵۸۵۰a("در صورت حذف تمامی اطلاعات مربوط به پرونده شامل پرداخت ها ، جلسات ، یادداشت ها ،رویداد ها و اسناد مدارک حذف خواهد شد.");
            dVar.m۱۵۸۶۹d("انصراف");
            dVar.m۱۵۸۶۰b("حذف");
            dVar.m۱۵۸۶۴c(new Cb(this));
            dVar.m۱۵۸۴۸a(new Ca());
            dVar.m۱۵۸۶۶c();
            return true;
        } else if (itemId != R.id.action_edit) {
            return super.onOptionsItemSelected(item);
        } else {
            Intent frm_edit_case = new Intent(this, AddCaseActivity.class);
            frm_edit_case.putExtra("frmMode", "edit");
            frm_edit_case.putExtra("id", this.f۱۴۲۱۴r);
            startActivityForResult(frm_edit_case, this.f۱۴۲۱۸v);
            return true;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.CaseDetailActivity$b  reason: invalid class name */
    class Cb implements View$OnClickListenerCf.AbstractCm {
        Cb(CaseDetailActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۰۸a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.CaseDetailActivity$a  reason: invalid class name */
    class Ca implements View$OnClickListenerCf.AbstractCm {
        Ca() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۰۷a(View$OnClickListenerCf dialog, EnumCb which) {
            try {
                CaseDetailActivity.this.f۱۴۲۱۵s.m۱۷۸۱۱n();
                CaseDetailActivity.this.f۱۴۲۱۵s.m۱۷۷۶۴a(CaseDetailActivity.this, CaseDetailActivity.this.f۱۴۲۱۴r);
                CaseDetailActivity.this.f۱۴۲۱۵s.close();
                Ce.f۱۴۷۸۵d.m۱۷۵۰۶d0();
                Ce.f۱۴۷۸۳b.m۱۷۴۹۰d0();
            } catch (Exception ex) {
                Toast.makeText(CaseDetailActivity.this.getApplicationContext(), ex.toString(), 1).show();
            }
            CaseDetailActivity.this.setResult(-1);
            CaseDetailActivity.this.finish();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.case_detail, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        setTheme(Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        overridePendingTransition(17432576, 17432577);
        setContentView(R.layout.activity_case_detail);
        this.f۱۴۲۱۵s = new Ci(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_white_24dp);
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCc());
        this.f۱۴۲۱۴r = getIntent().getStringExtra("id");
        findViewById(R.id.drawer_layout);
        this.f۱۴۲۱۶t = (TabLayout) findViewById(R.id.tab_layout);
        TabLayout tabLayout = this.f۱۴۲۱۶t;
        TabLayout.Cg b = tabLayout.m۱۱۷۰۷b();
        b.m۱۱۷۳۶b("اسناد و مدارک");
        tabLayout.m۱۱۷۰۱a(b);
        TabLayout tabLayout2 = this.f۱۴۲۱۶t;
        TabLayout.Cg b2 = tabLayout2.m۱۱۷۰۷b();
        b2.m۱۱۷۳۶b("یادداشت ها");
        tabLayout2.m۱۱۷۰۱a(b2);
        TabLayout tabLayout3 = this.f۱۴۲۱۶t;
        TabLayout.Cg b3 = tabLayout3.m۱۱۷۰۷b();
        b3.m۱۱۷۳۶b("جلسات");
        tabLayout3.m۱۱۷۰۱a(b3);
        TabLayout tabLayout4 = this.f۱۴۲۱۶t;
        TabLayout.Cg b4 = tabLayout4.m۱۱۷۰۷b();
        b4.m۱۱۷۳۶b("اطلاعات");
        tabLayout4.m۱۱۷۰۱a(b4);
        new Cf(this).m۱۷۷۴۷a(this, this.f۱۴۲۱۶t);
        m۱۷۴۰۶m();
    }

    /* renamed from: com.lawyer_smartCalendar.activity.CaseDetailActivity$c  reason: invalid class name */
    class View$OnClickListenerCc implements View.OnClickListener {
        View$OnClickListenerCc() {
        }

        public void onClick(View view) {
            CaseDetailActivity.this.finish();
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    public void m۱۷۴۰۶m() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        Cz adapter = new Cz(m۱۲۲۶۲e(), this.f۱۴۲۱۶t.getTabCount());
        viewPager.setOffscreenPageLimit(4);
        viewPager.setAdapter(adapter);
        viewPager.m۱۲۷۶۶a(new TabLayout.Ch(this.f۱۴۲۱۶t));
        viewPager.setCurrentItem(3);
        this.f۱۴۲۱۶t.setOnTabSelectedListener(new Cd(this, viewPager));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lawyer_smartCalendar.activity.CaseDetailActivity$d  reason: invalid class name */
    public class Cd implements TabLayout.AbstractCd {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ ViewPager f۱۴۲۲۱a;

        Cd(CaseDetailActivity this$0, ViewPager viewPager) {
            this.f۱۴۲۲۱a = viewPager;
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۰۹a(TabLayout.Cg tab) {
            this.f۱۴۲۲۱a.setCurrentItem(tab.m۱۱۷۳۸c());
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۷۴۱۱c(TabLayout.Cg tab) {
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۷۴۱۰b(TabLayout.Cg tab) {
        }
    }
}
