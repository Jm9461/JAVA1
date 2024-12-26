package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.NoteDetailActivity;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCo;
import com.lawyer_smartCalendar.p۲۸۹d.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.w, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cw extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۴۰۰۵c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Cf> f۱۴۰۰۶d;

    /* renamed from: e, reason: contains not printable characters */
    private com.lawyer_smartCalendar.utils.Cf f۱۴۰۰۷e;

    /* renamed from: f, reason: contains not printable characters */
    private Calendar f۱۴۰۰۸f;

    /* renamed from: g, reason: contains not printable characters */
    private ViewOnClickListenerCo f۱۴۰۰۹g;

    /* renamed from: com.lawyer_smartCalendar.a.w$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۴۰۱۰v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۴۰۱۱w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۴۰۱۲x;

        /* renamed from: y, reason: contains not printable characters */
        TextView f۱۴۰۱۳y;

        public a(View convertView) {
            super(convertView);
            this.f۱۴۰۱۰v = (TextView) convertView.findViewById(2131296800);
            this.f۱۴۰۱۱w = (TextView) convertView.findViewById(2131296801);
            this.f۱۴۰۱۲x = (TextView) convertView.findViewById(2131296798);
            this.f۱۴۰۱۳y = (TextView) convertView.findViewById(2131296799);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۶۶a(Cw.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.w$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۶۶a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۶۶a(Cw cw) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frmNote = new Intent(Cw.this.f۱۴۰۰۵c, (Class<?>) NoteDetailActivity.class);
                frmNote.putExtra("id", ((Cf) Cw.this.f۱۴۰۰۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۶۰۷e() + "");
                Cw.this.f۱۴۰۰۹g.m۱۵۴۸۴b(frmNote);
            }
        }
    }

    public Cw(Context Activity, ViewOnClickListenerCo fragmentTab1, List<Cf> list) {
        m۱۲۳۶۸a(true);
        this.f۱۴۰۰۵c = Activity;
        this.f۱۴۰۰۶d = list;
        this.f۱۴۰۰۹g = fragmentTab1;
        this.f۱۴۰۰۷e = new com.lawyer_smartCalendar.utils.Cf(this.f۱۴۰۰۵c);
        this.f۱۴۰۰۸f = Calendar.getInstance();
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131493025, parent, false);
        return new a(itemView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        if (r3.equals("ClientCase") != false) goto L۲۳;
     */
    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo۱۷۶۶۱b(com.lawyer_smartCalendar.p۲۸۶a.Cw.a r10, int r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۲۸۶a.Cw.mo۱۷۶۶۱b(com.lawyer_smartCalendar.a.w$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۴۰۰۶d.size();
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
