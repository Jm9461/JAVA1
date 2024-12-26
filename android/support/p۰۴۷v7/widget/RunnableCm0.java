package android.support.p۰۴۷v7.widget;

import android.support.p۰۴۷v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.m0  reason: invalid class name */
public final class RunnableCm0 implements Runnable {

    /* renamed from: g  reason: contains not printable characters */
    static final ThreadLocal<RunnableCm0> f۱۲۱۹۳g = new ThreadLocal<>();

    /* renamed from: h  reason: contains not printable characters */
    static Comparator<Cc> f۱۲۱۹۴h = new Ca();

    /* renamed from: c  reason: contains not printable characters */
    ArrayList<RecyclerView> f۱۲۱۹۵c = new ArrayList<>();

    /* renamed from: d  reason: contains not printable characters */
    long f۱۲۱۹۶d;

    /* renamed from: e  reason: contains not printable characters */
    long f۱۲۱۹۷e;

    /* renamed from: f  reason: contains not printable characters */
    private ArrayList<Cc> f۱۲۱۹۸f = new ArrayList<>();

    RunnableCm0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.m0$c  reason: invalid class name */
    public static class Cc {

        /* renamed from: a  reason: contains not printable characters */
        public boolean f۱۲۲۰۳a;

        /* renamed from: b  reason: contains not printable characters */
        public int f۱۲۲۰۴b;

        /* renamed from: c  reason: contains not printable characters */
        public int f۱۲۲۰۵c;

        /* renamed from: d  reason: contains not printable characters */
        public RecyclerView f۱۲۲۰۶d;

        /* renamed from: e  reason: contains not printable characters */
        public int f۱۲۲۰۷e;

