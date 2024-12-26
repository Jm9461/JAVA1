package p۰۵۲b.p۰۶۴d.p۰۶۵a;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Random;

/* access modifiers changed from: package-private */
/* renamed from: b.d.a.h  reason: invalid class name */
public class Ch extends AbstractCg {

    /* renamed from: p  reason: contains not printable characters */
    private static final int f۱۲۶۶۱p = (((int) Math.ceil(2.5d)) * 3);

    /* renamed from: c  reason: contains not printable characters */
    private FloatBuffer f۱۲۶۶۲c;

    /* renamed from: d  reason: contains not printable characters */
    private ShortBuffer f۱۲۶۶۳d;

    /* renamed from: e  reason: contains not printable characters */
    private final Random f۱۲۶۶۴e;

    /* renamed from: f  reason: contains not printable characters */
    private final float f۱۲۶۶۵f;

    /* renamed from: g  reason: contains not printable characters */
    private final float f۱۲۶۶۶g;

    /* renamed from: h  reason: contains not printable characters */
    private final float f۱۲۶۶۷h;

    /* renamed from: i  reason: contains not printable characters */
    private final float f۱۲۶۶۸i;

    /* renamed from: j  reason: contains not printable characters */
    private float[] f۱۲۶۶۹j;

    /* renamed from: k  reason: contains not printable characters */
    private float f۱۲۶۷۰k;

    /* renamed from: l  reason: contains not printable characters */
    private float f۱۲۶۷۱l;

    /* renamed from: m  reason: contains not printable characters */
    private float f۱۲۶۷۲m;

    /* renamed from: n  reason: contains not printable characters */
    private float f۱۲۶۷۳n;

    /* renamed from: o  reason: contains not printable characters */
    float f۱۲۶۷۴o = 0.0f;

