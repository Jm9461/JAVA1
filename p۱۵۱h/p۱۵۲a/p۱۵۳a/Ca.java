package p۱۵۱h.p۱۵۲a.p۱۵۳a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.support.p۰۴۳v4.content.FileProvider;
import android.text.TextUtils;
import java.io.File;

/* renamed from: h.a.a.a  reason: invalid class name */
public class Ca implements AbstractCb {

    /* renamed from: h.a.a.a$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۹۶۳۶a(EnumCd dVar, int i);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۹۶۳۷a(File file, EnumCd dVar, int i);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۹۶۳۸a(Exception exc, EnumCd dVar, int i);
    }

    /* renamed from: h.a.a.a$d  reason: invalid class name */
    public enum EnumCd {
        GALLERY,
        DOCUMENTS,
        CAMERA
    }

    /* renamed from: c  reason: contains not printable characters */
    private static Uri m۱۹۶۳۱c(Context context) {
        File imagePath = Cc.m۱۹۶۴۱a(context);
        String packageName = context.getApplicationContext().getPackageName();
        Uri uri = FileProvider.m۱۲۶۰۹a(context, packageName + ".easyphotopicker.fileprovider", imagePath);
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putString("pl.aprilapps.easyphotopicker.photo_uri", uri.toString());
        editor.putString("pl.aprilapps.easyphotopicker.last_photo", imagePath.toString());
        editor.apply();
        return uri;
    }

