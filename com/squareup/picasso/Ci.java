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
import com.squareup.picasso.Cr;
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
/* renamed from: com.squareup.picasso.i  reason: invalid class name */
public class Ci {

    /* renamed from: a  reason: contains not printable characters */
    final HandlerThreadCb f۱۵۴۳۰a = new HandlerThreadCb();

    /* renamed from: b  reason: contains not printable characters */
    final Context f۱۵۴۳۱b;

    /* renamed from: c  reason: contains not printable characters */
    final ExecutorService f۱۵۴۳۲c;

    /* renamed from: d  reason: contains not printable characters */
    final AbstractCj f۱۵۴۳۳d;

    /* renamed from: e  reason: contains not printable characters */
    final Map<String, RunnableCc> f۱۵۴۳۴e;

    /* renamed from: f  reason: contains not printable characters */
    final Map<Object, AbstractCa> f۱۵۴۳۵f;

    /* renamed from: g  reason: contains not printable characters */
    final Map<Object, AbstractCa> f۱۵۴۳۶g;

    /* renamed from: h  reason: contains not printable characters */
    final Set<Object> f۱۵۴۳۷h;

    /* renamed from: i  reason: contains not printable characters */
    final Handler f۱۵۴۳۸i;

    /* renamed from: j  reason: contains not printable characters */
    final Handler f۱۵۴۳۹j;

    /* renamed from: k  reason: contains not printable characters */
    final AbstractCd f۱۵۴۴۰k;

    /* renamed from: l  reason: contains not printable characters */
    final Ca0 f۱۵۴۴۱l;

    /* renamed from: m  reason: contains not printable characters */
    final List<RunnableCc> f۱۵۴۴۲m;

    /* renamed from: n  reason: contains not printable characters */
    final Cc f۱۵۴۴۳n;

    /* renamed from: o  reason: contains not printable characters */
    final boolean f۱۵۴۴۴o;

    /* renamed from: p  reason: contains not printable characters */
    boolean f۱۵۴۴۵p;

