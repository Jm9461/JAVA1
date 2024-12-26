package b.d.a;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* access modifiers changed from: package-private */
public class e extends g {

    /* renamed from: c  reason: collision with root package name */
    private final FloatBuffer f۲۴۲۳c;

    /* renamed from: d  reason: collision with root package name */
    private final ShortBuffer f۲۴۲۴d;

    public e(float[] color, float fromX, float toX, float fromY, float toY) {
        super(color);
        float[] vertices = {l.b(-1.0f, fromX, toX), l.b(1.0f, fromY, toY), 0.0f, l.b(-1.0f, fromX, toX), l.b(-1.0f, fromY, toY), 0.0f, l.b(1.0f, fromX, toX), l.b(-1.0f, fromY, toY), 0.0f, l.b(1.0f, fromX, toX), l.b(1.0f, fromY, toY), 0.0f};
        ByteBuffer vertexByteBuffer = ByteBuffer.allocateDirect(vertices.length * 4);
        vertexByteBuffer.order(ByteOrder.nativeOrder());
        this.f۲۴۲۳c = vertexByteBuffer.asFloatBuffer();
        this.f۲۴۲۳c.put(vertices);
        this.f۲۴۲۳c.position(0);
        short[] indices = {0, 1, 2, 0, 2, 3};
        ByteBuffer indicesByteBuffer = ByteBuffer.allocateDirect(indices.length * 2);
        indicesByteBuffer.order(ByteOrder.nativeOrder());
        this.f۲۴۲۴d = indicesByteBuffer.asShortBuffer();
        this.f۲۴۲۴d.put(indices);
        this.f۲۴۲۴d.position(0);
    }

    public void c() {
        GLES20.glUseProgram(b());
        int positionHandle = GLES20.glGetAttribLocation(b(), "vPosition");
        GLES20.glEnableVertexAttribArray(positionHandle);
        GLES20.glVertexAttribPointer(positionHandle, 3, 5126, false, 12, (Buffer) this.f۲۴۲۳c);
        GLES20.glUniform4fv(GLES20.glGetUniformLocation(b(), "vColor"), 1, a(), 0);
        GLES20.glDrawElements(6, this.f۲۴۲۴d.capacity(), 5123, this.f۲۴۲۴d);
        GLES20.glDisableVertexAttribArray(positionHandle);
    }
}
