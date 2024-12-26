package p۲۹۵e.p۲۹۶f0.p۳۰۱i;

import java.util.List;
import p۳۰۵f.InterfaceCe;

/* renamed from: e.f0.i.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public interface InterfaceCl {

    /* renamed from: a, reason: contains not printable characters */
    public static final InterfaceCl f۱۶۰۴۰a = new a();

    /* renamed from: a, reason: contains not printable characters */
    void mo۱۶۹۳۷a(int i, EnumCb enumCb);

    /* renamed from: a, reason: contains not printable characters */
    boolean mo۱۶۹۳۸a(int i, InterfaceCe interfaceCe, int i2, boolean z);

    /* renamed from: a, reason: contains not printable characters */
    boolean mo۱۶۹۳۹a(int i, List<Cc> list);

    /* renamed from: a, reason: contains not printable characters */
    boolean mo۱۶۹۴۰a(int i, List<Cc> list, boolean z);

    /* renamed from: e.f0.i.l$a */
    final class a implements InterfaceCl {
        a() {
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.InterfaceCl
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۶۹۳۹a(int streamId, List<Cc> list) {
            return true;
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.InterfaceCl
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۶۹۴۰a(int streamId, List<Cc> list, boolean last) {
            return true;
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.InterfaceCl
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۶۹۳۸a(int streamId, InterfaceCe source, int byteCount, boolean last) {
            source.skip(byteCount);
            return true;
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.InterfaceCl
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۹۳۷a(int streamId, EnumCb errorCode) {
        }
    }
}
