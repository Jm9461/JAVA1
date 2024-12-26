package android.support.constraint.i.j;

import android.support.constraint.i.j.e;
import java.util.ArrayList;

public class c {

    /* renamed from: a  reason: collision with root package name */
    protected e f۶۵۲a;

    /* renamed from: b  reason: collision with root package name */
    protected e f۶۵۳b;

    /* renamed from: c  reason: collision with root package name */
    protected e f۶۵۴c;

    /* renamed from: d  reason: collision with root package name */
    protected e f۶۵۵d;

    /* renamed from: e  reason: collision with root package name */
    protected e f۶۵۶e;

    /* renamed from: f  reason: collision with root package name */
    protected e f۶۵۷f;

    /* renamed from: g  reason: collision with root package name */
    protected e f۶۵۸g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<e> f۶۵۹h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    private int l;
    private boolean m = false;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    private boolean q;

    public c(e first, int orientation, boolean isRtl) {
        this.f۶۵۲a = first;
        this.l = orientation;
        this.m = isRtl;
    }

    private static boolean a(e widget, int orientation) {
        if (widget.s() != 8 && widget.B[orientation] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = widget.f۶۸۸g;
            if (iArr[orientation] == 0 || iArr[orientation] == 3) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        boolean z;
        e next;
        int offset = this.l * 2;
        e widget = this.f۶۵۲a;
        e eVar = this.f۶۵۲a;
        boolean done = false;
        while (true) {
            z = true;
            if (done) {
                break;
            }
            this.i++;
            e[] eVarArr = widget.c0;
            int i2 = this.l;
            eVarArr[i2] = null;
            widget.b0[i2] = null;
            if (widget.s() != 8) {
                if (this.f۶۵۳b == null) {
                    this.f۶۵۳b = widget;
                }
                e eVar2 = this.f۶۵۵d;
                if (eVar2 != null) {
                    eVar2.c0[this.l] = widget;
                }
                this.f۶۵۵d = widget;
                e.b[] bVarArr = widget.B;
                int i3 = this.l;
                if (bVarArr[i3] == e.b.MATCH_CONSTRAINT) {
                    int[] iArr = widget.f۶۸۸g;
                    if (iArr[i3] == 0 || iArr[i3] == 3 || iArr[i3] == 2) {
                        this.j++;
                        float[] fArr = widget.a0;
                        int i4 = this.l;
                        float weight = fArr[i4];
                        if (weight > 0.0f) {
                            this.k += fArr[i4];
                        }
                        if (a(widget, this.l)) {
                            if (weight < 0.0f) {
                                this.n = true;
                            } else {
                                this.o = true;
                            }
                            if (this.f۶۵۹h == null) {
                                this.f۶۵۹h = new ArrayList<>();
                            }
                            this.f۶۵۹h.add(widget);
                        }
                        if (this.f۶۵۷f == null) {
                            this.f۶۵۷f = widget;
                        }
                        e eVar3 = this.f۶۵۸g;
                        if (eVar3 != null) {
                            eVar3.b0[this.l] = widget;
                        }
                        this.f۶۵۸g = widget;
                    }
                }
            }
            d nextAnchor = widget.z[offset + 1].f۶۶۳d;
            if (nextAnchor != null) {
                next = nextAnchor.f۶۶۱b;
                d[] dVarArr = next.z;
                if (dVarArr[offset].f۶۶۳d == null || dVarArr[offset].f۶۶۳d.f۶۶۱b != widget) {
                    next = null;
                }
            } else {
                next = null;
            }
            if (next != null) {
                widget = next;
            } else {
                done = true;
            }
        }
        this.f۶۵۴c = widget;
        if (this.l != 0 || !this.m) {
            this.f۶۵۶e = this.f۶۵۲a;
        } else {
            this.f۶۵۶e = this.f۶۵۴c;
        }
        if (!this.o || !this.n) {
            z = false;
        }
        this.p = z;
    }

    public void a() {
        if (!this.q) {
            b();
        }
        this.q = true;
    }
}
