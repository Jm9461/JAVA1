package e.f0.g;

import e.a0;
import e.f0.f.c;
import e.f0.f.g;
import e.t;
import e.y;
import f.d;
import f.l;
import f.r;
import java.net.ProtocolException;

public final class b implements t {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f۳۸۲۷a;

    public b(boolean forWebSocket) {
        this.f۳۸۲۷a = forWebSocket;
    }

    @Override // e.t
    public a0 a(t.a chain) {
        a0 response;
        g realChain = (g) chain;
        c httpCodec = realChain.h();
        g streamAllocation = realChain.i();
        c connection = (c) realChain.f();
        y request = realChain.b();
        long sentRequestMillis = System.currentTimeMillis();
        realChain.g().d(realChain.e());
        httpCodec.a(request);
        realChain.g().a(realChain.e(), request);
        a0.a responseBuilder = null;
        if (f.b(request.e()) && request.a() != null) {
            if ("100-continue".equalsIgnoreCase(request.a("Expect"))) {
                httpCodec.b();
                realChain.g().f(realChain.e());
                responseBuilder = httpCodec.a(true);
            }
            if (responseBuilder == null) {
                realChain.g().c(realChain.e());
                a requestBodyOut = new a(httpCodec.a(request, request.a().a()));
                d bufferedRequestBody = l.a(requestBodyOut);
                request.a().a(bufferedRequestBody);
                bufferedRequestBody.close();
                realChain.g().a(realChain.e(), requestBodyOut.f۳۸۲۸d);
            } else if (!connection.b()) {
                streamAllocation.d();
            }
        }
        httpCodec.a();
        if (responseBuilder == null) {
            realChain.g().f(realChain.e());
            responseBuilder = httpCodec.a(false);
        }
        responseBuilder.a(request);
        responseBuilder.a(streamAllocation.b().a());
        responseBuilder.b(sentRequestMillis);
        responseBuilder.a(System.currentTimeMillis());
        a0 response2 = responseBuilder.a();
        int code = response2.o();
        if (code == 100) {
            a0.a responseBuilder2 = httpCodec.a(false);
            responseBuilder2.a(request);
            responseBuilder2.a(streamAllocation.b().a());
            responseBuilder2.b(sentRequestMillis);
            responseBuilder2.a(System.currentTimeMillis());
            response2 = responseBuilder2.a();
            code = response2.o();
        }
        realChain.g().a(realChain.e(), response2);
        if (!this.f۳۸۲۷a || code != 101) {
            a0.a u = response2.u();
            u.a(httpCodec.a(response2));
            response = u.a();
        } else {
            a0.a u2 = response2.u();
            u2.a(e.f0.c.f۳۷۴۴c);
            response = u2.a();
        }
        if ("close".equalsIgnoreCase(response.y().a("Connection")) || "close".equalsIgnoreCase(response.b("Connection"))) {
            streamAllocation.d();
        }
        if ((code != 204 && code != 205) || response.l().l() <= 0) {
            return response;
        }
        throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + response.l().l());
    }

    static final class a extends f.g {

        /* renamed from: d  reason: collision with root package name */
        long f۳۸۲۸d;

        a(r delegate) {
            super(delegate);
        }

        @Override // f.r, f.g
        public void a(f.c source, long byteCount) {
            super.a(source, byteCount);
            this.f۳۸۲۸d += byteCount;
        }
    }
}
