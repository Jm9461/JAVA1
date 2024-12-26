package android.support.p۰۴۳v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.x  reason: invalid class name */
public class Cx {

    /* renamed from: android.support.v4.app.x$c  reason: invalid class name */
    public static class Cc {

        /* renamed from: A  reason: contains not printable characters */
        String f۱۰۳۸۴A;

        /* renamed from: B  reason: contains not printable characters */
        Bundle f۱۰۳۸۵B;

        /* renamed from: C  reason: contains not printable characters */
        int f۱۰۳۸۶C = 0;

        /* renamed from: D  reason: contains not printable characters */
        int f۱۰۳۸۷D = 0;

        /* renamed from: E  reason: contains not printable characters */
        Notification f۱۰۳۸۸E;

        /* renamed from: F  reason: contains not printable characters */
        RemoteViews f۱۰۳۸۹F;

        /* renamed from: G  reason: contains not printable characters */
        RemoteViews f۱۰۳۹۰G;

        /* renamed from: H  reason: contains not printable characters */
        RemoteViews f۱۰۳۹۱H;

        /* renamed from: I  reason: contains not printable characters */
        String f۱۰۳۹۲I;

        /* renamed from: J  reason: contains not printable characters */
        int f۱۰۳۹۳J = 0;

        /* renamed from: K  reason: contains not printable characters */
        String f۱۰۳۹۴K;

        /* renamed from: L  reason: contains not printable characters */
        long f۱۰۳۹۵L;

        /* renamed from: M  reason: contains not printable characters */
        int f۱۰۳۹۶M = 0;

        /* renamed from: N  reason: contains not printable characters */
        Notification f۱۰۳۹۷N = new Notification();
        @Deprecated

        /* renamed from: O  reason: contains not printable characters */
        public ArrayList<String> f۱۰۳۹۸O;

        /* renamed from: a  reason: contains not printable characters */
        public Context f۱۰۳۹۹a;

        /* renamed from: b  reason: contains not printable characters */
        public ArrayList<Ca> f۱۰۴۰۰b = new ArrayList<>();

        /* renamed from: c  reason: contains not printable characters */
        ArrayList<Ca> f۱۰۴۰۱c = new ArrayList<>();

        /* renamed from: d  reason: contains not printable characters */
        CharSequence f۱۰۴۰۲d;

        /* renamed from: e  reason: contains not printable characters */
        CharSequence f۱۰۴۰۳e;

        /* renamed from: f  reason: contains not printable characters */
        PendingIntent f۱۰۴۰۴f;

        /* renamed from: g  reason: contains not printable characters */
        PendingIntent f۱۰۴۰۵g;

        /* renamed from: h  reason: contains not printable characters */
        RemoteViews f۱۰۴۰۶h;

        /* renamed from: i  reason: contains not printable characters */
        Bitmap f۱۰۴۰۷i;

        /* renamed from: j  reason: contains not printable characters */
        CharSequence f۱۰۴۰۸j;

        /* renamed from: k  reason: contains not printable characters */
        int f۱۰۴۰۹k;

        /* renamed from: l  reason: contains not printable characters */
        int f۱۰۴۱۰l;

        /* renamed from: m  reason: contains not printable characters */
        boolean f۱۰۴۱۱m = true;

        /* renamed from: n  reason: contains not printable characters */
        boolean f۱۰۴۱۲n;

        /* renamed from: o  reason: contains not printable characters */
        AbstractCd f۱۰۴۱۳o;

        /* renamed from: p  reason: contains not printable characters */
        CharSequence f۱۰۴۱۴p;

        /* renamed from: q  reason: contains not printable characters */
        CharSequence[] f۱۰۴۱۵q;

        /* renamed from: r  reason: contains not printable characters */
        int f۱۰۴۱۶r;

        /* renamed from: s  reason: contains not printable characters */
        int f۱۰۴۱۷s;

        /* renamed from: t  reason: contains not printable characters */
        boolean f۱۰۴۱۸t;

        /* renamed from: u  reason: contains not printable characters */
        String f۱۰۴۱۹u;

        /* renamed from: v  reason: contains not printable characters */
        boolean f۱۰۴۲۰v;

        /* renamed from: w  reason: contains not printable characters */
        String f۱۰۴۲۱w;

