package p۲۹۵e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Interceptor;
import p۲۹۵e.InterfaceCt;
import p۲۹۵e.p۲۹۶f0.AbstractRunnableCb;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ca;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Cb;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Cg;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Cj;
import p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf;

/* renamed from: e.x, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cx implements InterfaceCe {

    /* renamed from: c, reason: contains not printable characters */
    final Cv f۱۶۲۳۴c;

    /* renamed from: d, reason: contains not printable characters */
    final Cj f۱۶۲۳۵d;

    /* renamed from: e, reason: contains not printable characters */
    private AbstractCp f۱۶۲۳۶e;

    /* renamed from: f, reason: contains not printable characters */
    final Cy f۱۶۲۳۷f;

    /* renamed from: g, reason: contains not printable characters */
    final boolean f۱۶۲۳۸g;

    /* renamed from: h, reason: contains not printable characters */
    private boolean f۱۶۲۳۹h;

    private Cx(Cv client, Cy originalRequest, boolean forWebSocket) {
        this.f۱۶۲۳۴c = client;
        this.f۱۶۲۳۷f = originalRequest;
        this.f۱۶۲۳۸g = forWebSocket;
        this.f۱۶۲۳۵d = new Cj(client, forWebSocket);
    }

    /* renamed from: a, reason: contains not printable characters */
    static Cx m۱۷۲۳۲a(Cv client, Cy originalRequest, boolean forWebSocket) {
        Cx call = new Cx(client, originalRequest, forWebSocket);
        call.f۱۶۲۳۶e = client.m۱۷۲۰۲j().mo۱۷۱۱۲a(call);
        return call;
    }

    @Override // p۲۹۵e.InterfaceCe
    /* renamed from: l, reason: contains not printable characters */
    public Ca0 mo۱۷۲۳۸l() {
        synchronized (this) {
            if (this.f۱۶۲۳۹h) {
                throw new IllegalStateException("Already Executed");
            }
            this.f۱۶۲۳۹h = true;
        }
        m۱۷۲۳۳e();
        this.f۱۶۲۳۶e.m۱۷۱۰۳b(this);
        try {
            try {
                this.f۱۶۲۳۴c.m۱۷۲۰۰h().m۱۷۰۸۵a(this);
                Ca0 result = m۱۷۲۳۴a();
                if (result == null) {
                    throw new IOException("Canceled");
                }
                return result;
            } catch (IOException e2) {
                this.f۱۶۲۳۶e.m۱۷۰۹۷a(this, e2);
                throw e2;
            }
        } finally {
            this.f۱۶۲۳۴c.m۱۷۲۰۰h().m۱۷۰۸۷b(this);
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    private void m۱۷۲۳۳e() {
        Object callStackTrace = Cf.m۱۷۰۰۷d().mo۱۷۰۱۰a("response.body().close()");
        this.f۱۶۲۳۵d.m۱۶۷۲۷a(callStackTrace);
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۷۲۳۵b() {
        return this.f۱۶۲۳۵d.m۱۶۷۲۸a();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Cx m۱۷۲۳۹clone() {
        return m۱۷۲۳۲a(this.f۱۶۲۳۴c, this.f۱۶۲۳۷f, this.f۱۶۲۳۸g);
    }

    /* renamed from: e.x$a */
    final class a extends AbstractRunnableCb {

        /* renamed from: d, reason: contains not printable characters */
        private final InterfaceCf f۱۶۲۴۰d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ Cx f۱۶۲۴۱e;

        /* renamed from: d, reason: contains not printable characters */
        String m۱۷۲۴۲d() {
            return this.f۱۶۲۴۱e.f۱۶۲۳۷f.m۱۷۲۵۱g().m۱۷۱۵۵g();
        }

        /* renamed from: c, reason: contains not printable characters */
        Cx m۱۷۲۴۱c() {
            return this.f۱۶۲۴۱e;
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractRunnableCb
        /* renamed from: b, reason: contains not printable characters */
        protected void mo۱۷۲۴۰b() {
            boolean signalledCallback = false;
            try {
                try {
                    Ca0 response = this.f۱۶۲۴۱e.m۱۷۲۳۴a();
                    if (this.f۱۶۲۴۱e.f۱۶۲۳۵d.m۱۶۷۲۸a()) {
                        signalledCallback = true;
                        this.f۱۶۲۴۰d.m۱۶۵۱۶a(this.f۱۶۲۴۱e, new IOException("Canceled"));
                    } else {
                        signalledCallback = true;
                        this.f۱۶۲۴۰d.m۱۶۵۱۵a(this.f۱۶۲۴۱e, response);
                    }
                } catch (IOException e2) {
                    if (!signalledCallback) {
                        this.f۱۶۲۴۱e.f۱۶۲۳۶e.m۱۷۰۹۷a(this.f۱۶۲۴۱e, e2);
                        this.f۱۶۲۴۰d.m۱۶۵۱۶a(this.f۱۶۲۴۱e, e2);
                    } else {
                        Cf.m۱۷۰۰۷d().mo۱۷۰۱۲a(4, "Callback failure for " + this.f۱۶۲۴۱e.m۱۷۲۳۷d(), e2);
                    }
                }
            } finally {
                this.f۱۶۲۴۱e.f۱۶۲۳۴c.m۱۷۲۰۰h().m۱۷۰۸۴a(this);
            }
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    String m۱۷۲۳۷d() {
        StringBuilder sb = new StringBuilder();
        sb.append(m۱۷۲۳۵b() ? "canceled " : "");
        sb.append(this.f۱۶۲۳۸g ? "web socket" : "call");
        sb.append(" to ");
        sb.append(m۱۷۲۳۶c());
        return sb.toString();
    }

    /* renamed from: c, reason: contains not printable characters */
    String m۱۷۲۳۶c() {
        return this.f۱۶۲۳۷f.m۱۷۲۵۱g().m۱۷۱۶۰l();
    }

    /* renamed from: a, reason: contains not printable characters */
    Ca0 m۱۷۲۳۴a() {
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.addAll(this.f۱۶۲۳۴c.m۱۷۲۰۶o());
        interceptors.add(this.f۱۶۲۳۵d);
        interceptors.add(new Ca(this.f۱۶۲۳۴c.m۱۷۱۹۹g()));
        interceptors.add(new p۲۹۵e.p۲۹۶f0.p۲۹۷e.Ca(this.f۱۶۲۳۴c.m۱۷۲۰۷p()));
        interceptors.add(new p۲۹۵e.p۲۹۶f0.p۲۹۸f.Ca(this.f۱۶۲۳۴c));
        if (!this.f۱۶۲۳۸g) {
            interceptors.addAll(this.f۱۶۲۳۴c.m۱۷۲۰۸q());
        }
        interceptors.add(new Cb(this.f۱۶۲۳۸g));
        InterfaceCt.a chain = new Cg(interceptors, null, null, null, 0, this.f۱۶۲۳۷f, this, this.f۱۶۲۳۶e, this.f۱۶۲۳۴c.m۱۷۱۹۶d(), this.f۱۶۲۳۴c.m۱۷۲۱۴w(), this.f۱۶۲۳۴c.m۱۷۱۹۱A());
        return chain.mo۱۷۱۸۵a(this.f۱۶۲۳۷f);
    }
}
