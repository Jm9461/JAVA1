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
import com.lawyer_smartCalendar.activity.SearchActivity;
import com.lawyer_smartCalendar.p۱۳۳d.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.x  reason: invalid class name */
public class Cx extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۴۰۱۶c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Cf> f۱۴۰۱۷d;

    /* renamed from: e  reason: contains not printable characters */
    private com.lawyer_smartCalendar.utils.Cf f۱۴۰۱۸e = new com.lawyer_smartCalendar.utils.Cf(this.f۱۴۰۱۶c);

    /* renamed from: f  reason: contains not printable characters */
    private Calendar f۱۴۰۱۹f = Calendar.getInstance();

    /* renamed from: com.lawyer_smartCalendar.a.x$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۴۰۲۰v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۴۰۲۱w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۴۰۲۲x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۴۰۲۳y;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۴۰۲۰v = (TextView) convertView.findViewById(R.id.textView_note_title);
            this.f۱۴۰۲۱w = (TextView) convertView.findViewById(R.id.textView_note_type);
            this.f۱۴۰۲۲x = (TextView) convertView.findViewById(R.id.textView_note_date);
            this.f۱۴۰۲۳y = (TextView) convertView.findViewById(R.id.textView_note_hour);
            convertView.setOnClickListener(new View$OnClickListenerCa(Cx.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.x$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cx xVar) {
            }

            public void onClick(View view) {
                Intent frmNote = new Intent(Cx.this.f۱۴۰۱۶c, NoteDetailActivity.class);
                frmNote.putExtra("id", ((Cf) Cx.this.f۱۴۰۱۷d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۸۵e() + "");
                ((SearchActivity) Cx.this.f۱۴۰۱۶c).m۱۷۴۶۸c(frmNote);
            }
        }
    }

    public Cx(Context Activity, List<Cf> list) {
        m۱۴۴۳۸a(true);
        this.f۱۴۰۱۶c = Activity;
        this.f۱۴۰۱۷d = list;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۲۸۸b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_item, parent, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
        if (r3.equals("ClientCase") != false) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۲۹۰b(com.lawyer_smartCalendar.p۱۳۰a.Cx.Ca r10, int r11) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۱۳۰a.Cx.m۱۷۲۹۰b(com.lawyer_smartCalendar.a.x$a, int):void");
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۲۸۴a() {
        return this.f۱۴۰۱۷d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۲۸۵a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۲۸۷b(int position) {
        return position;
    }
}
