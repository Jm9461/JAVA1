package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.CardView;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.p۱۳۰a.Cd;
import com.lawyer_smartCalendar.p۱۳۳d.Cf;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Ce;
import com.lawyer_smartCalendar.utils.Ci;
import java.io.File;
import java.util.ArrayList;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class NoteDetailActivity extends ActivityCe {

    /* renamed from: A  reason: contains not printable characters */
    private TextView f۱۴۳۱۳A;

    /* renamed from: B  reason: contains not printable characters */
    private TextView f۱۴۳۱۴B;

    /* renamed from: C  reason: contains not printable characters */
    private TextView f۱۴۳۱۵C;

    /* renamed from: D  reason: contains not printable characters */
    private TextView f۱۴۳۱۶D;

    /* renamed from: E  reason: contains not printable characters */
    private TextView f۱۴۳۱۷E;

    /* renamed from: F  reason: contains not printable characters */
    private TextView f۱۴۳۱۸F;

    /* renamed from: G  reason: contains not printable characters */
    private TextView f۱۴۳۱۹G;

    /* renamed from: H  reason: contains not printable characters */
    private TextView f۱۴۳۲۰H;

    /* renamed from: I  reason: contains not printable characters */
    private TextView f۱۴۳۲۱I;

    /* renamed from: J  reason: contains not printable characters */
    private TextView f۱۴۳۲۲J;

    /* renamed from: K  reason: contains not printable characters */
    private TextView f۱۴۳۲۳K;

    /* renamed from: L  reason: contains not printable characters */
    private TextView f۱۴۳۲۴L;

    /* renamed from: M  reason: contains not printable characters */
    private TextView f۱۴۳۲۵M;

    /* renamed from: N  reason: contains not printable characters */
    private TextView f۱۴۳۲۶N;

    /* renamed from: O  reason: contains not printable characters */
    private TextView f۱۴۳۲۷O;

    /* renamed from: P  reason: contains not printable characters */
    private TextView f۱۴۳۲۸P;

    /* renamed from: Q  reason: contains not printable characters */
    private TextView f۱۴۳۲۹Q;

    /* renamed from: R  reason: contains not printable characters */
    private TextView f۱۴۳۳۰R;

    /* renamed from: S  reason: contains not printable characters */
    private TextView f۱۴۳۳۱S;

    /* renamed from: T  reason: contains not printable characters */
    private TextView f۱۴۳۳۲T;

    /* renamed from: U  reason: contains not printable characters */
    private TextView f۱۴۳۳۳U;

    /* renamed from: V  reason: contains not printable characters */
    private TextView f۱۴۳۳۴V;

    /* renamed from: W  reason: contains not printable characters */
    private TextView f۱۴۳۳۵W;

    /* renamed from: X  reason: contains not printable characters */
    private TextView f۱۴۳۳۶X;

    /* renamed from: Y  reason: contains not printable characters */
    private TextView f۱۴۳۳۷Y;

    /* renamed from: Z  reason: contains not printable characters */
    private TextView f۱۴۳۳۸Z;

    /* renamed from: a0  reason: contains not printable characters */
    private TextView f۱۴۳۳۹a0;

    /* renamed from: b0  reason: contains not printable characters */
    private TextView f۱۴۳۴۰b0;

    /* renamed from: c0  reason: contains not printable characters */
    private TextView f۱۴۳۴۱c0;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۳۴۲d0;

    /* renamed from: e0  reason: contains not printable characters */
    private TextView f۱۴۳۴۳e0;

    /* renamed from: f0  reason: contains not printable characters */
    private TextView f۱۴۳۴۴f0;

    /* renamed from: g0  reason: contains not printable characters */
    private TextView f۱۴۳۴۵g0;

    /* renamed from: h0  reason: contains not printable characters */
    private TextView f۱۴۳۴۶h0;

    /* renamed from: i0  reason: contains not printable characters */
    private TextView f۱۴۳۴۷i0;

    /* renamed from: j0  reason: contains not printable characters */
    private TextView f۱۴۳۴۸j0;

    /* renamed from: k0  reason: contains not printable characters */
    private TextView f۱۴۳۴۹k0;

    /* renamed from: l0  reason: contains not printable characters */
    private TextView f۱۴۳۵۰l0;

    /* renamed from: m0  reason: contains not printable characters */
    private TextView f۱۴۳۵۱m0;

    /* renamed from: n0  reason: contains not printable characters */
    private TextView f۱۴۳۵۲n0;

    /* renamed from: o0  reason: contains not printable characters */
    private TextView f۱۴۳۵۳o0;

    /* renamed from: p0  reason: contains not printable characters */
    private TextView f۱۴۳۵۴p0;

    /* renamed from: q0  reason: contains not printable characters */
    private TextView f۱۴۳۵۵q0;

    /* renamed from: r  reason: contains not printable characters */
    private boolean f۱۴۳۵۶r = false;

    /* renamed from: r0  reason: contains not printable characters */
    private TextView f۱۴۳۵۷r0;

    /* renamed from: s  reason: contains not printable characters */
    public String f۱۴۳۵۸s = "";

    /* renamed from: s0  reason: contains not printable characters */
    private TextView f۱۴۳۵۹s0;

    /* renamed from: t  reason: contains not printable characters */
    private Ci f۱۴۳۶۰t;

    /* renamed from: t0  reason: contains not printable characters */
    private TextView f۱۴۳۶۱t0;

    /* renamed from: u  reason: contains not printable characters */
    private Cf f۱۴۳۶۲u;

    /* renamed from: u0  reason: contains not printable characters */
    private TextView f۱۴۳۶۳u0;

    /* renamed from: v  reason: contains not printable characters */
    private int f۱۴۳۶۴v = 156;

    /* renamed from: v0  reason: contains not printable characters */
    private RecyclerView f۱۴۳۶۵v0;

    /* renamed from: w  reason: contains not printable characters */
    private CardView f۱۴۳۶۶w;

    /* renamed from: w0  reason: contains not printable characters */
    private Cd f۱۴۳۶۷w0;

    /* renamed from: x  reason: contains not printable characters */
    private CardView f۱۴۳۶۸x;

    /* renamed from: x0  reason: contains not printable characters */
    private ArrayList<File> f۱۴۳۶۹x0 = new ArrayList<>();

    /* renamed from: y  reason: contains not printable characters */
    private TextView f۱۴۳۷۰y;

    /* renamed from: z  reason: contains not printable characters */
    private TextView f۱۴۳۷۱z;

    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("audio_list", this.f۱۴۳۶۹x0);
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
        if (requestCode == this.f۱۴۳۶۴v && resultCode == -1) {
            m۱۷۴۴۳m();
            this.f۱۴۳۵۶r = true;
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.action_delete) {
            View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(this);
            dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
            dVar.m۱۵۸۵۸b(EnumCe.CENTER);
            dVar.m۱۵۸۴۷a(EnumCe.END);
            dVar.m۱۵۸۷۶j(R.color.colorPrimaryDark);
            dVar.m۱۵۸۵۰a("آیا برای حذف این مورد اطمینان دارید؟");
            dVar.m۱۵۸۷۲f(R.color.dialogCancelColor);
            dVar.m۱۵۸۵۶b(R.color.dialog_delete_color);
            dVar.m۱۵۸۶۹d("انصراف");
            dVar.m۱۵۸۶۰b("حذف");
            dVar.m۱۵۸۶۴c(new Cb(this));
            dVar.m۱۵۸۴۸a(new Ca());
            dVar.m۱۵۸۶۶c();
            return true;
        } else if (itemId != R.id.action_edit) {
            return super.onOptionsItemSelected(item);
        } else {
            Intent frm_edit = new Intent(this, AddNoteActivity.class);
            frm_edit.putExtra("id", this.f۱۴۳۵۸s);
            frm_edit.putExtra("frmMode", "edit");
            startActivityForResult(frm_edit, this.f۱۴۳۶۴v);
            return true;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.NoteDetailActivity$b  reason: invalid class name */
    class Cb implements View$OnClickListenerCf.AbstractCm {
        Cb(NoteDetailActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۴۵a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.NoteDetailActivity$a  reason: invalid class name */
    class Ca implements View$OnClickListenerCf.AbstractCm {
        Ca() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۴۴a(View$OnClickListenerCf dialog, EnumCb which) {
            NoteDetailActivity.this.f۱۴۳۶۰t.m۱۷۸۱۱n();
            NoteDetailActivity.this.f۱۴۳۶۰t.m۱۷۷۹۲e(NoteDetailActivity.this.f۱۴۳۵۸s);
            NoteDetailActivity.this.f۱۴۳۶۰t.close();
            try {
                Ce.f۱۴۷۸۶e.m۱۷۵۶۳d0();
            } catch (Exception e) {
            }
            NoteDetailActivity.this.setResult(-1);
            NoteDetailActivity.this.finish();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.note_detail, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        setTheme(Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        overridePendingTransition(17432576, 17432577);
        setContentView(R.layout.activity_note_detail);
        this.f۱۴۳۶۰t = new Ci(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_white_24dp);
        this.f۱۴۳۶۵v0 = (RecyclerView) findViewById(R.id.recycler_view);
        this.f۱۴۳۶۶w = (CardView) findViewById(R.id.card_view_case);
        this.f۱۴۳۶۸x = (CardView) findViewById(R.id.card_view_client);
        this.f۱۴۳۷۰y = (TextView) findViewById(R.id.txt_title_note);
        this.f۱۴۳۱۳A = (TextView) findViewById(R.id.txt_title_client);
        this.f۱۴۳۷۱z = (TextView) findViewById(R.id.txt_title_case);
        this.f۱۴۳۱۴B = (TextView) findViewById(R.id.txt_title1);
        this.f۱۴۳۱۵C = (TextView) findViewById(R.id.txt_title2);
        this.f۱۴۳۱۶D = (TextView) findViewById(R.id.txt_title3);
        this.f۱۴۳۱۷E = (TextView) findViewById(R.id.txt_title4);
        this.f۱۴۳۱۸F = (TextView) findViewById(R.id.txt_title5);
        this.f۱۴۳۱۹G = (TextView) findViewById(R.id.txt_title6);
        this.f۱۴۳۲۰H = (TextView) findViewById(R.id.txt_title8);
        this.f۱۴۳۲۱I = (TextView) findViewById(R.id.txt_title9);
        this.f۱۴۳۲۲J = (TextView) findViewById(R.id.txt_title10);
        this.f۱۴۳۲۳K = (TextView) findViewById(R.id.txt_title11);
        this.f۱۴۳۲۴L = (TextView) findViewById(R.id.txt_title12);
        this.f۱۴۳۲۵M = (TextView) findViewById(R.id.txt_title13);
        this.f۱۴۳۲۶N = (TextView) findViewById(R.id.txt_title14);
        this.f۱۴۳۲۷O = (TextView) findViewById(R.id.txt_title15);
        this.f۱۴۳۲۸P = (TextView) findViewById(R.id.txt_title16);
        this.f۱۴۳۲۹Q = (TextView) findViewById(R.id.txt_title17);
        this.f۱۴۳۳۰R = (TextView) findViewById(R.id.txt_title18);
        this.f۱۴۳۳۱S = (TextView) findViewById(R.id.txt_title19);
        this.f۱۴۳۳۲T = (TextView) findViewById(R.id.txt_title20);
        this.f۱۴۳۳۳U = (TextView) findViewById(R.id.txt_title21);
        this.f۱۴۳۳۴V = (TextView) findViewById(R.id.txt_title22);
        this.f۱۴۳۳۵W = (TextView) findViewById(R.id.txt_title23);
        this.f۱۴۳۳۶X = (TextView) findViewById(R.id.txt_title24);
        this.f۱۴۳۳۷Y = (TextView) findViewById(R.id.txt_value1);
        this.f۱۴۳۳۸Z = (TextView) findViewById(R.id.txt_value2);
        this.f۱۴۳۳۹a0 = (TextView) findViewById(R.id.txt_value3);
        this.f۱۴۳۴۰b0 = (TextView) findViewById(R.id.txt_value4);
        this.f۱۴۳۴۱c0 = (TextView) findViewById(R.id.txt_value5);
        this.f۱۴۳۴۲d0 = (TextView) findViewById(R.id.txt_value6);
        this.f۱۴۳۴۳e0 = (TextView) findViewById(R.id.txt_value8);
        this.f۱۴۳۴۴f0 = (TextView) findViewById(R.id.txt_value9);
        this.f۱۴۳۴۵g0 = (TextView) findViewById(R.id.txt_value10);
        this.f۱۴۳۴۶h0 = (TextView) findViewById(R.id.txt_value11);
        this.f۱۴۳۴۷i0 = (TextView) findViewById(R.id.txt_value12);
        this.f۱۴۳۴۸j0 = (TextView) findViewById(R.id.txt_value13);
        this.f۱۴۳۴۹k0 = (TextView) findViewById(R.id.txt_value14);
        this.f۱۴۳۵۰l0 = (TextView) findViewById(R.id.txt_value15);
        this.f۱۴۳۵۱m0 = (TextView) findViewById(R.id.txt_value16);
        this.f۱۴۳۵۲n0 = (TextView) findViewById(R.id.txt_value17);
        this.f۱۴۳۵۳o0 = (TextView) findViewById(R.id.txt_value18);
        this.f۱۴۳۵۴p0 = (TextView) findViewById(R.id.txt_value19);
        this.f۱۴۳۵۵q0 = (TextView) findViewById(R.id.txt_value20);
        this.f۱۴۳۵۷r0 = (TextView) findViewById(R.id.txt_value21);
        this.f۱۴۳۵۹s0 = (TextView) findViewById(R.id.txt_value22);
        this.f۱۴۳۶۱t0 = (TextView) findViewById(R.id.txt_value23);
        this.f۱۴۳۶۳u0 = (TextView) findViewById(R.id.txt_value24);
        com.lawyer_smartCalendar.utils.Cf font = new com.lawyer_smartCalendar.utils.Cf(this);
        this.f۱۴۳۷۰y.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۱۳A.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۷۱z.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۱۴B.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۱۵C.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۱۶D.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۱۷E.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۱۸F.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۱۹G.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۲۰H.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۲۱I.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۲۲J.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۲۳K.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۲۴L.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۲۵M.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۲۶N.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۲۷O.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۲۸P.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۲۹Q.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۳۰R.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۳۱S.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۳۲T.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۳۳U.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۳۴V.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۳۵W.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۳۶X.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۳۷Y.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۳۸Z.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۳۹a0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۴۰b0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۴۱c0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۴۲d0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۴۳e0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۴۴f0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۴۵g0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۴۶h0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۴۷i0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۴۸j0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۴۹k0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۵۰l0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۵۱m0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۵۲n0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۵۳o0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۵۴p0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۵۵q0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۵۷r0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۵۹s0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۶۱t0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۳۶۳u0.setTypeface(font.m۱۷۷۴۶a());
        m۱۳۴۸۹j().m۱۳۴۱۴a("جزییات یادداشت");
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCc());
        if (savedInstanceState != null) {
            this.f۱۴۳۶۹x0 = (ArrayList) savedInstanceState.getSerializable("audio_list");
        }
        m۱۷۴۴۳m();
    }

    /* renamed from: com.lawyer_smartCalendar.activity.NoteDetailActivity$c  reason: invalid class name */
    class View$OnClickListenerCc implements View.OnClickListener {
        View$OnClickListenerCc() {
        }

        public void onClick(View view) {
            NoteDetailActivity.this.onBackPressed();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onBackPressed() {
        if (this.f۱۴۳۵۶r) {
            setResult(-1);
        }
        finish();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x051d, code lost:
        if (r8.equals("2") != false) goto L_0x052b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x046a  */
    /* renamed from: m  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۴۴۳m() {
        /*
        // Method dump skipped, instructions count: 1506
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.NoteDetailActivity.m۱۷۴۴۳m():void");
    }
}
