package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
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
import com.lawyer_smartCalendar.p۱۳۰a.Cu;
import com.lawyer_smartCalendar.p۱۳۳d.Ch;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.ArrayList;
import java.util.List;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class PaymentDetailActivity extends ActivityCe {

    /* renamed from: A  reason: contains not printable characters */
    private TextView f۱۴۳۹۰A;

    /* renamed from: B  reason: contains not printable characters */
    private TextView f۱۴۳۹۱B;

    /* renamed from: C  reason: contains not printable characters */
    private TextView f۱۴۳۹۲C;

    /* renamed from: D  reason: contains not printable characters */
    private TextView f۱۴۳۹۳D;

    /* renamed from: E  reason: contains not printable characters */
    private TextView f۱۴۳۹۴E;

    /* renamed from: F  reason: contains not printable characters */
    private TextView f۱۴۳۹۵F;

    /* renamed from: G  reason: contains not printable characters */
    private TextView f۱۴۳۹۶G;

    /* renamed from: H  reason: contains not printable characters */
    private TextView f۱۴۳۹۷H;

    /* renamed from: I  reason: contains not printable characters */
    private TextView f۱۴۳۹۸I;

    /* renamed from: J  reason: contains not printable characters */
    private TextView f۱۴۳۹۹J;

    /* renamed from: K  reason: contains not printable characters */
    private TextView f۱۴۴۰۰K;

    /* renamed from: L  reason: contains not printable characters */
    private TextView f۱۴۴۰۱L;

    /* renamed from: M  reason: contains not printable characters */
    private TextView f۱۴۴۰۲M;

    /* renamed from: N  reason: contains not printable characters */
    private TextView f۱۴۴۰۳N;

    /* renamed from: O  reason: contains not printable characters */
    private TextView f۱۴۴۰۴O;

    /* renamed from: P  reason: contains not printable characters */
    private TextView f۱۴۴۰۵P;

    /* renamed from: Q  reason: contains not printable characters */
    private TextView f۱۴۴۰۶Q;

    /* renamed from: R  reason: contains not printable characters */
    private TextView f۱۴۴۰۷R;

    /* renamed from: S  reason: contains not printable characters */
    private TextView f۱۴۴۰۸S;

    /* renamed from: T  reason: contains not printable characters */
    private TextView f۱۴۴۰۹T;

    /* renamed from: U  reason: contains not printable characters */
    private TextView f۱۴۴۱۰U;

    /* renamed from: V  reason: contains not printable characters */
    private TextView f۱۴۴۱۱V;

    /* renamed from: W  reason: contains not printable characters */
    private TextView f۱۴۴۱۲W;

    /* renamed from: X  reason: contains not printable characters */
    private TextView f۱۴۴۱۳X;

    /* renamed from: Y  reason: contains not printable characters */
    private TextView f۱۴۴۱۴Y;

    /* renamed from: Z  reason: contains not printable characters */
    private TextView f۱۴۴۱۵Z;

    /* renamed from: a0  reason: contains not printable characters */
    private TextView f۱۴۴۱۶a0;

    /* renamed from: b0  reason: contains not printable characters */
    private TextView f۱۴۴۱۷b0;

    /* renamed from: c0  reason: contains not printable characters */
    private TextView f۱۴۴۱۸c0;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۴۱۹d0;

    /* renamed from: e0  reason: contains not printable characters */
    private TextView f۱۴۴۲۰e0;

    /* renamed from: f0  reason: contains not printable characters */
    private TextView f۱۴۴۲۱f0;

    /* renamed from: g0  reason: contains not printable characters */
    private TextView f۱۴۴۲۲g0;

    /* renamed from: h0  reason: contains not printable characters */
    private TextView f۱۴۴۲۳h0;

    /* renamed from: i0  reason: contains not printable characters */
    private TextView f۱۴۴۲۴i0;

    /* renamed from: j0  reason: contains not printable characters */
    private TextView f۱۴۴۲۵j0;

    /* renamed from: k0  reason: contains not printable characters */
    private TextView f۱۴۴۲۶k0;

    /* renamed from: l0  reason: contains not printable characters */
    private TextView f۱۴۴۲۷l0;

    /* renamed from: m0  reason: contains not printable characters */
    private TextView f۱۴۴۲۸m0;

    /* renamed from: n0  reason: contains not printable characters */
    private TextView f۱۴۴۲۹n0;

    /* renamed from: o0  reason: contains not printable characters */
    private TextView f۱۴۴۳۰o0;

    /* renamed from: p0  reason: contains not printable characters */
    private TextView f۱۴۴۳۱p0;

    /* renamed from: q0  reason: contains not printable characters */
    private TextView f۱۴۴۳۲q0;

    /* renamed from: r  reason: contains not printable characters */
    private boolean f۱۴۴۳۳r = false;

    /* renamed from: r0  reason: contains not printable characters */
    private TextView f۱۴۴۳۴r0;

    /* renamed from: s  reason: contains not printable characters */
    public String f۱۴۴۳۵s = "";

    /* renamed from: s0  reason: contains not printable characters */
    private TextView f۱۴۴۳۶s0;

    /* renamed from: t  reason: contains not printable characters */
    private Ci f۱۴۴۳۷t;

    /* renamed from: t0  reason: contains not printable characters */
    private TextView f۱۴۴۳۸t0;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۴۴۳۹u = 300;

    /* renamed from: u0  reason: contains not printable characters */
    private TextView f۱۴۴۴۰u0;

    /* renamed from: v  reason: contains not printable characters */
    private TextView f۱۴۴۴۱v;

    /* renamed from: v0  reason: contains not printable characters */
    public RecyclerView f۱۴۴۴۲v0;

    /* renamed from: w  reason: contains not printable characters */
    private TextView f۱۴۴۴۳w;

    /* renamed from: w0  reason: contains not printable characters */
    private Cu f۱۴۴۴۴w0;

    /* renamed from: x  reason: contains not printable characters */
    private TextView f۱۴۴۴۵x;

    /* renamed from: x0  reason: contains not printable characters */
    private List<Ch> f۱۴۴۴۶x0 = new ArrayList();

    /* renamed from: y  reason: contains not printable characters */
    private TextView f۱۴۴۴۷y;

    /* renamed from: z  reason: contains not printable characters */
    private TextView f۱۴۴۴۸z;

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
        if (requestCode == this.f۱۴۴۳۹u && resultCode == -1) {
            m۱۷۴۵۰m();
            this.f۱۴۴۳۳r = true;
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
            Intent frm_edit = new Intent(this, AddPaymentActivity.class);
            frm_edit.putExtra("id", this.f۱۴۴۳۵s);
            frm_edit.putExtra("frmMode", "edit");
            startActivityForResult(frm_edit, this.f۱۴۴۳۹u);
            return true;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.PaymentDetailActivity$b  reason: invalid class name */
    class Cb implements View$OnClickListenerCf.AbstractCm {
        Cb(PaymentDetailActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۵۲a(View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.PaymentDetailActivity$a  reason: invalid class name */
    class Ca implements View$OnClickListenerCf.AbstractCm {
        Ca() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۵۱a(View$OnClickListenerCf dialog, EnumCb which) {
            PaymentDetailActivity.this.f۱۴۴۳۷t.m۱۷۸۱۱n();
            PaymentDetailActivity.this.f۱۴۴۳۷t.m۱۷۷۹۵f(PaymentDetailActivity.this.f۱۴۴۳۵s);
            PaymentDetailActivity.this.f۱۴۴۳۷t.close();
            PaymentDetailActivity.this.setResult(-1);
            PaymentDetailActivity.this.finish();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.peyment_detail, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        setTheme(Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        overridePendingTransition(17432576, 17432577);
        setContentView(R.layout.activity_payment_detail);
        this.f۱۴۴۳۷t = new Ci(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_white_24dp);
        this.f۱۴۴۴۲v0 = (RecyclerView) findViewById(R.id.recycler_view);
        CardView cardView = (CardView) findViewById(R.id.card_view_case);
        CardView cardView2 = (CardView) findViewById(R.id.card_view_client);
        this.f۱۴۴۴۱v = (TextView) findViewById(R.id.txt_title_note);
        this.f۱۴۴۴۵x = (TextView) findViewById(R.id.txt_title_client);
        this.f۱۴۴۴۳w = (TextView) findViewById(R.id.txt_title_case);
        this.f۱۴۴۴۷y = (TextView) findViewById(R.id.txt_installment_title);
        this.f۱۴۴۴۸z = (TextView) findViewById(R.id.txt_title1);
        this.f۱۴۳۹۰A = (TextView) findViewById(R.id.txt_title2);
        this.f۱۴۳۹۱B = (TextView) findViewById(R.id.txt_title3);
        this.f۱۴۳۹۲C = (TextView) findViewById(R.id.txt_title4);
        this.f۱۴۳۹۳D = (TextView) findViewById(R.id.txt_title5);
        this.f۱۴۳۹۴E = (TextView) findViewById(R.id.txt_title6);
        this.f۱۴۳۹۵F = (TextView) findViewById(R.id.txt_title8);
        this.f۱۴۳۹۶G = (TextView) findViewById(R.id.txt_title9);
        this.f۱۴۳۹۷H = (TextView) findViewById(R.id.txt_title10);
        this.f۱۴۳۹۸I = (TextView) findViewById(R.id.txt_title11);
        this.f۱۴۳۹۹J = (TextView) findViewById(R.id.txt_title12);
        this.f۱۴۴۰۰K = (TextView) findViewById(R.id.txt_title13);
        this.f۱۴۴۰۱L = (TextView) findViewById(R.id.txt_title14);
        this.f۱۴۴۰۲M = (TextView) findViewById(R.id.txt_title15);
        this.f۱۴۴۰۳N = (TextView) findViewById(R.id.txt_title16);
        this.f۱۴۴۰۴O = (TextView) findViewById(R.id.txt_title17);
        this.f۱۴۴۰۵P = (TextView) findViewById(R.id.txt_title18);
        this.f۱۴۴۰۶Q = (TextView) findViewById(R.id.txt_title19);
        this.f۱۴۴۰۷R = (TextView) findViewById(R.id.txt_title20);
        this.f۱۴۴۰۸S = (TextView) findViewById(R.id.txt_title21);
        this.f۱۴۴۰۹T = (TextView) findViewById(R.id.txt_title22);
        this.f۱۴۴۱۰U = (TextView) findViewById(R.id.txt_title23);
        this.f۱۴۴۱۱V = (TextView) findViewById(R.id.txt_title24);
        this.f۱۴۴۱۲W = (TextView) findViewById(R.id.txt_title25);
        this.f۱۴۴۱۳X = (TextView) findViewById(R.id.txt_value1);
        this.f۱۴۴۱۴Y = (TextView) findViewById(R.id.txt_value2);
        this.f۱۴۴۱۵Z = (TextView) findViewById(R.id.txt_value3);
        this.f۱۴۴۱۶a0 = (TextView) findViewById(R.id.txt_value4);
        this.f۱۴۴۱۷b0 = (TextView) findViewById(R.id.txt_value5);
        this.f۱۴۴۱۸c0 = (TextView) findViewById(R.id.txt_value6);
        this.f۱۴۴۱۹d0 = (TextView) findViewById(R.id.txt_value8);
        this.f۱۴۴۲۰e0 = (TextView) findViewById(R.id.txt_value9);
        this.f۱۴۴۲۱f0 = (TextView) findViewById(R.id.txt_value10);
        this.f۱۴۴۲۲g0 = (TextView) findViewById(R.id.txt_value11);
        this.f۱۴۴۲۳h0 = (TextView) findViewById(R.id.txt_value12);
        this.f۱۴۴۲۴i0 = (TextView) findViewById(R.id.txt_value13);
        this.f۱۴۴۲۵j0 = (TextView) findViewById(R.id.txt_value14);
        this.f۱۴۴۲۶k0 = (TextView) findViewById(R.id.txt_value15);
        this.f۱۴۴۲۷l0 = (TextView) findViewById(R.id.txt_value16);
        this.f۱۴۴۲۸m0 = (TextView) findViewById(R.id.txt_value17);
        this.f۱۴۴۲۹n0 = (TextView) findViewById(R.id.txt_value18);
        this.f۱۴۴۳۰o0 = (TextView) findViewById(R.id.txt_value19);
        this.f۱۴۴۳۱p0 = (TextView) findViewById(R.id.txt_value20);
        this.f۱۴۴۳۲q0 = (TextView) findViewById(R.id.txt_value21);
        this.f۱۴۴۳۴r0 = (TextView) findViewById(R.id.txt_value22);
        this.f۱۴۴۳۶s0 = (TextView) findViewById(R.id.txt_value23);
        this.f۱۴۴۳۸t0 = (TextView) findViewById(R.id.txt_value24);
        this.f۱۴۴۴۰u0 = (TextView) findViewById(R.id.txt_value25);
        Cf font = new Cf(this);
        this.f۱۴۴۴۱v.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۴۵x.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۴۳w.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۴۸z.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۹۰A.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۹۱B.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۹۲C.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۹۳D.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۹۴E.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۹۵F.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۹۶G.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۹۷H.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۹۸I.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۳۹۹J.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۰۰K.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۰۱L.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۰۲M.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۰۳N.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۰۴O.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۰۵P.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۰۶Q.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۰۷R.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۰۸S.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۰۹T.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۱۰U.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۱۱V.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۱۲W.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۱۳X.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۴۱۳X.setTextColor(Color.parseColor(Cc.m۱۷۷۴۱d()));
        this.f۱۴۴۱۴Y.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۱۵Z.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۱۶a0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۱۷b0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۱۸c0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۱۹d0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۲۰e0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۲۱f0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۲۳h0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۲۴i0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۲۵j0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۲۶k0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۲۷l0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۲۸m0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۲۹n0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۳۰o0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۳۱p0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۳۲q0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۳۴r0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۳۶s0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۳۸t0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۴۴۰u0.setTypeface(font.m۱۷۷۴۶a());
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCc());
        m۱۷۴۵۰m();
        if (savedInstanceState != null) {
            this.f۱۴۴۴۶x0 = (ArrayList) savedInstanceState.getSerializable("payment_list");
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.PaymentDetailActivity$c  reason: invalid class name */
    class View$OnClickListenerCc implements View.OnClickListener {
        View$OnClickListenerCc() {
        }

        public void onClick(View view) {
            PaymentDetailActivity.this.onBackPressed();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onBackPressed() {
        if (this.f۱۴۴۳۳r) {
            setResult(-1);
        }
        finish();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x04da  */
    /* renamed from: m  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۴۵۰m() {
        /*
        // Method dump skipped, instructions count: 1628
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.PaymentDetailActivity.m۱۷۴۵۰m():void");
    }
}
