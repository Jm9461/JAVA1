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

/* renamed from: android.support.v4.content.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cc {

    /* renamed from: f, reason: contains not printable characters */
    private static final Object f۱۰۴۴۸f = new Object();

    /* renamed from: g, reason: contains not printable characters */
    private static Cc f۱۰۴۴۹g;

    /* renamed from: a, reason: contains not printable characters */
    private final Context f۱۰۴۵۰a;

    /* renamed from: b, reason: contains not printable characters */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f۱۰۴۵۱b = new HashMap<>();

    /* renamed from: c, reason: contains not printable characters */
    private final HashMap<String, ArrayList<c>> f۱۰۴۵۲c = new HashMap<>();

    /* renamed from: d, reason: contains not printable characters */
    private final ArrayList<b> f۱۰۴۵۳d = new ArrayList<>();

    /* renamed from: e, reason: contains not printable characters */
    private final Handler f۱۰۴۵۴e;

    /* renamed from: android.support.v4.content.c$c */
    private static final class c {

        /* renamed from: a, reason: contains not printable characters */
        final IntentFilter f۱۰۴۵۸a;

        /* renamed from: b, reason: contains not printable characters */
        final BroadcastReceiver f۱۰۴۵۹b;

        /* renamed from: c, reason: contains not printable characters */
        boolean f۱۰۴۶۰c;

        /* renamed from: d, reason: contains not printable characters */
        boolean f۱۰۴۶۱d;

        c(IntentFilter _filter, BroadcastReceiver _receiver) {
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

    /* renamed from: android.support.v4.content.c$b */
    private static final class b {

        /* renamed from: a, reason: contains not printable characters */
        final Intent f۱۰۴۵۶a;

        /* renamed from: b, reason: contains not printable characters */
        final ArrayList<c> f۱۰۴۵۷b;

        b(Intent _intent, ArrayList<c> arrayList) {
            this.f۱۰۴۵۶a = _intent;
            this.f۱۰۴۵۷b = arrayList;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cc m۱۰۵۶۲a(Context context) {
        Cc cc;
        synchronized (f۱۰۴۴۸f) {
            if (f۱۰۴۴۹g == null) {
                f۱۰۴۴۹g = new Cc(context.getApplicationContext());
            }
            cc = f۱۰۴۴۹g;
        }
        return cc;
    }

    private Cc(Context context) {
        this.f۱۰۴۵۰a = context;
        this.f۱۰۴۵۴e = new a(context.getMainLooper());
    }

    /* renamed from: android.support.v4.content.c$a */
    class a extends Handler {
        a(Looper x0) {
            super(x0);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (msg.what == 1) {
                Cc.this.m۱۰۵۶۳a();
            } else {
                super.handleMessage(msg);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۵۶۵a(BroadcastReceiver receiver, IntentFilter filter) {
        synchronized (this.f۱۰۴۵۱b) {
            c entry = new c(filter, receiver);
            ArrayList<c> arrayList = this.f۱۰۴۵۱b.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f۱۰۴۵۱b.put(receiver, arrayList);
            }
            arrayList.add(entry);
            for (int i = 0; i < filter.countActions(); i++) {
                String action = filter.getAction(i);
                ArrayList<c> arrayList2 = this.f۱۰۴۵۲c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f۱۰۴۵۲c.put(action, arrayList2);
                }
                arrayList2.add(entry);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۵۶۴a(BroadcastReceiver receiver) {
        synchronized (this.f۱۰۴۵۱b) {
            ArrayList<c> remove = this.f۱۰۴۵۱b.remove(receiver);
            if (remove == null) {
                return;
            }
            for (int i = remove.size() - 1; i >= 0; i--) {
                c filter = remove.get(i);
                filter.f۱۰۴۶۱d = true;
                for (int j = 0; j < filter.f۱۰۴۵۸a.countActions(); j++) {
                    String action = filter.f۱۰۴۵۸a.getAction(j);
                    ArrayList<c> arrayList = this.f۱۰۴۵۲c.get(action);
                    if (arrayList != null) {
                        for (int k = arrayList.size() - 1; k >= 0; k--) {
                            c rec = arrayList.get(k);
                            if (rec.f۱۰۴۵۹b == receiver) {
                                rec.f۱۰۴۶۱d = true;
                                arrayList.remove(k);
                            }
                        }
                        int k2 = arrayList.size();
                        if (k2 <= 0) {
                            this.f۱۰۴۵۲c.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۵۶۶a(Intent intent) {
        String type;
        ArrayList<LocalBroadcastManager.ReceiverRecord> receivers;
        int i;
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
            ArrayList<c> arrayList = this.f۱۰۴۵۲c.get(intent.getAction());
            if (arrayList != null) {
                if (debug) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                }
                ArrayList<LocalBroadcastManager.ReceiverRecord> receivers2 = null;
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    c receiver = arrayList.get(i2);
                    if (debug) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + receiver.f۱۰۴۵۸a);
                    }
                    if (receiver.f۱۰۴۶۰c) {
                        if (!debug) {
                            type = type2;
                            receivers = receivers2;
                            i = i2;
                        } else {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                            type = type2;
                            receivers = receivers2;
                            i = i2;
                        }
                    } else {
                        String str = type2;
                        type = type2;
                        receivers = receivers2;
                        i = i2;
                        int match = receiver.f۱۰۴۵۸a.match(action, str, scheme, data, categories, "LocalBroadcastManager");
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
                            } else if (match == -1) {
                                reason = "type";
                            } else {
                                reason = "unknown reason";
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + reason);
                        }
                    }
                    receivers2 = receivers;
                    i2 = i + 1;
                    type2 = type;
                }
                ArrayList<LocalBroadcastManager.ReceiverRecord> receivers3 = receivers2;
                if (receivers3 != null) {
                    for (int i3 = 0; i3 < receivers3.size(); i3++) {
                        ((c) receivers3.get(i3)).f۱۰۴۶۰c = false;
                    }
                    this.f۱۰۴۵۳d.add(new b(intent, receivers3));
                    if (!this.f۱۰۴۵۴e.hasMessages(1)) {
                        this.f۱۰۴۵۴e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x0049
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۵۶۳a() {
        /*
            r9 = this;
            r0 = 0
        L1:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.support.v4.content.c$c>> r1 = r9.f۱۰۴۵۱b
            monitor-enter(r1)
            java.util.ArrayList<android.support.v4.content.c$b> r2 = r9.f۱۰۴۵۳d     // Catch: java.lang.Throwable -> L46
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L46
            if (r2 > 0) goto Le
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            return
        Le:
            android.support.v4.content.c$b[] r0 = new android.support.v4.content.Cc.b[r2]     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList<android.support.v4.content.c$b> r3 = r9.f۱۰۴۵۳d     // Catch: java.lang.Throwable -> L49
            r3.toArray(r0)     // Catch: java.lang.Throwable -> L49
            java.util.ArrayList<android.support.v4.content.c$b> r3 = r9.f۱۰۴۵۳d     // Catch: java.lang.Throwable -> L49
            r3.clear()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            r1 = 0
        L1c:
            int r2 = r0.length
            if (r1 >= r2) goto L45
            r2 = r0[r1]
            java.util.ArrayList<android.support.v4.content.c$c> r3 = r2.f۱۰۴۵۷b
            int r3 = r3.size()
            r4 = 0
        L28:
            if (r4 >= r3) goto L42
            java.util.ArrayList<android.support.v4.content.c$c> r5 = r2.f۱۰۴۵۷b
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.content.c$c r5 = (android.support.v4.content.Cc.c) r5
            boolean r6 = r5.f۱۰۴۶۱d
            if (r6 != 0) goto L3f
            android.content.BroadcastReceiver r6 = r5.f۱۰۴۵۹b
            android.content.Context r7 = r9.f۱۰۴۵۰a
            android.content.Intent r8 = r2.f۱۰۴۵۶a
            r6.onReceive(r7, r8)
        L3f:
            int r4 = r4 + 1
            goto L28
        L42:
            int r1 = r1 + 1
            goto L1c
        L45:
            goto L1
        L46:
            r2 = move-exception
        L47:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            throw r2
        L49:
            r2 = move-exception
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.Cc.m۱۰۵۶۳a():void");
    }
}
