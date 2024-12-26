package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import e.a0;
import e.b0;
import e.d;
import e.y;
import java.io.IOException;

/* access modifiers changed from: package-private */
public class r extends y {

    /* renamed from: a  reason: collision with root package name */
    private final j f۳۵۸۰a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f۳۵۸۱b;

    r(j downloader, a0 stats) {
        this.f۳۵۸۰a = downloader;
        this.f۳۵۸۱b = stats;
    }

    @Override // com.squareup.picasso.y
    public boolean a(w data) {
        String scheme = data.f۳۶۲۶d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.y
    public y.a a(w request, int networkPolicy) {
        a0 response = this.f۳۵۸۰a.a(b(request, networkPolicy));
        b0 body = response.l();
        if (response.r()) {
            t.e loadedFrom = response.n() == null ? t.e.NETWORK : t.e.DISK;
            if (loadedFrom == t.e.DISK && body.l() == 0) {
                body.close();
                throw new a("Received response with 0 content-length header.");
            }
            if (loadedFrom == t.e.NETWORK && body.l() > 0) {
                this.f۳۵۸۱b.a(body.l());
            }
            return new y.a(body.m(), loadedFrom);
        }
        body.close();
        throw new b(response.o(), request.f۳۶۲۵c);
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.y
    public int a() {
        return 2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.y
    public boolean a(boolean airplaneMode, NetworkInfo info2) {
        return info2 == null || info2.isConnected();
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.y
    public boolean b() {
        return true;
    }

    private static e.y b(w request, int networkPolicy) {
        d cacheControl = null;
        if (networkPolicy != 0) {
            if (q.a(networkPolicy)) {
                cacheControl = d.n;
            } else {
                d.a builder = new d.a();
                if (!q.b(networkPolicy)) {
                    builder.b();
                }
                if (!q.c(networkPolicy)) {
                    builder.c();
                }
                cacheControl = builder.a();
            }
        }
        y.a builder2 = new y.a().b(request.f۳۶۲۶d.toString());
        if (cacheControl != null) {
            builder2.a(cacheControl);
        }
        return builder2.a();
    }

    /* access modifiers changed from: package-private */
    public static class a extends IOException {
        a(String message) {
            super(message);
        }
    }

    static final class b extends IOException {

        /* renamed from: c  reason: collision with root package name */
        final int f۳۵۸۲c;

        /* renamed from: d  reason: collision with root package name */
        final int f۳۵۸۳d;

        b(int code, int networkPolicy) {
            super("HTTP " + code);
            this.f۳۵۸۲c = code;
            this.f۳۵۸۳d = networkPolicy;
        }
    }
}
