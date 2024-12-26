package b.d.a;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Random;

/* access modifiers changed from: package-private */
public class h extends g {
    private static final int p = (((int) Math.ceil(2.5d)) * 3);

    /* renamed from: c  reason: collision with root package name */
    private FloatBuffer f۲۴۳۵c;

    /* renamed from: d  reason: collision with root package name */
    private ShortBuffer f۲۴۳۶d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f۲۴۳۷e;

    /* renamed from: f  reason: collision with root package name */
    private final float f۲۴۳۸f;

    /* renamed from: g  reason: collision with root package name */
    private final float f۲۴۳۹g;

    /* renamed from: h  reason: collision with root package name */
    private final float f۲۴۴۰h;
    private final float i;
    private float[] j;
    private float k;
    private float l;
    private float m;
    private float n;
    float o = 0.0f;

    public h(float[] color, float fromX, float toX, float fromY, float toY, byte direction, Random random) {
        super(color);
        float f2 = 0.0f;
        this.f۲۴۳۸f = fromX;
        this.f۲۴۳۹g = toX;
        this.f۲۴۴۰h = fromY;
        this.i = toY;
        this.f۲۴۳۷e = random;
        this.k = direction != 0 ? 3.1415927f : f2;
        f();
        e();
    }

    private void e() {
        short[] indices = new short[129];
        for (int i2 = 0; i2 < indices.length / 3; i2++) {
            indices[i2 * 3] = 0;
            indices[(i2 * 3) + 1] = (short) (i2 + 1);
            indices[(i2 * 3) + 2] = (short) (i2 + 2);
        }
        ByteBuffer indicesByteBuffer = ByteBuffer.allocateDirect(indices.length * 2);
        indicesByteBuffer.order(ByteOrder.nativeOrder());
        this.f۲۴۳۶d = indicesByteBuffer.asShortBuffer();
        this.f۲۴۳۶d.put(indices);
        this.f۲۴۳۶d.position(0);
    }

    private void f() {
        this.j = new float[(45 * 3)];
        this.j[0] = l.b(0.0f, this.f۲۴۳۸f, this.f۲۴۳۹g);
        this.j[1] = l.b(-1.0f, this.f۲۴۴۰h, this.i);
        this.j[3] = l.b(-1.0f, this.f۲۴۳۸f, this.f۲۴۳۹g);
        this.j[4] = l.b(-1.0f, this.f۲۴۴۰h, this.i);
        float[] fArr = this.j;
        fArr[6] = fArr[3];
        fArr[7] = l.b(0.0f, this.f۲۴۴۰h, this.i);
        float[] fArr2 = this.j;
        fArr2[fArr2.length - 6] = l.b(1.0f, this.f۲۴۳۸f, this.f۲۴۳۹g);
        float[] fArr3 = this.j;
        fArr3[fArr3.length - 5] = fArr3[7];
        fArr3[fArr3.length - 3] = fArr3[fArr3.length - 6];
        fArr3[fArr3.length - 2] = fArr3[4];
    }

    /* JADX INFO: Multiple debug info for r1v1 float: [D('vertexByteBuffer' java.nio.ByteBuffer), D('angle' float)] */
    public void b(float dAngle) {
        if (this.f۲۴۳۵c == null) {
            ByteBuffer vertexByteBuffer = ByteBuffer.allocateDirect(this.j.length * 4);
            vertexByteBuffer.order(ByteOrder.nativeOrder());
            this.f۲۴۳۵c = vertexByteBuffer.asFloatBuffer();
            this.f۲۴۳۵c.put(this.j);
            this.f۲۴۳۵c.position(0);
        }
        float angle = this.k + dAngle;
        this.k = angle;
        if (this.l == 0.0f) {
            float f2 = this.m;
            if (f2 > 0.0f) {
                this.l = l.c(0.0f, f2, 0.35f);
            }
        }
        float val = ((float) Math.sin((double) angle)) * this.l;
        if ((this.n > 0.0f && val <= 0.0f) || (this.n < 0.0f && val >= 0.0f)) {
            this.l = l.c(this.l, this.m, 0.35f);
            this.o = this.f۲۴۳۷e.nextFloat() * 0.3f * ((float) (this.f۲۴۳۷e.nextBoolean() ? 1 : -1));
        }
        this.n = val;
        int i2 = 0;
        float posX = l.b(this.o, this.f۲۴۳۸f, this.f۲۴۳۹g);
        float posY = l.b(val, this.f۲۴۴۰h, this.i);
        float time = 0.0f;
        while (((double) time) < 1.0d - (0.025d / 2.0d)) {
            float[] fArr = this.j;
            int i3 = p;
            fArr[(i2 * 3) + 1 + i3] = angle;
            this.f۲۴۳۵c.put((i2 * 3) + i3, l.a(time, fArr[6], posX, fArr[fArr.length - 6]));
            FloatBuffer floatBuffer = this.f۲۴۳۵c;
            int i4 = (i2 * 3) + 1 + p;
            float[] fArr2 = this.j;
            floatBuffer.put(i4, l.a(time, fArr2[7], posY, fArr2[fArr2.length - 5]));
            i2++;
            double d2 = (double) time;
            Double.isNaN(d2);
            time = (float) (d2 + 0.025d);
        }
    }

    public boolean d() {
        return Math.abs(this.n) < 0.001f;
    }

    public void a(float coefficient) {
        this.m = coefficient;
    }

    public void c() {
        GLES20.glUseProgram(b());
        int positionHandle = GLES20.glGetAttribLocation(b(), "vPosition");
        GLES20.glEnableVertexAttribArray(positionHandle);
        GLES20.glVertexAttribPointer(positionHandle, 3, 5126, false, 12, (Buffer) this.f۲۴۳۵c);
        GLES20.glUniform4fv(GLES20.glGetUniformLocation(b(), "vColor"), 1, a(), 0);
        GLES20.glDrawElements(6, this.f۲۴۳۶d.capacity(), 5123, this.f۲۴۳۶d);
        GLES20.glDisableVertexAttribArray(positionHandle);
    }
}
