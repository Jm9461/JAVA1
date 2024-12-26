package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.AddCaseActivity;
import com.lawyer_smartCalendar.activity.AddClientDocumentsActivity;
import com.lawyer_smartCalendar.activity.AddMeetingActivity;
import com.lawyer_smartCalendar.activity.AddNoteActivity;
import com.lawyer_smartCalendar.activity.AddPaymentActivity;
import com.lawyer_smartCalendar.activity.AddProceedingsTimesActivity;
import com.lawyer_smartCalendar.d.c;
import com.lawyer_smartCalendar.utils.f;
import java.util.List;

public class s extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۳۰۴۰c;

    /* renamed from: d  reason: collision with root package name */
    private List<c> f۳۰۴۱d;

    /* renamed from: e  reason: collision with root package name */
    private String f۳۰۴۲e;

    /* renamed from: f  reason: collision with root package name */
    private f f۳۰۴۳f = new f(this.f۳۰۴۰c);

    public class a extends RecyclerView.d0 {
        TextView v;

        public a(View convertView) {
            super(convertView);
            this.v = (TextView) convertView.findViewById(R.id.textView_client_name);
            convertView.setOnClickListener(new View$OnClickListenerC۰۰۹۸a(s.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.s$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۹۸a implements View.OnClickListener {
            View$OnClickListenerC۰۰۹۸a(s sVar) {
            }

            /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
            public void onClick(View view) {
                char c2;
                String str = s.this.f۳۰۴۲e;
                switch (str.hashCode()) {
                    case -2116993664:
                        if (str.equals("AddCaseActivity")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1810187351:
                        if (str.equals("AddMeetingActivity")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1166169996:
                        if (str.equals("AddPaymentActivity")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -281112510:
                        if (str.equals("AddNoteActivity")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1148691927:
                        if (str.equals("AddProceedingsTimesActivity")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1775911835:
                        if (str.equals("AddClientDocumentsActivity")) {
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
                    ((AddCaseActivity) s.this.f۳۰۴۰c).input_client_name.setText(((c) s.this.f۳۰۴۱d.get(a.this.f())).f());
                    ((AddCaseActivity) s.this.f۳۰۴۰c).y = ((c) s.this.f۳۰۴۱d.get(a.this.f())).d();
                    ((AddCaseActivity) s.this.f۳۰۴۰c).m();
                } else if (c2 == 1) {
                    ((AddClientDocumentsActivity) s.this.f۳۰۴۰c).input_client_name.setText(((c) s.this.f۳۰۴۱d.get(a.this.f())).f());
                    ((AddClientDocumentsActivity) s.this.f۳۰۴۰c).v = ((c) s.this.f۳۰۴۱d.get(a.this.f())).d();
                    ((AddClientDocumentsActivity) s.this.f۳۰۴۰c).w = -1;
                    ((AddClientDocumentsActivity) s.this.f۳۰۴۰c).input_case.setText("");
                    ((AddClientDocumentsActivity) s.this.f۳۰۴۰c).m();
                } else if (c2 == 2) {
                    ((AddNoteActivity) s.this.f۳۰۴۰c).input_client_name.setText(((c) s.this.f۳۰۴۱d.get(a.this.f())).f());
                    ((AddNoteActivity) s.this.f۳۰۴۰c).v = ((c) s.this.f۳۰۴۱d.get(a.this.f())).d();
                    ((AddNoteActivity) s.this.f۳۰۴۰c).w = -1;
                    ((AddNoteActivity) s.this.f۳۰۴۰c).input_case.setText("");
                    ((AddNoteActivity) s.this.f۳۰۴۰c).m();
                } else if (c2 == 3) {
                    ((AddProceedingsTimesActivity) s.this.f۳۰۴۰c).input_client_name.setText(((c) s.this.f۳۰۴۱d.get(a.this.f())).f());
                    ((AddProceedingsTimesActivity) s.this.f۳۰۴۰c).v = ((c) s.this.f۳۰۴۱d.get(a.this.f())).d();
                    ((AddProceedingsTimesActivity) s.this.f۳۰۴۰c).w = -1;
                    ((AddProceedingsTimesActivity) s.this.f۳۰۴۰c).input_case.setText("");
                    ((AddProceedingsTimesActivity) s.this.f۳۰۴۰c).m();
                } else if (c2 == 4) {
                    ((AddMeetingActivity) s.this.f۳۰۴۰c).input_client_name.setText(((c) s.this.f۳۰۴۱d.get(a.this.f())).f());
                    ((AddMeetingActivity) s.this.f۳۰۴۰c).v = ((c) s.this.f۳۰۴۱d.get(a.this.f())).d();
                    ((AddMeetingActivity) s.this.f۳۰۴۰c).w = -1;
                    ((AddMeetingActivity) s.this.f۳۰۴۰c).input_case.setText("");
                    ((AddMeetingActivity) s.this.f۳۰۴۰c).m();
                } else if (c2 == 5) {
                    ((AddPaymentActivity) s.this.f۳۰۴۰c).input_client_name.setText(((c) s.this.f۳۰۴۱d.get(a.this.f())).f());
                    ((AddPaymentActivity) s.this.f۳۰۴۰c).B = ((c) s.this.f۳۰۴۱d.get(a.this.f())).d();
                    ((AddPaymentActivity) s.this.f۳۰۴۰c).C = -1;
                    ((AddPaymentActivity) s.this.f۳۰۴۰c).input_case.setText("");
                    ((AddPaymentActivity) s.this.f۳۰۴۰c).m();
                }
            }
        }
    }

    public s(Context Activity, String activityName, List<c> list) {
        a(true);
        this.f۳۰۴۰c = Activity;
        this.f۳۰۴۱d = list;
        this.f۳۰۴۲e = activityName;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.client_list_item_input, parent, false));
    }

    /* renamed from: a */
    public void b(a holder, int pos) {
        holder.v.setText(this.f۳۰۴۱d.get(pos).f());
        holder.v.setTypeface(this.f۳۰۴۳f.a());
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۳۰۴۱d.size();
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
