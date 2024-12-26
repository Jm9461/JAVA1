package com.lawyer_smartCalendar.p۱۳۲c;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.p۰۴۳v4.app.DialogInterface$OnCancelListenerCe;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.lawyer_smartCalendar.R;
import java.util.concurrent.TimeUnit;

/* renamed from: com.lawyer_smartCalendar.c.u  reason: invalid class name */
public class Cu extends DialogInterface$OnCancelListenerCe {

    /* renamed from: x0  reason: contains not printable characters */
    public static int f۱۴۶۸۰x0 = 0;

    /* renamed from: j0  reason: contains not printable characters */
    private Button f۱۴۶۸۱j0;

    /* renamed from: k0  reason: contains not printable characters */
    private Button f۱۴۶۸۲k0;

    /* renamed from: l0  reason: contains not printable characters */
    private Button f۱۴۶۸۳l0;

    /* renamed from: m0  reason: contains not printable characters */
    private Button f۱۴۶۸۴m0;

    /* renamed from: n0  reason: contains not printable characters */
    private MediaPlayer f۱۴۶۸۵n0;

    /* renamed from: o0  reason: contains not printable characters */
    private double f۱۴۶۸۶o0 = 0.0d;

    /* renamed from: p0  reason: contains not printable characters */
    private double f۱۴۶۸۷p0 = 0.0d;

    /* renamed from: q0  reason: contains not printable characters */
    private Handler f۱۴۶۸۸q0 = new Handler();

    /* renamed from: r0  reason: contains not printable characters */
    private int f۱۴۶۸۹r0 = 5000;

    /* renamed from: s0  reason: contains not printable characters */
    private int f۱۴۶۹۰s0 = 5000;

    /* renamed from: t0  reason: contains not printable characters */
    private SeekBar f۱۴۶۹۱t0;

    /* renamed from: u0  reason: contains not printable characters */
    private TextView f۱۴۶۹۲u0;

    /* renamed from: v0  reason: contains not printable characters */
    public String f۱۴۶۹۳v0 = "";

    /* renamed from: w0  reason: contains not printable characters */
    private Runnable f۱۴۶۹۴w0 = new RunnableCe();

