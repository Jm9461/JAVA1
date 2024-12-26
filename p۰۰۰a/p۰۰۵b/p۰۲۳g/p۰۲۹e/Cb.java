package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.p۰۴۳v4.content.p۰۴۴e.Cf;
import android.support.v4.provider.FontsContractCompat;
import android.support.v4.provider.SelfDestructiveThread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ci;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cc;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cm;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cn;

/* renamed from: a.b.g.e.b  reason: invalid class name */
public class Cb {

    /* renamed from: a  reason: contains not printable characters */
    static final p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cg<String, Typeface> f۸۶۶۸a = new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cg<>(16);

    /* renamed from: b  reason: contains not printable characters */
    private static final Cc f۸۶۶۹b = new Cc("fonts", 10, 10000);

    /* renamed from: c  reason: contains not printable characters */
    static final Object f۸۶۷۰c = new Object();

    /* renamed from: d  reason: contains not printable characters */
    static final Cn<String, ArrayList<Cc.AbstractCd<Cg>>> f۸۶۷۱d = new Cn<>();

    /* renamed from: e  reason: contains not printable characters */
    private static final Comparator<byte[]> f۸۶۷۲e = new Cd();

    /* renamed from: a  reason: contains not printable characters */
    static Cg m۱۰۵۰۵a(Context context, Ca request, int style) {
        try {
            Ce result = m۱۰۵۰۴a(context, (CancellationSignal) null, request);
            int resultCode = -3;
            if (result.m۱۰۵۱۹b() == 0) {
                Typeface typeface = p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Cc.m۱۰۴۳۷a(context, null, result.m۱۰۵۱۸a(), style);
                if (typeface != null) {
                    resultCode = 0;
                }
                return new Cg(typeface, resultCode);
            }
            if (result.m۱۰۵۱۹b() == 1) {
                resultCode = -2;
            }
            return new Cg(null, resultCode);
        } catch (PackageManager.NameNotFoundException e) {
            return new Cg(null, -1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.g.e.b$g  reason: invalid class name */
    public static final class Cg {

        /* renamed from: a  reason: contains not printable characters */
        final Typeface f۸۶۸۷a;

        /* renamed from: b  reason: contains not printable characters */
        final int f۸۶۸۸b;

        Cg(Typeface typeface, int result) {
            this.f۸۶۸۷a = typeface;
            this.f۸۶۸۸b = result;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Typeface m۱۰۵۰۷a(Context context, Ca request, Cf.AbstractCa fontCallback, Handler handler, boolean isBlockingFetch, int timeout, int style) {
        String id = request.m۱۰۵۰۰c() + "-" + style;
        Typeface cached = f۸۶۶۸a.m۱۰۶۱۲b(id);
        if (cached != null) {
            if (fontCallback != null) {
                fontCallback.m۱۲۶۸۷a(cached);
            }
            return cached;
        } else if (!isBlockingFetch || timeout != -1) {
            CallableCa aVar = new CallableCa(context, request, style, id);
            if (isBlockingFetch) {
                try {
                    return ((Cg) f۸۶۶۹b.m۱۰۵۲۶a(aVar, timeout)).f۸۶۸۷a;
                } catch (InterruptedException e) {
                    return null;
                }
            } else {
                SelfDestructiveThread.ReplyCallback<FontsContractCompat.TypefaceResult> reply = fontCallback == null ? null : new Cb(fontCallback, handler);
                synchronized (f۸۶۷۰c) {
                    if (f۸۶۷۱d.containsKey(id)) {
                        if (reply != null) {
                            f۸۶۷۱d.get(id).add(reply);
                        }
                        return null;
                    }
                    if (reply != null) {
                        ArrayList<SelfDestructiveThread.ReplyCallback<FontsContractCompat.TypefaceResult>> pendingReplies = new ArrayList<>();
                        pendingReplies.add(reply);
                        f۸۶۷۱d.put(id, pendingReplies);
                    }
                    f۸۶۶۹b.m۱۰۵۲۹a(aVar, new Cc(id));
                    return null;
                }
            }
        } else {
            Cg typefaceResult = m۱۰۵۰۵a(context, request, style);
            if (fontCallback != null) {
                int i = typefaceResult.f۸۶۸۸b;
                if (i == 0) {
                    fontCallback.m۱۲۶۸۸a(typefaceResult.f۸۶۸۷a, handler);
                } else {
                    fontCallback.m۱۲۶۸۶a(i, handler);
                }
            }
            return typefaceResult.f۸۶۸۷a;
        }
    }

    /* renamed from: a.b.g.e.b$a  reason: invalid class name */
    static class CallableCa implements Callable<Cg> {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ Context f۸۶۷۳a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ Ca f۸۶۷۴b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ int f۸۶۷۵c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ String f۸۶۷۶d;

        CallableCa(Context context, Ca aVar, int i, String str) {
            this.f۸۶۷۳a = context;
            this.f۸۶۷۴b = aVar;
            this.f۸۶۷۵c = i;
            this.f۸۶۷۶d = str;
        }

        @Override // java.util.concurrent.Callable
        public Cg call() {
            Cg typeface = Cb.m۱۰۵۰۵a(this.f۸۶۷۳a, this.f۸۶۷۴b, this.f۸۶۷۵c);
            Typeface typeface2 = typeface.f۸۶۸۷a;
            if (typeface2 != null) {
                Cb.f۸۶۶۸a.m۱۰۶۰۸a(this.f۸۶۷۶d, typeface2);
            }
            return typeface;
        }
    }

    /* renamed from: a.b.g.e.b$b  reason: invalid class name */
    static class Cb implements Cc.AbstractCd<Cg> {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ Cf.AbstractCa f۸۶۷۷a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ Handler f۸۶۷۸b;

        Cb(Cf.AbstractCa aVar, Handler handler) {
            this.f۸۶۷۷a = aVar;
            this.f۸۶۷۸b = handler;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۵۱۴a(Cg typeface) {
            if (typeface == null) {
                this.f۸۶۷۷a.m۱۲۶۸۶a(1, this.f۸۶۷۸b);
                return;
            }
            int i = typeface.f۸۶۸۸b;
            if (i == 0) {
                this.f۸۶۷۷a.m۱۲۶۸۸a(typeface.f۸۶۸۷a, this.f۸۶۷۸b);
            } else {
                this.f۸۶۷۷a.m۱۲۶۸۶a(i, this.f۸۶۷۸b);
            }
        }
    }

    /* renamed from: a.b.g.e.b$c  reason: invalid class name */
    static class Cc implements Cc.AbstractCd<Cg> {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ String f۸۶۷۹a;

        Cc(String str) {
            this.f۸۶۷۹a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            if (r0 >= r2.size()) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
            ((p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cc.AbstractCd) r2.get(r0)).m۱۰۵۳۰a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
            return;
         */
        /* renamed from: a  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m۱۰۵۱۶a(p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cb.Cg r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cb.f۸۶۷۰c
                monitor-enter(r0)
                r1 = 0
                a.b.g.g.n<java.lang.String, java.util.ArrayList<a.b.g.e.c$d<a.b.g.e.b$g>>> r2 = p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cb.f۸۶۷۱d     // Catch:{ all -> 0x002f }
                java.lang.String r3 = r4.f۸۶۷۹a     // Catch:{ all -> 0x002f }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x002f }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002f }
                r1 = r2
                if (r1 != 0) goto L_0x0013
                monitor-exit(r0)     // Catch:{ all -> 0x0032 }
                return
            L_0x0013:
                a.b.g.g.n<java.lang.String, java.util.ArrayList<a.b.g.e.c$d<a.b.g.e.b$g>>> r2 = p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cb.f۸۶۷۱d     // Catch:{ all -> 0x0032 }
                java.lang.String r3 = r4.f۸۶۷۹a     // Catch:{ all -> 0x0032 }
                r2.remove(r3)     // Catch:{ all -> 0x0032 }
                monitor-exit(r0)     // Catch:{ all -> 0x0032 }
                r0 = 0
            L_0x001c:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002e
                java.lang.Object r2 = r1.get(r0)
                a.b.g.e.c$d r2 = (p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cc.AbstractCd) r2
                r2.m۱۰۵۳۰a(r5)
                int r0 = r0 + 1
                goto L_0x001c
            L_0x002e:
                return
            L_0x002f:
                r2 = move-exception
            L_0x0030:
                monitor-exit(r0)
                throw r2
            L_0x0032:
                r2 = move-exception
                goto L_0x0030
            */
            throw new UnsupportedOperationException("Method not decompiled: p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cb.Cc.m۱۰۵۱۶a(a.b.g.e.b$g):void");
        }
    }

    /* renamed from: a.b.g.e.b$f  reason: invalid class name */
    public static class Cf {

        /* renamed from: a  reason: contains not printable characters */
        private final Uri f۸۶۸۲a;

        /* renamed from: b  reason: contains not printable characters */
        private final int f۸۶۸۳b;

        /* renamed from: c  reason: contains not printable characters */
        private final int f۸۶۸۴c;

        /* renamed from: d  reason: contains not printable characters */
        private final boolean f۸۶۸۵d;

        /* renamed from: e  reason: contains not printable characters */
        private final int f۸۶۸۶e;

        public Cf(Uri uri, int ttcIndex, int weight, boolean italic, int resultCode) {
            Cm.m۱۰۶۴۲a(uri);
            this.f۸۶۸۲a = uri;
            this.f۸۶۸۳b = ttcIndex;
            this.f۸۶۸۴c = weight;
            this.f۸۶۸۵d = italic;
            this.f۸۶۸۶e = resultCode;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Uri m۱۰۵۲۲c() {
            return this.f۸۶۸۲a;
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۰۵۲۱b() {
            return this.f۸۶۸۳b;
        }

        /* renamed from: d  reason: contains not printable characters */
        public int m۱۰۵۲۳d() {
            return this.f۸۶۸۴c;
        }

        /* renamed from: e  reason: contains not printable characters */
        public boolean m۱۰۵۲۴e() {
            return this.f۸۶۸۵d;
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۵۲۰a() {
            return this.f۸۶۸۶e;
        }
    }

    /* renamed from: a.b.g.e.b$e  reason: invalid class name */
    public static class Ce {

        /* renamed from: a  reason: contains not printable characters */
        private final int f۸۶۸۰a;

        /* renamed from: b  reason: contains not printable characters */
        private final Cf[] f۸۶۸۱b;

        public Ce(int statusCode, Cf[] fonts) {
            this.f۸۶۸۰a = statusCode;
            this.f۸۶۸۱b = fonts;
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۰۵۱۹b() {
            return this.f۸۶۸۰a;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cf[] m۱۰۵۱۸a() {
            return this.f۸۶۸۱b;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Map<Uri, ByteBuffer> m۱۰۵۱۰a(Context context, Cf[] fonts, CancellationSignal cancellationSignal) {
        HashMap<Uri, ByteBuffer> out = new HashMap<>();
        for (Cf font : fonts) {
            if (font.m۱۰۵۲۰a() == 0) {
                Uri uri = font.m۱۰۵۲۲c();
                if (!out.containsKey(uri)) {
                    out.put(uri, Ci.m۱۰۴۸۷a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(out);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Ce m۱۰۵۰۴a(Context context, CancellationSignal cancellationSignal, Ca request) {
        ProviderInfo providerInfo = m۱۰۵۰۶a(context.getPackageManager(), request, context.getResources());
        if (providerInfo == null) {
            return new Ce(1, null);
        }
        return new Ce(0, m۱۰۵۱۲a(context, request, providerInfo.authority, cancellationSignal));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static ProviderInfo m۱۰۵۰۶a(PackageManager packageManager, Ca request, Resources resources) {
        String providerAuthority = request.m۱۰۵۰۱d();
        ProviderInfo info2 = packageManager.resolveContentProvider(providerAuthority, 0);
        if (info2 == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
        } else if (info2.packageName.equals(request.m۱۰۵۰۲e())) {
            List<byte[]> signatures = m۱۰۵۰۹a(packageManager.getPackageInfo(info2.packageName, 64).signatures);
            Collections.sort(signatures, f۸۶۷۲e);
            List<List<byte[]>> requestCertificatesList = m۱۰۵۰۸a(request, resources);
            for (int i = 0; i < requestCertificatesList.size(); i++) {
                List<byte[]> requestSignatures = new ArrayList<>(requestCertificatesList.get(i));
                Collections.sort(requestSignatures, f۸۶۷۲e);
                if (m۱۰۵۱۱a(signatures, requestSignatures)) {
                    return info2;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + request.m۱۰۵۰۲e());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static List<List<byte[]>> m۱۰۵۰۸a(Ca request, Resources resources) {
        if (request.m۱۰۴۹۸a() != null) {
            return request.m۱۰۴۹۸a();
        }
        return android.support.p۰۴۳v4.content.p۰۴۴e.Cc.m۱۲۶۵۸a(resources, request.m۱۰۴۹۹b());
    }

    /* renamed from: a.b.g.e.b$d  reason: invalid class name */
    static class Cd implements Comparator<byte[]> {
        Cd() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public int compare(byte[] l, byte[] r) {
            if (l.length != r.length) {
                return l.length - r.length;
            }
            for (int i = 0; i < l.length; i++) {
                if (l[i] != r[i]) {
                    return l[i] - r[i];
                }
            }
            return 0;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۰۵۱۱a(List<byte[]> signatures, List<byte[]> requestSignatures) {
        if (signatures.size() != requestSignatures.size()) {
            return false;
        }
        for (int i = 0; i < signatures.size(); i++) {
            if (!Arrays.equals(signatures.get(i), requestSignatures.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static List<byte[]> m۱۰۵۰۹a(Signature[] signatures) {
        List<byte[]> shas = new ArrayList<>();
        for (Signature signature : signatures) {
            shas.add(signature.toByteArray());
        }
        return shas;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0163  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cb.Cf[] m۱۰۵۱۲a(android.content.Context r24, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Ca r25, java.lang.String r26, android.os.CancellationSignal r27) {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cb.m۱۰۵۱۲a(android.content.Context, a.b.g.e.a, java.lang.String, android.os.CancellationSignal):a.b.g.e.b$f[]");
    }
}
