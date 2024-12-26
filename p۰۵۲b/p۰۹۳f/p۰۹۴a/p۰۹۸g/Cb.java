package p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۸g;

import android.graphics.Path;
import android.graphics.PointF;
import java.text.ParseException;

/* renamed from: b.f.a.g.b  reason: invalid class name */
public class Cb {

    /* renamed from: a  reason: contains not printable characters */
    private int f۱۲۸۵۴a;

    /* renamed from: b  reason: contains not printable characters */
    private PointF f۱۲۸۵۵b = new PointF();

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۲۸۵۶c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۲۸۵۷d;

    /* renamed from: e  reason: contains not printable characters */
    private String f۱۲۸۵۸e;

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public float m۱۶۱۸۱a(float f) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public float m۱۶۱۸۳b(float f) {
        throw null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Path m۱۶۱۸۲a(String s) {
        char command = 0;
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
            char command2 = m۱۶۱۷۹b();
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
                                                        if (command2 != 'm') {
                                                            command = 0;
                                                        }
                                                    }
                                                }
                                                boolean firstPoint = true;
                                                while (m۱۶۱۷۷a() == 3) {
                                                    m۱۶۱۷۸a(tempPoint1, relative && this.f۱۲۸۵۵b.x != command);
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
                                                command = 0;
                                            }
                                            if (this.f۱۲۸۵۵b.x != command) {
                                                while (m۱۶۱۷۷a() == 3) {
                                                    m۱۶۱۷۸a(tempPoint1, relative);
                                                    p.lineTo(tempPoint1.x, tempPoint1.y);
                                                }
                                                this.f۱۲۸۵۵b.set(tempPoint1);
                                                command = 0;
                                            } else {
                                                throw new ParseException("Relative commands require current point", this.f۱۲۸۵۷d);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        p.close();
                        command = 0;
                    }
                    if (this.f۱۲۸۵۵b.x != command) {
                        while (m۱۶۱۷۷a() == 3) {
                            float y = m۱۶۱۸۳b(m۱۶۱۸۰c());
                            if (relative) {
                                y += this.f۱۲۸۵۵b.y;
                            }
                            p.lineTo(this.f۱۲۸۵۵b.x, y);
                        }
                        this.f۱۲۸۵۵b.set(tempPoint1);
                        command = 0;
                    } else {
                        throw new ParseException("Relative commands require current point", this.f۱۲۸۵۷d);
                    }
                }
                if (this.f۱۲۸۵۵b.x != command) {
                    while (m۱۶۱۷۷a() == 3) {
                        float x = m۱۶۱۸۱a(m۱۶۱۸۰c());
                        if (relative) {
                            x += this.f۱۲۸۵۵b.x;
                        }
                        p.lineTo(x, this.f۱۲۸۵۵b.y);
                    }
                    this.f۱۲۸۵۵b.set(tempPoint1);
                    command = 0;
                } else {
                    throw new ParseException("Relative commands require current point", this.f۱۲۸۵۷d);
                }
            }
            if (this.f۱۲۸۵۵b.x != command) {
                for (int i = 3; m۱۶۱۷۷a() == i; i = 3) {
                    m۱۶۱۷۸a(tempPoint1, relative);
                    m۱۶۱۷۸a(tempPoint2, relative);
                    m۱۶۱۷۸a(tempPoint3, relative);
                    p.cubicTo(tempPoint1.x, tempPoint1.y, tempPoint2.x, tempPoint2.y, tempPoint3.x, tempPoint3.y);
                    command2 = command2;
                    relative = relative;
                }
                this.f۱۲۸۵۵b.set(tempPoint3);
                command = 0;
            } else {
                throw new ParseException("Relative commands require current point", this.f۱۲۸۵۷d);
            }
        }
        return p;
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۶۱۷۷a() {
        while (true) {
            int i = this.f۱۲۸۵۷d;
            if (i < this.f۱۲۸۵۶c) {
                char c = this.f۱۲۸۵۸e.charAt(i);
                if ('a' <= c && c <= 'z') {
                    this.f۱۲۸۵۴a = 2;
                    return 2;
                } else if ('A' <= c && c <= 'Z') {
                    this.f۱۲۸۵۴a = 1;
                    return 1;
                } else if (!(('0' <= c && c <= '9') || c == '.' || c == '-')) {
                    this.f۱۲۸۵۷d++;
                }
            } else {
                this.f۱۲۸۵۴a = 4;
                return 4;
            }
        }
        this.f۱۲۸۵۴a = 3;
        return 3;
    }

    /* renamed from: b  reason: contains not printable characters */
    private char m۱۶۱۷۹b() {
        m۱۶۱۷۷a();
        int i = this.f۱۲۸۵۴a;
        if (i == 2 || i == 1) {
            String str = this.f۱۲۸۵۸e;
            int i2 = this.f۱۲۸۵۷d;
            this.f۱۲۸۵۷d = i2 + 1;
            return str.charAt(i2);
        }
        throw new ParseException("Expected command", this.f۱۲۸۵۷d);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۱۷۸a(PointF out, boolean relative) {
        out.x = m۱۶۱۸۱a(m۱۶۱۸۰c());
        out.y = m۱۶۱۸۳b(m۱۶۱۸۰c());
        if (relative) {
            float f = out.x;
            PointF pointF = this.f۱۲۸۵۵b;
            out.x = f + pointF.x;
            out.y += pointF.y;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private float m۱۶۱۸۰c() {
        char c;
        m۱۶۱۷۷a();
        if (this.f۱۲۸۵۴a == 3) {
            boolean start = true;
            boolean seenDot = false;
            int index = this.f۱۲۸۵۷d;
            while (index < this.f۱۲۸۵۶c && (('0' <= (c = this.f۱۲۸۵۸e.charAt(index)) && c <= '9') || ((c == '.' && !seenDot) || (c == '-' && start)))) {
                if (c == '.') {
                    seenDot = true;
                }
                start = false;
                index++;
            }
            int i = this.f۱۲۸۵۷d;
            if (index != i) {
                String str = this.f۱۲۸۵۸e.substring(i, index);
                try {
                    float value = Float.parseFloat(str);
                    this.f۱۲۸۵۷d = index;
                    return value;
                } catch (NumberFormatException e) {
                    throw new ParseException("Invalid float value '" + str + "'.", this.f۱۲۸۵۷d);
                }
            } else {
                throw new ParseException("Expected value", i);
            }
        } else {
            throw new ParseException("Expected value", this.f۱۲۸۵۷d);
        }
    }
}
