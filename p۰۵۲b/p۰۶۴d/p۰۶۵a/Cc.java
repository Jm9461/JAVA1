package p۰۵۲b.p۰۶۴d.p۰۶۵a;

import android.content.Context;
import android.opengl.GLSurfaceView;
import p۰۵۲b.p۰۶۴d.p۰۶۵a.AbstractCj;

/* renamed from: b.d.a.c  reason: invalid class name */
public class Cc extends GLSurfaceView implements AbstractCa, AbstractCj {

    /* renamed from: c  reason: contains not printable characters */
    private final Cf f۱۲۶۱۵c;

    /* renamed from: d  reason: contains not printable characters */
    private AbstractCb<?> f۱۲۶۱۶d;

    /* renamed from: e  reason: contains not printable characters */
    private final Ce f۱۲۶۱۷e;

    /* renamed from: f  reason: contains not printable characters */
    private AbstractCj.AbstractCa f۱۲۶۱۸f;

    /* renamed from: b.d.a.c$b  reason: invalid class name */
    public interface AbstractCb extends GLSurfaceView.Renderer {
    }

    /* synthetic */ Cc(Cc x0, Ca x1) {
        this(x0);
    }

    private Cc(Cc builder) {
        super(builder.f۱۲۶۲۰c);
        this.f۱۲۶۱۷e = new Ce(builder, null);
        this.f۱۲۶۱۵c = new Cf(getContext(), this.f۱۲۶۱۷e);
        m۱۵۹۴۰d();
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۵۹۴۰d() {
        setEGLContextClientVersion(2);
        setRenderer(this.f۱۲۶۱۵c);
        this.f۱۲۶۱۵c.m۱۵۹۸۰a(new Ca());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.d.a.c$a  reason: invalid class name */
    public class Ca implements AbstractCj.AbstractCa {
        Ca() {
        }

        @Override // p۰۵۲b.p۰۶۴d.p۰۶۵a.AbstractCj.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۹۴۷a() {
            Cc.this.m۱۵۹۴۵b();
            if (Cc.this.f۱۲۶۱۸f != null) {
                Cc.this.f۱۲۶۱۸f.m۱۶۰۰۱a();
            }
        }
    }

    public void onResume() {
        super.onResume();
        AbstractCb<?> bVar = this.f۱۲۶۱۶d;
        if (bVar != null) {
            bVar.m۱۵۹۳۳c();
        }
    }

    public void onPause() {
        AbstractCb<?> bVar = this.f۱۲۶۱۶d;
        if (bVar != null) {
            bVar.m۱۵۹۳۲b();
        }
        super.onPause();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: b.d.a.b<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a  reason: contains not printable characters */
    public <T> void m۱۵۹۴۲a(AbstractCb<T> bVar) {
        AbstractCb<?> bVar2 = this.f۱۲۶۱۶d;
        if (bVar2 != null) {
            bVar2.m۱۵۹۳۴d();
        }
        this.f۱۲۶۱۶d = bVar;
        this.f۱۲۶۱۶d.m۱۵۹۲۹a(this, this.f۱۲۶۱۷e.f۱۲۶۳۱b);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۹۴۶c() {
        AbstractCb<?> bVar = this.f۱۲۶۱۶d;
        if (bVar != null) {
            bVar.m۱۵۹۳۴d();
            this.f۱۲۶۱۶d = null;
        }
    }

    @Override // p۰۵۲b.p۰۶۴d.p۰۶۵a.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۹۴۱a() {
        if (getRenderMode() != 1) {
            setRenderMode(1);
        }
    }

    @Override // p۰۵۲b.p۰۶۴d.p۰۶۵a.AbstractCj
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۹۴۵b() {
        if (getRenderMode() != 0) {
            setRenderMode(0);
        }
    }

    @Override // p۰۵۲b.p۰۶۴d.p۰۶۵a.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۹۴۳a(AbstractCj.AbstractCa calmDownListener) {
        this.f۱۲۶۱۸f = calmDownListener;
    }

    @Override // p۰۵۲b.p۰۶۴d.p۰۶۵a.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۹۴۴a(float[] dBmArray, float[] ampsArray) {
        this.f۱۲۶۱۵c.m۱۵۹۸۱a(dBmArray, ampsArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.d.a.c$e  reason: invalid class name */
    public static class Ce {

        /* renamed from: a  reason: contains not printable characters */
        int f۱۲۶۳۰a;

        /* renamed from: b  reason: contains not printable characters */
        int f۱۲۶۳۱b;

        /* renamed from: c  reason: contains not printable characters */
        int f۱۲۶۳۲c;

        /* renamed from: d  reason: contains not printable characters */
        float f۱۲۶۳۳d;

        /* renamed from: e  reason: contains not printable characters */
        float f۱۲۶۳۴e;

        /* renamed from: f  reason: contains not printable characters */
        float f۱۲۶۳۵f;

        /* renamed from: g  reason: contains not printable characters */
        boolean f۱۲۶۳۶g;

        /* renamed from: h  reason: contains not printable characters */
        float[] f۱۲۶۳۷h;

        /* renamed from: i  reason: contains not printable characters */
        float[][] f۱۲۶۳۸i;

        /* synthetic */ Ce(Cc x0, Ca x1) {
            this(x0);
        }

        private Ce(Cc builder) {
            this.f۱۲۶۳۴e = builder.f۱۲۶۲۴g;
            this.f۱۲۶۳۴e = Cl.m۱۶۰۰۳a(this.f۱۲۶۳۴e, 10.0f, 1920.0f);
            this.f۱۲۶۳۰a = builder.f۱۲۶۲۱d;
            this.f۱۲۶۳۰a = Cl.m۱۶۰۰۷a(this.f۱۲۶۳۰a, 1, 16);
            this.f۱۲۶۳۸i = builder.m۱۵۹۷۳c();
            this.f۱۲۶۳۳d = builder.f۱۲۶۲۳f;
            this.f۱۲۶۳۳d = Cl.m۱۶۰۰۳a(this.f۱۲۶۳۳d, 10.0f, 200.0f);
            this.f۱۲۶۳۳d /= (float) builder.f۱۲۶۲۰c.getResources().getDisplayMetrics().widthPixels;
            this.f۱۲۶۳۵f = builder.f۱۲۶۲۵h;
            this.f۱۲۶۳۵f = Cl.m۱۶۰۰۳a(this.f۱۲۶۳۵f, 20.0f, 1080.0f);
            this.f۱۲۶۳۶g = builder.f۱۲۶۲۶i;
            this.f۱۲۶۳۷h = builder.m۱۵۹۷۱a();
            this.f۱۲۶۳۱b = builder.f۱۲۶۲۲e;
            this.f۱۲۶۳۲c = builder.f۱۲۶۲۷j;
            Cl.m۱۶۰۰۷a(this.f۱۲۶۳۲c, 1, 36);
            this.f۱۲۶۳۱b = Cl.m۱۶۰۰۷a(this.f۱۲۶۳۱b, 1, 4);
            if (this.f۱۲۶۳۸i.length < this.f۱۲۶۳۱b) {
                throw new IllegalArgumentException("You specified more layers than colors.");
            }
        }
    }

    /* renamed from: b.d.a.c$d  reason: invalid class name */
    public static class Cd<T extends Cd> {

        /* renamed from: a  reason: contains not printable characters */
        private float[] f۱۲۶۲۸a;

        /* renamed from: b  reason: contains not printable characters */
        private float[][] f۱۲۶۲۹b;

        /* access modifiers changed from: protected */
        /* renamed from: b  reason: contains not printable characters */
        public T m۱۵۹۷۲b() {
            throw null;
        }

        public Cd(Context context) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public float[][] m۱۵۹۷۳c() {
            return this.f۱۲۶۲۹b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public float[] m۱۵۹۷۱a() {
            return this.f۱۲۶۲۸a;
        }

        /* renamed from: a  reason: contains not printable characters */
        public T m۱۵۹۶۹a(int backgroundColor) {
            this.f۱۲۶۲۸a = Cl.m۱۶۰۰۹a(backgroundColor);
            return m۱۵۹۷۲b();
        }

        /* renamed from: a  reason: contains not printable characters */
        public T m۱۵۹۷۰a(int[] colors) {
            this.f۱۲۶۲۹b = new float[colors.length][];
            for (int i = 0; i < colors.length; i++) {
                this.f۱۲۶۲۹b[i] = Cl.m۱۶۰۰۹a(colors[i]);
            }
            return m۱۵۹۷۲b();
        }
    }

    /* renamed from: b.d.a.c$c  reason: invalid class name */
    public static class Cc extends Cd<Cc> {

        /* renamed from: c  reason: contains not printable characters */
        private Context f۱۲۶۲۰c;

        /* renamed from: d  reason: contains not printable characters */
        private int f۱۲۶۲۱d;

        /* renamed from: e  reason: contains not printable characters */
        private int f۱۲۶۲۲e;

        /* renamed from: f  reason: contains not printable characters */
        private float f۱۲۶۲۳f;

        /* renamed from: g  reason: contains not printable characters */
        private float f۱۲۶۲۴g;

        /* renamed from: h  reason: contains not printable characters */
        private float f۱۲۶۲۵h;

        /* renamed from: i  reason: contains not printable characters */
        private boolean f۱۲۶۲۶i;

        /* renamed from: j  reason: contains not printable characters */
        private int f۱۲۶۲۷j;

        public Cc(Context context) {
            super(context);
            this.f۱۲۶۲۰c = context;
        }

        /* access modifiers changed from: protected */
        @Override // p۰۵۲b.p۰۶۴d.p۰۶۵a.Cc.Cd
        /* renamed from: b  reason: contains not printable characters */
        public Cc m۱۵۹۵۸b() {
            return this;
        }

        /* renamed from: e  reason: contains not printable characters */
        public Cc m۱۵۹۶۶e(int wavesCount) {
            this.f۱۲۶۲۱d = wavesCount;
            return this;
        }

        /* renamed from: d  reason: contains not printable characters */
        public Cc m۱۵۹۶۴d(int layersCount) {
            this.f۱۲۶۲۲e = layersCount;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۵۹۵۶a(float bubbleSize) {
            this.f۱۲۶۲۳f = bubbleSize;
            return this;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Cc m۱۵۹۶۳c(int bubbleSize) {
            m۱۵۹۵۶a((float) this.f۱۲۶۲۰c.getResources().getDimensionPixelSize(bubbleSize));
            return this;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Cc m۱۵۹۶۲c(float waveHeight) {
            this.f۱۲۶۲۴g = waveHeight;
            return this;
        }

        /* renamed from: g  reason: contains not printable characters */
        public Cc m۱۵۹۶۸g(int waveHeight) {
            m۱۵۹۶۲c((float) this.f۱۲۶۲۰c.getResources().getDimensionPixelSize(waveHeight));
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cc m۱۵۹۵۹b(float footerHeight) {
            this.f۱۲۶۲۵h = footerHeight;
            return this;
        }

        /* renamed from: f  reason: contains not printable characters */
        public Cc m۱۵۹۶۷f(int footerHeight) {
            m۱۵۹۵۹b((float) this.f۱۲۶۲۰c.getResources().getDimensionPixelSize(footerHeight));
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۵۹۵۷a(boolean randomizeBubbleSize) {
            this.f۱۲۶۲۶i = randomizeBubbleSize;
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cc m۱۵۹۶۰b(int bubblesPerLayer) {
            this.f۱۲۶۲۷j = bubblesPerLayer;
            return this;
        }

        /* renamed from: d  reason: contains not printable characters */
        public Cc m۱۵۹۶۵d() {
            return new Cc(this, null);
        }
    }
}
