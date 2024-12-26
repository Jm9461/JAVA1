package h.a.a;

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

public class a implements b {

    public interface b {
        void a(d dVar, int i);

        void a(File file, d dVar, int i);

        void a(Exception exc, d dVar, int i);
    }

    public enum d {
        GALLERY,
        DOCUMENTS,
        CAMERA
    }

    private static Uri c(Context context) {
        File imagePath = c.a(context);
        String packageName = context.getApplicationContext().getPackageName();
        Uri uri = FileProvider.a(context, packageName + ".easyphotopicker.fileprovider", imagePath);
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putString("pl.aprilapps.easyphotopicker.photo_uri", uri.toString());
        editor.putString("pl.aprilapps.easyphotopicker.last_photo", imagePath.toString());
        editor.apply();
        return uri;
    }

    private static Intent b(Context context, int type) {
        c(context, type);
        return new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    }

    private static Intent a(Context context, int type) {
        c(context, type);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        try {
            Uri capturedImageUri = c(context);
            a(context, intent, capturedImageUri);
            intent.putExtra("output", capturedImageUri);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return intent;
    }

    private static void a(Context context, Uri uri) {
        context.revokeUriPermission(uri, 3);
    }

    private static void a(Context context, Intent intent, Uri uri) {
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            context.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 3);
        }
    }

    private static void c(Context context, int type) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("pl.aprilapps.easyphotopicker.type", type).commit();
    }

    private static int e(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("pl.aprilapps.easyphotopicker.type", 0);
    }

    public static void b(Activity activity, int type) {
        activity.startActivityForResult(b((Context) activity, type), 7458);
    }

    public static void a(Activity activity, int type) {
        activity.startActivityForResult(a((Context) activity, type), 7459);
    }

    private static File f(Context context) {
        String lastCameraPhoto = PreferenceManager.getDefaultSharedPreferences(context).getString("pl.aprilapps.easyphotopicker.last_photo", null);
        if (lastCameraPhoto != null) {
            return new File(lastCameraPhoto);
        }
        return null;
    }

    public static void a(int requestCode, int resultCode, Intent data, Activity activity, b callbacks) {
        if (requestCode != 7460 && requestCode != 7458 && requestCode != 7459 && requestCode != 7457) {
            return;
        }
        if (resultCode == -1) {
            if (requestCode == 7457) {
                a(data, activity, callbacks);
            } else if (requestCode == 7458) {
                b(data, activity, callbacks);
            } else if (requestCode == 7459) {
                a(activity, callbacks);
            } else if (data == null || data.getData() == null) {
                a(activity, callbacks);
            } else {
                a(data, activity, callbacks);
            }
        } else if (requestCode == 7457) {
            callbacks.a(d.DOCUMENTS, e(activity));
        } else if (requestCode == 7458) {
            callbacks.a(d.GALLERY, e(activity));
        } else if (requestCode == 7459) {
            callbacks.a(d.CAMERA, e(activity));
        } else if (data == null || data.getData() == null) {
            callbacks.a(d.CAMERA, e(activity));
        } else {
            callbacks.a(d.DOCUMENTS, e(activity));
        }
    }

    public static File d(Context context) {
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

    private static void a(Intent data, Activity activity, b callbacks) {
        try {
            callbacks.a(c.b(activity, data.getData()), d.DOCUMENTS, e(activity));
        } catch (Exception e2) {
            e2.printStackTrace();
            callbacks.a(e2, d.DOCUMENTS, e(activity));
        }
    }

    private static void b(Intent data, Activity activity, b callbacks) {
        try {
            callbacks.a(c.b(activity, data.getData()), d.GALLERY, e(activity));
        } catch (Exception e2) {
            e2.printStackTrace();
            callbacks.a(e2, d.GALLERY, e(activity));
        }
    }

    private static void a(Activity activity, b callbacks) {
        try {
            String lastImageUri = PreferenceManager.getDefaultSharedPreferences(activity).getString("pl.aprilapps.easyphotopicker.photo_uri", null);
            if (!TextUtils.isEmpty(lastImageUri)) {
                a(activity, Uri.parse(lastImageUri));
            }
            File photoFile = f(activity);
            if (photoFile == null) {
                callbacks.a(new IllegalStateException("Unable to get the picture returned from camera"), d.CAMERA, e(activity));
            } else {
                callbacks.a(photoFile, d.CAMERA, e(activity));
            }
            PreferenceManager.getDefaultSharedPreferences(activity).edit().remove("pl.aprilapps.easyphotopicker.last_photo").remove("pl.aprilapps.easyphotopicker.photo_uri").apply();
        } catch (Exception e2) {
            e2.printStackTrace();
            callbacks.a(e2, d.CAMERA, e(activity));
        }
    }

    public static void a(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().remove("pl.aprilapps.folder_name").remove("pl.aprilapps.folder_location").remove("pl.aprilapps.public_temp").apply();
    }

    public static c b(Context context) {
        return new c(context);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private Context f۴۲۴۳a;

        private c(Context context) {
            this.f۴۲۴۳a = context;
        }

        public c a(String folderName) {
            PreferenceManager.getDefaultSharedPreferences(this.f۴۲۴۳a).edit().putString("pl.aprilapps.folder_name", folderName).commit();
            return this;
        }

        public c a(boolean copyToPublicLocation) {
            PreferenceManager.getDefaultSharedPreferences(this.f۴۲۴۳a).edit().putBoolean("pl.aprilapps.public_temp", copyToPublicLocation).commit();
            return this;
        }
    }
}
