package p۲۰۸b.p۲۲۰d.p۲۲۱a;

import android.content.Context;
import android.media.MediaPlayer;
import java.util.Timer;
import java.util.TimerTask;
import p۲۰۸b.p۲۲۰d.p۲۲۱a.InterfaceCj;

/* renamed from: b.d.a.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCb<TData> {

    /* renamed from: c, reason: contains not printable characters */
    private int f۱۲۶۰۶c;

    /* renamed from: d, reason: contains not printable characters */
    private InterfaceCj f۱۲۶۰۷d;

    /* renamed from: e, reason: contains not printable characters */
    private float[] f۱۲۶۰۸e;

    /* renamed from: f, reason: contains not printable characters */
    private float[] f۱۲۶۰۹f;

    /* renamed from: g, reason: contains not printable characters */
    private float[] f۱۲۶۱۰g;

    /* renamed from: h, reason: contains not printable characters */
    private boolean f۱۲۶۱۱h;

    /* renamed from: i, reason: contains not printable characters */
    private Timer f۱۲۶۱۲i;

    /* renamed from: a, reason: contains not printable characters */
    protected abstract void mo۱۴۵۸۹a(TData tdata, int i, float[] fArr, float[] fArr2);

    /* JADX WARN: Generic types in debug info not equals: b.d.a.b != com.cleveroad.audiovisualization.DbmHandler<TData> */
    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۸۵۹a(InterfaceCj audioVisualization, int layersCount) {
        this.f۱۲۶۰۷d = audioVisualization;
        this.f۱۲۶۰۶c = layersCount;
        this.f۱۲۶۰۸e = new float[layersCount];
        this.f۱۲۶۰۹f = new float[layersCount];
        this.f۱۲۶۱۰g = new float[layersCount];
    }

    /* JADX WARN: Generic types in debug info not equals: b.d.a.b != com.cleveroad.audiovisualization.DbmHandler<TData> */
    /* renamed from: a, reason: contains not printable characters */
    public final void m۱۳۸۶۰a(TData data) {
        if (this.f۱۲۶۱۱h) {
            return;
        }
        mo۱۴۵۸۹a(data, this.f۱۲۶۰۶c, this.f۱۲۶۰۸e, this.f۱۲۶۰۹f);
        this.f۱۲۶۰۷d.mo۱۳۹۲۹a(this.f۱۲۶۰۸e, this.f۱۲۶۰۹f);
        m۱۳۸۶۵e();
    }

    /* JADX WARN: Generic types in debug info not equals: b.d.a.b != com.cleveroad.audiovisualization.DbmHandler<TData> */
    /* renamed from: e, reason: contains not printable characters */
    protected final void m۱۳۸۶۵e() {
        m۱۳۸۵۷g();
        this.f۱۲۶۰۷d.mo۱۳۹۲۷a();
    }

    /* JADX WARN: Generic types in debug info not equals: b.d.a.b != com.cleveroad.audiovisualization.DbmHandler<TData> */
    /* renamed from: f, reason: contains not printable characters */
    protected final void m۱۳۸۶۶f() {
        m۱۳۸۵۷g();
        this.f۱۲۶۰۷d.mo۱۳۹۳۰b();
    }

    /* JADX WARN: Generic types in debug info not equals: b.d.a.b != com.cleveroad.audiovisualization.DbmHandler<TData> */
    /* renamed from: a, reason: contains not printable characters */
    protected final void m۱۳۸۵۸a() {
        if (this.f۱۲۶۱۲i == null) {
            this.f۱۲۶۱۲i = new Timer("Stop Rendering Timer");
            this.f۱۲۶۱۲i.scheduleAtFixedRate(new a(), 16L, 16L);
        }
        this.f۱۲۶۰۷d.mo۱۳۹۲۸a(new b());
    }

    /* renamed from: b.d.a.b$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (AbstractCb.this.f۱۲۶۰۷d != null) {
                AbstractCb.this.f۱۲۶۰۷d.mo۱۳۹۲۹a(AbstractCb.this.f۱۲۶۱۰g, AbstractCb.this.f۱۲۶۱۰g);
            }
        }
    }

    /* renamed from: b.d.a.b$b */
    class b implements InterfaceCj.a {
        b() {
        }

        @Override // p۲۰۸b.p۲۲۰d.p۲۲۱a.InterfaceCj.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۹۳۱a() {
            AbstractCb.this.m۱۳۸۶۶f();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: b.d.a.b != com.cleveroad.audiovisualization.DbmHandler<TData> */
    /* renamed from: g, reason: contains not printable characters */
    private void m۱۳۸۵۷g() {
        Timer timer = this.f۱۲۶۱۲i;
        if (timer != null) {
            timer.cancel();
            this.f۱۲۶۱۲i.purge();
            this.f۱۲۶۱۲i = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: b.d.a.b != com.cleveroad.audiovisualization.DbmHandler<TData> */
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۳۹۴۵c() {
    }

    /* JADX WARN: Generic types in debug info not equals: b.d.a.b != com.cleveroad.audiovisualization.DbmHandler<TData> */
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۹۴۴b() {
    }

    /* JADX WARN: Generic types in debug info not equals: b.d.a.b != com.cleveroad.audiovisualization.DbmHandler<TData> */
    /* renamed from: d, reason: contains not printable characters */
    public void mo۱۳۹۴۶d() {
        this.f۱۲۶۱۱h = true;
        this.f۱۲۶۰۸e = null;
        this.f۱۲۶۰۹f = null;
        this.f۱۲۶۰۷d = null;
    }

    /* renamed from: b.d.a.b$c */
    public static class c {
        /* renamed from: a, reason: contains not printable characters */
        public static Cm m۱۳۸۶۸a(Context context, MediaPlayer mediaPlayer) {
            return new Cm(context, mediaPlayer);
        }
    }
}
