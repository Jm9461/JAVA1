package b.h.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import b.h.a.a;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.HashMap;

public class m extends a {
    private static final Interpolator A = new AccelerateDecelerateInterpolator();
    private static long B = 10;
    private static ThreadLocal<f> u = new ThreadLocal<>();
    private static final ThreadLocal<ArrayList<m>> v = new a();
    private static final ThreadLocal<ArrayList<m>> w = new b();
    private static final ThreadLocal<ArrayList<m>> x = new c();
    private static final ThreadLocal<ArrayList<m>> y = new d();
    private static final ThreadLocal<ArrayList<m>> z = new e();

    /* renamed from: d  reason: collision with root package name */
    long f۲۵۶۹d;

    /* renamed from: e  reason: collision with root package name */
    long f۲۵۷۰e = -1;

    /* renamed from: f  reason: collision with root package name */
    private boolean f۲۵۷۱f = false;

    /* renamed from: g  reason: collision with root package name */
    private int f۲۵۷۲g = 0;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۲۵۷۳h = false;
    private long i;
    int j = 0;
    private boolean k = false;
    boolean l = false;
    private long m = 300;
    private long n = 0;
    private int o = 0;
    private int p = 1;
    private Interpolator q = A;
    private ArrayList<g> r = null;
    k[] s;
    HashMap<String, k> t;

    public interface g {
        void a(m mVar);
    }

    static {
        new f();
        new d();
    }

    /* access modifiers changed from: package-private */
    public static class a extends ThreadLocal<ArrayList<m>> {
        a() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<m> initialValue() {
            return new ArrayList<>();
        }
    }

    static class b extends ThreadLocal<ArrayList<m>> {
        b() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<m> initialValue() {
            return new ArrayList<>();
        }
    }

    static class c extends ThreadLocal<ArrayList<m>> {
        c() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<m> initialValue() {
            return new ArrayList<>();
        }
    }

    static class d extends ThreadLocal<ArrayList<m>> {
        d() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<m> initialValue() {
            return new ArrayList<>();
        }
    }

    static class e extends ThreadLocal<ArrayList<m>> {
        e() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<m> initialValue() {
            return new ArrayList<>();
        }
    }

    public static m b(float... values) {
        m anim = new m();
        anim.a(values);
        return anim;
    }

    public void a(float... values) {
        if (values != null && values.length != 0) {
            k[] kVarArr = this.s;
            if (kVarArr == null || kVarArr.length == 0) {
                a(k.a("", values));
            } else {
                kVarArr[0].a(values);
            }
            this.l = false;
        }
    }

    public void a(k... values) {
        int numValues = values.length;
        this.s = values;
        this.t = new HashMap<>(numValues);
        for (k valuesHolder : values) {
            this.t.put(valuesHolder.b(), valuesHolder);
        }
        this.l = false;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (!this.l) {
            int numValues = this.s.length;
            for (int i2 = 0; i2 < numValues; i2++) {
                this.s[i2].c();
            }
            this.l = true;
        }
    }

    @Override // b.h.a.a
    public m a(long duration) {
        if (duration >= 0) {
            this.m = duration;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + duration);
    }

    public void c(long playTime) {
        d();
        long currentTime = AnimationUtils.currentAnimationTimeMillis();
        if (this.j != 1) {
            this.f۲۵۷۰e = playTime;
            this.j = 2;
        }
        this.f۲۵۶۹d = currentTime - playTime;
        b(currentTime);
    }

    public long c() {
        if (!this.l || this.j == 0) {
            return 0;
        }
        return AnimationUtils.currentAnimationTimeMillis() - this.f۲۵۶۹d;
    }

    /* access modifiers changed from: private */
    public static class f extends Handler {
        private f() {
        }

        /* synthetic */ f(a x0) {
            this();
        }

