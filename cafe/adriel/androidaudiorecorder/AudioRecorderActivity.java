package cafe.adriel.androidaudiorecorder;

import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.p۰۴۳v4.content.Ca;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cafe.adriel.androidaudiorecorder.p۱۲۸j.EnumCa;
import cafe.adriel.androidaudiorecorder.p۱۲۸j.EnumCb;
import cafe.adriel.androidaudiorecorder.p۱۲۸j.EnumCc;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import p۰۵۲b.p۰۶۴d.p۰۶۵a.AbstractCb;
import p۰۵۲b.p۰۶۴d.p۰۶۵a.Cc;
import p۱۵۰g.AbstractCb;
import p۱۵۰g.AbstractCe;
import p۱۵۰g.AbstractCf;

public class AudioRecorderActivity extends ActivityCe implements AbstractCe.AbstractCc, MediaPlayer.OnCompletionListener {

    /* renamed from: A  reason: contains not printable characters */
    private Ci f۱۳۱۷۷A;

    /* renamed from: B  reason: contains not printable characters */
    private Timer f۱۳۱۷۸B;

    /* renamed from: C  reason: contains not printable characters */
    private MenuItem f۱۳۱۷۹C;

    /* renamed from: D  reason: contains not printable characters */
    private int f۱۳۱۸۰D;

    /* renamed from: E  reason: contains not printable characters */
    private int f۱۳۱۸۱E;

    /* renamed from: F  reason: contains not printable characters */
    private boolean f۱۳۱۸۲F;

    /* renamed from: G  reason: contains not printable characters */
    private RelativeLayout f۱۳۱۸۳G;

    /* renamed from: H  reason: contains not printable characters */
    private Cc f۱۳۱۸۴H;

    /* renamed from: I  reason: contains not printable characters */
    private TextView f۱۳۱۸۵I;

    /* renamed from: J  reason: contains not printable characters */
    private TextView f۱۳۱۸۶J;

    /* renamed from: K  reason: contains not printable characters */
    private ImageButton f۱۳۱۸۷K;

    /* renamed from: L  reason: contains not printable characters */
    private ImageButton f۱۳۱۸۸L;

    /* renamed from: M  reason: contains not printable characters */
    private ImageButton f۱۳۱۸۹M;

    /* renamed from: r  reason: contains not printable characters */
    private String f۱۳۱۹۰r;

    /* renamed from: s  reason: contains not printable characters */
    private EnumCc f۱۳۱۹۱s;

    /* renamed from: t  reason: contains not printable characters */
    private EnumCa f۱۳۱۹۲t;

    /* renamed from: u  reason: contains not printable characters */
    private EnumCb f۱۳۱۹۳u;

    /* renamed from: v  reason: contains not printable characters */
    private int f۱۳۱۹۴v;

    /* renamed from: w  reason: contains not printable characters */
    private boolean f۱۳۱۹۵w;

    /* renamed from: x  reason: contains not printable characters */
    private boolean f۱۳۱۹۶x;

    /* renamed from: y  reason: contains not printable characters */
    private MediaPlayer f۱۳۱۹۷y;

    /* renamed from: z  reason: contains not printable characters */
    private AbstractCf f۱۳۱۹۸z;

    /* renamed from: d  reason: contains not printable characters */
    static /* synthetic */ int m۱۶۶۲۷d(AudioRecorderActivity x0) {
        int i = x0.f۱۳۱۸۱E;
        x0.f۱۳۱۸۱E = i + 1;
        return i;
    }

