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

public class x {

    public static class c {
        String A;
        Bundle B;
        int C = 0;
        int D = 0;
        Notification E;
        RemoteViews F;
        RemoteViews G;
        RemoteViews H;
        String I;
        int J = 0;
        String K;
        long L;
        int M = 0;
        Notification N = new Notification();
        @Deprecated
        public ArrayList<String> O;

        /* renamed from: a  reason: collision with root package name */
        public Context f۱۲۱۹a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f۱۲۲۰b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        ArrayList<a> f۱۲۲۱c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        CharSequence f۱۲۲۲d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f۱۲۲۳e;

        /* renamed from: f  reason: collision with root package name */
        PendingIntent f۱۲۲۴f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f۱۲۲۵g;

        /* renamed from: h  reason: collision with root package name */
        RemoteViews f۱۲۲۶h;
        Bitmap i;
        CharSequence j;
        int k;
        int l;
        boolean m = true;
        boolean n;
        d o;
        CharSequence p;
        CharSequence[] q;
        int r;
        int s;
        boolean t;
        String u;
        boolean v;
        String w;
        boolean x = false;
        boolean y;
        boolean z;

        public c(Context context, String channelId) {
            this.f۱۲۱۹a = context;
            this.I = channelId;
            this.N.when = System.currentTimeMillis();
            this.N.audioStreamType = -1;
            this.l = 0;
            this.O = new ArrayList<>();
        }

        public c a(long when) {
            this.N.when = when;
            return this;
        }

        public c c(int icon) {
            this.N.icon = icon;
            return this;
        }

        public c b(CharSequence title) {
            this.f۱۲۲۲d = c(title);
            return this;
        }

        public c a(CharSequence text) {
            this.f۱۲۲۳e = c(text);
            return this;
        }

        public c a(PendingIntent intent) {
            this.f۱۲۲۴f = intent;
            return this;
        }

        public c a(Bitmap icon) {
            this.i = b(icon);
            return this;
        }

        private Bitmap b(Bitmap icon) {
            if (icon == null || Build.VERSION.SDK_INT >= 27) {
                return icon;
            }
            Resources res = this.f۱۲۱۹a.getResources();
            int maxWidth = res.getDimensionPixelSize(a.b.a.b.compat_notification_large_icon_max_width);
            int maxHeight = res.getDimensionPixelSize(a.b.a.b.compat_notification_large_icon_max_height);
            if (icon.getWidth() <= maxWidth && icon.getHeight() <= maxHeight) {
                return icon;
            }
            double d2 = (double) maxWidth;
            double max = (double) Math.max(1, icon.getWidth());
            Double.isNaN(d2);
            Double.isNaN(max);
            double d3 = d2 / max;
            double d4 = (double) maxHeight;
            double max2 = (double) Math.max(1, icon.getHeight());
            Double.isNaN(d4);
            Double.isNaN(max2);
            double scale = Math.min(d3, d4 / max2);
            double width = (double) icon.getWidth();
            Double.isNaN(width);
            int ceil = (int) Math.ceil(width * scale);
            double height = (double) icon.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(icon, ceil, (int) Math.ceil(height * scale), true);
        }

        public c a(int defaults) {
            Notification notification = this.N;
            notification.defaults = defaults;
            if ((defaults & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public c b(int pri) {
            this.l = pri;
            return this;
        }

        public Bundle b() {
            if (this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        public c a(d style) {
            if (this.o != style) {
                this.o = style;
                d dVar = this.o;
                if (dVar != null) {
                    dVar.a(this);
                }
            }
            return this;
        }

        public Notification a() {
            return new y(this).b();
        }

        protected static CharSequence c(CharSequence cs) {
            if (cs != null && cs.length() > 5120) {
                return cs.subSequence(0, 5120);
            }
            return cs;
        }
    }

    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        protected c f۱۲۲۷a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f۱۲۲۸b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f۱۲۲۹c;

        /* renamed from: d  reason: collision with root package name */
        boolean f۱۲۳۰d = false;

        public abstract void a(w wVar);

        public void a(c builder) {
            if (this.f۱۲۲۷a != builder) {
                this.f۱۲۲۷a = builder;
                c cVar = this.f۱۲۲۷a;
                if (cVar != null) {
                    cVar.a(this);
                }
            }
        }

        public RemoteViews c(w builder) {
            return null;
        }

        public RemoteViews b(w builder) {
            return null;
        }

        public RemoteViews d(w builder) {
            return null;
        }

        public void a(Bundle extras) {
        }
    }

    public static class b extends d {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f۱۲۱۸e;

        public b a(CharSequence cs) {
            this.f۱۲۱۸e = c.c(cs);
            return this;
        }

        @Override // android.support.v4.app.x.d
        public void a(w builder) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle style = new Notification.BigTextStyle(builder.a()).setBigContentTitle(this.f۱۲۲۸b).bigText(this.f۱۲۱۸e);
                if (this.f۱۲۳۰d) {
                    style.setSummaryText(this.f۱۲۲۹c);
                }
            }
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f۱۲۱۰a;

        /* renamed from: b  reason: collision with root package name */
        private final b0[] f۱۲۱۱b;

        /* renamed from: c  reason: collision with root package name */
        private final b0[] f۱۲۱۲c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f۱۲۱۳d;

        /* renamed from: e  reason: collision with root package name */
        boolean f۱۲۱۴e;

        /* renamed from: f  reason: collision with root package name */
        private final int f۱۲۱۵f;

        /* renamed from: g  reason: collision with root package name */
        public int f۱۲۱۶g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f۱۲۱۷h;
        public PendingIntent i;

        public int e() {
            return this.f۱۲۱۶g;
        }

        public CharSequence i() {
            return this.f۱۲۱۷h;
        }

        public PendingIntent a() {
            return this.i;
        }

        public Bundle d() {
            return this.f۱۲۱۰a;
        }

        public boolean b() {
            return this.f۱۲۱۳d;
        }

        public b0[] f() {
            return this.f۱۲۱۱b;
        }

        public int g() {
            return this.f۱۲۱۵f;
        }

        public b0[] c() {
            return this.f۱۲۱۲c;
        }

        public boolean h() {
            return this.f۱۲۱۴e;
        }
    }

    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return z.a(notification);
        }
        return null;
    }
}
