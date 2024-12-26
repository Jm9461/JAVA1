package a.b.g.e;

import a.b.g.a.i;
import a.b.g.e.c;
import a.b.g.g.m;
import a.b.g.g.n;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.content.e.f;
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

public class b {

    /* renamed from: a  reason: collision with root package name */
    static final a.b.g.g.g<String, Typeface> f۳۰۵a = new a.b.g.g.g<>(16);

    /* renamed from: b  reason: collision with root package name */
    private static final c f۳۰۶b = new c("fonts", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    static final Object f۳۰۷c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final n<String, ArrayList<c.d<g>>> f۳۰۸d = new n<>();

    /* renamed from: e  reason: collision with root package name */
    private static final Comparator<byte[]> f۳۰۹e = new d();

    static g a(Context context, a request, int style) {
        try {
            e result = a(context, (CancellationSignal) null, request);
            int resultCode = -3;
            if (result.b() == 0) {
                Typeface typeface = a.b.g.a.c.a(context, null, result.a(), style);
                if (typeface != null) {
                    resultCode = 0;
                }
                return new g(typeface, resultCode);
            }
            if (result.b() == 1) {
                resultCode = -2;
            }
            return new g(null, resultCode);
        } catch (PackageManager.NameNotFoundException e2) {
            return new g(null, -1);
        }
    }

    /* access modifiers changed from: private */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f۳۲۴a;

        /* renamed from: b  reason: collision with root package name */
        final int f۳۲۵b;

        g(Typeface typeface, int result) {
            this.f۳۲۴a = typeface;
            this.f۳۲۵b = result;
        }
    }

    public static Typeface a(Context context, a request, f.a fontCallback, Handler handler, boolean isBlockingFetch, int timeout, int style) {
        String id = request.c() + "-" + style;
        Typeface cached = f۳۰۵a.b(id);
        if (cached != null) {
            if (fontCallback != null) {
                fontCallback.a(cached);
            }
            return cached;
        } else if (!isBlockingFetch || timeout != -1) {
            a aVar = new a(context, request, style, id);
            if (isBlockingFetch) {
                try {
                    return ((g) f۳۰۶b.a(aVar, timeout)).f۳۲۴a;
                } catch (InterruptedException e2) {
                    return null;
                }
            } else {
                SelfDestructiveThread.ReplyCallback<FontsContractCompat.TypefaceResult> reply = fontCallback == null ? null : new C۰۰۱۲b(fontCallback, handler);
                synchronized (f۳۰۷c) {
                    if (f۳۰۸d.containsKey(id)) {
                        if (reply != null) {
                            f۳۰۸d.get(id).add(reply);
                        }
                        return null;
                    }
                    if (reply != null) {
                        ArrayList<SelfDestructiveThread.ReplyCallback<FontsContractCompat.TypefaceResult>> pendingReplies = new ArrayList<>();
                        pendingReplies.add(reply);
                        f۳۰۸d.put(id, pendingReplies);
                    }
                    f۳۰۶b.a(aVar, new c(id));
                    return null;
                }
            }
        } else {
            g typefaceResult = a(context, request, style);
            if (fontCallback != null) {
                int i = typefaceResult.f۳۲۵b;
                if (i == 0) {
                    fontCallback.a(typefaceResult.f۳۲۴a, handler);
                } else {
                    fontCallback.a(i, handler);
                }
            }
            return typefaceResult.f۳۲۴a;
        }
    }

    static class a implements Callable<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f۳۱۰a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f۳۱۱b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f۳۱۲c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f۳۱۳d;

        a(Context context, a aVar, int i, String str) {
            this.f۳۱۰a = context;
            this.f۳۱۱b = aVar;
            this.f۳۱۲c = i;
            this.f۳۱۳d = str;
        }