    /* renamed from: l  reason: contains not printable characters */
    static /* synthetic */ int m۱۶۶۳۵l(AudioRecorderActivity x0) {
        int i = x0.f۱۳۱۸۰D;
        x0.f۱۳۱۸۰D = i + 1;
        return i;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(Ce.aar_activity_audio_recorder);
        if (savedInstanceState != null) {
            this.f۱۳۱۹۰r = savedInstanceState.getString("filePath");
            this.f۱۳۱۹۱s = (EnumCc) savedInstanceState.getSerializable("source");
            this.f۱۳۱۹۲t = (EnumCa) savedInstanceState.getSerializable("channel");
            this.f۱۳۱۹۳u = (EnumCb) savedInstanceState.getSerializable("sampleRate");
            this.f۱۳۱۹۴v = savedInstanceState.getInt("color");
            this.f۱۳۱۹۵w = savedInstanceState.getBoolean("autoStart");
            this.f۱۳۱۹۶x = savedInstanceState.getBoolean("keepDisplayOn");
        } else {
            this.f۱۳۱۹۰r = getIntent().getStringExtra("filePath");
            this.f۱۳۱۹۱s = (EnumCc) getIntent().getSerializableExtra("source");
            this.f۱۳۱۹۲t = (EnumCa) getIntent().getSerializableExtra("channel");
            this.f۱۳۱۹۳u = (EnumCb) getIntent().getSerializableExtra("sampleRate");
            this.f۱۳۱۹۴v = getIntent().getIntExtra("color", -16777216);
            this.f۱۳۱۹۵w = getIntent().getBooleanExtra("autoStart", false);
            this.f۱۳۱۹۶x = getIntent().getBooleanExtra("keepDisplayOn", false);
        }
        if (this.f۱۳۱۹۶x) {
            getWindow().addFlags(128);
        }
        if (m۱۳۴۸۹j() != null) {
            m۱۳۴۸۹j().m۱۳۴۲۵f(true);
            m۱۳۴۸۹j().m۱۳۴۲۲d(true);
            m۱۳۴۸۹j().m۱۳۴۲۳e(false);
            m۱۳۴۸۹j().m۱۳۴۱۱a(0.0f);
            m۱۳۴۸۹j().m۱۳۴۱۳a(new ColorDrawable(Ch.m۱۶۶۶۱b(this.f۱۳۱۹۴v)));
            m۱۳۴۸۹j().m۱۳۴۱۸b(Ca.m۱۲۶۲۶c(this, Cc.aar_ic_clear));
        }
        Cc.Cc cVar = new Cc.Cc(this);
        cVar.m۱۵۹۶۴d(1);
        cVar.m۱۵۹۶۶e(6);
        cVar.m۱۵۹۶۸g(Cb.aar_wave_height);
        cVar.m۱۵۹۶۷f(Cb.aar_footer_height);
        cVar.m۱۵۹۶۰b(20);
        cVar.m۱۵۹۶۳c(Cb.aar_bubble_size);
        cVar.m۱۵۹۵۷a(true);
        this.f۱۳۱۸۴H = ((Cc.Cc) ((Cc.Cc) cVar.m۱۵۹۶۹a(Ch.m۱۶۶۶۱b(this.f۱۳۱۹۴v))).m۱۵۹۷۰a(new int[]{this.f۱۳۱۹۴v})).m۱۵۹۶۵d();
        this.f۱۳۱۸۳G = (RelativeLayout) findViewById(Cd.content);
        this.f۱۳۱۸۵I = (TextView) findViewById(Cd.status);
        this.f۱۳۱۸۶J = (TextView) findViewById(Cd.timer);
        this.f۱۳۱۸۷K = (ImageButton) findViewById(Cd.restart);
        this.f۱۳۱۸۸L = (ImageButton) findViewById(Cd.record);
        this.f۱۳۱۸۹M = (ImageButton) findViewById(Cd.play);
        this.f۱۳۱۸۳G.setBackgroundColor(Ch.m۱۶۶۶۱b(this.f۱۳۱۹۴v));
        this.f۱۳۱۸۳G.addView(this.f۱۳۱۸۴H, 0);
        this.f۱۳۱۸۷K.setVisibility(4);
        this.f۱۳۱۸۹M.setVisibility(4);
        if (Ch.m۱۶۶۶۳d(this.f۱۳۱۹۴v)) {
            Ca.m۱۲۶۲۶c(this, Cc.aar_ic_clear).setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            Ca.m۱۲۶۲۶c(this, Cc.aar_ic_check).setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f۱۳۱۸۵I.setTextColor(-16777216);
            this.f۱۳۱۸۶J.setTextColor(-16777216);
            this.f۱۳۱۸۷K.setColorFilter(-16777216);
            this.f۱۳۱۸۸L.setColorFilter(-16777216);
            this.f۱۳۱۸۹M.setColorFilter(-16777216);
        }
    }

