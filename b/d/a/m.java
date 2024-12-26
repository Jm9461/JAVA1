package b.d.a;

import android.content.Context;
import android.media.MediaPlayer;
import b.d.a.n;

public class m extends b<byte[]> implements n.b, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {
    private final n j;
    private float[] k;
    private float[] l;
    private MediaPlayer.OnPreparedListener m;
    private MediaPlayer.OnCompletionListener n;
    private final float[] o;

    m(Context context, int audioSession) {
        this.o = new float[]{0.001814059f, 0.007936508f, 0.05668934f, 0.22675736f};
        this.j = new n(context, audioSession, this);
    }

    m(Context context, MediaPlayer mediaPlayer) {
        this(context, mediaPlayer.getAudioSessionId());
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnCompletionListener(this);
    }

    /* access modifiers changed from: protected */
    public void a(byte[] fft, int layersCount, float[] dBmArray, float[] ampArray) {
        int dataSize = (fft.length / 2) - 1;
        float[] fArr = this.k;
        if (fArr == null || fArr.length != dataSize) {
            this.k = new float[dataSize];
        }
        float[] fArr2 = this.l;
        if (fArr2 == null || fArr2.length != dataSize) {
            this.l = new float[dataSize];
        }
        for (int i = 0; i < dataSize; i++) {
            float re = (float) fft[i * 2];
            float im = (float) fft[(i * 2) + 1];
            float sqMag = (re * re) + (im * im);
            this.k[i] = l.a(sqMag);
            float k2 = 1.0f;
            if (i == 0 || i == dataSize - 1) {
                k2 = 2.0f;
            }
            float[] fArr3 = this.l;
            double d2 = (double) k2;
            double sqrt = Math.sqrt((double) sqMag);
            Double.isNaN(d2);
            double d3 = d2 * sqrt;
            double d4 = (double) dataSize;
            Double.isNaN(d4);
            fArr3[i] = (float) (d3 / d4);
        }
        for (int i2 = 0; i2 < layersCount; i2++) {
            int index = (int) (this.o[i2] * ((float) fft.length));
            float db = this.k[index];
            float amp = this.l[index];
            dBmArray[i2] = db / 76.0f;
            ampArray[i2] = amp;
        }
    }

    @Override // b.d.a.n.b
    public void a(byte[] fft) {
        a((Object) fft);
    }

    @Override // b.d.a.b
    public void c() {
        super.c();
        this.j.a(true);
    }

    @Override // b.d.a.b
    public void b() {
        this.j.a(false);
        super.b();
    }

    @Override // b.d.a.b
    public void d() {
        super.d();
        this.j.a();
    }

    public void onCompletion(MediaPlayer mp) {
        a();
        this.j.a(false);
        MediaPlayer.OnCompletionListener onCompletionListener = this.n;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mp);
        }
    }

    public void onPrepared(MediaPlayer mp) {
        e();
        this.j.a(true);
        MediaPlayer.OnPreparedListener onPreparedListener = this.m;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(mp);
        }
    }
}
