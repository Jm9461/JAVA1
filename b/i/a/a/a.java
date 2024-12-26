package b.i.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f۲۵۸۱a;

    /* access modifiers changed from: private */
    public static void b(Context context, String prefsName, int mode) {
        f۲۵۸۱a = context.getSharedPreferences(prefsName, mode);
    }

    public static SharedPreferences a() {
        SharedPreferences sharedPreferences = f۲۵۸۱a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new RuntimeException("Prefs class not correctly instantiated. Please call Builder.setContext().build() in the Application class onCreate.");
    }

    public static int a(String key, int defValue) {
        return a().getInt(key, defValue);
    }

    public static boolean a(String key, boolean defValue) {
        return a().getBoolean(key, defValue);
    }

    public static String a(String key, String defValue) {
        return a().getString(key, defValue);
    }

    public static void b(String key, int value) {
        SharedPreferences.Editor editor = a().edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static void b(String key, boolean value) {
        SharedPreferences.Editor editor = a().edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public static void b(String key, String value) {
        SharedPreferences.Editor editor = a().edit();
        editor.putString(key, value);
        editor.apply();
    }

    /* renamed from: b.i.a.a.a$a  reason: collision with other inner class name */
    public static final class C۰۰۵۶a {

        /* renamed from: a  reason: collision with root package name */
        private String f۲۵۸۲a;

        /* renamed from: b  reason: collision with root package name */
        private Context f۲۵۸۳b;

        /* renamed from: c  reason: collision with root package name */
        private int f۲۵۸۴c = -1;

        /* renamed from: d  reason: collision with root package name */
        private boolean f۲۵۸۵d = false;

        public C۰۰۵۶a a(String prefsName) {
            this.f۲۵۸۲a = prefsName;
            return this;
        }

        public C۰۰۵۶a a(Context context) {
            this.f۲۵۸۳b = context;
            return this;
        }

        @SuppressLint({"WorldReadableFiles", "WorldWriteableFiles"})
        public C۰۰۵۶a a(int mode) {
            if (mode == 0 || mode == 1 || mode == 2 || mode == 4) {
                this.f۲۵۸۴c = mode;
                return this;
            }
            throw new RuntimeException("The mode in the SharedPreference can only be set too ContextWrapper.MODE_PRIVATE, ContextWrapper.MODE_WORLD_READABLE, ContextWrapper.MODE_WORLD_WRITEABLE or ContextWrapper.MODE_MULTI_PROCESS");
        }

        public C۰۰۵۶a a(boolean defaultSharedPreference) {
            this.f۲۵۸۵d = defaultSharedPreference;
            return this;
        }

        public void a() {
            if (this.f۲۵۸۳b != null) {
                if (TextUtils.isEmpty(this.f۲۵۸۲a)) {
                    this.f۲۵۸۲a = this.f۲۵۸۳b.getPackageName();
                }
                if (this.f۲۵۸۵d) {
                    this.f۲۵۸۲a += "_preferences";
                }
                if (this.f۲۵۸۴c == -1) {
                    this.f۲۵۸۴c = 0;
                }
                a.b(this.f۲۵۸۳b, this.f۲۵۸۲a, this.f۲۵۸۴c);
                return;
            }
            throw new RuntimeException("Context not set, please set context before building the Prefs instance.");
        }
    }
}
