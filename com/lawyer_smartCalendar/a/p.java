package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.ImageActivity;
import com.rey.material.widget.Button;
import com.squareup.picasso.t;
import com.squareup.picasso.x;
import java.io.File;
import java.util.List;

public class p extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۳۰۲۸c;

    /* renamed from: d  reason: collision with root package name */
    private List<File> f۳۰۲۹d;

    public p(Context context, RecyclerView recyclerView, List<File> imagesFiles) {
        this.f۳۰۲۸c = context;
        this.f۳۰۲۹d = imagesFiles;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(this.f۳۰۲۸c).inflate(R.layout.view_image, parent, false));
    }

    /* renamed from: a */
    public void b(a holder, int position) {
        x a2 = t.b().a(this.f۳۰۲۹d.get(position));
        a2.c();
        a2.a();
        a2.a(holder.v);
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۳۰۲۹d.size();
    }

    /* access modifiers changed from: protected */
    public class a extends RecyclerView.d0 {
        public ImageView v;
        public Button w;

        public a(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View$OnClickListenerC۰۰۹۵a(p.this));
            this.v = (ImageView) itemView.findViewById(R.id.image_view);
            this.w = (Button) itemView.findViewById(R.id.btn_delete);
            this.w.setOnClickListener(new b(p.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.p$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۹۵a implements View.OnClickListener {
            View$OnClickListenerC۰۰۹۵a(p pVar) {
            }

            public void onClick(View view) {
                Intent frm_image = new Intent(p.this.f۳۰۲۸c, ImageActivity.class);
                frm_image.putExtra("image", ((File) p.this.f۳۰۲۹d.get(a.this.f())).getPath());
                p.this.f۳۰۲۸c.startActivity(frm_image);
            }
        }

        class b implements View.OnClickListener {
            b(p pVar) {
            }

            public void onClick(View view) {
                p.this.f۳۰۲۹d.remove(a.this.f());
                p.this.d();
            }
        }
    }
}
