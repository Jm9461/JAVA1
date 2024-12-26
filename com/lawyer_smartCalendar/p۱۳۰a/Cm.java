package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.content.Intent;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.NoteDetailActivity;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCl;
import com.lawyer_smartCalendar.p۱۳۳d.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.m  reason: invalid class name */
public class Cm extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۹۲۲c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Cf> f۱۳۹۲۳d;

    /* renamed from: e  reason: contains not printable characters */
    private com.lawyer_smartCalendar.utils.Cf f۱۳۹۲۴e = new com.lawyer_smartCalendar.utils.Cf(this.f۱۳۹۲۲c);

    /* renamed from: f  reason: contains not printable characters */
    private Calendar f۱۳۹۲۵f = Calendar.getInstance();

    /* renamed from: g  reason: contains not printable characters */
    private View$OnClickListenerCl f۱۳۹۲۶g;

    /* renamed from: com.lawyer_smartCalendar.a.m$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۹۲۷v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۹۲۸w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۹۲۹x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۳۹۳۰y;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۹۲۷v = (TextView) convertView.findViewById(R.id.textView_note_title);
            this.f۱۳۹۲۸w = (TextView) convertView.findViewById(R.id.textView_note_type);
            this.f۱۳۹۲۹x = (TextView) convertView.findViewById(R.id.textView_note_date);
            this.f۱۳۹۳۰y = (TextView) convertView.findViewById(R.id.textView_note_hour);
            convertView.setOnClickListener(new View$OnClickListenerCa(Cm.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.m$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cm mVar) {
            }

            public void onClick(View view) {
                Intent frmNote = new Intent(Cm.this.f۱۳۹۲۲c, NoteDetailActivity.class);
                frmNote.putExtra("id", ((Cf) Cm.this.f۱۳۹۲۳d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۸۵e() + "");
                Cm.this.f۱۳۹۲۶g.m۱۷۵۴۷b(frmNote);
            }
        }
    }

    public Cm(Context Activity, View$OnClickListenerCl fragmentTab1, List<Cf> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۹۲۲c = Activity;
        this.f۱۳۹۲۳d = list;
        this.f۱۳۹۲۶g = fragmentTab1;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۱۹۱b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_item, parent, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008a, code lost:
        if (r3.equals("ClientCase") != false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۱۹۳b(com.lawyer_smartCalendar.p۱۳۰a.Cm.Ca r9, int r10) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۱۳۰a.Cm.m۱۷۱۹۳b(com.lawyer_smartCalendar.a.m$a, int):void");
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۱۸۷a() {
        return this.f۱۳۹۲۳d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۱۸۸a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۱۹۰b(int position) {
        return position;
    }
}
