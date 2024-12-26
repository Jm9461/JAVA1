package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.support.p۰۴۷v7.widget.RecyclerView;
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
import com.lawyer_smartCalendar.p۱۳۳d.Cc;
import com.lawyer_smartCalendar.utils.Cf;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.s  reason: invalid class name */
public class Cs extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۹۷۴c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Cc> f۱۳۹۷۵d;

    /* renamed from: e  reason: contains not printable characters */
    private String f۱۳۹۷۶e;

    /* renamed from: f  reason: contains not printable characters */
    private Cf f۱۳۹۷۷f = new Cf(this.f۱۳۹۷۴c);

    /* renamed from: com.lawyer_smartCalendar.a.s$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۹۷۸v;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۹۷۸v = (TextView) convertView.findViewById(R.id.textView_client_name);
            convertView.setOnClickListener(new View$OnClickListenerCa(Cs.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.s$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cs sVar) {
            }

            /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
            public void onClick(View view) {
                char c;
                String str = Cs.this.f۱۳۹۷۶e;
                switch (str.hashCode()) {
                    case -2116993664:
                        if (str.equals("AddCaseActivity")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1810187351:
                        if (str.equals("AddMeetingActivity")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1166169996:
                        if (str.equals("AddPaymentActivity")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -281112510:
                        if (str.equals("AddNoteActivity")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1148691927:
                        if (str.equals("AddProceedingsTimesActivity")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1775911835:
                        if (str.equals("AddClientDocumentsActivity")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    ((AddCaseActivity) Cs.this.f۱۳۹۷۴c).input_client_name.setText(((Cc) Cs.this.f۱۳۹۷۵d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۴f());
                    ((AddCaseActivity) Cs.this.f۱۳۹۷۴c).f۱۴۰۴۳y = ((Cc) Cs.this.f۱۳۹۷۵d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۰d();
                    ((AddCaseActivity) Cs.this.f۱۳۹۷۴c).m۱۷۳۰۲m();
                } else if (c == 1) {
                    ((AddClientDocumentsActivity) Cs.this.f۱۳۹۷۴c).input_client_name.setText(((Cc) Cs.this.f۱۳۹۷۵d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۴f());
                    ((AddClientDocumentsActivity) Cs.this.f۱۳۹۷۴c).f۱۴۰۸۰v = ((Cc) Cs.this.f۱۳۹۷۵d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۰d();
                    ((AddClientDocumentsActivity) Cs.this.f۱۳۹۷۴c).f۱۴۰۸۱w = -1;
                    ((AddClientDocumentsActivity) Cs.this.f۱۳۹۷۴c).input_case.setText("");
                    ((AddClientDocumentsActivity) Cs.this.f۱۳۹۷۴c).m۱۷۳۲۰m();
                } else if (c == 2) {
                    ((AddNoteActivity) Cs.this.f۱۳۹۷۴c).input_client_name.setText(((Cc) Cs.this.f۱۳۹۷۵d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۴f());
                    ((AddNoteActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۴۶v = ((Cc) Cs.this.f۱۳۹۷۵d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۰d();
                    ((AddNoteActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۴۷w = -1;
                    ((AddNoteActivity) Cs.this.f۱۳۹۷۴c).input_case.setText("");
                    ((AddNoteActivity) Cs.this.f۱۳۹۷۴c).m۱۷۳۶۲m();
                } else if (c == 3) {
                    ((AddProceedingsTimesActivity) Cs.this.f۱۳۹۷۴c).input_client_name.setText(((Cc) Cs.this.f۱۳۹۷۵d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۴f());
                    ((AddProceedingsTimesActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۹۶v = ((Cc) Cs.this.f۱۳۹۷۵d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۰d();
                    ((AddProceedingsTimesActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۹۷w = -1;
                    ((AddProceedingsTimesActivity) Cs.this.f۱۳۹۷۴c).input_case.setText("");
                    ((AddProceedingsTimesActivity) Cs.this.f۱۳۹۷۴c).m۱۷۳۹۷m();
                } else if (c == 4) {
                    ((AddMeetingActivity) Cs.this.f۱۳۹۷۴c).input_client_name.setText(((Cc) Cs.this.f۱۳۹۷۵d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۴f());
                    ((AddMeetingActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۲۶v = ((Cc) Cs.this.f۱۳۹۷۵d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۰d();
                    ((AddMeetingActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۲۷w = -1;
                    ((AddMeetingActivity) Cs.this.f۱۳۹۷۴c).input_case.setText("");
                    ((AddMeetingActivity) Cs.this.f۱۳۹۷۴c).m۱۷۳۵۱m();
                } else if (c == 5) {
                    ((AddPaymentActivity) Cs.this.f۱۳۹۷۴c).input_client_name.setText(((Cc) Cs.this.f۱۳۹۷۵d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۴f());
                    ((AddPaymentActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۵۷B = ((Cc) Cs.this.f۱۳۹۷۵d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۰d();
                    ((AddPaymentActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۵۸C = -1;
                    ((AddPaymentActivity) Cs.this.f۱۳۹۷۴c).input_case.setText("");
                    ((AddPaymentActivity) Cs.this.f۱۳۹۷۴c).m۱۷۳۸۳m();
                }
            }
        }
    }

    public Cs(Context Activity, String activityName, List<Cc> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۹۷۴c = Activity;
        this.f۱۳۹۷۵d = list;
        this.f۱۳۹۷۶e = activityName;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۲۴۵b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.client_list_item_input, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۲۴۷b(Ca holder, int pos) {
        holder.f۱۳۹۷۸v.setText(this.f۱۳۹۷۵d.get(pos).m۱۷۶۴۴f());
        holder.f۱۳۹۷۸v.setTypeface(this.f۱۳۹۷۷f.m۱۷۷۴۶a());
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۲۴۱a() {
        return this.f۱۳۹۷۵d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۲۴۲a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۲۴۴b(int position) {
        return position;
    }
}
