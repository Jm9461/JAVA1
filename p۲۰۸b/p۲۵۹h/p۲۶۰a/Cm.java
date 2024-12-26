package p۲۰۸b.p۲۵۹h.p۲۶۰a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.HashMap;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa;

/* renamed from: b.h.a.m, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cm extends AbstractCa {

    /* renamed from: B, reason: contains not printable characters */
    private static long f۱۲۹۴۱B;

    /* renamed from: d, reason: contains not printable characters */
    long f۱۲۹۴۸d;

    /* renamed from: i, reason: contains not printable characters */
    private long f۱۲۹۵۳i;

    /* renamed from: s, reason: contains not printable characters */
    Ck[] f۱۲۹۶۳s;

    /* renamed from: t, reason: contains not printable characters */
    HashMap<String, Ck> f۱۲۹۶۴t;

    /* renamed from: u, reason: contains not printable characters */
    private static ThreadLocal<f> f۱۲۹۴۲u = new ThreadLocal<>();

    /* renamed from: v, reason: contains not printable characters */
    private static final ThreadLocal<ArrayList<Cm>> f۱۲۹۴۳v = new a();

    /* renamed from: w, reason: contains not printable characters */
    private static final ThreadLocal<ArrayList<Cm>> f۱۲۹۴۴w = new b();

    /* renamed from: x, reason: contains not printable characters */
    private static final ThreadLocal<ArrayList<Cm>> f۱۲۹۴۵x = new c();

    /* renamed from: y, reason: contains not printable characters */
    private static final ThreadLocal<ArrayList<Cm>> f۱۲۹۴۶y = new d();

    /* renamed from: z, reason: contains not printable characters */
    private static final ThreadLocal<ArrayList<Cm>> f۱۲۹۴۷z = new e();

    /* renamed from: A, reason: contains not printable characters */
    private static final Interpolator f۱۲۹۴۰A = new AccelerateDecelerateInterpolator();

    /* renamed from: e, reason: contains not printable characters */
    long f۱۲۹۴۹e = -1;

    /* renamed from: f, reason: contains not printable characters */
    private boolean f۱۲۹۵۰f = false;

    /* renamed from: g, reason: contains not printable characters */
    private int f۱۲۹۵۱g = 0;

    /* renamed from: h, reason: contains not printable characters */
    private boolean f۱۲۹۵۲h = false;

    /* renamed from: j, reason: contains not printable characters */
    int f۱۲۹۵۴j = 0;

    /* renamed from: k, reason: contains not printable characters */
    private boolean f۱۲۹۵۵k = false;

    /* renamed from: l, reason: contains not printable characters */
    boolean f۱۲۹۵۶l = false;

    /* renamed from: m, reason: contains not printable characters */
    private long f۱۲۹۵۷m = 300;

    /* renamed from: n, reason: contains not printable characters */
    private long f۱۲۹۵۸n = 0;

    /* renamed from: o, reason: contains not printable characters */
    private int f۱۲۹۵۹o = 0;

    /* renamed from: p, reason: contains not printable characters */
    private int f۱۲۹۶۰p = 1;

    /* renamed from: q, reason: contains not printable characters */
    private Interpolator f۱۲۹۶۱q = f۱۲۹۴۰A;

    /* renamed from: r, reason: contains not printable characters */
    private ArrayList<g> f۱۲۹۶۲r = null;

    /* renamed from: b.h.a.m$g */
    public interface g {
        /* renamed from: a, reason: contains not printable characters */
        void m۱۴۲۷۸a(Cm cm);
    }

    static {
        new Cf();
        new Cd();
        f۱۲۹۴۱B = 10L;
    }

    /* renamed from: b.h.a.m$a */
    static class a extends ThreadLocal<ArrayList<Cm>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<Cm> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b.h.a.m$b */
    static class b extends ThreadLocal<ArrayList<Cm>> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<Cm> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b.h.a.m$c */
    static class c extends ThreadLocal<ArrayList<Cm>> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<Cm> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b.h.a.m$d */
    static class d extends ThreadLocal<ArrayList<Cm>> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<Cm> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b.h.a.m$e */
    static class e extends ThreadLocal<ArrayList<Cm>> {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<Cm> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static Cm m۱۴۲۵۳b(float... values) {
        Cm anim = new Cm();
        anim.mo۱۴۲۷۰a(values);
        return anim;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۴۲۷۰a(float... values) {
        if (values == null || values.length == 0) {
            return;
        }
        Ck[] ckArr = this.f۱۲۹۶۳s;
        if (ckArr == null || ckArr.length == 0) {
            m۱۴۲۷۱a(Ck.m۱۴۲۲۶a("", values));
        } else {
            Ck valuesHolder = ckArr[0];
            valuesHolder.mo۱۴۲۴۷a(values);
        }
        this.f۱۲۹۵۶l = false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۲۷۱a(Ck... values) {
        int numValues = values.length;
        this.f۱۲۹۶۳s = values;
        this.f۱۲۹۶۴t = new HashMap<>(numValues);
        for (Ck valuesHolder : values) {
            this.f۱۲۹۶۴t.put(valuesHolder.m۱۴۲۳۹b(), valuesHolder);
        }
        this.f۱۲۹۵۶l = false;
    }

    /* renamed from: d, reason: contains not printable characters */
    void mo۱۴۲۷۷d() {
        if (!this.f۱۲۹۵۶l) {
            int numValues = this.f۱۲۹۶۳s.length;
            for (int i = 0; i < numValues; i++) {
                this.f۱۲۹۶۳s[i].m۱۴۲۴۱c();
            }
            this.f۱۲۹۵۶l = true;
        }
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public Cm mo۱۴۲۶۶a(long duration) {
        if (duration < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + duration);
        }
        this.f۱۲۹۵۷m = duration;
        return this;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۴۲۷۵c(long playTime) {
        mo۱۴۲۷۷d();
        long currentTime = AnimationUtils.currentAnimationTimeMillis();
        if (this.f۱۲۹۵۴j != 1) {
            this.f۱۲۹۴۹e = playTime;
            this.f۱۲۹۵۴j = 2;
        }
        this.f۱۲۹۴۸d = currentTime - playTime;
        m۱۴۲۷۳b(currentTime);
    }

    /* renamed from: c, reason: contains not printable characters */
    public long m۱۴۲۷۴c() {
        if (!this.f۱۲۹۵۶l || this.f۱۲۹۵۴j == 0) {
            return 0L;
        }
        return AnimationUtils.currentAnimationTimeMillis() - this.f۱۲۹۴۸d;
    }

    /* renamed from: b.h.a.m$f */
    private static class f extends Handler {
        private f() {
        }

        /* synthetic */ f(a x0) {
            this();
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            boolean callAgain;
            boolean callAgain2 = true;
            ArrayList<ValueAnimator> animations = (ArrayList) Cm.f۱۲۹۴۳v.get();
            ArrayList<ValueAnimator> delayedAnims = (ArrayList) Cm.f۱۲۹۴۵x.get();
            int i = msg.what;
            if (i == 0) {
                ArrayList<ValueAnimator> pendingAnimations = (ArrayList) Cm.f۱۲۹۴۴w.get();
                if (animations.size() > 0 || delayedAnims.size() > 0) {
                    callAgain2 = false;
                }
                while (pendingAnimations.size() > 0) {
                    ArrayList<ValueAnimator> pendingCopy = (ArrayList) pendingAnimations.clone();
                    pendingAnimations.clear();
                    int count = pendingCopy.size();
                    for (int i2 = 0; i2 < count; i2++) {
                        Cm anim = (Cm) pendingCopy.get(i2);
                        if (anim.f۱۲۹۵۸n == 0) {
                            anim.m۱۴۲۶۴m();
                        } else {
                            delayedAnims.add(anim);
                        }
                    }
                }
            } else if (i != 1) {
                return;
            }
            long currentTime = AnimationUtils.currentAnimationTimeMillis();
            ArrayList<ValueAnimator> readyAnims = (ArrayList) Cm.f۱۲۹۴۷z.get();
            ArrayList<ValueAnimator> endingAnims = (ArrayList) Cm.f۱۲۹۴۶y.get();
            int numDelayedAnims = delayedAnims.size();
            for (int i3 = 0; i3 < numDelayedAnims; i3++) {
                Cm anim2 = (Cm) delayedAnims.get(i3);
                if (anim2.m۱۴۲۵۶d(currentTime)) {
                    readyAnims.add(anim2);
                }
            }
            int numReadyAnims = readyAnims.size();
            if (numReadyAnims > 0) {
                for (int i4 = 0; i4 < numReadyAnims; i4++) {
                    Cm anim3 = (Cm) readyAnims.get(i4);
                    anim3.m۱۴۲۶۴m();
                    anim3.f۱۲۹۵۵k = true;
                    delayedAnims.remove(anim3);
                }
                readyAnims.clear();
            }
            int numAnims = animations.size();
            int i5 = 0;
            while (i5 < numAnims) {
                Cm anim4 = (Cm) animations.get(i5);
                if (anim4.m۱۴۲۷۳b(currentTime)) {
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
                    ((Cm) endingAnims.get(i6)).m۱۴۲۶۳k();
                }
                endingAnims.clear();
            }
            if (!callAgain2) {
                callAgain = callAgain2;
            } else if (animations.isEmpty() && delayedAnims.isEmpty()) {
                callAgain = callAgain2;
            } else {
                callAgain = callAgain2;
                sendEmptyMessageDelayed(1, Math.max(0L, Cm.f۱۲۹۴۱B - (AnimationUtils.currentAnimationTimeMillis() - currentTime)));
            }
        }
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۴۲۶۸a(Interpolator value) {
        if (value != null) {
            this.f۱۲۹۶۱q = value;
        } else {
            this.f۱۲۹۶۱q = new LinearInterpolator();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۲۶۹a(InterfaceCl value) {
        Ck[] ckArr;
        if (value != null && (ckArr = this.f۱۲۹۶۳s) != null && ckArr.length > 0) {
            ckArr[0].m۱۴۲۳۳a(value);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۴۲۵۰a(boolean playBackwards) {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        this.f۱۲۹۵۰f = playBackwards;
        this.f۱۲۹۵۱g = 0;
        this.f۱۲۹۵۴j = 0;
        this.f۱۲۹۵۲h = false;
        f۱۲۹۴۴w.get().add(this);
        if (this.f۱۲۹۵۸n == 0) {
            m۱۴۲۷۵c(m۱۴۲۷۴c());
            this.f۱۲۹۵۴j = 0;
            this.f۱۲۹۵۵k = true;
            ArrayList<AbstractCa.a> arrayList = this.f۱۲۸۶۰c;
            if (arrayList != null) {
                ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList.clone();
                int numListeners = tmpListeners.size();
                for (int i = 0; i < numListeners; i++) {
                    ((AbstractCa.a) tmpListeners.get(i)).mo۱۶۴۰۷c(this);
                }
            }
        }
        f animationHandler = f۱۲۹۴۲u.get();
        if (animationHandler == null) {
            animationHandler = new f(null);
            f۱۲۹۴۲u.set(animationHandler);
        }
        animationHandler.sendEmptyMessage(0);
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۴۲۷۲b() {
        m۱۴۲۵۰a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: contains not printable characters */
    public void m۱۴۲۶۳k() {
        ArrayList<AbstractCa.a> arrayList;
        f۱۲۹۴۳v.get().remove(this);
        f۱۲۹۴۴w.get().remove(this);
        f۱۲۹۴۵x.get().remove(this);
        this.f۱۲۹۵۴j = 0;
        if (this.f۱۲۹۵۵k && (arrayList = this.f۱۲۸۶۰c) != null) {
            ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList.clone();
            int numListeners = tmpListeners.size();
            for (int i = 0; i < numListeners; i++) {
                ((AbstractCa.a) tmpListeners.get(i)).mo۱۶۴۰۵a(this);
            }
        }
        this.f۱۲۹۵۵k = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: contains not printable characters */
    public void m۱۴۲۶۴m() {
        ArrayList<AbstractCa.a> arrayList;
        mo۱۴۲۷۷d();
        f۱۲۹۴۳v.get().add(this);
        if (this.f۱۲۹۵۸n > 0 && (arrayList = this.f۱۲۸۶۰c) != null) {
            ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList.clone();
            int numListeners = tmpListeners.size();
            for (int i = 0; i < numListeners; i++) {
                ((AbstractCa.a) tmpListeners.get(i)).mo۱۶۴۰۷c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: contains not printable characters */
    public boolean m۱۴۲۵۶d(long currentTime) {
        if (!this.f۱۲۹۵۲h) {
            this.f۱۲۹۵۲h = true;
            this.f۱۲۹۵۳i = currentTime;
            return false;
        }
        long deltaTime = currentTime - this.f۱۲۹۵۳i;
        long j = this.f۱۲۹۵۸n;
        if (deltaTime > j) {
            this.f۱۲۹۴۸d = currentTime - (deltaTime - j);
            this.f۱۲۹۵۴j = 1;
            return true;
        }
        return false;
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۱۴۲۷۳b(long currentTime) {
        boolean done = false;
        if (this.f۱۲۹۵۴j == 0) {
            this.f۱۲۹۵۴j = 1;
            long j = this.f۱۲۹۴۹e;
            if (j < 0) {
                this.f۱۲۹۴۸d = currentTime;
            } else {
                this.f۱۲۹۴۸d = currentTime - j;
                this.f۱۲۹۴۹e = -1L;
            }
        }
        int i = this.f۱۲۹۵۴j;
        if (i == 1 || i == 2) {
            long j2 = this.f۱۲۹۵۷m;
            float fraction = j2 > 0 ? (currentTime - this.f۱۲۹۴۸d) / j2 : 1.0f;
            if (fraction >= 1.0f) {
                int i2 = this.f۱۲۹۵۱g;
                int i3 = this.f۱۲۹۵۹o;
                if (i2 < i3 || i3 == -1) {
                    ArrayList<AbstractCa.a> arrayList = this.f۱۲۸۶۰c;
                    if (arrayList != null) {
                        int numListeners = arrayList.size();
                        for (int i4 = 0; i4 < numListeners; i4++) {
                            this.f۱۲۸۶۰c.get(i4).mo۱۶۴۱۰b(this);
                        }
                    }
                    int numListeners2 = this.f۱۲۹۶۰p;
                    if (numListeners2 == 2) {
                        this.f۱۲۹۵۰f = !this.f۱۲۹۵۰f;
                    }
                    this.f۱۲۹۵۱g += (int) fraction;
                    fraction %= 1.0f;
                    this.f۱۲۹۴۸d += this.f۱۲۹۵۷m;
                } else {
                    done = true;
                    fraction = Math.min(fraction, 1.0f);
                }
            }
            if (this.f۱۲۹۵۰f) {
                fraction = 1.0f - fraction;
            }
            mo۱۴۲۶۷a(fraction);
        }
        return done;
    }

    /* renamed from: a, reason: contains not printable characters */
    void mo۱۴۲۶۷a(float fraction) {
        float fraction2 = this.f۱۲۹۶۱q.getInterpolation(fraction);
        int numValues = this.f۱۲۹۶۳s.length;
        for (int i = 0; i < numValues; i++) {
            this.f۱۲۹۶۳s[i].mo۱۴۲۴۴a(fraction2);
        }
        ArrayList<g> arrayList = this.f۱۲۹۶۲r;
        if (arrayList != null) {
            int numListeners = arrayList.size();
            for (int i2 = 0; i2 < numListeners; i2++) {
                this.f۱۲۹۶۲r.get(i2).m۱۴۲۷۸a(this);
            }
        }
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa
    /* renamed from: clone */
    public Cm mo۱۴۲۷۶clone() {
        Cm anim = (Cm) super.mo۱۴۲۷۶clone();
        if (this.f۱۲۹۶۲r != null) {
            ArrayList<g> arrayList = this.f۱۲۹۶۲r;
            anim.f۱۲۹۶۲r = new ArrayList<>();
            int numListeners = arrayList.size();
            for (int i = 0; i < numListeners; i++) {
                anim.f۱۲۹۶۲r.add(arrayList.get(i));
            }
        }
        anim.f۱۲۹۴۹e = -1L;
        anim.f۱۲۹۵۰f = false;
        anim.f۱۲۹۵۱g = 0;
        anim.f۱۲۹۵۶l = false;
        anim.f۱۲۹۵۴j = 0;
        anim.f۱۲۹۵۲h = false;
        Ck[] oldValues = this.f۱۲۹۶۳s;
        if (oldValues != null) {
            int numValues = oldValues.length;
            anim.f۱۲۹۶۳s = new Ck[numValues];
            anim.f۱۲۹۶۴t = new HashMap<>(numValues);
            for (int i2 = 0; i2 < numValues; i2++) {
                Ck newValuesHolder = oldValues[i2].mo۱۴۲۴۸clone();
                anim.f۱۲۹۶۳s[i2] = newValuesHolder;
                anim.f۱۲۹۶۴t.put(newValuesHolder.m۱۴۲۳۹b(), newValuesHolder);
            }
        }
        return anim;
    }

    public String toString() {
        String returnVal = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f۱۲۹۶۳s != null) {
            for (int i = 0; i < this.f۱۲۹۶۳s.length; i++) {
                returnVal = returnVal + "\n    " + this.f۱۲۹۶۳s[i].toString();
            }
        }
        return returnVal;
    }
}
