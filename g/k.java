package g;

import java.io.OutputStream;

public interface k {
    void a(byte[] bArr, OutputStream outputStream);

    public static final class a implements k {
        @Override // g.k
        public void a(byte[] data, OutputStream outputStream) {
            outputStream.write(data);
        }
    }
}
