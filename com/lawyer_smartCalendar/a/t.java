package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.d.h;
import com.lawyer_smartCalendar.utils.c;
import com.lawyer_smartCalendar.utils.i;
import com.mohamadamin.persianmaterialdatetimepicker.j.b;
import java.text.DecimalFormat;
import java.util.List;

public class t extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۳۰۴۵c;

    /* renamed from: d  reason: collision with root package name */
    private List<h> f۳۰۴۶d;

    /* renamed from: e  reason: collision with root package name */
    DecimalFormat f۳۰۴۷e = new DecimalFormat("#,###,###,###,###,###,###");

    public t(Context context, List<h> list) {
        this.f۳۰۴۵c = context;
        this.f۳۰۴۶d = list;
        new i(context);
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(this.f۳۰۴۵c).inflate(R.layout.installment_item, parent, false));
    }

    /* renamed from: a */
    public void b(a holder, int position) {
        b mcurrentDate = new b();
        mcurrentDate.setTimeInMillis(Long.parseLong(this.f۳۰۴۶d.get(position).b()));
        TextView textView = holder.v;
        textView.setText("تاریخ : " + mcurrentDate.c());
        holder.v.setTextColor(c.c());
        String money = this.f۳۰۴۷e.format(Long.parseLong(this.f۳۰۴۶d.get(position).a()));
        TextView textView2 = holder.w;
        textView2.setText("مبلغ : " + money + " تومان");
        TextView textView3 = holder.x;
        textView3.setText("شماره چک/سفته : " + this.f۳۰۴۶d.get(position).c());
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۳۰۴۶d.size();
    }

    /* access modifiers changed from: protected */
    public class a extends RecyclerView.d0 {
        public TextView v;
        public TextView w;
        public TextView x;
        public ImageView y;

        public a(View itemView) {
            super(itemView);
            this.x = (TextView) itemView.findViewById(R.id.textView_number);
            this.w = (TextView) itemView.findViewById(R.id.textView_value);
            this.v = (TextView) itemView.findViewById(R.id.textView_date);
            this.y = (ImageView) itemView.findViewById(R.id.ImageView_remove);
            this.y.setOnClickListener(new View$OnClickListenerC۰۰۹۹a(t.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.t$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۹۹a implements View.OnClickListener {
            View$OnClickListenerC۰۰۹۹a(t tVar) {
            }

            public void onClick(View view) {
                t.this.f۳۰۴۶d.remove(a.this.f());
                t.this.d();
            }
        }
    }
}
