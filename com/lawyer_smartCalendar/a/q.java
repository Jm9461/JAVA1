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
import com.squareup.picasso.t;
import com.squareup.picasso.x;
import java.io.File;
import java.util.List;

public class q extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۳۰۳۲c;

    /* renamed from: d  reason: collision with root package name */
    private List<File> f۳۰۳۳d;

    public q(Context context, RecyclerView recyclerView, List<File> imagesFiles) {
        this.f۳۰۳۲c = context;
        this.f۳۰۳۳d = imagesFiles;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(this.f۳۰۳۲c).inflate(R.layout.view_image2, parent, false));
    }

    /* renamed from: a */
    public void b(a holder, int position) {
        x a2 = t.b().a(this.f۳۰۳۳d.get(position));
        a2.c();
        a2.a();
        a2.a(holder.v);
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۳۰۳۳d.size();
    }

    /* access modifiers changed from: protected */
    public class a extends RecyclerView.d0 {
        public ImageView v;

        public a(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View$OnClickListenerC۰۰۹۶a(q.this));
            this.v = (ImageView) itemView.findViewById(R.id.image_view);
        }

        /* renamed from: com.lawyer_smartCalendar.a.q$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۹۶a implements View.OnClickListener {
            View$OnClickListenerC۰۰۹۶a(q qVar) {
            }

            public void onClick(View view) {
                Intent frm_image = new Intent(q.this.f۳۰۳۲c, ImageActivity.class);
                frm_image.putExtra("image", ((File) q.this.f۳۰۳۳d.get(a.this.f())).getPath());
                q.this.f۳۰۳۲c.startActivity(frm_image);
            }
        }
    }
}
