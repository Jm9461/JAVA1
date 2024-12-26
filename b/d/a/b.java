package b.d.a;

import android.content.Context;
import android.media.MediaPlayer;
import b.d.a.j;
import java.util.Timer;
import java.util.TimerTask;

public abstract class b<TData> {

    /* renamed from: c  reason: collision with root package name */
    private int f۲۳۸۸c;

    /* renamed from: d  reason: collision with root package name */
    private j f۲۳۸۹d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f۲۳۹۰e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f۲۳۹۱f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f۲۳۹۲g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۲۳۹۳h;
    private Timer i;

    /* access modifiers changed from: protected */
    public abstract void a(TData tdata, int i2, float[] fArr, float[] fArr2);

    /* access modifiers changed from: package-private */
    public void a(j audioVisualization, int layersCount) {
        this.f۲۳۸۹d = audioVisualization;
        this.f۲۳۸۸c = layersCount;
        this.f۲۳۹۰e = new float[layersCount];
        this.f۲۳۹۱f = new float[layersCount];
        this.f۲۳۹۲g = new float[layersCount];
    }

    public final void a(TData data) {
        if (!this.f۲۳۹۳h) {
            a(data, this.f۲۳۸۸c, this.f۲۳۹۰e, this.f۲۳۹۱f);
            this.f۲۳۸۹d.a(this.f۲۳۹۰e, this.f۲۳۹۱f);
            e();
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        g();
        this.f۲۳۸۹d.a();
    }

    /* access modifiers changed from: protected */
    public final void f() {
        g();
        this.f۲۳۸۹d.b();
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.i == null) {
            this.i = new Timer("Stop Rendering Timer");
            this.i.scheduleAtFixedRate(new a(), 16, 16);
        }
        this.f۲۳۸۹d.a(new C۰۰۴۷b());
    }

    /* access modifiers changed from: package-private */
    public class a extends TimerTask {
        a() {
        }

        public void run() {
            if (b.this.f۲۳۸۹d != null) {
                b.this.f۲۳۸۹d.a(b.this.f۲۳۹۲g, b.this.f۲۳۹۲g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.d.a.b$b  reason: collision with other inner class name */
    public class C۰۰۴۷b implements j.a {
        C۰۰۴۷b() {
        }

        @Override // b.d.a.j.a
        public void a() {
            b.this.f();
        }
    }

    private void g() {
        Timer timer = this.i;
        if (timer != null) {
            timer.cancel();
            this.i.purge();
            this.i = null;
        }
    }

    public void c() {
    }

    public void b() {
    }

    public void d() {
        this.f۲۳۹۳h = true;
        this.f۲۳۹۰e = null;
        this.f۲۳۹۱f = null;
        this.f۲۳۸۹d = null;
    }

    public static class c {
        public static m a(Context context, MediaPlayer mediaPlayer) {
            return new m(context, mediaPlayer);
        }
    }
}
