package p۳۰۷h.p۳۰۸a.p۳۰۹a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import java.io.File;
import java.util.List;

/* renamed from: h.a.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca implements InterfaceCb {

    /* renamed from: h.a.a.a$b */
    public interface b {
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۷۵۵۹a(d dVar, int i);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۷۵۶۰a(File file, d dVar, int i);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۷۵۶۱a(Exception exc, d dVar, int i);
    }

    /* renamed from: h.a.a.a$d */
    public enum d {
        GALLERY,
        DOCUMENTS,
        CAMERA
    }

    /* renamed from: c, reason: contains not printable characters */
    private static Uri m۱۷۵۵۴c(Context context) {
        File imagePath = Cc.m۱۷۵۶۴a(context);
        String packageName = context.getApplicationContext().getPackageName();
        String authority = packageName + ".easyphotopicker.fileprovider";
        Uri uri = FileProvider.m۱۰۵۳۹a(context, authority, imagePath);
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putString("pl.aprilapps.easyphotopicker.photo_uri", uri.toString());
        editor.putString("pl.aprilapps.easyphotopicker.last_photo", imagePath.toString());
        editor.apply();
        return uri;
    }

    /* renamed from: b, reason: contains not printable characters */
    private static Intent m۱۷۵۵۰b(Context context, int type) {
        m۱۷۵۵۵c(context, type);
        return new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Intent m۱۷۵۴۲a(Context context, int type) {
        m۱۷۵۵۵c(context, type);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        try {
            Uri capturedImageUri = m۱۷۵۵۴c(context);
            m۱۷۵۴۷a(context, intent, capturedImageUri);
            intent.putExtra("output", capturedImageUri);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return intent;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۷۵۴۸a(Context context, Uri uri) {
        context.revokeUriPermission(uri, 3);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۷۵۴۷a(Context context, Intent intent, Uri uri) {
        List<ResolveInfo> resInfoList = context.getPackageManager().queryIntentActivities(intent, 65536);
        for (ResolveInfo resolveInfo : resInfoList) {
            String packageName = resolveInfo.activityInfo.packageName;
            context.grantUriPermission(packageName, uri, 3);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private static void m۱۷۵۵۵c(Context context, int type) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("pl.aprilapps.easyphotopicker.type", type).commit();
    }

    /* renamed from: e, reason: contains not printable characters */
    private static int m۱۷۵۵۷e(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("pl.aprilapps.easyphotopicker.type", 0);
    }

    /* renamed from: b, reason: contains not printable characters */
    public static void m۱۷۵۵۲b(Activity activity, int type) {
        Intent intent = m۱۷۵۵۰b((Context) activity, type);
        activity.startActivityForResult(intent, 7458);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۷۵۴۴a(Activity activity, int type) {
        Intent intent = m۱۷۵۴۲a((Context) activity, type);
        activity.startActivityForResult(intent, 7459);
    }

    /* renamed from: f, reason: contains not printable characters */
    private static File m۱۷۵۵۸f(Context context) {
        String lastCameraPhoto = PreferenceManager.getDefaultSharedPreferences(context).getString("pl.aprilapps.easyphotopicker.last_photo", null);
        if (lastCameraPhoto != null) {
            return new File(lastCameraPhoto);
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۷۵۴۳a(int requestCode, int resultCode, Intent data, Activity activity, b callbacks) {
        if (requestCode == 7460 || requestCode == 7458 || requestCode == 7459 || requestCode == 7457) {
            if (resultCode == -1) {
                if (requestCode == 7457) {
                    m۱۷۵۴۹a(data, activity, callbacks);
                    return;
                }
                if (requestCode == 7458) {
                    m۱۷۵۵۳b(data, activity, callbacks);
                    return;
                }
                if (requestCode == 7459) {
                    m۱۷۵۴۵a(activity, callbacks);
                    return;
                } else if (data == null || data.getData() == null) {
                    m۱۷۵۴۵a(activity, callbacks);
                    return;
                } else {
                    m۱۷۵۴۹a(data, activity, callbacks);
                    return;
                }
            }
            if (requestCode == 7457) {
                callbacks.mo۱۷۵۵۹a(d.DOCUMENTS, m۱۷۵۵۷e(activity));
                return;
            }
            if (requestCode == 7458) {
                callbacks.mo۱۷۵۵۹a(d.GALLERY, m۱۷۵۵۷e(activity));
                return;
            }
            if (requestCode == 7459) {
                callbacks.mo۱۷۵۵۹a(d.CAMERA, m۱۷۵۵۷e(activity));
            } else if (data == null || data.getData() == null) {
                callbacks.mo۱۷۵۵۹a(d.CAMERA, m۱۷۵۵۷e(activity));
            } else {
                callbacks.mo۱۷۵۵۹a(d.DOCUMENTS, m۱۷۵۵۷e(activity));
            }
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    public static File m۱۷۵۵۶d(Context context) {
        String filePath = PreferenceManager.getDefaultSharedPreferences(context).getString("pl.aprilapps.easyphotopicker.last_photo", null);
        if (filePath == null) {
            return null;
        }
        File file = new File(filePath);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۷۵۴۹a(Intent data, Activity activity, b callbacks) {
        try {
            Uri photoPath = data.getData();
            File photoFile = Cc.m۱۷۵۶۸b(activity, photoPath);
            callbacks.mo۱۷۵۶۰a(photoFile, d.DOCUMENTS, m۱۷۵۵۷e(activity));
        } catch (Exception e2) {
            e2.printStackTrace();
            callbacks.mo۱۷۵۶۱a(e2, d.DOCUMENTS, m۱۷۵۵۷e(activity));
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private static void m۱۷۵۵۳b(Intent data, Activity activity, b callbacks) {
        try {
            Uri photoPath = data.getData();
            File photoFile = Cc.m۱۷۵۶۸b(activity, photoPath);
            callbacks.mo۱۷۵۶۰a(photoFile, d.GALLERY, m۱۷۵۵۷e(activity));
        } catch (Exception e2) {
            e2.printStackTrace();
            callbacks.mo۱۷۵۶۱a(e2, d.GALLERY, m۱۷۵۵۷e(activity));
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۷۵۴۵a(Activity activity, b callbacks) {
        try {
            String lastImageUri = PreferenceManager.getDefaultSharedPreferences(activity).getString("pl.aprilapps.easyphotopicker.photo_uri", null);
            if (!TextUtils.isEmpty(lastImageUri)) {
                m۱۷۵۴۸a(activity, Uri.parse(lastImageUri));
            }
            File photoFile = m۱۷۵۵۸f(activity);
            if (photoFile == null) {
                callbacks.mo۱۷۵۶۱a(new IllegalStateException("Unable to get the picture returned from camera"), d.CAMERA, m۱۷۵۵۷e(activity));
            } else {
                callbacks.mo۱۷۵۶۰a(photoFile, d.CAMERA, m۱۷۵۵۷e(activity));
            }
            PreferenceManager.getDefaultSharedPreferences(activity).edit().remove("pl.aprilapps.easyphotopicker.last_photo").remove("pl.aprilapps.easyphotopicker.photo_uri").apply();
        } catch (Exception e2) {
            e2.printStackTrace();
            callbacks.mo۱۷۵۶۱a(e2, d.CAMERA, m۱۷۵۵۷e(activity));
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۷۵۴۶a(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().remove("pl.aprilapps.folder_name").remove("pl.aprilapps.folder_location").remove("pl.aprilapps.public_temp").apply();
    }

    /* renamed from: b, reason: contains not printable characters */
    public static c m۱۷۵۵۱b(Context context) {
        return new c(context);
    }

    /* renamed from: h.a.a.a$c */
    public static class c {

        /* renamed from: a, reason: contains not printable characters */
        private Context f۱۶۳۳۸a;

        private c(Context context) {
            this.f۱۶۳۳۸a = context;
        }

        /* renamed from: a, reason: contains not printable characters */
        public c m۱۷۵۶۲a(String folderName) {
            PreferenceManager.getDefaultSharedPreferences(this.f۱۶۳۳۸a).edit().putString("pl.aprilapps.folder_name", folderName).commit();
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public c m۱۷۵۶۳a(boolean copyToPublicLocation) {
            PreferenceManager.getDefaultSharedPreferences(this.f۱۶۳۳۸a).edit().putBoolean("pl.aprilapps.public_temp", copyToPublicLocation).commit();
            return this;
        }
    }
}
