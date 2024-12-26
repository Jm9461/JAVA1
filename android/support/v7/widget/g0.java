package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.view.u;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class g0 extends c1 {
    private static TimeInterpolator s;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<RecyclerView.d0> f۲۰۴۱h = new ArrayList<>();
    private ArrayList<RecyclerView.d0> i = new ArrayList<>();
    private ArrayList<j> j = new ArrayList<>();
    private ArrayList<i> k = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.d0>> l = new ArrayList<>();
    ArrayList<ArrayList<j>> m = new ArrayList<>();
    ArrayList<ArrayList<i>> n = new ArrayList<>();
    ArrayList<RecyclerView.d0> o = new ArrayList<>();
    ArrayList<RecyclerView.d0> p = new ArrayList<>();
    ArrayList<RecyclerView.d0> q = new ArrayList<>();
    ArrayList<RecyclerView.d0> r = new ArrayList<>();

    /* access modifiers changed from: private */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.d0 f۲۰۷۶a;

        /* renamed from: b  reason: collision with root package name */
        public int f۲۰۷۷b;

        /* renamed from: c  reason: collision with root package name */
        public int f۲۰۷۸c;

        /* renamed from: d  reason: collision with root package name */
        public int f۲۰۷۹d;

        /* renamed from: e  reason: collision with root package name */
        public int f۲۰۸۰e;

        j(RecyclerView.d0 holder, int fromX, int fromY, int toX, int toY) {
            this.f۲۰۷۶a = holder;
            this.f۲۰۷۷b = fromX;
            this.f۲۰۷۸c = fromY;
            this.f۲۰۷۹d = toX;
            this.f۲۰۸۰e = toY;
        }
    }

    /* access modifiers changed from: private */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.d0 f۲۰۷۰a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.d0 f۲۰۷۱b;

        /* renamed from: c  reason: collision with root package name */
        public int f۲۰۷۲c;

        /* renamed from: d  reason: collision with root package name */
        public int f۲۰۷۳d;

        /* renamed from: e  reason: collision with root package name */
        public int f۲۰۷۴e;

        /* renamed from: f  reason: collision with root package name */
        public int f۲۰۷۵f;

        private i(RecyclerView.d0 oldHolder, RecyclerView.d0 newHolder) {
            this.f۲۰۷۰a = oldHolder;
            this.f۲۰۷۱b = newHolder;
        }

        i(RecyclerView.d0 oldHolder, RecyclerView.d0 newHolder, int fromX, int fromY, int toX, int toY) {
            this(oldHolder, newHolder);
            this.f۲۰۷۲c = fromX;
            this.f۲۰۷۳d = fromY;
            this.f۲۰۷۴e = toX;
            this.f۲۰۷۵f = toY;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f۲۰۷۰a + ", newHolder=" + this.f۲۰۷۱b + ", fromX=" + this.f۲۰۷۲c + ", fromY=" + this.f۲۰۷۳d + ", toX=" + this.f۲۰۷۴e + ", toY=" + this.f۲۰۷۵f + '}';
        }
    }

    @Override // android.support.v7.widget.RecyclerView.l
    public void i() {
        boolean removalsPending = !this.f۲۰۴۱h.isEmpty();
        boolean movesPending = !this.j.isEmpty();
        boolean changesPending = !this.k.isEmpty();
        boolean additionsPending = !this.i.isEmpty();
        if (removalsPending || movesPending || additionsPending || changesPending) {
            Iterator<RecyclerView.d0> it = this.f۲۰۴۱h.iterator();
            while (it.hasNext()) {
                u(it.next());
            }
            this.f۲۰۴۱h.clear();
            if (movesPending) {
                ArrayList<DefaultItemAnimator.MoveInfo> moves = new ArrayList<>();
                moves.addAll(this.j);
                this.m.add(moves);
                this.j.clear();
                Runnable mover = new a(moves);
                if (removalsPending) {
                    u.a(((j) moves.get(0)).f۲۰۷۶a.f۱۸۴۱c, mover, f());
                } else {
                    mover.run();
                }
            }
            if (changesPending) {
                ArrayList<DefaultItemAnimator.ChangeInfo> changes = new ArrayList<>();
                changes.addAll(this.k);
                this.n.add(changes);
                this.k.clear();
                Runnable changer = new b(changes);
                if (removalsPending) {
                    u.a(((i) changes.get(0)).f۲۰۷۰a.f۱۸۴۱c, changer, f());
                } else {
                    changer.run();
                }
            }
            if (additionsPending) {
                ArrayList<RecyclerView.ViewHolder> additions = new ArrayList<>();
                additions.addAll(this.i);
                this.l.add(additions);
                this.i.clear();
                Runnable adder = new c(additions);
                if (removalsPending || movesPending || changesPending) {
                    long changeDuration = 0;
                    long removeDuration = removalsPending ? f() : 0;
                    long moveDuration = movesPending ? e() : 0;
                    if (changesPending) {
                        changeDuration = d();
                    }
                    u.a(((RecyclerView.d0) additions.get(0)).f۱۸۴۱c, adder, Math.max(moveDuration, changeDuration) + removeDuration);
                    return;
                }
                adder.run();
            }
        }
    }

    class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f۲۰۴۲c;

        a(ArrayList arrayList) {
            this.f۲۰۴۲c = arrayList;
        }

        public void run() {
            Iterator it = this.f۲۰۴۲c.iterator();
            while (it.hasNext()) {
                j moveInfo = (j) it.next();
                g0.this.b(moveInfo.f۲۰۷۶a, moveInfo.f۲۰۷۷b, moveInfo.f۲۰۷۸c, moveInfo.f۲۰۷۹d, moveInfo.f۲۰۸۰e);
            }
            this.f۲۰۴۲c.clear();
            g0.this.m.remove(this.f۲۰۴۲c);
        }
    }

    class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f۲۰۴۴c;

        b(ArrayList arrayList) {
            this.f۲۰۴۴c = arrayList;
        }

        public void run() {
            Iterator it = this.f۲۰۴۴c.iterator();
            while (it.hasNext()) {
                g0.this.a((i) it.next());
            }
            this.f۲۰۴۴c.clear();
            g0.this.n.remove(this.f۲۰۴۴c);
        }
    }

    class c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f۲۰۴۶c;

        c(ArrayList arrayList) {
            this.f۲۰۴۶c = arrayList;
        }

        public void run() {
            Iterator it = this.f۲۰۴۶c.iterator();
            while (it.hasNext()) {
                g0.this.t((RecyclerView.d0) it.next());
            }
            this.f۲۰۴۶c.clear();
            g0.this.l.remove(this.f۲۰۴۶c);
        }
    }

    @Override // android.support.v7.widget.c1
    public boolean g(RecyclerView.d0 holder) {
        v(holder);
        this.f۲۰۴۱h.add(holder);
        return true;
    }

    private void u(RecyclerView.d0 holder) {
        View view = holder.f۱۸۴۱c;
        ViewPropertyAnimator animation = view.animate();
        this.q.add(holder);
        animation.setDuration(f()).alpha(0.0f).setListener(new d(holder, animation, view)).start();
    }

    /* access modifiers changed from: package-private */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f۲۰۴۸a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f۲۰۴۹b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f۲۰۵۰c;

        d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f۲۰۴۸a = d0Var;
            this.f۲۰۴۹b = viewPropertyAnimator;
            this.f۲۰۵۰c = view;
        }

        public void onAnimationStart(Animator animator) {
            g0.this.m(this.f۲۰۴۸a);
        }

        public void onAnimationEnd(Animator animator) {
            this.f۲۰۴۹b.setListener(null);
            this.f۲۰۵۰c.setAlpha(1.0f);
            g0.this.l(this.f۲۰۴۸a);
            g0.this.q.remove(this.f۲۰۴۸a);
            g0.this.j();
        }
    }

    @Override // android.support.v7.widget.c1
    public boolean f(RecyclerView.d0 holder) {
        v(holder);
        holder.f۱۸۴۱c.setAlpha(0.0f);
        this.i.add(holder);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void t(RecyclerView.d0 holder) {
        View view = holder.f۱۸۴۱c;
        ViewPropertyAnimator animation = view.animate();
        this.o.add(holder);
        animation.alpha(1.0f).setDuration(c()).setListener(new e(holder, view, animation)).start();
    }

    /* access modifiers changed from: package-private */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f۲۰۵۲a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f۲۰۵۳b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f۲۰۵۴c;

        e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f۲۰۵۲a = d0Var;
            this.f۲۰۵۳b = view;
            this.f۲۰۵۴c = viewPropertyAnimator;
        }

        public void onAnimationStart(Animator animator) {
            g0.this.i(this.f۲۰۵۲a);
        }

        public void onAnimationCancel(Animator animator) {
            this.f۲۰۵۳b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f۲۰۵۴c.setListener(null);
            g0.this.h(this.f۲۰۵۲a);
            g0.this.o.remove(this.f۲۰۵۲a);
            g0.this.j();
        }
    }

    @Override // android.support.v7.widget.c1
    public boolean a(RecyclerView.d0 holder, int fromX, int fromY, int toX, int toY) {
        View view = holder.f۱۸۴۱c;
        int fromX2 = fromX + ((int) holder.f۱۸۴۱c.getTranslationX());
        int fromY2 = fromY + ((int) holder.f۱۸۴۱c.getTranslationY());
        v(holder);
        int deltaX = toX - fromX2;
        int deltaY = toY - fromY2;
        if (deltaX == 0 && deltaY == 0) {
            j(holder);
            return false;
        }
        if (deltaX != 0) {
            view.setTranslationX((float) (-deltaX));
        }
        if (deltaY != 0) {
            view.setTranslationY((float) (-deltaY));
        }
        this.j.add(new j(holder, fromX2, fromY2, toX, toY));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.d0 holder, int fromX, int fromY, int toX, int toY) {
        View view = holder.f۱۸۴۱c;
        int deltaX = toX - fromX;
        int deltaY = toY - fromY;
        if (deltaX != 0) {
            view.animate().translationX(0.0f);
        }
        if (deltaY != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animation = view.animate();
        this.p.add(holder);
        animation.setDuration(e()).setListener(new f(holder, deltaX, view, deltaY, animation)).start();
    }

    /* access modifiers changed from: package-private */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f۲۰۵۶a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f۲۰۵۷b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f۲۰۵۸c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f۲۰۵۹d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f۲۰۶۰e;

        f(RecyclerView.d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f۲۰۵۶a = d0Var;
            this.f۲۰۵۷b = i;
            this.f۲۰۵۸c = view;
            this.f۲۰۵۹d = i2;
            this.f۲۰۶۰e = viewPropertyAnimator;
        }

        public void onAnimationStart(Animator animator) {
            g0.this.k(this.f۲۰۵۶a);
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f۲۰۵۷b != 0) {
                this.f۲۰۵۸c.setTranslationX(0.0f);
            }
            if (this.f۲۰۵۹d != 0) {
                this.f۲۰۵۸c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f۲۰۶۰e.setListener(null);
            g0.this.j(this.f۲۰۵۶a);
            g0.this.p.remove(this.f۲۰۵۶a);
            g0.this.j();
        }
    }

    @Override // android.support.v7.widget.c1
    public boolean a(RecyclerView.d0 oldHolder, RecyclerView.d0 newHolder, int fromX, int fromY, int toX, int toY) {
        if (oldHolder == newHolder) {
            return a(oldHolder, fromX, fromY, toX, toY);
        }
        float prevTranslationX = oldHolder.f۱۸۴۱c.getTranslationX();
        float prevTranslationY = oldHolder.f۱۸۴۱c.getTranslationY();
        float prevAlpha = oldHolder.f۱۸۴۱c.getAlpha();
        v(oldHolder);
        int deltaX = (int) (((float) (toX - fromX)) - prevTranslationX);
        int deltaY = (int) (((float) (toY - fromY)) - prevTranslationY);
        oldHolder.f۱۸۴۱c.setTranslationX(prevTranslationX);
        oldHolder.f۱۸۴۱c.setTranslationY(prevTranslationY);
        oldHolder.f۱۸۴۱c.setAlpha(prevAlpha);
        if (newHolder != null) {
            v(newHolder);
            newHolder.f۱۸۴۱c.setTranslationX((float) (-deltaX));
            newHolder.f۱۸۴۱c.setTranslationY((float) (-deltaY));
            newHolder.f۱۸۴۱c.setAlpha(0.0f);
        }
        this.k.add(new i(oldHolder, newHolder, fromX, fromY, toX, toY));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(i changeInfo) {
        RecyclerView.d0 holder = changeInfo.f۲۰۷۰a;
        View newView = null;
        View view = holder == null ? null : holder.f۱۸۴۱c;
        RecyclerView.d0 newHolder = changeInfo.f۲۰۷۱b;
        if (newHolder != null) {
            newView = newHolder.f۱۸۴۱c;
        }
        if (view != null) {
            ViewPropertyAnimator oldViewAnim = view.animate().setDuration(d());
            this.r.add(changeInfo.f۲۰۷۰a);
            oldViewAnim.translationX((float) (changeInfo.f۲۰۷۴e - changeInfo.f۲۰۷۲c));
            oldViewAnim.translationY((float) (changeInfo.f۲۰۷۵f - changeInfo.f۲۰۷۳d));
            oldViewAnim.alpha(0.0f).setListener(new g(changeInfo, oldViewAnim, view)).start();
        }
        if (newView != null) {
            ViewPropertyAnimator newViewAnimation = newView.animate();
            this.r.add(changeInfo.f۲۰۷۱b);
            newViewAnimation.translationX(0.0f).translationY(0.0f).setDuration(d()).alpha(1.0f).setListener(new h(changeInfo, newViewAnimation, newView)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f۲۰۶۲a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f۲۰۶۳b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f۲۰۶۴c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f۲۰۶۲a = iVar;
            this.f۲۰۶۳b = viewPropertyAnimator;
            this.f۲۰۶۴c = view;
        }

        public void onAnimationStart(Animator animator) {
            g0.this.b(this.f۲۰۶۲a.f۲۰۷۰a, true);
        }

        public void onAnimationEnd(Animator animator) {
            this.f۲۰۶۳b.setListener(null);
            this.f۲۰۶۴c.setAlpha(1.0f);
            this.f۲۰۶۴c.setTranslationX(0.0f);
            this.f۲۰۶۴c.setTranslationY(0.0f);
            g0.this.a(this.f۲۰۶۲a.f۲۰۷۰a, true);
            g0.this.r.remove(this.f۲۰۶۲a.f۲۰۷۰a);
            g0.this.j();
        }
    }

    /* access modifiers changed from: package-private */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f۲۰۶۶a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f۲۰۶۷b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f۲۰۶۸c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f۲۰۶۶a = iVar;
            this.f۲۰۶۷b = viewPropertyAnimator;
            this.f۲۰۶۸c = view;
        }

        public void onAnimationStart(Animator animator) {
            g0.this.b(this.f۲۰۶۶a.f۲۰۷۱b, false);
        }

        public void onAnimationEnd(Animator animator) {
            this.f۲۰۶۷b.setListener(null);
            this.f۲۰۶۸c.setAlpha(1.0f);
            this.f۲۰۶۸c.setTranslationX(0.0f);
            this.f۲۰۶۸c.setTranslationY(0.0f);
            g0.this.a(this.f۲۰۶۶a.f۲۰۷۱b, false);
            g0.this.r.remove(this.f۲۰۶۶a.f۲۰۷۱b);
            g0.this.j();
        }
    }

    private void a(List<i> list, RecyclerView.d0 item) {
        for (int i2 = list.size() - 1; i2 >= 0; i2--) {
            i changeInfo = list.get(i2);
            if (a(changeInfo, item) && changeInfo.f۲۰۷۰a == null && changeInfo.f۲۰۷۱b == null) {
                list.remove(changeInfo);
            }
        }
    }

    private void b(i changeInfo) {
        RecyclerView.d0 d0Var = changeInfo.f۲۰۷۰a;
        if (d0Var != null) {
            a(changeInfo, d0Var);
        }
        RecyclerView.d0 d0Var2 = changeInfo.f۲۰۷۱b;
        if (d0Var2 != null) {
            a(changeInfo, d0Var2);
        }
    }

    private boolean a(i changeInfo, RecyclerView.d0 item) {
        boolean oldItem = false;
        if (changeInfo.f۲۰۷۱b == item) {
            changeInfo.f۲۰۷۱b = null;
        } else if (changeInfo.f۲۰۷۰a != item) {
            return false;
        } else {
            changeInfo.f۲۰۷۰a = null;
            oldItem = true;
        }
        item.f۱۸۴۱c.setAlpha(1.0f);
        item.f۱۸۴۱c.setTranslationX(0.0f);
        item.f۱۸۴۱c.setTranslationY(0.0f);
        a(item, oldItem);
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.l
    public void c(RecyclerView.d0 item) {
        View view = item.f۱۸۴۱c;
        view.animate().cancel();
        int i2 = this.j.size();
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            } else if (this.j.get(i2).f۲۰۷۶a == item) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                j(item);
                this.j.remove(i2);
            }
        }
        a(this.k, item);
        if (this.f۲۰۴۱h.remove(item)) {
            view.setAlpha(1.0f);
            l(item);
        }
        if (this.i.remove(item)) {
            view.setAlpha(1.0f);
            h(item);
        }
        for (int i3 = this.n.size() - 1; i3 >= 0; i3--) {
            ArrayList<DefaultItemAnimator.ChangeInfo> changes = this.n.get(i3);
            a(changes, item);
            if (changes.isEmpty()) {
                this.n.remove(i3);
            }
        }
        for (int i4 = this.m.size() - 1; i4 >= 0; i4--) {
            ArrayList<DefaultItemAnimator.MoveInfo> moves = this.m.get(i4);
            int j2 = moves.size() - 1;
            while (true) {
                if (j2 < 0) {
                    break;
                } else if (((j) moves.get(j2)).f۲۰۷۶a == item) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    j(item);
                    moves.remove(j2);
                    if (moves.isEmpty()) {
                        this.m.remove(i4);
                    }
                } else {
                    j2--;
                }
            }
        }
        for (int i5 = this.l.size() - 1; i5 >= 0; i5--) {
            ArrayList<RecyclerView.ViewHolder> additions = this.l.get(i5);
            if (additions.remove(item)) {
                view.setAlpha(1.0f);
                h(item);
                if (additions.isEmpty()) {
                    this.l.remove(i5);
                }
            }
        }
        this.q.remove(item);
        this.o.remove(item);
        this.r.remove(item);
        this.p.remove(item);
        j();
    }

    private void v(RecyclerView.d0 holder) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        holder.f۱۸۴۱c.animate().setInterpolator(s);
        c(holder);
    }

    @Override // android.support.v7.widget.RecyclerView.l
    public boolean g() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.f۲۰۴۱h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (!g()) {
            a();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.l
    public void b() {
        for (int i2 = this.j.size() - 1; i2 >= 0; i2--) {
            j item = this.j.get(i2);
            View view = item.f۲۰۷۶a.f۱۸۴۱c;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            j(item.f۲۰۷۶a);
            this.j.remove(i2);
        }
        for (int i3 = this.f۲۰۴۱h.size() - 1; i3 >= 0; i3--) {
            l(this.f۲۰۴۱h.get(i3));
            this.f۲۰۴۱h.remove(i3);
        }
        for (int i4 = this.i.size() - 1; i4 >= 0; i4--) {
            RecyclerView.d0 item2 = this.i.get(i4);
            item2.f۱۸۴۱c.setAlpha(1.0f);
            h(item2);
            this.i.remove(i4);
        }
        for (int i5 = this.k.size() - 1; i5 >= 0; i5--) {
            b(this.k.get(i5));
        }
        this.k.clear();
        if (g()) {
            for (int i6 = this.m.size() - 1; i6 >= 0; i6--) {
                ArrayList<DefaultItemAnimator.MoveInfo> moves = this.m.get(i6);
                for (int j2 = moves.size() - 1; j2 >= 0; j2--) {
                    j moveInfo = (j) moves.get(j2);
                    View view2 = moveInfo.f۲۰۷۶a.f۱۸۴۱c;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    j(moveInfo.f۲۰۷۶a);
                    moves.remove(j2);
                    if (moves.isEmpty()) {
                        this.m.remove(moves);
                    }
                }
            }
            for (int i7 = this.l.size() - 1; i7 >= 0; i7--) {
                ArrayList<RecyclerView.ViewHolder> additions = this.l.get(i7);
                for (int j3 = additions.size() - 1; j3 >= 0; j3--) {
                    RecyclerView.d0 item3 = (RecyclerView.d0) additions.get(j3);
                    item3.f۱۸۴۱c.setAlpha(1.0f);
                    h(item3);
                    additions.remove(j3);
                    if (additions.isEmpty()) {
                        this.l.remove(additions);
                    }
                }
            }
            for (int i8 = this.n.size() - 1; i8 >= 0; i8--) {
                ArrayList<DefaultItemAnimator.ChangeInfo> changes = this.n.get(i8);
                for (int j4 = changes.size() - 1; j4 >= 0; j4--) {
                    b((i) changes.get(j4));
                    if (changes.isEmpty()) {
                        this.n.remove(changes);
                    }
                }
            }
            a(this.q);
            a(this.p);
            a(this.o);
            a(this.r);
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<RecyclerView.d0> list) {
        for (int i2 = list.size() - 1; i2 >= 0; i2--) {
            list.get(i2).f۱۸۴۱c.animate().cancel();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.l
    public boolean a(RecyclerView.d0 viewHolder, List<Object> payloads) {
        return !payloads.isEmpty() || super.a(viewHolder, payloads);
    }
}
