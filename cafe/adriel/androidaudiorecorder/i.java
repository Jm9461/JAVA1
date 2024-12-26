package cafe.adriel.androidaudiorecorder;

import b.d.a.b;

public class i extends b<Float> {
    /* access modifiers changed from: protected */
    public void a(Float amplitude, int layersCount, float[] dBmArray, float[] ampsArray) {
        Float amplitude2 = Float.valueOf(amplitude.floatValue() / 100.0f);
        if (((double) amplitude2.floatValue()) <= 0.5d) {
            amplitude2 = Float.valueOf(0.0f);
        } else if (((double) amplitude2.floatValue()) > 0.5d && ((double) amplitude2.floatValue()) <= 0.6d) {
            amplitude2 = Float.valueOf(0.2f);
        } else if (((double) amplitude2.floatValue()) > 0.6d && ((double) amplitude2.floatValue()) <= 0.7d) {
            amplitude2 = Float.valueOf(0.6f);
        } else if (((double) amplitude2.floatValue()) > 0.7d) {
            amplitude2 = Float.valueOf(1.0f);
        }
        try {
            dBmArray[0] = amplitude2.floatValue();
            ampsArray[0] = amplitude2.floatValue();
        } catch (Exception e2) {
        }
    }

    public void g() {
        try {
            a();
        } catch (Exception e2) {
        }
    }
}
