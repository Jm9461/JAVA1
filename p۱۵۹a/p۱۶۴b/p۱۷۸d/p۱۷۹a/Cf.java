package p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a;

import android.animation.TypeEvaluator;

/* renamed from: a.b.d.a.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cf implements TypeEvaluator {

    /* renamed from: a, reason: contains not printable characters */
    private static final Cf f۸۳۵۳a = new Cf();

    /* renamed from: a, reason: contains not printable characters */
    public static Cf m۷۹۹۵a() {
        return f۸۳۵۳a;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float fraction, Object startValue, Object endValue) {
        int startInt = ((Integer) startValue).intValue();
        float startA = ((startInt >> 24) & 255) / 255.0f;
        int endInt = ((Integer) endValue).intValue();
        float endA = ((endInt >> 24) & 255) / 255.0f;
        float endR = ((endInt >> 16) & 255) / 255.0f;
        float endG = ((endInt >> 8) & 255) / 255.0f;
        float endB = (endInt & 255) / 255.0f;
        float startR = (float) Math.pow(((startInt >> 16) & 255) / 255.0f, 2.2d);
        float startG = (float) Math.pow(((startInt >> 8) & 255) / 255.0f, 2.2d);
        float startB = (float) Math.pow((startInt & 255) / 255.0f, 2.2d);
        float endR2 = (float) Math.pow(endR, 2.2d);
        float a2 = ((endA - startA) * fraction) + startA;
        float r = ((endR2 - startR) * fraction) + startR;
        float g2 = ((((float) Math.pow(endG, 2.2d)) - startG) * fraction) + startG;
        float b2 = ((((float) Math.pow(endB, 2.2d)) - startB) * fraction) + startB;
        return Integer.valueOf((Math.round(a2 * 255.0f) << 24) | (Math.round(((float) Math.pow(r, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(g2, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(b2, 0.45454545454545453d)) * 255.0f));
    }
}
