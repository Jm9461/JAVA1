package b.d.a;

import android.opengl.GLES20;

abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f۲۴۳۳a;

    /* renamed from: b  reason: collision with root package name */
    private final int f۲۴۳۴b = GLES20.glCreateProgram();

    public g(float[] color) {
        this.f۲۴۳۳a = color;
        int vertexShader = f.a(35633, "attribute vec4 vPosition;void main() {  gl_Position = vPosition;}");
        int fragmentShader = f.a(35632, "precision mediump float;uniform vec4 vColor;void main() {  gl_FragColor = vColor;}");
        GLES20.glAttachShader(this.f۲۴۳۴b, vertexShader);
        GLES20.glAttachShader(this.f۲۴۳۴b, fragmentShader);
        GLES20.glLinkProgram(this.f۲۴۳۴b);
    }

    /* access modifiers changed from: protected */
    public float[] a() {
        return this.f۲۴۳۳a;
    }

    /* access modifiers changed from: protected */
    public int b() {
        return this.f۲۴۳۴b;
    }
}
