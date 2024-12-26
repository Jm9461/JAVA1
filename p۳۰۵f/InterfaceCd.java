package p۳۰۵f;

import java.nio.channels.WritableByteChannel;

/* renamed from: f.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public interface InterfaceCd extends InterfaceCr, WritableByteChannel {
    /* renamed from: a, reason: contains not printable characters */
    Cc mo۱۷۴۳۳a();

    /* renamed from: a, reason: contains not printable characters */
    InterfaceCd mo۱۷۴۲۵a(long j);

    /* renamed from: a, reason: contains not printable characters */
    InterfaceCd mo۱۷۴۲۶a(String str);

    /* renamed from: d, reason: contains not printable characters */
    InterfaceCd mo۱۷۴۲۹d();

    /* renamed from: e, reason: contains not printable characters */
    InterfaceCd mo۱۷۴۳۰e(long j);

    @Override // p۳۰۵f.InterfaceCr, java.io.Flushable
    void flush();

    InterfaceCd write(byte[] bArr);

    InterfaceCd write(byte[] bArr, int i, int i2);

    InterfaceCd writeByte(int i);

    InterfaceCd writeInt(int i);

    InterfaceCd writeShort(int i);
}
