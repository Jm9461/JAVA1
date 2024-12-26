package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.afollestad.materialdialogs.color.View$OnClickListenerCb;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.utils.Ch;
import com.rey.material.widget.Button;
import java.util.Locale;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۰۵۲b.p۰۶۲c.p۰۶۳a.AbstractCb;
import p۰۵۲b.p۰۶۲c.p۰۶۳a.Ca;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class SettingActivity extends ActivityCe implements View.OnClickListener, View$OnClickListenerCb.AbstractCh {
    public Button btn_backup;
    public Button btn_change_color;
    public Button btn_restore;

    public SettingActivity() {
        EnumCe eVar = EnumCe.END;
    }

    @Override // android.support.p۰۴۳v4.app.Ca.AbstractCb, android.support.p۰۴۳v4.app.ActivityCg
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Ca.m۱۵۹۱۷a().m۱۵۹۲۰a(permissions, grantResults);
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

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(17432576, 17432577);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        setTheme(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        overridePendingTransition(17432576, 17432577);
        setContentView(R.layout.activity_setting);
        ButterKnife.m۱۶۵۸۶a(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_white_24dp);
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCa());
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            EnumCe eVar = EnumCe.END;
        } else {
            EnumCe eVar2 = EnumCe.START;
        }
        this.btn_change_color.setOnClickListener(this);
        this.btn_backup.setOnClickListener(this);
        this.btn_restore.setOnClickListener(this);
        Ca.m۱۵۹۱۷a().m۱۵۹۱۹a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, new Cb());
    }

    /* renamed from: com.lawyer_smartCalendar.activity.SettingActivity$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View view) {
            SettingActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.SettingActivity$b  reason: invalid class name */
    class Cb extends AbstractCb {
        Cb() {
        }

        @Override // p۰۵۲b.p۰۶۲c.p۰۶۳a.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۷۵a() {
        }

        @Override // p۰۵۲b.p۰۶۲c.p۰۶۳a.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۷۶a(String permission) {
            Toast.makeText(SettingActivity.this, "لطفا دسترسی های لازم را به برنامه بدهید.", 0).show();
            SettingActivity.this.finish();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onBackPressed() {
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_backup /*{ENCODED_INT: 2131296349}*/:
                new com.lawyer_smartCalendar.utils.Cd(this).m۱۷۷۴۴a();
                new Ch().m۱۷۷۵۳a(this, "success", "پشتیبان گیری با موفقیت انجام شد.");
                return;
            case R.id.btn_change_color /*{ENCODED_INT: 2131296350}*/:
                int[] primary = new com.lawyer_smartCalendar.utils.Cc().m۱۷۷۴۳a();
                View$OnClickListenerCb.Cg gVar = new View$OnClickListenerCb.Cg(this, R.string.colorPickerTitle);
                gVar.m۱۶۷۲۹a(primary, (int[][]) null);
                gVar.m۱۶۷۳۵c(3);
                gVar.m۱۶۷۲۸a(false);
                gVar.m۱۶۷۳۴b(false);
                gVar.m۱۶۷۲۷a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                gVar.m۱۶۷۲۶a(R.string.colorPickerCancelTitle);
                gVar.m۱۶۷۳۳b(R.string.colorPickerDoneTitle).m۱۶۷۳۱a(this);
                return;
            case R.id.btn_restore /*{ENCODED_INT: 2131296355}*/:
                View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(this);
                dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar.m۱۵۸۶۸d(EnumCe.END);
                dVar.m۱۵۸۷۱e("آیا برای بازگردانی اطلاعات اطمینان دارید؟");
                dVar.m۱۵۸۵۸b(EnumCe.END);
                dVar.m۱۵۸۴۷a(EnumCe.END);
                dVar.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar.m۱۵۸۵۰a("در صورت بازگردانی اطلاعات فعلی حذف و اطلاعات فایل پشتیبان جایگزین می شود.");
                dVar.m۱۵۸۷۲f(R.color.dialogCancelColor);
                dVar.m۱۵۸۵۶b(R.color.colorPrimaryDark);
                dVar.m۱۵۸۶۹d("انصراف");
                dVar.m۱۵۸۶۰b("بازگردانی");
                dVar.m۱۵۸۶۴c(new Cd(this));
                dVar.m۱۵۸۴۸a(new Cc());
                dVar.m۱۵۸۶۶c();
                return;
            default:
                return;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.SettingActivity$d  reason: invalid class name */
    class Cd implements View$OnClickListenerCf.AbstractCm {
        Cd(SettingActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۷۸a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.SettingActivity$c  reason: invalid class name */
    class Cc implements View$OnClickListenerCf.AbstractCm {
        Cc() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۷۷a(View$OnClickListenerCf dialog, EnumCb which) {
            if (new com.lawyer_smartCalendar.utils.Cd(SettingActivity.this).m۱۷۷۴۵b()) {
                new Ch().m۱۷۷۵۳a(SettingActivity.this, "success", "بازگردانی با موفقیت انجام شد.");
            } else {
                new Ch().m۱۷۷۵۳a(SettingActivity.this, "error", "بازگردانی انجام نشد.ممکن است فایل پشتیبان وجود نداشته باشد.");
            }
        }
    }

    @Override // com.afollestad.materialdialogs.color.View$OnClickListenerCb.AbstractCh
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۴۷۴a(View$OnClickListenerCb dialog, int selectedColor) {
        if (com.lawyer_smartCalendar.utils.Cc.m۱۷۷۳۸a(selectedColor)) {
            p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۷b("themeColor", selectedColor);
            finish();
            startActivity(new Intent(this, SplashActivity.class));
            return;
        }
        new Ch().m۱۷۷۵۳a(this, "error", "لطفا رنگ مورد نظر را از لیست انتخاب کنید.");
    }

    @Override // com.afollestad.materialdialogs.color.View$OnClickListenerCb.AbstractCh
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۴۷۳a(View$OnClickListenerCb dialog) {
    }
}
