package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.PaymentDetailActivity;
import com.lawyer_smartCalendar.c.p;
import com.lawyer_smartCalendar.d.g;
import com.lawyer_smartCalendar.utils.c;
import com.lawyer_smartCalendar.utils.f;
import com.lawyer_smartCalendar.utils.i;
import com.mohamadamin.persianmaterialdatetimepicker.j.b;
import java.text.DecimalFormat;
import java.util.List;

public class c0 extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۲۹۳۴c;

    /* renamed from: d  reason: collision with root package name */
    private List<g> f۲۹۳۵d;

    /* renamed from: e  reason: collision with root package name */
    private f f۲۹۳۶e = new f(this.f۲۹۳۴c);

    /* renamed from: f  reason: collision with root package name */
    private i f۲۹۳۷f = new i(this.f۲۹۳۴c);

    /* renamed from: g  reason: collision with root package name */
    private DecimalFormat f۲۹۳۸g;

    /* renamed from: h  reason: collision with root package name */
    private p f۲۹۳۹h;

    public class a extends RecyclerView.d0 {
        TextView v;
        TextView w;
        TextView x;
        TextView y;

        public a(View convertView) {
            super(convertView);
            this.v = (TextView) convertView.findViewById(R.id.textView_client_name);
            this.w = (TextView) convertView.findViewById(R.id.textView_date);
            this.x = (TextView) convertView.findViewById(R.id.textView_value);
            this.y = (TextView) convertView.findViewById(R.id.textView_pay_type);
            convertView.setOnClickListener(new View$OnClickListenerC۰۰۷۳a(c0.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.c0$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۷۳a implements View.OnClickListener {
            View$OnClickListenerC۰۰۷۳a(c0 c0Var) {
            }

            public void onClick(View view) {
                Intent frm_payment_detail = new Intent(c0.this.f۲۹۳۴c, PaymentDetailActivity.class);
                frm_payment_detail.putExtra("id", ((g) c0.this.f۲۹۳۵d.get(a.this.f())).e() + "");
                c0.this.f۲۹۳۹h.b(frm_payment_detail);
            }
        }
    }

    public c0(Context Activity, p fragment, List<g> list) {
        a(true);
        this.f۲۹۳۴c = Activity;
        this.f۲۹۳۵d = list;
        this.f۲۹۳۹h = fragment;
        this.f۲۹۳۸g = new DecimalFormat("#,###,###,###,###,###,###");
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.payment_list_item, parent, false));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public void b(a holder, int pos) {
        char c2;
        this.f۲۹۳۷f.n();
        i iVar = this.f۲۹۳۷f;
        String client_name = this.f۲۹۳۷f.b(iVar.k(this.f۲۹۳۵d.get(pos).b() + "").g());
        this.f۲۹۳۷f.close();
        TextView textView = holder.v;
        textView.setText("موکل : " + client_name);
        b mcurrentDate = new b();
        mcurrentDate.setTimeInMillis(Long.parseLong(this.f۲۹۳۵d.get(pos).c()));
        TextView textView2 = holder.w;
        textView2.setText("تاریخ : " + mcurrentDate.c());
        String pay_type = "";
        String g2 = this.f۲۹۳۵d.get(pos).g();
        switch (g2.hashCode()) {
            case 3046195:
                if (g2.equals("cash")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 672998251:
                if (g2.equals("cardToCart")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1403045980:
                if (g2.equals("bankReceipt")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 2144269689:
                if (g2.equals("installment")) {
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
        holder.y.setText(pay_type);
        String money = this.f۲۹۳۸g.format(Long.parseLong(this.f۲۹۳۵d.get(pos).a()));
        TextView textView3 = holder.x;
        textView3.setText("مبلغ : " + money + " تومان ");
        holder.x.setTypeface(this.f۲۹۳۶e.b());
        holder.y.setTypeface(this.f۲۹۳۶e.b());
        holder.y.setTextColor(Color.parseColor(c.d()));
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۲۹۳۵d.size();
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public long a(int position) {
        return (long) position;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int b(int position) {
        return position;
    }
}
