package com.lawyer_smartCalendar.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.DialogCe;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.GridLayoutManager;
import android.support.p۰۴۷v7.widget.LinearLayoutManager;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.model.Case;
import com.lawyer_smartCalendar.model.Client;
import com.lawyer_smartCalendar.p۱۳۰a.Cp;
import com.lawyer_smartCalendar.p۱۳۰a.Cr;
import com.lawyer_smartCalendar.p۱۳۰a.Cs;
import com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb;
import com.rey.material.widget.Button;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۰۵۲b.p۰۶۲c.p۰۶۳a.AbstractCb;
import p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AddClientDocumentsActivity extends ActivityCe implements View.OnClickListener, View.OnFocusChangeListener, DialogFragmentCb.AbstractCd {

    /* renamed from: A  reason: contains not printable characters */
    private String f۱۴۰۷۰A = "";

    /* renamed from: B  reason: contains not printable characters */
    private String f۱۴۰۷۱B = "";

    /* renamed from: C  reason: contains not printable characters */
    private String f۱۴۰۷۲C = "";

    /* renamed from: D  reason: contains not printable characters */
    private EnumCe f۱۴۰۷۳D = EnumCe.END;

    /* renamed from: E  reason: contains not printable characters */
    private Cp f۱۴۰۷۴E;

    /* renamed from: F  reason: contains not printable characters */
    private ArrayList<File> f۱۴۰۷۵F = new ArrayList<>();
    public Button btn_add_document;
    public Button btn_add_image;
    public ImageView img_clear_date;
    public EditText input_case;
    public EditText input_client_name;
    public EditText input_date_delivered;
    public EditText input_date_received;
    public EditText input_document_note;
    public EditText input_document_type;

    /* renamed from: r  reason: contains not printable characters */
    private String f۱۴۰۷۶r = "";
    public RecyclerView recyclerView;

    /* renamed from: s  reason: contains not printable characters */
    private String f۱۴۰۷۷s = "add";

    /* renamed from: t  reason: contains not printable characters */
    private Cb f۱۴۰۷۸t;

    /* renamed from: u  reason: contains not printable characters */
    private DialogFragmentCb f۱۴۰۷۹u;

    /* renamed from: v  reason: contains not printable characters */
    public int f۱۴۰۸۰v = -1;

    /* renamed from: w  reason: contains not printable characters */
    public int f۱۴۰۸۱w = -1;

    /* renamed from: x  reason: contains not printable characters */
    private com.lawyer_smartCalendar.utils.Ci f۱۴۰۸۲x;

    /* renamed from: y  reason: contains not printable characters */
    private DialogCe f۱۴۰۸۳y;

    /* renamed from: z  reason: contains not printable characters */
    private DialogCe f۱۴۰۸۴z;

    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("easy_image_photos_list", this.f۱۴۰۷۵F);
    }

    @Override // android.support.p۰۴۳v4.app.Ca.AbstractCb, android.support.p۰۴۳v4.app.ActivityCg
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        p۰۵۲b.p۰۶۲c.p۰۶۳a.Ca.m۱۵۹۱۷a().m۱۵۹۲۰a(permissions, grantResults);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.m۱۹۶۲۰a(requestCode, resultCode, data, this, new Ca());
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientDocumentsActivity$a  reason: invalid class name */
    class Ca implements Ca.AbstractCb {
        Ca() {
        }

        @Override // p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۲۴a(Exception e, Ca.EnumCd source, int type) {
            e.printStackTrace();
        }

        @Override // p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۲۳a(File imageFile, Ca.EnumCd source, int type) {
            AddClientDocumentsActivity.this.m۱۷۳۱۸a((AddClientDocumentsActivity) imageFile);
        }

        @Override // p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۲۲a(Ca.EnumCd source, int type) {
            File photoFile;
            if ((source == Ca.EnumCd.CAMERA || source == Ca.EnumCd.GALLERY) && (photoFile = p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.m۱۹۶۳۳d(AddClientDocumentsActivity.this)) != null) {
                photoFile.delete();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۷۳۱۸a(File returnedPhoto) {
        this.f۱۴۰۷۵F.add(returnedPhoto);
        this.f۱۴۰۷۴E.m۱۴۴۵۰d();
        this.recyclerView.m۱۴۳۳۱h(this.f۱۴۰۷۵F.size() - 1);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۷v7.app.ActivityCe
    public void onDestroy() {
        p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.m۱۹۶۲۳a(this);
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_add) {
            this.btn_add_document.callOnClick();
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

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        char c;
        char c2;
        String title;
        char c3;
        setTheme(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        overridePendingTransition(17432576, 17432577);
        setContentView(R.layout.activity_add_client_document);
        ButterKnife.m۱۶۵۸۶a(this);
        this.f۱۴۰۸۲x = new com.lawyer_smartCalendar.utils.Ci(this);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۱۴۰۷۳D = EnumCe.END;
        } else {
            this.f۱۴۰۷۳D = EnumCe.START;
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_action_close);
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCb());
        this.btn_add_document.setOnClickListener(this);
        this.btn_add_image.setOnClickListener(this);
        this.img_clear_date.setOnClickListener(this);
        this.btn_add_document.setVisibility(8);
        this.input_client_name.setOnClickListener(this);
        this.input_client_name.setOnFocusChangeListener(this);
        this.input_case.setOnClickListener(this);
        this.input_case.setOnFocusChangeListener(this);
        this.input_document_type.setOnClickListener(this);
        this.input_document_type.setOnFocusChangeListener(this);
        this.input_date_received.setOnClickListener(this);
        this.input_date_received.setOnFocusChangeListener(this);
        this.input_date_delivered.setOnClickListener(this);
        this.input_date_delivered.setOnFocusChangeListener(this);
        this.f۱۴۰۷۶r = getIntent().getStringExtra("id");
        this.f۱۴۰۷۷s = getIntent().getStringExtra("frmMode");
        if (this.f۱۴۰۷۷s.equals("edit")) {
            m۱۳۴۸۹j().m۱۳۴۱۴a("ویرایش اسناد و مدارک موکلین");
            this.btn_add_document.setText("ویرایش سند");
            this.f۱۴۰۸۲x.m۱۷۸۱۱n();
            com.lawyer_smartCalendar.p۱۳۳d.Cd document = this.f۱۴۰۸۲x.m۱۷۸۱۳p(this.f۱۴۰۷۶r);
            com.lawyer_smartCalendar.p۱۳۳d.Cc client = this.f۱۴۰۸۲x.m۱۷۸۱۲o(document.m۱۷۶۵۴b() + "");
            com.lawyer_smartCalendar.p۱۳۳d.Cb case1 = this.f۱۴۰۸۲x.m۱۷۸۰۴k(document.m۱۷۶۵۱a() + "");
            this.f۱۴۰۸۲x.close();
            int i = 0;
            for (List<com.lawyer_smartCalendar.model.File> imageList = this.f۱۴۰۸۲x.m۱۷۷۸۲b(this.f۱۴۰۷۶r, com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۲a); i < imageList.size(); imageList = imageList) {
                this.f۱۴۰۷۵F.add(new File(Uri.decode(((com.lawyer_smartCalendar.p۱۳۳d.Ce) imageList.get(i)).m۱۷۶۶۵a())));
                i++;
            }
            this.input_client_name.setText(client.m۱۷۶۴۴f());
            this.f۱۴۰۸۰v = document.m۱۷۶۵۴b();
            this.input_client_name.setEnabled(false);
            String o = case1.m۱۷۶۳۲o();
            switch (o.hashCode()) {
                case -1955878649:
                    if (o.equals("Normal")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -888366013:
                    if (o.equals("Challenge")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2062940:
                    if (o.equals("Bank")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 912993224:
                    if (o.equals("Executive")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                title = "عادی";
            } else if (c2 == 1) {
                title = "اجرایی";
            } else if (c2 == 2) {
                title = "معاضدتی/تسخیری";
            } else if (c2 != 3) {
                title = "";
            } else {
                title = "بانکی";
            }
            EditText editText = this.input_case;
            editText.setText(title + " - " + ("تاریخ: " + com.lawyer_smartCalendar.p۱۳۱b.Ca.m۱۷۴۸۱a(Long.valueOf(Long.parseLong(case1.m۱۷۶۲۴j())))));
            this.input_case.setTextColor(Color.parseColor("#E65100"));
            this.f۱۴۰۸۱w = document.m۱۷۶۵۱a();
            this.input_case.setEnabled(false);
            this.f۱۴۰۷۰A = document.m۱۷۶۶۰d();
            String d = document.m۱۷۶۶۰d();
            switch (d.hashCode()) {
                case -37847475:
                    if (d.equals("MarriageCertificate")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 65074408:
                    if (d.equals("Check")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 76517104:
                    if (d.equals("Other")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 445109232:
                    if (d.equals("SejliDocument")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            if (c3 == 0) {
                this.input_document_type.setText("چک");
            } else if (c3 == 1) {
                this.input_document_type.setText("سند ازدواج");
            } else if (c3 == 2) {
                this.input_document_type.setText("اسناد سجلی");
            } else if (c3 == 3) {
                this.input_document_type.setText("سایر");
            }
            if (!document.m۱۷۶۶۴g().equals("")) {
                this.f۱۴۰۷۱B = document.m۱۷۶۶۴g();
                Cb mcurrentDate = new Cb();
                mcurrentDate.setTimeInMillis(Long.parseLong(document.m۱۷۶۶۴g()));
                this.input_date_received.setText(mcurrentDate.m۱۸۰۰۸c());
                this.input_date_received.setTextColor(Color.parseColor("#E65100"));
            } else {
                this.input_date_delivered.setText("");
                this.input_date_received.setText("");
                this.f۱۴۰۷۲C = "";
                this.f۱۴۰۷۱B = "";
            }
            if (!document.m۱۷۶۵۷c().equals("")) {
                this.f۱۴۰۷۲C = document.m۱۷۶۵۷c();
                Cb mcurrentDate2 = new Cb();
                mcurrentDate2.setTimeInMillis(Long.parseLong(document.m۱۷۶۵۷c()));
                this.input_date_delivered.setText(mcurrentDate2.m۱۸۰۰۸c());
                this.input_date_delivered.setTextColor(Color.parseColor("#E65100"));
            } else {
                this.f۱۴۰۷۲C = "";
                this.input_date_delivered.setText("");
            }
            this.input_document_note.setText(document.m۱۷۶۶۳f());
        }
        try {
            String frmStarter = getIntent().getStringExtra("frmStarter");
            String id = getIntent().getStringExtra("id");
            if (((frmStarter.hashCode() == 3046192 && frmStarter.equals("case")) ? (char) 0 : 65535) == 0) {
                this.f۱۴۰۸۲x.m۱۷۸۱۱n();
                com.lawyer_smartCalendar.p۱۳۳d.Cb case12 = this.f۱۴۰۸۲x.m۱۷۸۰۴k(id);
                com.lawyer_smartCalendar.p۱۳۳d.Cc client2 = this.f۱۴۰۸۲x.m۱۷۸۱۲o(case12.m۱۷۶۱۸g() + "");
                this.f۱۴۰۸۲x.close();
                this.input_client_name.setText(client2.m۱۷۶۴۴f());
                this.f۱۴۰۸۰v = client2.m۱۷۶۴۰d();
                this.input_client_name.setEnabled(false);
                String title2 = "";
                String o2 = case12.m۱۷۶۳۲o();
                switch (o2.hashCode()) {
                    case -1955878649:
                        if (o2.equals("Normal")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -888366013:
                        if (o2.equals("Challenge")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2062940:
                        if (o2.equals("Bank")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 912993224:
                        if (o2.equals("Executive")) {
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
                    title2 = "عادی";
                } else if (c == 1) {
                    title2 = "اجرایی";
                } else if (c == 2) {
                    title2 = "معاضدتی/تسخیری";
                } else if (c == 3) {
                    title2 = "بانکی";
                }
                EditText editText2 = this.input_case;
                editText2.setText(title2 + " - " + ("تاریخ: " + com.lawyer_smartCalendar.p۱۳۱b.Ca.m۱۷۴۸۱a(Long.valueOf(Long.parseLong(case12.m۱۷۶۲۴j())))));
                this.input_case.setTextColor(Color.parseColor("#E65100"));
                this.f۱۴۰۸۱w = case12.m۱۷۶۲۶k();
                this.input_case.setEnabled(false);
            }
        } catch (Exception e) {
        }
        if (savedInstanceState != null) {
            this.f۱۴۰۷۵F = (ArrayList) savedInstanceState.getSerializable("easy_image_photos_list");
        }
        this.f۱۴۰۷۴E = new Cp(this, this.recyclerView, this.f۱۴۰۷۵F);
        this.recyclerView.setLayoutManager(new GridLayoutManager((Context) this, 3, 1, false));
        this.recyclerView.setAdapter(this.f۱۴۰۷۴E);
        p۰۵۲b.p۰۶۲c.p۰۶۳a.Ca.m۱۵۹۱۷a().m۱۵۹۱۹a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, new Cc());
        Ca.Cc b = p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.m۱۹۶۲۸b(this);
        b.m۱۹۶۳۹a("DocumentImage");
        b.m۱۹۶۴۰a(false);
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientDocumentsActivity$b  reason: invalid class name */
    class View$OnClickListenerCb implements View.OnClickListener {
        View$OnClickListenerCb() {
        }

        public void onClick(View view) {
            AddClientDocumentsActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientDocumentsActivity$c  reason: invalid class name */
    class Cc extends AbstractCb {
        Cc() {
        }

        @Override // p۰۵۲b.p۰۶۲c.p۰۶۳a.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۲۵a() {
        }

        @Override // p۰۵۲b.p۰۶۲c.p۰۶۳a.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۲۶a(String permission) {
            Toast.makeText(AddClientDocumentsActivity.this, "لطفا دسترسی های لازم را به برنامه بدهید.", 0).show();
            AddClientDocumentsActivity.this.finish();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add_document /*{ENCODED_INT: 2131296342}*/:
                boolean hasError = false;
                if (this.f۱۴۰۸۰v == -1) {
                    this.input_client_name.setError("موکل را انتخاب کنید.");
                    hasError = true;
                }
                if (this.f۱۴۰۸۱w == -1) {
                    this.input_case.setError("پرونده را انتخاب کنید.");
                    hasError = true;
                }
                if (this.f۱۴۰۷۰A.equals("")) {
                    this.input_document_type.setError("نوع سند را انتخاب کنید.");
                    hasError = true;
                }
                if (this.f۱۴۰۷۱B.equals("")) {
                    this.input_date_received.setError("تاریخ دریافت سند را انتخاب کنید.");
                    hasError = true;
                }
                if (!hasError) {
                    if (!this.f۱۴۰۷۲C.equals("") && !this.f۱۴۰۷۱B.equals("")) {
                        Calendar calendar_received = Calendar.getInstance();
                        Calendar calendar_delivered = Calendar.getInstance();
                        Calendar.getInstance();
                        calendar_received.setTimeInMillis(Long.parseLong(this.f۱۴۰۷۱B));
                        calendar_delivered.setTimeInMillis(Long.parseLong(this.f۱۴۰۷۲C));
                        if (calendar_received.get(1) > calendar_delivered.get(1) || calendar_received.get(2) > calendar_delivered.get(2) || calendar_received.get(5) >= calendar_delivered.get(5)) {
                            new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(this, "error", "تاریخ تحویل باید جلوتر از تاریخ دریافت باشد.");
                            return;
                        }
                    }
                    com.lawyer_smartCalendar.p۱۳۳d.Cd clientDocument = new com.lawyer_smartCalendar.p۱۳۳d.Cd();
                    clientDocument.m۱۷۶۵۵b(this.f۱۴۰۸۰v);
                    clientDocument.m۱۷۶۵۲a(this.f۱۴۰۸۱w);
                    clientDocument.m۱۷۶۵۶b(this.f۱۴۰۷۰A);
                    clientDocument.m۱۷۶۶۱d(this.f۱۴۰۷۱B);
                    clientDocument.m۱۷۶۵۳a(this.f۱۴۰۷۲C);
                    clientDocument.m۱۷۶۵۹c(this.input_document_note.getText().toString());
                    this.f۱۴۰۸۲x.m۱۷۸۱۱n();
                    if (this.f۱۴۰۷۷s.equals("edit")) {
                        this.f۱۴۰۸۲x.m۱۷۷۵۸a(clientDocument, this.f۱۴۰۷۶r);
                        if (this.f۱۴۰۷۵F.size() > 0) {
                            this.f۱۴۰۸۲x.m۱۷۷۷۶a(this.f۱۴۰۷۶r, com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۲a);
                            List<com.lawyer_smartCalendar.model.File> photo_files = new ArrayList<>();
                            for (int i = 0; i < this.f۱۴۰۷۵F.size(); i++) {
                                com.lawyer_smartCalendar.p۱۳۳d.Ce file = new com.lawyer_smartCalendar.p۱۳۳d.Ce();
                                file.m۱۷۶۶۶a(Integer.parseInt(this.f۱۴۰۷۶r));
                                file.m۱۷۶۷۲c("");
                                file.m۱۷۶۶۷a(this.f۱۴۰۷۵F.get(i).getPath());
                                file.m۱۷۶۷۰b(com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۲a);
                                photo_files.add(file);
                            }
                            this.f۱۴۰۸۲x.m۱۷۷۷۷a((List<com.lawyer_smartCalendar.p۱۳۳d.Ce>) photo_files);
                        }
                        if (this.f۱۴۰۷۵F.size() == 0) {
                            this.f۱۴۰۸۲x.m۱۷۷۷۶a(this.f۱۴۰۷۶r, com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۲a);
                        }
                        new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(this, "success", "سند با موفقیت ویرایش شد.");
                    } else {
                        long doc_id = this.f۱۴۰۸۲x.m۱۷۷۵۷a(clientDocument);
                        if (this.f۱۴۰۷۵F.size() > 0) {
                            List<com.lawyer_smartCalendar.model.File> photo_files2 = new ArrayList<>();
                            for (int i2 = 0; i2 < this.f۱۴۰۷۵F.size(); i2++) {
                                com.lawyer_smartCalendar.p۱۳۳d.Ce file2 = new com.lawyer_smartCalendar.p۱۳۳d.Ce();
                                file2.m۱۷۶۶۶a((int) doc_id);
                                file2.m۱۷۶۷۲c("");
                                file2.m۱۷۶۶۷a(this.f۱۴۰۷۵F.get(i2).getPath());
                                file2.m۱۷۶۷۰b(com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۲a);
                                photo_files2.add(file2);
                            }
                            this.f۱۴۰۸۲x.m۱۷۷۷۷a((List<com.lawyer_smartCalendar.p۱۳۳d.Ce>) photo_files2);
                        }
                        new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(this, "success", "سند با موفقیت ثبت شد.");
                    }
                    this.f۱۴۰۸۲x.close();
                    setResult(-1);
                    finish();
                    return;
                }
                return;
            case R.id.btn_add_image /*{ENCODED_INT: 2131296344}*/:
                View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(this);
                dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar.m۱۵۸۶۸d(this.f۱۴۰۷۳D);
                dVar.m۱۵۸۵۸b(this.f۱۴۰۷۳D);
                dVar.m۱۵۸۶۳c(this.f۱۴۰۷۳D);
                dVar.m۱۵۸۵۸b(this.f۱۴۰۷۳D);
                dVar.m۱۵۸۷۱e("انتخاب تصویر");
                dVar.m۱۵۸۴۱a(R.array.select_image_items);
                dVar.m۱۵۸۴۲a(-1, new Ci());
                dVar.m۱۵۸۶۶c();
                return;
            case R.id.img_clear_date /*{ENCODED_INT: 2131296476}*/:
                this.f۱۴۰۷۲C = "";
                this.input_date_delivered.setText("");
                return;
            case R.id.input_case /*{ENCODED_INT: 2131296493}*/:
                if (this.f۱۴۰۸۰v == -1) {
                    new com.lawyer_smartCalendar.utils.Ch().m۱۷۷۵۳a(this, "error", "ابتدا یک موکل انتخاب کنید.");
                    return;
                }
                this.input_case.setError(null);
                View viewCase = getLayoutInflater().inflate(R.layout.bottom_sheet_select_case, (ViewGroup) null);
                RecyclerView mRecyclerView_case = (RecyclerView) viewCase.findViewById(R.id.recyclerView_case);
                mRecyclerView_case.setLayoutManager(new LinearLayoutManager(this));
                this.f۱۴۰۸۲x.m۱۷۸۱۱n();
                List<Case> caseList = this.f۱۴۰۸۲x.m۱۷۷۶۲a(this.f۱۴۰۸۰v);
                this.f۱۴۰۸۲x.close();
                if (caseList.size() > 0) {
                    mRecyclerView_case.setAdapter(new Cr(this, "AddClientDocumentsActivity", caseList));
                    this.f۱۴۰۸۴z = new DialogCe(this);
                    this.f۱۴۰۸۴z.setContentView(viewCase);
                    this.f۱۴۰۸۴z.show();
                    return;
                }
                View$OnClickListenerCf.Cd dVar2 = new View$OnClickListenerCf.Cd(this);
                dVar2.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar2.m۱۵۸۵۸b(this.f۱۴۰۷۳D);
                dVar2.m۱۵۸۴۷a(this.f۱۴۰۷۳D);
                dVar2.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar2.m۱۵۸۵۰a("هیچ پرونده ای برای این موکل ثبت نشده است.برای انجام این عملیات یک پرونده ثبت کنید.");
                dVar2.m۱۵۸۷۲f(R.color.dialogCancelColor);
                dVar2.m۱۵۸۵۶b(R.color.colorPrimaryDark);
                dVar2.m۱۵۸۶۹d("فعلا نه");
                dVar2.m۱۵۸۶۰b("ثبت پرونده");
                dVar2.m۱۵۸۶۴c(new Cg(this));
                dVar2.m۱۵۸۴۸a(new Cf());
                dVar2.m۱۵۸۶۶c();
                return;
            case R.id.input_client_name /*{ENCODED_INT: 2131296504}*/:
                this.input_client_name.setError(null);
                View viewClient = getLayoutInflater().inflate(R.layout.bottom_sheet_select_clinet, (ViewGroup) null);
                RecyclerView mRecyclerView_client = (RecyclerView) viewClient.findViewById(R.id.recyclerView_client);
                mRecyclerView_client.setLayoutManager(new LinearLayoutManager(this));
                this.f۱۴۰۸۲x.m۱۷۸۱۱n();
                List<Client> clientList = this.f۱۴۰۸۲x.m۱۷۸۰۱i();
                this.f۱۴۰۸۲x.close();
                if (clientList.size() > 0) {
                    mRecyclerView_client.setAdapter(new Cs(this, "AddClientDocumentsActivity", clientList));
                    this.f۱۴۰۸۳y = new DialogCe(this);
                    this.f۱۴۰۸۳y.setContentView(viewClient);
                    this.f۱۴۰۸۳y.show();
                    return;
                }
                View$OnClickListenerCf.Cd dVar3 = new View$OnClickListenerCf.Cd(this);
                dVar3.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar3.m۱۵۸۵۸b(this.f۱۴۰۷۳D);
                dVar3.m۱۵۸۴۷a(this.f۱۴۰۷۳D);
                dVar3.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar3.m۱۵۸۵۰a("هیچ موکلی ثبت نشده است.برای انجام این عملیات یک موکل ثبت کنید.");
                dVar3.m۱۵۸۷۲f(R.color.dialogCancelColor);
                dVar3.m۱۵۸۵۶b(R.color.colorPrimaryDark);
                dVar3.m۱۵۸۶۹d("فعلا نه");
                dVar3.m۱۵۸۶۰b("ثبت موکل");
                dVar3.m۱۵۸۶۴c(new Ce(this));
                dVar3.m۱۵۸۴۸a(new Cd());
                dVar3.m۱۵۸۶۶c();
                return;
            case R.id.input_date_delivered /*{ENCODED_INT: 2131296513}*/:
                this.input_date_delivered.setError(null);
                this.f۱۴۰۷۸t = new Cb();
                this.f۱۴۰۷۹u = DialogFragmentCb.m۱۷۹۱۲b(this, this.f۱۴۰۷۸t.m۱۸۰۱۳h(), this.f۱۴۰۷۸t.m۱۸۰۰۹d(), this.f۱۴۰۷۸t.m۱۸۰۰۷b());
                this.f۱۴۰۷۹u.show(getFragmentManager(), "input_date_delivered");
                return;
            case R.id.input_date_received /*{ENCODED_INT: 2131296515}*/:
                this.input_date_received.setError(null);
                this.f۱۴۰۷۸t = new Cb();
                this.f۱۴۰۷۹u = DialogFragmentCb.m۱۷۹۱۲b(this, this.f۱۴۰۷۸t.m۱۸۰۱۳h(), this.f۱۴۰۷۸t.m۱۸۰۰۹d(), this.f۱۴۰۷۸t.m۱۸۰۰۷b());
                this.f۱۴۰۷۹u.show(getFragmentManager(), "input_date_received");
                return;
            case R.id.input_document_type /*{ENCODED_INT: 2131296518}*/:
                this.input_document_type.setError(null);
                View$OnClickListenerCf.Cd dVar4 = new View$OnClickListenerCf.Cd(this);
                dVar4.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar4.m۱۵۸۶۸d(this.f۱۴۰۷۳D);
                dVar4.m۱۵۸۵۸b(this.f۱۴۰۷۳D);
                dVar4.m۱۵۸۶۳c(this.f۱۴۰۷۳D);
                dVar4.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar4.m۱۵۸۵۸b(this.f۱۴۰۷۳D);
                dVar4.m۱۵۸۷۱e("نوع سند");
                dVar4.m۱۵۸۴۱a(R.array.document_title_type_item);
                dVar4.m۱۵۸۴۲a(-1, new Ch());
                dVar4.m۱۵۸۶۶c();
                return;
            default:
                return;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientDocumentsActivity$e  reason: invalid class name */
    class Ce implements View$OnClickListenerCf.AbstractCm {
        Ce(AddClientDocumentsActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۲۸a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientDocumentsActivity$d  reason: invalid class name */
    class Cd implements View$OnClickListenerCf.AbstractCm {
        Cd() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۲۷a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
            Intent frm_add_client = new Intent(AddClientDocumentsActivity.this, AddClientActivity.class);
            frm_add_client.putExtra("frmMode", "add");
            AddClientDocumentsActivity.this.startActivity(frm_add_client);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientDocumentsActivity$g  reason: invalid class name */
    class Cg implements View$OnClickListenerCf.AbstractCm {
        Cg(AddClientDocumentsActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۳۰a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientDocumentsActivity$f  reason: invalid class name */
    class Cf implements View$OnClickListenerCf.AbstractCm {
        Cf() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۲۹a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
            Intent frm_add_case = new Intent(AddClientDocumentsActivity.this, AddCaseActivity.class);
            frm_add_case.putExtra("frmMode", "add");
            AddClientDocumentsActivity.this.startActivity(frm_add_case);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientDocumentsActivity$h  reason: invalid class name */
    class Ch implements View$OnClickListenerCf.AbstractCj {
        Ch() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۳۳۱a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
            AddClientDocumentsActivity.this.input_document_type.setText(text);
            if (which == 0) {
                AddClientDocumentsActivity.this.f۱۴۰۷۰A = "Check";
            } else if (which == 1) {
                AddClientDocumentsActivity.this.f۱۴۰۷۰A = "MarriageCertificate";
            } else if (which == 2) {
                AddClientDocumentsActivity.this.f۱۴۰۷۰A = "SejliDocument";
            } else if (which == 3) {
                AddClientDocumentsActivity.this.f۱۴۰۷۰A = "Other";
            }
            return true;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddClientDocumentsActivity$i  reason: invalid class name */
    class Ci implements View$OnClickListenerCf.AbstractCj {
        Ci() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۳۳۲a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
            if (which == 0) {
                p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.m۱۹۶۲۹b((Activity) AddClientDocumentsActivity.this, 0);
            } else if (which == 1) {
                p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.m۱۹۶۲۱a((Activity) AddClientDocumentsActivity.this, 0);
            }
            return true;
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
            case R.id.input_date_delivered /*{ENCODED_INT: 2131296513}*/:
                if (focused) {
                    this.input_date_delivered.setError(null);
                    this.input_date_delivered.callOnClick();
                    return;
                }
                return;
            case R.id.input_date_received /*{ENCODED_INT: 2131296515}*/:
                if (focused) {
                    this.input_date_received.setError(null);
                    this.input_date_received.callOnClick();
                    return;
                }
                return;
            case R.id.input_document_type /*{ENCODED_INT: 2131296518}*/:
                if (focused) {
                    this.input_document_type.setError(null);
                    this.input_document_type.callOnClick();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    public void m۱۷۳۲۰m() {
        this.f۱۴۰۸۳y.dismiss();
    }

    /* renamed from: n  reason: contains not printable characters */
    public void m۱۷۳۲۱n() {
        this.f۱۴۰۸۴z.dismiss();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۳۱۹a(com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb r6, int r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.AddClientDocumentsActivity.m۱۷۳۱۹a(com.mohamadamin.persianmaterialdatetimepicker.date.b, int, int, int):void");
    }
}
