package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.Action;
import com.squareup.picasso.a;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class t {
    static final Handler p = new a(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})
    static volatile t q = null;

    /* renamed from: a  reason: collision with root package name */
    private final d f۳۵۸۵a;

    /* renamed from: b  reason: collision with root package name */
    private final g f۳۵۸۶b;

    /* renamed from: c  reason: collision with root package name */
    private final c f۳۵۸۷c;

    /* renamed from: d  reason: collision with root package name */
    private final List<y> f۳۵۸۸d;

    /* renamed from: e  reason: collision with root package name */
    final Context f۳۵۸۹e;

    /* renamed from: f  reason: collision with root package name */
    final i f۳۵۹۰f;

    /* renamed from: g  reason: collision with root package name */
    final d f۳۵۹۱g;

    /* renamed from: h  reason: collision with root package name */
    final a0 f۳۵۹۲h;
    final Map<Object, a> i;
    final Map<ImageView, h> j;
    final ReferenceQueue<Object> k;
    final Bitmap.Config l;
    boolean m;
    volatile boolean n;
    boolean o;

    public interface d {
        void a(t tVar, Uri uri, Exception exc);
    }

    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    public interface g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f۳۶۱۳a = new a();

        w a(w wVar);

        static class a implements g {
            a() {
            }

            @Override // com.squareup.picasso.t.g
            public w a(w request) {
                return request;
            }
        }
    }

    static class a extends Handler {
        a(Looper x0) {
            super(x0);
        }

        public void handleMessage(Message msg) {
            int i = msg.what;
            if (i == 3) {
                a action = (a) msg.obj;
                if (action.e().n) {
                    d0.a("Main", "canceled", action.f۳۴۹۴b.d(), "target got garbage collected");
                }
                action.f۳۴۹۳a.a(action.i());
            } else if (i == 8) {
                List<BitmapHunter> batch = (List) msg.obj;
                int n = batch.size();
                for (int i2 = 0; i2 < n; i2++) {
                    c hunter = (c) batch.get(i2);
                    hunter.f۳۵۲۵d.a(hunter);
                }
            } else if (i == 13) {
                List<Action> batch2 = (List) msg.obj;
                int n2 = batch2.size();
                for (int i3 = 0; i3 < n2; i3++) {
                    a action2 = (a) batch2.get(i3);
                    action2.f۳۴۹۳a.b(action2);
                }
            } else {
                throw new AssertionError("Unknown handler message received: " + msg.what);
            }
        }
    }

    t(Context context, i dispatcher, d cache, d listener, g requestTransformer, List<y> list, a0 stats, Bitmap.Config defaultBitmapConfig, boolean indicatorsEnabled, boolean loggingEnabled) {
        this.f۳۵۸۹e = context;
        this.f۳۵۹۰f = dispatcher;
        this.f۳۵۹۱g = cache;
        this.f۳۵۸۵a = listener;
        this.f۳۵۸۶b = requestTransformer;
        this.l = defaultBitmapConfig;
        List<RequestHandler> allRequestHandlers = new ArrayList<>(7 + (list != null ? list.size() : 0));
        allRequestHandlers.add(new z(context));
        if (list != null) {
            allRequestHandlers.addAll(list);
        }
        allRequestHandlers.add(new f(context));
        allRequestHandlers.add(new o(context));
        allRequestHandlers.add(new g(context));
        allRequestHandlers.add(new b(context));
        allRequestHandlers.add(new k(context));
        allRequestHandlers.add(new r(dispatcher.f۳۵۴۷d, stats));
        this.f۳۵۸۸d = Collections.unmodifiableList(allRequestHandlers);
        this.f۳۵۹۲h = stats;
        this.i = new WeakHashMap();
        this.j = new WeakHashMap();
        this.m = indicatorsEnabled;
        this.n = loggingEnabled;
        this.k = new ReferenceQueue<>();
        this.f۳۵۸۷c = new c(this.k, p);
        this.f۳۵۸۷c.start();
    }

    public void a(ImageView view) {
        if (view != null) {
            a((Object) view);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    public x a(Uri uri) {
        return new x(this, uri, 0);
    }

    public x a(File file) {
        if (file == null) {
            return new x(this, null, 0);
        }
        return a(Uri.fromFile(file));
    }

    /* access modifiers changed from: package-private */
    public List<y> a() {
        return this.f۳۵۸۸d;
    }

    /* access modifiers changed from: package-private */
    public w a(w request) {
        w transformed = this.f۳۵۸۶b.a(request);
        if (transformed != null) {
            return transformed;
        }
        throw new IllegalStateException("Request transformer " + this.f۳۵۸۶b.getClass().getCanonicalName() + " returned null for " + request);
    }

    /* access modifiers changed from: package-private */
    public void a(ImageView view, h request) {
        if (this.j.containsKey(view)) {
            a((Object) view);
        }
        this.j.put(view, request);
    }

    /* access modifiers changed from: package-private */
    public void a(a action) {
        Object target = action.i();
        if (!(target == null || this.i.get(target) == action)) {
            a(target);
            this.i.put(target, action);
        }
        c(action);
    }

    /* access modifiers changed from: package-private */
    public void c(a action) {
        this.f۳۵۹۰f.b(action);
    }

    /* access modifiers changed from: package-private */
    public Bitmap a(String key) {
        Bitmap cached = this.f۳۵۹۱g.a(key);
        if (cached != null) {
            this.f۳۵۹۲h.b();
        } else {
            this.f۳۵۹۲h.c();
        }
        return cached;
    }

    /* access modifiers changed from: package-private */
    public void a(c hunter) {
        a single = hunter.b();
        List<Action> joined = hunter.c();
        boolean shouldDeliver = false;
        boolean hasMultiple = joined != null && !joined.isEmpty();
        if (single != null || hasMultiple) {
            shouldDeliver = true;
        }
        if (shouldDeliver) {
            Uri uri = hunter.d().f۳۶۲۶d;
            Exception exception = hunter.e();
            Bitmap result = hunter.k();
            e from = hunter.g();
            if (single != null) {
                a(result, from, single, exception);
            }
            if (hasMultiple) {
                int n2 = joined.size();
                for (int i2 = 0; i2 < n2; i2++) {
                    a(result, from, (a) joined.get(i2), exception);
                }
            }
            d dVar = this.f۳۵۸۵a;
            if (!(dVar == null || exception == null)) {
                dVar.a(this, uri, exception);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(a action) {
        Bitmap bitmap = null;
        if (p.a(action.f۳۴۹۷e)) {
            bitmap = a(action.b());
        }
        if (bitmap != null) {
            a(bitmap, e.MEMORY, action, null);
            if (this.n) {
                String d2 = action.f۳۴۹۴b.d();
                d0.a("Main", "completed", d2, "from " + e.MEMORY);
                return;
            }
            return;
        }
        a(action);
        if (this.n) {
            d0.a("Main", "resumed", action.f۳۴۹۴b.d());
        }
    }

    private void a(Bitmap result, e from, a action, Exception e2) {
        if (!action.j()) {
            if (!action.k()) {
                this.i.remove(action.i());
            }
            if (result == null) {
                action.a(e2);
                if (this.n) {
                    d0.a("Main", "errored", action.f۳۴۹۴b.d(), e2.getMessage());
                }
            } else if (from != null) {
                action.a(result, from);
                if (this.n) {
                    String d2 = action.f۳۴۹۴b.d();
                    d0.a("Main", "completed", d2, "from " + from);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Object target) {
        h deferredRequestCreator;
        d0.a();
        a action = this.i.remove(target);
        if (action != null) {
            action.a();
            this.f۳۵۹۰f.a(action);
        }
        if ((target instanceof ImageView) && (deferredRequestCreator = this.j.remove((ImageView) target)) != null) {
            deferredRequestCreator.a();
        }
    }

    private static class c extends Thread {

        /* renamed from: c  reason: collision with root package name */
        private final ReferenceQueue<Object> f۳۶۰۱c;

        /* renamed from: d  reason: collision with root package name */
        private final Handler f۳۶۰۲d;

        c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f۳۶۰۱c = referenceQueue;
            this.f۳۶۰۲d = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    Action.RequestWeakReference<?> remove = (a.C۰۱۱۱a) this.f۳۶۰۱c.remove(1000);
                    Message message = this.f۳۶۰۲d.obtainMessage();
                    if (remove != null) {
                        message.what = 3;
                        message.obj = remove.f۳۵۰۱a;
                        this.f۳۶۰۲d.sendMessage(message);
                    } else {
                        message.recycle();
                    }
                } catch (InterruptedException e2) {
                    return;
                } catch (Exception e3) {
                    this.f۳۶۰۲d.post(new a(this, e3));
                    return;
                }
            }
        }

        class a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Exception f۳۶۰۳c;

            a(c this$0, Exception exc) {
                this.f۳۶۰۳c = exc;
            }

            public void run() {
                throw new RuntimeException(this.f۳۶۰۳c);
            }
        }
    }

    public static t b() {
        if (q == null) {
            synchronized (t.class) {
                if (q == null) {
                    if (PicassoProvider.f۳۴۹۲c != null) {
                        q = new b(PicassoProvider.f۳۴۹۲c).a();
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return q;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f۳۵۹۳a;

        /* renamed from: b  reason: collision with root package name */
        private j f۳۵۹۴b;

        /* renamed from: c  reason: collision with root package name */
        private ExecutorService f۳۵۹۵c;

        /* renamed from: d  reason: collision with root package name */
        private d f۳۵۹۶d;

        /* renamed from: e  reason: collision with root package name */
        private d f۳۵۹۷e;

        /* renamed from: f  reason: collision with root package name */
        private g f۳۵۹۸f;

        /* renamed from: g  reason: collision with root package name */
        private List<y> f۳۵۹۹g;

        /* renamed from: h  reason: collision with root package name */
        private Bitmap.Config f۳۶۰۰h;
        private boolean i;
        private boolean j;

        public b(Context context) {
            if (context != null) {
                this.f۳۵۹۳a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public t a() {
            Context context = this.f۳۵۹۳a;
            if (this.f۳۵۹۴b == null) {
                this.f۳۵۹۴b = new s(context);
            }
            if (this.f۳۵۹۶d == null) {
                this.f۳۵۹۶d = new m(context);
            }
            if (this.f۳۵۹۵c == null) {
                this.f۳۵۹۵c = new v();
            }
            if (this.f۳۵۹۸f == null) {
                this.f۳۵۹۸f = g.f۳۶۱۳a;
            }
            a0 stats = new a0(this.f۳۵۹۶d);
            return new t(context, new i(context, this.f۳۵۹۵c, t.p, this.f۳۵۹۴b, this.f۳۵۹۶d, stats), this.f۳۵۹۶d, this.f۳۵۹۷e, this.f۳۵۹۸f, this.f۳۵۹۹g, stats, this.f۳۶۰۰h, this.i, this.j);
        }
    }

    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: c  reason: collision with root package name */
        final int f۳۶۰۸c;

        private e(int debugColor) {
            this.f۳۶۰۸c = debugColor;
        }
    }
}
