package com.lawyer_smartCalendar.c;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.lawyer_smartCalendar.R;
import java.util.concurrent.TimeUnit;

public class u extends android.support.v4.app.e {
    public static int x0 = 0;
    private Button j0;
    private Button k0;
    private Button l0;
    private Button m0;
    private MediaPlayer n0;
    private double o0 = 0.0d;
    private double p0 = 0.0d;
    private Handler q0 = new Handler();
    private int r0 = 5000;
    private int s0 = 5000;
    private SeekBar t0;
    private TextView u0;
    public String v0 = "";
    private Runnable w0 = new e();

    @Override // android.support.v4.app.e
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        MediaPlayer mediaPlayer = this.n0;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    @Override // android.support.v4.app.f, android.support.v4.app.e
    public void c(Bundle savedInstanceState) {
        super.c(savedInstanceState);
    }

    @Override // android.support.v4.app.f
    public View a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_sheet_media_player, container, false);
        this.j0 = (Button) v.findViewById(R.id.button);
        this.k0 = (Button) v.findViewById(R.id.button2);
        this.l0 = (Button) v.findViewById(R.id.button3);
        this.m0 = (Button) v.findViewById(R.id.button4);
        this.u0 = (TextView) v.findViewById(R.id.txt_time);
        this.n0 = new MediaPlayer();
        try {
            this.n0.setDataSource(this.v0);
            this.n0.prepare();
        } catch (Exception e2) {
            Toast.makeText(d(), e2.getMessage(), 1).show();
        }
        this.t0 = (SeekBar) v.findViewById(R.id.seekBar);
        this.t0.setClickable(false);
        this.k0.setEnabled(false);
        this.l0.setOnClickListener(new a());
        this.k0.setOnClickListener(new b());
        this.j0.setOnClickListener(new c());
        this.m0.setOnClickListener(new d());
        return v;
    }

    class a implements View.OnClickListener {
        a() {
        }

        /* renamed from: com.lawyer_smartCalendar.c.u$a$a  reason: collision with other inner class name */
        class C۰۱۰۵a implements MediaPlayer.OnCompletionListener {
            C۰۱۰۵a() {
            }

            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.pause();
                u.this.k0.setEnabled(false);
                u.this.l0.setEnabled(true);
                u.this.k0.callOnClick();
            }
        }

        public void onClick(View v) {
            u.this.n0.start();
            u.this.n0.setOnCompletionListener(new C۰۱۰۵a());
            u uVar = u.this;
            uVar.p0 = (double) uVar.n0.getDuration();
            u uVar2 = u.this;
            uVar2.o0 = (double) uVar2.n0.getCurrentPosition();
            if (u.x0 == 0) {
                u.this.t0.setMax((int) u.this.p0);
                u.x0 = 0;
            }
            u.this.t0.setProgress((int) u.this.o0);
            u.this.q0.postDelayed(u.this.w0, 1000);
            u.this.k0.setEnabled(true);
            u.this.l0.setEnabled(false);
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View v) {
            u.this.n0.pause();
            u.this.k0.setEnabled(false);
            u.this.l0.setEnabled(true);
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View v) {
            if (((double) (u.this.r0 + ((int) u.this.o0))) <= u.this.p0) {
                u uVar = u.this;
                double d2 = uVar.o0;
                double d3 = (double) u.this.r0;
                Double.isNaN(d3);
                uVar.o0 = d2 + d3;
                u.this.n0.seekTo((int) u.this.o0);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View v) {
            if (((int) u.this.o0) - u.this.s0 > 0) {
                u uVar = u.this;
                double d2 = uVar.o0;
                double d3 = (double) u.this.s0;
                Double.isNaN(d3);
                uVar.o0 = d2 - d3;
                u.this.n0.seekTo((int) u.this.o0);
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        public void run() {
            u uVar = u.this;
            uVar.o0 = (double) uVar.n0.getCurrentPosition();
            u.this.u0.setText(String.format("%d min, %d sec", Long.valueOf(TimeUnit.MILLISECONDS.toMinutes((long) u.this.o0)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds((long) u.this.o0) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) u.this.o0)))));
            u.this.t0.setProgress((int) u.this.o0);
            u.this.q0.postDelayed(this, 1000);
        }
    }
}
