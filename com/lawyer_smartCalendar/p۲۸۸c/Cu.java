package com.lawyer_smartCalendar.p۲۸۸c;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogInterfaceOnCancelListenerCe;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.concurrent.TimeUnit;

/* renamed from: com.lawyer_smartCalendar.c.u, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cu extends DialogInterfaceOnCancelListenerCe {

    /* renamed from: x0, reason: contains not printable characters */
    public static int f۱۴۶۸۰x0 = 0;

    /* renamed from: j0, reason: contains not printable characters */
    private Button f۱۴۶۸۱j0;

    /* renamed from: k0, reason: contains not printable characters */
    private Button f۱۴۶۸۲k0;

    /* renamed from: l0, reason: contains not printable characters */
    private Button f۱۴۶۸۳l0;

    /* renamed from: m0, reason: contains not printable characters */
    private Button f۱۴۶۸۴m0;

    /* renamed from: n0, reason: contains not printable characters */
    private MediaPlayer f۱۴۶۸۵n0;

    /* renamed from: t0, reason: contains not printable characters */
    private SeekBar f۱۴۶۹۱t0;

    /* renamed from: u0, reason: contains not printable characters */
    private TextView f۱۴۶۹۲u0;

    /* renamed from: o0, reason: contains not printable characters */
    private double f۱۴۶۸۶o0 = 0.0d;

    /* renamed from: p0, reason: contains not printable characters */
    private double f۱۴۶۸۷p0 = 0.0d;

    /* renamed from: q0, reason: contains not printable characters */
    private Handler f۱۴۶۸۸q0 = new Handler();

    /* renamed from: r0, reason: contains not printable characters */
    private int f۱۴۶۸۹r0 = 5000;

    /* renamed from: s0, reason: contains not printable characters */
    private int f۱۴۶۹۰s0 = 5000;

    /* renamed from: v0, reason: contains not printable characters */
    public String f۱۴۶۹۳v0 = "";

    /* renamed from: w0, reason: contains not printable characters */
    private Runnable f۱۴۶۹۴w0 = new e();

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerCe, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        MediaPlayer mediaPlayer = this.f۱۴۶۸۵n0;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerCe, android.support.v4.app.ComponentCallbacksCf
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۵۵۱۶c(Bundle savedInstanceState) {
        super.mo۱۵۵۱۶c(savedInstanceState);
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(2131492932, container, false);
        this.f۱۴۶۸۱j0 = (Button) v.findViewById(2131296358);
        this.f۱۴۶۸۲k0 = (Button) v.findViewById(2131296359);
        this.f۱۴۶۸۳l0 = (Button) v.findViewById(2131296363);
        this.f۱۴۶۸۴m0 = (Button) v.findViewById(2131296364);
        this.f۱۴۶۹۲u0 = (TextView) v.findViewById(2131296872);
        this.f۱۴۶۸۵n0 = new MediaPlayer();
        try {
            this.f۱۴۶۸۵n0.setDataSource(this.f۱۴۶۹۳v0);
            this.f۱۴۶۸۵n0.prepare();
        } catch (Exception e2) {
            Toast.makeText(m۱۰۱۲۷d(), e2.getMessage(), 1).show();
        }
        this.f۱۴۶۹۱t0 = (SeekBar) v.findViewById(2131296722);
        this.f۱۴۶۹۱t0.setClickable(false);
        this.f۱۴۶۸۲k0.setEnabled(false);
        this.f۱۴۶۸۳l0.setOnClickListener(new a());
        this.f۱۴۶۸۲k0.setOnClickListener(new b());
        this.f۱۴۶۸۱j0.setOnClickListener(new c());
        this.f۱۴۶۸۴m0.setOnClickListener(new d());
        return v;
    }

    /* renamed from: com.lawyer_smartCalendar.c.u$a */
    class a implements View.OnClickListener {
        a() {
        }

        /* renamed from: com.lawyer_smartCalendar.c.u$a$a, reason: collision with other inner class name */
        class C۱۴۶۸a implements MediaPlayer.OnCompletionListener {
            C۱۴۶۸a() {
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.pause();
                Cu.this.f۱۴۶۸۲k0.setEnabled(false);
                Cu.this.f۱۴۶۸۳l0.setEnabled(true);
                Cu.this.f۱۴۶۸۲k0.callOnClick();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            Cu.this.f۱۴۶۸۵n0.start();
            Cu.this.f۱۴۶۸۵n0.setOnCompletionListener(new C۱۴۶۸a());
            Cu.this.f۱۴۶۸۷p0 = r0.f۱۴۶۸۵n0.getDuration();
            Cu.this.f۱۴۶۸۶o0 = r0.f۱۴۶۸۵n0.getCurrentPosition();
            if (Cu.f۱۴۶۸۰x0 == 0) {
                Cu.this.f۱۴۶۹۱t0.setMax((int) Cu.this.f۱۴۶۸۷p0);
                Cu.f۱۴۶۸۰x0 = 0;
            }
            Cu.this.f۱۴۶۹۱t0.setProgress((int) Cu.this.f۱۴۶۸۶o0);
            Cu.this.f۱۴۶۸۸q0.postDelayed(Cu.this.f۱۴۶۹۴w0, 1000L);
            Cu.this.f۱۴۶۸۲k0.setEnabled(true);
            Cu.this.f۱۴۶۸۳l0.setEnabled(false);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.c.u$b */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            Cu.this.f۱۴۶۸۵n0.pause();
            Cu.this.f۱۴۶۸۲k0.setEnabled(false);
            Cu.this.f۱۴۶۸۳l0.setEnabled(true);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.c.u$c */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            int temp = (int) Cu.this.f۱۴۶۸۶o0;
            if (Cu.this.f۱۴۶۸۹r0 + temp <= Cu.this.f۱۴۶۸۷p0) {
                Cu cu = Cu.this;
                double d2 = cu.f۱۴۶۸۶o0;
                double d3 = Cu.this.f۱۴۶۸۹r0;
                Double.isNaN(d3);
                cu.f۱۴۶۸۶o0 = d2 + d3;
                Cu.this.f۱۴۶۸۵n0.seekTo((int) Cu.this.f۱۴۶۸۶o0);
            }
        }
    }

    /* renamed from: com.lawyer_smartCalendar.c.u$d */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            int temp = (int) Cu.this.f۱۴۶۸۶o0;
            if (temp - Cu.this.f۱۴۶۹۰s0 > 0) {
                Cu cu = Cu.this;
                double d2 = cu.f۱۴۶۸۶o0;
                double d3 = Cu.this.f۱۴۶۹۰s0;
                Double.isNaN(d3);
                cu.f۱۴۶۸۶o0 = d2 - d3;
                Cu.this.f۱۴۶۸۵n0.seekTo((int) Cu.this.f۱۴۶۸۶o0);
            }
        }
    }

    /* renamed from: com.lawyer_smartCalendar.c.u$e */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Cu.this.f۱۴۶۸۶o0 = r0.f۱۴۶۸۵n0.getCurrentPosition();
            Cu.this.f۱۴۶۹۲u0.setText(String.format("%d min, %d sec", Long.valueOf(TimeUnit.MILLISECONDS.toMinutes((long) Cu.this.f۱۴۶۸۶o0)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds((long) Cu.this.f۱۴۶۸۶o0) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) Cu.this.f۱۴۶۸۶o0)))));
            Cu.this.f۱۴۶۹۱t0.setProgress((int) Cu.this.f۱۴۶۸۶o0);
            Cu.this.f۱۴۶۸۸q0.postDelayed(this, 1000L);
        }
    }
}
