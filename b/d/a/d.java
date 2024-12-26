package b.d.a;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Random;

/* access modifiers changed from: package-private */
public class d extends g {

    /* renamed from: c  reason: collision with root package name */
    private final FloatBuffer f۲۴۱۷c;

    /* renamed from: d  reason: collision with root package name */
    private final ShortBuffer f۲۴۱۸d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f۲۴۱۹e;

    /* renamed from: f  reason: collision with root package name */
    private float f۲۴۲۰f;

    /* renamed from: g  reason: collision with root package name */
    private float f۲۴۲۱g;

    /* renamed from: h  reason: collision with root package name */
    private float f۲۴۲۲h;
    private float i;
    private float j = -1.0f;
    private float k;
    private float l;

    public d(float[] color, float startX, float fromY, float toY, float size, Random random) {
        super(color);
        this.f۲۴۱۹e = random;
        a(startX, fromY, toY, size);
        float[] vertices = new float[123];
        short[] indices = new short[120];
        int i2 = 0;
        while (i2 < (indices.length / 3) - 1) {
            indices[i2 * 3] = 0;
            indices[(i2 * 3) + 1] = (short) (i2 + 1);
            indices[(i2 * 3) + 2] = (short) (i2 + 2);
            i2++;
        }
        indices[i2 * 3] = 0;
        indices[(i2 * 3) + 1] = (short) (i2 + 1);
        indices[(i2 * 3) + 2] = 1;
        ByteBuffer verticesByteBuffer = ByteBuffer.allocateDirect(vertices.length * 4);
        verticesByteBuffer.order(ByteOrder.nativeOrder());
        this.f۲۴۱۷c = verticesByteBuffer.asFloatBuffer();
        this.f۲۴۱۷c.put(vertices);
        this.f۲۴۱۷c.position(0);
        ByteBuffer indicesByteBuffer = ByteBuffer.allocateDirect(indices.length * 2);
        indicesByteBuffer.order(ByteOrder.nativeOrder());
        this.f۲۴۱۸d = indicesByteBuffer.asShortBuffer();
        this.f۲۴۱۸d.put(indices);
        this.f۲۴۱۸d.position(0);
        double nextFloat = (double) (random.nextFloat() * 2.0f);
        Double.isNaN(nextFloat);
        this.l = (float) (nextFloat * 3.141592653589793d);
    }

    public void a(long dt, float ratioY) {
        this.l += ((float) dt) * 0.0062831854f;
        float fromX = this.k + ((float) (Math.sin((double) this.l) * 0.05000000074505806d));
        float f2 = this.f۲۴۲۱g;
        float toX = fromX + f2;
        float fromY = this.f۲۴۲۰f + (((float) dt) * this.f۲۴۲۲h);
        float toY = f2 + fromY;
        this.j += ((float) dt) * this.i;
        a()[3] = 1.0f - (this.j / 1.0f);
        this.f۲۴۱۷c.put(0, l.b(0.0f, fromX, toX));
        this.f۲۴۱۷c.put(1, l.b(this.j * ratioY, fromY, toY));
        for (int i2 = 1; i2 <= 40; i2++) {
            double d2 = (double) i2;
            Double.isNaN(d2);
            this.f۲۴۱۷c.put(i2 * 3, l.b((float) Math.sin((d2 * 0.15707963267948966d) - 1.4292036732051034d), fromX, toX));
            double d3 = (double) i2;
            Double.isNaN(d3);
            this.f۲۴۱۷c.put((i2 * 3) + 1, l.b(((float) Math.cos((d3 * 0.15707963267948966d) - 1.4292036732051034d)) * ratioY, fromY, toY));
        }
        this.f۲۴۲۰f = fromY;
    }

    public void c() {
        GLES20.glUseProgram(b());
        int positionHandle = GLES20.glGetAttribLocation(b(), "vPosition");
        GLES20.glEnableVertexAttribArray(positionHandle);
        GLES20.glVertexAttribPointer(positionHandle, 3, 5126, false, 12, (Buffer) this.f۲۴۱۷c);
        int colorHandle = GLES20.glGetUniformLocation(b(), "vColor");
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUniform4fv(colorHandle, 1, a(), 0);
        GLES20.glDrawElements(6, this.f۲۴۱۸d.capacity(), 5123, this.f۲۴۱۸d);
        GLES20.glDisableVertexAttribArray(positionHandle);
        GLES20.glDisable(3042);
    }

    public boolean d() {
        return this.j > 1.0f;
    }

    public void a(float startX, float fromY, float toY, float size) {
        this.f۲۴۲۰f = fromY;
        this.f۲۴۲۱g = size;
        this.k = startX;
        this.j = -1.0f;
        float coef = (this.f۲۴۱۹e.nextFloat() * 0.8f) + 0.4f;
        this.f۲۴۲۲h = ((toY - fromY) / 1000.0f) * coef;
        this.i = 0.002f * coef;
        a()[3] = 1.0f;
    }
}
