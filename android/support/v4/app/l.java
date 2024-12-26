package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.ViewModelStore;
import android.arch.lifecycle.p;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.f;
import android.support.v4.app.k;
import android.support.v4.util.ArraySet;
import android.support.v4.view.u;
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
public final class l extends k implements LayoutInflater.Factory2 {
    static boolean G = false;
    static Field H = null;
    static final Interpolator I = new DecelerateInterpolator(2.5f);
    static final Interpolator J = new DecelerateInterpolator(1.5f);
    ArrayList<f> A;
    Bundle B = null;
    SparseArray<Parcelable> C = null;
    ArrayList<n> D;
    m E;
    Runnable F = new a();

    /* renamed from: c  reason: collision with root package name */
    ArrayList<AbstractC۰۰۲۶l> f۱۱۰۴c;

    /* renamed from: d  reason: collision with root package name */
    boolean f۱۱۰۵d;

    /* renamed from: e  reason: collision with root package name */
    int f۱۱۰۶e = 0;

    /* renamed from: f  reason: collision with root package name */
    final ArrayList<f> f۱۱۰۷f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    SparseArray<f> f۱۱۰۸g;

    /* renamed from: h  reason: collision with root package name */
    ArrayList<c> f۱۱۰۹h;
    ArrayList<f> i;
    ArrayList<c> j;
    ArrayList<Integer> k;
    ArrayList<k.c> l;
    private final CopyOnWriteArrayList<j> m = new CopyOnWriteArrayList<>();
    int n = 0;
    j o;
    h p;
    f q;
    f r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    String w;
    boolean x;
    ArrayList<c> y;
    ArrayList<Boolean> z;

