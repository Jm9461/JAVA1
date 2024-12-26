package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۷d.Ca;

/* renamed from: android.support.v7.widget.m0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class RunnableCm0 implements Runnable {

    /* renamed from: g, reason: contains not printable characters */
    static final ThreadLocal<RunnableCm0> f۱۲۱۹۳g = new ThreadLocal<>();

    /* renamed from: h, reason: contains not printable characters */
    static Comparator<c> f۱۲۱۹۴h = new a();

    /* renamed from: d, reason: contains not printable characters */
    long f۱۲۱۹۶d;

    /* renamed from: e, reason: contains not printable characters */
    long f۱۲۱۹۷e;

    /* renamed from: c, reason: contains not printable characters */
    ArrayList<RecyclerView> f۱۲۱۹۵c = new ArrayList<>();

    /* renamed from: f, reason: contains not printable characters */
    private ArrayList<c> f۱۲۱۹۸f = new ArrayList<>();

    RunnableCm0() {
    }

    /* renamed from: android.support.v7.widget.m0$c */
    static class c {

        /* renamed from: a, reason: contains not printable characters */
        public boolean f۱۲۲۰۳a;

        /* renamed from: b, reason: contains not printable characters */
        public int f۱۲۲۰۴b;

        /* renamed from: c, reason: contains not printable characters */
        public int f۱۲۲۰۵c;

        /* renamed from: d, reason: contains not printable characters */
        public RecyclerView f۱۲۲۰۶d;

        /* renamed from: e, reason: contains not printable characters */
        public int f۱۲۲۰۷e;

        c() {
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۱۳۳۶۴a() {
            this.f۱۲۲۰۳a = false;
            this.f۱۲۲۰۴b = 0;
            this.f۱۲۲۰۵c = 0;
            this.f۱۲۲۰۶d = null;
            this.f۱۲۲۰۷e = 0;
        }
    }

    /* renamed from: android.support.v7.widget.m0$b */
    static class b implements RecyclerView.AbstractCo.c {

        /* renamed from: a, reason: contains not printable characters */
        int f۱۲۱۹۹a;

        /* renamed from: b, reason: contains not printable characters */
        int f۱۲۲۰۰b;

        /* renamed from: c, reason: contains not printable characters */
        int[] f۱۲۲۰۱c;

        /* renamed from: d, reason: contains not printable characters */
        int f۱۲۲۰۲d;

        b() {
        }

        /* renamed from: b, reason: contains not printable characters */
        void m۱۳۳۶۳b(int dx, int dy) {
            this.f۱۲۱۹۹a = dx;
            this.f۱۲۲۰۰b = dy;
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۳۳۶۱a(RecyclerView view, boolean nested) {
            this.f۱۲۲۰۲d = 0;
            int[] iArr = this.f۱۲۲۰۱c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractCo layout = view.f۱۱۵۸۵o;
            if (view.f۱۱۵۸۳n != null && layout != null && layout.m۱۲۵۵۶v()) {
                if (nested) {
                    if (!view.f۱۱۵۶۷f.m۱۳۰۳۵c()) {
                        layout.mo۱۲۴۴۵a(view.f۱۱۵۸۳n.mo۱۷۶۵۶a(), this);
                    }
                } else if (!view.m۱۲۲۶۷j()) {
                    layout.mo۱۲۷۵۳a(this.f۱۲۱۹۹a, this.f۱۲۲۰۰b, view.f۱۱۵۷۶j0, this);
                }
                int i = this.f۱۲۲۰۲d;
                if (i > layout.f۱۱۶۸۰m) {
                    layout.f۱۱۶۸۰m = i;
                    layout.f۱۱۶۸۱n = nested;
                    view.f۱۱۵۶۳d.m۱۲۶۳۴j();
                }
            }
        }

        @Override // android.support.v7.widget.RecyclerView.AbstractCo.c
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۳۶۰a(int layoutPosition, int pixelDistance) {
            if (layoutPosition < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (pixelDistance < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int storagePosition = this.f۱۲۲۰۲d * 2;
            int[] iArr = this.f۱۲۲۰۱c;
            if (iArr == null) {
                this.f۱۲۲۰۱c = new int[4];
                Arrays.fill(this.f۱۲۲۰۱c, -1);
            } else if (storagePosition >= iArr.length) {
                int[] oldArray = this.f۱۲۲۰۱c;
                this.f۱۲۲۰۱c = new int[storagePosition * 2];
                System.arraycopy(oldArray, 0, this.f۱۲۲۰۱c, 0, oldArray.length);
            }
            int[] oldArray2 = this.f۱۲۲۰۱c;
            oldArray2[storagePosition] = layoutPosition;
            oldArray2[storagePosition + 1] = pixelDistance;
            this.f۱۲۲۰۲d++;
        }

        /* renamed from: a, reason: contains not printable characters */
        boolean m۱۳۳۶۲a(int position) {
            if (this.f۱۲۲۰۱c != null) {
                int count = this.f۱۲۲۰۲d * 2;
                for (int i = 0; i < count; i += 2) {
                    if (this.f۱۲۲۰۱c[i] == position) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۳۳۵۹a() {
            int[] iArr = this.f۱۲۲۰۱c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f۱۲۲۰۲d = 0;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۳۵۵a(RecyclerView recyclerView) {
        this.f۱۲۱۹۵c.add(recyclerView);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۳۳۵۷b(RecyclerView recyclerView) {
        this.f۱۲۱۹۵c.remove(recyclerView);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۳۵۶a(RecyclerView recyclerView, int prefetchDx, int prefetchDy) {
        if (recyclerView.isAttachedToWindow() && this.f۱۲۱۹۶d == 0) {
            this.f۱۲۱۹۶d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f۱۱۵۷۴i0.m۱۳۳۶۳b(prefetchDx, prefetchDy);
    }

    /* renamed from: android.support.v7.widget.m0$a */
    static class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(c lhs, c rhs) {
            if ((lhs.f۱۲۲۰۶d == null) != (rhs.f۱۲۲۰۶d == null)) {
                return lhs.f۱۲۲۰۶d == null ? 1 : -1;
            }
            boolean z = lhs.f۱۲۲۰۳a;
            if (z != rhs.f۱۲۲۰۳a) {
                return z ? -1 : 1;
            }
            int deltaViewVelocity = rhs.f۱۲۲۰۴b - lhs.f۱۲۲۰۴b;
            if (deltaViewVelocity != 0) {
                return deltaViewVelocity;
            }
            int deltaDistanceToItem = lhs.f۱۲۲۰۵c - rhs.f۱۲۲۰۵c;
            if (deltaDistanceToItem != 0) {
                return deltaDistanceToItem;
            }
            return 0;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۳۴۹a() {
        c task;
        int viewCount = this.f۱۲۱۹۵c.size();
        int totalTaskCount = 0;
        for (int i = 0; i < viewCount; i++) {
            RecyclerView view = this.f۱۲۱۹۵c.get(i);
            if (view.getWindowVisibility() == 0) {
                view.f۱۱۵۷۴i0.m۱۳۳۶۱a(view, false);
                totalTaskCount += view.f۱۱۵۷۴i0.f۱۲۲۰۲d;
            }
        }
        this.f۱۲۱۹۸f.ensureCapacity(totalTaskCount);
        int totalTaskIndex = 0;
        for (int i2 = 0; i2 < viewCount; i2++) {
            RecyclerView view2 = this.f۱۲۱۹۵c.get(i2);
            if (view2.getWindowVisibility() == 0) {
                b prefetchRegistry = view2.f۱۱۵۷۴i0;
                int viewVelocity = Math.abs(prefetchRegistry.f۱۲۱۹۹a) + Math.abs(prefetchRegistry.f۱۲۲۰۰b);
                for (int j = 0; j < prefetchRegistry.f۱۲۲۰۲d * 2; j += 2) {
                    if (totalTaskIndex >= this.f۱۲۱۹۸f.size()) {
                        task = new c();
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

    /* renamed from: a, reason: contains not printable characters */
    static boolean m۱۳۳۵۲a(RecyclerView view, int position) {
        int childCount = view.f۱۱۵۶۹g.m۱۳۰۵۸b();
        for (int i = 0; i < childCount; i++) {
            View attachedView = view.f۱۱۵۶۹g.m۱۳۰۶۴d(i);
            RecyclerView.AbstractCd0 holder = RecyclerView.m۱۲۱۹۷k(attachedView);
            if (holder.f۱۱۶۳۹e == position && !holder.m۱۲۳۲۸n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    private RecyclerView.AbstractCd0 m۱۳۳۴۸a(RecyclerView view, int position, long deadlineNs) {
        if (m۱۳۳۵۲a(view, position)) {
            return null;
        }
        RecyclerView.Cv recycler = view.f۱۱۵۶۳d;
        try {
            view.m۱۲۲۷۵q();
            RecyclerView.AbstractCd0 holder = recycler.m۱۲۶۰۲a(position, false, deadlineNs);
            if (holder != null) {
                try {
                    if (holder.m۱۲۳۲۷m() && !holder.m۱۲۳۲۸n()) {
                        recycler.m۱۲۶۱۸b(holder.f۱۱۶۳۷c);
                    } else {
                        recycler.m۱۲۶۰۹a(holder, false);
                    }
                } catch (Throwable th) {
                    th = th;
                    view.m۱۲۲۲۱a(false);
                    throw th;
                }
            }
            view.m۱۲۲۲۱a(false);
            return holder;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۳۵۰a(RecyclerView innerView, long deadlineNs) {
        if (innerView == null) {
            return;
        }
        if (innerView.f۱۱۵۴۱F && innerView.f۱۱۵۶۹g.m۱۳۰۵۸b() != 0) {
            innerView.m۱۲۲۷۸t();
        }
        b innerPrefetchRegistry = innerView.f۱۱۵۷۴i0;
        innerPrefetchRegistry.m۱۳۳۶۱a(innerView, true);
        if (innerPrefetchRegistry.f۱۲۲۰۲d != 0) {
            try {
                Ca.m۸۴۲۸a("RV Nested Prefetch");
                innerView.f۱۱۵۷۶j0.m۱۲۲۸۵a(innerView.f۱۱۵۸۳n);
                for (int i = 0; i < innerPrefetchRegistry.f۱۲۲۰۲d * 2; i += 2) {
                    int innerPosition = innerPrefetchRegistry.f۱۲۲۰۱c[i];
                    m۱۳۳۴۸a(innerView, innerPosition, deadlineNs);
                }
            } finally {
                Ca.m۸۴۲۷a();
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۳۵۱a(c task, long deadlineNs) {
        long taskDeadlineNs = task.f۱۲۲۰۳a ? Long.MAX_VALUE : deadlineNs;
        RecyclerView.AbstractCd0 holder = m۱۳۳۴۸a(task.f۱۲۲۰۶d, task.f۱۲۲۰۷e, taskDeadlineNs);
        if (holder != null && holder.f۱۱۶۳۸d != null && holder.m۱۲۳۲۷m() && !holder.m۱۲۳۲۸n()) {
            m۱۳۳۵۰a(holder.f۱۱۶۳۸d.get(), deadlineNs);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۳۳۵۳b(long deadlineNs) {
        for (int i = 0; i < this.f۱۲۱۹۸f.size(); i++) {
            c task = this.f۱۲۱۹۸f.get(i);
            if (task.f۱۲۲۰۶d != null) {
                m۱۳۳۵۱a(task, deadlineNs);
                task.m۱۳۳۶۴a();
            } else {
                return;
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۳۵۴a(long deadlineNs) {
        m۱۳۳۴۹a();
        m۱۳۳۵۳b(deadlineNs);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Ca.m۸۴۲۸a("RV Prefetch");
            if (this.f۱۲۱۹۵c.isEmpty()) {
                return;
            }
            int size = this.f۱۲۱۹۵c.size();
            long latestFrameVsyncMs = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView view = this.f۱۲۱۹۵c.get(i);
                if (view.getWindowVisibility() == 0) {
                    latestFrameVsyncMs = Math.max(view.getDrawingTime(), latestFrameVsyncMs);
                }
            }
            if (latestFrameVsyncMs == 0) {
                return;
            }
            long nextFrameNs = TimeUnit.MILLISECONDS.toNanos(latestFrameVsyncMs) + this.f۱۲۱۹۷e;
            m۱۳۳۵۴a(nextFrameNs);
        } finally {
            this.f۱۲۱۹۶d = 0L;
            Ca.m۸۴۲۷a();
        }
    }
}
