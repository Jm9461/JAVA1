package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
public class i {

    /* renamed from: a  reason: collision with root package name */
    final b f۳۵۴۴a = new b();

    /* renamed from: b  reason: collision with root package name */
    final Context f۳۵۴۵b;

    /* renamed from: c  reason: collision with root package name */
    final ExecutorService f۳۵۴۶c;

    /* renamed from: d  reason: collision with root package name */
    final j f۳۵۴۷d;

    /* renamed from: e  reason: collision with root package name */
    final Map<String, c> f۳۵۴۸e;

    /* renamed from: f  reason: collision with root package name */
    final Map<Object, a> f۳۵۴۹f;

    /* renamed from: g  reason: collision with root package name */
    final Map<Object, a> f۳۵۵۰g;

    /* renamed from: h  reason: collision with root package name */
    final Set<Object> f۳۵۵۱h;
    final Handler i;
    final Handler j;
    final d k;
    final a0 l;
    final List<c> m;
    final c n;
    final boolean o;
    boolean p;

    i(Context context, ExecutorService service, Handler mainThreadHandler, j downloader, d cache, a0 stats) {
        this.f۳۵۴۴a.start();
        d0.a(this.f۳۵۴۴a.getLooper());
        this.f۳۵۴۵b = context;
        this.f۳۵۴۶c = service;
        this.f۳۵۴۸e = new LinkedHashMap();
        this.f۳۵۴۹f = new WeakHashMap();
        this.f۳۵۵۰g = new WeakHashMap();
        this.f۳۵۵۱h = new LinkedHashSet();
        this.i = new a(this.f۳۵۴۴a.getLooper(), this);
        this.f۳۵۴۷d = downloader;
        this.j = mainThreadHandler;
        this.k = cache;
        this.l = stats;
        this.m = new ArrayList(4);
        this.p = d0.c(this.f۳۵۴۵b);
        this.o = d0.b(context, "android.permission.ACCESS_NETWORK_STATE");
        this.n = new c(this);
        this.n.a();
    }

