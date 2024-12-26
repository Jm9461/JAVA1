package p۰۵۲b.p۱۰۳h.p۱۰۴a;

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
import p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa;

/* renamed from: b.h.a.m  reason: invalid class name */
public class Cm extends AbstractCa {

    /* renamed from: A  reason: contains not printable characters */
    private static final Interpolator f۱۲۹۴۰A = new AccelerateDecelerateInterpolator();

    /* renamed from: B  reason: contains not printable characters */
    private static long f۱۲۹۴۱B = 10;

    /* renamed from: u  reason: contains not printable characters */
    private static ThreadLocal<HandlerCf> f۱۲۹۴۲u = new ThreadLocal<>();

    /* renamed from: v  reason: contains not printable characters */
    private static final ThreadLocal<ArrayList<Cm>> f۱۲۹۴۳v = new Ca();

    /* renamed from: w  reason: contains not printable characters */
    private static final ThreadLocal<ArrayList<Cm>> f۱۲۹۴۴w = new Cb();

    /* renamed from: x  reason: contains not printable characters */
    private static final ThreadLocal<ArrayList<Cm>> f۱۲۹۴۵x = new Cc();

    /* renamed from: y  reason: contains not printable characters */
    private static final ThreadLocal<ArrayList<Cm>> f۱۲۹۴۶y = new Cd();

    /* renamed from: z  reason: contains not printable characters */
    private static final ThreadLocal<ArrayList<Cm>> f۱۲۹۴۷z = new Ce();

    /* renamed from: d  reason: contains not printable characters */
    long f۱۲۹۴۸d;

    /* renamed from: e  reason: contains not printable characters */
    long f۱۲۹۴۹e = -1;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۱۲۹۵۰f = false;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۲۹۵۱g = 0;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۲۹۵۲h = false;

    /* renamed from: i  reason: contains not printable characters */
    private long f۱۲۹۵۳i;

    /* renamed from: j  reason: contains not printable characters */
    int f۱۲۹۵۴j = 0;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۱۲۹۵۵k = false;

    /* renamed from: l  reason: contains not printable characters */
    boolean f۱۲۹۵۶l = false;

    /* renamed from: m  reason: contains not printable characters */
    private long f۱۲۹۵۷m = 300;

    /* renamed from: n  reason: contains not printable characters */
    private long f۱۲۹۵۸n = 0;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۲۹۵۹o = 0;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۲۹۶۰p = 1;

    /* renamed from: q  reason: contains not printable characters */
    private Interpolator f۱۲۹۶۱q = f۱۲۹۴۰A;

    /* renamed from: r  reason: contains not printable characters */
    private ArrayList<AbstractCg> f۱۲۹۶۲r = null;

    /* renamed from: s  reason: contains not printable characters */
    Ck[] f۱۲۹۶۳s;

    /* renamed from: t  reason: contains not printable characters */
    HashMap<String, Ck> f۱۲۹۶۴t;

    /* renamed from: b.h.a.m$g  reason: invalid class name */
    public interface AbstractCg {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۶۳۵۱a(Cm mVar);
    }

