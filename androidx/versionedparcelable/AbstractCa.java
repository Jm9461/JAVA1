package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.versionedparcelable.a  reason: invalid class name */
public abstract class AbstractCa {
    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۵۷۶۷a();

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۵۷۶۸a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۵۷۷۰a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۵۷۷۲a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۵۷۷۳a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public abstract AbstractCa m۱۵۷۷۵b();

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۵۷۷۶b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c  reason: contains not printable characters */
    public abstract void m۱۵۷۸۱c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d  reason: contains not printable characters */
    public abstract byte[] m۱۵۷۸۳d();

    /* access modifiers changed from: protected */
    /* renamed from: e  reason: contains not printable characters */
    public abstract int m۱۵۷۸۴e();

    /* access modifiers changed from: protected */
    /* renamed from: f  reason: contains not printable characters */
    public abstract <T extends Parcelable> T m۱۵۷۸۵f();

    /* access modifiers changed from: protected */
    /* renamed from: g  reason: contains not printable characters */
    public abstract String m۱۵۷۸۶g();

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۵۷۸۲c() {
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۷۱a(boolean allowSerialization, boolean ignoreParcelables) {
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۷۸۰b(byte[] b, int fieldId) {
        m۱۵۷۷۶b(fieldId);
        m۱۵۷۷۲a(b);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۷۷۷b(int val, int fieldId) {
        m۱۵۷۷۶b(fieldId);
        m۱۵۷۸۱c(val);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۷۷۹b(String val, int fieldId) {
        m۱۵۷۷۶b(fieldId);
        m۱۵۷۷۰a(val);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۷۷۸b(Parcelable p, int fieldId) {
        m۱۵۷۷۶b(fieldId);
        m۱۵۷۶۸a(p);
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۵۷۶۴a(int def, int fieldId) {
        if (!m۱۵۷۷۳a(fieldId)) {
            return def;
        }
        return m۱۵۷۸۴e();
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۵۷۶۶a(String def, int fieldId) {
        if (!m۱۵۷۷۳a(fieldId)) {
            return def;
        }
        return m۱۵۷۸۶g();
    }

    /* renamed from: a  reason: contains not printable characters */
    public byte[] m۱۵۷۷۴a(byte[] def, int fieldId) {
        if (!m۱۵۷۷۳a(fieldId)) {
            return def;
        }
        return m۱۵۷۸۳d();
    }

    /* renamed from: a  reason: contains not printable characters */
    public <T extends Parcelable> T m۱۵۷۶۵a(T def, int fieldId) {
        return !m۱۵۷۷۳a(fieldId) ? def : (T) m۱۵۷۸۵f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۶۹a(AbstractCc p) {
        if (p == null) {
            m۱۵۷۷۰a((String) null);
            return;
        }
        m۱۵۷۶۳c(p);
        AbstractCa subParcel = m۱۵۷۷۵b();
        m۱۵۷۶۱a(p, subParcel);
        subParcel.m۱۵۷۶۷a();
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۵۷۶۳c(AbstractCc p) {
        try {
            m۱۵۷۷۰a(m۱۵۷۶۰a((Class<? extends AbstractCc>) p.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(p.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h  reason: contains not printable characters */
    public <T extends AbstractCc> T m۱۵۷۸۷h() {
        String name = m۱۵۷۸۶g();
        if (name == null) {
            return null;
        }
        return (T) m۱۵۷۵۹a(name, m۱۵۷۷۵b());
    }

    /* renamed from: a  reason: contains not printable characters */
    protected static <T extends AbstractCc> T m۱۵۷۵۹a(String parcelCls, AbstractCa versionedParcel) {
        try {
            return (T) ((AbstractCc) Class.forName(parcelCls, true, AbstractCa.class.getClassLoader()).getDeclaredMethod("read", AbstractCa.class).invoke(null, versionedParcel));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    protected static <T extends AbstractCc> void m۱۵۷۶۱a(T val, AbstractCa versionedParcel) {
        try {
            m۱۵۷۶۲b(val).getDeclaredMethod("write", val.getClass(), AbstractCa.class).invoke(null, val, versionedParcel);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private static <T extends AbstractCc> Class m۱۵۷۶۲b(T val) {
        return m۱۵۷۶۰a((Class<? extends AbstractCc>) val.getClass());
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Class m۱۵۷۶۰a(Class<? extends AbstractCc> cls) {
        return Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
    }
}
