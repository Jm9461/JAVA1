package p۰۵۲b.p۰۶۴d.p۰۶۵a;

import android.content.Context;
import android.opengl.GLES20;
import java.util.Random;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p۰۵۲b.p۰۶۴d.p۰۶۵a.AbstractCj;
import p۰۵۲b.p۰۶۴d.p۰۶۵a.Cc;

/* renamed from: b.d.a.f  reason: invalid class name */
class Cf implements Cc.AbstractCb {

    /* renamed from: a  reason: contains not printable characters */
    private final Cc.Ce f۱۲۶۵۱a;

    /* renamed from: b  reason: contains not printable characters */
    private Ci[] f۱۲۶۵۲b;

    /* renamed from: c  reason: contains not printable characters */
    private long f۱۲۶۵۳c;

    /* renamed from: d  reason: contains not printable characters */
    private final float f۱۲۶۵۴d;

    /* renamed from: e  reason: contains not printable characters */
    private final Random f۱۲۶۵۵e;

    /* renamed from: f  reason: contains not printable characters */
    private float f۱۲۶۵۶f = 1.0f;

    /* renamed from: g  reason: contains not printable characters */
    private AbstractCj.AbstractCa f۱۲۶۵۷g;

    /* renamed from: h  reason: contains not printable characters */
    boolean f۱۲۶۵۸h;

    public Cf(Context context, Cc.Ce configuration) {
        this.f۱۲۶۵۱a = configuration;
        this.f۱۲۶۵۵e = new Random();
        this.f۱۲۶۵۳c = System.currentTimeMillis();
        this.f۱۲۶۵۴d = (float) context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cf m۱۵۹۸۰a(AbstractCj.AbstractCa calmDownListener) {
        this.f۱۲۶۵۷g = calmDownListener;
        return this;
    }

    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        float[] backgroundColor = this.f۱۲۶۵۱a.f۱۲۶۳۷h;
        GLES20.glClearColor(backgroundColor[0], backgroundColor[1], backgroundColor[2], backgroundColor[3]);
        Cc.Ce eVar = this.f۱۲۶۵۱a;
        this.f۱۲۶۵۲b = new Ci[eVar.f۱۲۶۳۱b];
        float f = eVar.f۱۲۶۳۵f;
        float f2 = eVar.f۱۲۶۳۴e;
        float f3 = this.f۱۲۶۵۴d;
        float layerHeightPerc = (f + f2) / f3;
        float waveHeightPerc = (f2 / f3) * 2.0f;
        int i = 0;
        while (true) {
            Ci[] iVarArr = this.f۱۲۶۵۲b;
            if (i < iVarArr.length) {
                float fromY = -1.0f + (((float) ((iVarArr.length - i) - 1)) * waveHeightPerc * 2.0f);
                Cc.Ce eVar2 = this.f۱۲۶۵۱a;
                iVarArr[i] = new Ci(eVar2, eVar2.f۱۲۶۳۸i[i], fromY, (layerHeightPerc * 2.0f) + fromY, this.f۱۲۶۵۵e);
                i++;
            } else {
                return;
            }
        }
    }

    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0, 0, width, height);
        this.f۱۲۶۵۶f = ((float) width) / ((float) height);
    }

    public void onDrawFrame(GL10 gl) {
        AbstractCj.AbstractCa aVar;
        if (this.f۱۲۶۵۸h) {
            float[] backgroundColor = this.f۱۲۶۵۱a.f۱۲۶۳۷h;
            GLES20.glClearColor(backgroundColor[0], backgroundColor[1], backgroundColor[2], backgroundColor[3]);
            this.f۱۲۶۵۸h = false;
        } else {
            GLES20.glClear(16640);
        }
        long endTime = System.currentTimeMillis();
        long dt = endTime - this.f۱۲۶۵۳c;
        this.f۱۲۶۵۳c = endTime;
        Ci[] iVarArr = this.f۱۲۶۵۲b;
        boolean isCalmedDown = true;
        int i = 0;
        for (Ci layer : iVarArr) {
            layer.m۱۵۹۹۵a(dt, 0.015707964f * (1.0f - (((((float) i) * 1.0f) / ((float) this.f۱۲۶۵۲b.length)) * 0.8f)), this.f۱۲۶۵۶f);
            isCalmedDown &= layer.m۱۵۹۹۶b();
            i++;
        }
        for (Ci layer2 : this.f۱۲۶۵۲b) {
            layer2.m۱۵۹۹۳a();
        }
        if (isCalmedDown && (aVar = this.f۱۲۶۵۷g) != null) {
            aVar.m۱۶۰۰۱a();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۵۹۸۱a(float[] dBmArray, float[] ampsArray) {
        if (this.f۱۲۶۵۲b != null) {
            int i = 0;
            while (true) {
                Ci[] iVarArr = this.f۱۲۶۵۲b;
                if (i < iVarArr.length && iVarArr[i] != null) {
                    iVarArr[i].m۱۵۹۹۴a(dBmArray[i], ampsArray[i]);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۵۹۷۹a(int type, String shaderCode) {
        int shader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);
        return shader;
    }
}
