package p۲۹۵e.p۲۹۶f0.p۲۹۹g;

import java.util.List;
import p۲۹۵e.AbstractCp;
import p۲۹۵e.Ca0;
import p۲۹۵e.Cy;
import p۲۹۵e.InterfaceCe;
import p۲۹۵e.InterfaceCi;
import p۲۹۵e.InterfaceCt;
import p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc;

/* renamed from: e.f0.g.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cg implements InterfaceCt.a {

    /* renamed from: a, reason: contains not printable characters */
    private final List<InterfaceCt> f۱۵۸۲۵a;

    /* renamed from: b, reason: contains not printable characters */
    private final p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cg f۱۵۸۲۶b;

    /* renamed from: c, reason: contains not printable characters */
    private final InterfaceCc f۱۵۸۲۷c;

    /* renamed from: d, reason: contains not printable characters */
    private final Cc f۱۵۸۲۸d;

    /* renamed from: e, reason: contains not printable characters */
    private final int f۱۵۸۲۹e;

    /* renamed from: f, reason: contains not printable characters */
    private final Cy f۱۵۸۳۰f;

    /* renamed from: g, reason: contains not printable characters */
    private final InterfaceCe f۱۵۸۳۱g;

    /* renamed from: h, reason: contains not printable characters */
    private final AbstractCp f۱۵۸۳۲h;

    /* renamed from: i, reason: contains not printable characters */
    private final int f۱۵۸۳۳i;

    /* renamed from: j, reason: contains not printable characters */
    private final int f۱۵۸۳۴j;

    /* renamed from: k, reason: contains not printable characters */
    private final int f۱۵۸۳۵k;

    /* renamed from: l, reason: contains not printable characters */
    private int f۱۵۸۳۶l;

    public Cg(List<InterfaceCt> list, p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cg streamAllocation, InterfaceCc httpCodec, Cc connection, int index, Cy request, InterfaceCe call, AbstractCp eventListener, int connectTimeout, int readTimeout, int writeTimeout) {
        this.f۱۵۸۲۵a = list;
        this.f۱۵۸۲۸d = connection;
        this.f۱۵۸۲۶b = streamAllocation;
        this.f۱۵۸۲۷c = httpCodec;
        this.f۱۵۸۲۹e = index;
        this.f۱۵۸۳۰f = request;
        this.f۱۵۸۳۱g = call;
        this.f۱۵۸۳۲h = eventListener;
        this.f۱۵۸۳۳i = connectTimeout;
        this.f۱۵۸۳۴j = readTimeout;
        this.f۱۵۸۳۵k = writeTimeout;
    }

    /* renamed from: f, reason: contains not printable characters */
    public InterfaceCi m۱۶۷۱۱f() {
        return this.f۱۵۸۲۸d;
    }

    @Override // p۲۹۵e.InterfaceCt.a
    /* renamed from: c, reason: contains not printable characters */
    public int mo۱۷۱۸۷c() {
        return this.f۱۵۸۳۳i;
    }

    @Override // p۲۹۵e.InterfaceCt.a
    /* renamed from: d, reason: contains not printable characters */
    public int mo۱۷۱۸۸d() {
        return this.f۱۵۸۳۴j;
    }

    @Override // p۲۹۵e.InterfaceCt.a
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۱۸۴a() {
        return this.f۱۵۸۳۵k;
    }

    /* renamed from: i, reason: contains not printable characters */
    public p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cg m۱۶۷۱۴i() {
        return this.f۱۵۸۲۶b;
    }

    /* renamed from: h, reason: contains not printable characters */
    public InterfaceCc m۱۶۷۱۳h() {
        return this.f۱۵۸۲۷c;
    }

    /* renamed from: e, reason: contains not printable characters */
    public InterfaceCe m۱۶۷۱۰e() {
        return this.f۱۵۸۳۱g;
    }

    /* renamed from: g, reason: contains not printable characters */
    public AbstractCp m۱۶۷۱۲g() {
        return this.f۱۵۸۳۲h;
    }

    @Override // p۲۹۵e.InterfaceCt.a
    /* renamed from: b, reason: contains not printable characters */
    public Cy mo۱۷۱۸۶b() {
        return this.f۱۵۸۳۰f;
    }

    @Override // p۲۹۵e.InterfaceCt.a
    /* renamed from: a, reason: contains not printable characters */
    public Ca0 mo۱۷۱۸۵a(Cy request) {
        return m۱۶۷۰۶a(request, this.f۱۵۸۲۶b, this.f۱۵۸۲۷c, this.f۱۵۸۲۸d);
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ca0 m۱۶۷۰۶a(Cy request, p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cg streamAllocation, InterfaceCc httpCodec, Cc connection) {
        if (this.f۱۵۸۲۹e < this.f۱۵۸۲۵a.size()) {
            this.f۱۵۸۳۶l++;
            if (this.f۱۵۸۲۷c != null && !this.f۱۵۸۲۸d.m۱۶۶۳۳a(request.m۱۷۲۵۱g())) {
                throw new IllegalStateException("network interceptor " + this.f۱۵۸۲۵a.get(this.f۱۵۸۲۹e - 1) + " must retain the same host and port");
            }
            if (this.f۱۵۸۲۷c != null && this.f۱۵۸۳۶l > 1) {
                throw new IllegalStateException("network interceptor " + this.f۱۵۸۲۵a.get(this.f۱۵۸۲۹e - 1) + " must call proceed() exactly once");
            }
            Cg next = new Cg(this.f۱۵۸۲۵a, streamAllocation, httpCodec, connection, this.f۱۵۸۲۹e + 1, request, this.f۱۵۸۳۱g, this.f۱۵۸۳۲h, this.f۱۵۸۳۳i, this.f۱۵۸۳۴j, this.f۱۵۸۳۵k);
            InterfaceCt interceptor = this.f۱۵۸۲۵a.get(this.f۱۵۸۲۹e);
            Ca0 response = interceptor.mo۱۷۱۸۳a(next);
            if (httpCodec != null && this.f۱۵۸۲۹e + 1 < this.f۱۵۸۲۵a.size() && next.f۱۵۸۳۶l != 1) {
                throw new IllegalStateException("network interceptor " + interceptor + " must call proceed() exactly once");
            }
            if (response == null) {
                throw new NullPointerException("interceptor " + interceptor + " returned null");
            }
            if (response.m۱۶۴۲۵l() == null) {
                throw new IllegalStateException("interceptor " + interceptor + " returned a response with no body");
            }
            return response;
        }
        throw new AssertionError();
    }
}
