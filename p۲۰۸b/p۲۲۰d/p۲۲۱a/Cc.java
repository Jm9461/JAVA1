package p۲۰۸b.p۲۲۰d.p۲۲۱a;

import android.content.Context;
import android.opengl.GLSurfaceView;
import p۲۰۸b.p۲۲۰d.p۲۲۱a.InterfaceCj;

/* renamed from: b.d.a.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc extends GLSurfaceView implements InterfaceCa, InterfaceCj {

    /* renamed from: c, reason: contains not printable characters */
    private final Cf f۱۲۶۱۵c;

    /* renamed from: d, reason: contains not printable characters */
    private AbstractCb<?> f۱۲۶۱۶d;

    /* renamed from: e, reason: contains not printable characters */
    private final e f۱۲۶۱۷e;

    /* renamed from: f, reason: contains not printable characters */
    private InterfaceCj.a f۱۲۶۱۸f;

    /* renamed from: b.d.a.c$b */
    public interface b extends GLSurfaceView.Renderer {
    }

    /* synthetic */ Cc(c x0, a x1) {
        this(x0);
    }

    private Cc(c builder) {
        super(builder.f۱۲۶۲۰c);
        this.f۱۲۶۱۷e = new e(builder, null);
        this.f۱۲۶۱۵c = new Cf(getContext(), this.f۱۲۶۱۷e);
        m۱۳۸۷۰d();
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۳۸۷۰d() {
        setEGLContextClientVersion(2);
        setRenderer(this.f۱۲۶۱۵c);
        this.f۱۲۶۱۵c.m۱۳۹۱۰a(new a());
    }

    /* renamed from: b.d.a.c$a */
    class a implements InterfaceCj.a {
        a() {
        }

        @Override // p۲۰۸b.p۲۲۰d.p۲۲۱a.InterfaceCj.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۹۳۱a() {
            Cc.this.mo۱۳۹۳۰b();
            if (Cc.this.f۱۲۶۱۸f != null) {
                Cc.this.f۱۲۶۱۸f.mo۱۳۹۳۱a();
            }
        }
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        AbstractCb<?> abstractCb = this.f۱۲۶۱۶d;
        if (abstractCb != null) {
            abstractCb.mo۱۳۹۴۵c();
        }
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        AbstractCb<?> abstractCb = this.f۱۲۶۱۶d;
        if (abstractCb != null) {
            abstractCb.mo۱۳۹۴۴b();
        }
        super.onPause();
    }

    /* JADX WARN: Generic types in debug info not equals: b.d.a.b != com.cleveroad.audiovisualization.DbmHandler<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public <T> void m۱۳۸۷۲a(AbstractCb<T> abstractCb) {
        AbstractCb<?> abstractCb2 = this.f۱۲۶۱۶d;
        if (abstractCb2 != null) {
            abstractCb2.mo۱۳۹۴۶d();
        }
        this.f۱۲۶۱۶d = abstractCb;
        this.f۱۲۶۱۶d.m۱۳۸۵۹a(this, this.f۱۲۶۱۷e.f۱۲۶۳۱b);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۳۸۷۶c() {
        AbstractCb<?> abstractCb = this.f۱۲۶۱۶d;
        if (abstractCb != null) {
            abstractCb.mo۱۳۹۴۶d();
            this.f۱۲۶۱۶d = null;
        }
    }

    @Override // p۲۰۸b.p۲۲۰d.p۲۲۱a.InterfaceCj
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۹۲۷a() {
        if (getRenderMode() != 1) {
            setRenderMode(1);
        }
    }

    @Override // p۲۰۸b.p۲۲۰d.p۲۲۱a.InterfaceCj
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۹۳۰b() {
        if (getRenderMode() != 0) {
            setRenderMode(0);
        }
    }

    @Override // p۲۰۸b.p۲۲۰d.p۲۲۱a.InterfaceCj
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۹۲۸a(InterfaceCj.a calmDownListener) {
        this.f۱۲۶۱۸f = calmDownListener;
    }

    @Override // p۲۰۸b.p۲۲۰d.p۲۲۱a.InterfaceCj
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۹۲۹a(float[] dBmArray, float[] ampsArray) {
        this.f۱۲۶۱۵c.m۱۳۹۱۱a(dBmArray, ampsArray);
    }

    /* renamed from: b.d.a.c$e */
    static class e {

        /* renamed from: a, reason: contains not printable characters */
        int f۱۲۶۳۰a;

        /* renamed from: b, reason: contains not printable characters */
        int f۱۲۶۳۱b;

        /* renamed from: c, reason: contains not printable characters */
        int f۱۲۶۳۲c;

        /* renamed from: d, reason: contains not printable characters */
        float f۱۲۶۳۳d;

        /* renamed from: e, reason: contains not printable characters */
        float f۱۲۶۳۴e;

        /* renamed from: f, reason: contains not printable characters */
        float f۱۲۶۳۵f;

        /* renamed from: g, reason: contains not printable characters */
        boolean f۱۲۶۳۶g;

        /* renamed from: h, reason: contains not printable characters */
        float[] f۱۲۶۳۷h;

        /* renamed from: i, reason: contains not printable characters */
        float[][] f۱۲۶۳۸i;

        /* synthetic */ e(c x0, a x1) {
            this(x0);
        }

        private e(c builder) {
            this.f۱۲۶۳۴e = builder.f۱۲۶۲۴g;
            this.f۱۲۶۳۴e = Cl.m۱۳۹۳۳a(this.f۱۲۶۳۴e, 10.0f, 1920.0f);
            this.f۱۲۶۳۰a = builder.f۱۲۶۲۱d;
            this.f۱۲۶۳۰a = Cl.m۱۳۹۳۷a(this.f۱۲۶۳۰a, 1, 16);
            this.f۱۲۶۳۸i = builder.m۱۳۹۰۳c();
            this.f۱۲۶۳۳d = builder.f۱۲۶۲۳f;
            this.f۱۲۶۳۳d = Cl.m۱۳۹۳۳a(this.f۱۲۶۳۳d, 10.0f, 200.0f);
            this.f۱۲۶۳۳d /= builder.f۱۲۶۲۰c.getResources().getDisplayMetrics().widthPixels;
            this.f۱۲۶۳۵f = builder.f۱۲۶۲۵h;
            this.f۱۲۶۳۵f = Cl.m۱۳۹۳۳a(this.f۱۲۶۳۵f, 20.0f, 1080.0f);
            this.f۱۲۶۳۶g = builder.f۱۲۶۲۶i;
            this.f۱۲۶۳۷h = builder.m۱۳۹۰۱a();
            this.f۱۲۶۳۱b = builder.f۱۲۶۲۲e;
            this.f۱۲۶۳۲c = builder.f۱۲۶۲۷j;
            Cl.m۱۳۹۳۷a(this.f۱۲۶۳۲c, 1, 36);
            this.f۱۲۶۳۱b = Cl.m۱۳۹۳۷a(this.f۱۲۶۳۱b, 1, 4);
            if (this.f۱۲۶۳۸i.length < this.f۱۲۶۳۱b) {
                throw new IllegalArgumentException("You specified more layers than colors.");
            }
        }
    }

    /* renamed from: b.d.a.c$d */
    public static class d<T extends d> {

        /* renamed from: a, reason: contains not printable characters */
        private float[] f۱۲۶۲۸a;

        /* renamed from: b, reason: contains not printable characters */
        private float[][] f۱۲۶۲۹b;

        /* renamed from: b, reason: contains not printable characters */
        protected T mo۱۳۹۰۲b() {
            throw null;
        }

        /* JADX WARN: Generic types in debug info not equals: b.d.a.c$d != com.cleveroad.audiovisualization.GLAudioVisualizationView$ColorsBuilder<T extends b.d.a.c$d> */
        public d(Context context) {
        }

        /* JADX WARN: Generic types in debug info not equals: b.d.a.c$d != com.cleveroad.audiovisualization.GLAudioVisualizationView$ColorsBuilder<T extends b.d.a.c$d> */
        /* renamed from: c, reason: contains not printable characters */
        float[][] m۱۳۹۰۳c() {
            return this.f۱۲۶۲۹b;
        }

        /* JADX WARN: Generic types in debug info not equals: b.d.a.c$d != com.cleveroad.audiovisualization.GLAudioVisualizationView$ColorsBuilder<T extends b.d.a.c$d> */
        /* renamed from: a, reason: contains not printable characters */
        float[] m۱۳۹۰۱a() {
            return this.f۱۲۶۲۸a;
        }

        /* JADX WARN: Generic types in debug info not equals: b.d.a.c$d != com.cleveroad.audiovisualization.GLAudioVisualizationView$ColorsBuilder<T extends b.d.a.c$d> */
        /* renamed from: a, reason: contains not printable characters */
        public T m۱۳۸۹۹a(int backgroundColor) {
            this.f۱۲۶۲۸a = Cl.m۱۳۹۳۹a(backgroundColor);
            return mo۱۳۹۰۲b();
        }

        /* JADX WARN: Generic types in debug info not equals: b.d.a.c$d != com.cleveroad.audiovisualization.GLAudioVisualizationView$ColorsBuilder<T extends b.d.a.c$d> */
        /* renamed from: a, reason: contains not printable characters */
        public T m۱۳۹۰۰a(int[] colors) {
            this.f۱۲۶۲۹b = new float[colors.length][];
            for (int i = 0; i < colors.length; i++) {
                this.f۱۲۶۲۹b[i] = Cl.m۱۳۹۳۹a(colors[i]);
            }
            return mo۱۳۹۰۲b();
        }
    }

    /* renamed from: b.d.a.c$c */
    public static class c extends d<c> {

        /* renamed from: c, reason: contains not printable characters */
        private Context f۱۲۶۲۰c;

        /* renamed from: d, reason: contains not printable characters */
        private int f۱۲۶۲۱d;

        /* renamed from: e, reason: contains not printable characters */
        private int f۱۲۶۲۲e;

        /* renamed from: f, reason: contains not printable characters */
        private float f۱۲۶۲۳f;

        /* renamed from: g, reason: contains not printable characters */
        private float f۱۲۶۲۴g;

        /* renamed from: h, reason: contains not printable characters */
        private float f۱۲۶۲۵h;

        /* renamed from: i, reason: contains not printable characters */
        private boolean f۱۲۶۲۶i;

        /* renamed from: j, reason: contains not printable characters */
        private int f۱۲۶۲۷j;

        @Override // p۲۰۸b.p۲۲۰d.p۲۲۱a.Cc.d
        /* renamed from: b, reason: contains not printable characters */
        protected /* bridge */ /* synthetic */ c mo۱۳۹۰۲b() {
            mo۱۳۹۰۲b();
            return this;
        }

        public c(Context context) {
            super(context);
            this.f۱۲۶۲۰c = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p۲۰۸b.p۲۲۰d.p۲۲۱a.Cc.d
        /* renamed from: b, reason: contains not printable characters */
        protected c mo۱۳۹۰۲b() {
            return this;
        }

        /* renamed from: e, reason: contains not printable characters */
        public c m۱۳۸۹۶e(int wavesCount) {
            this.f۱۲۶۲۱d = wavesCount;
            return this;
        }

        /* renamed from: d, reason: contains not printable characters */
        public c m۱۳۸۹۴d(int layersCount) {
            this.f۱۲۶۲۲e = layersCount;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public c m۱۳۸۸۶a(float bubbleSize) {
            this.f۱۲۶۲۳f = bubbleSize;
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public c m۱۳۸۹۳c(int bubbleSize) {
            m۱۳۸۸۶a(this.f۱۲۶۲۰c.getResources().getDimensionPixelSize(bubbleSize));
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public c m۱۳۸۹۲c(float waveHeight) {
            this.f۱۲۶۲۴g = waveHeight;
            return this;
        }

        /* renamed from: g, reason: contains not printable characters */
        public c m۱۳۸۹۸g(int waveHeight) {
            m۱۳۸۹۲c(this.f۱۲۶۲۰c.getResources().getDimensionPixelSize(waveHeight));
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public c m۱۳۸۸۹b(float footerHeight) {
            this.f۱۲۶۲۵h = footerHeight;
            return this;
        }

        /* renamed from: f, reason: contains not printable characters */
        public c m۱۳۸۹۷f(int footerHeight) {
            m۱۳۸۸۹b(this.f۱۲۶۲۰c.getResources().getDimensionPixelSize(footerHeight));
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public c m۱۳۸۸۷a(boolean randomizeBubbleSize) {
            this.f۱۲۶۲۶i = randomizeBubbleSize;
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public c m۱۳۸۹۰b(int bubblesPerLayer) {
            this.f۱۲۶۲۷j = bubblesPerLayer;
            return this;
        }

        /* renamed from: d, reason: contains not printable characters */
        public Cc m۱۳۸۹۵d() {
            return new Cc(this, null);
        }
    }
}
