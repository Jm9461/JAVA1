package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class c {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f۱۲۵۰f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static c f۱۲۵۱g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f۱۲۵۲a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<C۰۰۲۷c>> f۱۲۵۳b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, ArrayList<C۰۰۲۷c>> f۱۲۵۴c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<b> f۱۲۵۵d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final Handler f۱۲۵۶e;

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.content.c$c  reason: collision with other inner class name */
    public static final class C۰۰۲۷c {

        /* renamed from: a  reason: collision with root package name */
        final IntentFilter f۱۲۶۰a;

        /* renamed from: b  reason: collision with root package name */
        final BroadcastReceiver f۱۲۶۱b;

        /* renamed from: c  reason: collision with root package name */
        boolean f۱۲۶۲c;

        /* renamed from: d  reason: collision with root package name */
        boolean f۱۲۶۳d;

        C۰۰۲۷c(IntentFilter _filter, BroadcastReceiver _receiver) {
            this.f۱۲۶۰a = _filter;
            this.f۱۲۶۱b = _receiver;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder(128);
            builder.append("Receiver{");
            builder.append(this.f۱۲۶۱b);
            builder.append(" filter=");
            builder.append(this.f۱۲۶۰a);
            if (this.f۱۲۶۳d) {
                builder.append(" DEAD");
            }
            builder.append("}");
            return builder.toString();
        }
    }

    /* access modifiers changed from: private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final Intent f۱۲۵۸a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<C۰۰۲۷c> f۱۲۵۹b;

        b(Intent _intent, ArrayList<C۰۰۲۷c> arrayList) {
            this.f۱۲۵۸a = _intent;
            this.f۱۲۵۹b = arrayList;
        }
    }

    public static c a(Context context) {
        c cVar;
        synchronized (f۱۲۵۰f) {
            if (f۱۲۵۱g == null) {
                f۱۲۵۱g = new c(context.getApplicationContext());
            }
            cVar = f۱۲۵۱g;
        }
        return cVar;
    }

    private c(Context context) {
        this.f۱۲۵۲a = context;
        this.f۱۲۵۶e = new a(context.getMainLooper());
    }

    class a extends Handler {
        a(Looper x0) {
            super(x0);
        }

        public void handleMessage(Message msg) {
            if (msg.what != 1) {
                super.handleMessage(msg);
            } else {
                c.this.a();
            }
        }
    }

    public void a(BroadcastReceiver receiver, IntentFilter filter) {
        synchronized (this.f۱۲۵۳b) {
            LocalBroadcastManager.ReceiverRecord entry = new C۰۰۲۷c(filter, receiver);
            ArrayList<LocalBroadcastManager.ReceiverRecord> filters = this.f۱۲۵۳b.get(receiver);
            if (filters == null) {
                filters = new ArrayList<>(1);
                this.f۱۲۵۳b.put(receiver, filters);
            }
            filters.add(entry);
            for (int i = 0; i < filter.countActions(); i++) {
                String action = filter.getAction(i);
                ArrayList<LocalBroadcastManager.ReceiverRecord> entries = this.f۱۲۵۴c.get(action);
                if (entries == null) {
                    entries = new ArrayList<>(1);
                    this.f۱۲۵۴c.put(action, entries);
                }
                entries.add(entry);
            }
        }
    }

    public void a(BroadcastReceiver receiver) {
        synchronized (this.f۱۲۵۳b) {
            ArrayList<LocalBroadcastManager.ReceiverRecord> filters = this.f۱۲۵۳b.remove(receiver);
            if (filters != null) {
                for (int i = filters.size() - 1; i >= 0; i--) {
                    C۰۰۲۷c filter = (C۰۰۲۷c) filters.get(i);
                    filter.f۱۲۶۳d = true;
                    for (int j = 0; j < filter.f۱۲۶۰a.countActions(); j++) {
                        String action = filter.f۱۲۶۰a.getAction(j);
                        ArrayList<LocalBroadcastManager.ReceiverRecord> receivers = this.f۱۲۵۴c.get(action);
                        if (receivers != null) {
                            for (int k = receivers.size() - 1; k >= 0; k--) {
                                C۰۰۲۷c rec = (C۰۰۲۷c) receivers.get(k);
                                if (rec.f۱۲۶۱b == receiver) {
                                    rec.f۱۲۶۳d = true;
                                    receivers.remove(k);
                                }
                            }
                            if (receivers.size() <= 0) {
                                this.f۱۲۵۴c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Multiple debug info for r0v9 java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$ReceiverRecord>: [D('type' java.lang.String), D('receivers' java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$ReceiverRecord>)] */
    public boolean a(Intent intent) {
        int i;
        String type;
        ArrayList<LocalBroadcastManager.ReceiverRecord> receivers;
        String reason;
        synchronized (this.f۱۲۵۳b) {
            String action = intent.getAction();
            String type2 = intent.resolveTypeIfNeeded(this.f۱۲۵۲a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean debug = (intent.getFlags() & 8) != 0;
            if (debug) {
                Log.v("LocalBroadcastManager", "Resolving type " + type2 + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<LocalBroadcastManager.ReceiverRecord> entries = this.f۱۲۵۴c.get(intent.getAction());
            if (entries != null) {
                if (debug) {
                    Log.v("LocalBroadcastManager", "Action list: " + entries);
                }
                ArrayList<LocalBroadcastManager.ReceiverRecord> receivers2 = null;
                int i2 = 0;
                while (i2 < entries.size()) {
                    C۰۰۲۷c receiver = entries.get(i2);
                    if (debug) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + receiver.f۱۲۶۰a);
                    }
                    if (!receiver.f۱۲۶۲c) {
                        type = type2;
                        receivers = receivers2;
                        i = i2;
                        int match = receiver.f۱۲۶۰a.match(action, type2, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (debug) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            if (receivers == null) {
                                receivers = new ArrayList<>();
                            }
                            receivers.add(receiver);
                            receiver.f۱۲۶۲c = true;
                            receivers2 = receivers;
                            i2 = i + 1;
                            type2 = type;
                        } else if (debug) {
                            if (match == -4) {
                                reason = "category";
                            } else if (match == -3) {
                                reason = "action";
                            } else if (match == -2) {
                                reason = "data";
                            } else if (match != -1) {
                                reason = "unknown reason";
                            } else {
                                reason = "type";
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + reason);
                        }
                    } else if (debug) {
                        Log.v("LocalBroadcastManager", "  Filter's target already added");
                        type = type2;
                        receivers = receivers2;
                        i = i2;
                    } else {
                        type = type2;
                        receivers = receivers2;
                        i = i2;
                    }
                    receivers2 = receivers;
                    i2 = i + 1;
                    type2 = type;
                }
                if (receivers2 != null) {
                    for (int i3 = 0; i3 < receivers2.size(); i3++) {
                        ((C۰۰۲۷c) receivers2.get(i3)).f۱۲۶۲c = false;
                    }
                    this.f۱۲۵۵d.add(new b(intent, receivers2));
                    if (!this.f۱۲۵۶e.hasMessages(1)) {
                        this.f۱۲۵۶e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r1 >= r0.length) goto L_0x0001;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        r2 = r0[r1];
        r3 = r2.f۱۲۵۹b.size();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r4 >= r3) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r5 = r2.f۱۲۵۹b.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r5.f۱۲۶۳d != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r5.f۱۲۶۱b.onReceive(r9.f۱۲۵۲a, r2.f۱۲۵۸a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r1 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r9 = this;
            r0 = 0
        L_0x0001:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.support.v4.content.c$c>> r1 = r9.f۱۲۵۳b
            monitor-enter(r1)
            java.util.ArrayList<android.support.v4.content.c$b> r2 = r9.f۱۲۵۵d     // Catch:{ all -> 0x0046 }
            int r2 = r2.size()     // Catch:{ all -> 0x0046 }
            if (r2 > 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            return
        L_0x000e:
            android.support.v4.content.c$b[] r0 = new android.support.v4.content.c.b[r2]     // Catch:{ all -> 0x0046 }
            java.util.ArrayList<android.support.v4.content.c$b> r3 = r9.f۱۲۵۵d     // Catch:{ all -> 0x0049 }
            r3.toArray(r0)     // Catch:{ all -> 0x0049 }
            java.util.ArrayList<android.support.v4.content.c$b> r3 = r9.f۱۲۵۵d     // Catch:{ all -> 0x0049 }
            r3.clear()     // Catch:{ all -> 0x0049 }
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            r1 = 0
        L_0x001c:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x0045
            r2 = r0[r1]
            java.util.ArrayList<android.support.v4.content.c$c> r3 = r2.f۱۲۵۹b
            int r3 = r3.size()
            r4 = 0
        L_0x0028:
            if (r4 >= r3) goto L_0x0042
            java.util.ArrayList<android.support.v4.content.c$c> r5 = r2.f۱۲۵۹b
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.content.c$c r5 = (android.support.v4.content.c.C۰۰۲۷c) r5
            boolean r6 = r5.f۱۲۶۳d
            if (r6 != 0) goto L_0x003f
            android.content.BroadcastReceiver r6 = r5.f۱۲۶۱b
            android.content.Context r7 = r9.f۱۲۵۲a
            android.content.Intent r8 = r2.f۱۲۵۸a
            r6.onReceive(r7, r8)
        L_0x003f:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x0042:
            int r1 = r1 + 1
            goto L_0x001c
        L_0x0045:
            goto L_0x0001
        L_0x0046:
            r2 = move-exception
        L_0x0047:
            monitor-exit(r1)
            throw r2
        L_0x0049:
            r2 = move-exception
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.c.a():void");
    }
}
