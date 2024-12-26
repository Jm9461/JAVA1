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

/* renamed from: com.lawyer_smartCalendar.a.t, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ct extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۹۸۱c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Ch> f۱۳۹۸۲d;

    /* renamed from: e, reason: contains not printable characters */
    DecimalFormat f۱۳۹۸۳e;

    public Ct(Context context, List<Ch> list) {
        this.f۱۳۹۸۱c = context;
        this.f۱۳۹۸۲d = list;
        new Ci(context);
        this.f۱۳۹۸۳e = new DecimalFormat("#,###,###,###,###,###,###");
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(this.f۱۳۹۸۱c);
        return new a(inflater.inflate(2131492979, parent, false));
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int position) {
        Cb mcurrentDate = new Cb();
        mcurrentDate.setTimeInMillis(Long.parseLong(this.f۱۳۹۸۲d.get(position).m۱۵۶۲۸b()));
        holder.f۱۳۹۸۴v.setText("تاریخ : " + mcurrentDate.m۱۵۹۳۰c());
        holder.f۱۳۹۸۴v.setTextColor(Cc.m۱۵۶۶۲c());
        String money = this.f۱۳۹۸۳e.format(Long.parseLong(this.f۱۳۹۸۲d.get(position).m۱۵۶۲۴a()));
        holder.f۱۳۹۸۵w.setText("مبلغ : " + money + " تومان");
        holder.f۱۳۹۸۶x.setText("شماره چک/سفته : " + this.f۱۳۹۸۲d.get(position).m۱۵۶۳۰c());
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۹۸۲d.size();
    }

    /* renamed from: com.lawyer_smartCalendar.a.t$a */
    protected class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        public TextView f۱۳۹۸۴v;

        /* renamed from: w, reason: contains not printable characters */
        public TextView f۱۳۹۸۵w;

        /* renamed from: x, reason: contains not printable characters */
        public TextView f۱۳۹۸۶x;

        /* renamed from: y, reason: contains not printable characters */
        public ImageView f۱۳۹۸۷y;

        public a(View itemView) {
            super(itemView);
            this.f۱۳۹۸۶x = (TextView) itemView.findViewById(2131296803);
            this.f۱۳۹۸۵w = (TextView) itemView.findViewById(2131296816);
            this.f۱۳۹۸۴v = (TextView) itemView.findViewById(2131296792);
            this.f۱۳۹۸۷y = (ImageView) itemView.findViewById(2131296260);
            this.f۱۳۹۸۷y.setOnClickListener(new ViewOnClickListenerC۱۴۶۳a(Ct.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.t$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۶۳a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۶۳a(Ct ct) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Ct.this.f۱۳۹۸۲d.remove(a.this.m۱۲۳۲۰f());
                Ct.this.m۱۲۳۸۰d();
            }
        }
    }
}
