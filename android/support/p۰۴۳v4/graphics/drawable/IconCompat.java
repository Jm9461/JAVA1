package android.support.p۰۴۳v4.graphics.drawable;

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

/* renamed from: android.support.v4.graphics.drawable.IconCompat */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j  reason: contains not printable characters */
    static final PorterDuff.Mode f۱۰۴۸۱j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: contains not printable characters */
    public int f۱۰۴۸۲a;

    /* renamed from: b  reason: contains not printable characters */
    Object f۱۰۴۸۳b;

    /* renamed from: c  reason: contains not printable characters */
    public byte[] f۱۰۴۸۴c;

    /* renamed from: d  reason: contains not printable characters */
    public Parcelable f۱۰۴۸۵d;

    /* renamed from: e  reason: contains not printable characters */
    public int f۱۰۴۸۶e;

    /* renamed from: f  reason: contains not printable characters */
    public int f۱۰۴۸۷f;

    /* renamed from: g  reason: contains not printable characters */
    public ColorStateList f۱۰۴۸۸g = null;

    /* renamed from: h  reason: contains not printable characters */
    PorterDuff.Mode f۱۰۴۸۹h = f۱۰۴۸۱j;

    /* renamed from: i  reason: contains not printable characters */
    public String f۱۰۴۹۰i;

    /* renamed from: b  reason: contains not printable characters */
    public String m۱۲۷۰۴b() {
        if (this.f۱۰۴۸۲a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m۱۲۷۰۱b((Icon) this.f۱۰۴۸۳b);
        }
        if (this.f۱۰۴۸۲a == 2) {
            return ((String) this.f۱۰۴۸۳b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۲۷۰۲a() {
        if (this.f۱۰۴۸۲a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m۱۲۶۹۹a((Icon) this.f۱۰۴۸۳b);
        }
        if (this.f۱۰۴۸۲a == 2) {
            return this.f۱۰۴۸۶e;
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۳v4.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۷۰۳a(boolean isStream) {
        this.f۱۰۴۹۰i = this.f۱۰۴۸۹h.name();
        int i = this.f۱۰۴۸۲a;
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    this.f۱۰۴۸۴c = ((String) this.f۱۰۴۸۳b).getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i == 3) {
                    this.f۱۰۴۸۴c = (byte[]) this.f۱۰۴۸۳b;
                    return;
                } else if (i == 4) {
                    this.f۱۰۴۸۴c = this.f۱۰۴۸۳b.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (isStream) {
                ByteArrayOutputStream data = new ByteArrayOutputStream();
                ((Bitmap) this.f۱۰۴۸۳b).compress(Bitmap.CompressFormat.PNG, 90, data);
                this.f۱۰۴۸۴c = data.toByteArray();
                return;
            }
            this.f۱۰۴۸۵d = (Parcelable) this.f۱۰۴۸۳b;
        } else if (!isStream) {
            this.f۱۰۴۸۵d = (Parcelable) this.f۱۰۴۸۳b;
        } else {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۷۰۵c() {
        this.f۱۰۴۸۹h = PorterDuff.Mode.valueOf(this.f۱۰۴۹۰i);
        int i = this.f۱۰۴۸۲a;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f۱۰۴۸۳b = this.f۱۰۴۸۴c;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.f۱۰۴۸۳b = new String(this.f۱۰۴۸۴c, Charset.forName("UTF-16"));
                return;
            }
            Parcelable parcelable = this.f۱۰۴۸۵d;
            if (parcelable != null) {
                this.f۱۰۴۸۳b = parcelable;
                return;
            }
            byte[] bArr = this.f۱۰۴۸۴c;
            this.f۱۰۴۸۳b = bArr;
            this.f۱۰۴۸۲a = 3;
            this.f۱۰۴۸۶e = 0;
            this.f۱۰۴۸۷f = bArr.length;
            return;
        }
        Parcelable parcelable2 = this.f۱۰۴۸۵d;
        if (parcelable2 != null) {
            this.f۱۰۴۸۳b = parcelable2;
            return;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    /* renamed from: a  reason: contains not printable characters */
    private static String m۱۲۷۰۰a(int x) {
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

    /* renamed from: b  reason: contains not printable characters */
    private static String m۱۲۷۰۱b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۲۶۹۹a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }
}
