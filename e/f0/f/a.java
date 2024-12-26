package e.f0.f;

import e.a0;
import e.f0.g.g;
import e.t;
import e.v;
import e.y;

public final class a implements t {

    /* renamed from: a  reason: collision with root package name */
    public final v f۳۷۹۲a;

    public a(v client) {
        this.f۳۷۹۲a = client;
    }

    @Override // e.t
    public a0 a(t.a chain) {
        g realChain = (g) chain;
        y request = realChain.b();
        g streamAllocation = realChain.i();
        return realChain.a(request, streamAllocation, streamAllocation.a(this.f۳۷۹۲a, chain, !request.e().equals("GET")), streamAllocation.b());
    }
}