    public Ch(float[] color, float fromX, float toX, float fromY, float toY, byte direction, Random random) {
        super(color);
        float f = 0.0f;
        this.f۱۲۶۶۵f = fromX;
        this.f۱۲۶۶۶g = toX;
        this.f۱۲۶۶۷h = fromY;
        this.f۱۲۶۶۸i = toY;
        this.f۱۲۶۶۴e = random;
        this.f۱۲۶۷۰k = direction != 0 ? 3.1415927f : f;
        m۱۵۹۸۵f();
        m۱۵۹۸۴e();
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۵۹۸۴e() {
        short[] indices = new short[129];
        for (int i = 0; i < indices.length / 3; i++) {
            indices[i * 3] = 0;
            indices[(i * 3) + 1] = (short) (i + 1);
            indices[(i * 3) + 2] = (short) (i + 2);
        }
        ByteBuffer indicesByteBuffer = ByteBuffer.allocateDirect(indices.length * 2);
        indicesByteBuffer.order(ByteOrder.nativeOrder());
        this.f۱۲۶۶۳d = indicesByteBuffer.asShortBuffer();
        this.f۱۲۶۶۳d.put(indices);
        this.f۱۲۶۶۳d.position(0);
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۵۹۸۵f() {
        this.f۱۲۶۶۹j = new float[(45 * 3)];
        this.f۱۲۶۶۹j[0] = Cl.m۱۶۰۱۰b(0.0f, this.f۱۲۶۶۵f, this.f۱۲۶۶۶g);
        this.f۱۲۶۶۹j[1] = Cl.m۱۶۰۱۰b(-1.0f, this.f۱۲۶۶۷h, this.f۱۲۶۶۸i);
        this.f۱۲۶۶۹j[3] = Cl.m۱۶۰۱۰b(-1.0f, this.f۱۲۶۶۵f, this.f۱۲۶۶۶g);
        this.f۱۲۶۶۹j[4] = Cl.m۱۶۰۱۰b(-1.0f, this.f۱۲۶۶۷h, this.f۱۲۶۶۸i);
        float[] fArr = this.f۱۲۶۶۹j;
        fArr[6] = fArr[3];
        fArr[7] = Cl.m۱۶۰۱۰b(0.0f, this.f۱۲۶۶۷h, this.f۱۲۶۶۸i);
        float[] fArr2 = this.f۱۲۶۶۹j;
        fArr2[fArr2.length - 6] = Cl.m۱۶۰۱۰b(1.0f, this.f۱۲۶۶۵f, this.f۱۲۶۶۶g);
        float[] fArr3 = this.f۱۲۶۶۹j;
        fArr3[fArr3.length - 5] = fArr3[7];
        fArr3[fArr3.length - 3] = fArr3[fArr3.length - 6];
        fArr3[fArr3.length - 2] = fArr3[4];
    }

    /* JADX INFO: Multiple debug info for r1v1 float: [D('vertexByteBuffer' java.nio.ByteBuffer), D('angle' float)] */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۹۸۷b(float dAngle) {
        if (this.f۱۲۶۶۲c == null) {
            ByteBuffer vertexByteBuffer = ByteBuffer.allocateDirect(this.f۱۲۶۶۹j.length * 4);
            vertexByteBuffer.order(ByteOrder.nativeOrder());
            this.f۱۲۶۶۲c = vertexByteBuffer.asFloatBuffer();
            this.f۱۲۶۶۲c.put(this.f۱۲۶۶۹j);
            this.f۱۲۶۶۲c.position(0);
        }
        float angle = this.f۱۲۶۷۰k + dAngle;
        this.f۱۲۶۷۰k = angle;
        if (this.f۱۲۶۷۱l == 0.0f) {
            float f = this.f۱۲۶۷۲m;
            if (f > 0.0f) {
                this.f۱۲۶۷۱l = Cl.m۱۶۰۱۱c(0.0f, f, 0.35f);
            }
        }
        float val = ((float) Math.sin((double) angle)) * this.f۱۲۶۷۱l;
        if ((this.f۱۲۶۷۳n > 0.0f && val <= 0.0f) || (this.f۱۲۶۷۳n < 0.0f && val >= 0.0f)) {
            this.f۱۲۶۷۱l = Cl.m۱۶۰۱۱c(this.f۱۲۶۷۱l, this.f۱۲۶۷۲m, 0.35f);
            this.f۱۲۶۷۴o = this.f۱۲۶۶۴e.nextFloat() * 0.3f * ((float) (this.f۱۲۶۶۴e.nextBoolean() ? 1 : -1));
        }
        this.f۱۲۶۷۳n = val;
        int i = 0;
        float posX = Cl.m۱۶۰۱۰b(this.f۱۲۶۷۴o, this.f۱۲۶۶۵f, this.f۱۲۶۶۶g);
        float posY = Cl.m۱۶۰۱۰b(val, this.f۱۲۶۶۷h, this.f۱۲۶۶۸i);
        float time = 0.0f;
        while (((double) time) < 1.0d - (0.025d / 2.0d)) {
            float[] fArr = this.f۱۲۶۶۹j;
            int i2 = f۱۲۶۶۱p;
            fArr[(i * 3) + 1 + i2] = angle;
            this.f۱۲۶۶۲c.put((i * 3) + i2, Cl.m۱۶۰۰۴a(time, fArr[6], posX, fArr[fArr.length - 6]));
            FloatBuffer floatBuffer = this.f۱۲۶۶۲c;
            int i3 = (i * 3) + 1 + f۱۲۶۶۱p;
            float[] fArr2 = this.f۱۲۶۶۹j;
            floatBuffer.put(i3, Cl.m۱۶۰۰۴a(time, fArr2[7], posY, fArr2[fArr2.length - 5]));
            i++;
            double d = (double) time;
            Double.isNaN(d);
            time = (float) (d + 0.025d);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۵۹۸۹d() {
        return Math.abs(this.f۱۲۶۷۳n) < 0.001f;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۹۸۶a(float coefficient) {
        this.f۱۲۶۷۲m = coefficient;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۹۸۸c() {
        GLES20.glUseProgram(m۱۵۹۸۳b());
        int positionHandle = GLES20.glGetAttribLocation(m۱۵۹۸۳b(), "vPosition");
        GLES20.glEnableVertexAttribArray(positionHandle);
        GLES20.glVertexAttribPointer(positionHandle, 3, 5126, false, 12, (Buffer) this.f۱۲۶۶۲c);
        GLES20.glUniform4fv(GLES20.glGetUniformLocation(m۱۵۹۸۳b(), "vColor"), 1, m۱۵۹۸۲a(), 0);
        GLES20.glDrawElements(6, this.f۱۲۶۶۳d.capacity(), 5123, this.f۱۲۶۶۳d);
        GLES20.glDisableVertexAttribArray(positionHandle);
    }
}
