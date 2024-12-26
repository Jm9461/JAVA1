package p۱۳۹e.p۱۴۰f0.p۱۴۵i;

import java.util.List;
import p۱۴۹f.AbstractCe;

/* renamed from: e.f0.i.l  reason: invalid class name */
public interface AbstractCl {

    /* renamed from: a  reason: contains not printable characters */
    public static final AbstractCl f۱۶۰۴۰a = new Ca();

    /* renamed from: a  reason: contains not printable characters */
    void m۱۹۰۱۲a(int i, EnumCb bVar);

    /* renamed from: a  reason: contains not printable characters */
    boolean m۱۹۰۱۳a(int i, AbstractCe eVar, int i2, boolean z);

    /* renamed from: a  reason: contains not printable characters */
    boolean m۱۹۰۱۴a(int i, List<Cc> list);

    /* renamed from: a  reason: contains not printable characters */
    boolean m۱۹۰۱۵a(int i, List<Cc> list, boolean z);

    /* renamed from: e.f0.i.l$a  reason: invalid class name */
    class Ca implements AbstractCl {
        Ca() {
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.AbstractCl
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۹۰۱۸a(int streamId, List<Cc> list) {
            return true;
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.AbstractCl
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۹۰۱۹a(int streamId, List<Cc> list, boolean last) {
            return true;
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.AbstractCl
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۹۰۱۷a(int streamId, AbstractCe source, int byteCount, boolean last) {
            source.skip((long) byteCount);
            return true;
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.AbstractCl
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۰۱۶a(int streamId, EnumCb errorCode) {
        }
    }
}
