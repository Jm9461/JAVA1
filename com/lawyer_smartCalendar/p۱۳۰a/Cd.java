package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.NoteDetailActivity;
import com.lawyer_smartCalendar.p۱۳۲c.Cu;
import com.lawyer_smartCalendar.utils.Ci;
import java.io.File;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.d  reason: invalid class name */
public class Cd extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۷۸۹c;

    /* renamed from: d  reason: contains not printable characters */
    private List<File> f۱۳۷۹۰d;

    public Cd(Context context, List<File> audioFiles) {
        this.f۱۳۷۸۹c = context;
        this.f۱۳۷۹۰d = audioFiles;
        new MediaPlayer();
        new Ci(context);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۰۷۱b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(this.f۱۳۷۸۹c).inflate(R.layout.view_audio2, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۰۷۳b(Ca holder, int position) {
        holder.f۱۳۷۹۱v.setText(this.f۱۳۷۹۰d.get(position).getName());
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۰۶۹a() {
        return this.f۱۳۷۹۰d.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.lawyer_smartCalendar.a.d$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        public TextView f۱۳۷۹۱v;

        /* renamed from: w  reason: contains not printable characters */
        public ImageView f۱۳۷۹۲w;

        public Ca(View itemView) {
            super(itemView);
            this.f۱۳۷۹۱v = (TextView) itemView.findViewById(R.id.textView_audio_name);
            this.f۱۳۷۹۲w = (ImageView) itemView.findViewById(R.id.imageView_play_music);
            this.f۱۳۷۹۲w.setBackgroundResource(R.drawable.music_play_off);
            this.f۱۳۷۹۲w.setOnClickListener(new View$OnClickListenerCa(Cd.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.d$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cd dVar) {
            }

            public void onClick(View view) {
                Cu di = new Cu();
                di.f۱۴۶۹۳v0 = ((File) Cd.this.f۱۳۷۹۰d.get(Ca.this.m۱۴۳۹۰f())).getPath();
                di.m۱۲۱۱۰a(((NoteDetailActivity) Cd.this.f۱۳۷۸۹c).m۱۲۲۶۲e(), "MediaPlayerDialog");
            }
        }
    }
}
