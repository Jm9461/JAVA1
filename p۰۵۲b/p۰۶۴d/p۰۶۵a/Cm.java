package p۰۵۲b.p۰۶۴d.p۰۶۵a;

import android.content.Context;
import android.media.MediaPlayer;
import p۰۵۲b.p۰۶۴d.p۰۶۵a.Cn;

/* renamed from: b.d.a.m  reason: invalid class name */
public class Cm extends AbstractCb<byte[]> implements Cn.AbstractCb, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {

    /* renamed from: j  reason: contains not printable characters */
    private final Cn f۱۲۶۸۷j;

    /* renamed from: k  reason: contains not printable characters */
    private float[] f۱۲۶۸۸k;

    /* renamed from: l  reason: contains not printable characters */
    private float[] f۱۲۶۸۹l;

    /* renamed from: m  reason: contains not printable characters */
    private MediaPlayer.OnPreparedListener f۱۲۶۹۰m;

    /* renamed from: n  reason: contains not printable characters */
    private MediaPlayer.OnCompletionListener f۱۲۶۹۱n;

    /* renamed from: o  reason: contains not printable characters */
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

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۰۱۲a(byte[] fft, int layersCount, float[] dBmArray, float[] ampArray) {
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
            float re = (float) fft[i * 2];
            float im = (float) fft[(i * 2) + 1];
            float sqMag = (re * re) + (im * im);
            this.f۱۲۶۸۸k[i] = Cl.m۱۶۰۰۲a(sqMag);
            float k = 1.0f;
            if (i == 0 || i == dataSize - 1) {
                k = 2.0f;
            }
            float[] fArr3 = this.f۱۲۶۸۹l;
            double d = (double) k;
            double sqrt = Math.sqrt((double) sqMag);
            Double.isNaN(d);
            double d2 = d * sqrt;
            double d3 = (double) dataSize;
            Double.isNaN(d3);
            fArr3[i] = (float) (d2 / d3);
        }
        for (int i2 = 0; i2 < layersCount; i2++) {
            int index = (int) (this.f۱۲۶۹۲o[i2] * ((float) fft.length));
            float db = this.f۱۲۶۸۸k[index];
            float amp = this.f۱۲۶۸۹l[index];
            dBmArray[i2] = db / 76.0f;
            ampArray[i2] = amp;
        }
    }

    @Override // p۰۵۲b.p۰۶۴d.p۰۶۵a.Cn.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۰۱۳a(byte[] fft) {
        m۱۵۹۳۰a((Object) fft);
    }

    @Override // p۰۵۲b.p۰۶۴d.p۰۶۵a.AbstractCb
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۶۰۱۶c() {
        super.m۱۵۹۳۳c();
        this.f۱۲۶۸۷j.m۱۶۰۲۱a(true);
    }

    @Override // p۰۵۲b.p۰۶۴d.p۰۶۵a.AbstractCb
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۰۱۵b() {
        this.f۱۲۶۸۷j.m۱۶۰۲۱a(false);
        super.m۱۵۹۳۲b();
    }

    @Override // p۰۵۲b.p۰۶۴d.p۰۶۵a.AbstractCb
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۶۰۱۷d() {
        super.m۱۵۹۳۴d();
        this.f۱۲۶۸۷j.m۱۶۰۲۰a();
    }

    public void onCompletion(MediaPlayer mp) {
        m۱۵۹۲۸a();
        this.f۱۲۶۸۷j.m۱۶۰۲۱a(false);
        MediaPlayer.OnCompletionListener onCompletionListener = this.f۱۲۶۹۱n;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mp);
        }
    }

    public void onPrepared(MediaPlayer mp) {
        m۱۵۹۳۵e();
        this.f۱۲۶۸۷j.m۱۶۰۲۱a(true);
        MediaPlayer.OnPreparedListener onPreparedListener = this.f۱۲۶۹۰m;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(mp);
        }
    }
}