    /* access modifiers changed from: private */
    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        final k.b f۱۱۳۳a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f۱۱۳۴b;
    }

    /* access modifiers changed from: package-private */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f۱۱۳۵a = {16842755, 16842960, 16842961};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.l$l  reason: collision with other inner class name */
    public interface AbstractC۰۰۲۶l {
        boolean a(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2);
    }

    l() {
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            l.this.o();
        }
    }

    static boolean a(g anim) {
        Animation animation = anim.f۱۱۲۵a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return a(anim.f۱۱۲۶b);
        }
        List<Animation> anims = ((AnimationSet) animation).getAnimations();
        for (int i2 = 0; i2 < anims.size(); i2++) {
            if (anims.get(i2) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    static boolean a(Animator anim) {
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
            for (int i2 = 0; i2 < animList.size(); i2++) {
                if (a(animList.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(View v2, g anim) {
        if (v2 == null || anim == null || Build.VERSION.SDK_INT < 19 || v2.getLayerType() != 0 || !u.v(v2) || !a(anim)) {
            return false;
        }
        return true;
    }

    private void a(RuntimeException ex) {
        Log.e("FragmentManager", ex.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter pw = new PrintWriter(new a.b.g.g.e("FragmentManager"));
        j jVar = this.o;
        if (jVar != null) {
            try {
                jVar.a("  ", (FileDescriptor) null, pw, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                a("  ", (FileDescriptor) null, pw, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw ex;
    }

    @Override // android.support.v4.app.k
    public q a() {
        return new c(this);
    }

    @Override // android.support.v4.app.k
    public boolean d() {
        z();
        return a((String) null, -1, 0);
    }

    @Override // android.support.v4.app.k
    public void a(int id, int flags) {
        if (id >= 0) {
            a((AbstractC۰۰۲۶l) new m(null, id, flags), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + id);
    }

    private boolean a(String name, int id, int flags) {
        k childManager;
        o();
        c(true);
        f fVar = this.r;
        if (fVar != null && id < 0 && name == null && (childManager = fVar.S()) != null && childManager.d()) {
            return true;
        }
        boolean executePop = a(this.y, this.z, name, id, flags);
        if (executePop) {
            this.f۱۱۰۵d = true;
            try {
                c(this.y, this.z);
            } finally {
                A();
            }
        }
        n();
        y();
        return executePop;
    }

    @Override // android.support.v4.app.k
    public void a(Bundle bundle, String key, f fragment) {
        int i2 = fragment.f۱۰۷۴g;
        if (i2 >= 0) {
            bundle.putInt(key, i2);
            return;
        }
        a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    @Override // android.support.v4.app.k
    public f a(Bundle bundle, String key) {
        int index = bundle.getInt(key, -1);
        if (index == -1) {
            return null;
        }
        f f2 = this.f۱۱۰۸g.get(index);
        if (f2 != null) {
            return f2;
        }
        a(new IllegalStateException("Fragment no longer exists for key " + key + ": index " + index));
        throw null;
    }

    @Override // android.support.v4.app.k
    public List<f> b() {
        List<f> list;
        if (this.f۱۱۰۷f.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f۱۱۰۷f) {
            list = (List) this.f۱۱۰۷f.clone();
        }
        return list;
    }

    @Override // android.support.v4.app.k
    public f.g a(f fragment) {
        Bundle result;
        if (fragment.f۱۰۷۴g < 0) {
            a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
            throw null;
        } else if (fragment.f۱۰۷۰c <= 0 || (result = m(fragment)) == null) {
            return null;
        } else {
            return new f.g(result);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        f fVar = this.q;
        if (fVar != null) {
            a.b.g.g.d.a(fVar, sb);
        } else {
            a.b.g.g.d.a(this.o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // android.support.v4.app.k
    public void a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        int N;
        int N2;
        int N3;
        int N4;
        int N5;
        String innerPrefix = prefix + "    ";
        SparseArray<f> sparseArray = this.f۱۱۰۸g;
        if (sparseArray != null && (N5 = sparseArray.size()) > 0) {
            writer.print(prefix);
            writer.print("Active Fragments in ");
            writer.print(Integer.toHexString(System.identityHashCode(this)));
            writer.println(":");
            for (int i2 = 0; i2 < N5; i2++) {
                f f2 = this.f۱۱۰۸g.valueAt(i2);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i2);
                writer.print(": ");
                writer.println(f2);
                if (f2 != null) {
                    f2.a(innerPrefix, fd, writer, args);
                }
            }
        }
        int N6 = this.f۱۱۰۷f.size();
        if (N6 > 0) {
            writer.print(prefix);
            writer.println("Added Fragments:");
            for (int i3 = 0; i3 < N6; i3++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i3);
                writer.print(": ");
                writer.println(this.f۱۱۰۷f.get(i3).toString());
            }
        }
        ArrayList<f> arrayList = this.i;
        if (arrayList != null && (N4 = arrayList.size()) > 0) {
            writer.print(prefix);
            writer.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < N4; i4++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i4);
                writer.print(": ");
                writer.println(this.i.get(i4).toString());
            }
        }
        ArrayList<c> arrayList2 = this.f۱۱۰۹h;
        if (arrayList2 != null && (N3 = arrayList2.size()) > 0) {
            writer.print(prefix);
            writer.println("Back Stack:");
            for (int i5 = 0; i5 < N3; i5++) {
                c bs = this.f۱۱۰۹h.get(i5);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i5);
                writer.print(": ");
                writer.println(bs.toString());
                bs.a(innerPrefix, fd, writer, args);
            }
        }
        synchronized (this) {
            if (this.j != null && (N2 = this.j.size()) > 0) {
                writer.print(prefix);
                writer.println("Back Stack Indices:");
                for (int i6 = 0; i6 < N2; i6++) {
                    writer.print(prefix);
                    writer.print("  #");
                    writer.print(i6);
                    writer.print(": ");
                    writer.println(this.j.get(i6));
                }
            }
            if (this.k != null && this.k.size() > 0) {
                writer.print(prefix);
                writer.print("mAvailBackStackIndices: ");
                writer.println(Arrays.toString(this.k.toArray()));
            }
        }
        ArrayList<AbstractC۰۰۲۶l> arrayList3 = this.f۱۱۰۴c;
        if (arrayList3 != null && (N = arrayList3.size()) > 0) {
            writer.print(prefix);
            writer.println("Pending Actions:");
            for (int i7 = 0; i7 < N; i7++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i7);
                writer.print(": ");
                writer.println(this.f۱۱۰۴c.get(i7));
            }
        }
        writer.print(prefix);
        writer.println("FragmentManager misc state:");
        writer.print(prefix);
        writer.print("  mHost=");
        writer.println(this.o);
        writer.print(prefix);
        writer.print("  mContainer=");
        writer.println(this.p);
        if (this.q != null) {
            writer.print(prefix);
            writer.print("  mParent=");
            writer.println(this.q);
        }
        writer.print(prefix);
        writer.print("  mCurState=");
        writer.print(this.n);
        writer.print(" mStateSaved=");
        writer.print(this.t);
        writer.print(" mStopped=");
        writer.print(this.u);
        writer.print(" mDestroyed=");
        writer.println(this.v);
        if (this.s) {
            writer.print(prefix);
            writer.print("  mNeedMenuInvalidate=");
            writer.println(this.s);
        }
        if (this.w != null) {
            writer.print(prefix);
            writer.print("  mNoTransactionsBecause=");
            writer.println(this.w);
        }
    }

    static g a(Context context, float startScale, float endScale, float startAlpha, float endAlpha) {
        AnimationSet set = new AnimationSet(false);
        ScaleAnimation scale = new ScaleAnimation(startScale, endScale, startScale, endScale, 1, 0.5f, 1, 0.5f);
        scale.setInterpolator(I);
        scale.setDuration(220);
        set.addAnimation(scale);
        AlphaAnimation alpha = new AlphaAnimation(startAlpha, endAlpha);
        alpha.setInterpolator(J);
        alpha.setDuration(220);
        set.addAnimation(alpha);
        return new g(set);
    }

    static g a(Context context, float start, float end) {
        AlphaAnimation anim = new AlphaAnimation(start, end);
        anim.setInterpolator(J);
        anim.setDuration(220);
        return new g(anim);
    }

    /* access modifiers changed from: package-private */
    public g a(f fragment, int transit, boolean enter, int transitionStyle) {
        int styleIndex;
        int nextAnim = fragment.q();
        Animation animation = fragment.a(transit, enter, nextAnim);
        if (animation != null) {
            return new g(animation);
        }
        Animator animator = fragment.b(transit, enter, nextAnim);
        if (animator != null) {
            return new g(animator);
        }
        if (nextAnim != 0) {
            boolean isAnim = "anim".equals(this.o.c().getResources().getResourceTypeName(nextAnim));
            boolean successfulLoad = false;
            if (isAnim) {
                try {
                    Animation animation2 = AnimationUtils.loadAnimation(this.o.c(), nextAnim);
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
                    Animator animator2 = AnimatorInflater.loadAnimator(this.o.c(), nextAnim);
                    if (animator2 != null) {
                        return new g(animator2);
                    }
                } catch (RuntimeException e4) {
                    if (!isAnim) {
                        Animation animation3 = AnimationUtils.loadAnimation(this.o.c(), nextAnim);
                        if (animation3 != null) {
                            return new g(animation3);
                        }
                    } else {
                        throw e4;
                    }
                }
            }
        }
        if (transit == 0 || (styleIndex = b(transit, enter)) < 0) {
            return null;
        }
        switch (styleIndex) {
            case 1:
                return a(this.o.c(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return a(this.o.c(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return a(this.o.c(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return a(this.o.c(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return a(this.o.c(), 0.0f, 1.0f);
            case 6:
                return a(this.o.c(), 1.0f, 0.0f);
            default:
                if (transitionStyle == 0 && this.o.h()) {
                    transitionStyle = this.o.g();
                }
                return transitionStyle == 0 ? null : null;
        }
    }

    public void k(f f2) {
        if (!f2.M) {
            return;
        }
        if (this.f۱۱۰۵d) {
            this.x = true;
            return;
        }
        f2.M = false;
        a(f2, this.n, 0, 0, false);
    }

    private static void a(View v2, g anim) {
        if (v2 != null && anim != null && b(v2, anim)) {
            Animator animator = anim.f۱۱۲۶b;
            if (animator != null) {
                animator.addListener(new h(v2));
                return;
            }
            Animation.AnimationListener originalListener = a(anim.f۱۱۲۵a);
            v2.setLayerType(2, null);
            anim.f۱۱۲۵a.setAnimationListener(new e(v2, originalListener));
        }
    }

    private static Animation.AnimationListener a(Animation animation) {
        try {
            if (H == null) {
                H = Animation.class.getDeclaredField("mListener");
                H.setAccessible(true);
            }
            return (Animation.AnimationListener) H.get(animation);
        } catch (NoSuchFieldException e2) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e2);
            return null;
        } catch (IllegalAccessException e3) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e3);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(int state) {
        return this.n >= state;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0070, code lost:
        if (r1 != 3) goto L_0x02d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.support.v4.app.f r17, int r18, int r19, int r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 1138
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.l.a(android.support.v4.app.f, int, int, int, boolean):void");
    }

    private void a(f fragment, g anim, int newState) {
        View viewToAnimate = fragment.K;
        ViewGroup container = fragment.J;
        container.startViewTransition(viewToAnimate);
        fragment.d(newState);
        Animation animation = anim.f۱۱۲۵a;
        if (animation != null) {
            Animation animation2 = new i(animation, container, viewToAnimate);
            fragment.a(fragment.K);
            animation2.setAnimationListener(new b(a(animation2), container, fragment));
            a(viewToAnimate, anim);
            fragment.K.startAnimation(animation2);
            return;
        }
        Animator animator = anim.f۱۱۲۶b;
        fragment.a(anim.f۱۱۲۶b);
        animator.addListener(new c(container, viewToAnimate, fragment));
        animator.setTarget(fragment.K);
        a(fragment.K, anim);
        animator.start();
    }

    /* access modifiers changed from: package-private */
    public class b extends f {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f۱۱۱۱b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f۱۱۱۲c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Animation.AnimationListener wrapped, ViewGroup viewGroup, f fVar) {
            super(wrapped);
            this.f۱۱۱۱b = viewGroup;
            this.f۱۱۱۲c = fVar;
        }

        @Override // android.support.v4.app.l.f
        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.f۱۱۱۱b.post(new a());
        }

        class a implements Runnable {
            a() {
            }

            public void run() {
                if (b.this.f۱۱۱۲c.g() != null) {
                    b.this.f۱۱۱۲c.a((View) null);
                    b bVar = b.this;
                    l lVar = l.this;
                    f fVar = bVar.f۱۱۱۲c;
                    lVar.a(fVar, fVar.z(), 0, 0, false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f۱۱۱۵a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f۱۱۱۶b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f۱۱۱۷c;

        c(ViewGroup viewGroup, View view, f fVar) {
            this.f۱۱۱۵a = viewGroup;
            this.f۱۱۱۶b = view;
            this.f۱۱۱۷c = fVar;
        }

        public void onAnimationEnd(Animator anim) {
            this.f۱۱۱۵a.endViewTransition(this.f۱۱۱۶b);
            Animator animator = this.f۱۱۱۷c.h();
            this.f۱۱۱۷c.a((Animator) null);
            if (animator != null && this.f۱۱۱۵a.indexOfChild(this.f۱۱۱۶b) < 0) {
                l lVar = l.this;
                f fVar = this.f۱۱۱۷c;
                lVar.a(fVar, fVar.z(), 0, 0, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(f f2) {
        a(f2, this.n, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    public void e(f f2) {
        if (f2.o && !f2.r) {
            f2.b(f2.i(f2.f۱۰۷۱d), (ViewGroup) null, f2.f۱۰۷۱d);
            View view = f2.K;
            if (view != null) {
                f2.L = view;
                view.setSaveFromParentEnabled(false);
                if (f2.C) {
                    f2.K.setVisibility(8);
                }
                f2.a(f2.K, f2.f۱۰۷۱d);
                a(f2, f2.K, f2.f۱۰۷۱d, false);
                return;
            }
            f2.L = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(f fragment) {
        Animator animator;
        if (fragment.K != null) {
            g anim = a(fragment, fragment.r(), !fragment.C, fragment.s());
            if (anim == null || (animator = anim.f۱۱۲۶b) == null) {
                if (anim != null) {
                    a(fragment.K, anim);
                    fragment.K.startAnimation(anim.f۱۱۲۵a);
                    anim.f۱۱۲۵a.start();
                }
                fragment.K.setVisibility((!fragment.C || fragment.F()) ? 0 : 8);
                if (fragment.F()) {
                    fragment.f(false);
                }
            } else {
                animator.setTarget(fragment.K);
                if (!fragment.C) {
                    fragment.K.setVisibility(0);
                } else if (fragment.F()) {
                    fragment.f(false);
                } else {
                    ViewGroup container = fragment.J;
                    View animatingView = fragment.K;
                    container.startViewTransition(animatingView);
                    anim.f۱۱۲۶b.addListener(new d(this, container, animatingView, fragment));
                }
                a(fragment.K, anim);
                anim.f۱۱۲۶b.start();
            }
        }
        if (fragment.m && fragment.G && fragment.H) {
            this.s = true;
        }
        fragment.Q = false;
        fragment.a(fragment.C);
    }

    /* access modifiers changed from: package-private */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f۱۱۱۹a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f۱۱۲۰b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f۱۱۲۱c;

        d(l this$0, ViewGroup viewGroup, View view, f fVar) {
            this.f۱۱۱۹a = viewGroup;
            this.f۱۱۲۰b = view;
            this.f۱۱۲۱c = fVar;
        }

        public void onAnimationEnd(Animator animation) {
            this.f۱۱۱۹a.endViewTransition(this.f۱۱۲۰b);
            animation.removeListener(this);
            View view = this.f۱۱۲۱c.K;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(f f2) {
        ViewGroup container;
        int underIndex;
        int viewIndex;
        if (f2 != null) {
            int nextState = this.n;
            if (f2.n) {
                if (f2.G()) {
                    nextState = Math.min(nextState, 1);
                } else {
                    nextState = Math.min(nextState, 0);
                }
            }
            a(f2, nextState, f2.r(), f2.s(), false);
            if (f2.K != null) {
                f underFragment = q(f2);
                if (underFragment != null && (viewIndex = container.indexOfChild(f2.K)) < (underIndex = (container = f2.J).indexOfChild(underFragment.K))) {
                    container.removeViewAt(viewIndex);
                    container.addView(f2.K, underIndex);
                }
                if (f2.P && f2.J != null) {
                    float f3 = f2.R;
                    if (f3 > 0.0f) {
                        f2.K.setAlpha(f3);
                    }
                    f2.R = 0.0f;
                    f2.P = false;
                    g anim = a(f2, f2.r(), true, f2.s());
                    if (anim != null) {
                        a(f2.K, anim);
                        Animation animation = anim.f۱۱۲۵a;
                        if (animation != null) {
                            f2.K.startAnimation(animation);
                        } else {
                            anim.f۱۱۲۶b.setTarget(f2.K);
                            anim.f۱۱۲۶b.start();
                        }
                    }
                }
            }
            if (f2.Q) {
                c(f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int newState, boolean always) {
        j jVar;
        if (this.o == null && newState != 0) {
            throw new IllegalStateException("No activity");
        } else if (always || newState != this.n) {
            this.n = newState;
            if (this.f۱۱۰۸g != null) {
                int numAdded = this.f۱۱۰۷f.size();
                for (int i2 = 0; i2 < numAdded; i2++) {
                    i(this.f۱۱۰۷f.get(i2));
                }
                int numActive = this.f۱۱۰۸g.size();
                for (int i3 = 0; i3 < numActive; i3++) {
                    f f2 = this.f۱۱۰۸g.valueAt(i3);
                    if (f2 != null && ((f2.n || f2.D) && !f2.P)) {
                        i(f2);
                    }
                }
                x();
                if (this.s && (jVar = this.o) != null && this.n == 4) {
                    jVar.i();
                    this.s = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x() {
        if (this.f۱۱۰۸g != null) {
            for (int i2 = 0; i2 < this.f۱۱۰۸g.size(); i2++) {
                f f2 = this.f۱۱۰۸g.valueAt(i2);
                if (f2 != null) {
                    k(f2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(f f2) {
        if (f2.f۱۰۷۴g < 0) {
            int i2 = this.f۱۱۰۶e;
            this.f۱۱۰۶e = i2 + 1;
            f2.a(i2, this.q);
            if (this.f۱۱۰۸g == null) {
                this.f۱۱۰۸g = new SparseArray<>();
            }
            this.f۱۱۰۸g.put(f2.f۱۰۷۴g, f2);
            if (G) {
                Log.v("FragmentManager", "Allocated fragment index " + f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(f f2) {
        if (f2.f۱۰۷۴g >= 0) {
            if (G) {
                Log.v("FragmentManager", "Freeing fragment index " + f2);
            }
            this.f۱۱۰۸g.put(f2.f۱۰۷۴g, null);
            f2.B();
        }
    }

    public void a(f fragment, boolean moveToStateNow) {
        if (G) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        g(fragment);
        if (fragment.D) {
            return;
        }
        if (!this.f۱۱۰۷f.contains(fragment)) {
            synchronized (this.f۱۱۰۷f) {
                this.f۱۱۰۷f.add(fragment);
            }
            fragment.m = true;
            fragment.n = false;
            if (fragment.K == null) {
                fragment.Q = false;
            }
            if (fragment.G && fragment.H) {
                this.s = true;
            }
            if (moveToStateNow) {
                j(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void l(f fragment) {
        if (G) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.s);
        }
        boolean inactive = !fragment.G();
        if (!fragment.D || inactive) {
            synchronized (this.f۱۱۰۷f) {
                this.f۱۱۰۷f.remove(fragment);
            }
            if (fragment.G && fragment.H) {
                this.s = true;
            }
            fragment.m = false;
            fragment.n = true;
        }
    }

    public void f(f fragment) {
        if (G) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.C) {
            fragment.C = true;
            fragment.Q = true ^ fragment.Q;
        }
    }

    public void p(f fragment) {
        if (G) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.C) {
            fragment.C = false;
            fragment.Q = !fragment.Q;
        }
    }

    public void d(f fragment) {
        if (G) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.D) {
            fragment.D = true;
            if (fragment.m) {
                if (G) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                synchronized (this.f۱۱۰۷f) {
                    this.f۱۱۰۷f.remove(fragment);
                }
                if (fragment.G && fragment.H) {
                    this.s = true;
                }
                fragment.m = false;
            }
        }
    }

    public void b(f fragment) {
        if (G) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.D) {
            fragment.D = false;
            if (fragment.m) {
                return;
            }
            if (!this.f۱۱۰۷f.contains(fragment)) {
                if (G) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                synchronized (this.f۱۱۰۷f) {
                    this.f۱۱۰۷f.add(fragment);
                }
                fragment.m = true;
                if (fragment.G && fragment.H) {
                    this.s = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    public f a(int id) {
        for (int i2 = this.f۱۱۰۷f.size() - 1; i2 >= 0; i2--) {
            f f2 = this.f۱۱۰۷f.get(i2);
            if (f2 != null && f2.z == id) {
                return f2;
            }
        }
        SparseArray<f> sparseArray = this.f۱۱۰۸g;
        if (sparseArray == null) {
            return null;
        }
        for (int i3 = sparseArray.size() - 1; i3 >= 0; i3--) {
            f f3 = this.f۱۱۰۸g.valueAt(i3);
            if (f3 != null && f3.z == id) {
                return f3;
            }
        }
        return null;
    }

    @Override // android.support.v4.app.k
    public f a(String tag) {
        if (tag != null) {
            for (int i2 = this.f۱۱۰۷f.size() - 1; i2 >= 0; i2--) {
                f f2 = this.f۱۱۰۷f.get(i2);
                if (f2 != null && tag.equals(f2.B)) {
                    return f2;
                }
            }
        }
        SparseArray<f> sparseArray = this.f۱۱۰۸g;
        if (sparseArray == null || tag == null) {
            return null;
        }
        for (int i3 = sparseArray.size() - 1; i3 >= 0; i3--) {
            f f3 = this.f۱۱۰۸g.valueAt(i3);
            if (f3 != null && tag.equals(f3.B)) {
                return f3;
            }
        }
        return null;
    }

    public f b(String who) {
        f f2;
        SparseArray<f> sparseArray = this.f۱۱۰۸g;
        if (sparseArray == null || who == null) {
            return null;
        }
        for (int i2 = sparseArray.size() - 1; i2 >= 0; i2--) {
            f f3 = this.f۱۱۰۸g.valueAt(i2);
            if (!(f3 == null || (f2 = f3.a(who)) == null)) {
                return f2;
            }
        }
        return null;
    }

    private void z() {
        if (c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.w != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.w);
        }
    }

    @Override // android.support.v4.app.k
    public boolean c() {
        return this.t || this.u;
    }

    public void a(AbstractC۰۰۲۶l action, boolean allowStateLoss) {
        if (!allowStateLoss) {
            z();
        }
        synchronized (this) {
            if (!this.v) {
                if (this.o != null) {
                    if (this.f۱۱۰۴c == null) {
                        this.f۱۱۰۴c = new ArrayList<>();
                    }
                    this.f۱۱۰۴c.add(action);
                    w();
                    return;
                }
            }
            if (!allowStateLoss) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        synchronized (this) {
            boolean pendingReady = false;
            boolean postponeReady = this.D != null && !this.D.isEmpty();
            if (this.f۱۱۰۴c != null && this.f۱۱۰۴c.size() == 1) {
                pendingReady = true;
            }
            if (postponeReady || pendingReady) {
                this.o.e().removeCallbacks(this.F);
                this.o.e().post(this.F);
            }
        }
    }

    public int b(c bse) {
        synchronized (this) {
            if (this.k != null) {
                if (this.k.size() > 0) {
                    int index = this.k.remove(this.k.size() - 1).intValue();
                    if (G) {
                        Log.v("FragmentManager", "Adding back stack index " + index + " with " + bse);
                    }
                    this.j.set(index, bse);
                    return index;
                }
            }
            if (this.j == null) {
                this.j = new ArrayList<>();
            }
            int index2 = this.j.size();
            if (G) {
                Log.v("FragmentManager", "Setting back stack index " + index2 + " to " + bse);
            }
            this.j.add(bse);
            return index2;
        }
    }

    public void a(int index, c bse) {
        synchronized (this) {
            if (this.j == null) {
                this.j = new ArrayList<>();
            }
            int N = this.j.size();
            if (index < N) {
                if (G) {
                    Log.v("FragmentManager", "Setting back stack index " + index + " to " + bse);
                }
                this.j.set(index, bse);
            } else {
                while (N < index) {
                    this.j.add(null);
                    if (this.k == null) {
                        this.k = new ArrayList<>();
                    }
                    if (G) {
                        Log.v("FragmentManager", "Adding available back stack index " + N);
                    }
                    this.k.add(Integer.valueOf(N));
                    N++;
                }
                if (G) {
                    Log.v("FragmentManager", "Adding back stack index " + index + " with " + bse);
                }
                this.j.add(bse);
            }
        }
    }

    public void b(int index) {
        synchronized (this) {
            this.j.set(index, null);
            if (this.k == null) {
                this.k = new ArrayList<>();
            }
            if (G) {
                Log.v("FragmentManager", "Freeing back stack index " + index);
            }
            this.k.add(Integer.valueOf(index));
        }
    }

    private void c(boolean allowStateLoss) {
        if (this.f۱۱۰۵d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.o == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.o.e().getLooper()) {
            if (!allowStateLoss) {
                z();
            }
            if (this.y == null) {
                this.y = new ArrayList<>();
                this.z = new ArrayList<>();
            }
            this.f۱۱۰۵d = true;
            try {
                a((ArrayList<c>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f۱۱۰۵d = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public void b(AbstractC۰۰۲۶l action, boolean allowStateLoss) {
        if (!allowStateLoss || (this.o != null && !this.v)) {
            c(allowStateLoss);
            if (action.a(this.y, this.z)) {
                this.f۱۱۰۵d = true;
                try {
                    c(this.y, this.z);
                } finally {
                    A();
                }
            }
            n();
            y();
        }
    }

    private void A() {
        this.f۱۱۰۵d = false;
        this.z.clear();
        this.y.clear();
    }

    /* JADX INFO: finally extract failed */
    public boolean o() {
        c(true);
        boolean didSomething = false;
        while (b(this.y, this.z)) {
            this.f۱۱۰۵d = true;
            try {
                c(this.y, this.z);
                A();
                didSomething = true;
            } catch (Throwable th) {
                A();
                throw th;
            }
        }
        n();
        y();
        return didSomething;
    }

    private void a(ArrayList<c> arrayList, ArrayList<Boolean> isRecordPop) {
        int index;
        int index2;
        ArrayList<n> arrayList2 = this.D;
        int numPostponed = arrayList2 == null ? 0 : arrayList2.size();
        int i2 = 0;
        while (i2 < numPostponed) {
            n listener = this.D.get(i2);
            if (arrayList != null && !listener.f۱۱۴۰a && (index2 = arrayList.indexOf(listener.f۱۱۴۱b)) != -1 && isRecordPop.get(index2).booleanValue()) {
                listener.c();
            } else if (listener.e() || (arrayList != null && listener.f۱۱۴۱b.a(arrayList, 0, arrayList.size()))) {
                this.D.remove(i2);
                i2--;
                numPostponed--;
                if (arrayList == null || listener.f۱۱۴۰a || (index = arrayList.indexOf(listener.f۱۱۴۱b)) == -1 || !isRecordPop.get(index).booleanValue()) {
                    listener.d();
                } else {
                    listener.c();
                }
            }
            i2++;
        }
    }

    private void c(ArrayList<c> arrayList, ArrayList<Boolean> isRecordPop) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (isRecordPop == null || arrayList.size() != isRecordPop.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            a(arrayList, isRecordPop);
            int numRecords = arrayList.size();
            int startIndex = 0;
            int recordNum = 0;
            while (recordNum < numRecords) {
                if (!arrayList.get(recordNum).s) {
                    if (startIndex != recordNum) {
                        b(arrayList, isRecordPop, startIndex, recordNum);
                    }
                    int reorderingEnd = recordNum + 1;
                    if (isRecordPop.get(recordNum).booleanValue()) {
                        while (reorderingEnd < numRecords && isRecordPop.get(reorderingEnd).booleanValue() && !arrayList.get(reorderingEnd).s) {
                            reorderingEnd++;
                        }
                    }
                    b(arrayList, isRecordPop, recordNum, reorderingEnd);
                    startIndex = reorderingEnd;
                    recordNum = reorderingEnd - 1;
                }
                recordNum++;
            }
            if (startIndex != numRecords) {
                b(arrayList, isRecordPop, startIndex, numRecords);
            }
        }
    }

    private void b(ArrayList<c> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        int i2;
        boolean allowReordering = arrayList.get(startIndex).s;
        ArrayList<f> arrayList2 = this.A;
        if (arrayList2 == null) {
            this.A = new ArrayList<>();
        } else {
            arrayList2.clear();
        }
        this.A.addAll(this.f۱۱۰۷f);
        int recordNum = startIndex;
        boolean addToBackStack = false;
        f oldPrimaryNav = q();
        while (true) {
            boolean z2 = true;
            if (recordNum >= endIndex) {
                break;
            }
            c record = arrayList.get(recordNum);
            if (!isRecordPop.get(recordNum).booleanValue()) {
                oldPrimaryNav = record.a(this.A, oldPrimaryNav);
            } else {
                oldPrimaryNav = record.b(this.A, oldPrimaryNav);
            }
            if (!addToBackStack && !record.i) {
                z2 = false;
            }
            addToBackStack = z2;
            recordNum++;
        }
        this.A.clear();
        if (!allowReordering) {
            r.a(this, arrayList, isRecordPop, startIndex, endIndex, false);
        }
        a(arrayList, isRecordPop, startIndex, endIndex);
        int postponeIndex = endIndex;
        if (allowReordering) {
            ArraySet<Fragment> addedFragments = new a.b.g.g.b<>();
            a((a.b.g.g.b<f>) addedFragments);
            int postponeIndex2 = a(arrayList, isRecordPop, startIndex, endIndex, (a.b.g.g.b<f>) addedFragments);
            b((a.b.g.g.b<f>) addedFragments);
            postponeIndex = postponeIndex2;
        }
        if (postponeIndex != startIndex && allowReordering) {
            r.a(this, arrayList, isRecordPop, startIndex, postponeIndex, true);
            a(this.n, true);
        }
        for (int recordNum2 = startIndex; recordNum2 < endIndex; recordNum2++) {
            c record2 = arrayList.get(recordNum2);
            if (isRecordPop.get(recordNum2).booleanValue() && (i2 = record2.l) >= 0) {
                b(i2);
                record2.l = -1;
            }
            record2.h();
        }
        if (addToBackStack) {
            s();
        }
    }

    private void b(a.b.g.g.b<f> bVar) {
        int numAdded = bVar.size();
        for (int i2 = 0; i2 < numAdded; i2++) {
            f fragment = bVar.c(i2);
            if (!fragment.m) {
                View view = fragment.A();
                fragment.R = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    private int a(ArrayList<c> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex, a.b.g.g.b<f> bVar) {
        int postponeIndex = endIndex;
        for (int i2 = endIndex - 1; i2 >= startIndex; i2--) {
            c record = arrayList.get(i2);
            boolean isPop = isRecordPop.get(i2).booleanValue();
            if (record.g() && !record.a(arrayList, i2 + 1, endIndex)) {
                if (this.D == null) {
                    this.D = new ArrayList<>();
                }
                n listener = new n(record, isPop);
                this.D.add(listener);
                record.a(listener);
                if (isPop) {
                    record.e();
                } else {
                    record.b(false);
                }
                postponeIndex--;
                if (i2 != postponeIndex) {
                    arrayList.remove(i2);
                    arrayList.add(postponeIndex, record);
                }
                a(bVar);
            }
        }
        return postponeIndex;
    }

    /* access modifiers changed from: package-private */
    public void a(c record, boolean isPop, boolean runTransitions, boolean moveToState) {
        if (isPop) {
            record.b(moveToState);
        } else {
            record.e();
        }
        ArrayList<BackStackRecord> records = new ArrayList<>(1);
        ArrayList<Boolean> isRecordPop = new ArrayList<>(1);
        records.add(record);
        isRecordPop.add(Boolean.valueOf(isPop));
        if (runTransitions) {
            r.a(this, (ArrayList<c>) records, isRecordPop, 0, 1, true);
        }
        if (moveToState) {
            a(this.n, true);
        }
        SparseArray<f> sparseArray = this.f۱۱۰۸g;
        if (sparseArray != null) {
            int numActive = sparseArray.size();
            for (int i2 = 0; i2 < numActive; i2++) {
                f fragment = this.f۱۱۰۸g.valueAt(i2);
                if (fragment != null && fragment.K != null && fragment.P && record.b(fragment.A)) {
                    float f2 = fragment.R;
                    if (f2 > 0.0f) {
                        fragment.K.setAlpha(f2);
                    }
                    if (moveToState) {
                        fragment.R = 0.0f;
                    } else {
                        fragment.R = -1.0f;
                        fragment.P = false;
                    }
                }
            }
        }
    }

    private f q(f f2) {
        ViewGroup container = f2.J;
        View view = f2.K;
        if (container == null || view == null) {
            return null;
        }
        for (int i2 = this.f۱۱۰۷f.indexOf(f2) - 1; i2 >= 0; i2--) {
            f underFragment = this.f۱۱۰۷f.get(i2);
            if (underFragment.J == container && underFragment.K != null) {
                return underFragment;
            }
        }
        return null;
    }

    private static void a(ArrayList<c> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        for (int i2 = startIndex; i2 < endIndex; i2++) {
            c record = arrayList.get(i2);
            boolean moveToState = true;
            if (isRecordPop.get(i2).booleanValue()) {
                record.a(-1);
                if (i2 != endIndex - 1) {
                    moveToState = false;
                }
                record.b(moveToState);
            } else {
                record.a(1);
                record.e();
            }
        }
    }

    private void a(a.b.g.g.b<f> bVar) {
        int i2 = this.n;
        if (i2 >= 1) {
            int state = Math.min(i2, 3);
            int numAdded = this.f۱۱۰۷f.size();
            for (int i3 = 0; i3 < numAdded; i3++) {
                f fragment = this.f۱۱۰۷f.get(i3);
                if (fragment.f۱۰۷۰c < state) {
                    a(fragment, state, fragment.q(), fragment.r(), false);
                    if (fragment.K != null && !fragment.C && fragment.P) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    private void C() {
        if (this.D != null) {
            while (!this.D.isEmpty()) {
                this.D.remove(0).d();
            }
        }
    }

    private void B() {
        SparseArray<f> sparseArray = this.f۱۱۰۸g;
        int numFragments = sparseArray == null ? 0 : sparseArray.size();
        for (int i2 = 0; i2 < numFragments; i2++) {
            f fragment = this.f۱۱۰۸g.valueAt(i2);
            if (fragment != null) {
                if (fragment.g() != null) {
                    int stateAfterAnimating = fragment.z();
                    View animatingAway = fragment.g();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.a((View) null);
                    a(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.h() != null) {
                    fragment.h().end();
                }
            }
        }
    }

    private boolean b(ArrayList<c> arrayList, ArrayList<Boolean> isPop) {
        boolean didSomething = false;
        synchronized (this) {
            if (this.f۱۱۰۴c != null) {
                if (this.f۱۱۰۴c.size() != 0) {
                    int numActions = this.f۱۱۰۴c.size();
                    for (int i2 = 0; i2 < numActions; i2++) {
                        didSomething |= this.f۱۱۰۴c.get(i2).a(arrayList, isPop);
                    }
                    this.f۱۱۰۴c.clear();
                    this.o.e().removeCallbacks(this.F);
                    return didSomething;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (this.x) {
            this.x = false;
            x();
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (this.l != null) {
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                this.l.get(i2).a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(c state) {
        if (this.f۱۱۰۹h == null) {
            this.f۱۱۰۹h = new ArrayList<>();
        }
        this.f۱۱۰۹h.add(state);
    }

    /* access modifiers changed from: package-private */
    public boolean a(ArrayList<c> arrayList, ArrayList<Boolean> isRecordPop, String name, int id, int flags) {
        ArrayList<c> arrayList2 = this.f۱۱۰۹h;
        if (arrayList2 == null) {
            return false;
        }
        if (name == null && id < 0 && (flags & 1) == 0) {
            int last = arrayList2.size() - 1;
            if (last < 0) {
                return false;
            }
            arrayList.add(this.f۱۱۰۹h.remove(last));
            isRecordPop.add(true);
        } else {
            int index = -1;
            if (name != null || id >= 0) {
                index = this.f۱۱۰۹h.size() - 1;
                while (index >= 0) {
                    c bss = this.f۱۱۰۹h.get(index);
                    if ((name != null && name.equals(bss.f())) || (id >= 0 && id == bss.l)) {
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
                        c bss2 = this.f۱۱۰۹h.get(index);
                        if ((name == null || !name.equals(bss2.f())) && (id < 0 || id != bss2.l)) {
                            break;
                        }
                        index--;
                    }
                }
            }
            if (index == this.f۱۱۰۹h.size() - 1) {
                return false;
            }
            for (int i2 = this.f۱۱۰۹h.size() - 1; i2 > index; i2--) {
                arrayList.add(this.f۱۱۰۹h.remove(i2));
                isRecordPop.add(true);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public m t() {
        a(this.E);
        return this.E;
    }

    private static void a(m nonConfig) {
        if (nonConfig != null) {
            List<Fragment> fragments = nonConfig.b();
            if (fragments != null) {
                Iterator<Fragment> it = fragments.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).F = true;
                }
            }
            List<FragmentManagerNonConfig> children = nonConfig.a();
            if (children != null) {
                Iterator<FragmentManagerNonConfig> it2 = children.iterator();
                while (it2.hasNext()) {
                    a((m) it2.next());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v() {
        m child;
        ArrayList<Fragment> fragments = null;
        ArrayList<FragmentManagerNonConfig> childFragments = null;
        ArrayList<ViewModelStore> viewModelStores = null;
        if (this.f۱۱۰۸g != null) {
            for (int i2 = 0; i2 < this.f۱۱۰۸g.size(); i2++) {
                f f2 = this.f۱۱۰۸g.valueAt(i2);
                if (f2 != null) {
                    if (f2.E) {
                        if (fragments == null) {
                            fragments = new ArrayList<>();
                        }
                        fragments.add(f2);
                        f fVar = f2.j;
                        f2.k = fVar != null ? fVar.f۱۰۷۴g : -1;
                        if (G) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + f2);
                        }
                    }
                    l lVar = f2.v;
                    if (lVar != null) {
                        lVar.v();
                        child = f2.v.E;
                    } else {
                        child = f2.w;
                    }
                    if (childFragments == null && child != null) {
                        childFragments = new ArrayList<>(this.f۱۱۰۸g.size());
                        for (int j2 = 0; j2 < i2; j2++) {
                            childFragments.add(null);
                        }
                    }
                    if (childFragments != null) {
                        childFragments.add(child);
                    }
                    if (viewModelStores == null && f2.x != null) {
                        viewModelStores = new ArrayList<>(this.f۱۱۰۸g.size());
                        for (int j3 = 0; j3 < i2; j3++) {
                            viewModelStores.add(null);
                        }
                    }
                    if (viewModelStores != null) {
                        viewModelStores.add(f2.x);
                    }
                }
            }
        }
        if (fragments == null && childFragments == null && viewModelStores == null) {
            this.E = null;
        } else {
            this.E = new m(fragments, childFragments, viewModelStores);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(f f2) {
        if (f2.L != null) {
            SparseArray<Parcelable> sparseArray = this.C;
            if (sparseArray == null) {
                this.C = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            f2.L.saveHierarchyState(this.C);
            if (this.C.size() > 0) {
                f2.f۱۰۷۲e = this.C;
                this.C = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Bundle m(f f2) {
        Bundle result = null;
        if (this.B == null) {
            this.B = new Bundle();
        }
        f2.j(this.B);
        d(f2, this.B, false);
        if (!this.B.isEmpty()) {
            result = this.B;
            this.B = null;
        }
        if (f2.K != null) {
            n(f2);
        }
        if (f2.f۱۰۷۲e != null) {
            if (result == null) {
                result = new Bundle();
            }
            result.putSparseParcelableArray("android:view_state", f2.f۱۰۷۲e);
        }
        if (!f2.N) {
            if (result == null) {
                result = new Bundle();
            }
            result.putBoolean("android:user_visible_hint", f2.N);
        }
        return result;
    }

    /* access modifiers changed from: package-private */
    public Parcelable u() {
        int N;
        C();
        B();
        o();
        this.t = true;
        this.E = null;
        SparseArray<f> sparseArray = this.f۱۱۰۸g;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int N2 = this.f۱۱۰۸g.size();
        o[] active = new o[N2];
        boolean haveFragments = false;
        for (int i2 = 0; i2 < N2; i2++) {
            f f2 = this.f۱۱۰۸g.valueAt(i2);
            if (f2 != null) {
                if (f2.f۱۰۷۴g >= 0) {
                    haveFragments = true;
                    o fs = new o(f2);
                    active[i2] = fs;
                    if (f2.f۱۰۷۰c <= 0 || fs.m != null) {
                        fs.m = f2.f۱۰۷۱d;
                    } else {
                        fs.m = m(f2);
                        f fVar = f2.j;
                        if (fVar != null) {
                            if (fVar.f۱۰۷۴g >= 0) {
                                if (fs.m == null) {
                                    fs.m = new Bundle();
                                }
                                a(fs.m, "android:target_state", f2.j);
                                int i3 = f2.l;
                                if (i3 != 0) {
                                    fs.m.putInt("android:target_req_state", i3);
                                }
                            } else {
                                a(new IllegalStateException("Failure saving state: " + f2 + " has target not in fragment manager: " + f2.j));
                                throw null;
                            }
                        }
                    }
                    if (G) {
                        Log.v("FragmentManager", "Saved state of " + f2 + ": " + fs.m);
                    }
                } else {
                    a(new IllegalStateException("Failure saving state: active " + f2 + " has cleared index: " + f2.f۱۰۷۴g));
                    throw null;
                }
            }
        }
        if (!haveFragments) {
            if (G) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int[] added = null;
        d[] backStack = null;
        int N3 = this.f۱۱۰۷f.size();
        if (N3 > 0) {
            added = new int[N3];
            for (int i4 = 0; i4 < N3; i4++) {
                added[i4] = this.f۱۱۰۷f.get(i4).f۱۰۷۴g;
                if (added[i4] >= 0) {
                    if (G) {
                        Log.v("FragmentManager", "saveAllState: adding fragment #" + i4 + ": " + this.f۱۱۰۷f.get(i4));
                    }
                } else {
                    a(new IllegalStateException("Failure saving state: active " + this.f۱۱۰۷f.get(i4) + " has cleared index: " + added[i4]));
                    throw null;
                }
            }
        }
        ArrayList<c> arrayList = this.f۱۱۰۹h;
        if (arrayList != null && (N = arrayList.size()) > 0) {
            backStack = new d[N];
            for (int i5 = 0; i5 < N; i5++) {
                backStack[i5] = new d(this.f۱۱۰۹h.get(i5));
                if (G) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.f۱۱۰۹h.get(i5));
                }
            }
        }
        n fms = new n();
        fms.f۱۱۴۶c = active;
        fms.f۱۱۴۷d = added;
        fms.f۱۱۴۸e = backStack;
        f fVar2 = this.r;
        if (fVar2 != null) {
            fms.f۱۱۴۹f = fVar2.f۱۰۷۴g;
        }
        fms.f۱۱۵۰g = this.f۱۱۰۶e;
        v();
        return fms;
    }

    /* access modifiers changed from: package-private */
    public void a(Parcelable state, m nonConfig) {
        List<Fragment> nonConfigFragments;
        List<ViewModelStore> viewModelStores;
        if (state != null) {
            n fms = (n) state;
            if (fms.f۱۱۴۶c != null) {
                if (nonConfig != null) {
                    List<Fragment> nonConfigFragments2 = nonConfig.b();
                    List<ViewModelStore> childNonConfigs = nonConfig.a();
                    List<Fragment> viewModelStores2 = nonConfig.c();
                    int count = nonConfigFragments2 != null ? nonConfigFragments2.size() : 0;
                    for (int i2 = 0; i2 < count; i2++) {
                        f f2 = (f) nonConfigFragments2.get(i2);
                        if (G) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + f2);
                        }
                        int index = 0;
                        while (true) {
                            o[] oVarArr = fms.f۱۱۴۶c;
                            if (index >= oVarArr.length || oVarArr[index].f۱۱۵۲d == f2.f۱۰۷۴g) {
                                o[] oVarArr2 = fms.f۱۱۴۶c;
                            } else {
                                index++;
                            }
                        }
                        o[] oVarArr22 = fms.f۱۱۴۶c;
                        if (index != oVarArr22.length) {
                            o fs = oVarArr22[index];
                            fs.n = f2;
                            f2.f۱۰۷۲e = null;
                            f2.s = 0;
                            f2.p = false;
                            f2.m = false;
                            f2.j = null;
                            Bundle bundle = fs.m;
                            if (bundle != null) {
                                bundle.setClassLoader(this.o.c().getClassLoader());
                                f2.f۱۰۷۲e = fs.m.getSparseParcelableArray("android:view_state");
                                f2.f۱۰۷۱d = fs.m;
                            }
                        } else {
                            a(new IllegalStateException("Could not find active fragment with index " + f2.f۱۰۷۴g));
                            throw null;
                        }
                    }
                    nonConfigFragments = viewModelStores2;
                    viewModelStores = childNonConfigs;
                } else {
                    nonConfigFragments = null;
                    viewModelStores = null;
                }
                this.f۱۱۰۸g = new SparseArray<>(fms.f۱۱۴۶c.length);
                int i3 = 0;
                while (true) {
                    o[] oVarArr3 = fms.f۱۱۴۶c;
                    if (i3 >= oVarArr3.length) {
                        break;
                    }
                    o fs2 = oVarArr3[i3];
                    if (fs2 != null) {
                        m childNonConfig = null;
                        if (viewModelStores != null && i3 < viewModelStores.size()) {
                            childNonConfig = (m) viewModelStores.get(i3);
                        }
                        f f3 = fs2.a(this.o, this.p, this.q, childNonConfig, (nonConfigFragments == null || i3 >= nonConfigFragments.size()) ? null : (p) nonConfigFragments.get(i3));
                        if (G) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i3 + ": " + f3);
                        }
                        this.f۱۱۰۸g.put(f3.f۱۰۷۴g, f3);
                        fs2.n = null;
                    }
                    i3++;
                }
                if (nonConfig != null) {
                    List<Fragment> nonConfigFragments3 = nonConfig.b();
                    int count2 = nonConfigFragments3 != null ? nonConfigFragments3.size() : 0;
                    for (int i4 = 0; i4 < count2; i4++) {
                        f f4 = (f) nonConfigFragments3.get(i4);
                        int i5 = f4.k;
                        if (i5 >= 0) {
                            f4.j = this.f۱۱۰۸g.get(i5);
                            if (f4.j == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + f4 + " target no longer exists: " + f4.k);
                            }
                        }
                    }
                }
                this.f۱۱۰۷f.clear();
                if (fms.f۱۱۴۷d != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr = fms.f۱۱۴۷d;
                        if (i6 >= iArr.length) {
                            break;
                        }
                        f f5 = this.f۱۱۰۸g.get(iArr[i6]);
                        if (f5 != null) {
                            f5.m = true;
                            if (G) {
                                Log.v("FragmentManager", "restoreAllState: added #" + i6 + ": " + f5);
                            }
                            if (!this.f۱۱۰۷f.contains(f5)) {
                                synchronized (this.f۱۱۰۷f) {
                                    this.f۱۱۰۷f.add(f5);
                                }
                                i6++;
                            } else {
                                throw new IllegalStateException("Already added!");
                            }
                        } else {
                            a(new IllegalStateException("No instantiated fragment for index #" + fms.f۱۱۴۷d[i6]));
                            throw null;
                        }
                    }
                }
                d[] dVarArr = fms.f۱۱۴۸e;
                if (dVarArr != null) {
                    this.f۱۱۰۹h = new ArrayList<>(dVarArr.length);
                    int i7 = 0;
                    while (true) {
                        d[] dVarArr2 = fms.f۱۱۴۸e;
                        if (i7 >= dVarArr2.length) {
                            break;
                        }
                        c bse = dVarArr2[i7].a(this);
                        if (G) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + bse.l + "): " + bse);
                            PrintWriter pw = new PrintWriter(new a.b.g.g.e("FragmentManager"));
                            bse.a("  ", pw, false);
                            pw.close();
                        }
                        this.f۱۱۰۹h.add(bse);
                        int i8 = bse.l;
                        if (i8 >= 0) {
                            a(i8, bse);
                        }
                        i7++;
                    }
                } else {
                    this.f۱۱۰۹h = null;
                }
                int i9 = fms.f۱۱۴۹f;
                if (i9 >= 0) {
                    this.r = this.f۱۱۰۸g.get(i9);
                }
                this.f۱۱۰۶e = fms.f۱۱۵۰g;
            }
        }
    }

    private void y() {
        SparseArray<f> sparseArray = this.f۱۱۰۸g;
        if (sparseArray != null) {
            for (int i2 = sparseArray.size() - 1; i2 >= 0; i2--) {
                if (this.f۱۱۰۸g.valueAt(i2) == null) {
                    SparseArray<f> sparseArray2 = this.f۱۱۰۸g;
                    sparseArray2.delete(sparseArray2.keyAt(i2));
                }
            }
        }
    }

    public void a(j host, h container, f parent) {
        if (this.o == null) {
            this.o = host;
            this.p = container;
            this.q = parent;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public void r() {
        this.E = null;
        this.t = false;
        this.u = false;
        int addedCount = this.f۱۱۰۷f.size();
        for (int i2 = 0; i2 < addedCount; i2++) {
            f fragment = this.f۱۱۰۷f.get(i2);
            if (fragment != null) {
                fragment.J();
            }
        }
    }

    public void f() {
        this.t = false;
        this.u = false;
        d(1);
    }

    public void e() {
        this.t = false;
        this.u = false;
        d(2);
    }

    public void l() {
        this.t = false;
        this.u = false;
        d(3);
    }

    public void k() {
        this.t = false;
        this.u = false;
        d(4);
    }

    public void j() {
        d(3);
    }

    public void m() {
        this.u = true;
        d(2);
    }

    public void h() {
        d(1);
    }

    public void g() {
        this.v = true;
        o();
        d(0);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    /* JADX INFO: finally extract failed */
    private void d(int nextState) {
        try {
            this.f۱۱۰۵d = true;
            a(nextState, false);
            this.f۱۱۰۵d = false;
            o();
        } catch (Throwable th) {
            this.f۱۱۰۵d = false;
            throw th;
        }
    }

    public void a(boolean isInMultiWindowMode) {
        for (int i2 = this.f۱۱۰۷f.size() - 1; i2 >= 0; i2--) {
            f f2 = this.f۱۱۰۷f.get(i2);
            if (f2 != null) {
                f2.d(isInMultiWindowMode);
            }
        }
    }

    public void b(boolean isInPictureInPictureMode) {
        for (int i2 = this.f۱۱۰۷f.size() - 1; i2 >= 0; i2--) {
            f f2 = this.f۱۱۰۷f.get(i2);
            if (f2 != null) {
                f2.e(isInPictureInPictureMode);
            }
        }
    }

    public void a(Configuration newConfig) {
        for (int i2 = 0; i2 < this.f۱۱۰۷f.size(); i2++) {
            f f2 = this.f۱۱۰۷f.get(i2);
            if (f2 != null) {
                f2.a(newConfig);
            }
        }
    }

    public void i() {
        for (int i2 = 0; i2 < this.f۱۱۰۷f.size(); i2++) {
            f f2 = this.f۱۱۰۷f.get(i2);
            if (f2 != null) {
                f2.W();
            }
        }
    }

    public boolean a(Menu menu, MenuInflater inflater) {
        if (this.n < 1) {
            return false;
        }
        boolean show = false;
        ArrayList<Fragment> newMenus = null;
        for (int i2 = 0; i2 < this.f۱۱۰۷f.size(); i2++) {
            f f2 = this.f۱۱۰۷f.get(i2);
            if (f2 != null && f2.b(menu, inflater)) {
                show = true;
                if (newMenus == null) {
                    newMenus = new ArrayList<>();
                }
                newMenus.add(f2);
            }
        }
        if (this.i != null) {
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                f f3 = this.i.get(i3);
                if (newMenus == null || !newMenus.contains(f3)) {
                    f3.L();
                }
            }
        }
        this.i = newMenus;
        return show;
    }

    public boolean b(Menu menu) {
        if (this.n < 1) {
            return false;
        }
        boolean show = false;
        for (int i2 = 0; i2 < this.f۱۱۰۷f.size(); i2++) {
            f f2 = this.f۱۱۰۷f.get(i2);
            if (f2 != null && f2.d(menu)) {
                show = true;
            }
        }
        return show;
    }

    public boolean b(MenuItem item) {
        if (this.n < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f۱۱۰۷f.size(); i2++) {
            f f2 = this.f۱۱۰۷f.get(i2);
            if (f2 != null && f2.d(item)) {
                return true;
            }
        }
        return false;
    }

    public boolean a(MenuItem item) {
        if (this.n < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f۱۱۰۷f.size(); i2++) {
            f f2 = this.f۱۱۰۷f.get(i2);
            if (f2 != null && f2.c(item)) {
                return true;
            }
        }
        return false;
    }

    public void a(Menu menu) {
        if (this.n >= 1) {
            for (int i2 = 0; i2 < this.f۱۱۰۷f.size(); i2++) {
                f f2 = this.f۱۱۰۷f.get(i2);
                if (f2 != null) {
                    f2.c(menu);
                }
            }
        }
    }

    public void o(f f2) {
        if (f2 == null || (this.f۱۱۰۸g.get(f2.f۱۰۷۴g) == f2 && (f2.u == null || f2.p() == this))) {
            this.r = f2;
            return;
        }
        throw new IllegalArgumentException("Fragment " + f2 + " is not an active fragment of FragmentManager " + this);
    }

    public f q() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public void b(f f2, Context context, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).b(f2, context, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.b(this, f2, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(f f2, Context context, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).a(f2, context, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.a(this, f2, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(f f2, Bundle savedInstanceState, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).c(f2, savedInstanceState, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.c(this, f2, savedInstanceState);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(f f2, Bundle savedInstanceState, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).b(f2, savedInstanceState, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.b(this, f2, savedInstanceState);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(f f2, Bundle savedInstanceState, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).a(f2, savedInstanceState, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.a(this, f2, savedInstanceState);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(f f2, View v2, Bundle savedInstanceState, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).a(f2, v2, savedInstanceState, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.a(this, f2, v2, savedInstanceState);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(f f2, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).f(f2, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.e(this, f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(f f2, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).e(f2, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.d(this, f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(f f2, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).d(f2, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.c(this, f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(f f2, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).g(f2, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.f(this, f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(f f2, Bundle outState, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).d(f2, outState, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.d(this, f2, outState);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(f f2, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).h(f2, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.g(this, f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(f f2, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).b(f2, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.a(this, f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(f f2, boolean onlyRecursive) {
        f fVar = this.q;
        if (fVar != null) {
            k parentManager = fVar.p();
            if (parentManager instanceof l) {
                ((l) parentManager).c(f2, true);
            }
        }
        Iterator<j> it = this.m.iterator();
        while (it.hasNext()) {
            j holder = it.next();
            if (!onlyRecursive || holder.f۱۱۳۴b) {
                holder.f۱۱۳۳a.b(this, f2);
            }
        }
    }

    public static int e(int transit) {
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

    public static int b(int transit, boolean enter) {
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
        f fragment;
        if (!"fragment".equals(name)) {
            return null;
        }
        String fname2 = attrs.getAttributeValue(null, "class");
        TypedArray a2 = context.obtainStyledAttributes(attrs, k.f۱۱۳۵a);
        int containerId = 0;
        if (fname2 == null) {
            fname = a2.getString(0);
        } else {
            fname = fname2;
        }
        int id = a2.getResourceId(1, -1);
        String tag = a2.getString(2);
        a2.recycle();
        if (!f.a(this.o.c(), fname)) {
            return null;
        }
        if (parent != null) {
            containerId = parent.getId();
        }
        if (containerId == -1 && id == -1 && tag == null) {
            throw new IllegalArgumentException(attrs.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + fname);
        }
        f fragment2 = id != -1 ? a(id) : null;
        if (fragment2 == null && tag != null) {
            fragment2 = a(tag);
        }
        if (fragment2 == null && containerId != -1) {
            fragment2 = a(containerId);
        }
        if (G) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(id) + " fname=" + fname + " existing=" + fragment2);
        }
        if (fragment2 == null) {
            f fragment3 = this.p.a(context, fname, null);
            fragment3.o = true;
            fragment3.z = id != 0 ? id : containerId;
            fragment3.A = containerId;
            fragment3.B = tag;
            fragment3.p = true;
            fragment3.t = this;
            j jVar = this.o;
            fragment3.u = jVar;
            fragment3.a(jVar.c(), attrs, fragment3.f۱۰۷۱d);
            a(fragment3, true);
            fragment = fragment3;
        } else if (!fragment2.p) {
            fragment2.p = true;
            j jVar2 = this.o;
            fragment2.u = jVar2;
            if (!fragment2.F) {
                fragment2.a(jVar2.c(), attrs, fragment2.f۱۰۷۱d);
            }
            fragment = fragment2;
        } else {
            throw new IllegalArgumentException(attrs.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(id) + ", tag " + tag + ", or parent id 0x" + Integer.toHexString(containerId) + " with another fragment for " + fname);
        }
        if (this.n >= 1 || !fragment.o) {
            j(fragment);
        } else {
            a(fragment, 1, 0, 0, false);
        }
        View view = fragment.K;
        if (view != null) {
            if (id != 0) {
                view.setId(id);
            }
            if (fragment.K.getTag() == null) {
                fragment.K.setTag(tag);
            }
            return fragment.K;
        }
        throw new IllegalStateException("Fragment " + fname + " did not create a view.");
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 p() {
        return this;
    }

    private class m implements AbstractC۰۰۲۶l {

        /* renamed from: a  reason: collision with root package name */
        final String f۱۱۳۶a;

        /* renamed from: b  reason: collision with root package name */
        final int f۱۱۳۷b;

        /* renamed from: c  reason: collision with root package name */
        final int f۱۱۳۸c;

        m(String name, int id, int flags) {
            this.f۱۱۳۶a = name;
            this.f۱۱۳۷b = id;
            this.f۱۱۳۸c = flags;
        }

        @Override // android.support.v4.app.l.AbstractC۰۰۲۶l
        public boolean a(ArrayList<c> arrayList, ArrayList<Boolean> isRecordPop) {
            k childManager;
            f fVar = l.this.r;
            if (fVar == null || this.f۱۱۳۷b >= 0 || this.f۱۱۳۶a != null || (childManager = fVar.S()) == null || !childManager.d()) {
                return l.this.a(arrayList, isRecordPop, this.f۱۱۳۶a, this.f۱۱۳۷b, this.f۱۱۳۸c);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static class n implements f.AbstractC۰۰۲۵f {

        /* renamed from: a  reason: collision with root package name */
        final boolean f۱۱۴۰a;

        /* renamed from: b  reason: collision with root package name */
        final c f۱۱۴۱b;

        /* renamed from: c  reason: collision with root package name */
        private int f۱۱۴۲c;

        n(c record, boolean isBack) {
            this.f۱۱۴۰a = isBack;
            this.f۱۱۴۱b = record;
        }

        @Override // android.support.v4.app.f.AbstractC۰۰۲۵f
        public void a() {
            this.f۱۱۴۲c--;
            if (this.f۱۱۴۲c == 0) {
                this.f۱۱۴۱b.f۱۰۴۹a.w();
            }
        }

        @Override // android.support.v4.app.f.AbstractC۰۰۲۵f
        public void b() {
            this.f۱۱۴۲c++;
        }

        public boolean e() {
            return this.f۱۱۴۲c == 0;
        }

        public void d() {
            boolean z = false;
            boolean canceled = this.f۱۱۴۲c > 0;
            l manager = this.f۱۱۴۱b.f۱۰۴۹a;
            int numAdded = manager.f۱۱۰۷f.size();
            for (int i = 0; i < numAdded; i++) {
                f fragment = manager.f۱۱۰۷f.get(i);
                fragment.a((f.AbstractC۰۰۲۵f) null);
                if (canceled && fragment.H()) {
                    fragment.c0();
                }
            }
            c cVar = this.f۱۱۴۱b;
            l lVar = cVar.f۱۰۴۹a;
            boolean z2 = this.f۱۱۴۰a;
            if (!canceled) {
                z = true;
            }
            lVar.a(cVar, z2, z, true);
        }

        public void c() {
            c cVar = this.f۱۱۴۱b;
            cVar.f۱۰۴۹a.a(cVar, this.f۱۱۴۰a, false, false);
        }
    }

    /* access modifiers changed from: private */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f۱۱۲۵a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f۱۱۲۶b;

        g(Animation animation) {
            this.f۱۱۲۵a = animation;
            this.f۱۱۲۶b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        g(Animator animator) {
            this.f۱۱۲۵a = null;
            this.f۱۱۲۶b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    private static class f implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        private final Animation.AnimationListener f۱۱۲۴a;

        f(Animation.AnimationListener wrapped) {
            this.f۱۱۲۴a = wrapped;
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f۱۱۲۴a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f۱۱۲۴a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f۱۱۲۴a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class e extends f {

        /* renamed from: b  reason: collision with root package name */
        View f۱۱۲۲b;

        e(View v, Animation.AnimationListener listener) {
            super(listener);
            this.f۱۱۲۲b = v;
        }

        class a implements Runnable {
            a() {
            }

            public void run() {
                e.this.f۱۱۲۲b.setLayerType(0, null);
            }
        }

        @Override // android.support.v4.app.l.f
        public void onAnimationEnd(Animation animation) {
            if (u.x(this.f۱۱۲۲b) || Build.VERSION.SDK_INT >= 24) {
                this.f۱۱۲۲b.post(new a());
            } else {
                this.f۱۱۲۲b.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* access modifiers changed from: private */
    public static class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        View f۱۱۲۷a;

        h(View v) {
            this.f۱۱۲۷a = v;
        }

        public void onAnimationStart(Animator animation) {
            this.f۱۱۲۷a.setLayerType(2, null);
        }

        public void onAnimationEnd(Animator animation) {
            this.f۱۱۲۷a.setLayerType(0, null);
            animation.removeListener(this);
        }
    }

    /* access modifiers changed from: private */
    public static class i extends AnimationSet implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f۱۱۲۸c;

        /* renamed from: d  reason: collision with root package name */
        private final View f۱۱۲۹d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f۱۱۳۰e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f۱۱۳۱f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f۱۱۳۲g = true;

        i(Animation animation, ViewGroup parent, View child) {
            super(false);
            this.f۱۱۲۸c = parent;
            this.f۱۱۲۹d = child;
            addAnimation(animation);
            this.f۱۱۲۸c.post(this);
        }

        public boolean getTransformation(long currentTime, Transformation t) {
            this.f۱۱۳۲g = true;
            if (this.f۱۱۳۰e) {
                return true ^ this.f۱۱۳۱f;
            }
            if (!super.getTransformation(currentTime, t)) {
                this.f۱۱۳۰e = true;
                a0.a(this.f۱۱۲۸c, this);
            }
            return true;
        }

        public boolean getTransformation(long currentTime, Transformation outTransformation, float scale) {
            this.f۱۱۳۲g = true;
            if (this.f۱۱۳۰e) {
                return true ^ this.f۱۱۳۱f;
            }
            if (!super.getTransformation(currentTime, outTransformation, scale)) {
                this.f۱۱۳۰e = true;
                a0.a(this.f۱۱۲۸c, this);
            }
            return true;
        }

        public void run() {
            if (this.f۱۱۳۰e || !this.f۱۱۳۲g) {
                this.f۱۱۲۸c.endViewTransition(this.f۱۱۲۹d);
                this.f۱۱۳۱f = true;
                return;
            }
            this.f۱۱۳۲g = false;
            this.f۱۱۲۸c.post(this);
        }
    }
}
