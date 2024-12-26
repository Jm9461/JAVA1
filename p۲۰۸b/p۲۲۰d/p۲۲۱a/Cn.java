package p۲۰۸b.p۲۲۰d.p۲۲۱a;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;

/* renamed from: b.d.a.n, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cn {

    /* renamed from: a, reason: contains not printable characters */
    private Visualizer f۱۲۶۹۳a;

    /* renamed from: b, reason: contains not printable characters */
    private MediaPlayer f۱۲۶۹۴b;

    /* renamed from: c, reason: contains not printable characters */
    private Visualizer.OnDataCaptureListener f۱۲۶۹۵c;

    /* renamed from: d, reason: contains not printable characters */
    private int f۱۲۶۹۶d;

    /* renamed from: e, reason: contains not printable characters */
    private long f۱۲۶۹۷e;

    /* renamed from: b.d.a.n$b */
    public interface b {
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۳۹۵۱a(byte[] bArr);
    }

    public Cn(Context context, int audioSessionId, b onFftDataCaptureListener) {
        this.f۱۲۶۹۴b = MediaPlayer.create(context, Ck.av_workaround_1min);
        this.f۱۲۶۹۳a = new Visualizer(audioSessionId);
        this.f۱۲۶۹۳a.setEnabled(false);
        this.f۱۲۶۹۳a.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
        this.f۱۲۶۹۶d = Visualizer.getMaxCaptureRate();
        this.f۱۲۶۹۵c = new a(onFftDataCaptureListener);
        this.f۱۲۶۹۳a.setEnabled(true);
    }

    /* renamed from: b.d.a.n$a */
    class a implements Visualizer.OnDataCaptureListener {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ b f۱۲۶۹۸a;

        a(b bVar) {
            this.f۱۲۶۹۸a = bVar;
        }

        @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
        public void onWaveFormDataCapture(Visualizer visualizer, byte[] waveform, int samplingRate) {
        }

        @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
        public void onFftDataCapture(Visualizer visualizer, byte[] fft, int samplingRate) {
            boolean allZero = Cl.m۱۳۹۳۸a(fft);
            if (Cn.this.f۱۲۶۹۷e == 0) {
                if (allZero) {
                    Cn.this.f۱۲۶۹۷e = System.currentTimeMillis();
                }
            } else if (!allZero) {
                Cn.this.f۱۲۶۹۷e = 0L;
            } else if (System.currentTimeMillis() - Cn.this.f۱۲۶۹۷e >= 500) {
                Cn.this.m۱۳۹۵۰a(true);
                Cn.this.f۱۲۶۹۷e = 0L;
            }
            this.f۱۲۶۹۸a.mo۱۳۹۵۱a(fft);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۹۴۹a() {
        this.f۱۲۶۹۳a.setEnabled(false);
        this.f۱۲۶۹۳a.release();
        this.f۱۲۶۹۳a = null;
        this.f۱۲۶۹۴b.release();
        this.f۱۲۶۹۴b = null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۹۵۰a(boolean enabled) {
        Visualizer visualizer = this.f۱۲۶۹۳a;
        if (visualizer == null) {
            return;
        }
        visualizer.setEnabled(false);
        if (enabled) {
            this.f۱۲۶۹۳a.setDataCaptureListener(this.f۱۲۶۹۵c, this.f۱۲۶۹۶d, false, true);
        } else {
            this.f۱۲۶۹۳a.setDataCaptureListener(null, this.f۱۲۶۹۶d, false, false);
        }
        this.f۱۲۶۹۳a.setEnabled(true);
    }
}
