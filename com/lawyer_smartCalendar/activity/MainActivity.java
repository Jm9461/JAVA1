package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.p۰۴۳v4.view.ViewPager;
import android.support.p۰۴۳v4.widget.DrawerLayout;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.p۱۳۰a.Cy;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Ce;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Ct;
import com.squareup.picasso.Cx;
import java.io.File;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends ActivityCe implements NavigationView.AbstractCb {

    /* renamed from: r  reason: contains not printable characters */
    public String f۱۴۳۰۷r = "meeting";

    /* renamed from: s  reason: contains not printable characters */
    private DrawerLayout f۱۴۳۰۸s;

    /* renamed from: t  reason: contains not printable characters */
    private NavigationView f۱۴۳۰۹t;

    /* renamed from: u  reason: contains not printable characters */
    private View f۱۴۳۱۰u;

    @Override // android.support.p۰۴۳v4.app.Ca.AbstractCb, android.support.p۰۴۳v4.app.ActivityCg
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        p۰۵۲b.p۰۶۲c.p۰۶۳a.Ca.m۱۵۹۱۷a().m۱۵۹۲۰a(permissions, grantResults);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.action_pay) {
            startActivity(new Intent(this, PayActivity.class));
            return true;
        } else if (itemId != R.id.action_search) {
            return super.onOptionsItemSelected(item);
        } else {
            if (!this.f۱۴۳۰۷r.equals("none")) {
                Intent frm_serach = new Intent(this, SearchActivity.class);
                frm_serach.putExtra("searchMode", this.f۱۴۳۰۷r);
                startActivity(frm_serach);
            }
            return true;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("app_version", "limited").equals("full")) {
            getMenuInflater().inflate(R.menu.main_pay, menu);
        } else {
            getMenuInflater().inflate(R.menu.main, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        setTheme(Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        com.lawyer_smartCalendar.utils.Cb.f۱۴۷۷۴a = this;
        Ci db = new Ci(this);
        if (!p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۵a("installed", false)) {
            db.m۱۷۷۸۷c();
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_white_24dp);
        Ce.f۱۴۷۸۲a = this;
        this.f۱۴۳۰۸s = (DrawerLayout) findViewById(R.id.drawer_layout);
        android.support.p۰۴۷v7.app.Cb toggle = new android.support.p۰۴۷v7.app.Cb(this, this.f۱۴۳۰۸s, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        this.f۱۴۳۰۸s.m۱۳۰۸۷a(toggle);
        toggle.m۱۳۴۴۵b();
        this.f۱۴۳۰۹t = (NavigationView) findViewById(R.id.nav_view);
        this.f۱۴۳۱۰u = this.f۱۴۳۰۹t.m۱۱۶۴۸a(R.layout.nav_header_main);
        this.f۱۴۳۱۰u.setBackgroundColor(Cc.m۱۷۷۴۰c());
        this.f۱۴۳۰۹t.setNavigationItemSelectedListener(this);
        m۱۷۴۳۳m();
        m۱۷۴۳۴n();
    }

    /* renamed from: m  reason: contains not printable characters */
    public void m۱۷۴۳۳m() {
        CircularImageView img_header_user_image = (CircularImageView) this.f۱۴۳۱۰u.findViewById(R.id.img_header_user_image);
        ((TextView) this.f۱۴۳۱۰u.findViewById(R.id.txt_header_user_name)).setText(p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_name", ""));
        if (!p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_image", "").equals("")) {
            try {
                Cx a = Ct.m۱۸۳۹۵b().m۱۸۳۹۹a(new File(p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_image", "")));
                a.m۱۸۴۳۸c();
                a.m۱۸۴۳۳a();
                a.m۱۸۴۳۵a(img_header_user_image);
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: n  reason: contains not printable characters */
    public void m۱۷۴۳۴n() {
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        TabLayout.Cg b = tabLayout.m۱۱۷۰۷b();
        b.m۱۱۷۳۶b("رتبه وکیل");
        tabLayout.m۱۱۷۰۱a(b);
        TabLayout.Cg b2 = tabLayout.m۱۱۷۰۷b();
        b2.m۱۱۷۳۶b("نظرسنجی");
        tabLayout.m۱۱۷۰۱a(b2);
        TabLayout.Cg b3 = tabLayout.m۱۱۷۰۷b();
        b3.m۱۱۷۳۶b("محاسبات قضایی");
        tabLayout.m۱۱۷۰۱a(b3);
        TabLayout.Cg b4 = tabLayout.m۱۱۷۰۷b();
        b4.m۱۱۷۳۶b("مدیریت دفتر وکالت");
        tabLayout.m۱۱۷۰۱a(b4);
        TabLayout.Cg b5 = tabLayout.m۱۱۷۰۷b();
        b5.m۱۱۷۳۶b("پرونده ها");
        tabLayout.m۱۱۷۰۱a(b5);
        TabLayout.Cg b6 = tabLayout.m۱۱۷۰۷b();
        b6.m۱۱۷۳۶b("موکلین");
        tabLayout.m۱۱۷۰۱a(b6);
        TabLayout.Cg b7 = tabLayout.m۱۱۷۰۷b();
        b7.m۱۱۷۳۶b("جلسات");
        tabLayout.m۱۱۷۰۱a(b7);
        new Cf(this).m۱۷۷۴۷a(this, tabLayout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        Cy adapter = new Cy(m۱۲۲۶۲e(), tabLayout.getTabCount());
        viewPager.setOffscreenPageLimit(7);
        viewPager.setAdapter(adapter);
        viewPager.m۱۲۷۶۶a(new TabLayout.Ch(tabLayout));
        viewPager.setCurrentItem(6);
        tabLayout.setOnTabSelectedListener(new Ca(this, viewPager));
        tabLayout.setOnTabSelectedListener(new Cb(this, viewPager));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lawyer_smartCalendar.activity.MainActivity$a  reason: invalid class name */
    public class Ca implements TabLayout.AbstractCd {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ ViewPager f۱۴۳۱۱a;

        Ca(MainActivity this$0, ViewPager viewPager) {
            this.f۱۴۳۱۱a = viewPager;
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۳۶a(TabLayout.Cg tab) {
            this.f۱۴۳۱۱a.setCurrentItem(tab.m۱۱۷۳۸c());
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۷۴۳۸c(TabLayout.Cg tab) {
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۷۴۳۷b(TabLayout.Cg tab) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lawyer_smartCalendar.activity.MainActivity$b  reason: invalid class name */
    public class Cb implements TabLayout.AbstractCd {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ ViewPager f۱۴۳۱۲a;

        Cb(MainActivity this$0, ViewPager viewPager) {
            this.f۱۴۳۱۲a = viewPager;
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۳۹a(TabLayout.Cg tab) {
            switch (tab.m۱۱۷۳۸c()) {
                case 0:
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    this.f۱۴۳۱۲a.setCurrentItem(0);
                    return;
                case 1:
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    this.f۱۴۳۱۲a.setCurrentItem(1);
                    return;
                case 2:
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "none";
                    this.f۱۴۳۱۲a.setCurrentItem(2);
                    return;
                case 3:
                    this.f۱۴۳۱۲a.setCurrentItem(3);
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "note";
                    return;
                case 4:
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "case";
                    this.f۱۴۳۱۲a.setCurrentItem(4);
                    return;
                case 5:
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "client";
                    this.f۱۴۳۱۲a.setCurrentItem(5);
                    return;
                case 6:
                    Ce.f۱۴۷۸۲a.f۱۴۳۰۷r = "meeting";
                    this.f۱۴۳۱۲a.setCurrentItem(6);
                    return;
                default:
                    return;
            }
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۷۴۴۱c(TabLayout.Cg tab) {
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۷۴۴۰b(TabLayout.Cg tab) {
        }
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onBackPressed() {
        if (this.f۱۴۳۰۸s.m۱۳۱۰۹e(8388611)) {
            this.f۱۴۳۰۸s.m۱۳۰۸۳a(8388611);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.support.design.widget.NavigationView.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۷۴۳۲a(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_setting) {
            finish();
            startActivity(new Intent(this, SettingActivity.class));
            return true;
        } else if (id == R.id.nav_profile) {
            startActivity(new Intent(this, ProfileActivity.class));
            return true;
        } else if (id == R.id.nav_link) {
            startActivity(new Intent(this, LinkActivity.class));
            return true;
        } else if (id == R.id.nav_share_friend) {
            m۱۷۴۳۱a("اشتراک گذاری برنامه با دوستان");
            return true;
        } else if (id == R.id.nav_rate) {
            m۱۷۴۳۵o();
            return true;
        } else if (id == R.id.nav_about) {
            startActivity(new Intent(this, AboutActivity.class));
            return true;
        } else if (id != R.id.nav_contact) {
            return true;
        } else {
            startActivity(new Intent(this, ContactActivity.class));
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* renamed from: o  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۴۳۵o() {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.MainActivity.m۱۷۴۳۵o():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m۱۷۴۳۱a(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.MainActivity.m۱۷۴۳۱a(java.lang.String):void");
    }
}
