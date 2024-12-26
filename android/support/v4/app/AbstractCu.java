package android.support.v4.app;

import android.arch.lifecycle.InterfaceCe;
import android.arch.lifecycle.InterfaceCq;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.u, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCu {
    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۰۴۸۷a();

    @Deprecated
    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۰۴۸۸a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a, reason: contains not printable characters */
    public static <T extends InterfaceCe & InterfaceCq> AbstractCu m۱۰۴۸۶a(T owner) {
        return new LoaderManagerImpl(owner, owner.mo۱۰۱۹۱b());
    }
}
