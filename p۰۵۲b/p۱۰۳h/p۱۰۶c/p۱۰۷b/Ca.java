package p۰۵۲b.p۱۰۳h.p۱۰۶c.p۱۰۷b;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: b.h.c.b.a  reason: invalid class name */
public final class Ca extends Animation {

    /* renamed from: s  reason: contains not printable characters */
    public static final boolean f۱۲۹۶۶s = (Integer.valueOf(Build.VERSION.SDK).intValue() < 11);

    /* renamed from: t  reason: contains not printable characters */
    private static final WeakHashMap<View, Ca> f۱۲۹۶۷t = new WeakHashMap<>();

    /* renamed from: c  reason: contains not printable characters */
    private final WeakReference<View> f۱۲۹۶۸c;

    /* renamed from: d  reason: contains not printable characters */
    private final Camera f۱۲۹۶۹d = new Camera();

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۱۲۹۷۰e;

    /* renamed from: f  reason: contains not printable characters */
    private float f۱۲۹۷۱f = 1.0f;

    /* renamed from: g  reason: contains not printable characters */
    private float f۱۲۹۷۲g;

    /* renamed from: h  reason: contains not printable characters */
    private float f۱۲۹۷۳h;

    /* renamed from: i  reason: contains not printable characters */
    private float f۱۲۹۷۴i;

    /* renamed from: j  reason: contains not printable characters */
    private float f۱۲۹۷۵j;

    /* renamed from: k  reason: contains not printable characters */
    private float f۱۲۹۷۶k;

    /* renamed from: l  reason: contains not printable characters */
    private float f۱۲۹۷۷l = 1.0f;

    /* renamed from: m  reason: contains not printable characters */
    private float f۱۲۹۷۸m = 1.0f;

    /* renamed from: n  reason: contains not printable characters */
    private float f۱۲۹۷۹n;

    /* renamed from: o  reason: contains not printable characters */
    private float f۱۲۹۸۰o;

    /* renamed from: p  reason: contains not printable characters */
    private final RectF f۱۲۹۸۱p = new RectF();

    /* renamed from: q  reason: contains not printable characters */
    private final RectF f۱۲۹۸۲q = new RectF();

    /* renamed from: r  reason: contains not printable characters */
    private final Matrix f۱۲۹۸۳r = new Matrix();

    /* renamed from: a  reason: contains not printable characters */
    public static Ca m۱۶۳۸۰a(View view) {
        Ca proxy = f۱۲۹۶۷t.get(view);
        if (proxy != null && proxy == view.getAnimation()) {
            return proxy;
        }
        Ca proxy2 = new Ca(view);
        f۱۲۹۶۷t.put(view, proxy2);
        return proxy2;
    }

    private Ca(View view) {
        setDuration(0);
        setFillAfter(true);
        view.setAnimation(this);
        this.f۱۲۹۶۸c = new WeakReference<>(view);
    }

