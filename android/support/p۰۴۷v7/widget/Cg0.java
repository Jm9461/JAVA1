package android.support.p۰۴۷v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.support.v7.widget.DefaultItemAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.g0  reason: invalid class name */
public class Cg0 extends AbstractCc1 {

    /* renamed from: s  reason: contains not printable characters */
    private static TimeInterpolator f۱۲۰۱۸s;

    /* renamed from: h  reason: contains not printable characters */
    private ArrayList<RecyclerView.AbstractCd0> f۱۲۰۱۹h = new ArrayList<>();

    /* renamed from: i  reason: contains not printable characters */
    private ArrayList<RecyclerView.AbstractCd0> f۱۲۰۲۰i = new ArrayList<>();

    /* renamed from: j  reason: contains not printable characters */
    private ArrayList<Cj> f۱۲۰۲۱j = new ArrayList<>();

    /* renamed from: k  reason: contains not printable characters */
    private ArrayList<Ci> f۱۲۰۲۲k = new ArrayList<>();

    /* renamed from: l  reason: contains not printable characters */
    ArrayList<ArrayList<RecyclerView.AbstractCd0>> f۱۲۰۲۳l = new ArrayList<>();

    /* renamed from: m  reason: contains not printable characters */
    ArrayList<ArrayList<Cj>> f۱۲۰۲۴m = new ArrayList<>();

    /* renamed from: n  reason: contains not printable characters */
    ArrayList<ArrayList<Ci>> f۱۲۰۲۵n = new ArrayList<>();

    /* renamed from: o  reason: contains not printable characters */
    ArrayList<RecyclerView.AbstractCd0> f۱۲۰۲۶o = new ArrayList<>();

    /* renamed from: p  reason: contains not printable characters */
    ArrayList<RecyclerView.AbstractCd0> f۱۲۰۲۷p = new ArrayList<>();

    /* renamed from: q  reason: contains not printable characters */
    ArrayList<RecyclerView.AbstractCd0> f۱۲۰۲۸q = new ArrayList<>();

    /* renamed from: r  reason: contains not printable characters */
    ArrayList<RecyclerView.AbstractCd0> f۱۲۰۲۹r = new ArrayList<>();

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.g0$j  reason: invalid class name */
    public static class Cj {

        /* renamed from: a  reason: contains not printable characters */
        public RecyclerView.AbstractCd0 f۱۲۰۶۴a;

        /* renamed from: b  reason: contains not printable characters */
        public int f۱۲۰۶۵b;

        /* renamed from: c  reason: contains not printable characters */
        public int f۱۲۰۶۶c;

        /* renamed from: d  reason: contains not printable characters */
        public int f۱۲۰۶۷d;

        /* renamed from: e  reason: contains not printable characters */
        public int f۱۲۰۶۸e;

