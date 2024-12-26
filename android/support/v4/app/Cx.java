package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import p۱۵۹a.p۱۶۴b.p۱۶۵a.Cb;

/* renamed from: android.support.v4.app.x, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cx {

    /* renamed from: android.support.v4.app.x$c */
    public static class c {

        /* renamed from: A, reason: contains not printable characters */
        String f۱۰۳۸۴A;

        /* renamed from: B, reason: contains not printable characters */
        Bundle f۱۰۳۸۵B;

        /* renamed from: E, reason: contains not printable characters */
        Notification f۱۰۳۸۸E;

        /* renamed from: F, reason: contains not printable characters */
        RemoteViews f۱۰۳۸۹F;

        /* renamed from: G, reason: contains not printable characters */
        RemoteViews f۱۰۳۹۰G;

        /* renamed from: H, reason: contains not printable characters */
        RemoteViews f۱۰۳۹۱H;

        /* renamed from: I, reason: contains not printable characters */
        String f۱۰۳۹۲I;

        /* renamed from: K, reason: contains not printable characters */
        String f۱۰۳۹۴K;

        /* renamed from: L, reason: contains not printable characters */
        long f۱۰۳۹۵L;

        /* renamed from: O, reason: contains not printable characters */
        @Deprecated
        public ArrayList<String> f۱۰۳۹۸O;

        /* renamed from: a, reason: contains not printable characters */
        public Context f۱۰۳۹۹a;

        /* renamed from: d, reason: contains not printable characters */
        CharSequence f۱۰۴۰۲d;

        /* renamed from: e, reason: contains not printable characters */
        CharSequence f۱۰۴۰۳e;

        /* renamed from: f, reason: contains not printable characters */
        PendingIntent f۱۰۴۰۴f;

        /* renamed from: g, reason: contains not printable characters */
        PendingIntent f۱۰۴۰۵g;

        /* renamed from: h, reason: contains not printable characters */
        RemoteViews f۱۰۴۰۶h;

        /* renamed from: i, reason: contains not printable characters */
        Bitmap f۱۰۴۰۷i;

        /* renamed from: j, reason: contains not printable characters */
        CharSequence f۱۰۴۰۸j;

        /* renamed from: k, reason: contains not printable characters */
        int f۱۰۴۰۹k;

        /* renamed from: l, reason: contains not printable characters */
        int f۱۰۴۱۰l;

        /* renamed from: n, reason: contains not printable characters */
        boolean f۱۰۴۱۲n;

        /* renamed from: o, reason: contains not printable characters */
        d f۱۰۴۱۳o;

        /* renamed from: p, reason: contains not printable characters */
        CharSequence f۱۰۴۱۴p;

        /* renamed from: q, reason: contains not printable characters */
        CharSequence[] f۱۰۴۱۵q;

        /* renamed from: r, reason: contains not printable characters */
        int f۱۰۴۱۶r;

        /* renamed from: s, reason: contains not printable characters */
        int f۱۰۴۱۷s;

        /* renamed from: t, reason: contains not printable characters */
        boolean f۱۰۴۱۸t;

        /* renamed from: u, reason: contains not printable characters */
        String f۱۰۴۱۹u;

        /* renamed from: v, reason: contains not printable characters */
        boolean f۱۰۴۲۰v;

        /* renamed from: w, reason: contains not printable characters */
        String f۱۰۴۲۱w;

        /* renamed from: y, reason: contains not printable characters */
        boolean f۱۰۴۲۳y;

        /* renamed from: z, reason: contains not printable characters */
        boolean f۱۰۴۲۴z;

        /* renamed from: b, reason: contains not printable characters */
        public ArrayList<a> f۱۰۴۰۰b = new ArrayList<>();

        /* renamed from: c, reason: contains not printable characters */
        ArrayList<a> f۱۰۴۰۱c = new ArrayList<>();

        /* renamed from: m, reason: contains not printable characters */
        boolean f۱۰۴۱۱m = true;

        /* renamed from: x, reason: contains not printable characters */
        boolean f۱۰۴۲۲x = false;

        /* renamed from: C, reason: contains not printable characters */
        int f۱۰۳۸۶C = 0;

        /* renamed from: D, reason: contains not printable characters */
        int f۱۰۳۸۷D = 0;

        /* renamed from: J, reason: contains not printable characters */
        int f۱۰۳۹۳J = 0;

        /* renamed from: M, reason: contains not printable characters */
        int f۱۰۳۹۶M = 0;

        /* renamed from: N, reason: contains not printable characters */
        Notification f۱۰۳۹۷N = new Notification();

        public c(Context context, String channelId) {
            this.f۱۰۳۹۹a = context;
            this.f۱۰۳۹۲I = channelId;
            this.f۱۰۳۹۷N.when = System.currentTimeMillis();
            this.f۱۰۳۹۷N.audioStreamType = -1;
            this.f۱۰۴۱۰l = 0;
            this.f۱۰۳۹۸O = new ArrayList<>();
        }

        /* renamed from: a, reason: contains not printable characters */
        public c m۱۰۵۱۲a(long when) {
            this.f۱۰۳۹۷N.when = when;
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public c m۱۰۵۲۰c(int icon) {
            this.f۱۰۳۹۷N.icon = icon;
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public c m۱۰۵۱۹b(CharSequence title) {
            this.f۱۰۴۰۲d = m۱۰۵۰۹c(title);
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public c m۱۰۵۱۶a(CharSequence text) {
            this.f۱۰۴۰۳e = m۱۰۵۰۹c(text);
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public c m۱۰۵۱۳a(PendingIntent intent) {
            this.f۱۰۴۰۴f = intent;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public c m۱۰۵۱۴a(Bitmap icon) {
            this.f۱۰۴۰۷i = m۱۰۵۰۸b(icon);
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        private Bitmap m۱۰۵۰۸b(Bitmap icon) {
            if (icon == null || Build.VERSION.SDK_INT >= 27) {
                return icon;
            }
            Resources res = this.f۱۰۳۹۹a.getResources();
            int maxWidth = res.getDimensionPixelSize(Cb.compat_notification_large_icon_max_width);
            int maxHeight = res.getDimensionPixelSize(Cb.compat_notification_large_icon_max_height);
            if (icon.getWidth() <= maxWidth && icon.getHeight() <= maxHeight) {
                return icon;
            }
            double d2 = maxWidth;
            double max = Math.max(1, icon.getWidth());
            Double.isNaN(d2);
            Double.isNaN(max);
            double d3 = d2 / max;
            double d4 = maxHeight;
            double max2 = Math.max(1, icon.getHeight());
            Double.isNaN(d4);
            Double.isNaN(max2);
            double scale = Math.min(d3, d4 / max2);
            double width = icon.getWidth();
            Double.isNaN(width);
            int ceil = (int) Math.ceil(width * scale);
            double height = icon.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(icon, ceil, (int) Math.ceil(height * scale), true);
        }

        /* renamed from: a, reason: contains not printable characters */
        public c m۱۰۵۱۱a(int defaults) {
            Notification notification = this.f۱۰۳۹۷N;
            notification.defaults = defaults;
            if ((defaults & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public c m۱۰۵۱۸b(int pri) {
            this.f۱۰۴۱۰l = pri;
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public Bundle m۱۰۵۱۷b() {
            if (this.f۱۰۳۸۵B == null) {
                this.f۱۰۳۸۵B = new Bundle();
            }
            return this.f۱۰۳۸۵B;
        }

        /* renamed from: a, reason: contains not printable characters */
        public c m۱۰۵۱۵a(d style) {
            if (this.f۱۰۴۱۳o != style) {
                this.f۱۰۴۱۳o = style;
                d dVar = this.f۱۰۴۱۳o;
                if (dVar != null) {
                    dVar.m۱۰۵۲۳a(this);
                }
            }
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public Notification m۱۰۵۱۰a() {
            return new Cy(this).m۱۰۵۳۰b();
        }

        /* renamed from: c, reason: contains not printable characters */
        protected static CharSequence m۱۰۵۰۹c(CharSequence cs) {
            if (cs == null) {
                return cs;
            }
            if (cs.length() > 5120) {
                return cs.subSequence(0, 5120);
            }
            return cs;
        }
    }

    /* renamed from: android.support.v4.app.x$d */
    public static abstract class d {

        /* renamed from: a, reason: contains not printable characters */
        protected c f۱۰۴۲۵a;

        /* renamed from: b, reason: contains not printable characters */
        CharSequence f۱۰۴۲۶b;

        /* renamed from: c, reason: contains not printable characters */
        CharSequence f۱۰۴۲۷c;

        /* renamed from: d, reason: contains not printable characters */
        boolean f۱۰۴۲۸d = false;

        /* renamed from: a, reason: contains not printable characters */
        public abstract void mo۱۰۵۲۲a(InterfaceCw interfaceCw);

        /* renamed from: a, reason: contains not printable characters */
        public void m۱۰۵۲۳a(c builder) {
            if (this.f۱۰۴۲۵a != builder) {
                this.f۱۰۴۲۵a = builder;
                c cVar = this.f۱۰۴۲۵a;
                if (cVar != null) {
                    cVar.m۱۰۵۱۵a(this);
                }
            }
        }

        /* renamed from: c, reason: contains not printable characters */
        public RemoteViews m۱۰۵۲۵c(InterfaceCw builder) {
            return null;
        }

        /* renamed from: b, reason: contains not printable characters */
        public RemoteViews m۱۰۵۲۴b(InterfaceCw builder) {
            return null;
        }

        /* renamed from: d, reason: contains not printable characters */
        public RemoteViews m۱۰۵۲۶d(InterfaceCw builder) {
            return null;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۱۰۵۲۱a(Bundle extras) {
        }
    }

    /* renamed from: android.support.v4.app.x$b */
    public static class b extends d {

        /* renamed from: e, reason: contains not printable characters */
        private CharSequence f۱۰۳۸۳e;

        /* renamed from: a, reason: contains not printable characters */
        public b m۱۰۵۰۶a(CharSequence cs) {
            this.f۱۰۳۸۳e = c.m۱۰۵۰۹c(cs);
            return this;
        }

        @Override // android.support.v4.app.Cx.d
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۰۵۲۲a(InterfaceCw builder) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle style = new Notification.BigTextStyle(builder.mo۱۰۵۲۹a()).setBigContentTitle(this.f۱۰۴۲۶b).bigText(this.f۱۰۳۸۳e);
                if (this.f۱۰۴۲۸d) {
                    style.setSummaryText(this.f۱۰۴۲۷c);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.x$a */
    public static class a {

        /* renamed from: a, reason: contains not printable characters */
        final Bundle f۱۰۳۷۴a;

        /* renamed from: b, reason: contains not printable characters */
        private final Cb0[] f۱۰۳۷۵b;

        /* renamed from: c, reason: contains not printable characters */
        private final Cb0[] f۱۰۳۷۶c;

        /* renamed from: d, reason: contains not printable characters */
        private boolean f۱۰۳۷۷d;

        /* renamed from: e, reason: contains not printable characters */
        boolean f۱۰۳۷۸e;

        /* renamed from: f, reason: contains not printable characters */
        private final int f۱۰۳۷۹f;

        /* renamed from: g, reason: contains not printable characters */
        public int f۱۰۳۸۰g;

        /* renamed from: h, reason: contains not printable characters */
        public CharSequence f۱۰۳۸۱h;

        /* renamed from: i, reason: contains not printable characters */
        public PendingIntent f۱۰۳۸۲i;

        /* renamed from: e, reason: contains not printable characters */
        public int m۱۰۵۰۱e() {
            return this.f۱۰۳۸۰g;
        }

        /* renamed from: i, reason: contains not printable characters */
        public CharSequence m۱۰۵۰۵i() {
            return this.f۱۰۳۸۱h;
        }

        /* renamed from: a, reason: contains not printable characters */
        public PendingIntent m۱۰۴۹۷a() {
            return this.f۱۰۳۸۲i;
        }

        /* renamed from: d, reason: contains not printable characters */
        public Bundle m۱۰۵۰۰d() {
            return this.f۱۰۳۷۴a;
        }

        /* renamed from: b, reason: contains not printable characters */
        public boolean m۱۰۴۹۸b() {
            return this.f۱۰۳۷۷d;
        }

        /* renamed from: f, reason: contains not printable characters */
        public Cb0[] m۱۰۵۰۲f() {
            return this.f۱۰۳۷۵b;
        }

        /* renamed from: g, reason: contains not printable characters */
        public int m۱۰۵۰۳g() {
            return this.f۱۰۳۷۹f;
        }

        /* renamed from: c, reason: contains not printable characters */
        public Cb0[] m۱۰۴۹۹c() {
            return this.f۱۰۳۷۶c;
        }

        /* renamed from: h, reason: contains not printable characters */
        public boolean m۱۰۵۰۴h() {
            return this.f۱۰۳۷۸e;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Bundle m۱۰۴۹۶a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return Cz.m۱۰۵۳۳a(notification);
        }
        return null;
    }
}
