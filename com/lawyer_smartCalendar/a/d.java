package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.NoteDetailActivity;
import com.lawyer_smartCalendar.c.u;
import com.lawyer_smartCalendar.utils.i;
import java.io.File;
import java.util.List;

public class d extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۲۹۴۱c;

    /* renamed from: d  reason: collision with root package name */
    private List<File> f۲۹۴۲d;

    public d(Context context, List<File> audioFiles) {
        this.f۲۹۴۱c = context;
        this.f۲۹۴۲d = audioFiles;
        new MediaPlayer();
        new i(context);
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(this.f۲۹۴۱c).inflate(R.layout.view_audio2, parent, false));
    }

    /* renamed from: a */
    public void b(a holder, int position) {
        holder.v.setText(this.f۲۹۴۲d.get(position).getName());
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۲۹۴۲d.size();
    }

    /* access modifiers changed from: protected */
    public class a extends RecyclerView.d0 {
        public TextView v;
        public ImageView w;

        public a(View itemView) {
            super(itemView);
            this.v = (TextView) itemView.findViewById(R.id.textView_audio_name);
            this.w = (ImageView) itemView.findViewById(R.id.imageView_play_music);
            this.w.setBackgroundResource(R.drawable.music_play_off);
            this.w.setOnClickListener(new View$OnClickListenerC۰۰۷۴a(d.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.d$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۷۴a implements View.OnClickListener {
            View$OnClickListenerC۰۰۷۴a(d dVar) {
            }

            public void onClick(View view) {
                u di = new u();
                di.v0 = ((File) d.this.f۲۹۴۲d.get(a.this.f())).getPath();
                di.a(((NoteDetailActivity) d.this.f۲۹۴۱c).e(), "MediaPlayerDialog");
            }
        }
    }
}