        Cj(RecyclerView.AbstractCd0 holder, int fromX, int fromY, int toX, int toY) {
            this.f۱۲۰۶۴a = holder;
            this.f۱۲۰۶۵b = fromX;
            this.f۱۲۰۶۶c = fromY;
            this.f۱۲۰۶۷d = toX;
            this.f۱۲۰۶۸e = toY;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.g0$i  reason: invalid class name */
    public static class Ci {

        /* renamed from: a  reason: contains not printable characters */
        public RecyclerView.AbstractCd0 f۱۲۰۵۸a;

        /* renamed from: b  reason: contains not printable characters */
        public RecyclerView.AbstractCd0 f۱۲۰۵۹b;

        /* renamed from: c  reason: contains not printable characters */
        public int f۱۲۰۶۰c;

        /* renamed from: d  reason: contains not printable characters */
        public int f۱۲۰۶۱d;

        /* renamed from: e  reason: contains not printable characters */
        public int f۱۲۰۶۲e;

        /* renamed from: f  reason: contains not printable characters */
        public int f۱۲۰۶۳f;

        private Ci(RecyclerView.AbstractCd0 oldHolder, RecyclerView.AbstractCd0 newHolder) {
            this.f۱۲۰۵۸a = oldHolder;
            this.f۱۲۰۵۹b = newHolder;
        }

        Ci(RecyclerView.AbstractCd0 oldHolder, RecyclerView.AbstractCd0 newHolder, int fromX, int fromY, int toX, int toY) {
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

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCl
    /* renamed from: i  reason: contains not printable characters */
    public void m۱۵۲۴۹i() {
        boolean removalsPending = !this.f۱۲۰۱۹h.isEmpty();
        boolean movesPending = !this.f۱۲۰۲۱j.isEmpty();
        boolean changesPending = !this.f۱۲۰۲۲k.isEmpty();
        boolean additionsPending = !this.f۱۲۰۲۰i.isEmpty();
        if (removalsPending || movesPending || additionsPending || changesPending) {
            Iterator<RecyclerView.AbstractCd0> it = this.f۱۲۰۱۹h.iterator();
            while (it.hasNext()) {
                m۱۵۲۳۶u(it.next());
            }
            this.f۱۲۰۱۹h.clear();
            if (movesPending) {
                ArrayList<DefaultItemAnimator.MoveInfo> moves = new ArrayList<>();
                moves.addAll(this.f۱۲۰۲۱j);
                this.f۱۲۰۲۴m.add(moves);
                this.f۱۲۰۲۱j.clear();
                Runnable mover = new RunnableCa(moves);
                if (removalsPending) {
                    Cu.m۱۲۹۹۰a(((Cj) moves.get(0)).f۱۲۰۶۴a.f۱۱۶۳۷c, mover, m۱۴۴۷۹f());
                } else {
                    mover.run();
                }
            }
            if (changesPending) {
                ArrayList<DefaultItemAnimator.ChangeInfo> changes = new ArrayList<>();
                changes.addAll(this.f۱۲۰۲۲k);
                this.f۱۲۰۲۵n.add(changes);
                this.f۱۲۰۲۲k.clear();
                Runnable changer = new RunnableCb(changes);
                if (removalsPending) {
                    Cu.m۱۲۹۹۰a(((Ci) changes.get(0)).f۱۲۰۵۸a.f۱۱۶۳۷c, changer, m۱۴۴۷۹f());
                } else {
                    changer.run();
                }
            }
            if (additionsPending) {
                ArrayList<RecyclerView.ViewHolder> additions = new ArrayList<>();
                additions.addAll(this.f۱۲۰۲۰i);
                this.f۱۲۰۲۳l.add(additions);
                this.f۱۲۰۲۰i.clear();
                Runnable adder = new RunnableCc(additions);
                if (removalsPending || movesPending || changesPending) {
                    long changeDuration = 0;
                    long removeDuration = removalsPending ? m۱۴۴۷۹f() : 0;
                    long moveDuration = movesPending ? m۱۴۴۷۸e() : 0;
                    if (changesPending) {
                        changeDuration = m۱۴۴۷۶d();
                    }
                    Cu.m۱۲۹۹۰a(((RecyclerView.AbstractCd0) additions.get(0)).f۱۱۶۳۷c, adder, Math.max(moveDuration, changeDuration) + removeDuration);
                    return;
                }
                adder.run();
            }
        }
    }

    /* renamed from: android.support.v7.widget.g0$a  reason: invalid class name */
    class RunnableCa implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۲۰۳۰c;

        RunnableCa(ArrayList arrayList) {
            this.f۱۲۰۳۰c = arrayList;
        }

        public void run() {
            Iterator it = this.f۱۲۰۳۰c.iterator();
            while (it.hasNext()) {
                Cj moveInfo = (Cj) it.next();
                Cg0.this.m۱۵۲۴۴b(moveInfo.f۱۲۰۶۴a, moveInfo.f۱۲۰۶۵b, moveInfo.f۱۲۰۶۶c, moveInfo.f۱۲۰۶۷d, moveInfo.f۱۲۰۶۸e);
            }
            this.f۱۲۰۳۰c.clear();
            Cg0.this.f۱۲۰۲۴m.remove(this.f۱۲۰۳۰c);
        }
    }

    /* renamed from: android.support.v7.widget.g0$b  reason: invalid class name */
    class RunnableCb implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۲۰۳۲c;

        RunnableCb(ArrayList arrayList) {
            this.f۱۲۰۳۲c = arrayList;
        }

        public void run() {
            Iterator it = this.f۱۲۰۳۲c.iterator();
            while (it.hasNext()) {
                Cg0.this.m۱۵۲۳۸a((Ci) it.next());
            }
            this.f۱۲۰۳۲c.clear();
            Cg0.this.f۱۲۰۲۵n.remove(this.f۱۲۰۳۲c);
        }
    }

    /* renamed from: android.support.v7.widget.g0$c  reason: invalid class name */
    class RunnableCc implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۲۰۳۴c;

        RunnableCc(ArrayList arrayList) {
            this.f۱۲۰۳۴c = arrayList;
        }

        public void run() {
            Iterator it = this.f۱۲۰۳۴c.iterator();
            while (it.hasNext()) {
                Cg0.this.m۱۵۲۵۱t((RecyclerView.AbstractCd0) it.next());
            }
            this.f۱۲۰۳۴c.clear();
            Cg0.this.f۱۲۰۲۳l.remove(this.f۱۲۰۳۴c);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc1
    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۵۲۴۸g(RecyclerView.AbstractCd0 holder) {
        m۱۵۲۳۷v(holder);
        this.f۱۲۰۱۹h.add(holder);
        return true;
    }

    /* renamed from: u  reason: contains not printable characters */
    private void m۱۵۲۳۶u(RecyclerView.AbstractCd0 holder) {
        View view = holder.f۱۱۶۳۷c;
        ViewPropertyAnimator animation = view.animate();
        this.f۱۲۰۲۸q.add(holder);
        animation.setDuration(m۱۴۴۷۹f()).alpha(0.0f).setListener(new Cd(holder, animation, view)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.g0$d  reason: invalid class name */
    public class Cd extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ RecyclerView.AbstractCd0 f۱۲۰۳۶a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f۱۲۰۳۷b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View f۱۲۰۳۸c;

        Cd(RecyclerView.AbstractCd0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f۱۲۰۳۶a = d0Var;
            this.f۱۲۰۳۷b = viewPropertyAnimator;
            this.f۱۲۰۳۸c = view;
        }

        public void onAnimationStart(Animator animator) {
            Cg0.this.m۱۵۰۸۰m(this.f۱۲۰۳۶a);
        }

        public void onAnimationEnd(Animator animator) {
            this.f۱۲۰۳۷b.setListener(null);
            this.f۱۲۰۳۸c.setAlpha(1.0f);
            Cg0.this.m۱۵۰۷۹l(this.f۱۲۰۳۶a);
            Cg0.this.f۱۲۰۲۸q.remove(this.f۱۲۰۳۶a);
            Cg0.this.m۱۵۲۵۰j();
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc1
    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۵۲۴۶f(RecyclerView.AbstractCd0 holder) {
        m۱۵۲۳۷v(holder);
        holder.f۱۱۶۳۷c.setAlpha(0.0f);
        this.f۱۲۰۲۰i.add(holder);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t  reason: contains not printable characters */
    public void m۱۵۲۵۱t(RecyclerView.AbstractCd0 holder) {
        View view = holder.f۱۱۶۳۷c;
        ViewPropertyAnimator animation = view.animate();
        this.f۱۲۰۲۶o.add(holder);
        animation.alpha(1.0f).setDuration(m۱۴۴۷۳c()).setListener(new Ce(holder, view, animation)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.g0$e  reason: invalid class name */
    public class Ce extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ RecyclerView.AbstractCd0 f۱۲۰۴۰a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ View f۱۲۰۴۱b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f۱۲۰۴۲c;

        Ce(RecyclerView.AbstractCd0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f۱۲۰۴۰a = d0Var;
            this.f۱۲۰۴۱b = view;
            this.f۱۲۰۴۲c = viewPropertyAnimator;
        }

        public void onAnimationStart(Animator animator) {
            Cg0.this.m۱۵۰۷۶i(this.f۱۲۰۴۰a);
        }

        public void onAnimationCancel(Animator animator) {
            this.f۱۲۰۴۱b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f۱۲۰۴۲c.setListener(null);
            Cg0.this.m۱۵۰۷۵h(this.f۱۲۰۴۰a);
            Cg0.this.f۱۲۰۲۶o.remove(this.f۱۲۰۴۰a);
            Cg0.this.m۱۵۲۵۰j();
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc1
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۲۴۰a(RecyclerView.AbstractCd0 holder, int fromX, int fromY, int toX, int toY) {
        View view = holder.f۱۱۶۳۷c;
        int fromX2 = fromX + ((int) holder.f۱۱۶۳۷c.getTranslationX());
        int fromY2 = fromY + ((int) holder.f۱۱۶۳۷c.getTranslationY());
        m۱۵۲۳۷v(holder);
        int deltaX = toX - fromX2;
        int deltaY = toY - fromY2;
        if (deltaX == 0 && deltaY == 0) {
            m۱۵۰۷۷j(holder);
            return false;
        }
        if (deltaX != 0) {
            view.setTranslationX((float) (-deltaX));
        }
        if (deltaY != 0) {
            view.setTranslationY((float) (-deltaY));
        }
        this.f۱۲۰۲۱j.add(new Cj(holder, fromX2, fromY2, toX, toY));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۲۴۴b(RecyclerView.AbstractCd0 holder, int fromX, int fromY, int toX, int toY) {
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
        animation.setDuration(m۱۴۴۷۸e()).setListener(new Cf(holder, deltaX, view, deltaY, animation)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.g0$f  reason: invalid class name */
    public class Cf extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ RecyclerView.AbstractCd0 f۱۲۰۴۴a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ int f۱۲۰۴۵b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View f۱۲۰۴۶c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ int f۱۲۰۴۷d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f۱۲۰۴۸e;

        Cf(RecyclerView.AbstractCd0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f۱۲۰۴۴a = d0Var;
            this.f۱۲۰۴۵b = i;
            this.f۱۲۰۴۶c = view;
            this.f۱۲۰۴۷d = i2;
            this.f۱۲۰۴۸e = viewPropertyAnimator;
        }

        public void onAnimationStart(Animator animator) {
            Cg0.this.m۱۵۰۷۸k(this.f۱۲۰۴۴a);
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f۱۲۰۴۵b != 0) {
                this.f۱۲۰۴۶c.setTranslationX(0.0f);
            }
            if (this.f۱۲۰۴۷d != 0) {
                this.f۱۲۰۴۶c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f۱۲۰۴۸e.setListener(null);
            Cg0.this.m۱۵۰۷۷j(this.f۱۲۰۴۴a);
            Cg0.this.f۱۲۰۲۷p.remove(this.f۱۲۰۴۴a);
            Cg0.this.m۱۵۲۵۰j();
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc1
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۲۴۱a(RecyclerView.AbstractCd0 oldHolder, RecyclerView.AbstractCd0 newHolder, int fromX, int fromY, int toX, int toY) {
        if (oldHolder == newHolder) {
            return m۱۵۲۴۰a(oldHolder, fromX, fromY, toX, toY);
        }
        float prevTranslationX = oldHolder.f۱۱۶۳۷c.getTranslationX();
        float prevTranslationY = oldHolder.f۱۱۶۳۷c.getTranslationY();
        float prevAlpha = oldHolder.f۱۱۶۳۷c.getAlpha();
        m۱۵۲۳۷v(oldHolder);
        int deltaX = (int) (((float) (toX - fromX)) - prevTranslationX);
        int deltaY = (int) (((float) (toY - fromY)) - prevTranslationY);
        oldHolder.f۱۱۶۳۷c.setTranslationX(prevTranslationX);
        oldHolder.f۱۱۶۳۷c.setTranslationY(prevTranslationY);
        oldHolder.f۱۱۶۳۷c.setAlpha(prevAlpha);
        if (newHolder != null) {
            m۱۵۲۳۷v(newHolder);
            newHolder.f۱۱۶۳۷c.setTranslationX((float) (-deltaX));
            newHolder.f۱۱۶۳۷c.setTranslationY((float) (-deltaY));
            newHolder.f۱۱۶۳۷c.setAlpha(0.0f);
        }
        this.f۱۲۰۲۲k.add(new Ci(oldHolder, newHolder, fromX, fromY, toX, toY));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۲۳۸a(Ci changeInfo) {
        RecyclerView.AbstractCd0 holder = changeInfo.f۱۲۰۵۸a;
        View newView = null;
        View view = holder == null ? null : holder.f۱۱۶۳۷c;
        RecyclerView.AbstractCd0 newHolder = changeInfo.f۱۲۰۵۹b;
        if (newHolder != null) {
            newView = newHolder.f۱۱۶۳۷c;
        }
        if (view != null) {
            ViewPropertyAnimator oldViewAnim = view.animate().setDuration(m۱۴۴۷۶d());
            this.f۱۲۰۲۹r.add(changeInfo.f۱۲۰۵۸a);
            oldViewAnim.translationX((float) (changeInfo.f۱۲۰۶۲e - changeInfo.f۱۲۰۶۰c));
            oldViewAnim.translationY((float) (changeInfo.f۱۲۰۶۳f - changeInfo.f۱۲۰۶۱d));
            oldViewAnim.alpha(0.0f).setListener(new Cg(changeInfo, oldViewAnim, view)).start();
        }
        if (newView != null) {
            ViewPropertyAnimator newViewAnimation = newView.animate();
            this.f۱۲۰۲۹r.add(changeInfo.f۱۲۰۵۹b);
            newViewAnimation.translationX(0.0f).translationY(0.0f).setDuration(m۱۴۴۷۶d()).alpha(1.0f).setListener(new Ch(changeInfo, newViewAnimation, newView)).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.g0$g  reason: invalid class name */
    public class Cg extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ Ci f۱۲۰۵۰a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f۱۲۰۵۱b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View f۱۲۰۵۲c;

        Cg(Ci iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f۱۲۰۵۰a = iVar;
            this.f۱۲۰۵۱b = viewPropertyAnimator;
            this.f۱۲۰۵۲c = view;
        }

        public void onAnimationStart(Animator animator) {
            Cg0.this.m۱۵۰۶۸b(this.f۱۲۰۵۰a.f۱۲۰۵۸a, true);
        }

        public void onAnimationEnd(Animator animator) {
            this.f۱۲۰۵۱b.setListener(null);
            this.f۱۲۰۵۲c.setAlpha(1.0f);
            this.f۱۲۰۵۲c.setTranslationX(0.0f);
            this.f۱۲۰۵۲c.setTranslationY(0.0f);
            Cg0.this.m۱۵۰۶۲a(this.f۱۲۰۵۰a.f۱۲۰۵۸a, true);
            Cg0.this.f۱۲۰۲۹r.remove(this.f۱۲۰۵۰a.f۱۲۰۵۸a);
            Cg0.this.m۱۵۲۵۰j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.g0$h  reason: invalid class name */
    public class Ch extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ Ci f۱۲۰۵۴a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f۱۲۰۵۵b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View f۱۲۰۵۶c;

        Ch(Ci iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f۱۲۰۵۴a = iVar;
            this.f۱۲۰۵۵b = viewPropertyAnimator;
            this.f۱۲۰۵۶c = view;
        }

        public void onAnimationStart(Animator animator) {
            Cg0.this.m۱۵۰۶۸b(this.f۱۲۰۵۴a.f۱۲۰۵۹b, false);
        }

        public void onAnimationEnd(Animator animator) {
            this.f۱۲۰۵۵b.setListener(null);
            this.f۱۲۰۵۶c.setAlpha(1.0f);
            this.f۱۲۰۵۶c.setTranslationX(0.0f);
            this.f۱۲۰۵۶c.setTranslationY(0.0f);
            Cg0.this.m۱۵۰۶۲a(this.f۱۲۰۵۴a.f۱۲۰۵۹b, false);
            Cg0.this.f۱۲۰۲۹r.remove(this.f۱۲۰۵۴a.f۱۲۰۵۹b);
            Cg0.this.m۱۵۲۵۰j();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۲۳۳a(List<Ci> list, RecyclerView.AbstractCd0 item) {
        for (int i = list.size() - 1; i >= 0; i--) {
            Ci changeInfo = list.get(i);
            if (m۱۵۲۳۴a(changeInfo, item) && changeInfo.f۱۲۰۵۸a == null && changeInfo.f۱۲۰۵۹b == null) {
                list.remove(changeInfo);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۵۲۳۵b(Ci changeInfo) {
        RecyclerView.AbstractCd0 d0Var = changeInfo.f۱۲۰۵۸a;
        if (d0Var != null) {
            m۱۵۲۳۴a(changeInfo, d0Var);
        }
        RecyclerView.AbstractCd0 d0Var2 = changeInfo.f۱۲۰۵۹b;
        if (d0Var2 != null) {
            m۱۵۲۳۴a(changeInfo, d0Var2);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۵۲۳۴a(Ci changeInfo, RecyclerView.AbstractCd0 item) {
        boolean oldItem = false;
        if (changeInfo.f۱۲۰۵۹b == item) {
            changeInfo.f۱۲۰۵۹b = null;
        } else if (changeInfo.f۱۲۰۵۸a != item) {
            return false;
        } else {
            changeInfo.f۱۲۰۵۸a = null;
            oldItem = true;
        }
        item.f۱۱۶۳۷c.setAlpha(1.0f);
        item.f۱۱۶۳۷c.setTranslationX(0.0f);
        item.f۱۱۶۳۷c.setTranslationY(0.0f);
        m۱۵۰۶۲a(item, oldItem);
        return true;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCl
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۲۴۵c(RecyclerView.AbstractCd0 item) {
        View view = item.f۱۱۶۳۷c;
        view.animate().cancel();
        int i = this.f۱۲۰۲۱j.size();
        while (true) {
            i--;
            if (i < 0) {
                break;
            } else if (this.f۱۲۰۲۱j.get(i).f۱۲۰۶۴a == item) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m۱۵۰۷۷j(item);
                this.f۱۲۰۲۱j.remove(i);
            }
        }
        m۱۵۲۳۳a(this.f۱۲۰۲۲k, item);
        if (this.f۱۲۰۱۹h.remove(item)) {
            view.setAlpha(1.0f);
            m۱۵۰۷۹l(item);
        }
        if (this.f۱۲۰۲۰i.remove(item)) {
            view.setAlpha(1.0f);
            m۱۵۰۷۵h(item);
        }
        for (int i2 = this.f۱۲۰۲۵n.size() - 1; i2 >= 0; i2--) {
            ArrayList<DefaultItemAnimator.ChangeInfo> changes = this.f۱۲۰۲۵n.get(i2);
            m۱۵۲۳۳a(changes, item);
            if (changes.isEmpty()) {
                this.f۱۲۰۲۵n.remove(i2);
            }
        }
        for (int i3 = this.f۱۲۰۲۴m.size() - 1; i3 >= 0; i3--) {
            ArrayList<DefaultItemAnimator.MoveInfo> moves = this.f۱۲۰۲۴m.get(i3);
            int j = moves.size() - 1;
            while (true) {
                if (j < 0) {
                    break;
                } else if (((Cj) moves.get(j)).f۱۲۰۶۴a == item) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m۱۵۰۷۷j(item);
                    moves.remove(j);
                    if (moves.isEmpty()) {
                        this.f۱۲۰۲۴m.remove(i3);
                    }
                } else {
                    j--;
                }
            }
        }
        for (int i4 = this.f۱۲۰۲۳l.size() - 1; i4 >= 0; i4--) {
            ArrayList<RecyclerView.ViewHolder> additions = this.f۱۲۰۲۳l.get(i4);
            if (additions.remove(item)) {
                view.setAlpha(1.0f);
                m۱۵۰۷۵h(item);
                if (additions.isEmpty()) {
                    this.f۱۲۰۲۳l.remove(i4);
                }
            }
        }
        this.f۱۲۰۲۸q.remove(item);
        this.f۱۲۰۲۶o.remove(item);
        this.f۱۲۰۲۹r.remove(item);
        this.f۱۲۰۲۷p.remove(item);
        m۱۵۲۵۰j();
    }

    /* renamed from: v  reason: contains not printable characters */
    private void m۱۵۲۳۷v(RecyclerView.AbstractCd0 holder) {
        if (f۱۲۰۱۸s == null) {
            f۱۲۰۱۸s = new ValueAnimator().getInterpolator();
        }
        holder.f۱۱۶۳۷c.animate().setInterpolator(f۱۲۰۱۸s);
        m۱۵۲۴۵c(holder);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCl
    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۵۲۴۷g() {
        return !this.f۱۲۰۲۰i.isEmpty() || !this.f۱۲۰۲۲k.isEmpty() || !this.f۱۲۰۲۱j.isEmpty() || !this.f۱۲۰۱۹h.isEmpty() || !this.f۱۲۰۲۷p.isEmpty() || !this.f۱۲۰۲۸q.isEmpty() || !this.f۱۲۰۲۶o.isEmpty() || !this.f۱۲۰۲۹r.isEmpty() || !this.f۱۲۰۲۴m.isEmpty() || !this.f۱۲۰۲۳l.isEmpty() || !this.f۱۲۰۲۵n.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j  reason: contains not printable characters */
    public void m۱۵۲۵۰j() {
        if (!m۱۵۲۴۷g()) {
            m۱۴۴۶۴a();
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCl
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۲۴۳b() {
        for (int i = this.f۱۲۰۲۱j.size() - 1; i >= 0; i--) {
            Cj item = this.f۱۲۰۲۱j.get(i);
            View view = item.f۱۲۰۶۴a.f۱۱۶۳۷c;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m۱۵۰۷۷j(item.f۱۲۰۶۴a);
            this.f۱۲۰۲۱j.remove(i);
        }
        for (int i2 = this.f۱۲۰۱۹h.size() - 1; i2 >= 0; i2--) {
            m۱۵۰۷۹l(this.f۱۲۰۱۹h.get(i2));
            this.f۱۲۰۱۹h.remove(i2);
        }
        for (int i3 = this.f۱۲۰۲۰i.size() - 1; i3 >= 0; i3--) {
            RecyclerView.AbstractCd0 item2 = this.f۱۲۰۲۰i.get(i3);
            item2.f۱۱۶۳۷c.setAlpha(1.0f);
            m۱۵۰۷۵h(item2);
            this.f۱۲۰۲۰i.remove(i3);
        }
        for (int i4 = this.f۱۲۰۲۲k.size() - 1; i4 >= 0; i4--) {
            m۱۵۲۳۵b(this.f۱۲۰۲۲k.get(i4));
        }
        this.f۱۲۰۲۲k.clear();
        if (m۱۵۲۴۷g()) {
            for (int i5 = this.f۱۲۰۲۴m.size() - 1; i5 >= 0; i5--) {
                ArrayList<DefaultItemAnimator.MoveInfo> moves = this.f۱۲۰۲۴m.get(i5);
                for (int j = moves.size() - 1; j >= 0; j--) {
                    Cj moveInfo = (Cj) moves.get(j);
                    View view2 = moveInfo.f۱۲۰۶۴a.f۱۱۶۳۷c;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m۱۵۰۷۷j(moveInfo.f۱۲۰۶۴a);
                    moves.remove(j);
                    if (moves.isEmpty()) {
                        this.f۱۲۰۲۴m.remove(moves);
                    }
                }
            }
            for (int i6 = this.f۱۲۰۲۳l.size() - 1; i6 >= 0; i6--) {
                ArrayList<RecyclerView.ViewHolder> additions = this.f۱۲۰۲۳l.get(i6);
                for (int j2 = additions.size() - 1; j2 >= 0; j2--) {
                    RecyclerView.AbstractCd0 item3 = (RecyclerView.AbstractCd0) additions.get(j2);
                    item3.f۱۱۶۳۷c.setAlpha(1.0f);
                    m۱۵۰۷۵h(item3);
                    additions.remove(j2);
                    if (additions.isEmpty()) {
                        this.f۱۲۰۲۳l.remove(additions);
                    }
                }
            }
            for (int i7 = this.f۱۲۰۲۵n.size() - 1; i7 >= 0; i7--) {
                ArrayList<DefaultItemAnimator.ChangeInfo> changes = this.f۱۲۰۲۵n.get(i7);
                for (int j3 = changes.size() - 1; j3 >= 0; j3--) {
                    m۱۵۲۳۵b((Ci) changes.get(j3));
                    if (changes.isEmpty()) {
                        this.f۱۲۰۲۵n.remove(changes);
                    }
                }
            }
            m۱۵۲۳۹a(this.f۱۲۰۲۸q);
            m۱۵۲۳۹a(this.f۱۲۰۲۷p);
            m۱۵۲۳۹a(this.f۱۲۰۲۶o);
            m۱۵۲۳۹a(this.f۱۲۰۲۹r);
            m۱۴۴۶۴a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۲۳۹a(List<RecyclerView.AbstractCd0> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            list.get(i).f۱۱۶۳۷c.animate().cancel();
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCl
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۲۴۲a(RecyclerView.AbstractCd0 viewHolder, List<Object> payloads) {
        return !payloads.isEmpty() || super.m۱۴۴۶۹a(viewHolder, payloads);
    }
}
