package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.DialogCe;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.LinearLayoutManager;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.model.Client;
import com.lawyer_smartCalendar.p۱۳۰a.Cs;
import com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb;
import com.rey.material.widget.Button;
import java.util.List;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AddCaseActivity extends ActivityCe implements View.OnClickListener, View.OnFocusChangeListener, DialogFragmentCb.AbstractCd {

    /* renamed from: A  reason: contains not printable characters */
    private String f۱۴۰۲۹A = "";

    /* renamed from: B  reason: contains not printable characters */
    private String f۱۴۰۳۰B = "";

    /* renamed from: C  reason: contains not printable characters */
    private String f۱۴۰۳۱C = "";

    /* renamed from: D  reason: contains not printable characters */
    private String f۱۴۰۳۲D = "";

    /* renamed from: E  reason: contains not printable characters */
    private String f۱۴۰۳۳E = "";

    /* renamed from: F  reason: contains not printable characters */
    public String f۱۴۰۳۴F = "";

    /* renamed from: G  reason: contains not printable characters */
    private EnumCe f۱۴۰۳۵G = EnumCe.END;
    public Button btn_add_case;
    public EditText input_archive_number;
    public EditText input_attorney_letter_number;
    public EditText input_case_date;
    public EditText input_case_issue;
    public EditText input_case_number;
    public EditText input_case_process;
    public EditText input_case_status;
    public EditText input_case_title;
    public EditText input_client_name;
    public EditText input_client_title_type;
    public EditText input_court_branch;
    public EditText input_court_city;
    public EditText input_court_type;
    public EditText input_lawsuit_info;

    /* renamed from: r  reason: contains not printable characters */
    private String f۱۴۰۳۶r = "";

    /* renamed from: s  reason: contains not printable characters */
    private String f۱۴۰۳۷s = "add";

    /* renamed from: t  reason: contains not printable characters */
    private DialogCe f۱۴۰۳۸t;

    /* renamed from: u  reason: contains not printable characters */
    private Cb f۱۴۰۳۹u;

    /* renamed from: v  reason: contains not printable characters */
    private DialogFragmentCb f۱۴۰۴۰v;

    /* renamed from: w  reason: contains not printable characters */
    private com.lawyer_smartCalendar.utils.Ci f۱۴۰۴۱w;

    /* renamed from: x  reason: contains not printable characters */
    private DialogCe f۱۴۰۴۲x;

    /* renamed from: y  reason: contains not printable characters */
    public int f۱۴۰۴۳y = -1;

    /* renamed from: z  reason: contains not printable characters */
    private String f۱۴۰۴۴z = "";

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
            this.btn_add_case.callOnClick();
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_add_edit, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02f9  */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
        // Method dump skipped, instructions count: 1262
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.AddCaseActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddCaseActivity$b  reason: invalid class name */
    class View$OnClickListenerCb implements View.OnClickListener {
        View$OnClickListenerCb() {
        }

        public void onClick(View view) {
            AddCaseActivity.this.finish();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add_case /*{ENCODED_INT: 2131296340}*/:
                this.f۱۴۰۴۱w.m۱۷۸۱۱n();
                int case_count = this.f۱۴۰۴۱w.m۱۷۷۹۴f().size();
                this.f۱۴۰۴۱w.close();
                if (case_count != 200 || p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("app_version", "limited").equals("full")) {
                    boolean hasError = false;
                    if (this.f۱۴۰۳۱C.equals("")) {
                        this.input_case_title.setError("عنوان پرونده را انتخاب کنید.");
                        hasError = true;
                    }
                    if (this.f۱۴۰۳۳E.equals("")) {
                        this.input_case_date.setError("تاریخ تشکیل پرونده را انتخاب کنید.");
                        hasError = true;
                    }
                    if (this.f۱۴۰۴۳y == -1) {
                        this.input_client_name.setError("یک موکل انتخاب کنید.");
                        hasError = true;
                    }
                    if (this.f۱۴۰۳۲D.equals("")) {
                        this.input_client_title_type.setError("سمت موکل را انتخاب کنید.");
                        hasError = true;
                    }
                    if (this.input_case_issue.getText().toString().equals("")) {
                        this.input_case_issue.setError("موضوع پرونده را انتخاب کنید.");
                        hasError = true;
                    }
                    if (this.f۱۴۰۲۹A.equals("")) {
                        this.input_case_status.setError("وضعیت پرونده را انتخاب کنید.");
                        hasError = true;
                    }
                    if (this.f۱۴۰۴۴z.equals("")) {
                        this.input_case_process.setError("روند پرونده را انتخاب کنید.");
                        hasError = true;
                    }
                    if (this.f۱۴۰۳۰B.equals("")) {
                        this.input_court_type.setError("درجه و نوع دادگاه را انتخاب کنید.");
                        hasError = true;
                    }
                    if (this.input_archive_number.getText().toString().equals("")) {
                        this.input_archive_number.setError("شماره بایگانی را انتخاب کنید.");
                        hasError = true;
                    }
                    if (this.f۱۴۰۳۴F.equals("")) {
                        this.input_court_city.setError("دادگستری شهرستان را انتخاب کنید.");
                        hasError = true;
                    }
                    if (this.input_court_branch.getText().toString().equals("")) {
                        this.input_court_branch.setError("شعبه دادگاه را انتخاب کنید.");
                        hasError = true;
                    }
                    if (!hasError) {
                        com.lawyer_smartCalendar.p۱۳۳d.Cb case1 = new com.lawyer_smartCalendar.p۱۳۳d.Cb();
                        case1.m۱۷۶۰۴a(this.f۱۴۰۴۳y);
                        case1.m۱۷۶۲۹l(this.f۱۴۰۳۱C);
                        case1.m۱۷۶۲۱h(this.f۱۴۰۳۳E);
                        case1.m۱۷۶۱۷f(this.f۱۴۰۳۲D);
                        case1.m۱۷۶۲۷k(this.input_case_issue.getText().toString());
                        case1.m۱۷۶۱۹g(this.f۱۴۰۳۰B);
                        case1.m۱۷۶۰۷b(Integer.parseInt(this.f۱۴۰۳۴F));
                        case1.m۱۷۶۱۱c(this.input_court_branch.getText().toString());
                        case1.m۱۷۶۱۳d(this.input_case_number.getText().toString());
                        case1.m۱۷۶۰۵a(this.input_archive_number.getText().toString());
                        case1.m۱۷۶۰۸b(this.input_attorney_letter_number.getText().toString());
                        case1.m۱۷۶۲۳i(this.input_lawsuit_info.getText().toString());
                        case1.m۱۷۶۲۵j(this.f۱۴۰۴۴z);
                        case1.m۱۷۶۱۵e(this.f۱۴۰۲۹A);
                        this.f۱۴۰۴۱w.m۱۷۸۱۱n();
                        if (this.f۱۴۰۳۷s.equals("edit")) {
                            this.f۱۴۰۴۱w.m۱۷۷۶۸a(case1, this.f۱۴۰۳۶r);
                            new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(this, "success", getResources().getString(R.string.successCase_edit));
                        } else {
                            this.f۱۴۰۴۱w.m۱۷۷۶۷a(case1);
                            new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(this, "success", getResources().getString(R.string.successCase_insert));
                        }
                        this.f۱۴۰۴۱w.close();
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
                dVar.m۱۵۸۴۷a(this.f۱۴۰۳۵G);
                dVar.m۱۵۸۷۵i(Color.parseColor(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۴۱d()));
                dVar.m۱۵۸۷۱e("");
                dVar.m۱۵۸۷۲f(R.color.dialogCancelColor);
                dVar.m۱۵۸۶۷d(Color.parseColor(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۴۱d()));
                dVar.m۱۵۸۵۰a("سالنامه هوشمند کانون وکلای آذربایجان شرقی");
                dVar.m۱۵۸۶۹d("فعلا نه");
                dVar.m۱۵۸۶۵c("سالنامه هوشمند کانون وکلای آذربایجان شرقی");
                dVar.m۱۵۸۶۴c(new Cd(this));
                dVar.m۱۵۸۵۹b(new Cc());
                dVar.m۱۵۸۶۶c();
                return;
            case R.id.input_case_date /*{ENCODED_INT: 2131296494}*/:
                this.input_case_date.setError(null);
                this.f۱۴۰۳۹u = new Cb();
                this.f۱۴۰۴۰v = DialogFragmentCb.m۱۷۹۱۲b(this, this.f۱۴۰۳۹u.m۱۸۰۱۳h(), this.f۱۴۰۳۹u.m۱۸۰۰۹d(), this.f۱۴۰۳۹u.m۱۸۰۰۷b());
                this.f۱۴۰۴۰v.show(getFragmentManager(), "DatePickerDialog");
                return;
            case R.id.input_case_process /*{ENCODED_INT: 2131296497}*/:
                this.input_case_process.setError(null);
                View$OnClickListenerCf.Cd dVar2 = new View$OnClickListenerCf.Cd(this);
                dVar2.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar2.m۱۵۸۶۸d(this.f۱۴۰۳۵G);
                dVar2.m۱۵۸۵۸b(this.f۱۴۰۳۵G);
                dVar2.m۱۵۸۶۳c(this.f۱۴۰۳۵G);
                dVar2.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar2.m۱۵۸۵۸b(this.f۱۴۰۳۵G);
                dVar2.m۱۵۸۷۱e("روند پرونده");
                dVar2.m۱۵۸۴۱a(R.array.case_status_items);
                dVar2.m۱۵۸۴۲a(-1, new Ci());
                dVar2.m۱۵۸۶۶c();
                return;
            case R.id.input_case_status /*{ENCODED_INT: 2131296498}*/:
                this.input_case_issue.setError(null);
                View$OnClickListenerCf.Cd dVar3 = new View$OnClickListenerCf.Cd(this);
                dVar3.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar3.m۱۵۸۶۸d(this.f۱۴۰۳۵G);
                dVar3.m۱۵۸۵۸b(this.f۱۴۰۳۵G);
                dVar3.m۱۵۸۶۳c(this.f۱۴۰۳۵G);
                dVar3.m۱۵۸۷۶j(R.color.colorPrimary);
                dVar3.m۱۵۸۵۸b(this.f۱۴۰۳۵G);
                dVar3.m۱۵۸۷۱e("وضعیت پرونده");
                dVar3.m۱۵۸۴۱a(R.array.case_issue_items);
                dVar3.m۱۵۸۴۲a(-1, new Ch());
                dVar3.m۱۵۸۶۶c();
                return;
            case R.id.input_case_title /*{ENCODED_INT: 2131296499}*/:
                this.input_case_title.setError(null);
                View$OnClickListenerCf.Cd dVar4 = new View$OnClickListenerCf.Cd(this);
                dVar4.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar4.m۱۵۸۶۸d(this.f۱۴۰۳۵G);
                dVar4.m۱۵۸۵۸b(this.f۱۴۰۳۵G);
                dVar4.m۱۵۸۶۳c(this.f۱۴۰۳۵G);
                dVar4.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar4.m۱۵۸۵۸b(this.f۱۴۰۳۵G);
                dVar4.m۱۵۸۷۱e("پرونده");
                dVar4.m۱۵۸۴۱a(R.array.case_title);
                dVar4.m۱۵۸۴۲a(-1, new Cf());
                dVar4.m۱۵۸۶۶c();
                return;
            case R.id.input_client_name /*{ENCODED_INT: 2131296504}*/:
                this.input_client_name.setError(null);
                View viewClient = getLayoutInflater().inflate(R.layout.bottom_sheet_select_clinet, (ViewGroup) null);
                RecyclerView mRecyclerView_client = (RecyclerView) viewClient.findViewById(R.id.recyclerView_client);
                mRecyclerView_client.setLayoutManager(new LinearLayoutManager(this));
                this.f۱۴۰۴۱w.m۱۷۸۱۱n();
                List<Client> clientList = this.f۱۴۰۴۱w.m۱۷۸۰۱i();
                this.f۱۴۰۴۱w.close();
                if (clientList.size() > 0) {
                    mRecyclerView_client.setAdapter(new Cs(this, "AddCaseActivity", clientList));
                    this.f۱۴۰۴۲x = new DialogCe(this);
                    this.f۱۴۰۴۲x.setContentView(viewClient);
                    this.f۱۴۰۴۲x.show();
                    return;
                }
                View$OnClickListenerCf.Cd dVar5 = new View$OnClickListenerCf.Cd(this);
                dVar5.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar5.m۱۵۸۵۸b(EnumCe.CENTER);
                dVar5.m۱۵۸۴۷a(this.f۱۴۰۳۵G);
                dVar5.m۱۵۸۷۶j(R.color.colorPrimary);
                dVar5.m۱۵۸۵۰a("هیچ موکلی ثبت نشده است.برای انجام این عملیات یک موکل ثبت کنید.");
                dVar5.m۱۵۸۷۲f(R.color.dialogCancelColor);
                dVar5.m۱۵۸۵۶b(R.color.colorPrimaryDark);
                dVar5.m۱۵۸۶۹d("فعلا نه");
                dVar5.m۱۵۸۶۰b("ثبت موکل");
                dVar5.m۱۵۸۶۴c(new Ca(this));
                dVar5.m۱۵۸۴۸a(new Cj());
                dVar5.m۱۵۸۶۶c();
                return;
            case R.id.input_client_title_type /*{ENCODED_INT: 2131296507}*/:
                this.input_client_title_type.setError(null);
                View$OnClickListenerCf.Cd dVar6 = new View$OnClickListenerCf.Cd(this);
                dVar6.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar6.m۱۵۸۶۸d(this.f۱۴۰۳۵G);
                dVar6.m۱۵۸۵۸b(this.f۱۴۰۳۵G);
                dVar6.m۱۵۸۶۳c(this.f۱۴۰۳۵G);
                dVar6.m۱۵۸۷۶j(R.color.colorPrimary);
                dVar6.m۱۵۸۵۸b(this.f۱۴۰۳۵G);
                dVar6.m۱۵۸۷۱e("سمت موکل");
                dVar6.m۱۵۸۴۱a(R.array.client_title_type_item);
                dVar6.m۱۵۸۴۲a(-1, new Cg());
                dVar6.m۱۵۸۶۶c();
                return;
            case R.id.input_court_city /*{ENCODED_INT: 2131296510}*/:
                View viewCity = getLayoutInflater().inflate(R.layout.bottom_sheet_acount_number_type, (ViewGroup) null);
                RecyclerView mRecyclerView = (RecyclerView) viewCity.findViewById(R.id.recycler_view_type);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                this.f۱۴۰۴۱w.m۱۷۸۱۱n();
                String[][] cityList = this.f۱۴۰۴۱w.m۱۷۷۹۷g();
                this.f۱۴۰۴۱w.close();
                mRecyclerView.setAdapter(new com.lawyer_smartCalendar.p۱۳۰a.Cj(this, "AddCaseActivity", cityList));
                this.f۱۴۰۳۸t = new DialogCe(this);
                this.f۱۴۰۳۸t.setContentView(viewCity);
                this.f۱۴۰۳۸t.show();
                return;
            case R.id.input_court_type /*{ENCODED_INT: 2131296511}*/:
                this.input_court_type.setError(null);
                View$OnClickListenerCf.Cd dVar7 = new View$OnClickListenerCf.Cd(this);
                dVar7.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar7.m۱۵۸۶۸d(this.f۱۴۰۳۵G);
                dVar7.m۱۵۸۵۸b(this.f۱۴۰۳۵G);
                dVar7.m۱۵۸۶۳c(this.f۱۴۰۳۵G);
                dVar7.m۱۵۸۷۶j(R.color.colorPrimary);
                dVar7.m۱۵۸۵۸b(this.f۱۴۰۳۵G);
                dVar7.m۱۵۸۷۱e("درجه و نوع دادگاه");
                dVar7.m۱۵۸۴۱a(R.array.case_court_type_items);
                dVar7.m۱۵۸۴۲a(-1, new Ce());
                dVar7.m۱۵۸۶۶c();
                return;
            default:
                return;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddCaseActivity$d  reason: invalid class name */
    class Cd implements View$OnClickListenerCf.AbstractCm {
        Cd(AddCaseActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۰۵a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddCaseActivity$c  reason: invalid class name */
    class Cc implements View$OnClickListenerCf.AbstractCm {
        Cc() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۰۴a(View$OnClickListenerCf dialog, EnumCb which) {
            AddCaseActivity addCaseActivity = AddCaseActivity.this;
            addCaseActivity.startActivity(new Intent(addCaseActivity, PayActivity.class));
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddCaseActivity$e  reason: invalid class name */
    class Ce implements View$OnClickListenerCf.AbstractCj {
        Ce() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۳۰۶a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
            AddCaseActivity.this.input_court_type.setText(text);
            AddCaseActivity addCaseActivity = AddCaseActivity.this;
            addCaseActivity.f۱۴۰۳۰B = (which + 1) + "";
            return true;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddCaseActivity$f  reason: invalid class name */
    class Cf implements View$OnClickListenerCf.AbstractCj {
        Cf() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۳۰۷a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
            AddCaseActivity.this.input_case_title.setText(text);
            if (which == 0) {
                AddCaseActivity.this.f۱۴۰۳۱C = "Normal";
            } else if (which == 1) {
                AddCaseActivity.this.f۱۴۰۳۱C = "Executive";
            } else if (which == 2) {
                AddCaseActivity.this.f۱۴۰۳۱C = "Challenge";
            } else if (which == 3) {
                AddCaseActivity.this.f۱۴۰۳۱C = "Bank";
            }
            return true;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddCaseActivity$g  reason: invalid class name */
    class Cg implements View$OnClickListenerCf.AbstractCj {
        Cg() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۳۰۸a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
            AddCaseActivity.this.input_client_title_type.setText(text);
            if (which == 0) {
                AddCaseActivity.this.f۱۴۰۳۲D = "Applicant";
            } else if (which == 1) {
                AddCaseActivity.this.f۱۴۰۳۲D = "Read";
            } else if (which == 2) {
                AddCaseActivity.this.f۱۴۰۳۲D = "Plaintiff";
            } else if (which == 3) {
                AddCaseActivity.this.f۱۴۰۳۲D = "Accused";
            } else if (which == 4) {
                AddCaseActivity.this.f۱۴۰۳۲D = "Revisionist";
            } else if (which == 5) {
                AddCaseActivity.this.f۱۴۰۳۲D = "Reconsidered";
            }
            return true;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddCaseActivity$h  reason: invalid class name */
    class Ch implements View$OnClickListenerCf.AbstractCj {
        Ch() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۳۰۹a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
            AddCaseActivity.this.input_case_status.setText(text);
            if (which == 0) {
                AddCaseActivity.this.f۱۴۰۲۹A = "Legal";
            } else if (which == 1) {
                AddCaseActivity.this.f۱۴۰۲۹A = "Criminal";
            } else if (which == 2) {
                AddCaseActivity.this.f۱۴۰۲۹A = "Record";
            }
            return true;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddCaseActivity$i  reason: invalid class name */
    class Ci implements View$OnClickListenerCf.AbstractCj {
        Ci() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۳۱۰a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
            AddCaseActivity.this.input_case_process.setText(text);
            if (which == 0) {
                AddCaseActivity.this.f۱۴۰۴۴z = "Stream";
                AddCaseActivity.this.input_case_process.setTextColor(Color.parseColor("#E65100"));
            } else if (which == 1) {
                AddCaseActivity.this.f۱۴۰۴۴z = "Finished";
                AddCaseActivity.this.input_case_process.setTextColor(Color.parseColor("#757575"));
            }
            return true;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddCaseActivity$a  reason: invalid class name */
    class Ca implements View$OnClickListenerCf.AbstractCm {
        Ca(AddCaseActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۰۳a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddCaseActivity$j  reason: invalid class name */
    class Cj implements View$OnClickListenerCf.AbstractCm {
        Cj() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۱۱a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
            Intent frm_add_client = new Intent(AddCaseActivity.this, AddClientActivity.class);
            frm_add_client.putExtra("frmMode", "add");
            AddCaseActivity.this.startActivity(frm_add_client);
        }
    }

    public void onFocusChange(View view, boolean Focused) {
        switch (view.getId()) {
            case R.id.input_case_date /*{ENCODED_INT: 2131296494}*/:
                if (Focused) {
                    this.input_case_date.callOnClick();
                    return;
                }
                return;
            case R.id.input_case_issue /*{ENCODED_INT: 2131296495}*/:
                if (Focused) {
                    this.input_case_issue.callOnClick();
                    return;
                }
                return;
            case R.id.input_case_process /*{ENCODED_INT: 2131296497}*/:
                if (Focused) {
                    this.input_case_process.callOnClick();
                    return;
                }
                return;
            case R.id.input_case_status /*{ENCODED_INT: 2131296498}*/:
                if (Focused) {
                    this.input_case_status.callOnClick();
                    return;
                }
                return;
            case R.id.input_case_title /*{ENCODED_INT: 2131296499}*/:
                if (Focused) {
                    this.input_case_title.callOnClick();
                    return;
                }
                return;
            case R.id.input_client_name /*{ENCODED_INT: 2131296504}*/:
                if (Focused) {
                    this.input_client_name.callOnClick();
                    return;
                }
                return;
            case R.id.input_client_title_type /*{ENCODED_INT: 2131296507}*/:
                if (Focused) {
                    this.input_client_title_type.callOnClick();
                    return;
                }
                return;
            case R.id.input_court_city /*{ENCODED_INT: 2131296510}*/:
                if (Focused) {
                    this.input_court_city.callOnClick();
                    return;
                }
                return;
            case R.id.input_court_type /*{ENCODED_INT: 2131296511}*/:
                if (Focused) {
                    this.input_court_type.callOnClick();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    public void m۱۷۳۰۲m() {
        this.f۱۴۰۴۲x.dismiss();
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۳۰۰a(DialogFragmentCb view, int year, int monthOfYear, int dayOfMonth) {
        Cb mcurrentDate = new Cb();
        mcurrentDate.m۱۸۰۰۶a(year, monthOfYear, dayOfMonth);
        this.input_case_date.setText(mcurrentDate.m۱۸۰۰۸c());
        this.f۱۴۰۳۳E = mcurrentDate.getTimeInMillis() + "";
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۳۰۱a(String type) {
        if (((type.hashCode() == 3053931 && type.equals("city")) ? (char) 0 : 65535) == 0) {
            this.f۱۴۰۳۸t.dismiss();
        }
    }
}
