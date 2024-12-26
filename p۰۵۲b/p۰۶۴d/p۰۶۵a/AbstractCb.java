package p۰۵۲b.p۰۶۴d.p۰۶۵a;

import android.content.Context;
import android.media.MediaPlayer;
import java.util.Timer;
import java.util.TimerTask;
import p۰۵۲b.p۰۶۴d.p۰۶۵a.AbstractCj;

/* renamed from: b.d.a.b  reason: invalid class name */
public abstract class AbstractCb<TData> {

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۲۶۰۶c;

    /* renamed from: d  reason: contains not printable characters */
    private AbstractCj f۱۲۶۰۷d;

    /* renamed from: e  reason: contains not printable characters */
    private float[] f۱۲۶۰۸e;

    /* renamed from: f  reason: contains not printable characters */
    private float[] f۱۲۶۰۹f;

    /* renamed from: g  reason: contains not printable characters */
    private float[] f۱۲۶۱۰g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۲۶۱۱h;

    /* renamed from: i  reason: contains not printable characters */
    private Timer f۱۲۶۱۲i;

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۵۹۳۱a(TData tdata, int i, float[] fArr, float[] fArr2);

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۹۲۹a(AbstractCj audioVisualization, int layersCount) {
        this.f۱۲۶۰۷d = audioVisualization;
        this.f۱۲۶۰۶c = layersCount;
        this.f۱۲۶۰۸e = new float[layersCount];
        this.f۱۲۶۰۹f = new float[layersCount];
        this.f۱۲۶۱۰g = new float[layersCount];
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۵۹۳۰a(TData data) {
        if (!this.f۱۲۶۱۱h) {
            m۱۵۹۳۱a(data, this.f۱۲۶۰۶c, this.f۱۲۶۰۸e, this.f۱۲۶۰۹f);
            this.f۱۲۶۰۷d.m۱۵۹۹۹a(this.f۱۲۶۰۸e, this.f۱۲۶۰۹f);
            m۱۵۹۳۵e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e  reason: contains not printable characters */
    public final void m۱۵۹۳۵e() {
        m۱۵۹۲۷g();
        this.f۱۲۶۰۷d.m۱۵۹۹۷a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f  reason: contains not printable characters */
    public final void m۱۵۹۳۶f() {
        m۱۵۹۲۷g();
        this.f۱۲۶۰۷d.m۱۶۰۰۰b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۵۹۲۸a() {
        if (this.f۱۲۶۱۲i == null) {
            this.f۱۲۶۱۲i = new Timer("Stop Rendering Timer");
            this.f۱۲۶۱۲i.scheduleAtFixedRate(new Ca(), 16, 16);
        }
        this.f۱۲۶۰۷d.m۱۵۹۹۸a(new Cb());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.d.a.b$a  reason: invalid class name */
    public class Ca extends TimerTask {
        Ca() {
        }

        public void run() {
            if (AbstractCb.this.f۱۲۶۰۷d != null) {
                AbstractCb.this.f۱۲۶۰۷d.m۱۵۹۹۹a(AbstractCb.this.f۱۲۶۱۰g, AbstractCb.this.f۱۲۶۱۰g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.d.a.b$b  reason: invalid class name */
    public class Cb implements AbstractCj.AbstractCa {
        Cb() {
        }

        @Override // p۰۵۲b.p۰۶۴d.p۰۶۵a.AbstractCj.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۹۳۷a() {
            AbstractCb.this.m۱۵۹۳۶f();
        }
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۵۹۲۷g() {
        Timer timer = this.f۱۲۶۱۲i;
        if (timer != null) {
            timer.cancel();
            this.f۱۲۶۱۲i.purge();
            this.f۱۲۶۱۲i = null;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۹۳۳c() {
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۹۳۲b() {
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۵۹۳۴d() {
        this.f۱۲۶۱۱h = true;
        this.f۱۲۶۰۸e = null;
        this.f۱۲۶۰۹f = null;
        this.f۱۲۶۰۷d = null;
    }

    /* renamed from: b.d.a.b$c  reason: invalid class name */
    public static class Cc {
        /* renamed from: a  reason: contains not printable characters */
        public static Cm m۱۵۹۳۸a(Context context, MediaPlayer mediaPlayer) {
            return new Cm(context, mediaPlayer);
        }
    }
}
