package android.support.v4.app;

import android.arch.lifecycle.e;
import android.arch.lifecycle.q;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class u {
    public abstract void a();

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public static <T extends e & q> u a(T owner) {
        return new LoaderManagerImpl(owner, owner.b());
    }
}
