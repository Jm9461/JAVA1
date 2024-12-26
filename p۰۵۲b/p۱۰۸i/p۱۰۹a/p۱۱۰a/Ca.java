package p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: b.i.a.a.a  reason: invalid class name */
public final class Ca {

    /* renamed from: a  reason: contains not printable characters */
    private static SharedPreferences f۱۲۹۸۴a;

    /* access modifiers changed from: private */
    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۶۴۱۶b(Context context, String prefsName, int mode) {
        f۱۲۹۸۴a = context.getSharedPreferences(prefsName, mode);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static SharedPreferences m۱۶۴۱۲a() {
        SharedPreferences sharedPreferences = f۱۲۹۸۴a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new RuntimeException("Prefs class not correctly instantiated. Please call Builder.setContext().build() in the Application class onCreate.");
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۶۴۱۱a(String key, int defValue) {
        return m۱۶۴۱۲a().getInt(key, defValue);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۶۴۱۵a(String key, boolean defValue) {
        return m۱۶۴۱۲a().getBoolean(key, defValue);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۶۴۱۳a(String key, String defValue) {
        return m۱۶۴۱۲a().getString(key, defValue);
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۶۴۱۷b(String key, int value) {
        SharedPreferences.Editor editor = m۱۶۴۱۲a().edit();
        editor.putInt(key, value);
        editor.apply();
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۶۴۱۹b(String key, boolean value) {
        SharedPreferences.Editor editor = m۱۶۴۱۲a().edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۶۴۱۸b(String key, String value) {
        SharedPreferences.Editor editor = m۱۶۴۱۲a().edit();
        editor.putString(key, value);
        editor.apply();
    }

    /* renamed from: b.i.a.a.a$a  reason: invalid class name */
    public static final class Ca {

        /* renamed from: a  reason: contains not printable characters */
        private String f۱۲۹۸۵a;

        /* renamed from: b  reason: contains not printable characters */
        private Context f۱۲۹۸۶b;

        /* renamed from: c  reason: contains not printable characters */
        private int f۱۲۹۸۷c = -1;

        /* renamed from: d  reason: contains not printable characters */
        private boolean f۱۲۹۸۸d = false;

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۶۴۲۲a(String prefsName) {
            this.f۱۲۹۸۵a = prefsName;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۶۴۲۱a(Context context) {
            this.f۱۲۹۸۶b = context;
            return this;
        }

        @SuppressLint({"WorldReadableFiles", "WorldWriteableFiles"})
        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۶۴۲۰a(int mode) {
            if (mode == 0 || mode == 1 || mode == 2 || mode == 4) {
                this.f۱۲۹۸۷c = mode;
                return this;
            }
            throw new RuntimeException("The mode in the SharedPreference can only be set too ContextWrapper.MODE_PRIVATE, ContextWrapper.MODE_WORLD_READABLE, ContextWrapper.MODE_WORLD_WRITEABLE or ContextWrapper.MODE_MULTI_PROCESS");
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۶۴۲۳a(boolean defaultSharedPreference) {
            this.f۱۲۹۸۸d = defaultSharedPreference;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۴۲۴a() {
            if (this.f۱۲۹۸۶b != null) {
                if (TextUtils.isEmpty(this.f۱۲۹۸۵a)) {
                    this.f۱۲۹۸۵a = this.f۱۲۹۸۶b.getPackageName();
                }
                if (this.f۱۲۹۸۸d) {
                    this.f۱۲۹۸۵a += "_preferences";
                }
                if (this.f۱۲۹۸۷c == -1) {
                    this.f۱۲۹۸۷c = 0;
                }
                Ca.m۱۶۴۱۶b(this.f۱۲۹۸۶b, this.f۱۲۹۸۵a, this.f۱۲۹۸۷c);
                return;
            }
            throw new RuntimeException("Context not set, please set context before building the Prefs instance.");
        }
    }
}