    /* renamed from: a  reason: contains not printable characters */
    public float m۱۶۳۸۵a() {
        return this.f۱۲۹۷۱f;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۸۶a(float alpha) {
        if (this.f۱۲۹۷۱f != alpha) {
            this.f۱۲۹۷۱f = alpha;
            View view = this.f۱۲۹۶۸c.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public float m۱۶۳۸۷b() {
        return this.f۱۲۹۷۲g;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۳۸۸b(float pivotX) {
        if (!this.f۱۲۹۷۰e || this.f۱۲۹۷۲g != pivotX) {
            m۱۶۳۸۴q();
            this.f۱۲۹۷۰e = true;
            this.f۱۲۹۷۲g = pivotX;
            m۱۶۳۸۳p();
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public float m۱۶۳۸۹c() {
        return this.f۱۲۹۷۳h;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۶۳۹۰c(float pivotY) {
        if (!this.f۱۲۹۷۰e || this.f۱۲۹۷۳h != pivotY) {
            m۱۶۳۸۴q();
            this.f۱۲۹۷۰e = true;
            this.f۱۲۹۷۳h = pivotY;
            m۱۶۳۸۳p();
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public float m۱۶۳۹۱d() {
        return this.f۱۲۹۷۶k;
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۶۳۹۲d(float rotation) {
        if (this.f۱۲۹۷۶k != rotation) {
            m۱۶۳۸۴q();
            this.f۱۲۹۷۶k = rotation;
            m۱۶۳۸۳p();
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    public float m۱۶۳۹۳e() {
        return this.f۱۲۹۷۴i;
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۶۳۹۴e(float rotationX) {
        if (this.f۱۲۹۷۴i != rotationX) {
            m۱۶۳۸۴q();
            this.f۱۲۹۷۴i = rotationX;
            m۱۶۳۸۳p();
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    public float m۱۶۳۹۵f() {
        return this.f۱۲۹۷۵j;
    }

    /* renamed from: f  reason: contains not printable characters */
    public void m۱۶۳۹۶f(float rotationY) {
        if (this.f۱۲۹۷۵j != rotationY) {
            m۱۶۳۸۴q();
            this.f۱۲۹۷۵j = rotationY;
            m۱۶۳۸۳p();
        }
    }

    /* renamed from: g  reason: contains not printable characters */
    public float m۱۶۳۹۷g() {
        return this.f۱۲۹۷۷l;
    }

    /* renamed from: g  reason: contains not printable characters */
    public void m۱۶۳۹۸g(float scaleX) {
        if (this.f۱۲۹۷۷l != scaleX) {
            m۱۶۳۸۴q();
            this.f۱۲۹۷۷l = scaleX;
            m۱۶۳۸۳p();
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    public float m۱۶۳۹۹h() {
        return this.f۱۲۹۷۸m;
    }

    /* renamed from: h  reason: contains not printable characters */
    public void m۱۶۴۰۰h(float scaleY) {
        if (this.f۱۲۹۷۸m != scaleY) {
            m۱۶۳۸۴q();
            this.f۱۲۹۷۸m = scaleY;
            m۱۶۳۸۳p();
        }
    }

    /* renamed from: i  reason: contains not printable characters */
    public int m۱۶۴۰۱i() {
        View view = this.f۱۲۹۶۸c.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    /* renamed from: j  reason: contains not printable characters */
    public int m۱۶۴۰۳j() {
        View view = this.f۱۲۹۶۸c.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    /* renamed from: k  reason: contains not printable characters */
    public float m۱۶۴۰۵k() {
        return this.f۱۲۹۷۹n;
    }

    /* renamed from: i  reason: contains not printable characters */
    public void m۱۶۴۰۲i(float translationX) {
        if (this.f۱۲۹۷۹n != translationX) {
            m۱۶۳۸۴q();
            this.f۱۲۹۷۹n = translationX;
            m۱۶۳۸۳p();
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    public float m۱۶۴۰۸m() {
        return this.f۱۲۹۸۰o;
    }

    /* renamed from: j  reason: contains not printable characters */
    public void m۱۶۴۰۴j(float translationY) {
        if (this.f۱۲۹۸۰o != translationY) {
            m۱۶۳۸۴q();
            this.f۱۲۹۸۰o = translationY;
            m۱۶۳۸۳p();
        }
    }

    /* renamed from: n  reason: contains not printable characters */
    public float m۱۶۴۰۹n() {
        View view = this.f۱۲۹۶۸c.get();
        if (view == null) {
            return 0.0f;
        }
        return ((float) view.getLeft()) + this.f۱۲۹۷۹n;
    }

    /* renamed from: k  reason: contains not printable characters */
    public void m۱۶۴۰۶k(float x) {
        View view = this.f۱۲۹۶۸c.get();
        if (view != null) {
            m۱۶۴۰۲i(x - ((float) view.getLeft()));
        }
    }

    /* renamed from: o  reason: contains not printable characters */
    public float m۱۶۴۱۰o() {
        View view = this.f۱۲۹۶۸c.get();
        if (view == null) {
            return 0.0f;
        }
        return ((float) view.getTop()) + this.f۱۲۹۸۰o;
    }

    /* renamed from: l  reason: contains not printable characters */
    public void m۱۶۴۰۷l(float y) {
        View view = this.f۱۲۹۶۸c.get();
        if (view != null) {
            m۱۶۴۰۴j(y - ((float) view.getTop()));
        }
    }

    /* renamed from: q  reason: contains not printable characters */
    private void m۱۶۳۸۴q() {
        View view = this.f۱۲۹۶۸c.get();
        if (view != null) {
            m۱۶۳۸۲a(this.f۱۲۹۸۱p, view);
        }
    }

    /* renamed from: p  reason: contains not printable characters */
    private void m۱۶۳۸۳p() {
        View view = this.f۱۲۹۶۸c.get();
        if (view != null && view.getParent() != null) {
            RectF after = this.f۱۲۹۸۲q;
            m۱۶۳۸۲a(after, view);
            after.union(this.f۱۲۹۸۱p);
            ((View) view.getParent()).invalidate((int) Math.floor((double) after.left), (int) Math.floor((double) after.top), (int) Math.ceil((double) after.right), (int) Math.ceil((double) after.bottom));
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۳۸۲a(RectF r, View view) {
        r.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        Matrix m = this.f۱۲۹۸۳r;
        m.reset();
        m۱۶۳۸۱a(m, view);
        this.f۱۲۹۸۳r.mapRect(r);
        r.offset((float) view.getLeft(), (float) view.getTop());
        float f = r.right;
        float f2 = r.left;
        if (f < f2) {
            float f3 = r.right;
            r.right = f2;
            r.left = f3;
        }
        float f4 = r.bottom;
        if (f4 < r.top) {
            float f5 = r.top;
            r.top = f4;
            r.bottom = f5;
        }
    }

    /* JADX INFO: Multiple debug info for r8v1 float: [D('camera' android.graphics.Camera), D('sX' float)] */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۳۸۱a(Matrix m, View view) {
        float w = (float) view.getWidth();
        float h = (float) view.getHeight();
        boolean hasPivot = this.f۱۲۹۷۰e;
        float pX = hasPivot ? this.f۱۲۹۷۲g : w / 2.0f;
        float pY = hasPivot ? this.f۱۲۹۷۳h : h / 2.0f;
        float rX = this.f۱۲۹۷۴i;
        float rY = this.f۱۲۹۷۵j;
        float rZ = this.f۱۲۹۷۶k;
        if (!(rX == 0.0f && rY == 0.0f && rZ == 0.0f)) {
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
        if (!(sX == 1.0f && sY == 1.0f)) {
            m.postScale(sX, sY);
            m.postTranslate((-(pX / w)) * ((sX * w) - w), (-(pY / h)) * ((sY * h) - h));
        }
        m.postTranslate(this.f۱۲۹۷۹n, this.f۱۲۹۸۰o);
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float interpolatedTime, Transformation t) {
        View view = this.f۱۲۹۶۸c.get();
        if (view != null) {
            t.setAlpha(this.f۱۲۹۷۱f);
            m۱۶۳۸۱a(t.getMatrix(), view);
        }
    }
}
