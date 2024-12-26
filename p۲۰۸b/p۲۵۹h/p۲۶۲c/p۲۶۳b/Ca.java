package p۲۰۸b.p۲۵۹h.p۲۶۲c.p۲۶۳b;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: b.h.c.b.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca extends Animation {

    /* renamed from: s, reason: contains not printable characters */
    public static final boolean f۱۲۹۶۶s;

    /* renamed from: t, reason: contains not printable characters */
    private static final WeakHashMap<View, Ca> f۱۲۹۶۷t;

    /* renamed from: c, reason: contains not printable characters */
    private final WeakReference<View> f۱۲۹۶۸c;

    /* renamed from: e, reason: contains not printable characters */
    private boolean f۱۲۹۷۰e;

    /* renamed from: g, reason: contains not printable characters */
    private float f۱۲۹۷۲g;

    /* renamed from: h, reason: contains not printable characters */
    private float f۱۲۹۷۳h;

    /* renamed from: i, reason: contains not printable characters */
    private float f۱۲۹۷۴i;

    /* renamed from: j, reason: contains not printable characters */
    private float f۱۲۹۷۵j;

    /* renamed from: k, reason: contains not printable characters */
    private float f۱۲۹۷۶k;

    /* renamed from: n, reason: contains not printable characters */
    private float f۱۲۹۷۹n;

    /* renamed from: o, reason: contains not printable characters */
    private float f۱۲۹۸۰o;

    /* renamed from: d, reason: contains not printable characters */
    private final Camera f۱۲۹۶۹d = new Camera();

    /* renamed from: f, reason: contains not printable characters */
    private float f۱۲۹۷۱f = 1.0f;

    /* renamed from: l, reason: contains not printable characters */
    private float f۱۲۹۷۷l = 1.0f;

    /* renamed from: m, reason: contains not printable characters */
    private float f۱۲۹۷۸m = 1.0f;

    /* renamed from: p, reason: contains not printable characters */
    private final RectF f۱۲۹۸۱p = new RectF();

    /* renamed from: q, reason: contains not printable characters */
    private final RectF f۱۲۹۸۲q = new RectF();

    /* renamed from: r, reason: contains not printable characters */
    private final Matrix f۱۲۹۸۳r = new Matrix();

    static {
        f۱۲۹۶۶s = Integer.valueOf(Build.VERSION.SDK).intValue() < 11;
        f۱۲۹۶۷t = new WeakHashMap<>();
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Ca m۱۴۳۰۵a(View view) {
        Ca proxy = f۱۲۹۶۷t.get(view);
        if (proxy == null || proxy != view.getAnimation()) {
            Ca proxy2 = new Ca(view);
            f۱۲۹۶۷t.put(view, proxy2);
            return proxy2;
        }
        return proxy;
    }

    private Ca(View view) {
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        this.f۱۲۹۶۸c = new WeakReference<>(view);
    }

    /* renamed from: a, reason: contains not printable characters */
    public float m۱۴۳۱۰a() {
        return this.f۱۲۹۷۱f;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۳۱۱a(float alpha) {
        if (this.f۱۲۹۷۱f != alpha) {
            this.f۱۲۹۷۱f = alpha;
            View view = this.f۱۲۹۶۸c.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public float m۱۴۳۱۲b() {
        return this.f۱۲۹۷۲g;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۴۳۱۳b(float pivotX) {
        if (!this.f۱۲۹۷۰e || this.f۱۲۹۷۲g != pivotX) {
            m۱۴۳۰۹q();
            this.f۱۲۹۷۰e = true;
            this.f۱۲۹۷۲g = pivotX;
            m۱۴۳۰۸p();
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public float m۱۴۳۱۴c() {
        return this.f۱۲۹۷۳h;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۴۳۱۵c(float pivotY) {
        if (!this.f۱۲۹۷۰e || this.f۱۲۹۷۳h != pivotY) {
            m۱۴۳۰۹q();
            this.f۱۲۹۷۰e = true;
            this.f۱۲۹۷۳h = pivotY;
            m۱۴۳۰۸p();
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    public float m۱۴۳۱۶d() {
        return this.f۱۲۹۷۶k;
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۴۳۱۷d(float rotation) {
        if (this.f۱۲۹۷۶k != rotation) {
            m۱۴۳۰۹q();
            this.f۱۲۹۷۶k = rotation;
            m۱۴۳۰۸p();
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    public float m۱۴۳۱۸e() {
        return this.f۱۲۹۷۴i;
    }

    /* renamed from: e, reason: contains not printable characters */
    public void m۱۴۳۱۹e(float rotationX) {
        if (this.f۱۲۹۷۴i != rotationX) {
            m۱۴۳۰۹q();
            this.f۱۲۹۷۴i = rotationX;
            m۱۴۳۰۸p();
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    public float m۱۴۳۲۰f() {
        return this.f۱۲۹۷۵j;
    }

    /* renamed from: f, reason: contains not printable characters */
    public void m۱۴۳۲۱f(float rotationY) {
        if (this.f۱۲۹۷۵j != rotationY) {
            m۱۴۳۰۹q();
            this.f۱۲۹۷۵j = rotationY;
            m۱۴۳۰۸p();
        }
    }

    /* renamed from: g, reason: contains not printable characters */
    public float m۱۴۳۲۲g() {
        return this.f۱۲۹۷۷l;
    }

    /* renamed from: g, reason: contains not printable characters */
    public void m۱۴۳۲۳g(float scaleX) {
        if (this.f۱۲۹۷۷l != scaleX) {
            m۱۴۳۰۹q();
            this.f۱۲۹۷۷l = scaleX;
            m۱۴۳۰۸p();
        }
    }

    /* renamed from: h, reason: contains not printable characters */
    public float m۱۴۳۲۴h() {
        return this.f۱۲۹۷۸m;
    }

    /* renamed from: h, reason: contains not printable characters */
    public void m۱۴۳۲۵h(float scaleY) {
        if (this.f۱۲۹۷۸m != scaleY) {
            m۱۴۳۰۹q();
            this.f۱۲۹۷۸m = scaleY;
            m۱۴۳۰۸p();
        }
    }

    /* renamed from: i, reason: contains not printable characters */
    public int m۱۴۳۲۶i() {
        View view = this.f۱۲۹۶۸c.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    /* renamed from: j, reason: contains not printable characters */
    public int m۱۴۳۲۸j() {
        View view = this.f۱۲۹۶۸c.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    /* renamed from: k, reason: contains not printable characters */
    public float m۱۴۳۳۰k() {
        return this.f۱۲۹۷۹n;
    }

    /* renamed from: i, reason: contains not printable characters */
    public void m۱۴۳۲۷i(float translationX) {
        if (this.f۱۲۹۷۹n != translationX) {
            m۱۴۳۰۹q();
            this.f۱۲۹۷۹n = translationX;
            m۱۴۳۰۸p();
        }
    }

    /* renamed from: m, reason: contains not printable characters */
    public float m۱۴۳۳۳m() {
        return this.f۱۲۹۸۰o;
    }

    /* renamed from: j, reason: contains not printable characters */
    public void m۱۴۳۲۹j(float translationY) {
        if (this.f۱۲۹۸۰o != translationY) {
            m۱۴۳۰۹q();
            this.f۱۲۹۸۰o = translationY;
            m۱۴۳۰۸p();
        }
    }

    /* renamed from: n, reason: contains not printable characters */
    public float m۱۴۳۳۴n() {
        View view = this.f۱۲۹۶۸c.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getLeft() + this.f۱۲۹۷۹n;
    }

    /* renamed from: k, reason: contains not printable characters */
    public void m۱۴۳۳۱k(float x) {
        View view = this.f۱۲۹۶۸c.get();
        if (view != null) {
            m۱۴۳۲۷i(x - view.getLeft());
        }
    }

    /* renamed from: o, reason: contains not printable characters */
    public float m۱۴۳۳۵o() {
        View view = this.f۱۲۹۶۸c.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getTop() + this.f۱۲۹۸۰o;
    }

    /* renamed from: l, reason: contains not printable characters */
    public void m۱۴۳۳۲l(float y) {
        View view = this.f۱۲۹۶۸c.get();
        if (view != null) {
            m۱۴۳۲۹j(y - view.getTop());
        }
    }

    /* renamed from: q, reason: contains not printable characters */
    private void m۱۴۳۰۹q() {
        View view = this.f۱۲۹۶۸c.get();
        if (view != null) {
            m۱۴۳۰۷a(this.f۱۲۹۸۱p, view);
        }
    }

    /* renamed from: p, reason: contains not printable characters */
    private void m۱۴۳۰۸p() {
        View view = this.f۱۲۹۶۸c.get();
        if (view == null || view.getParent() == null) {
            return;
        }
        RectF after = this.f۱۲۹۸۲q;
        m۱۴۳۰۷a(after, view);
        after.union(this.f۱۲۹۸۱p);
        ((View) view.getParent()).invalidate((int) Math.floor(after.left), (int) Math.floor(after.top), (int) Math.ceil(after.right), (int) Math.ceil(after.bottom));
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۴۳۰۷a(RectF r, View view) {
        float w = view.getWidth();
        float h2 = view.getHeight();
        r.set(0.0f, 0.0f, w, h2);
        Matrix m = this.f۱۲۹۸۳r;
        m.reset();
        m۱۴۳۰۶a(m, view);
        this.f۱۲۹۸۳r.mapRect(r);
        r.offset(view.getLeft(), view.getTop());
        float f2 = r.right;
        float f3 = r.left;
        if (f2 < f3) {
            float f4 = r.right;
            r.right = f3;
            r.left = f4;
        }
        float f5 = r.bottom;
        if (f5 < r.top) {
            float f6 = r.top;
            r.top = f5;
            r.bottom = f6;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۴۳۰۶a(Matrix m, View view) {
        float w = view.getWidth();
        float h2 = view.getHeight();
        boolean hasPivot = this.f۱۲۹۷۰e;
        float pX = hasPivot ? this.f۱۲۹۷۲g : w / 2.0f;
        float pY = hasPivot ? this.f۱۲۹۷۳h : h2 / 2.0f;
        float rX = this.f۱۲۹۷۴i;
        float rY = this.f۱۲۹۷۵j;
        float rZ = this.f۱۲۹۷۶k;
        if (rX != 0.0f || rY != 0.0f || rZ != 0.0f) {
            Camera camera = this.f۱۲۹۶۹d;
            camera.save();
            camera.rotateX(rX);
            camera.rotateY(rY);
            camera.rotateZ(-rZ);
            camera.getMatrix(m);
            camera.restore();
            m.preTranslate(-pX, -pY);
            m.postTranslate(pX, pY);
        }
        float sX = this.f۱۲۹۷۷l;
        float sY = this.f۱۲۹۷۸m;
        if (sX != 1.0f || sY != 1.0f) {
            m.postScale(sX, sY);
            float sPX = (-(pX / w)) * ((sX * w) - w);
            float sPY = (-(pY / h2)) * ((sY * h2) - h2);
            m.postTranslate(sPX, sPY);
        }
        float sPX2 = this.f۱۲۹۷۹n;
        m.postTranslate(sPX2, this.f۱۲۹۸۰o);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        View view = this.f۱۲۹۶۸c.get();
        if (view != null) {
            t.setAlpha(this.f۱۲۹۷۱f);
            m۱۴۳۰۶a(t.getMatrix(), view);
        }
    }
}
