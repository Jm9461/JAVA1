package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a;

import android.graphics.Path;
import android.support.v4.graphics.PathParser;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: a.b.g.a.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb {
    /* renamed from: a, reason: contains not printable characters */
    static float[] m۸۳۶۰a(float[] original, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException();
        }
        int originalLength = original.length;
        if (start < 0 || start > originalLength) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int resultLength = end - start;
        int copyLength = Math.min(resultLength, originalLength - start);
        float[] result = new float[resultLength];
        System.arraycopy(original, start, result, 0, copyLength);
        return result;
    }

    /* renamed from: b, reason: contains not printable characters */
    public static Path m۸۳۶۳b(String pathData) {
        Path path = new Path();
        b[] nodes = m۸۳۶۱a(pathData);
        if (nodes != null) {
            try {
                b.m۸۳۶۹a(nodes, path);
                return path;
            } catch (RuntimeException e2) {
                throw new RuntimeException("Error in parsing " + pathData, e2);
            }
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static b[] m۸۳۶۱a(String pathData) {
        if (pathData == null) {
            return null;
        }
        int start = 0;
        int end = 1;
        ArrayList<PathParser.PathDataNode> list = new ArrayList<>();
        while (end < pathData.length()) {
            int end2 = m۸۳۵۶a(pathData, end);
            String s = pathData.substring(start, end2).trim();
            if (s.length() > 0) {
                float[] val = m۸۳۶۵c(s);
                m۸۳۵۸a((ArrayList<b>) list, s.charAt(0), val);
            }
            start = end2;
            end = end2 + 1;
        }
        if (end - start == 1 && start < pathData.length()) {
            m۸۳۵۸a((ArrayList<b>) list, pathData.charAt(start), new float[0]);
        }
        return (b[]) list.toArray(new b[list.size()]);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static b[] m۸۳۶۲a(b[] source) {
        if (source == null) {
            return null;
        }
        b[] copy = new b[source.length];
        for (int i = 0; i < source.length; i++) {
            copy[i] = new b(source[i]);
        }
        return copy;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۸۳۵۹a(b[] nodesFrom, b[] nodesTo) {
        if (nodesFrom == null || nodesTo == null || nodesFrom.length != nodesTo.length) {
            return false;
        }
        for (int i = 0; i < nodesFrom.length; i++) {
            if (nodesFrom[i].f۸۶۴۷a != nodesTo[i].f۸۶۴۷a || nodesFrom[i].f۸۶۴۸b.length != nodesTo[i].f۸۶۴۸b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b, reason: contains not printable characters */
    public static void m۸۳۶۴b(b[] target, b[] source) {
        for (int i = 0; i < source.length; i++) {
            target[i].f۸۶۴۷a = source[i].f۸۶۴۷a;
            for (int j = 0; j < source[i].f۸۶۴۸b.length; j++) {
                target[i].f۸۶۴۸b[j] = source[i].f۸۶۴۸b[j];
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۸۳۵۶a(String s, int end) {
        while (end < s.length()) {
            char c2 = s.charAt(end);
            if (((c2 - 'A') * (c2 - 'Z') <= 0 || (c2 - 'a') * (c2 - 'z') <= 0) && c2 != 'e' && c2 != 'E') {
                return end;
            }
            end++;
        }
        return end;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۸۳۵۸a(ArrayList<b> arrayList, char cmd, float[] val) {
        arrayList.add(new b(cmd, val));
    }

    /* renamed from: a.b.g.a.b$a */
    private static class a {

        /* renamed from: a, reason: contains not printable characters */
        int f۸۶۴۵a;

        /* renamed from: b, reason: contains not printable characters */
        boolean f۸۶۴۶b;

        a() {
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private static float[] m۸۳۶۵c(String s) {
        if (s.charAt(0) == 'z' || s.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] results = new float[s.length()];
            int count = 0;
            int startPosition = 1;
            a result = new a();
            int totalLength = s.length();
            while (startPosition < totalLength) {
                m۸۳۵۷a(s, startPosition, result);
                int endPosition = result.f۸۶۴۵a;
                if (startPosition < endPosition) {
                    results[count] = Float.parseFloat(s.substring(startPosition, endPosition));
                    count++;
                }
                if (result.f۸۶۴۶b) {
                    startPosition = endPosition;
                } else {
                    startPosition = endPosition + 1;
                }
            }
            return m۸۳۶۰a(results, 0, count);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("error in parsing \"" + s + "\"", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[LOOP:0: B:2:0x0007->B:19:0x003b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[SYNTHETIC] */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m۸۳۵۷a(java.lang.String r7, int r8, p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cb.a r9) {
        /*
            r0 = r8
            r1 = 0
            r2 = 0
            r9.f۸۶۴۶b = r2
            r2 = 0
            r3 = 0
        L7:
            int r4 = r7.length()
            if (r0 >= r4) goto L3e
            r4 = r3
            r3 = 0
            char r5 = r7.charAt(r0)
            r6 = 32
            if (r5 == r6) goto L36
            r6 = 69
            if (r5 == r6) goto L34
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L34
            r6 = 1
            switch(r5) {
                case 44: goto L36;
                case 45: goto L2c;
                case 46: goto L24;
                default: goto L23;
            }
        L23:
            goto L38
        L24:
            if (r2 != 0) goto L28
            r2 = 1
            goto L38
        L28:
            r1 = 1
            r9.f۸۶۴۶b = r6
            goto L38
        L2c:
            if (r0 == r8) goto L38
            if (r4 != 0) goto L38
            r1 = 1
            r9.f۸۶۴۶b = r6
            goto L38
        L34:
            r3 = 1
            goto L38
        L36:
            r1 = 1
        L38:
            if (r1 == 0) goto L3b
            goto L3e
        L3b:
            int r0 = r0 + 1
            goto L7
        L3e:
            r9.f۸۶۴۵a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cb.m۸۳۵۷a(java.lang.String, int, a.b.g.a.b$a):void");
    }

    /* renamed from: a.b.g.a.b$b */
    public static class b {

        /* renamed from: a, reason: contains not printable characters */
        public char f۸۶۴۷a;

        /* renamed from: b, reason: contains not printable characters */
        public float[] f۸۶۴۸b;

        b(char type, float[] params) {
            this.f۸۶۴۷a = type;
            this.f۸۶۴۸b = params;
        }

        b(b n) {
            this.f۸۶۴۷a = n.f۸۶۴۷a;
            float[] fArr = n.f۸۶۴۸b;
            this.f۸۶۴۸b = Cb.m۸۳۶۰a(fArr, 0, fArr.length);
        }

        /* renamed from: a, reason: contains not printable characters */
        public static void m۸۳۶۹a(b[] node, Path path) {
            float[] current = new float[6];
            char previousCommand = 'm';
            for (int i = 0; i < node.length; i++) {
                m۸۳۶۸a(path, current, previousCommand, node[i].f۸۶۴۷a, node[i].f۸۶۴۸b);
                previousCommand = node[i].f۸۶۴۷a;
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۸۳۷۰a(b nodeFrom, b nodeTo, float fraction) {
            int i = 0;
            while (true) {
                float[] fArr = nodeFrom.f۸۶۴۸b;
                if (i < fArr.length) {
                    this.f۸۶۴۸b[i] = (fArr[i] * (1.0f - fraction)) + (nodeTo.f۸۶۴۸b[i] * fraction);
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        private static void m۸۳۶۸a(Path path, float[] current, char previousCmd, char cmd, float[] val) {
            int incr;
            int k;
            float reflectiveCtrlPointX;
            float reflectiveCtrlPointY;
            float reflectiveCtrlPointX2;
            float reflectiveCtrlPointY2;
            float currentX = current[0];
            float currentY = current[1];
            float ctrlPointX = current[2];
            float ctrlPointY = current[3];
            float currentSegmentStartX = current[4];
            float currentSegmentStartY = current[5];
            switch (cmd) {
                case 'A':
                case 'a':
                    incr = 7;
                    break;
                case 'C':
                case 'c':
                    incr = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    incr = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                    incr = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    incr = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    currentX = currentSegmentStartX;
                    currentY = currentSegmentStartY;
                    ctrlPointX = currentSegmentStartX;
                    ctrlPointY = currentSegmentStartY;
                    path.moveTo(currentX, currentY);
                    incr = 2;
                    break;
                default:
                    incr = 2;
                    break;
            }
            int k2 = 0;
            float currentX2 = currentX;
            float currentY2 = currentY;
            float ctrlPointX2 = ctrlPointX;
            float ctrlPointY2 = ctrlPointY;
            float currentSegmentStartX2 = currentSegmentStartX;
            float currentSegmentStartY2 = currentSegmentStartY;
            char previousCmd2 = previousCmd;
            while (k2 < val.length) {
                if (cmd == 'A') {
                    k = k2;
                    m۸۳۶۷a(path, currentX2, currentY2, val[k + 5], val[k + 6], val[k + 0], val[k + 1], val[k + 2], val[k + 3] != 0.0f, val[k + 4] != 0.0f);
                    currentX2 = val[k + 5];
                    currentY2 = val[k + 6];
                    ctrlPointX2 = currentX2;
                    ctrlPointY2 = currentY2;
                } else if (cmd == 'C') {
                    k = k2;
                    path.cubicTo(val[k + 0], val[k + 1], val[k + 2], val[k + 3], val[k + 4], val[k + 5]);
                    currentX2 = val[k + 4];
                    currentY2 = val[k + 5];
                    ctrlPointX2 = val[k + 2];
                    ctrlPointY2 = val[k + 3];
                } else if (cmd == 'H') {
                    k = k2;
                    path.lineTo(val[k + 0], currentY2);
                    currentX2 = val[k + 0];
                } else if (cmd == 'Q') {
                    k = k2;
                    path.quadTo(val[k + 0], val[k + 1], val[k + 2], val[k + 3]);
                    float ctrlPointX3 = val[k + 0];
                    float ctrlPointY3 = val[k + 1];
                    currentX2 = val[k + 2];
                    currentY2 = val[k + 3];
                    ctrlPointX2 = ctrlPointX3;
                    ctrlPointY2 = ctrlPointY3;
                } else if (cmd == 'V') {
                    k = k2;
                    path.lineTo(currentX2, val[k + 0]);
                    currentY2 = val[k + 0];
                } else if (cmd == 'a') {
                    float f2 = val[k2 + 5] + currentX2;
                    float f3 = val[k2 + 6] + currentY2;
                    float f4 = val[k2 + 0];
                    float f5 = val[k2 + 1];
                    float currentX3 = val[k2 + 2];
                    float currentX4 = currentX2;
                    k = k2;
                    m۸۳۶۷a(path, currentX2, currentY2, f2, f3, f4, f5, currentX3, val[k2 + 3] != 0.0f, val[k2 + 4] != 0.0f);
                    currentX2 = currentX4 + val[k + 5];
                    currentY2 += val[k + 6];
                    ctrlPointX2 = currentX2;
                    ctrlPointY2 = currentY2;
                } else if (cmd == 'c') {
                    path.rCubicTo(val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3], val[k2 + 4], val[k2 + 5]);
                    float ctrlPointX4 = val[k2 + 2] + currentX2;
                    float ctrlPointY4 = val[k2 + 3] + currentY2;
                    currentX2 += val[k2 + 4];
                    currentY2 += val[k2 + 5];
                    ctrlPointX2 = ctrlPointX4;
                    ctrlPointY2 = ctrlPointY4;
                    k = k2;
                } else if (cmd == 'h') {
                    path.rLineTo(val[k2 + 0], 0.0f);
                    currentX2 += val[k2 + 0];
                    k = k2;
                } else if (cmd == 'q') {
                    path.rQuadTo(val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3]);
                    float ctrlPointX5 = val[k2 + 0] + currentX2;
                    float ctrlPointY5 = val[k2 + 1] + currentY2;
                    currentX2 += val[k2 + 2];
                    currentY2 += val[k2 + 3];
                    ctrlPointX2 = ctrlPointX5;
                    ctrlPointY2 = ctrlPointY5;
                    k = k2;
                } else if (cmd == 'v') {
                    path.rLineTo(0.0f, val[k2 + 0]);
                    currentY2 += val[k2 + 0];
                    k = k2;
                } else if (cmd == 'L') {
                    path.lineTo(val[k2 + 0], val[k2 + 1]);
                    currentX2 = val[k2 + 0];
                    currentY2 = val[k2 + 1];
                    k = k2;
                } else if (cmd == 'M') {
                    currentX2 = val[k2 + 0];
                    currentY2 = val[k2 + 1];
                    if (k2 > 0) {
                        path.lineTo(val[k2 + 0], val[k2 + 1]);
                        k = k2;
                    } else {
                        path.moveTo(val[k2 + 0], val[k2 + 1]);
                        currentSegmentStartX2 = currentX2;
                        currentSegmentStartY2 = currentY2;
                        k = k2;
                    }
                } else if (cmd == 'S') {
                    char previousCmd3 = previousCmd2;
                    float reflectiveCtrlPointX3 = currentX2;
                    float reflectiveCtrlPointY3 = currentY2;
                    if (previousCmd3 == 'c' || previousCmd3 == 's' || previousCmd3 == 'C' || previousCmd3 == 'S') {
                        float reflectiveCtrlPointX4 = (currentX2 * 2.0f) - ctrlPointX2;
                        reflectiveCtrlPointX = reflectiveCtrlPointX4;
                        reflectiveCtrlPointY = (2.0f * currentY2) - ctrlPointY2;
                    } else {
                        reflectiveCtrlPointX = reflectiveCtrlPointX3;
                        reflectiveCtrlPointY = reflectiveCtrlPointY3;
                    }
                    path.cubicTo(reflectiveCtrlPointX, reflectiveCtrlPointY, val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3]);
                    float ctrlPointX6 = val[k2 + 0];
                    float ctrlPointY6 = val[k2 + 1];
                    currentX2 = val[k2 + 2];
                    currentY2 = val[k2 + 3];
                    ctrlPointX2 = ctrlPointX6;
                    ctrlPointY2 = ctrlPointY6;
                    k = k2;
                } else if (cmd == 'T') {
                    char previousCmd4 = previousCmd2;
                    float reflectiveCtrlPointX5 = currentX2;
                    float reflectiveCtrlPointY4 = currentY2;
                    if (previousCmd4 == 'q' || previousCmd4 == 't' || previousCmd4 == 'Q' || previousCmd4 == 'T') {
                        reflectiveCtrlPointX5 = (currentX2 * 2.0f) - ctrlPointX2;
                        reflectiveCtrlPointY4 = (2.0f * currentY2) - ctrlPointY2;
                    }
                    path.quadTo(reflectiveCtrlPointX5, reflectiveCtrlPointY4, val[k2 + 0], val[k2 + 1]);
                    currentX2 = val[k2 + 0];
                    currentY2 = val[k2 + 1];
                    ctrlPointX2 = reflectiveCtrlPointX5;
                    ctrlPointY2 = reflectiveCtrlPointY4;
                    k = k2;
                } else if (cmd == 'l') {
                    path.rLineTo(val[k2 + 0], val[k2 + 1]);
                    currentX2 += val[k2 + 0];
                    currentY2 += val[k2 + 1];
                    k = k2;
                } else if (cmd == 'm') {
                    currentX2 += val[k2 + 0];
                    currentY2 += val[k2 + 1];
                    if (k2 > 0) {
                        path.rLineTo(val[k2 + 0], val[k2 + 1]);
                        k = k2;
                    } else {
                        path.rMoveTo(val[k2 + 0], val[k2 + 1]);
                        currentSegmentStartX2 = currentX2;
                        currentSegmentStartY2 = currentY2;
                        k = k2;
                    }
                } else if (cmd == 's') {
                    if (previousCmd2 != 'c' && previousCmd2 != 's' && previousCmd2 != 'C' && previousCmd2 != 'S') {
                        reflectiveCtrlPointX2 = 0.0f;
                        reflectiveCtrlPointY2 = 0.0f;
                    } else {
                        float reflectiveCtrlPointX6 = currentX2 - ctrlPointX2;
                        reflectiveCtrlPointX2 = reflectiveCtrlPointX6;
                        reflectiveCtrlPointY2 = currentY2 - ctrlPointY2;
                    }
                    path.rCubicTo(reflectiveCtrlPointX2, reflectiveCtrlPointY2, val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3]);
                    float ctrlPointX7 = val[k2 + 0] + currentX2;
                    float ctrlPointY7 = val[k2 + 1] + currentY2;
                    currentX2 += val[k2 + 2];
                    currentY2 += val[k2 + 3];
                    ctrlPointX2 = ctrlPointX7;
                    ctrlPointY2 = ctrlPointY7;
                    k = k2;
                } else if (cmd != 't') {
                    k = k2;
                } else {
                    float reflectiveCtrlPointX7 = 0.0f;
                    float reflectiveCtrlPointY5 = 0.0f;
                    if (previousCmd2 == 'q' || previousCmd2 == 't' || previousCmd2 == 'Q' || previousCmd2 == 'T') {
                        reflectiveCtrlPointX7 = currentX2 - ctrlPointX2;
                        reflectiveCtrlPointY5 = currentY2 - ctrlPointY2;
                    }
                    path.rQuadTo(reflectiveCtrlPointX7, reflectiveCtrlPointY5, val[k2 + 0], val[k2 + 1]);
                    float ctrlPointX8 = currentX2 + reflectiveCtrlPointX7;
                    float ctrlPointY8 = currentY2 + reflectiveCtrlPointY5;
                    currentX2 += val[k2 + 0];
                    currentY2 += val[k2 + 1];
                    ctrlPointX2 = ctrlPointX8;
                    ctrlPointY2 = ctrlPointY8;
                    k = k2;
                }
                previousCmd2 = cmd;
                k2 = k + incr;
            }
            current[0] = currentX2;
            current[1] = currentY2;
            current[2] = ctrlPointX2;
            current[3] = ctrlPointY2;
            current[4] = currentSegmentStartX2;
            current[5] = currentSegmentStartY2;
        }

        /* renamed from: a, reason: contains not printable characters */
        private static void m۸۳۶۷a(Path p, float x0, float y0, float x1, float y1, float a2, float b2, float theta, boolean isMoreThanHalf, boolean isPositiveArc) {
            double cx;
            double cy;
            double thetaD = Math.toRadians(theta);
            double cosTheta = Math.cos(thetaD);
            double sinTheta = Math.sin(thetaD);
            double d2 = x0;
            Double.isNaN(d2);
            double d3 = y0;
            Double.isNaN(d3);
            double d4 = (d2 * cosTheta) + (d3 * sinTheta);
            double d5 = a2;
            Double.isNaN(d5);
            double x0p = d4 / d5;
            double d6 = -x0;
            Double.isNaN(d6);
            double d7 = y0;
            Double.isNaN(d7);
            double d8 = (d6 * sinTheta) + (d7 * cosTheta);
            double d9 = b2;
            Double.isNaN(d9);
            double y0p = d8 / d9;
            double d10 = x1;
            Double.isNaN(d10);
            double d11 = y1;
            Double.isNaN(d11);
            double d12 = (d10 * cosTheta) + (d11 * sinTheta);
            double d13 = a2;
            Double.isNaN(d13);
            double x1p = d12 / d13;
            double d14 = -x1;
            Double.isNaN(d14);
            double d15 = y1;
            Double.isNaN(d15);
            double d16 = (d14 * sinTheta) + (d15 * cosTheta);
            double d17 = b2;
            Double.isNaN(d17);
            double y1p = d16 / d17;
            double dx = x0p - x1p;
            double dy = y0p - y1p;
            double xm = (x0p + x1p) / 2.0d;
            double ym = (y0p + y1p) / 2.0d;
            double dsq = (dx * dx) + (dy * dy);
            if (dsq == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double disc = (1.0d / dsq) - 0.25d;
            if (disc < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + dsq);
                float adjust = (float) (Math.sqrt(dsq) / 1.99999d);
                m۸۳۶۷a(p, x0, y0, x1, y1, a2 * adjust, b2 * adjust, theta, isMoreThanHalf, isPositiveArc);
                return;
            }
            double s = Math.sqrt(disc);
            double sdx = s * dx;
            double sdy = s * dy;
            if (isMoreThanHalf == isPositiveArc) {
                cx = xm - sdy;
                cy = ym + sdx;
            } else {
                cx = xm + sdy;
                cy = ym - sdx;
            }
            double eta0 = Math.atan2(y0p - cy, x0p - cx);
            double sweep = Math.atan2(y1p - cy, x1p - cx) - eta0;
            if (isPositiveArc != (sweep >= 0.0d)) {
                if (sweep > 0.0d) {
                    sweep -= 6.283185307179586d;
                } else {
                    sweep += 6.283185307179586d;
                }
            }
            double eta1 = a2;
            Double.isNaN(eta1);
            double cx2 = cx * eta1;
            double d18 = b2;
            Double.isNaN(d18);
            double cy2 = d18 * cy;
            double cx3 = (cx2 * cosTheta) - (cy2 * sinTheta);
            double cy3 = (cx2 * sinTheta) + (cy2 * cosTheta);
            double cy4 = a2;
            m۸۳۶۶a(p, cx3, cy3, cy4, b2, x0, y0, thetaD, eta0, sweep);
        }

        /* renamed from: a, reason: contains not printable characters */
        private static void m۸۳۶۶a(Path p, double cx, double cy, double a2, double b2, double e1x, double e1y, double theta, double start, double sweep) {
            double d2 = a2;
            int numSegments = (int) Math.ceil(Math.abs((sweep * 4.0d) / 3.141592653589793d));
            double cosTheta = Math.cos(theta);
            double sinTheta = Math.sin(theta);
            double cosEta1 = Math.cos(start);
            double sinEta1 = Math.sin(start);
            double ep1x = (((-d2) * cosTheta) * sinEta1) - ((b2 * sinTheta) * cosEta1);
            double ep1x2 = -d2;
            double ep1y = (ep1x2 * sinTheta * sinEta1) + (b2 * cosTheta * cosEta1);
            double ep1y2 = numSegments;
            Double.isNaN(ep1y2);
            double anglePerSegment = sweep / ep1y2;
            double ep1x3 = ep1x;
            double ep1y3 = ep1y;
            double e1x2 = e1x;
            double e1y2 = e1y;
            int i = 0;
            double eta1 = start;
            while (i < numSegments) {
                double eta2 = eta1 + anglePerSegment;
                double sinEta2 = Math.sin(eta2);
                double cosEta2 = Math.cos(eta2);
                double anglePerSegment2 = anglePerSegment;
                double anglePerSegment3 = (cx + ((d2 * cosTheta) * cosEta2)) - ((b2 * sinTheta) * sinEta2);
                double cosEta12 = cosEta1;
                double cosEta13 = cy + (d2 * sinTheta * cosEta2) + (b2 * cosTheta * sinEta2);
                double sinEta12 = sinEta1;
                double ep2x = (((-d2) * cosTheta) * sinEta2) - ((b2 * sinTheta) * cosEta2);
                int numSegments2 = numSegments;
                double ep2y = ((-d2) * sinTheta * sinEta2) + (b2 * cosTheta * cosEta2);
                double tanDiff2 = Math.tan((eta2 - eta1) / 2.0d);
                double alpha = (Math.sin(eta2 - eta1) * (Math.sqrt(((tanDiff2 * 3.0d) * tanDiff2) + 4.0d) - 1.0d)) / 3.0d;
                double q1x = e1x2 + (alpha * ep1x3);
                double q1y = e1y2 + (alpha * ep1y3);
                double q2x = anglePerSegment3 - (alpha * ep2x);
                p.rLineTo(0.0f, 0.0f);
                p.cubicTo((float) q1x, (float) q1y, (float) q2x, (float) (cosEta13 - (alpha * ep2y)), (float) anglePerSegment3, (float) cosEta13);
                eta1 = eta2;
                e1x2 = anglePerSegment3;
                e1y2 = cosEta13;
                ep1x3 = ep2x;
                ep1y3 = ep2y;
                i++;
                d2 = a2;
                numSegments = numSegments2;
                sinEta1 = sinEta12;
                anglePerSegment = anglePerSegment2;
                cosEta1 = cosEta12;
                cosTheta = cosTheta;
                sinTheta = sinTheta;
            }
        }
    }
}
