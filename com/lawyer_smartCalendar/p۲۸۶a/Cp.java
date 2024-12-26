package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.lawyer_smartCalendar.activity.ImageActivity;
import com.rey.material.widget.Button;
import com.squareup.picasso.Ct;
import com.squareup.picasso.Cx;
import java.io.File;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.p, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cp extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۹۵۴c;

    /* renamed from: d, reason: contains not printable characters */
    private List<File> f۱۳۹۵۵d;

    public Cp(Context context, RecyclerView recyclerView, List<File> imagesFiles) {
        this.f۱۳۹۵۴c = context;
        this.f۱۳۹۵۵d = imagesFiles;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(this.f۱۳۹۵۴c);
        return new a(inflater.inflate(2131493053, parent, false));
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int position) {
        Cx cx = Ct.m۱۶۳۱۷b().m۱۶۳۲۱a(this.f۱۳۹۵۵d.get(position));
        cx.m۱۶۳۶۰c();
        cx.m۱۶۳۵۵a();
        cx.m۱۶۳۵۷a(holder.f۱۳۹۵۶v);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۹۵۵d.size();
    }

    /* renamed from: com.lawyer_smartCalendar.a.p$a */
    protected class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        public ImageView f۱۳۹۵۶v;

        /* renamed from: w, reason: contains not printable characters */
        public Button f۱۳۹۵۷w;

        public a(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new ViewOnClickListenerC۱۴۵۹a(Cp.this));
            this.f۱۳۹۵۶v = (ImageView) itemView.findViewById(2131296472);
            this.f۱۳۹۵۷w = (Button) itemView.findViewById(2131296351);
            this.f۱۳۹۵۷w.setOnClickListener(new b(Cp.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.p$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۵۹a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۵۹a(Cp cp) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frm_image = new Intent(Cp.this.f۱۳۹۵۴c, (Class<?>) ImageActivity.class);
                frm_image.putExtra("image", ((File) Cp.this.f۱۳۹۵۵d.get(a.this.m۱۲۳۲۰f())).getPath());
                Cp.this.f۱۳۹۵۴c.startActivity(frm_image);
            }
        }

        /* renamed from: com.lawyer_smartCalendar.a.p$a$b */
        class b implements View.OnClickListener {
            b(Cp cp) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Cp.this.f۱۳۹۵۵d.remove(a.this.m۱۲۳۲۰f());
                Cp.this.m۱۲۳۸۰d();
            }
        }
    }
}
