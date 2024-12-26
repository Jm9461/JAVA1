package p۰۵۲b.p۰۶۴d.p۰۶۵a;

import com.cleveroad.audiovisualization.GLBubble;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p۰۵۲b.p۰۶۴d.p۰۶۵a.Cc;

/* access modifiers changed from: package-private */
/* renamed from: b.d.a.i  reason: invalid class name */
public class Ci {

    /* renamed from: a  reason: contains not printable characters */
    private final Cc.Ce f۱۲۶۷۵a;

    /* renamed from: b  reason: contains not printable characters */
    private final Ch[] f۱۲۶۷۶b;

    /* renamed from: c  reason: contains not printable characters */
    private final Ce f۱۲۶۷۷c;

    /* renamed from: d  reason: contains not printable characters */
    private final Random f۱۲۶۷۸d;

    /* renamed from: e  reason: contains not printable characters */
    private final float f۱۲۶۷۹e;

    /* renamed from: f  reason: contains not printable characters */
    private final float f۱۲۶۸۰f;

    /* renamed from: g  reason: contains not printable characters */
    private float f۱۲۶۸۱g;

    /* renamed from: h  reason: contains not printable characters */
    private final Set<Cd> f۱۲۶۸۲h;

    /* renamed from: i  reason: contains not printable characters */
    private final Queue<Cd> f۱۲۶۸۳i;

    /* renamed from: j  reason: contains not printable characters */
    private final Set<Cd> f۱۲۶۸۴j;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۱۲۶۸۵k;

    /* renamed from: l  reason: contains not printable characters */
    private final Cd[] f۱۲۶۸۶l;

