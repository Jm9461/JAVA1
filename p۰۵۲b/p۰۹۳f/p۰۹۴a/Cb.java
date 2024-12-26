package p۰۵۲b.p۰۹۳f.p۰۹۴a;

import android.content.res.Resources;
import android.view.ViewGroup;
import p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۵d.AbstractCa;
import p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۶e.Ca;
import p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۶e.Cc;

/* renamed from: b.f.a.b  reason: invalid class name */
public class Cb {

    /* renamed from: a  reason: contains not printable characters */
    private ViewGroup f۱۲۸۳۳a;

    /* renamed from: b  reason: contains not printable characters */
    private ViewGroup.LayoutParams f۱۲۸۳۴b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۲۸۳۵c = -1;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۲۸۳۶d = -1;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۲۸۳۷e = -1;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۲۸۳۸f = -1;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۲۸۳۹g = -1;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۲۸۴۰h = -1;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۲۸۴۱i = -1;

    /* renamed from: j  reason: contains not printable characters */
    private AbstractCa f۱۲۸۴۲j;

    /* renamed from: k  reason: contains not printable characters */
    private String f۱۲۸۴۳k;

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۶۱۶۰a(ViewGroup parent) {
        this.f۱۲۸۳۳a = parent;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۶۱۵۹a(ViewGroup.LayoutParams params) {
        this.f۱۲۸۳۴b = params;
        return this;
    }

    /* renamed from: c  reason: contains not printable characters */
    public Cb m۱۶۱۶۴c(int strokeColor) {
        this.f۱۲۸۳۵c = strokeColor;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۶۱۵۷a(int fillColor) {
        this.f۱۲۸۳۶d = fillColor;
        return this;
    }

    /* renamed from: e  reason: contains not printable characters */
    public Cb m۱۶۱۶۶e(int strokeWidth) {
        this.f۱۲۸۳۷e = strokeWidth;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۶۱۵۸a(int originalWidth, int originalHeight) {
        this.f۱۲۸۳۸f = originalWidth;
        this.f۱۲۸۳۹g = originalHeight;
        return this;
    }

    /* renamed from: d  reason: contains not printable characters */
    public Cb m۱۶۱۶۵d(int strokeDrawingDuration) {
        this.f۱۲۸۴۰h = strokeDrawingDuration;
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cb m۱۶۱۶۳b(int fillDuration) {
        this.f۱۲۸۴۱i = fillDuration;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۶۱۶۱a(AbstractCa transform) {
        this.f۱۲۸۴۲j = transform;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۶۱۶۲a(String svgPath) {
        this.f۱۲۸۴۳k = svgPath;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۶۱۵۶a() {
        Resources res = this.f۱۲۸۳۳a.getContext().getResources();
        int i = this.f۱۲۸۳۵c;
        if (i == -1) {
            i = res.getColor(Ca.strokeColor);
        }
        this.f۱۲۸۳۵c = i;
        int i2 = this.f۱۲۸۳۶d;
        if (i2 == -1) {
            i2 = res.getColor(Ca.fillColor);
        }
        this.f۱۲۸۳۶d = i2;
        int i3 = this.f۱۲۸۳۷e;
        if (i3 < 0) {
            i3 = res.getDimensionPixelSize(p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۶e.Cb.strokeWidth);
        }
        this.f۱۲۸۳۷e = i3;
        int i4 = this.f۱۲۸۴۰h;
        if (i4 < 0) {
            i4 = res.getInteger(Cc.strokeDrawingDuration);
        }
        this.f۱۲۸۴۰h = i4;
        int i5 = this.f۱۲۸۴۱i;
        if (i5 < 0) {
            i5 = res.getInteger(Cc.fillDuration);
        }
        this.f۱۲۸۴۱i = i5;
        AbstractCa aVar = this.f۱۲۸۴۲j;
        if (aVar == null) {
            aVar = new p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۵d.Cb();
        }
        this.f۱۲۸۴۲j = aVar;
        ViewGroup.LayoutParams layoutParams = this.f۱۲۸۳۴b;
        if (layoutParams != null) {
            String str = this.f۱۲۸۴۳k;
            if (str != null) {
                return new Ca(this.f۱۲۸۳۳a, layoutParams, this.f۱۲۸۳۵c, this.f۱۲۸۳۶d, this.f۱۲۸۳۷e, this.f۱۲۸۳۸f, this.f۱۲۸۳۹g, this.f۱۲۸۴۰h, this.f۱۲۸۴۱i, this.f۱۲۸۴۲j, str);
            }
            m۱۶۱۵۵b("an svg path");
            throw null;
        }
        m۱۶۱۵۵b("layout params");
        throw null;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۱۵۵b(String neededStuff) {
        throw new IllegalArgumentException("You must provide " + neededStuff + " in order to draw the view properly.");
    }
}
