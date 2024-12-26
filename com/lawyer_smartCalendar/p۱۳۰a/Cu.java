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

/* renamed from: com.lawyer_smartCalendar.a.u  reason: invalid class name */
public class Cu extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۹۹۰c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Ch> f۱۳۹۹۱d;

    /* renamed from: e  reason: contains not printable characters */
    DecimalFormat f۱۳۹۹۲e = new DecimalFormat("#,###,###,###,###,###,###");

    public Cu(Context context, List<Ch> list) {
        this.f۱۳۹۹۰c = context;
        this.f۱۳۹۹۱d = list;
        new Ci(context);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۲۵۷b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(this.f۱۳۹۹۰c).inflate(R.layout.installment_item, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۲۵۹b(Ca holder, int position) {
        Cb mcurrentDate = new Cb();
        mcurrentDate.setTimeInMillis(Long.parseLong(this.f۱۳۹۹۱d.get(position).m۱۷۷۰۶b()));
        TextView textView = holder.f۱۳۹۹۳v;
        textView.setText("تاریخ : " + mcurrentDate.m۱۸۰۰۸c());
        holder.f۱۳۹۹۳v.setTextColor(Cc.m۱۷۷۴۰c());
        String money = this.f۱۳۹۹۲e.format(Long.parseLong(this.f۱۳۹۹۱d.get(position).m۱۷۷۰۲a()));
        TextView textView2 = holder.f۱۳۹۹۴w;
        textView2.setText("مبلغ : " + money + " تومان");
        TextView textView3 = holder.f۱۳۹۹۵x;
        textView3.setText("شماره چک/سفته : " + this.f۱۳۹۹۱d.get(position).m۱۷۷۰۸c());
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۲۵۵a() {
        return this.f۱۳۹۹۱d.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.lawyer_smartCalendar.a.u$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        public TextView f۱۳۹۹۳v;

        /* renamed from: w  reason: contains not printable characters */
        public TextView f۱۳۹۹۴w;

        /* renamed from: x  reason: contains not printable characters */
        public TextView f۱۳۹۹۵x;

        /* renamed from: y  reason: contains not printable characters */
        public ImageView f۱۳۹۹۶y;

        public Ca(View itemView) {
            super(itemView);
            this.f۱۳۹۹۵x = (TextView) itemView.findViewById(R.id.textView_number);
            this.f۱۳۹۹۴w = (TextView) itemView.findViewById(R.id.textView_value);
            this.f۱۳۹۹۳v = (TextView) itemView.findViewById(R.id.textView_date);
            this.f۱۳۹۹۶y = (ImageView) itemView.findViewById(R.id.ImageView_remove);
            this.f۱۳۹۹۶y.setOnClickListener(new View$OnClickListenerCa(Cu.this));
            this.f۱۳۹۹۶y.setVisibility(8);
        }

        /* renamed from: com.lawyer_smartCalendar.a.u$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cu uVar) {
            }

            public void onClick(View view) {
                Cu.this.f۱۳۹۹۱d.remove(Ca.this.m۱۴۳۹۰f());
                Cu.this.m۱۴۴۵۰d();
            }
        }
    }
}
