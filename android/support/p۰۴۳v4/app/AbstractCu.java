package android.support.p۰۴۳v4.app;

import android.arch.lifecycle.AbstractCe;
import android.arch.lifecycle.AbstractCq;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.u  reason: invalid class name */
public abstract class AbstractCu {
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۵۵۷a();

    @Deprecated
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۵۵۸a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a  reason: contains not printable characters */
    public static <T extends AbstractCe & AbstractCq> AbstractCu m۱۲۵۵۶a(T owner) {
        return new LoaderManagerImpl(owner, owner.m۱۰۹۳۵b());
    }
}
