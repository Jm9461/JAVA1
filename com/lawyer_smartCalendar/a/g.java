package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.DocumentDetailActivity;
import com.lawyer_smartCalendar.d.d;
import com.lawyer_smartCalendar.utils.f;
import com.lawyer_smartCalendar.utils.i;
import java.util.Calendar;
import java.util.List;

public class g extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۲۹۷۳c;

    /* renamed from: d  reason: collision with root package name */
    private List<d> f۲۹۷۴d;

    /* renamed from: e  reason: collision with root package name */
    private f f۲۹۷۵e = new f(this.f۲۹۷۳c);

    /* renamed from: f  reason: collision with root package name */
    private com.lawyer_smartCalendar.c.g f۲۹۷۶f;

    public class a extends RecyclerView.d0 {
        TextView v;
        TextView w;
        TextView x;
        TextView y;

        public a(View convertView) {
            super(convertView);
            this.v = (TextView) convertView.findViewById(R.id.textView_client_name);
            this.w = (TextView) convertView.findViewById(R.id.textView_document_type);
            this.x = (TextView) convertView.findViewById(R.id.textView_date);
            this.y = (TextView) convertView.findViewById(R.id.textView_hour);
            convertView.setOnClickListener(new View$OnClickListenerC۰۰۸۲a(g.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.g$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۸۲a implements View.OnClickListener {
            View$OnClickListenerC۰۰۸۲a(g gVar) {
            }

            public void onClick(View view) {
                Intent frmDocument = new Intent(g.this.f۲۹۷۳c, DocumentDetailActivity.class);
                frmDocument.putExtra("id", ((d) g.this.f۲۹۷۴d.get(a.this.f())).e() + "");
                g.this.f۲۹۷۶f.b(frmDocument);
            }
        }
    }

    public g(Context Activity, com.lawyer_smartCalendar.c.g fragmentTab1, List<d> list) {
        a(true);
        this.f۲۹۷۳c = Activity;
        this.f۲۹۷۴d = list;
        this.f۲۹۷۶f = fragmentTab1;
        new i(this.f۲۹۷۳c);
        Calendar.getInstance();
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.document_list_item, parent, false));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public void b(a holder, int pos) {
        char c2;
        String date_in;
        String date_out;
        String type = "";
        String d2 = this.f۲۹۷۴d.get(pos).d();
        switch (d2.hashCode()) {
            case -37847475:
                if (d2.equals("MarriageCertificate")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 65074408:
                if (d2.equals("Check")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 76517104:
                if (d2.equals("Other")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 445109232:
                if (d2.equals("SejliDocument")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            holder.w.setBackgroundResource(R.drawable.document_state_one);
            type = "چک";
        } else if (c2 == 1) {
            holder.w.setBackgroundResource(R.drawable.document_state_two);
            type = "سند ازدواج";
        } else if (c2 == 2) {
            holder.w.setBackgroundResource(R.drawable.document_state_three);
            type = "اسناد سجلی";
        } else if (c2 == 3) {
            holder.w.setBackgroundResource(R.drawable.document_state_four);
            type = "سایر مدارک";
        }
        holder.w.setText(type);
        if (!this.f۲۹۷۴d.get(pos).g().equals("")) {
            date_in = com.lawyer_smartCalendar.b.a.a(Long.valueOf(Long.parseLong(this.f۲۹۷۴d.get(pos).g())));
        } else {
            date_in = "-";
        }
        if (!this.f۲۹۷۴d.get(pos).c().equals("")) {
            date_out = com.lawyer_smartCalendar.b.a.a(Long.valueOf(Long.parseLong(this.f۲۹۷۴d.get(pos).c())));
        } else {
            date_out = "-";
        }
        TextView textView = holder.v;
        textView.setText("تاریخ دریافت: " + date_in);
        holder.x.setText("تاریخ تحویل");
        holder.y.setText(date_out);
        holder.v.setTypeface(this.f۲۹۷۵e.a());
        holder.w.setTypeface(this.f۲۹۷۵e.a());
        holder.x.setTypeface(this.f۲۹۷۵e.a());
        holder.y.setTypeface(this.f۲۹۷۵e.b());
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۲۹۷۴d.size();
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