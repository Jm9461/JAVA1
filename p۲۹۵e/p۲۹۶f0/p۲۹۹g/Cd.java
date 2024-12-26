package p۲۹۵e.p۲۹۶f0.p۲۹۹g;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p۲۹۵e.p۲۹۶f0.Cc;

/* renamed from: e.f0.g.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cd {

    /* renamed from: a, reason: contains not printable characters */
    private static final ThreadLocal<DateFormat> f۱۵۸۲۲a = new a();

    /* renamed from: b, reason: contains not printable characters */
    private static final String[] f۱۵۸۲۳b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: c, reason: contains not printable characters */
    private static final DateFormat[] f۱۵۸۲۴c = new DateFormat[f۱۵۸۲۳b.length];

    /* renamed from: e.f0.g.d$a */
    final class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            DateFormat rfc1123 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            rfc1123.setLenient(false);
            rfc1123.setTimeZone(Cc.f۱۵۷۰۷e);
            return rfc1123;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Date m۱۶۶۸۳a(String value) {
        if (value.length() == 0) {
            return null;
        }
        ParsePosition position = new ParsePosition(0);
        Date result = f۱۵۸۲۲a.get().parse(value, position);
        if (position.getIndex() == value.length()) {
            return result;
        }
        synchronized (f۱۵۸۲۳b) {
            int count = f۱۵۸۲۳b.length;
            for (int i = 0; i < count; i++) {
                DateFormat format = f۱۵۸۲۴c[i];
                if (format == null) {
                    format = new SimpleDateFormat(f۱۵۸۲۳b[i], Locale.US);
                    format.setTimeZone(Cc.f۱۵۷۰۷e);
                    f۱۵۸۲۴c[i] = format;
                }
                position.setIndex(0);
                Date result2 = format.parse(value, position);
                if (position.getIndex() != 0) {
                    return result2;
                }
            }
            return null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String m۱۶۶۸۲a(Date value) {
        return f۱۵۸۲۲a.get().format(value);
    }
}
