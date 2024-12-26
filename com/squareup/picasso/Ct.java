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
import com.squareup.picasso.AbstractCa;
import com.squareup.picasso.Action;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.squareup.picasso.t  reason: invalid class name */
public class Ct {

    /* renamed from: p  reason: contains not printable characters */
    static final Handler f۱۵۴۸۲p = new HandlerCa(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: q  reason: contains not printable characters */
    static volatile Ct f۱۵۴۸۳q = null;

    /* renamed from: a  reason: contains not printable characters */
    private final AbstractCd f۱۵۴۸۴a;

    /* renamed from: b  reason: contains not printable characters */
    private final AbstractCg f۱۵۴۸۵b;

    /* renamed from: c  reason: contains not printable characters */
    private final Cc f۱۵۴۸۶c;

    /* renamed from: d  reason: contains not printable characters */
    private final List<AbstractCy> f۱۵۴۸۷d;

    /* renamed from: e  reason: contains not printable characters */
    final Context f۱۵۴۸۸e;

    /* renamed from: f  reason: contains not printable characters */
    final Ci f۱۵۴۸۹f;

    /* renamed from: g  reason: contains not printable characters */
    final AbstractCd f۱۵۴۹۰g;

    /* renamed from: h  reason: contains not printable characters */
    final Ca0 f۱۵۴۹۱h;

    /* renamed from: i  reason: contains not printable characters */
    final Map<Object, AbstractCa> f۱۵۴۹۲i;

    /* renamed from: j  reason: contains not printable characters */
    final Map<ImageView, ViewTreeObserver$OnPreDrawListenerCh> f۱۵۴۹۳j;

    /* renamed from: k  reason: contains not printable characters */
    final ReferenceQueue<Object> f۱۵۴۹۴k;

    /* renamed from: l  reason: contains not printable characters */
    final Bitmap.Config f۱۵۴۹۵l;

    /* renamed from: m  reason: contains not printable characters */
    boolean f۱۵۴۹۶m;

    /* renamed from: n  reason: contains not printable characters */
    volatile boolean f۱۵۴۹۷n;

    /* renamed from: o  reason: contains not printable characters */
    boolean f۱۵۴۹۸o;

    /* renamed from: com.squareup.picasso.t$d  reason: invalid class name */
    public interface AbstractCd {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۴۰۹a(Ct tVar, Uri uri, Exception exc);
    }

    /* renamed from: com.squareup.picasso.t$f  reason: invalid class name */
    public enum EnumCf {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: com.squareup.picasso.t$g  reason: invalid class name */
    public interface AbstractCg {

        /* renamed from: a  reason: contains not printable characters */
        public static final AbstractCg f۱۵۵۲۱a = new Ca();

        /* renamed from: a  reason: contains not printable characters */
        Cw m۱۸۴۱۰a(Cw wVar);

        /* renamed from: com.squareup.picasso.t$g$a  reason: invalid class name */
        static class Ca implements AbstractCg {
            Ca() {
            }

            @Override // com.squareup.picasso.Ct.AbstractCg
            /* renamed from: a  reason: contains not printable characters */
            public Cw m۱۸۴۱۱a(Cw request) {
                return request;
            }
        }
    }

    /* renamed from: com.squareup.picasso.t$a  reason: invalid class name */
    static class HandlerCa extends Handler {
        HandlerCa(Looper x0) {
            super(x0);
        }

        public void handleMessage(Message msg) {
            int i = msg.what;
            if (i == 3) {
                AbstractCa action = (AbstractCa) msg.obj;
                if (action.m۱۸۲۴۹e().f۱۵۴۹۷n) {
                    Cd0.m۱۸۳۲۳a("Main", "canceled", action.f۱۵۳۴۷b.m۱۸۴۲۲d(), "target got garbage collected");
                }
                action.f۱۵۳۴۶a.m۱۸۴۰۵a(action.m۱۸۲۵۳i());
            } else if (i == 8) {
                List<BitmapHunter> batch = (List) msg.obj;
                int n = batch.size();
                for (int i2 = 0; i2 < n; i2++) {
                    RunnableCc hunter = (RunnableCc) batch.get(i2);
                    hunter.f۱۵۳۹۸d.m۱۸۴۰۴a(hunter);
                }
            } else if (i == 13) {
                List<Action> batch2 = (List) msg.obj;
                int n2 = batch2.size();
                for (int i3 = 0; i3 < n2; i3++) {
                    AbstractCa action2 = (AbstractCa) batch2.get(i3);
                    action2.f۱۵۳۴۶a.m۱۸۴۰۶b(action2);
                }
            } else {
                throw new AssertionError("Unknown handler message received: " + msg.what);
            }
        }
    }

    Ct(Context context, Ci dispatcher, AbstractCd cache, AbstractCd listener, AbstractCg requestTransformer, List<AbstractCy> list, Ca0 stats, Bitmap.Config defaultBitmapConfig, boolean indicatorsEnabled, boolean loggingEnabled) {
        this.f۱۵۴۸۸e = context;
        this.f۱۵۴۸۹f = dispatcher;
        this.f۱۵۴۹۰g = cache;
        this.f۱۵۴۸۴a = listener;
        this.f۱۵۴۸۵b = requestTransformer;
        this.f۱۵۴۹۵l = defaultBitmapConfig;
        List<RequestHandler> allRequestHandlers = new ArrayList<>(7 + (list != null ? list.size() : 0));
        allRequestHandlers.add(new Cz(context));
        if (list != null) {
            allRequestHandlers.addAll(list);
        }
        allRequestHandlers.add(new Cf(context));
        allRequestHandlers.add(new Co(context));
        allRequestHandlers.add(new Cg(context));
        allRequestHandlers.add(new Cb(context));
        allRequestHandlers.add(new Ck(context));
        allRequestHandlers.add(new Cr(dispatcher.f۱۵۴۳۳d, stats));
        this.f۱۵۴۸۷d = Collections.unmodifiableList(allRequestHandlers);
        this.f۱۵۴۹۱h = stats;
        this.f۱۵۴۹۲i = new WeakHashMap();
        this.f۱۵۴۹۳j = new WeakHashMap();
        this.f۱۵۴۹۶m = indicatorsEnabled;
        this.f۱۵۴۹۷n = loggingEnabled;
        this.f۱۵۴۹۴k = new ReferenceQueue<>();
        this.f۱۵۴۸۶c = new Cc(this.f۱۵۴۹۴k, f۱۵۴۸۲p);
        this.f۱۵۴۸۶c.start();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۰۱a(ImageView view) {
        if (view != null) {
            m۱۸۴۰۵a((Object) view);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cx m۱۸۳۹۸a(Uri uri) {
        return new Cx(this, uri, 0);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cx m۱۸۳۹۹a(File file) {
        if (file == null) {
            return new Cx(this, null, 0);
        }
        return m۱۸۳۹۸a(Uri.fromFile(file));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public List<AbstractCy> m۱۸۴۰۰a() {
        return this.f۱۵۴۸۷d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cw m۱۸۳۹۷a(Cw request) {
        Cw transformed = this.f۱۵۴۸۵b.m۱۸۴۱۰a(request);
        if (transformed != null) {
            return transformed;
        }
        throw new IllegalStateException("Request transformer " + this.f۱۵۴۸۵b.getClass().getCanonicalName() + " returned null for " + request);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۰۲a(ImageView view, ViewTreeObserver$OnPreDrawListenerCh request) {
        if (this.f۱۵۴۹۳j.containsKey(view)) {
            m۱۸۴۰۵a((Object) view);
        }
        this.f۱۵۴۹۳j.put(view, request);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۰۳a(AbstractCa action) {
        Object target = action.m۱۸۲۵۳i();
        if (!(target == null || this.f۱۵۴۹۲i.get(target) == action)) {
            m۱۸۴۰۵a(target);
            this.f۱۵۴۹۲i.put(target, action);
        }
        m۱۸۴۰۷c(action);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۸۴۰۷c(AbstractCa action) {
        this.f۱۵۴۸۹f.m۱۸۳۵۲b(action);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Bitmap m۱۸۳۹۶a(String key) {
        Bitmap cached = this.f۱۵۴۹۰g.m۱۸۳۰۴a(key);
        if (cached != null) {
            this.f۱۵۴۹۱h.m۱۸۲۶۲b();
        } else {
            this.f۱۵۴۹۱h.m۱۸۲۶۵c();
        }
        return cached;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۰۴a(RunnableCc hunter) {
        AbstractCa single = hunter.m۱۸۲۸۵b();
        List<Action> joined = hunter.m۱۸۲۸۷c();
        boolean shouldDeliver = false;
        boolean hasMultiple = joined != null && !joined.isEmpty();
        if (single != null || hasMultiple) {
            shouldDeliver = true;
        }
        if (shouldDeliver) {
            Uri uri = hunter.m۱۸۲۸۸d().f۱۵۵۳۵d;
            Exception exception = hunter.m۱۸۲۸۹e();
            Bitmap result = hunter.m۱۸۲۹۵k();
            EnumCe from = hunter.m۱۸۲۹۱g();
            if (single != null) {
                m۱۸۳۹۴a(result, from, single, exception);
            }
            if (hasMultiple) {
                int n = joined.size();
                for (int i = 0; i < n; i++) {
                    m۱۸۳۹۴a(result, from, (AbstractCa) joined.get(i), exception);
                }
            }
            AbstractCd dVar = this.f۱۵۴۸۴a;
            if (!(dVar == null || exception == null)) {
                dVar.m۱۸۴۰۹a(this, uri, exception);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۴۰۶b(AbstractCa action) {
        Bitmap bitmap = null;
        if (EnumCp.m۱۸۳۸۲a(action.f۱۵۳۵۰e)) {
            bitmap = m۱۸۳۹۶a(action.m۱۸۲۴۶b());
        }
        if (bitmap != null) {
            m۱۸۳۹۴a(bitmap, EnumCe.MEMORY, action, null);
            if (this.f۱۵۴۹۷n) {
                String d = action.f۱۵۳۴۷b.m۱۸۴۲۲d();
                Cd0.m۱۸۳۲۳a("Main", "completed", d, "from " + EnumCe.MEMORY);
                return;
            }
            return;
        }
        m۱۸۴۰۳a(action);
        if (this.f۱۵۴۹۷n) {
            Cd0.m۱۸۳۲۲a("Main", "resumed", action.f۱۵۳۴۷b.m۱۸۴۲۲d());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۳۹۴a(Bitmap result, EnumCe from, AbstractCa action, Exception e) {
        if (!action.m۱۸۲۵۴j()) {
            if (!action.m۱۸۲۵۵k()) {
                this.f۱۵۴۹۲i.remove(action.m۱۸۲۵۳i());
            }
            if (result == null) {
                action.m۱۸۲۴۵a(e);
                if (this.f۱۵۴۹۷n) {
                    Cd0.m۱۸۳۲۳a("Main", "errored", action.f۱۵۳۴۷b.m۱۸۴۲۲d(), e.getMessage());
                }
            } else if (from != null) {
                action.m۱۸۲۴۴a(result, from);
                if (this.f۱۵۴۹۷n) {
                    String d = action.f۱۵۳۴۷b.m۱۸۴۲۲d();
                    Cd0.m۱۸۳۲۳a("Main", "completed", d, "from " + from);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۰۵a(Object target) {
        ViewTreeObserver$OnPreDrawListenerCh deferredRequestCreator;
        Cd0.m۱۸۳۲۰a();
        AbstractCa action = this.f۱۵۴۹۲i.remove(target);
        if (action != null) {
            action.m۱۸۲۴۳a();
            this.f۱۵۴۸۹f.m۱۸۳۴۵a(action);
        }
        if ((target instanceof ImageView) && (deferredRequestCreator = this.f۱۵۴۹۳j.remove((ImageView) target)) != null) {
            deferredRequestCreator.m۱۸۳۳۷a();
        }
    }

    /* renamed from: com.squareup.picasso.t$c  reason: invalid class name */
    private static class Cc extends Thread {

        /* renamed from: c  reason: contains not printable characters */
        private final ReferenceQueue<Object> f۱۵۵۰۹c;

        /* renamed from: d  reason: contains not printable characters */
        private final Handler f۱۵۵۱۰d;

        Cc(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f۱۵۵۰۹c = referenceQueue;
            this.f۱۵۵۱۰d = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    Action.RequestWeakReference<?> remove = (AbstractCa.Ca) this.f۱۵۵۰۹c.remove(1000);
                    Message message = this.f۱۵۵۱۰d.obtainMessage();
                    if (remove != null) {
                        message.what = 3;
                        message.obj = remove.f۱۵۳۵۸a;
                        this.f۱۵۵۱۰d.sendMessage(message);
                    } else {
                        message.recycle();
                    }
                } catch (InterruptedException e) {
                    return;
                } catch (Exception e2) {
                    this.f۱۵۵۱۰d.post(new RunnableCa(this, e2));
                    return;
                }
            }
        }

        /* renamed from: com.squareup.picasso.t$c$a  reason: invalid class name */
        class RunnableCa implements Runnable {

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ Exception f۱۵۵۱۱c;

            RunnableCa(Cc this$0, Exception exc) {
                this.f۱۵۵۱۱c = exc;
            }

            public void run() {
                throw new RuntimeException(this.f۱۵۵۱۱c);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static Ct m۱۸۳۹۵b() {
        if (f۱۵۴۸۳q == null) {
            synchronized (Ct.class) {
                if (f۱۵۴۸۳q == null) {
                    if (PicassoProvider.f۱۵۳۴۵c != null) {
                        f۱۵۴۸۳q = new Cb(PicassoProvider.f۱۵۳۴۵c).m۱۸۴۰۸a();
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return f۱۵۴۸۳q;
    }

    /* renamed from: com.squareup.picasso.t$b  reason: invalid class name */
    public static class Cb {

        /* renamed from: a  reason: contains not printable characters */
        private final Context f۱۵۴۹۹a;

        /* renamed from: b  reason: contains not printable characters */
        private AbstractCj f۱۵۵۰۰b;

        /* renamed from: c  reason: contains not printable characters */
        private ExecutorService f۱۵۵۰۱c;

        /* renamed from: d  reason: contains not printable characters */
        private AbstractCd f۱۵۵۰۲d;

        /* renamed from: e  reason: contains not printable characters */
        private AbstractCd f۱۵۵۰۳e;

        /* renamed from: f  reason: contains not printable characters */
        private AbstractCg f۱۵۵۰۴f;

        /* renamed from: g  reason: contains not printable characters */
        private List<AbstractCy> f۱۵۵۰۵g;

        /* renamed from: h  reason: contains not printable characters */
        private Bitmap.Config f۱۵۵۰۶h;

        /* renamed from: i  reason: contains not printable characters */
        private boolean f۱۵۵۰۷i;

        /* renamed from: j  reason: contains not printable characters */
        private boolean f۱۵۵۰۸j;

        public Cb(Context context) {
            if (context != null) {
                this.f۱۵۴۹۹a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ct m۱۸۴۰۸a() {
            Context context = this.f۱۵۴۹۹a;
            if (this.f۱۵۵۰۰b == null) {
                this.f۱۵۵۰۰b = new Cs(context);
            }
            if (this.f۱۵۵۰۲d == null) {
                this.f۱۵۵۰۲d = new Cm(context);
            }
            if (this.f۱۵۵۰۱c == null) {
                this.f۱۵۵۰۱c = new Cv();
            }
            if (this.f۱۵۵۰۴f == null) {
                this.f۱۵۵۰۴f = AbstractCg.f۱۵۵۲۱a;
            }
            Ca0 stats = new Ca0(this.f۱۵۵۰۲d);
            return new Ct(context, new Ci(context, this.f۱۵۵۰۱c, Ct.f۱۵۴۸۲p, this.f۱۵۵۰۰b, this.f۱۵۵۰۲d, stats), this.f۱۵۵۰۲d, this.f۱۵۵۰۳e, this.f۱۵۵۰۴f, this.f۱۵۵۰۵g, stats, this.f۱۵۵۰۶h, this.f۱۵۵۰۷i, this.f۱۵۵۰۸j);
        }
    }

    /* renamed from: com.squareup.picasso.t$e  reason: invalid class name */
    public enum EnumCe {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: c  reason: contains not printable characters */
        final int f۱۵۵۱۶c;

        private EnumCe(int debugColor) {
            this.f۱۵۵۱۶c = debugColor;
        }
    }
}
