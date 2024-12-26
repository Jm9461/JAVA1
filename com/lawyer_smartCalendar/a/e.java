package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.CaseDetailActivity;
import com.lawyer_smartCalendar.d.b;
import com.lawyer_smartCalendar.utils.f;
import com.lawyer_smartCalendar.utils.i;
import java.util.List;

public class e extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۲۹۵۰c;

    /* renamed from: d  reason: collision with root package name */
    private List<b> f۲۹۵۱d;

    /* renamed from: e  reason: collision with root package name */
    private i f۲۹۵۲e = new i(this.f۲۹۵۰c);

    /* renamed from: f  reason: collision with root package name */
    private f f۲۹۵۳f = new f(this.f۲۹۵۰c);

    public class a extends RecyclerView.d0 {
        TextView v;
        TextView w;
        TextView x;
        TextView y;
        LinearLayout z;

        public a(View convertView) {
            super(convertView);
            this.w = (TextView) convertView.findViewById(R.id.txt_client);
            this.x = (TextView) convertView.findViewById(R.id.txt_date);
            this.y = (TextView) convertView.findViewById(R.id.txt_state);
            this.v = (TextView) convertView.findViewById(R.id.txt_title);
            this.z = (LinearLayout) convertView.findViewById(R.id.layout_state);
            convertView.setOnClickListener(new View$OnClickListenerC۰۰۷۶a(e.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.e$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۷۶a implements View.OnClickListener {
            View$OnClickListenerC۰۰۷۶a(e eVar) {
            }

            public void onClick(View view) {
                Intent frm_case_detail = new Intent(e.this.f۲۹۵۰c, CaseDetailActivity.class);
                frm_case_detail.putExtra("id", ((b) e.this.f۲۹۵۱d.get(a.this.f())).k() + "");
                e.this.f۲۹۵۰c.startActivity(frm_case_detail);
            }
        }
    }

    public e(Context Activity, List<b> list) {
        a(true);
        this.f۲۹۵۰c = Activity;
        this.f۲۹۵۱d = list;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.case_list_item, parent, false));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cd, code lost:
        if (r4.equals("Stream") != false) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.lawyer_smartCalendar.a.e.a r10, int r11) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.a.e.b(com.lawyer_smartCalendar.a.e$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۲۹۵۱d.size();
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
