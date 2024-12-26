package p۲۰۸b.p۲۲۰d.p۲۲۱a;

import android.content.Context;
import android.media.MediaPlayer;
import p۲۰۸b.p۲۲۰d.p۲۲۱a.Cn;

/* renamed from: b.d.a.m, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cm extends AbstractCb<byte[]> implements Cn.b, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {

    /* renamed from: j, reason: contains not printable characters */
    private final Cn f۱۲۶۸۷j;

    /* renamed from: k, reason: contains not printable characters */
    private float[] f۱۲۶۸۸k;

    /* renamed from: l, reason: contains not printable characters */
    private float[] f۱۲۶۸۹l;

    /* renamed from: m, reason: contains not printable characters */
    private MediaPlayer.OnPreparedListener f۱۲۶۹۰m;

    /* renamed from: n, reason: contains not printable characters */
    private MediaPlayer.OnCompletionListener f۱۲۶۹۱n;

    /* renamed from: o, reason: contains not printable characters */
    private final float[] f۱۲۶۹۲o;

    Cm(Context context, int audioSession) {
        this.f۱۲۶۹۲o = new float[]{0.001814059f, 0.007936508f, 0.05668934f, 0.22675736f};
        this.f۱۲۶۸۷j = new Cn(context, audioSession, this);
    }

    Cm(Context context, MediaPlayer mediaPlayer) {
        this(context, mediaPlayer.getAudioSessionId());
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnCompletionListener(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p۲۰۸b.p۲۲۰d.p۲۲۱a.AbstractCb
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo۱۴۵۸۹a(byte[] fft, int layersCount, float[] dBmArray, float[] ampArray) {
        int dataSize = (fft.length / 2) - 1;
        float[] fArr = this.f۱۲۶۸۸k;
        if (fArr == null || fArr.length != dataSize) {
            this.f۱۲۶۸۸k = new float[dataSize];
        }
        float[] fArr2 = this.f۱۲۶۸۹l;
        if (fArr2 == null || fArr2.length != dataSize) {
            this.f۱۲۶۸۹l = new float[dataSize];
        }
        for (int i = 0; i < dataSize; i++) {
            float re = fft[i * 2];
            float im = fft[(i * 2) + 1];
            float sqMag = (re * re) + (im * im);
            this.f۱۲۶۸۸k[i] = Cl.m۱۳۹۳۲a(sqMag);
            float k = 1.0f;
            if (i == 0 || i == dataSize - 1) {
                k = 2.0f;
            }
            float[] fArr3 = this.f۱۲۶۸۹l;
            double d2 = k;
            double sqrt = Math.sqrt(sqMag);
            Double.isNaN(d2);
            double d3 = d2 * sqrt;
            double d4 = dataSize;
            Double.isNaN(d4);
            fArr3[i] = (float) (d3 / d4);
        }
        for (int i2 = 0; i2 < layersCount; i2++) {
            int index = (int) (this.f۱۲۶۹۲o[i2] * fft.length);
            float db = this.f۱۲۶۸۸k[index];
            float amp = this.f۱۲۶۸۹l[index];
            dBmArray[i2] = db / 76.0f;
            ampArray[i2] = amp;
        }
    }

    @Override // p۲۰۸b.p۲۲۰d.p۲۲۱a.Cn.b
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۹۵۱a(byte[] fft) {
        m۱۳۸۶۰a((Cm) fft);
    }

    @Override // p۲۰۸b.p۲۲۰d.p۲۲۱a.AbstractCb
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۳۹۴۵c() {
        super.mo۱۳۹۴۵c();
        this.f۱۲۶۸۷j.m۱۳۹۵۰a(true);
    }

    @Override // p۲۰۸b.p۲۲۰d.p۲۲۱a.AbstractCb
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۹۴۴b() {
        this.f۱۲۶۸۷j.m۱۳۹۵۰a(false);
        super.mo۱۳۹۴۴b();
    }

    @Override // p۲۰۸b.p۲۲۰d.p۲۲۱a.AbstractCb
    /* renamed from: d, reason: contains not printable characters */
    public void mo۱۳۹۴۶d() {
        super.mo۱۳۹۴۶d();
        this.f۱۲۶۸۷j.m۱۳۹۴۹a();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mp) {
        m۱۳۸۵۸a();
        this.f۱۲۶۸۷j.m۱۳۹۵۰a(false);
        MediaPlayer.OnCompletionListener onCompletionListener = this.f۱۲۶۹۱n;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mp);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mp) {
        m۱۳۸۶۵e();
        this.f۱۲۶۸۷j.m۱۳۹۵۰a(true);
        MediaPlayer.OnPreparedListener onPreparedListener = this.f۱۲۶۹۰m;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(mp);
        }
    }
}