    Ci(Context context, ExecutorService service, Handler mainThreadHandler, AbstractCj downloader, AbstractCd cache, Ca0 stats) {
        this.f۱۵۴۳۰a.start();
        Cd0.m۱۸۳۲۱a(this.f۱۵۴۳۰a.getLooper());
        this.f۱۵۴۳۱b = context;
        this.f۱۵۴۳۲c = service;
        this.f۱۵۴۳۴e = new LinkedHashMap();
        this.f۱۵۴۳۵f = new WeakHashMap();
        this.f۱۵۴۳۶g = new WeakHashMap();
        this.f۱۵۴۳۷h = new LinkedHashSet();
        this.f۱۵۴۳۸i = new HandlerCa(this.f۱۵۴۳۰a.getLooper(), this);
        this.f۱۵۴۳۳d = downloader;
        this.f۱۵۴۳۹j = mainThreadHandler;
        this.f۱۵۴۴۰k = cache;
        this.f۱۵۴۴۱l = stats;
        this.f۱۵۴۴۲m = new ArrayList(4);
        this.f۱۵۴۴۵p = Cd0.m۱۸۳۲۸c(this.f۱۵۴۳۱b);
        this.f۱۵۴۴۴o = Cd0.m۱۸۳۲۷b(context, "android.permission.ACCESS_NETWORK_STATE");
        this.f۱۵۴۴۳n = new Cc(this);
        this.f۱۵۴۴۳n.m۱۸۳۶۱a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۳۵۲b(AbstractCa action) {
        Handler handler = this.f۱۵۴۳۸i;
        handler.sendMessage(handler.obtainMessage(1, action));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۴۵a(AbstractCa action) {
        Handler handler = this.f۱۵۴۳۸i;
        handler.sendMessage(handler.obtainMessage(2, action));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۴۷a(RunnableCc hunter) {
        Handler handler = this.f۱۵۴۳۸i;
        handler.sendMessage(handler.obtainMessage(4, hunter));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۸۳۵۷c(RunnableCc hunter) {
        Handler handler = this.f۱۵۴۳۸i;
        handler.sendMessageDelayed(handler.obtainMessage(5, hunter), 500);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۳۵۳b(RunnableCc hunter) {
        Handler handler = this.f۱۵۴۳۸i;
        handler.sendMessage(handler.obtainMessage(6, hunter));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۴۴a(NetworkInfo info2) {
        Handler handler = this.f۱۵۴۳۸i;
        handler.sendMessage(handler.obtainMessage(9, info2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۵۰a(boolean airplaneMode) {
        Handler handler = this.f۱۵۴۳۸i;
        handler.sendMessage(handler.obtainMessage(10, airplaneMode ? 1 : 0, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۸۳۵۸d(AbstractCa action) {
        m۱۸۳۴۶a(action, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۴۶a(AbstractCa action, boolean dismissFailed) {
        if (this.f۱۵۴۳۷h.contains(action.m۱۸۲۵۲h())) {
            this.f۱۵۴۳۶g.put(action.m۱۸۲۵۳i(), action);
            if (action.m۱۸۲۴۹e().f۱۵۴۹۷n) {
                String d = action.f۱۵۳۴۷b.m۱۸۴۲۲d();
                Cd0.m۱۸۳۲۳a("Dispatcher", "paused", d, "because tag '" + action.m۱۸۲۵۲h() + "' is paused");
                return;
            }
            return;
        }
        RunnableCc hunter = this.f۱۵۴۳۴e.get(action.m۱۸۲۴۶b());
        if (hunter != null) {
            hunter.m۱۸۲۸۲a(action);
        } else if (!this.f۱۵۴۳۲c.isShutdown()) {
            RunnableCc hunter2 = RunnableCc.m۱۸۲۷۷a(action.m۱۸۲۴۹e(), this, this.f۱۵۴۴۰k, this.f۱۵۴۴۱l, action);
            hunter2.f۱۵۴۱۰p = this.f۱۵۴۳۲c.submit(hunter2);
            this.f۱۵۴۳۴e.put(action.m۱۸۲۴۶b(), hunter2);
            if (dismissFailed) {
                this.f۱۵۴۳۵f.remove(action.m۱۸۲۵۳i());
            }
            if (action.m۱۸۲۴۹e().f۱۵۴۹۷n) {
                Cd0.m۱۸۳۲۲a("Dispatcher", "enqueued", action.f۱۵۳۴۷b.m۱۸۴۲۲d());
            }
        } else if (action.m۱۸۲۴۹e().f۱۵۴۹۷n) {
            Cd0.m۱۸۳۲۳a("Dispatcher", "ignored", action.f۱۵۳۴۷b.m۱۸۴۲۲d(), "because shut down");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۸۳۵۶c(AbstractCa action) {
        String key = action.m۱۸۲۴۶b();
        RunnableCc hunter = this.f۱۵۴۳۴e.get(key);
        if (hunter != null) {
            hunter.m۱۸۲۸۶b(action);
            if (hunter.m۱۸۲۸۳a()) {
                this.f۱۵۴۳۴e.remove(key);
                if (action.m۱۸۲۴۹e().f۱۵۴۹۷n) {
                    Cd0.m۱۸۳۲۲a("Dispatcher", "canceled", action.m۱۸۲۵۱g().m۱۸۴۲۲d());
                }
            }
        }
        if (this.f۱۵۴۳۷h.contains(action.m۱۸۲۵۲h())) {
            this.f۱۵۴۳۶g.remove(action.m۱۸۲۵۳i());
            if (action.m۱۸۲۴۹e().f۱۵۴۹۷n) {
                Cd0.m۱۸۳۲۳a("Dispatcher", "canceled", action.m۱۸۲۵۱g().m۱۸۴۲۲d(), "because paused request got canceled");
            }
        }
        AbstractCa remove = this.f۱۵۴۳۵f.remove(action.m۱۸۲۵۳i());
        if (remove != null && remove.m۱۸۲۴۹e().f۱۵۴۹۷n) {
            Cd0.m۱۸۳۲۳a("Dispatcher", "canceled", remove.m۱۸۲۵۱g().m۱۸۴۲۲d(), "from replaying");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۴۹a(Object tag) {
        if (this.f۱۵۴۳۷h.add(tag)) {
            Iterator<BitmapHunter> it = this.f۱۵۴۳۴e.values().iterator();
            while (it.hasNext()) {
                RunnableCc hunter = (RunnableCc) it.next();
                boolean loggingEnabled = hunter.m۱۸۲۹۳i().f۱۵۴۹۷n;
                AbstractCa single = hunter.m۱۸۲۸۵b();
                List<Action> joined = hunter.m۱۸۲۸۷c();
                boolean hasMultiple = joined != null && !joined.isEmpty();
                if (single != null || hasMultiple) {
                    if (single != null && single.m۱۸۲۵۲h().equals(tag)) {
                        hunter.m۱۸۲۸۶b(single);
                        this.f۱۵۴۳۶g.put(single.m۱۸۲۵۳i(), single);
                        if (loggingEnabled) {
                            Cd0.m۱۸۳۲۳a("Dispatcher", "paused", single.f۱۵۳۴۷b.m۱۸۴۲۲d(), "because tag '" + tag + "' was paused");
                        }
                    }
                    if (hasMultiple) {
                        for (int i = joined.size() - 1; i >= 0; i--) {
                            AbstractCa action = (AbstractCa) joined.get(i);
                            if (action.m۱۸۲۵۲h().equals(tag)) {
                                hunter.m۱۸۲۸۶b(action);
                                this.f۱۵۴۳۶g.put(action.m۱۸۲۵۳i(), action);
                                if (loggingEnabled) {
                                    Cd0.m۱۸۳۲۳a("Dispatcher", "paused", action.f۱۵۳۴۷b.m۱۸۴۲۲d(), "because tag '" + tag + "' was paused");
                                }
                            }
                        }
                    }
                    if (hunter.m۱۸۲۸۳a()) {
                        it.remove();
                        if (loggingEnabled) {
                            Cd0.m۱۸۳۲۳a("Dispatcher", "canceled", Cd0.m۱۸۳۱۶a(hunter), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۳۵۴b(Object tag) {
        if (this.f۱۵۴۳۷h.remove(tag)) {
            List<Action> batch = null;
            Iterator<Action> i = this.f۱۵۴۳۶g.values().iterator();
            while (i.hasNext()) {
                AbstractCa action = i.next();
                if (action.m۱۸۲۵۲h().equals(tag)) {
                    if (batch == null) {
                        batch = new ArrayList<>();
                    }
                    batch.add(action);
                    i.remove();
                }
            }
            if (batch != null) {
                Handler handler = this.f۱۵۴۳۹j;
                handler.sendMessage(handler.obtainMessage(13, batch));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۸۳۶۰e(RunnableCc hunter) {
        if (!hunter.m۱۸۲۹۷m()) {
            boolean willReplay = false;
            if (this.f۱۵۴۳۲c.isShutdown()) {
                m۱۸۳۴۸a(hunter, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f۱۵۴۴۴o) {
                networkInfo = ((ConnectivityManager) Cd0.m۱۸۳۱۴a(this.f۱۵۴۳۱b, "connectivity")).getActiveNetworkInfo();
            }
            if (hunter.m۱۸۲۸۴a(this.f۱۵۴۴۵p, networkInfo)) {
                if (hunter.m۱۸۲۹۳i().f۱۵۴۹۷n) {
                    Cd0.m۱۸۳۲۲a("Dispatcher", "retrying", Cd0.m۱۸۳۱۶a(hunter));
                }
                if (hunter.m۱۸۲۸۹e() instanceof Cr.Ca) {
                    hunter.f۱۵۴۰۵k |= EnumCq.NO_CACHE.f۱۵۴۷۶c;
                }
                hunter.f۱۵۴۱۰p = this.f۱۵۴۳۲c.submit(hunter);
                return;
            }
            if (this.f۱۵۴۴۴o && hunter.m۱۸۲۹۸n()) {
                willReplay = true;
            }
            m۱۸۳۴۸a(hunter, willReplay);
            if (willReplay) {
                m۱۸۳۴۲g(hunter);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۸۳۵۹d(RunnableCc hunter) {
        if (EnumCp.m۱۸۳۸۳b(hunter.m۱۸۲۹۲h())) {
            this.f۱۵۴۴۰k.m۱۸۳۰۵a(hunter.m۱۸۲۹۰f(), hunter.m۱۸۲۹۵k());
        }
        this.f۱۵۴۳۴e.remove(hunter.m۱۸۲۹۰f());
        m۱۸۳۴۱f(hunter);
        if (hunter.m۱۸۲۹۳i().f۱۵۴۹۷n) {
            Cd0.m۱۸۳۲۳a("Dispatcher", "batched", Cd0.m۱۸۳۱۶a(hunter), "for completion");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۴۳a() {
        List<BitmapHunter> copy = new ArrayList<>(this.f۱۵۴۴۲m);
        this.f۱۵۴۴۲m.clear();
        Handler handler = this.f۱۵۴۳۹j;
        handler.sendMessage(handler.obtainMessage(8, copy));
        m۱۸۳۳۸a((List<RunnableCc>) copy);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۴۸a(RunnableCc hunter, boolean willReplay) {
        if (hunter.m۱۸۲۹۳i().f۱۵۴۹۷n) {
            String a = Cd0.m۱۸۳۱۶a(hunter);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(willReplay ? " (will replay)" : "");
            Cd0.m۱۸۳۲۳a("Dispatcher", "batched", a, sb.toString());
        }
        this.f۱۵۴۳۴e.remove(hunter.m۱۸۲۹۰f());
        m۱۸۳۴۱f(hunter);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۳۵۵b(boolean airplaneMode) {
        this.f۱۵۴۴۵p = airplaneMode;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۳۵۱b(NetworkInfo info2) {
        ExecutorService executorService = this.f۱۵۴۳۲c;
        if (executorService instanceof Cv) {
            ((Cv) executorService).m۱۸۴۱۷a(info2);
        }
        if (info2 != null && info2.isConnected()) {
            m۱۸۳۳۹b();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۸۳۳۹b() {
        if (!this.f۱۵۴۳۵f.isEmpty()) {
            Iterator<Action> iterator = this.f۱۵۴۳۵f.values().iterator();
            while (iterator.hasNext()) {
                AbstractCa action = (AbstractCa) iterator.next();
                iterator.remove();
                if (action.m۱۸۲۴۹e().f۱۵۴۹۷n) {
                    Cd0.m۱۸۳۲۲a("Dispatcher", "replaying", action.m۱۸۲۵۱g().m۱۸۴۲۲d());
                }
                m۱۸۳۴۶a(action, false);
            }
        }
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۸۳۴۲g(RunnableCc hunter) {
        AbstractCa action = hunter.m۱۸۲۸۵b();
        if (action != null) {
            m۱۸۳۴۰e(action);
        }
        List<Action> joined = hunter.m۱۸۲۸۷c();
        if (joined != null) {
            int n = joined.size();
            for (int i = 0; i < n; i++) {
                m۱۸۳۴۰e((AbstractCa) joined.get(i));
            }
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۸۳۴۰e(AbstractCa action) {
        Object target = action.m۱۸۲۵۳i();
        if (target != null) {
            action.f۱۵۳۵۶k = true;
            this.f۱۵۴۳۵f.put(target, action);
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۸۳۴۱f(RunnableCc hunter) {
        if (!hunter.m۱۸۲۹۷m()) {
            Bitmap bitmap = hunter.f۱۵۴۰۹o;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f۱۵۴۴۲m.add(hunter);
            if (!this.f۱۵۴۳۸i.hasMessages(7)) {
                this.f۱۵۴۳۸i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۳۳۸a(List<RunnableCc> list) {
        if (!(list == null || list.isEmpty() || !list.get(0).m۱۸۲۹۳i().f۱۵۴۹۷n)) {
            StringBuilder builder = new StringBuilder();
            for (RunnableCc bitmapHunter : list) {
                if (builder.length() > 0) {
                    builder.append(", ");
                }
                builder.append(Cd0.m۱۸۳۱۶a(bitmapHunter));
            }
            Cd0.m۱۸۳۲۲a("Dispatcher", "delivered", builder.toString());
        }
    }

    /* renamed from: com.squareup.picasso.i$a  reason: invalid class name */
    private static class HandlerCa extends Handler {

        /* renamed from: a  reason: contains not printable characters */
        private final Ci f۱۵۴۴۶a;

        HandlerCa(Looper looper, Ci dispatcher) {
            super(looper);
            this.f۱۵۴۴۶a = dispatcher;
        }

        public void handleMessage(Message msg) {
            boolean z = false;
            switch (msg.what) {
                case 1:
                    this.f۱۵۴۴۶a.m۱۸۳۵۸d((AbstractCa) msg.obj);
                    return;
                case 2:
                    this.f۱۵۴۴۶a.m۱۸۳۵۶c((AbstractCa) msg.obj);
                    return;
                case 3:
                case 8:
                default:
                    Ct.f۱۵۴۸۲p.post(new RunnableCa(this, msg));
                    return;
                case 4:
                    this.f۱۵۴۴۶a.m۱۸۳۵۹d((RunnableCc) msg.obj);
                    return;
                case 5:
                    this.f۱۵۴۴۶a.m۱۸۳۶۰e((RunnableCc) msg.obj);
                    return;
                case 6:
                    this.f۱۵۴۴۶a.m۱۸۳۴۸a((RunnableCc) msg.obj, false);
                    return;
                case 7:
                    this.f۱۵۴۴۶a.m۱۸۳۴۳a();
                    return;
                case 9:
                    this.f۱۵۴۴۶a.m۱۸۳۵۱b((NetworkInfo) msg.obj);
                    return;
                case 10:
                    Ci iVar = this.f۱۵۴۴۶a;
                    if (msg.arg1 == 1) {
                        z = true;
                    }
                    iVar.m۱۸۳۵۵b(z);
                    return;
                case 11:
                    this.f۱۵۴۴۶a.m۱۸۳۴۹a(msg.obj);
                    return;
                case 12:
                    this.f۱۵۴۴۶a.m۱۸۳۵۴b(msg.obj);
                    return;
            }
        }

        /* renamed from: com.squareup.picasso.i$a$a  reason: invalid class name */
        class RunnableCa implements Runnable {

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ Message f۱۵۴۴۷c;

            RunnableCa(HandlerCa this$0, Message message) {
                this.f۱۵۴۴۷c = message;
            }

            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f۱۵۴۴۷c.what);
            }
        }
    }

    /* renamed from: com.squareup.picasso.i$b  reason: invalid class name */
    static class HandlerThreadCb extends HandlerThread {
        HandlerThreadCb() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: com.squareup.picasso.i$c  reason: invalid class name */
    static class Cc extends BroadcastReceiver {

        /* renamed from: a  reason: contains not printable characters */
        private final Ci f۱۵۴۴۸a;

        Cc(Ci dispatcher) {
            this.f۱۵۴۴۸a = dispatcher;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۳۶۱a() {
            IntentFilter filter = new IntentFilter();
            filter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f۱۵۴۴۸a.f۱۵۴۴۴o) {
                filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f۱۵۴۴۸a.f۱۵۴۳۱b.registerReceiver(this, filter);
        }

        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        this.f۱۵۴۴۸a.m۱۸۳۵۰a(intent.getBooleanExtra("state", false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.f۱۵۴۴۸a.m۱۸۳۴۴a(((ConnectivityManager) Cd0.m۱۸۳۱۴a(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }
}
