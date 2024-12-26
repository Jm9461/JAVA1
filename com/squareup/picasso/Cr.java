package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.AbstractCy;
import com.squareup.picasso.Ct;
import java.io.IOException;
import p۱۳۹e.AbstractCb0;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cd;
import p۱۳۹e.Cy;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.r  reason: invalid class name */
public class Cr extends AbstractCy {

    /* renamed from: a  reason: contains not printable characters */
    private final AbstractCj f۱۵۴۷۷a;

    /* renamed from: b  reason: contains not printable characters */
    private final Ca0 f۱۵۴۷۸b;

    Cr(AbstractCj downloader, Ca0 stats) {
        this.f۱۵۴۷۷a = downloader;
        this.f۱۵۴۷۸b = stats;
    }

    @Override // com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۳۹۰a(Cw data) {
        String scheme = data.f۱۵۵۳۵d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCy.Ca m۱۸۳۸۹a(Cw request, int networkPolicy) {
        Ca0 response = this.f۱۵۴۷۷a.m۱۸۳۶۲a(m۱۸۳۸۷b(request, networkPolicy));
        AbstractCb0 body = response.m۱۸۵۰۴l();
        if (response.m۱۸۵۱۰r()) {
            Ct.EnumCe loadedFrom = response.m۱۸۵۰۶n() == null ? Ct.EnumCe.NETWORK : Ct.EnumCe.DISK;
            if (loadedFrom == Ct.EnumCe.DISK && body.m۱۸۵۳۹l() == 0) {
                body.close();
                throw new Ca("Received response with 0 content-length header.");
            }
            if (loadedFrom == Ct.EnumCe.NETWORK && body.m۱۸۵۳۹l() > 0) {
                this.f۱۵۴۷۸b.m۱۸۲۵۹a(body.m۱۸۵۳۹l());
            }
            return new AbstractCy.Ca(body.m۱۸۵۴۰m(), loadedFrom);
        }
        body.close();
        throw new Cb(response.m۱۸۵۰۷o(), request.f۱۵۵۳۴c);
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۸۳۸۸a() {
        return 2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۳۹۱a(boolean airplaneMode, NetworkInfo info2) {
        return info2 == null || info2.isConnected();
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractCy
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۸۳۹۲b() {
        return true;
    }

    /* renamed from: b  reason: contains not printable characters */
    private static Cy m۱۸۳۸۷b(Cw request, int networkPolicy) {
        Cd cacheControl = null;
        if (networkPolicy != 0) {
            if (EnumCq.m۱۸۳۸۴a(networkPolicy)) {
                cacheControl = Cd.f۱۵۶۷۲n;
            } else {
                Cd.Ca builder = new Cd.Ca();
                if (!EnumCq.m۱۸۳۸۵b(networkPolicy)) {
                    builder.m۱۸۵۸۶b();
                }
                if (!EnumCq.m۱۸۳۸۶c(networkPolicy)) {
                    builder.m۱۸۵۸۷c();
                }
                cacheControl = builder.m۱۸۵۸۵a();
            }
        }
        Cy.Ca builder2 = new Cy.Ca().m۱۹۳۳۷b(request.f۱۵۵۳۵d.toString());
        if (cacheControl != null) {
            builder2.m۱۹۳۳۰a(cacheControl);
        }
        return builder2.m۱۹۳۳۶a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.r$a  reason: invalid class name */
    public static class Ca extends IOException {
        Ca(String message) {
            super(message);
        }
    }

    /* renamed from: com.squareup.picasso.r$b  reason: invalid class name */
    static final class Cb extends IOException {

        /* renamed from: c  reason: contains not printable characters */
        final int f۱۵۴۷۹c;

        /* renamed from: d  reason: contains not printable characters */
        final int f۱۵۴۸۰d;

        Cb(int code, int networkPolicy) {
            super("HTTP " + code);
            this.f۱۵۴۷۹c = code;
            this.f۱۵۴۸۰d = networkPolicy;
        }
    }
}
