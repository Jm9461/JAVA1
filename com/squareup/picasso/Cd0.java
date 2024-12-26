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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import p۱۴۹f.AbstractCe;
import p۱۴۹f.Cf;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.d0  reason: invalid class name */
public final class Cd0 {

    /* renamed from: a  reason: contains not printable characters */
    static final StringBuilder f۱۵۴۲۱a = new StringBuilder();

    /* renamed from: b  reason: contains not printable characters */
    private static final Cf f۱۵۴۲۲b = Cf.m۱۹۴۳۸d("RIFF");

    /* renamed from: c  reason: contains not printable characters */
    private static final Cf f۱۵۴۲۳c = Cf.m۱۹۴۳۸d("WEBP");

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۸۳۱۱a(Bitmap bitmap) {
        int result = Build.VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
        if (result >= 0) {
            return result;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* renamed from: a  reason: contains not printable characters */
    static <T> T m۱۸۳۱۵a(T value, String message) {
        if (value != null) {
            return value;
        }
        throw new NullPointerException(message);
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۸۳۲۰a() {
        if (!m۱۸۳۲۶b()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    static boolean m۱۸۳۲۶b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: a  reason: contains not printable characters */
    static String m۱۸۳۱۶a(RunnableCc hunter) {
        return m۱۸۳۱۷a(hunter, "");
    }

    /* renamed from: a  reason: contains not printable characters */
    static String m۱۸۳۱۷a(RunnableCc hunter, String prefix) {
        StringBuilder builder = new StringBuilder(prefix);
        AbstractCa action = hunter.m۱۸۲۸۵b();
        if (action != null) {
            builder.append(action.f۱۵۳۴۷b.m۱۸۴۲۲d());
        }
        List<Action> actions = hunter.m۱۸۲۸۷c();
        if (actions != null) {
            int count = actions.size();
            for (int i = 0; i < count; i++) {
                if (i > 0 || action != null) {
                    builder.append(", ");
                }
                builder.append(((AbstractCa) actions.get(i)).f۱۵۳۴۷b.m۱۸۴۲۲d());
            }
        }
        return builder.toString();
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۸۳۲۲a(String owner, String verb, String logId) {
        m۱۸۳۲۳a(owner, verb, logId, "");
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۸۳۲۳a(String owner, String verb, String logId, String extras) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", owner, verb, logId, extras));
    }

    /* renamed from: a  reason: contains not printable characters */
    static String m۱۸۳۱۸a(Cw data) {
        String result = m۱۸۳۱۹a(data, f۱۵۴۲۱a);
        f۱۵۴۲۱a.setLength(0);
        return result;
    }

    /* renamed from: a  reason: contains not printable characters */
    static String m۱۸۳۱۹a(Cw data, StringBuilder builder) {
        String str = data.f۱۵۵۳۷f;
        if (str != null) {
            builder.ensureCapacity(str.length() + 50);
            builder.append(data.f۱۵۵۳۷f);
        } else {
            Uri uri = data.f۱۵۵۳۵d;
            if (uri != null) {
                String path = uri.toString();
                builder.ensureCapacity(path.length() + 50);
                builder.append(path);
            } else {
                builder.ensureCapacity(50);
                builder.append(data.f۱۵۵۳۶e);
            }
        }
        builder.append('\n');
        if (data.f۱۵۵۴۵n != 0.0f) {
            builder.append("rotation:");
            builder.append(data.f۱۵۵۴۵n);
            if (data.f۱۵۵۴۸q) {
                builder.append('@');
                builder.append(data.f۱۵۵۴۶o);
                builder.append('x');
                builder.append(data.f۱۵۵۴۷p);
            }
            builder.append('\n');
        }
        if (data.m۱۸۴۲۱c()) {
            builder.append("resize:");
            builder.append(data.f۱۵۵۳۹h);
            builder.append('x');
            builder.append(data.f۱۵۵۴۰i);
            builder.append('\n');
        }
        if (data.f۱۵۵۴۱j) {
            builder.append("centerCrop:");
            builder.append(data.f۱۵۵۴۲k);
            builder.append('\n');
        } else if (data.f۱۵۵۴۳l) {
            builder.append("centerInside");
            builder.append('\n');
        }
        List<AbstractCc0> list = data.f۱۵۵۳۸g;
        if (list != null) {
            int count = list.size();
            for (int i = 0; i < count; i++) {
                builder.append(data.f۱۵۵۳۸g.get(i).m۱۸۳۰۲a());
                builder.append('\n');
            }
        }
        return builder.toString();
    }

    /* renamed from: b  reason: contains not printable characters */
    static File m۱۸۳۲۵b(Context context) {
        File cache = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!cache.exists()) {
            cache.mkdirs();
        }
        return cache;
    }

    @TargetApi(18)
    /* renamed from: a  reason: contains not printable characters */
    static long m۱۸۳۱۲a(File dir) {
        long size = 5242880;
        try {
            StatFs statFs = new StatFs(dir.getAbsolutePath());
            size = ((Build.VERSION.SDK_INT < 18 ? (long) statFs.getBlockCount() : statFs.getBlockCountLong()) * (Build.VERSION.SDK_INT < 18 ? (long) statFs.getBlockSize() : statFs.getBlockSizeLong())) / 50;
        } catch (IllegalArgumentException e) {
        }
        return Math.max(Math.min(size, 52428800L), 5242880L);
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۸۳۰۹a(Context context) {
        ActivityManager am = (ActivityManager) m۱۸۳۱۴a(context, "activity");
        return (int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? am.getLargeMemoryClass() : am.getMemoryClass())) * 1048576) / 7);
    }

    /* renamed from: c  reason: contains not printable characters */
    static boolean m۱۸۳۲۸c(Context context) {
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
        } catch (NullPointerException e) {
            return false;
        } catch (SecurityException e2) {
            return false;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static <T> T m۱۸۳۱۴a(Context context, String service) {
        return (T) context.getSystemService(service);
    }

    /* renamed from: b  reason: contains not printable characters */
    static boolean m۱۸۳۲۷b(Context context, String permission) {
        return context.checkCallingOrSelfPermission(permission) == 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۸۳۲۴a(AbstractCe source) {
        return source.m۱۹۴۱۹a(0, f۱۵۴۲۲b) && source.m۱۹۴۱۹a(8, f۱۵۴۲۳c);
    }

    /* JADX INFO: Multiple debug info for r2v9 int: [D('type' java.lang.String), D('id' int)] */
    /* renamed from: a  reason: contains not printable characters */
    static int m۱۸۳۱۰a(Resources resources, Cw data) {
        Uri uri;
        if (data.f۱۵۵۳۶e != 0 || (uri = data.f۱۵۵۳۵d) == null) {
            return data.f۱۵۵۳۶e;
        }
        String pkg = uri.getAuthority();
        if (pkg != null) {
            List<String> segments = data.f۱۵۵۳۵d.getPathSegments();
            if (segments == null || segments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + data.f۱۵۵۳۵d);
            } else if (segments.size() == 1) {
                try {
                    return Integer.parseInt(segments.get(0));
                } catch (NumberFormatException e) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + data.f۱۵۵۳۵d);
                }
            } else if (segments.size() == 2) {
                return resources.getIdentifier(segments.get(1), segments.get(0), pkg);
            } else {
                throw new FileNotFoundException("More than two path segments: " + data.f۱۵۵۳۵d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + data.f۱۵۵۳۵d);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static Resources m۱۸۳۱۳a(Context context, Cw data) {
        Uri uri;
        if (data.f۱۵۵۳۶e != 0 || (uri = data.f۱۵۵۳۵d) == null) {
            return context.getResources();
        }
        String pkg = uri.getAuthority();
        if (pkg != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(pkg);
            } catch (PackageManager.NameNotFoundException e) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + data.f۱۵۵۳۵d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + data.f۱۵۵۳۵d);
        }
    }

    /* renamed from: com.squareup.picasso.d0$a  reason: invalid class name */
    static class HandlerCa extends Handler {
        HandlerCa(Looper x0) {
            super(x0);
        }

        public void handleMessage(Message msg) {
            sendMessageDelayed(obtainMessage(), 1000);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۸۳۲۱a(Looper looper) {
        Handler handler = new HandlerCa(looper);
        handler.sendMessageDelayed(handler.obtainMessage(), 1000);
    }

    /* renamed from: com.squareup.picasso.d0$c  reason: invalid class name */
    static class ThreadFactoryCc implements ThreadFactory {
        ThreadFactoryCc() {
        }

        public Thread newThread(Runnable r) {
            return new Cb(r);
        }
    }

    /* renamed from: com.squareup.picasso.d0$b  reason: invalid class name */
    private static class Cb extends Thread {
        Cb(Runnable r) {
            super(r);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }
}
