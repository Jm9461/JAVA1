package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.p۲۸۷b.Ca;
import com.lawyer_smartCalendar.p۲۸۹d.Cb;
import com.lawyer_smartCalendar.utils.Cf;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.r, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cr extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۹۶۶c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Cb> f۱۳۹۶۷d;

    /* renamed from: e, reason: contains not printable characters */
    private String f۱۳۹۶۸e;

    /* renamed from: f, reason: contains not printable characters */
    private Cf f۱۳۹۶۹f;

    /* renamed from: com.lawyer_smartCalendar.a.r$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۹۷۰v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۹۷۱w;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۹۷۰v = (TextView) convertView.findViewById(2131296788);
            this.f۱۳۹۷۱w = (TextView) convertView.findViewById(2131296787);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۶۱a(Cr.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.r$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۶۱a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۶۱a(Cr cr) {
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x00b2, code lost:
            
                if (r2.equals("AddClientDocumentsActivity") != false) goto L۴۶;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onClick(android.view.View r12) {
                /*
                    Method dump skipped, instructions count: 792
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۲۸۶a.Cr.a.ViewOnClickListenerC۱۴۶۱a.onClick(android.view.View):void");
            }
        }
    }

    public Cr(Context Activity, String activityName, List<Cb> list) {
        m۱۲۳۶۸a(true);
        this.f۱۳۹۶۶c = Activity;
        this.f۱۳۹۶۷d = list;
        this.f۱۳۹۶۸e = activityName;
        this.f۱۳۹۶۹f = new Cf(this.f۱۳۹۶۶c);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131492942, parent, false);
        return new a(itemView);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int pos) {
        char c2;
        String title = "";
        String str = this.f۱۳۹۶۷d.get(pos).m۱۵۵۵۴o();
        switch (str.hashCode()) {
            case -1955878649:
                if (str.equals("Normal")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -888366013:
                if (str.equals("Challenge")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 2062940:
                if (str.equals("Bank")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 912993224:
                if (str.equals("Executive")) {
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
        holder.f۱۳۹۷۰v.setText(title);
        holder.f۱۳۹۷۱w.setText("تاریخ تشکیل پرونده: " + Ca.m۱۵۴۰۳a(Long.valueOf(Long.parseLong(this.f۱۳۹۶۷d.get(pos).m۱۵۵۴۶j()))));
        holder.f۱۳۹۷۰v.setTypeface(this.f۱۳۹۶۹f.m۱۵۶۶۸a());
        holder.f۱۳۹۷۱w.setTypeface(this.f۱۳۹۶۹f.m۱۵۶۷۱c());
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۹۶۷d.size();
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
