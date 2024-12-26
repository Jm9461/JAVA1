package e.f0.g;

import e.f0.c;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<DateFormat> f۳۸۲۹a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f۳۸۳۰b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: c  reason: collision with root package name */
    private static final DateFormat[] f۳۸۳۱c = new DateFormat[f۳۸۳۰b.length];

    class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            DateFormat rfc1123 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            rfc1123.setLenient(false);
            rfc1123.setTimeZone(c.f۳۷۴۶e);
            return rfc1123;
        }
    }

    public static Date a(String value) {
        if (value.length() == 0) {
            return null;
        }
        ParsePosition position = new ParsePosition(0);
        Date result = f۳۸۲۹a.get().parse(value, position);
        if (position.getIndex() == value.length()) {
            return result;
        }
        synchronized (f۳۸۳۰b) {
            int count = f۳۸۳۰b.length;
            for (int i = 0; i < count; i++) {
                DateFormat format = f۳۸۳۱c[i];
                if (format == null) {
                    format = new SimpleDateFormat(f۳۸۳۰b[i], Locale.US);
                    format.setTimeZone(c.f۳۷۴۶e);
                    f۳۸۳۱c[i] = format;
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

    public static String a(Date value) {
        return f۳۸۲۹a.get().format(value);
    }
}