    /* renamed from: b  reason: contains not printable characters */
    private static Intent m۱۹۶۲۷b(Context context, int type) {
        m۱۹۶۳۲c(context, type);
        return new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Intent m۱۹۶۱۹a(Context context, int type) {
        m۱۹۶۳۲c(context, type);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        try {
            Uri capturedImageUri = m۱۹۶۳۱c(context);
            m۱۹۶۲۴a(context, intent, capturedImageUri);
            intent.putExtra("output", capturedImageUri);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return intent;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۹۶۲۵a(Context context, Uri uri) {
        context.revokeUriPermission(uri, 3);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۹۶۲۴a(Context context, Intent intent, Uri uri) {
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            context.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 3);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private static void m۱۹۶۳۲c(Context context, int type) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("pl.aprilapps.easyphotopicker.type", type).commit();
    }

    /* renamed from: e  reason: contains not printable characters */
    private static int m۱۹۶۳۴e(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("pl.aprilapps.easyphotopicker.type", 0);
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۹۶۲۹b(Activity activity, int type) {
        activity.startActivityForResult(m۱۹۶۲۷b((Context) activity, type), 7458);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۹۶۲۱a(Activity activity, int type) {
        activity.startActivityForResult(m۱۹۶۱۹a((Context) activity, type), 7459);
    }

    /* renamed from: f  reason: contains not printable characters */
    private static File m۱۹۶۳۵f(Context context) {
        String lastCameraPhoto = PreferenceManager.getDefaultSharedPreferences(context).getString("pl.aprilapps.easyphotopicker.last_photo", null);
        if (lastCameraPhoto != null) {
            return new File(lastCameraPhoto);
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۹۶۲۰a(int requestCode, int resultCode, Intent data, Activity activity, AbstractCb callbacks) {
        if (requestCode != 7460 && requestCode != 7458 && requestCode != 7459 && requestCode != 7457) {
            return;
        }
        if (resultCode == -1) {
            if (requestCode == 7457) {
                m۱۹۶۲۶a(data, activity, callbacks);
            } else if (requestCode == 7458) {
                m۱۹۶۳۰b(data, activity, callbacks);
            } else if (requestCode == 7459) {
                m۱۹۶۲۲a(activity, callbacks);
            } else if (data == null || data.getData() == null) {
                m۱۹۶۲۲a(activity, callbacks);
            } else {
                m۱۹۶۲۶a(data, activity, callbacks);
            }
        } else if (requestCode == 7457) {
            callbacks.m۱۹۶۳۶a(EnumCd.DOCUMENTS, m۱۹۶۳۴e(activity));
        } else if (requestCode == 7458) {
            callbacks.m۱۹۶۳۶a(EnumCd.GALLERY, m۱۹۶۳۴e(activity));
        } else if (requestCode == 7459) {
            callbacks.m۱۹۶۳۶a(EnumCd.CAMERA, m۱۹۶۳۴e(activity));
        } else if (data == null || data.getData() == null) {
            callbacks.m۱۹۶۳۶a(EnumCd.CAMERA, m۱۹۶۳۴e(activity));
        } else {
            callbacks.m۱۹۶۳۶a(EnumCd.DOCUMENTS, m۱۹۶۳۴e(activity));
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public static File m۱۹۶۳۳d(Context context) {
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

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۹۶۲۶a(Intent data, Activity activity, AbstractCb callbacks) {
        try {
            callbacks.m۱۹۶۳۷a(Cc.m۱۹۶۴۵b(activity, data.getData()), EnumCd.DOCUMENTS, m۱۹۶۳۴e(activity));
        } catch (Exception e) {
            e.printStackTrace();
            callbacks.m۱۹۶۳۸a(e, EnumCd.DOCUMENTS, m۱۹۶۳۴e(activity));
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private static void m۱۹۶۳۰b(Intent data, Activity activity, AbstractCb callbacks) {
        try {
            callbacks.m۱۹۶۳۷a(Cc.m۱۹۶۴۵b(activity, data.getData()), EnumCd.GALLERY, m۱۹۶۳۴e(activity));
        } catch (Exception e) {
            e.printStackTrace();
            callbacks.m۱۹۶۳۸a(e, EnumCd.GALLERY, m۱۹۶۳۴e(activity));
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۹۶۲۲a(Activity activity, AbstractCb callbacks) {
        try {
            String lastImageUri = PreferenceManager.getDefaultSharedPreferences(activity).getString("pl.aprilapps.easyphotopicker.photo_uri", null);
            if (!TextUtils.isEmpty(lastImageUri)) {
                m۱۹۶۲۵a(activity, Uri.parse(lastImageUri));
            }
            File photoFile = m۱۹۶۳۵f(activity);
            if (photoFile == null) {
                callbacks.m۱۹۶۳۸a(new IllegalStateException("Unable to get the picture returned from camera"), EnumCd.CAMERA, m۱۹۶۳۴e(activity));
            } else {
                callbacks.m۱۹۶۳۷a(photoFile, EnumCd.CAMERA, m۱۹۶۳۴e(activity));
            }
            PreferenceManager.getDefaultSharedPreferences(activity).edit().remove("pl.aprilapps.easyphotopicker.last_photo").remove("pl.aprilapps.easyphotopicker.photo_uri").apply();
        } catch (Exception e) {
            e.printStackTrace();
            callbacks.m۱۹۶۳۸a(e, EnumCd.CAMERA, m۱۹۶۳۴e(activity));
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۹۶۲۳a(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().remove("pl.aprilapps.folder_name").remove("pl.aprilapps.folder_location").remove("pl.aprilapps.public_temp").apply();
    }

    /* renamed from: b  reason: contains not printable characters */
    public static Cc m۱۹۶۲۸b(Context context) {
        return new Cc(context);
    }

    /* renamed from: h.a.a.a$c  reason: invalid class name */
    public static class Cc {

        /* renamed from: a  reason: contains not printable characters */
        private Context f۱۶۳۳۸a;

        private Cc(Context context) {
            this.f۱۶۳۳۸a = context;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۹۶۳۹a(String folderName) {
            PreferenceManager.getDefaultSharedPreferences(this.f۱۶۳۳۸a).edit().putString("pl.aprilapps.folder_name", folderName).commit();
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۹۶۴۰a(boolean copyToPublicLocation) {
            PreferenceManager.getDefaultSharedPreferences(this.f۱۶۳۳۸a).edit().putBoolean("pl.aprilapps.public_temp", copyToPublicLocation).commit();
            return this;
        }
    }
}
