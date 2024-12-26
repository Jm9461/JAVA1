package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.AddNoteActivity;
import com.lawyer_smartCalendar.p۱۳۲c.Cu;
import com.lawyer_smartCalendar.utils.Ci;
import java.io.File;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.c  reason: invalid class name */
public class Cc extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۷۶۷c;

    /* renamed from: d  reason: contains not printable characters */
    private List<File> f۱۳۷۶۸d;

    /* renamed from: e  reason: contains not printable characters */
    private p۰۵۲b.p۱۱۶k.p۱۱۷a.Ca f۱۳۷۶۹e;

    /* renamed from: f  reason: contains not printable characters */
    private Ci f۱۳۷۷۰f;

    public Cc(Context context, p۰۵۲b.p۱۱۶k.p۱۱۷a.Ca storage, List<File> audioFiles) {
        this.f۱۳۷۶۷c = context;
        this.f۱۳۷۶۸d = audioFiles;
        this.f۱۳۷۶۹e = storage;
        this.f۱۳۷۷۰f = new Ci(context);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۰۵۴b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(this.f۱۳۷۶۷c).inflate(R.layout.view_audio, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۰۵۶b(Ca holder, int position) {
        holder.f۱۳۷۷۱v.setText(this.f۱۳۷۶۸d.get(position).getName());
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۰۵۲a() {
        return this.f۱۳۷۶۸d.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.lawyer_smartCalendar.a.c$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        public TextView f۱۳۷۷۱v;

        /* renamed from: w  reason: contains not printable characters */
        public ImageView f۱۳۷۷۲w;

        /* renamed from: x  reason: contains not printable characters */
        public ImageView f۱۳۷۷۳x;

        public Ca(View itemView) {
            super(itemView);
            this.f۱۳۷۷۱v = (TextView) itemView.findViewById(R.id.textView_audio_name);
            this.f۱۳۷۷۲w = (ImageView) itemView.findViewById(R.id.imageView_delete);
            this.f۱۳۷۷۳x = (ImageView) itemView.findViewById(R.id.imageView_play_music);
            this.f۱۳۷۷۳x.setBackgroundResource(R.drawable.music_play_off);
            this.f۱۳۷۷۲w.setOnClickListener(new View$OnClickListenerCa(Cc.this));
            this.f۱۳۷۷۳x.setOnClickListener(new View$OnClickListenerCb(Cc.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.c$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cc cVar) {
            }

            public void onClick(View view) {
                Cc.this.f۱۳۷۷۰f.m۱۷۸۱۱n();
                Cc.this.f۱۳۷۷۰f.m۱۷۷۹۱d(((File) Cc.this.f۱۳۷۶۸d.get(Ca.this.m۱۴۳۹۰f())).getPath());
                Cc.this.f۱۳۷۷۰f.close();
                try {
                    Cc.this.f۱۳۷۶۹e.m۱۶۵۱۹b(((File) Cc.this.f۱۳۷۶۸d.get(Ca.this.m۱۴۳۹۰f())).getPath());
                } catch (Exception e) {
                }
                Cc.this.f۱۳۷۶۸d.remove(Ca.this.m۱۴۳۹۰f());
                Cc.this.m۱۴۴۵۰d();
            }
        }

        /* renamed from: com.lawyer_smartCalendar.a.c$a$b  reason: invalid class name */
        class View$OnClickListenerCb implements View.OnClickListener {
            View$OnClickListenerCb(Cc cVar) {
            }

            public void onClick(View view) {
                Cu di = new Cu();
                di.f۱۴۶۹۳v0 = ((File) Cc.this.f۱۳۷۶۸d.get(Ca.this.m۱۴۳۹۰f())).getPath();
                di.m۱۲۱۱۰a(((AddNoteActivity) Cc.this.f۱۳۷۶۷c).m۱۲۲۶۲e(), "MediaPlayerDialog");
            }
        }
    }
}
