package com.lawyer_smartCalendar.activity;

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
import butterknife.ButterKnife;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.model.Case;
import com.lawyer_smartCalendar.model.Client;
import com.lawyer_smartCalendar.p۱۳۰a.Cr;
import com.lawyer_smartCalendar.p۱۳۰a.Cs;
import com.lawyer_smartCalendar.p۱۳۱b.Ca;
import com.lawyer_smartCalendar.utils.Ch;
import com.lawyer_smartCalendar.utils.Ci;
import com.lawyer_smartCalendar.utils.Ck;
import com.lawyer_smartCalendar.utils.OnAlarmReceiver;
import com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb;
import com.mohamadamin.persianmaterialdatetimepicker.time.DialogFragmentCe;
import com.mohamadamin.persianmaterialdatetimepicker.time.RadialPickerLayout;
import com.rey.material.widget.Button;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AddMeetingActivity extends ActivityCe implements View.OnClickListener, View.OnFocusChangeListener, DialogFragmentCb.AbstractCd, DialogFragmentCe.AbstractCh {

    /* renamed from: A  reason: contains not printable characters */
    private String f۱۴۱۱۳A = "";

    /* renamed from: B  reason: contains not printable characters */
    private String f۱۴۱۱۴B = "";

    /* renamed from: C  reason: contains not printable characters */
    private int f۱۴۱۱۵C;

    /* renamed from: D  reason: contains not printable characters */
    private int f۱۴۱۱۶D;

    /* renamed from: E  reason: contains not printable characters */
    private String f۱۴۱۱۷E = "انتخاب زمان یادآوری";

    /* renamed from: F  reason: contains not printable characters */
    private EnumCe f۱۴۱۱۸F = EnumCe.END;

    /* renamed from: G  reason: contains not printable characters */
    private String f۱۴۱۱۹G = "day";

    /* renamed from: H  reason: contains not printable characters */
    private int f۱۴۱۲۰H = 1;

    /* renamed from: I  reason: contains not printable characters */
    private int f۱۴۱۲۱I = 1;
    public Button btn_add_time;
    public EditText input_case;
    public EditText input_client_name;
    public EditText input_date;
    public EditText input_date_hour;
    public EditText input_reminder;
    public EditText input_reminder_count;
    public EditText input_subject;

    /* renamed from: r  reason: contains not printable characters */
    private String f۱۴۱۲۲r = "";

    /* renamed from: s  reason: contains not printable characters */
    private String f۱۴۱۲۳s = "add";

    /* renamed from: t  reason: contains not printable characters */
    private com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb f۱۴۱۲۴t;

    /* renamed from: u  reason: contains not printable characters */
    private DialogFragmentCb f۱۴۱۲۵u;

    /* renamed from: v  reason: contains not printable characters */
    public int f۱۴۱۲۶v = -1;

    /* renamed from: w  reason: contains not printable characters */
    public int f۱۴۱۲۷w = -1;

    /* renamed from: x  reason: contains not printable characters */
    private Ci f۱۴۱۲۸x;

    /* renamed from: y  reason: contains not printable characters */
    private DialogCe f۱۴۱۲۹y;

    /* renamed from: z  reason: contains not printable characters */
    private DialogCe f۱۴۱۳۰z;

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
            this.btn_add_time.callOnClick();
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
        setTheme(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        overridePendingTransition(17432576, 17432577);
        setContentView(R.layout.activity_add_meeting);
        ButterKnife.m۱۶۵۸۶a(this);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۱۴۱۱۸F = EnumCe.END;
        } else {
            this.f۱۴۱۱۸F = EnumCe.START;
        }
        this.f۱۴۱۲۸x = new Ci(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_action_close);
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCa());
        this.btn_add_time.setVisibility(8);
        this.btn_add_time.setOnClickListener(this);
        this.input_client_name.setOnClickListener(this);
        this.input_client_name.setOnFocusChangeListener(this);
        this.input_case.setOnClickListener(this);
        this.input_case.setOnFocusChangeListener(this);
        this.input_date.setOnClickListener(this);
        this.input_date.setOnFocusChangeListener(this);
        this.input_reminder.setOnClickListener(this);
        this.input_date_hour.setOnClickListener(this);
        this.input_date_hour.setOnFocusChangeListener(this);
        this.input_reminder_count.setOnClickListener(this);
        this.input_reminder_count.setText(this.f۱۴۱۱۷E);
        this.f۱۴۱۲۲r = getIntent().getStringExtra("id");
        this.f۱۴۱۲۳s = getIntent().getStringExtra("frmMode");
        try {
            String selectedDate = getIntent().getStringExtra("date");
            com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb mcurrentDate = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
            mcurrentDate.setTimeInMillis(Long.parseLong(selectedDate));
            this.input_date.setText(mcurrentDate.m۱۸۰۰۸c());
            this.input_date.setTextColor(Color.parseColor("#E65100"));
            this.f۱۴۱۱۳A = mcurrentDate.getTimeInMillis() + "";
            Calendar c2 = Calendar.getInstance();
            String str = c2.getTimeInMillis() + "";
        } catch (Exception e) {
        }
        if (this.f۱۴۱۲۳s.equals("edit")) {
            this.f۱۴۱۲۸x.m۱۷۸۱۱n();
            com.lawyer_smartCalendar.p۱۳۳d.Ci schedule = this.f۱۴۱۲۸x.m۱۷۷۵۵B(this.f۱۴۱۲۲r);
            com.lawyer_smartCalendar.p۱۳۳d.Cc client = this.f۱۴۱۲۸x.m۱۷۸۱۲o(schedule.m۱۷۷۱۶c() + "");
            com.lawyer_smartCalendar.p۱۳۳d.Cb case1 = this.f۱۴۱۲۸x.m۱۷۸۰۴k(schedule.m۱۷۷۱۳b() + "");
            this.f۱۴۱۲۸x.close();
            m۱۳۴۸۹j().m۱۳۴۱۴a("ویرایش قرار ملاقات");
            this.input_subject.setText(schedule.m۱۷۷۲۵h());
            this.input_client_name.setText(client.m۱۷۶۴۴f());
            this.f۱۴۱۲۶v = schedule.m۱۷۷۱۶c();
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
            this.f۱۴۱۲۷w = schedule.m۱۷۷۱۳b();
            com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb mcurrentDate2 = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
            mcurrentDate2.setTimeInMillis(Long.parseLong(schedule.m۱۷۷۱۹d()));
            this.input_date.setText(mcurrentDate2.m۱۸۰۰۸c());
            this.input_date.setTextColor(Color.parseColor("#E65100"));
            this.f۱۴۱۱۳A = mcurrentDate2.getTimeInMillis() + "";
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(Long.parseLong(schedule.m۱۷۷۱۹d()));
            this.f۱۴۱۱۵C = mcurrentDate2.get(11);
            this.f۱۴۱۱۶D = mcurrentDate2.get(12);
            this.input_date_hour.setText(calendar.get(11) + ":" + calendar.get(12));
        }
        try {
            String frmStarter = getIntent().getStringExtra("frmStarter");
            String id = getIntent().getStringExtra("id");
            if (((frmStarter.hashCode() == -1357712437 && frmStarter.equals("client")) ? (char) 0 : 65535) == 0) {
                this.f۱۴۱۲۸x.m۱۷۸۱۱n();
                com.lawyer_smartCalendar.p۱۳۳d.Cc client2 = this.f۱۴۱۲۸x.m۱۷۸۱۲o(id);
                this.f۱۴۱۲۸x.close();
                this.input_client_name.setText(client2.m۱۷۶۴۴f());
                this.input_client_name.setEnabled(false);
                this.f۱۴۱۲۶v = client2.m۱۷۶۴۰d();
            }
        } catch (Exception e2) {
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddMeetingActivity$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View view) {
            AddMeetingActivity.this.finish();
        }
    }

    public void onClick(View view) {
        boolean hasError;
        long record_id;
        switch (view.getId()) {
            case R.id.btn_add_time /*{ENCODED_INT: 2131296348}*/:
                boolean hasError2 = false;
                if (this.input_subject.getText().toString().equals("")) {
                    this.input_subject.setError("عنوان را وارد کنید.");
                    hasError2 = true;
                }
                if (this.f۱۴۱۲۶v == -1) {
                    this.input_client_name.setError("موکل را انتخاب کنید.");
                    hasError2 = true;
                }
                if (this.f۱۴۱۲۷w == -1) {
                    this.input_case.setError("پرونده را انتخاب کنید.");
                    hasError2 = true;
                }
                if (this.f۱۴۱۱۳A.equals("")) {
                    this.input_date.setError("تاریخ رسیدگی را انتخاب کنید.");
                    hasError2 = true;
                }
                if (this.input_date_hour.getText().toString().equals("")) {
                    this.input_date_hour.setError("ساعت رسیدگی را انتخاب کنید.");
                    hasError2 = true;
                }
                if (this.f۱۴۱۱۴B.equals("")) {
                    this.input_reminder_count.setError("زمان یادآوری را انتخاب کنید.");
                    hasError = true;
                } else {
                    hasError = hasError2;
                }
                if (!hasError) {
                    com.lawyer_smartCalendar.p۱۳۳d.Ci schedule = new com.lawyer_smartCalendar.p۱۳۳d.Ci();
                    schedule.m۱۷۷۱۴b(this.f۱۴۱۲۶v);
                    schedule.m۱۷۷۱۱a(this.f۱۴۱۲۷w);
                    schedule.m۱۷۷۲۰d("Meeting");
                    schedule.m۱۷۷۲۲e(this.input_subject.getText().toString());
                    Calendar calendar = Calendar.getInstance();
                    Calendar calendar_today = Calendar.getInstance();
                    calendar.setTimeInMillis(Long.parseLong(this.f۱۴۱۱۳A));
                    calendar.set(11, this.f۱۴۱۱۵C);
                    calendar.set(12, this.f۱۴۱۱۶D);
                    if (calendar.getTimeInMillis() < calendar_today.getTimeInMillis()) {
                        new Ch().m۱۷۷۵۳a(this, "error", "تاریخ ملاقات را به درستی انتخاب کنید.");
                        return;
                    }
                    schedule.m۱۷۷۱۵b(calendar.getTimeInMillis() + "");
                    schedule.m۱۷۷۱۸c("");
                    Calendar alarmCal = Calendar.getInstance();
                    alarmCal.setTimeInMillis(calendar.getTimeInMillis());
                    if (this.f۱۴۱۱۹G.equals("day")) {
                        alarmCal.set(5, alarmCal.get(5) - this.f۱۴۱۲۱I);
                    } else {
                        alarmCal.set(11, alarmCal.get(11) - this.f۱۴۱۲۰H);
                    }
                    this.f۱۴۱۱۴B = alarmCal.getTimeInMillis() + "";
                    schedule.m۱۷۷۱۲a(this.f۱۴۱۱۴B);
                    if (alarmCal.getTimeInMillis() <= Calendar.getInstance().getTimeInMillis()) {
                        new Ch().m۱۷۷۵۳a(this, "error", "در تاریخ های گذشته نمی توانید قرار ملاقات ثبت کنید.");
                        return;
                    }
                    this.f۱۴۱۲۸x.m۱۷۸۱۱n();
                    if (this.f۱۴۱۲۳s.equals("edit")) {
                        long record_id2 = Long.parseLong(this.f۱۴۱۲۲r);
                        this.f۱۴۱۲۸x.m۱۷۷۷۳a(schedule, this.f۱۴۱۲۲r);
                        new Ch().m۱۷۷۵۳a(this, "success", "قرار ملاقات با موفقیت ویرایش شد.");
                        record_id = record_id2;
                    } else {
                        long record_id3 = this.f۱۴۱۲۸x.m۱۷۷۶۱a(schedule);
                        new Ch().m۱۷۷۵۳a(this, "success", "قرار ملاقات با موفقیت ثبت شد.");
                        record_id = record_id3;
                    }
                    this.f۱۴۱۲۸x.close();
                    com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb d = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
                    d.setTimeInMillis(Long.parseLong(schedule.m۱۷۷۱۹d()));
                    String meeting_time = d.m۱۸۰۱۱f();
                    Intent alarmIntent = new Intent(this, OnAlarmReceiver.class);
                    alarmIntent.putExtra("id", record_id + "");
                    alarmIntent.putExtra("title", schedule.m۱۷۷۲۵h());
                    alarmIntent.putExtra("message", "تاریخ : " + meeting_time + "\nساعت : " + (this.f۱۴۱۱۶D + " : " + this.f۱۴۱۱۵C));
                    new Ck(this, alarmIntent, alarmCal.getTimeInMillis(), record_id).m۱۷۸۲۵b();
                    setResult(-1);
                    com.lawyer_smartCalendar.utils.Ce.f۱۴۷۸۳b.m۱۷۴۹۰d0();
                    finish();
                    return;
                }
                return;
            case R.id.input_case /*{ENCODED_INT: 2131296493}*/:
                if (this.f۱۴۱۲۶v == -1) {
                    new Ch().m۱۷۷۵۳a(this, "error", "ابتدا یک موکل انتخاب کنید.");
                    return;
                }
                this.input_case.setError(null);
                View viewCase = getLayoutInflater().inflate(R.layout.bottom_sheet_select_case, (ViewGroup) null);
                RecyclerView mRecyclerView_case = (RecyclerView) viewCase.findViewById(R.id.recyclerView_case);
                mRecyclerView_case.setLayoutManager(new LinearLayoutManager(this));
                this.f۱۴۱۲۸x.m۱۷۸۱۱n();
                List<Case> caseList = this.f۱۴۱۲۸x.m۱۷۷۶۲a(this.f۱۴۱۲۶v);
                this.f۱۴۱۲۸x.close();
                if (caseList.size() > 0) {
                    mRecyclerView_case.setAdapter(new Cr(this, "AddMeetingActivity", caseList));
                    this.f۱۴۱۳۰z = new DialogCe(this);
                    this.f۱۴۱۳۰z.setContentView(viewCase);
                    this.f۱۴۱۳۰z.show();
                    return;
                }
                View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(this);
                dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar.m۱۵۸۵۸b(EnumCe.CENTER);
                dVar.m۱۵۸۴۷a(EnumCe.END);
                dVar.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar.m۱۵۸۷۲f(R.color.dialogCancelColor);
                dVar.m۱۵۸۵۶b(R.color.colorPrimaryDark);
                dVar.m۱۵۸۵۰a("هیچ پرونده ای برای این موکل ثبت نشده است.برای انجام این عملیات یک پرونده ثبت کنید.");
                dVar.m۱۵۸۶۹d("فعلا نه");
                dVar.m۱۵۸۶۰b("ثبت پرونده");
                dVar.m۱۵۸۶۴c(new Cf(this));
                dVar.m۱۵۸۴۸a(new Ce());
                dVar.m۱۵۸۶۶c();
                return;
            case R.id.input_client_name /*{ENCODED_INT: 2131296504}*/:
                this.input_client_name.setError(null);
                View viewClient = getLayoutInflater().inflate(R.layout.bottom_sheet_select_clinet, (ViewGroup) null);
                RecyclerView mRecyclerView_client = (RecyclerView) viewClient.findViewById(R.id.recyclerView_client);
                mRecyclerView_client.setLayoutManager(new LinearLayoutManager(this));
                this.f۱۴۱۲۸x.m۱۷۸۱۱n();
                List<Client> clientList = this.f۱۴۱۲۸x.m۱۷۸۰۱i();
                this.f۱۴۱۲۸x.close();
                if (clientList.size() > 0) {
                    mRecyclerView_client.setAdapter(new Cs(this, "AddMeetingActivity", clientList));
                    this.f۱۴۱۲۹y = new DialogCe(this);
                    this.f۱۴۱۲۹y.setContentView(viewClient);
                    this.f۱۴۱۲۹y.show();
                    return;
                }
                View$OnClickListenerCf.Cd dVar2 = new View$OnClickListenerCf.Cd(this);
                dVar2.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar2.m۱۵۸۵۸b(EnumCe.CENTER);
                dVar2.m۱۵۸۴۷a(EnumCe.END);
                dVar2.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar2.m۱۵۸۵۰a("هیچ موکلی ثبت نشده است.برای انجام این عملیات یک موکل ثبت کنید.");
                dVar2.m۱۵۸۷۲f(R.color.dialogCancelColor);
                dVar2.m۱۵۸۵۶b(R.color.colorPrimaryDark);
                dVar2.m۱۵۸۶۹d("فعلا نه");
                dVar2.m۱۵۸۶۰b("ثبت موکل");
                dVar2.m۱۵۸۶۴c(new Cd(this));
                dVar2.m۱۵۸۴۸a(new Cc());
                dVar2.m۱۵۸۶۶c();
                return;
            case R.id.input_date /*{ENCODED_INT: 2131296512}*/:
                this.input_date.setError(null);
                this.f۱۴۱۲۴t = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
                this.f۱۴۱۲۵u = DialogFragmentCb.m۱۷۹۱۲b(this, this.f۱۴۱۲۴t.m۱۸۰۱۳h(), this.f۱۴۱۲۴t.m۱۸۰۰۹d(), this.f۱۴۱۲۴t.m۱۸۰۰۷b());
                this.f۱۴۱۲۵u.show(getFragmentManager(), "input_date");
                return;
            case R.id.input_date_hour /*{ENCODED_INT: 2131296514}*/:
                Calendar calendar2 = Calendar.getInstance();
                DialogFragmentCe.m۱۸۰۶۴b(this, calendar2.get(11), calendar2.get(12), true).show(getFragmentManager(), "input_time");
                return;
            case R.id.input_reminder /*{ENCODED_INT: 2131296544}*/:
                this.input_reminder_count.callOnClick();
                return;
            case R.id.input_reminder_count /*{ENCODED_INT: 2131296545}*/:
                this.input_reminder_count.setError(null);
                View$OnClickListenerCf.Cd dVar3 = new View$OnClickListenerCf.Cd(this);
                dVar3.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar3.m۱۵۸۶۸d(this.f۱۴۱۱۸F);
                dVar3.m۱۵۸۵۸b(this.f۱۴۱۱۸F);
                dVar3.m۱۵۸۶۳c(this.f۱۴۱۱۸F);
                dVar3.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar3.m۱۵۸۵۸b(this.f۱۴۱۱۸F);
                dVar3.m۱۵۸۷۱e("زمان یادآوری");
                dVar3.m۱۵۸۴۱a(R.array.alarm_items);
                dVar3.m۱۵۸۴۲a(-1, new Cb());
                dVar3.m۱۵۸۶۶c();
                return;
            default:
                return;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddMeetingActivity$b  reason: invalid class name */
    class Cb implements View$OnClickListenerCf.AbstractCj {
        Cb() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۳۵۳a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
            AddMeetingActivity.this.input_reminder_count.setText(text);
            AddMeetingActivity addMeetingActivity = AddMeetingActivity.this;
            addMeetingActivity.f۱۴۱۱۴B = addMeetingActivity.f۱۴۱۱۳A;
            switch (which) {
                case 0:
                    AddMeetingActivity.this.f۱۴۱۱۹G = "hour";
                    AddMeetingActivity.this.f۱۴۱۲۰H = 1;
                    break;
                case 1:
                    AddMeetingActivity.this.f۱۴۱۱۹G = "hour";
                    AddMeetingActivity.this.f۱۴۱۲۰H = 2;
                    break;
                case 2:
                    AddMeetingActivity.this.f۱۴۱۱۹G = "hour";
                    AddMeetingActivity.this.f۱۴۱۲۰H = 5;
                    break;
                case 3:
                    AddMeetingActivity.this.f۱۴۱۱۹G = "day";
                    AddMeetingActivity.this.f۱۴۱۲۱I = 1;
                    break;
                case 4:
                    AddMeetingActivity.this.f۱۴۱۱۹G = "day";
                    AddMeetingActivity.this.f۱۴۱۲۱I = 2;
                    break;
                case 5:
                    AddMeetingActivity.this.f۱۴۱۱۹G = "day";
                    AddMeetingActivity.this.f۱۴۱۲۱I = 3;
                    break;
                case 6:
                    AddMeetingActivity.this.f۱۴۱۱۹G = "day";
                    AddMeetingActivity.this.f۱۴۱۲۱I = 4;
                    break;
                case 7:
                    AddMeetingActivity.this.f۱۴۱۱۹G = "day";
                    AddMeetingActivity.this.f۱۴۱۲۱I = 5;
                    break;
            }
            return true;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddMeetingActivity$d  reason: invalid class name */
    class Cd implements View$OnClickListenerCf.AbstractCm {
        Cd(AddMeetingActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۵۵a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddMeetingActivity$c  reason: invalid class name */
    class Cc implements View$OnClickListenerCf.AbstractCm {
        Cc() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۵۴a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
            Intent frm_add_client = new Intent(AddMeetingActivity.this, AddClientActivity.class);
            frm_add_client.putExtra("frmMode", "add");
            AddMeetingActivity.this.startActivity(frm_add_client);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddMeetingActivity$f  reason: invalid class name */
    class Cf implements View$OnClickListenerCf.AbstractCm {
        Cf(AddMeetingActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۵۷a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddMeetingActivity$e  reason: invalid class name */
    class Ce implements View$OnClickListenerCf.AbstractCm {
        Ce() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۵۶a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
            Intent frm_add_case = new Intent(AddMeetingActivity.this, AddCaseActivity.class);
            frm_add_case.putExtra("frmMode", "add");
            AddMeetingActivity.this.startActivity(frm_add_case);
        }
    }

    public void onFocusChange(View view, boolean focused) {
        switch (view.getId()) {
            case R.id.input_case /*{ENCODED_INT: 2131296493}*/:
                if (focused) {
                    this.input_case.setError(null);
                    this.input_case.callOnClick();
                    return;
                }
                return;
            case R.id.input_client_name /*{ENCODED_INT: 2131296504}*/:
                if (focused) {
                    this.input_client_name.setError(null);
                    this.input_client_name.callOnClick();
                    return;
                }
                return;
            case R.id.input_date /*{ENCODED_INT: 2131296512}*/:
                if (focused) {
                    this.input_date.setError(null);
                    this.input_date.callOnClick();
                    return;
                }
                return;
            case R.id.input_date_hour /*{ENCODED_INT: 2131296514}*/:
                if (focused) {
                    this.input_date_hour.setError(null);
                    this.input_date_hour.callOnClick();
                    return;
                }
                return;
            case R.id.input_reminder /*{ENCODED_INT: 2131296544}*/:
                if (focused) {
                    this.input_reminder.setError(null);
                    this.input_reminder.callOnClick();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    public void m۱۷۳۵۱m() {
        this.f۱۴۱۲۹y.dismiss();
    }

    /* renamed from: n  reason: contains not printable characters */
    public void m۱۷۳۵۲n() {
        this.f۱۴۱۳۰z.dismiss();
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۳۴۹a(DialogFragmentCb view, int year, int monthOfYear, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        String str = c.getTimeInMillis() + "";
        com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb mcurrentDate = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
        mcurrentDate.m۱۸۰۰۶a(year, monthOfYear, dayOfMonth);
        String tag = this.f۱۴۱۲۵u.getTag();
        if (((tag.hashCode() == 1386192643 && tag.equals("input_date")) ? (char) 0 : 65535) == 0) {
            this.input_date.setText(mcurrentDate.m۱۸۰۰۸c());
            this.input_date.setTextColor(Color.parseColor("#E65100"));
            this.f۱۴۱۱۳A = mcurrentDate.getTimeInMillis() + "";
        }
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.time.DialogFragmentCe.AbstractCh
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۳۵۰a(RadialPickerLayout view, int hourOfDay, int minute) {
        this.f۱۴۱۱۵C = hourOfDay;
        this.f۱۴۱۱۶D = minute;
        EditText editText = this.input_date_hour;
        editText.setText(hourOfDay + ":" + minute);
    }
}
