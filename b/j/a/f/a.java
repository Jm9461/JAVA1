package b.j.a.f;

import android.graphics.Color;

public class a {
    public static int a(int baseColor, float alphaPercent) {
        return (16777215 & baseColor) | (Math.round(((float) Color.alpha(baseColor)) * alphaPercent) << 24);
    }
}
