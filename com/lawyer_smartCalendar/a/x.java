package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.NoteDetailActivity;
import com.lawyer_smartCalendar.activity.SearchActivity;
import com.lawyer_smartCalendar.d.f;
import java.util.Calendar;
import java.util.List;

public class x extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۳۰۶۳c;

    /* renamed from: d  reason: collision with root package name */
    private List<f> f۳۰۶۴d;

    /* renamed from: e  reason: collision with root package name */
    private com.lawyer_smartCalendar.utils.f f۳۰۶۵e = new com.lawyer_smartCalendar.utils.f(this.f۳۰۶۳c);

    /* renamed from: f  reason: collision with root package name */
    private Calendar f۳۰۶۶f = Calendar.getInstance();

    public class a extends RecyclerView.d0 {
        TextView v;
        TextView w;
        TextView x;
        TextView y;

        public a(View convertView) {
            super(convertView);
            this.v = (TextView) convertView.findViewById(R.id.textView_note_title);
            this.w = (TextView) convertView.findViewById(R.id.textView_note_type);
            this.x = (TextView) convertView.findViewById(R.id.textView_note_date);
            this.y = (TextView) convertView.findViewById(R.id.textView_note_hour);
            convertView.setOnClickListener(new View$OnClickListenerC۰۱۰۳a(x.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.x$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۱۰۳a implements View.OnClickListener {
            View$OnClickListenerC۰۱۰۳a(x xVar) {
            }

            public void onClick(View view) {
                Intent frmNote = new Intent(x.this.f۳۰۶۳c, NoteDetailActivity.class);
                frmNote.putExtra("id", ((f) x.this.f۳۰۶۴d.get(a.this.f())).e() + "");
                ((SearchActivity) x.this.f۳۰۶۳c).c(frmNote);
            }
        }
    }

    public x(Context Activity, List<f> list) {
        a(true);
        this.f۳۰۶۳c = Activity;
        this.f۳۰۶۴d = list;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_item, parent, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
        if (r3.equals("ClientCase") != false) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.lawyer_smartCalendar.a.x.a r10, int r11) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.a.x.b(com.lawyer_smartCalendar.a.x$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۳۰۶۴d.size();
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
