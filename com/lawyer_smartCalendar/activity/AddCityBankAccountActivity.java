package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.DialogCe;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.LinearLayoutManager;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import butterknife.ButterKnife;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.p۱۳۰a.Cb;
import com.lawyer_smartCalendar.p۱۳۰a.Cj;
import com.lawyer_smartCalendar.p۱۳۳d.Ca;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Ch;
import com.lawyer_smartCalendar.utils.Ci;
import com.rey.material.widget.Button;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AddCityBankAccountActivity extends ActivityCe implements View.OnClickListener, View.OnFocusChangeListener {
    Button btn_add_account_number;
    public EditText input_account_number;
    public EditText input_select_city;
    public EditText input_select_type;

    /* renamed from: r  reason: contains not printable characters */
    private String f۱۴۰۵۳r = "";

    /* renamed from: s  reason: contains not printable characters */
    private String f۱۴۰۵۴s = "add";

    /* renamed from: t  reason: contains not printable characters */
    private DialogCe f۱۴۰۵۵t;
    Toolbar toolbar;

    /* renamed from: u  reason: contains not printable characters */
    private DialogCe f۱۴۰۵۶u;

    /* renamed from: v  reason: contains not printable characters */
    public String f۱۴۰۵۷v = "";

    /* renamed from: w  reason: contains not printable characters */
    public String f۱۴۰۵۸w = "";

    /* renamed from: x  reason: contains not printable characters */
    private Ci f۱۴۰۵۹x;

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(17432576, 17432577);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_add) {
            this.btn_add_account_number.callOnClick();
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
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        setTheme(Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        overridePendingTransition(17432576, 17432577);
        setContentView(R.layout.activity_add_city_bank_account);
        ButterKnife.m۱۶۵۸۶a(this);
        this.f۱۴۰۵۹x = new Ci(this);
        m۱۳۴۸۱a(this.toolbar);
        this.toolbar.setNavigationIcon(R.drawable.ic_action_close);
        this.toolbar.setNavigationOnClickListener(new View$OnClickListenerCa());
        this.input_select_city.setOnClickListener(this);
        this.input_select_type.setOnClickListener(this);
        this.input_select_city.setOnFocusChangeListener(this);
        this.input_select_type.setOnFocusChangeListener(this);
        this.btn_add_account_number.setOnClickListener(this);
        this.btn_add_account_number.setVisibility(8);
        this.f۱۴۰۵۳r = getIntent().getStringExtra("id");
        this.f۱۴۰۵۴s = getIntent().getStringExtra("frmMode");
        if (this.f۱۴۰۵۴s.equals("edit")) {
            this.f۱۴۰۵۹x.m۱۷۸۱۱n();
            Ca accountNumber = this.f۱۴۰۵۹x.m۱۷۷۹۸h(this.f۱۴۰۵۳r);
            Ci iVar = this.f۱۴۰۵۹x;
            String city_name = iVar.m۱۷۸۰۶l(accountNumber.m۱۷۵۹۸b() + "");
            Ci iVar2 = this.f۱۴۰۵۹x;
            String account_type = iVar2.m۱۷۸۰۰i(accountNumber.m۱۷۵۹۵a() + "");
            this.f۱۴۰۵۹x.close();
            m۱۳۴۸۹j().m۱۳۴۱۴a("ویرایش شماره حساب دادگستری");
            this.f۱۴۰۵۷v = accountNumber.m۱۷۵۹۸b() + "";
            this.f۱۴۰۵۸w = accountNumber.m۱۷۵۹۵a() + "";
            this.input_select_city.setText(city_name);
            this.input_select_type.setText(account_type);
            this.input_account_number.setText(accountNumber.m۱۷۶۰۲d());
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddCityBankAccountActivity$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View view) {
            AddCityBankAccountActivity.this.finish();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add_account_number /*{ENCODED_INT: 2131296337}*/:
                boolean hasError = false;
                if (this.f۱۴۰۵۷v.equals("")) {
                    this.input_select_city.setError(getResources().getString(R.string.errMessageCityBankAccount_city));
                    hasError = true;
                }
                if (this.f۱۴۰۵۸w.equals("")) {
                    this.input_select_type.setError(getResources().getString(R.string.errMessageCityBankAccount_accountType));
                    hasError = true;
                }
                if (this.input_account_number.getText().toString().equals("")) {
                    this.input_account_number.setError(getResources().getString(R.string.errMessageCityBankAccount_number));
                    hasError = true;
                }
                if (!hasError) {
                    Ca accountNumber = new Ca();
                    accountNumber.m۱۷۵۹۹b(Integer.parseInt(this.f۱۴۰۵۷v));
                    accountNumber.m۱۷۵۹۶a(Integer.parseInt(this.f۱۴۰۵۸w));
                    accountNumber.m۱۷۵۹۷a(this.input_account_number.getText().toString());
                    this.f۱۴۰۵۹x.m۱۷۸۱۱n();
                    if (this.f۱۴۰۵۴s.equals("edit")) {
                        this.f۱۴۰۵۹x.m۱۷۷۶۶a(accountNumber, this.f۱۴۰۵۳r);
                        new Ch().m۱۷۷۵۳a(this, "success", getResources().getString(R.string.successCityBankAccount_edit));
                    } else {
                        this.f۱۴۰۵۹x.m۱۷۷۶۵a(accountNumber);
                        new Ch().m۱۷۷۵۳a(this, "success", getResources().getString(R.string.successCityBankAccount_insert));
                    }
                    this.f۱۴۰۵۹x.close();
                    setResult(-1);
                    finish();
                    return;
                }
                return;
            case R.id.input_select_city /*{ENCODED_INT: 2131296547}*/:
                View viewType2 = getLayoutInflater().inflate(R.layout.bottom_sheet_acount_number_type, (ViewGroup) null);
                RecyclerView mRecyclerView2 = (RecyclerView) viewType2.findViewById(R.id.recycler_view_type);
                mRecyclerView2.setLayoutManager(new LinearLayoutManager(this));
                Ci db2 = new Ci(this);
                db2.m۱۷۸۱۱n();
                String[][] typeList2 = db2.m۱۷۷۹۷g();
                db2.close();
                mRecyclerView2.setAdapter(new Cj(this, "AddCityBankAccountActivity", typeList2));
                this.f۱۴۰۵۶u = new DialogCe(this);
                this.f۱۴۰۵۶u.setContentView(viewType2);
                this.f۱۴۰۵۶u.show();
                return;
            case R.id.input_select_type /*{ENCODED_INT: 2131296548}*/:
                View viewType = getLayoutInflater().inflate(R.layout.bottom_sheet_acount_number_type, (ViewGroup) null);
                RecyclerView mRecyclerView = (RecyclerView) viewType.findViewById(R.id.recycler_view_type);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                this.f۱۴۰۵۹x.m۱۷۸۱۱n();
                String[][] typeList = this.f۱۴۰۵۹x.m۱۷۷۹۳e();
                this.f۱۴۰۵۹x.close();
                mRecyclerView.setAdapter(new Cb(this, typeList));
                this.f۱۴۰۵۵t = new DialogCe(this);
                this.f۱۴۰۵۵t.setContentView(viewType);
                this.f۱۴۰۵۵t.show();
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۳۱۲a(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 3053931(0x2e996b, float:4.279469E-39)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 3575610(0x368f3a, float:5.010497E-39)
            if (r0 == r1) goto L_0x0010
        L_0x000f:
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "type"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 0
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "city"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = -1
        L_0x0025:
            if (r0 == 0) goto L_0x0030
            if (r0 == r2) goto L_0x002a
            goto L_0x0035
        L_0x002a:
            android.support.design.widget.e r0 = r3.f۱۴۰۵۶u
            r0.dismiss()
            goto L_0x0035
        L_0x0030:
            android.support.design.widget.e r0 = r3.f۱۴۰۵۵t
            r0.dismiss()
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.AddCityBankAccountActivity.m۱۷۳۱۲a(java.lang.String):void");
    }

    public void onFocusChange(View view, boolean focused) {
        switch (view.getId()) {
            case R.id.input_select_city /*{ENCODED_INT: 2131296547}*/:
                if (focused) {
                    this.input_select_city.setError(null);
                    this.input_select_city.callOnClick();
                    return;
                }
                return;
            case R.id.input_select_type /*{ENCODED_INT: 2131296548}*/:
                if (focused) {
                    this.input_select_type.setError(null);
                    this.input_select_type.callOnClick();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