        /* renamed from: x  reason: contains not printable characters */
        boolean f۱۰۴۲۲x = false;

        /* renamed from: y  reason: contains not printable characters */
        boolean f۱۰۴۲۳y;

        /* renamed from: z  reason: contains not printable characters */
        boolean f۱۰۴۲۴z;

        public Cc(Context context, String channelId) {
            this.f۱۰۳۹۹a = context;
            this.f۱۰۳۹۲I = channelId;
            this.f۱۰۳۹۷N.when = System.currentTimeMillis();
            this.f۱۰۳۹۷N.audioStreamType = -1;
            this.f۱۰۴۱۰l = 0;
            this.f۱۰۳۹۸O = new ArrayList<>();
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۲۵۸۲a(long when) {
            this.f۱۰۳۹۷N.when = when;
            return this;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Cc m۱۲۵۹۰c(int icon) {
            this.f۱۰۳۹۷N.icon = icon;
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cc m۱۲۵۸۹b(CharSequence title) {
            this.f۱۰۴۰۲d = m۱۲۵۷۹c(title);
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۲۵۸۶a(CharSequence text) {
            this.f۱۰۴۰۳e = m۱۲۵۷۹c(text);
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۲۵۸۳a(PendingIntent intent) {
            this.f۱۰۴۰۴f = intent;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۲۵۸۴a(Bitmap icon) {
            this.f۱۰۴۰۷i = m۱۲۵۷۸b(icon);
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        private Bitmap m۱۲۵۷۸b(Bitmap icon) {
            if (icon == null || Build.VERSION.SDK_INT >= 27) {
                return icon;
            }
            Resources res = this.f۱۰۳۹۹a.getResources();
            int maxWidth = res.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cb.compat_notification_large_icon_max_width);
            int maxHeight = res.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cb.compat_notification_large_icon_max_height);
            if (icon.getWidth() <= maxWidth && icon.getHeight() <= maxHeight) {
                return icon;
            }
            double d = (double) maxWidth;
            double max = (double) Math.max(1, icon.getWidth());
            Double.isNaN(d);
            Double.isNaN(max);
            double d2 = d / max;
            double d3 = (double) maxHeight;
            double max2 = (double) Math.max(1, icon.getHeight());
            Double.isNaN(d3);
            Double.isNaN(max2);
            double scale = Math.min(d2, d3 / max2);
            double width = (double) icon.getWidth();
            Double.isNaN(width);
            int ceil = (int) Math.ceil(width * scale);
            double height = (double) icon.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(icon, ceil, (int) Math.ceil(height * scale), true);
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۲۵۸۱a(int defaults) {
            Notification notification = this.f۱۰۳۹۷N;
            notification.defaults = defaults;
            if ((defaults & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cc m۱۲۵۸۸b(int pri) {
            this.f۱۰۴۱۰l = pri;
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Bundle m۱۲۵۸۷b() {
            if (this.f۱۰۳۸۵B == null) {
                this.f۱۰۳۸۵B = new Bundle();
            }
            return this.f۱۰۳۸۵B;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۲۵۸۵a(AbstractCd style) {
            if (this.f۱۰۴۱۳o != style) {
                this.f۱۰۴۱۳o = style;
                AbstractCd dVar = this.f۱۰۴۱۳o;
                if (dVar != null) {
                    dVar.m۱۲۵۹۳a(this);
                }
            }
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Notification m۱۲۵۸۰a() {
            return new Cy(this).m۱۲۶۰۰b();
        }

        /* renamed from: c  reason: contains not printable characters */
        protected static CharSequence m۱۲۵۷۹c(CharSequence cs) {
            if (cs != null && cs.length() > 5120) {
                return cs.subSequence(0, 5120);
            }
            return cs;
        }
    }

    /* renamed from: android.support.v4.app.x$d  reason: invalid class name */
    public static abstract class AbstractCd {

        /* renamed from: a  reason: contains not printable characters */
        protected Cc f۱۰۴۲۵a;

        /* renamed from: b  reason: contains not printable characters */
        CharSequence f۱۰۴۲۶b;

        /* renamed from: c  reason: contains not printable characters */
        CharSequence f۱۰۴۲۷c;

        /* renamed from: d  reason: contains not printable characters */
        boolean f۱۰۴۲۸d = false;

        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۲۵۹۲a(AbstractCw wVar);

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۵۹۳a(Cc builder) {
            if (this.f۱۰۴۲۵a != builder) {
                this.f۱۰۴۲۵a = builder;
                Cc cVar = this.f۱۰۴۲۵a;
                if (cVar != null) {
                    cVar.m۱۲۵۸۵a(this);
                }
            }
        }

        /* renamed from: c  reason: contains not printable characters */
        public RemoteViews m۱۲۵۹۵c(AbstractCw builder) {
            return null;
        }

        /* renamed from: b  reason: contains not printable characters */
        public RemoteViews m۱۲۵۹۴b(AbstractCw builder) {
            return null;
        }

        /* renamed from: d  reason: contains not printable characters */
        public RemoteViews m۱۲۵۹۶d(AbstractCw builder) {
            return null;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۵۹۱a(Bundle extras) {
        }
    }

    /* renamed from: android.support.v4.app.x$b  reason: invalid class name */
    public static class Cb extends AbstractCd {

        /* renamed from: e  reason: contains not printable characters */
        private CharSequence f۱۰۳۸۳e;

        /* renamed from: a  reason: contains not printable characters */
        public Cb m۱۲۵۷۶a(CharSequence cs) {
            this.f۱۰۳۸۳e = Cc.m۱۲۵۷۹c(cs);
            return this;
        }

        @Override // android.support.p۰۴۳v4.app.Cx.AbstractCd
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۵۷۷a(AbstractCw builder) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle style = new Notification.BigTextStyle(builder.m۱۲۵۶۵a()).setBigContentTitle(this.f۱۰۴۲۶b).bigText(this.f۱۰۳۸۳e);
                if (this.f۱۰۴۲۸d) {
                    style.setSummaryText(this.f۱۰۴۲۷c);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.x$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        final Bundle f۱۰۳۷۴a;

        /* renamed from: b  reason: contains not printable characters */
        private final Cb0[] f۱۰۳۷۵b;

        /* renamed from: c  reason: contains not printable characters */
        private final Cb0[] f۱۰۳۷۶c;

        /* renamed from: d  reason: contains not printable characters */
        private boolean f۱۰۳۷۷d;

        /* renamed from: e  reason: contains not printable characters */
        boolean f۱۰۳۷۸e;

        /* renamed from: f  reason: contains not printable characters */
        private final int f۱۰۳۷۹f;

        /* renamed from: g  reason: contains not printable characters */
        public int f۱۰۳۸۰g;

        /* renamed from: h  reason: contains not printable characters */
        public CharSequence f۱۰۳۸۱h;

        /* renamed from: i  reason: contains not printable characters */
        public PendingIntent f۱۰۳۸۲i;

        /* renamed from: e  reason: contains not printable characters */
        public int m۱۲۵۷۱e() {
            return this.f۱۰۳۸۰g;
        }

        /* renamed from: i  reason: contains not printable characters */
        public CharSequence m۱۲۵۷۵i() {
            return this.f۱۰۳۸۱h;
        }

        /* renamed from: a  reason: contains not printable characters */
        public PendingIntent m۱۲۵۶۷a() {
            return this.f۱۰۳۸۲i;
        }

        /* renamed from: d  reason: contains not printable characters */
        public Bundle m۱۲۵۷۰d() {
            return this.f۱۰۳۷۴a;
        }

        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۲۵۶۸b() {
            return this.f۱۰۳۷۷d;
        }

        /* renamed from: f  reason: contains not printable characters */
        public Cb0[] m۱۲۵۷۲f() {
            return this.f۱۰۳۷۵b;
        }

        /* renamed from: g  reason: contains not printable characters */
        public int m۱۲۵۷۳g() {
            return this.f۱۰۳۷۹f;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Cb0[] m۱۲۵۶۹c() {
            return this.f۱۰۳۷۶c;
        }

        /* renamed from: h  reason: contains not printable characters */
        public boolean m۱۲۵۷۴h() {
            return this.f۱۰۳۷۸e;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Bundle m۱۲۵۶۶a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return Cz.m۱۲۶۰۳a(notification);
        }
        return null;
    }
}
