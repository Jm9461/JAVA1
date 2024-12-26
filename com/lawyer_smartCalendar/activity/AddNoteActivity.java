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
import com.mohamadamin.persianmaterialdatetimepicker.time.DialogFragmentCe;
import com.mohamadamin.persianmaterialdatetimepicker.time.RadialPickerLayout;
import com.rey.material.widget.Button;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۰۵۲b.p۰۶۲c.p۰۶۳a.AbstractCb;
import p۰۵۲b.p۱۱۶k.p۱۱۷a.Ca;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AddNoteActivity extends ActivityCe implements View.OnClickListener, View.OnFocusChangeListener, DialogFragmentCb.AbstractCd, DialogFragmentCe.AbstractCh {

    /* renamed from: G  reason: contains not printable characters */
    private static final String f۱۴۱۳۵G = (Environment.getExternalStorageDirectory().getPath() + "/recorded_audio.wav");

    /* renamed from: A  reason: contains not printable characters */
    private String f۱۴۱۳۶A = "";

    /* renamed from: B  reason: contains not printable characters */
    private String f۱۴۱۳۷B = "";

    /* renamed from: C  reason: contains not printable characters */
    private EnumCe f۱۴۱۳۸C = EnumCe.END;

    /* renamed from: D  reason: contains not printable characters */
    private Ca f۱۴۱۳۹D;

    /* renamed from: E  reason: contains not printable characters */
    private com.lawyer_smartCalendar.p۱۳۰a.Cc f۱۴۱۴۰E;

    /* renamed from: F  reason: contains not printable characters */
    private ArrayList<File> f۱۴۱۴۱F = new ArrayList<>();
    public LinearLayout TextInputLayout_case;
    public LinearLayout TextInputLayout_client;
    public Button btn_add_audio;
    public Button btn_add_note;
    public EditText input_case;
    public EditText input_client_name;
    public EditText input_date_hour;
    public EditText input_note_body;
    public EditText input_note_date;
    public EditText input_note_title;
    public EditText input_note_type;

    /* renamed from: r  reason: contains not printable characters */
    private String f۱۴۱۴۲r = "";
    public RecyclerView recyclerView;

    /* renamed from: s  reason: contains not printable characters */
    private String f۱۴۱۴۳s = "add";

    /* renamed from: t  reason: contains not printable characters */
    private com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb f۱۴۱۴۴t;

    /* renamed from: u  reason: contains not printable characters */
    private DialogFragmentCb f۱۴۱۴۵u;

    /* renamed from: v  reason: contains not printable characters */
    public int f۱۴۱۴۶v = -1;

    /* renamed from: w  reason: contains not printable characters */
    public int f۱۴۱۴۷w = -1;

    /* renamed from: x  reason: contains not printable characters */
    private Ci f۱۴۱۴۸x;

    /* renamed from: y  reason: contains not printable characters */
    private DialogCe f۱۴۱۴۹y;

    /* renamed from: z  reason: contains not printable characters */
    private DialogCe f۱۴۱۵۰z;

    @Override // android.support.p۰۴۳v4.app.Ca.AbstractCb, android.support.p۰۴۳v4.app.ActivityCg
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        p۰۵۲b.p۰۶۲c.p۰۶۳a.Ca.m۱۵۹۱۷a().m۱۵۹۲۰a(permissions, grantResults);
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("audio_list", this.f۱۴۱۴۱F);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۷۳۵۹a(File returnedAudio) {
        this.f۱۴۱۴۱F.add(returnedAudio);
        this.f۱۴۱۴۰E.m۱۴۴۵۰d();
        this.recyclerView.m۱۴۳۳۱h(this.f۱۴۱۴۱F.size() - 1);
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onBackPressed() {
        if (this.f۱۴۱۴۱F.size() > 0 && this.f۱۴۱۴۳s.equals("add")) {
            for (int i = 0; i < this.f۱۴۱۴۱F.size(); i++) {
                this.f۱۴۱۳۹D.m۱۶۵۱۹b(this.f۱۴۱۴۱F.get(i).getPath());
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
            String AUDIO_DESTINATION_FILE_PATH = this.f۱۴۱۳۹D.m۱۶۵۱۶a() + "/" + getPackageName() + "/audio/";
            this.f۱۴۱۳۹D.m۱۶۵۱۷a(AUDIO_DESTINATION_FILE_PATH);
            com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb persianCalendar = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
            String NewFilePath = AUDIO_DESTINATION_FILE_PATH + "audio(" + persianCalendar.getTimeInMillis() + ").wav";
            this.f۱۴۱۳۹D.m۱۶۵۱۸a(f۱۴۱۳۵G, NewFilePath);
            m۱۷۳۵۹a(new File(Uri.decode(NewFilePath)));
        } else if (resultCode == 0) {
            Toast.makeText(this, "ضبط صدا انجام نشد.", 0).show();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x039d A[Catch:{ Exception -> 0x04da }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x03e1 A[Catch:{ Exception -> 0x04da }] */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
        // Method dump skipped, instructions count: 1360
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.AddNoteActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddNoteActivity$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View view) {
            AddNoteActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddNoteActivity$b  reason: invalid class name */
    class Cb extends AbstractCb {
        Cb() {
        }

        @Override // p۰۵۲b.p۰۶۲c.p۰۶۳a.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۶۵a() {
        }

        @Override // p۰۵۲b.p۰۶۲c.p۰۶۳a.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۶۶a(String permission) {
            Toast.makeText(AddNoteActivity.this, "لطفا دسترسی های لازم را به برنامه بدهید.", 0).show();
            AddNoteActivity.this.finish();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add_audio /*{ENCODED_INT: 2131296339}*/:
                m۱۷۳۶۴o();
                return;
            case R.id.btn_add_note /*{ENCODED_INT: 2131296346}*/:
                boolean hasError = false;
                if (this.input_note_title.getText().toString().equals("")) {
                    this.input_note_title.setError("عنوان یادداشت را وارد کنید.");
                    hasError = true;
                }
                if (this.f۱۴۱۳۶A.equals("")) {
                    this.input_note_type.setError("نوع یادداشت را انتخاب کنید.");
                    hasError = true;
                }
                if (this.f۱۴۱۴۶v == -1 && this.f۱۴۱۳۶A.equals("ClientCase")) {
                    this.input_client_name.setError("موکل را انتخاب کنید.");
                    hasError = true;
                }
                if (this.f۱۴۱۴۷w == -1 && this.f۱۴۱۳۶A.equals("ClientCase")) {
                    this.input_case.setError("پرونده را انتخاب کنید.");
                    hasError = true;
                }
                if (this.f۱۴۱۳۷B.equals("")) {
                    this.input_note_date.setError("تاریخ یادداشت را انتخاب کنید.");
                    hasError = true;
                }
                if (this.input_date_hour.getText().toString().equals("")) {
                    this.input_date_hour.setError("ساعت یادداشت را انتخاب کنید.");
                    hasError = true;
                }
                if (this.input_note_body.getText().toString().equals("")) {
                    this.input_note_body.setError("متن یادداشت را وارد کنید.");
                    hasError = true;
                }
                if (!hasError) {
                    com.lawyer_smartCalendar.p۱۳۳d.Cf note = new com.lawyer_smartCalendar.p۱۳۳d.Cf();
                    note.m۱۷۶۸۴d(this.input_note_title.getText().toString());
                    note.m۱۷۶۸۲c(this.f۱۴۱۳۶A);
                    note.m۱۷۶۷۸b(this.f۱۴۱۴۶v);
                    note.m۱۷۶۷۵a(this.f۱۴۱۴۷w);
                    note.m۱۷۶۷۶a(this.f۱۴۱۳۷B);
                    note.m۱۷۶۷۹b(this.input_note_body.getText().toString());
                    this.f۱۴۱۴۸x.m۱۷۸۱۱n();
                    if (this.f۱۴۱۴۳s.equals("edit")) {
                        this.f۱۴۱۴۸x.m۱۷۷۷۱a(note, this.f۱۴۱۴۲r);
                        if (this.f۱۴۱۴۱F.size() > 0) {
                            this.f۱۴۱۴۸x.m۱۷۷۷۶a(this.f۱۴۱۴۲r, com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۳b);
                            List<com.lawyer_smartCalendar.model.File> audio_files = new ArrayList<>();
                            for (int i = 0; i < this.f۱۴۱۴۱F.size(); i++) {
                                com.lawyer_smartCalendar.p۱۳۳d.Ce file = new com.lawyer_smartCalendar.p۱۳۳d.Ce();
                                file.m۱۷۶۶۶a(Integer.parseInt(this.f۱۴۱۴۲r));
                                file.m۱۷۶۷۲c("");
                                file.m۱۷۶۶۷a(this.f۱۴۱۴۱F.get(i).getPath());
                                file.m۱۷۶۷۰b(com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۳b);
                                audio_files.add(file);
                            }
                            this.f۱۴۱۴۸x.m۱۷۷۷۷a((List<com.lawyer_smartCalendar.p۱۳۳d.Ce>) audio_files);
                        }
                        if (this.f۱۴۱۴۱F.size() == 0) {
                            this.f۱۴۱۴۸x.m۱۷۷۷۶a(this.f۱۴۱۴۲r, com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۳b);
                        }
                        new Ch().m۱۷۷۵۳a(this, "success", "یادداشت با موفقیت ویرایش شد.");
                    } else {
                        long doc_id = this.f۱۴۱۴۸x.m۱۷۷۵۹a(note);
                        if (this.f۱۴۱۴۱F.size() > 0) {
                            List<com.lawyer_smartCalendar.model.File> audio_files2 = new ArrayList<>();
                            for (int i2 = 0; i2 < this.f۱۴۱۴۱F.size(); i2++) {
                                com.lawyer_smartCalendar.p۱۳۳d.Ce file2 = new com.lawyer_smartCalendar.p۱۳۳d.Ce();
                                file2.m۱۷۶۶۶a((int) doc_id);
                                file2.m۱۷۶۷۲c("");
                                file2.m۱۷۶۶۷a(this.f۱۴۱۴۱F.get(i2).getPath());
                                file2.m۱۷۶۷۰b(com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۳b);
                                audio_files2.add(file2);
                            }
                            this.f۱۴۱۴۸x.m۱۷۷۷۷a((List<com.lawyer_smartCalendar.p۱۳۳d.Ce>) audio_files2);
                        }
                        new Ch().m۱۷۷۵۳a(this, "success", "یادداشت با موفقیت ثبت شد.");
                    }
                    this.f۱۴۱۴۸x.close();
                    setResult(-1);
                    finish();
                    return;
                }
                return;
            case R.id.input_case /*{ENCODED_INT: 2131296493}*/:
                if (this.f۱۴۱۴۶v == -1) {
                    new Ch().m۱۷۷۵۳a(this, "error", "ابتدا یک موکل انتخاب کنید.");
                    return;
                }
                this.input_case.setError(null);
                View viewCase = getLayoutInflater().inflate(R.layout.bottom_sheet_select_case, (ViewGroup) null);
                RecyclerView mRecyclerView_case = (RecyclerView) viewCase.findViewById(R.id.recyclerView_case);
                mRecyclerView_case.setLayoutManager(new LinearLayoutManager(this));
                this.f۱۴۱۴۸x.m۱۷۸۱۱n();
                List<Case> caseList = this.f۱۴۱۴۸x.m۱۷۷۶۲a(this.f۱۴۱۴۶v);
                this.f۱۴۱۴۸x.close();
                if (caseList.size() > 0) {
                    mRecyclerView_case.setAdapter(new Cr(this, "AddNoteActivity", caseList));
                    this.f۱۴۱۵۰z = new DialogCe(this);
                    this.f۱۴۱۵۰z.setContentView(viewCase);
                    this.f۱۴۱۵۰z.show();
                    return;
                }
                View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(this);
                dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar.m۱۵۸۵۸b(this.f۱۴۱۳۸C);
                dVar.m۱۵۸۴۷a(this.f۱۴۱۳۸C);
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
                this.f۱۴۱۴۸x.m۱۷۸۱۱n();
                List<Client> clientList = this.f۱۴۱۴۸x.m۱۷۸۰۱i();
                this.f۱۴۱۴۸x.close();
                if (clientList.size() > 0) {
                    mRecyclerView_client.setAdapter(new Cs(this, "AddNoteActivity", clientList));
                    this.f۱۴۱۴۹y = new DialogCe(this);
                    this.f۱۴۱۴۹y.setContentView(viewClient);
                    this.f۱۴۱۴۹y.show();
                    return;
                }
                View$OnClickListenerCf.Cd dVar2 = new View$OnClickListenerCf.Cd(this);
                dVar2.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar2.m۱۵۸۵۸b(this.f۱۴۱۳۸C);
                dVar2.m۱۵۸۴۷a(this.f۱۴۱۳۸C);
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
            case R.id.input_date_hour /*{ENCODED_INT: 2131296514}*/:
                Calendar calendar = Calendar.getInstance();
                DialogFragmentCe.m۱۸۰۶۴b(this, calendar.get(11), calendar.get(12), true).show(getFragmentManager(), "input_time");
                return;
            case R.id.input_note_date /*{ENCODED_INT: 2131296535}*/:
                this.input_note_date.setError(null);
                this.f۱۴۱۴۴t = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
                this.f۱۴۱۴۵u = DialogFragmentCb.m۱۷۹۱۲b(this, this.f۱۴۱۴۴t.m۱۸۰۱۳h(), this.f۱۴۱۴۴t.m۱۸۰۰۹d(), this.f۱۴۱۴۴t.m۱۸۰۰۷b());
                this.f۱۴۱۴۵u.show(getFragmentManager(), "input_date_note");
                return;
            case R.id.input_note_type /*{ENCODED_INT: 2131296537}*/:
                this.input_note_type.setError(null);
                View$OnClickListenerCf.Cd dVar3 = new View$OnClickListenerCf.Cd(this);
                dVar3.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar3.m۱۵۸۶۸d(this.f۱۴۱۳۸C);
                dVar3.m۱۵۸۵۸b(this.f۱۴۱۳۸C);
                dVar3.m۱۵۸۶۳c(this.f۱۴۱۳۸C);
                dVar3.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                dVar3.m۱۵۸۵۸b(this.f۱۴۱۳۸C);
                dVar3.m۱۵۸۷۱e("نوع یادداشت");
                dVar3.m۱۵۸۴۱a(R.array.note_type_item);
                dVar3.m۱۵۸۴۲a(-1, new Cg());
                dVar3.m۱۵۸۶۶c();
                return;
            default:
                return;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddNoteActivity$d  reason: invalid class name */
    class Cd implements View$OnClickListenerCf.AbstractCm {
        Cd(AddNoteActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۶۸a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddNoteActivity$c  reason: invalid class name */
    class Cc implements View$OnClickListenerCf.AbstractCm {
        Cc() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۶۷a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
            Intent frm_add_client = new Intent(AddNoteActivity.this, AddClientActivity.class);
            frm_add_client.putExtra("frmMode", "add");
            AddNoteActivity.this.startActivity(frm_add_client);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddNoteActivity$f  reason: invalid class name */
    class Cf implements View$OnClickListenerCf.AbstractCm {
        Cf(AddNoteActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۷۰a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddNoteActivity$e  reason: invalid class name */
    class Ce implements View$OnClickListenerCf.AbstractCm {
        Ce() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۳۶۹a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
            Intent frm_add_case = new Intent(AddNoteActivity.this, AddCaseActivity.class);
            frm_add_case.putExtra("frmMode", "add");
            AddNoteActivity.this.startActivity(frm_add_case);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddNoteActivity$g  reason: invalid class name */
    class Cg implements View$OnClickListenerCf.AbstractCj {
        Cg() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۳۷۱a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
            AddNoteActivity.this.input_note_type.setText(text);
            if (which == 0) {
                AddNoteActivity.this.TextInputLayout_client.setVisibility(8);
                AddNoteActivity.this.TextInputLayout_case.setVisibility(8);
                AddNoteActivity addNoteActivity = AddNoteActivity.this;
                addNoteActivity.f۱۴۱۴۶v = -1;
                addNoteActivity.f۱۴۱۴۷w = -1;
                addNoteActivity.input_case.setText("");
                AddNoteActivity.this.input_client_name.setText("");
                AddNoteActivity.this.f۱۴۱۳۶A = "DailyActivity";
            } else if (which == 1) {
                AddNoteActivity.this.TextInputLayout_client.setVisibility(0);
                AddNoteActivity.this.TextInputLayout_case.setVisibility(0);
                AddNoteActivity.this.f۱۴۱۳۶A = "ClientCase";
            } else if (which == 2) {
                AddNoteActivity.this.TextInputLayout_client.setVisibility(8);
                AddNoteActivity.this.TextInputLayout_case.setVisibility(8);
                AddNoteActivity addNoteActivity2 = AddNoteActivity.this;
                addNoteActivity2.f۱۴۱۴۶v = -1;
                addNoteActivity2.f۱۴۱۴۷w = -1;
                addNoteActivity2.input_case.setText("");
                AddNoteActivity.this.input_client_name.setText("");
                AddNoteActivity.this.f۱۴۱۳۶A = "Other";
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
            case R.id.input_date_hour /*{ENCODED_INT: 2131296514}*/:
                if (focused) {
                    this.input_date_hour.setError(null);
                    this.input_date_hour.callOnClick();
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

    /* renamed from: o  reason: contains not printable characters */
    public void m۱۷۳۶۴o() {
        cafe.adriel.androidaudiorecorder.Ca a = cafe.adriel.androidaudiorecorder.Ca.m۱۶۶۴۸a(this);
        a.m۱۶۶۵۳a(f۱۴۱۳۵G);
        a.m۱۶۶۴۹a(Color.parseColor(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۴۱d()));
        a.m۱۶۶۵۶b(200);
        a.m۱۶۶۵۲a(EnumCc.MIC);
        a.m۱۶۶۵۰a(EnumCa.STEREO);
        a.m۱۶۶۵۱a(cafe.adriel.androidaudiorecorder.p۱۲۸j.EnumCb.HZ_48000);
        a.m۱۶۶۵۴a(false);
        a.m۱۶۶۵۷b(true);
        a.m۱۶۶۵۵a();
    }

    /* renamed from: m  reason: contains not printable characters */
    public void m۱۷۳۶۲m() {
        this.f۱۴۱۴۹y.dismiss();
    }

    /* renamed from: n  reason: contains not printable characters */
    public void m۱۷۳۶۳n() {
        this.f۱۴۱۵۰z.dismiss();
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۳۶۰a(DialogFragmentCb view, int year, int monthOfYear, int dayOfMonth) {
        com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb mcurrentDate = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
        mcurrentDate.m۱۸۰۰۶a(year, monthOfYear, dayOfMonth);
        String tag = this.f۱۴۱۴۵u.getTag();
        if (((tag.hashCode() == -707218514 && tag.equals("input_date_note")) ? (char) 0 : 65535) == 0) {
            this.input_note_date.setText(mcurrentDate.m۱۸۰۰۸c());
            this.input_note_date.setTextColor(Color.parseColor("#E65100"));
            this.f۱۴۱۳۷B = mcurrentDate.getTimeInMillis() + "";
        }
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.time.DialogFragmentCe.AbstractCh
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۳۶۱a(RadialPickerLayout view, int hourOfDay, int minute) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(Long.parseLong(this.f۱۴۱۳۷B));
        cal.set(11, hourOfDay);
        cal.set(12, minute);
        this.f۱۴۱۳۷B = cal.getTimeInMillis() + "";
        EditText editText = this.input_date_hour;
        editText.setText(hourOfDay + ":" + minute);
    }
}
