package e.f0.g;

import e.a0;
import e.f0.c;
import e.f0.d;
import e.l;
import e.m;
import e.r;
import e.t;
import e.u;
import e.y;
import e.z;
import f.j;
import java.util.List;
import okhttp3.Cookie;

public final class a implements t {

    /* renamed from: a  reason: collision with root package name */
    private final m f۳۸۲۶a;

    public a(m cookieJar) {
        this.f۳۸۲۶a = cookieJar;
    }

    @Override // e.t
    public a0 a(t.a chain) {
        y userRequest = chain.b();
        y.a requestBuilder = userRequest.f();
        z body = userRequest.a();
        if (body != null) {
            u contentType = body.b();
            if (contentType == null) {
                long contentLength = body.a();
                if (contentLength != -1) {
                    requestBuilder.a("Content-Length", Long.toString(contentLength));
                    requestBuilder.a("Transfer-Encoding");
                } else {
                    requestBuilder.a("Transfer-Encoding", "chunked");
                    requestBuilder.a("Content-Length");
                }
            } else {
                contentType.toString();
                throw null;
            }
        }
        if (userRequest.a("Host") == null) {
            requestBuilder.a("Host", c.a(userRequest.g(), false));
        }
        if (userRequest.a("Connection") == null) {
            requestBuilder.a("Connection", "Keep-Alive");
        }
        boolean transparentGzip = false;
        if (userRequest.a("Accept-Encoding") == null && userRequest.a("Range") == null) {
            transparentGzip = true;
            requestBuilder.a("Accept-Encoding", "gzip");
        }
        List<Cookie> cookies = this.f۳۸۲۶a.a(userRequest.g());
        if (!cookies.isEmpty()) {
            requestBuilder.a("Cookie", a((List<l>) cookies));
        }
        if (userRequest.a("User-Agent") == null) {
            requestBuilder.a("User-Agent", d.a());
        }
        a0 networkResponse = chain.a(requestBuilder.a());
        e.a(this.f۳۸۲۶a, userRequest.g(), networkResponse.q());
        a0.a responseBuilder = networkResponse.u().a(userRequest);
        if (transparentGzip && "gzip".equalsIgnoreCase(networkResponse.b("Content-Encoding")) && e.b(networkResponse)) {
            j responseBody = new j(networkResponse.l().m());
            r.a a2 = networkResponse.q().a();
            a2.c("Content-Encoding");
            a2.c("Content-Length");
            responseBuilder.a(a2.a());
            responseBuilder.a(new h(networkResponse.b("Content-Type"), -1, f.l.a(responseBody)));
        }
        return responseBuilder.a();
    }

    private String a(List<l> list) {
        StringBuilder cookieHeader = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cookieHeader.append("; ");
            }
            l cookie = list.get(i);
            cookieHeader.append(cookie.a());
            cookieHeader.append('=');
            cookieHeader.append(cookie.b());
        }
        return cookieHeader.toString();
    }
}
