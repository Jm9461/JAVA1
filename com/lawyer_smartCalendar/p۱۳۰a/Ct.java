package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.p۱۳۳d.Ch;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Ci;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb;
import java.text.DecimalFormat;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.t  reason: invalid class name */
public class Ct extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۹۸۱c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Ch> f۱۳۹۸۲d;

    /* renamed from: e  reason: contains not printable characters */
    DecimalFormat f۱۳۹۸۳e = new DecimalFormat("#,###,###,###,###,###,###");

    public Ct(Context context, List<Ch> list) {
        this.f۱۳۹۸۱c = context;
        this.f۱۳۹۸۲d = list;
        new Ci(context);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۲۵۱b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(this.f۱۳۹۸۱c).inflate(R.layout.installment_item, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۲۵۳b(Ca holder, int position) {
        Cb mcurrentDate = new Cb();
        mcurrentDate.setTimeInMillis(Long.parseLong(this.f۱۳۹۸۲d.get(position).m۱۷۷۰۶b()));
        TextView textView = holder.f۱۳۹۸۴v;
        textView.setText("تاریخ : " + mcurrentDate.m۱۸۰۰۸c());
        holder.f۱۳۹۸۴v.setTextColor(Cc.m۱۷۷۴۰c());
        String money = this.f۱۳۹۸۳e.format(Long.parseLong(this.f۱۳۹۸۲d.get(position).m۱۷۷۰۲a()));
        TextView textView2 = holder.f۱۳۹۸۵w;
        textView2.setText("مبلغ : " + money + " تومان");
        TextView textView3 = holder.f۱۳۹۸۶x;
        textView3.setText("شماره چک/سفته : " + this.f۱۳۹۸۲d.get(position).m۱۷۷۰۸c());
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۲۴۹a() {
        return this.f۱۳۹۸۲d.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.lawyer_smartCalendar.a.t$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        public TextView f۱۳۹۸۴v;

        /* renamed from: w  reason: contains not printable characters */
        public TextView f۱۳۹۸۵w;

        /* renamed from: x  reason: contains not printable characters */
        public TextView f۱۳۹۸۶x;

        /* renamed from: y  reason: contains not printable characters */
        public ImageView f۱۳۹۸۷y;

        public Ca(View itemView) {
            super(itemView);
            this.f۱۳۹۸۶x = (TextView) itemView.findViewById(R.id.textView_number);
            this.f۱۳۹۸۵w = (TextView) itemView.findViewById(R.id.textView_value);
            this.f۱۳۹۸۴v = (TextView) itemView.findViewById(R.id.textView_date);
            this.f۱۳۹۸۷y = (ImageView) itemView.findViewById(R.id.ImageView_remove);
            this.f۱۳۹۸۷y.setOnClickListener(new View$OnClickListenerCa(Ct.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.t$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Ct tVar) {
            }

            public void onClick(View view) {
                Ct.this.f۱۳۹۸۲d.remove(Ca.this.m۱۴۳۹۰f());
                Ct.this.m۱۴۴۵۰d();
            }
        }
    }
}