    static {
        new Cf();
        new Cd();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.h.a.m$a  reason: invalid class name */
    public static class Ca extends ThreadLocal<ArrayList<Cm>> {
        Ca() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<Cm> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b.h.a.m$b  reason: invalid class name */
    static class Cb extends ThreadLocal<ArrayList<Cm>> {
        Cb() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<Cm> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b.h.a.m$c  reason: invalid class name */
    static class Cc extends ThreadLocal<ArrayList<Cm>> {
        Cc() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<Cm> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b.h.a.m$d  reason: invalid class name */
    static class Cd extends ThreadLocal<ArrayList<Cm>> {
        Cd() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<Cm> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b.h.a.m$e  reason: invalid class name */
    static class Ce extends ThreadLocal<ArrayList<Cm>> {
        Ce() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ArrayList<Cm> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static Cm m۱۶۳۲۷b(float... values) {
        Cm anim = new Cm();
        anim.m۱۶۳۴۴a(values);
        return anim;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۴۴a(float... values) {
        if (values != null && values.length != 0) {
            Ck[] kVarArr = this.f۱۲۹۶۳s;
            if (kVarArr == null || kVarArr.length == 0) {
                m۱۶۳۴۵a(Ck.m۱۶۳۰۲a("", values));
            } else {
                kVarArr[0].m۱۶۳۱۴a(values);
            }
            this.f۱۲۹۵۶l = false;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۴۵a(Ck... values) {
        int numValues = values.length;
        this.f۱۲۹۶۳s = values;
        this.f۱۲۹۶۴t = new HashMap<>(numValues);
        for (Ck valuesHolder : values) {
            this.f۱۲۹۶۴t.put(valuesHolder.m۱۶۳۱۵b(), valuesHolder);
        }
        this.f۱۲۹۵۶l = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۶۳۵۰d() {
        if (!this.f۱۲۹۵۶l) {
            int numValues = this.f۱۲۹۶۳s.length;
            for (int i = 0; i < numValues; i++) {
                this.f۱۲۹۶۳s[i].m۱۶۳۱۷c();
            }
            this.f۱۲۹۵۶l = true;
        }
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Cm m۱۶۳۳۹a(long duration) {
        if (duration >= 0) {
            this.f۱۲۹۵۷m = duration;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + duration);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۶۳۴۹c(long playTime) {
        m۱۶۳۵۰d();
        long currentTime = AnimationUtils.currentAnimationTimeMillis();
        if (this.f۱۲۹۵۴j != 1) {
            this.f۱۲۹۴۹e = playTime;
            this.f۱۲۹۵۴j = 2;
        }
        this.f۱۲۹۴۸d = currentTime - playTime;
        m۱۶۳۴۷b(currentTime);
    }

    /* renamed from: c  reason: contains not printable characters */
    public long m۱۶۳۴۸c() {
        if (!this.f۱۲۹۵۶l || this.f۱۲۹۵۴j == 0) {
            return 0;
        }
        return AnimationUtils.currentAnimationTimeMillis() - this.f۱۲۹۴۸d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b.h.a.m$f  reason: invalid class name */
    public static class HandlerCf extends Handler {
        private HandlerCf() {
        }

        /* synthetic */ HandlerCf(Ca x0) {
            this();
        }

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
                        Cm anim = pendingCopy.get(i2);
                        if (anim.f۱۲۹۵۸n == 0) {
                            anim.m۱۶۳۳۸m();
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
                Cm anim2 = delayedAnims.get(i3);
                if (anim2.m۱۶۳۳۰d(currentTime)) {
                    readyAnims.add(anim2);
                }
            }
            int numReadyAnims = readyAnims.size();
            if (numReadyAnims > 0) {
                for (int i4 = 0; i4 < numReadyAnims; i4++) {
                    Cm anim3 = (Cm) readyAnims.get(i4);
                    anim3.m۱۶۳۳۸m();
                    anim3.f۱۲۹۵۵k = true;
                    delayedAnims.remove(anim3);
                }
                readyAnims.clear();
            }
            int numAnims = animations.size();
            int i5 = 0;
            while (i5 < numAnims) {
                Cm anim4 = animations.get(i5);
                if (anim4.m۱۶۳۴۷b(currentTime)) {
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
                    ((Cm) endingAnims.get(i6)).m۱۶۳۳۷k();
                }
                endingAnims.clear();
            }
            if (!callAgain2) {
                callAgain = callAgain2;
            } else if (!animations.isEmpty() || !delayedAnims.isEmpty()) {
                callAgain = callAgain2;
                sendEmptyMessageDelayed(1, Math.max(0L, Cm.f۱۲۹۴۱B - (AnimationUtils.currentAnimationTimeMillis() - currentTime)));
            } else {
                callAgain = callAgain2;
            }
        }
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۴۲a(Interpolator value) {
        if (value != null) {
            this.f۱۲۹۶۱q = value;
        } else {
            this.f۱۲۹۶۱q = new LinearInterpolator();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۴۳a(AbstractCl value) {
        Ck[] kVarArr;
        if (value != null && (kVarArr = this.f۱۲۹۶۳s) != null && kVarArr.length > 0) {
            kVarArr[0].m۱۶۳۰۹a(value);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۳۲۴a(boolean playBackwards) {
        if (Looper.myLooper() != null) {
            this.f۱۲۹۵۰f = playBackwards;
            this.f۱۲۹۵۱g = 0;
            this.f۱۲۹۵۴j = 0;
            this.f۱۲۹۵۲h = false;
            f۱۲۹۴۴w.get().add(this);
            if (this.f۱۲۹۵۸n == 0) {
                m۱۶۳۴۹c(m۱۶۳۴۸c());
                this.f۱۲۹۵۴j = 0;
                this.f۱۲۹۵۵k = true;
                ArrayList<AbstractCa.AbstractCa> arrayList = this.f۱۲۸۶۰c;
                if (arrayList != null) {
                    ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList.clone();
                    int numListeners = tmpListeners.size();
                    for (int i = 0; i < numListeners; i++) {
                        ((AbstractCa.AbstractCa) tmpListeners.get(i)).m۱۶۱۹۴c(this);
                    }
                }
            }
            HandlerCf animationHandler = f۱۲۹۴۲u.get();
            if (animationHandler == null) {
                animationHandler = new HandlerCf(null);
                f۱۲۹۴۲u.set(animationHandler);
            }
            animationHandler.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۳۴۶b() {
        m۱۶۳۲۴a(false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: k  reason: contains not printable characters */
    private void m۱۶۳۳۷k() {
        ArrayList<AbstractCa.AbstractCa> arrayList;
        f۱۲۹۴۳v.get().remove(this);
        f۱۲۹۴۴w.get().remove(this);
        f۱۲۹۴۵x.get().remove(this);
        this.f۱۲۹۵۴j = 0;
        if (this.f۱۲۹۵۵k && (arrayList = this.f۱۲۸۶۰c) != null) {
            ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList.clone();
            int numListeners = tmpListeners.size();
            for (int i = 0; i < numListeners; i++) {
                ((AbstractCa.AbstractCa) tmpListeners.get(i)).m۱۶۱۹۲a(this);
            }
        }
        this.f۱۲۹۵۵k = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m  reason: contains not printable characters */
    private void m۱۶۳۳۸m() {
        ArrayList<AbstractCa.AbstractCa> arrayList;
        m۱۶۳۵۰d();
        f۱۲۹۴۳v.get().add(this);
        if (this.f۱۲۹۵۸n > 0 && (arrayList = this.f۱۲۸۶۰c) != null) {
            ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList.clone();
            int numListeners = tmpListeners.size();
            for (int i = 0; i < numListeners; i++) {
                ((AbstractCa.AbstractCa) tmpListeners.get(i)).m۱۶۱۹۴c(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۶۳۳۰d(long currentTime) {
        if (!this.f۱۲۹۵۲h) {
            this.f۱۲۹۵۲h = true;
            this.f۱۲۹۵۳i = currentTime;
            return false;
        }
        long deltaTime = currentTime - this.f۱۲۹۵۳i;
        long j = this.f۱۲۹۵۸n;
        if (deltaTime <= j) {
            return false;
        }
        this.f۱۲۹۴۸d = currentTime - (deltaTime - j);
        this.f۱۲۹۵۴j = 1;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۶۳۴۷b(long currentTime) {
        boolean done = false;
        if (this.f۱۲۹۵۴j == 0) {
            this.f۱۲۹۵۴j = 1;
            long j = this.f۱۲۹۴۹e;
            if (j < 0) {
                this.f۱۲۹۴۸d = currentTime;
            } else {
                this.f۱۲۹۴۸d = currentTime - j;
                this.f۱۲۹۴۹e = -1;
            }
        }
        int i = this.f۱۲۹۵۴j;
        if (i == 1 || i == 2) {
            long j2 = this.f۱۲۹۵۷m;
            float fraction = j2 > 0 ? ((float) (currentTime - this.f۱۲۹۴۸d)) / ((float) j2) : 1.0f;
            if (fraction >= 1.0f) {
                int i2 = this.f۱۲۹۵۱g;
                int i3 = this.f۱۲۹۵۹o;
                if (i2 < i3 || i3 == -1) {
                    ArrayList<AbstractCa.AbstractCa> arrayList = this.f۱۲۸۶۰c;
                    if (arrayList != null) {
                        int numListeners = arrayList.size();
                        for (int i4 = 0; i4 < numListeners; i4++) {
                            this.f۱۲۸۶۰c.get(i4).m۱۶۱۹۳b(this);
                        }
                    }
                    if (this.f۱۲۹۶۰p == 2) {
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
            m۱۶۳۴۱a(fraction);
        }
        return done;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۴۱a(float fraction) {
        float fraction2 = this.f۱۲۹۶۱q.getInterpolation(fraction);
        int numValues = this.f۱۲۹۶۳s.length;
        for (int i = 0; i < numValues; i++) {
            this.f۱۲۹۶۳s[i].m۱۶۳۰۸a(fraction2);
        }
        ArrayList<AbstractCg> arrayList = this.f۱۲۹۶۲r;
        if (arrayList != null) {
            int numListeners = arrayList.size();
            for (int i2 = 0; i2 < numListeners; i2++) {
                this.f۱۲۹۶۲r.get(i2).m۱۶۳۵۱a(this);
            }
        }
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa, p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa, java.lang.Object
    public Cm clone() {
        Cm anim = (Cm) super.clone();
        if (this.f۱۲۹۶۲r != null) {
            ArrayList<ValueAnimator.AnimatorUpdateListener> oldListeners = this.f۱۲۹۶۲r;
            anim.f۱۲۹۶۲r = new ArrayList<>();
            int numListeners = oldListeners.size();
            for (int i = 0; i < numListeners; i++) {
                anim.f۱۲۹۶۲r.add(oldListeners.get(i));
            }
        }
        anim.f۱۲۹۴۹e = -1;
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
                Ck newValuesHolder = oldValues[i2].clone();
                anim.f۱۲۹۶۳s[i2] = newValuesHolder;
                anim.f۱۲۹۶۴t.put(newValuesHolder.m۱۶۳۱۵b(), newValuesHolder);
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
