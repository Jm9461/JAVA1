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
import com.squareup.picasso.Ct;
import com.squareup.picasso.Cx;
import java.io.File;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.q  reason: invalid class name */
public class Cq extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۹۶۱c;

    /* renamed from: d  reason: contains not printable characters */
    private List<File> f۱۳۹۶۲d;

    public Cq(Context context, RecyclerView recyclerView, List<File> imagesFiles) {
        this.f۱۳۹۶۱c = context;
        this.f۱۳۹۶۲d = imagesFiles;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۲۲۵b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(this.f۱۳۹۶۱c).inflate(R.layout.view_image2, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۲۲۷b(Ca holder, int position) {
        Cx a = Ct.m۱۸۳۹۵b().m۱۸۳۹۹a(this.f۱۳۹۶۲d.get(position));
        a.m۱۸۴۳۸c();
        a.m۱۸۴۳۳a();
        a.m۱۸۴۳۵a(holder.f۱۳۹۶۳v);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۲۲۳a() {
        return this.f۱۳۹۶۲d.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.lawyer_smartCalendar.a.q$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        public ImageView f۱۳۹۶۳v;

        public Ca(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View$OnClickListenerCa(Cq.this));
            this.f۱۳۹۶۳v = (ImageView) itemView.findViewById(R.id.image_view);
        }

        /* renamed from: com.lawyer_smartCalendar.a.q$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cq qVar) {
            }

            public void onClick(View view) {
                Intent frm_image = new Intent(Cq.this.f۱۳۹۶۱c, ImageActivity.class);
                frm_image.putExtra("image", ((File) Cq.this.f۱۳۹۶۲d.get(Ca.this.m۱۴۳۹۰f())).getPath());
                Cq.this.f۱۳۹۶۱c.startActivity(frm_image);
            }
        }
    }
}
