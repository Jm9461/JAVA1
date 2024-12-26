package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.PaymentDetailActivity;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCp;
import com.lawyer_smartCalendar.p۲۸۹d.Cb;
import com.lawyer_smartCalendar.p۲۸۹d.Cg;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import java.text.DecimalFormat;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.c0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc0 extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۷۷۷c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Cg> f۱۳۷۷۸d;

    /* renamed from: e, reason: contains not printable characters */
    private Cf f۱۳۷۷۹e;

    /* renamed from: f, reason: contains not printable characters */
    private Ci f۱۳۷۸۰f;

    /* renamed from: g, reason: contains not printable characters */
    private DecimalFormat f۱۳۷۸۱g;

    /* renamed from: h, reason: contains not printable characters */
    private ViewOnClickListenerCp f۱۳۷۸۲h;

    /* renamed from: com.lawyer_smartCalendar.a.c0$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۷۸۳v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۷۸۴w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۳۷۸۵x;

        /* renamed from: y, reason: contains not printable characters */
        TextView f۱۳۷۸۶y;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۷۸۳v = (TextView) convertView.findViewById(2131296790);
            this.f۱۳۷۸۴w = (TextView) convertView.findViewById(2131296792);
            this.f۱۳۷۸۵x = (TextView) convertView.findViewById(2131296816);
            this.f۱۳۷۸۶y = (TextView) convertView.findViewById(2131296805);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۳۷a(Cc0.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.c0$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۳۷a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۳۷a(Cc0 cc0) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frm_payment_detail = new Intent(Cc0.this.f۱۳۷۷۷c, (Class<?>) PaymentDetailActivity.class);
                frm_payment_detail.putExtra("id", ((Cg) Cc0.this.f۱۳۷۷۸d.get(a.this.m۱۲۳۲۰f())).m۱۵۶۲۰e() + "");
                Cc0.this.f۱۳۷۸۲h.m۱۵۴۸۹b(frm_payment_detail);
            }
        }
    }

    public Cc0(Context Activity, ViewOnClickListenerCp fragment, List<Cg> list) {
        m۱۲۳۶۸a(true);
        this.f۱۳۷۷۷c = Activity;
        this.f۱۳۷۷۸d = list;
        this.f۱۳۷۷۹e = new Cf(this.f۱۳۷۷۷c);
        this.f۱۳۷۸۰f = new Ci(this.f۱۳۷۷۷c);
        this.f۱۳۷۸۲h = fragment;
        this.f۱۳۷۸۱g = new DecimalFormat("#,###,###,###,###,###,###");
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131493034, parent, false);
        return new a(itemView);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int pos) {
        char c2;
        this.f۱۳۷۸۰f.m۱۵۷۳۳n();
        Cb case1 = this.f۱۳۷۸۰f.m۱۵۷۲۶k(this.f۱۳۷۷۸d.get(pos).m۱۵۶۱۳b() + "");
        String client_name = this.f۱۳۷۸۰f.m۱۵۷۰۳b(case1.m۱۵۵۴۰g());
        this.f۱۳۷۸۰f.close();
        holder.f۱۳۷۸۳v.setText("موکل : " + client_name);
        com.mohamadamin.persianmaterialdatetimepicker.p۲۹۱j.Cb mcurrentDate = new com.mohamadamin.persianmaterialdatetimepicker.p۲۹۱j.Cb();
        mcurrentDate.setTimeInMillis(Long.parseLong(this.f۱۳۷۷۸d.get(pos).m۱۵۶۱۶c()));
        holder.f۱۳۷۸۴w.setText("تاریخ : " + mcurrentDate.m۱۵۹۳۰c());
        String pay_type = "";
        String str = this.f۱۳۷۷۸d.get(pos).m۱۵۶۲۳g();
        switch (str.hashCode()) {
            case 3046195:
                if (str.equals("cash")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 672998251:
                if (str.equals("cardToCart")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1403045980:
                if (str.equals("bankReceipt")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 2144269689:
                if (str.equals("installment")) {
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
            pay_type = "نقدی";
        } else if (c2 == 1) {
            pay_type = "فیش بانکی";
        } else if (c2 == 2) {
            pay_type = "کارت به کارت";
        } else if (c2 == 3) {
            pay_type = "اقساطی";
        }
        holder.f۱۳۷۸۶y.setText(pay_type);
        String money = this.f۱۳۷۸۱g.format(Long.parseLong(this.f۱۳۷۷۸d.get(pos).m۱۵۶۱۰a()));
        holder.f۱۳۷۸۵x.setText("مبلغ : " + money + " تومان ");
        holder.f۱۳۷۸۵x.setTypeface(this.f۱۳۷۷۹e.m۱۵۶۷۰b());
        holder.f۱۳۷۸۶y.setTypeface(this.f۱۳۷۷۹e.m۱۵۶۷۰b());
        holder.f۱۳۷۸۶y.setTextColor(Color.parseColor(Cc.m۱۵۶۶۳d()));
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۷۷۸d.size();
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public long mo۱۵۲۰۷a(int position) {
        return position;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: contains not printable characters */
    public int mo۱۷۶۵۸b(int position) {
        return position;
    }
}
