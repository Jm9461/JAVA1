package android.support.p۰۴۳v4.app;

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
import android.support.p۰۴۳v4.app.AbstractCk;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import android.support.p۰۴۳v4.view.Cu;
import android.support.v4.util.ArraySet;
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

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.l  reason: invalid class name */
public final class LayoutInflater$Factory2Cl extends AbstractCk implements LayoutInflater.Factory2 {

    /* renamed from: G  reason: contains not printable characters */
    static boolean f۱۰۲۲۵G = false;

    /* renamed from: H  reason: contains not printable characters */
    static Field f۱۰۲۲۶H = null;

    /* renamed from: I  reason: contains not printable characters */
    static final Interpolator f۱۰۲۲۷I = new DecelerateInterpolator(2.5f);

    /* renamed from: J  reason: contains not printable characters */
    static final Interpolator f۱۰۲۲۸J = new DecelerateInterpolator(1.5f);

    /* renamed from: A  reason: contains not printable characters */
    ArrayList<ComponentCallbacksCf> f۱۰۲۲۹A;

    /* renamed from: B  reason: contains not printable characters */
    Bundle f۱۰۲۳۰B = null;

    /* renamed from: C  reason: contains not printable characters */
    SparseArray<Parcelable> f۱۰۲۳۱C = null;

    /* renamed from: D  reason: contains not printable characters */
    ArrayList<Cn> f۱۰۲۳۲D;

    /* renamed from: E  reason: contains not printable characters */
    Cm f۱۰۲۳۳E;

    /* renamed from: F  reason: contains not printable characters */
    Runnable f۱۰۲۳۴F = new RunnableCa();

    /* renamed from: c  reason: contains not printable characters */
    ArrayList<AbstractCl> f۱۰۲۳۵c;

    /* renamed from: d  reason: contains not printable characters */
    boolean f۱۰۲۳۶d;

    /* renamed from: e  reason: contains not printable characters */
    int f۱۰۲۳۷e = 0;

    /* renamed from: f  reason: contains not printable characters */
    final ArrayList<ComponentCallbacksCf> f۱۰۲۳۸f = new ArrayList<>();

    /* renamed from: g  reason: contains not printable characters */
    SparseArray<ComponentCallbacksCf> f۱۰۲۳۹g;

    /* renamed from: h  reason: contains not printable characters */
    ArrayList<Cc> f۱۰۲۴۰h;

    /* renamed from: i  reason: contains not printable characters */
    ArrayList<ComponentCallbacksCf> f۱۰۲۴۱i;

    /* renamed from: j  reason: contains not printable characters */
    ArrayList<Cc> f۱۰۲۴۲j;

    /* renamed from: k  reason: contains not printable characters */
    ArrayList<Integer> f۱۰۲۴۳k;

    /* renamed from: l  reason: contains not printable characters */
    ArrayList<AbstractCk.AbstractCc> f۱۰۲۴۴l;

    /* renamed from: m  reason: contains not printable characters */
    private final CopyOnWriteArrayList<Cj> f۱۰۲۴۵m = new CopyOnWriteArrayList<>();

    /* renamed from: n  reason: contains not printable characters */
    int f۱۰۲۴۶n = 0;

    /* renamed from: o  reason: contains not printable characters */
    AbstractCj f۱۰۲۴۷o;

    /* renamed from: p  reason: contains not printable characters */
    AbstractCh f۱۰۲۴۸p;

    /* renamed from: q  reason: contains not printable characters */
    ComponentCallbacksCf f۱۰۲۴۹q;

    /* renamed from: r  reason: contains not printable characters */
    ComponentCallbacksCf f۱۰۲۵۰r;

    /* renamed from: s  reason: contains not printable characters */
    boolean f۱۰۲۵۱s;

    /* renamed from: t  reason: contains not printable characters */
    boolean f۱۰۲۵۲t;

    /* renamed from: u  reason: contains not printable characters */
    boolean f۱۰۲۵۳u;

    /* renamed from: v  reason: contains not printable characters */
    boolean f۱۰۲۵۴v;

    /* renamed from: w  reason: contains not printable characters */
    String f۱۰۲۵۵w;

    /* renamed from: x  reason: contains not printable characters */
    boolean f۱۰۲۵۶x;

    /* renamed from: y  reason: contains not printable characters */
    ArrayList<Cc> f۱۰۲۵۷y;

    /* renamed from: z  reason: contains not printable characters */
    ArrayList<Boolean> f۱۰۲۵۸z;

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.app.l$j  reason: invalid class name */
    public static final class Cj {

        /* renamed from: a  reason: contains not printable characters */
        final AbstractCk.AbstractCb f۱۰۲۸۲a;

        /* renamed from: b  reason: contains not printable characters */
        final boolean f۱۰۲۸۳b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.l$k  reason: invalid class name */
    public static class Ck {

        /* renamed from: a  reason: contains not printable characters */
        public static final int[] f۱۰۲۸۴a = {16842755, 16842960, 16842961};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.l$l  reason: invalid class name */
    public interface AbstractCl {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۲۴۵۵a(ArrayList<Cc> arrayList, ArrayList<Boolean> arrayList2);
    }

