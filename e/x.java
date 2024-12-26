package e;

import e.f0.b;
import e.f0.g.g;
import e.f0.g.j;
import e.f0.k.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Interceptor;

/* access modifiers changed from: package-private */
public final class x implements e {

    /* renamed from: c  reason: collision with root package name */
    final v f۴۱۴۳c;

    /* renamed from: d  reason: collision with root package name */
    final j f۴۱۴۴d;

    /* renamed from: e  reason: collision with root package name */
    private p f۴۱۴۵e;

    /* renamed from: f  reason: collision with root package name */
    final y f۴۱۴۶f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f۴۱۴۷g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۴۱۴۸h;

    private x(v client, y originalRequest, boolean forWebSocket) {
        this.f۴۱۴۳c = client;
        this.f۴۱۴۶f = originalRequest;
        this.f۴۱۴۷g = forWebSocket;
        this.f۴۱۴۴d = new j(client, forWebSocket);
    }

    static x a(v client, y originalRequest, boolean forWebSocket) {
        x call = new x(client, originalRequest, forWebSocket);
        call.f۴۱۴۵e = client.j().a(call);
        return call;
    }

    @Override // e.e
    public a0 l() {
        synchronized (this) {
            if (!this.f۴۱۴۸h) {
                this.f۴۱۴۸h = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        e();
        this.f۴۱۴۵e.b(this);
        try {
            this.f۴۱۴۳c.h().a(this);
            a0 result = a();
            if (result != null) {
                this.f۴۱۴۳c.h().b(this);
                return result;
            }
            throw new IOException("Canceled");
        } catch (IOException e2) {
            this.f۴۱۴۵e.a(this, e2);
            throw e2;
        } catch (Throwable th) {
            this.f۴۱۴۳c.h().b(this);
            throw th;
        }
    }

    private void e() {
        this.f۴۱۴۴d.a(f.d().a("response.body().close()"));
    }

    public boolean b() {
        return this.f۴۱۴۴d.a();
    }

    @Override // java.lang.Object
    public x clone() {
        return a(this.f۴۱۴۳c, this.f۴۱۴۶f, this.f۴۱۴۷g);
    }

    /* access modifiers changed from: package-private */
    public final class a extends b {

        /* renamed from: d  reason: collision with root package name */
        private final f f۴۱۴۹d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ x f۴۱۵۰e;

        /* access modifiers changed from: package-private */
        public String d() {
            return this.f۴۱۵۰e.f۴۱۴۶f.g().g();
        }

        /* access modifiers changed from: package-private */
        public x c() {
            return this.f۴۱۵۰e;
        }

        /* access modifiers changed from: protected */
        @Override // e.f0.b
        public void b() {
            try {
                a0 response = this.f۴۱۵۰e.a();
                if (this.f۴۱۵۰e.f۴۱۴۴d.a()) {
                    this.f۴۱۴۹d.a(this.f۴۱۵۰e, new IOException("Canceled"));
                } else {
                    this.f۴۱۴۹d.a(this.f۴۱۵۰e, response);
                }
            } catch (IOException e2) {
                if (0 != 0) {
                    f d2 = f.d();
                    d2.a(4, "Callback failure for " + this.f۴۱۵۰e.d(), e2);
                } else {
                    this.f۴۱۵۰e.f۴۱۴۵e.a(this.f۴۱۵۰e, e2);
                    this.f۴۱۴۹d.a(this.f۴۱۵۰e, e2);
                }
            } catch (Throwable th) {
                this.f۴۱۵۰e.f۴۱۴۳c.h().a(this);
                throw th;
            }
            this.f۴۱۵۰e.f۴۱۴۳c.h().a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(b() ? "canceled " : "");
        sb.append(this.f۴۱۴۷g ? "web socket" : "call");
        sb.append(" to ");
        sb.append(c());
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f۴۱۴۶f.g().l();
    }

    /* access modifiers changed from: package-private */
    public a0 a() {
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.addAll(this.f۴۱۴۳c.o());
        interceptors.add(this.f۴۱۴۴d);
        interceptors.add(new e.f0.g.a(this.f۴۱۴۳c.g()));
        interceptors.add(new e.f0.e.a(this.f۴۱۴۳c.p()));
        interceptors.add(new e.f0.f.a(this.f۴۱۴۳c));
        if (!this.f۴۱۴۷g) {
            interceptors.addAll(this.f۴۱۴۳c.q());
        }
        interceptors.add(new e.f0.g.b(this.f۴۱۴۷g));
        return new g(interceptors, null, null, null, 0, this.f۴۱۴۶f, this, this.f۴۱۴۵e, this.f۴۱۴۳c.d(), this.f۴۱۴۳c.w(), this.f۴۱۴۳c.A()).a(this.f۴۱۴۶f);
    }
}
