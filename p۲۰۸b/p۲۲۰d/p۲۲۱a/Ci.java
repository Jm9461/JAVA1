package p۲۰۸b.p۲۲۰d.p۲۲۱a;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p۲۰۸b.p۲۲۰d.p۲۲۱a.Cc;

/* renamed from: b.d.a.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ci {

    /* renamed from: a, reason: contains not printable characters */
    private final Cc.e f۱۲۶۷۵a;

    /* renamed from: b, reason: contains not printable characters */
    private final Ch[] f۱۲۶۷۶b;

    /* renamed from: c, reason: contains not printable characters */
    private final Ce f۱۲۶۷۷c;

    /* renamed from: d, reason: contains not printable characters */
    private final Random f۱۲۶۷۸d;

    /* renamed from: e, reason: contains not printable characters */
    private final float f۱۲۶۷۹e;

    /* renamed from: f, reason: contains not printable characters */
    private final float f۱۲۶۸۰f;

    /* renamed from: g, reason: contains not printable characters */
    private float f۱۲۶۸۱g;

    /* renamed from: h, reason: contains not printable characters */
    private final Set<Cd> f۱۲۶۸۲h;

    /* renamed from: i, reason: contains not printable characters */
    private final Queue<Cd> f۱۲۶۸۳i;

    /* renamed from: j, reason: contains not printable characters */
    private final Set<Cd> f۱۲۶۸۴j;

    /* renamed from: k, reason: contains not printable characters */
    private boolean f۱۲۶۸۵k;

    /* renamed from: l, reason: contains not printable characters */
    private final Cd[] f۱۲۶۸۶l;

    public Ci(Cc.e configuration, float[] color, float fromY, float toY, Random random) {
        this.f۱۲۶۷۵a = configuration;
        this.f۱۲۶۷۸d = random;
        this.f۱۲۶۷۶b = new Ch[configuration.f۱۲۶۳۰a];
        float f2 = configuration.f۱۲۶۳۵f;
        float footerToY = fromY + ((f2 / ((configuration.f۱۲۶۳۴e * 2.0f) + f2)) * (toY - fromY));
        this.f۱۲۶۷۷c = new Ce(color, -1.0f, 1.0f, fromY, footerToY);
        int i = configuration.f۱۲۶۳۰a;
        float waveWidth = 2.0f / i;
        float[] points = m۱۳۹۲۰a(this.f۱۲۶۷۸d, i, waveWidth, 0.15f);
        this.f۱۲۶۷۹e = footerToY;
        this.f۱۲۶۸۰f = toY;
        for (int i2 = 0; i2 < configuration.f۱۲۶۳۰a; i2++) {
            byte direction = i2 % 2 == 0 ? (byte) 0 : (byte) 1;
            this.f۱۲۶۷۶b[i2] = new Ch(color, points[i2], points[i2 + 1], footerToY, toY, direction, random);
        }
        this.f۱۲۶۸۲h = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f۱۲۶۸۴j = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f۱۲۶۸۳i = new LinkedList();
        this.f۱۲۶۸۶l = m۱۳۹۲۱a(color, configuration.f۱۲۶۳۲c);
        Collections.addAll(this.f۱۲۶۸۳i, this.f۱۲۶۸۶l);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static float[] m۱۳۹۲۰a(Random random, int wavesCount, float width, float shiftCoef) {
        float[] points = new float[wavesCount + 1];
        for (int i = 0; i < points.length; i++) {
            if (i == 0) {
                points[i] = -1.0f;
            } else if (i == points.length - 1) {
                points[i] = 1.0f;
            } else {
                float shift = random.nextFloat() * shiftCoef * width;
                points[i] = ((i * width) - 1.0f) + (shift * (random.nextBoolean() ? 1.0f : -1.0f));
            }
        }
        return points;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۹۲۵a(long dt, float dAngle, float ratioY) {
        float d2 = dt * dAngle;
        this.f۱۲۶۸۵k = true;
        for (Ch wave : this.f۱۲۶۷۶b) {
            wave.m۱۳۹۱۷b(d2);
            this.f۱۲۶۸۵k &= wave.m۱۳۹۱۹d();
        }
        this.f۱۲۶۸۲h.addAll(this.f۱۲۶۸۴j);
        this.f۱۲۶۸۴j.clear();
        Iterator<Cd> it = this.f۱۲۶۸۲h.iterator();
        while (it.hasNext()) {
            Cd bubble = it.next();
            bubble.m۱۳۹۰۵a(dt, ratioY);
            if (bubble.m۱۳۹۰۷d()) {
                this.f۱۲۶۸۳i.add(bubble);
                it.remove();
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۳۹۲۶b() {
        return this.f۱۲۶۸۵k;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۹۲۳a() {
        for (Ch wave : this.f۱۲۶۷۶b) {
            wave.m۱۳۹۱۸c();
        }
        this.f۱۲۶۷۷c.m۱۳۹۰۸c();
        for (Cd bubble : this.f۱۲۶۸۲h) {
            bubble.m۱۳۹۰۶c();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۹۲۴a(float heightCoefficient, float amplitude) {
        for (Ch wave : this.f۱۲۶۷۶b) {
            wave.m۱۳۹۱۶a(Cl.m۱۳۹۳۶a(heightCoefficient, this.f۱۲۶۷۸d));
        }
        float f2 = this.f۱۲۶۸۱g;
        if (amplitude > f2) {
            this.f۱۲۶۸۱g = amplitude;
            if (heightCoefficient > 0.25f) {
                m۱۳۹۲۲c();
                return;
            }
            return;
        }
        this.f۱۲۶۸۱g = Cl.m۱۳۹۴۱c(f2, amplitude, 0.8f);
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۳۹۲۲c() {
        int bubblesCount = this.f۱۲۶۷۸d.nextInt(3);
        for (int i = 0; i < bubblesCount; i++) {
            Cd bubble = this.f۱۲۶۸۳i.poll();
            if (bubble != null) {
                float shift = this.f۱۲۶۷۸d.nextFloat() * 0.1f * (this.f۱۲۶۷۸d.nextBoolean() ? 1 : -1);
                Cc.e eVar = this.f۱۲۶۷۵a;
                float size = eVar.f۱۲۶۳۳d;
                if (eVar.f۱۲۶۳۶g) {
                    size *= (this.f۱۲۶۷۸d.nextFloat() * 0.8f) + 0.5f;
                }
                bubble.m۱۳۹۰۴a((this.f۱۲۶۷۸d.nextFloat() * 2.0f) - 1.0f, this.f۱۲۶۷۹e + shift, this.f۱۲۶۸۰f, size);
                this.f۱۲۶۸۴j.add(bubble);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private Cd[] m۱۳۹۲۱a(float[] color, int count) {
        Cd[] bubbles = new Cd[count];
        for (int i = 0; i < count; i++) {
            Cc.e eVar = this.f۱۲۶۷۵a;
            float size = eVar.f۱۲۶۳۳d;
            if (eVar.f۱۲۶۳۶g) {
                size *= (this.f۱۲۶۷۸d.nextFloat() * 0.8f) + 0.5f;
            }
            float shift = this.f۱۲۶۷۸d.nextFloat() * 0.1f * (this.f۱۲۶۷۸d.nextBoolean() ? 1 : -1);
            float[] col = new float[color.length];
            System.arraycopy(color, 0, col, 0, col.length);
            bubbles[i] = new Cd(col, (this.f۱۲۶۷۸d.nextFloat() * 2.0f) - 1.0f, this.f۱۲۶۷۹e + shift, this.f۱۲۶۸۰f, size, this.f۱۲۶۷۸d);
        }
        return bubbles;
    }
}
