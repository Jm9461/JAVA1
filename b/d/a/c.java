package b.d.a;

import android.content.Context;
import android.opengl.GLSurfaceView;
import b.d.a.j;

public class c extends GLSurfaceView implements a, j {

    /* renamed from: c  reason: collision with root package name */
    private final f f۲۳۹۶c;

    /* renamed from: d  reason: collision with root package name */
    private b<?> f۲۳۹۷d;

    /* renamed from: e  reason: collision with root package name */
    private final e f۲۳۹۸e;

    /* renamed from: f  reason: collision with root package name */
    private j.a f۲۳۹۹f;

    public interface b extends GLSurfaceView.Renderer {
    }

    /* synthetic */ c(C۰۰۴۸c x0, a x1) {
        this(x0);
    }

    private c(C۰۰۴۸c builder) {
        super(builder.f۲۴۰۱c);
        this.f۲۳۹۸e = new e(builder, null);
        this.f۲۳۹۶c = new f(getContext(), this.f۲۳۹۸e);
        d();
    }

    private void d() {
        setEGLContextClientVersion(2);
        setRenderer(this.f۲۳۹۶c);
        this.f۲۳۹۶c.a(new a());
    }

    /* access modifiers changed from: package-private */
    public class a implements j.a {
        a() {
        }

        @Override // b.d.a.j.a
        public void a() {
            c.this.b();
            if (c.this.f۲۳۹۹f != null) {
                c.this.f۲۳۹۹f.a();
            }
        }
    }

    public void onResume() {
        super.onResume();
        b<?> bVar = this.f۲۳۹۷d;
        if (bVar != null) {
            bVar.c();
        }
    }

    public void onPause() {
        b<?> bVar = this.f۲۳۹۷d;
        if (bVar != null) {
            bVar.b();
        }
        super.onPause();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: b.d.a.b<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> void a(b<T> bVar) {
        b<?> bVar2 = this.f۲۳۹۷d;
        if (bVar2 != null) {
            bVar2.d();
        }
        this.f۲۳۹۷d = bVar;
        this.f۲۳۹۷d.a(this, this.f۲۳۹۸e.f۲۴۱۰b);
    }

    public void c() {
        b<?> bVar = this.f۲۳۹۷d;
        if (bVar != null) {
            bVar.d();
            this.f۲۳۹۷d = null;
        }
    }

    @Override // b.d.a.j
    public void a() {
        if (getRenderMode() != 1) {
            setRenderMode(1);
        }
    }

    @Override // b.d.a.j
    public void b() {
        if (getRenderMode() != 0) {
            setRenderMode(0);
        }
    }

    @Override // b.d.a.j
    public void a(j.a calmDownListener) {
        this.f۲۳۹۹f = calmDownListener;
    }

    @Override // b.d.a.j
    public void a(float[] dBmArray, float[] ampsArray) {
        this.f۲۳۹۶c.a(dBmArray, ampsArray);
    }

    /* access modifiers changed from: package-private */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        int f۲۴۰۹a;

        /* renamed from: b  reason: collision with root package name */
        int f۲۴۱۰b;

        /* renamed from: c  reason: collision with root package name */
        int f۲۴۱۱c;

        /* renamed from: d  reason: collision with root package name */
        float f۲۴۱۲d;

        /* renamed from: e  reason: collision with root package name */
        float f۲۴۱۳e;

        /* renamed from: f  reason: collision with root package name */
        float f۲۴۱۴f;

        /* renamed from: g  reason: collision with root package name */
        boolean f۲۴۱۵g;

        /* renamed from: h  reason: collision with root package name */
        float[] f۲۴۱۶h;
        float[][] i;

        /* synthetic */ e(C۰۰۴۸c x0, a x1) {
            this(x0);
        }

        private e(C۰۰۴۸c builder) {
            this.f۲۴۱۳e = builder.f۲۴۰۵g;
            this.f۲۴۱۳e = l.a(this.f۲۴۱۳e, 10.0f, 1920.0f);
            this.f۲۴۰۹a = builder.f۲۴۰۲d;
            this.f۲۴۰۹a = l.a(this.f۲۴۰۹a, 1, 16);
            this.i = builder.c();
            this.f۲۴۱۲d = builder.f۲۴۰۴f;
            this.f۲۴۱۲d = l.a(this.f۲۴۱۲d, 10.0f, 200.0f);
            this.f۲۴۱۲d /= (float) builder.f۲۴۰۱c.getResources().getDisplayMetrics().widthPixels;
            this.f۲۴۱۴f = builder.f۲۴۰۶h;
            this.f۲۴۱۴f = l.a(this.f۲۴۱۴f, 20.0f, 1080.0f);
            this.f۲۴۱۵g = builder.i;
            this.f۲۴۱۶h = builder.a();
            this.f۲۴۱۰b = builder.f۲۴۰۳e;
            this.f۲۴۱۱c = builder.j;
            l.a(this.f۲۴۱۱c, 1, 36);
            this.f۲۴۱۰b = l.a(this.f۲۴۱۰b, 1, 4);
            if (this.i.length < this.f۲۴۱۰b) {
                throw new IllegalArgumentException("You specified more layers than colors.");
            }
        }
    }

