package p۲۰۸b.p۲۲۰d.p۲۲۱a;

import android.content.Context;
import android.opengl.GLES20;
import java.util.Random;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p۲۰۸b.p۲۲۰d.p۲۲۱a.Cc;
import p۲۰۸b.p۲۲۰d.p۲۲۱a.InterfaceCj;

/* renamed from: b.d.a.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cf implements Cc.b {

    /* renamed from: a, reason: contains not printable characters */
    private final Cc.e f۱۲۶۵۱a;

    /* renamed from: b, reason: contains not printable characters */
    private Ci[] f۱۲۶۵۲b;

    /* renamed from: d, reason: contains not printable characters */
    private final float f۱۲۶۵۴d;

    /* renamed from: g, reason: contains not printable characters */
    private InterfaceCj.a f۱۲۶۵۷g;

    /* renamed from: h, reason: contains not printable characters */
    boolean f۱۲۶۵۸h;

    /* renamed from: f, reason: contains not printable characters */
    private float f۱۲۶۵۶f = 1.0f;

    /* renamed from: e, reason: contains not printable characters */
    private final Random f۱۲۶۵۵e = new Random();

    /* renamed from: c, reason: contains not printable characters */
    private long f۱۲۶۵۳c = System.currentTimeMillis();

    public Cf(Context context, Cc.e configuration) {
        this.f۱۲۶۵۱a = configuration;
        this.f۱۲۶۵۴d = context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cf m۱۳۹۱۰a(InterfaceCj.a calmDownListener) {
        this.f۱۲۶۵۷g = calmDownListener;
        return this;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        float[] backgroundColor = this.f۱۲۶۵۱a.f۱۲۶۳۷h;
        GLES20.glClearColor(backgroundColor[0], backgroundColor[1], backgroundColor[2], backgroundColor[3]);
        Cc.e eVar = this.f۱۲۶۵۱a;
        this.f۱۲۶۵۲b = new Ci[eVar.f۱۲۶۳۱b];
        float f2 = eVar.f۱۲۶۳۵f;
        float f3 = eVar.f۱۲۶۳۴e;
        float f4 = this.f۱۲۶۵۴d;
        float layerHeightPerc = (f2 + f3) / f4;
        float waveHeightPerc = (f3 / f4) * 2.0f;
        int i = 0;
        while (true) {
            Ci[] ciArr = this.f۱۲۶۵۲b;
            if (i < ciArr.length) {
                int reverseI = (ciArr.length - i) - 1;
                float fromY = (-1.0f) + (reverseI * waveHeightPerc * 2.0f);
                float toY = (layerHeightPerc * 2.0f) + fromY;
                Cc.e eVar2 = this.f۱۲۶۵۱a;
                ciArr[i] = new Ci(eVar2, eVar2.f۱۲۶۳۸i[i], fromY, toY, this.f۱۲۶۵۵e);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0, 0, width, height);
        this.f۱۲۶۵۶f = width / height;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl) {
        InterfaceCj.a aVar;
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
        boolean isCalmedDown = true;
        int i = 0;
        for (Ci layer : this.f۱۲۶۵۲b) {
            float speedCoef = 1.0f - (((i * 1.0f) / this.f۱۲۶۵۲b.length) * 0.8f);
            layer.m۱۳۹۲۵a(dt, 0.015707964f * speedCoef, this.f۱۲۶۵۶f);
            isCalmedDown &= layer.m۱۳۹۲۶b();
            i++;
        }
        for (Ci ci : this.f۱۲۶۵۲b) {
            ci.m۱۳۹۲۳a();
        }
        if (isCalmedDown && (aVar = this.f۱۲۶۵۷g) != null) {
            aVar.mo۱۳۹۳۱a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public final void m۱۳۹۱۱a(float[] dBmArray, float[] ampsArray) {
        if (this.f۱۲۶۵۲b == null) {
            return;
        }
        int i = 0;
        while (true) {
            Ci[] ciArr = this.f۱۲۶۵۲b;
            if (i >= ciArr.length || ciArr[i] == null) {
                return;
            }
            ciArr[i].m۱۳۹۲۴a(dBmArray[i], ampsArray[i]);
            i++;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۳۹۰۹a(int type, String shaderCode) {
        int shader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);
        return shader;
    }
}
