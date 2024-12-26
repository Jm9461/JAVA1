package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.lawyer_smartCalendar.activity.ImageActivity;
import com.squareup.picasso.Ct;
import com.squareup.picasso.Cx;
import java.io.File;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.q, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cq extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۹۶۱c;

    /* renamed from: d, reason: contains not printable characters */
    private List<File> f۱۳۹۶۲d;

    public Cq(Context context, RecyclerView recyclerView, List<File> imagesFiles) {
        this.f۱۳۹۶۱c = context;
        this.f۱۳۹۶۲d = imagesFiles;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(this.f۱۳۹۶۱c);
        return new a(inflater.inflate(2131493054, parent, false));
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int position) {
        Cx cx = Ct.m۱۶۳۱۷b().m۱۶۳۲۱a(this.f۱۳۹۶۲d.get(position));
        cx.m۱۶۳۶۰c();
        cx.m۱۶۳۵۵a();
        cx.m۱۶۳۵۷a(holder.f۱۳۹۶۳v);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۹۶۲d.size();
    }

    /* renamed from: com.lawyer_smartCalendar.a.q$a */
    protected class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        public ImageView f۱۳۹۶۳v;

        public a(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new ViewOnClickListenerC۱۴۶۰a(Cq.this));
            this.f۱۳۹۶۳v = (ImageView) itemView.findViewById(2131296472);
        }

        /* renamed from: com.lawyer_smartCalendar.a.q$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۶۰a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۶۰a(Cq cq) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frm_image = new Intent(Cq.this.f۱۳۹۶۱c, (Class<?>) ImageActivity.class);
                frm_image.putExtra("image", ((File) Cq.this.f۱۳۹۶۲d.get(a.this.m۱۲۳۲۰f())).getPath());
                Cq.this.f۱۳۹۶۱c.startActivity(frm_image);
            }
        }
    }
}
