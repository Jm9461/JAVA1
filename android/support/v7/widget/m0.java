package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class m0 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    static final ThreadLocal<m0> f۲۱۵۵g = new ThreadLocal<>();

    /* renamed from: h  reason: collision with root package name */
    static Comparator<c> f۲۱۵۶h = new a();

    /* renamed from: c  reason: collision with root package name */
    ArrayList<RecyclerView> f۲۱۵۷c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    long f۲۱۵۸d;

    /* renamed from: e  reason: collision with root package name */
    long f۲۱۵۹e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<c> f۲۱۶۰f = new ArrayList<>();

    m0() {
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f۲۱۶۵a;

        /* renamed from: b  reason: collision with root package name */
        public int f۲۱۶۶b;

        /* renamed from: c  reason: collision with root package name */
        public int f۲۱۶۷c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f۲۱۶۸d;

        /* renamed from: e  reason: collision with root package name */
        public int f۲۱۶۹e;

        c() {
        }

        public void a() {
            this.f۲۱۶۵a = false;
            this.f۲۱۶۶b = 0;
            this.f۲۱۶۷c = 0;
            this.f۲۱۶۸d = null;
            this.f۲۱۶۹e = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements RecyclerView.o.c {

        /* renamed from: a  reason: collision with root package name */
        int f۲۱۶۱a;

        /* renamed from: b  reason: collision with root package name */
        int f۲۱۶۲b;

        /* renamed from: c  reason: collision with root package name */
        int[] f۲۱۶۳c;

        /* renamed from: d  reason: collision with root package name */
        int f۲۱۶۴d;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void b(int dx, int dy) {
            this.f۲۱۶۱a = dx;
            this.f۲۱۶۲b = dy;
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView view, boolean nested) {
            this.f۲۱۶۴d = 0;
            int[] iArr = this.f۲۱۶۳c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o layout = view.o;
            if (view.n != null && layout != null && layout.v()) {
                if (nested) {
                    if (!view.f۱۸۲۱f.c()) {
                        layout.a(view.n.a(), this);
                    }
                } else if (!view.j()) {
                    layout.a(this.f۲۱۶۱a, this.f۲۱۶۲b, view.j0, this);
                }
                int i = this.f۲۱۶۴d;
                if (i > layout.m) {
                    layout.m = i;
                    layout.n = nested;
                    view.f۱۸۱۹d.j();
                }
            }
        }

        @Override // android.support.v7.widget.RecyclerView.o.c
        public void a(int layoutPosition, int pixelDistance) {
            if (layoutPosition < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (pixelDistance >= 0) {
                int storagePosition = this.f۲۱۶۴d * 2;
                int[] iArr = this.f۲۱۶۳c;
                if (iArr == null) {
                    this.f۲۱۶۳c = new int[4];
                    Arrays.fill(this.f۲۱۶۳c, -1);
                } else if (storagePosition >= iArr.length) {
                    int[] oldArray = this.f۲۱۶۳c;
                    this.f۲۱۶۳c = new int[(storagePosition * 2)];
                    System.arraycopy(oldArray, 0, this.f۲۱۶۳c, 0, oldArray.length);
                }
                int[] oldArray2 = this.f۲۱۶۳c;
                oldArray2[storagePosition] = layoutPosition;
                oldArray2[storagePosition + 1] = pixelDistance;
                this.f۲۱۶۴d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(int position) {
            if (this.f۲۱۶۳c == null) {
                return false;
            }
            int count = this.f۲۱۶۴d * 2;
            for (int i = 0; i < count; i += 2) {
                if (this.f۲۱۶۳c[i] == position) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.f۲۱۶۳c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f۲۱۶۴d = 0;
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f۲۱۵۷c.add(recyclerView);
    }

    public void b(RecyclerView recyclerView) {
        this.f۲۱۵۷c.remove(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView recyclerView, int prefetchDx, int prefetchDy) {
        if (recyclerView.isAttachedToWindow() && this.f۲۱۵۸d == 0) {
            this.f۲۱۵۸d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.i0.b(prefetchDx, prefetchDy);
    }

    static class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c lhs, c rhs) {
            if ((lhs.f۲۱۶۸d == null) == (rhs.f۲۱۶۸d == null)) {
                boolean z = lhs.f۲۱۶۵a;
                if (z == rhs.f۲۱۶۵a) {
                    int deltaViewVelocity = rhs.f۲۱۶۶b - lhs.f۲۱۶۶b;
                    if (deltaViewVelocity != 0) {
                        return deltaViewVelocity;
                    }
                    int deltaDistanceToItem = lhs.f۲۱۶۷c - rhs.f۲۱۶۷c;
                    if (deltaDistanceToItem != 0) {
                        return deltaDistanceToItem;
                    }
                    return 0;
                } else if (z) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (lhs.f۲۱۶۸d == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    private void a() {
        c task;
        int viewCount = this.f۲۱۵۷c.size();
        int totalTaskCount = 0;
        for (int i = 0; i < viewCount; i++) {
            RecyclerView view = this.f۲۱۵۷c.get(i);
            if (view.getWindowVisibility() == 0) {
                view.i0.a(view, false);
                totalTaskCount += view.i0.f۲۱۶۴d;
            }
        }
        this.f۲۱۶۰f.ensureCapacity(totalTaskCount);
        int totalTaskIndex = 0;
        for (int i2 = 0; i2 < viewCount; i2++) {
            RecyclerView view2 = this.f۲۱۵۷c.get(i2);
            if (view2.getWindowVisibility() == 0) {
                b prefetchRegistry = view2.i0;
                int viewVelocity = Math.abs(prefetchRegistry.f۲۱۶۱a) + Math.abs(prefetchRegistry.f۲۱۶۲b);
                for (int j = 0; j < prefetchRegistry.f۲۱۶۴d * 2; j += 2) {
                    if (totalTaskIndex >= this.f۲۱۶۰f.size()) {
                        task = new c();
                        this.f۲۱۶۰f.add(task);
                    } else {
                        task = this.f۲۱۶۰f.get(totalTaskIndex);
                    }
                    int distanceToItem = prefetchRegistry.f۲۱۶۳c[j + 1];
                    task.f۲۱۶۵a = distanceToItem <= viewVelocity;
                    task.f۲۱۶۶b = viewVelocity;
                    task.f۲۱۶۷c = distanceToItem;
                    task.f۲۱۶۸d = view2;
                    task.f۲۱۶۹e = prefetchRegistry.f۲۱۶۳c[j];
                    totalTaskIndex++;
                }
            }
        }
        Collections.sort(this.f۲۱۶۰f, f۲۱۵۶h);
    }

    static boolean a(RecyclerView view, int position) {
        int childCount = view.f۱۸۲۲g.b();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.d0 holder = RecyclerView.k(view.f۱۸۲۲g.d(i));
            if (holder.f۱۸۴۳e == position && !holder.n()) {
                return true;
            }
        }
        return false;
    }

    private RecyclerView.d0 a(RecyclerView view, int position, long deadlineNs) {
        Throwable th;
        if (a(view, position)) {
            return null;
        }
        RecyclerView.v recycler = view.f۱۸۱۹d;
        try {
            view.q();
            RecyclerView.d0 holder = recycler.a(position, false, deadlineNs);
            if (holder != null) {
                try {
                    if (!holder.m() || holder.n()) {
                        recycler.a(holder, false);
                    } else {
                        recycler.b(holder.f۱۸۴۱c);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    view.a(false);
                    throw th;
                }
            }
            view.a(false);
            return holder;
        } catch (Throwable th3) {
            th = th3;
            view.a(false);
            throw th;
        }
    }

    private void a(RecyclerView innerView, long deadlineNs) {
        if (innerView != null) {
            if (innerView.F && innerView.f۱۸۲۲g.b() != 0) {
                innerView.t();
            }
            b innerPrefetchRegistry = innerView.i0;
            innerPrefetchRegistry.a(innerView, true);
            if (innerPrefetchRegistry.f۲۱۶۴d != 0) {
                try {
                    a.b.g.d.a.a("RV Nested Prefetch");
                    innerView.j0.a(innerView.n);
                    for (int i = 0; i < innerPrefetchRegistry.f۲۱۶۴d * 2; i += 2) {
                        a(innerView, innerPrefetchRegistry.f۲۱۶۳c[i], deadlineNs);
                    }
                } finally {
                    a.b.g.d.a.a();
                }
            }
        }
    }

    private void a(c task, long deadlineNs) {
        RecyclerView.d0 holder = a(task.f۲۱۶۸d, task.f۲۱۶۹e, task.f۲۱۶۵a ? Long.MAX_VALUE : deadlineNs);
        if (holder != null && holder.f۱۸۴۲d != null && holder.m() && !holder.n()) {
            a(holder.f۱۸۴۲d.get(), deadlineNs);
        }
    }

    private void b(long deadlineNs) {
        for (int i = 0; i < this.f۲۱۶۰f.size(); i++) {
            c task = this.f۲۱۶۰f.get(i);
            if (task.f۲۱۶۸d != null) {
                a(task, deadlineNs);
                task.a();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long deadlineNs) {
        a();
        b(deadlineNs);
    }

    public void run() {
        try {
            a.b.g.d.a.a("RV Prefetch");
            if (!this.f۲۱۵۷c.isEmpty()) {
                int size = this.f۲۱۵۷c.size();
                long latestFrameVsyncMs = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView view = this.f۲۱۵۷c.get(i);
                    if (view.getWindowVisibility() == 0) {
                        latestFrameVsyncMs = Math.max(view.getDrawingTime(), latestFrameVsyncMs);
                    }
                }
                if (latestFrameVsyncMs == 0) {
                    this.f۲۱۵۸d = 0;
                    a.b.g.d.a.a();
                    return;
                }
                a(TimeUnit.MILLISECONDS.toNanos(latestFrameVsyncMs) + this.f۲۱۵۹e);
                this.f۲۱۵۸d = 0;
                a.b.g.d.a.a();
            }
        } finally {
            this.f۲۱۵۸d = 0;
            a.b.g.d.a.a();
        }
    }
}
