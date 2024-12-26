package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f۱۲۴۲d = {"_display_name", "_size"};

    /* renamed from: e  reason: collision with root package name */
    private static final File f۱۲۴۳e = new File("/");

    /* renamed from: f  reason: collision with root package name */
    private static HashMap<String, a> f۱۲۴۴f = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private a f۱۲۴۵c;

    /* access modifiers changed from: package-private */
    public interface a {
        Uri a(File file);

        File a(Uri uri);
    }

    public boolean onCreate() {
        return true;
    }

    public void attachInfo(Context context, ProviderInfo info2) {
        super.attachInfo(context, info2);
        if (info2.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (info2.grantUriPermissions) {
            this.f۱۲۴۵c = a(context, info2.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public static Uri a(Context context, String authority, File file) {
        return a(context, authority).a(file);
    }

    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        File file = this.f۱۲۴۵c.a(uri);
        if (projection == null) {
            projection = f۱۲۴۲d;
        }
        String[] cols = new String[projection.length];
        Object[] values = new Object[projection.length];
        int i = 0;
        for (String col : projection) {
            if ("_display_name".equals(col)) {
                cols[i] = "_display_name";
                values[i] = file.getName();
                i++;
            } else if ("_size".equals(col)) {
                cols[i] = "_size";
                values[i] = Long.valueOf(file.length());
                i++;
            }
        }
        String[] cols2 = a(cols, i);
        Object[] values2 = a(values, i);
        MatrixCursor cursor = new MatrixCursor(cols2, 1);
        cursor.addRow(values2);
        return cursor;
    }

    public String getType(Uri uri) {
        String mime;
        File file = this.f۱۲۴۵c.a(uri);
        int lastDot = file.getName().lastIndexOf(46);
        if (lastDot < 0 || (mime = MimeTypeMap.getSingleton().getMimeTypeFromExtension(file.getName().substring(lastDot + 1))) == null) {
            return "application/octet-stream";
        }
        return mime;
    }

    public Uri insert(Uri uri, ContentValues values) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        throw new UnsupportedOperationException("No external updates");
    }

    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return this.f۱۲۴۵c.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String mode) {
        return ParcelFileDescriptor.open(this.f۱۲۴۵c.a(uri), a(mode));
    }

    private static a a(Context context, String authority) {
        synchronized (f۱۲۴۴f) {
            try {
                a strat = f۱۲۴۴f.get(authority);
                if (strat == null) {
                    try {
                        strat = b(context, authority);
                        f۱۲۴۴f.put(authority, strat);
                    } catch (IOException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    } catch (XmlPullParserException e3) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                return strat;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    private static a b(Context context, String authority) {
        b strat = new b(authority);
        XmlResourceParser in = context.getPackageManager().resolveContentProvider(authority, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (in != null) {
            while (true) {
                int type = in.next();
                if (type == 1) {
                    return strat;
                }
                if (type == 2) {
                    String tag = in.getName();
                    String name = in.getAttributeValue(null, "name");
                    String path = in.getAttributeValue(null, "path");
                    File target = null;
                    if ("root-path".equals(tag)) {
                        target = f۱۲۴۳e;
                    } else if ("files-path".equals(tag)) {
                        target = context.getFilesDir();
                    } else if ("cache-path".equals(tag)) {
                        target = context.getCacheDir();
                    } else if ("external-path".equals(tag)) {
                        target = Environment.getExternalStorageDirectory();
                    } else if ("external-files-path".equals(tag)) {
                        File[] externalFilesDirs = a.b(context, (String) null);
                        if (externalFilesDirs.length > 0) {
                            target = externalFilesDirs[0];
                        }
                    } else if ("external-cache-path".equals(tag)) {
                        File[] externalCacheDirs = a.a(context);
                        if (externalCacheDirs.length > 0) {
                            target = externalCacheDirs[0];
                        }
                    } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(tag)) {
                        File[] externalMediaDirs = context.getExternalMediaDirs();
                        if (externalMediaDirs.length > 0) {
                            target = externalMediaDirs[0];
                        }
                    }
                    if (target != null) {
                        strat.a(name, a(target, path));
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final String f۱۲۴۶a;

        /* renamed from: b  reason: collision with root package name */
        private final HashMap<String, File> f۱۲۴۷b = new HashMap<>();

        b(String authority) {
            this.f۱۲۴۶a = authority;
        }

        /* access modifiers changed from: package-private */
        public void a(String name, File root) {
            if (!TextUtils.isEmpty(name)) {
                try {
                    this.f۱۲۴۷b.put(name, root.getCanonicalFile());
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + root, e2);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }

        @Override // android.support.v4.content.FileProvider.a
        public Uri a(File file) {
            String path;
            try {
                String path2 = file.getCanonicalPath();
                Map.Entry<String, File> mostSpecific = null;
                for (Map.Entry<String, File> root : this.f۱۲۴۷b.entrySet()) {
                    String rootPath = root.getValue().getPath();
                    if (path2.startsWith(rootPath) && (mostSpecific == null || rootPath.length() > mostSpecific.getValue().getPath().length())) {
                        mostSpecific = root;
                    }
                }
                if (mostSpecific != null) {
                    String rootPath2 = mostSpecific.getValue().getPath();
                    if (rootPath2.endsWith("/")) {
                        path = path2.substring(rootPath2.length());
                    } else {
                        path = path2.substring(rootPath2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.f۱۲۴۶a).encodedPath(Uri.encode(mostSpecific.getKey()) + '/' + Uri.encode(path, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + path2);
            } catch (IOException e2) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // android.support.v4.content.FileProvider.a
        public File a(Uri uri) {
            String path = uri.getEncodedPath();
            int splitIndex = path.indexOf(47, 1);
            String tag = Uri.decode(path.substring(1, splitIndex));
            String path2 = Uri.decode(path.substring(splitIndex + 1));
            File root = this.f۱۲۴۷b.get(tag);
            if (root != null) {
                File file = new File(root, path2);
                try {
                    File file2 = file.getCanonicalFile();
                    if (file2.getPath().startsWith(root.getPath())) {
                        return file2;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
        }
    }

    private static int a(String mode) {
        if ("r".equals(mode)) {
            return 268435456;
        }
        if ("w".equals(mode) || "wt".equals(mode)) {
            return 738197504;
        }
        if ("wa".equals(mode)) {
            return 704643072;
        }
        if ("rw".equals(mode)) {
            return 939524096;
        }
        if ("rwt".equals(mode)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + mode);
    }

    private static File a(File base, String... segments) {
        File cur = base;
        for (String segment : segments) {
            if (segment != null) {
                cur = new File(cur, segment);
            }
        }
        return cur;
    }

    private static String[] a(String[] original, int newLength) {
        String[] result = new String[newLength];
        System.arraycopy(original, 0, result, 0, newLength);
        return result;
    }

    private static Object[] a(Object[] original, int newLength) {
        Object[] result = new Object[newLength];
        System.arraycopy(original, 0, result, 0, newLength);
        return result;
    }
}
