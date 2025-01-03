package a.b.g.a;

import android.graphics.Path;
import android.support.v4.graphics.PathParser;
import android.util.Log;
import java.util.ArrayList;

public class b {
    static float[] a(float[] original, int start, int end) {
        if (start <= end) {
            int originalLength = original.length;
            if (start < 0 || start > originalLength) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int resultLength = end - start;
            float[] result = new float[resultLength];
            System.arraycopy(original, start, result, 0, Math.min(resultLength, originalLength - start));
            return result;
        }
        throw new IllegalArgumentException();
    }

    public static Path b(String pathData) {
        Path path = new Path();
        C۰۰۱۱b[] nodes = a(pathData);
        if (nodes == null) {
            return null;
        }
        try {
            C۰۰۱۱b.a(nodes, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing " + pathData, e2);
        }
    }

    public static C۰۰۱۱b[] a(String pathData) {
        if (pathData == null) {
            return null;
        }
        int start = 0;
        int end = 1;
        ArrayList<PathParser.PathDataNode> list = new ArrayList<>();
        while (end < pathData.length()) {
            int end2 = a(pathData, end);
            String s = pathData.substring(start, end2).trim();
            if (s.length() > 0) {
                a((ArrayList<C۰۰۱۱b>) list, s.charAt(0), c(s));
            }
            start = end2;
            end = end2 + 1;
        }
        if (end - start == 1 && start < pathData.length()) {
            a((ArrayList<C۰۰۱۱b>) list, pathData.charAt(start), new float[0]);
        }
        return (C۰۰۱۱b[]) list.toArray(new C۰۰۱۱b[list.size()]);
    }

    public static C۰۰۱۱b[] a(C۰۰۱۱b[] source) {
        if (source == null) {
            return null;
        }
        C۰۰۱۱b[] copy = new C۰۰۱۱b[source.length];
        for (int i = 0; i < source.length; i++) {
            copy[i] = new C۰۰۱۱b(source[i]);
        }
        return copy;
    }

    public static boolean a(C۰۰۱۱b[] nodesFrom, C۰۰۱۱b[] nodesTo) {
        if (nodesFrom == null || nodesTo == null || nodesFrom.length != nodesTo.length) {
            return false;
        }
        for (int i = 0; i < nodesFrom.length; i++) {
            if (!(nodesFrom[i].f۲۸۴a == nodesTo[i].f۲۸۴a && nodesFrom[i].f۲۸۵b.length == nodesTo[i].f۲۸۵b.length)) {
                return false;
            }
        }
        return true;
    }

    public static void b(C۰۰۱۱b[] target, C۰۰۱۱b[] source) {
        for (int i = 0; i < source.length; i++) {
            target[i].f۲۸۴a = source[i].f۲۸۴a;
            for (int j = 0; j < source[i].f۲۸۵b.length; j++) {
                target[i].f۲۸۵b[j] = source[i].f۲۸۵b[j];
            }
        }
    }

    private static int a(String s, int end) {
        while (end < s.length()) {
            char c2 = s.charAt(end);
            if (((c2 - 'A') * (c2 - 'Z') <= 0 || (c2 - 'a') * (c2 - 'z') <= 0) && c2 != 'e' && c2 != 'E') {
                return end;
            }
            end++;
        }
        return end;
    }

    private static void a(ArrayList<C۰۰۱۱b> arrayList, char cmd, float[] val) {
        arrayList.add(new C۰۰۱۱b(cmd, val));
    }

    /* access modifiers changed from: private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f۲۸۲a;

        /* renamed from: b  reason: collision with root package name */
        boolean f۲۸۳b;

        a() {
        }
    }

