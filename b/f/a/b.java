package b.f.a;

import android.content.res.Resources;
import android.view.ViewGroup;
import b.f.a.d.a;
import b.f.a.e.c;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f۲۴۹۶a;

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup.LayoutParams f۲۴۹۷b;

    /* renamed from: c  reason: collision with root package name */
    private int f۲۴۹۸c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f۲۴۹۹d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f۲۵۰۰e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f۲۵۰۱f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f۲۵۰۲g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f۲۵۰۳h = -1;
    private int i = -1;
    private a j;
    private String k;

    public b a(ViewGroup parent) {
        this.f۲۴۹۶a = parent;
        return this;
    }

    public b a(ViewGroup.LayoutParams params) {
        this.f۲۴۹۷b = params;
        return this;
    }

    public b c(int strokeColor) {
        this.f۲۴۹۸c = strokeColor;
        return this;
    }

    public b a(int fillColor) {
        this.f۲۴۹۹d = fillColor;
        return this;
    }

    public b e(int strokeWidth) {
        this.f۲۵۰۰e = strokeWidth;
        return this;
    }

    public b a(int originalWidth, int originalHeight) {
        this.f۲۵۰۱f = originalWidth;
        this.f۲۵۰۲g = originalHeight;
        return this;
    }

    public b d(int strokeDrawingDuration) {
        this.f۲۵۰۳h = strokeDrawingDuration;
        return this;
    }

    public b b(int fillDuration) {
        this.i = fillDuration;
        return this;
    }

    public b a(a transform) {
        this.j = transform;
        return this;
    }

    public b a(String svgPath) {
        this.k = svgPath;
        return this;
    }

    public a a() {
        Resources res = this.f۲۴۹۶a.getContext().getResources();
        int i2 = this.f۲۴۹۸c;
        if (i2 == -1) {
            i2 = res.getColor(b.f.a.e.a.strokeColor);
        }
        this.f۲۴۹۸c = i2;
        int i3 = this.f۲۴۹۹d;
        if (i3 == -1) {
            i3 = res.getColor(b.f.a.e.a.fillColor);
        }
        this.f۲۴۹۹d = i3;
        int i4 = this.f۲۵۰۰e;
        if (i4 < 0) {
            i4 = res.getDimensionPixelSize(b.f.a.e.b.strokeWidth);
        }
        this.f۲۵۰۰e = i4;
        int i5 = this.f۲۵۰۳h;
        if (i5 < 0) {
            i5 = res.getInteger(c.strokeDrawingDuration);
        }
        this.f۲۵۰۳h = i5;
        int i6 = this.i;
        if (i6 < 0) {
            i6 = res.getInteger(c.fillDuration);
        }
        this.i = i6;
        a aVar = this.j;
        if (aVar == null) {
            aVar = new b.f.a.d.b();
        }
        this.j = aVar;
        ViewGroup.LayoutParams layoutParams = this.f۲۴۹۷b;
        if (layoutParams != null) {
            String str = this.k;
            if (str != null) {
                return new a(this.f۲۴۹۶a, layoutParams, this.f۲۴۹۸c, this.f۲۴۹۹d, this.f۲۵۰۰e, this.f۲۵۰۱f, this.f۲۵۰۲g, this.f۲۵۰۳h, this.i, this.j, str);
            }
            b("an svg path");
            throw null;
        }
        b("layout params");
        throw null;
    }

    private void b(String neededStuff) {
        throw new IllegalArgumentException("You must provide " + neededStuff + " in order to draw the view properly.");
    }
}
