package p۲۹۵e.p۲۹۶f0.p۲۹۸f;

import p۲۹۵e.Ca0;
import p۲۹۵e.Cv;
import p۲۹۵e.Cy;
import p۲۹۵e.InterfaceCt;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Cg;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc;

/* renamed from: e.f0.f.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca implements InterfaceCt {

    /* renamed from: a, reason: contains not printable characters */
    public final Cv f۱۵۷۷۲a;

    public Ca(Cv client) {
        this.f۱۵۷۷۲a = client;
    }

    @Override // p۲۹۵e.InterfaceCt
    /* renamed from: a, reason: contains not printable characters */
    public Ca0 mo۱۷۱۸۳a(InterfaceCt.a chain) {
        Cg realChain = (Cg) chain;
        Cy request = realChain.mo۱۷۱۸۶b();
        Cg streamAllocation = realChain.m۱۶۷۱۴i();
        boolean doExtensiveHealthChecks = !request.m۱۷۲۴۹e().equals("GET");
        InterfaceCc httpCodec = streamAllocation.m۱۶۶۶۲a(this.f۱۵۷۷۲a, chain, doExtensiveHealthChecks);
        Cc connection = streamAllocation.m۱۶۶۶۷b();
        return realChain.m۱۶۷۰۶a(request, streamAllocation, httpCodec, connection);
    }
}
