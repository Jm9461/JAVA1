package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.p۰۴۳v4.view.ViewPager;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.p۱۳۰a.Cb0;
import com.lawyer_smartCalendar.utils.Ce;
import com.lawyer_smartCalendar.utils.Ci;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ScheduleDetailActivity extends ActivityCe {

    /* renamed from: r  reason: contains not printable characters */
    private boolean f۱۴۴۵۸r = false;

    /* renamed from: s  reason: contains not printable characters */
    public String f۱۴۴۵۹s = "";

    /* renamed from: t  reason: contains not printable characters */
    private Ci f۱۴۴۶۰t;

    /* renamed from: u  reason: contains not printable characters */
    private com.lawyer_smartCalendar.p۱۳۳d.Ci f۱۴۴۶۱u;

    /* renamed from: v  reason: contains not printable characters */
    private int f۱۴۴۶۲v = 150;

    /* renamed from: w  reason: contains not printable characters */
    private TabLayout f۱۴۴۶۳w;

    /* renamed from: x  reason: contains not printable characters */
    private ViewPager f۱۴۴۶۴x;

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
        if (requestCode == this.f۱۴۴۶۲v && resultCode == -1) {
            m۱۷۴۶۰m();
            this.f۱۴۴۵۸r = true;
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != R.id.action_delete) {
            return super.onOptionsItemSelected(item);
        }
        View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(this);
        dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
        dVar.m۱۵۸۵۸b(EnumCe.CENTER);
        dVar.m۱۵۸۴۷a(EnumCe.END);
        dVar.m۱۵۸۷۶j(R.color.colorPrimaryDark);
        dVar.m۱۵۸۵۰a("آیا برای حذف این مورد اطمینان دارید؟");
        dVar.m۱۵۸۷۲f(R.color.dialogCancelColor);
        dVar.m۱۵۸۵۶b(R.color.dialog_delete_color);
        dVar.m۱۵۸۶۹d("انصراف");
        dVar.m۱۵۸۶۰b("حذف");
        dVar.m۱۵۸۶۴c(new Cb(this));
        dVar.m۱۵۸۴۸a(new Ca());
        dVar.m۱۵۸۶۶c();
        return true;
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ScheduleDetailActivity$b  reason: invalid class name */
    class Cb implements View$OnClickListenerCf.AbstractCm {
        Cb(ScheduleDetailActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۶۲a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ScheduleDetailActivity$a  reason: invalid class name */
    class Ca implements View$OnClickListenerCf.AbstractCm {
        Ca() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۶۱a(View$OnClickListenerCf dialog, EnumCb which) {
            ScheduleDetailActivity.this.f۱۴۴۶۰t.m۱۷۸۱۱n();
            Ci iVar = ScheduleDetailActivity.this.f۱۴۴۶۰t;
            ScheduleDetailActivity scheduleDetailActivity = ScheduleDetailActivity.this;
            iVar.m۱۷۷۸۸c(scheduleDetailActivity, scheduleDetailActivity.f۱۴۴۵۹s);
            ScheduleDetailActivity.this.f۱۴۴۶۰t.close();
            try {
                ScheduleDetailActivity.this.setResult(-1);
                Ce.f۱۴۷۸۳b.m۱۷۴۹۰d0();
            } catch (Exception e) {
            }
            ScheduleDetailActivity.this.finish();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.schedule_detail, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x007d, code lost:
        if (r2.equals("ProceedingsTimes") == false) goto L_0x008a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x009a  */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.ScheduleDetailActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ScheduleDetailActivity$c  reason: invalid class name */
    class View$OnClickListenerCc implements View.OnClickListener {
        View$OnClickListenerCc() {
        }

        public void onClick(View view) {
            ScheduleDetailActivity.this.onBackPressed();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onBackPressed() {
        if (this.f۱۴۴۵۸r) {
            Ce.f۱۴۷۸۳b.m۱۷۴۹۰d0();
            setResult(-1);
        }
        finish();
    }

    /* renamed from: m  reason: contains not printable characters */
    public void m۱۷۴۶۰m() {
        this.f۱۴۴۶۴x = (ViewPager) findViewById(R.id.pager);
        Cb0 adapter = new Cb0(m۱۲۲۶۲e(), this.f۱۴۴۶۳w.getTabCount());
        this.f۱۴۴۶۴x.setOffscreenPageLimit(2);
        this.f۱۴۴۶۴x.setAdapter(adapter);
        this.f۱۴۴۶۴x.m۱۲۷۶۶a(new TabLayout.Ch(this.f۱۴۴۶۳w));
        this.f۱۴۴۶۴x.setCurrentItem(1);
        this.f۱۴۴۶۳w.setOnTabSelectedListener(new Cd());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lawyer_smartCalendar.activity.ScheduleDetailActivity$d  reason: invalid class name */
    public class Cd implements TabLayout.AbstractCd {
        Cd() {
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۶۳a(TabLayout.Cg tab) {
            ScheduleDetailActivity.this.f۱۴۴۶۴x.setCurrentItem(tab.m۱۱۷۳۸c());
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۷۴۶۵c(TabLayout.Cg tab) {
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۷۴۶۴b(TabLayout.Cg tab) {
        }
    }
}
