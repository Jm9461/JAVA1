package android.support.v4.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.Cp;
import android.arch.lifecycle.ViewModelStore;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.AbstractCk;
import android.support.v4.app.ComponentCallbacksCf;
import android.support.v4.view.Cu;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cb;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cd;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ce;

/* renamed from: android.support.v4.app.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class LayoutInflaterFactory2Cl extends AbstractCk implements LayoutInflater.Factory2 {

    /* renamed from: G, reason: contains not printable characters */
    static boolean f۱۰۲۲۵G = false;

    /* renamed from: H, reason: contains not printable characters */
    static Field f۱۰۲۲۶H = null;

    /* renamed from: I, reason: contains not printable characters */
    static final Interpolator f۱۰۲۲۷I = new DecelerateInterpolator(2.5f);

    /* renamed from: J, reason: contains not printable characters */
    static final Interpolator f۱۰۲۲۸J = new DecelerateInterpolator(1.5f);

    /* renamed from: A, reason: contains not printable characters */
    ArrayList<ComponentCallbacksCf> f۱۰۲۲۹A;

    /* renamed from: D, reason: contains not printable characters */
    ArrayList<n> f۱۰۲۳۲D;

    /* renamed from: E, reason: contains not printable characters */
    Cm f۱۰۲۳۳E;

    /* renamed from: c, reason: contains not printable characters */
    ArrayList<l> f۱۰۲۳۵c;

    /* renamed from: d, reason: contains not printable characters */
    boolean f۱۰۲۳۶d;

    /* renamed from: g, reason: contains not printable characters */
    SparseArray<ComponentCallbacksCf> f۱۰۲۳۹g;

    /* renamed from: h, reason: contains not printable characters */
    ArrayList<Cc> f۱۰۲۴۰h;

    /* renamed from: i, reason: contains not printable characters */
    ArrayList<ComponentCallbacksCf> f۱۰۲۴۱i;

    /* renamed from: j, reason: contains not printable characters */
    ArrayList<Cc> f۱۰۲۴۲j;

    /* renamed from: k, reason: contains not printable characters */
    ArrayList<Integer> f۱۰۲۴۳k;

    /* renamed from: l, reason: contains not printable characters */
    ArrayList<AbstractCk.c> f۱۰۲۴۴l;

    /* renamed from: o, reason: contains not printable characters */
    AbstractCj f۱۰۲۴۷o;

    /* renamed from: p, reason: contains not printable characters */
    AbstractCh f۱۰۲۴۸p;

    /* renamed from: q, reason: contains not printable characters */
    ComponentCallbacksCf f۱۰۲۴۹q;

    /* renamed from: r, reason: contains not printable characters */
    ComponentCallbacksCf f۱۰۲۵۰r;

    /* renamed from: s, reason: contains not printable characters */
    boolean f۱۰۲۵۱s;

    /* renamed from: t, reason: contains not printable characters */
    boolean f۱۰۲۵۲t;

    /* renamed from: u, reason: contains not printable characters */
    boolean f۱۰۲۵۳u;

    /* renamed from: v, reason: contains not printable characters */
    boolean f۱۰۲۵۴v;

    /* renamed from: w, reason: contains not printable characters */
    String f۱۰۲۵۵w;

    /* renamed from: x, reason: contains not printable characters */
    boolean f۱۰۲۵۶x;

    /* renamed from: y, reason: contains not printable characters */
    ArrayList<Cc> f۱۰۲۵۷y;

    /* renamed from: z, reason: contains not printable characters */
    ArrayList<Boolean> f۱۰۲۵۸z;

    /* renamed from: e, reason: contains not printable characters */
    int f۱۰۲۳۷e = 0;

    /* renamed from: f, reason: contains not printable characters */
    final ArrayList<ComponentCallbacksCf> f۱۰۲۳۸f = new ArrayList<>();

    /* renamed from: m, reason: contains not printable characters */
    private final CopyOnWriteArrayList<j> f۱۰۲۴۵m = new CopyOnWriteArrayList<>();

    /* renamed from: n, reason: contains not printable characters */
    int f۱۰۲۴۶n = 0;

    /* renamed from: B, reason: contains not printable characters */
    Bundle f۱۰۲۳۰B = null;

    /* renamed from: C, reason: contains not printable characters */
    SparseArray<Parcelable> f۱۰۲۳۱C = null;

    /* renamed from: F, reason: contains not printable characters */
    Runnable f۱۰۲۳۴F = new a();

    /* renamed from: android.support.v4.app.l$j */
    private static final class j {

        /* renamed from: a, reason: contains not printable characters */
        final AbstractCk.b f۱۰۲۸۲a;

        /* renamed from: b, reason: contains not printable characters */
        final boolean f۱۰۲۸۳b;
    }

    /* renamed from: android.support.v4.app.l$k */
    static class k {

        /* renamed from: a, reason: contains not printable characters */
        public static final int[] f۱۰۲۸۴a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    /* renamed from: android.support.v4.app.l$l */
    interface l {
        /* renamed from: a, reason: contains not printable characters */
        boolean mo۱۰۳۸۶a(ArrayList<Cc> arrayList, ArrayList<Boolean> arrayList2);
    }

    LayoutInflaterFactory2Cl() {
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    /* renamed from: android.support.v4.app.l$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2Cl.this.m۱۰۳۷۴o();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static boolean m۱۰۲۸۷a(g anim) {
        Animation animation = anim.f۱۰۲۷۴a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (animation instanceof AnimationSet) {
            List<Animation> anims = ((AnimationSet) animation).getAnimations();
            for (int i2 = 0; i2 < anims.size(); i2++) {
                if (anims.get(i2) instanceof AlphaAnimation) {
                    return true;
                }
            }
            return false;
        }
        return m۱۰۲۸۶a(anim.f۱۰۲۷۵b);
    }

    /* renamed from: a, reason: contains not printable characters */
    static boolean m۱۰۲۸۶a(Animator anim) {
        if (anim == null) {
            return false;
        }
        if (anim instanceof ValueAnimator) {
            ValueAnimator valueAnim = (ValueAnimator) anim;
            PropertyValuesHolder[] values = valueAnim.getValues();
            for (PropertyValuesHolder propertyValuesHolder : values) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (anim instanceof AnimatorSet) {
            List<Animator> animList = ((AnimatorSet) anim).getChildAnimations();
            for (int i2 = 0; i2 < animList.size(); i2++) {
                if (m۱۰۲۸۶a(animList.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b, reason: contains not printable characters */
    static boolean m۱۰۲۹۲b(View v, g anim) {
        return v != null && anim != null && Build.VERSION.SDK_INT >= 19 && v.getLayerType() == 0 && Cu.m۱۰۹۵۵v(v) && m۱۰۲۸۷a(anim);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۰۲۸۳a(RuntimeException ex) {
        Log.e("FragmentManager", ex.getMessage());
        Log.e("FragmentManager", "Activity state:");
        Ce logw = new Ce("FragmentManager");
        PrintWriter pw = new PrintWriter(logw);
        AbstractCj abstractCj = this.f۱۰۲۴۷o;
        if (abstractCj != null) {
            try {
                abstractCj.mo۱۰۲۳۷a("  ", (FileDescriptor) null, pw, new String[0]);
                throw ex;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw ex;
            }
        }
        try {
            mo۱۰۳۲۳a("  ", (FileDescriptor) null, pw, new String[0]);
            throw ex;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw ex;
        }
    }

    @Override // android.support.v4.app.AbstractCk
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCq mo۱۰۳۰۶a() {
        return new Cc(this);
    }

    @Override // android.support.v4.app.AbstractCk
    /* renamed from: d, reason: contains not printable characters */
    public boolean mo۱۰۳۴۸d() {
        m۱۰۳۰۰z();
        return m۱۰۲۸۸a((String) null, -1, 0);
    }

    @Override // android.support.v4.app.AbstractCk
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۳۰۷a(int id, int flags) {
        if (id < 0) {
            throw new IllegalArgumentException("Bad id: " + id);
        }
        m۱۰۳۲۱a((l) new m(null, id, flags), false);
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۰۲۸۸a(String name, int id, int flags) {
        AbstractCk childManager;
        m۱۰۳۷۴o();
        m۱۰۲۹۵c(true);
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۵۰r;
        if (componentCallbacksCf != null && id < 0 && name == null && (childManager = componentCallbacksCf.m۱۰۰۷۳S()) != null && childManager.mo۱۰۳۴۸d()) {
            return true;
        }
        boolean executePop = m۱۰۳۲۷a(this.f۱۰۲۵۷y, this.f۱۰۲۵۸z, name, id, flags);
        if (executePop) {
            this.f۱۰۲۳۶d = true;
            try {
                m۱۰۲۹۴c(this.f۱۰۲۵۷y, this.f۱۰۲۵۸z);
            } finally {
                m۱۰۲۷۲A();
            }
        }
        m۱۰۳۷۱n();
        m۱۰۲۹۹y();
        return executePop;
    }

    @Override // android.support.v4.app.AbstractCk
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۳۱۱a(Bundle bundle, String key, ComponentCallbacksCf fragment) {
        int i2 = fragment.f۱۰۱۶۰g;
        if (i2 < 0) {
            m۱۰۲۸۳a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
            throw null;
        }
        bundle.putInt(key, i2);
    }

    @Override // android.support.v4.app.AbstractCk
    /* renamed from: a, reason: contains not printable characters */
    public ComponentCallbacksCf mo۱۰۳۰۳a(Bundle bundle, String key) {
        int index = bundle.getInt(key, -1);
        if (index == -1) {
            return null;
        }
        ComponentCallbacksCf f2 = this.f۱۰۲۳۹g.get(index);
        if (f2 == null) {
            m۱۰۲۸۳a(new IllegalStateException("Fragment no longer exists for key " + key + ": index " + index));
            throw null;
        }
        return f2;
    }

    @Override // android.support.v4.app.AbstractCk
    /* renamed from: b, reason: contains not printable characters */
    public List<ComponentCallbacksCf> mo۱۰۳۳۰b() {
        List<ComponentCallbacksCf> list;
        if (this.f۱۰۲۳۸f.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f۱۰۲۳۸f) {
            list = (List) this.f۱۰۲۳۸f.clone();
        }
        return list;
    }

    @Override // android.support.v4.app.AbstractCk
    /* renamed from: a, reason: contains not printable characters */
    public ComponentCallbacksCf.g mo۱۰۳۰۱a(ComponentCallbacksCf fragment) {
        Bundle result;
        if (fragment.f۱۰۱۶۰g < 0) {
            m۱۰۲۸۳a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
            throw null;
        }
        if (fragment.f۱۰۱۵۶c <= 0 || (result = m۱۰۳۶۹m(fragment)) == null) {
            return null;
        }
        return new ComponentCallbacksCf.g(result);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            Cd.m۸۵۲۱a(componentCallbacksCf, sb);
        } else {
            Cd.m۸۵۲۱a(this.f۱۰۲۴۷o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // android.support.v4.app.AbstractCk
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۳۲۳a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        int N;
        int N2;
        int N3;
        int N4;
        int N5;
        String innerPrefix = prefix + "    ";
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        if (sparseArray != null && (N5 = sparseArray.size()) > 0) {
            writer.print(prefix);
            writer.print("Active Fragments in ");
            writer.print(Integer.toHexString(System.identityHashCode(this)));
            writer.println(":");
            for (int i2 = 0; i2 < N5; i2++) {
                ComponentCallbacksCf f2 = this.f۱۰۲۳۹g.valueAt(i2);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i2);
                writer.print(": ");
                writer.println(f2);
                if (f2 != null) {
                    f2.m۱۰۱۰۷a(innerPrefix, fd, writer, args);
                }
            }
        }
        int N6 = this.f۱۰۲۳۸f.size();
        if (N6 > 0) {
            writer.print(prefix);
            writer.println("Added Fragments:");
            for (int i3 = 0; i3 < N6; i3++) {
                ComponentCallbacksCf f3 = this.f۱۰۲۳۸f.get(i3);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i3);
                writer.print(": ");
                writer.println(f3.toString());
            }
        }
        ArrayList<ComponentCallbacksCf> arrayList = this.f۱۰۲۴۱i;
        if (arrayList != null && (N4 = arrayList.size()) > 0) {
            writer.print(prefix);
            writer.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < N4; i4++) {
                ComponentCallbacksCf f4 = this.f۱۰۲۴۱i.get(i4);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i4);
                writer.print(": ");
                writer.println(f4.toString());
            }
        }
        ArrayList<Cc> arrayList2 = this.f۱۰۲۴۰h;
        if (arrayList2 != null && (N3 = arrayList2.size()) > 0) {
            writer.print(prefix);
            writer.println("Back Stack:");
            for (int i5 = 0; i5 < N3; i5++) {
                Cc bs = this.f۱۰۲۴۰h.get(i5);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i5);
                writer.print(": ");
                writer.println(bs.toString());
                bs.m۱۰۰۱۵a(innerPrefix, fd, writer, args);
            }
        }
        synchronized (this) {
            if (this.f۱۰۲۴۲j != null && (N2 = this.f۱۰۲۴۲j.size()) > 0) {
                writer.print(prefix);
                writer.println("Back Stack Indices:");
                for (int i6 = 0; i6 < N2; i6++) {
                    Cc bs2 = this.f۱۰۲۴۲j.get(i6);
                    writer.print(prefix);
                    writer.print("  #");
                    writer.print(i6);
                    writer.print(": ");
                    writer.println(bs2);
                }
            }
            if (this.f۱۰۲۴۳k != null && this.f۱۰۲۴۳k.size() > 0) {
                writer.print(prefix);
                writer.print("mAvailBackStackIndices: ");
                writer.println(Arrays.toString(this.f۱۰۲۴۳k.toArray()));
            }
        }
        ArrayList<l> arrayList3 = this.f۱۰۲۳۵c;
        if (arrayList3 != null && (N = arrayList3.size()) > 0) {
            writer.print(prefix);
            writer.println("Pending Actions:");
            for (int i7 = 0; i7 < N; i7++) {
                l r = this.f۱۰۲۳۵c.get(i7);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i7);
                writer.print(": ");
                writer.println(r);
            }
        }
        writer.print(prefix);
        writer.println("FragmentManager misc state:");
        writer.print(prefix);
        writer.print("  mHost=");
        writer.println(this.f۱۰۲۴۷o);
        writer.print(prefix);
        writer.print("  mContainer=");
        writer.println(this.f۱۰۲۴۸p);
        if (this.f۱۰۲۴۹q != null) {
            writer.print(prefix);
            writer.print("  mParent=");
            writer.println(this.f۱۰۲۴۹q);
        }
        writer.print(prefix);
        writer.print("  mCurState=");
        writer.print(this.f۱۰۲۴۶n);
        writer.print(" mStateSaved=");
        writer.print(this.f۱۰۲۵۲t);
        writer.print(" mStopped=");
        writer.print(this.f۱۰۲۵۳u);
        writer.print(" mDestroyed=");
        writer.println(this.f۱۰۲۵۴v);
        if (this.f۱۰۲۵۱s) {
            writer.print(prefix);
            writer.print("  mNeedMenuInvalidate=");
            writer.println(this.f۱۰۲۵۱s);
        }
        if (this.f۱۰۲۵۵w != null) {
            writer.print(prefix);
            writer.print("  mNoTransactionsBecause=");
            writer.println(this.f۱۰۲۵۵w);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static g m۱۰۲۷۷a(Context context, float startScale, float endScale, float startAlpha, float endAlpha) {
        AnimationSet set = new AnimationSet(false);
        ScaleAnimation scale = new ScaleAnimation(startScale, endScale, startScale, endScale, 1, 0.5f, 1, 0.5f);
        scale.setInterpolator(f۱۰۲۲۷I);
        scale.setDuration(220L);
        set.addAnimation(scale);
        AlphaAnimation alpha = new AlphaAnimation(startAlpha, endAlpha);
        alpha.setInterpolator(f۱۰۲۲۸J);
        alpha.setDuration(220L);
        set.addAnimation(alpha);
        return new g(set);
    }

    /* renamed from: a, reason: contains not printable characters */
    static g m۱۰۲۷۶a(Context context, float start, float end) {
        AlphaAnimation anim = new AlphaAnimation(start, end);
        anim.setInterpolator(f۱۰۲۲۸J);
        anim.setDuration(220L);
        return new g(anim);
    }

    /* renamed from: a, reason: contains not printable characters */
    g m۱۰۳۰۵a(ComponentCallbacksCf fragment, int transit, boolean enter, int transitionStyle) {
        int styleIndex;
        int nextAnim = fragment.m۱۰۱۵۸q();
        Animation animation = fragment.m۱۰۰۸۵a(transit, enter, nextAnim);
        if (animation != null) {
            return new g(animation);
        }
        Animator animator = fragment.m۱۰۱۱۱b(transit, enter, nextAnim);
        if (animator != null) {
            return new g(animator);
        }
        if (nextAnim != 0) {
            String dir = this.f۱۰۲۴۷o.m۱۰۲۴۰c().getResources().getResourceTypeName(nextAnim);
            boolean isAnim = "anim".equals(dir);
            boolean successfulLoad = false;
            if (isAnim) {
                try {
                    Animation animation2 = AnimationUtils.loadAnimation(this.f۱۰۲۴۷o.m۱۰۲۴۰c(), nextAnim);
                    if (animation2 != null) {
                        return new g(animation2);
                    }
                    successfulLoad = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException e3) {
                }
            }
            if (!successfulLoad) {
                try {
                    Animator animator2 = AnimatorInflater.loadAnimator(this.f۱۰۲۴۷o.m۱۰۲۴۰c(), nextAnim);
                    if (animator2 != null) {
                        return new g(animator2);
                    }
                } catch (RuntimeException e4) {
                    if (isAnim) {
                        throw e4;
                    }
                    Animation animation3 = AnimationUtils.loadAnimation(this.f۱۰۲۴۷o.m۱۰۲۴۰c(), nextAnim);
                    if (animation3 != null) {
                        return new g(animation3);
                    }
                }
            }
        }
        if (transit == 0 || (styleIndex = m۱۰۲۸۹b(transit, enter)) < 0) {
            return null;
        }
        switch (styleIndex) {
            case 1:
                return m۱۰۲۷۷a(this.f۱۰۲۴۷o.m۱۰۲۴۰c(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m۱۰۲۷۷a(this.f۱۰۲۴۷o.m۱۰۲۴۰c(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m۱۰۲۷۷a(this.f۱۰۲۴۷o.m۱۰۲۴۰c(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m۱۰۲۷۷a(this.f۱۰۲۴۷o.m۱۰۲۴۰c(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m۱۰۲۷۶a(this.f۱۰۲۴۷o.m۱۰۲۴۰c(), 0.0f, 1.0f);
            case 6:
                return m۱۰۲۷۶a(this.f۱۰۲۴۷o.m۱۰۲۴۰c(), 1.0f, 0.0f);
            default:
                if (transitionStyle == 0 && this.f۱۰۲۴۷o.mo۱۰۲۴۵h()) {
                    transitionStyle = this.f۱۰۲۴۷o.mo۱۰۲۴۴g();
                }
                return transitionStyle == 0 ? null : null;
        }
    }

    /* renamed from: k, reason: contains not printable characters */
    public void m۱۰۳۶۶k(ComponentCallbacksCf f2) {
        if (f2.f۱۰۱۴۴M) {
            if (this.f۱۰۲۳۶d) {
                this.f۱۰۲۵۶x = true;
            } else {
                f2.f۱۰۱۴۴M = false;
                m۱۰۳۱۵a(f2, this.f۱۰۲۴۶n, 0, 0, false);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۰۲۸۲a(View v, g anim) {
        if (v != null && anim != null && m۱۰۲۹۲b(v, anim)) {
            Animator animator = anim.f۱۰۲۷۵b;
            if (animator != null) {
                animator.addListener(new h(v));
                return;
            }
            Animation.AnimationListener originalListener = m۱۰۲۷۸a(anim.f۱۰۲۷۴a);
            v.setLayerType(2, null);
            anim.f۱۰۲۷۴a.setAnimationListener(new e(v, originalListener));
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Animation.AnimationListener m۱۰۲۷۸a(Animation animation) {
        try {
            if (f۱۰۲۲۶H == null) {
                f۱۰۲۲۶H = Animation.class.getDeclaredField("mListener");
                f۱۰۲۲۶H.setAccessible(true);
            }
            Animation.AnimationListener originalListener = (Animation.AnimationListener) f۱۰۲۲۶H.get(animation);
            return originalListener;
        } catch (IllegalAccessException e2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
            return null;
        } catch (NoSuchFieldException e3) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e3);
            return null;
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    boolean m۱۰۳۴۴c(int state) {
        return this.f۱۰۲۴۶n >= state;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        if (r1 != 3) goto L۱۴۲;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0294  */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m۱۰۳۱۵a(android.support.v4.app.ComponentCallbacksCf r17, int r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LayoutInflaterFactory2Cl.m۱۰۳۱۵a(android.support.v4.app.f, int, int, int, boolean):void");
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۰۲۸۰a(ComponentCallbacksCf fragment, g anim, int newState) {
        View viewToAnimate = fragment.f۱۰۱۴۲K;
        ViewGroup container = fragment.f۱۰۱۴۱J;
        container.startViewTransition(viewToAnimate);
        fragment.m۱۰۱۲۹d(newState);
        Animation animation = anim.f۱۰۲۷۴a;
        if (animation != null) {
            Animation animation2 = new i(animation, container, viewToAnimate);
            fragment.m۱۰۱۰۵a(fragment.f۱۰۱۴۲K);
            Animation.AnimationListener listener = m۱۰۲۷۸a(animation2);
            animation2.setAnimationListener(new b(listener, container, fragment));
            m۱۰۲۸۲a(viewToAnimate, anim);
            fragment.f۱۰۱۴۲K.startAnimation(animation2);
            return;
        }
        Animator animator = anim.f۱۰۲۷۵b;
        fragment.m۱۰۰۹۰a(anim.f۱۰۲۷۵b);
        animator.addListener(new c(container, viewToAnimate, fragment));
        animator.setTarget(fragment.f۱۰۱۴۲K);
        m۱۰۲۸۲a(fragment.f۱۰۱۴۲K, anim);
        animator.start();
    }

    /* renamed from: android.support.v4.app.l$b */
    class b extends f {

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f۱۰۲۶۰b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۲۶۱c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Animation.AnimationListener wrapped, ViewGroup viewGroup, ComponentCallbacksCf componentCallbacksCf) {
            super(wrapped);
            this.f۱۰۲۶۰b = viewGroup;
            this.f۱۰۲۶۱c = componentCallbacksCf;
        }

        @Override // android.support.v4.app.LayoutInflaterFactory2Cl.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.f۱۰۲۶۰b.post(new a());
        }

        /* renamed from: android.support.v4.app.l$b$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f۱۰۲۶۱c.m۱۰۱۳۹g() != null) {
                    b.this.f۱۰۲۶۱c.m۱۰۱۰۵a((View) null);
                    b bVar = b.this;
                    LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = LayoutInflaterFactory2Cl.this;
                    ComponentCallbacksCf componentCallbacksCf = bVar.f۱۰۲۶۱c;
                    layoutInflaterFactory2Cl.m۱۰۳۱۵a(componentCallbacksCf, componentCallbacksCf.m۱۰۱۶۷z(), 0, 0, false);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.l$c */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f۱۰۲۶۴a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ View f۱۰۲۶۵b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۲۶۶c;

        c(ViewGroup viewGroup, View view, ComponentCallbacksCf componentCallbacksCf) {
            this.f۱۰۲۶۴a = viewGroup;
            this.f۱۰۲۶۵b = view;
            this.f۱۰۲۶۶c = componentCallbacksCf;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator anim) {
            this.f۱۰۲۶۴a.endViewTransition(this.f۱۰۲۶۵b);
            Animator animator = this.f۱۰۲۶۶c.m۱۰۱۴۲h();
            this.f۱۰۲۶۶c.m۱۰۰۹۰a((Animator) null);
            if (animator != null && this.f۱۰۲۶۴a.indexOfChild(this.f۱۰۲۶۵b) < 0) {
                LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = LayoutInflaterFactory2Cl.this;
                ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۶۶c;
                layoutInflaterFactory2Cl.m۱۰۳۱۵a(componentCallbacksCf, componentCallbacksCf.m۱۰۱۶۷z(), 0, 0, false);
            }
        }
    }

    /* renamed from: j, reason: contains not printable characters */
    void m۱۰۳۶۴j(ComponentCallbacksCf f2) {
        m۱۰۳۱۵a(f2, this.f۱۰۲۴۶n, 0, 0, false);
    }

    /* renamed from: e, reason: contains not printable characters */
    void m۱۰۳۵۰e(ComponentCallbacksCf f2) {
        if (f2.f۱۰۱۶۸o && !f2.f۱۰۱۷۱r) {
            f2.m۱۰۱۱۴b(f2.m۱۰۱۴۶i(f2.f۱۰۱۵۷d), (ViewGroup) null, f2.f۱۰۱۵۷d);
            View view = f2.f۱۰۱۴۲K;
            if (view != null) {
                f2.f۱۰۱۴۳L = view;
                view.setSaveFromParentEnabled(false);
                if (f2.f۱۰۱۳۴C) {
                    f2.f۱۰۱۴۲K.setVisibility(8);
                }
                f2.mo۱۵۵۰۱a(f2.f۱۰۱۴۲K, f2.f۱۰۱۵۷d);
                m۱۰۳۱۸a(f2, f2.f۱۰۱۴۲K, f2.f۱۰۱۵۷d, false);
                return;
            }
            f2.f۱۰۱۴۳L = null;
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۰۳۴۰c(ComponentCallbacksCf fragment) {
        Animator animator;
        if (fragment.f۱۰۱۴۲K != null) {
            g anim = m۱۰۳۰۵a(fragment, fragment.m۱۰۱۵۹r(), !fragment.f۱۰۱۳۴C, fragment.m۱۰۱۶۰s());
            if (anim != null && (animator = anim.f۱۰۲۷۵b) != null) {
                animator.setTarget(fragment.f۱۰۱۴۲K);
                if (fragment.f۱۰۱۳۴C) {
                    if (fragment.m۱۰۰۶۰F()) {
                        fragment.m۱۰۱۳۷f(false);
                    } else {
                        ViewGroup container = fragment.f۱۰۱۴۱J;
                        View animatingView = fragment.f۱۰۱۴۲K;
                        container.startViewTransition(animatingView);
                        anim.f۱۰۲۷۵b.addListener(new d(this, container, animatingView, fragment));
                    }
                } else {
                    fragment.f۱۰۱۴۲K.setVisibility(0);
                }
                m۱۰۲۸۲a(fragment.f۱۰۱۴۲K, anim);
                anim.f۱۰۲۷۵b.start();
            } else {
                if (anim != null) {
                    m۱۰۲۸۲a(fragment.f۱۰۱۴۲K, anim);
                    fragment.f۱۰۱۴۲K.startAnimation(anim.f۱۰۲۷۴a);
                    anim.f۱۰۲۷۴a.start();
                }
                int visibility = (!fragment.f۱۰۱۳۴C || fragment.m۱۰۰۶۰F()) ? 0 : 8;
                fragment.f۱۰۱۴۲K.setVisibility(visibility);
                if (fragment.m۱۰۰۶۰F()) {
                    fragment.m۱۰۱۳۷f(false);
                }
            }
        }
        if (fragment.f۱۰۱۶۶m && fragment.f۱۰۱۳۸G && fragment.f۱۰۱۳۹H) {
            this.f۱۰۲۵۱s = true;
        }
        fragment.f۱۰۱۴۸Q = false;
        fragment.m۱۰۱۰۸a(fragment.f۱۰۱۳۴C);
    }

    /* renamed from: android.support.v4.app.l$d */
    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f۱۰۲۶۸a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ View f۱۰۲۶۹b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۲۷۰c;

        d(LayoutInflaterFactory2Cl this$0, ViewGroup viewGroup, View view, ComponentCallbacksCf componentCallbacksCf) {
            this.f۱۰۲۶۸a = viewGroup;
            this.f۱۰۲۶۹b = view;
            this.f۱۰۲۷۰c = componentCallbacksCf;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.f۱۰۲۶۸a.endViewTransition(this.f۱۰۲۶۹b);
            animation.removeListener(this);
            View view = this.f۱۰۲۷۰c.f۱۰۱۴۲K;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: i, reason: contains not printable characters */
    void m۱۰۳۶۲i(ComponentCallbacksCf f2) {
        if (f2 == null) {
            return;
        }
        int nextState = this.f۱۰۲۴۶n;
        if (f2.f۱۰۱۶۷n) {
            if (f2.m۱۰۰۶۱G()) {
                nextState = Math.min(nextState, 1);
            } else {
                nextState = Math.min(nextState, 0);
            }
        }
        m۱۰۳۱۵a(f2, nextState, f2.m۱۰۱۵۹r(), f2.m۱۰۱۶۰s(), false);
        if (f2.f۱۰۱۴۲K != null) {
            ComponentCallbacksCf underFragment = m۱۰۲۹۸q(f2);
            if (underFragment != null) {
                View underView = underFragment.f۱۰۱۴۲K;
                ViewGroup container = f2.f۱۰۱۴۱J;
                int underIndex = container.indexOfChild(underView);
                int viewIndex = container.indexOfChild(f2.f۱۰۱۴۲K);
                if (viewIndex < underIndex) {
                    container.removeViewAt(viewIndex);
                    container.addView(f2.f۱۰۱۴۲K, underIndex);
                }
            }
            if (f2.f۱۰۱۴۷P && f2.f۱۰۱۴۱J != null) {
                float f3 = f2.f۱۰۱۴۹R;
                if (f3 > 0.0f) {
                    f2.f۱۰۱۴۲K.setAlpha(f3);
                }
                f2.f۱۰۱۴۹R = 0.0f;
                f2.f۱۰۱۴۷P = false;
                g anim = m۱۰۳۰۵a(f2, f2.m۱۰۱۵۹r(), true, f2.m۱۰۱۶۰s());
                if (anim != null) {
                    m۱۰۲۸۲a(f2.f۱۰۱۴۲K, anim);
                    Animation animation = anim.f۱۰۲۷۴a;
                    if (animation != null) {
                        f2.f۱۰۱۴۲K.startAnimation(animation);
                    } else {
                        anim.f۱۰۲۷۵b.setTarget(f2.f۱۰۱۴۲K);
                        anim.f۱۰۲۷۵b.start();
                    }
                }
            }
        }
        if (f2.f۱۰۱۴۸Q) {
            m۱۰۳۴۰c(f2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۳۰۹a(int newState, boolean always) {
        AbstractCj abstractCj;
        if (this.f۱۰۲۴۷o == null && newState != 0) {
            throw new IllegalStateException("No activity");
        }
        if (!always && newState == this.f۱۰۲۴۶n) {
            return;
        }
        this.f۱۰۲۴۶n = newState;
        if (this.f۱۰۲۳۹g != null) {
            int numAdded = this.f۱۰۲۳۸f.size();
            for (int i2 = 0; i2 < numAdded; i2++) {
                m۱۰۳۶۲i(this.f۱۰۲۳۸f.get(i2));
            }
            int numActive = this.f۱۰۲۳۹g.size();
            for (int i3 = 0; i3 < numActive; i3++) {
                ComponentCallbacksCf f2 = this.f۱۰۲۳۹g.valueAt(i3);
                if (f2 != null && ((f2.f۱۰۱۶۷n || f2.f۱۰۱۳۵D) && !f2.f۱۰۱۴۷P)) {
                    m۱۰۳۶۲i(f2);
                }
            }
            m۱۰۳۸۴x();
            if (this.f۱۰۲۵۱s && (abstractCj = this.f۱۰۲۴۷o) != null && this.f۱۰۲۴۶n == 4) {
                abstractCj.mo۱۰۲۴۶i();
                this.f۱۰۲۵۱s = false;
            }
        }
    }

    /* renamed from: x, reason: contains not printable characters */
    void m۱۰۳۸۴x() {
        if (this.f۱۰۲۳۹g == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f۱۰۲۳۹g.size(); i2++) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۹g.valueAt(i2);
            if (f2 != null) {
                m۱۰۳۶۶k(f2);
            }
        }
    }

    /* renamed from: g, reason: contains not printable characters */
    void m۱۰۳۵۶g(ComponentCallbacksCf f2) {
        if (f2.f۱۰۱۶۰g >= 0) {
            return;
        }
        int i2 = this.f۱۰۲۳۷e;
        this.f۱۰۲۳۷e = i2 + 1;
        f2.m۱۰۰۸۸a(i2, this.f۱۰۲۴۹q);
        if (this.f۱۰۲۳۹g == null) {
            this.f۱۰۲۳۹g = new SparseArray<>();
        }
        this.f۱۰۲۳۹g.put(f2.f۱۰۱۶۰g, f2);
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "Allocated fragment index " + f2);
        }
    }

    /* renamed from: h, reason: contains not printable characters */
    void m۱۰۳۵۹h(ComponentCallbacksCf f2) {
        if (f2.f۱۰۱۶۰g < 0) {
            return;
        }
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "Freeing fragment index " + f2);
        }
        this.f۱۰۲۳۹g.put(f2.f۱۰۱۶۰g, null);
        f2.m۱۰۰۵۶B();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۳۱۹a(ComponentCallbacksCf fragment, boolean moveToStateNow) {
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        m۱۰۳۵۶g(fragment);
        if (!fragment.f۱۰۱۳۵D) {
            if (this.f۱۰۲۳۸f.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            synchronized (this.f۱۰۲۳۸f) {
                this.f۱۰۲۳۸f.add(fragment);
            }
            fragment.f۱۰۱۶۶m = true;
            fragment.f۱۰۱۶۷n = false;
            if (fragment.f۱۰۱۴۲K == null) {
                fragment.f۱۰۱۴۸Q = false;
            }
            if (fragment.f۱۰۱۳۸G && fragment.f۱۰۱۳۹H) {
                this.f۱۰۲۵۱s = true;
            }
            if (moveToStateNow) {
                m۱۰۳۶۴j(fragment);
            }
        }
    }

    /* renamed from: l, reason: contains not printable characters */
    public void m۱۰۳۶۸l(ComponentCallbacksCf fragment) {
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f۱۰۱۷۲s);
        }
        boolean inactive = !fragment.m۱۰۰۶۱G();
        if (!fragment.f۱۰۱۳۵D || inactive) {
            synchronized (this.f۱۰۲۳۸f) {
                this.f۱۰۲۳۸f.remove(fragment);
            }
            if (fragment.f۱۰۱۳۸G && fragment.f۱۰۱۳۹H) {
                this.f۱۰۲۵۱s = true;
            }
            fragment.f۱۰۱۶۶m = false;
            fragment.f۱۰۱۶۷n = true;
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    public void m۱۰۳۵۳f(ComponentCallbacksCf fragment) {
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f۱۰۱۳۴C) {
            fragment.f۱۰۱۳۴C = true;
            fragment.f۱۰۱۴۸Q = true ^ fragment.f۱۰۱۴۸Q;
        }
    }

    /* renamed from: p, reason: contains not printable characters */
    public void m۱۰۳۷۶p(ComponentCallbacksCf fragment) {
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f۱۰۱۳۴C) {
            fragment.f۱۰۱۳۴C = false;
            fragment.f۱۰۱۴۸Q = !fragment.f۱۰۱۴۸Q;
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۰۳۴۵d(ComponentCallbacksCf fragment) {
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f۱۰۱۳۵D) {
            fragment.f۱۰۱۳۵D = true;
            if (fragment.f۱۰۱۶۶m) {
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                synchronized (this.f۱۰۲۳۸f) {
                    this.f۱۰۲۳۸f.remove(fragment);
                }
                if (fragment.f۱۰۱۳۸G && fragment.f۱۰۱۳۹H) {
                    this.f۱۰۲۵۱s = true;
                }
                fragment.f۱۰۱۶۶m = false;
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۳۳۲b(ComponentCallbacksCf fragment) {
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f۱۰۱۳۵D) {
            fragment.f۱۰۱۳۵D = false;
            if (!fragment.f۱۰۱۶۶m) {
                if (this.f۱۰۲۳۸f.contains(fragment)) {
                    throw new IllegalStateException("Fragment already added: " + fragment);
                }
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                synchronized (this.f۱۰۲۳۸f) {
                    this.f۱۰۲۳۸f.add(fragment);
                }
                fragment.f۱۰۱۶۶m = true;
                if (fragment.f۱۰۱۳۸G && fragment.f۱۰۱۳۹H) {
                    this.f۱۰۲۵۱s = true;
                }
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public ComponentCallbacksCf m۱۰۳۰۲a(int id) {
        for (int i2 = this.f۱۰۲۳۸f.size() - 1; i2 >= 0; i2--) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۸f.get(i2);
            if (f2 != null && f2.f۱۰۱۷۹z == id) {
                return f2;
            }
        }
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        if (sparseArray != null) {
            for (int i3 = sparseArray.size() - 1; i3 >= 0; i3--) {
                ComponentCallbacksCf f3 = this.f۱۰۲۳۹g.valueAt(i3);
                if (f3 != null && f3.f۱۰۱۷۹z == id) {
                    return f3;
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.support.v4.app.AbstractCk
    /* renamed from: a, reason: contains not printable characters */
    public ComponentCallbacksCf mo۱۰۳۰۴a(String tag) {
        if (tag != null) {
            for (int i2 = this.f۱۰۲۳۸f.size() - 1; i2 >= 0; i2--) {
                ComponentCallbacksCf f2 = this.f۱۰۲۳۸f.get(i2);
                if (f2 != null && tag.equals(f2.f۱۰۱۳۳B)) {
                    return f2;
                }
            }
        }
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        if (sparseArray != null && tag != null) {
            for (int i3 = sparseArray.size() - 1; i3 >= 0; i3--) {
                ComponentCallbacksCf f3 = this.f۱۰۲۳۹g.valueAt(i3);
                if (f3 != null && tag.equals(f3.f۱۰۱۳۳B)) {
                    return f3;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: b, reason: contains not printable characters */
    public ComponentCallbacksCf m۱۰۳۲۹b(String who) {
        ComponentCallbacksCf f2;
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        if (sparseArray != null && who != null) {
            for (int i2 = sparseArray.size() - 1; i2 >= 0; i2--) {
                ComponentCallbacksCf f3 = this.f۱۰۲۳۹g.valueAt(i2);
                if (f3 != null && (f2 = f3.m۱۰۰۸۲a(who)) != null) {
                    return f2;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: z, reason: contains not printable characters */
    private void m۱۰۳۰۰z() {
        if (mo۱۰۳۴۳c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f۱۰۲۵۵w != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f۱۰۲۵۵w);
        }
    }

    @Override // android.support.v4.app.AbstractCk
    /* renamed from: c, reason: contains not printable characters */
    public boolean mo۱۰۳۴۳c() {
        return this.f۱۰۲۵۲t || this.f۱۰۲۵۳u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        return;
     */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m۱۰۳۲۱a(android.support.v4.app.LayoutInflaterFactory2Cl.l r3, boolean r4) {
        /*
            r2 = this;
            if (r4 != 0) goto L5
            r2.m۱۰۳۰۰z()
        L5:
            monitor-enter(r2)
            boolean r0 = r2.f۱۰۲۵۴v     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L24
            android.support.v4.app.j r0 = r2.f۱۰۲۴۷o     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto Lf
            goto L24
        Lf:
            java.util.ArrayList<android.support.v4.app.l$l> r0 = r2.f۱۰۲۳۵c     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r0.<init>()     // Catch: java.lang.Throwable -> L30
            r2.f۱۰۲۳۵c = r0     // Catch: java.lang.Throwable -> L30
        L1a:
            java.util.ArrayList<android.support.v4.app.l$l> r0 = r2.f۱۰۲۳۵c     // Catch: java.lang.Throwable -> L30
            r0.add(r3)     // Catch: java.lang.Throwable -> L30
            r2.m۱۰۳۸۳w()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            return
        L24:
            if (r4 == 0) goto L28
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            return
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "Activity has been destroyed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L30
            throw r0     // Catch: java.lang.Throwable -> L30
        L30:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LayoutInflaterFactory2Cl.m۱۰۳۲۱a(android.support.v4.app.l$l, boolean):void");
    }

    /* renamed from: w, reason: contains not printable characters */
    void m۱۰۳۸۳w() {
        synchronized (this) {
            boolean pendingReady = false;
            boolean postponeReady = (this.f۱۰۲۳۲D == null || this.f۱۰۲۳۲D.isEmpty()) ? false : true;
            if (this.f۱۰۲۳۵c != null && this.f۱۰۲۳۵c.size() == 1) {
                pendingReady = true;
            }
            if (postponeReady || pendingReady) {
                this.f۱۰۲۴۷o.m۱۰۲۴۲e().removeCallbacks(this.f۱۰۲۳۴F);
                this.f۱۰۲۴۷o.m۱۰۲۴۲e().post(this.f۱۰۲۳۴F);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public int m۱۰۳۲۸b(Cc bse) {
        synchronized (this) {
            if (this.f۱۰۲۴۳k != null && this.f۱۰۲۴۳k.size() > 0) {
                int index = this.f۱۰۲۴۳k.remove(this.f۱۰۲۴۳k.size() - 1).intValue();
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "Adding back stack index " + index + " with " + bse);
                }
                this.f۱۰۲۴۲j.set(index, bse);
                return index;
            }
            if (this.f۱۰۲۴۲j == null) {
                this.f۱۰۲۴۲j = new ArrayList<>();
            }
            int index2 = this.f۱۰۲۴۲j.size();
            if (f۱۰۲۲۵G) {
                Log.v("FragmentManager", "Setting back stack index " + index2 + " to " + bse);
            }
            this.f۱۰۲۴۲j.add(bse);
            return index2;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۳۰۸a(int index, Cc bse) {
        synchronized (this) {
            if (this.f۱۰۲۴۲j == null) {
                this.f۱۰۲۴۲j = new ArrayList<>();
            }
            int N = this.f۱۰۲۴۲j.size();
            if (index < N) {
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "Setting back stack index " + index + " to " + bse);
                }
                this.f۱۰۲۴۲j.set(index, bse);
            } else {
                while (N < index) {
                    this.f۱۰۲۴۲j.add(null);
                    if (this.f۱۰۲۴۳k == null) {
                        this.f۱۰۲۴۳k = new ArrayList<>();
                    }
                    if (f۱۰۲۲۵G) {
                        Log.v("FragmentManager", "Adding available back stack index " + N);
                    }
                    this.f۱۰۲۴۳k.add(Integer.valueOf(N));
                    N++;
                }
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "Adding back stack index " + index + " with " + bse);
                }
                this.f۱۰۲۴۲j.add(bse);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۳۳۱b(int index) {
        synchronized (this) {
            this.f۱۰۲۴۲j.set(index, null);
            if (this.f۱۰۲۴۳k == null) {
                this.f۱۰۲۴۳k = new ArrayList<>();
            }
            if (f۱۰۲۲۵G) {
                Log.v("FragmentManager", "Freeing back stack index " + index);
            }
            this.f۱۰۲۴۳k.add(Integer.valueOf(index));
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۰۲۹۵c(boolean allowStateLoss) {
        if (this.f۱۰۲۳۶d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f۱۰۲۴۷o == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f۱۰۲۴۷o.m۱۰۲۴۲e().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!allowStateLoss) {
            m۱۰۳۰۰z();
        }
        if (this.f۱۰۲۵۷y == null) {
            this.f۱۰۲۵۷y = new ArrayList<>();
            this.f۱۰۲۵۸z = new ArrayList<>();
        }
        this.f۱۰۲۳۶d = true;
        try {
            m۱۰۲۸۴a((ArrayList<Cc>) null, (ArrayList<Boolean>) null);
        } finally {
            this.f۱۰۲۳۶d = false;
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۳۳۶b(l action, boolean allowStateLoss) {
        if (allowStateLoss && (this.f۱۰۲۴۷o == null || this.f۱۰۲۵۴v)) {
            return;
        }
        m۱۰۲۹۵c(allowStateLoss);
        if (action.mo۱۰۳۸۶a(this.f۱۰۲۵۷y, this.f۱۰۲۵۸z)) {
            this.f۱۰۲۳۶d = true;
            try {
                m۱۰۲۹۴c(this.f۱۰۲۵۷y, this.f۱۰۲۵۸z);
            } finally {
                m۱۰۲۷۲A();
            }
        }
        m۱۰۳۷۱n();
        m۱۰۲۹۹y();
    }

    /* renamed from: A, reason: contains not printable characters */
    private void m۱۰۲۷۲A() {
        this.f۱۰۲۳۶d = false;
        this.f۱۰۲۵۸z.clear();
        this.f۱۰۲۵۷y.clear();
    }

    /* renamed from: o, reason: contains not printable characters */
    public boolean m۱۰۳۷۴o() {
        m۱۰۲۹۵c(true);
        boolean didSomething = false;
        while (m۱۰۲۹۳b(this.f۱۰۲۵۷y, this.f۱۰۲۵۸z)) {
            this.f۱۰۲۳۶d = true;
            try {
                m۱۰۲۹۴c(this.f۱۰۲۵۷y, this.f۱۰۲۵۸z);
                m۱۰۲۷۲A();
                didSomething = true;
            } catch (Throwable th) {
                m۱۰۲۷۲A();
                throw th;
            }
        }
        m۱۰۳۷۱n();
        m۱۰۲۹۹y();
        return didSomething;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۰۲۸۴a(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop) {
        int index;
        int index2;
        ArrayList<n> arrayList2 = this.f۱۰۲۳۲D;
        int numPostponed = arrayList2 == null ? 0 : arrayList2.size();
        int i2 = 0;
        while (i2 < numPostponed) {
            n listener = this.f۱۰۲۳۲D.get(i2);
            if (arrayList != null && !listener.f۱۰۲۸۹a && (index2 = arrayList.indexOf(listener.f۱۰۲۹۰b)) != -1 && isRecordPop.get(index2).booleanValue()) {
                listener.m۱۰۳۸۹c();
            } else if (listener.m۱۰۳۹۱e() || (arrayList != null && listener.f۱۰۲۹۰b.m۱۰۰۱۷a(arrayList, 0, arrayList.size()))) {
                this.f۱۰۲۳۲D.remove(i2);
                i2--;
                numPostponed--;
                if (arrayList != null && !listener.f۱۰۲۸۹a && (index = arrayList.indexOf(listener.f۱۰۲۹۰b)) != -1 && isRecordPop.get(index).booleanValue()) {
                    listener.m۱۰۳۸۹c();
                } else {
                    listener.m۱۰۳۹۰d();
                }
            }
            i2++;
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۰۲۹۴c(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (isRecordPop == null || arrayList.size() != isRecordPop.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m۱۰۲۸۴a(arrayList, isRecordPop);
        int numRecords = arrayList.size();
        int startIndex = 0;
        int recordNum = 0;
        while (recordNum < numRecords) {
            boolean canReorder = arrayList.get(recordNum).f۱۰۱۰۰s;
            if (!canReorder) {
                if (startIndex != recordNum) {
                    m۱۰۲۹۱b(arrayList, isRecordPop, startIndex, recordNum);
                }
                int reorderingEnd = recordNum + 1;
                if (isRecordPop.get(recordNum).booleanValue()) {
                    while (reorderingEnd < numRecords && isRecordPop.get(reorderingEnd).booleanValue() && !arrayList.get(reorderingEnd).f۱۰۱۰۰s) {
                        reorderingEnd++;
                    }
                }
                m۱۰۲۹۱b(arrayList, isRecordPop, recordNum, reorderingEnd);
                startIndex = reorderingEnd;
                recordNum = reorderingEnd - 1;
            }
            recordNum++;
        }
        if (startIndex != numRecords) {
            m۱۰۲۹۱b(arrayList, isRecordPop, startIndex, numRecords);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<android.support.v4.app.Fragment> */
    /* renamed from: b, reason: contains not printable characters */
    private void m۱۰۲۹۱b(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        int i2;
        boolean allowReordering = arrayList.get(startIndex).f۱۰۱۰۰s;
        ArrayList<ComponentCallbacksCf> arrayList2 = this.f۱۰۲۲۹A;
        if (arrayList2 == null) {
            this.f۱۰۲۲۹A = new ArrayList<>();
        } else {
            arrayList2.clear();
        }
        this.f۱۰۲۲۹A.addAll(this.f۱۰۲۳۸f);
        ComponentCallbacksCf oldPrimaryNav = m۱۰۳۷۷q();
        int recordNum = startIndex;
        boolean addToBackStack = false;
        ComponentCallbacksCf oldPrimaryNav2 = oldPrimaryNav;
        while (true) {
            boolean z = true;
            if (recordNum >= endIndex) {
                break;
            }
            Cc record = arrayList.get(recordNum);
            boolean isPop = isRecordPop.get(recordNum).booleanValue();
            if (!isPop) {
                oldPrimaryNav2 = record.m۱۰۰۰۷a(this.f۱۰۲۲۹A, oldPrimaryNav2);
            } else {
                oldPrimaryNav2 = record.m۱۰۰۲۰b(this.f۱۰۲۲۹A, oldPrimaryNav2);
            }
            if (!addToBackStack && !record.f۱۰۰۹۰i) {
                z = false;
            }
            addToBackStack = z;
            recordNum++;
        }
        this.f۱۰۲۲۹A.clear();
        if (!allowReordering) {
            Cr.m۱۰۴۳۰a(this, arrayList, isRecordPop, startIndex, endIndex, false);
        }
        m۱۰۲۸۵a(arrayList, isRecordPop, startIndex, endIndex);
        int postponeIndex = endIndex;
        if (allowReordering) {
            Cb<ComponentCallbacksCf> cb = new Cb<>();
            m۱۰۲۷۹a(cb);
            int postponeIndex2 = m۱۰۲۷۵a(arrayList, isRecordPop, startIndex, endIndex, cb);
            m۱۰۲۹۰b(cb);
            postponeIndex = postponeIndex2;
        }
        if (postponeIndex != startIndex && allowReordering) {
            Cr.m۱۰۴۳۰a(this, arrayList, isRecordPop, startIndex, postponeIndex, true);
            m۱۰۳۰۹a(this.f۱۰۲۴۶n, true);
        }
        for (int recordNum2 = startIndex; recordNum2 < endIndex; recordNum2++) {
            Cc record2 = arrayList.get(recordNum2);
            boolean isPop2 = isRecordPop.get(recordNum2).booleanValue();
            if (isPop2 && (i2 = record2.f۱۰۰۹۳l) >= 0) {
                m۱۰۳۳۱b(i2);
                record2.f۱۰۰۹۳l = -1;
            }
            record2.m۱۰۰۲۹h();
        }
        if (addToBackStack) {
            m۱۰۳۷۹s();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<android.support.v4.app.Fragment> */
    /* renamed from: b, reason: contains not printable characters */
    private void m۱۰۲۹۰b(Cb<ComponentCallbacksCf> cb) {
        int numAdded = cb.size();
        for (int i2 = 0; i2 < numAdded; i2++) {
            ComponentCallbacksCf fragment = cb.m۸۵۰۵c(i2);
            if (!fragment.f۱۰۱۶۶m) {
                View view = fragment.m۱۰۰۵۵A();
                fragment.f۱۰۱۴۹R = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<android.support.v4.app.Fragment> */
    /* renamed from: a, reason: contains not printable characters */
    private int m۱۰۲۷۵a(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex, Cb<ComponentCallbacksCf> cb) {
        int postponeIndex = endIndex;
        for (int i2 = endIndex - 1; i2 >= startIndex; i2--) {
            Cc record = arrayList.get(i2);
            boolean isPop = isRecordPop.get(i2).booleanValue();
            boolean isPostponed = record.m۱۰۰۲۸g() && !record.m۱۰۰۱۷a(arrayList, i2 + 1, endIndex);
            if (isPostponed) {
                if (this.f۱۰۲۳۲D == null) {
                    this.f۱۰۲۳۲D = new ArrayList<>();
                }
                n listener = new n(record, isPop);
                this.f۱۰۲۳۲D.add(listener);
                record.m۱۰۰۱۴a(listener);
                if (isPop) {
                    record.m۱۰۰۲۶e();
                } else {
                    record.m۱۰۰۲۲b(false);
                }
                postponeIndex--;
                if (i2 != postponeIndex) {
                    arrayList.remove(i2);
                    arrayList.add(postponeIndex, record);
                }
                m۱۰۲۷۹a(cb);
            }
        }
        return postponeIndex;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۳۱۴a(Cc record, boolean isPop, boolean runTransitions, boolean moveToState) {
        if (isPop) {
            record.m۱۰۰۲۲b(moveToState);
        } else {
            record.m۱۰۰۲۶e();
        }
        ArrayList<BackStackRecord> records = new ArrayList<>(1);
        ArrayList<Boolean> isRecordPop = new ArrayList<>(1);
        records.add(record);
        isRecordPop.add(Boolean.valueOf(isPop));
        if (runTransitions) {
            Cr.m۱۰۴۳۰a(this, (ArrayList<Cc>) records, isRecordPop, 0, 1, true);
        }
        if (moveToState) {
            m۱۰۳۰۹a(this.f۱۰۲۴۶n, true);
        }
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        if (sparseArray != null) {
            int numActive = sparseArray.size();
            for (int i2 = 0; i2 < numActive; i2++) {
                ComponentCallbacksCf fragment = this.f۱۰۲۳۹g.valueAt(i2);
                if (fragment != null && fragment.f۱۰۱۴۲K != null && fragment.f۱۰۱۴۷P && record.m۱۰۰۲۳b(fragment.f۱۰۱۳۲A)) {
                    float f2 = fragment.f۱۰۱۴۹R;
                    if (f2 > 0.0f) {
                        fragment.f۱۰۱۴۲K.setAlpha(f2);
                    }
                    if (moveToState) {
                        fragment.f۱۰۱۴۹R = 0.0f;
                    } else {
                        fragment.f۱۰۱۴۹R = -1.0f;
                        fragment.f۱۰۱۴۷P = false;
                    }
                }
            }
        }
    }

    /* renamed from: q, reason: contains not printable characters */
    private ComponentCallbacksCf m۱۰۲۹۸q(ComponentCallbacksCf f2) {
        ViewGroup container = f2.f۱۰۱۴۱J;
        View view = f2.f۱۰۱۴۲K;
        if (container == null || view == null) {
            return null;
        }
        int fragmentIndex = this.f۱۰۲۳۸f.indexOf(f2);
        for (int i2 = fragmentIndex - 1; i2 >= 0; i2--) {
            ComponentCallbacksCf underFragment = this.f۱۰۲۳۸f.get(i2);
            if (underFragment.f۱۰۱۴۱J == container && underFragment.f۱۰۱۴۲K != null) {
                return underFragment;
            }
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۰۲۸۵a(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        int i2 = startIndex;
        while (i2 < endIndex) {
            Cc record = arrayList.get(i2);
            boolean isPop = isRecordPop.get(i2).booleanValue();
            if (isPop) {
                record.m۱۰۰۱۲a(-1);
                boolean moveToState = i2 == endIndex + (-1);
                record.m۱۰۰۲۲b(moveToState);
            } else {
                record.m۱۰۰۱۲a(1);
                record.m۱۰۰۲۶e();
            }
            i2++;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<android.support.v4.app.Fragment> */
    /* renamed from: a, reason: contains not printable characters */
    private void m۱۰۲۷۹a(Cb<ComponentCallbacksCf> cb) {
        int i2 = this.f۱۰۲۴۶n;
        if (i2 < 1) {
            return;
        }
        int state = Math.min(i2, 3);
        int numAdded = this.f۱۰۲۳۸f.size();
        for (int i3 = 0; i3 < numAdded; i3++) {
            ComponentCallbacksCf fragment = this.f۱۰۲۳۸f.get(i3);
            if (fragment.f۱۰۱۵۶c < state) {
                m۱۰۳۱۵a(fragment, state, fragment.m۱۰۱۵۸q(), fragment.m۱۰۱۵۹r(), false);
                if (fragment.f۱۰۱۴۲K != null && !fragment.f۱۰۱۳۴C && fragment.f۱۰۱۴۷P) {
                    cb.add(fragment);
                }
            }
        }
    }

    /* renamed from: C, reason: contains not printable characters */
    private void m۱۰۲۷۴C() {
        if (this.f۱۰۲۳۲D != null) {
            while (!this.f۱۰۲۳۲D.isEmpty()) {
                this.f۱۰۲۳۲D.remove(0).m۱۰۳۹۰d();
            }
        }
    }

    /* renamed from: B, reason: contains not printable characters */
    private void m۱۰۲۷۳B() {
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        int numFragments = sparseArray == null ? 0 : sparseArray.size();
        for (int i2 = 0; i2 < numFragments; i2++) {
            ComponentCallbacksCf fragment = this.f۱۰۲۳۹g.valueAt(i2);
            if (fragment != null) {
                if (fragment.m۱۰۱۳۹g() != null) {
                    int stateAfterAnimating = fragment.m۱۰۱۶۷z();
                    View animatingAway = fragment.m۱۰۱۳۹g();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.m۱۰۱۰۵a((View) null);
                    m۱۰۳۱۵a(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.m۱۰۱۴۲h() != null) {
                    fragment.m۱۰۱۴۲h().end();
                }
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۱۰۲۹۳b(ArrayList<Cc> arrayList, ArrayList<Boolean> isPop) {
        boolean didSomething = false;
        synchronized (this) {
            if (this.f۱۰۲۳۵c != null && this.f۱۰۲۳۵c.size() != 0) {
                int numActions = this.f۱۰۲۳۵c.size();
                for (int i2 = 0; i2 < numActions; i2++) {
                    didSomething |= this.f۱۰۲۳۵c.get(i2).mo۱۰۳۸۶a(arrayList, isPop);
                }
                this.f۱۰۲۳۵c.clear();
                this.f۱۰۲۴۷o.m۱۰۲۴۲e().removeCallbacks(this.f۱۰۲۳۴F);
                return didSomething;
            }
            return false;
        }
    }

    /* renamed from: n, reason: contains not printable characters */
    void m۱۰۳۷۱n() {
        if (this.f۱۰۲۵۶x) {
            this.f۱۰۲۵۶x = false;
            m۱۰۳۸۴x();
        }
    }

    /* renamed from: s, reason: contains not printable characters */
    void m۱۰۳۷۹s() {
        if (this.f۱۰۲۴۴l != null) {
            for (int i2 = 0; i2 < this.f۱۰۲۴۴l.size(); i2++) {
                this.f۱۰۲۴۴l.get(i2).m۱۰۲۷۱a();
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۳۱۳a(Cc state) {
        if (this.f۱۰۲۴۰h == null) {
            this.f۱۰۲۴۰h = new ArrayList<>();
        }
        this.f۱۰۲۴۰h.add(state);
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean m۱۰۳۲۷a(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop, String name, int id, int flags) {
        ArrayList<Cc> arrayList2 = this.f۱۰۲۴۰h;
        if (arrayList2 == null) {
            return false;
        }
        if (name == null && id < 0 && (flags & 1) == 0) {
            int last = arrayList2.size() - 1;
            if (last < 0) {
                return false;
            }
            arrayList.add(this.f۱۰۲۴۰h.remove(last));
            isRecordPop.add(true);
        } else {
            int index = -1;
            if (name != null || id >= 0) {
                index = this.f۱۰۲۴۰h.size() - 1;
                while (index >= 0) {
                    Cc bss = this.f۱۰۲۴۰h.get(index);
                    if ((name != null && name.equals(bss.m۱۰۰۲۷f())) || (id >= 0 && id == bss.f۱۰۰۹۳l)) {
                        break;
                    }
                    index--;
                }
                if (index < 0) {
                    return false;
                }
                if ((flags & 1) != 0) {
                    index--;
                    while (index >= 0) {
                        Cc bss2 = this.f۱۰۲۴۰h.get(index);
                        if ((name == null || !name.equals(bss2.m۱۰۰۲۷f())) && (id < 0 || id != bss2.f۱۰۰۹۳l)) {
                            break;
                        }
                        index--;
                    }
                }
            }
            if (index == this.f۱۰۲۴۰h.size() - 1) {
                return false;
            }
            for (int i2 = this.f۱۰۲۴۰h.size() - 1; i2 > index; i2--) {
                arrayList.add(this.f۱۰۲۴۰h.remove(i2));
                isRecordPop.add(true);
            }
        }
        return true;
    }

    /* renamed from: t, reason: contains not printable characters */
    Cm m۱۰۳۸۰t() {
        m۱۰۲۸۱a(this.f۱۰۲۳۳E);
        return this.f۱۰۲۳۳E;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۰۲۸۱a(Cm nonConfig) {
        if (nonConfig == null) {
            return;
        }
        List<ComponentCallbacksCf> list = nonConfig.m۱۰۳۹۳b();
        if (list != null) {
            for (ComponentCallbacksCf fragment : list) {
                fragment.f۱۰۱۳۷F = true;
            }
        }
        List<Cm> list2 = nonConfig.m۱۰۳۹۲a();
        if (list2 != null) {
            for (Cm child : list2) {
                m۱۰۲۸۱a(child);
            }
        }
    }

    /* renamed from: v, reason: contains not printable characters */
    void m۱۰۳۸۲v() {
        Cm child;
        ArrayList<Fragment> fragments = null;
        ArrayList<FragmentManagerNonConfig> childFragments = null;
        ArrayList<ViewModelStore> viewModelStores = null;
        if (this.f۱۰۲۳۹g != null) {
            for (int i2 = 0; i2 < this.f۱۰۲۳۹g.size(); i2++) {
                ComponentCallbacksCf f2 = this.f۱۰۲۳۹g.valueAt(i2);
                if (f2 != null) {
                    if (f2.f۱۰۱۳۶E) {
                        if (fragments == null) {
                            fragments = new ArrayList<>();
                        }
                        fragments.add(f2);
                        ComponentCallbacksCf componentCallbacksCf = f2.f۱۰۱۶۳j;
                        f2.f۱۰۱۶۴k = componentCallbacksCf != null ? componentCallbacksCf.f۱۰۱۶۰g : -1;
                        if (f۱۰۲۲۵G) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + f2);
                        }
                    }
                    LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = f2.f۱۰۱۷۵v;
                    if (layoutInflaterFactory2Cl != null) {
                        layoutInflaterFactory2Cl.m۱۰۳۸۲v();
                        child = f2.f۱۰۱۷۵v.f۱۰۲۳۳E;
                    } else {
                        child = f2.f۱۰۱۷۶w;
                    }
                    if (childFragments == null && child != null) {
                        childFragments = new ArrayList<>(this.f۱۰۲۳۹g.size());
                        for (int j2 = 0; j2 < i2; j2++) {
                            childFragments.add(null);
                        }
                    }
                    if (childFragments != null) {
                        childFragments.add(child);
                    }
                    if (viewModelStores == null && f2.f۱۰۱۷۷x != null) {
                        viewModelStores = new ArrayList<>(this.f۱۰۲۳۹g.size());
                        for (int j3 = 0; j3 < i2; j3++) {
                            viewModelStores.add(null);
                        }
                    }
                    if (viewModelStores != null) {
                        viewModelStores.add(f2.f۱۰۱۷۷x);
                    }
                }
            }
        }
        if (fragments == null && childFragments == null && viewModelStores == null) {
            this.f۱۰۲۳۳E = null;
        } else {
            this.f۱۰۲۳۳E = new Cm(fragments, childFragments, viewModelStores);
        }
    }

    /* renamed from: n, reason: contains not printable characters */
    void m۱۰۳۷۲n(ComponentCallbacksCf f2) {
        if (f2.f۱۰۱۴۳L == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.f۱۰۲۳۱C;
        if (sparseArray == null) {
            this.f۱۰۲۳۱C = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        f2.f۱۰۱۴۳L.saveHierarchyState(this.f۱۰۲۳۱C);
        if (this.f۱۰۲۳۱C.size() > 0) {
            f2.f۱۰۱۵۸e = this.f۱۰۲۳۱C;
            this.f۱۰۲۳۱C = null;
        }
    }

    /* renamed from: m, reason: contains not printable characters */
    Bundle m۱۰۳۶۹m(ComponentCallbacksCf f2) {
        Bundle result = null;
        if (this.f۱۰۲۳۰B == null) {
            this.f۱۰۲۳۰B = new Bundle();
        }
        f2.m۱۰۱۴۸j(this.f۱۰۲۳۰B);
        m۱۰۳۴۶d(f2, this.f۱۰۲۳۰B, false);
        if (!this.f۱۰۲۳۰B.isEmpty()) {
            result = this.f۱۰۲۳۰B;
            this.f۱۰۲۳۰B = null;
        }
        if (f2.f۱۰۱۴۲K != null) {
            m۱۰۳۷۲n(f2);
        }
        if (f2.f۱۰۱۵۸e != null) {
            if (result == null) {
                result = new Bundle();
            }
            result.putSparseParcelableArray("android:view_state", f2.f۱۰۱۵۸e);
        }
        if (!f2.f۱۰۱۴۵N) {
            if (result == null) {
                result = new Bundle();
            }
            result.putBoolean("android:user_visible_hint", f2.f۱۰۱۴۵N);
        }
        return result;
    }

    /* renamed from: u, reason: contains not printable characters */
    Parcelable m۱۰۳۸۱u() {
        int N;
        m۱۰۲۷۴C();
        m۱۰۲۷۳B();
        m۱۰۳۷۴o();
        this.f۱۰۲۵۲t = true;
        this.f۱۰۲۳۳E = null;
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int N2 = this.f۱۰۲۳۹g.size();
        Co[] active = new Co[N2];
        boolean haveFragments = false;
        for (int i2 = 0; i2 < N2; i2++) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۹g.valueAt(i2);
            if (f2 != null) {
                if (f2.f۱۰۱۶۰g < 0) {
                    m۱۰۲۸۳a(new IllegalStateException("Failure saving state: active " + f2 + " has cleared index: " + f2.f۱۰۱۶۰g));
                    throw null;
                }
                haveFragments = true;
                Co fs = new Co(f2);
                active[i2] = fs;
                if (f2.f۱۰۱۵۶c > 0 && fs.f۱۰۳۱۰m == null) {
                    fs.f۱۰۳۱۰m = m۱۰۳۶۹m(f2);
                    ComponentCallbacksCf componentCallbacksCf = f2.f۱۰۱۶۳j;
                    if (componentCallbacksCf != null) {
                        if (componentCallbacksCf.f۱۰۱۶۰g < 0) {
                            m۱۰۲۸۳a(new IllegalStateException("Failure saving state: " + f2 + " has target not in fragment manager: " + f2.f۱۰۱۶۳j));
                            throw null;
                        }
                        if (fs.f۱۰۳۱۰m == null) {
                            fs.f۱۰۳۱۰m = new Bundle();
                        }
                        mo۱۰۳۱۱a(fs.f۱۰۳۱۰m, "android:target_state", f2.f۱۰۱۶۳j);
                        int i3 = f2.f۱۰۱۶۵l;
                        if (i3 != 0) {
                            fs.f۱۰۳۱۰m.putInt("android:target_req_state", i3);
                        }
                    }
                } else {
                    fs.f۱۰۳۱۰m = f2.f۱۰۱۵۷d;
                }
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "Saved state of " + f2 + ": " + fs.f۱۰۳۱۰m);
                }
            }
        }
        if (!haveFragments) {
            if (f۱۰۲۲۵G) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int[] added = null;
        Cd[] backStack = null;
        int N3 = this.f۱۰۲۳۸f.size();
        if (N3 > 0) {
            added = new int[N3];
            for (int i4 = 0; i4 < N3; i4++) {
                added[i4] = this.f۱۰۲۳۸f.get(i4).f۱۰۱۶۰g;
                if (added[i4] < 0) {
                    m۱۰۲۸۳a(new IllegalStateException("Failure saving state: active " + this.f۱۰۲۳۸f.get(i4) + " has cleared index: " + added[i4]));
                    throw null;
                }
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i4 + ": " + this.f۱۰۲۳۸f.get(i4));
                }
            }
        }
        ArrayList<Cc> arrayList = this.f۱۰۲۴۰h;
        if (arrayList != null && (N = arrayList.size()) > 0) {
            backStack = new Cd[N];
            for (int i5 = 0; i5 < N; i5++) {
                backStack[i5] = new Cd(this.f۱۰۲۴۰h.get(i5));
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.f۱۰۲۴۰h.get(i5));
                }
            }
        }
        Cn fms = new Cn();
        fms.f۱۰۲۹۵c = active;
        fms.f۱۰۲۹۶d = added;
        fms.f۱۰۲۹۷e = backStack;
        ComponentCallbacksCf componentCallbacksCf2 = this.f۱۰۲۵۰r;
        if (componentCallbacksCf2 != null) {
            fms.f۱۰۲۹۸f = componentCallbacksCf2.f۱۰۱۶۰g;
        }
        fms.f۱۰۲۹۹g = this.f۱۰۲۳۷e;
        m۱۰۳۸۲v();
        return fms;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۳۱۲a(Parcelable state, Cm nonConfig) {
        List<Cp> list;
        List<Cm> list2;
        Cp viewModelStore;
        if (state == null) {
            return;
        }
        Cn fms = (Cn) state;
        if (fms.f۱۰۲۹۵c == null) {
            return;
        }
        if (nonConfig == null) {
            list = null;
            list2 = null;
        } else {
            List<ComponentCallbacksCf> list3 = nonConfig.m۱۰۳۹۳b();
            List<Cm> list4 = nonConfig.m۱۰۳۹۲a();
            List<Cp> list5 = nonConfig.m۱۰۳۹۴c();
            int count = list3 != null ? list3.size() : 0;
            for (int i2 = 0; i2 < count; i2++) {
                ComponentCallbacksCf f2 = list3.get(i2);
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "restoreAllState: re-attaching retained " + f2);
                }
                int index = 0;
                while (true) {
                    Co[] coArr = fms.f۱۰۲۹۵c;
                    if (index >= coArr.length || coArr[index].f۱۰۳۰۱d == f2.f۱۰۱۶۰g) {
                        break;
                    } else {
                        index++;
                    }
                }
                Co[] coArr2 = fms.f۱۰۲۹۵c;
                if (index == coArr2.length) {
                    m۱۰۲۸۳a(new IllegalStateException("Could not find active fragment with index " + f2.f۱۰۱۶۰g));
                    throw null;
                }
                Co fs = coArr2[index];
                fs.f۱۰۳۱۱n = f2;
                f2.f۱۰۱۵۸e = null;
                f2.f۱۰۱۷۲s = 0;
                f2.f۱۰۱۶۹p = false;
                f2.f۱۰۱۶۶m = false;
                f2.f۱۰۱۶۳j = null;
                Bundle bundle = fs.f۱۰۳۱۰m;
                if (bundle != null) {
                    bundle.setClassLoader(this.f۱۰۲۴۷o.m۱۰۲۴۰c().getClassLoader());
                    f2.f۱۰۱۵۸e = fs.f۱۰۳۱۰m.getSparseParcelableArray("android:view_state");
                    f2.f۱۰۱۵۷d = fs.f۱۰۳۱۰m;
                }
            }
            list = list5;
            list2 = list4;
        }
        this.f۱۰۲۳۹g = new SparseArray<>(fms.f۱۰۲۹۵c.length);
        int i3 = 0;
        while (true) {
            Co[] coArr3 = fms.f۱۰۲۹۵c;
            if (i3 >= coArr3.length) {
                break;
            }
            Co fs2 = coArr3[i3];
            if (fs2 != null) {
                Cm childNonConfig = null;
                if (list2 != null && i3 < list2.size()) {
                    childNonConfig = list2.get(i3);
                }
                if (list != null && i3 < list.size()) {
                    Cp viewModelStore2 = list.get(i3);
                    viewModelStore = viewModelStore2;
                } else {
                    viewModelStore = null;
                }
                ComponentCallbacksCf f3 = fs2.m۱۰۳۹۵a(this.f۱۰۲۴۷o, this.f۱۰۲۴۸p, this.f۱۰۲۴۹q, childNonConfig, viewModelStore);
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "restoreAllState: active #" + i3 + ": " + f3);
                }
                this.f۱۰۲۳۹g.put(f3.f۱۰۱۶۰g, f3);
                fs2.f۱۰۳۱۱n = null;
            }
            i3++;
        }
        if (nonConfig != null) {
            List<ComponentCallbacksCf> list6 = nonConfig.m۱۰۳۹۳b();
            int count2 = list6 != null ? list6.size() : 0;
            for (int i4 = 0; i4 < count2; i4++) {
                ComponentCallbacksCf f4 = list6.get(i4);
                int i5 = f4.f۱۰۱۶۴k;
                if (i5 >= 0) {
                    f4.f۱۰۱۶۳j = this.f۱۰۲۳۹g.get(i5);
                    if (f4.f۱۰۱۶۳j == null) {
                        Log.w("FragmentManager", "Re-attaching retained fragment " + f4 + " target no longer exists: " + f4.f۱۰۱۶۴k);
                    }
                }
            }
        }
        this.f۱۰۲۳۸f.clear();
        if (fms.f۱۰۲۹۶d != null) {
            int i6 = 0;
            while (true) {
                int[] iArr = fms.f۱۰۲۹۶d;
                if (i6 >= iArr.length) {
                    break;
                }
                ComponentCallbacksCf f5 = this.f۱۰۲۳۹g.get(iArr[i6]);
                if (f5 == null) {
                    m۱۰۲۸۳a(new IllegalStateException("No instantiated fragment for index #" + fms.f۱۰۲۹۶d[i6]));
                    throw null;
                }
                f5.f۱۰۱۶۶m = true;
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "restoreAllState: added #" + i6 + ": " + f5);
                }
                if (this.f۱۰۲۳۸f.contains(f5)) {
                    throw new IllegalStateException("Already added!");
                }
                synchronized (this.f۱۰۲۳۸f) {
                    this.f۱۰۲۳۸f.add(f5);
                }
                i6++;
            }
        }
        Cd[] cdArr = fms.f۱۰۲۹۷e;
        if (cdArr != null) {
            this.f۱۰۲۴۰h = new ArrayList<>(cdArr.length);
            int i7 = 0;
            while (true) {
                Cd[] cdArr2 = fms.f۱۰۲۹۷e;
                if (i7 >= cdArr2.length) {
                    break;
                }
                Cc bse = cdArr2[i7].m۱۰۰۳۳a(this);
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + bse.f۱۰۰۹۳l + "): " + bse);
                    Ce logw = new Ce("FragmentManager");
                    PrintWriter pw = new PrintWriter(logw);
                    bse.m۱۰۰۱۶a("  ", pw, false);
                    pw.close();
                }
                this.f۱۰۲۴۰h.add(bse);
                int i8 = bse.f۱۰۰۹۳l;
                if (i8 >= 0) {
                    m۱۰۳۰۸a(i8, bse);
                }
                i7++;
            }
        } else {
            this.f۱۰۲۴۰h = null;
        }
        int i9 = fms.f۱۰۲۹۸f;
        if (i9 >= 0) {
            this.f۱۰۲۵۰r = this.f۱۰۲۳۹g.get(i9);
        }
        this.f۱۰۲۳۷e = fms.f۱۰۲۹۹g;
    }

    /* renamed from: y, reason: contains not printable characters */
    private void m۱۰۲۹۹y() {
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        if (sparseArray != null) {
            for (int i2 = sparseArray.size() - 1; i2 >= 0; i2--) {
                if (this.f۱۰۲۳۹g.valueAt(i2) == null) {
                    SparseArray<ComponentCallbacksCf> sparseArray2 = this.f۱۰۲۳۹g;
                    sparseArray2.delete(sparseArray2.keyAt(i2));
                }
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۳۲۰a(AbstractCj host, AbstractCh container, ComponentCallbacksCf parent) {
        if (this.f۱۰۲۴۷o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f۱۰۲۴۷o = host;
        this.f۱۰۲۴۸p = container;
        this.f۱۰۲۴۹q = parent;
    }

    /* renamed from: r, reason: contains not printable characters */
    public void m۱۰۳۷۸r() {
        this.f۱۰۲۳۳E = null;
        this.f۱۰۲۵۲t = false;
        this.f۱۰۲۵۳u = false;
        int addedCount = this.f۱۰۲۳۸f.size();
        for (int i2 = 0; i2 < addedCount; i2++) {
            ComponentCallbacksCf fragment = this.f۱۰۲۳۸f.get(i2);
            if (fragment != null) {
                fragment.m۱۰۰۶۴J();
            }
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    public void m۱۰۳۵۲f() {
        this.f۱۰۲۵۲t = false;
        this.f۱۰۲۵۳u = false;
        m۱۰۲۹۶d(1);
    }

    /* renamed from: e, reason: contains not printable characters */
    public void m۱۰۳۴۹e() {
        this.f۱۰۲۵۲t = false;
        this.f۱۰۲۵۳u = false;
        m۱۰۲۹۶d(2);
    }

    /* renamed from: l, reason: contains not printable characters */
    public void m۱۰۳۶۷l() {
        this.f۱۰۲۵۲t = false;
        this.f۱۰۲۵۳u = false;
        m۱۰۲۹۶d(3);
    }

    /* renamed from: k, reason: contains not printable characters */
    public void m۱۰۳۶۵k() {
        this.f۱۰۲۵۲t = false;
        this.f۱۰۲۵۳u = false;
        m۱۰۲۹۶d(4);
    }

    /* renamed from: j, reason: contains not printable characters */
    public void m۱۰۳۶۳j() {
        m۱۰۲۹۶d(3);
    }

    /* renamed from: m, reason: contains not printable characters */
    public void m۱۰۳۷۰m() {
        this.f۱۰۲۵۳u = true;
        m۱۰۲۹۶d(2);
    }

    /* renamed from: h, reason: contains not printable characters */
    public void m۱۰۳۵۸h() {
        m۱۰۲۹۶d(1);
    }

    /* renamed from: g, reason: contains not printable characters */
    public void m۱۰۳۵۵g() {
        this.f۱۰۲۵۴v = true;
        m۱۰۳۷۴o();
        m۱۰۲۹۶d(0);
        this.f۱۰۲۴۷o = null;
        this.f۱۰۲۴۸p = null;
        this.f۱۰۲۴۹q = null;
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۰۲۹۶d(int nextState) {
        try {
            this.f۱۰۲۳۶d = true;
            m۱۰۳۰۹a(nextState, false);
            this.f۱۰۲۳۶d = false;
            m۱۰۳۷۴o();
        } catch (Throwable th) {
            this.f۱۰۲۳۶d = false;
            throw th;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۳۲۴a(boolean isInMultiWindowMode) {
        for (int i2 = this.f۱۰۲۳۸f.size() - 1; i2 >= 0; i2--) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۸f.get(i2);
            if (f2 != null) {
                f2.m۱۰۱۳۰d(isInMultiWindowMode);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۳۳۷b(boolean isInPictureInPictureMode) {
        for (int i2 = this.f۱۰۲۳۸f.size() - 1; i2 >= 0; i2--) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۸f.get(i2);
            if (f2 != null) {
                f2.m۱۰۱۳۴e(isInPictureInPictureMode);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۳۱۰a(Configuration newConfig) {
        for (int i2 = 0; i2 < this.f۱۰۲۳۸f.size(); i2++) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۸f.get(i2);
            if (f2 != null) {
                f2.m۱۰۰۹۹a(newConfig);
            }
        }
    }

    /* renamed from: i, reason: contains not printable characters */
    public void m۱۰۳۶۱i() {
        for (int i2 = 0; i2 < this.f۱۰۲۳۸f.size(); i2++) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۸f.get(i2);
            if (f2 != null) {
                f2.m۱۰۰۷۷W();
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۳۲۵a(Menu menu, MenuInflater inflater) {
        if (this.f۱۰۲۴۶n < 1) {
            return false;
        }
        boolean show = false;
        ArrayList<ComponentCallbacksCf> arrayList = null;
        for (int i2 = 0; i2 < this.f۱۰۲۳۸f.size(); i2++) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۸f.get(i2);
            if (f2 != null && f2.m۱۰۱۱۷b(menu, inflater)) {
                show = true;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(f2);
            }
        }
        if (this.f۱۰۲۴۱i != null) {
            for (int i3 = 0; i3 < this.f۱۰۲۴۱i.size(); i3++) {
                ComponentCallbacksCf f3 = this.f۱۰۲۴۱i.get(i3);
                if (arrayList == null || !arrayList.contains(f3)) {
                    f3.m۱۰۰۶۶L();
                }
            }
        }
        this.f۱۰۲۴۱i = arrayList;
        return show;
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۰۳۳۸b(Menu menu) {
        if (this.f۱۰۲۴۶n < 1) {
            return false;
        }
        boolean show = false;
        for (int i2 = 0; i2 < this.f۱۰۲۳۸f.size(); i2++) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۸f.get(i2);
            if (f2 != null && f2.m۱۰۱۳۱d(menu)) {
                show = true;
            }
        }
        return show;
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۰۳۳۹b(MenuItem item) {
        if (this.f۱۰۲۴۶n < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f۱۰۲۳۸f.size(); i2++) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۸f.get(i2);
            if (f2 != null && f2.m۱۰۱۳۲d(item)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۳۲۶a(MenuItem item) {
        if (this.f۱۰۲۴۶n < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f۱۰۲۳۸f.size(); i2++) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۸f.get(i2);
            if (f2 != null && f2.m۱۰۱۲۵c(item)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۳۲۲a(Menu menu) {
        if (this.f۱۰۲۴۶n < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.f۱۰۲۳۸f.size(); i2++) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۸f.get(i2);
            if (f2 != null) {
                f2.m۱۰۱۲۳c(menu);
            }
        }
    }

    /* renamed from: o, reason: contains not printable characters */
    public void m۱۰۳۷۳o(ComponentCallbacksCf f2) {
        if (f2 != null && (this.f۱۰۲۳۹g.get(f2.f۱۰۱۶۰g) != f2 || (f2.f۱۰۱۷۴u != null && f2.m۱۰۱۵۷p() != this))) {
            throw new IllegalArgumentException("Fragment " + f2 + " is not an active fragment of FragmentManager " + this);
        }
        this.f۱۰۲۵۰r = f2;
    }

    /* renamed from: q, reason: contains not printable characters */
    public ComponentCallbacksCf m۱۰۳۷۷q() {
        return this.f۱۰۲۵۰r;
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۰۳۳۳b(ComponentCallbacksCf f2, Context context, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۳۳b(f2, context, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۶۲b(this, f2, context);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۳۱۶a(ComponentCallbacksCf f2, Context context, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۱۶a(f2, context, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۵۸a(this, f2, context);
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۰۳۴۱c(ComponentCallbacksCf f2, Bundle savedInstanceState, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۴۱c(f2, savedInstanceState, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۶۵c(this, f2, savedInstanceState);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۰۳۳۴b(ComponentCallbacksCf f2, Bundle savedInstanceState, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۳۴b(f2, savedInstanceState, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۶۳b(this, f2, savedInstanceState);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۳۱۷a(ComponentCallbacksCf f2, Bundle savedInstanceState, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۱۷a(f2, savedInstanceState, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۵۹a(this, f2, savedInstanceState);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۳۱۸a(ComponentCallbacksCf f2, View v, Bundle savedInstanceState, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۱۸a(f2, v, savedInstanceState, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۶۰a(this, f2, v, savedInstanceState);
            }
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    void m۱۰۳۵۴f(ComponentCallbacksCf f2, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۵۴f(f2, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۶۸e(this, f2);
            }
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    void m۱۰۳۵۱e(ComponentCallbacksCf f2, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۵۱e(f2, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۶۶d(this, f2);
            }
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    void m۱۰۳۴۷d(ComponentCallbacksCf f2, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۴۷d(f2, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۶۴c(this, f2);
            }
        }
    }

    /* renamed from: g, reason: contains not printable characters */
    void m۱۰۳۵۷g(ComponentCallbacksCf f2, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۵۷g(f2, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۶۹f(this, f2);
            }
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    void m۱۰۳۴۶d(ComponentCallbacksCf f2, Bundle outState, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۴۶d(f2, outState, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۶۷d(this, f2, outState);
            }
        }
    }

    /* renamed from: h, reason: contains not printable characters */
    void m۱۰۳۶۰h(ComponentCallbacksCf f2, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۶۰h(f2, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۷۰g(this, f2);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۰۳۳۵b(ComponentCallbacksCf f2, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۳۵b(f2, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۵۷a(this, f2);
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۰۳۴۲c(ComponentCallbacksCf f2, boolean onlyRecursive) {
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۲۴۹q;
        if (componentCallbacksCf != null) {
            AbstractCk parentManager = componentCallbacksCf.m۱۰۱۵۷p();
            if (parentManager instanceof LayoutInflaterFactory2Cl) {
                ((LayoutInflaterFactory2Cl) parentManager).m۱۰۳۴۲c(f2, true);
            }
        }
        Iterator<j> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۰۲۶۱b(this, f2);
            }
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    public static int m۱۰۲۹۷e(int transit) {
        if (transit == 4097) {
            return 8194;
        }
        if (transit == 4099) {
            return 4099;
        }
        if (transit != 8194) {
            return 0;
        }
        return 4097;
    }

    /* renamed from: b, reason: contains not printable characters */
    public static int m۱۰۲۸۹b(int transit, boolean enter) {
        if (transit == 4097) {
            int animAttr = enter ? 1 : 2;
            return animAttr;
        }
        if (transit == 4099) {
            int animAttr2 = enter ? 5 : 6;
            return animAttr2;
        }
        if (transit != 8194) {
            return -1;
        }
        int animAttr3 = enter ? 3 : 4;
        return animAttr3;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        String fname;
        ComponentCallbacksCf fragment;
        if (!"fragment".equals(name)) {
            return null;
        }
        String fname2 = attrs.getAttributeValue(null, "class");
        TypedArray a2 = context.obtainStyledAttributes(attrs, k.f۱۰۲۸۴a);
        if (fname2 != null) {
            fname = fname2;
        } else {
            fname = a2.getString(0);
        }
        int id = a2.getResourceId(1, -1);
        String tag = a2.getString(2);
        a2.recycle();
        if (!ComponentCallbacksCf.m۱۰۰۵۳a(this.f۱۰۲۴۷o.m۱۰۲۴۰c(), fname)) {
            return null;
        }
        int containerId = parent != null ? parent.getId() : 0;
        if (containerId == -1 && id == -1 && tag == null) {
            throw new IllegalArgumentException(attrs.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + fname);
        }
        ComponentCallbacksCf fragment2 = id != -1 ? m۱۰۳۰۲a(id) : null;
        if (fragment2 == null && tag != null) {
            fragment2 = mo۱۰۳۰۴a(tag);
        }
        if (fragment2 == null && containerId != -1) {
            fragment2 = m۱۰۳۰۲a(containerId);
        }
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(id) + " fname=" + fname + " existing=" + fragment2);
        }
        if (fragment2 == null) {
            ComponentCallbacksCf fragment3 = this.f۱۰۲۴۸p.mo۱۰۲۰۶a(context, fname, null);
            fragment3.f۱۰۱۶۸o = true;
            fragment3.f۱۰۱۷۹z = id != 0 ? id : containerId;
            fragment3.f۱۰۱۳۲A = containerId;
            fragment3.f۱۰۱۳۳B = tag;
            fragment3.f۱۰۱۶۹p = true;
            fragment3.f۱۰۱۷۳t = this;
            AbstractCj abstractCj = this.f۱۰۲۴۷o;
            fragment3.f۱۰۱۷۴u = abstractCj;
            fragment3.m۱۰۰۹۴a(abstractCj.m۱۰۲۴۰c(), attrs, fragment3.f۱۰۱۵۷d);
            m۱۰۳۱۹a(fragment3, true);
            fragment = fragment3;
        } else {
            if (fragment2.f۱۰۱۶۹p) {
                throw new IllegalArgumentException(attrs.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(id) + ", tag " + tag + ", or parent id 0x" + Integer.toHexString(containerId) + " with another fragment for " + fname);
            }
            fragment2.f۱۰۱۶۹p = true;
            AbstractCj abstractCj2 = this.f۱۰۲۴۷o;
            fragment2.f۱۰۱۷۴u = abstractCj2;
            if (!fragment2.f۱۰۱۳۷F) {
                fragment2.m۱۰۰۹۴a(abstractCj2.m۱۰۲۴۰c(), attrs, fragment2.f۱۰۱۵۷d);
            }
            fragment = fragment2;
        }
        if (this.f۱۰۲۴۶n < 1 && fragment.f۱۰۱۶۸o) {
            m۱۰۳۱۵a(fragment, 1, 0, 0, false);
        } else {
            m۱۰۳۶۴j(fragment);
        }
        View view = fragment.f۱۰۱۴۲K;
        if (view == null) {
            throw new IllegalStateException("Fragment " + fname + " did not create a view.");
        }
        if (id != 0) {
            view.setId(id);
        }
        if (fragment.f۱۰۱۴۲K.getTag() == null) {
            fragment.f۱۰۱۴۲K.setTag(tag);
        }
        return fragment.f۱۰۱۴۲K;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }

    /* renamed from: p, reason: contains not printable characters */
    LayoutInflater.Factory2 m۱۰۳۷۵p() {
        return this;
    }

    /* renamed from: android.support.v4.app.l$m */
    private class m implements l {

        /* renamed from: a, reason: contains not printable characters */
        final String f۱۰۲۸۵a;

        /* renamed from: b, reason: contains not printable characters */
        final int f۱۰۲۸۶b;

        /* renamed from: c, reason: contains not printable characters */
        final int f۱۰۲۸۷c;

        m(String name, int id, int flags) {
            this.f۱۰۲۸۵a = name;
            this.f۱۰۲۸۶b = id;
            this.f۱۰۲۸۷c = flags;
        }

        @Override // android.support.v4.app.LayoutInflaterFactory2Cl.l
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۰۳۸۶a(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop) {
            AbstractCk childManager;
            ComponentCallbacksCf componentCallbacksCf = LayoutInflaterFactory2Cl.this.f۱۰۲۵۰r;
            if (componentCallbacksCf != null && this.f۱۰۲۸۶b < 0 && this.f۱۰۲۸۵a == null && (childManager = componentCallbacksCf.m۱۰۰۷۳S()) != null && childManager.mo۱۰۳۴۸d()) {
                return false;
            }
            return LayoutInflaterFactory2Cl.this.m۱۰۳۲۷a(arrayList, isRecordPop, this.f۱۰۲۸۵a, this.f۱۰۲۸۶b, this.f۱۰۲۸۷c);
        }
    }

    /* renamed from: android.support.v4.app.l$n */
    static class n implements ComponentCallbacksCf.f {

        /* renamed from: a, reason: contains not printable characters */
        final boolean f۱۰۲۸۹a;

        /* renamed from: b, reason: contains not printable characters */
        final Cc f۱۰۲۹۰b;

        /* renamed from: c, reason: contains not printable characters */
        private int f۱۰۲۹۱c;

        n(Cc record, boolean isBack) {
            this.f۱۰۲۸۹a = isBack;
            this.f۱۰۲۹۰b = record;
        }

        @Override // android.support.v4.app.ComponentCallbacksCf.f
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۰۳۸۷a() {
            this.f۱۰۲۹۱c--;
            if (this.f۱۰۲۹۱c != 0) {
                return;
            }
            this.f۱۰۲۹۰b.f۱۰۰۸۲a.m۱۰۳۸۳w();
        }

        @Override // android.support.v4.app.ComponentCallbacksCf.f
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۰۳۸۸b() {
            this.f۱۰۲۹۱c++;
        }

        /* renamed from: e, reason: contains not printable characters */
        public boolean m۱۰۳۹۱e() {
            return this.f۱۰۲۹۱c == 0;
        }

        /* renamed from: d, reason: contains not printable characters */
        public void m۱۰۳۹۰d() {
            boolean canceled = this.f۱۰۲۹۱c > 0;
            LayoutInflaterFactory2Cl manager = this.f۱۰۲۹۰b.f۱۰۰۸۲a;
            int numAdded = manager.f۱۰۲۳۸f.size();
            for (int i = 0; i < numAdded; i++) {
                ComponentCallbacksCf fragment = manager.f۱۰۲۳۸f.get(i);
                fragment.m۱۰۱۰۰a((ComponentCallbacksCf.f) null);
                if (canceled && fragment.m۱۰۰۶۲H()) {
                    fragment.m۱۰۱۲۶c0();
                }
            }
            Cc cc = this.f۱۰۲۹۰b;
            cc.f۱۰۰۸۲a.m۱۰۳۱۴a(cc, this.f۱۰۲۸۹a, canceled ? false : true, true);
        }

        /* renamed from: c, reason: contains not printable characters */
        public void m۱۰۳۸۹c() {
            Cc cc = this.f۱۰۲۹۰b;
            cc.f۱۰۰۸۲a.m۱۰۳۱۴a(cc, this.f۱۰۲۸۹a, false, false);
        }
    }

    /* renamed from: android.support.v4.app.l$g */
    private static class g {

        /* renamed from: a, reason: contains not printable characters */
        public final Animation f۱۰۲۷۴a;

        /* renamed from: b, reason: contains not printable characters */
        public final Animator f۱۰۲۷۵b;

        g(Animation animation) {
            this.f۱۰۲۷۴a = animation;
            this.f۱۰۲۷۵b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        g(Animator animator) {
            this.f۱۰۲۷۴a = null;
            this.f۱۰۲۷۵b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.app.l$f */
    private static class f implements Animation.AnimationListener {

        /* renamed from: a, reason: contains not printable characters */
        private final Animation.AnimationListener f۱۰۲۷۳a;

        f(Animation.AnimationListener wrapped) {
            this.f۱۰۲۷۳a = wrapped;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f۱۰۲۷۳a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f۱۰۲۷۳a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f۱۰۲۷۳a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.l$e */
    private static class e extends f {

        /* renamed from: b, reason: contains not printable characters */
        View f۱۰۲۷۱b;

        e(View v, Animation.AnimationListener listener) {
            super(listener);
            this.f۱۰۲۷۱b = v;
        }

        /* renamed from: android.support.v4.app.l$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f۱۰۲۷۱b.setLayerType(0, null);
            }
        }

        @Override // android.support.v4.app.LayoutInflaterFactory2Cl.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (Cu.m۱۰۹۵۷x(this.f۱۰۲۷۱b) || Build.VERSION.SDK_INT >= 24) {
                this.f۱۰۲۷۱b.post(new a());
            } else {
                this.f۱۰۲۷۱b.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: android.support.v4.app.l$h */
    private static class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        View f۱۰۲۷۶a;

        h(View v) {
            this.f۱۰۲۷۶a = v;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            this.f۱۰۲۷۶a.setLayerType(2, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.f۱۰۲۷۶a.setLayerType(0, null);
            animation.removeListener(this);
        }
    }

    /* renamed from: android.support.v4.app.l$i */
    private static class i extends AnimationSet implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        private final ViewGroup f۱۰۲۷۷c;

        /* renamed from: d, reason: contains not printable characters */
        private final View f۱۰۲۷۸d;

        /* renamed from: e, reason: contains not printable characters */
        private boolean f۱۰۲۷۹e;

        /* renamed from: f, reason: contains not printable characters */
        private boolean f۱۰۲۸۰f;

        /* renamed from: g, reason: contains not printable characters */
        private boolean f۱۰۲۸۱g;

        i(Animation animation, ViewGroup parent, View child) {
            super(false);
            this.f۱۰۲۸۱g = true;
            this.f۱۰۲۷۷c = parent;
            this.f۱۰۲۷۸d = child;
            addAnimation(animation);
            this.f۱۰۲۷۷c.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long currentTime, Transformation t) {
            this.f۱۰۲۸۱g = true;
            if (this.f۱۰۲۷۹e) {
                return true ^ this.f۱۰۲۸۰f;
            }
            boolean more = super.getTransformation(currentTime, t);
            if (!more) {
                this.f۱۰۲۷۹e = true;
                ViewTreeObserverOnPreDrawListenerCa0.m۹۹۹۶a(this.f۱۰۲۷۷c, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long currentTime, Transformation outTransformation, float scale) {
            this.f۱۰۲۸۱g = true;
            if (this.f۱۰۲۷۹e) {
                return true ^ this.f۱۰۲۸۰f;
            }
            boolean more = super.getTransformation(currentTime, outTransformation, scale);
            if (!more) {
                this.f۱۰۲۷۹e = true;
                ViewTreeObserverOnPreDrawListenerCa0.m۹۹۹۶a(this.f۱۰۲۷۷c, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f۱۰۲۷۹e && this.f۱۰۲۸۱g) {
                this.f۱۰۲۸۱g = false;
                this.f۱۰۲۷۷c.post(this);
            } else {
                this.f۱۰۲۷۷c.endViewTransition(this.f۱۰۲۷۸d);
                this.f۱۰۲۸۰f = true;
            }
        }
    }
}
