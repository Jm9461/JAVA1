package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.content.Intent;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.ImageActivity;
import com.rey.material.widget.Button;
import com.squareup.picasso.Ct;
import com.squareup.picasso.Cx;
import java.io.File;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.p  reason: invalid class name */
public class Cp extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۹۵۴c;

    /* renamed from: d  reason: contains not printable characters */
    private List<File> f۱۳۹۵۵d;

    public Cp(Context context, RecyclerView recyclerView, List<File> imagesFiles) {
        this.f۱۳۹۵۴c = context;
        this.f۱۳۹۵۵d = imagesFiles;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۲۱۸b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(this.f۱۳۹۵۴c).inflate(R.layout.view_image, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۲۲۰b(Ca holder, int position) {
        Cx a = Ct.m۱۸۳۹۵b().m۱۸۳۹۹a(this.f۱۳۹۵۵d.get(position));
        a.m۱۸۴۳۸c();
        a.m۱۸۴۳۳a();
        a.m۱۸۴۳۵a(holder.f۱۳۹۵۶v);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۲۱۶a() {
        return this.f۱۳۹۵۵d.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.lawyer_smartCalendar.a.p$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        public ImageView f۱۳۹۵۶v;

        /* renamed from: w  reason: contains not printable characters */
        public Button f۱۳۹۵۷w;

        public Ca(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View$OnClickListenerCa(Cp.this));
            this.f۱۳۹۵۶v = (ImageView) itemView.findViewById(R.id.image_view);
            this.f۱۳۹۵۷w = (Button) itemView.findViewById(R.id.btn_delete);
            this.f۱۳۹۵۷w.setOnClickListener(new View$OnClickListenerCb(Cp.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.p$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cp pVar) {
            }

            public void onClick(View view) {
                Intent frm_image = new Intent(Cp.this.f۱۳۹۵۴c, ImageActivity.class);
                frm_image.putExtra("image", ((File) Cp.this.f۱۳۹۵۵d.get(Ca.this.m۱۴۳۹۰f())).getPath());
                Cp.this.f۱۳۹۵۴c.startActivity(frm_image);
            }
        }

        /* renamed from: com.lawyer_smartCalendar.a.p$a$b  reason: invalid class name */
        class View$OnClickListenerCb implements View.OnClickListener {
            View$OnClickListenerCb(Cp pVar) {
            }

            public void onClick(View view) {
                Cp.this.f۱۳۹۵۵d.remove(Ca.this.m۱۴۳۹۰f());
                Cp.this.m۱۴۴۵۰d();
            }
        }
    }
}
