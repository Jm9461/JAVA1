package p۲۰۸b.p۲۲۰d.p۲۲۱a;

import android.opengl.GLES20;

/* renamed from: b.d.a.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
abstract class AbstractCg {

    /* renamed from: a, reason: contains not printable characters */
    private final float[] f۱۲۶۵۹a;

    /* renamed from: b, reason: contains not printable characters */
    private final int f۱۲۶۶۰b;

    public AbstractCg(float[] color) {
        this.f۱۲۶۵۹a = color;
        int vertexShader = Cf.m۱۳۹۰۹a(35633, "attribute vec4 vPosition;void main() {  gl_Position = vPosition;}");
        int fragmentShader = Cf.m۱۳۹۰۹a(35632, "precision mediump float;uniform vec4 vColor;void main() {  gl_FragColor = vColor;}");
        this.f۱۲۶۶۰b = GLES20.glCreateProgram();
        GLES20.glAttachShader(this.f۱۲۶۶۰b, vertexShader);
        GLES20.glAttachShader(this.f۱۲۶۶۰b, fragmentShader);
        GLES20.glLinkProgram(this.f۱۲۶۶۰b);
    }

    /* renamed from: a, reason: contains not printable characters */
    protected float[] m۱۳۹۱۲a() {
        return this.f۱۲۶۵۹a;
    }

    /* renamed from: b, reason: contains not printable characters */
    protected int m۱۳۹۱۳b() {
        return this.f۱۲۶۶۰b;
    }
}
