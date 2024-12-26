package android.support.p۰۴۳v4.content;

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

/* renamed from: android.support.v4.content.c  reason: invalid class name */
public final class Cc {

    /* renamed from: f  reason: contains not printable characters */
    private static final Object f۱۰۴۴۸f = new Object();

    /* renamed from: g  reason: contains not printable characters */
    private static Cc f۱۰۴۴۹g;

    /* renamed from: a  reason: contains not printable characters */
    private final Context f۱۰۴۵۰a;

    /* renamed from: b  reason: contains not printable characters */
    private final HashMap<BroadcastReceiver, ArrayList<Cc>> f۱۰۴۵۱b = new HashMap<>();

    /* renamed from: c  reason: contains not printable characters */
    private final HashMap<String, ArrayList<Cc>> f۱۰۴۵۲c = new HashMap<>();

    /* renamed from: d  reason: contains not printable characters */
    private final ArrayList<Cb> f۱۰۴۵۳d = new ArrayList<>();

    /* renamed from: e  reason: contains not printable characters */
    private final Handler f۱۰۴۵۴e;

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.content.c$c  reason: invalid class name */
    public static final class Cc {

        /* renamed from: a  reason: contains not printable characters */
        final IntentFilter f۱۰۴۵۸a;

        /* renamed from: b  reason: contains not printable characters */
        final BroadcastReceiver f۱۰۴۵۹b;

        /* renamed from: c  reason: contains not printable characters */
        boolean f۱۰۴۶۰c;

        /* renamed from: d  reason: contains not printable characters */
        boolean f۱۰۴۶۱d;

