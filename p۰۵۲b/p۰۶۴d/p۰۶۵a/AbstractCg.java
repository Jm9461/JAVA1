package p۰۵۲b.p۰۶۴d.p۰۶۵a;

import android.opengl.GLES20;

/* renamed from: b.d.a.g  reason: invalid class name */
abstract class AbstractCg {

    /* renamed from: a  reason: contains not printable characters */
    private final float[] f۱۲۶۵۹a;

    /* renamed from: b  reason: contains not printable characters */
    private final int f۱۲۶۶۰b = GLES20.glCreateProgram();

    public AbstractCg(float[] color) {
        this.f۱۲۶۵۹a = color;
        int vertexShader = Cf.m۱۵۹۷۹a(35633, "attribute vec4 vPosition;void main() {  gl_Position = vPosition;}");
        int fragmentShader = Cf.m۱۵۹۷۹a(35632, "precision mediump float;uniform vec4 vColor;void main() {  gl_FragColor = vColor;}");
        GLES20.glAttachShader(this.f۱۲۶۶۰b, vertexShader);
        GLES20.glAttachShader(this.f۱۲۶۶۰b, fragmentShader);
        GLES20.glLinkProgram(this.f۱۲۶۶۰b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public float[] m۱۵۹۸۲a() {
        return this.f۱۲۶۵۹a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۵۹۸۳b() {
        return this.f۱۲۶۶۰b;
    }
}
