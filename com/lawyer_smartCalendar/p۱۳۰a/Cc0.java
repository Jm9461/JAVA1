package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.PaymentDetailActivity;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCp;
import com.lawyer_smartCalendar.p۱۳۳d.Cg;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb;
import java.text.DecimalFormat;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.c0  reason: invalid class name */
public class Cc0 extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۷۷۷c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Cg> f۱۳۷۷۸d;

    /* renamed from: e  reason: contains not printable characters */
    private Cf f۱۳۷۷۹e = new Cf(this.f۱۳۷۷۷c);

    /* renamed from: f  reason: contains not printable characters */
    private Ci f۱۳۷۸۰f = new Ci(this.f۱۳۷۷۷c);

    /* renamed from: g  reason: contains not printable characters */
    private DecimalFormat f۱۳۷۸۱g;

    /* renamed from: h  reason: contains not printable characters */
    private View$OnClickListenerCp f۱۳۷۸۲h;

    /* renamed from: com.lawyer_smartCalendar.a.c0$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۷۸۳v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۷۸۴w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۷۸۵x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۳۷۸۶y;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۷۸۳v = (TextView) convertView.findViewById(R.id.textView_client_name);
            this.f۱۳۷۸۴w = (TextView) convertView.findViewById(R.id.textView_date);
            this.f۱۳۷۸۵x = (TextView) convertView.findViewById(R.id.textView_value);
            this.f۱۳۷۸۶y = (TextView) convertView.findViewById(R.id.textView_pay_type);
            convertView.setOnClickListener(new View$OnClickListenerCa(Cc0.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.c0$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cc0 c0Var) {
            }

            public void onClick(View view) {
                Intent frm_payment_detail = new Intent(Cc0.this.f۱۳۷۷۷c, PaymentDetailActivity.class);
                frm_payment_detail.putExtra("id", ((Cg) Cc0.this.f۱۳۷۷۸d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۹۸e() + "");
                Cc0.this.f۱۳۷۸۲h.m۱۷۵۶۷b(frm_payment_detail);
            }
        }
    }

    public Cc0(Context Activity, View$OnClickListenerCp fragment, List<Cg> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۷۷۷c = Activity;
        this.f۱۳۷۷۸d = list;
        this.f۱۳۷۸۲h = fragment;
        this.f۱۳۷۸۱g = new DecimalFormat("#,###,###,###,###,###,###");
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۰۶۴b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.payment_list_item, parent, false));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۰۶۶b(Ca holder, int pos) {
        char c;
        this.f۱۳۷۸۰f.m۱۷۸۱۱n();
        Ci iVar = this.f۱۳۷۸۰f;
        String client_name = this.f۱۳۷۸۰f.m۱۷۷۸۱b(iVar.m۱۷۸۰۴k(this.f۱۳۷۷۸d.get(pos).m۱۷۶۹۱b() + "").m۱۷۶۱۸g());
        this.f۱۳۷۸۰f.close();
        TextView textView = holder.f۱۳۷۸۳v;
        textView.setText("موکل : " + client_name);
        Cb mcurrentDate = new Cb();
        mcurrentDate.setTimeInMillis(Long.parseLong(this.f۱۳۷۷۸d.get(pos).m۱۷۶۹۴c()));
        TextView textView2 = holder.f۱۳۷۸۴w;
        textView2.setText("تاریخ : " + mcurrentDate.m۱۸۰۰۸c());
        String pay_type = "";
        String g = this.f۱۳۷۷۸d.get(pos).m۱۷۷۰۱g();
        switch (g.hashCode()) {
            case 3046195:
                if (g.equals("cash")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 672998251:
                if (g.equals("cardToCart")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1403045980:
                if (g.equals("bankReceipt")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2144269689:
                if (g.equals("installment")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            pay_type = "نقدی";
        } else if (c == 1) {
            pay_type = "فیش بانکی";
        } else if (c == 2) {
            pay_type = "کارت به کارت";
        } else if (c == 3) {
            pay_type = "اقساطی";
        }
        holder.f۱۳۷۸۶y.setText(pay_type);
        String money = this.f۱۳۷۸۱g.format(Long.parseLong(this.f۱۳۷۷۸d.get(pos).m۱۷۶۸۸a()));
        TextView textView3 = holder.f۱۳۷۸۵x;
        textView3.setText("مبلغ : " + money + " تومان ");
        holder.f۱۳۷۸۵x.setTypeface(this.f۱۳۷۷۹e.m۱۷۷۴۸b());
        holder.f۱۳۷۸۶y.setTypeface(this.f۱۳۷۷۹e.m۱۷۷۴۸b());
        holder.f۱۳۷۸۶y.setTextColor(Color.parseColor(Cc.m۱۷۷۴۱d()));
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۰۶۰a() {
        return this.f۱۳۷۷۸d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۰۶۱a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۰۶۳b(int position) {
        return position;
    }
}
