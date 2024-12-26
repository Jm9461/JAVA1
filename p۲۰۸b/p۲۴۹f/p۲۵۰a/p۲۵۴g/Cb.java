package p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۴g;

import android.graphics.Path;
import android.graphics.PointF;
import java.text.ParseException;

/* renamed from: b.f.a.g.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb {

    /* renamed from: a, reason: contains not printable characters */
    private int f۱۲۸۵۴a;

    /* renamed from: b, reason: contains not printable characters */
    private PointF f۱۲۸۵۵b = new PointF();

    /* renamed from: c, reason: contains not printable characters */
    private int f۱۲۸۵۶c;

    /* renamed from: d, reason: contains not printable characters */
    private int f۱۲۸۵۷d;

    /* renamed from: e, reason: contains not printable characters */
    private String f۱۲۸۵۸e;

    /* renamed from: a, reason: contains not printable characters */
    protected float mo۱۴۱۱۰a(float f2) {
        throw null;
    }

    /* renamed from: b, reason: contains not printable characters */
    protected float mo۱۴۱۱۲b(float f2) {
        throw null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Path m۱۴۱۱۱a(String s) {
        char command;
        this.f۱۲۸۵۵b.set(Float.NaN, Float.NaN);
        this.f۱۲۸۵۸e = s;
        this.f۱۲۸۵۷d = 0;
        this.f۱۲۸۵۶c = this.f۱۲۸۵۸e.length();
        PointF tempPoint1 = new PointF();
        PointF tempPoint2 = new PointF();
        PointF tempPoint3 = new PointF();
        Path p = new Path();
        p.setFillType(Path.FillType.WINDING);
        boolean firstMove = true;
        while (this.f۱۲۸۵۷d < this.f۱۲۸۵۶c) {
            char command2 = m۱۴۱۰۸b();
            boolean relative = this.f۱۲۸۵۴a == 2;
            if (command2 != 'C') {
                if (command2 != 'H') {
                    if (command2 != 'V') {
                        if (command2 != 'Z') {
                            if (command2 != 'c') {
                                if (command2 != 'h') {
                                    if (command2 != 'v') {
                                        if (command2 != 'z') {
                                            if (command2 != 'L') {
                                                if (command2 != 'M') {
                                                    if (command2 != 'l') {
                                                        command = command2 != 'm' ? (char) 0 : (char) 0;
                                                    }
                                                }
                                                boolean firstPoint = true;
                                                while (m۱۴۱۰۶a() == 3) {
                                                    m۱۴۱۰۷a(tempPoint1, relative && this.f۱۲۸۵۵b.x != command);
                                                    if (firstPoint) {
                                                        p.moveTo(tempPoint1.x, tempPoint1.y);
                                                        firstPoint = false;
                                                        if (firstMove) {
                                                            this.f۱۲۸۵۵b.set(tempPoint1);
                                                            firstMove = false;
                                                        }
                                                    } else {
                                                        p.lineTo(tempPoint1.x, tempPoint1.y);
                                                    }
                                                }
                                                this.f۱۲۸۵۵b.set(tempPoint1);
                                            }
                                            if (this.f۱۲۸۵۵b.x == command) {
                                                throw new ParseException("Relative commands require current point", this.f۱۲۸۵۷d);
                                            }
                                            while (m۱۴۱۰۶a() == 3) {
                                                m۱۴۱۰۷a(tempPoint1, relative);
                                                p.lineTo(tempPoint1.x, tempPoint1.y);
                                            }
                                            this.f۱۲۸۵۵b.set(tempPoint1);
                                        }
                                    }
                                }
                            }
                        }
                        p.close();
                    }
                    if (this.f۱۲۸۵۵b.x == command) {
                        throw new ParseException("Relative commands require current point", this.f۱۲۸۵۷d);
                    }
                    while (m۱۴۱۰۶a() == 3) {
                        float y = mo۱۴۱۱۲b(m۱۴۱۰۹c());
                        if (relative) {
                            y += this.f۱۲۸۵۵b.y;
                        }
                        p.lineTo(this.f۱۲۸۵۵b.x, y);
                    }
                    this.f۱۲۸۵۵b.set(tempPoint1);
                }
                if (this.f۱۲۸۵۵b.x == command) {
                    throw new ParseException("Relative commands require current point", this.f۱۲۸۵۷d);
                }
                while (m۱۴۱۰۶a() == 3) {
                    float x = mo۱۴۱۱۰a(m۱۴۱۰۹c());
                    if (relative) {
                        x += this.f۱۲۸۵۵b.x;
                    }
                    p.lineTo(x, this.f۱۲۸۵۵b.y);
                }
                this.f۱۲۸۵۵b.set(tempPoint1);
            }
            if (this.f۱۲۸۵۵b.x == command) {
                throw new ParseException("Relative commands require current point", this.f۱۲۸۵۷d);
            }
            for (int i = 3; m۱۴۱۰۶a() == i; i = 3) {
                m۱۴۱۰۷a(tempPoint1, relative);
                m۱۴۱۰۷a(tempPoint2, relative);
                m۱۴۱۰۷a(tempPoint3, relative);
                p.cubicTo(tempPoint1.x, tempPoint1.y, tempPoint2.x, tempPoint2.y, tempPoint3.x, tempPoint3.y);
                command2 = command2;
                relative = relative;
            }
            this.f۱۲۸۵۵b.set(tempPoint3);
        }
        return p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        return 3;
     */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m۱۴۱۰۶a() {
        /*
            r3 = this;
        L0:
            int r0 = r3.f۱۲۸۵۷d
            int r1 = r3.f۱۲۸۵۶c
            if (r0 >= r1) goto L3f
            java.lang.String r1 = r3.f۱۲۸۵۸e
            char r0 = r1.charAt(r0)
            r1 = 97
            if (r1 > r0) goto L18
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 > r1) goto L18
            r1 = 2
            r3.f۱۲۸۵۴a = r1
            return r1
        L18:
            r1 = 65
            r2 = 1
            if (r1 > r0) goto L24
            r1 = 90
            if (r0 > r1) goto L24
            r3.f۱۲۸۵۴a = r2
            return r2
        L24:
            r1 = 48
            if (r1 > r0) goto L2c
            r1 = 57
            if (r0 <= r1) goto L3b
        L2c:
            r1 = 46
            if (r0 == r1) goto L3b
            r1 = 45
            if (r0 != r1) goto L35
            goto L3b
        L35:
            int r1 = r3.f۱۲۸۵۷d
            int r1 = r1 + r2
            r3.f۱۲۸۵۷d = r1
            goto L0
        L3b:
            r1 = 3
            r3.f۱۲۸۵۴a = r1
            return r1
        L3f:
            r0 = 4
            r3.f۱۲۸۵۴a = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۴g.Cb.m۱۴۱۰۶a():int");
    }

    /* renamed from: b, reason: contains not printable characters */
    private char m۱۴۱۰۸b() {
        m۱۴۱۰۶a();
        int i = this.f۱۲۸۵۴a;
        if (i != 2 && i != 1) {
            throw new ParseException("Expected command", this.f۱۲۸۵۷d);
        }
        String str = this.f۱۲۸۵۸e;
        int i2 = this.f۱۲۸۵۷d;
        this.f۱۲۸۵۷d = i2 + 1;
        return str.charAt(i2);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۴۱۰۷a(PointF out, boolean relative) {
        out.x = mo۱۴۱۱۰a(m۱۴۱۰۹c());
        out.y = mo۱۴۱۱۲b(m۱۴۱۰۹c());
        if (relative) {
            float f2 = out.x;
            PointF pointF = this.f۱۲۸۵۵b;
            out.x = f2 + pointF.x;
            out.y += pointF.y;
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private float m۱۴۱۰۹c() {
        char c2;
        m۱۴۱۰۶a();
        if (this.f۱۲۸۵۴a != 3) {
            throw new ParseException("Expected value", this.f۱۲۸۵۷d);
        }
        boolean start = true;
        boolean seenDot = false;
        int index = this.f۱۲۸۵۷d;
        while (index < this.f۱۲۸۵۶c && (('0' <= (c2 = this.f۱۲۸۵۸e.charAt(index)) && c2 <= '9') || ((c2 == '.' && !seenDot) || (c2 == '-' && start)))) {
            if (c2 == '.') {
                seenDot = true;
            }
            start = false;
            index++;
        }
        int i = this.f۱۲۸۵۷d;
        if (index == i) {
            throw new ParseException("Expected value", i);
        }
        String str = this.f۱۲۸۵۸e.substring(i, index);
        try {
            float value = Float.parseFloat(str);
            this.f۱۲۸۵۷d = index;
            return value;
        } catch (NumberFormatException e2) {
            throw new ParseException("Invalid float value '" + str + "'.", this.f۱۲۸۵۷d);
        }
    }
}
