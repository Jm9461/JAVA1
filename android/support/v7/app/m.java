package android.support.v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.content.d;
import android.util.Log;
import java.util.Calendar;

/* access modifiers changed from: package-private */
public class m {

    /* renamed from: d  reason: collision with root package name */
    private static m f۱۶۱۶d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f۱۶۱۷a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f۱۶۱۸b;

    /* renamed from: c  reason: collision with root package name */
    private final a f۱۶۱۹c = new a();

    static m a(Context context) {
        if (f۱۶۱۶d == null) {
            Context context2 = context.getApplicationContext();
            f۱۶۱۶d = new m(context2, (LocationManager) context2.getSystemService("location"));
        }
        return f۱۶۱۶d;
    }

    m(Context context, LocationManager locationManager) {
        this.f۱۶۱۷a = context;
        this.f۱۶۱۸b = locationManager;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        a state = this.f۱۶۱۹c;
        if (c()) {
            return state.f۱۶۲۰a;
        }
        Location location = b();
        if (location != null) {
            a(location);
            return state.f۱۶۲۰a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int hour = Calendar.getInstance().get(11);
        return hour < 6 || hour >= 22;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location coarseLoc = null;
        Location fineLoc = null;
        if (d.a(this.f۱۶۱۷a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            coarseLoc = a("network");
        }
        if (d.a(this.f۱۶۱۷a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            fineLoc = a("gps");
        }
        return (fineLoc == null || coarseLoc == null) ? fineLoc != null ? fineLoc : coarseLoc : fineLoc.getTime() > coarseLoc.getTime() ? fineLoc : coarseLoc;
    }

    private Location a(String provider) {
        try {
            if (this.f۱۶۱۸b.isProviderEnabled(provider)) {
                return this.f۱۶۱۸b.getLastKnownLocation(provider);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean c() {
        return this.f۱۶۱۹c.f۱۶۲۵f > System.currentTimeMillis();
    }

    private void a(Location location) {
        long nextUpdate;
        long nextUpdate2;
        a state = this.f۱۶۱۹c;
        long now = System.currentTimeMillis();
        l calculator = l.a();
        calculator.a(now - 86400000, location.getLatitude(), location.getLongitude());
        long yesterdaySunset = calculator.f۱۶۱۳a;
        calculator.a(now, location.getLatitude(), location.getLongitude());
        boolean isNight = true;
        if (calculator.f۱۶۱۵c != 1) {
            isNight = false;
        }
        long todaySunrise = calculator.f۱۶۱۴b;
        long todaySunset = calculator.f۱۶۱۳a;
        calculator.a(86400000 + now, location.getLatitude(), location.getLongitude());
        long tomorrowSunrise = calculator.f۱۶۱۴b;
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
        state.f۱۶۲۰a = isNight;
        state.f۱۶۲۱b = yesterdaySunset;
        state.f۱۶۲۲c = todaySunrise;
        state.f۱۶۲۳d = todaySunset;
        state.f۱۶۲۴e = tomorrowSunrise;
        state.f۱۶۲۵f = nextUpdate;
    }

    /* access modifiers changed from: private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f۱۶۲۰a;

        /* renamed from: b  reason: collision with root package name */
        long f۱۶۲۱b;

        /* renamed from: c  reason: collision with root package name */
        long f۱۶۲۲c;

        /* renamed from: d  reason: collision with root package name */
        long f۱۶۲۳d;

        /* renamed from: e  reason: collision with root package name */
        long f۱۶۲۴e;

        /* renamed from: f  reason: collision with root package name */
        long f۱۶۲۵f;

        a() {
        }
    }
}
