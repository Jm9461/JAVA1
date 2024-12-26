package android.support.constraint.p۲۰۰i.p۲۰۱j;

import android.support.constraint.p۲۰۰i.p۲۰۱j.Ce;
import java.util.ArrayList;

/* renamed from: android.support.constraint.i.j.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc {

    /* renamed from: a, reason: contains not printable characters */
    protected Ce f۹۲۸۷a;

    /* renamed from: b, reason: contains not printable characters */
    protected Ce f۹۲۸۸b;

    /* renamed from: c, reason: contains not printable characters */
    protected Ce f۹۲۸۹c;

    /* renamed from: d, reason: contains not printable characters */
    protected Ce f۹۲۹۰d;

    /* renamed from: e, reason: contains not printable characters */
    protected Ce f۹۲۹۱e;

    /* renamed from: f, reason: contains not printable characters */
    protected Ce f۹۲۹۲f;

    /* renamed from: g, reason: contains not printable characters */
    protected Ce f۹۲۹۳g;

    /* renamed from: h, reason: contains not printable characters */
    protected ArrayList<Ce> f۹۲۹۴h;

    /* renamed from: i, reason: contains not printable characters */
    protected int f۹۲۹۵i;

    /* renamed from: j, reason: contains not printable characters */
    protected int f۹۲۹۶j;

    /* renamed from: k, reason: contains not printable characters */
    protected float f۹۲۹۷k = 0.0f;

    /* renamed from: l, reason: contains not printable characters */
    private int f۹۲۹۸l;

    /* renamed from: m, reason: contains not printable characters */
    private boolean f۹۲۹۹m;

    /* renamed from: n, reason: contains not printable characters */
    protected boolean f۹۳۰۰n;

    /* renamed from: o, reason: contains not printable characters */
    protected boolean f۹۳۰۱o;

    /* renamed from: p, reason: contains not printable characters */
    protected boolean f۹۳۰۲p;

    /* renamed from: q, reason: contains not printable characters */
    private boolean f۹۳۰۳q;

    public Cc(Ce first, int orientation, boolean isRtl) {
        this.f۹۲۹۹m = false;
        this.f۹۲۸۷a = first;
        this.f۹۲۹۸l = orientation;
        this.f۹۲۹۹m = isRtl;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۹۰۰۸a(Ce widget, int orientation) {
        if (widget.m۹۰۹۴s() != 8 && widget.f۹۳۳۳B[orientation] == Ce.b.MATCH_CONSTRAINT) {
            int[] iArr = widget.f۹۳۶۷g;
            if (iArr[orientation] == 0 || iArr[orientation] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۹۰۰۹b() {
        Ce next;
        int offset = this.f۹۲۹۸l * 2;
        Ce widget = this.f۹۲۸۷a;
        Ce ce = this.f۹۲۸۷a;
        boolean done = false;
        while (true) {
            if (done) {
                break;
            }
            this.f۹۲۹۵i++;
            Ce[] ceArr = widget.f۹۳۶۳c0;
            int i = this.f۹۲۹۸l;
            ceArr[i] = null;
            widget.f۹۳۶۱b0[i] = null;
            if (widget.m۹۰۹۴s() != 8) {
                if (this.f۹۲۸۸b == null) {
                    this.f۹۲۸۸b = widget;
                }
                Ce ce2 = this.f۹۲۹۰d;
                if (ce2 != null) {
                    ce2.f۹۳۶۳c0[this.f۹۲۹۸l] = widget;
                }
                this.f۹۲۹۰d = widget;
                Ce.b[] bVarArr = widget.f۹۳۳۳B;
                int i2 = this.f۹۲۹۸l;
                if (bVarArr[i2] == Ce.b.MATCH_CONSTRAINT) {
                    int[] iArr = widget.f۹۳۶۷g;
                    if (iArr[i2] == 0 || iArr[i2] == 3 || iArr[i2] == 2) {
                        this.f۹۲۹۶j++;
                        float[] fArr = widget.f۹۳۵۹a0;
                        int i3 = this.f۹۲۹۸l;
                        float weight = fArr[i3];
                        if (weight > 0.0f) {
                            this.f۹۲۹۷k += fArr[i3];
                        }
                        if (m۹۰۰۸a(widget, this.f۹۲۹۸l)) {
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
                        Ce ce3 = this.f۹۲۹۳g;
                        if (ce3 != null) {
                            ce3.f۹۳۶۱b0[this.f۹۲۹۸l] = widget;
                        }
                        this.f۹۲۹۳g = widget;
                    }
                }
            }
            Cd nextAnchor = widget.f۹۳۸۶z[offset + 1].f۹۳۰۷d;
            if (nextAnchor != null) {
                next = nextAnchor.f۹۳۰۵b;
                Cd[] cdArr = next.f۹۳۸۶z;
                if (cdArr[offset].f۹۳۰۷d == null || cdArr[offset].f۹۳۰۷d.f۹۳۰۵b != widget) {
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
        if (this.f۹۲۹۸l == 0 && this.f۹۲۹۹m) {
            this.f۹۲۹۱e = this.f۹۲۸۹c;
        } else {
            this.f۹۲۹۱e = this.f۹۲۸۷a;
        }
        this.f۹۳۰۲p = this.f۹۳۰۱o && this.f۹۳۰۰n;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۹۰۱۰a() {
        if (!this.f۹۳۰۳q) {
            m۹۰۰۹b();
        }
        this.f۹۳۰۳q = true;
    }
}
