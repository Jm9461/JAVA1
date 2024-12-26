package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.DialogCe;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.LinearLayoutManager;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import cafe.adriel.androidaudiorecorder.p۱۲۸j.EnumCa;
import cafe.adriel.androidaudiorecorder.p۱۲۸j.EnumCc;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.model.Case;
import com.lawyer_smartCalendar.model.Client;
import com.lawyer_smartCalendar.p۱۳۰a.Cr;
import com.lawyer_smartCalendar.p۱۳۰a.Cs;
import com.lawyer_smartCalendar.utils.Ch;
import com.lawyer_smartCalendar.utils.Ci;
import com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb;
import com.rey.material.widget.Button;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۰۵۲b.p۰۶۲c.p۰۶۳a.AbstractCb;
import p۰۵۲b.p۱۱۶k.p۱۱۷a.Ca;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AddDailyActivity extends ActivityCe implements View.OnClickListener, View.OnFocusChangeListener, DialogFragmentCb.AbstractCd {

    /* renamed from: G  reason: contains not printable characters */
    private static final String f۱۴۰۹۲G = (Environment.getExternalStorageDirectory().getPath() + "/recorded_audio.wav");

    /* renamed from: A  reason: contains not printable characters */
    private String f۱۴۰۹۳A = "";

    /* renamed from: B  reason: contains not printable characters */
    private String f۱۴۰۹۴B = "";

    /* renamed from: C  reason: contains not printable characters */
    private EnumCe f۱۴۰۹۵C = EnumCe.END;

    /* renamed from: D  reason: contains not printable characters */
    private Ca f۱۴۰۹۶D;

    /* renamed from: E  reason: contains not printable characters */
    private com.lawyer_smartCalendar.p۱۳۰a.Cc f۱۴۰۹۷E;

    /* renamed from: F  reason: contains not printable characters */
    private ArrayList<File> f۱۴۰۹۸F = new ArrayList<>();
    public LinearLayout TextInputLayout_case;
    public LinearLayout TextInputLayout_client;
    public Button btn_add_audio;
    public Button btn_add_note;
    public EditText input_case;
    public EditText input_client_name;
    public EditText input_note_body;
    public EditText input_note_date;
    public EditText input_note_title;
    public EditText input_note_type;

    /* renamed from: r  reason: contains not printable characters */
    private String f۱۴۰۹۹r = "";
    public RecyclerView recyclerView;

    /* renamed from: s  reason: contains not printable characters */
    private String f۱۴۱۰۰s = "add";

    /* renamed from: t  reason: contains not printable characters */
    private com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb f۱۴۱۰۱t;

    /* renamed from: u  reason: contains not printable characters */
    private DialogFragmentCb f۱۴۱۰۲u;

    /* renamed from: v  reason: contains not printable characters */
    public int f۱۴۱۰۳v = -1;

    /* renamed from: w  reason: contains not printable characters */
    public int f۱۴۱۰۴w = -1;

    /* renamed from: x  reason: contains not printable characters */
    private Ci f۱۴۱۰۵x;

    /* renamed from: y  reason: contains not printable characters */
    private DialogCe f۱۴۱۰۶y;

    /* renamed from: z  reason: contains not printable characters */
    private DialogCe f۱۴۱۰۷z;

    @Override // android.support.p۰۴۳v4.app.Ca.AbstractCb, android.support.p۰۴۳v4.app.ActivityCg
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        p۰۵۲b.p۰۶۲c.p۰۶۳a.Ca.m۱۵۹۱۷a().m۱۵۹۲۰a(permissions, grantResults);
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("audio_list", this.f۱۴۰۹۸F);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۷۳۳۴a(File returnedAudio) {
        this.f۱۴۰۹۸F.add(returnedAudio);
        this.f۱۴۰۹۷E.m۱۴۴۵۰d();
        this.recyclerView.m۱۴۳۳۱h(this.f۱۴۰۹۸F.size() - 1);
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onBackPressed() {
        if (this.f۱۴۰۹۸F.size() > 0 && this.f۱۴۱۰۰s.equals("add")) {
            for (int i = 0; i < this.f۱۴۰۹۸F.size(); i++) {
                this.f۱۴۰۹۶D.m۱۶۵۱۹b(this.f۱۴۰۹۸F.get(i).getPath());
            }
        }
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_add) {
            this.btn_add_note.callOnClick();
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
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 200) {
            return;
        }
        if (resultCode == -1) {
            String AUDIO_DESTINATION_FILE_PATH = this.f۱۴۰۹۶D.m۱۶۵۱۶a() + "/" + getPackageName() + "/audio/";
            this.f۱۴۰۹۶D.m۱۶۵۱۷a(AUDIO_DESTINATION_FILE_PATH);
            com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb persianCalendar = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
            String NewFilePath = AUDIO_DESTINATION_FILE_PATH + "audio(" + persianCalendar.getTimeInMillis() + ").wav";
            this.f۱۴۰۹۶D.m۱۶۵۱۸a(f۱۴۰۹۲G, NewFilePath);
            m۱۷۳۳۴a(new File(Uri.decode(NewFilePath)));
        } else if (resultCode == 0) {
            Toast.makeText(this, "ضبط صدا انجام نشد.", 0).show();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x02c9  */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
        // Method dump skipped, instructions count: 858
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.AddDailyActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddDailyActivity$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View view) {
            AddDailyActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddDailyActivity$b  reason: invalid class name */
    class Cb extends AbstractCb {
        Cb() {
        }

        @Override // p۰۵۲b.p۰۶۲c.p۰۶۳a.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۳۷a() {
        }

        @Override // p۰۵۲b.p۰۶۲c.p۰۶۳a.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۳۸a(String permission) {
            Toast.makeText(AddDailyActivity.this, "لطفا دسترسی های لازم را به برنامه بدهید.", 0).show();
            AddDailyActivity.this.finish();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add_audio /*{ENCODED_INT: 2131296339}*/:
                m۱۷۳۳۶m();
                return;
            case R.id.btn_add_note /*{ENCODED_INT: 2131296346}*/:
                boolean hasError = false;
                if (this.input_note_title.getText().toString().equals("")) {
                    this.input_note_title.setError("عنوان یادداشت را وارد کنید.");
                    hasError = true;
                }
                if (this.f۱۴۰۹۳A.equals("")) {
                    this.input_note_type.setError("نوع یادداشت را انتخاب کنید.");
                    hasError = true;
                }
                if (this.f۱۴۱۰۳v == -1 && !this.f۱۴۰۹۳A.equals("Other")) {
                    this.input_client_name.setError("موکل را انتخاب کنید.");
                    hasError = true;
                }
                if (this.f۱۴۱۰۴w == -1 && !this.f۱۴۰۹۳A.equals("Other")) {
                    this.input_case.setError("پرونده را انتخاب کنید.");
                    hasError = true;
                }
                if (this.f۱۴۰۹۴B.equals("")) {
                    this.input_note_date.setError("تاریخ یادداشت را انتخاب کنید.");
                    hasError = true;
                }
                if (this.input_note_body.getText().toString().equals("")) {
                    this.input_note_body.setError("متن یادداشت را وارد کنید.");
                    hasError = true;
                }
                if (!hasError) {
                    com.lawyer_smartCalendar.p۱۳۳d.Cf note = new com.lawyer_smartCalendar.p۱۳۳d.Cf();
                    note.m۱۷۶۸۴d(this.input_note_title.getText().toString());
                    note.m۱۷۶۸۲c(this.f۱۴۰۹۳A);
                    note.m۱۷۶۷۸b(this.f۱۴۱۰۳v);
                    note.m۱۷۶۷۵a(this.f۱۴۱۰۴w);
                    note.m۱۷۶۷۶a(this.f۱۴۰۹۴B);
                    note.m۱۷۶۷۹b(this.input_note_body.getText().toString());
                    this.f۱۴۱۰۵x.m۱۷۸۱۱n();
                    if (this.f۱۴۱۰۰s.equals("edit")) {
                        this.f۱۴۱۰۵x.m۱۷۷۷۱a(note, this.f۱۴۰۹۹r);
                        if (this.f۱۴۰۹۸F.size() > 0) {
                            this.f۱۴۱۰۵x.m۱۷۷۷۶a(this.f۱۴۰۹۹r, com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۳b);
                            List<com.lawyer_smartCalendar.model.File> audio_files = new ArrayList<>();
                            for (int i = 0; i < this.f۱۴۰۹۸F.size(); i++) {
                                com.lawyer_smartCalendar.p۱۳۳d.Ce file = new com.lawyer_smartCalendar.p۱۳۳d.Ce();
                                file.m۱۷۶۶۶a(Integer.parseInt(this.f۱۴۰۹۹r));
                                file.m۱۷۶۷۲c("");
                                file.m۱۷۶۶۷a(this.f۱۴۰۹۸F.get(i).getPath());
                                file.m۱۷۶۷۰b(com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۳b);
                                audio_files.add(file);
                            }
                            this.f۱۴۱۰۵x.m۱۷۷۷۷a((List<com.lawyer_smartCalendar.p۱۳۳d.Ce>) audio_files);
                        }
                        if (this.f۱۴۰۹۸F.size() == 0) {
                            this.f۱۴۱۰۵x.m۱۷۷۷۶a(this.f۱۴۰۹۹r, com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۳b);
                        }
                        new Ch().m۱۷۷۵۳a(this, "success", "یادداشت با موفقیت ویرایش شد.");
                    } else {
                        long doc_id = this.f۱۴۱۰۵x.m۱۷۷۵۹a(note);
                        if (this.f۱۴۰۹۸F.size() > 0) {
                            List<com.lawyer_smartCalendar.model.File> audio_files2 = new ArrayList<>();
                            for (int i2 = 0; i2 < this.f۱۴۰۹۸F.size(); i2++) {
                                com.lawyer_smartCalendar.p۱۳۳d.Ce file2 = new com.lawyer_smartCalendar.p۱۳۳d.Ce();
                                file2.m۱۷۶۶۶a((int) doc_id);
                                file2.m۱۷۶۷۲c("");
                                file2.m۱۷۶۶۷a(this.f۱۴۰۹۸F.get(i2).getPath());
                                file2.m۱۷۶۷۰b(com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۳b);
                                audio_files2.add(file2);
                            }
                            this.f۱۴۱۰۵x.m۱۷۷۷۷a((List<com.lawyer_smartCalendar.p۱۳۳d.Ce>) audio_files2);
                        }
                        new Ch().m۱۷۷۵۳a(this, "success", "یادداشت با موفقیت ثبت شد.");
                    }
                    this.f۱۴۱۰۵x.close();
                    setResult(-1);
                    finish();
                    return;
                }
                return;
            case R.id.input_case /*{ENCODED_INT: 2131296493}*/:
                if (this.f۱۴۱۰۳v == -1) {
                    new Ch().m۱۷۷۵۳a(this, "error", "ابتدا یک موکل انتخاب کنید.");
                    return;
                }
                this.input_case.setError(null);
                View viewCase = getLayoutInflater().inflate(R.layout.bottom_sheet_select_case, (ViewGroup) null);
                RecyclerView mRecyclerView_case = (RecyclerView) viewCase.findViewById(R.id.recyclerView_case);
                mRecyclerView_case.setLayoutManager(new LinearLayoutManager(this));
                this.f۱۴۱۰۵x.m۱۷۸۱۱n();
                List<Case> caseList = this.f۱۴۱۰۵x.m۱۷۷۶۲a(this.f۱۴۱۰۳v);
                this.f۱۴۱۰۵x.close();
                if (caseList.size() > 0) {
                    mRecyclerView_case.setAdapter(new Cr(this, "AddNoteActivity", caseList));
                    this.f۱۴۱۰۷z = new DialogCe(this);
                    this.f۱۴۱۰۷z.setContentView(viewCase);
                    this.f۱۴۱۰۷z.show();
                    return;
                }
                View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(this);
                dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar.m۱۵۸۵۸b(this.f۱۴۰۹۵C);
                dVar.m۱۵۸۴۷a(this.f۱۴۰۹۵C);
                dVar.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar.m۱۵۸۵۰a("هیچ پرونده ای برای این موکل ثبت نشده است.برای انجام این عملیات یک پرونده ثبت کنید.");
                dVar.m۱۵۸۷۲f(R.color.dialogCancelColor);
                dVar.m۱۵۸۵۶b(R.color.colorPrimaryDark);
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
                this.f۱۴۱۰۵x.m۱۷۸۱۱n();
                List<Client> clientList = this.f۱۴۱۰۵x.m۱۷۸۰۱i();
                this.f۱۴۱۰۵x.close();
                if (clientList.size() > 0) {
                    mRecyclerView_client.setAdapter(new Cs(this, "AddNoteActivity", clientList));
                    this.f۱۴۱۰۶y = new DialogCe(this);
                    this.f۱۴۱۰۶y.setContentView(viewClient);
                    this.f۱۴۱۰۶y.show();
                    return;
                }
                View$OnClickListenerCf.Cd dVar2 = new View$OnClickListenerCf.Cd(this);
                dVar2.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar2.m۱۵۸۵۸b(this.f۱۴۰۹۵C);
                dVar2.m۱۵۸۴۷a(this.f۱۴۰۹۵C);
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
            case R.id.input_note_date /*{ENCODED_INT: 2131296535}*/:
                this.input_note_date.setError(null);
                this.f۱۴۱۰۱t = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
                this.f۱۴۱۰۲u = DialogFragmentCb.m۱۷۹۱۲b(this, this.f۱۴۱۰۱t.m۱۸۰۱۳h(), this.f۱۴۱۰۱t.m۱۸۰۰۹d(), this.f۱۴۱۰۱t.m۱۸۰۰۷b());
                this.f۱۴۱۰۲u.show(getFragmentManager(), "input_date_note");
                return;
            case R.id.input_note_type /*{ENCODED_INT: 2131296537}*/:
                this.input_note_type.setError(null);
                View$OnClickListenerCf.Cd dVar3 = new View$OnClickListenerCf.Cd(this);
                dVar3.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar3.m۱۵۸۶۸d(this.f۱۴۰۹۵C);
                dVar3.m۱۵۸۵۸b(this.f۱۴۰۹۵C);
                dVar3.m۱۵۸۶۳c(this.f۱۴۰۹۵C);
                dVar3.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar3.m۱۵۸۵۸b(this.f۱۴۰۹۵C);
                dVar3.m۱۵۸۷۱e("نوع یادداشت");
                dVar3.m۱۵۸۴۱a(R.array.note_type_item);
                dVar3.m۱۵۸۴۲a(-1, new Cg());
                dVar3.m۱۵۸۶۶c();
                return;
            default:
                return;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddDailyActivity$d  reason: invalid class name */
    class Cd implements View$OnClickListenerCf.AbstractCm {
        Cd(AddDailyActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۴۰a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddDailyActivity$c  reason: invalid class name */
    class Cc implements View$OnClickListenerCf.AbstractCm {
        Cc() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۳۹a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
            Intent frm_add_client = new Intent(AddDailyActivity.this, AddClientActivity.class);
            frm_add_client.putExtra("frmMode", "add");
            AddDailyActivity.this.startActivity(frm_add_client);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddDailyActivity$f  reason: invalid class name */
    class Cf implements View$OnClickListenerCf.AbstractCm {
        Cf(AddDailyActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۴۲a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddDailyActivity$e  reason: invalid class name */
    class Ce implements View$OnClickListenerCf.AbstractCm {
        Ce() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۴۱a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
            Intent frm_add_case = new Intent(AddDailyActivity.this, AddCaseActivity.class);
            frm_add_case.putExtra("frmMode", "add");
            AddDailyActivity.this.startActivity(frm_add_case);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddDailyActivity$g  reason: invalid class name */
    class Cg implements View$OnClickListenerCf.AbstractCj {
        Cg() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۳۴۳a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
            AddDailyActivity.this.input_note_type.setText(text);
            if (which == 0) {
                AddDailyActivity.this.TextInputLayout_client.setVisibility(0);
                AddDailyActivity.this.TextInputLayout_case.setVisibility(0);
                AddDailyActivity.this.f۱۴۰۹۳A = "ClientCase";
            } else if (which == 1) {
                AddDailyActivity.this.TextInputLayout_client.setVisibility(8);
                AddDailyActivity.this.TextInputLayout_case.setVisibility(8);
                AddDailyActivity addDailyActivity = AddDailyActivity.this;
                addDailyActivity.f۱۴۱۰۳v = -1;
                addDailyActivity.f۱۴۱۰۴w = -1;
                addDailyActivity.input_case.setText("");
                AddDailyActivity.this.input_client_name.setText("");
                AddDailyActivity.this.f۱۴۰۹۳A = "Other";
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
            case R.id.input_note_date /*{ENCODED_INT: 2131296535}*/:
                if (focused) {
                    this.input_note_date.setError(null);
                    this.input_note_date.callOnClick();
                    return;
                }
                return;
            case R.id.input_note_type /*{ENCODED_INT: 2131296537}*/:
                if (focused) {
                    this.input_note_type.setError(null);
                    this.input_note_type.callOnClick();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    public void m۱۷۳۳۶m() {
        cafe.adriel.androidaudiorecorder.Ca a = cafe.adriel.androidaudiorecorder.Ca.m۱۶۶۴۸a(this);
        a.m۱۶۶۵۳a(f۱۴۰۹۲G);
        a.m۱۶۶۴۹a(Color.parseColor(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۴۱d()));
        a.m۱۶۶۵۶b(200);
        a.m۱۶۶۵۲a(EnumCc.MIC);
        a.m۱۶۶۵۰a(EnumCa.STEREO);
        a.m۱۶۶۵۱a(cafe.adriel.androidaudiorecorder.p۱۲۸j.EnumCb.HZ_48000);
        a.m۱۶۶۵۴a(false);
        a.m۱۶۶۵۷b(true);
        a.m۱۶۶۵۵a();
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۳۳۵a(DialogFragmentCb view, int year, int monthOfYear, int dayOfMonth) {
        com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb mcurrentDate = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
        mcurrentDate.m۱۸۰۰۶a(year, monthOfYear, dayOfMonth);
        String tag = this.f۱۴۱۰۲u.getTag();
        if (((tag.hashCode() == -707218514 && tag.equals("input_date_note")) ? (char) 0 : 65535) == 0) {
            this.input_note_date.setText(mcurrentDate.m۱۸۰۰۸c());
            this.input_note_date.setTextColor(Color.parseColor("#E65100"));
            this.f۱۴۰۹۴B = mcurrentDate.getTimeInMillis() + "";
        }
    }
}
