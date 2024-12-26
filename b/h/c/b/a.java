package b.h.c.b;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class a extends Animation {
    public static final boolean s = (Integer.valueOf(Build.VERSION.SDK).intValue() < 11);
    private static final WeakHashMap<View, a> t = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<View> f۲۵۷۵c;

    /* renamed from: d  reason: collision with root package name */
    private final Camera f۲۵۷۶d = new Camera();

    /* renamed from: e  reason: collision with root package name */
    private boolean f۲۵۷۷e;

    /* renamed from: f  reason: collision with root package name */
    private float f۲۵۷۸f = 1.0f;

    /* renamed from: g  reason: collision with root package name */
    private float f۲۵۷۹g;

    /* renamed from: h  reason: collision with root package name */
    private float f۲۵۸۰h;
    private float i;
    private float j;
    private float k;
    private float l = 1.0f;
    private float m = 1.0f;
    private float n;
    private float o;
    private final RectF p = new RectF();
    private final RectF q = new RectF();
    private final Matrix r = new Matrix();

    public static a a(View view) {
        a proxy = t.get(view);
        if (proxy != null && proxy == view.getAnimation()) {
            return proxy;
        }
        a proxy2 = new a(view);
        t.put(view, proxy2);
        return proxy2;
    }

    private a(View view) {
        setDuration(0);
        setFillAfter(true);
        view.setAnimation(this);
        this.f۲۵۷۵c = new WeakReference<>(view);
    }

    public float a() {
        return this.f۲۵۷۸f;
    }

    public void a(float alpha) {
        if (this.f۲۵۷۸f != alpha) {
            this.f۲۵۷۸f = alpha;
            View view = this.f۲۵۷۵c.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public float b() {
        return this.f۲۵۷۹g;
    }

    public void b(float pivotX) {
        if (!this.f۲۵۷۷e || this.f۲۵۷۹g != pivotX) {
            q();
            this.f۲۵۷۷e = true;
            this.f۲۵۷۹g = pivotX;
            p();
        }
    }

    public float c() {
        return this.f۲۵۸۰h;
    }

    public void c(float pivotY) {
        if (!this.f۲۵۷۷e || this.f۲۵۸۰h != pivotY) {
            q();
            this.f۲۵۷۷e = true;
            this.f۲۵۸۰h = pivotY;
            p();
        }
    }

    public float d() {
        return this.k;
    }

    public void d(float rotation) {
        if (this.k != rotation) {
            q();
            this.k = rotation;
            p();
        }
    }

    public float e() {
        return this.i;
    }

    public void e(float rotationX) {
        if (this.i != rotationX) {
            q();
            this.i = rotationX;
            p();
        }
    }

    public float f() {
        return this.j;
    }

    public void f(float rotationY) {
        if (this.j != rotationY) {
            q();
            this.j = rotationY;
            p();
        }
    }

    public float g() {
        return this.l;
    }

    public void g(float scaleX) {
        if (this.l != scaleX) {
            q();
            this.l = scaleX;
            p();
        }
    }

    public float h() {
        return this.m;
    }

    public void h(float scaleY) {
        if (this.m != scaleY) {
            q();
            this.m = scaleY;
            p();
        }
    }

    public int i() {
        View view = this.f۲۵۷۵c.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    public int j() {
        View view = this.f۲۵۷۵c.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    public float k() {
        return this.n;
    }

    public void i(float translationX) {
        if (this.n != translationX) {
            q();
            this.n = translationX;
            p();
        }
    }

    public float m() {
        return this.o;
    }

    public void j(float translationY) {
        if (this.o != translationY) {
            q();
            this.o = translationY;
            p();
        }
    }

    public float n() {
        View view = this.f۲۵۷۵c.get();
        if (view == null) {
            return 0.0f;
        }
        return ((float) view.getLeft()) + this.n;
    }

    public void k(float x) {
        View view = this.f۲۵۷۵c.get();
        if (view != null) {
            i(x - ((float) view.getLeft()));
        }
    }

    public float o() {
        View view = this.f۲۵۷۵c.get();
        if (view == null) {
            return 0.0f;
        }
        return ((float) view.getTop()) + this.o;
    }

    public void l(float y) {
        View view = this.f۲۵۷۵c.get();
        if (view != null) {
            j(y - ((float) view.getTop()));
        }
    }

    private void q() {
        View view = this.f۲۵۷۵c.get();
        if (view != null) {
            a(this.p, view);
        }
    }

    private void p() {
        View view = this.f۲۵۷۵c.get();
        if (view != null && view.getParent() != null) {
            RectF after = this.q;
            a(after, view);
            after.union(this.p);
            ((View) view.getParent()).invalidate((int) Math.floor((double) after.left), (int) Math.floor((double) after.top), (int) Math.ceil((double) after.right), (int) Math.ceil((double) after.bottom));
        }
    }

    private void a(RectF r2, View view) {
        r2.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        Matrix m2 = this.r;
        m2.reset();
        a(m2, view);
        this.r.mapRect(r2);
        r2.offset((float) view.getLeft(), (float) view.getTop());
        float f2 = r2.right;
        float f3 = r2.left;
        if (f2 < f3) {
            float f4 = r2.right;
            r2.right = f3;
            r2.left = f4;
        }
        float f5 = r2.bottom;
        if (f5 < r2.top) {
            float f6 = r2.top;
            r2.top = f5;
            r2.bottom = f6;
        }
    }

    /* JADX INFO: Multiple debug info for r8v1 float: [D('camera' android.graphics.Camera), D('sX' float)] */
    private void a(Matrix m2, View view) {
        float w = (float) view.getWidth();
        float h2 = (float) view.getHeight();
        boolean hasPivot = this.f۲۵۷۷e;
        float pX = hasPivot ? this.f۲۵۷۹g : w / 2.0f;
        float pY = hasPivot ? this.f۲۵۸۰h : h2 / 2.0f;
        float rX = this.i;
        float rY = this.j;
        float rZ = this.k;
        if (!(rX == 0.0f && rY == 0.0f && rZ == 0.0f)) {
            Camera camera = this.f۲۵۷۶d;
            camera.save();
            camera.rotateX(rX);
            camera.rotateY(rY);
            camera.rotateZ(-rZ);
            camera.getMatrix(m2);
            camera.restore();
            m2.preTranslate(-pX, -pY);
            m2.postTranslate(pX, pY);
        }
        float sX = this.l;
        float sY = this.m;
        if (!(sX == 1.0f && sY == 1.0f)) {
            m2.postScale(sX, sY);
            m2.postTranslate((-(pX / w)) * ((sX * w) - w), (-(pY / h2)) * ((sY * h2) - h2));
        }
        m2.postTranslate(this.n, this.o);
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float interpolatedTime, Transformation t2) {
        View view = this.f۲۵۷۵c.get();
        if (view != null) {
            t2.setAlpha(this.f۲۵۷۸f);
            a(t2.getMatrix(), view);
        }
    }
}
