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
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCh;
import com.lawyer_smartCalendar.p۱۳۳d.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.h  reason: invalid class name */
public class Ch extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۸۶۷c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Cf> f۱۳۸۶۸d;

    /* renamed from: e  reason: contains not printable characters */
    private com.lawyer_smartCalendar.utils.Cf f۱۳۸۶۹e = new com.lawyer_smartCalendar.utils.Cf(this.f۱۳۸۶۷c);

    /* renamed from: f  reason: contains not printable characters */
    private Calendar f۱۳۸۷۰f = Calendar.getInstance();

    /* renamed from: g  reason: contains not printable characters */
    private View$OnClickListenerCh f۱۳۸۷۱g;

    /* renamed from: com.lawyer_smartCalendar.a.h$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۸۷۲v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۸۷۳w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۸۷۴x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۳۸۷۵y;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۸۷۲v = (TextView) convertView.findViewById(R.id.textView_note_title);
            this.f۱۳۸۷۳w = (TextView) convertView.findViewById(R.id.textView_note_type);
            this.f۱۳۸۷۴x = (TextView) convertView.findViewById(R.id.textView_note_date);
            this.f۱۳۸۷۵y = (TextView) convertView.findViewById(R.id.textView_note_hour);
            convertView.setOnClickListener(new View$OnClickListenerCa(Ch.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.h$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Ch hVar) {
            }

            public void onClick(View view) {
                Intent frmNote = new Intent(Ch.this.f۱۳۸۶۷c, NoteDetailActivity.class);
                frmNote.putExtra("id", ((Cf) Ch.this.f۱۳۸۶۸d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۸۵e() + "");
                Ch.this.f۱۳۸۷۱g.m۱۷۵۲۸b(frmNote);
            }
        }
    }

    public Ch(Context Activity, View$OnClickListenerCh fragmentTab1, List<Cf> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۸۶۷c = Activity;
        this.f۱۳۸۶۸d = list;
        this.f۱۳۸۷۱g = fragmentTab1;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۱۳۹b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_item, parent, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008a, code lost:
        if (r3.equals("ClientCase") != false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۱۴۱b(com.lawyer_smartCalendar.p۱۳۰a.Ch.Ca r9, int r10) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۱۳۰a.Ch.m۱۷۱۴۱b(com.lawyer_smartCalendar.a.h$a, int):void");
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۱۳۵a() {
        return this.f۱۳۸۶۸d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۱۳۶a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۱۳۸b(int position) {
        return position;
    }
}
