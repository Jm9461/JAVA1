package p۱۳۹e.p۱۴۰f0.p۱۴۳g;

import java.util.List;
import p۱۳۹e.AbstractCe;
import p۱۳۹e.AbstractCi;
import p۱۳۹e.AbstractCp;
import p۱۳۹e.AbstractCt;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cy;
import p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc;

/* renamed from: e.f0.g.g  reason: invalid class name */
public final class Cg implements AbstractCt.AbstractCa {

    /* renamed from: a  reason: contains not printable characters */
    private final List<AbstractCt> f۱۵۸۲۵a;

    /* renamed from: b  reason: contains not printable characters */
    private final p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg f۱۵۸۲۶b;

    /* renamed from: c  reason: contains not printable characters */
    private final AbstractCc f۱۵۸۲۷c;

    /* renamed from: d  reason: contains not printable characters */
    private final Cc f۱۵۸۲۸d;

    /* renamed from: e  reason: contains not printable characters */
    private final int f۱۵۸۲۹e;

    /* renamed from: f  reason: contains not printable characters */
    private final Cy f۱۵۸۳۰f;

    /* renamed from: g  reason: contains not printable characters */
    private final AbstractCe f۱۵۸۳۱g;

    /* renamed from: h  reason: contains not printable characters */
    private final AbstractCp f۱۵۸۳۲h;

    /* renamed from: i  reason: contains not printable characters */
    private final int f۱۵۸۳۳i;

    /* renamed from: j  reason: contains not printable characters */
    private final int f۱۵۸۳۴j;

    /* renamed from: k  reason: contains not printable characters */
    private final int f۱۵۸۳۵k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۵۸۳۶l;

    public Cg(List<AbstractCt> list, p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg streamAllocation, AbstractCc httpCodec, Cc connection, int index, Cy request, AbstractCe call, AbstractCp eventListener, int connectTimeout, int readTimeout, int writeTimeout) {
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

    /* renamed from: f  reason: contains not printable characters */
    public AbstractCi m۱۸۷۹۰f() {
        return this.f۱۵۸۲۸d;
    }

    @Override // p۱۳۹e.AbstractCt.AbstractCa
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۸۷۸۷c() {
        return this.f۱۵۸۳۳i;
    }

    @Override // p۱۳۹e.AbstractCt.AbstractCa
    /* renamed from: d  reason: contains not printable characters */
    public int m۱۸۷۸۸d() {
        return this.f۱۵۸۳۴j;
    }

    @Override // p۱۳۹e.AbstractCt.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۸۷۸۳a() {
        return this.f۱۵۸۳۵k;
    }

    /* renamed from: i  reason: contains not printable characters */
    public p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg m۱۸۷۹۳i() {
        return this.f۱۵۸۲۶b;
    }

    /* renamed from: h  reason: contains not printable characters */
    public AbstractCc m۱۸۷۹۲h() {
        return this.f۱۵۸۲۷c;
    }

    /* renamed from: e  reason: contains not printable characters */
    public AbstractCe m۱۸۷۸۹e() {
        return this.f۱۵۸۳۱g;
    }

    /* renamed from: g  reason: contains not printable characters */
    public AbstractCp m۱۸۷۹۱g() {
        return this.f۱۵۸۳۲h;
    }

    @Override // p۱۳۹e.AbstractCt.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public Cy m۱۸۷۸۶b() {
        return this.f۱۵۸۳۰f;
    }

    @Override // p۱۳۹e.AbstractCt.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Ca0 m۱۸۷۸۴a(Cy request) {
        return m۱۸۷۸۵a(request, this.f۱۵۸۲۶b, this.f۱۵۸۲۷c, this.f۱۵۸۲۸d);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ca0 m۱۸۷۸۵a(Cy request, p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg streamAllocation, AbstractCc httpCodec, Cc connection) {
        if (this.f۱۵۸۲۹e < this.f۱۵۸۲۵a.size()) {
            this.f۱۵۸۳۶l++;
            if (this.f۱۵۸۲۷c != null && !this.f۱۵۸۲۸d.m۱۸۷۱۲a(request.m۱۹۳۲۹g())) {
                throw new IllegalStateException("network interceptor " + this.f۱۵۸۲۵a.get(this.f۱۵۸۲۹e - 1) + " must retain the same host and port");
            } else if (this.f۱۵۸۲۷c == null || this.f۱۵۸۳۶l <= 1) {
                Cg next = new Cg(this.f۱۵۸۲۵a, streamAllocation, httpCodec, connection, this.f۱۵۸۲۹e + 1, request, this.f۱۵۸۳۱g, this.f۱۵۸۳۲h, this.f۱۵۸۳۳i, this.f۱۵۸۳۴j, this.f۱۵۸۳۵k);
                AbstractCt interceptor = this.f۱۵۸۲۵a.get(this.f۱۵۸۲۹e);
                Ca0 response = interceptor.m۱۹۲۶۲a(next);
                if (httpCodec != null && this.f۱۵۸۲۹e + 1 < this.f۱۵۸۲۵a.size() && next.f۱۵۸۳۶l != 1) {
                    throw new IllegalStateException("network interceptor " + interceptor + " must call proceed() exactly once");
                } else if (response == null) {
                    throw new NullPointerException("interceptor " + interceptor + " returned null");
                } else if (response.m۱۸۵۰۴l() != null) {
                    return response;
                } else {
                    throw new IllegalStateException("interceptor " + interceptor + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.f۱۵۸۲۵a.get(this.f۱۵۸۲۹e - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }
}
