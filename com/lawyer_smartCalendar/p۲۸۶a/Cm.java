package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.NoteDetailActivity;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCl;
import com.lawyer_smartCalendar.p۲۸۹d.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.m, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cm extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۹۲۲c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Cf> f۱۳۹۲۳d;

    /* renamed from: e, reason: contains not printable characters */
    private com.lawyer_smartCalendar.utils.Cf f۱۳۹۲۴e;

    /* renamed from: f, reason: contains not printable characters */
    private Calendar f۱۳۹۲۵f;

    /* renamed from: g, reason: contains not printable characters */
    private ViewOnClickListenerCl f۱۳۹۲۶g;

    /* renamed from: com.lawyer_smartCalendar.a.m$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۹۲۷v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۹۲۸w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۳۹۲۹x;

        /* renamed from: y, reason: contains not printable characters */
        TextView f۱۳۹۳۰y;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۹۲۷v = (TextView) convertView.findViewById(2131296800);
            this.f۱۳۹۲۸w = (TextView) convertView.findViewById(2131296801);
            this.f۱۳۹۲۹x = (TextView) convertView.findViewById(2131296798);
            this.f۱۳۹۳۰y = (TextView) convertView.findViewById(2131296799);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۵۶a(Cm.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.m$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۵۶a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۵۶a(Cm cm) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frmNote = new Intent(Cm.this.f۱۳۹۲۲c, (Class<?>) NoteDetailActivity.class);
                frmNote.putExtra("id", ((Cf) Cm.this.f۱۳۹۲۳d.get(a.this.m۱۲۳۲۰f())).m۱۵۶۰۷e() + "");
                Cm.this.f۱۳۹۲۶g.m۱۵۴۶۹b(frmNote);
            }
        }
    }

    public Cm(Context Activity, ViewOnClickListenerCl fragmentTab1, List<Cf> list) {
        m۱۲۳۶۸a(true);
        this.f۱۳۹۲۲c = Activity;
        this.f۱۳۹۲۳d = list;
        this.f۱۳۹۲۶g = fragmentTab1;
        this.f۱۳۹۲۴e = new com.lawyer_smartCalendar.utils.Cf(this.f۱۳۹۲۲c);
        this.f۱۳۹۲۵f = Calendar.getInstance();
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131493025, parent, false);
        return new a(itemView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r3.equals("ClientCase") != false) goto L۱۸;
     */
    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo۱۷۶۶۱b(com.lawyer_smartCalendar.p۲۸۶a.Cm.a r9, int r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۲۸۶a.Cm.mo۱۷۶۶۱b(com.lawyer_smartCalendar.a.m$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۹۲۳d.size();
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