        public void handleMessage(Message msg) {
            boolean callAgain;
            boolean callAgain2 = true;
            ArrayList<ValueAnimator> animations = (ArrayList) m.v.get();
            ArrayList<ValueAnimator> delayedAnims = (ArrayList) m.x.get();
            int i = msg.what;
            if (i == 0) {
                ArrayList<ValueAnimator> pendingAnimations = (ArrayList) m.w.get();
                if (animations.size() > 0 || delayedAnims.size() > 0) {
                    callAgain2 = false;
                }
                while (pendingAnimations.size() > 0) {
                    ArrayList<ValueAnimator> pendingCopy = (ArrayList) pendingAnimations.clone();
                    pendingAnimations.clear();
                    int count = pendingCopy.size();
                    for (int i2 = 0; i2 < count; i2++) {
                        m anim = pendingCopy.get(i2);
                        if (anim.n == 0) {
                            anim.m();
                        } else {
                            delayedAnims.add(anim);
                        }
                    }
                }
            } else if (i != 1) {
                return;
            }
            long currentTime = AnimationUtils.currentAnimationTimeMillis();
            ArrayList<ValueAnimator> readyAnims = (ArrayList) m.z.get();
            ArrayList<ValueAnimator> endingAnims = (ArrayList) m.y.get();
            int numDelayedAnims = delayedAnims.size();
            for (int i3 = 0; i3 < numDelayedAnims; i3++) {
                m anim2 = delayedAnims.get(i3);
                if (anim2.d(currentTime)) {
                    readyAnims.add(anim2);
                }
            }
            int numReadyAnims = readyAnims.size();
            if (numReadyAnims > 0) {
                for (int i4 = 0; i4 < numReadyAnims; i4++) {
                    m anim3 = (m) readyAnims.get(i4);
                    anim3.m();
                    anim3.k = true;
                    delayedAnims.remove(anim3);
                }
                readyAnims.clear();
            }
            int numAnims = animations.size();
            int i5 = 0;
            while (i5 < numAnims) {
                m anim4 = animations.get(i5);
                if (anim4.b(currentTime)) {
                    endingAnims.add(anim4);
                }
                if (animations.size() == numAnims) {
                    i5++;
                } else {
                    numAnims--;
                    endingAnims.remove(anim4);
                }
            }
            if (endingAnims.size() > 0) {
                for (int i6 = 0; i6 < endingAnims.size(); i6++) {
                    ((m) endingAnims.get(i6)).k();
                }
                endingAnims.clear();
            }
            if (!callAgain2) {
                callAgain = callAgain2;
            } else if (!animations.isEmpty() || !delayedAnims.isEmpty()) {
                callAgain = callAgain2;
                sendEmptyMessageDelayed(1, Math.max(0L, m.B - (AnimationUtils.currentAnimationTimeMillis() - currentTime)));
            } else {
                callAgain = callAgain2;
            }
        }
    }

    @Override // b.h.a.a
    public void a(Interpolator value) {
        if (value != null) {
            this.q = value;
        } else {
            this.q = new LinearInterpolator();
        }
    }

    public void a(l value) {
        k[] kVarArr;
        if (value != null && (kVarArr = this.s) != null && kVarArr.length > 0) {
            kVarArr[0].a(value);
        }
    }