        @Override // java.util.concurrent.Callable
        public g call() {
            g typeface = b.a(this.f۳۱۰a, this.f۳۱۱b, this.f۳۱۲c);
            Typeface typeface2 = typeface.f۳۲۴a;
            if (typeface2 != null) {
                b.f۳۰۵a.a(this.f۳۱۳d, typeface2);
            }
            return typeface;
        }
    }

    /* renamed from: a.b.g.e.b$b  reason: collision with other inner class name */
    static class C۰۰۱۲b implements c.d<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.a f۳۱۴a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Handler f۳۱۵b;

        C۰۰۱۲b(f.a aVar, Handler handler) {
            this.f۳۱۴a = aVar;
            this.f۳۱۵b = handler;
        }

        public void a(g typeface) {
            if (typeface == null) {
                this.f۳۱۴a.a(1, this.f۳۱۵b);
                return;
            }
            int i = typeface.f۳۲۵b;
            if (i == 0) {
                this.f۳۱۴a.a(typeface.f۳۲۴a, this.f۳۱۵b);
            } else {
                this.f۳۱۴a.a(i, this.f۳۱۵b);
            }
        }
    }

    static class c implements c.d<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f۳۱۶a;

        c(String str) {
            this.f۳۱۶a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            if (r0 >= r2.size()) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
            ((a.b.g.e.c.d) r2.get(r0)).a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(a.b.g.e.b.g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = a.b.g.e.b.f۳۰۷c
                monitor-enter(r0)
                r1 = 0
                a.b.g.g.n<java.lang.String, java.util.ArrayList<a.b.g.e.c$d<a.b.g.e.b$g>>> r2 = a.b.g.e.b.f۳۰۸d     // Catch:{ all -> 0x002f }
                java.lang.String r3 = r4.f۳۱۶a     // Catch:{ all -> 0x002f }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x002f }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002f }
                r1 = r2
                if (r1 != 0) goto L_0x0013
                monitor-exit(r0)     // Catch:{ all -> 0x0032 }
                return
            L_0x0013:
                a.b.g.g.n<java.lang.String, java.util.ArrayList<a.b.g.e.c$d<a.b.g.e.b$g>>> r2 = a.b.g.e.b.f۳۰۸d     // Catch:{ all -> 0x0032 }
                java.lang.String r3 = r4.f۳۱۶a     // Catch:{ all -> 0x0032 }
                r2.remove(r3)     // Catch:{ all -> 0x0032 }
                monitor-exit(r0)     // Catch:{ all -> 0x0032 }
                r0 = 0
            L_0x001c:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002e
                java.lang.Object r2 = r1.get(r0)
                a.b.g.e.c$d r2 = (a.b.g.e.c.d) r2
                r2.a(r5)
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
            throw new UnsupportedOperationException("Method not decompiled: a.b.g.e.b.c.a(a.b.g.e.b$g):void");
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f۳۱۹a;

        /* renamed from: b  reason: collision with root package name */
        private final int f۳۲۰b;

        /* renamed from: c  reason: collision with root package name */
        private final int f۳۲۱c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f۳۲۲d;

        /* renamed from: e  reason: collision with root package name */
        private final int f۳۲۳e;

        public f(Uri uri, int ttcIndex, int weight, boolean italic, int resultCode) {
            m.a(uri);
            this.f۳۱۹a = uri;
            this.f۳۲۰b = ttcIndex;
            this.f۳۲۱c = weight;
            this.f۳۲۲d = italic;
            this.f۳۲۳e = resultCode;
        }

        public Uri c() {
            return this.f۳۱۹a;
        }

        public int b() {
            return this.f۳۲۰b;
        }

        public int d() {
            return this.f۳۲۱c;
        }

        public boolean e() {
            return this.f۳۲۲d;
        }

        public int a() {
            return this.f۳۲۳e;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f۳۱۷a;

        /* renamed from: b  reason: collision with root package name */
        private final f[] f۳۱۸b;

        public e(int statusCode, f[] fonts) {
            this.f۳۱۷a = statusCode;
            this.f۳۱۸b = fonts;
        }

        public int b() {
            return this.f۳۱۷a;
        }

        public f[] a() {
            return this.f۳۱۸b;
        }
    }

    public static Map<Uri, ByteBuffer> a(Context context, f[] fonts, CancellationSignal cancellationSignal) {
        HashMap<Uri, ByteBuffer> out = new HashMap<>();
        for (f font : fonts) {
            if (font.a() == 0) {
                Uri uri = font.c();
                if (!out.containsKey(uri)) {
                    out.put(uri, i.a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(out);
    }

    public static e a(Context context, CancellationSignal cancellationSignal, a request) {
        ProviderInfo providerInfo = a(context.getPackageManager(), request, context.getResources());
        if (providerInfo == null) {
            return new e(1, null);
        }
        return new e(0, a(context, request, providerInfo.authority, cancellationSignal));
    }

    public static ProviderInfo a(PackageManager packageManager, a request, Resources resources) {
        String providerAuthority = request.d();
        ProviderInfo info2 = packageManager.resolveContentProvider(providerAuthority, 0);
        if (info2 == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
        } else if (info2.packageName.equals(request.e())) {
            List<byte[]> signatures = a(packageManager.getPackageInfo(info2.packageName, 64).signatures);
            Collections.sort(signatures, f۳۰۹e);
            List<List<byte[]>> requestCertificatesList = a(request, resources);
            for (int i = 0; i < requestCertificatesList.size(); i++) {
                List<byte[]> requestSignatures = new ArrayList<>(requestCertificatesList.get(i));
                Collections.sort(requestSignatures, f۳۰۹e);
                if (a(signatures, requestSignatures)) {
                    return info2;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + request.e());
        }
    }

    private static List<List<byte[]>> a(a request, Resources resources) {
        if (request.a() != null) {
            return request.a();
        }
        return android.support.v4.content.e.c.a(resources, request.b());
    }

    static class d implements Comparator<byte[]> {
        d() {
        }

        /* renamed from: a */
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

    private static boolean a(List<byte[]> signatures, List<byte[]> requestSignatures) {
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

    private static List<byte[]> a(Signature[] signatures) {
        List<byte[]> shas = new ArrayList<>();
        for (Signature signature : signatures) {
            shas.add(signature.toByteArray());
        }
        return shas;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static a.b.g.e.b.f[] a(android.content.Context r24, a.b.g.e.a r25, java.lang.String r26, android.os.CancellationSignal r27) {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.g.e.b.a(android.content.Context, a.b.g.e.a, java.lang.String, android.os.CancellationSignal):a.b.g.e.b$f[]");
    }
}
