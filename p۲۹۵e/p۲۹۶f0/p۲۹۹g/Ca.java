package p۲۹۵e.p۲۹۶f0.p۲۹۹g;

import java.util.List;
import p۲۹۵e.AbstractCz;
import p۲۹۵e.Ca0;
import p۲۹۵e.Cl;
import p۲۹۵e.Cr;
import p۲۹۵e.Cu;
import p۲۹۵e.Cy;
import p۲۹۵e.InterfaceCm;
import p۲۹۵e.InterfaceCt;
import p۲۹۵e.p۲۹۶f0.Cc;
import p۲۹۵e.p۲۹۶f0.Cd;
import p۳۰۵f.Cj;

/* renamed from: e.f0.g.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca implements InterfaceCt {

    /* renamed from: a, reason: contains not printable characters */
    private final InterfaceCm f۱۵۸۱۹a;

    public Ca(InterfaceCm cookieJar) {
        this.f۱۵۸۱۹a = cookieJar;
    }

    @Override // p۲۹۵e.InterfaceCt
    /* renamed from: a, reason: contains not printable characters */
    public Ca0 mo۱۷۱۸۳a(InterfaceCt.a chain) {
        Cy userRequest = chain.mo۱۷۱۸۶b();
        Cy.a requestBuilder = userRequest.m۱۷۲۵۰f();
        AbstractCz body = userRequest.m۱۷۲۴۳a();
        if (body != null) {
            Cu contentType = body.mo۱۷۲۶۷b();
            if (contentType != null) {
                contentType.toString();
                throw null;
            }
            long contentLength = body.mo۱۷۲۶۵a();
            if (contentLength == -1) {
                requestBuilder.m۱۷۲۵۷a("Transfer-Encoding", "chunked");
                requestBuilder.m۱۷۲۵۵a("Content-Length");
            } else {
                requestBuilder.m۱۷۲۵۷a("Content-Length", Long.toString(contentLength));
                requestBuilder.m۱۷۲۵۵a("Transfer-Encoding");
            }
        }
        if (userRequest.m۱۷۲۴۴a("Host") == null) {
            requestBuilder.m۱۷۲۵۷a("Host", Cc.m۱۶۵۳۳a(userRequest.m۱۷۲۵۱g(), false));
        }
        if (userRequest.m۱۷۲۴۴a("Connection") == null) {
            requestBuilder.m۱۷۲۵۷a("Connection", "Keep-Alive");
        }
        boolean transparentGzip = false;
        if (userRequest.m۱۷۲۴۴a("Accept-Encoding") == null && userRequest.m۱۷۲۴۴a("Range") == null) {
            transparentGzip = true;
            requestBuilder.m۱۷۲۵۷a("Accept-Encoding", "gzip");
        }
        List<Cl> list = this.f۱۵۸۱۹a.mo۱۷۰۷۸a(userRequest.m۱۷۲۵۱g());
        if (!list.isEmpty()) {
            requestBuilder.m۱۷۲۵۷a("Cookie", m۱۶۶۷۲a(list));
        }
        if (userRequest.m۱۷۲۴۴a("User-Agent") == null) {
            requestBuilder.m۱۷۲۵۷a("User-Agent", Cd.m۱۶۵۵۹a());
        }
        Ca0 networkResponse = chain.mo۱۷۱۸۵a(requestBuilder.m۱۷۲۵۸a());
        Ce.m۱۶۶۹۰a(this.f۱۵۸۱۹a, userRequest.m۱۷۲۵۱g(), networkResponse.m۱۶۴۳۰q());
        Ca0.a responseBuilder = networkResponse.m۱۶۴۳۴u().m۱۶۴۴۹a(userRequest);
        if (transparentGzip && "gzip".equalsIgnoreCase(networkResponse.m۱۶۴۲۴b("Content-Encoding")) && Ce.m۱۶۶۹۳b(networkResponse)) {
            Cj responseBody = new Cj(networkResponse.m۱۶۴۲۵l().mo۱۶۷۱۶m());
            Cr.a aVar = networkResponse.m۱۶۴۳۰q().m۱۷۱۲۰a();
            aVar.m۱۷۱۳۲c("Content-Encoding");
            aVar.m۱۷۱۳۲c("Content-Length");
            Cr strippedHeaders = aVar.m۱۷۱۲۹a();
            responseBuilder.m۱۶۴۴۷a(strippedHeaders);
            responseBuilder.m۱۶۴۴۵a(new Ch(networkResponse.m۱۶۴۲۴b("Content-Type"), -1L, p۳۰۵f.Cl.m۱۷۴۰۳a(responseBody)));
        }
        return responseBuilder.m۱۶۴۵۲a();
    }

    /* renamed from: a, reason: contains not printable characters */
    private String m۱۶۶۷۲a(List<Cl> list) {
        StringBuilder cookieHeader = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cookieHeader.append("; ");
            }
            Cl cookie = list.get(i);
            cookieHeader.append(cookie.m۱۷۰۷۳a());
            cookieHeader.append('=');
            cookieHeader.append(cookie.m۱۷۰۷۵b());
        }
        return cookieHeader.toString();
    }
}
