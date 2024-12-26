package p۱۳۹e.p۱۴۰f0.p۱۴۶j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p۱۴۹f.AbstractCr;
import p۱۴۹f.AbstractCs;
import p۱۴۹f.Cl;

/* renamed from: e.f0.j.a  reason: invalid class name */
public interface AbstractCa {

    /* renamed from: a  reason: contains not printable characters */
    public static final AbstractCa f۱۶۰۴۴a = new Ca();

    /* renamed from: a  reason: contains not printable characters */
    void m۱۹۰۳۰a(File file);

    /* renamed from: a  reason: contains not printable characters */
    void m۱۹۰۳۱a(File file, File file2);

    /* renamed from: b  reason: contains not printable characters */
    AbstractCs m۱۹۰۳۲b(File file);

    /* renamed from: c  reason: contains not printable characters */
    AbstractCr m۱۹۰۳۳c(File file);

    /* renamed from: d  reason: contains not printable characters */
    void m۱۹۰۳۴d(File file);

    /* renamed from: e  reason: contains not printable characters */
    AbstractCr m۱۹۰۳۵e(File file);

    /* renamed from: f  reason: contains not printable characters */
    boolean m۱۹۰۳۶f(File file);

    /* renamed from: g  reason: contains not printable characters */
    long m۱۹۰۳۷g(File file);

    /* renamed from: e.f0.j.a$a  reason: invalid class name */
    class Ca implements AbstractCa {
        Ca() {
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۶j.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public AbstractCs m۱۹۰۴۰b(File file) {
            return Cl.m۱۹۴۹۲c(file);
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۶j.AbstractCa
        /* renamed from: c  reason: contains not printable characters */
        public AbstractCr m۱۹۰۴۱c(File file) {
            try {
                return Cl.m۱۹۴۸۹b(file);
            } catch (FileNotFoundException e) {
                file.getParentFile().mkdirs();
                return Cl.m۱۹۴۸۹b(file);
            }
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۶j.AbstractCa
        /* renamed from: e  reason: contains not printable characters */
        public AbstractCr m۱۹۰۴۳e(File file) {
            try {
                return Cl.m۱۹۴۸۲a(file);
            } catch (FileNotFoundException e) {
                file.getParentFile().mkdirs();
                return Cl.m۱۹۴۸۲a(file);
            }
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۶j.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۰۳۸a(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۶j.AbstractCa
        /* renamed from: f  reason: contains not printable characters */
        public boolean m۱۹۰۴۴f(File file) {
            return file.exists();
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۶j.AbstractCa
        /* renamed from: g  reason: contains not printable characters */
        public long m۱۹۰۴۵g(File file) {
            return file.length();
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۶j.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۰۳۹a(File from, File to) {
            m۱۹۰۳۸a(to);
            if (!from.renameTo(to)) {
                throw new IOException("failed to rename " + from + " to " + to);
            }
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۶j.AbstractCa
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۹۰۴۲d(File directory) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        m۱۹۰۴۲d(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + directory);
        }
    }
}