    @Override // android.support.p۰۴۳v4.app.DialogInterface$OnCancelListenerCe
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        MediaPlayer mediaPlayer = this.f۱۴۶۸۵n0;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf, android.support.p۰۴۳v4.app.DialogInterface$OnCancelListenerCe
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۷۵۹۴c(Bundle savedInstanceState) {
        super.m۱۲۱۱۲c(savedInstanceState);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۹۳a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_sheet_media_player, container, false);
        this.f۱۴۶۸۱j0 = (Button) v.findViewById(R.id.button);
        this.f۱۴۶۸۲k0 = (Button) v.findViewById(R.id.button2);
        this.f۱۴۶۸۳l0 = (Button) v.findViewById(R.id.button3);
        this.f۱۴۶۸۴m0 = (Button) v.findViewById(R.id.button4);
        this.f۱۴۶۹۲u0 = (TextView) v.findViewById(R.id.txt_time);
        this.f۱۴۶۸۵n0 = new MediaPlayer();
        try {
            this.f۱۴۶۸۵n0.setDataSource(this.f۱۴۶۹۳v0);
            this.f۱۴۶۸۵n0.prepare();
        } catch (Exception e) {
            Toast.makeText(m۱۲۱۹۷d(), e.getMessage(), 1).show();
        }
        this.f۱۴۶۹۱t0 = (SeekBar) v.findViewById(R.id.seekBar);
        this.f۱۴۶۹۱t0.setClickable(false);
        this.f۱۴۶۸۲k0.setEnabled(false);
        this.f۱۴۶۸۳l0.setOnClickListener(new View$OnClickListenerCa());
        this.f۱۴۶۸۲k0.setOnClickListener(new View$OnClickListenerCb());
        this.f۱۴۶۸۱j0.setOnClickListener(new View$OnClickListenerCc());
        this.f۱۴۶۸۴m0.setOnClickListener(new View$OnClickListenerCd());
        return v;
    }

    /* renamed from: com.lawyer_smartCalendar.c.u$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        /* renamed from: com.lawyer_smartCalendar.c.u$a$a  reason: invalid class name */
        class Ca implements MediaPlayer.OnCompletionListener {
            Ca() {
            }

            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.pause();
                Cu.this.f۱۴۶۸۲k0.setEnabled(false);
                Cu.this.f۱۴۶۸۳l0.setEnabled(true);
                Cu.this.f۱۴۶۸۲k0.callOnClick();
            }
        }

        public void onClick(View v) {
            Cu.this.f۱۴۶۸۵n0.start();
            Cu.this.f۱۴۶۸۵n0.setOnCompletionListener(new Ca());
            Cu uVar = Cu.this;
            uVar.f۱۴۶۸۷p0 = (double) uVar.f۱۴۶۸۵n0.getDuration();
            Cu uVar2 = Cu.this;
            uVar2.f۱۴۶۸۶o0 = (double) uVar2.f۱۴۶۸۵n0.getCurrentPosition();
            if (Cu.f۱۴۶۸۰x0 == 0) {
                Cu.this.f۱۴۶۹۱t0.setMax((int) Cu.this.f۱۴۶۸۷p0);
                Cu.f۱۴۶۸۰x0 = 0;
            }
            Cu.this.f۱۴۶۹۱t0.setProgress((int) Cu.this.f۱۴۶۸۶o0);
            Cu.this.f۱۴۶۸۸q0.postDelayed(Cu.this.f۱۴۶۹۴w0, 1000);
            Cu.this.f۱۴۶۸۲k0.setEnabled(true);
            Cu.this.f۱۴۶۸۳l0.setEnabled(false);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.c.u$b  reason: invalid class name */
    class View$OnClickListenerCb implements View.OnClickListener {
        View$OnClickListenerCb() {
        }

        public void onClick(View v) {
            Cu.this.f۱۴۶۸۵n0.pause();
            Cu.this.f۱۴۶۸۲k0.setEnabled(false);
            Cu.this.f۱۴۶۸۳l0.setEnabled(true);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.c.u$c  reason: invalid class name */
    class View$OnClickListenerCc implements View.OnClickListener {
        View$OnClickListenerCc() {
        }

        public void onClick(View v) {
            if (((double) (Cu.this.f۱۴۶۸۹r0 + ((int) Cu.this.f۱۴۶۸۶o0))) <= Cu.this.f۱۴۶۸۷p0) {
                Cu uVar = Cu.this;
                double d = uVar.f۱۴۶۸۶o0;
                double d2 = (double) Cu.this.f۱۴۶۸۹r0;
                Double.isNaN(d2);
                uVar.f۱۴۶۸۶o0 = d + d2;
                Cu.this.f۱۴۶۸۵n0.seekTo((int) Cu.this.f۱۴۶۸۶o0);
            }
        }
    }

    /* renamed from: com.lawyer_smartCalendar.c.u$d  reason: invalid class name */
    class View$OnClickListenerCd implements View.OnClickListener {
        View$OnClickListenerCd() {
        }

        public void onClick(View v) {
            if (((int) Cu.this.f۱۴۶۸۶o0) - Cu.this.f۱۴۶۹۰s0 > 0) {
                Cu uVar = Cu.this;
                double d = uVar.f۱۴۶۸۶o0;
                double d2 = (double) Cu.this.f۱۴۶۹۰s0;
                Double.isNaN(d2);
                uVar.f۱۴۶۸۶o0 = d - d2;
                Cu.this.f۱۴۶۸۵n0.seekTo((int) Cu.this.f۱۴۶۸۶o0);
            }
        }
    }

    /* renamed from: com.lawyer_smartCalendar.c.u$e  reason: invalid class name */
    class RunnableCe implements Runnable {
        RunnableCe() {
        }

        public void run() {
            Cu uVar = Cu.this;
            uVar.f۱۴۶۸۶o0 = (double) uVar.f۱۴۶۸۵n0.getCurrentPosition();
            Cu.this.f۱۴۶۹۲u0.setText(String.format("%d min, %d sec", Long.valueOf(TimeUnit.MILLISECONDS.toMinutes((long) Cu.this.f۱۴۶۸۶o0)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds((long) Cu.this.f۱۴۶۸۶o0) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) Cu.this.f۱۴۶۸۶o0)))));
            Cu.this.f۱۴۶۹۱t0.setProgress((int) Cu.this.f۱۴۶۸۶o0);
            Cu.this.f۱۴۶۸۸q0.postDelayed(this, 1000);
        }
    }
}
