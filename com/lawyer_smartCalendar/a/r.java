package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.d.b;
import com.lawyer_smartCalendar.utils.f;
import java.util.List;

public class r extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۳۰۳۵c;

    /* renamed from: d  reason: collision with root package name */
    private List<b> f۳۰۳۶d;

    /* renamed from: e  reason: collision with root package name */
    private String f۳۰۳۷e;

    /* renamed from: f  reason: collision with root package name */
    private f f۳۰۳۸f = new f(this.f۳۰۳۵c);

    public class a extends RecyclerView.d0 {
        TextView v;
        TextView w;

        public a(View convertView) {
            super(convertView);
            this.v = (TextView) convertView.findViewById(R.id.textView_case_title);
            this.w = (TextView) convertView.findViewById(R.id.textView_case_date);
            convertView.setOnClickListener(new View$OnClickListenerC۰۰۹۷a(r.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.r$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۹۷a implements View.OnClickListener {
            View$OnClickListenerC۰۰۹۷a(r rVar) {
            }

            /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
                if (r2.equals("AddClientDocumentsActivity") != false) goto L_0x00de;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r12) {
                /*
                // Method dump skipped, instructions count: 792
                */
                throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.a.r.a.View$OnClickListenerC۰۰۹۷a.onClick(android.view.View):void");
            }
        }
    }

    public r(Context Activity, String activityName, List<b> list) {
        a(true);
        this.f۳۰۳۵c = Activity;
        this.f۳۰۳۶d = list;
        this.f۳۰۳۷e = activityName;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.case_list_item_input, parent, false));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public void b(a holder, int pos) {
        char c2;
        String title = "";
        String o = this.f۳۰۳۶d.get(pos).o();
        switch (o.hashCode()) {
            case -1955878649:
                if (o.equals("Normal")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -888366013:
                if (o.equals("Challenge")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 2062940:
                if (o.equals("Bank")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 912993224:
                if (o.equals("Executive")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            title = "عادی";
        } else if (c2 == 1) {
            title = "اجرایی";
        } else if (c2 == 2) {
            title = "معاضدتی/تسخیری";
        } else if (c2 == 3) {
            title = "بانکی";
        }
        holder.v.setText(title);
        TextView textView = holder.w;
        textView.setText("تاریخ تشکیل پرونده: " + com.lawyer_smartCalendar.b.a.a(Long.valueOf(Long.parseLong(this.f۳۰۳۶d.get(pos).j()))));
        holder.v.setTypeface(this.f۳۰۳۸f.a());
        holder.w.setTypeface(this.f۳۰۳۸f.c());
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۳۰۳۶d.size();
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
