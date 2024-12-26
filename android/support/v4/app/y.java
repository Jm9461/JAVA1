package android.support.v4.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.x;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class y implements w {

    /* renamed from: a  reason: collision with root package name */
    private final Notification.Builder f۱۲۳۱a;

    /* renamed from: b  reason: collision with root package name */
    private final x.c f۱۲۳۲b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteViews f۱۲۳۳c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f۱۲۳۴d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Bundle> f۱۲۳۵e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f۱۲۳۶f = new Bundle();

    /* renamed from: g  reason: collision with root package name */
    private int f۱۲۳۷g;

    /* renamed from: h  reason: collision with root package name */
    private RemoteViews f۱۲۳۸h;

    y(x.c b2) {
        ArrayList<String> arrayList;
        this.f۱۲۳۲b = b2;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f۱۲۳۱a = new Notification.Builder(b2.f۱۲۱۹a, b2.I);
        } else {
            this.f۱۲۳۱a = new Notification.Builder(b2.f۱۲۱۹a);
        }
        Notification n = b2.N;
        this.f۱۲۳۱a.setWhen(n.when).setSmallIcon(n.icon, n.iconLevel).setContent(n.contentView).setTicker(n.tickerText, b2.f۱۲۲۶h).setVibrate(n.vibrate).setLights(n.ledARGB, n.ledOnMS, n.ledOffMS).setOngoing((n.flags & 2) != 0).setOnlyAlertOnce((n.flags & 8) != 0).setAutoCancel((n.flags & 16) != 0).setDefaults(n.defaults).setContentTitle(b2.f۱۲۲۲d).setContentText(b2.f۱۲۲۳e).setContentInfo(b2.j).setContentIntent(b2.f۱۲۲۴f).setDeleteIntent(n.deleteIntent).setFullScreenIntent(b2.f۱۲۲۵g, (n.flags & 128) != 0).setLargeIcon(b2.i).setNumber(b2.k).setProgress(b2.r, b2.s, b2.t);
        if (Build.VERSION.SDK_INT < 21) {
            this.f۱۲۳۱a.setSound(n.sound, n.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۲۳۱a.setSubText(b2.p).setUsesChronometer(b2.n).setPriority(b2.l);
            Iterator<x.a> it = b2.f۱۲۲۰b.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            Bundle bundle = b2.B;
            if (bundle != null) {
                this.f۱۲۳۶f.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (b2.x) {
                    this.f۱۲۳۶f.putBoolean("android.support.localOnly", true);
                }
                String str = b2.u;
                if (str != null) {
                    this.f۱۲۳۶f.putString("android.support.groupKey", str);
                    if (b2.v) {
                        this.f۱۲۳۶f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f۱۲۳۶f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = b2.w;
                if (str2 != null) {
                    this.f۱۲۳۶f.putString("android.support.sortKey", str2);
                }
            }
            this.f۱۲۳۳c = b2.F;
            this.f۱۲۳۴d = b2.G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۲۳۱a.setShowWhen(b2.m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = b2.O) != null && !arrayList.isEmpty()) {
                Bundle bundle2 = this.f۱۲۳۶f;
                ArrayList<String> arrayList2 = b2.O;
                bundle2.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f۱۲۳۱a.setLocalOnly(b2.x).setGroup(b2.u).setGroupSummary(b2.v).setSortKey(b2.w);
            this.f۱۲۳۷g = b2.M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f۱۲۳۱a.setCategory(b2.A).setColor(b2.C).setVisibility(b2.D).setPublicVersion(b2.E).setSound(n.sound, n.audioAttributes);
            Iterator<String> it2 = b2.O.iterator();
            while (it2.hasNext()) {
                this.f۱۲۳۱a.addPerson(it2.next());
            }
            this.f۱۲۳۸h = b2.H;
            if (b2.f۱۲۲۱c.size() > 0) {
                Bundle carExtenderBundle = b2.b().getBundle("android.car.EXTENSIONS");
                carExtenderBundle = carExtenderBundle == null ? new Bundle() : carExtenderBundle;
                Bundle listBundle = new Bundle();
                for (int i = 0; i < b2.f۱۲۲۱c.size(); i++) {
                    listBundle.putBundle(Integer.toString(i), z.a(b2.f۱۲۲۱c.get(i)));
                }
                carExtenderBundle.putBundle("invisible_actions", listBundle);
                b2.b().putBundle("android.car.EXTENSIONS", carExtenderBundle);
                this.f۱۲۳۶f.putBundle("android.car.EXTENSIONS", carExtenderBundle);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f۱۲۳۱a.setExtras(b2.B).setRemoteInputHistory(b2.q);
            RemoteViews remoteViews = b2.F;
            if (remoteViews != null) {
                this.f۱۲۳۱a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = b2.G;
            if (remoteViews2 != null) {
                this.f۱۲۳۱a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = b2.H;
            if (remoteViews3 != null) {
                this.f۱۲۳۱a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f۱۲۳۱a.setBadgeIconType(b2.J).setShortcutId(b2.K).setTimeoutAfter(b2.L).setGroupAlertBehavior(b2.M);
            if (b2.z) {
                this.f۱۲۳۱a.setColorized(b2.y);
            }
            if (!TextUtils.isEmpty(b2.I)) {
                this.f۱۲۳۱a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    @Override // android.support.v4.app.w
    public Notification.Builder a() {
        return this.f۱۲۳۱a;
    }

    public Notification b() {
        Bundle extras;
        RemoteViews styleHeadsUpContentView;
        RemoteViews styleBigContentView;
        x.d style = this.f۱۲۳۲b.o;
        if (style != null) {
            style.a(this);
        }
        RemoteViews styleContentView = style != null ? style.c(this) : null;
        Notification n = c();
        if (styleContentView != null) {
            n.contentView = styleContentView;
        } else {
            RemoteViews remoteViews = this.f۱۲۳۲b.F;
            if (remoteViews != null) {
                n.contentView = remoteViews;
            }
        }
        if (!(Build.VERSION.SDK_INT < 16 || style == null || (styleBigContentView = style.b(this)) == null)) {
            n.bigContentView = styleBigContentView;
        }
        if (!(Build.VERSION.SDK_INT < 21 || style == null || (styleHeadsUpContentView = this.f۱۲۳۲b.o.d(this)) == null)) {
            n.headsUpContentView = styleHeadsUpContentView;
        }
        if (!(Build.VERSION.SDK_INT < 16 || style == null || (extras = x.a(n)) == null)) {
            style.a(extras);
        }
        return n;
    }

    private void a(x.a action) {
        Bundle actionExtras;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            Notification.Action.Builder actionBuilder = new Notification.Action.Builder(action.e(), action.i(), action.a());
            if (action.f() != null) {
                for (RemoteInput remoteInput : b0.a(action.f())) {
                    actionBuilder.addRemoteInput(remoteInput);
                }
            }
            if (action.d() != null) {
                actionExtras = new Bundle(action.d());
            } else {
                actionExtras = new Bundle();
            }
            actionExtras.putBoolean("android.support.allowGeneratedReplies", action.b());
            if (Build.VERSION.SDK_INT >= 24) {
                actionBuilder.setAllowGeneratedReplies(action.b());
            }
            actionExtras.putInt("android.support.action.semanticAction", action.g());
            if (Build.VERSION.SDK_INT >= 28) {
                actionBuilder.setSemanticAction(action.g());
            }
            actionExtras.putBoolean("android.support.action.showsUserInterface", action.h());
            actionBuilder.addExtras(actionExtras);
            this.f۱۲۳۱a.addAction(actionBuilder.build());
        } else if (i >= 16) {
            this.f۱۲۳۵e.add(z.a(this.f۱۲۳۱a, action));
        }
    }

    /* access modifiers changed from: protected */
    public Notification c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f۱۲۳۱a.build();
        }
        if (i >= 24) {
            Notification notification = this.f۱۲۳۱a.build();
            if (this.f۱۲۳۷g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || this.f۱۲۳۷g != 2)) {
                    a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && this.f۱۲۳۷g == 1) {
                    a(notification);
                }
            }
            return notification;
        } else if (i >= 21) {
            this.f۱۲۳۱a.setExtras(this.f۱۲۳۶f);
            Notification notification2 = this.f۱۲۳۱a.build();
            RemoteViews remoteViews = this.f۱۲۳۳c;
            if (remoteViews != null) {
                notification2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f۱۲۳۴d;
            if (remoteViews2 != null) {
                notification2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f۱۲۳۸h;
            if (remoteViews3 != null) {
                notification2.headsUpContentView = remoteViews3;
            }
            if (this.f۱۲۳۷g != 0) {
                if (!(notification2.getGroup() == null || (notification2.flags & 512) == 0 || this.f۱۲۳۷g != 2)) {
                    a(notification2);
                }
                if (notification2.getGroup() != null && (notification2.flags & 512) == 0 && this.f۱۲۳۷g == 1) {
                    a(notification2);
                }
            }
            return notification2;
        } else if (i >= 20) {
            this.f۱۲۳۱a.setExtras(this.f۱۲۳۶f);
            Notification notification3 = this.f۱۲۳۱a.build();
            RemoteViews remoteViews4 = this.f۱۲۳۳c;
            if (remoteViews4 != null) {
                notification3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f۱۲۳۴d;
            if (remoteViews5 != null) {
                notification3.bigContentView = remoteViews5;
            }
            if (this.f۱۲۳۷g != 0) {
                if (!(notification3.getGroup() == null || (notification3.flags & 512) == 0 || this.f۱۲۳۷g != 2)) {
                    a(notification3);
                }
                if (notification3.getGroup() != null && (notification3.flags & 512) == 0 && this.f۱۲۳۷g == 1) {
                    a(notification3);
                }
            }
            return notification3;
        } else if (i >= 19) {
            SparseArray<Bundle> actionExtrasMap = z.a(this.f۱۲۳۵e);
            if (actionExtrasMap != null) {
                this.f۱۲۳۶f.putSparseParcelableArray("android.support.actionExtras", actionExtrasMap);
            }
            this.f۱۲۳۱a.setExtras(this.f۱۲۳۶f);
            Notification notification4 = this.f۱۲۳۱a.build();
            RemoteViews remoteViews6 = this.f۱۲۳۳c;
            if (remoteViews6 != null) {
                notification4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f۱۲۳۴d;
            if (remoteViews7 != null) {
                notification4.bigContentView = remoteViews7;
            }
            return notification4;
        } else if (i < 16) {
            return this.f۱۲۳۱a.getNotification();
        } else {
            Notification notification5 = this.f۱۲۳۱a.build();
            Bundle extras = x.a(notification5);
            Bundle mergeBundle = new Bundle(this.f۱۲۳۶f);
            for (String key : this.f۱۲۳۶f.keySet()) {
                if (extras.containsKey(key)) {
                    mergeBundle.remove(key);
                }
            }
            extras.putAll(mergeBundle);
            SparseArray<Bundle> actionExtrasMap2 = z.a(this.f۱۲۳۵e);
            if (actionExtrasMap2 != null) {
                x.a(notification5).putSparseParcelableArray("android.support.actionExtras", actionExtrasMap2);
            }
            RemoteViews remoteViews8 = this.f۱۲۳۳c;
            if (remoteViews8 != null) {
                notification5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f۱۲۳۴d;
            if (remoteViews9 != null) {
                notification5.bigContentView = remoteViews9;
            }
            return notification5;
        }
    }

    private void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
