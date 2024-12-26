package p۰۵۲b.p۰۶۴d.p۰۶۵a;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Random;

/* access modifiers changed from: package-private */
/* renamed from: b.d.a.d  reason: invalid class name */
public class Cd extends AbstractCg {

    /* renamed from: c  reason: contains not printable characters */
    private final FloatBuffer f۱۲۶۳۹c;

    /* renamed from: d  reason: contains not printable characters */
    private final ShortBuffer f۱۲۶۴۰d;

    /* renamed from: e  reason: contains not printable characters */
    private final Random f۱۲۶۴۱e;

    /* renamed from: f  reason: contains not printable characters */
    private float f۱۲۶۴۲f;

    /* renamed from: g  reason: contains not printable characters */
    private float f۱۲۶۴۳g;

    /* renamed from: h  reason: contains not printable characters */
    private float f۱۲۶۴۴h;

    /* renamed from: i  reason: contains not printable characters */
    private float f۱۲۶۴۵i;

    /* renamed from: j  reason: contains not printable characters */
    private float f۱۲۶۴۶j = -1.0f;

    /* renamed from: k  reason: contains not printable characters */
    private float f۱۲۶۴۷k;

    /* renamed from: l  reason: contains not printable characters */
    private float f۱۲۶۴۸l;

    public Cd(float[] color, float startX, float fromY, float toY, float size, Random random) {
        super(color);
        this.f۱۲۶۴۱e = random;
        m۱۵۹۷۴a(startX, fromY, toY, size);
        float[] vertices = new float[123];
        short[] indices = new short[120];
        int i = 0;
        while (i < (indices.length / 3) - 1) {
            indices[i * 3] = 0;
            indices[(i * 3) + 1] = (short) (i + 1);
            indices[(i * 3) + 2] = (short) (i + 2);
            i++;
        }
        indices[i * 3] = 0;
        indices[(i * 3) + 1] = (short) (i + 1);
        indices[(i * 3) + 2] = 1;
        ByteBuffer verticesByteBuffer = ByteBuffer.allocateDirect(vertices.length * 4);
        verticesByteBuffer.order(ByteOrder.nativeOrder());
        this.f۱۲۶۳۹c = verticesByteBuffer.asFloatBuffer();
        this.f۱۲۶۳۹c.put(vertices);
        this.f۱۲۶۳۹c.position(0);
        ByteBuffer indicesByteBuffer = ByteBuffer.allocateDirect(indices.length * 2);
        indicesByteBuffer.order(ByteOrder.nativeOrder());
        this.f۱۲۶۴۰d = indicesByteBuffer.asShortBuffer();
        this.f۱۲۶۴۰d.put(indices);
        this.f۱۲۶۴۰d.position(0);
        double nextFloat = (double) (random.nextFloat() * 2.0f);
        Double.isNaN(nextFloat);
        this.f۱۲۶۴۸l = (float) (nextFloat * 3.141592653589793d);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۹۷۵a(long dt, float ratioY) {
        this.f۱۲۶۴۸l += ((float) dt) * 0.0062831854f;
        float fromX = this.f۱۲۶۴۷k + ((float) (Math.sin((double) this.f۱۲۶۴۸l) * 0.05000000074505806d));
        float f = this.f۱۲۶۴۳g;
        float toX = fromX + f;
        float fromY = this.f۱۲۶۴۲f + (((float) dt) * this.f۱۲۶۴۴h);
        float toY = f + fromY;
        this.f۱۲۶۴۶j += ((float) dt) * this.f۱۲۶۴۵i;
        m۱۵۹۸۲a()[3] = 1.0f - (this.f۱۲۶۴۶j / 1.0f);
        this.f۱۲۶۳۹c.put(0, Cl.m۱۶۰۱۰b(0.0f, fromX, toX));
        this.f۱۲۶۳۹c.put(1, Cl.m۱۶۰۱۰b(this.f۱۲۶۴۶j * ratioY, fromY, toY));
        for (int i = 1; i <= 40; i++) {
            double d = (double) i;
            Double.isNaN(d);
            this.f۱۲۶۳۹c.put(i * 3, Cl.m۱۶۰۱۰b((float) Math.sin((d * 0.15707963267948966d) - 1.4292036732051034d), fromX, toX));
            double d2 = (double) i;
            Double.isNaN(d2);
            this.f۱۲۶۳۹c.put((i * 3) + 1, Cl.m۱۶۰۱۰b(((float) Math.cos((d2 * 0.15707963267948966d) - 1.4292036732051034d)) * ratioY, fromY, toY));
        }
        this.f۱۲۶۴۲f = fromY;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۹۷۶c() {
        GLES20.glUseProgram(m۱۵۹۸۳b());
        int positionHandle = GLES20.glGetAttribLocation(m۱۵۹۸۳b(), "vPosition");
        GLES20.glEnableVertexAttribArray(positionHandle);
        GLES20.glVertexAttribPointer(positionHandle, 3, 5126, false, 12, (Buffer) this.f۱۲۶۳۹c);
        int colorHandle = GLES20.glGetUniformLocation(m۱۵۹۸۳b(), "vColor");
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUniform4fv(colorHandle, 1, m۱۵۹۸۲a(), 0);
        GLES20.glDrawElements(6, this.f۱۲۶۴۰d.capacity(), 5123, this.f۱۲۶۴۰d);
        GLES20.glDisableVertexAttribArray(positionHandle);
        GLES20.glDisable(3042);
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۵۹۷۷d() {
        return this.f۱۲۶۴۶j > 1.0f;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۹۷۴a(float startX, float fromY, float toY, float size) {
        this.f۱۲۶۴۲f = fromY;
        this.f۱۲۶۴۳g = size;
        this.f۱۲۶۴۷k = startX;
        this.f۱۲۶۴۶j = -1.0f;
        float coef = (this.f۱۲۶۴۱e.nextFloat() * 0.8f) + 0.4f;
        this.f۱۲۶۴۴h = ((toY - fromY) / 1000.0f) * coef;
        this.f۱۲۶۴۵i = 0.002f * coef;
        m۱۵۹۸۲a()[3] = 1.0f;
    }
}
