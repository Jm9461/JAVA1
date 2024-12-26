package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.view.Cu;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.g0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cg0 extends AbstractCc1 {

    /* renamed from: s, reason: contains not printable characters */
    private static TimeInterpolator f۱۲۰۱۸s;

    /* renamed from: h, reason: contains not printable characters */
    private ArrayList<RecyclerView.AbstractCd0> f۱۲۰۱۹h = new ArrayList<>();

    /* renamed from: i, reason: contains not printable characters */
    private ArrayList<RecyclerView.AbstractCd0> f۱۲۰۲۰i = new ArrayList<>();

    /* renamed from: j, reason: contains not printable characters */
    private ArrayList<j> f۱۲۰۲۱j = new ArrayList<>();

    /* renamed from: k, reason: contains not printable characters */
    private ArrayList<i> f۱۲۰۲۲k = new ArrayList<>();

    /* renamed from: l, reason: contains not printable characters */
    ArrayList<ArrayList<RecyclerView.AbstractCd0>> f۱۲۰۲۳l = new ArrayList<>();

    /* renamed from: m, reason: contains not printable characters */
    ArrayList<ArrayList<j>> f۱۲۰۲۴m = new ArrayList<>();

    /* renamed from: n, reason: contains not printable characters */
    ArrayList<ArrayList<i>> f۱۲۰۲۵n = new ArrayList<>();

    /* renamed from: o, reason: contains not printable characters */
    ArrayList<RecyclerView.AbstractCd0> f۱۲۰۲۶o = new ArrayList<>();

    /* renamed from: p, reason: contains not printable characters */
    ArrayList<RecyclerView.AbstractCd0> f۱۲۰۲۷p = new ArrayList<>();

    /* renamed from: q, reason: contains not printable characters */
    ArrayList<RecyclerView.AbstractCd0> f۱۲۰۲۸q = new ArrayList<>();

    /* renamed from: r, reason: contains not printable characters */
    ArrayList<RecyclerView.AbstractCd0> f۱۲۰۲۹r = new ArrayList<>();

    /* renamed from: android.support.v7.widget.g0$j */
    private static class j {

        /* renamed from: a, reason: contains not printable characters */
        public RecyclerView.AbstractCd0 f۱۲۰۶۴a;

        /* renamed from: b, reason: contains not printable characters */
        public int f۱۲۰۶۵b;

        /* renamed from: c, reason: contains not printable characters */
        public int f۱۲۰۶۶c;

        /* renamed from: d, reason: contains not printable characters */
        public int f۱۲۰۶۷d;

        /* renamed from: e, reason: contains not printable characters */
        public int f۱۲۰۶۸e;

        j(RecyclerView.AbstractCd0 holder, int fromX, int fromY, int toX, int toY) {
            this.f۱۲۰۶۴a = holder;
            this.f۱۲۰۶۵b = fromX;
            this.f۱۲۰۶۶c = fromY;
            this.f۱۲۰۶۷d = toX;
            this.f۱۲۰۶۸e = toY;
        }
    }

    /* renamed from: android.support.v7.widget.g0$i */
    private static class i {

        /* renamed from: a, reason: contains not printable characters */
        public RecyclerView.AbstractCd0 f۱۲۰۵۸a;

        /* renamed from: b, reason: contains not printable characters */
        public RecyclerView.AbstractCd0 f۱۲۰۵۹b;

        /* renamed from: c, reason: contains not printable characters */
        public int f۱۲۰۶۰c;

        /* renamed from: d, reason: contains not printable characters */
        public int f۱۲۰۶۱d;

        /* renamed from: e, reason: contains not printable characters */
        public int f۱۲۰۶۲e;

        /* renamed from: f, reason: contains not printable characters */
        public int f۱۲۰۶۳f;

        private i(RecyclerView.AbstractCd0 oldHolder, RecyclerView.AbstractCd0 newHolder) {
            this.f۱۲۰۵۸a = oldHolder;
            this.f۱۲۰۵۹b = newHolder;
        }

        i(RecyclerView.AbstractCd0 oldHolder, RecyclerView.AbstractCd0 newHolder, int fromX, int fromY, int toX, int toY) {
            this(oldHolder, newHolder);
            this.f۱۲۰۶۰c = fromX;
            this.f۱۲۰۶۱d = fromY;
            this.f۱۲۰۶۲e = toX;
            this.f۱۲۰۶۳f = toY;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f۱۲۰۵۸a + ", newHolder=" + this.f۱۲۰۵۹b + ", fromX=" + this.f۱۲۰۶۰c + ", fromY=" + this.f۱۲۰۶۱d + ", toX=" + this.f۱۲۰۶۲e + ", toY=" + this.f۱۲۰۶۳f + '}';
        }
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCl
    /* renamed from: i, reason: contains not printable characters */
    public void mo۱۳۱۷۹i() {
        boolean removalsPending = !this.f۱۲۰۱۹h.isEmpty();
        boolean movesPending = !this.f۱۲۰۲۱j.isEmpty();
        boolean changesPending = !this.f۱۲۰۲۲k.isEmpty();
        boolean additionsPending = !this.f۱۲۰۲۰i.isEmpty();
        if (!removalsPending && !movesPending && !additionsPending && !changesPending) {
            return;
        }
        Iterator<RecyclerView.AbstractCd0> it = this.f۱۲۰۱۹h.iterator();
        while (it.hasNext()) {
            RecyclerView.AbstractCd0 holder = it.next();
            m۱۳۱۶۶u(holder);
        }
        this.f۱۲۰۱۹h.clear();
        if (movesPending) {
            ArrayList<j> arrayList = new ArrayList<>();
            arrayList.addAll(this.f۱۲۰۲۱j);
            this.f۱۲۰۲۴m.add(arrayList);
            this.f۱۲۰۲۱j.clear();
            Runnable mover = new a(arrayList);
            if (removalsPending) {
                View view = arrayList.get(0).f۱۲۰۶۴a.f۱۱۶۳۷c;
                Cu.m۱۰۹۲۰a(view, mover, m۱۲۴۰۹f());
            } else {
                mover.run();
            }
        }
        if (changesPending) {
            ArrayList<i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f۱۲۰۲۲k);
            this.f۱۲۰۲۵n.add(arrayList2);
            this.f۱۲۰۲۲k.clear();
            Runnable changer = new b(arrayList2);
            if (removalsPending) {
                RecyclerView.AbstractCd0 holder2 = arrayList2.get(0).f۱۲۰۵۸a;
                Cu.m۱۰۹۲۰a(holder2.f۱۱۶۳۷c, changer, m۱۲۴۰۹f());
            } else {
                changer.run();
            }
        }
        if (additionsPending) {
            ArrayList<RecyclerView.AbstractCd0> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.f۱۲۰۲۰i);
            this.f۱۲۰۲۳l.add(arrayList3);
            this.f۱۲۰۲۰i.clear();
            Runnable adder = new c(arrayList3);
            if (removalsPending || movesPending || changesPending) {
                long removeDuration = removalsPending ? m۱۲۴۰۹f() : 0L;
                long moveDuration = movesPending ? m۱۲۴۰۸e() : 0L;
                long changeDuration = changesPending ? m۱۲۴۰۶d() : 0L;
                long totalDelay = Math.max(moveDuration, changeDuration) + removeDuration;
                View view2 = arrayList3.get(0).f۱۱۶۳۷c;
                Cu.m۱۰۹۲۰a(view2, adder, totalDelay);
                return;
            }
            adder.run();
        }
    }

    /* renamed from: android.support.v7.widget.g0$a */
    class a implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۲۰۳۰c;

        a(ArrayList arrayList) {
            this.f۱۲۰۳۰c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f۱۲۰۳۰c.iterator();
            while (it.hasNext()) {
                j moveInfo = (j) it.next();
                Cg0.this.m۱۳۱۷۴b(moveInfo.f۱۲۰۶۴a, moveInfo.f۱۲۰۶۵b, moveInfo.f۱۲۰۶۶c, moveInfo.f۱۲۰۶۷d, moveInfo.f۱۲۰۶۸e);
            }
            this.f۱۲۰۳۰c.clear();
            Cg0.this.f۱۲۰۲۴m.remove(this.f۱۲۰۳۰c);
        }
    }

    /* renamed from: android.support.v7.widget.g0$b */
    class b implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۲۰۳۲c;

        b(ArrayList arrayList) {
            this.f۱۲۰۳۲c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f۱۲۰۳۲c.iterator();
            while (it.hasNext()) {
                i change = (i) it.next();
                Cg0.this.m۱۳۱۶۸a(change);
            }
            this.f۱۲۰۳۲c.clear();
            Cg0.this.f۱۲۰۲۵n.remove(this.f۱۲۰۳۲c);
        }
    }

    /* renamed from: android.support.v7.widget.g0$c */
    class c implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۲۰۳۴c;

        c(ArrayList arrayList) {
            this.f۱۲۰۳۴c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f۱۲۰۳۴c.iterator();
            while (it.hasNext()) {
                RecyclerView.AbstractCd0 holder = (RecyclerView.AbstractCd0) it.next();
                Cg0.this.m۱۳۱۸۱t(holder);
            }
            this.f۱۲۰۳۴c.clear();
            Cg0.this.f۱۲۰۲۳l.remove(this.f۱۲۰۳۴c);
        }
    }

    @Override // android.support.v7.widget.AbstractCc1
    /* renamed from: g, reason: contains not printable characters */
    public boolean mo۱۳۱۷۸g(RecyclerView.AbstractCd0 holder) {
        m۱۳۱۶۷v(holder);
        this.f۱۲۰۱۹h.add(holder);
        return true;
    }

    /* renamed from: u, reason: contains not printable characters */
    private void m۱۳۱۶۶u(RecyclerView.AbstractCd0 holder) {
        View view = holder.f۱۱۶۳۷c;
        ViewPropertyAnimator animation = view.animate();
        this.f۱۲۰۲۸q.add(holder);
        animation.setDuration(m۱۲۴۰۹f()).alpha(0.0f).setListener(new d(holder, animation, view)).start();
    }

    /* renamed from: android.support.v7.widget.g0$d */
    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ RecyclerView.AbstractCd0 f۱۲۰۳۶a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f۱۲۰۳۷b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ View f۱۲۰۳۸c;

        d(RecyclerView.AbstractCd0 abstractCd0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f۱۲۰۳۶a = abstractCd0;
            this.f۱۲۰۳۷b = viewPropertyAnimator;
            this.f۱۲۰۳۸c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Cg0.this.m۱۳۰۱۰m(this.f۱۲۰۳۶a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f۱۲۰۳۷b.setListener(null);
            this.f۱۲۰۳۸c.setAlpha(1.0f);
            Cg0.this.m۱۳۰۰۹l(this.f۱۲۰۳۶a);
            Cg0.this.f۱۲۰۲۸q.remove(this.f۱۲۰۳۶a);
            Cg0.this.m۱۳۱۸۰j();
        }
    }

    @Override // android.support.v7.widget.AbstractCc1
    /* renamed from: f, reason: contains not printable characters */
    public boolean mo۱۳۱۷۶f(RecyclerView.AbstractCd0 holder) {
        m۱۳۱۶۷v(holder);
        holder.f۱۱۶۳۷c.setAlpha(0.0f);
        this.f۱۲۰۲۰i.add(holder);
        return true;
    }

    /* renamed from: t, reason: contains not printable characters */
    void m۱۳۱۸۱t(RecyclerView.AbstractCd0 holder) {
        View view = holder.f۱۱۶۳۷c;
        ViewPropertyAnimator animation = view.animate();
        this.f۱۲۰۲۶o.add(holder);
        animation.alpha(1.0f).setDuration(m۱۲۴۰۳c()).setListener(new e(holder, view, animation)).start();
    }

    /* renamed from: android.support.v7.widget.g0$e */
    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ RecyclerView.AbstractCd0 f۱۲۰۴۰a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ View f۱۲۰۴۱b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f۱۲۰۴۲c;

        e(RecyclerView.AbstractCd0 abstractCd0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f۱۲۰۴۰a = abstractCd0;
            this.f۱۲۰۴۱b = view;
            this.f۱۲۰۴۲c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Cg0.this.m۱۳۰۰۶i(this.f۱۲۰۴۰a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f۱۲۰۴۱b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f۱۲۰۴۲c.setListener(null);
            Cg0.this.m۱۳۰۰۵h(this.f۱۲۰۴۰a);
            Cg0.this.f۱۲۰۲۶o.remove(this.f۱۲۰۴۰a);
            Cg0.this.m۱۳۱۸۰j();
        }
    }

    @Override // android.support.v7.widget.AbstractCc1
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۳۱۷۰a(RecyclerView.AbstractCd0 holder, int fromX, int fromY, int toX, int toY) {
        View view = holder.f۱۱۶۳۷c;
        int fromX2 = fromX + ((int) holder.f۱۱۶۳۷c.getTranslationX());
        int fromY2 = fromY + ((int) holder.f۱۱۶۳۷c.getTranslationY());
        m۱۳۱۶۷v(holder);
        int deltaX = toX - fromX2;
        int deltaY = toY - fromY2;
        if (deltaX == 0 && deltaY == 0) {
            m۱۳۰۰۷j(holder);
            return false;
        }
        if (deltaX != 0) {
            view.setTranslationX(-deltaX);
        }
        if (deltaY != 0) {
            view.setTranslationY(-deltaY);
        }
        this.f۱۲۰۲۱j.add(new j(holder, fromX2, fromY2, toX, toY));
        return true;
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۳۱۷۴b(RecyclerView.AbstractCd0 holder, int fromX, int fromY, int toX, int toY) {
        View view = holder.f۱۱۶۳۷c;
        int deltaX = toX - fromX;
        int deltaY = toY - fromY;
        if (deltaX != 0) {
            view.animate().translationX(0.0f);
        }
        if (deltaY != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animation = view.animate();
        this.f۱۲۰۲۷p.add(holder);
        animation.setDuration(m۱۲۴۰۸e()).setListener(new f(holder, deltaX, view, deltaY, animation)).start();
    }

    /* renamed from: android.support.v7.widget.g0$f */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ RecyclerView.AbstractCd0 f۱۲۰۴۴a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ int f۱۲۰۴۵b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ View f۱۲۰۴۶c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ int f۱۲۰۴۷d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f۱۲۰۴۸e;

        f(RecyclerView.AbstractCd0 abstractCd0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f۱۲۰۴۴a = abstractCd0;
            this.f۱۲۰۴۵b = i;
            this.f۱۲۰۴۶c = view;
            this.f۱۲۰۴۷d = i2;
            this.f۱۲۰۴۸e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Cg0.this.m۱۳۰۰۸k(this.f۱۲۰۴۴a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f۱۲۰۴۵b != 0) {
                this.f۱۲۰۴۶c.setTranslationX(0.0f);
            }
            if (this.f۱۲۰۴۷d != 0) {
                this.f۱۲۰۴۶c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f۱۲۰۴۸e.setListener(null);
            Cg0.this.m۱۳۰۰۷j(this.f۱۲۰۴۴a);
            Cg0.this.f۱۲۰۲۷p.remove(this.f۱۲۰۴۴a);
            Cg0.this.m۱۳۱۸۰j();
        }
    }

    @Override // android.support.v7.widget.AbstractCc1
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۳۱۷۱a(RecyclerView.AbstractCd0 oldHolder, RecyclerView.AbstractCd0 newHolder, int fromX, int fromY, int toX, int toY) {
        if (oldHolder == newHolder) {
            return mo۱۳۱۷۰a(oldHolder, fromX, fromY, toX, toY);
        }
        float prevTranslationX = oldHolder.f۱۱۶۳۷c.getTranslationX();
        float prevTranslationY = oldHolder.f۱۱۶۳۷c.getTranslationY();
        float prevAlpha = oldHolder.f۱۱۶۳۷c.getAlpha();
        m۱۳۱۶۷v(oldHolder);
        int deltaX = (int) ((toX - fromX) - prevTranslationX);
        int deltaY = (int) ((toY - fromY) - prevTranslationY);
        oldHolder.f۱۱۶۳۷c.setTranslationX(prevTranslationX);
        oldHolder.f۱۱۶۳۷c.setTranslationY(prevTranslationY);
        oldHolder.f۱۱۶۳۷c.setAlpha(prevAlpha);
        if (newHolder != null) {
            m۱۳۱۶۷v(newHolder);
            newHolder.f۱۱۶۳۷c.setTranslationX(-deltaX);
            newHolder.f۱۱۶۳۷c.setTranslationY(-deltaY);
            newHolder.f۱۱۶۳۷c.setAlpha(0.0f);
        }
        this.f۱۲۰۲۲k.add(new i(oldHolder, newHolder, fromX, fromY, toX, toY));
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۱۶۸a(i changeInfo) {
        RecyclerView.AbstractCd0 holder = changeInfo.f۱۲۰۵۸a;
        View view = holder == null ? null : holder.f۱۱۶۳۷c;
        RecyclerView.AbstractCd0 newHolder = changeInfo.f۱۲۰۵۹b;
        View newView = newHolder != null ? newHolder.f۱۱۶۳۷c : null;
        if (view != null) {
            ViewPropertyAnimator oldViewAnim = view.animate().setDuration(m۱۲۴۰۶d());
            this.f۱۲۰۲۹r.add(changeInfo.f۱۲۰۵۸a);
            oldViewAnim.translationX(changeInfo.f۱۲۰۶۲e - changeInfo.f۱۲۰۶۰c);
            oldViewAnim.translationY(changeInfo.f۱۲۰۶۳f - changeInfo.f۱۲۰۶۱d);
            oldViewAnim.alpha(0.0f).setListener(new g(changeInfo, oldViewAnim, view)).start();
        }
        if (newView != null) {
            ViewPropertyAnimator newViewAnimation = newView.animate();
            this.f۱۲۰۲۹r.add(changeInfo.f۱۲۰۵۹b);
            newViewAnimation.translationX(0.0f).translationY(0.0f).setDuration(m۱۲۴۰۶d()).alpha(1.0f).setListener(new h(changeInfo, newViewAnimation, newView)).start();
        }
    }

    /* renamed from: android.support.v7.widget.g0$g */
    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ i f۱۲۰۵۰a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f۱۲۰۵۱b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ View f۱۲۰۵۲c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f۱۲۰۵۰a = iVar;
            this.f۱۲۰۵۱b = viewPropertyAnimator;
            this.f۱۲۰۵۲c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Cg0.this.m۱۲۹۹۸b(this.f۱۲۰۵۰a.f۱۲۰۵۸a, true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f۱۲۰۵۱b.setListener(null);
            this.f۱۲۰۵۲c.setAlpha(1.0f);
            this.f۱۲۰۵۲c.setTranslationX(0.0f);
            this.f۱۲۰۵۲c.setTranslationY(0.0f);
            Cg0.this.m۱۲۹۹۲a(this.f۱۲۰۵۰a.f۱۲۰۵۸a, true);
            Cg0.this.f۱۲۰۲۹r.remove(this.f۱۲۰۵۰a.f۱۲۰۵۸a);
            Cg0.this.m۱۳۱۸۰j();
        }
    }

    /* renamed from: android.support.v7.widget.g0$h */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ i f۱۲۰۵۴a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f۱۲۰۵۵b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ View f۱۲۰۵۶c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f۱۲۰۵۴a = iVar;
            this.f۱۲۰۵۵b = viewPropertyAnimator;
            this.f۱۲۰۵۶c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Cg0.this.m۱۲۹۹۸b(this.f۱۲۰۵۴a.f۱۲۰۵۹b, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f۱۲۰۵۵b.setListener(null);
            this.f۱۲۰۵۶c.setAlpha(1.0f);
            this.f۱۲۰۵۶c.setTranslationX(0.0f);
            this.f۱۲۰۵۶c.setTranslationY(0.0f);
            Cg0.this.m۱۲۹۹۲a(this.f۱۲۰۵۴a.f۱۲۰۵۹b, false);
            Cg0.this.f۱۲۰۲۹r.remove(this.f۱۲۰۵۴a.f۱۲۰۵۹b);
            Cg0.this.m۱۳۱۸۰j();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۱۶۳a(List<i> list, RecyclerView.AbstractCd0 item) {
        for (int i2 = list.size() - 1; i2 >= 0; i2--) {
            i changeInfo = list.get(i2);
            if (m۱۳۱۶۴a(changeInfo, item) && changeInfo.f۱۲۰۵۸a == null && changeInfo.f۱۲۰۵۹b == null) {
                list.remove(changeInfo);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۳۱۶۵b(i changeInfo) {
        RecyclerView.AbstractCd0 abstractCd0 = changeInfo.f۱۲۰۵۸a;
        if (abstractCd0 != null) {
            m۱۳۱۶۴a(changeInfo, abstractCd0);
        }
        RecyclerView.AbstractCd0 abstractCd02 = changeInfo.f۱۲۰۵۹b;
        if (abstractCd02 != null) {
            m۱۳۱۶۴a(changeInfo, abstractCd02);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۳۱۶۴a(i changeInfo, RecyclerView.AbstractCd0 item) {
        boolean oldItem = false;
        if (changeInfo.f۱۲۰۵۹b == item) {
            changeInfo.f۱۲۰۵۹b = null;
        } else if (changeInfo.f۱۲۰۵۸a == item) {
            changeInfo.f۱۲۰۵۸a = null;
            oldItem = true;
        } else {
            return false;
        }
        item.f۱۱۶۳۷c.setAlpha(1.0f);
        item.f۱۱۶۳۷c.setTranslationX(0.0f);
        item.f۱۱۶۳۷c.setTranslationY(0.0f);
        m۱۲۹۹۲a(item, oldItem);
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCl
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۳۱۷۵c(RecyclerView.AbstractCd0 item) {
        View view = item.f۱۱۶۳۷c;
        view.animate().cancel();
        int i2 = this.f۱۲۰۲۱j.size();
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            j moveInfo = this.f۱۲۰۲۱j.get(i2);
            if (moveInfo.f۱۲۰۶۴a == item) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m۱۳۰۰۷j(item);
                this.f۱۲۰۲۱j.remove(i2);
            }
        }
        m۱۳۱۶۳a(this.f۱۲۰۲۲k, item);
        if (this.f۱۲۰۱۹h.remove(item)) {
            view.setAlpha(1.0f);
            m۱۳۰۰۹l(item);
        }
        if (this.f۱۲۰۲۰i.remove(item)) {
            view.setAlpha(1.0f);
            m۱۳۰۰۵h(item);
        }
        for (int i3 = this.f۱۲۰۲۵n.size() - 1; i3 >= 0; i3--) {
            ArrayList<i> arrayList = this.f۱۲۰۲۵n.get(i3);
            m۱۳۱۶۳a(arrayList, item);
            if (arrayList.isEmpty()) {
                this.f۱۲۰۲۵n.remove(i3);
            }
        }
        for (int i4 = this.f۱۲۰۲۴m.size() - 1; i4 >= 0; i4--) {
            ArrayList<j> arrayList2 = this.f۱۲۰۲۴m.get(i4);
            int j2 = arrayList2.size() - 1;
            while (true) {
                if (j2 >= 0) {
                    j moveInfo2 = arrayList2.get(j2);
                    if (moveInfo2.f۱۲۰۶۴a != item) {
                        j2--;
                    } else {
                        view.setTranslationY(0.0f);
                        view.setTranslationX(0.0f);
                        m۱۳۰۰۷j(item);
                        arrayList2.remove(j2);
                        if (arrayList2.isEmpty()) {
                            this.f۱۲۰۲۴m.remove(i4);
                        }
                    }
                }
            }
        }
        for (int i5 = this.f۱۲۰۲۳l.size() - 1; i5 >= 0; i5--) {
            ArrayList<RecyclerView.AbstractCd0> arrayList3 = this.f۱۲۰۲۳l.get(i5);
            if (arrayList3.remove(item)) {
                view.setAlpha(1.0f);
                m۱۳۰۰۵h(item);
                if (arrayList3.isEmpty()) {
                    this.f۱۲۰۲۳l.remove(i5);
                }
            }
        }
        this.f۱۲۰۲۸q.remove(item);
        this.f۱۲۰۲۶o.remove(item);
        this.f۱۲۰۲۹r.remove(item);
        this.f۱۲۰۲۷p.remove(item);
        m۱۳۱۸۰j();
    }

    /* renamed from: v, reason: contains not printable characters */
    private void m۱۳۱۶۷v(RecyclerView.AbstractCd0 holder) {
        if (f۱۲۰۱۸s == null) {
            f۱۲۰۱۸s = new ValueAnimator().getInterpolator();
        }
        holder.f۱۱۶۳۷c.animate().setInterpolator(f۱۲۰۱۸s);
        mo۱۳۱۷۵c(holder);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCl
    /* renamed from: g, reason: contains not printable characters */
    public boolean mo۱۳۱۷۷g() {
        return (this.f۱۲۰۲۰i.isEmpty() && this.f۱۲۰۲۲k.isEmpty() && this.f۱۲۰۲۱j.isEmpty() && this.f۱۲۰۱۹h.isEmpty() && this.f۱۲۰۲۷p.isEmpty() && this.f۱۲۰۲۸q.isEmpty() && this.f۱۲۰۲۶o.isEmpty() && this.f۱۲۰۲۹r.isEmpty() && this.f۱۲۰۲۴m.isEmpty() && this.f۱۲۰۲۳l.isEmpty() && this.f۱۲۰۲۵n.isEmpty()) ? false : true;
    }

    /* renamed from: j, reason: contains not printable characters */
    void m۱۳۱۸۰j() {
        if (!mo۱۳۱۷۷g()) {
            m۱۲۳۹۴a();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCl
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۱۷۳b() {
        int count = this.f۱۲۰۲۱j.size();
        for (int i2 = count - 1; i2 >= 0; i2--) {
            j item = this.f۱۲۰۲۱j.get(i2);
            View view = item.f۱۲۰۶۴a.f۱۱۶۳۷c;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m۱۳۰۰۷j(item.f۱۲۰۶۴a);
            this.f۱۲۰۲۱j.remove(i2);
        }
        int count2 = this.f۱۲۰۱۹h.size();
        for (int i3 = count2 - 1; i3 >= 0; i3--) {
            m۱۳۰۰۹l(this.f۱۲۰۱۹h.get(i3));
            this.f۱۲۰۱۹h.remove(i3);
        }
        int count3 = this.f۱۲۰۲۰i.size();
        for (int i4 = count3 - 1; i4 >= 0; i4--) {
            RecyclerView.AbstractCd0 item2 = this.f۱۲۰۲۰i.get(i4);
            item2.f۱۱۶۳۷c.setAlpha(1.0f);
            m۱۳۰۰۵h(item2);
            this.f۱۲۰۲۰i.remove(i4);
        }
        int count4 = this.f۱۲۰۲۲k.size();
        for (int i5 = count4 - 1; i5 >= 0; i5--) {
            m۱۳۱۶۵b(this.f۱۲۰۲۲k.get(i5));
        }
        this.f۱۲۰۲۲k.clear();
        if (!mo۱۳۱۷۷g()) {
            return;
        }
        int listCount = this.f۱۲۰۲۴m.size();
        for (int i6 = listCount - 1; i6 >= 0; i6--) {
            ArrayList<j> arrayList = this.f۱۲۰۲۴m.get(i6);
            int count5 = arrayList.size();
            for (int j2 = count5 - 1; j2 >= 0; j2--) {
                j moveInfo = arrayList.get(j2);
                View view2 = moveInfo.f۱۲۰۶۴a.f۱۱۶۳۷c;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                m۱۳۰۰۷j(moveInfo.f۱۲۰۶۴a);
                arrayList.remove(j2);
                if (arrayList.isEmpty()) {
                    this.f۱۲۰۲۴m.remove(arrayList);
                }
            }
        }
        int listCount2 = this.f۱۲۰۲۳l.size();
        for (int i7 = listCount2 - 1; i7 >= 0; i7--) {
            ArrayList<RecyclerView.AbstractCd0> arrayList2 = this.f۱۲۰۲۳l.get(i7);
            int count6 = arrayList2.size();
            for (int j3 = count6 - 1; j3 >= 0; j3--) {
                RecyclerView.AbstractCd0 item3 = arrayList2.get(j3);
                item3.f۱۱۶۳۷c.setAlpha(1.0f);
                m۱۳۰۰۵h(item3);
                arrayList2.remove(j3);
                if (arrayList2.isEmpty()) {
                    this.f۱۲۰۲۳l.remove(arrayList2);
                }
            }
        }
        int listCount3 = this.f۱۲۰۲۵n.size();
        for (int i8 = listCount3 - 1; i8 >= 0; i8--) {
            ArrayList<i> arrayList3 = this.f۱۲۰۲۵n.get(i8);
            int count7 = arrayList3.size();
            for (int j4 = count7 - 1; j4 >= 0; j4--) {
                m۱۳۱۶۵b(arrayList3.get(j4));
                if (arrayList3.isEmpty()) {
                    this.f۱۲۰۲۵n.remove(arrayList3);
                }
            }
        }
        m۱۳۱۶۹a(this.f۱۲۰۲۸q);
        m۱۳۱۶۹a(this.f۱۲۰۲۷p);
        m۱۳۱۶۹a(this.f۱۲۰۲۶o);
        m۱۳۱۶۹a(this.f۱۲۰۲۹r);
        m۱۲۳۹۴a();
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۱۶۹a(List<RecyclerView.AbstractCd0> list) {
        for (int i2 = list.size() - 1; i2 >= 0; i2--) {
            list.get(i2).f۱۱۶۳۷c.animate().cancel();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCl
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۳۱۷۲a(RecyclerView.AbstractCd0 viewHolder, List<Object> payloads) {
        return !payloads.isEmpty() || super.mo۱۳۱۷۲a(viewHolder, payloads);
    }
}
