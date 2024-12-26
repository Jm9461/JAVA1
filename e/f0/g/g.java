package e.f0.g;

import e.a0;
import e.e;
import e.f0.f.c;
import e.i;
import e.p;
import e.t;
import e.y;
import java.util.List;

public final class g implements t.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<t> f۳۸۳۲a;

    /* renamed from: b  reason: collision with root package name */
    private final e.f0.f.g f۳۸۳۳b;

    /* renamed from: c  reason: collision with root package name */
    private final c f۳۸۳۴c;

    /* renamed from: d  reason: collision with root package name */
    private final c f۳۸۳۵d;

    /* renamed from: e  reason: collision with root package name */
    private final int f۳۸۳۶e;

    /* renamed from: f  reason: collision with root package name */
    private final y f۳۸۳۷f;

    /* renamed from: g  reason: collision with root package name */
    private final e f۳۸۳۸g;

    /* renamed from: h  reason: collision with root package name */
    private final p f۳۸۳۹h;
    private final int i;
    private final int j;
    private final int k;
    private int l;

    public g(List<t> list, e.f0.f.g streamAllocation, c httpCodec, c connection, int index, y request, e call, p eventListener, int connectTimeout, int readTimeout, int writeTimeout) {
        this.f۳۸۳۲a = list;
        this.f۳۸۳۵d = connection;
        this.f۳۸۳۳b = streamAllocation;
        this.f۳۸۳۴c = httpCodec;
        this.f۳۸۳۶e = index;
        this.f۳۸۳۷f = request;
        this.f۳۸۳۸g = call;
        this.f۳۸۳۹h = eventListener;
        this.i = connectTimeout;
        this.j = readTimeout;
        this.k = writeTimeout;
    }

    public i f() {
        return this.f۳۸۳۵d;
    }

    @Override // e.t.a
    public int c() {
        return this.i;
    }

    @Override // e.t.a
    public int d() {
        return this.j;
    }

    @Override // e.t.a
    public int a() {
        return this.k;
    }

    public e.f0.f.g i() {
        return this.f۳۸۳۳b;
    }

    public c h() {
        return this.f۳۸۳۴c;
    }

    public e e() {
        return this.f۳۸۳۸g;
    }

    public p g() {
        return this.f۳۸۳۹h;
    }

    @Override // e.t.a
    public y b() {
        return this.f۳۸۳۷f;
    }

    @Override // e.t.a
    public a0 a(y request) {
        return a(request, this.f۳۸۳۳b, this.f۳۸۳۴c, this.f۳۸۳۵d);
    }

    public a0 a(y request, e.f0.f.g streamAllocation, c httpCodec, c connection) {
        if (this.f۳۸۳۶e < this.f۳۸۳۲a.size()) {
            this.l++;
            if (this.f۳۸۳۴c != null && !this.f۳۸۳۵d.a(request.g())) {
                throw new IllegalStateException("network interceptor " + this.f۳۸۳۲a.get(this.f۳۸۳۶e - 1) + " must retain the same host and port");
            } else if (this.f۳۸۳۴c == null || this.l <= 1) {
                g next = new g(this.f۳۸۳۲a, streamAllocation, httpCodec, connection, this.f۳۸۳۶e + 1, request, this.f۳۸۳۸g, this.f۳۸۳۹h, this.i, this.j, this.k);
                t interceptor = this.f۳۸۳۲a.get(this.f۳۸۳۶e);
                a0 response = interceptor.a(next);
                if (httpCodec != null && this.f۳۸۳۶e + 1 < this.f۳۸۳۲a.size() && next.l != 1) {
                    throw new IllegalStateException("network interceptor " + interceptor + " must call proceed() exactly once");
                } else if (response == null) {
                    throw new NullPointerException("interceptor " + interceptor + " returned null");
                } else if (response.l() != null) {
                    return response;
                } else {
                    throw new IllegalStateException("interceptor " + interceptor + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.f۳۸۳۲a.get(this.f۳۸۳۶e - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }
}
