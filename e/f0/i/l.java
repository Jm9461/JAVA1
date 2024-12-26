package e.f0.i;

import f.e;
import java.util.List;

public interface l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f۴۰۰۶a = new a();

    void a(int i, b bVar);

    boolean a(int i, e eVar, int i2, boolean z);

    boolean a(int i, List<c> list);

    boolean a(int i, List<c> list, boolean z);

    class a implements l {
        a() {
        }

        @Override // e.f0.i.l
        public boolean a(int streamId, List<c> list) {
            return true;
        }

        @Override // e.f0.i.l
        public boolean a(int streamId, List<c> list, boolean last) {
            return true;
        }

        @Override // e.f0.i.l
        public boolean a(int streamId, e source, int byteCount, boolean last) {
            source.skip((long) byteCount);
            return true;
        }

        @Override // e.f0.i.l
        public void a(int streamId, b errorCode) {
        }
    }
}
