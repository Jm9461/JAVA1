package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.AddNoteActivity;
import com.lawyer_smartCalendar.c.u;
import com.lawyer_smartCalendar.utils.i;
import java.io.File;
import java.util.List;

public class c extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۲۹۲۸c;

    /* renamed from: d  reason: collision with root package name */
    private List<File> f۲۹۲۹d;

    /* renamed from: e  reason: collision with root package name */
    private b.k.a.a f۲۹۳۰e;

    /* renamed from: f  reason: collision with root package name */
    private i f۲۹۳۱f;

    public c(Context context, b.k.a.a storage, List<File> audioFiles) {
        this.f۲۹۲۸c = context;
        this.f۲۹۲۹d = audioFiles;
        this.f۲۹۳۰e = storage;
        this.f۲۹۳۱f = new i(context);
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(this.f۲۹۲۸c).inflate(R.layout.view_audio, parent, false));
    }

    /* renamed from: a */
    public void b(a holder, int position) {
        holder.v.setText(this.f۲۹۲۹d.get(position).getName());
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۲۹۲۹d.size();
    }

    /* access modifiers changed from: protected */
    public class a extends RecyclerView.d0 {
        public TextView v;
        public ImageView w;
        public ImageView x;

        public a(View itemView) {
            super(itemView);
            this.v = (TextView) itemView.findViewById(R.id.textView_audio_name);
            this.w = (ImageView) itemView.findViewById(R.id.imageView_delete);
            this.x = (ImageView) itemView.findViewById(R.id.imageView_play_music);
            this.x.setBackgroundResource(R.drawable.music_play_off);
            this.w.setOnClickListener(new View$OnClickListenerC۰۰۷۲a(c.this));
            this.x.setOnClickListener(new b(c.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.c$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۷۲a implements View.OnClickListener {
            View$OnClickListenerC۰۰۷۲a(c cVar) {
            }

            public void onClick(View view) {
                c.this.f۲۹۳۱f.n();
                c.this.f۲۹۳۱f.d(((File) c.this.f۲۹۲۹d.get(a.this.f())).getPath());
                c.this.f۲۹۳۱f.close();
                try {
                    c.this.f۲۹۳۰e.b(((File) c.this.f۲۹۲۹d.get(a.this.f())).getPath());
                } catch (Exception e2) {
                }
                c.this.f۲۹۲۹d.remove(a.this.f());
                c.this.d();
            }
        }

        class b implements View.OnClickListener {
            b(c cVar) {
            }

            public void onClick(View view) {
                u di = new u();
                di.v0 = ((File) c.this.f۲۹۲۹d.get(a.this.f())).getPath();
                di.a(((AddNoteActivity) c.this.f۲۹۲۸c).e(), "MediaPlayerDialog");
            }
        }
    }
}
