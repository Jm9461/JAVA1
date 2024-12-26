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

public class u extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۳۰۴۹c;

    /* renamed from: d  reason: collision with root package name */
    private List<h> f۳۰۵۰d;

    /* renamed from: e  reason: collision with root package name */
    DecimalFormat f۳۰۵۱e = new DecimalFormat("#,###,###,###,###,###,###");

    public u(Context context, List<h> list) {
        this.f۳۰۴۹c = context;
        this.f۳۰۵۰d = list;
        new i(context);
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(this.f۳۰۴۹c).inflate(R.layout.installment_item, parent, false));
    }

    /* renamed from: a */
    public void b(a holder, int position) {
        b mcurrentDate = new b();
        mcurrentDate.setTimeInMillis(Long.parseLong(this.f۳۰۵۰d.get(position).b()));
        TextView textView = holder.v;
        textView.setText("تاریخ : " + mcurrentDate.c());
        holder.v.setTextColor(c.c());
        String money = this.f۳۰۵۱e.format(Long.parseLong(this.f۳۰۵۰d.get(position).a()));
        TextView textView2 = holder.w;
        textView2.setText("مبلغ : " + money + " تومان");
        TextView textView3 = holder.x;
        textView3.setText("شماره چک/سفته : " + this.f۳۰۵۰d.get(position).c());
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۳۰۵۰d.size();
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
            this.y.setOnClickListener(new View$OnClickListenerC۰۱۰۰a(u.this));
            this.y.setVisibility(8);
        }

        /* renamed from: com.lawyer_smartCalendar.a.u$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۱۰۰a implements View.OnClickListener {
            View$OnClickListenerC۰۱۰۰a(u uVar) {
            }

            public void onClick(View view) {
                u.this.f۳۰۵۰d.remove(a.this.f());
                u.this.d();
            }
        }
    }
}
