package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lawyer_smartCalendar.p۲۸۹d.Ch;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Ci;
import com.mohamadamin.persianmaterialdatetimepicker.p۲۹۱j.Cb;
import java.text.DecimalFormat;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.u, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cu extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۹۹۰c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Ch> f۱۳۹۹۱d;

    /* renamed from: e, reason: contains not printable characters */
    DecimalFormat f۱۳۹۹۲e;

    public Cu(Context context, List<Ch> list) {
        this.f۱۳۹۹۰c = context;
        this.f۱۳۹۹۱d = list;
        new Ci(context);
        this.f۱۳۹۹۲e = new DecimalFormat("#,###,###,###,###,###,###");
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(this.f۱۳۹۹۰c);
        return new a(inflater.inflate(2131492979, parent, false));
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int position) {
        Cb mcurrentDate = new Cb();
        mcurrentDate.setTimeInMillis(Long.parseLong(this.f۱۳۹۹۱d.get(position).m۱۵۶۲۸b()));
        holder.f۱۳۹۹۳v.setText("تاریخ : " + mcurrentDate.m۱۵۹۳۰c());
        holder.f۱۳۹۹۳v.setTextColor(Cc.m۱۵۶۶۲c());
        String money = this.f۱۳۹۹۲e.format(Long.parseLong(this.f۱۳۹۹۱d.get(position).m۱۵۶۲۴a()));
        holder.f۱۳۹۹۴w.setText("مبلغ : " + money + " تومان");
        holder.f۱۳۹۹۵x.setText("شماره چک/سفته : " + this.f۱۳۹۹۱d.get(position).m۱۵۶۳۰c());
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۹۹۱d.size();
    }

    /* renamed from: com.lawyer_smartCalendar.a.u$a */
    protected class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        public TextView f۱۳۹۹۳v;

        /* renamed from: w, reason: contains not printable characters */
        public TextView f۱۳۹۹۴w;

        /* renamed from: x, reason: contains not printable characters */
        public TextView f۱۳۹۹۵x;

        /* renamed from: y, reason: contains not printable characters */
        public ImageView f۱۳۹۹۶y;

        public a(View itemView) {
            super(itemView);
            this.f۱۳۹۹۵x = (TextView) itemView.findViewById(2131296803);
            this.f۱۳۹۹۴w = (TextView) itemView.findViewById(2131296816);
            this.f۱۳۹۹۳v = (TextView) itemView.findViewById(2131296792);
            this.f۱۳۹۹۶y = (ImageView) itemView.findViewById(2131296260);
            this.f۱۳۹۹۶y.setOnClickListener(new ViewOnClickListenerC۱۴۶۴a(Cu.this));
            this.f۱۳۹۹۶y.setVisibility(8);
        }

        /* renamed from: com.lawyer_smartCalendar.a.u$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۶۴a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۶۴a(Cu cu) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Cu.this.f۱۳۹۹۱d.remove(a.this.m۱۲۳۲۰f());
                Cu.this.m۱۲۳۸۰d();
            }
        }
    }
}