        Cc() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۴۳۴a() {
            this.f۱۲۲۰۳a = false;
            this.f۱۲۲۰۴b = 0;
            this.f۱۲۲۰۵c = 0;
            this.f۱۲۲۰۶d = null;
            this.f۱۲۲۰۷e = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.m0$b  reason: invalid class name */
    public static class Cb implements RecyclerView.AbstractCo.AbstractCc {

        /* renamed from: a  reason: contains not printable characters */
        int f۱۲۱۹۹a;

        /* renamed from: b  reason: contains not printable characters */
        int f۱۲۲۰۰b;

        /* renamed from: c  reason: contains not printable characters */
        int[] f۱۲۲۰۱c;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۲۲۰۲d;

        Cb() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۵۴۳۳b(int dx, int dy) {
            this.f۱۲۱۹۹a = dx;
            this.f۱۲۲۰۰b = dy;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۴۳۱a(RecyclerView view, boolean nested) {
            this.f۱۲۲۰۲d = 0;
            int[] iArr = this.f۱۲۲۰۱c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractCo layout = view.f۱۱۵۸۵o;
            if (view.f۱۱۵۸۳n != null && layout != null && layout.m۱۴۶۲۶v()) {
                if (nested) {
                    if (!view.f۱۱۵۶۷f.m۱۵۱۰۵c()) {
                        layout.m۱۴۵۱۵a(view.f۱۱۵۸۳n.m۱۴۴۳۱a(), this);
                    }
                } else if (!view.m۱۴۳۳۷j()) {
                    layout.m۱۴۵۱۴a(this.f۱۲۱۹۹a, this.f۱۲۲۰۰b, view.f۱۱۵۷۶j0, this);
                }
                int i = this.f۱۲۲۰۲d;
                if (i > layout.f۱۱۶۸۰m) {
                    layout.f۱۱۶۸۰m = i;
                    layout.f۱۱۶۸۱n = nested;
                    view.f۱۱۵۶۳d.m۱۴۷۰۴j();
                }
            }
        }

        @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۴۳۰a(int layoutPosition, int pixelDistance) {
            if (layoutPosition < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (pixelDistance >= 0) {
                int storagePosition = this.f۱۲۲۰۲d * 2;
                int[] iArr = this.f۱۲۲۰۱c;
                if (iArr == null) {
                    this.f۱۲۲۰۱c = new int[4];
                    Arrays.fill(this.f۱۲۲۰۱c, -1);
                } else if (storagePosition >= iArr.length) {
                    int[] oldArray = this.f۱۲۲۰۱c;
                    this.f۱۲۲۰۱c = new int[(storagePosition * 2)];
                    System.arraycopy(oldArray, 0, this.f۱۲۲۰۱c, 0, oldArray.length);
                }
                int[] oldArray2 = this.f۱۲۲۰۱c;
                oldArray2[storagePosition] = layoutPosition;
                oldArray2[storagePosition + 1] = pixelDistance;
                this.f۱۲۲۰۲d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۵۴۳۲a(int position) {
            if (this.f۱۲۲۰۱c == null) {
                return false;
            }
            int count = this.f۱۲۲۰۲d * 2;
            for (int i = 0; i < count; i += 2) {
                if (this.f۱۲۲۰۱c[i] == position) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۴۲۹a() {
            int[] iArr = this.f۱۲۲۰۱c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f۱۲۲۰۲d = 0;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۴۲۵a(RecyclerView recyclerView) {
        this.f۱۲۱۹۵c.add(recyclerView);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۴۲۷b(RecyclerView recyclerView) {
        this.f۱۲۱۹۵c.remove(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۴۲۶a(RecyclerView recyclerView, int prefetchDx, int prefetchDy) {
        if (recyclerView.isAttachedToWindow() && this.f۱۲۱۹۶d == 0) {
            this.f۱۲۱۹۶d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f۱۱۵۷۴i0.m۱۵۴۳۳b(prefetchDx, prefetchDy);
    }

    /* renamed from: android.support.v7.widget.m0$a  reason: invalid class name */
    static class Ca implements Comparator<Cc> {
        Ca() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public int compare(Cc lhs, Cc rhs) {
            if ((lhs.f۱۲۲۰۶d == null) == (rhs.f۱۲۲۰۶d == null)) {
                boolean z = lhs.f۱۲۲۰۳a;
                if (z == rhs.f۱۲۲۰۳a) {
                    int deltaViewVelocity = rhs.f۱۲۲۰۴b - lhs.f۱۲۲۰۴b;
                    if (deltaViewVelocity != 0) {
                        return deltaViewVelocity;
                    }
                    int deltaDistanceToItem = lhs.f۱۲۲۰۵c - rhs.f۱۲۲۰۵c;
                    if (deltaDistanceToItem != 0) {
                        return deltaDistanceToItem;
                    }
                    return 0;
                } else if (z) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (lhs.f۱۲۲۰۶d == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۴۱۹a() {
        Cc task;
        int viewCount = this.f۱۲۱۹۵c.size();
        int totalTaskCount = 0;
        for (int i = 0; i < viewCount; i++) {
            RecyclerView view = this.f۱۲۱۹۵c.get(i);
            if (view.getWindowVisibility() == 0) {
                view.f۱۱۵۷۴i0.m۱۵۴۳۱a(view, false);
                totalTaskCount += view.f۱۱۵۷۴i0.f۱۲۲۰۲d;
            }
        }
        this.f۱۲۱۹۸f.ensureCapacity(totalTaskCount);
        int totalTaskIndex = 0;
        for (int i2 = 0; i2 < viewCount; i2++) {
            RecyclerView view2 = this.f۱۲۱۹۵c.get(i2);
            if (view2.getWindowVisibility() == 0) {
                Cb prefetchRegistry = view2.f۱۱۵۷۴i0;
                int viewVelocity = Math.abs(prefetchRegistry.f۱۲۱۹۹a) + Math.abs(prefetchRegistry.f۱۲۲۰۰b);
                for (int j = 0; j < prefetchRegistry.f۱۲۲۰۲d * 2; j += 2) {
                    if (totalTaskIndex >= this.f۱۲۱۹۸f.size()) {
                        task = new Cc();
                        this.f۱۲۱۹۸f.add(task);
                    } else {
                        task = this.f۱۲۱۹۸f.get(totalTaskIndex);
                    }
                    int distanceToItem = prefetchRegistry.f۱۲۲۰۱c[j + 1];
                    task.f۱۲۲۰۳a = distanceToItem <= viewVelocity;
                    task.f۱۲۲۰۴b = viewVelocity;
                    task.f۱۲۲۰۵c = distanceToItem;
                    task.f۱۲۲۰۶d = view2;
                    task.f۱۲۲۰۷e = prefetchRegistry.f۱۲۲۰۱c[j];
                    totalTaskIndex++;
                }
            }
        }
        Collections.sort(this.f۱۲۱۹۸f, f۱۲۱۹۴h);
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۵۴۲۲a(RecyclerView view, int position) {
        int childCount = view.f۱۱۵۶۹g.m۱۵۱۲۸b();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.AbstractCd0 holder = RecyclerView.m۱۴۲۶۷k(view.f۱۱۵۶۹g.m۱۵۱۳۴d(i));
            if (holder.f۱۱۶۳۹e == position && !holder.m۱۴۳۹۸n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    private RecyclerView.AbstractCd0 m۱۵۴۱۸a(RecyclerView view, int position, long deadlineNs) {
        Throwable th;
        if (m۱۵۴۲۲a(view, position)) {
            return null;
        }
        RecyclerView.Cv recycler = view.f۱۱۵۶۳d;
        try {
            view.m۱۴۳۴۵q();
            RecyclerView.AbstractCd0 holder = recycler.m۱۴۶۷۲a(position, false, deadlineNs);
            if (holder != null) {
                try {
                    if (!holder.m۱۴۳۹۷m() || holder.m۱۴۳۹۸n()) {
                        recycler.m۱۴۶۷۹a(holder, false);
                    } else {
                        recycler.m۱۴۶۸۸b(holder.f۱۱۶۳۷c);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    view.m۱۴۲۹۱a(false);
                    throw th;
                }
            }
            view.m۱۴۲۹۱a(false);
            return holder;
        } catch (Throwable th3) {
            th = th3;
            view.m۱۴۲۹۱a(false);
            throw th;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۴۲۰a(RecyclerView innerView, long deadlineNs) {
        if (innerView != null) {
            if (innerView.f۱۱۵۴۱F && innerView.f۱۱۵۶۹g.m۱۵۱۲۸b() != 0) {
                innerView.m۱۴۳۴۸t();
            }
            Cb innerPrefetchRegistry = innerView.f۱۱۵۷۴i0;
            innerPrefetchRegistry.m۱۵۴۳۱a(innerView, true);
            if (innerPrefetchRegistry.f۱۲۲۰۲d != 0) {
                try {
                    p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۸d.Ca.m۱۰۴۹۷a("RV Nested Prefetch");
                    innerView.f۱۱۵۷۶j0.m۱۴۳۵۵a(innerView.f۱۱۵۸۳n);
                    for (int i = 0; i < innerPrefetchRegistry.f۱۲۲۰۲d * 2; i += 2) {
                        m۱۵۴۱۸a(innerView, innerPrefetchRegistry.f۱۲۲۰۱c[i], deadlineNs);
                    }
                } finally {
                    p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۸d.Ca.m۱۰۴۹۶a();
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۴۲۱a(Cc task, long deadlineNs) {
        RecyclerView.AbstractCd0 holder = m۱۵۴۱۸a(task.f۱۲۲۰۶d, task.f۱۲۲۰۷e, task.f۱۲۲۰۳a ? Long.MAX_VALUE : deadlineNs);
        if (holder != null && holder.f۱۱۶۳۸d != null && holder.m۱۴۳۹۷m() && !holder.m۱۴۳۹۸n()) {
            m۱۵۴۲۰a(holder.f۱۱۶۳۸d.get(), deadlineNs);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۵۴۲۳b(long deadlineNs) {
        for (int i = 0; i < this.f۱۲۱۹۸f.size(); i++) {
            Cc task = this.f۱۲۱۹۸f.get(i);
            if (task.f۱۲۲۰۶d != null) {
                m۱۵۴۲۱a(task, deadlineNs);
                task.m۱۵۴۳۴a();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۴۲۴a(long deadlineNs) {
        m۱۵۴۱۹a();
        m۱۵۴۲۳b(deadlineNs);
    }

    public void run() {
        try {
            p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۸d.Ca.m۱۰۴۹۷a("RV Prefetch");
            if (!this.f۱۲۱۹۵c.isEmpty()) {
                int size = this.f۱۲۱۹۵c.size();
                long latestFrameVsyncMs = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView view = this.f۱۲۱۹۵c.get(i);
                    if (view.getWindowVisibility() == 0) {
                        latestFrameVsyncMs = Math.max(view.getDrawingTime(), latestFrameVsyncMs);
                    }
                }
                if (latestFrameVsyncMs == 0) {
                    this.f۱۲۱۹۶d = 0;
                    p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۸d.Ca.m۱۰۴۹۶a();
                    return;
                }
                m۱۵۴۲۴a(TimeUnit.MILLISECONDS.toNanos(latestFrameVsyncMs) + this.f۱۲۱۹۷e);
                this.f۱۲۱۹۶d = 0;
                p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۸d.Ca.m۱۰۴۹۶a();
            }
        } finally {
            this.f۱۲۱۹۶d = 0;
            p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۸d.Ca.m۱۰۴۹۶a();
        }
    }
}