    @Override // android.support.p۰۴۷v7.app.ActivityCe
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        if (this.f۱۳۱۹۵w && !this.f۱۳۱۸۲F) {
            toggleRecording(null);
        }
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onResume() {
        super.onResume();
        try {
            this.f۱۳۱۸۴H.onResume();
        } catch (Exception e) {
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onPause() {
        restartRecording(null);
        try {
            this.f۱۳۱۸۴H.onPause();
        } catch (Exception e) {
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۷v7.app.ActivityCe
    public void onDestroy() {
        restartRecording(null);
        setResult(0);
        try {
            this.f۱۳۱۸۴H.m۱۵۹۴۶c();
        } catch (Exception e) {
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("filePath", this.f۱۳۱۹۰r);
        outState.putInt("color", this.f۱۳۱۹۴v);
        super.onSaveInstanceState(outState);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(Cf.aar_audio_recorder, menu);
        this.f۱۳۱۷۹C = menu.findItem(Cd.action_save);
        this.f۱۳۱۷۹C.setIcon(Ca.m۱۲۶۲۶c(this, Cc.aar_ic_check));
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if (i == 16908332) {
            finish();
        } else if (i == Cd.action_save) {
            m۱۶۶۴۰p();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // p۱۵۰g.AbstractCe.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۶۴۷a(AbstractCb audioChunk) {
        this.f۱۳۱۷۷A.m۱۵۹۳۰a(Float.valueOf(this.f۱۳۱۸۲F ? (float) audioChunk.m۱۹۵۷۹a() : 0.0f));
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        m۱۶۶۴۳s();
    }

    /* renamed from: p  reason: contains not printable characters */
    private void m۱۶۶۴۰p() {
        m۱۶۶۴۴t();
        setResult(-1);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cafe.adriel.androidaudiorecorder.AudioRecorderActivity$a  reason: invalid class name */
    public class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            if (AudioRecorderActivity.this.f۱۳۱۸۲F) {
                AudioRecorderActivity.this.m۱۶۶۳۸n();
            } else {
                AudioRecorderActivity.this.m۱۶۶۳۹o();
            }
        }
    }

    public void toggleRecording(View v) {
        m۱۶۶۴۳s();
        Ch.m۱۶۶۶۰a(100, new RunnableCa());
    }

    /* renamed from: cafe.adriel.androidaudiorecorder.AudioRecorderActivity$b  reason: invalid class name */
    class RunnableCb implements Runnable {
        RunnableCb() {
        }

        public void run() {
            if (AudioRecorderActivity.this.m۱۶۶۳۷m()) {
                AudioRecorderActivity.this.m۱۶۶۴۳s();
            } else {
                AudioRecorderActivity.this.m۱۶۶۴۱q();
            }
        }
    }

    public void togglePlaying(View v) {
        m۱۶۶۳۸n();
        Ch.m۱۶۶۶۰a(100, new RunnableCb());
    }

    public void restartRecording(View v) {
        if (this.f۱۳۱۸۲F) {
            m۱۶۶۴۴t();
        } else if (m۱۶۶۳۷m()) {
            m۱۶۶۴۳s();
        } else {
            this.f۱۳۱۷۷A = new Ci();
            this.f۱۳۱۸۴H.m۱۵۹۴۲a(this.f۱۳۱۷۷A);
            this.f۱۳۱۸۴H.m۱۵۹۴۶c();
            Ci iVar = this.f۱۳۱۷۷A;
            if (iVar != null) {
                iVar.m۱۶۶۶۶g();
            }
        }
        this.f۱۳۱۷۹C.setVisible(false);
        this.f۱۳۱۸۵I.setVisibility(4);
        this.f۱۳۱۸۷K.setVisibility(4);
        this.f۱۳۱۸۹M.setVisibility(4);
        this.f۱۳۱۸۸L.setImageResource(Cc.aar_ic_rec);
        this.f۱۳۱۸۶J.setText("00:00:00");
        this.f۱۳۱۸۰D = 0;
        this.f۱۳۱۸۱E = 0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: o  reason: contains not printable characters */
    private void m۱۶۶۳۹o() {
        this.f۱۳۱۸۲F = true;
        this.f۱۳۱۷۹C.setVisible(false);
        this.f۱۳۱۸۵I.setText(Cg.aar_recording);
        this.f۱۳۱۸۵I.setVisibility(0);
        this.f۱۳۱۸۷K.setVisibility(4);
        this.f۱۳۱۸۹M.setVisibility(4);
        this.f۱۳۱۸۸L.setImageResource(Cc.aar_ic_pause);
        this.f۱۳۱۸۹M.setImageResource(Cc.aar_ic_play);
        this.f۱۳۱۷۷A = new Ci();
        this.f۱۳۱۸۴H.m۱۵۹۴۲a(this.f۱۳۱۷۷A);
        if (this.f۱۳۱۹۸z == null) {
            this.f۱۳۱۸۶J.setText("00:00:00");
            this.f۱۳۱۹۸z = p۱۵۰g.Cd.m۱۹۵۹۸a(new AbstractCe.Cb(Ch.m۱۶۶۵۸a(this.f۱۳۱۹۱s, this.f۱۳۱۹۲t, this.f۱۳۱۹۳u), this), new File(this.f۱۳۱۹۰r));
        }
        this.f۱۳۱۹۸z.m۱۹۶۱۰c();
        m۱۶۶۴۲r();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: n  reason: contains not printable characters */
    private void m۱۶۶۳۸n() {
        this.f۱۳۱۸۲F = false;
        if (!isFinishing()) {
            this.f۱۳۱۷۹C.setVisible(true);
        }
        this.f۱۳۱۸۵I.setText(Cg.aar_paused);
        this.f۱۳۱۸۵I.setVisibility(0);
        this.f۱۳۱۸۷K.setVisibility(0);
        this.f۱۳۱۸۹M.setVisibility(0);
        this.f۱۳۱۸۸L.setImageResource(Cc.aar_ic_rec);
        this.f۱۳۱۸۹M.setImageResource(Cc.aar_ic_play);
        this.f۱۳۱۸۴H.m۱۵۹۴۶c();
        Ci iVar = this.f۱۳۱۷۷A;
        if (iVar != null) {
            iVar.m۱۶۶۶۶g();
        }
        AbstractCf fVar = this.f۱۳۱۹۸z;
        if (fVar != null) {
            fVar.m۱۹۶۰۹b();
        }
        m۱۶۶۴۵u();
    }

    /* renamed from: t  reason: contains not printable characters */
    private void m۱۶۶۴۴t() {
        this.f۱۳۱۸۴H.m۱۵۹۴۶c();
        Ci iVar = this.f۱۳۱۷۷A;
        if (iVar != null) {
            iVar.m۱۶۶۶۶g();
        }
        this.f۱۳۱۸۰D = 0;
        AbstractCf fVar = this.f۱۳۱۹۸z;
        if (fVar != null) {
            fVar.m۱۹۶۰۸a();
            this.f۱۳۱۹۸z = null;
        }
        m۱۶۶۴۵u();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: q  reason: contains not printable characters */
    private void m۱۶۶۴۱q() {
        try {
            m۱۶۶۴۴t();
            this.f۱۳۱۹۷y = new MediaPlayer();
            this.f۱۳۱۹۷y.setDataSource(this.f۱۳۱۹۰r);
            this.f۱۳۱۹۷y.prepare();
            this.f۱۳۱۹۷y.start();
            this.f۱۳۱۸۴H.m۱۵۹۴۲a(AbstractCb.Cc.m۱۵۹۳۸a(this, this.f۱۳۱۹۷y));
            this.f۱۳۱۸۴H.post(new RunnableCc());
            this.f۱۳۱۸۶J.setText("00:00:00");
            this.f۱۳۱۸۵I.setText(Cg.aar_playing);
            this.f۱۳۱۸۵I.setVisibility(0);
            this.f۱۳۱۸۹M.setImageResource(Cc.aar_ic_stop);
            this.f۱۳۱۸۱E = 0;
            m۱۶۶۴۲r();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cafe.adriel.androidaudiorecorder.AudioRecorderActivity$c  reason: invalid class name */
    public class RunnableCc implements Runnable {
        RunnableCc() {
        }

        public void run() {
            AudioRecorderActivity.this.f۱۳۱۹۷y.setOnCompletionListener(AudioRecorderActivity.this);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: s  reason: contains not printable characters */
    private void m۱۶۶۴۳s() {
        this.f۱۳۱۸۵I.setText("");
        this.f۱۳۱۸۵I.setVisibility(4);
        this.f۱۳۱۸۹M.setImageResource(Cc.aar_ic_play);
        this.f۱۳۱۸۴H.m۱۵۹۴۶c();
        Ci iVar = this.f۱۳۱۷۷A;
        if (iVar != null) {
            iVar.m۱۶۶۶۶g();
        }
        MediaPlayer mediaPlayer = this.f۱۳۱۹۷y;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
                this.f۱۳۱۹۷y.reset();
            } catch (Exception e) {
            }
        }
        m۱۶۶۴۵u();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m  reason: contains not printable characters */
    private boolean m۱۶۶۳۷m() {
        try {
            return this.f۱۳۱۹۷y != null && this.f۱۳۱۹۷y.isPlaying() && !this.f۱۳۱۸۲F;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: r  reason: contains not printable characters */
    private void m۱۶۶۴۲r() {
        m۱۶۶۴۵u();
        this.f۱۳۱۷۸B = new Timer();
        this.f۱۳۱۷۸B.scheduleAtFixedRate(new Cd(), 0, 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cafe.adriel.androidaudiorecorder.AudioRecorderActivity$d  reason: invalid class name */
    public class Cd extends TimerTask {
        Cd() {
        }

        public void run() {
            AudioRecorderActivity.this.m۱۶۶۴۶v();
        }
    }

    /* renamed from: u  reason: contains not printable characters */
    private void m۱۶۶۴۵u() {
        Timer timer = this.f۱۳۱۷۸B;
        if (timer != null) {
            timer.cancel();
            this.f۱۳۱۷۸B.purge();
            this.f۱۳۱۷۸B = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cafe.adriel.androidaudiorecorder.AudioRecorderActivity$e  reason: invalid class name */
    public class RunnableCe implements Runnable {
        RunnableCe() {
        }

        public void run() {
            if (AudioRecorderActivity.this.f۱۳۱۸۲F) {
                AudioRecorderActivity.m۱۶۶۳۵l(AudioRecorderActivity.this);
                AudioRecorderActivity.this.f۱۳۱۸۶J.setText(Ch.m۱۶۶۵۹a(AudioRecorderActivity.this.f۱۳۱۸۰D));
            } else if (AudioRecorderActivity.this.m۱۶۶۳۷m()) {
                AudioRecorderActivity.m۱۶۶۲۷d(AudioRecorderActivity.this);
                AudioRecorderActivity.this.f۱۳۱۸۶J.setText(Ch.m۱۶۶۵۹a(AudioRecorderActivity.this.f۱۳۱۸۱E));
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: v  reason: contains not printable characters */
    private void m۱۶۶۴۶v() {
        runOnUiThread(new RunnableCe());
    }
}
