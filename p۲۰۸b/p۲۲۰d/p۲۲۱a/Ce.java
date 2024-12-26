package p۲۰۸b.p۲۲۰d.p۲۲۱a;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: b.d.a.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ce extends AbstractCg {

    /* renamed from: c, reason: contains not printable characters */
    private final FloatBuffer f۱۲۶۴۹c;

    /* renamed from: d, reason: contains not printable characters */
    private final ShortBuffer f۱۲۶۵۰d;

    public Ce(float[] color, float fromX, float toX, float fromY, float toY) {
        super(color);
        float[] vertices = {Cl.m۱۳۹۴۰b(-1.0f, fromX, toX), Cl.m۱۳۹۴۰b(1.0f, fromY, toY), 0.0f, Cl.m۱۳۹۴۰b(-1.0f, fromX, toX), Cl.m۱۳۹۴۰b(-1.0f, fromY, toY), 0.0f, Cl.m۱۳۹۴۰b(1.0f, fromX, toX), Cl.m۱۳۹۴۰b(-1.0f, fromY, toY), 0.0f, Cl.m۱۳۹۴۰b(1.0f, fromX, toX), Cl.m۱۳۹۴۰b(1.0f, fromY, toY), 0.0f};
        ByteBuffer vertexByteBuffer = ByteBuffer.allocateDirect(vertices.length * 4);
        vertexByteBuffer.order(ByteOrder.nativeOrder());
        this.f۱۲۶۴۹c = vertexByteBuffer.asFloatBuffer();
        this.f۱۲۶۴۹c.put(vertices);
        this.f۱۲۶۴۹c.position(0);
        short[] indices = {0, 1, 2, 0, 2, 3};
        ByteBuffer indicesByteBuffer = ByteBuffer.allocateDirect(indices.length * 2);
        indicesByteBuffer.order(ByteOrder.nativeOrder());
        this.f۱۲۶۵۰d = indicesByteBuffer.asShortBuffer();
        this.f۱۲۶۵۰d.put(indices);
        this.f۱۲۶۵۰d.position(0);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۳۹۰۸c() {
        GLES20.glUseProgram(m۱۳۹۱۳b());
        int positionHandle = GLES20.glGetAttribLocation(m۱۳۹۱۳b(), "vPosition");
        GLES20.glEnableVertexAttribArray(positionHandle);
        GLES20.glVertexAttribPointer(positionHandle, 3, 5126, false, 12, (Buffer) this.f۱۲۶۴۹c);
        int colorHandle = GLES20.glGetUniformLocation(m۱۳۹۱۳b(), "vColor");
        GLES20.glUniform4fv(colorHandle, 1, m۱۳۹۱۲a(), 0);
        GLES20.glDrawElements(6, this.f۱۲۶۵۰d.capacity(), 5123, this.f۱۲۶۵۰d);
        GLES20.glDisableVertexAttribArray(positionHandle);
    }
}
