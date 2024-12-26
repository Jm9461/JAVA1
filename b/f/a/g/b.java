package b.f.a.g;

import android.graphics.Path;
import android.graphics.PointF;
import java.text.ParseException;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f۲۵۱۳a;

    /* renamed from: b  reason: collision with root package name */
    private PointF f۲۵۱۴b = new PointF();

    /* renamed from: c  reason: collision with root package name */
    private int f۲۵۱۵c;

    /* renamed from: d  reason: collision with root package name */
    private int f۲۵۱۶d;

    /* renamed from: e  reason: collision with root package name */
    private String f۲۵۱۷e;

    /* access modifiers changed from: protected */
    public float a(float f2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public float b(float f2) {
        throw null;
    }

    public Path a(String s) {
        char command = 0;
        this.f۲۵۱۴b.set(Float.NaN, Float.NaN);
        this.f۲۵۱۷e = s;
        this.f۲۵۱۶d = 0;
        this.f۲۵۱۵c = this.f۲۵۱۷e.length();
        PointF tempPoint1 = new PointF();
        PointF tempPoint2 = new PointF();
        PointF tempPoint3 = new PointF();
        Path p = new Path();
        p.setFillType(Path.FillType.WINDING);
        boolean firstMove = true;
        while (this.f۲۵۱۶d < this.f۲۵۱۵c) {
            char command2 = b();
            boolean relative = this.f۲۵۱۳a == 2;
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
                                                while (a() == 3) {
                                                    a(tempPoint1, relative && this.f۲۵۱۴b.x != command);
                                                    if (firstPoint) {
                                                        p.moveTo(tempPoint1.x, tempPoint1.y);
                                                        firstPoint = false;
                                                        if (firstMove) {
                                                            this.f۲۵۱۴b.set(tempPoint1);
                                                            firstMove = false;
                                                        }
                                                    } else {
                                                        p.lineTo(tempPoint1.x, tempPoint1.y);
                                                    }
                                                }
                                                this.f۲۵۱۴b.set(tempPoint1);
                                                command = 0;
                                            }
                                            if (this.f۲۵۱۴b.x != command) {
                                                while (a() == 3) {
                                                    a(tempPoint1, relative);
                                                    p.lineTo(tempPoint1.x, tempPoint1.y);
                                                }
                                                this.f۲۵۱۴b.set(tempPoint1);
                                                command = 0;
                                            } else {
                                                throw new ParseException("Relative commands require current point", this.f۲۵۱۶d);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        p.close();
                        command = 0;
                    }
                    if (this.f۲۵۱۴b.x != command) {
                        while (a() == 3) {
                            float y = b(c());
                            if (relative) {
                                y += this.f۲۵۱۴b.y;
                            }
                            p.lineTo(this.f۲۵۱۴b.x, y);
                        }
                        this.f۲۵۱۴b.set(tempPoint1);
                        command = 0;
                    } else {
                        throw new ParseException("Relative commands require current point", this.f۲۵۱۶d);
                    }
                }
                if (this.f۲۵۱۴b.x != command) {
                    while (a() == 3) {
                        float x = a(c());
                        if (relative) {
                            x += this.f۲۵۱۴b.x;
                        }
                        p.lineTo(x, this.f۲۵۱۴b.y);
                    }
                    this.f۲۵۱۴b.set(tempPoint1);
                    command = 0;
                } else {
                    throw new ParseException("Relative commands require current point", this.f۲۵۱۶d);
                }
            }
            if (this.f۲۵۱۴b.x != command) {
                for (int i = 3; a() == i; i = 3) {
                    a(tempPoint1, relative);
                    a(tempPoint2, relative);
                    a(tempPoint3, relative);
                    p.cubicTo(tempPoint1.x, tempPoint1.y, tempPoint2.x, tempPoint2.y, tempPoint3.x, tempPoint3.y);
                    command2 = command2;
                    relative = relative;
                }
                this.f۲۵۱۴b.set(tempPoint3);
                command = 0;
            } else {
                throw new ParseException("Relative commands require current point", this.f۲۵۱۶d);
            }
        }
        return p;
    }

    private int a() {
        while (true) {
            int i = this.f۲۵۱۶d;
            if (i < this.f۲۵۱۵c) {
                char c2 = this.f۲۵۱۷e.charAt(i);
                if ('a' <= c2 && c2 <= 'z') {
                    this.f۲۵۱۳a = 2;
                    return 2;
                } else if ('A' <= c2 && c2 <= 'Z') {
                    this.f۲۵۱۳a = 1;
                    return 1;
                } else if (!(('0' <= c2 && c2 <= '9') || c2 == '.' || c2 == '-')) {
                    this.f۲۵۱۶d++;
                }
            } else {
                this.f۲۵۱۳a = 4;
                return 4;
            }
        }
        this.f۲۵۱۳a = 3;
        return 3;
    }

    private char b() {
        a();
        int i = this.f۲۵۱۳a;
        if (i == 2 || i == 1) {
            String str = this.f۲۵۱۷e;
            int i2 = this.f۲۵۱۶d;
            this.f۲۵۱۶d = i2 + 1;
            return str.charAt(i2);
        }
        throw new ParseException("Expected command", this.f۲۵۱۶d);
    }

    private void a(PointF out, boolean relative) {
        out.x = a(c());
        out.y = b(c());
        if (relative) {
            float f2 = out.x;
            PointF pointF = this.f۲۵۱۴b;
            out.x = f2 + pointF.x;
            out.y += pointF.y;
        }
    }

    private float c() {
        char c2;
        a();
        if (this.f۲۵۱۳a == 3) {
            boolean start = true;
            boolean seenDot = false;
            int index = this.f۲۵۱۶d;
            while (index < this.f۲۵۱۵c && (('0' <= (c2 = this.f۲۵۱۷e.charAt(index)) && c2 <= '9') || ((c2 == '.' && !seenDot) || (c2 == '-' && start)))) {
                if (c2 == '.') {
                    seenDot = true;
                }
                start = false;
                index++;
            }
            int i = this.f۲۵۱۶d;
            if (index != i) {
                String str = this.f۲۵۱۷e.substring(i, index);
                try {
                    float value = Float.parseFloat(str);
                    this.f۲۵۱۶d = index;
                    return value;
                } catch (NumberFormatException e2) {
                    throw new ParseException("Invalid float value '" + str + "'.", this.f۲۵۱۶d);
                }
            } else {
                throw new ParseException("Expected value", i);
            }
        } else {
            throw new ParseException("Expected value", this.f۲۵۱۶d);
        }
    }
}
