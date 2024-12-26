package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۸e;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.content.p۲۰۲e.Cf;
import android.support.v4.provider.FontsContractCompat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ci;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۸e.Cc;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cg;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cm;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cn;

/* renamed from: a.b.g.e.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb {

    /* renamed from: a, reason: contains not printable characters */
    static final Cg<String, Typeface> f۸۶۶۸a = new Cg<>(16);

    /* renamed from: b, reason: contains not printable characters */
    private static final Cc f۸۶۶۹b = new Cc("fonts", 10, 10000);

    /* renamed from: c, reason: contains not printable characters */
    static final Object f۸۶۷۰c = new Object();

    /* renamed from: d, reason: contains not printable characters */
    static final Cn<String, ArrayList<Cc.d<g>>> f۸۶۷۱d = new Cn<>();

    /* renamed from: e, reason: contains not printable characters */
    private static final Comparator<byte[]> f۸۶۷۲e = new d();

    /* renamed from: a, reason: contains not printable characters */
    static g m۸۴۳۶a(Context context, Ca request, int style) {
        try {
            e result = m۸۴۳۵a(context, (CancellationSignal) null, request);
            if (result.m۸۴۴۸b() == 0) {
                Typeface typeface = p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cc.m۸۳۷۲a(context, null, result.m۸۴۴۷a(), style);
                return new g(typeface, typeface != null ? 0 : -3);
            }
            int resultCode = result.m۸۴۴۸b() == 1 ? -2 : -3;
            return new g(null, resultCode);
        } catch (PackageManager.NameNotFoundException e2) {
            return new g(null, -1);
        }
    }

    /* renamed from: a.b.g.e.b$g */
    private static final class g {

        /* renamed from: a, reason: contains not printable characters */
        final Typeface f۸۶۸۷a;

        /* renamed from: b, reason: contains not printable characters */
        final int f۸۶۸۸b;

        g(Typeface typeface, int result) {
            this.f۸۶۸۷a = typeface;
            this.f۸۶۸۸b = result;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.e.c$d != android.support.v4.provider.SelfDestructiveThread$ReplyCallback<android.support.v4.provider.FontsContractCompat$TypefaceResult> */
    /* renamed from: a, reason: contains not printable characters */
    public static Typeface m۸۴۳۸a(Context context, Ca request, Cf.a fontCallback, Handler handler, boolean isBlockingFetch, int timeout, int style) {
        String id = request.m۸۴۳۱c() + "-" + style;
        Typeface cached = f۸۶۶۸a.m۸۵۴۲b(id);
        if (cached != null) {
            if (fontCallback != null) {
                fontCallback.mo۱۳۶۰۷a(cached);
            }
            return cached;
        }
        if (isBlockingFetch && timeout == -1) {
            g typefaceResult = m۸۴۳۶a(context, request, style);
            if (fontCallback != null) {
                int i = typefaceResult.f۸۶۸۸b;
                if (i == 0) {
                    fontCallback.m۱۰۶۱۸a(typefaceResult.f۸۶۸۷a, handler);
                } else {
                    fontCallback.m۱۰۶۱۶a(i, handler);
                }
            }
            return typefaceResult.f۸۶۸۷a;
        }
        a aVar = new a(context, request, style, id);
        if (isBlockingFetch) {
            try {
                return ((g) f۸۶۶۹b.m۸۴۵۵a(aVar, timeout)).f۸۶۸۷a;
            } catch (InterruptedException e2) {
                return null;
            }
        }
        b bVar = fontCallback == null ? null : new b(fontCallback, handler);
        synchronized (f۸۶۷۰c) {
            if (f۸۶۷۱d.containsKey(id)) {
                if (bVar != null) {
                    f۸۶۷۱d.get(id).add(bVar);
                }
                return null;
            }
            if (bVar != null) {
                ArrayList<Cc.d<g>> arrayList = new ArrayList<>();
                arrayList.add(bVar);
                f۸۶۷۱d.put(id, arrayList);
            }
            f۸۶۶۹b.m۸۴۵۸a(aVar, new c(id));
            return null;
        }
    }

    /* renamed from: a.b.g.e.b$a */
    static class a implements Callable<g> {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ Context f۸۶۷۳a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ Ca f۸۶۷۴b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ int f۸۶۷۵c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ String f۸۶۷۶d;

        a(Context context, Ca ca, int i, String str) {
            this.f۸۶۷۳a = context;
            this.f۸۶۷۴b = ca;
            this.f۸۶۷۵c = i;
            this.f۸۶۷۶d = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public g call() {
            g typeface = Cb.m۸۴۳۶a(this.f۸۶۷۳a, this.f۸۶۷۴b, this.f۸۶۷۵c);
            Typeface typeface2 = typeface.f۸۶۸۷a;
            if (typeface2 != null) {
                Cb.f۸۶۶۸a.m۸۵۳۸a(this.f۸۶۷۶d, typeface2);
            }
            return typeface;
        }
    }

    /* renamed from: a.b.g.e.b$b */
    static class b implements Cc.d<g> {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ Cf.a f۸۶۷۷a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ Handler f۸۶۷۸b;

        b(Cf.a aVar, Handler handler) {
            this.f۸۶۷۷a = aVar;
            this.f۸۶۷۸b = handler;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۸e.Cc.d
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo۸۴۵۹a(g typeface) {
            if (typeface == null) {
                this.f۸۶۷۷a.m۱۰۶۱۶a(1, this.f۸۶۷۸b);
                return;
            }
            int i = typeface.f۸۶۸۸b;
            if (i == 0) {
                this.f۸۶۷۷a.m۱۰۶۱۸a(typeface.f۸۶۸۷a, this.f۸۶۷۸b);
            } else {
                this.f۸۶۷۷a.m۱۰۶۱۶a(i, this.f۸۶۷۸b);
            }
        }
    }

    /* renamed from: a.b.g.e.b$c */
    static class c implements Cc.d<g> {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ String f۸۶۷۹a;

        c(String str) {
            this.f۸۶۷۹a = str;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۸e.Cc.d
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo۸۴۵۹a(g typeface) {
            synchronized (Cb.f۸۶۷۰c) {
                try {
                    try {
                        ArrayList<Cc.d<g>> arrayList = Cb.f۸۶۷۱d.get(this.f۸۶۷۹a);
                        if (arrayList == null) {
                            return;
                        }
                        Cb.f۸۶۷۱d.remove(this.f۸۶۷۹a);
                        for (int i = 0; i < arrayList.size(); i++) {
                            arrayList.get(i).mo۸۴۵۹a(typeface);
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
    }

    /* renamed from: a.b.g.e.b$f */
    public static class f {

        /* renamed from: a, reason: contains not printable characters */
        private final Uri f۸۶۸۲a;

        /* renamed from: b, reason: contains not printable characters */
        private final int f۸۶۸۳b;

        /* renamed from: c, reason: contains not printable characters */
        private final int f۸۶۸۴c;

        /* renamed from: d, reason: contains not printable characters */
        private final boolean f۸۶۸۵d;

        /* renamed from: e, reason: contains not printable characters */
        private final int f۸۶۸۶e;

        public f(Uri uri, int ttcIndex, int weight, boolean italic, int resultCode) {
            Cm.m۸۵۷۲a(uri);
            this.f۸۶۸۲a = uri;
            this.f۸۶۸۳b = ttcIndex;
            this.f۸۶۸۴c = weight;
            this.f۸۶۸۵d = italic;
            this.f۸۶۸۶e = resultCode;
        }

        /* renamed from: c, reason: contains not printable characters */
        public Uri m۸۴۵۱c() {
            return this.f۸۶۸۲a;
        }

        /* renamed from: b, reason: contains not printable characters */
        public int m۸۴۵۰b() {
            return this.f۸۶۸۳b;
        }

        /* renamed from: d, reason: contains not printable characters */
        public int m۸۴۵۲d() {
            return this.f۸۶۸۴c;
        }

        /* renamed from: e, reason: contains not printable characters */
        public boolean m۸۴۵۳e() {
            return this.f۸۶۸۵d;
        }

        /* renamed from: a, reason: contains not printable characters */
        public int m۸۴۴۹a() {
            return this.f۸۶۸۶e;
        }
    }

    /* renamed from: a.b.g.e.b$e */
    public static class e {

        /* renamed from: a, reason: contains not printable characters */
        private final int f۸۶۸۰a;

        /* renamed from: b, reason: contains not printable characters */
        private final f[] f۸۶۸۱b;

        public e(int statusCode, f[] fonts) {
            this.f۸۶۸۰a = statusCode;
            this.f۸۶۸۱b = fonts;
        }

        /* renamed from: b, reason: contains not printable characters */
        public int m۸۴۴۸b() {
            return this.f۸۶۸۰a;
        }

        /* renamed from: a, reason: contains not printable characters */
        public f[] m۸۴۴۷a() {
            return this.f۸۶۸۱b;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Map<Uri, ByteBuffer> m۸۴۴۱a(Context context, f[] fonts, CancellationSignal cancellationSignal) {
        HashMap<Uri, ByteBuffer> out = new HashMap<>();
        for (f font : fonts) {
            if (font.m۸۴۴۹a() == 0) {
                Uri uri = font.m۸۴۵۱c();
                if (!out.containsKey(uri)) {
                    ByteBuffer buffer = Ci.m۸۴۱۸a(context, cancellationSignal, uri);
                    out.put(uri, buffer);
                }
            }
        }
        return Collections.unmodifiableMap(out);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static e m۸۴۳۵a(Context context, CancellationSignal cancellationSignal, Ca request) {
        ProviderInfo providerInfo = m۸۴۳۷a(context.getPackageManager(), request, context.getResources());
        if (providerInfo == null) {
            return new e(1, null);
        }
        f[] fonts = m۸۴۴۳a(context, request, providerInfo.authority, cancellationSignal);
        return new e(0, fonts);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static ProviderInfo m۸۴۳۷a(PackageManager packageManager, Ca request, Resources resources) {
        String providerAuthority = request.m۸۴۳۲d();
        ProviderInfo info2 = packageManager.resolveContentProvider(providerAuthority, 0);
        if (info2 == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
        }
        if (!info2.packageName.equals(request.m۸۴۳۳e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + request.m۸۴۳۳e());
        }
        PackageInfo packageInfo = packageManager.getPackageInfo(info2.packageName, 64);
        List<byte[]> signatures = m۸۴۴۰a(packageInfo.signatures);
        Collections.sort(signatures, f۸۶۷۲e);
        List<List<byte[]>> requestCertificatesList = m۸۴۳۹a(request, resources);
        for (int i = 0; i < requestCertificatesList.size(); i++) {
            List<byte[]> requestSignatures = new ArrayList<>(requestCertificatesList.get(i));
            Collections.sort(requestSignatures, f۸۶۷۲e);
            if (m۸۴۴۲a(signatures, requestSignatures)) {
                return info2;
            }
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static List<List<byte[]>> m۸۴۳۹a(Ca request, Resources resources) {
        if (request.m۸۴۲۹a() != null) {
            return request.m۸۴۲۹a();
        }
        int resourceId = request.m۸۴۳۰b();
        return android.support.v4.content.p۲۰۲e.Cc.m۱۰۵۸۸a(resources, resourceId);
    }

    /* renamed from: a.b.g.e.b$d */
    static class d implements Comparator<byte[]> {
        d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
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

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۸۴۴۲a(List<byte[]> signatures, List<byte[]> requestSignatures) {
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

    /* renamed from: a, reason: contains not printable characters */
    private static List<byte[]> m۸۴۴۰a(Signature[] signatures) {
        List<byte[]> shas = new ArrayList<>();
        for (Signature signature : signatures) {
            shas.add(signature.toByteArray());
        }
        return shas;
    }

    /* renamed from: a, reason: contains not printable characters */
    static f[] m۸۴۴۳a(Context context, Ca request, String authority, CancellationSignal cancellationSignal) {
        ArrayList<FontsContractCompat.FontInfo> result;
        String str;
        String str2;
        int i;
        String str3;
        ArrayList<FontsContractCompat.FontInfo> result2;
        Uri fileUri;
        ArrayList<FontsContractCompat.FontInfo> result3 = new ArrayList<>();
        Uri uri = new Uri.Builder().scheme("content").authority(authority).build();
        Uri fileBaseUri = new Uri.Builder().scheme("content").authority(authority).appendPath("file").build();
        Cursor cursor = null;
        try {
            try {
                if (Build.VERSION.SDK_INT > 16) {
                    str = "file_id";
                    str2 = "_id";
                    result = result3;
                    cursor = context.getContentResolver().query(uri, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{request.m۸۴۳۴f()}, null, cancellationSignal);
                    str3 = "font_ttc_index";
                    i = 1;
                } else {
                    result = result3;
                    str = "file_id";
                    str2 = "_id";
                    i = 1;
                    str3 = "font_ttc_index";
                    cursor = context.getContentResolver().query(uri, new String[]{str2, str, "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{request.m۸۴۳۴f()}, null);
                }
                if (cursor == null || cursor.getCount() <= 0) {
                    result2 = result;
                } else {
                    int resultCodeColumnIndex = cursor.getColumnIndex("result_code");
                    result2 = new ArrayList<>();
                    try {
                        int idColumnIndex = cursor.getColumnIndex(str2);
                        int fileIdColumnIndex = cursor.getColumnIndex(str);
                        int ttcIndexColumnIndex = cursor.getColumnIndex(str3);
                        int weightColumnIndex = cursor.getColumnIndex("font_weight");
                        int italicColumnIndex = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int resultCode = resultCodeColumnIndex != -1 ? cursor.getInt(resultCodeColumnIndex) : 0;
                            int ttcIndex = ttcIndexColumnIndex != -1 ? cursor.getInt(ttcIndexColumnIndex) : 0;
                            if (fileIdColumnIndex == -1) {
                                long id = cursor.getLong(idColumnIndex);
                                fileUri = ContentUris.withAppendedId(uri, id);
                            } else {
                                long id2 = cursor.getLong(fileIdColumnIndex);
                                fileUri = ContentUris.withAppendedId(fileBaseUri, id2);
                            }
                            int weight = weightColumnIndex != -1 ? cursor.getInt(weightColumnIndex) : 400;
                            boolean italic = italicColumnIndex != -1 && cursor.getInt(italicColumnIndex) == i;
                            result2.add(new f(fileUri, ttcIndex, weight, italic, resultCode));
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return (f[]) result2.toArray(new f[0]);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
