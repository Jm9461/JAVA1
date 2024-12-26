package com.lawyer_smartCalendar.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.DialogCe;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.LinearLayoutManager;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.model.Case;
import com.lawyer_smartCalendar.model.Client;
import com.lawyer_smartCalendar.p۱۳۰a.Cr;
import com.lawyer_smartCalendar.p۱۳۰a.Cs;
import com.lawyer_smartCalendar.p۱۳۰a.Ct;
import com.lawyer_smartCalendar.p۱۳۱b.Ca;
import com.lawyer_smartCalendar.p۱۳۳d.Ch;
import com.lawyer_smartCalendar.utils.Ci;
import com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb;
import com.rey.material.widget.Button;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AddPaymentActivity extends ActivityCe implements View.OnClickListener, View.OnFocusChangeListener, DialogFragmentCb.AbstractCd {

    /* renamed from: A  reason: contains not printable characters */
    private Ci f۱۴۱۵۶A;

    /* renamed from: B  reason: contains not printable characters */
    public int f۱۴۱۵۷B = -1;

    /* renamed from: C  reason: contains not printable characters */
    public int f۱۴۱۵۸C = -1;

    /* renamed from: D  reason: contains not printable characters */
    private DialogCe f۱۴۱۵۹D;

    /* renamed from: E  reason: contains not printable characters */
    private DialogCe f۱۴۱۶۰E;

    /* renamed from: F  reason: contains not printable characters */
    private EditText f۱۴۱۶۱F;

    /* renamed from: G  reason: contains not printable characters */
    private EditText f۱۴۱۶۲G;

    /* renamed from: H  reason: contains not printable characters */
    private EditText f۱۴۱۶۳H;

    /* renamed from: I  reason: contains not printable characters */
    private EnumCe f۱۴۱۶۴I = EnumCe.END;
    public Button btn_add_honorarium;
    public Button btn_add_installment;
    public EditText input_case;
    public EditText input_client_name;
    public EditText input_date;
    public EditText input_detail;
    public EditText input_honorariumTotal;
    public EditText input_pay_type;
    public ScrollView layout_ScrollView;

    /* renamed from: r  reason: contains not printable characters */
    private Ct f۱۴۱۶۵r;
    public RecyclerView recyclerView;

    /* renamed from: s  reason: contains not printable characters */
    private Cb f۱۴۱۶۶s;

    /* renamed from: t  reason: contains not printable characters */
    private DialogFragmentCb f۱۴۱۶۷t;

    /* renamed from: u  reason: contains not printable characters */
    private String f۱۴۱۶۸u = "";

    /* renamed from: v  reason: contains not printable characters */
    private String f۱۴۱۶۹v = "";

    /* renamed from: w  reason: contains not printable characters */
    private String f۱۴۱۷۰w = "";

    /* renamed from: x  reason: contains not printable characters */
    List<Ch> f۱۴۱۷۱x = new ArrayList();

    /* renamed from: y  reason: contains not printable characters */
    private String f۱۴۱۷۲y = "";

    /* renamed from: z  reason: contains not printable characters */
    private String f۱۴۱۷۳z = "add";

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

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_add) {
            this.btn_add_honorarium.callOnClick();
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_add_edit, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        char c;
        char c2;
        setTheme(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        overridePendingTransition(17432576, 17432577);
        setContentView(R.layout.activity_add_payment);
        ButterKnife.m۱۶۵۸۶a(this);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۱۴۱۶۴I = EnumCe.END;
        } else {
            this.f۱۴۱۶۴I = EnumCe.START;
        }
        this.f۱۴۱۵۶A = new Ci(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_white_24dp);
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCb());
        this.btn_add_honorarium.setOnClickListener(this);
        this.btn_add_honorarium.setVisibility(8);
        this.input_date.setOnClickListener(this);
        this.input_date.setOnFocusChangeListener(this);
        this.input_client_name.setOnClickListener(this);
        this.input_client_name.setOnFocusChangeListener(this);
        this.input_case.setOnClickListener(this);
        this.input_case.setOnFocusChangeListener(this);
        this.input_pay_type.setOnClickListener(this);
        this.input_pay_type.setOnFocusChangeListener(this);
        this.btn_add_installment.setOnClickListener(this);
        this.btn_add_installment.setVisibility(8);
        if (savedInstanceState != null) {
            this.f۱۴۱۷۱x = (ArrayList) savedInstanceState.getSerializable("payment_list");
        }
        this.f۱۴۱۶۵r = new Ct(this, this.f۱۴۱۷۱x);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.m۱۴۲۱۵j(1);
        this.recyclerView.setLayoutManager(layoutManager);
        this.recyclerView.setAdapter(this.f۱۴۱۶۵r);
        Cb inputDate = new Cb();
        this.input_date.setText(inputDate.m۱۸۰۰۸c());
        this.input_date.setTextColor(Color.parseColor("#E65100"));
        this.f۱۴۱۶۸u = inputDate.getTimeInMillis() + "";
        this.f۱۴۱۷۲y = getIntent().getStringExtra("id");
        this.f۱۴۱۷۳z = getIntent().getStringExtra("frmMode");
        if (this.f۱۴۱۷۳z.equals("edit")) {
            this.f۱۴۱۵۶A.m۱۷۸۱۱n();
            com.lawyer_smartCalendar.p۱۳۳d.Cg payment = this.f۱۴۱۵۶A.m۱۷۸۲۰w(this.f۱۴۱۷۲y);
            com.lawyer_smartCalendar.p۱۳۳d.Cb case1 = this.f۱۴۱۵۶A.m۱۷۸۰۴k(payment.m۱۷۶۹۱b() + "");
            com.lawyer_smartCalendar.p۱۳۳d.Cc client = this.f۱۴۱۵۶A.m۱۷۸۱۲o(case1.m۱۷۶۱۸g() + "");
            this.f۱۴۱۷۱x = this.f۱۴۱۵۶A.m۱۷۸۲۱x(payment.m۱۷۶۹۸e() + "");
            this.f۱۴۱۵۶A.close();
            m۱۳۴۸۹j().m۱۳۴۱۴a("ویرایش حق الوکاله");
            this.f۱۴۱۶۵r = new Ct(this, this.f۱۴۱۷۱x);
            layoutManager.m۱۴۲۱۵j(1);
            this.recyclerView.setLayoutManager(layoutManager);
            this.recyclerView.setAdapter(this.f۱۴۱۶۵r);
            this.input_client_name.setText(client.m۱۷۶۴۴f());
            this.f۱۴۱۵۷B = case1.m۱۷۶۱۸g();
            this.input_client_name.setEnabled(false);
            String title = "";
            String o = case1.m۱۷۶۳۲o();
            switch (o.hashCode()) {
                case -1955878649:
                    if (o.equals("Normal")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -888366013:
                    if (o.equals("Challenge")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 2062940:
                    if (o.equals("Bank")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 912993224:
                    if (o.equals("Executive")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                title = "عادی";
            } else if (c == 1) {
                title = "اجرایی";
            } else if (c == 2) {
                title = "معاضدتی/تسخیری";
            } else if (c == 3) {
                title = "بانکی";
            }
            EditText editText = this.input_case;
            editText.setText(title + " - " + ("تاریخ: " + Ca.m۱۷۴۸۱a(Long.valueOf(Long.parseLong(case1.m۱۷۶۲۴j())))));
            this.input_case.setTextColor(Color.parseColor("#E65100"));
            this.f۱۴۱۵۸C = payment.m۱۷۶۹۱b();
            this.input_case.setEnabled(false);
            this.f۱۴۱۷۰w = payment.m۱۷۷۰۱g();
            String pay_type_fa = "";
            String g = payment.m۱۷۷۰۱g();
            switch (g.hashCode()) {
                case 3046195:
                    if (g.equals("cash")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 672998251:
                    if (g.equals("cardToCart")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1403045980:
                    if (g.equals("bankReceipt")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2144269689:
                    if (g.equals("installment")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                pay_type_fa = "نقدی";
                this.btn_add_installment.setVisibility(8);
            } else if (c2 == 1) {
                pay_type_fa = "فیش بانکی";
            } else if (c2 == 2) {
                pay_type_fa = "کارت به کارت";
                this.btn_add_installment.setVisibility(8);
            } else if (c2 == 3) {
                pay_type_fa = "اقساطی";
                this.btn_add_installment.setVisibility(0);
            }
            this.input_pay_type.setText(pay_type_fa);
            this.input_honorariumTotal.setText(payment.m۱۷۶۸۸a());
            this.input_detail.setText(payment.m۱۷۶۹۶d());
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddPaymentActivity$b  reason: invalid class name */
    class View$OnClickListenerCb implements View.OnClickListener {
        View$OnClickListenerCb() {
        }

        public void onClick(View view) {
            AddPaymentActivity.this.finish();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add_honorarium /*{ENCODED_INT: 2131296343}*/:
                boolean hasError = false;
                if (this.f۱۴۱۶۸u.equals("")) {
                    this.input_date.setError("تاریخ پرداخت را مشخص کنید.");
                    hasError = true;
                }
                if (this.f۱۴۱۵۷B == -1) {
                    this.input_client_name.setError("موکل را انتخاب کنید.");
                    hasError = true;
                }
                if (this.f۱۴۱۵۸C == -1) {
                    this.input_case.setError("پرونده را انتخاب کنید.");
                    hasError = true;
                }
                if (this.f۱۴۱۷۰w.equals("")) {
                    this.input_pay_type.setError("نوع پرداخت را مشخص کنید.");
                    hasError = true;
                }
                if (this.f۱۴۱۷۰w.equals("installment") && this.f۱۴۱۷۱x.size() == 0) {
                    new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(this, "error", "لطفا اقساط را مشخص کنید.");
                    hasError = true;
                }
                if (this.input_honorariumTotal.getText().toString().equals("")) {
                    this.input_honorariumTotal.setError("مبلغ حق الوکاله را وارد کنید.");
                    hasError = true;
                }
                if (this.f۱۴۱۷۳z.equals("add")) {
                    this.f۱۴۱۵۶A.m۱۷۸۱۱n();
                    Ci iVar = this.f۱۴۱۵۶A;
                    boolean check = iVar.m۱۷۷۸۰a(this.f۱۴۱۵۸C + "");
                    this.f۱۴۱۵۶A.close();
                    if (check) {
                        new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(this, "error", "برای این پرونده حق الوکاله ثبت شده است.");
                        hasError = true;
                    }
                }
                if (!hasError) {
                    com.lawyer_smartCalendar.p۱۳۳d.Cg payment = new com.lawyer_smartCalendar.p۱۳۳d.Cg();
                    payment.m۱۷۶۸۹a(this.f۱۴۱۵۸C);
                    payment.m۱۷۶۹۳b(this.f۱۴۱۶۸u);
                    payment.m۱۷۶۹۵c(this.input_detail.getText().toString());
                    payment.m۱۷۶۹۰a(this.input_honorariumTotal.getText().toString());
                    payment.m۱۷۶۹۹e(this.f۱۴۱۷۰w);
                    payment.m۱۷۶۹۷d("honorarium");
                    this.f۱۴۱۵۶A.m۱۷۸۱۱n();
                    if (this.f۱۴۱۷۳z.equals("edit")) {
                        this.f۱۴۱۵۶A.m۱۷۷۷۲a(payment, this.f۱۴۱۷۲y);
                        if (this.f۱۴۱۷۰w.equals("installment") && this.f۱۴۱۷۱x.size() > 0) {
                            this.f۱۴۱۵۶A.m۱۷۷۸۶b(this.f۱۴۱۷۱x, this.f۱۴۱۷۲y);
                        }
                        new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(this, "success", "حق الوکاله با موفقیت ویرایش شد.");
                    } else {
                        long pay_id = this.f۱۴۱۵۶A.m۱۷۷۶۰a(payment);
                        if (this.f۱۴۱۷۰w.equals("installment") && this.f۱۴۱۷۱x.size() > 0) {
                            Ci iVar2 = this.f۱۴۱۵۶A;
                            List<Ch> list = this.f۱۴۱۷۱x;
                            iVar2.m۱۷۷۷۸a(list, pay_id + "");
                        }
                        new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(this, "success", "حق الوکاله با موفقیت ثبت شد.");
                    }
                    this.f۱۴۱۵۶A.close();
                    setResult(-1);
                    finish();
                    return;
                }
                return;
            case R.id.btn_add_installment /*{ENCODED_INT: 2131296345}*/:
                View v = getLayoutInflater().inflate(R.layout.dialog_add_installment, (ViewGroup) null);
                this.f۱۴۱۶۱F = (EditText) v.findViewById(R.id.input_installment_date);
                TextView textView_cancel = (TextView) v.findViewById(R.id.textView_cancel);
                TextView textView_insert = (TextView) v.findViewById(R.id.textView_insert);
                textView_insert.setTextColor(Color.parseColor(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۴۱d()));
                textView_cancel.setTextColor(Color.parseColor("#757575"));
                this.f۱۴۱۶۲G = (EditText) v.findViewById(R.id.input_installment_total);
                this.f۱۴۱۶۲G.setOnClickListener(this);
                this.f۱۴۱۶۲G.setOnFocusChangeListener(this);
                this.f۱۴۱۶۳H = (EditText) v.findViewById(R.id.input_installment_number);
                this.f۱۴۱۶۳H.setOnClickListener(this);
                this.f۱۴۱۶۳H.setOnFocusChangeListener(this);
                this.f۱۴۱۶۱F.setOnClickListener(new View$OnClickListenerCh());
                this.f۱۴۱۶۱F.setOnFocusChangeListener(new View$OnFocusChangeListenerCi());
                View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(this);
                dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar.m۱۵۸۶۸d(this.f۱۴۱۶۴I);
                dVar.m۱۵۸۵۸b(this.f۱۴۱۶۴I);
                dVar.m۱۵۸۶۳c(this.f۱۴۱۶۴I);
                dVar.m۱۵۸۷۶j(R.color.colorPrimary);
                dVar.m۱۵۸۵۸b(this.f۱۴۱۶۴I);
                dVar.m۱۵۸۴۶a(v, true);
                dVar.m۱۵۸۷۱e("افزودن قسط");
                Dialog di = dVar.m۱۵۸۶۶c();
                textView_insert.setOnClickListener(new View$OnClickListenerCj(di));
                textView_cancel.setOnClickListener(new View$OnClickListenerCa(this, di));
                return;
            case R.id.input_case /*{ENCODED_INT: 2131296493}*/:
                if (this.f۱۴۱۵۷B == -1) {
                    new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(this, "error", "ابتدا یک موکل انتخاب کنید.");
                    return;
                }
                this.input_case.setError(null);
                View viewCase = getLayoutInflater().inflate(R.layout.bottom_sheet_select_case, (ViewGroup) null);
                RecyclerView mRecyclerView_case = (RecyclerView) viewCase.findViewById(R.id.recyclerView_case);
                mRecyclerView_case.setLayoutManager(new LinearLayoutManager(this));
                this.f۱۴۱۵۶A.m۱۷۸۱۱n();
                List<Case> caseList = this.f۱۴۱۵۶A.m۱۷۷۶۲a(this.f۱۴۱۵۷B);
                this.f۱۴۱۵۶A.close();
                if (caseList.size() > 0) {
                    mRecyclerView_case.setAdapter(new Cr(this, "AddPaymentActivity", caseList));
                    this.f۱۴۱۶۰E = new DialogCe(this);
                    this.f۱۴۱۶۰E.setContentView(viewCase);
                    this.f۱۴۱۶۰E.show();
                    return;
                }
                View$OnClickListenerCf.Cd dVar2 = new View$OnClickListenerCf.Cd(this);
                dVar2.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar2.m۱۵۸۵۸b(EnumCe.CENTER);
                dVar2.m۱۵۸۴۷a(EnumCe.END);
                dVar2.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar2.m۱۵۸۷۲f(R.color.dialogCancelColor);
                dVar2.m۱۵۸۵۶b(R.color.colorPrimaryDark);
                dVar2.m۱۵۸۵۰a("هیچ پرونده ای برای این موکل ثبت نشده است.برای انجام این عملیات یک پرونده ثبت کنید.");
                dVar2.m۱۵۸۶۹d("فعلا نه");
                dVar2.m۱۵۸۶۰b("ثبت پرونده");
                dVar2.m۱۵۸۶۴c(new Cf(this));
                dVar2.m۱۵۸۴۸a(new Ce());
                dVar2.m۱۵۸۶۶c();
                return;
            case R.id.input_client_name /*{ENCODED_INT: 2131296504}*/:
                this.input_client_name.setError(null);
                View viewClient = getLayoutInflater().inflate(R.layout.bottom_sheet_select_clinet, (ViewGroup) null);
                RecyclerView mRecyclerView_client = (RecyclerView) viewClient.findViewById(R.id.recyclerView_client);
                mRecyclerView_client.setLayoutManager(new LinearLayoutManager(this));
                this.f۱۴۱۵۶A.m۱۷۸۱۱n();
                List<Client> clientList = this.f۱۴۱۵۶A.m۱۷۸۰۱i();
                this.f۱۴۱۵۶A.close();
                if (clientList.size() > 0) {
                    mRecyclerView_client.setAdapter(new Cs(this, "AddPaymentActivity", clientList));
                    this.f۱۴۱۵۹D = new DialogCe(this);
                    this.f۱۴۱۵۹D.setContentView(viewClient);
                    this.f۱۴۱۵۹D.show();
                    return;
                }
                View$OnClickListenerCf.Cd dVar3 = new View$OnClickListenerCf.Cd(this);
                dVar3.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar3.m۱۵۸۵۸b(EnumCe.CENTER);
                dVar3.m۱۵۸۴۷a(EnumCe.END);
                dVar3.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar3.m۱۵۸۵۰a("هیچ موکلی ثبت نشده است.برای انجام این عملیات یک موکل ثبت کنید.");
                dVar3.m۱۵۸۷۲f(R.color.dialogCancelColor);
                dVar3.m۱۵۸۵۶b(R.color.colorPrimaryDark);
                dVar3.m۱۵۸۶۹d("فعلا نه");
                dVar3.m۱۵۸۶۰b("ثبت موکل");
                dVar3.m۱۵۸۶۴c(new Cd(this));
                dVar3.m۱۵۸۴۸a(new Cc());
                dVar3.m۱۵۸۶۶c();
                return;
            case R.id.input_date /*{ENCODED_INT: 2131296512}*/:
                this.input_date.setError(null);
                this.f۱۴۱۶۶s = new Cb();
                this.f۱۴۱۶۷t = DialogFragmentCb.m۱۷۹۱۲b(this, this.f۱۴۱۶۶s.m۱۸۰۱۳h(), this.f۱۴۱۶۶s.m۱۸۰۰۹d(), this.f۱۴۱۶۶s.m۱۸۰۰۷b());
                this.f۱۴۱۶۷t.show(getFragmentManager(), "input_date_Honorarium");
                return;
            case R.id.input_pay_type /*{ENCODED_INT: 2131296543}*/:
                this.input_pay_type.setError(null);
                View$OnClickListenerCf.Cd dVar4 = new View$OnClickListenerCf.Cd(this);
                dVar4.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar4.m۱۵۸۶۸d(this.f۱۴۱۶۴I);
                dVar4.m۱۵۸۵۸b(this.f۱۴۱۶۴I);
                dVar4.m۱۵۸۶۳c(this.f۱۴۱۶۴I);
                dVar4.m۱۵۸۷۶j(R.color.colorPrimary);
                dVar4.m۱۵۸۵۸b(this.f۱۴۱۶۴I);
                dVar4.m۱۵۸۷۱e("نوع پرداخت");
                dVar4.m۱۵۸۴۱a(R.array.pay_type_items);
                dVar4.m۱۵۸۴۲a(-1, new Cg());
                dVar4.m۱۵۸۶۶c();
                return;
            default:
                return;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddPaymentActivity$d  reason: invalid class name */
    class Cd implements View$OnClickListenerCf.AbstractCm {
        Cd(AddPaymentActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۸۶a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddPaymentActivity$c  reason: invalid class name */
    class Cc implements View$OnClickListenerCf.AbstractCm {
        Cc() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۸۵a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
            Intent frm_add_client = new Intent(AddPaymentActivity.this, AddClientActivity.class);
            frm_add_client.putExtra("frmMode", "add");
            AddPaymentActivity.this.startActivity(frm_add_client);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddPaymentActivity$f  reason: invalid class name */
    class Cf implements View$OnClickListenerCf.AbstractCm {
        Cf(AddPaymentActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۸۸a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddPaymentActivity$e  reason: invalid class name */
    class Ce implements View$OnClickListenerCf.AbstractCm {
        Ce() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۸۷a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
            Intent frm_add_case = new Intent(AddPaymentActivity.this, AddCaseActivity.class);
            frm_add_case.putExtra("frmMode", "add");
            AddPaymentActivity.this.startActivity(frm_add_case);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddPaymentActivity$g  reason: invalid class name */
    class Cg implements View$OnClickListenerCf.AbstractCj {
        Cg() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۳۸۹a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
            AddPaymentActivity.this.input_pay_type.setText(text);
            if (which == 0) {
                AddPaymentActivity.this.f۱۴۱۷۰w = "cash";
                AddPaymentActivity.this.btn_add_installment.setVisibility(8);
                AddPaymentActivity.this.f۱۴۱۷۱x.clear();
                AddPaymentActivity.this.f۱۴۱۶۵r.m۱۴۴۵۰d();
            } else if (which == 1) {
                AddPaymentActivity.this.f۱۴۱۷۰w = "bankReceipt";
                AddPaymentActivity.this.f۱۴۱۷۱x.clear();
                AddPaymentActivity.this.f۱۴۱۶۵r.m۱۴۴۵۰d();
                AddPaymentActivity.this.btn_add_installment.setVisibility(8);
            } else if (which == 2) {
                AddPaymentActivity.this.f۱۴۱۷۰w = "cardToCart";
                AddPaymentActivity.this.f۱۴۱۷۱x.clear();
                AddPaymentActivity.this.f۱۴۱۶۵r.m۱۴۴۵۰d();
                AddPaymentActivity.this.btn_add_installment.setVisibility(8);
            } else if (which == 3) {
                AddPaymentActivity.this.f۱۴۱۷۰w = "installment";
                AddPaymentActivity.this.btn_add_installment.setVisibility(0);
            }
            return true;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddPaymentActivity$h  reason: invalid class name */
    class View$OnClickListenerCh implements View.OnClickListener {
        View$OnClickListenerCh() {
        }

        public void onClick(View view) {
            AddPaymentActivity.this.f۱۴۱۶۶s = new Cb();
            AddPaymentActivity addPaymentActivity = AddPaymentActivity.this;
            addPaymentActivity.f۱۴۱۶۷t = DialogFragmentCb.m۱۷۹۱۲b(addPaymentActivity, addPaymentActivity.f۱۴۱۶۶s.m۱۸۰۱۳h(), AddPaymentActivity.this.f۱۴۱۶۶s.m۱۸۰۰۹d(), AddPaymentActivity.this.f۱۴۱۶۶s.m۱۸۰۰۷b());
            AddPaymentActivity.this.f۱۴۱۶۷t.show(AddPaymentActivity.this.getFragmentManager(), "input_date_installment");
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddPaymentActivity$i  reason: invalid class name */
    class View$OnFocusChangeListenerCi implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerCi() {
        }

        public void onFocusChange(View view, boolean focused) {
            if (focused) {
                AddPaymentActivity.this.f۱۴۱۶۱F.callOnClick();
            }
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddPaymentActivity$j  reason: invalid class name */
    class View$OnClickListenerCj implements View.OnClickListener {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ Dialog f۱۴۱۸۱c;

        View$OnClickListenerCj(Dialog dialog) {
            this.f۱۴۱۸۱c = dialog;
        }

        public void onClick(View view) {
            if (AddPaymentActivity.this.f۱۴۱۶۹v.equals("")) {
                new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(AddPaymentActivity.this, "error", "تاریخ قسط را مشخص کنید.");
            } else if (AddPaymentActivity.this.f۱۴۱۶۲G.getText().toString().equals("")) {
                new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(AddPaymentActivity.this, "error", "مبلغ قسط را مشخص کنید.");
            } else {
                Ch paymentDetail = new Ch();
                paymentDetail.m۱۷۷۰۷b(AddPaymentActivity.this.f۱۴۱۶۹v);
                paymentDetail.m۱۷۷۰۵a(AddPaymentActivity.this.f۱۴۱۶۲G.getText().toString());
                paymentDetail.m۱۷۷۰۹c(AddPaymentActivity.this.f۱۴۱۶۳H.getText().toString());
                AddPaymentActivity.this.f۱۴۱۷۱x.add(paymentDetail);
                new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(AddPaymentActivity.this, "success", "قسط با موفقیت اضافه شد.");
                AddPaymentActivity.this.f۱۴۱۶۵r.m۱۴۴۵۰d();
                this.f۱۴۱۸۱c.dismiss();
            }
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddPaymentActivity$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ Dialog f۱۴۱۷۴c;

        View$OnClickListenerCa(AddPaymentActivity this$0, Dialog dialog) {
            this.f۱۴۱۷۴c = dialog;
        }

        public void onClick(View view) {
            this.f۱۴۱۷۴c.dismiss();
        }
    }

    public void onFocusChange(View view, boolean Focused) {
        switch (view.getId()) {
            case R.id.input_case /*{ENCODED_INT: 2131296493}*/:
                if (Focused) {
                    this.input_case.callOnClick();
                    return;
                }
                return;
            case R.id.input_client_name /*{ENCODED_INT: 2131296504}*/:
                if (Focused) {
                    this.input_client_name.callOnClick();
                    return;
                }
                return;
            case R.id.input_date /*{ENCODED_INT: 2131296512}*/:
                if (Focused) {
                    this.input_date.callOnClick();
                    return;
                }
                return;
            case R.id.input_pay_type /*{ENCODED_INT: 2131296543}*/:
                if (Focused) {
                    this.input_pay_type.callOnClick();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    public void m۱۷۳۸۳m() {
        this.f۱۴۱۵۹D.dismiss();
    }

    /* renamed from: n  reason: contains not printable characters */
    public void m۱۷۳۸۴n() {
        this.f۱۴۱۶۰E.dismiss();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۳۸۲a(com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb r6, int r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.AddPaymentActivity.m۱۷۳۸۲a(com.mohamadamin.persianmaterialdatetimepicker.date.b, int, int, int):void");
    }
}
