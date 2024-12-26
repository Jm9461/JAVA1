package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.AddNoteActivity;
import com.lawyer_smartCalendar.p۲۸۸c.Cu;
import com.lawyer_smartCalendar.utils.Ci;
import java.io.File;
import java.util.List;
import p۲۰۸b.p۲۷۲k.p۲۷۳a.Ca;

/* renamed from: com.lawyer_smartCalendar.a.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۷۶۷c;

    /* renamed from: d, reason: contains not printable characters */
    private List<File> f۱۳۷۶۸d;

    /* renamed from: e, reason: contains not printable characters */
    private Ca f۱۳۷۶۹e;

    /* renamed from: f, reason: contains not printable characters */
    private Ci f۱۳۷۷۰f;

    public Cc(Context context, Ca storage, List<File> audioFiles) {
        this.f۱۳۷۶۷c = context;
        this.f۱۳۷۶۸d = audioFiles;
        this.f۱۳۷۶۹e = storage;
        this.f۱۳۷۷۰f = new Ci(context);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(this.f۱۳۷۶۷c);
        return new a(inflater.inflate(2131493050, parent, false));
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int position) {
        holder.f۱۳۷۷۱v.setText(this.f۱۳۷۶۸d.get(position).getName());
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۷۶۸d.size();
    }

    /* renamed from: com.lawyer_smartCalendar.a.c$a */
    protected class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        public TextView f۱۳۷۷۱v;

        /* renamed from: w, reason: contains not printable characters */
        public ImageView f۱۳۷۷۲w;

        /* renamed from: x, reason: contains not printable characters */
        public ImageView f۱۳۷۷۳x;

        public a(View itemView) {
            super(itemView);
            this.f۱۳۷۷۱v = (TextView) itemView.findViewById(2131296785);
            this.f۱۳۷۷۲w = (ImageView) itemView.findViewById(2131296470);
            this.f۱۳۷۷۳x = (ImageView) itemView.findViewById(2131296471);
            this.f۱۳۷۷۳x.setBackgroundResource(2131230974);
            this.f۱۳۷۷۲w.setOnClickListener(new ViewOnClickListenerC۱۴۳۶a(Cc.this));
            this.f۱۳۷۷۳x.setOnClickListener(new b(Cc.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.c$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۳۶a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۳۶a(Cc cc) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Cc.this.f۱۳۷۷۰f.m۱۵۷۳۳n();
                Cc.this.f۱۳۷۷۰f.m۱۵۷۱۳d(((File) Cc.this.f۱۳۷۶۸d.get(a.this.m۱۲۳۲۰f())).getPath());
                Cc.this.f۱۳۷۷۰f.close();
                try {
                    Cc.this.f۱۳۷۶۹e.m۱۴۴۴۴b(((File) Cc.this.f۱۳۷۶۸d.get(a.this.m۱۲۳۲۰f())).getPath());
                } catch (Exception e2) {
                }
                Cc.this.f۱۳۷۶۸d.remove(a.this.m۱۲۳۲۰f());
                Cc.this.m۱۲۳۸۰d();
            }
        }

        /* renamed from: com.lawyer_smartCalendar.a.c$a$b */
        class b implements View.OnClickListener {
            b(Cc cc) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Cu di = new Cu();
                di.f۱۴۶۹۳v0 = ((File) Cc.this.f۱۳۷۶۸d.get(a.this.m۱۲۳۲۰f())).getPath();
                di.m۱۰۰۴۰a(((AddNoteActivity) Cc.this.f۱۳۷۶۷c).m۱۰۱۹۲e(), "MediaPlayerDialog");
            }
        }
    }
}
