package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f۱۲۸۳a;

    /* renamed from: b  reason: collision with root package name */
    Object f۱۲۸۴b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f۱۲۸۵c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f۱۲۸۶d;

    /* renamed from: e  reason: collision with root package name */
    public int f۱۲۸۷e;

    /* renamed from: f  reason: collision with root package name */
    public int f۱۲۸۸f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f۱۲۸۹g = null;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f۱۲۹۰h = j;
    public String i;

    public String b() {
        if (this.f۱۲۸۳a == -1 && Build.VERSION.SDK_INT >= 23) {
            return b((Icon) this.f۱۲۸۴b);
        }
        if (this.f۱۲۸۳a == 2) {
            return ((String) this.f۱۲۸۴b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int a() {
        if (this.f۱۲۸۳a == -1 && Build.VERSION.SDK_INT >= 23) {
            return a((Icon) this.f۱۲۸۴b);
        }
        if (this.f۱۲۸۳a == 2) {
            return this.f۱۲۸۷e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r1 != 5) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    public void a(boolean isStream) {
        this.i = this.f۱۲۹۰h.name();
        int i2 = this.f۱۲۸۳a;
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.f۱۲۸۵c = ((String) this.f۱۲۸۴b).getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i2 == 3) {
                    this.f۱۲۸۵c = (byte[]) this.f۱۲۸۴b;
                    return;
                } else if (i2 == 4) {
                    this.f۱۲۸۵c = this.f۱۲۸۴b.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i2 != 5) {
                    return;
                }
            }
            if (isStream) {
                ByteArrayOutputStream data = new ByteArrayOutputStream();
                ((Bitmap) this.f۱۲۸۴b).compress(Bitmap.CompressFormat.PNG, 90, data);
                this.f۱۲۸۵c = data.toByteArray();
                return;
            }
            this.f۱۲۸۶d = (Parcelable) this.f۱۲۸۴b;
        } else if (!isStream) {
            this.f۱۲۸۶d = (Parcelable) this.f۱۲۸۴b;
        } else {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
    }

    public void c() {
        this.f۱۲۹۰h = PorterDuff.Mode.valueOf(this.i);
        int i2 = this.f۱۲۸۳a;
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this.f۱۲۸۴b = this.f۱۲۸۵c;
                        return;
                    } else if (i2 != 4) {
                        if (i2 != 5) {
                            return;
                        }
                    }
                }
                this.f۱۲۸۴b = new String(this.f۱۲۸۵c, Charset.forName("UTF-16"));
                return;
            }
            Parcelable parcelable = this.f۱۲۸۶d;
            if (parcelable != null) {
                this.f۱۲۸۴b = parcelable;
                return;
            }
            byte[] bArr = this.f۱۲۸۵c;
            this.f۱۲۸۴b = bArr;
            this.f۱۲۸۳a = 3;
            this.f۱۲۸۷e = 0;
            this.f۱۲۸۸f = bArr.length;
            return;
        }
        Parcelable parcelable2 = this.f۱۲۸۶d;
        if (parcelable2 != null) {
            this.f۱۲۸۴b = parcelable2;
            return;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    private static String a(int x) {
        if (x == 1) {
            return "BITMAP";
        }
        if (x == 2) {
            return "RESOURCE";
        }
        if (x == 3) {
            return "DATA";
        }
        if (x == 4) {
            return "URI";
        }
        if (x != 5) {
            return "UNKNOWN";
        }
        return "BITMAP_MASKABLE";
    }

    private static String b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    private static int a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }
}
