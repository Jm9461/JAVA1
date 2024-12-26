package p۲۹۵e.p۲۹۶f0.p۳۰۲j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p۳۰۵f.Cl;
import p۳۰۵f.InterfaceCr;
import p۳۰۵f.InterfaceCs;

/* renamed from: e.f0.j.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public interface InterfaceCa {

    /* renamed from: a, reason: contains not printable characters */
    public static final InterfaceCa f۱۶۰۴۴a = new a();

    /* renamed from: a, reason: contains not printable characters */
    void mo۱۶۹۵۹a(File file);

    /* renamed from: a, reason: contains not printable characters */
    void mo۱۶۹۶۰a(File file, File file2);

    /* renamed from: b, reason: contains not printable characters */
    InterfaceCs mo۱۶۹۶۱b(File file);

    /* renamed from: c, reason: contains not printable characters */
    InterfaceCr mo۱۶۹۶۲c(File file);

    /* renamed from: d, reason: contains not printable characters */
    void mo۱۶۹۶۳d(File file);

    /* renamed from: e, reason: contains not printable characters */
    InterfaceCr mo۱۶۹۶۴e(File file);

    /* renamed from: f, reason: contains not printable characters */
    boolean mo۱۶۹۶۵f(File file);

    /* renamed from: g, reason: contains not printable characters */
    long mo۱۶۹۶۶g(File file);

    /* renamed from: e.f0.j.a$a */
    final class a implements InterfaceCa {
        a() {
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۲j.InterfaceCa
        /* renamed from: b, reason: contains not printable characters */
        public InterfaceCs mo۱۶۹۶۱b(File file) {
            return Cl.m۱۷۴۱۵c(file);
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۲j.InterfaceCa
        /* renamed from: c, reason: contains not printable characters */
        public InterfaceCr mo۱۶۹۶۲c(File file) {
            try {
                return Cl.m۱۷۴۱۲b(file);
            } catch (FileNotFoundException e2) {
                file.getParentFile().mkdirs();
                return Cl.m۱۷۴۱۲b(file);
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۲j.InterfaceCa
        /* renamed from: e, reason: contains not printable characters */
        public InterfaceCr mo۱۶۹۶۴e(File file) {
            try {
                return Cl.m۱۷۴۰۵a(file);
            } catch (FileNotFoundException e2) {
                file.getParentFile().mkdirs();
                return Cl.m۱۷۴۰۵a(file);
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۲j.InterfaceCa
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۹۵۹a(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۲j.InterfaceCa
        /* renamed from: f, reason: contains not printable characters */
        public boolean mo۱۶۹۶۵f(File file) {
            return file.exists();
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۲j.InterfaceCa
        /* renamed from: g, reason: contains not printable characters */
        public long mo۱۶۹۶۶g(File file) {
            return file.length();
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۲j.InterfaceCa
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۹۶۰a(File from, File to) {
            mo۱۶۹۵۹a(to);
            if (!from.renameTo(to)) {
                throw new IOException("failed to rename " + from + " to " + to);
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۲j.InterfaceCa
        /* renamed from: d, reason: contains not printable characters */
        public void mo۱۶۹۶۳d(File directory) {
            File[] files = directory.listFiles();
            if (files == null) {
                throw new IOException("not a readable directory: " + directory);
            }
            for (File file : files) {
                if (file.isDirectory()) {
                    mo۱۶۹۶۳d(file);
                }
                if (!file.delete()) {
                    throw new IOException("failed to delete " + file);
                }
            }
        }
    }
}