    public static class d<T extends d> {

        /* renamed from: a  reason: collision with root package name */
        private float[] f۲۴۰۷a;

        /* renamed from: b  reason: collision with root package name */
        private float[][] f۲۴۰۸b;

        /* access modifiers changed from: protected */
        public T b() {
            throw null;
        }

        public d(Context context) {
        }

        /* access modifiers changed from: package-private */
        public float[][] c() {
            return this.f۲۴۰۸b;
        }

        /* access modifiers changed from: package-private */
        public float[] a() {
            return this.f۲۴۰۷a;
        }

        public T a(int backgroundColor) {
            this.f۲۴۰۷a = l.a(backgroundColor);
            return b();
        }

        public T a(int[] colors) {
            this.f۲۴۰۸b = new float[colors.length][];
            for (int i = 0; i < colors.length; i++) {
                this.f۲۴۰۸b[i] = l.a(colors[i]);
            }
            return b();
        }
    }

    /* renamed from: b.d.a.c$c  reason: collision with other inner class name */
    public static class C۰۰۴۸c extends d<C۰۰۴۸c> {

        /* renamed from: c  reason: collision with root package name */
        private Context f۲۴۰۱c;

        /* renamed from: d  reason: collision with root package name */
        private int f۲۴۰۲d;

        /* renamed from: e  reason: collision with root package name */
        private int f۲۴۰۳e;

        /* renamed from: f  reason: collision with root package name */
        private float f۲۴۰۴f;

        /* renamed from: g  reason: collision with root package name */
        private float f۲۴۰۵g;

        /* renamed from: h  reason: collision with root package name */
        private float f۲۴۰۶h;
        private boolean i;
        private int j;

        public C۰۰۴۸c(Context context) {
            super(context);
            this.f۲۴۰۱c = context;
        }

        /* access modifiers changed from: protected */
        @Override // b.d.a.c.d
        public C۰۰۴۸c b() {
            return this;
        }

        public C۰۰۴۸c e(int wavesCount) {
            this.f۲۴۰۲d = wavesCount;
            return this;
        }

        public C۰۰۴۸c d(int layersCount) {
            this.f۲۴۰۳e = layersCount;
            return this;
        }

        public C۰۰۴۸c a(float bubbleSize) {
            this.f۲۴۰۴f = bubbleSize;
            return this;
        }

        public C۰۰۴۸c c(int bubbleSize) {
            a((float) this.f۲۴۰۱c.getResources().getDimensionPixelSize(bubbleSize));
            return this;
        }

        public C۰۰۴۸c c(float waveHeight) {
            this.f۲۴۰۵g = waveHeight;
            return this;
        }

        public C۰۰۴۸c g(int waveHeight) {
            c((float) this.f۲۴۰۱c.getResources().getDimensionPixelSize(waveHeight));
            return this;
        }

        public C۰۰۴۸c b(float footerHeight) {
            this.f۲۴۰۶h = footerHeight;
            return this;
        }

        public C۰۰۴۸c f(int footerHeight) {
            b((float) this.f۲۴۰۱c.getResources().getDimensionPixelSize(footerHeight));
            return this;
        }

        public C۰۰۴۸c a(boolean randomizeBubbleSize) {
            this.i = randomizeBubbleSize;
            return this;
        }

        public C۰۰۴۸c b(int bubblesPerLayer) {
            this.j = bubblesPerLayer;
            return this;
        }

        public c d() {
            return new c(this, null);
        }
    }
}
