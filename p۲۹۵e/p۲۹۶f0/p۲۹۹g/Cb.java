package p۲۹۵e.p۲۹۶f0.p۲۹۹g;

import java.net.ProtocolException;
import p۲۹۵e.Ca0;
import p۲۹۵e.Cy;
import p۲۹۵e.InterfaceCt;
import p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc;
import p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cg;
import p۳۰۵f.AbstractCg;
import p۳۰۵f.Cl;
import p۳۰۵f.InterfaceCd;
import p۳۰۵f.InterfaceCr;

/* renamed from: e.f0.g.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cb implements InterfaceCt {

    /* renamed from: a, reason: contains not printable characters */
    private final boolean f۱۵۸۲۰a;

    public Cb(boolean forWebSocket) {
        this.f۱۵۸۲۰a = forWebSocket;
    }

    @Override // p۲۹۵e.InterfaceCt
    /* renamed from: a, reason: contains not printable characters */
    public Ca0 mo۱۷۱۸۳a(InterfaceCt.a chain) {
        Ca0 response;
        Cg realChain = (Cg) chain;
        InterfaceCc httpCodec = realChain.m۱۶۷۱۳h();
        Cg streamAllocation = realChain.m۱۶۷۱۴i();
        Cc connection = (Cc) realChain.m۱۶۷۱۱f();
        Cy request = realChain.mo۱۷۱۸۶b();
        long sentRequestMillis = System.currentTimeMillis();
        realChain.m۱۶۷۱۲g().m۱۷۱۰۷d(realChain.m۱۶۷۱۰e());
        httpCodec.mo۱۶۷۹۴a(request);
        realChain.m۱۶۷۱۲g().m۱۷۰۹۶a(realChain.m۱۶۷۱۰e(), request);
        Ca0.a responseBuilder = null;
        if (Cf.m۱۶۷۰۰b(request.m۱۷۲۴۹e()) && request.m۱۷۲۴۳a() != null) {
            if ("100-continue".equalsIgnoreCase(request.m۱۷۲۴۴a("Expect"))) {
                httpCodec.mo۱۶۷۹۵b();
                realChain.m۱۶۷۱۲g().m۱۷۱۰۹f(realChain.m۱۶۷۱۰e());
                responseBuilder = httpCodec.mo۱۶۷۹۰a(true);
            }
            if (responseBuilder == null) {
                realChain.m۱۶۷۱۲g().m۱۷۱۰۶c(realChain.m۱۶۷۱۰e());
                long contentLength = request.m۱۷۲۴۳a().mo۱۷۲۶۵a();
                a requestBodyOut = new a(httpCodec.mo۱۶۷۹۲a(request, contentLength));
                InterfaceCd bufferedRequestBody = Cl.m۱۷۴۰۲a(requestBodyOut);
                request.m۱۷۲۴۳a().mo۱۷۲۶۶a(bufferedRequestBody);
                bufferedRequestBody.close();
                realChain.m۱۶۷۱۲g().m۱۷۰۹۲a(realChain.m۱۶۷۱۰e(), requestBodyOut.f۱۵۸۲۱d);
            } else if (!connection.m۱۶۶۳۵b()) {
                streamAllocation.m۱۶۶۶۹d();
            }
        }
        httpCodec.mo۱۶۷۹۳a();
        if (responseBuilder == null) {
            realChain.m۱۶۷۱۲g().m۱۷۱۰۹f(realChain.m۱۶۷۱۰e());
            responseBuilder = httpCodec.mo۱۶۷۹۰a(false);
        }
        responseBuilder.m۱۶۴۴۹a(request);
        responseBuilder.m۱۶۴۴۶a(streamAllocation.m۱۶۶۶۷b().m۱۶۶۲۸a());
        responseBuilder.m۱۶۴۵۳b(sentRequestMillis);
        responseBuilder.m۱۶۴۴۳a(System.currentTimeMillis());
        Ca0 response2 = responseBuilder.m۱۶۴۵۲a();
        int code = response2.m۱۶۴۲۸o();
        if (code == 100) {
            Ca0.a responseBuilder2 = httpCodec.mo۱۶۷۹۰a(false);
            responseBuilder2.m۱۶۴۴۹a(request);
            responseBuilder2.m۱۶۴۴۶a(streamAllocation.m۱۶۶۶۷b().m۱۶۶۲۸a());
            responseBuilder2.m۱۶۴۵۳b(sentRequestMillis);
            responseBuilder2.m۱۶۴۴۳a(System.currentTimeMillis());
            response2 = responseBuilder2.m۱۶۴۵۲a();
            code = response2.m۱۶۴۲۸o();
        }
        realChain.m۱۶۷۱۲g().m۱۷۰۹۳a(realChain.m۱۶۷۱۰e(), response2);
        if (this.f۱۵۸۲۰a && code == 101) {
            Ca0.a aVar = response2.m۱۶۴۳۴u();
            aVar.m۱۶۴۴۵a(p۲۹۵e.p۲۹۶f0.Cc.f۱۵۷۰۵c);
            response = aVar.m۱۶۴۵۲a();
        } else {
            Ca0.a aVar2 = response2.m۱۶۴۳۴u();
            aVar2.m۱۶۴۴۵a(httpCodec.mo۱۶۷۹۱a(response2));
            response = aVar2.m۱۶۴۵۲a();
        }
        if ("close".equalsIgnoreCase(response.m۱۶۴۳۸y().m۱۷۲۴۴a("Connection")) || "close".equalsIgnoreCase(response.m۱۶۴۲۴b("Connection"))) {
            streamAllocation.m۱۶۶۶۹d();
        }
        if ((code == 204 || code == 205) && response.m۱۶۴۲۵l().mo۱۶۷۱۵l() > 0) {
            throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + response.m۱۶۴۲۵l().mo۱۶۷۱۵l());
        }
        return response;
    }

    /* renamed from: e.f0.g.b$a */
    static final class a extends AbstractCg {

        /* renamed from: d, reason: contains not printable characters */
        long f۱۵۸۲۱d;

        a(InterfaceCr delegate) {
            super(delegate);
        }

        @Override // p۳۰۵f.AbstractCg, p۳۰۵f.InterfaceCr
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۴۷۵a(p۳۰۵f.Cc source, long byteCount) {
            super.mo۱۷۴۷۵a(source, byteCount);
            this.f۱۵۸۲۱d += byteCount;
        }
    }
}
