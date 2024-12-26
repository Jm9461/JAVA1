package b.d.a;

import b.d.a.c;
import com.cleveroad.audiovisualization.GLBubble;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final c.e f۲۴۴۱a;

    /* renamed from: b  reason: collision with root package name */
    private final h[] f۲۴۴۲b;

    /* renamed from: c  reason: collision with root package name */
    private final e f۲۴۴۳c;

    /* renamed from: d  reason: collision with root package name */
    private final Random f۲۴۴۴d;

    /* renamed from: e  reason: collision with root package name */
    private final float f۲۴۴۵e;

    /* renamed from: f  reason: collision with root package name */
    private final float f۲۴۴۶f;

    /* renamed from: g  reason: collision with root package name */
    private float f۲۴۴۷g;

    /* renamed from: h  reason: collision with root package name */
    private final Set<d> f۲۴۴۸h;
    private final Queue<d> i;
    private final Set<d> j;
    private boolean k;
    private final d[] l;

    public i(c.e configuration, float[] color, float fromY, float toY, Random random) {
        this.f۲۴۴۱a = configuration;
        this.f۲۴۴۴d = random;
        this.f۲۴۴۲b = new h[configuration.f۲۴۰۹a];
        float f2 = configuration.f۲۴۱۴f;
        float footerToY = fromY + ((f2 / ((configuration.f۲۴۱۳e * 2.0f) + f2)) * (toY - fromY));
        this.f۲۴۴۳c = new e(color, -1.0f, 1.0f, fromY, footerToY);
        int i2 = configuration.f۲۴۰۹a;
        float[] points = a(this.f۲۴۴۴d, i2, 2.0f / ((float) i2), 0.15f);
        this.f۲۴۴۵e = footerToY;
        this.f۲۴۴۶f = toY;
        for (int i3 = 0; i3 < configuration.f۲۴۰۹a; i3++) {
            this.f۲۴۴۲b[i3] = new h(color, points[i3], points[i3 + 1], footerToY, toY, i3 % 2 == 0 ? (byte) 0 : 1, random);
        }
        this.f۲۴۴۸h = Collections.newSetFromMap(new ConcurrentHashMap());
        this.j = Collections.newSetFromMap(new ConcurrentHashMap());
        this.i = new LinkedList();
        this.l = a(color, configuration.f۲۴۱۱c);
        Collections.addAll(this.i, this.l);
    }

    private static float[] a(Random random, int wavesCount, float width, float shiftCoef) {
        float[] points = new float[(wavesCount + 1)];
        for (int i2 = 0; i2 < points.length; i2++) {
            if (i2 == 0) {
                points[i2] = -1.0f;
            } else {
                float f2 = 1.0f;
                if (i2 == points.length - 1) {
                    points[i2] = 1.0f;
                } else {
                    float shift = random.nextFloat() * shiftCoef * width;
                    if (!random.nextBoolean()) {
                        f2 = -1.0f;
                    }
                    points[i2] = ((((float) i2) * width) - 4.0f) + (shift * f2);
                }
            }
        }
        return points;
    }

    public void a(long dt, float dAngle, float ratioY) {
        float d2 = ((float) dt) * dAngle;
        this.k = true;
        h[] hVarArr = this.f۲۴۴۲b;
        for (h wave : hVarArr) {
            wave.b(d2);
            this.k &= wave.d();
        }
        this.f۲۴۴۸h.addAll(this.j);
        this.j.clear();
        Iterator<GLBubble> iterator = this.f۲۴۴۸h.iterator();
        while (iterator.hasNext()) {
            d bubble = (d) iterator.next();
            bubble.a(dt, ratioY);
            if (bubble.d()) {
                this.i.add(bubble);
                iterator.remove();
            }
        }
    }

    public boolean b() {
        return this.k;
    }

    public void a() {
        for (h wave : this.f۲۴۴۲b) {
            wave.c();
        }
        this.f۲۴۴۳c.c();
        for (d bubble : this.f۲۴۴۸h) {
            bubble.c();
        }
    }

    public void a(float heightCoefficient, float amplitude) {
        for (h wave : this.f۲۴۴۲b) {
            wave.a(l.a(heightCoefficient, this.f۲۴۴۴d));
        }
        float f2 = this.f۲۴۴۷g;
        if (amplitude > f2) {
            this.f۲۴۴۷g = amplitude;
            if (heightCoefficient > 0.25f) {
                c();
                return;
            }
            return;
        }
        this.f۲۴۴۷g = l.c(f2, amplitude, 0.8f);
    }

    private void c() {
        int bubblesCount = this.f۲۴۴۴d.nextInt(3);
        for (int i2 = 0; i2 < bubblesCount; i2++) {
            d bubble = this.i.poll();
            if (bubble != null) {
                float shift = this.f۲۴۴۴d.nextFloat() * 0.1f * ((float) (this.f۲۴۴۴d.nextBoolean() ? 1 : -1));
                c.e eVar = this.f۲۴۴۱a;
                float size = eVar.f۲۴۱۲d;
                if (eVar.f۲۴۱۵g) {
                    size *= (this.f۲۴۴۴d.nextFloat() * 0.8f) + 0.5f;
                }
                bubble.a((this.f۲۴۴۴d.nextFloat() * 2.0f) - 4.0f, this.f۲۴۴۵e + shift, this.f۲۴۴۶f, size);
                this.j.add(bubble);
            }
        }
    }

    private d[] a(float[] color, int count) {
        d[] bubbles = new d[count];
        for (int i2 = 0; i2 < count; i2++) {
            c.e eVar = this.f۲۴۴۱a;
            float size = eVar.f۲۴۱۲d;
            if (eVar.f۲۴۱۵g) {
                size *= (this.f۲۴۴۴d.nextFloat() * 0.8f) + 0.5f;
            }
            float shift = this.f۲۴۴۴d.nextFloat() * 0.1f * ((float) (this.f۲۴۴۴d.nextBoolean() ? 1 : -1));
            float[] col = new float[color.length];
            System.arraycopy(color, 0, col, 0, col.length);
            bubbles[i2] = new d(col, (this.f۲۴۴۴d.nextFloat() * 2.0f) - 4.0f, this.f۲۴۴۵e + shift, this.f۲۴۴۶f, size, this.f۲۴۴۴d);
        }
        return bubbles;
    }
}
