package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

public abstract class a {
    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract boolean a(int i);

    /* access modifiers changed from: protected */
    public abstract a b();

    /* access modifiers changed from: protected */
    public abstract void b(int i);

    /* access modifiers changed from: protected */
    public abstract void c(int i);

    /* access modifiers changed from: protected */
    public abstract byte[] d();

    /* access modifiers changed from: protected */
    public abstract int e();

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T f();

    /* access modifiers changed from: protected */
    public abstract String g();

    public boolean c() {
        return false;
    }

    public void a(boolean allowSerialization, boolean ignoreParcelables) {
    }

    public void b(byte[] b2, int fieldId) {
        b(fieldId);
        a(b2);
    }

    public void b(int val, int fieldId) {
        b(fieldId);
        c(val);
    }

    public void b(String val, int fieldId) {
        b(fieldId);
        a(val);
    }

    public void b(Parcelable p, int fieldId) {
        b(fieldId);
        a(p);
    }

    public int a(int def, int fieldId) {
        if (!a(fieldId)) {
            return def;
        }
        return e();
    }

    public String a(String def, int fieldId) {
        if (!a(fieldId)) {
            return def;
        }
        return g();
    }

    public byte[] a(byte[] def, int fieldId) {
        if (!a(fieldId)) {
            return def;
        }
        return d();
    }

    public <T extends Parcelable> T a(T def, int fieldId) {
        return !a(fieldId) ? def : (T) f();
    }

    /* access modifiers changed from: protected */
    public void a(c p) {
        if (p == null) {
            a((String) null);
            return;
        }
        c(p);
        a subParcel = b();
        a(p, subParcel);
        subParcel.a();
    }

    private void c(c p) {
        try {
            a(a((Class<? extends c>) p.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(p.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    /* access modifiers changed from: protected */
    public <T extends c> T h() {
        String name = g();
        if (name == null) {
            return null;
        }
        return (T) a(name, b());
    }

    protected static <T extends c> T a(String parcelCls, a versionedParcel) {
        try {
            return (T) ((c) Class.forName(parcelCls, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class).invoke(null, versionedParcel));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    protected static <T extends c> void a(T val, a versionedParcel) {
        try {
            b(val).getDeclaredMethod("write", val.getClass(), a.class).invoke(null, val, versionedParcel);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    private static <T extends c> Class b(T val) {
        return a((Class<? extends c>) val.getClass());
    }

    private static Class a(Class<? extends c> cls) {
        return Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
    }
}
