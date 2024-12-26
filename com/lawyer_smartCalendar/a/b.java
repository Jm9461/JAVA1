package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.AddCityBankAccountActivity;
import com.lawyer_smartCalendar.utils.f;

public class b extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۲۹۲۳c;

    /* renamed from: d  reason: collision with root package name */
    private String[][] f۲۹۲۴d;

    /* renamed from: e  reason: collision with root package name */
    private Typeface f۲۹۲۵e = new f(this.f۲۹۲۳c).a();

    public class a extends RecyclerView.d0 {
        TextView v;

        public a(View convertView) {
            super(convertView);
            this.v = (TextView) convertView.findViewById(R.id.textView_type_name);
            convertView.setOnClickListener(new View$OnClickListenerC۰۰۷۱a(b.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.b$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۷۱a implements View.OnClickListener {
            View$OnClickListenerC۰۰۷۱a(b bVar) {
            }

            public void onClick(View view) {
                ((AddCityBankAccountActivity) b.this.f۲۹۲۳c).input_select_type.setText(b.this.f۲۹۲۴d[a.this.f()][1]);
                ((AddCityBankAccountActivity) b.this.f۲۹۲۳c).w = b.this.f۲۹۲۴d[a.this.f()][0];
                ((AddCityBankAccountActivity) b.this.f۲۹۲۳c).a("type");
            }
        }
    }

    public b(Context Activity, String[][] type_list) {
        a(true);
        this.f۲۹۲۳c = Activity;
        this.f۲۹۲۴d = type_list;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.type_list_item, parent, false));
    }

    /* renamed from: a */
    public void b(a holder, int pos) {
        holder.v.setText(this.f۲۹۲۴d[pos][1]);
        holder.v.setTypeface(this.f۲۹۲۵e);
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۲۹۲۴d.length;
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
