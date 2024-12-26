package p۱۳۹e.p۱۴۰f0.p۱۴۲f;

import p۱۳۹e.AbstractCt;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cv;
import p۱۳۹e.Cy;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Cg;

/* renamed from: e.f0.f.a  reason: invalid class name */
public final class Ca implements AbstractCt {

    /* renamed from: a  reason: contains not printable characters */
    public final Cv f۱۵۷۷۲a;

    public Ca(Cv client) {
        this.f۱۵۷۷۲a = client;
    }

    @Override // p۱۳۹e.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public Ca0 m۱۸۶۹۵a(AbstractCt.AbstractCa chain) {
        Cg realChain = (Cg) chain;
        Cy request = realChain.m۱۸۷۸۶b();
        Cg streamAllocation = realChain.m۱۸۷۹۳i();
        return realChain.m۱۸۷۸۵a(request, streamAllocation, streamAllocation.m۱۸۷۴۱a(this.f۱۵۷۷۲a, chain, !request.m۱۹۳۲۷e().equals("GET")), streamAllocation.m۱۸۷۴۶b());
    }
}
