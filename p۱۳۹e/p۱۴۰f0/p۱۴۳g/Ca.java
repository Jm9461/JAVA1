package p۱۳۹e.p۱۴۰f0.p۱۴۳g;

import java.util.List;
import okhttp3.Cookie;
import p۱۳۹e.AbstractCm;
import p۱۳۹e.AbstractCt;
import p۱۳۹e.AbstractCz;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cl;
import p۱۳۹e.Cr;
import p۱۳۹e.Cu;
import p۱۳۹e.Cy;
import p۱۳۹e.p۱۴۰f0.Cc;
import p۱۳۹e.p۱۴۰f0.Cd;
import p۱۴۹f.Cj;

/* renamed from: e.f0.g.a  reason: invalid class name */
public final class Ca implements AbstractCt {

    /* renamed from: a  reason: contains not printable characters */
    private final AbstractCm f۱۵۸۱۹a;

    public Ca(AbstractCm cookieJar) {
        this.f۱۵۸۱۹a = cookieJar;
    }

    @Override // p۱۳۹e.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public Ca0 m۱۸۷۵۲a(AbstractCt.AbstractCa chain) {
        Cy userRequest = chain.m۱۹۲۶۵b();
        Cy.Ca requestBuilder = userRequest.m۱۹۳۲۸f();
        AbstractCz body = userRequest.m۱۹۳۲۱a();
        if (body != null) {
            Cu contentType = body.m۱۹۳۴۲b();
            if (contentType == null) {
                long contentLength = body.m۱۹۳۴۰a();
                if (contentLength != -1) {
                    requestBuilder.m۱۹۳۳۵a("Content-Length", Long.toString(contentLength));
                    requestBuilder.m۱۹۳۳۳a("Transfer-Encoding");
                } else {
                    requestBuilder.m۱۹۳۳۵a("Transfer-Encoding", "chunked");
                    requestBuilder.m۱۹۳۳۳a("Content-Length");
                }
            } else {
                contentType.toString();
                throw null;
            }
        }
        if (userRequest.m۱۹۳۲۲a("Host") == null) {
            requestBuilder.m۱۹۳۳۵a("Host", Cc.m۱۸۶۱۲a(userRequest.m۱۹۳۲۹g(), false));
        }
        if (userRequest.m۱۹۳۲۲a("Connection") == null) {
            requestBuilder.m۱۹۳۳۵a("Connection", "Keep-Alive");
        }
        boolean transparentGzip = false;
        if (userRequest.m۱۹۳۲۲a("Accept-Encoding") == null && userRequest.m۱۹۳۲۲a("Range") == null) {
            transparentGzip = true;
            requestBuilder.m۱۹۳۳۵a("Accept-Encoding", "gzip");
        }
        List<Cookie> cookies = this.f۱۵۸۱۹a.m۱۹۱۵۵a(userRequest.m۱۹۳۲۹g());
        if (!cookies.isEmpty()) {
            requestBuilder.m۱۹۳۳۵a("Cookie", m۱۸۷۵۱a((List<Cl>) cookies));
        }
        if (userRequest.m۱۹۳۲۲a("User-Agent") == null) {
            requestBuilder.m۱۹۳۳۵a("User-Agent", Cd.m۱۸۶۳۸a());
        }
        Ca0 networkResponse = chain.m۱۹۲۶۴a(requestBuilder.m۱۹۳۳۶a());
        Ce.m۱۸۷۶۹a(this.f۱۵۸۱۹a, userRequest.m۱۹۳۲۹g(), networkResponse.m۱۸۵۰۹q());
        Ca0.Ca responseBuilder = networkResponse.m۱۸۵۱۳u().m۱۸۵۲۸a(userRequest);
        if (transparentGzip && "gzip".equalsIgnoreCase(networkResponse.m۱۸۵۰۳b("Content-Encoding")) && Ce.m۱۸۷۷۲b(networkResponse)) {
            Cj responseBody = new Cj(networkResponse.m۱۸۵۰۴l().m۱۸۵۴۰m());
            Cr.Ca a = networkResponse.m۱۸۵۰۹q().m۱۹۱۹۹a();
            a.m۱۹۲۱۱c("Content-Encoding");
            a.m۱۹۲۱۱c("Content-Length");
            responseBuilder.m۱۸۵۲۶a(a.m۱۹۲۰۸a());
            responseBuilder.m۱۸۵۲۴a(new Ch(networkResponse.m۱۸۵۰۳b("Content-Type"), -1, p۱۴۹f.Cl.m۱۹۴۸۰a(responseBody)));
        }
        return responseBuilder.m۱۸۵۳۱a();
    }

    /* renamed from: a  reason: contains not printable characters */
    private String m۱۸۷۵۱a(List<Cl> list) {
        StringBuilder cookieHeader = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cookieHeader.append("; ");
            }
            Cl cookie = list.get(i);
            cookieHeader.append(cookie.m۱۹۱۵۲a());
            cookieHeader.append('=');
            cookieHeader.append(cookie.m۱۹۱۵۴b());
        }
        return cookieHeader.toString();
    }
}
