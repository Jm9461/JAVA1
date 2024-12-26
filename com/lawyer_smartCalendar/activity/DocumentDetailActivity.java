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
import com.lawyer_smartCalendar.p۱۳۰a.Cq;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import java.io.File;
import java.util.ArrayList;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class DocumentDetailActivity extends ActivityCe {

    /* renamed from: A  reason: contains not printable characters */
    private TextView f۱۴۲۳۶A;

    /* renamed from: B  reason: contains not printable characters */
    private TextView f۱۴۲۳۷B;

    /* renamed from: C  reason: contains not printable characters */
    private TextView f۱۴۲۳۸C;

    /* renamed from: D  reason: contains not printable characters */
    private TextView f۱۴۲۳۹D;

    /* renamed from: E  reason: contains not printable characters */
    private TextView f۱۴۲۴۰E;

    /* renamed from: F  reason: contains not printable characters */
    private TextView f۱۴۲۴۱F;

    /* renamed from: G  reason: contains not printable characters */
    private TextView f۱۴۲۴۲G;

    /* renamed from: H  reason: contains not printable characters */
    private TextView f۱۴۲۴۳H;

    /* renamed from: I  reason: contains not printable characters */
    private TextView f۱۴۲۴۴I;

    /* renamed from: J  reason: contains not printable characters */
    private TextView f۱۴۲۴۵J;

    /* renamed from: K  reason: contains not printable characters */
    private TextView f۱۴۲۴۶K;

    /* renamed from: L  reason: contains not printable characters */
    private TextView f۱۴۲۴۷L;

    /* renamed from: M  reason: contains not printable characters */
    private TextView f۱۴۲۴۸M;

    /* renamed from: N  reason: contains not printable characters */
    private TextView f۱۴۲۴۹N;

    /* renamed from: O  reason: contains not printable characters */
    private TextView f۱۴۲۵۰O;

    /* renamed from: P  reason: contains not printable characters */
    private TextView f۱۴۲۵۱P;

    /* renamed from: Q  reason: contains not printable characters */
    private TextView f۱۴۲۵۲Q;

    /* renamed from: R  reason: contains not printable characters */
    private TextView f۱۴۲۵۳R;

    /* renamed from: S  reason: contains not printable characters */
    private TextView f۱۴۲۵۴S;

    /* renamed from: T  reason: contains not printable characters */
    private TextView f۱۴۲۵۵T;

    /* renamed from: U  reason: contains not printable characters */
    private TextView f۱۴۲۵۶U;

    /* renamed from: V  reason: contains not printable characters */
    private TextView f۱۴۲۵۷V;

    /* renamed from: W  reason: contains not printable characters */
    private TextView f۱۴۲۵۸W;

    /* renamed from: X  reason: contains not printable characters */
    private TextView f۱۴۲۵۹X;

    /* renamed from: Y  reason: contains not printable characters */
    private TextView f۱۴۲۶۰Y;

    /* renamed from: Z  reason: contains not printable characters */
    private TextView f۱۴۲۶۱Z;

    /* renamed from: a0  reason: contains not printable characters */
    private TextView f۱۴۲۶۲a0;

    /* renamed from: b0  reason: contains not printable characters */
    private TextView f۱۴۲۶۳b0;

    /* renamed from: c0  reason: contains not printable characters */
    private TextView f۱۴۲۶۴c0;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۲۶۵d0;

    /* renamed from: e0  reason: contains not printable characters */
    private TextView f۱۴۲۶۶e0;

    /* renamed from: f0  reason: contains not printable characters */
    private TextView f۱۴۲۶۷f0;

    /* renamed from: g0  reason: contains not printable characters */
    private TextView f۱۴۲۶۸g0;

    /* renamed from: h0  reason: contains not printable characters */
    private TextView f۱۴۲۶۹h0;

    /* renamed from: i0  reason: contains not printable characters */
    private TextView f۱۴۲۷۰i0;

    /* renamed from: j0  reason: contains not printable characters */
    private TextView f۱۴۲۷۱j0;

    /* renamed from: k0  reason: contains not printable characters */
    private TextView f۱۴۲۷۲k0;

    /* renamed from: l0  reason: contains not printable characters */
    private TextView f۱۴۲۷۳l0;

    /* renamed from: m0  reason: contains not printable characters */
    private TextView f۱۴۲۷۴m0;

    /* renamed from: n0  reason: contains not printable characters */
    private TextView f۱۴۲۷۵n0;

    /* renamed from: o0  reason: contains not printable characters */
    private TextView f۱۴۲۷۶o0;

    /* renamed from: p0  reason: contains not printable characters */
    private TextView f۱۴۲۷۷p0;

    /* renamed from: q0  reason: contains not printable characters */
    private TextView f۱۴۲۷۸q0;

    /* renamed from: r  reason: contains not printable characters */
    private boolean f۱۴۲۷۹r = false;

    /* renamed from: r0  reason: contains not printable characters */
    private TextView f۱۴۲۸۰r0;

    /* renamed from: s  reason: contains not printable characters */
    public String f۱۴۲۸۱s = "";

    /* renamed from: s0  reason: contains not printable characters */
    private TextView f۱۴۲۸۲s0;

    /* renamed from: t  reason: contains not printable characters */
    private Ci f۱۴۲۸۳t;

    /* renamed from: t0  reason: contains not printable characters */
    private TextView f۱۴۲۸۴t0;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۴۲۸۵u = 156;

    /* renamed from: u0  reason: contains not printable characters */
    public RecyclerView f۱۴۲۸۶u0;

    /* renamed from: v  reason: contains not printable characters */
    private TextView f۱۴۲۸۷v;

    /* renamed from: v0  reason: contains not printable characters */
    private Cq f۱۴۲۸۸v0;

    /* renamed from: w  reason: contains not printable characters */
    private TextView f۱۴۲۸۹w;

    /* renamed from: w0  reason: contains not printable characters */
    private ArrayList<File> f۱۴۲۹۰w0 = new ArrayList<>();

    /* renamed from: x  reason: contains not printable characters */
    private TextView f۱۴۲۹۱x;

    /* renamed from: y  reason: contains not printable characters */
    private TextView f۱۴۲۹۲y;

    /* renamed from: z  reason: contains not printable characters */
    private TextView f۱۴۲۹۳z;

    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("easy_image_photos_list", this.f۱۴۲۹۰w0);
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
        if (requestCode == this.f۱۴۲۸۵u && resultCode == -1) {
            m۱۷۴۲۳m();
            this.f۱۴۲۷۹r = true;
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
            Intent frm_edit = new Intent(this, AddClientDocumentsActivity.class);
            frm_edit.putExtra("id", this.f۱۴۲۸۱s);
            frm_edit.putExtra("frmMode", "edit");
            startActivityForResult(frm_edit, this.f۱۴۲۸۵u);
            return true;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.DocumentDetailActivity$b  reason: invalid class name */
    class Cb implements View$OnClickListenerCf.AbstractCm {
        Cb(DocumentDetailActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۲۵a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.DocumentDetailActivity$a  reason: invalid class name */
    class Ca implements View$OnClickListenerCf.AbstractCm {
        Ca() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۲۴a(View$OnClickListenerCf dialog, EnumCb which) {
            DocumentDetailActivity.this.f۱۴۲۸۳t.m۱۷۸۱۱n();
            DocumentDetailActivity.this.f۱۴۲۸۳t.m۱۷۷۸۹c(DocumentDetailActivity.this.f۱۴۲۸۱s);
            DocumentDetailActivity.this.f۱۴۲۸۳t.m۱۷۷۷۶a(DocumentDetailActivity.this.f۱۴۲۸۱s, com.lawyer_smartCalendar.utils.Ca.f۱۴۷۷۲a);
            DocumentDetailActivity.this.f۱۴۲۸۳t.close();
            DocumentDetailActivity.this.setResult(-1);
            DocumentDetailActivity.this.finish();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.document_detail, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        setTheme(Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        overridePendingTransition(17432576, 17432577);
        setContentView(R.layout.activity_document_detail);
        this.f۱۴۲۸۳t = new Ci(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_white_24dp);
        this.f۱۴۲۸۶u0 = (RecyclerView) findViewById(R.id.recycler_view);
        CardView cardView = (CardView) findViewById(R.id.card_view_case);
        CardView cardView2 = (CardView) findViewById(R.id.card_view_client);
        this.f۱۴۲۸۷v = (TextView) findViewById(R.id.txt_title_note);
        this.f۱۴۲۹۱x = (TextView) findViewById(R.id.txt_title_client);
        this.f۱۴۲۸۹w = (TextView) findViewById(R.id.txt_title_case);
        this.f۱۴۲۹۲y = (TextView) findViewById(R.id.txt_title1);
        this.f۱۴۲۹۳z = (TextView) findViewById(R.id.txt_title2);
        this.f۱۴۲۳۶A = (TextView) findViewById(R.id.txt_title3);
        this.f۱۴۲۳۷B = (TextView) findViewById(R.id.txt_title4);
        this.f۱۴۲۳۸C = (TextView) findViewById(R.id.txt_title5);
        this.f۱۴۲۳۹D = (TextView) findViewById(R.id.txt_title6);
        this.f۱۴۲۴۰E = (TextView) findViewById(R.id.txt_title8);
        this.f۱۴۲۴۱F = (TextView) findViewById(R.id.txt_title9);
        this.f۱۴۲۴۲G = (TextView) findViewById(R.id.txt_title10);
        this.f۱۴۲۴۳H = (TextView) findViewById(R.id.txt_title11);
        this.f۱۴۲۴۴I = (TextView) findViewById(R.id.txt_title12);
        this.f۱۴۲۴۵J = (TextView) findViewById(R.id.txt_title13);
        this.f۱۴۲۴۶K = (TextView) findViewById(R.id.txt_title14);
        this.f۱۴۲۴۷L = (TextView) findViewById(R.id.txt_title15);
        this.f۱۴۲۴۸M = (TextView) findViewById(R.id.txt_title16);
        this.f۱۴۲۴۹N = (TextView) findViewById(R.id.txt_title17);
        this.f۱۴۲۵۰O = (TextView) findViewById(R.id.txt_title18);
        this.f۱۴۲۵۱P = (TextView) findViewById(R.id.txt_title19);
        this.f۱۴۲۵۲Q = (TextView) findViewById(R.id.txt_title20);
        this.f۱۴۲۵۳R = (TextView) findViewById(R.id.txt_title21);
        this.f۱۴۲۵۴S = (TextView) findViewById(R.id.txt_title22);
        this.f۱۴۲۵۵T = (TextView) findViewById(R.id.txt_title23);
        this.f۱۴۲۵۶U = (TextView) findViewById(R.id.txt_title24);
        this.f۱۴۲۵۷V = (TextView) findViewById(R.id.txt_title25);
        this.f۱۴۲۵۸W = (TextView) findViewById(R.id.txt_value1);
        this.f۱۴۲۵۹X = (TextView) findViewById(R.id.txt_value2);
        this.f۱۴۲۶۰Y = (TextView) findViewById(R.id.txt_value3);
        this.f۱۴۲۶۱Z = (TextView) findViewById(R.id.txt_value4);
        this.f۱۴۲۶۲a0 = (TextView) findViewById(R.id.txt_value5);
        this.f۱۴۲۶۳b0 = (TextView) findViewById(R.id.txt_value6);
        this.f۱۴۲۶۴c0 = (TextView) findViewById(R.id.txt_value8);
        this.f۱۴۲۶۵d0 = (TextView) findViewById(R.id.txt_value9);
        this.f۱۴۲۶۶e0 = (TextView) findViewById(R.id.txt_value10);
        this.f۱۴۲۶۷f0 = (TextView) findViewById(R.id.txt_value11);
        this.f۱۴۲۶۸g0 = (TextView) findViewById(R.id.txt_value12);
        this.f۱۴۲۶۹h0 = (TextView) findViewById(R.id.txt_value13);
        this.f۱۴۲۷۰i0 = (TextView) findViewById(R.id.txt_value14);
        this.f۱۴۲۷۱j0 = (TextView) findViewById(R.id.txt_value15);
        this.f۱۴۲۷۲k0 = (TextView) findViewById(R.id.txt_value16);
        this.f۱۴۲۷۳l0 = (TextView) findViewById(R.id.txt_value17);
        this.f۱۴۲۷۴m0 = (TextView) findViewById(R.id.txt_value18);
        this.f۱۴۲۷۵n0 = (TextView) findViewById(R.id.txt_value19);
        this.f۱۴۲۷۶o0 = (TextView) findViewById(R.id.txt_value20);
        this.f۱۴۲۷۷p0 = (TextView) findViewById(R.id.txt_value21);
        this.f۱۴۲۷۸q0 = (TextView) findViewById(R.id.txt_value22);
        this.f۱۴۲۸۰r0 = (TextView) findViewById(R.id.txt_value23);
        this.f۱۴۲۸۲s0 = (TextView) findViewById(R.id.txt_value24);
        this.f۱۴۲۸۴t0 = (TextView) findViewById(R.id.txt_value25);
        Cf font = new Cf(this);
        this.f۱۴۲۸۷v.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۹۱x.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۸۹w.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۹۲y.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۹۳z.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۳۶A.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۳۷B.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۳۸C.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۳۹D.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۴۰E.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۴۱F.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۴۲G.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۴۳H.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۴۴I.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۴۵J.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۴۶K.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۴۷L.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۴۸M.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۴۹N.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۵۰O.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۵۱P.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۵۲Q.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۵۳R.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۵۴S.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۵۵T.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۵۶U.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۵۷V.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۲۵۸W.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۵۹X.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۶۰Y.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۶۱Z.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۶۲a0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۶۳b0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۶۴c0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۶۵d0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۶۶e0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۶۸g0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۶۹h0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۷۰i0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۷۱j0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۷۲k0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۷۳l0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۷۴m0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۷۵n0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۷۶o0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۷۷p0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۷۸q0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۸۰r0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۸۲s0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۲۸۴t0.setTypeface(font.m۱۷۷۴۶a());
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCc());
        m۱۷۴۲۳m();
        if (savedInstanceState != null) {
            this.f۱۴۲۹۰w0 = (ArrayList) savedInstanceState.getSerializable("easy_image_photos_list");
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.DocumentDetailActivity$c  reason: invalid class name */
    class View$OnClickListenerCc implements View.OnClickListener {
        View$OnClickListenerCc() {
        }

        public void onClick(View view) {
            DocumentDetailActivity.this.onBackPressed();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onBackPressed() {
        if (this.f۱۴۲۷۹r) {
            setResult(-1);
        }
        finish();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05aa, code lost:
        if (r5.equals("6") != false) goto L_0x05e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x051d  */
    /* renamed from: m  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۴۲۳m() {
        /*
        // Method dump skipped, instructions count: 1694
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.DocumentDetailActivity.m۱۷۴۲۳m():void");
    }
}