    private static float[] c(String s) {
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
                a(s, startPosition, result);
                int endPosition = result.f۲۸۲a;
                if (startPosition < endPosition) {
                    results[count] = Float.parseFloat(s.substring(startPosition, endPosition));
                    count++;
                }
                if (result.f۲۸۳b) {
                    startPosition = endPosition;
                } else {
                    startPosition = endPosition + 1;
                }
            }
            return a(results, 0, count);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("error in parsing \"" + s + "\"", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[LOOP:0: B:1:0x0007->B:20:0x003b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r7, int r8, a.b.g.a.b.a r9) {
        /*
            r0 = r8
            r1 = 0
            r2 = 0
            r9.f۲۸۳b = r2
            r2 = 0
            r3 = 0
        L_0x0007:
            int r4 = r7.length()
            if (r0 >= r4) goto L_0x003e
            r4 = r3
            r3 = 0
            char r5 = r7.charAt(r0)
            r6 = 32
            if (r5 == r6) goto L_0x0036
            r6 = 69
            if (r5 == r6) goto L_0x0034
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L_0x0034
            r6 = 1
            switch(r5) {
                case 44: goto L_0x0036;
                case 45: goto L_0x002c;
                case 46: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0038
        L_0x0024:
            if (r2 != 0) goto L_0x0028
            r2 = 1
            goto L_0x0038
        L_0x0028:
            r1 = 1
            r9.f۲۸۳b = r6
            goto L_0x0038
        L_0x002c:
            if (r0 == r8) goto L_0x0038
            if (r4 != 0) goto L_0x0038
            r1 = 1
            r9.f۲۸۳b = r6
            goto L_0x0038
        L_0x0034:
            r3 = 1
            goto L_0x0038
        L_0x0036:
            r1 = 1
        L_0x0038:
            if (r1 == 0) goto L_0x003b
            goto L_0x003e
        L_0x003b:
            int r0 = r0 + 1
            goto L_0x0007
        L_0x003e:
            r9.f۲۸۲a = r0
            return
            switch-data {44->0x0036, 45->0x002c, 46->0x0024, }
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.g.a.b.a(java.lang.String, int, a.b.g.a.b$a):void");
    }

    /* renamed from: a.b.g.a.b$b  reason: collision with other inner class name */
    public static class C۰۰۱۱b {

        /* renamed from: a  reason: collision with root package name */
        public char f۲۸۴a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f۲۸۵b;

        C۰۰۱۱b(char type, float[] params) {
            this.f۲۸۴a = type;
            this.f۲۸۵b = params;
        }

        C۰۰۱۱b(C۰۰۱۱b n) {
            this.f۲۸۴a = n.f۲۸۴a;
            float[] fArr = n.f۲۸۵b;
            this.f۲۸۵b = b.a(fArr, 0, fArr.length);
        }

        public static void a(C۰۰۱۱b[] node, Path path) {
            float[] current = new float[6];
            char previousCommand = 'm';
            for (int i = 0; i < node.length; i++) {
                a(path, current, previousCommand, node[i].f۲۸۴a, node[i].f۲۸۵b);
                previousCommand = node[i].f۲۸۴a;
            }
        }

        public void a(C۰۰۱۱b nodeFrom, C۰۰۱۱b nodeTo, float fraction) {
            int i = 0;
            while (true) {
                float[] fArr = nodeFrom.f۲۸۵b;
                if (i < fArr.length) {
                    this.f۲۸۵b[i] = (fArr[i] * (1.0f - fraction)) + (nodeTo.f۲۸۵b[i] * fraction);
                    i++;
                } else {
                    return;
                }
            }
        }

        private static void a(Path path, float[] current, char previousCmd, char cmd, float[] val) {
            int incr;
            int k;
            float reflectiveCtrlPointY;
            float reflectiveCtrlPointX;
            float reflectiveCtrlPointY2;
            float reflectiveCtrlPointX2;
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
                    a(path, currentX2, currentY2, val[k + 5], val[k + 6], val[k + 0], val[k + 1], val[k + 2], val[k + 3] != 0.0f, val[k + 4] != 0.0f);
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
                    k = k2;
                    a(path, currentX2, currentY2, val[k2 + 5] + currentX2, val[k2 + 6] + currentY2, val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3] != 0.0f, val[k2 + 4] != 0.0f);
                    currentX2 += val[k + 5];
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
                    if (previousCmd2 == 'c' || previousCmd2 == 's' || previousCmd2 == 'C' || previousCmd2 == 'S') {
                        reflectiveCtrlPointX = (currentX2 * 2.0f) - ctrlPointX2;
                        reflectiveCtrlPointY = (2.0f * currentY2) - ctrlPointY2;
                    } else {
                        reflectiveCtrlPointX = currentX2;
                        reflectiveCtrlPointY = currentY2;
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
                    float reflectiveCtrlPointX3 = currentX2;
                    float reflectiveCtrlPointY3 = currentY2;
                    if (previousCmd2 == 'q' || previousCmd2 == 't' || previousCmd2 == 'Q' || previousCmd2 == 'T') {
                        reflectiveCtrlPointX3 = (currentX2 * 2.0f) - ctrlPointX2;
                        reflectiveCtrlPointY3 = (2.0f * currentY2) - ctrlPointY2;
                    }
                    path.quadTo(reflectiveCtrlPointX3, reflectiveCtrlPointY3, val[k2 + 0], val[k2 + 1]);
                    currentX2 = val[k2 + 0];
                    currentY2 = val[k2 + 1];
                    ctrlPointX2 = reflectiveCtrlPointX3;
                    ctrlPointY2 = reflectiveCtrlPointY3;
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
                    if (previousCmd2 == 'c' || previousCmd2 == 's' || previousCmd2 == 'C' || previousCmd2 == 'S') {
                        reflectiveCtrlPointX2 = currentX2 - ctrlPointX2;
                        reflectiveCtrlPointY2 = currentY2 - ctrlPointY2;
                    } else {
                        reflectiveCtrlPointX2 = 0.0f;
                        reflectiveCtrlPointY2 = 0.0f;
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
                    float reflectiveCtrlPointX4 = 0.0f;
                    float reflectiveCtrlPointY4 = 0.0f;
                    if (previousCmd2 == 'q' || previousCmd2 == 't' || previousCmd2 == 'Q' || previousCmd2 == 'T') {
                        reflectiveCtrlPointX4 = currentX2 - ctrlPointX2;
                        reflectiveCtrlPointY4 = currentY2 - ctrlPointY2;
                    }
                    path.rQuadTo(reflectiveCtrlPointX4, reflectiveCtrlPointY4, val[k2 + 0], val[k2 + 1]);
                    float ctrlPointX8 = currentX2 + reflectiveCtrlPointX4;
                    float ctrlPointY8 = currentY2 + reflectiveCtrlPointY4;
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

        private static void a(Path p, float x0, float y0, float x1, float y1, float a2, float b2, float theta, boolean isMoreThanHalf, boolean isPositiveArc) {
            double cy;
            double cx;
            double thetaD = Math.toRadians((double) theta);
            double cosTheta = Math.cos(thetaD);
            double sinTheta = Math.sin(thetaD);
            double d2 = (double) x0;
            Double.isNaN(d2);
            double d3 = (double) y0;
            Double.isNaN(d3);
            double d4 = (d2 * cosTheta) + (d3 * sinTheta);
            double d5 = (double) a2;
            Double.isNaN(d5);
            double x0p = d4 / d5;
            double d6 = (double) (-x0);
            Double.isNaN(d6);
            double d7 = (double) y0;
            Double.isNaN(d7);
            double d8 = (d6 * sinTheta) + (d7 * cosTheta);
            double d9 = (double) b2;
            Double.isNaN(d9);
            double y0p = d8 / d9;
            double d10 = (double) x1;
            Double.isNaN(d10);
            double d11 = (double) y1;
            Double.isNaN(d11);
            double d12 = (d10 * cosTheta) + (d11 * sinTheta);
            double d13 = (double) a2;
            Double.isNaN(d13);
            double x1p = d12 / d13;
            double d14 = (double) (-x1);
            Double.isNaN(d14);
            double d15 = (double) y1;
            Double.isNaN(d15);
            double d16 = (d14 * sinTheta) + (d15 * cosTheta);
            double d17 = (double) b2;
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
                a(p, x0, y0, x1, y1, a2 * adjust, b2 * adjust, theta, isMoreThanHalf, isPositiveArc);
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
            double eta1 = (double) a2;
            Double.isNaN(eta1);
            double cx2 = cx * eta1;
            double d18 = (double) b2;
            Double.isNaN(d18);
            double cy2 = d18 * cy;
            a(p, (cx2 * cosTheta) - (cy2 * sinTheta), (cx2 * sinTheta) + (cy2 * cosTheta), (double) a2, (double) b2, (double) x0, (double) y0, thetaD, eta0, sweep);
        }

        /* JADX INFO: Multiple debug info for r2v12 double: [D('e2x' double), D('anglePerSegment' double)] */
        /* JADX INFO: Multiple debug info for r11v2 double: [D('cosEta1' double), D('e2y' double)] */
        /* JADX INFO: Multiple debug info for r6v2 double: [D('q1y' double), D('numSegments' int)] */
        /* JADX INFO: Multiple debug info for r4v10 double: [D('ep2y' double), D('q2y' double)] */
        private static void a(Path p, double cx, double cy, double a2, double b2, double e1x, double e1y, double theta, double start, double sweep) {
            double d2 = a2;
            int numSegments = (int) Math.ceil(Math.abs((sweep * 4.0d) / 3.141592653589793d));
            double cosTheta = Math.cos(theta);
            double sinTheta = Math.sin(theta);
            double cosEta1 = Math.cos(start);
            double sinEta1 = Math.sin(start);
            double ep1y = (double) numSegments;
            Double.isNaN(ep1y);
            double anglePerSegment = sweep / ep1y;
            double ep1x = (((-d2) * cosTheta) * sinEta1) - ((b2 * sinTheta) * cosEta1);
            double ep1y2 = ((-d2) * sinTheta * sinEta1) + (b2 * cosTheta * cosEta1);
            double e1x2 = e1x;
            double e1y2 = e1y;
            int i = 0;
            double eta1 = start;
            while (i < numSegments) {
                double eta2 = eta1 + anglePerSegment;
                double sinEta2 = Math.sin(eta2);
                double cosEta2 = Math.cos(eta2);
                double anglePerSegment2 = (cx + ((d2 * cosTheta) * cosEta2)) - ((b2 * sinTheta) * sinEta2);
                double e2y = cy + (d2 * sinTheta * cosEta2) + (b2 * cosTheta * sinEta2);
                double ep2x = (((-d2) * cosTheta) * sinEta2) - ((b2 * sinTheta) * cosEta2);
                double ep2y = ((-d2) * sinTheta * sinEta2) + (b2 * cosTheta * cosEta2);
                double tanDiff2 = Math.tan((eta2 - eta1) / 2.0d);
                double alpha = (Math.sin(eta2 - eta1) * (Math.sqrt(((tanDiff2 * 3.0d) * tanDiff2) + 4.0d) - 1.0d)) / 3.0d;
                p.rLineTo(0.0f, 0.0f);
                p.cubicTo((float) (e1x2 + (alpha * ep1x)), (float) (e1y2 + (alpha * ep1y2)), (float) (anglePerSegment2 - (alpha * ep2x)), (float) (e2y - (alpha * ep2y)), (float) anglePerSegment2, (float) e2y);
                eta1 = eta2;
                e1x2 = anglePerSegment2;
                e1y2 = e2y;
                ep1x = ep2x;
                ep1y2 = ep2y;
                i++;
                d2 = a2;
                numSegments = numSegments;
                sinEta1 = sinEta1;
                anglePerSegment = anglePerSegment;
                cosEta1 = cosEta1;
                cosTheta = cosTheta;
                sinTheta = sinTheta;
            }
        }
    }
}
