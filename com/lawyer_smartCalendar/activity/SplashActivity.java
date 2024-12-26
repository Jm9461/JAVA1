package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Cl;
import p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.EnumCb;
import p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.p۱۲۱e.AbstractActivityCa;
import p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.p۱۲۲f.Ca;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class SplashActivity extends AbstractActivityCa {
    /* access modifiers changed from: protected */
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    /* access modifiers changed from: protected */
    @Override // p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.p۱۲۱e.AbstractActivityCa, android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Cl().m۱۷۸۲۹a(this, Color.parseColor(Cc.m۱۷۷۴۱d()));
    }

    @Override // p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.p۱۲۱e.AbstractActivityCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۴۷۹a(Ca configSplash) {
        configSplash.m۱۶۵۵۸f(Cc.m۱۷۷۴۲e());
        configSplash.m۱۶۵۴۴a(1500);
        configSplash.m۱۶۵۷۲m(3);
        configSplash.m۱۶۵۷۴n(2);
        configSplash.m۱۶۵۶۰g(R.drawable.ic_launcher);
        configSplash.m۱۶۵۴۵a(EnumCb.FadeInLeft);
        configSplash.m۱۶۵۴۸b(1500);
        configSplash.m۱۶۵۶۲h(400);
        configSplash.m۱۶۵۶۴i(400);
        configSplash.m۱۶۵۵۴d(3000);
        configSplash.m۱۶۵۷۰l(3);
        configSplash.m۱۶۵۶۸k(R.color.strokeColor);
        configSplash.m۱۶۵۵۲c(3000);
        configSplash.m۱۶۵۶۶j(R.color.strokeColor);
        configSplash.m۱۶۵۵۰b(getResources().getString(R.string.app_name));
        configSplash.m۱۶۵۷۶o(R.color.white);
        configSplash.m۱۶۵۴۳a(15.0f);
        configSplash.m۱۶۵۵۶e(2000);
        configSplash.m۱۶۵۴۹b(EnumCb.SlideInDown);
        configSplash.m۱۶۵۴۶a("fonts/IRANSansMobile_Medium.ttf");
    }

    @Override // p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.p۱۲۱e.AbstractActivityCa
    /* renamed from: m  reason: contains not printable characters */
    public void m۱۷۴۸۰m() {
        finish();
        if (!p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۵a("Profile_has_info", false)) {
            startActivity(new Intent(this, FirstProfileActivity.class));
        } else {
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}
