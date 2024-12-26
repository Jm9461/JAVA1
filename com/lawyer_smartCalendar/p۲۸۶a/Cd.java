package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.NoteDetailActivity;
import com.lawyer_smartCalendar.p۲۸۸c.Cu;
import com.lawyer_smartCalendar.utils.Ci;
import java.io.File;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cd extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۷۸۹c;

    /* renamed from: d, reason: contains not printable characters */
    private List<File> f۱۳۷۹۰d;

    public Cd(Context context, List<File> audioFiles) {
        this.f۱۳۷۸۹c = context;
        this.f۱۳۷۹۰d = audioFiles;
        new MediaPlayer();
        new Ci(context);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(this.f۱۳۷۸۹c);
        return new a(inflater.inflate(2131493051, parent, false));
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int position) {
        holder.f۱۳۷۹۱v.setText(this.f۱۳۷۹۰d.get(position).getName());
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۷۹۰d.size();
    }

    /* renamed from: com.lawyer_smartCalendar.a.d$a */
    protected class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        public TextView f۱۳۷۹۱v;

        /* renamed from: w, reason: contains not printable characters */
        public ImageView f۱۳۷۹۲w;

        public a(View itemView) {
            super(itemView);
            this.f۱۳۷۹۱v = (TextView) itemView.findViewById(2131296785);
            this.f۱۳۷۹۲w = (ImageView) itemView.findViewById(2131296471);
            this.f۱۳۷۹۲w.setBackgroundResource(2131230974);
            this.f۱۳۷۹۲w.setOnClickListener(new ViewOnClickListenerC۱۴۳۸a(Cd.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.d$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۳۸a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۳۸a(Cd cd) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Cu di = new Cu();
                di.f۱۴۶۹۳v0 = ((File) Cd.this.f۱۳۷۹۰d.get(a.this.m۱۲۳۲۰f())).getPath();
                di.m۱۰۰۴۰a(((NoteDetailActivity) Cd.this.f۱۳۷۸۹c).m۱۰۱۹۲e(), "MediaPlayerDialog");
            }
        }
    }
}
