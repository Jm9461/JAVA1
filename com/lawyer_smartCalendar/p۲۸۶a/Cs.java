package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.AddCaseActivity;
import com.lawyer_smartCalendar.activity.AddClientDocumentsActivity;
import com.lawyer_smartCalendar.activity.AddMeetingActivity;
import com.lawyer_smartCalendar.activity.AddNoteActivity;
import com.lawyer_smartCalendar.activity.AddPaymentActivity;
import com.lawyer_smartCalendar.activity.AddProceedingsTimesActivity;
import com.lawyer_smartCalendar.p۲۸۹d.Cc;
import com.lawyer_smartCalendar.utils.Cf;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.s, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cs extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۹۷۴c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Cc> f۱۳۹۷۵d;

    /* renamed from: e, reason: contains not printable characters */
    private String f۱۳۹۷۶e;

    /* renamed from: f, reason: contains not printable characters */
    private Cf f۱۳۹۷۷f;

    /* renamed from: com.lawyer_smartCalendar.a.s$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۹۷۸v;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۹۷۸v = (TextView) convertView.findViewById(2131296790);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۶۲a(Cs.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.s$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۶۲a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۶۲a(Cs cs) {
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                char c2;
                String str = Cs.this.f۱۳۹۷۶e;
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
                    ((AddCaseActivity) Cs.this.f۱۳۹۷۴c).input_client_name.setText(((Cc) Cs.this.f۱۳۹۷۵d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۶f());
                    ((AddCaseActivity) Cs.this.f۱۳۹۷۴c).f۱۴۰۴۳y = ((Cc) Cs.this.f۱۳۹۷۵d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۲d();
                    ((AddCaseActivity) Cs.this.f۱۳۹۷۴c).m۱۵۲۲۴m();
                    return;
                }
                if (c2 == 1) {
                    ((AddClientDocumentsActivity) Cs.this.f۱۳۹۷۴c).input_client_name.setText(((Cc) Cs.this.f۱۳۹۷۵d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۶f());
                    ((AddClientDocumentsActivity) Cs.this.f۱۳۹۷۴c).f۱۴۰۸۰v = ((Cc) Cs.this.f۱۳۹۷۵d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۲d();
                    ((AddClientDocumentsActivity) Cs.this.f۱۳۹۷۴c).f۱۴۰۸۱w = -1;
                    ((AddClientDocumentsActivity) Cs.this.f۱۳۹۷۴c).input_case.setText("");
                    ((AddClientDocumentsActivity) Cs.this.f۱۳۹۷۴c).m۱۵۲۴۲m();
                    return;
                }
                if (c2 == 2) {
                    ((AddNoteActivity) Cs.this.f۱۳۹۷۴c).input_client_name.setText(((Cc) Cs.this.f۱۳۹۷۵d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۶f());
                    ((AddNoteActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۴۶v = ((Cc) Cs.this.f۱۳۹۷۵d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۲d();
                    ((AddNoteActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۴۷w = -1;
                    ((AddNoteActivity) Cs.this.f۱۳۹۷۴c).input_case.setText("");
                    ((AddNoteActivity) Cs.this.f۱۳۹۷۴c).m۱۵۲۸۴m();
                    return;
                }
                if (c2 == 3) {
                    ((AddProceedingsTimesActivity) Cs.this.f۱۳۹۷۴c).input_client_name.setText(((Cc) Cs.this.f۱۳۹۷۵d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۶f());
                    ((AddProceedingsTimesActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۹۶v = ((Cc) Cs.this.f۱۳۹۷۵d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۲d();
                    ((AddProceedingsTimesActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۹۷w = -1;
                    ((AddProceedingsTimesActivity) Cs.this.f۱۳۹۷۴c).input_case.setText("");
                    ((AddProceedingsTimesActivity) Cs.this.f۱۳۹۷۴c).m۱۵۳۱۹m();
                    return;
                }
                if (c2 == 4) {
                    ((AddMeetingActivity) Cs.this.f۱۳۹۷۴c).input_client_name.setText(((Cc) Cs.this.f۱۳۹۷۵d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۶f());
                    ((AddMeetingActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۲۶v = ((Cc) Cs.this.f۱۳۹۷۵d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۲d();
                    ((AddMeetingActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۲۷w = -1;
                    ((AddMeetingActivity) Cs.this.f۱۳۹۷۴c).input_case.setText("");
                    ((AddMeetingActivity) Cs.this.f۱۳۹۷۴c).m۱۵۲۷۳m();
                    return;
                }
                if (c2 == 5) {
                    ((AddPaymentActivity) Cs.this.f۱۳۹۷۴c).input_client_name.setText(((Cc) Cs.this.f۱۳۹۷۵d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۶f());
                    ((AddPaymentActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۵۷B = ((Cc) Cs.this.f۱۳۹۷۵d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۲d();
                    ((AddPaymentActivity) Cs.this.f۱۳۹۷۴c).f۱۴۱۵۸C = -1;
                    ((AddPaymentActivity) Cs.this.f۱۳۹۷۴c).input_case.setText("");
                    ((AddPaymentActivity) Cs.this.f۱۳۹۷۴c).m۱۵۳۰۵m();
                }
            }
        }
    }

    public Cs(Context Activity, String activityName, List<Cc> list) {
        m۱۲۳۶۸a(true);
        this.f۱۳۹۷۴c = Activity;
        this.f۱۳۹۷۵d = list;
        this.f۱۳۹۷۶e = activityName;
        this.f۱۳۹۷۷f = new Cf(this.f۱۳۹۷۴c);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131492950, parent, false);
        return new a(itemView);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int pos) {
        holder.f۱۳۹۷۸v.setText(this.f۱۳۹۷۵d.get(pos).m۱۵۵۶۶f());
        holder.f۱۳۹۷۸v.setTypeface(this.f۱۳۹۷۷f.m۱۵۶۶۸a());
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۹۷۵d.size();
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public long mo۱۵۲۰۷a(int position) {
        return position;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: contains not printable characters */
    public int mo۱۷۶۵۸b(int position) {
        return position;
    }
}
