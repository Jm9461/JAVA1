package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.p۰۴۳v4.view.ViewPager;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.p۱۳۰a.Ca0;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ch;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.Locale;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ClientDetailActivity extends ActivityCe {

    /* renamed from: r  reason: contains not printable characters */
    private EnumCe f۱۴۲۲۲r = EnumCe.END;

    /* renamed from: s  reason: contains not printable characters */
    public String f۱۴۲۲۳s = "";

    /* renamed from: t  reason: contains not printable characters */
    private Ci f۱۴۲۲۴t;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۴۲۲۵u = 150;

    /* renamed from: v  reason: contains not printable characters */
    private boolean f۱۴۲۲۶v = false;

    /* renamed from: w  reason: contains not printable characters */
    private TabLayout f۱۴۲۲۷w;

    /* renamed from: x  reason: contains not printable characters */
    private ViewPager f۱۴۲۲۸x;

    /* renamed from: y  reason: contains not printable characters */
    private com.lawyer_smartCalendar.p۱۳۳d.Cc f۱۴۲۲۹y = null;

    /* renamed from: z  reason: contains not printable characters */
    private int f۱۴۲۳۰z = R.menu.client_detail_real;

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
            m۱۷۴۱۵m();
            this.f۱۴۲۲۶v = true;
        }
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onBackPressed() {
        if (this.f۱۴۲۲۶v) {
            setResult(-1);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_delete /*{ENCODED_INT: 2131296288}*/:
                View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(this);
                dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar.m۱۵۸۶۸d(this.f۱۴۲۲۲r);
                dVar.m۱۵۸۷۱e("آیا برای حذف این مورد اطمینان دارید؟");
                dVar.m۱۵۸۵۸b(this.f۱۴۲۲۲r);
                dVar.m۱۵۸۴۷a(this.f۱۴۲۲۲r);
                dVar.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar.m۱۵۸۵۰a("در صورت حذف تمامی اطلاعات مربوط به موکل شامل پرونده ها ، پرداخت ها ، جلسات ، یادداشت ها و اسناد مدارک حذف خواهد شد.");
                dVar.m۱۵۸۷۲f(R.color.dialogCancelColor);
                dVar.m۱۵۸۵۶b(R.color.dialog_delete_color);
                dVar.m۱۵۸۶۹d("انصراف");
                dVar.m۱۵۸۶۰b("حذف");
                dVar.m۱۵۸۶۴c(new Cb(this));
                dVar.m۱۵۸۴۸a(new Ca());
                dVar.m۱۵۸۶۶c();
                return true;
            case R.id.action_edit /*{ENCODED_INT: 2131296290}*/:
                Intent frm_edit_client = new Intent(this, AddClientActivity.class);
                frm_edit_client.putExtra("frmMode", "edit");
                frm_edit_client.putExtra("id", this.f۱۴۲۲۳s);
                startActivityForResult(frm_edit_client, this.f۱۴۲۲۵u);
                return true;
            case R.id.action_share /*{ENCODED_INT: 2131296303}*/:
                Intent shareIntent = new Intent();
                shareIntent.setAction("android.intent.action.SEND");
                shareIntent.setType("text/plain");
                shareIntent.putExtra("android.intent.extra.TEXT", (((((("" + "نام و نام خانوادگی : " + this.f۱۴۲۲۹y.m۱۷۶۴۴f() + "\n") + "نام پدر : " + this.f۱۴۲۲۹y.m۱۷۶۳۸c() + "\n") + "کد ملی : " + this.f۱۴۲۲۹y.m۱۷۶۴۶g() + "\n") + "تلفن همراه : " + this.f۱۴۲۲۹y.m۱۷۶۴۸h() + "\n") + "تلفن ثابت : " + this.f۱۴۲۲۹y.m۱۷۶۴۲e() + "\n") + "پست الکترونیک : " + this.f۱۴۲۲۹y.m۱۷۶۳۶b() + "\n") + "آدرس : " + this.f۱۴۲۲۹y.m۱۷۶۳۳a() + "\n");
                startActivity(Intent.createChooser(shareIntent, "اشتراک گذاری موکل"));
                return true;
            case R.id.call /*{ENCODED_INT: 2131296367}*/:
                if (this.f۱۴۲۲۹y.m۱۷۶۵۰i().equals("real")) {
                    View$OnClickListenerCf.Cd dVar2 = new View$OnClickListenerCf.Cd(this);
                    dVar2.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                    dVar2.m۱۵۸۶۸d(this.f۱۴۲۲۲r);
                    dVar2.m۱۵۸۵۸b(this.f۱۴۲۲۲r);
                    dVar2.m۱۵۸۶۳c(this.f۱۴۲۲۲r);
                    dVar2.m۱۵۸۵۸b(this.f۱۴۲۲۲r);
                    dVar2.m۱۵۸۷۱e("تماس با موکل");
                    dVar2.m۱۵۸۴۱a(R.array.client_call);
                    dVar2.m۱۵۸۴۲a(-1, new Cc());
                    dVar2.m۱۵۸۶۶c();
                } else if (!this.f۱۴۲۲۹y.m۱۷۶۴۲e().equals("")) {
                    Intent intent2 = new Intent("android.intent.action.DIAL");
                    intent2.setData(Uri.parse("tel:" + this.f۱۴۲۲۹y.m۱۷۶۴۲e()));
                    startActivity(intent2);
                } else {
                    new Ch().m۱۷۷۵۳a(this, "warning", "شماره تلفن ثابت ثبت نشده است.");
                }
                return true;
            case R.id.email /*{ENCODED_INT: 2131296431}*/:
                if (!this.f۱۴۲۲۹y.m۱۷۶۳۶b().equals("")) {
                    startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + this.f۱۴۲۲۹y.m۱۷۶۳۶b())), "تماس با پست الکترونیک : " + this.f۱۴۲۲۹y.m۱۷۶۴۴f()));
                } else {
                    new Ch().m۱۷۷۵۳a(this, "warning", "آدرس پست الکترونیک ثبت نشده است.");
                }
                return true;
            case R.id.message /*{ENCODED_INT: 2131296612}*/:
                if (!this.f۱۴۲۲۹y.m۱۷۶۴۸h().equals("")) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("sms:" + this.f۱۴۲۲۹y.m۱۷۶۴۸h())));
                } else {
                    new Ch().m۱۷۷۵۳a(this, "warning", "شماره تلفن همراه ثبت نشده است.");
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ClientDetailActivity$b  reason: invalid class name */
    class Cb implements View$OnClickListenerCf.AbstractCm {
        Cb(ClientDetailActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۱۷a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ClientDetailActivity$a  reason: invalid class name */
    class Ca implements View$OnClickListenerCf.AbstractCm {
        Ca() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۱۶a(View$OnClickListenerCf dialog, EnumCb which) {
            ClientDetailActivity.this.f۱۴۲۲۴t.m۱۷۸۱۱n();
            Ci iVar = ClientDetailActivity.this.f۱۴۲۲۴t;
            ClientDetailActivity clientDetailActivity = ClientDetailActivity.this;
            iVar.m۱۷۷۸۴b(clientDetailActivity, clientDetailActivity.f۱۴۲۲۳s);
            ClientDetailActivity.this.f۱۴۲۲۴t.close();
            try {
                com.lawyer_smartCalendar.utils.Ce.f۱۴۷۸۳b.m۱۷۴۹۰d0();
                com.lawyer_smartCalendar.utils.Ce.f۱۴۷۸۴c.m۱۷۵۰۰d0();
                com.lawyer_smartCalendar.utils.Ce.f۱۴۷۸۵d.m۱۷۵۰۶d0();
                com.lawyer_smartCalendar.utils.Ce.f۱۴۷۸۶e.m۱۷۵۶۳d0();
                com.lawyer_smartCalendar.utils.Ce.f۱۴۷۸۷f.m۱۷۵۵۸d0();
                com.lawyer_smartCalendar.utils.Ce.f۱۴۷۸۸g.m۱۷۵۶۸d0();
            } catch (Exception e) {
            }
            ClientDetailActivity.this.setResult(-1);
            ClientDetailActivity.this.finish();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ClientDetailActivity$c  reason: invalid class name */
    class Cc implements View$OnClickListenerCf.AbstractCj {
        Cc() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۴۱۸a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
            if (which != 0) {
                if (which == 1) {
                    if (!ClientDetailActivity.this.f۱۴۲۲۹y.m۱۷۶۴۲e().equals("")) {
                        Intent intent2 = new Intent("android.intent.action.DIAL");
                        intent2.setData(Uri.parse("tel:" + ClientDetailActivity.this.f۱۴۲۲۹y.m۱۷۶۴۲e()));
                        ClientDetailActivity.this.startActivity(intent2);
                    } else {
                        new Ch().m۱۷۷۵۳a(ClientDetailActivity.this, "warning", "شماره تلفن ثابت ثبت نشده است.");
                    }
                }
            } else if (!ClientDetailActivity.this.f۱۴۲۲۹y.m۱۷۶۴۸h().equals("")) {
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:" + ClientDetailActivity.this.f۱۴۲۲۹y.m۱۷۶۴۸h()));
                ClientDetailActivity.this.startActivity(intent);
            } else {
                new Ch().m۱۷۷۵۳a(ClientDetailActivity.this, "warning", "شماره تلفن همراه ثبت نشده است.");
            }
            return true;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(this.f۱۴۲۳۰z, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        setTheme(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        overridePendingTransition(17432576, 17432577);
        setContentView(R.layout.activity_client_detail);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۱۴۲۲۲r = EnumCe.END;
        } else {
            this.f۱۴۲۲۲r = EnumCe.START;
        }
        this.f۱۴۲۲۴t = new Ci(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_white_24dp);
        toolbar.setPopupTheme(2131820553);
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCd());
        this.f۱۴۲۲۳s = getIntent().getStringExtra("id");
        this.f۱۴۲۲۴t.m۱۷۸۱۱n();
        this.f۱۴۲۲۹y = this.f۱۴۲۲۴t.m۱۷۸۱۲o(this.f۱۴۲۲۳s);
        this.f۱۴۲۲۴t.close();
        this.f۱۴۲۲۷w = (TabLayout) findViewById(R.id.tab_layout);
        TabLayout tabLayout = this.f۱۴۲۲۷w;
        TabLayout.Cg b = tabLayout.m۱۱۷۰۷b();
        b.m۱۱۷۳۶b("یادداشت ها");
        tabLayout.m۱۱۷۰۱a(b);
        TabLayout tabLayout2 = this.f۱۴۲۲۷w;
        TabLayout.Cg b2 = tabLayout2.m۱۱۷۰۷b();
        b2.m۱۱۷۳۶b("جلسات");
        tabLayout2.m۱۱۷۰۱a(b2);
        TabLayout tabLayout3 = this.f۱۴۲۲۷w;
        TabLayout.Cg b3 = tabLayout3.m۱۱۷۰۷b();
        b3.m۱۱۷۳۶b("پرونده ها");
        tabLayout3.m۱۱۷۰۱a(b3);
        TabLayout tabLayout4 = this.f۱۴۲۲۷w;
        TabLayout.Cg b4 = tabLayout4.m۱۱۷۰۷b();
        b4.m۱۱۷۳۶b("جزییات");
        tabLayout4.m۱۱۷۰۱a(b4);
        new Cf(this).m۱۷۷۴۷a(this, this.f۱۴۲۲۷w);
        m۱۷۴۱۵m();
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ClientDetailActivity$d  reason: invalid class name */
    class View$OnClickListenerCd implements View.OnClickListener {
        View$OnClickListenerCd() {
        }

        public void onClick(View view) {
            ClientDetailActivity.this.onBackPressed();
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    private void m۱۷۴۱۵m() {
        this.f۱۴۲۲۸x = (ViewPager) findViewById(R.id.pager);
        Ca0 adapter = new Ca0(m۱۲۲۶۲e(), this.f۱۴۲۲۷w.getTabCount());
        this.f۱۴۲۲۸x.setOffscreenPageLimit(4);
        this.f۱۴۲۲۸x.setAdapter(adapter);
        this.f۱۴۲۲۸x.m۱۲۷۶۶a(new TabLayout.Ch(this.f۱۴۲۲۷w));
        this.f۱۴۲۲۸x.setCurrentItem(3);
        this.f۱۴۲۲۷w.setOnTabSelectedListener(new Ce());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lawyer_smartCalendar.activity.ClientDetailActivity$e  reason: invalid class name */
    public class Ce implements TabLayout.AbstractCd {
        Ce() {
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۱۹a(TabLayout.Cg tab) {
            ClientDetailActivity.this.f۱۴۲۲۸x.setCurrentItem(tab.m۱۱۷۳۸c());
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۷۴۲۱c(TabLayout.Cg tab) {
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۷۴۲۰b(TabLayout.Cg tab) {
        }
    }
}
