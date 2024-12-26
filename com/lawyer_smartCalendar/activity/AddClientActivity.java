package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import butterknife.ButterKnife;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.utils.Ch;
import com.lawyer_smartCalendar.utils.Ci;
import com.rey.material.widget.Button;
import java.util.Locale;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AddClientActivity extends ActivityCe implements View.OnClickListener {
    public Button btn_add_client;
    public EditText input_client_address;
    public EditText input_client_email_address;
    public EditText input_client_father_name;
    public EditText input_client_landline_phone;
    public EditText input_client_name;
    public EditText input_client_national_code;
    public EditText input_client_phone_number;
    public TextInputLayout input_layout_client_name;
    public TextInputLayout input_layout_father_name;
    public TextInputLayout input_layout_national_code;
    public TextInputLayout input_layout_phone_number;

    /* renamed from: r  reason: contains not printable characters */
    private String f۱۴۰۶۱r = "real";
    public RadioButton radioButton_legal;
    public RadioButton radioButton_real;

    /* renamed from: s  reason: contains not printable characters */
    private String f۱۴۰۶۲s = "";

    /* renamed from: t  reason: contains not printable characters */
    private String f۱۴۰۶۳t = "add";

    /* renamed from: u  reason: contains not printable characters */
    private Ci f۱۴۰۶۴u;

    /* renamed from: v  reason: contains not printable characters */
    private EnumCe f۱۴۰۶۵v = EnumCe.END;

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_add) {
            this.btn_add_client.callOnClick();
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_add_edit, menu);
        return super.onCreateOptionsMenu(menu);
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
        setContentView(R.layout.activity_add_client);
        ButterKnife.m۱۶۵۸۶a(this);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۱۴۰۶۵v = EnumCe.END;
        } else {
            this.f۱۴۰۶۵v = EnumCe.START;
        }
        if (!Ca.m۱۶۴۱۳a("app_version", "limited").equals("full")) {
            new Ch().m۱۷۷۵۳a(this, "info", "سالنامه هوشمند کانون وکلای آذربایجان شرقی");
        }
        this.f۱۴۰۶۴u = new Ci(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_action_close);
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCa());
        this.btn_add_client.setOnClickListener(this);
        this.btn_add_client.setVisibility(8);
        this.radioButton_real.setOnCheckedChangeListener(new Cb());
        this.radioButton_legal.setOnCheckedChangeListener(new Cc());
        this.f۱۴۰۶۲s = getIntent().getStringExtra("id");
        this.f۱۴۰۶۳t = getIntent().getStringExtra("frmMode");
        if (this.f۱۴۰۶۳t.equals("edit")) {
            this.f۱۴۰۶۴u.m۱۷۸۱۱n();
            com.lawyer_smartCalendar.p۱۳۳d.Cc client = this.f۱۴۰۶۴u.m۱۷۸۱۲o(this.f۱۴۰۶۲s);
            this.f۱۴۰۶۴u.close();
            m۱۳۴۸۹j().m۱۳۴۱۴a("ویرایش موکل");
            this.input_client_name.setText(client.m۱۷۶۴۴f());
            this.input_client_father_name.setText(client.m۱۷۶۳۸c());
            this.input_client_national_code.setText(client.m۱۷۶۴۶g());
            this.input_client_phone_number.setText(client.m۱۷۶۴۸h());
            this.input_client_landline_phone.setText(client.m۱۷۶۴۲e());
            this.input_client_email_address.setText(client.m۱۷۶۳۶b());
            this.input_client_address.setText(client.m۱۷۶۳۳a());
            this.f۱۴۰۶۱r = client.m۱۷۶۵۰i();
            if (client.m۱۷۶۵۰i().equals("real")) {
                this.radioButton_real.setChecked(true);
            } else {
                this.radioButton_legal.setChecked(true);
            }
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientActivity$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View view) {
            AddClientActivity.this.finish();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientActivity$b  reason: invalid class name */
    class Cb implements CompoundButton.OnCheckedChangeListener {
        Cb() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
            if (checked) {
                AddClientActivity.this.radioButton_legal.setChecked(false);
                AddClientActivity.this.f۱۴۰۶۱r = "real";
                AddClientActivity.this.input_layout_national_code.setVisibility(0);
                AddClientActivity.this.input_layout_father_name.setVisibility(0);
                AddClientActivity.this.input_layout_phone_number.setVisibility(0);
            }
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientActivity$c  reason: invalid class name */
    class Cc implements CompoundButton.OnCheckedChangeListener {
        Cc() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
            if (checked) {
                AddClientActivity.this.radioButton_real.setChecked(false);
                AddClientActivity.this.f۱۴۰۶۱r = "legal";
                AddClientActivity.this.input_layout_national_code.setVisibility(8);
                AddClientActivity.this.input_layout_father_name.setVisibility(8);
                AddClientActivity.this.input_layout_phone_number.setVisibility(8);
            }
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btn_add_client) {
            this.f۱۴۰۶۴u.m۱۷۸۱۱n();
            int client_count = this.f۱۴۰۶۴u.m۱۷۸۰۱i().size();
            this.f۱۴۰۶۴u.close();
            if (client_count != 200 || Ca.m۱۶۴۱۳a("app_version", "limited").equals("full")) {
                boolean hasError = false;
                if (this.input_client_name.getText().toString().equals("")) {
                    this.input_client_name.setError("لطفا نام و نام خانوادگی را وارد کنید.");
                    hasError = true;
                }
                if (!this.input_client_national_code.getText().toString().equals("") && this.input_client_national_code.getText().toString().length() < 10) {
                    this.input_client_national_code.setError("شماره ملی باید 10 رقم باشد.");
                    hasError = true;
                }
                if (this.input_client_phone_number.getText().toString().length() > 0 && this.input_client_phone_number.getText().toString().length() < 11) {
                    this.input_client_phone_number.setError("شماره تلفن همراه باید 11 رقم باشد.");
                    hasError = true;
                }
                if (!hasError) {
                    com.lawyer_smartCalendar.p۱۳۳d.Cc client = new com.lawyer_smartCalendar.p۱۳۳d.Cc();
                    client.m۱۷۶۴۳e(this.input_client_name.getText().toString());
                    if (this.f۱۴۰۶۱r.equals("real")) {
                        client.m۱۷۶۳۹c(this.input_client_father_name.getText().toString());
                        client.m۱۷۶۴۵f(this.input_client_national_code.getText().toString());
                        client.m۱۷۶۴۷g(this.input_client_phone_number.getText().toString());
                    } else {
                        client.m۱۷۶۳۹c("");
                        client.m۱۷۶۴۵f("");
                        client.m۱۷۶۴۷g("");
                    }
                    client.m۱۷۶۴۱d(this.input_client_landline_phone.getText().toString());
                    client.m۱۷۶۳۷b(this.input_client_email_address.getText().toString());
                    client.m۱۷۶۳۵a(this.input_client_address.getText().toString());
                    client.m۱۷۶۴۹h(this.f۱۴۰۶۱r);
                    this.f۱۴۰۶۴u.m۱۷۸۱۱n();
                    if (this.f۱۴۰۶۳t.equals("edit")) {
                        this.f۱۴۰۶۴u.m۱۷۷۷۰a(client, this.f۱۴۰۶۲s);
                        new Ch().m۱۷۷۵۳a(this, "success", getResources().getString(R.string.successClient_edit));
                    } else {
                        this.f۱۴۰۶۴u.m۱۷۷۶۹a(client);
                        new Ch().m۱۷۷۵۳a(this, "success", getResources().getString(R.string.successClient_insert));
                    }
                    this.f۱۴۰۶۴u.close();
                    try {
                        com.lawyer_smartCalendar.utils.Ce.f۱۴۷۸۴c.m۱۷۵۰۰d0();
                        com.lawyer_smartCalendar.utils.Ce.f۱۴۷۸۵d.m۱۷۵۰۶d0();
                    } catch (Exception e) {
                    }
                    setResult(-1);
                    finish();
                    return;
                }
                return;
            }
            View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(this);
            dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
            dVar.m۱۵۸۶۸d(EnumCe.CENTER);
            dVar.m۱۵۸۵۸b(EnumCe.CENTER);
            dVar.m۱۵۸۴۷a(this.f۱۴۰۶۵v);
            dVar.m۱۵۸۷۵i(Color.parseColor(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۴۱d()));
            dVar.m۱۵۸۷۱e("");
            dVar.m۱۵۸۷۲f(R.color.dialogCancelColor);
            dVar.m۱۵۸۶۷d(Color.parseColor(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۴۱d()));
            dVar.m۱۵۸۵۰a("سالنامه هوشمند کانون وکلای آذربایجان شرقی");
            dVar.m۱۵۸۶۹d("فعلا نه");
            dVar.m۱۵۸۶۵c("سالنامه هوشمند کانون وکلای آذربایجان شرقی");
            dVar.m۱۵۸۶۴c(new Ce(this));
            dVar.m۱۵۸۵۹b(new Cd());
            dVar.m۱۵۸۶۶c();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientActivity$e  reason: invalid class name */
    class Ce implements View$OnClickListenerCf.AbstractCm {
        Ce(AddClientActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۱۵a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientActivity$d  reason: invalid class name */
    class Cd implements View$OnClickListenerCf.AbstractCm {
        Cd() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۱۴a(View$OnClickListenerCf dialog, EnumCb which) {
            AddClientActivity addClientActivity = AddClientActivity.this;
            addClientActivity.startActivity(new Intent(addClientActivity, PayActivity.class));
        }
    }
}
