package android.support.constraint.p۰۴۱i.p۰۴۲j;

import android.support.constraint.p۰۴۱i.p۰۴۲j.Ce;
import java.util.ArrayList;

/* renamed from: android.support.constraint.i.j.c  reason: invalid class name */
public class Cc {

    /* renamed from: a  reason: contains not printable characters */
    protected Ce f۹۲۸۷a;

    /* renamed from: b  reason: contains not printable characters */
    protected Ce f۹۲۸۸b;

    /* renamed from: c  reason: contains not printable characters */
    protected Ce f۹۲۸۹c;

    /* renamed from: d  reason: contains not printable characters */
    protected Ce f۹۲۹۰d;

    /* renamed from: e  reason: contains not printable characters */
    protected Ce f۹۲۹۱e;

    /* renamed from: f  reason: contains not printable characters */
    protected Ce f۹۲۹۲f;

    /* renamed from: g  reason: contains not printable characters */
    protected Ce f۹۲۹۳g;

    /* renamed from: h  reason: contains not printable characters */
    protected ArrayList<Ce> f۹۲۹۴h;

    /* renamed from: i  reason: contains not printable characters */
    protected int f۹۲۹۵i;

    /* renamed from: j  reason: contains not printable characters */
    protected int f۹۲۹۶j;

    /* renamed from: k  reason: contains not printable characters */
    protected float f۹۲۹۷k = 0.0f;

    /* renamed from: l  reason: contains not printable characters */
    private int f۹۲۹۸l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۹۲۹۹m = false;

    /* renamed from: n  reason: contains not printable characters */
    protected boolean f۹۳۰۰n;

    /* renamed from: o  reason: contains not printable characters */
    protected boolean f۹۳۰۱o;

    /* renamed from: p  reason: contains not printable characters */
    protected boolean f۹۳۰۲p;

    /* renamed from: q  reason: contains not printable characters */
    private boolean f۹۳۰۳q;

    public Cc(Ce first, int orientation, boolean isRtl) {
        this.f۹۲۸۷a = first;
        this.f۹۲۹۸l = orientation;
        this.f۹۲۹۹m = isRtl;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۱۰۷۶a(Ce widget, int orientation) {
        if (widget.m۱۱۱۶۲s() != 8 && widget.f۹۳۳۳B[orientation] == Ce.EnumCb.MATCH_CONSTRAINT) {
            int[] iArr = widget.f۹۳۶۷g;
            if (iArr[orientation] == 0 || iArr[orientation] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۱۰۷۷b() {
        boolean z;
        Ce next;
        int offset = this.f۹۲۹۸l * 2;
        Ce widget = this.f۹۲۸۷a;
        Ce eVar = this.f۹۲۸۷a;
        boolean done = false;
        while (true) {
            z = true;
            if (done) {
                break;
            }
            this.f۹۲۹۵i++;
            Ce[] eVarArr = widget.f۹۳۶۳c0;
            int i = this.f۹۲۹۸l;
            eVarArr[i] = null;
            widget.f۹۳۶۱b0[i] = null;
            if (widget.m۱۱۱۶۲s() != 8) {
                if (this.f۹۲۸۸b == null) {
                    this.f۹۲۸۸b = widget;
                }
                Ce eVar2 = this.f۹۲۹۰d;
                if (eVar2 != null) {
                    eVar2.f۹۳۶۳c0[this.f۹۲۹۸l] = widget;
                }
                this.f۹۲۹۰d = widget;
                Ce.EnumCb[] bVarArr = widget.f۹۳۳۳B;
                int i2 = this.f۹۲۹۸l;
                if (bVarArr[i2] == Ce.EnumCb.MATCH_CONSTRAINT) {
                    int[] iArr = widget.f۹۳۶۷g;
                    if (iArr[i2] == 0 || iArr[i2] == 3 || iArr[i2] == 2) {
                        this.f۹۲۹۶j++;
                        float[] fArr = widget.f۹۳۵۹a0;
                        int i3 = this.f۹۲۹۸l;
                        float weight = fArr[i3];
                        if (weight > 0.0f) {
                            this.f۹۲۹۷k += fArr[i3];
                        }
                        if (m۱۱۰۷۶a(widget, this.f۹۲۹۸l)) {
                            if (weight < 0.0f) {
                                this.f۹۳۰۰n = true;
                            } else {
                                this.f۹۳۰۱o = true;
                            }
                            if (this.f۹۲۹۴h == null) {
                                this.f۹۲۹۴h = new ArrayList<>();
                            }
                            this.f۹۲۹۴h.add(widget);
                        }
                        if (this.f۹۲۹۲f == null) {
                            this.f۹۲۹۲f = widget;
                        }
                        Ce eVar3 = this.f۹۲۹۳g;
                        if (eVar3 != null) {
                            eVar3.f۹۳۶۱b0[this.f۹۲۹۸l] = widget;
                        }
                        this.f۹۲۹۳g = widget;
                    }
                }
            }
            Cd nextAnchor = widget.f۹۳۸۶z[offset + 1].f۹۳۰۷d;
            if (nextAnchor != null) {
                next = nextAnchor.f۹۳۰۵b;
                Cd[] dVarArr = next.f۹۳۸۶z;
                if (dVarArr[offset].f۹۳۰۷d == null || dVarArr[offset].f۹۳۰۷d.f۹۳۰۵b != widget) {
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
        this.f۹۲۸۹c = widget;
        if (this.f۹۲۹۸l != 0 || !this.f۹۲۹۹m) {
            this.f۹۲۹۱e = this.f۹۲۸۷a;
        } else {
            this.f۹۲۹۱e = this.f۹۲۸۹c;
        }
        if (!this.f۹۳۰۱o || !this.f۹۳۰۰n) {
            z = false;
        }
        this.f۹۳۰۲p = z;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۷۸a() {
        if (!this.f۹۳۰۳q) {
            m۱۱۰۷۷b();
        }
        this.f۹۳۰۳q = true;
    }
}
