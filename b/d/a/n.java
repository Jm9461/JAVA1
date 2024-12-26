package b.d.a;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;

/* access modifiers changed from: package-private */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private Visualizer f۲۴۴۹a;

    /* renamed from: b  reason: collision with root package name */
    private MediaPlayer f۲۴۵۰b;

    /* renamed from: c  reason: collision with root package name */
    private Visualizer.OnDataCaptureListener f۲۴۵۱c;

    /* renamed from: d  reason: collision with root package name */
    private int f۲۴۵۲d = Visualizer.getMaxCaptureRate();

    /* renamed from: e  reason: collision with root package name */
    private long f۲۴۵۳e;

    public interface b {
        void a(byte[] bArr);
    }

    public n(Context context, int audioSessionId, b onFftDataCaptureListener) {
        this.f۲۴۵۰b = MediaPlayer.create(context, k.av_workaround_1min);
        this.f۲۴۴۹a = new Visualizer(audioSessionId);
        this.f۲۴۴۹a.setEnabled(false);
        this.f۲۴۴۹a.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
        this.f۲۴۵۱c = new a(onFftDataCaptureListener);
        this.f۲۴۴۹a.setEnabled(true);
    }

    class a implements Visualizer.OnDataCaptureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f۲۴۵۴a;

        a(b bVar) {
            this.f۲۴۵۴a = bVar;
        }

        public void onWaveFormDataCapture(Visualizer visualizer, byte[] waveform, int samplingRate) {
        }

        public void onFftDataCapture(Visualizer visualizer, byte[] fft, int samplingRate) {
            boolean allZero = l.a(fft);
            if (n.this.f۲۴۵۳e == 0) {
                if (allZero) {
                    n.this.f۲۴۵۳e = System.currentTimeMillis();
                }
            } else if (!allZero) {
                n.this.f۲۴۵۳e = 0;
            } else if (System.currentTimeMillis() - n.this.f۲۴۵۳e >= 500) {
                n.this.a(true);
                n.this.f۲۴۵۳e = 0;
            }
            this.f۲۴۵۴a.a(fft);
        }
    }

    public void a() {
        this.f۲۴۴۹a.setEnabled(false);
        this.f۲۴۴۹a.release();
        this.f۲۴۴۹a = null;
        this.f۲۴۵۰b.release();
        this.f۲۴۵۰b = null;
    }

    public void a(boolean enabled) {
        Visualizer visualizer = this.f۲۴۴۹a;
        if (visualizer != null) {
            visualizer.setEnabled(false);
            if (enabled) {
                this.f۲۴۴۹a.setDataCaptureListener(this.f۲۴۵۱c, this.f۲۴۵۲d, false, true);
            } else {
                this.f۲۴۴۹a.setDataCaptureListener(null, this.f۲۴۵۲d, false, false);
            }
            this.f۲۴۴۹a.setEnabled(true);
        }
    }
}
