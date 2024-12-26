package android.support.v4.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Cx;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.app.y, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cy implements InterfaceCw {

    /* renamed from: a, reason: contains not printable characters */
    private final Notification.Builder f۱۰۴۲۹a;

    /* renamed from: b, reason: contains not printable characters */
    private final Cx.c f۱۰۴۳۰b;

    /* renamed from: c, reason: contains not printable characters */
    private RemoteViews f۱۰۴۳۱c;

    /* renamed from: d, reason: contains not printable characters */
    private RemoteViews f۱۰۴۳۲d;

    /* renamed from: e, reason: contains not printable characters */
    private final List<Bundle> f۱۰۴۳۳e = new ArrayList();

    /* renamed from: f, reason: contains not printable characters */
    private final Bundle f۱۰۴۳۴f = new Bundle();

    /* renamed from: g, reason: contains not printable characters */
    private int f۱۰۴۳۵g;

    /* renamed from: h, reason: contains not printable characters */
    private RemoteViews f۱۰۴۳۶h;

    Cy(Cx.c b2) {
        ArrayList<String> arrayList;
        this.f۱۰۴۳۰b = b2;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f۱۰۴۲۹a = new Notification.Builder(b2.f۱۰۳۹۹a, b2.f۱۰۳۹۲I);
        } else {
            this.f۱۰۴۲۹a = new Notification.Builder(b2.f۱۰۳۹۹a);
        }
        Notification n = b2.f۱۰۳۹۷N;
        this.f۱۰۴۲۹a.setWhen(n.when).setSmallIcon(n.icon, n.iconLevel).setContent(n.contentView).setTicker(n.tickerText, b2.f۱۰۴۰۶h).setVibrate(n.vibrate).setLights(n.ledARGB, n.ledOnMS, n.ledOffMS).setOngoing((n.flags & 2) != 0).setOnlyAlertOnce((n.flags & 8) != 0).setAutoCancel((n.flags & 16) != 0).setDefaults(n.defaults).setContentTitle(b2.f۱۰۴۰۲d).setContentText(b2.f۱۰۴۰۳e).setContentInfo(b2.f۱۰۴۰۸j).setContentIntent(b2.f۱۰۴۰۴f).setDeleteIntent(n.deleteIntent).setFullScreenIntent(b2.f۱۰۴۰۵g, (n.flags & 128) != 0).setLargeIcon(b2.f۱۰۴۰۷i).setNumber(b2.f۱۰۴۰۹k).setProgress(b2.f۱۰۴۱۶r, b2.f۱۰۴۱۷s, b2.f۱۰۴۱۸t);
        if (Build.VERSION.SDK_INT < 21) {
            this.f۱۰۴۲۹a.setSound(n.sound, n.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۰۴۲۹a.setSubText(b2.f۱۰۴۱۴p).setUsesChronometer(b2.f۱۰۴۱۲n).setPriority(b2.f۱۰۴۱۰l);
            Iterator<Cx.a> it = b2.f۱۰۴۰۰b.iterator();
            while (it.hasNext()) {
                Cx.a action = it.next();
                m۱۰۵۲۸a(action);
            }
            Bundle bundle = b2.f۱۰۳۸۵B;
            if (bundle != null) {
                this.f۱۰۴۳۴f.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (b2.f۱۰۴۲۲x) {
                    this.f۱۰۴۳۴f.putBoolean("android.support.localOnly", true);
                }
                String str = b2.f۱۰۴۱۹u;
                if (str != null) {
                    this.f۱۰۴۳۴f.putString("android.support.groupKey", str);
                    if (b2.f۱۰۴۲۰v) {
                        this.f۱۰۴۳۴f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f۱۰۴۳۴f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = b2.f۱۰۴۲۱w;
                if (str2 != null) {
                    this.f۱۰۴۳۴f.putString("android.support.sortKey", str2);
                }
            }
            this.f۱۰۴۳۱c = b2.f۱۰۳۸۹F;
            this.f۱۰۴۳۲d = b2.f۱۰۳۹۰G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۰۴۲۹a.setShowWhen(b2.f۱۰۴۱۱m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = b2.f۱۰۳۹۸O) != null && !arrayList.isEmpty()) {
                Bundle bundle2 = this.f۱۰۴۳۴f;
                ArrayList<String> arrayList2 = b2.f۱۰۳۹۸O;
                bundle2.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f۱۰۴۲۹a.setLocalOnly(b2.f۱۰۴۲۲x).setGroup(b2.f۱۰۴۱۹u).setGroupSummary(b2.f۱۰۴۲۰v).setSortKey(b2.f۱۰۴۲۱w);
            this.f۱۰۴۳۵g = b2.f۱۰۳۹۶M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f۱۰۴۲۹a.setCategory(b2.f۱۰۳۸۴A).setColor(b2.f۱۰۳۸۶C).setVisibility(b2.f۱۰۳۸۷D).setPublicVersion(b2.f۱۰۳۸۸E).setSound(n.sound, n.audioAttributes);
            Iterator<String> it2 = b2.f۱۰۳۹۸O.iterator();
            while (it2.hasNext()) {
                String person = it2.next();
                this.f۱۰۴۲۹a.addPerson(person);
            }
            this.f۱۰۴۳۶h = b2.f۱۰۳۹۱H;
            if (b2.f۱۰۴۰۱c.size() > 0) {
                Bundle carExtenderBundle = b2.m۱۰۵۱۷b().getBundle("android.car.EXTENSIONS");
                carExtenderBundle = carExtenderBundle == null ? new Bundle() : carExtenderBundle;
                Bundle listBundle = new Bundle();
                for (int i = 0; i < b2.f۱۰۴۰۱c.size(); i++) {
                    listBundle.putBundle(Integer.toString(i), Cz.m۱۰۵۳۵a(b2.f۱۰۴۰۱c.get(i)));
                }
                carExtenderBundle.putBundle("invisible_actions", listBundle);
                b2.m۱۰۵۱۷b().putBundle("android.car.EXTENSIONS", carExtenderBundle);
                this.f۱۰۴۳۴f.putBundle("android.car.EXTENSIONS", carExtenderBundle);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f۱۰۴۲۹a.setExtras(b2.f۱۰۳۸۵B).setRemoteInputHistory(b2.f۱۰۴۱۵q);
            RemoteViews remoteViews = b2.f۱۰۳۸۹F;
            if (remoteViews != null) {
                this.f۱۰۴۲۹a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = b2.f۱۰۳۹۰G;
            if (remoteViews2 != null) {
                this.f۱۰۴۲۹a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = b2.f۱۰۳۹۱H;
            if (remoteViews3 != null) {
                this.f۱۰۴۲۹a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f۱۰۴۲۹a.setBadgeIconType(b2.f۱۰۳۹۳J).setShortcutId(b2.f۱۰۳۹۴K).setTimeoutAfter(b2.f۱۰۳۹۵L).setGroupAlertBehavior(b2.f۱۰۳۹۶M);
            if (b2.f۱۰۴۲۴z) {
                this.f۱۰۴۲۹a.setColorized(b2.f۱۰۴۲۳y);
            }
            if (!TextUtils.isEmpty(b2.f۱۰۳۹۲I)) {
                this.f۱۰۴۲۹a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    @Override // android.support.v4.app.InterfaceCw
    /* renamed from: a, reason: contains not printable characters */
    public Notification.Builder mo۱۰۵۲۹a() {
        return this.f۱۰۴۲۹a;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Notification m۱۰۵۳۰b() {
        Bundle extras;
        RemoteViews styleHeadsUpContentView;
        RemoteViews styleBigContentView;
        Cx.d style = this.f۱۰۴۳۰b.f۱۰۴۱۳o;
        if (style != null) {
            style.mo۱۰۵۲۲a(this);
        }
        RemoteViews styleContentView = style != null ? style.m۱۰۵۲۵c(this) : null;
        Notification n = m۱۰۵۳۱c();
        if (styleContentView != null) {
            n.contentView = styleContentView;
        } else {
            RemoteViews remoteViews = this.f۱۰۴۳۰b.f۱۰۳۸۹F;
            if (remoteViews != null) {
                n.contentView = remoteViews;
            }
        }
        if (Build.VERSION.SDK_INT >= 16 && style != null && (styleBigContentView = style.m۱۰۵۲۴b(this)) != null) {
            n.bigContentView = styleBigContentView;
        }
        if (Build.VERSION.SDK_INT >= 21 && style != null && (styleHeadsUpContentView = this.f۱۰۴۳۰b.f۱۰۴۱۳o.m۱۰۵۲۶d(this)) != null) {
            n.headsUpContentView = styleHeadsUpContentView;
        }
        if (Build.VERSION.SDK_INT >= 16 && style != null && (extras = Cx.m۱۰۴۹۶a(n)) != null) {
            style.m۱۰۵۲۱a(extras);
        }
        return n;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۰۵۲۸a(Cx.a action) {
        Bundle actionExtras;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            Notification.Action.Builder actionBuilder = new Notification.Action.Builder(action.m۱۰۵۰۱e(), action.m۱۰۵۰۵i(), action.m۱۰۴۹۷a());
            if (action.m۱۰۵۰۲f() != null) {
                for (RemoteInput remoteInput : Cb0.m۱۰۰۰۱a(action.m۱۰۵۰۲f())) {
                    actionBuilder.addRemoteInput(remoteInput);
                }
            }
            if (action.m۱۰۵۰۰d() != null) {
                actionExtras = new Bundle(action.m۱۰۵۰۰d());
            } else {
                actionExtras = new Bundle();
            }
            actionExtras.putBoolean("android.support.allowGeneratedReplies", action.m۱۰۴۹۸b());
            if (Build.VERSION.SDK_INT >= 24) {
                actionBuilder.setAllowGeneratedReplies(action.m۱۰۴۹۸b());
            }
            actionExtras.putInt("android.support.action.semanticAction", action.m۱۰۵۰۳g());
            if (Build.VERSION.SDK_INT >= 28) {
                actionBuilder.setSemanticAction(action.m۱۰۵۰۳g());
            }
            actionExtras.putBoolean("android.support.action.showsUserInterface", action.m۱۰۵۰۴h());
            actionBuilder.addExtras(actionExtras);
            this.f۱۰۴۲۹a.addAction(actionBuilder.build());
            return;
        }
        if (i >= 16) {
            this.f۱۰۴۳۳e.add(Cz.m۱۰۵۳۲a(this.f۱۰۴۲۹a, action));
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    protected Notification m۱۰۵۳۱c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f۱۰۴۲۹a.build();
        }
        if (i >= 24) {
            Notification notification = this.f۱۰۴۲۹a.build();
            if (this.f۱۰۴۳۵g != 0) {
                if (notification.getGroup() != null && (notification.flags & 512) != 0 && this.f۱۰۴۳۵g == 2) {
                    m۱۰۵۲۷a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && this.f۱۰۴۳۵g == 1) {
                    m۱۰۵۲۷a(notification);
                }
            }
            return notification;
        }
        if (i >= 21) {
            this.f۱۰۴۲۹a.setExtras(this.f۱۰۴۳۴f);
            Notification notification2 = this.f۱۰۴۲۹a.build();
            RemoteViews remoteViews = this.f۱۰۴۳۱c;
            if (remoteViews != null) {
                notification2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f۱۰۴۳۲d;
            if (remoteViews2 != null) {
                notification2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f۱۰۴۳۶h;
            if (remoteViews3 != null) {
                notification2.headsUpContentView = remoteViews3;
            }
            if (this.f۱۰۴۳۵g != 0) {
                if (notification2.getGroup() != null && (notification2.flags & 512) != 0 && this.f۱۰۴۳۵g == 2) {
                    m۱۰۵۲۷a(notification2);
                }
                if (notification2.getGroup() != null && (notification2.flags & 512) == 0 && this.f۱۰۴۳۵g == 1) {
                    m۱۰۵۲۷a(notification2);
                }
            }
            return notification2;
        }
        if (i >= 20) {
            this.f۱۰۴۲۹a.setExtras(this.f۱۰۴۳۴f);
            Notification notification3 = this.f۱۰۴۲۹a.build();
            RemoteViews remoteViews4 = this.f۱۰۴۳۱c;
            if (remoteViews4 != null) {
                notification3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f۱۰۴۳۲d;
            if (remoteViews5 != null) {
                notification3.bigContentView = remoteViews5;
            }
            if (this.f۱۰۴۳۵g != 0) {
                if (notification3.getGroup() != null && (notification3.flags & 512) != 0 && this.f۱۰۴۳۵g == 2) {
                    m۱۰۵۲۷a(notification3);
                }
                if (notification3.getGroup() != null && (notification3.flags & 512) == 0 && this.f۱۰۴۳۵g == 1) {
                    m۱۰۵۲۷a(notification3);
                }
            }
            return notification3;
        }
        if (i >= 19) {
            SparseArray<Bundle> actionExtrasMap = Cz.m۱۰۵۳۶a(this.f۱۰۴۳۳e);
            if (actionExtrasMap != null) {
                this.f۱۰۴۳۴f.putSparseParcelableArray("android.support.actionExtras", actionExtrasMap);
            }
            this.f۱۰۴۲۹a.setExtras(this.f۱۰۴۳۴f);
            Notification notification4 = this.f۱۰۴۲۹a.build();
            RemoteViews remoteViews6 = this.f۱۰۴۳۱c;
            if (remoteViews6 != null) {
                notification4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f۱۰۴۳۲d;
            if (remoteViews7 != null) {
                notification4.bigContentView = remoteViews7;
            }
            return notification4;
        }
        if (i >= 16) {
            Notification notification5 = this.f۱۰۴۲۹a.build();
            Bundle extras = Cx.m۱۰۴۹۶a(notification5);
            Bundle mergeBundle = new Bundle(this.f۱۰۴۳۴f);
            for (String key : this.f۱۰۴۳۴f.keySet()) {
                if (extras.containsKey(key)) {
                    mergeBundle.remove(key);
                }
            }
            extras.putAll(mergeBundle);
            SparseArray<Bundle> actionExtrasMap2 = Cz.m۱۰۵۳۶a(this.f۱۰۴۳۳e);
            if (actionExtrasMap2 != null) {
                Cx.m۱۰۴۹۶a(notification5).putSparseParcelableArray("android.support.actionExtras", actionExtrasMap2);
            }
            RemoteViews remoteViews8 = this.f۱۰۴۳۱c;
            if (remoteViews8 != null) {
                notification5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f۱۰۴۳۲d;
            if (remoteViews9 != null) {
                notification5.bigContentView = remoteViews9;
            }
            return notification5;
        }
        return this.f۱۰۴۲۹a.getNotification();
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۰۵۲۷a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
