package p۱۴۹f;

import java.nio.channels.WritableByteChannel;

/* renamed from: f.d  reason: invalid class name */
public interface AbstractCd extends AbstractCr, WritableByteChannel {
    /* renamed from: a  reason: contains not printable characters */
    Cc m۱۹۴۱۲a();

    /* renamed from: a  reason: contains not printable characters */
    AbstractCd m۱۹۴۱۳a(long j);

    /* renamed from: a  reason: contains not printable characters */
    AbstractCd m۱۹۴۱۴a(String str);

    /* renamed from: d  reason: contains not printable characters */
    AbstractCd m۱۹۴۱۵d();

    /* renamed from: e  reason: contains not printable characters */
    AbstractCd m۱۹۴۱۶e(long j);

    @Override // p۱۴۹f.AbstractCr, java.io.Flushable
    void flush();

    AbstractCd write(byte[] bArr);

    AbstractCd write(byte[] bArr, int i, int i2);

    AbstractCd writeByte(int i);

    AbstractCd writeInt(int i);

    AbstractCd writeShort(int i);
}
