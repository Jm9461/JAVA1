package android.support.v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.content.Cd;
import android.util.Log;
import java.util.Calendar;

/* renamed from: android.support.v7.app.m, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cm {

    /* renamed from: d, reason: contains not printable characters */
    private static Cm f۱۱۰۹۶d;

    /* renamed from: a, reason: contains not printable characters */
    private final Context f۱۱۰۹۷a;

    /* renamed from: b, reason: contains not printable characters */
    private final LocationManager f۱۱۰۹۸b;

    /* renamed from: c, reason: contains not printable characters */
    private final a f۱۱۰۹۹c = new a();

    /* renamed from: a, reason: contains not printable characters */
    static Cm m۱۱۶۰۱a(Context context) {
        if (f۱۱۰۹۶d == null) {
            Context context2 = context.getApplicationContext();
            f۱۱۰۹۶d = new Cm(context2, (LocationManager) context2.getSystemService("location"));
        }
        return f۱۱۰۹۶d;
    }

    Cm(Context context, LocationManager locationManager) {
        this.f۱۱۰۹۷a = context;
        this.f۱۱۰۹۸b = locationManager;
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean m۱۱۶۰۵a() {
        a state = this.f۱۱۰۹۹c;
        if (m۱۱۶۰۴c()) {
            return state.f۱۱۱۰۰a;
        }
        Location location = m۱۱۶۰۳b();
        if (location != null) {
            m۱۱۶۰۲a(location);
            return state.f۱۱۱۰۰a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(11);
        return hour < 6 || hour >= 22;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b, reason: contains not printable characters */
    private Location m۱۱۶۰۳b() {
        Location coarseLoc = null;
        Location fineLoc = null;
        int permission = Cd.m۱۰۵۶۷a(this.f۱۱۰۹۷a, "android.permission.ACCESS_COARSE_LOCATION");
        if (permission == 0) {
            coarseLoc = m۱۱۶۰۰a("network");
        }
        int permission2 = Cd.m۱۰۵۶۷a(this.f۱۱۰۹۷a, "android.permission.ACCESS_FINE_LOCATION");
        if (permission2 == 0) {
            fineLoc = m۱۱۶۰۰a("gps");
        }
        return (fineLoc == null || coarseLoc == null) ? fineLoc != null ? fineLoc : coarseLoc : fineLoc.getTime() > coarseLoc.getTime() ? fineLoc : coarseLoc;
    }

    /* renamed from: a, reason: contains not printable characters */
    private Location m۱۱۶۰۰a(String provider) {
        try {
            if (this.f۱۱۰۹۸b.isProviderEnabled(provider)) {
                return this.f۱۱۰۹۸b.getLastKnownLocation(provider);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private boolean m۱۱۶۰۴c() {
        return this.f۱۱۰۹۹c.f۱۱۱۰۵f > System.currentTimeMillis();
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۱۶۰۲a(Location location) {
        long nextUpdate;
        long nextUpdate2;
        a state = this.f۱۱۰۹۹c;
        long now = System.currentTimeMillis();
        Cl calculator = Cl.m۱۱۵۹۸a();
        calculator.m۱۱۵۹۹a(now - 86400000, location.getLatitude(), location.getLongitude());
        long yesterdaySunset = calculator.f۱۱۰۹۳a;
        calculator.m۱۱۵۹۹a(now, location.getLatitude(), location.getLongitude());
        boolean isNight = calculator.f۱۱۰۹۵c == 1;
        long todaySunrise = calculator.f۱۱۰۹۴b;
        long todaySunset = calculator.f۱۱۰۹۳a;
        calculator.m۱۱۵۹۹a(86400000 + now, location.getLatitude(), location.getLongitude());
        long tomorrowSunrise = calculator.f۱۱۰۹۴b;
        if (todaySunrise == -1 || todaySunset == -1) {
            nextUpdate = now + 43200000;
        } else {
            if (now > todaySunset) {
                nextUpdate2 = 0 + tomorrowSunrise;
            } else if (now > todaySunrise) {
                nextUpdate2 = 0 + todaySunset;
            } else {
                nextUpdate2 = 0 + todaySunrise;
            }
            nextUpdate = nextUpdate2 + 60000;
        }
        state.f۱۱۱۰۰a = isNight;
        state.f۱۱۱۰۱b = yesterdaySunset;
        state.f۱۱۱۰۲c = todaySunrise;
        state.f۱۱۱۰۳d = todaySunset;
        state.f۱۱۱۰۴e = tomorrowSunrise;
        state.f۱۱۱۰۵f = nextUpdate;
    }

    /* renamed from: android.support.v7.app.m$a */
    private static class a {

        /* renamed from: a, reason: contains not printable characters */
        boolean f۱۱۱۰۰a;

        /* renamed from: b, reason: contains not printable characters */
        long f۱۱۱۰۱b;

        /* renamed from: c, reason: contains not printable characters */
        long f۱۱۱۰۲c;

        /* renamed from: d, reason: contains not printable characters */
        long f۱۱۱۰۳d;

        /* renamed from: e, reason: contains not printable characters */
        long f۱۱۱۰۴e;

        /* renamed from: f, reason: contains not printable characters */
        long f۱۱۱۰۵f;

        a() {
        }
    }
}