        Cc(IntentFilter _filter, BroadcastReceiver _receiver) {
            this.f۱۰۴۵۸a = _filter;
            this.f۱۰۴۵۹b = _receiver;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder(128);
            builder.append("Receiver{");
            builder.append(this.f۱۰۴۵۹b);
            builder.append(" filter=");
            builder.append(this.f۱۰۴۵۸a);
            if (this.f۱۰۴۶۱d) {
                builder.append(" DEAD");
            }
            builder.append("}");
            return builder.toString();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.content.c$b  reason: invalid class name */
    public static final class Cb {

        /* renamed from: a  reason: contains not printable characters */
        final Intent f۱۰۴۵۶a;

        /* renamed from: b  reason: contains not printable characters */
        final ArrayList<Cc> f۱۰۴۵۷b;

        Cb(Intent _intent, ArrayList<Cc> arrayList) {
            this.f۱۰۴۵۶a = _intent;
            this.f۱۰۴۵۷b = arrayList;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cc m۱۲۶۳۲a(Context context) {
        Cc cVar;
        synchronized (f۱۰۴۴۸f) {
            if (f۱۰۴۴۹g == null) {
                f۱۰۴۴۹g = new Cc(context.getApplicationContext());
            }
            cVar = f۱۰۴۴۹g;
        }
        return cVar;
    }

    private Cc(Context context) {
        this.f۱۰۴۵۰a = context;
        this.f۱۰۴۵۴e = new HandlerCa(context.getMainLooper());
    }

    /* renamed from: android.support.v4.content.c$a  reason: invalid class name */
    class HandlerCa extends Handler {
        HandlerCa(Looper x0) {
            super(x0);
        }

        public void handleMessage(Message msg) {
            if (msg.what != 1) {
                super.handleMessage(msg);
            } else {
                Cc.this.m۱۲۶۳۳a();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۶۳۵a(BroadcastReceiver receiver, IntentFilter filter) {
        synchronized (this.f۱۰۴۵۱b) {
            LocalBroadcastManager.ReceiverRecord entry = new Cc(filter, receiver);
            ArrayList<LocalBroadcastManager.ReceiverRecord> filters = this.f۱۰۴۵۱b.get(receiver);
            if (filters == null) {
                filters = new ArrayList<>(1);
                this.f۱۰۴۵۱b.put(receiver, filters);
            }
            filters.add(entry);
            for (int i = 0; i < filter.countActions(); i++) {
                String action = filter.getAction(i);
                ArrayList<LocalBroadcastManager.ReceiverRecord> entries = this.f۱۰۴۵۲c.get(action);
                if (entries == null) {
                    entries = new ArrayList<>(1);
                    this.f۱۰۴۵۲c.put(action, entries);
                }
                entries.add(entry);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۶۳۴a(BroadcastReceiver receiver) {
        synchronized (this.f۱۰۴۵۱b) {
            ArrayList<LocalBroadcastManager.ReceiverRecord> filters = this.f۱۰۴۵۱b.remove(receiver);
            if (filters != null) {
                for (int i = filters.size() - 1; i >= 0; i--) {
                    Cc filter = (Cc) filters.get(i);
                    filter.f۱۰۴۶۱d = true;
                    for (int j = 0; j < filter.f۱۰۴۵۸a.countActions(); j++) {
                        String action = filter.f۱۰۴۵۸a.getAction(j);
                        ArrayList<LocalBroadcastManager.ReceiverRecord> receivers = this.f۱۰۴۵۲c.get(action);
                        if (receivers != null) {
                            for (int k = receivers.size() - 1; k >= 0; k--) {
                                Cc rec = (Cc) receivers.get(k);
                                if (rec.f۱۰۴۵۹b == receiver) {
                                    rec.f۱۰۴۶۱d = true;
                                    receivers.remove(k);
                                }
                            }
                            if (receivers.size() <= 0) {
                                this.f۱۰۴۵۲c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Multiple debug info for r0v9 java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$ReceiverRecord>: [D('type' java.lang.String), D('receivers' java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$ReceiverRecord>)] */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۶۳۶a(Intent intent) {
        int i;
        String type;
        ArrayList<LocalBroadcastManager.ReceiverRecord> receivers;
        String reason;
        synchronized (this.f۱۰۴۵۱b) {
            String action = intent.getAction();
            String type2 = intent.resolveTypeIfNeeded(this.f۱۰۴۵۰a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean debug = (intent.getFlags() & 8) != 0;
            if (debug) {
                Log.v("LocalBroadcastManager", "Resolving type " + type2 + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<LocalBroadcastManager.ReceiverRecord> entries = this.f۱۰۴۵۲c.get(intent.getAction());
            if (entries != null) {
                if (debug) {
                    Log.v("LocalBroadcastManager", "Action list: " + entries);
                }
                ArrayList<LocalBroadcastManager.ReceiverRecord> receivers2 = null;
                int i2 = 0;
                while (i2 < entries.size()) {
                    Cc receiver = entries.get(i2);
                    if (debug) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + receiver.f۱۰۴۵۸a);
                    }
                    if (!receiver.f۱۰۴۶۰c) {
                        type = type2;
                        receivers = receivers2;
                        i = i2;
                        int match = receiver.f۱۰۴۵۸a.match(action, type2, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (debug) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            if (receivers == null) {
                                receivers = new ArrayList<>();
                            }
                            receivers.add(receiver);
                            receiver.f۱۰۴۶۰c = true;
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
                        ((Cc) receivers2.get(i3)).f۱۰۴۶۰c = false;
                    }
                    this.f۱۰۴۵۳d.add(new Cb(intent, receivers2));
                    if (!this.f۱۰۴۵۴e.hasMessages(1)) {
                        this.f۱۰۴۵۴e.sendEmptyMessage(1);
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
        r3 = r2.f۱۰۴۵۷b.size();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r4 >= r3) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r5 = r2.f۱۰۴۵۷b.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r5.f۱۰۴۶۱d != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r5.f۱۰۴۵۹b.onReceive(r9.f۱۰۴۵۰a, r2.f۱۰۴۵۶a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r1 = r1 + 1;
     */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۲۶۳۳a() {
        /*
            r9 = this;
            r0 = 0
        L_0x0001:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.support.v4.content.c$c>> r1 = r9.f۱۰۴۵۱b
            monitor-enter(r1)
            java.util.ArrayList<android.support.v4.content.c$b> r2 = r9.f۱۰۴۵۳d     // Catch:{ all -> 0x0046 }
            int r2 = r2.size()     // Catch:{ all -> 0x0046 }
            if (r2 > 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            return
        L_0x000e:
            android.support.v4.content.c$b[] r0 = new android.support.p۰۴۳v4.content.Cc.Cb[r2]     // Catch:{ all -> 0x0046 }
            java.util.ArrayList<android.support.v4.content.c$b> r3 = r9.f۱۰۴۵۳d     // Catch:{ all -> 0x0049 }
            r3.toArray(r0)     // Catch:{ all -> 0x0049 }
            java.util.ArrayList<android.support.v4.content.c$b> r3 = r9.f۱۰۴۵۳d     // Catch:{ all -> 0x0049 }
            r3.clear()     // Catch:{ all -> 0x0049 }
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            r1 = 0
        L_0x001c:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x0045
            r2 = r0[r1]
            java.util.ArrayList<android.support.v4.content.c$c> r3 = r2.f۱۰۴۵۷b
            int r3 = r3.size()
            r4 = 0
        L_0x0028:
            if (r4 >= r3) goto L_0x0042
            java.util.ArrayList<android.support.v4.content.c$c> r5 = r2.f۱۰۴۵۷b
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.content.c$c r5 = (android.support.p۰۴۳v4.content.Cc.Cc) r5
            boolean r6 = r5.f۱۰۴۶۱d
            if (r6 != 0) goto L_0x003f
            android.content.BroadcastReceiver r6 = r5.f۱۰۴۵۹b
            android.content.Context r7 = r9.f۱۰۴۵۰a
            android.content.Intent r8 = r2.f۱۰۴۵۶a
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۳v4.content.Cc.m۱۲۶۳۳a():void");
    }
}
