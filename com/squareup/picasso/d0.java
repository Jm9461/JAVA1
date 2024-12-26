package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import f.e;
import f.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    static final StringBuilder f۳۵۳۵a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    private static final f f۳۵۳۶b = f.d("RIFF");

    /* renamed from: c  reason: collision with root package name */
    private static final f f۳۵۳۷c = f.d("WEBP");

    static int a(Bitmap bitmap) {
        int result = Build.VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
        if (result >= 0) {
            return result;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    static <T> T a(T value, String message) {
        if (value != null) {
            return value;
        }
        throw new NullPointerException(message);
    }

    static void a() {
        if (!b()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static String a(c hunter) {
        return a(hunter, "");
    }

    static String a(c hunter, String prefix) {
        StringBuilder builder = new StringBuilder(prefix);
        a action = hunter.b();
        if (action != null) {
            builder.append(action.f۳۴۹۴b.d());
        }
        List<Action> actions = hunter.c();
        if (actions != null) {
            int count = actions.size();
            for (int i = 0; i < count; i++) {
                if (i > 0 || action != null) {
                    builder.append(", ");
                }
                builder.append(((a) actions.get(i)).f۳۴۹۴b.d());
            }
        }
        return builder.toString();
    }

    static void a(String owner, String verb, String logId) {
        a(owner, verb, logId, "");
    }

    static void a(String owner, String verb, String logId, String extras) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", owner, verb, logId, extras));
    }

    static String a(w data) {
        String result = a(data, f۳۵۳۵a);
        f۳۵۳۵a.setLength(0);
        return result;
    }

    static String a(w data, StringBuilder builder) {
        String str = data.f۳۶۲۸f;
        if (str != null) {
            builder.ensureCapacity(str.length() + 50);
            builder.append(data.f۳۶۲۸f);
        } else {
            Uri uri = data.f۳۶۲۶d;
            if (uri != null) {
                String path = uri.toString();
                builder.ensureCapacity(path.length() + 50);
                builder.append(path);
            } else {
                builder.ensureCapacity(50);
                builder.append(data.f۳۶۲۷e);
            }
        }
        builder.append('\n');
        if (data.n != 0.0f) {
            builder.append("rotation:");
            builder.append(data.n);
            if (data.q) {
                builder.append('@');
                builder.append(data.o);
                builder.append('x');
                builder.append(data.p);
            }
            builder.append('\n');
        }
        if (data.c()) {
            builder.append("resize:");
            builder.append(data.f۳۶۳۰h);
            builder.append('x');
            builder.append(data.i);
            builder.append('\n');
        }
        if (data.j) {
            builder.append("centerCrop:");
            builder.append(data.k);
            builder.append('\n');
        } else if (data.l) {
            builder.append("centerInside");
            builder.append('\n');
        }
        List<c0> list = data.f۳۶۲۹g;
        if (list != null) {
            int count = list.size();
            for (int i = 0; i < count; i++) {
                builder.append(data.f۳۶۲۹g.get(i).a());
                builder.append('\n');
            }
        }
        return builder.toString();
    }

    static File b(Context context) {
        File cache = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!cache.exists()) {
            cache.mkdirs();
        }
        return cache;
    }

    @TargetApi(18)
    static long a(File dir) {
        long size = 5242880;
        try {
            StatFs statFs = new StatFs(dir.getAbsolutePath());
            size = ((Build.VERSION.SDK_INT < 18 ? (long) statFs.getBlockCount() : statFs.getBlockCountLong()) * (Build.VERSION.SDK_INT < 18 ? (long) statFs.getBlockSize() : statFs.getBlockSizeLong())) / 50;
        } catch (IllegalArgumentException e2) {
        }
        return Math.max(Math.min(size, 52428800L), 5242880L);
    }

    static int a(Context context) {
        ActivityManager am = (ActivityManager) a(context, "activity");
        return (int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? am.getLargeMemoryClass() : am.getMemoryClass())) * 1048576) / 7);
    }

    static boolean c(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if (Build.VERSION.SDK_INT < 17) {
                if (Settings.System.getInt(contentResolver, "airplane_mode_on", 0) != 0) {
                    return true;
                }
                return false;
            } else if (Settings.Global.getInt(contentResolver, "airplane_mode_on", 0) != 0) {
                return true;
            } else {
                return false;
            }
        } catch (NullPointerException e2) {
            return false;
        } catch (SecurityException e3) {
            return false;
        }
    }

    static <T> T a(Context context, String service) {
        return (T) context.getSystemService(service);
    }

    static boolean b(Context context, String permission) {
        return context.checkCallingOrSelfPermission(permission) == 0;
    }

    static boolean a(e source) {
        return source.a(0, f۳۵۳۶b) && source.a(8, f۳۵۳۷c);
    }

    /* JADX INFO: Multiple debug info for r2v9 int: [D('type' java.lang.String), D('id' int)] */
    static int a(Resources resources, w data) {
        Uri uri;
        if (data.f۳۶۲۷e != 0 || (uri = data.f۳۶۲۶d) == null) {
            return data.f۳۶۲۷e;
        }
        String pkg = uri.getAuthority();
        if (pkg != null) {
            List<String> segments = data.f۳۶۲۶d.getPathSegments();
            if (segments == null || segments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + data.f۳۶۲۶d);
            } else if (segments.size() == 1) {
                try {
                    return Integer.parseInt(segments.get(0));
                } catch (NumberFormatException e2) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + data.f۳۶۲۶d);
                }
            } else if (segments.size() == 2) {
                return resources.getIdentifier(segments.get(1), segments.get(0), pkg);
            } else {
                throw new FileNotFoundException("More than two path segments: " + data.f۳۶۲۶d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + data.f۳۶۲۶d);
        }
    }

    static Resources a(Context context, w data) {
        Uri uri;
        if (data.f۳۶۲۷e != 0 || (uri = data.f۳۶۲۶d) == null) {
            return context.getResources();
        }
        String pkg = uri.getAuthority();
        if (pkg != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(pkg);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + data.f۳۶۲۶d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + data.f۳۶۲۶d);
        }
    }

    static class a extends Handler {
        a(Looper x0) {
            super(x0);
        }

        public void handleMessage(Message msg) {
            sendMessageDelayed(obtainMessage(), 1000);
        }
    }

    static void a(Looper looper) {
        Handler handler = new a(looper);
        handler.sendMessageDelayed(handler.obtainMessage(), 1000);
    }

    static class c implements ThreadFactory {
        c() {
        }

        public Thread newThread(Runnable r) {
            return new b(r);
        }
    }

    private static class b extends Thread {
        b(Runnable r) {
            super(r);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }
}
