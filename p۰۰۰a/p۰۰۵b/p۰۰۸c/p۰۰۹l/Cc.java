package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l;

import android.animation.TypeEvaluator;

/* renamed from: a.b.c.l.c  reason: invalid class name */
public class Cc implements TypeEvaluator<Integer> {

    /* renamed from: a  reason: contains not printable characters */
    private static final Cc f۸۲۵۶a = new Cc();

    /* renamed from: a  reason: contains not printable characters */
    public static Cc m۹۹۴۶a() {
        return f۸۲۵۶a;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Integer evaluate(float fraction, Integer startValue, Integer endValue) {
        int startInt = startValue.intValue();
        float startA = ((float) ((startInt >> 24) & 255)) / 255.0f;
        int endInt = endValue.intValue();
        float startR = (float) Math.pow((double) (((float) ((startInt >> 16) & 255)) / 255.0f), 2.2d);
        float startG = (float) Math.pow((double) (((float) ((startInt >> 8) & 255)) / 255.0f), 2.2d);
        float startB = (float) Math.pow((double) (((float) (startInt & 255)) / 255.0f), 2.2d);
        return Integer.valueOf((Math.round(((((((float) ((endInt >> 24) & 255)) / 255.0f) - startA) * fraction) + startA) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (((((float) Math.pow((double) (((float) ((endInt >> 16) & 255)) / 255.0f), 2.2d)) - startR) * fraction) + startR), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow((double) (((((float) Math.pow((double) (((float) ((endInt >> 8) & 255)) / 255.0f), 2.2d)) - startG) * fraction) + startG), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) (((((float) Math.pow((double) (((float) (endInt & 255)) / 255.0f), 2.2d)) - startB) * fraction) + startB), 0.45454545454545453d)) * 255.0f));
    }
}