    public Ci(Cc.Ce configuration, float[] color, float fromY, float toY, Random random) {
        this.f۱۲۶۷۵a = configuration;
        this.f۱۲۶۷۸d = random;
        this.f۱۲۶۷۶b = new Ch[configuration.f۱۲۶۳۰a];
        float f = configuration.f۱۲۶۳۵f;
        float footerToY = fromY + ((f / ((configuration.f۱۲۶۳۴e * 2.0f) + f)) * (toY - fromY));
        this.f۱۲۶۷۷c = new Ce(color, -1.0f, 1.0f, fromY, footerToY);
        int i = configuration.f۱۲۶۳۰a;
        float[] points = m۱۵۹۹۰a(this.f۱۲۶۷۸d, i, 2.0f / ((float) i), 0.15f);
        this.f۱۲۶۷۹e = footerToY;
        this.f۱۲۶۸۰f = toY;
        for (int i2 = 0; i2 < configuration.f۱۲۶۳۰a; i2++) {
            this.f۱۲۶۷۶b[i2] = new Ch(color, points[i2], points[i2 + 1], footerToY, toY, i2 % 2 == 0 ? (byte) 0 : 1, random);
        }
        this.f۱۲۶۸۲h = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f۱۲۶۸۴j = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f۱۲۶۸۳i = new LinkedList();
        this.f۱۲۶۸۶l = m۱۵۹۹۱a(color, configuration.f۱۲۶۳۲c);
        Collections.addAll(this.f۱۲۶۸۳i, this.f۱۲۶۸۶l);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static float[] m۱۵۹۹۰a(Random random, int wavesCount, float width, float shiftCoef) {
        float[] points = new float[(wavesCount + 1)];
        for (int i = 0; i < points.length; i++) {
            if (i == 0) {
                points[i] = -1.0f;
            } else {
                float f = 1.0f;
                if (i == points.length - 1) {
                    points[i] = 1.0f;
                } else {
                    float shift = random.nextFloat() * shiftCoef * width;
                    if (!random.nextBoolean()) {
                        f = -1.0f;
                    }
                    points[i] = ((((float) i) * width) - 4.0f) + (shift * f);
                }
            }
        }
        return points;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۹۹۵a(long dt, float dAngle, float ratioY) {
        float d = ((float) dt) * dAngle;
        this.f۱۲۶۸۵k = true;
        Ch[] hVarArr = this.f۱۲۶۷۶b;
        for (Ch wave : hVarArr) {
            wave.m۱۵۹۸۷b(d);
            this.f۱۲۶۸۵k &= wave.m۱۵۹۸۹d();
        }
        this.f۱۲۶۸۲h.addAll(this.f۱۲۶۸۴j);
        this.f۱۲۶۸۴j.clear();
        Iterator<GLBubble> iterator = this.f۱۲۶۸۲h.iterator();
        while (iterator.hasNext()) {
            Cd bubble = (Cd) iterator.next();
            bubble.m۱۵۹۷۵a(dt, ratioY);
            if (bubble.m۱۵۹۷۷d()) {
                this.f۱۲۶۸۳i.add(bubble);
                iterator.remove();
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۵۹۹۶b() {
        return this.f۱۲۶۸۵k;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۹۹۳a() {
        for (Ch wave : this.f۱۲۶۷۶b) {
            wave.m۱۵۹۸۸c();
        }
        this.f۱۲۶۷۷c.m۱۵۹۷۸c();
        for (Cd bubble : this.f۱۲۶۸۲h) {
            bubble.m۱۵۹۷۶c();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۹۹۴a(float heightCoefficient, float amplitude) {
        for (Ch wave : this.f۱۲۶۷۶b) {
            wave.m۱۵۹۸۶a(Cl.m۱۶۰۰۶a(heightCoefficient, this.f۱۲۶۷۸d));
        }
        float f = this.f۱۲۶۸۱g;
        if (amplitude > f) {
            this.f۱۲۶۸۱g = amplitude;
            if (heightCoefficient > 0.25f) {
                m۱۵۹۹۲c();
                return;
            }
            return;
        }
        this.f۱۲۶۸۱g = Cl.m۱۶۰۱۱c(f, amplitude, 0.8f);
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۵۹۹۲c() {
        int bubblesCount = this.f۱۲۶۷۸d.nextInt(3);
        for (int i = 0; i < bubblesCount; i++) {
            Cd bubble = this.f۱۲۶۸۳i.poll();
            if (bubble != null) {
                float shift = this.f۱۲۶۷۸d.nextFloat() * 0.1f * ((float) (this.f۱۲۶۷۸d.nextBoolean() ? 1 : -1));
                Cc.Ce eVar = this.f۱۲۶۷۵a;
                float size = eVar.f۱۲۶۳۳d;
                if (eVar.f۱۲۶۳۶g) {
                    size *= (this.f۱۲۶۷۸d.nextFloat() * 0.8f) + 0.5f;
                }
                bubble.m۱۵۹۷۴a((this.f۱۲۶۷۸d.nextFloat() * 2.0f) - 4.0f, this.f۱۲۶۷۹e + shift, this.f۱۲۶۸۰f, size);
                this.f۱۲۶۸۴j.add(bubble);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private Cd[] m۱۵۹۹۱a(float[] color, int count) {
        Cd[] bubbles = new Cd[count];
        for (int i = 0; i < count; i++) {
            Cc.Ce eVar = this.f۱۲۶۷۵a;
            float size = eVar.f۱۲۶۳۳d;
            if (eVar.f۱۲۶۳۶g) {
                size *= (this.f۱۲۶۷۸d.nextFloat() * 0.8f) + 0.5f;
            }
            float shift = this.f۱۲۶۷۸d.nextFloat() * 0.1f * ((float) (this.f۱۲۶۷۸d.nextBoolean() ? 1 : -1));
            float[] col = new float[color.length];
            System.arraycopy(color, 0, col, 0, col.length);
            bubbles[i] = new Cd(col, (this.f۱۲۶۷۸d.nextFloat() * 2.0f) - 4.0f, this.f۱۲۶۷۹e + shift, this.f۱۲۶۸۰f, size, this.f۱۲۶۷۸d);
        }
        return bubbles;
    }
}