    /* access modifiers changed from: package-private */
    public void b(a action) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(1, action));
    }

    /* access modifiers changed from: package-private */
    public void a(a action) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(2, action));
    }

    /* access modifiers changed from: package-private */
    public void a(c hunter) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(4, hunter));
    }

    /* access modifiers changed from: package-private */
    public void c(c hunter) {
        Handler handler = this.i;
        handler.sendMessageDelayed(handler.obtainMessage(5, hunter), 500);
    }

    /* access modifiers changed from: package-private */
    public void b(c hunter) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(6, hunter));
    }

    /* access modifiers changed from: package-private */
    public void a(NetworkInfo info2) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(9, info2));
    }

    /* access modifiers changed from: package-private */
    public void a(boolean airplaneMode) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(10, airplaneMode ? 1 : 0, 0));
    }

    /* access modifiers changed from: package-private */
    public void d(a action) {
        a(action, true);
    }

    /* access modifiers changed from: package-private */
    public void a(a action, boolean dismissFailed) {
        if (this.f۳۵۵۱h.contains(action.h())) {
            this.f۳۵۵۰g.put(action.i(), action);
            if (action.e().n) {
                String d2 = action.f۳۴۹۴b.d();
                d0.a("Dispatcher", "paused", d2, "because tag '" + action.h() + "' is paused");
                return;
            }
            return;
        }
        c hunter = this.f۳۵۴۸e.get(action.b());
        if (hunter != null) {
            hunter.a(action);
        } else if (!this.f۳۵۴۶c.isShutdown()) {
            c hunter2 = c.a(action.e(), this, this.k, this.l, action);
            hunter2.p = this.f۳۵۴۶c.submit(hunter2);
            this.f۳۵۴۸e.put(action.b(), hunter2);
            if (dismissFailed) {
                this.f۳۵۴۹f.remove(action.i());
            }
            if (action.e().n) {
                d0.a("Dispatcher", "enqueued", action.f۳۴۹۴b.d());
            }
        } else if (action.e().n) {
            d0.a("Dispatcher", "ignored", action.f۳۴۹۴b.d(), "because shut down");
        }
    }

    /* access modifiers changed from: package-private */
    public void c(a action) {
        String key = action.b();
        c hunter = this.f۳۵۴۸e.get(key);
        if (hunter != null) {
            hunter.b(action);
            if (hunter.a()) {
                this.f۳۵۴۸e.remove(key);
                if (action.e().n) {
                    d0.a("Dispatcher", "canceled", action.g().d());
                }
            }
        }
        if (this.f۳۵۵۱h.contains(action.h())) {
            this.f۳۵۵۰g.remove(action.i());
            if (action.e().n) {
                d0.a("Dispatcher", "canceled", action.g().d(), "because paused request got canceled");
            }
        }
        a remove = this.f۳۵۴۹f.remove(action.i());
        if (remove != null && remove.e().n) {
            d0.a("Dispatcher", "canceled", remove.g().d(), "from replaying");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Object tag) {
        if (this.f۳۵۵۱h.add(tag)) {
            Iterator<BitmapHunter> it = this.f۳۵۴۸e.values().iterator();
            while (it.hasNext()) {
                c hunter = (c) it.next();
                boolean loggingEnabled = hunter.i().n;
                a single = hunter.b();
                List<Action> joined = hunter.c();
                boolean hasMultiple = joined != null && !joined.isEmpty();
                if (single != null || hasMultiple) {
                    if (single != null && single.h().equals(tag)) {
                        hunter.b(single);
                        this.f۳۵۵۰g.put(single.i(), single);
                        if (loggingEnabled) {
                            d0.a("Dispatcher", "paused", single.f۳۴۹۴b.d(), "because tag '" + tag + "' was paused");
                        }
                    }
                    if (hasMultiple) {
                        for (int i2 = joined.size() - 1; i2 >= 0; i2--) {
                            a action = (a) joined.get(i2);
                            if (action.h().equals(tag)) {
                                hunter.b(action);
                                this.f۳۵۵۰g.put(action.i(), action);
                                if (loggingEnabled) {
                                    d0.a("Dispatcher", "paused", action.f۳۴۹۴b.d(), "because tag '" + tag + "' was paused");
                                }
                            }
                        }
                    }
                    if (hunter.a()) {
                        it.remove();
                        if (loggingEnabled) {
                            d0.a("Dispatcher", "canceled", d0.a(hunter), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Object tag) {
        if (this.f۳۵۵۱h.remove(tag)) {
            List<Action> batch = null;
            Iterator<Action> i2 = this.f۳۵۵۰g.values().iterator();
            while (i2.hasNext()) {
                a action = i2.next();
                if (action.h().equals(tag)) {
                    if (batch == null) {
                        batch = new ArrayList<>();
                    }
                    batch.add(action);
                    i2.remove();
                }
            }
            if (batch != null) {
                Handler handler = this.j;
                handler.sendMessage(handler.obtainMessage(13, batch));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    public void e(c hunter) {
        if (!hunter.m()) {
            boolean willReplay = false;
            if (this.f۳۵۴۶c.isShutdown()) {
                a(hunter, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.o) {
                networkInfo = ((ConnectivityManager) d0.a(this.f۳۵۴۵b, "connectivity")).getActiveNetworkInfo();
            }
            if (hunter.a(this.p, networkInfo)) {
                if (hunter.i().n) {
                    d0.a("Dispatcher", "retrying", d0.a(hunter));
                }
                if (hunter.e() instanceof r.a) {
                    hunter.k |= q.NO_CACHE.f۳۵۷۹c;
                }
                hunter.p = this.f۳۵۴۶c.submit(hunter);
                return;
            }
            if (this.o && hunter.n()) {
                willReplay = true;
            }
            a(hunter, willReplay);
            if (willReplay) {
                g(hunter);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(c hunter) {
        if (p.b(hunter.h())) {
            this.k.a(hunter.f(), hunter.k());
        }
        this.f۳۵۴۸e.remove(hunter.f());
        f(hunter);
        if (hunter.i().n) {
            d0.a("Dispatcher", "batched", d0.a(hunter), "for completion");
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        List<BitmapHunter> copy = new ArrayList<>(this.m);
        this.m.clear();
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(8, copy));
        a((List<c>) copy);
    }

    /* access modifiers changed from: package-private */
    public void a(c hunter, boolean willReplay) {
        if (hunter.i().n) {
            String a2 = d0.a(hunter);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(willReplay ? " (will replay)" : "");
            d0.a("Dispatcher", "batched", a2, sb.toString());
        }
        this.f۳۵۴۸e.remove(hunter.f());
        f(hunter);
    }

    /* access modifiers changed from: package-private */
    public void b(boolean airplaneMode) {
        this.p = airplaneMode;
    }

    /* access modifiers changed from: package-private */
    public void b(NetworkInfo info2) {
        ExecutorService executorService = this.f۳۵۴۶c;
        if (executorService instanceof v) {
            ((v) executorService).a(info2);
        }
        if (info2 != null && info2.isConnected()) {
            b();
        }
    }

    private void b() {
        if (!this.f۳۵۴۹f.isEmpty()) {
            Iterator<Action> iterator = this.f۳۵۴۹f.values().iterator();
            while (iterator.hasNext()) {
                a action = (a) iterator.next();
                iterator.remove();
                if (action.e().n) {
                    d0.a("Dispatcher", "replaying", action.g().d());
                }
                a(action, false);
            }
        }
    }

    private void g(c hunter) {
        a action = hunter.b();
        if (action != null) {
            e(action);
        }
        List<Action> joined = hunter.c();
        if (joined != null) {
            int n2 = joined.size();
            for (int i2 = 0; i2 < n2; i2++) {
                e((a) joined.get(i2));
            }
        }
    }

    private void e(a action) {
        Object target = action.i();
        if (target != null) {
            action.k = true;
            this.f۳۵۴۹f.put(target, action);
        }
    }

    private void f(c hunter) {
        if (!hunter.m()) {
            Bitmap bitmap = hunter.o;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.m.add(hunter);
            if (!this.i.hasMessages(7)) {
                this.i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    private void a(List<c> list) {
        if (!(list == null || list.isEmpty() || !list.get(0).i().n)) {
            StringBuilder builder = new StringBuilder();
            for (c bitmapHunter : list) {
                if (builder.length() > 0) {
                    builder.append(", ");
                }
                builder.append(d0.a(bitmapHunter));
            }
            d0.a("Dispatcher", "delivered", builder.toString());
        }
    }

    private static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final i f۳۵۵۲a;

        a(Looper looper, i dispatcher) {
            super(looper);
            this.f۳۵۵۲a = dispatcher;
        }

        public void handleMessage(Message msg) {
            boolean z = false;
            switch (msg.what) {
                case 1:
                    this.f۳۵۵۲a.d((a) msg.obj);
                    return;
                case 2:
                    this.f۳۵۵۲a.c((a) msg.obj);
                    return;
                case 3:
                case 8:
                default:
                    t.p.post(new RunnableC۰۱۱۴a(this, msg));
                    return;
                case 4:
                    this.f۳۵۵۲a.d((c) msg.obj);
                    return;
                case 5:
                    this.f۳۵۵۲a.e((c) msg.obj);
                    return;
                case 6:
                    this.f۳۵۵۲a.a((c) msg.obj, false);
                    return;
                case 7:
                    this.f۳۵۵۲a.a();
                    return;
                case 9:
                    this.f۳۵۵۲a.b((NetworkInfo) msg.obj);
                    return;
                case 10:
                    i iVar = this.f۳۵۵۲a;
                    if (msg.arg1 == 1) {
                        z = true;
                    }
                    iVar.b(z);
                    return;
                case 11:
                    this.f۳۵۵۲a.a(msg.obj);
                    return;
                case 12:
                    this.f۳۵۵۲a.b(msg.obj);
                    return;
            }
        }

        /* renamed from: com.squareup.picasso.i$a$a  reason: collision with other inner class name */
        class RunnableC۰۱۱۴a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Message f۳۵۵۳c;

            RunnableC۰۱۱۴a(a this$0, Message message) {
                this.f۳۵۵۳c = message;
            }

            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f۳۵۵۳c.what);
            }
        }
    }

    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class c extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private final i f۳۵۵۴a;

        c(i dispatcher) {
            this.f۳۵۵۴a = dispatcher;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            IntentFilter filter = new IntentFilter();
            filter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f۳۵۵۴a.o) {
                filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f۳۵۵۴a.f۳۵۴۵b.registerReceiver(this, filter);
        }

        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        this.f۳۵۵۴a.a(intent.getBooleanExtra("state", false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.f۳۵۵۴a.a(((ConnectivityManager) d0.a(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }
}