    private void a(boolean playBackwards) {
        if (Looper.myLooper() != null) {
            this.f۲۵۷۱f = playBackwards;
            this.f۲۵۷۲g = 0;
            this.j = 0;
            this.f۲۵۷۳h = false;
            w.get().add(this);
            if (this.n == 0) {
                c(c());
                this.j = 0;
                this.k = true;
                ArrayList<a.AbstractC۰۰۵۲a> arrayList = this.f۲۵۱۹c;
                if (arrayList != null) {
                    ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList.clone();
                    int numListeners = tmpListeners.size();
                    for (int i2 = 0; i2 < numListeners; i2++) {
                        ((a.AbstractC۰۰۵۲a) tmpListeners.get(i2)).c(this);
                    }
                }
            }
            f animationHandler = u.get();
            if (animationHandler == null) {
                animationHandler = new f(null);
                u.set(animationHandler);
            }
            animationHandler.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }

    @Override // b.h.a.a
    public void b() {
        a(false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void k() {
        ArrayList<a.AbstractC۰۰۵۲a> arrayList;
        v.get().remove(this);
        w.get().remove(this);
        x.get().remove(this);
        this.j = 0;
        if (this.k && (arrayList = this.f۲۵۱۹c) != null) {
            ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList.clone();
            int numListeners = tmpListeners.size();
            for (int i2 = 0; i2 < numListeners; i2++) {
                ((a.AbstractC۰۰۵۲a) tmpListeners.get(i2)).a(this);
            }
        }
        this.k = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void m() {
        ArrayList<a.AbstractC۰۰۵۲a> arrayList;
        d();
        v.get().add(this);
        if (this.n > 0 && (arrayList = this.f۲۵۱۹c) != null) {
            ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList.clone();
            int numListeners = tmpListeners.size();
            for (int i2 = 0; i2 < numListeners; i2++) {
                ((a.AbstractC۰۰۵۲a) tmpListeners.get(i2)).c(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean d(long currentTime) {
        if (!this.f۲۵۷۳h) {
            this.f۲۵۷۳h = true;
            this.i = currentTime;
            return false;
        }
        long deltaTime = currentTime - this.i;
        long j2 = this.n;
        if (deltaTime <= j2) {
            return false;
        }
        this.f۲۵۶۹d = currentTime - (deltaTime - j2);
        this.j = 1;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean b(long currentTime) {
        boolean done = false;
        if (this.j == 0) {
            this.j = 1;
            long j2 = this.f۲۵۷۰e;
            if (j2 < 0) {
                this.f۲۵۶۹d = currentTime;
            } else {
                this.f۲۵۶۹d = currentTime - j2;
                this.f۲۵۷۰e = -1;
            }
        }
        int i2 = this.j;
        if (i2 == 1 || i2 == 2) {
            long j3 = this.m;
            float fraction = j3 > 0 ? ((float) (currentTime - this.f۲۵۶۹d)) / ((float) j3) : 1.0f;
            if (fraction >= 1.0f) {
                int i3 = this.f۲۵۷۲g;
                int i4 = this.o;
                if (i3 < i4 || i4 == -1) {
                    ArrayList<a.AbstractC۰۰۵۲a> arrayList = this.f۲۵۱۹c;
                    if (arrayList != null) {
                        int numListeners = arrayList.size();
                        for (int i5 = 0; i5 < numListeners; i5++) {
                            this.f۲۵۱۹c.get(i5).b(this);
                        }
                    }
                    if (this.p == 2) {
                        this.f۲۵۷۱f = !this.f۲۵۷۱f;
                    }
                    this.f۲۵۷۲g += (int) fraction;
                    fraction %= 1.0f;
                    this.f۲۵۶۹d += this.m;
                } else {
                    done = true;
                    fraction = Math.min(fraction, 1.0f);
                }
            }
            if (this.f۲۵۷۱f) {
                fraction = 1.0f - fraction;
            }
            a(fraction);
        }
        return done;
    }

    /* access modifiers changed from: package-private */
    public void a(float fraction) {
        float fraction2 = this.q.getInterpolation(fraction);
        int numValues = this.s.length;
        for (int i2 = 0; i2 < numValues; i2++) {
            this.s[i2].a(fraction2);
        }
        ArrayList<g> arrayList = this.r;
        if (arrayList != null) {
            int numListeners = arrayList.size();
            for (int i3 = 0; i3 < numListeners; i3++) {
                this.r.get(i3).a(this);
            }
        }
    }

    @Override // b.h.a.a, b.h.a.a, java.lang.Object
    public m clone() {
        m anim = (m) super.clone();
        if (this.r != null) {
            ArrayList<ValueAnimator.AnimatorUpdateListener> oldListeners = this.r;
            anim.r = new ArrayList<>();
            int numListeners = oldListeners.size();
            for (int i2 = 0; i2 < numListeners; i2++) {
                anim.r.add(oldListeners.get(i2));
            }
        }
        anim.f۲۵۷۰e = -1;
        anim.f۲۵۷۱f = false;
        anim.f۲۵۷۲g = 0;
        anim.l = false;
        anim.j = 0;
        anim.f۲۵۷۳h = false;
        k[] oldValues = this.s;
        if (oldValues != null) {
            int numValues = oldValues.length;
            anim.s = new k[numValues];
            anim.t = new HashMap<>(numValues);
            for (int i3 = 0; i3 < numValues; i3++) {
                k newValuesHolder = oldValues[i3].clone();
                anim.s[i3] = newValuesHolder;
                anim.t.put(newValuesHolder.b(), newValuesHolder);
            }
        }
        return anim;
    }

    public String toString() {
        String returnVal = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.s != null) {
            for (int i2 = 0; i2 < this.s.length; i2++) {
                returnVal = returnVal + "\n    " + this.s[i2].toString();
            }
        }
        return returnVal;
    }
}
