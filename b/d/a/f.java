package b.d.a;

import android.content.Context;
import android.opengl.GLES20;
import b.d.a.c;
import b.d.a.j;
import java.util.Random;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

class f implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final c.e f۲۴۲۵a;

    /* renamed from: b  reason: collision with root package name */
    private i[] f۲۴۲۶b;

    /* renamed from: c  reason: collision with root package name */
    private long f۲۴۲۷c;

    /* renamed from: d  reason: collision with root package name */
    private final float f۲۴۲۸d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f۲۴۲۹e;

    /* renamed from: f  reason: collision with root package name */
    private float f۲۴۳۰f = 1.0f;

    /* renamed from: g  reason: collision with root package name */
    private j.a f۲۴۳۱g;

    /* renamed from: h  reason: collision with root package name */
    boolean f۲۴۳۲h;

    public f(Context context, c.e configuration) {
        this.f۲۴۲۵a = configuration;
        this.f۲۴۲۹e = new Random();
        this.f۲۴۲۷c = System.currentTimeMillis();
        this.f۲۴۲۸d = (float) context.getResources().getDisplayMetrics().heightPixels;
    }

    public f a(j.a calmDownListener) {
        this.f۲۴۳۱g = calmDownListener;
        return this;
    }

    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        float[] backgroundColor = this.f۲۴۲۵a.f۲۴۱۶h;
        GLES20.glClearColor(backgroundColor[0], backgroundColor[1], backgroundColor[2], backgroundColor[3]);
        c.e eVar = this.f۲۴۲۵a;
        this.f۲۴۲۶b = new i[eVar.f۲۴۱۰b];
        float f2 = eVar.f۲۴۱۴f;
        float f3 = eVar.f۲۴۱۳e;
        float f4 = this.f۲۴۲۸d;
        float layerHeightPerc = (f2 + f3) / f4;
        float waveHeightPerc = (f3 / f4) * 2.0f;
        int i = 0;
        while (true) {
            i[] iVarArr = this.f۲۴۲۶b;
            if (i < iVarArr.length) {
                float fromY = -1.0f + (((float) ((iVarArr.length - i) - 1)) * waveHeightPerc * 2.0f);
                c.e eVar2 = this.f۲۴۲۵a;
                iVarArr[i] = new i(eVar2, eVar2.i[i], fromY, (layerHeightPerc * 2.0f) + fromY, this.f۲۴۲۹e);
                i++;
            } else {
                return;
            }
        }
    }

    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0, 0, width, height);
        this.f۲۴۳۰f = ((float) width) / ((float) height);
    }

    public void onDrawFrame(GL10 gl) {
        j.a aVar;
        if (this.f۲۴۳۲h) {
            float[] backgroundColor = this.f۲۴۲۵a.f۲۴۱۶h;
            GLES20.glClearColor(backgroundColor[0], backgroundColor[1], backgroundColor[2], backgroundColor[3]);
            this.f۲۴۳۲h = false;
        } else {
            GLES20.glClear(16640);
        }
        long endTime = System.currentTimeMillis();
        long dt = endTime - this.f۲۴۲۷c;
        this.f۲۴۲۷c = endTime;
        i[] iVarArr = this.f۲۴۲۶b;
        boolean isCalmedDown = true;
        int i = 0;
        for (i layer : iVarArr) {
            layer.a(dt, 0.015707964f * (1.0f - (((((float) i) * 1.0f) / ((float) this.f۲۴۲۶b.length)) * 0.8f)), this.f۲۴۳۰f);
            isCalmedDown &= layer.b();
            i++;
        }
        for (i layer2 : this.f۲۴۲۶b) {
            layer2.a();
        }
        if (isCalmedDown && (aVar = this.f۲۴۳۱g) != null) {
            aVar.a();
        }
    }

    public final void a(float[] dBmArray, float[] ampsArray) {
        if (this.f۲۴۲۶b != null) {
            int i = 0;
            while (true) {
                i[] iVarArr = this.f۲۴۲۶b;
                if (i < iVarArr.length && iVarArr[i] != null) {
                    iVarArr[i].a(dBmArray[i], ampsArray[i]);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static int a(int type, String shaderCode) {
        int shader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);
        return shader;
    }
}