    LayoutInflater$Factory2Cl() {
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    /* renamed from: android.support.v4.app.l$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            LayoutInflater$Factory2Cl.this.m۱۲۴۴۴o();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۲۳۵۷a(Cg anim) {
        Animation animation = anim.f۱۰۲۷۴a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return m۱۲۳۵۶a(anim.f۱۰۲۷۵b);
        }
        List<Animation> anims = ((AnimationSet) animation).getAnimations();
        for (int i = 0; i < anims.size(); i++) {
            if (anims.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۲۳۵۶a(Animator anim) {
        PropertyValuesHolder[] values;
        if (anim == null) {
            return false;
        }
        if (anim instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) anim).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (anim instanceof AnimatorSet) {
            List<Animator> animList = ((AnimatorSet) anim).getChildAnimations();
            for (int i = 0; i < animList.size(); i++) {
                if (m۱۲۳۵۶a(animList.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    static boolean m۱۲۳۶۲b(View v, Cg anim) {
        if (v == null || anim == null || Build.VERSION.SDK_INT < 19 || v.getLayerType() != 0 || !Cu.m۱۳۰۲۵v(v) || !m۱۲۳۵۷a(anim)) {
            return false;
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۳۵۳a(RuntimeException ex) {
        Log.e("FragmentManager", ex.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter pw = new PrintWriter(new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ce("FragmentManager"));
        AbstractCj jVar = this.f۱۰۲۴۷o;
        if (jVar != null) {
            try {
                jVar.m۱۲۳۰۷a("  ", (FileDescriptor) null, pw, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                m۱۲۳۹۳a("  ", (FileDescriptor) null, pw, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw ex;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCk
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCq m۱۲۳۷۶a() {
        return new Cc(this);
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCk
    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۲۴۱۸d() {
        m۱۲۳۷۰z();
        return m۱۲۳۵۸a((String) null, -1, 0);
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCk
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۷۷a(int id, int flags) {
        if (id >= 0) {
            m۱۲۳۹۱a((AbstractCl) new Cm(null, id, flags), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + id);
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۲۳۵۸a(String name, int id, int flags) {
        AbstractCk childManager;
        m۱۲۴۴۴o();
        m۱۲۳۶۵c(true);
        ComponentCallbacksCf fVar = this.f۱۰۲۵۰r;
        if (fVar != null && id < 0 && name == null && (childManager = fVar.m۱۲۱۴۳S()) != null && childManager.m۱۲۳۲۶d()) {
            return true;
        }
        boolean executePop = m۱۲۳۹۷a(this.f۱۰۲۵۷y, this.f۱۰۲۵۸z, name, id, flags);
        if (executePop) {
            this.f۱۰۲۳۶d = true;
            try {
                m۱۲۳۶۴c(this.f۱۰۲۵۷y, this.f۱۰۲۵۸z);
            } finally {
                m۱۲۳۴۲A();
            }
        }
        m۱۲۴۴۱n();
        m۱۲۳۶۹y();
        return executePop;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCk
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۸۱a(Bundle bundle, String key, ComponentCallbacksCf fragment) {
        int i = fragment.f۱۰۱۶۰g;
        if (i >= 0) {
            bundle.putInt(key, i);
            return;
        }
        m۱۲۳۵۳a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCk
    /* renamed from: a  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۲۳۷۳a(Bundle bundle, String key) {
        int index = bundle.getInt(key, -1);
        if (index == -1) {
            return null;
        }
        ComponentCallbacksCf f = this.f۱۰۲۳۹g.get(index);
        if (f != null) {
            return f;
        }
        m۱۲۳۵۳a(new IllegalStateException("Fragment no longer exists for key " + key + ": index " + index));
        throw null;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCk
    /* renamed from: b  reason: contains not printable characters */
    public List<ComponentCallbacksCf> m۱۲۴۰۰b() {
        List<ComponentCallbacksCf> list;
        if (this.f۱۰۲۳۸f.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f۱۰۲۳۸f) {
            list = (List) this.f۱۰۲۳۸f.clone();
        }
        return list;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCk
    /* renamed from: a  reason: contains not printable characters */
    public ComponentCallbacksCf.Cg m۱۲۳۷۱a(ComponentCallbacksCf fragment) {
        Bundle result;
        if (fragment.f۱۰۱۶۰g < 0) {
            m۱۲۳۵۳a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
            throw null;
        } else if (fragment.f۱۰۱۵۶c <= 0 || (result = m۱۲۴۳۹m(fragment)) == null) {
            return null;
        } else {
            return new ComponentCallbacksCf.Cg(result);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cd.m۱۰۵۹۲a(fVar, sb);
        } else {
            p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cd.m۱۰۵۹۲a(this.f۱۰۲۴۷o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCk
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۹۳a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
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
            for (int i = 0; i < N5; i++) {
                ComponentCallbacksCf f = this.f۱۰۲۳۹g.valueAt(i);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i);
                writer.print(": ");
                writer.println(f);
                if (f != null) {
                    f.m۱۲۱۷۷a(innerPrefix, fd, writer, args);
                }
            }
        }
        int N6 = this.f۱۰۲۳۸f.size();
        if (N6 > 0) {
            writer.print(prefix);
            writer.println("Added Fragments:");
            for (int i2 = 0; i2 < N6; i2++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i2);
                writer.print(": ");
                writer.println(this.f۱۰۲۳۸f.get(i2).toString());
            }
        }
        ArrayList<ComponentCallbacksCf> arrayList = this.f۱۰۲۴۱i;
        if (arrayList != null && (N4 = arrayList.size()) > 0) {
            writer.print(prefix);
            writer.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < N4; i3++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i3);
                writer.print(": ");
                writer.println(this.f۱۰۲۴۱i.get(i3).toString());
            }
        }
        ArrayList<Cc> arrayList2 = this.f۱۰۲۴۰h;
        if (arrayList2 != null && (N3 = arrayList2.size()) > 0) {
            writer.print(prefix);
            writer.println("Back Stack:");
            for (int i4 = 0; i4 < N3; i4++) {
                Cc bs = this.f۱۰۲۴۰h.get(i4);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i4);
                writer.print(": ");
                writer.println(bs.toString());
                bs.m۱۲۰۸۵a(innerPrefix, fd, writer, args);
            }
        }
        synchronized (this) {
            if (this.f۱۰۲۴۲j != null && (N2 = this.f۱۰۲۴۲j.size()) > 0) {
                writer.print(prefix);
                writer.println("Back Stack Indices:");
                for (int i5 = 0; i5 < N2; i5++) {
                    writer.print(prefix);
                    writer.print("  #");
                    writer.print(i5);
                    writer.print(": ");
                    writer.println(this.f۱۰۲۴۲j.get(i5));
                }
            }
            if (this.f۱۰۲۴۳k != null && this.f۱۰۲۴۳k.size() > 0) {
                writer.print(prefix);
                writer.print("mAvailBackStackIndices: ");
                writer.println(Arrays.toString(this.f۱۰۲۴۳k.toArray()));
            }
        }
        ArrayList<AbstractCl> arrayList3 = this.f۱۰۲۳۵c;
        if (arrayList3 != null && (N = arrayList3.size()) > 0) {
            writer.print(prefix);
            writer.println("Pending Actions:");
            for (int i6 = 0; i6 < N; i6++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i6);
                writer.print(": ");
                writer.println(this.f۱۰۲۳۵c.get(i6));
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

    /* renamed from: a  reason: contains not printable characters */
    static Cg m۱۲۳۴۷a(Context context, float startScale, float endScale, float startAlpha, float endAlpha) {
        AnimationSet set = new AnimationSet(false);
        ScaleAnimation scale = new ScaleAnimation(startScale, endScale, startScale, endScale, 1, 0.5f, 1, 0.5f);
        scale.setInterpolator(f۱۰۲۲۷I);
        scale.setDuration(220);
        set.addAnimation(scale);
        AlphaAnimation alpha = new AlphaAnimation(startAlpha, endAlpha);
        alpha.setInterpolator(f۱۰۲۲۸J);
        alpha.setDuration(220);
        set.addAnimation(alpha);
        return new Cg(set);
    }

    /* renamed from: a  reason: contains not printable characters */
    static Cg m۱۲۳۴۶a(Context context, float start, float end) {
        AlphaAnimation anim = new AlphaAnimation(start, end);
        anim.setInterpolator(f۱۰۲۲۸J);
        anim.setDuration(220);
        return new Cg(anim);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cg m۱۲۳۷۵a(ComponentCallbacksCf fragment, int transit, boolean enter, int transitionStyle) {
        int styleIndex;
        int nextAnim = fragment.m۱۲۲۲۸q();
        Animation animation = fragment.m۱۲۱۵۵a(transit, enter, nextAnim);
        if (animation != null) {
            return new Cg(animation);
        }
        Animator animator = fragment.m۱۲۱۸۱b(transit, enter, nextAnim);
        if (animator != null) {
            return new Cg(animator);
        }
        if (nextAnim != 0) {
            boolean isAnim = "anim".equals(this.f۱۰۲۴۷o.m۱۲۳۱۰c().getResources().getResourceTypeName(nextAnim));
            boolean successfulLoad = false;
            if (isAnim) {
                try {
                    Animation animation2 = AnimationUtils.loadAnimation(this.f۱۰۲۴۷o.m۱۲۳۱۰c(), nextAnim);
                    if (animation2 != null) {
                        return new Cg(animation2);
                    }
                    successfulLoad = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException e2) {
                }
            }
            if (!successfulLoad) {
                try {
                    Animator animator2 = AnimatorInflater.loadAnimator(this.f۱۰۲۴۷o.m۱۲۳۱۰c(), nextAnim);
                    if (animator2 != null) {
                        return new Cg(animator2);
                    }
                } catch (RuntimeException e3) {
                    if (!isAnim) {
                        Animation animation3 = AnimationUtils.loadAnimation(this.f۱۰۲۴۷o.m۱۲۳۱۰c(), nextAnim);
                        if (animation3 != null) {
                            return new Cg(animation3);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (transit == 0 || (styleIndex = m۱۲۳۵۹b(transit, enter)) < 0) {
            return null;
        }
        switch (styleIndex) {
            case 1:
                return m۱۲۳۴۷a(this.f۱۰۲۴۷o.m۱۲۳۱۰c(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m۱۲۳۴۷a(this.f۱۰۲۴۷o.m۱۲۳۱۰c(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m۱۲۳۴۷a(this.f۱۰۲۴۷o.m۱۲۳۱۰c(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m۱۲۳۴۷a(this.f۱۰۲۴۷o.m۱۲۳۱۰c(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m۱۲۳۴۶a(this.f۱۰۲۴۷o.m۱۲۳۱۰c(), 0.0f, 1.0f);
            case 6:
                return m۱۲۳۴۶a(this.f۱۰۲۴۷o.m۱۲۳۱۰c(), 1.0f, 0.0f);
            default:
                if (transitionStyle == 0 && this.f۱۰۲۴۷o.m۱۲۳۱۵h()) {
                    transitionStyle = this.f۱۰۲۴۷o.m۱۲۳۱۴g();
                }
                return transitionStyle == 0 ? null : null;
        }
    }

    /* renamed from: k  reason: contains not printable characters */
    public void m۱۲۴۳۶k(ComponentCallbacksCf f) {
        if (!f.f۱۰۱۴۴M) {
            return;
        }
        if (this.f۱۰۲۳۶d) {
            this.f۱۰۲۵۶x = true;
            return;
        }
        f.f۱۰۱۴۴M = false;
        m۱۲۳۸۵a(f, this.f۱۰۲۴۶n, 0, 0, false);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۲۳۵۲a(View v, Cg anim) {
        if (v != null && anim != null && m۱۲۳۶۲b(v, anim)) {
            Animator animator = anim.f۱۰۲۷۵b;
            if (animator != null) {
                animator.addListener(new Ch(v));
                return;
            }
            Animation.AnimationListener originalListener = m۱۲۳۴۸a(anim.f۱۰۲۷۴a);
            v.setLayerType(2, null);
            anim.f۱۰۲۷۴a.setAnimationListener(new Ce(v, originalListener));
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Animation.AnimationListener m۱۲۳۴۸a(Animation animation) {
        try {
            if (f۱۰۲۲۶H == null) {
                f۱۰۲۲۶H = Animation.class.getDeclaredField("mListener");
                f۱۰۲۲۶H.setAccessible(true);
            }
            return (Animation.AnimationListener) f۱۰۲۲۶H.get(animation);
        } catch (NoSuchFieldException e) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۲۴۱۴c(int state) {
        return this.f۱۰۲۴۶n >= state;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0070, code lost:
        if (r1 != 3) goto L_0x02d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02b4  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۲۳۸۵a(android.support.p۰۴۳v4.app.ComponentCallbacksCf r17, int r18, int r19, int r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 1138
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۳v4.app.LayoutInflater$Factory2Cl.m۱۲۳۸۵a(android.support.v4.app.f, int, int, int, boolean):void");
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۳۵۰a(ComponentCallbacksCf fragment, Cg anim, int newState) {
        View viewToAnimate = fragment.f۱۰۱۴۲K;
        ViewGroup container = fragment.f۱۰۱۴۱J;
        container.startViewTransition(viewToAnimate);
        fragment.m۱۲۱۹۹d(newState);
        Animation animation = anim.f۱۰۲۷۴a;
        if (animation != null) {
            Animation animation2 = new RunnableCi(animation, container, viewToAnimate);
            fragment.m۱۲۱۷۵a(fragment.f۱۰۱۴۲K);
            animation2.setAnimationListener(new Cb(m۱۲۳۴۸a(animation2), container, fragment));
            m۱۲۳۵۲a(viewToAnimate, anim);
            fragment.f۱۰۱۴۲K.startAnimation(animation2);
            return;
        }
        Animator animator = anim.f۱۰۲۷۵b;
        fragment.m۱۲۱۶۰a(anim.f۱۰۲۷۵b);
        animator.addListener(new Cc(container, viewToAnimate, fragment));
        animator.setTarget(fragment.f۱۰۱۴۲K);
        m۱۲۳۵۲a(fragment.f۱۰۱۴۲K, anim);
        animator.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.l$b  reason: invalid class name */
    public class Cb extends animationAnimation$AnimationListenerCf {

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ ViewGroup f۱۰۲۶۰b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۲۶۱c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Cb(Animation.AnimationListener wrapped, ViewGroup viewGroup, ComponentCallbacksCf fVar) {
            super(wrapped);
            this.f۱۰۲۶۰b = viewGroup;
            this.f۱۰۲۶۱c = fVar;
        }

        @Override // android.support.p۰۴۳v4.app.LayoutInflater$Factory2Cl.animationAnimation$AnimationListenerCf
        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.f۱۰۲۶۰b.post(new RunnableCa());
        }

        /* renamed from: android.support.v4.app.l$b$a  reason: invalid class name */
        class RunnableCa implements Runnable {
            RunnableCa() {
            }

            public void run() {
                if (Cb.this.f۱۰۲۶۱c.m۱۲۲۰۹g() != null) {
                    Cb.this.f۱۰۲۶۱c.m۱۲۱۷۵a((View) null);
                    Cb bVar = Cb.this;
                    LayoutInflater$Factory2Cl lVar = LayoutInflater$Factory2Cl.this;
                    ComponentCallbacksCf fVar = bVar.f۱۰۲۶۱c;
                    lVar.m۱۲۳۸۵a(fVar, fVar.m۱۲۲۳۷z(), 0, 0, false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.l$c  reason: invalid class name */
    public class Cc extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ ViewGroup f۱۰۲۶۴a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۲۶۵b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۲۶۶c;

        Cc(ViewGroup viewGroup, View view, ComponentCallbacksCf fVar) {
            this.f۱۰۲۶۴a = viewGroup;
            this.f۱۰۲۶۵b = view;
            this.f۱۰۲۶۶c = fVar;
        }

        public void onAnimationEnd(Animator anim) {
            this.f۱۰۲۶۴a.endViewTransition(this.f۱۰۲۶۵b);
            Animator animator = this.f۱۰۲۶۶c.m۱۲۲۱۲h();
            this.f۱۰۲۶۶c.m۱۲۱۶۰a((Animator) null);
            if (animator != null && this.f۱۰۲۶۴a.indexOfChild(this.f۱۰۲۶۵b) < 0) {
                LayoutInflater$Factory2Cl lVar = LayoutInflater$Factory2Cl.this;
                ComponentCallbacksCf fVar = this.f۱۰۲۶۶c;
                lVar.m۱۲۳۸۵a(fVar, fVar.m۱۲۲۳۷z(), 0, 0, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j  reason: contains not printable characters */
    public void m۱۲۴۳۴j(ComponentCallbacksCf f) {
        m۱۲۳۸۵a(f, this.f۱۰۲۴۶n, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۲۴۲۰e(ComponentCallbacksCf f) {
        if (f.f۱۰۱۶۸o && !f.f۱۰۱۷۱r) {
            f.m۱۲۱۸۴b(f.m۱۲۲۱۶i(f.f۱۰۱۵۷d), (ViewGroup) null, f.f۱۰۱۵۷d);
            View view = f.f۱۰۱۴۲K;
            if (view != null) {
                f.f۱۰۱۴۳L = view;
                view.setSaveFromParentEnabled(false);
                if (f.f۱۰۱۳۴C) {
                    f.f۱۰۱۴۲K.setVisibility(8);
                }
                f.m۱۲۱۷۶a(f.f۱۰۱۴۲K, f.f۱۰۱۵۷d);
                m۱۲۳۸۸a(f, f.f۱۰۱۴۲K, f.f۱۰۱۵۷d, false);
                return;
            }
            f.f۱۰۱۴۳L = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۴۱۰c(ComponentCallbacksCf fragment) {
        Animator animator;
        if (fragment.f۱۰۱۴۲K != null) {
            Cg anim = m۱۲۳۷۵a(fragment, fragment.m۱۲۲۲۹r(), !fragment.f۱۰۱۳۴C, fragment.m۱۲۲۳۰s());
            if (anim == null || (animator = anim.f۱۰۲۷۵b) == null) {
                if (anim != null) {
                    m۱۲۳۵۲a(fragment.f۱۰۱۴۲K, anim);
                    fragment.f۱۰۱۴۲K.startAnimation(anim.f۱۰۲۷۴a);
                    anim.f۱۰۲۷۴a.start();
                }
                fragment.f۱۰۱۴۲K.setVisibility((!fragment.f۱۰۱۳۴C || fragment.m۱۲۱۳۰F()) ? 0 : 8);
                if (fragment.m۱۲۱۳۰F()) {
                    fragment.m۱۲۲۰۷f(false);
                }
            } else {
                animator.setTarget(fragment.f۱۰۱۴۲K);
                if (!fragment.f۱۰۱۳۴C) {
                    fragment.f۱۰۱۴۲K.setVisibility(0);
                } else if (fragment.m۱۲۱۳۰F()) {
                    fragment.m۱۲۲۰۷f(false);
                } else {
                    ViewGroup container = fragment.f۱۰۱۴۱J;
                    View animatingView = fragment.f۱۰۱۴۲K;
                    container.startViewTransition(animatingView);
                    anim.f۱۰۲۷۵b.addListener(new Cd(this, container, animatingView, fragment));
                }
                m۱۲۳۵۲a(fragment.f۱۰۱۴۲K, anim);
                anim.f۱۰۲۷۵b.start();
            }
        }
        if (fragment.f۱۰۱۶۶m && fragment.f۱۰۱۳۸G && fragment.f۱۰۱۳۹H) {
            this.f۱۰۲۵۱s = true;
        }
        fragment.f۱۰۱۴۸Q = false;
        fragment.m۱۲۱۷۸a(fragment.f۱۰۱۳۴C);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.l$d  reason: invalid class name */
    public class Cd extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ ViewGroup f۱۰۲۶۸a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۲۶۹b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۲۷۰c;

        Cd(LayoutInflater$Factory2Cl this$0, ViewGroup viewGroup, View view, ComponentCallbacksCf fVar) {
            this.f۱۰۲۶۸a = viewGroup;
            this.f۱۰۲۶۹b = view;
            this.f۱۰۲۷۰c = fVar;
        }

        public void onAnimationEnd(Animator animation) {
            this.f۱۰۲۶۸a.endViewTransition(this.f۱۰۲۶۹b);
            animation.removeListener(this);
            View view = this.f۱۰۲۷۰c.f۱۰۱۴۲K;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public void m۱۲۴۳۲i(ComponentCallbacksCf f) {
        ViewGroup container;
        int underIndex;
        int viewIndex;
        if (f != null) {
            int nextState = this.f۱۰۲۴۶n;
            if (f.f۱۰۱۶۷n) {
                if (f.m۱۲۱۳۱G()) {
                    nextState = Math.min(nextState, 1);
                } else {
                    nextState = Math.min(nextState, 0);
                }
            }
            m۱۲۳۸۵a(f, nextState, f.m۱۲۲۲۹r(), f.m۱۲۲۳۰s(), false);
            if (f.f۱۰۱۴۲K != null) {
                ComponentCallbacksCf underFragment = m۱۲۳۶۸q(f);
                if (underFragment != null && (viewIndex = container.indexOfChild(f.f۱۰۱۴۲K)) < (underIndex = (container = f.f۱۰۱۴۱J).indexOfChild(underFragment.f۱۰۱۴۲K))) {
                    container.removeViewAt(viewIndex);
                    container.addView(f.f۱۰۱۴۲K, underIndex);
                }
                if (f.f۱۰۱۴۷P && f.f۱۰۱۴۱J != null) {
                    float f2 = f.f۱۰۱۴۹R;
                    if (f2 > 0.0f) {
                        f.f۱۰۱۴۲K.setAlpha(f2);
                    }
                    f.f۱۰۱۴۹R = 0.0f;
                    f.f۱۰۱۴۷P = false;
                    Cg anim = m۱۲۳۷۵a(f, f.m۱۲۲۲۹r(), true, f.m۱۲۲۳۰s());
                    if (anim != null) {
                        m۱۲۳۵۲a(f.f۱۰۱۴۲K, anim);
                        Animation animation = anim.f۱۰۲۷۴a;
                        if (animation != null) {
                            f.f۱۰۱۴۲K.startAnimation(animation);
                        } else {
                            anim.f۱۰۲۷۵b.setTarget(f.f۱۰۱۴۲K);
                            anim.f۱۰۲۷۵b.start();
                        }
                    }
                }
            }
            if (f.f۱۰۱۴۸Q) {
                m۱۲۴۱۰c(f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۷۹a(int newState, boolean always) {
        AbstractCj jVar;
        if (this.f۱۰۲۴۷o == null && newState != 0) {
            throw new IllegalStateException("No activity");
        } else if (always || newState != this.f۱۰۲۴۶n) {
            this.f۱۰۲۴۶n = newState;
            if (this.f۱۰۲۳۹g != null) {
                int numAdded = this.f۱۰۲۳۸f.size();
                for (int i = 0; i < numAdded; i++) {
                    m۱۲۴۳۲i(this.f۱۰۲۳۸f.get(i));
                }
                int numActive = this.f۱۰۲۳۹g.size();
                for (int i2 = 0; i2 < numActive; i2++) {
                    ComponentCallbacksCf f = this.f۱۰۲۳۹g.valueAt(i2);
                    if (f != null && ((f.f۱۰۱۶۷n || f.f۱۰۱۳۵D) && !f.f۱۰۱۴۷P)) {
                        m۱۲۴۳۲i(f);
                    }
                }
                m۱۲۴۵۴x();
                if (this.f۱۰۲۵۱s && (jVar = this.f۱۰۲۴۷o) != null && this.f۱۰۲۴۶n == 4) {
                    jVar.m۱۲۳۱۶i();
                    this.f۱۰۲۵۱s = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x  reason: contains not printable characters */
    public void m۱۲۴۵۴x() {
        if (this.f۱۰۲۳۹g != null) {
            for (int i = 0; i < this.f۱۰۲۳۹g.size(); i++) {
                ComponentCallbacksCf f = this.f۱۰۲۳۹g.valueAt(i);
                if (f != null) {
                    m۱۲۴۳۶k(f);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۲۴۲۶g(ComponentCallbacksCf f) {
        if (f.f۱۰۱۶۰g < 0) {
            int i = this.f۱۰۲۳۷e;
            this.f۱۰۲۳۷e = i + 1;
            f.m۱۲۱۵۸a(i, this.f۱۰۲۴۹q);
            if (this.f۱۰۲۳۹g == null) {
                this.f۱۰۲۳۹g = new SparseArray<>();
            }
            this.f۱۰۲۳۹g.put(f.f۱۰۱۶۰g, f);
            if (f۱۰۲۲۵G) {
                Log.v("FragmentManager", "Allocated fragment index " + f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۲۴۲۹h(ComponentCallbacksCf f) {
        if (f.f۱۰۱۶۰g >= 0) {
            if (f۱۰۲۲۵G) {
                Log.v("FragmentManager", "Freeing fragment index " + f);
            }
            this.f۱۰۲۳۹g.put(f.f۱۰۱۶۰g, null);
            f.m۱۲۱۲۶B();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۸۹a(ComponentCallbacksCf fragment, boolean moveToStateNow) {
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        m۱۲۴۲۶g(fragment);
        if (fragment.f۱۰۱۳۵D) {
            return;
        }
        if (!this.f۱۰۲۳۸f.contains(fragment)) {
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
                m۱۲۴۳۴j(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: l  reason: contains not printable characters */
    public void m۱۲۴۳۸l(ComponentCallbacksCf fragment) {
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f۱۰۱۷۲s);
        }
        boolean inactive = !fragment.m۱۲۱۳۱G();
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

    /* renamed from: f  reason: contains not printable characters */
    public void m۱۲۴۲۳f(ComponentCallbacksCf fragment) {
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f۱۰۱۳۴C) {
            fragment.f۱۰۱۳۴C = true;
            fragment.f۱۰۱۴۸Q = true ^ fragment.f۱۰۱۴۸Q;
        }
    }

    /* renamed from: p  reason: contains not printable characters */
    public void m۱۲۴۴۶p(ComponentCallbacksCf fragment) {
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f۱۰۱۳۴C) {
            fragment.f۱۰۱۳۴C = false;
            fragment.f۱۰۱۴۸Q = !fragment.f۱۰۱۴۸Q;
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۲۴۱۵d(ComponentCallbacksCf fragment) {
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

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۴۰۲b(ComponentCallbacksCf fragment) {
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f۱۰۱۳۵D) {
            fragment.f۱۰۱۳۵D = false;
            if (fragment.f۱۰۱۶۶m) {
                return;
            }
            if (!this.f۱۰۲۳۸f.contains(fragment)) {
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                synchronized (this.f۱۰۲۳۸f) {
                    this.f۱۰۲۳۸f.add(fragment);
                }
                fragment.f۱۰۱۶۶m = true;
                if (fragment.f۱۰۱۳۸G && fragment.f۱۰۱۳۹H) {
                    this.f۱۰۲۵۱s = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۲۳۷۲a(int id) {
        for (int i = this.f۱۰۲۳۸f.size() - 1; i >= 0; i--) {
            ComponentCallbacksCf f = this.f۱۰۲۳۸f.get(i);
            if (f != null && f.f۱۰۱۷۹z == id) {
                return f;
            }
        }
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        if (sparseArray == null) {
            return null;
        }
        for (int i2 = sparseArray.size() - 1; i2 >= 0; i2--) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۹g.valueAt(i2);
            if (f2 != null && f2.f۱۰۱۷۹z == id) {
                return f2;
            }
        }
        return null;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCk
    /* renamed from: a  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۲۳۷۴a(String tag) {
        if (tag != null) {
            for (int i = this.f۱۰۲۳۸f.size() - 1; i >= 0; i--) {
                ComponentCallbacksCf f = this.f۱۰۲۳۸f.get(i);
                if (f != null && tag.equals(f.f۱۰۱۳۳B)) {
                    return f;
                }
            }
        }
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        if (sparseArray == null || tag == null) {
            return null;
        }
        for (int i2 = sparseArray.size() - 1; i2 >= 0; i2--) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۹g.valueAt(i2);
            if (f2 != null && tag.equals(f2.f۱۰۱۳۳B)) {
                return f2;
            }
        }
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۲۳۹۹b(String who) {
        ComponentCallbacksCf f;
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        if (sparseArray == null || who == null) {
            return null;
        }
        for (int i = sparseArray.size() - 1; i >= 0; i--) {
            ComponentCallbacksCf f2 = this.f۱۰۲۳۹g.valueAt(i);
            if (!(f2 == null || (f = f2.m۱۲۱۵۲a(who)) == null)) {
                return f;
            }
        }
        return null;
    }

    /* renamed from: z  reason: contains not printable characters */
    private void m۱۲۳۷۰z() {
        if (m۱۲۴۱۳c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f۱۰۲۵۵w != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f۱۰۲۵۵w);
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCk
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۲۴۱۳c() {
        return this.f۱۰۲۵۲t || this.f۱۰۲۵۳u;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۹۱a(AbstractCl action, boolean allowStateLoss) {
        if (!allowStateLoss) {
            m۱۲۳۷۰z();
        }
        synchronized (this) {
            if (!this.f۱۰۲۵۴v) {
                if (this.f۱۰۲۴۷o != null) {
                    if (this.f۱۰۲۳۵c == null) {
                        this.f۱۰۲۳۵c = new ArrayList<>();
                    }
                    this.f۱۰۲۳۵c.add(action);
                    m۱۲۴۵۳w();
                    return;
                }
            }
            if (!allowStateLoss) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w  reason: contains not printable characters */
    public void m۱۲۴۵۳w() {
        synchronized (this) {
            boolean pendingReady = false;
            boolean postponeReady = this.f۱۰۲۳۲D != null && !this.f۱۰۲۳۲D.isEmpty();
            if (this.f۱۰۲۳۵c != null && this.f۱۰۲۳۵c.size() == 1) {
                pendingReady = true;
            }
            if (postponeReady || pendingReady) {
                this.f۱۰۲۴۷o.m۱۲۳۱۲e().removeCallbacks(this.f۱۰۲۳۴F);
                this.f۱۰۲۴۷o.m۱۲۳۱۲e().post(this.f۱۰۲۳۴F);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۲۳۹۸b(Cc bse) {
        synchronized (this) {
            if (this.f۱۰۲۴۳k != null) {
                if (this.f۱۰۲۴۳k.size() > 0) {
                    int index = this.f۱۰۲۴۳k.remove(this.f۱۰۲۴۳k.size() - 1).intValue();
                    if (f۱۰۲۲۵G) {
                        Log.v("FragmentManager", "Adding back stack index " + index + " with " + bse);
                    }
                    this.f۱۰۲۴۲j.set(index, bse);
                    return index;
                }
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

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۷۸a(int index, Cc bse) {
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

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۴۰۱b(int index) {
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

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۲۳۶۵c(boolean allowStateLoss) {
        if (this.f۱۰۲۳۶d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f۱۰۲۴۷o == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f۱۰۲۴۷o.m۱۲۳۱۲e().getLooper()) {
            if (!allowStateLoss) {
                m۱۲۳۷۰z();
            }
            if (this.f۱۰۲۵۷y == null) {
                this.f۱۰۲۵۷y = new ArrayList<>();
                this.f۱۰۲۵۸z = new ArrayList<>();
            }
            this.f۱۰۲۳۶d = true;
            try {
                m۱۲۳۵۴a((ArrayList<Cc>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f۱۰۲۳۶d = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۴۰۶b(AbstractCl action, boolean allowStateLoss) {
        if (!allowStateLoss || (this.f۱۰۲۴۷o != null && !this.f۱۰۲۵۴v)) {
            m۱۲۳۶۵c(allowStateLoss);
            if (action.m۱۲۴۵۵a(this.f۱۰۲۵۷y, this.f۱۰۲۵۸z)) {
                this.f۱۰۲۳۶d = true;
                try {
                    m۱۲۳۶۴c(this.f۱۰۲۵۷y, this.f۱۰۲۵۸z);
                } finally {
                    m۱۲۳۴۲A();
                }
            }
            m۱۲۴۴۱n();
            m۱۲۳۶۹y();
        }
    }

    /* renamed from: A  reason: contains not printable characters */
    private void m۱۲۳۴۲A() {
        this.f۱۰۲۳۶d = false;
        this.f۱۰۲۵۸z.clear();
        this.f۱۰۲۵۷y.clear();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: o  reason: contains not printable characters */
    public boolean m۱۲۴۴۴o() {
        m۱۲۳۶۵c(true);
        boolean didSomething = false;
        while (m۱۲۳۶۳b(this.f۱۰۲۵۷y, this.f۱۰۲۵۸z)) {
            this.f۱۰۲۳۶d = true;
            try {
                m۱۲۳۶۴c(this.f۱۰۲۵۷y, this.f۱۰۲۵۸z);
                m۱۲۳۴۲A();
                didSomething = true;
            } catch (Throwable th) {
                m۱۲۳۴۲A();
                throw th;
            }
        }
        m۱۲۴۴۱n();
        m۱۲۳۶۹y();
        return didSomething;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۳۵۴a(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop) {
        int index;
        int index2;
        ArrayList<Cn> arrayList2 = this.f۱۰۲۳۲D;
        int numPostponed = arrayList2 == null ? 0 : arrayList2.size();
        int i = 0;
        while (i < numPostponed) {
            Cn listener = this.f۱۰۲۳۲D.get(i);
            if (arrayList != null && !listener.f۱۰۲۸۹a && (index2 = arrayList.indexOf(listener.f۱۰۲۹۰b)) != -1 && isRecordPop.get(index2).booleanValue()) {
                listener.m۱۲۴۵۹c();
            } else if (listener.m۱۲۴۶۱e() || (arrayList != null && listener.f۱۰۲۹۰b.m۱۲۰۸۷a(arrayList, 0, arrayList.size()))) {
                this.f۱۰۲۳۲D.remove(i);
                i--;
                numPostponed--;
                if (arrayList == null || listener.f۱۰۲۸۹a || (index = arrayList.indexOf(listener.f۱۰۲۹۰b)) == -1 || !isRecordPop.get(index).booleanValue()) {
                    listener.m۱۲۴۶۰d();
                } else {
                    listener.m۱۲۴۵۹c();
                }
            }
            i++;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۲۳۶۴c(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (isRecordPop == null || arrayList.size() != isRecordPop.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m۱۲۳۵۴a(arrayList, isRecordPop);
            int numRecords = arrayList.size();
            int startIndex = 0;
            int recordNum = 0;
            while (recordNum < numRecords) {
                if (!arrayList.get(recordNum).f۱۰۱۰۰s) {
                    if (startIndex != recordNum) {
                        m۱۲۳۶۱b(arrayList, isRecordPop, startIndex, recordNum);
                    }
                    int reorderingEnd = recordNum + 1;
                    if (isRecordPop.get(recordNum).booleanValue()) {
                        while (reorderingEnd < numRecords && isRecordPop.get(reorderingEnd).booleanValue() && !arrayList.get(reorderingEnd).f۱۰۱۰۰s) {
                            reorderingEnd++;
                        }
                    }
                    m۱۲۳۶۱b(arrayList, isRecordPop, recordNum, reorderingEnd);
                    startIndex = reorderingEnd;
                    recordNum = reorderingEnd - 1;
                }
                recordNum++;
            }
            if (startIndex != numRecords) {
                m۱۲۳۶۱b(arrayList, isRecordPop, startIndex, numRecords);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۲۳۶۱b(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        int i;
        boolean allowReordering = arrayList.get(startIndex).f۱۰۱۰۰s;
        ArrayList<ComponentCallbacksCf> arrayList2 = this.f۱۰۲۲۹A;
        if (arrayList2 == null) {
            this.f۱۰۲۲۹A = new ArrayList<>();
        } else {
            arrayList2.clear();
        }
        this.f۱۰۲۲۹A.addAll(this.f۱۰۲۳۸f);
        int recordNum = startIndex;
        boolean addToBackStack = false;
        ComponentCallbacksCf oldPrimaryNav = m۱۲۴۴۷q();
        while (true) {
            boolean z = true;
            if (recordNum >= endIndex) {
                break;
            }
            Cc record = arrayList.get(recordNum);
            if (!isRecordPop.get(recordNum).booleanValue()) {
                oldPrimaryNav = record.m۱۲۰۷۷a(this.f۱۰۲۲۹A, oldPrimaryNav);
            } else {
                oldPrimaryNav = record.m۱۲۰۹۰b(this.f۱۰۲۲۹A, oldPrimaryNav);
            }
            if (!addToBackStack && !record.f۱۰۰۹۰i) {
                z = false;
            }
            addToBackStack = z;
            recordNum++;
        }
        this.f۱۰۲۲۹A.clear();
        if (!allowReordering) {
            Cr.m۱۲۵۰۰a(this, arrayList, isRecordPop, startIndex, endIndex, false);
        }
        m۱۲۳۵۵a(arrayList, isRecordPop, startIndex, endIndex);
        int postponeIndex = endIndex;
        if (allowReordering) {
            ArraySet<Fragment> addedFragments = new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cb<>();
            m۱۲۳۴۹a((p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cb<ComponentCallbacksCf>) addedFragments);
            int postponeIndex2 = m۱۲۳۴۵a(arrayList, isRecordPop, startIndex, endIndex, (p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cb<ComponentCallbacksCf>) addedFragments);
            m۱۲۳۶۰b((p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cb<ComponentCallbacksCf>) addedFragments);
            postponeIndex = postponeIndex2;
        }
        if (postponeIndex != startIndex && allowReordering) {
            Cr.m۱۲۵۰۰a(this, arrayList, isRecordPop, startIndex, postponeIndex, true);
            m۱۲۳۷۹a(this.f۱۰۲۴۶n, true);
        }
        for (int recordNum2 = startIndex; recordNum2 < endIndex; recordNum2++) {
            Cc record2 = arrayList.get(recordNum2);
            if (isRecordPop.get(recordNum2).booleanValue() && (i = record2.f۱۰۰۹۳l) >= 0) {
                m۱۲۴۰۱b(i);
                record2.f۱۰۰۹۳l = -1;
            }
            record2.m۱۲۰۹۹h();
        }
        if (addToBackStack) {
            m۱۲۴۴۹s();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۲۳۶۰b(p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cb<ComponentCallbacksCf> bVar) {
        int numAdded = bVar.size();
        for (int i = 0; i < numAdded; i++) {
            ComponentCallbacksCf fragment = bVar.m۱۰۵۷۶c(i);
            if (!fragment.f۱۰۱۶۶m) {
                View view = fragment.m۱۲۱۲۵A();
                fragment.f۱۰۱۴۹R = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۲۳۴۵a(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cb<ComponentCallbacksCf> bVar) {
        int postponeIndex = endIndex;
        for (int i = endIndex - 1; i >= startIndex; i--) {
            Cc record = arrayList.get(i);
            boolean isPop = isRecordPop.get(i).booleanValue();
            if (record.m۱۲۰۹۸g() && !record.m۱۲۰۸۷a(arrayList, i + 1, endIndex)) {
                if (this.f۱۰۲۳۲D == null) {
                    this.f۱۰۲۳۲D = new ArrayList<>();
                }
                Cn listener = new Cn(record, isPop);
                this.f۱۰۲۳۲D.add(listener);
                record.m۱۲۰۸۴a(listener);
                if (isPop) {
                    record.m۱۲۰۹۶e();
                } else {
                    record.m۱۲۰۹۲b(false);
                }
                postponeIndex--;
                if (i != postponeIndex) {
                    arrayList.remove(i);
                    arrayList.add(postponeIndex, record);
                }
                m۱۲۳۴۹a(bVar);
            }
        }
        return postponeIndex;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۸۴a(Cc record, boolean isPop, boolean runTransitions, boolean moveToState) {
        if (isPop) {
            record.m۱۲۰۹۲b(moveToState);
        } else {
            record.m۱۲۰۹۶e();
        }
        ArrayList<BackStackRecord> records = new ArrayList<>(1);
        ArrayList<Boolean> isRecordPop = new ArrayList<>(1);
        records.add(record);
        isRecordPop.add(Boolean.valueOf(isPop));
        if (runTransitions) {
            Cr.m۱۲۵۰۰a(this, (ArrayList<Cc>) records, isRecordPop, 0, 1, true);
        }
        if (moveToState) {
            m۱۲۳۷۹a(this.f۱۰۲۴۶n, true);
        }
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        if (sparseArray != null) {
            int numActive = sparseArray.size();
            for (int i = 0; i < numActive; i++) {
                ComponentCallbacksCf fragment = this.f۱۰۲۳۹g.valueAt(i);
                if (fragment != null && fragment.f۱۰۱۴۲K != null && fragment.f۱۰۱۴۷P && record.m۱۲۰۹۳b(fragment.f۱۰۱۳۲A)) {
                    float f = fragment.f۱۰۱۴۹R;
                    if (f > 0.0f) {
                        fragment.f۱۰۱۴۲K.setAlpha(f);
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

    /* renamed from: q  reason: contains not printable characters */
    private ComponentCallbacksCf m۱۲۳۶۸q(ComponentCallbacksCf f) {
        ViewGroup container = f.f۱۰۱۴۱J;
        View view = f.f۱۰۱۴۲K;
        if (container == null || view == null) {
            return null;
        }
        for (int i = this.f۱۰۲۳۸f.indexOf(f) - 1; i >= 0; i--) {
            ComponentCallbacksCf underFragment = this.f۱۰۲۳۸f.get(i);
            if (underFragment.f۱۰۱۴۱J == container && underFragment.f۱۰۱۴۲K != null) {
                return underFragment;
            }
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۲۳۵۵a(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            Cc record = arrayList.get(i);
            boolean moveToState = true;
            if (isRecordPop.get(i).booleanValue()) {
                record.m۱۲۰۸۲a(-1);
                if (i != endIndex - 1) {
                    moveToState = false;
                }
                record.m۱۲۰۹۲b(moveToState);
            } else {
                record.m۱۲۰۸۲a(1);
                record.m۱۲۰۹۶e();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۳۴۹a(p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cb<ComponentCallbacksCf> bVar) {
        int i = this.f۱۰۲۴۶n;
        if (i >= 1) {
            int state = Math.min(i, 3);
            int numAdded = this.f۱۰۲۳۸f.size();
            for (int i2 = 0; i2 < numAdded; i2++) {
                ComponentCallbacksCf fragment = this.f۱۰۲۳۸f.get(i2);
                if (fragment.f۱۰۱۵۶c < state) {
                    m۱۲۳۸۵a(fragment, state, fragment.m۱۲۲۲۸q(), fragment.m۱۲۲۲۹r(), false);
                    if (fragment.f۱۰۱۴۲K != null && !fragment.f۱۰۱۳۴C && fragment.f۱۰۱۴۷P) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: C  reason: contains not printable characters */
    private void m۱۲۳۴۴C() {
        if (this.f۱۰۲۳۲D != null) {
            while (!this.f۱۰۲۳۲D.isEmpty()) {
                this.f۱۰۲۳۲D.remove(0).m۱۲۴۶۰d();
            }
        }
    }

    /* renamed from: B  reason: contains not printable characters */
    private void m۱۲۳۴۳B() {
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        int numFragments = sparseArray == null ? 0 : sparseArray.size();
        for (int i = 0; i < numFragments; i++) {
            ComponentCallbacksCf fragment = this.f۱۰۲۳۹g.valueAt(i);
            if (fragment != null) {
                if (fragment.m۱۲۲۰۹g() != null) {
                    int stateAfterAnimating = fragment.m۱۲۲۳۷z();
                    View animatingAway = fragment.m۱۲۲۰۹g();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.m۱۲۱۷۵a((View) null);
                    m۱۲۳۸۵a(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.m۱۲۲۱۲h() != null) {
                    fragment.m۱۲۲۱۲h().end();
                }
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۲۳۶۳b(ArrayList<Cc> arrayList, ArrayList<Boolean> isPop) {
        boolean didSomething = false;
        synchronized (this) {
            if (this.f۱۰۲۳۵c != null) {
                if (this.f۱۰۲۳۵c.size() != 0) {
                    int numActions = this.f۱۰۲۳۵c.size();
                    for (int i = 0; i < numActions; i++) {
                        didSomething |= this.f۱۰۲۳۵c.get(i).m۱۲۴۵۵a(arrayList, isPop);
                    }
                    this.f۱۰۲۳۵c.clear();
                    this.f۱۰۲۴۷o.m۱۲۳۱۲e().removeCallbacks(this.f۱۰۲۳۴F);
                    return didSomething;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n  reason: contains not printable characters */
    public void m۱۲۴۴۱n() {
        if (this.f۱۰۲۵۶x) {
            this.f۱۰۲۵۶x = false;
            m۱۲۴۵۴x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s  reason: contains not printable characters */
    public void m۱۲۴۴۹s() {
        if (this.f۱۰۲۴۴l != null) {
            for (int i = 0; i < this.f۱۰۲۴۴l.size(); i++) {
                this.f۱۰۲۴۴l.get(i).m۱۲۳۴۱a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۸۳a(Cc state) {
        if (this.f۱۰۲۴۰h == null) {
            this.f۱۰۲۴۰h = new ArrayList<>();
        }
        this.f۱۰۲۴۰h.add(state);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۳۹۷a(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop, String name, int id, int flags) {
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
                    if ((name != null && name.equals(bss.m۱۲۰۹۷f())) || (id >= 0 && id == bss.f۱۰۰۹۳l)) {
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
                        if ((name == null || !name.equals(bss2.m۱۲۰۹۷f())) && (id < 0 || id != bss2.f۱۰۰۹۳l)) {
                            break;
                        }
                        index--;
                    }
                }
            }
            if (index == this.f۱۰۲۴۰h.size() - 1) {
                return false;
            }
            for (int i = this.f۱۰۲۴۰h.size() - 1; i > index; i--) {
                arrayList.add(this.f۱۰۲۴۰h.remove(i));
                isRecordPop.add(true);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t  reason: contains not printable characters */
    public Cm m۱۲۴۵۰t() {
        m۱۲۳۵۱a(this.f۱۰۲۳۳E);
        return this.f۱۰۲۳۳E;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۲۳۵۱a(Cm nonConfig) {
        if (nonConfig != null) {
            List<Fragment> fragments = nonConfig.m۱۲۴۶۳b();
            if (fragments != null) {
                Iterator<Fragment> it = fragments.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacksCf) it.next()).f۱۰۱۳۷F = true;
                }
            }
            List<FragmentManagerNonConfig> children = nonConfig.m۱۲۴۶۲a();
            if (children != null) {
                Iterator<FragmentManagerNonConfig> it2 = children.iterator();
                while (it2.hasNext()) {
                    m۱۲۳۵۱a((Cm) it2.next());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v  reason: contains not printable characters */
    public void m۱۲۴۵۲v() {
        Cm child;
        ArrayList<Fragment> fragments = null;
        ArrayList<FragmentManagerNonConfig> childFragments = null;
        ArrayList<ViewModelStore> viewModelStores = null;
        if (this.f۱۰۲۳۹g != null) {
            for (int i = 0; i < this.f۱۰۲۳۹g.size(); i++) {
                ComponentCallbacksCf f = this.f۱۰۲۳۹g.valueAt(i);
                if (f != null) {
                    if (f.f۱۰۱۳۶E) {
                        if (fragments == null) {
                            fragments = new ArrayList<>();
                        }
                        fragments.add(f);
                        ComponentCallbacksCf fVar = f.f۱۰۱۶۳j;
                        f.f۱۰۱۶۴k = fVar != null ? fVar.f۱۰۱۶۰g : -1;
                        if (f۱۰۲۲۵G) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + f);
                        }
                    }
                    LayoutInflater$Factory2Cl lVar = f.f۱۰۱۷۵v;
                    if (lVar != null) {
                        lVar.m۱۲۴۵۲v();
                        child = f.f۱۰۱۷۵v.f۱۰۲۳۳E;
                    } else {
                        child = f.f۱۰۱۷۶w;
                    }
                    if (childFragments == null && child != null) {
                        childFragments = new ArrayList<>(this.f۱۰۲۳۹g.size());
                        for (int j = 0; j < i; j++) {
                            childFragments.add(null);
                        }
                    }
                    if (childFragments != null) {
                        childFragments.add(child);
                    }
                    if (viewModelStores == null && f.f۱۰۱۷۷x != null) {
                        viewModelStores = new ArrayList<>(this.f۱۰۲۳۹g.size());
                        for (int j2 = 0; j2 < i; j2++) {
                            viewModelStores.add(null);
                        }
                    }
                    if (viewModelStores != null) {
                        viewModelStores.add(f.f۱۰۱۷۷x);
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

    /* access modifiers changed from: package-private */
    /* renamed from: n  reason: contains not printable characters */
    public void m۱۲۴۴۲n(ComponentCallbacksCf f) {
        if (f.f۱۰۱۴۳L != null) {
            SparseArray<Parcelable> sparseArray = this.f۱۰۲۳۱C;
            if (sparseArray == null) {
                this.f۱۰۲۳۱C = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            f.f۱۰۱۴۳L.saveHierarchyState(this.f۱۰۲۳۱C);
            if (this.f۱۰۲۳۱C.size() > 0) {
                f.f۱۰۱۵۸e = this.f۱۰۲۳۱C;
                this.f۱۰۲۳۱C = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m  reason: contains not printable characters */
    public Bundle m۱۲۴۳۹m(ComponentCallbacksCf f) {
        Bundle result = null;
        if (this.f۱۰۲۳۰B == null) {
            this.f۱۰۲۳۰B = new Bundle();
        }
        f.m۱۲۲۱۸j(this.f۱۰۲۳۰B);
        m۱۲۴۱۶d(f, this.f۱۰۲۳۰B, false);
        if (!this.f۱۰۲۳۰B.isEmpty()) {
            result = this.f۱۰۲۳۰B;
            this.f۱۰۲۳۰B = null;
        }
        if (f.f۱۰۱۴۲K != null) {
            m۱۲۴۴۲n(f);
        }
        if (f.f۱۰۱۵۸e != null) {
            if (result == null) {
                result = new Bundle();
            }
            result.putSparseParcelableArray("android:view_state", f.f۱۰۱۵۸e);
        }
        if (!f.f۱۰۱۴۵N) {
            if (result == null) {
                result = new Bundle();
            }
            result.putBoolean("android:user_visible_hint", f.f۱۰۱۴۵N);
        }
        return result;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u  reason: contains not printable characters */
    public Parcelable m۱۲۴۵۱u() {
        int N;
        m۱۲۳۴۴C();
        m۱۲۳۴۳B();
        m۱۲۴۴۴o();
        this.f۱۰۲۵۲t = true;
        this.f۱۰۲۳۳E = null;
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int N2 = this.f۱۰۲۳۹g.size();
        Co[] active = new Co[N2];
        boolean haveFragments = false;
        for (int i = 0; i < N2; i++) {
            ComponentCallbacksCf f = this.f۱۰۲۳۹g.valueAt(i);
            if (f != null) {
                if (f.f۱۰۱۶۰g >= 0) {
                    haveFragments = true;
                    Co fs = new Co(f);
                    active[i] = fs;
                    if (f.f۱۰۱۵۶c <= 0 || fs.f۱۰۳۱۰m != null) {
                        fs.f۱۰۳۱۰m = f.f۱۰۱۵۷d;
                    } else {
                        fs.f۱۰۳۱۰m = m۱۲۴۳۹m(f);
                        ComponentCallbacksCf fVar = f.f۱۰۱۶۳j;
                        if (fVar != null) {
                            if (fVar.f۱۰۱۶۰g >= 0) {
                                if (fs.f۱۰۳۱۰m == null) {
                                    fs.f۱۰۳۱۰m = new Bundle();
                                }
                                m۱۲۳۸۱a(fs.f۱۰۳۱۰m, "android:target_state", f.f۱۰۱۶۳j);
                                int i2 = f.f۱۰۱۶۵l;
                                if (i2 != 0) {
                                    fs.f۱۰۳۱۰m.putInt("android:target_req_state", i2);
                                }
                            } else {
                                m۱۲۳۵۳a(new IllegalStateException("Failure saving state: " + f + " has target not in fragment manager: " + f.f۱۰۱۶۳j));
                                throw null;
                            }
                        }
                    }
                    if (f۱۰۲۲۵G) {
                        Log.v("FragmentManager", "Saved state of " + f + ": " + fs.f۱۰۳۱۰m);
                    }
                } else {
                    m۱۲۳۵۳a(new IllegalStateException("Failure saving state: active " + f + " has cleared index: " + f.f۱۰۱۶۰g));
                    throw null;
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
            for (int i3 = 0; i3 < N3; i3++) {
                added[i3] = this.f۱۰۲۳۸f.get(i3).f۱۰۱۶۰g;
                if (added[i3] >= 0) {
                    if (f۱۰۲۲۵G) {
                        Log.v("FragmentManager", "saveAllState: adding fragment #" + i3 + ": " + this.f۱۰۲۳۸f.get(i3));
                    }
                } else {
                    m۱۲۳۵۳a(new IllegalStateException("Failure saving state: active " + this.f۱۰۲۳۸f.get(i3) + " has cleared index: " + added[i3]));
                    throw null;
                }
            }
        }
        ArrayList<Cc> arrayList = this.f۱۰۲۴۰h;
        if (arrayList != null && (N = arrayList.size()) > 0) {
            backStack = new Cd[N];
            for (int i4 = 0; i4 < N; i4++) {
                backStack[i4] = new Cd(this.f۱۰۲۴۰h.get(i4));
                if (f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.f۱۰۲۴۰h.get(i4));
                }
            }
        }
        Cn fms = new Cn();
        fms.f۱۰۲۹۵c = active;
        fms.f۱۰۲۹۶d = added;
        fms.f۱۰۲۹۷e = backStack;
        ComponentCallbacksCf fVar2 = this.f۱۰۲۵۰r;
        if (fVar2 != null) {
            fms.f۱۰۲۹۸f = fVar2.f۱۰۱۶۰g;
        }
        fms.f۱۰۲۹۹g = this.f۱۰۲۳۷e;
        m۱۲۴۵۲v();
        return fms;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۸۲a(Parcelable state, Cm nonConfig) {
        List<Fragment> nonConfigFragments;
        List<ViewModelStore> viewModelStores;
        if (state != null) {
            Cn fms = (Cn) state;
            if (fms.f۱۰۲۹۵c != null) {
                if (nonConfig != null) {
                    List<Fragment> nonConfigFragments2 = nonConfig.m۱۲۴۶۳b();
                    List<ViewModelStore> childNonConfigs = nonConfig.m۱۲۴۶۲a();
                    List<Fragment> viewModelStores2 = nonConfig.m۱۲۴۶۴c();
                    int count = nonConfigFragments2 != null ? nonConfigFragments2.size() : 0;
                    for (int i = 0; i < count; i++) {
                        ComponentCallbacksCf f = (ComponentCallbacksCf) nonConfigFragments2.get(i);
                        if (f۱۰۲۲۵G) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + f);
                        }
                        int index = 0;
                        while (true) {
                            Co[] oVarArr = fms.f۱۰۲۹۵c;
                            if (index >= oVarArr.length || oVarArr[index].f۱۰۳۰۱d == f.f۱۰۱۶۰g) {
                                Co[] oVarArr2 = fms.f۱۰۲۹۵c;
                            } else {
                                index++;
                            }
                        }
                        Co[] oVarArr22 = fms.f۱۰۲۹۵c;
                        if (index != oVarArr22.length) {
                            Co fs = oVarArr22[index];
                            fs.f۱۰۳۱۱n = f;
                            f.f۱۰۱۵۸e = null;
                            f.f۱۰۱۷۲s = 0;
                            f.f۱۰۱۶۹p = false;
                            f.f۱۰۱۶۶m = false;
                            f.f۱۰۱۶۳j = null;
                            Bundle bundle = fs.f۱۰۳۱۰m;
                            if (bundle != null) {
                                bundle.setClassLoader(this.f۱۰۲۴۷o.m۱۲۳۱۰c().getClassLoader());
                                f.f۱۰۱۵۸e = fs.f۱۰۳۱۰m.getSparseParcelableArray("android:view_state");
                                f.f۱۰۱۵۷d = fs.f۱۰۳۱۰m;
                            }
                        } else {
                            m۱۲۳۵۳a(new IllegalStateException("Could not find active fragment with index " + f.f۱۰۱۶۰g));
                            throw null;
                        }
                    }
                    nonConfigFragments = viewModelStores2;
                    viewModelStores = childNonConfigs;
                } else {
                    nonConfigFragments = null;
                    viewModelStores = null;
                }
                this.f۱۰۲۳۹g = new SparseArray<>(fms.f۱۰۲۹۵c.length);
                int i2 = 0;
                while (true) {
                    Co[] oVarArr3 = fms.f۱۰۲۹۵c;
                    if (i2 >= oVarArr3.length) {
                        break;
                    }
                    Co fs2 = oVarArr3[i2];
                    if (fs2 != null) {
                        Cm childNonConfig = null;
                        if (viewModelStores != null && i2 < viewModelStores.size()) {
                            childNonConfig = (Cm) viewModelStores.get(i2);
                        }
                        ComponentCallbacksCf f2 = fs2.m۱۲۴۶۵a(this.f۱۰۲۴۷o, this.f۱۰۲۴۸p, this.f۱۰۲۴۹q, childNonConfig, (nonConfigFragments == null || i2 >= nonConfigFragments.size()) ? null : (Cp) nonConfigFragments.get(i2));
                        if (f۱۰۲۲۵G) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + f2);
                        }
                        this.f۱۰۲۳۹g.put(f2.f۱۰۱۶۰g, f2);
                        fs2.f۱۰۳۱۱n = null;
                    }
                    i2++;
                }
                if (nonConfig != null) {
                    List<Fragment> nonConfigFragments3 = nonConfig.m۱۲۴۶۳b();
                    int count2 = nonConfigFragments3 != null ? nonConfigFragments3.size() : 0;
                    for (int i3 = 0; i3 < count2; i3++) {
                        ComponentCallbacksCf f3 = (ComponentCallbacksCf) nonConfigFragments3.get(i3);
                        int i4 = f3.f۱۰۱۶۴k;
                        if (i4 >= 0) {
                            f3.f۱۰۱۶۳j = this.f۱۰۲۳۹g.get(i4);
                            if (f3.f۱۰۱۶۳j == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + f3 + " target no longer exists: " + f3.f۱۰۱۶۴k);
                            }
                        }
                    }
                }
                this.f۱۰۲۳۸f.clear();
                if (fms.f۱۰۲۹۶d != null) {
                    int i5 = 0;
                    while (true) {
                        int[] iArr = fms.f۱۰۲۹۶d;
                        if (i5 >= iArr.length) {
                            break;
                        }
                        ComponentCallbacksCf f4 = this.f۱۰۲۳۹g.get(iArr[i5]);
                        if (f4 != null) {
                            f4.f۱۰۱۶۶m = true;
                            if (f۱۰۲۲۵G) {
                                Log.v("FragmentManager", "restoreAllState: added #" + i5 + ": " + f4);
                            }
                            if (!this.f۱۰۲۳۸f.contains(f4)) {
                                synchronized (this.f۱۰۲۳۸f) {
                                    this.f۱۰۲۳۸f.add(f4);
                                }
                                i5++;
                            } else {
                                throw new IllegalStateException("Already added!");
                            }
                        } else {
                            m۱۲۳۵۳a(new IllegalStateException("No instantiated fragment for index #" + fms.f۱۰۲۹۶d[i5]));
                            throw null;
                        }
                    }
                }
                Cd[] dVarArr = fms.f۱۰۲۹۷e;
                if (dVarArr != null) {
                    this.f۱۰۲۴۰h = new ArrayList<>(dVarArr.length);
                    int i6 = 0;
                    while (true) {
                        Cd[] dVarArr2 = fms.f۱۰۲۹۷e;
                        if (i6 >= dVarArr2.length) {
                            break;
                        }
                        Cc bse = dVarArr2[i6].m۱۲۱۰۳a(this);
                        if (f۱۰۲۲۵G) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + bse.f۱۰۰۹۳l + "): " + bse);
                            PrintWriter pw = new PrintWriter(new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ce("FragmentManager"));
                            bse.m۱۲۰۸۶a("  ", pw, false);
                            pw.close();
                        }
                        this.f۱۰۲۴۰h.add(bse);
                        int i7 = bse.f۱۰۰۹۳l;
                        if (i7 >= 0) {
                            m۱۲۳۷۸a(i7, bse);
                        }
                        i6++;
                    }
                } else {
                    this.f۱۰۲۴۰h = null;
                }
                int i8 = fms.f۱۰۲۹۸f;
                if (i8 >= 0) {
                    this.f۱۰۲۵۰r = this.f۱۰۲۳۹g.get(i8);
                }
                this.f۱۰۲۳۷e = fms.f۱۰۲۹۹g;
            }
        }
    }

    /* renamed from: y  reason: contains not printable characters */
    private void m۱۲۳۶۹y() {
        SparseArray<ComponentCallbacksCf> sparseArray = this.f۱۰۲۳۹g;
        if (sparseArray != null) {
            for (int i = sparseArray.size() - 1; i >= 0; i--) {
                if (this.f۱۰۲۳۹g.valueAt(i) == null) {
                    SparseArray<ComponentCallbacksCf> sparseArray2 = this.f۱۰۲۳۹g;
                    sparseArray2.delete(sparseArray2.keyAt(i));
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۹۰a(AbstractCj host, AbstractCh container, ComponentCallbacksCf parent) {
        if (this.f۱۰۲۴۷o == null) {
            this.f۱۰۲۴۷o = host;
            this.f۱۰۲۴۸p = container;
            this.f۱۰۲۴۹q = parent;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: r  reason: contains not printable characters */
    public void m۱۲۴۴۸r() {
        this.f۱۰۲۳۳E = null;
        this.f۱۰۲۵۲t = false;
        this.f۱۰۲۵۳u = false;
        int addedCount = this.f۱۰۲۳۸f.size();
        for (int i = 0; i < addedCount; i++) {
            ComponentCallbacksCf fragment = this.f۱۰۲۳۸f.get(i);
            if (fragment != null) {
                fragment.m۱۲۱۳۴J();
            }
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    public void m۱۲۴۲۲f() {
        this.f۱۰۲۵۲t = false;
        this.f۱۰۲۵۳u = false;
        m۱۲۳۶۶d(1);
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۲۴۱۹e() {
        this.f۱۰۲۵۲t = false;
        this.f۱۰۲۵۳u = false;
        m۱۲۳۶۶d(2);
    }

    /* renamed from: l  reason: contains not printable characters */
    public void m۱۲۴۳۷l() {
        this.f۱۰۲۵۲t = false;
        this.f۱۰۲۵۳u = false;
        m۱۲۳۶۶d(3);
    }

    /* renamed from: k  reason: contains not printable characters */
    public void m۱۲۴۳۵k() {
        this.f۱۰۲۵۲t = false;
        this.f۱۰۲۵۳u = false;
        m۱۲۳۶۶d(4);
    }

    /* renamed from: j  reason: contains not printable characters */
    public void m۱۲۴۳۳j() {
        m۱۲۳۶۶d(3);
    }

    /* renamed from: m  reason: contains not printable characters */
    public void m۱۲۴۴۰m() {
        this.f۱۰۲۵۳u = true;
        m۱۲۳۶۶d(2);
    }

    /* renamed from: h  reason: contains not printable characters */
    public void m۱۲۴۲۸h() {
        m۱۲۳۶۶d(1);
    }

    /* renamed from: g  reason: contains not printable characters */
    public void m۱۲۴۲۵g() {
        this.f۱۰۲۵۴v = true;
        m۱۲۴۴۴o();
        m۱۲۳۶۶d(0);
        this.f۱۰۲۴۷o = null;
        this.f۱۰۲۴۸p = null;
        this.f۱۰۲۴۹q = null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d  reason: contains not printable characters */
    private void m۱۲۳۶۶d(int nextState) {
        try {
            this.f۱۰۲۳۶d = true;
            m۱۲۳۷۹a(nextState, false);
            this.f۱۰۲۳۶d = false;
            m۱۲۴۴۴o();
        } catch (Throwable th) {
            this.f۱۰۲۳۶d = false;
            throw th;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۹۴a(boolean isInMultiWindowMode) {
        for (int i = this.f۱۰۲۳۸f.size() - 1; i >= 0; i--) {
            ComponentCallbacksCf f = this.f۱۰۲۳۸f.get(i);
            if (f != null) {
                f.m۱۲۲۰۰d(isInMultiWindowMode);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۴۰۷b(boolean isInPictureInPictureMode) {
        for (int i = this.f۱۰۲۳۸f.size() - 1; i >= 0; i--) {
            ComponentCallbacksCf f = this.f۱۰۲۳۸f.get(i);
            if (f != null) {
                f.m۱۲۲۰۴e(isInPictureInPictureMode);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۸۰a(Configuration newConfig) {
        for (int i = 0; i < this.f۱۰۲۳۸f.size(); i++) {
            ComponentCallbacksCf f = this.f۱۰۲۳۸f.get(i);
            if (f != null) {
                f.m۱۲۱۶۹a(newConfig);
            }
        }
    }

    /* renamed from: i  reason: contains not printable characters */
    public void m۱۲۴۳۱i() {
        for (int i = 0; i < this.f۱۰۲۳۸f.size(); i++) {
            ComponentCallbacksCf f = this.f۱۰۲۳۸f.get(i);
            if (f != null) {
                f.m۱۲۱۴۷W();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۳۹۵a(Menu menu, MenuInflater inflater) {
        if (this.f۱۰۲۴۶n < 1) {
            return false;
        }
        boolean show = false;
        ArrayList<Fragment> newMenus = null;
        for (int i = 0; i < this.f۱۰۲۳۸f.size(); i++) {
            ComponentCallbacksCf f = this.f۱۰۲۳۸f.get(i);
            if (f != null && f.m۱۲۱۸۷b(menu, inflater)) {
                show = true;
                if (newMenus == null) {
                    newMenus = new ArrayList<>();
                }
                newMenus.add(f);
            }
        }
        if (this.f۱۰۲۴۱i != null) {
            for (int i2 = 0; i2 < this.f۱۰۲۴۱i.size(); i2++) {
                ComponentCallbacksCf f2 = this.f۱۰۲۴۱i.get(i2);
                if (newMenus == null || !newMenus.contains(f2)) {
                    f2.m۱۲۱۳۶L();
                }
            }
        }
        this.f۱۰۲۴۱i = newMenus;
        return show;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۲۴۰۸b(Menu menu) {
        if (this.f۱۰۲۴۶n < 1) {
            return false;
        }
        boolean show = false;
        for (int i = 0; i < this.f۱۰۲۳۸f.size(); i++) {
            ComponentCallbacksCf f = this.f۱۰۲۳۸f.get(i);
            if (f != null && f.m۱۲۲۰۱d(menu)) {
                show = true;
            }
        }
        return show;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۲۴۰۹b(MenuItem item) {
        if (this.f۱۰۲۴۶n < 1) {
            return false;
        }
        for (int i = 0; i < this.f۱۰۲۳۸f.size(); i++) {
            ComponentCallbacksCf f = this.f۱۰۲۳۸f.get(i);
            if (f != null && f.m۱۲۲۰۲d(item)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۳۹۶a(MenuItem item) {
        if (this.f۱۰۲۴۶n < 1) {
            return false;
        }
        for (int i = 0; i < this.f۱۰۲۳۸f.size(); i++) {
            ComponentCallbacksCf f = this.f۱۰۲۳۸f.get(i);
            if (f != null && f.m۱۲۱۹۵c(item)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۹۲a(Menu menu) {
        if (this.f۱۰۲۴۶n >= 1) {
            for (int i = 0; i < this.f۱۰۲۳۸f.size(); i++) {
                ComponentCallbacksCf f = this.f۱۰۲۳۸f.get(i);
                if (f != null) {
                    f.m۱۲۱۹۳c(menu);
                }
            }
        }
    }

    /* renamed from: o  reason: contains not printable characters */
    public void m۱۲۴۴۳o(ComponentCallbacksCf f) {
        if (f == null || (this.f۱۰۲۳۹g.get(f.f۱۰۱۶۰g) == f && (f.f۱۰۱۷۴u == null || f.m۱۲۲۲۷p() == this))) {
            this.f۱۰۲۵۰r = f;
            return;
        }
        throw new IllegalArgumentException("Fragment " + f + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: q  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۲۴۴۷q() {
        return this.f۱۰۲۵۰r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۴۰۳b(ComponentCallbacksCf f, Context context, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۴۰۳b(f, context, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۳۲b(this, f, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۸۶a(ComponentCallbacksCf f, Context context, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۳۸۶a(f, context, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۲۸a(this, f, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۴۱۱c(ComponentCallbacksCf f, Bundle savedInstanceState, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۴۱۱c(f, savedInstanceState, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۳۵c(this, f, savedInstanceState);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۴۰۴b(ComponentCallbacksCf f, Bundle savedInstanceState, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۴۰۴b(f, savedInstanceState, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۳۳b(this, f, savedInstanceState);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۸۷a(ComponentCallbacksCf f, Bundle savedInstanceState, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۳۸۷a(f, savedInstanceState, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۲۹a(this, f, savedInstanceState);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۳۸۸a(ComponentCallbacksCf f, View v, Bundle savedInstanceState, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۳۸۸a(f, v, savedInstanceState, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۳۰a(this, f, v, savedInstanceState);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۲۴۲۴f(ComponentCallbacksCf f, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۴۲۴f(f, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۳۸e(this, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۲۴۲۱e(ComponentCallbacksCf f, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۴۲۱e(f, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۳۶d(this, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۲۴۱۷d(ComponentCallbacksCf f, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۴۱۷d(f, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۳۴c(this, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۲۴۲۷g(ComponentCallbacksCf f, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۴۲۷g(f, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۳۹f(this, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۲۴۱۶d(ComponentCallbacksCf f, Bundle outState, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۴۱۶d(f, outState, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۳۷d(this, f, outState);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۲۴۳۰h(ComponentCallbacksCf f, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۴۳۰h(f, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۴۰g(this, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۴۰۵b(ComponentCallbacksCf f, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۴۰۵b(f, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۲۷a(this, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۴۱۲c(ComponentCallbacksCf f, boolean onlyRecursive) {
        ComponentCallbacksCf fVar = this.f۱۰۲۴۹q;
        if (fVar != null) {
            AbstractCk parentManager = fVar.m۱۲۲۲۷p();
            if (parentManager instanceof LayoutInflater$Factory2Cl) {
                ((LayoutInflater$Factory2Cl) parentManager).m۱۲۴۱۲c(f, true);
            }
        }
        Iterator<Cj> it = this.f۱۰۲۴۵m.iterator();
        while (it.hasNext()) {
            Cj holder = it.next();
            if (!onlyRecursive || holder.f۱۰۲۸۳b) {
                holder.f۱۰۲۸۲a.m۱۲۳۳۱b(this, f);
            }
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    public static int m۱۲۳۶۷e(int transit) {
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

    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۲۳۵۹b(int transit, boolean enter) {
        if (transit == 4097) {
            return enter ? 1 : 2;
        } else if (transit == 4099) {
            return enter ? 5 : 6;
        } else if (transit != 8194) {
            return -1;
        } else {
            return enter ? 3 : 4;
        }
    }

    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        String fname;
        ComponentCallbacksCf fragment;
        if (!"fragment".equals(name)) {
            return null;
        }
        String fname2 = attrs.getAttributeValue(null, "class");
        TypedArray a = context.obtainStyledAttributes(attrs, Ck.f۱۰۲۸۴a);
        int containerId = 0;
        if (fname2 == null) {
            fname = a.getString(0);
        } else {
            fname = fname2;
        }
        int id = a.getResourceId(1, -1);
        String tag = a.getString(2);
        a.recycle();
        if (!ComponentCallbacksCf.m۱۲۱۲۳a(this.f۱۰۲۴۷o.m۱۲۳۱۰c(), fname)) {
            return null;
        }
        if (parent != null) {
            containerId = parent.getId();
        }
        if (containerId == -1 && id == -1 && tag == null) {
            throw new IllegalArgumentException(attrs.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + fname);
        }
        ComponentCallbacksCf fragment2 = id != -1 ? m۱۲۳۷۲a(id) : null;
        if (fragment2 == null && tag != null) {
            fragment2 = m۱۲۳۷۴a(tag);
        }
        if (fragment2 == null && containerId != -1) {
            fragment2 = m۱۲۳۷۲a(containerId);
        }
        if (f۱۰۲۲۵G) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(id) + " fname=" + fname + " existing=" + fragment2);
        }
        if (fragment2 == null) {
            ComponentCallbacksCf fragment3 = this.f۱۰۲۴۸p.m۱۲۲۷۶a(context, fname, null);
            fragment3.f۱۰۱۶۸o = true;
            fragment3.f۱۰۱۷۹z = id != 0 ? id : containerId;
            fragment3.f۱۰۱۳۲A = containerId;
            fragment3.f۱۰۱۳۳B = tag;
            fragment3.f۱۰۱۶۹p = true;
            fragment3.f۱۰۱۷۳t = this;
            AbstractCj jVar = this.f۱۰۲۴۷o;
            fragment3.f۱۰۱۷۴u = jVar;
            fragment3.m۱۲۱۶۴a(jVar.m۱۲۳۱۰c(), attrs, fragment3.f۱۰۱۵۷d);
            m۱۲۳۸۹a(fragment3, true);
            fragment = fragment3;
        } else if (!fragment2.f۱۰۱۶۹p) {
            fragment2.f۱۰۱۶۹p = true;
            AbstractCj jVar2 = this.f۱۰۲۴۷o;
            fragment2.f۱۰۱۷۴u = jVar2;
            if (!fragment2.f۱۰۱۳۷F) {
                fragment2.m۱۲۱۶۴a(jVar2.m۱۲۳۱۰c(), attrs, fragment2.f۱۰۱۵۷d);
            }
            fragment = fragment2;
        } else {
            throw new IllegalArgumentException(attrs.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(id) + ", tag " + tag + ", or parent id 0x" + Integer.toHexString(containerId) + " with another fragment for " + fname);
        }
        if (this.f۱۰۲۴۶n >= 1 || !fragment.f۱۰۱۶۸o) {
            m۱۲۴۳۴j(fragment);
        } else {
            m۱۲۳۸۵a(fragment, 1, 0, 0, false);
        }
        View view = fragment.f۱۰۱۴۲K;
        if (view != null) {
            if (id != 0) {
                view.setId(id);
            }
            if (fragment.f۱۰۱۴۲K.getTag() == null) {
                fragment.f۱۰۱۴۲K.setTag(tag);
            }
            return fragment.f۱۰۱۴۲K;
        }
        throw new IllegalStateException("Fragment " + fname + " did not create a view.");
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p  reason: contains not printable characters */
    public LayoutInflater.Factory2 m۱۲۴۴۵p() {
        return this;
    }

    /* renamed from: android.support.v4.app.l$m  reason: invalid class name */
    private class Cm implements AbstractCl {

        /* renamed from: a  reason: contains not printable characters */
        final String f۱۰۲۸۵a;

        /* renamed from: b  reason: contains not printable characters */
        final int f۱۰۲۸۶b;

        /* renamed from: c  reason: contains not printable characters */
        final int f۱۰۲۸۷c;

        Cm(String name, int id, int flags) {
            this.f۱۰۲۸۵a = name;
            this.f۱۰۲۸۶b = id;
            this.f۱۰۲۸۷c = flags;
        }

        @Override // android.support.p۰۴۳v4.app.LayoutInflater$Factory2Cl.AbstractCl
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۲۴۵۶a(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop) {
            AbstractCk childManager;
            ComponentCallbacksCf fVar = LayoutInflater$Factory2Cl.this.f۱۰۲۵۰r;
            if (fVar == null || this.f۱۰۲۸۶b >= 0 || this.f۱۰۲۸۵a != null || (childManager = fVar.m۱۲۱۴۳S()) == null || !childManager.m۱۲۳۲۶d()) {
                return LayoutInflater$Factory2Cl.this.m۱۲۳۹۷a(arrayList, isRecordPop, this.f۱۰۲۸۵a, this.f۱۰۲۸۶b, this.f۱۰۲۸۷c);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.l$n  reason: invalid class name */
    public static class Cn implements ComponentCallbacksCf.AbstractCf {

        /* renamed from: a  reason: contains not printable characters */
        final boolean f۱۰۲۸۹a;

        /* renamed from: b  reason: contains not printable characters */
        final Cc f۱۰۲۹۰b;

        /* renamed from: c  reason: contains not printable characters */
        private int f۱۰۲۹۱c;

        Cn(Cc record, boolean isBack) {
            this.f۱۰۲۸۹a = isBack;
            this.f۱۰۲۹۰b = record;
        }

        @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf.AbstractCf
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۴۵۷a() {
            this.f۱۰۲۹۱c--;
            if (this.f۱۰۲۹۱c == 0) {
                this.f۱۰۲۹۰b.f۱۰۰۸۲a.m۱۲۴۵۳w();
            }
        }

        @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf.AbstractCf
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۲۴۵۸b() {
            this.f۱۰۲۹۱c++;
        }

        /* renamed from: e  reason: contains not printable characters */
        public boolean m۱۲۴۶۱e() {
            return this.f۱۰۲۹۱c == 0;
        }

        /* renamed from: d  reason: contains not printable characters */
        public void m۱۲۴۶۰d() {
            boolean z = false;
            boolean canceled = this.f۱۰۲۹۱c > 0;
            LayoutInflater$Factory2Cl manager = this.f۱۰۲۹۰b.f۱۰۰۸۲a;
            int numAdded = manager.f۱۰۲۳۸f.size();
            for (int i = 0; i < numAdded; i++) {
                ComponentCallbacksCf fragment = manager.f۱۰۲۳۸f.get(i);
                fragment.m۱۲۱۷۰a((ComponentCallbacksCf.AbstractCf) null);
                if (canceled && fragment.m۱۲۱۳۲H()) {
                    fragment.m۱۲۱۹۶c0();
                }
            }
            Cc cVar = this.f۱۰۲۹۰b;
            LayoutInflater$Factory2Cl lVar = cVar.f۱۰۰۸۲a;
            boolean z2 = this.f۱۰۲۸۹a;
            if (!canceled) {
                z = true;
            }
            lVar.m۱۲۳۸۴a(cVar, z2, z, true);
        }

        /* renamed from: c  reason: contains not printable characters */
        public void m۱۲۴۵۹c() {
            Cc cVar = this.f۱۰۲۹۰b;
            cVar.f۱۰۰۸۲a.m۱۲۳۸۴a(cVar, this.f۱۰۲۸۹a, false, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.app.l$g  reason: invalid class name */
    public static class Cg {

        /* renamed from: a  reason: contains not printable characters */
        public final Animation f۱۰۲۷۴a;

        /* renamed from: b  reason: contains not printable characters */
        public final Animator f۱۰۲۷۵b;

        Cg(Animation animation) {
            this.f۱۰۲۷۴a = animation;
            this.f۱۰۲۷۵b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        Cg(Animator animator) {
            this.f۱۰۲۷۴a = null;
            this.f۱۰۲۷۵b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.app.l$f  reason: invalid class name */
    private static class animationAnimation$AnimationListenerCf implements Animation.AnimationListener {

        /* renamed from: a  reason: contains not printable characters */
        private final Animation.AnimationListener f۱۰۲۷۳a;

        animationAnimation$AnimationListenerCf(Animation.AnimationListener wrapped) {
            this.f۱۰۲۷۳a = wrapped;
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f۱۰۲۷۳a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f۱۰۲۷۳a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f۱۰۲۷۳a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.app.l$e  reason: invalid class name */
    public static class Ce extends animationAnimation$AnimationListenerCf {

        /* renamed from: b  reason: contains not printable characters */
        View f۱۰۲۷۱b;

        Ce(View v, Animation.AnimationListener listener) {
            super(listener);
            this.f۱۰۲۷۱b = v;
        }

        /* renamed from: android.support.v4.app.l$e$a  reason: invalid class name */
        class RunnableCa implements Runnable {
            RunnableCa() {
            }

            public void run() {
                Ce.this.f۱۰۲۷۱b.setLayerType(0, null);
            }
        }

        @Override // android.support.p۰۴۳v4.app.LayoutInflater$Factory2Cl.animationAnimation$AnimationListenerCf
        public void onAnimationEnd(Animation animation) {
            if (Cu.m۱۳۰۲۷x(this.f۱۰۲۷۱b) || Build.VERSION.SDK_INT >= 24) {
                this.f۱۰۲۷۱b.post(new RunnableCa());
            } else {
                this.f۱۰۲۷۱b.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.app.l$h  reason: invalid class name */
    public static class Ch extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        View f۱۰۲۷۶a;

        Ch(View v) {
            this.f۱۰۲۷۶a = v;
        }

        public void onAnimationStart(Animator animation) {
            this.f۱۰۲۷۶a.setLayerType(2, null);
        }

        public void onAnimationEnd(Animator animation) {
            this.f۱۰۲۷۶a.setLayerType(0, null);
            animation.removeListener(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.app.l$i  reason: invalid class name */
    public static class RunnableCi extends AnimationSet implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        private final ViewGroup f۱۰۲۷۷c;

        /* renamed from: d  reason: contains not printable characters */
        private final View f۱۰۲۷۸d;

        /* renamed from: e  reason: contains not printable characters */
        private boolean f۱۰۲۷۹e;

        /* renamed from: f  reason: contains not printable characters */
        private boolean f۱۰۲۸۰f;

        /* renamed from: g  reason: contains not printable characters */
        private boolean f۱۰۲۸۱g = true;

        RunnableCi(Animation animation, ViewGroup parent, View child) {
            super(false);
            this.f۱۰۲۷۷c = parent;
            this.f۱۰۲۷۸d = child;
            addAnimation(animation);
            this.f۱۰۲۷۷c.post(this);
        }

        public boolean getTransformation(long currentTime, Transformation t) {
            this.f۱۰۲۸۱g = true;
            if (this.f۱۰۲۷۹e) {
                return true ^ this.f۱۰۲۸۰f;
            }
            if (!super.getTransformation(currentTime, t)) {
                this.f۱۰۲۷۹e = true;
                ViewTreeObserver$OnPreDrawListenerCa0.m۱۲۰۶۶a(this.f۱۰۲۷۷c, this);
            }
            return true;
        }

        public boolean getTransformation(long currentTime, Transformation outTransformation, float scale) {
            this.f۱۰۲۸۱g = true;
            if (this.f۱۰۲۷۹e) {
                return true ^ this.f۱۰۲۸۰f;
            }
            if (!super.getTransformation(currentTime, outTransformation, scale)) {
                this.f۱۰۲۷۹e = true;
                ViewTreeObserver$OnPreDrawListenerCa0.m۱۲۰۶۶a(this.f۱۰۲۷۷c, this);
            }
            return true;
        }

        public void run() {
            if (this.f۱۰۲۷۹e || !this.f۱۰۲۸۱g) {
                this.f۱۰۲۷۷c.endViewTransition(this.f۱۰۲۷۸d);
                this.f۱۰۲۸۰f = true;
                return;
            }
            this.f۱۰۲۸۱g = false;
            this.f۱۰۲۷۷c.post(this);
        }
    }
}
