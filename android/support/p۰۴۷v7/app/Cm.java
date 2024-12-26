package android.support.p۰۴۷v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.p۰۴۳v4.content.Cd;
import android.util.Log;
import java.util.Calendar;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.m  reason: invalid class name */
public class Cm {

    /* renamed from: d  reason: contains not printable characters */
    private static Cm f۱۱۰۹۶d;

    /* renamed from: a  reason: contains not printable characters */
    private final Context f۱۱۰۹۷a;

    /* renamed from: b  reason: contains not printable characters */
    private final LocationManager f۱۱۰۹۸b;

    /* renamed from: c  reason: contains not printable characters */
    private final Ca f۱۱۰۹۹c = new Ca();

    /* renamed from: a  reason: contains not printable characters */
    static Cm m۱۳۶۷۱a(Context context) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۶۷۵a() {
        Ca state = this.f۱۱۰۹۹c;
        if (m۱۳۶۷۴c()) {
            return state.f۱۱۱۰۰a;
        }
        Location location = m۱۳۶۷۳b();
        if (location != null) {
            m۱۳۶۷۲a(location);
            return state.f۱۱۱۰۰a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int hour = Calendar.getInstance().get(11);
        return hour < 6 || hour >= 22;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b  reason: contains not printable characters */
    private Location m۱۳۶۷۳b() {
        Location coarseLoc = null;
        Location fineLoc = null;
        if (Cd.m۱۲۶۳۷a(this.f۱۱۰۹۷a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            coarseLoc = m۱۳۶۷۰a("network");
        }
        if (Cd.m۱۲۶۳۷a(this.f۱۱۰۹۷a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            fineLoc = m۱۳۶۷۰a("gps");
        }
        return (fineLoc == null || coarseLoc == null) ? fineLoc != null ? fineLoc : coarseLoc : fineLoc.getTime() > coarseLoc.getTime() ? fineLoc : coarseLoc;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Location m۱۳۶۷۰a(String provider) {
        try {
            if (this.f۱۱۰۹۸b.isProviderEnabled(provider)) {
                return this.f۱۱۰۹۸b.getLastKnownLocation(provider);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private boolean m۱۳۶۷۴c() {
        return this.f۱۱۰۹۹c.f۱۱۱۰۵f > System.currentTimeMillis();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۶۷۲a(Location location) {
        long nextUpdate;
        long nextUpdate2;
        Ca state = this.f۱۱۰۹۹c;
        long now = System.currentTimeMillis();
        Cl calculator = Cl.m۱۳۶۶۸a();
        calculator.m۱۳۶۶۹a(now - 86400000, location.getLatitude(), location.getLongitude());
        long yesterdaySunset = calculator.f۱۱۰۹۳a;
        calculator.m۱۳۶۶۹a(now, location.getLatitude(), location.getLongitude());
        boolean isNight = true;
        if (calculator.f۱۱۰۹۵c != 1) {
            isNight = false;
        }
        long todaySunrise = calculator.f۱۱۰۹۴b;
        long todaySunset = calculator.f۱۱۰۹۳a;
        calculator.m۱۳۶۶۹a(86400000 + now, location.getLatitude(), location.getLongitude());
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

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.app.m$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        boolean f۱۱۱۰۰a;

        /* renamed from: b  reason: contains not printable characters */
        long f۱۱۱۰۱b;

        /* renamed from: c  reason: contains not printable characters */
        long f۱۱۱۰۲c;

        /* renamed from: d  reason: contains not printable characters */
        long f۱۱۱۰۳d;

        /* renamed from: e  reason: contains not printable characters */
        long f۱۱۱۰۴e;

        /* renamed from: f  reason: contains not printable characters */
        long f۱۱۱۰۵f;

        Ca() {
        }
    }
}
