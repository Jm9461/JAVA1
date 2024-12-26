package p۱۳۹e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Interceptor;
import p۱۳۹e.p۱۴۰f0.AbstractRunnableCb;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Cb;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Cg;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Cj;
import p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf;

/* access modifiers changed from: package-private */
/* renamed from: e.x  reason: invalid class name */
public final class Cx implements AbstractCe {

    /* renamed from: c  reason: contains not printable characters */
    final Cv f۱۶۲۳۴c;

    /* renamed from: d  reason: contains not printable characters */
    final Cj f۱۶۲۳۵d;

    /* renamed from: e  reason: contains not printable characters */
    private AbstractCp f۱۶۲۳۶e;

    /* renamed from: f  reason: contains not printable characters */
    final Cy f۱۶۲۳۷f;

    /* renamed from: g  reason: contains not printable characters */
    final boolean f۱۶۲۳۸g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۶۲۳۹h;

    private Cx(Cv client, Cy originalRequest, boolean forWebSocket) {
        this.f۱۶۲۳۴c = client;
        this.f۱۶۲۳۷f = originalRequest;
        this.f۱۶۲۳۸g = forWebSocket;
        this.f۱۶۲۳۵d = new Cj(client, forWebSocket);
    }

    /* renamed from: a  reason: contains not printable characters */
    static Cx m۱۹۳۱۱a(Cv client, Cy originalRequest, boolean forWebSocket) {
        Cx call = new Cx(client, originalRequest, forWebSocket);
        call.f۱۶۲۳۶e = client.m۱۹۲۸۱j().m۱۹۱۹۱a(call);
        return call;
    }

    @Override // p۱۳۹e.AbstractCe
    /* renamed from: l  reason: contains not printable characters */
    public Ca0 m۱۹۳۱۷l() {
        synchronized (this) {
            if (!this.f۱۶۲۳۹h) {
                this.f۱۶۲۳۹h = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m۱۹۳۱۲e();
        this.f۱۶۲۳۶e.m۱۹۱۸۲b(this);
        try {
            this.f۱۶۲۳۴c.m۱۹۲۷۹h().m۱۹۱۶۴a(this);
            Ca0 result = m۱۹۳۱۳a();
            if (result != null) {
                this.f۱۶۲۳۴c.m۱۹۲۷۹h().m۱۹۱۶۶b(this);
                return result;
            }
            throw new IOException("Canceled");
        } catch (IOException e) {
            this.f۱۶۲۳۶e.m۱۹۱۷۶a(this, e);
            throw e;
        } catch (Throwable th) {
            this.f۱۶۲۳۴c.m۱۹۲۷۹h().m۱۹۱۶۶b(this);
            throw th;
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۹۳۱۲e() {
        this.f۱۶۲۳۵d.m۱۸۸۰۶a(Cf.m۱۹۰۸۶d().m۱۹۰۸۹a("response.body().close()"));
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۹۳۱۴b() {
        return this.f۱۶۲۳۵d.m۱۸۸۰۷a();
    }

    @Override // java.lang.Object
    public Cx clone() {
        return m۱۹۳۱۱a(this.f۱۶۲۳۴c, this.f۱۶۲۳۷f, this.f۱۶۲۳۸g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.x$a  reason: invalid class name */
    public final class Ca extends AbstractRunnableCb {

        /* renamed from: d  reason: contains not printable characters */
        private final AbstractCf f۱۶۲۴۰d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ Cx f۱۶۲۴۱e;

        /* access modifiers changed from: package-private */
        /* renamed from: d  reason: contains not printable characters */
        public String m۱۹۳۲۰d() {
            return this.f۱۶۲۴۱e.f۱۶۲۳۷f.m۱۹۳۲۹g().m۱۹۲۳۴g();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public Cx m۱۹۳۱۹c() {
            return this.f۱۶۲۴۱e;
        }

        /* access modifiers changed from: protected */
        @Override // p۱۳۹e.p۱۴۰f0.AbstractRunnableCb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۹۳۱۸b() {
            try {
                Ca0 response = this.f۱۶۲۴۱e.m۱۹۳۱۳a();
                if (this.f۱۶۲۴۱e.f۱۶۲۳۵d.m۱۸۸۰۷a()) {
                    this.f۱۶۲۴۰d.m۱۸۵۹۵a(this.f۱۶۲۴۱e, new IOException("Canceled"));
                } else {
                    this.f۱۶۲۴۰d.m۱۸۵۹۴a(this.f۱۶۲۴۱e, response);
                }
            } catch (IOException e) {
                if (0 != 0) {
                    Cf d = Cf.m۱۹۰۸۶d();
                    d.m۱۹۰۹۱a(4, "Callback failure for " + this.f۱۶۲۴۱e.m۱۹۳۱۶d(), e);
                } else {
                    this.f۱۶۲۴۱e.f۱۶۲۳۶e.m۱۹۱۷۶a(this.f۱۶۲۴۱e, e);
                    this.f۱۶۲۴۰d.m۱۸۵۹۵a(this.f۱۶۲۴۱e, e);
                }
            } catch (Throwable th) {
                this.f۱۶۲۴۱e.f۱۶۲۳۴c.m۱۹۲۷۹h().m۱۹۱۶۳a(this);
                throw th;
            }
            this.f۱۶۲۴۱e.f۱۶۲۳۴c.m۱۹۲۷۹h().m۱۹۱۶۳a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public String m۱۹۳۱۶d() {
        StringBuilder sb = new StringBuilder();
        sb.append(m۱۹۳۱۴b() ? "canceled " : "");
        sb.append(this.f۱۶۲۳۸g ? "web socket" : "call");
        sb.append(" to ");
        sb.append(m۱۹۳۱۵c());
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public String m۱۹۳۱۵c() {
        return this.f۱۶۲۳۷f.m۱۹۳۲۹g().m۱۹۲۳۹l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Ca0 m۱۹۳۱۳a() {
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.addAll(this.f۱۶۲۳۴c.m۱۹۲۸۵o());
        interceptors.add(this.f۱۶۲۳۵d);
        interceptors.add(new p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ca(this.f۱۶۲۳۴c.m۱۹۲۷۸g()));
        interceptors.add(new p۱۳۹e.p۱۴۰f0.p۱۴۱e.Ca(this.f۱۶۲۳۴c.m۱۹۲۸۶p()));
        interceptors.add(new p۱۳۹e.p۱۴۰f0.p۱۴۲f.Ca(this.f۱۶۲۳۴c));
        if (!this.f۱۶۲۳۸g) {
            interceptors.addAll(this.f۱۶۲۳۴c.m۱۹۲۸۷q());
        }
        interceptors.add(new Cb(this.f۱۶۲۳۸g));
        return new Cg(interceptors, null, null, null, 0, this.f۱۶۲۳۷f, this, this.f۱۶۲۳۶e, this.f۱۶۲۳۴c.m۱۹۲۷۵d(), this.f۱۶۲۳۴c.m۱۹۲۹۳w(), this.f۱۶۲۳۴c.m۱۹۲۷۰A()).m۱۹۲۶۴a(this.f۱۶۲۳۷f);
    }
}
