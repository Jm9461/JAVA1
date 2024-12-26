package p۰۵۲b.p۰۶۴d.p۰۶۵a;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;

/* access modifiers changed from: package-private */
/* renamed from: b.d.a.n  reason: invalid class name */
public class Cn {

    /* renamed from: a  reason: contains not printable characters */
    private Visualizer f۱۲۶۹۳a;

    /* renamed from: b  reason: contains not printable characters */
    private MediaPlayer f۱۲۶۹۴b;

    /* renamed from: c  reason: contains not printable characters */
    private Visualizer.OnDataCaptureListener f۱۲۶۹۵c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۲۶۹۶d = Visualizer.getMaxCaptureRate();

    /* renamed from: e  reason: contains not printable characters */
    private long f۱۲۶۹۷e;

    /* renamed from: b.d.a.n$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۶۰۲۲a(byte[] bArr);
    }

    public Cn(Context context, int audioSessionId, AbstractCb onFftDataCaptureListener) {
        this.f۱۲۶۹۴b = MediaPlayer.create(context, Ck.av_workaround_1min);
        this.f۱۲۶۹۳a = new Visualizer(audioSessionId);
        this.f۱۲۶۹۳a.setEnabled(false);
        this.f۱۲۶۹۳a.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
        this.f۱۲۶۹۵c = new Ca(onFftDataCaptureListener);
        this.f۱۲۶۹۳a.setEnabled(true);
    }

    /* renamed from: b.d.a.n$a  reason: invalid class name */
    class Ca implements Visualizer.OnDataCaptureListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCb f۱۲۶۹۸a;

        Ca(AbstractCb bVar) {
            this.f۱۲۶۹۸a = bVar;
        }

        public void onWaveFormDataCapture(Visualizer visualizer, byte[] waveform, int samplingRate) {
        }

        public void onFftDataCapture(Visualizer visualizer, byte[] fft, int samplingRate) {
            boolean allZero = Cl.m۱۶۰۰۸a(fft);
            if (Cn.this.f۱۲۶۹۷e == 0) {
                if (allZero) {
                    Cn.this.f۱۲۶۹۷e = System.currentTimeMillis();
                }
            } else if (!allZero) {
                Cn.this.f۱۲۶۹۷e = 0;
            } else if (System.currentTimeMillis() - Cn.this.f۱۲۶۹۷e >= 500) {
                Cn.this.m۱۶۰۲۱a(true);
                Cn.this.f۱۲۶۹۷e = 0;
            }
            this.f۱۲۶۹۸a.m۱۶۰۲۲a(fft);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۰۲۰a() {
        this.f۱۲۶۹۳a.setEnabled(false);
        this.f۱۲۶۹۳a.release();
        this.f۱۲۶۹۳a = null;
        this.f۱۲۶۹۴b.release();
        this.f۱۲۶۹۴b = null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۰۲۱a(boolean enabled) {
        Visualizer visualizer = this.f۱۲۶۹۳a;
        if (visualizer != null) {
            visualizer.setEnabled(false);
            if (enabled) {
                this.f۱۲۶۹۳a.setDataCaptureListener(this.f۱۲۶۹۵c, this.f۱۲۶۹۶d, false, true);
            } else {
                this.f۱۲۶۹۳a.setDataCaptureListener(null, this.f۱۲۶۹۶d, false, false);
            }
            this.f۱۲۶۹۳a.setEnabled(true);
        }
    }
}
