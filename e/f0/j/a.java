package e.f0.j;

import f.l;
import f.r;
import f.s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f۴۰۱۰a = new C۰۱۲۱a();

    void a(File file);

    void a(File file, File file2);

    s b(File file);

    r c(File file);

    void d(File file);

    r e(File file);

    boolean f(File file);

    long g(File file);

    /* renamed from: e.f0.j.a$a  reason: collision with other inner class name */
    class C۰۱۲۱a implements a {
        C۰۱۲۱a() {
        }

        @Override // e.f0.j.a
        public s b(File file) {
            return l.c(file);
        }

        @Override // e.f0.j.a
        public r c(File file) {
            try {
                return l.b(file);
            } catch (FileNotFoundException e2) {
                file.getParentFile().mkdirs();
                return l.b(file);
            }
        }

        @Override // e.f0.j.a
        public r e(File file) {
            try {
                return l.a(file);
            } catch (FileNotFoundException e2) {
                file.getParentFile().mkdirs();
                return l.a(file);
            }
        }

        @Override // e.f0.j.a
        public void a(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        @Override // e.f0.j.a
        public boolean f(File file) {
            return file.exists();
        }

        @Override // e.f0.j.a
        public long g(File file) {
            return file.length();
        }

        @Override // e.f0.j.a
        public void a(File from, File to) {
            a(to);
            if (!from.renameTo(to)) {
                throw new IOException("failed to rename " + from + " to " + to);
            }
        }

        @Override // e.f0.j.a
        public void d(File directory) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        d(file);
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
