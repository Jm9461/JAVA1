package android.support.v7.app;

/* renamed from: android.support.v7.app.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cl {

    /* renamed from: d, reason: contains not printable characters */
    private static Cl f۱۱۰۹۲d;

    /* renamed from: a, reason: contains not printable characters */
    public long f۱۱۰۹۳a;

    /* renamed from: b, reason: contains not printable characters */
    public long f۱۱۰۹۴b;

    /* renamed from: c, reason: contains not printable characters */
    public int f۱۱۰۹۵c;

    Cl() {
    }

    /* renamed from: a, reason: contains not printable characters */
    static Cl m۱۱۵۹۸a() {
        if (f۱۱۰۹۲d == null) {
            f۱۱۰۹۲d = new Cl();
        }
        return f۱۱۰۹۲d;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۵۹۹a(long time, double latitude, double longitude) {
        float daysSince2000 = (time - 946728000000L) / 8.64E7f;
        float meanAnomaly = (0.01720197f * daysSince2000) + 6.24006f;
        double d2 = meanAnomaly;
        double sin = Math.sin(meanAnomaly) * 0.03341960161924362d;
        Double.isNaN(d2);
        double trueAnomaly = d2 + sin + (Math.sin(2.0f * meanAnomaly) * 3.4906598739326E-4d) + (Math.sin(3.0f * meanAnomaly) * 5.236000106378924E-6d);
        double solarLng = 1.796593063d + trueAnomaly + 3.141592653589793d;
        double arcLongitude = (-longitude) / 360.0d;
        double d3 = daysSince2000 - 9.0E-4f;
        Double.isNaN(d3);
        float n = Math.round(d3 - arcLongitude);
        double d4 = 9.0E-4f + n;
        Double.isNaN(d4);
        double trueAnomaly2 = meanAnomaly;
        double solarTransitJ2000 = d4 + arcLongitude + (Math.sin(trueAnomaly2) * 0.0053d) + (Math.sin(2.0d * solarLng) * (-0.0069d));
        double solarDec = Math.asin(Math.sin(solarLng) * Math.sin(0.4092797040939331d));
        double latRad = 0.01745329238474369d * latitude;
        double cosHourAngle = (Math.sin(-0.10471975803375244d) - (Math.sin(latRad) * Math.sin(solarDec))) / (Math.cos(latRad) * Math.cos(solarDec));
        if (cosHourAngle >= 1.0d) {
            this.f۱۱۰۹۵c = 1;
            this.f۱۱۰۹۳a = -1L;
            this.f۱۱۰۹۴b = -1L;
            return;
        }
        if (cosHourAngle <= -1.0d) {
            this.f۱۱۰۹۵c = 0;
            this.f۱۱۰۹۳a = -1L;
            this.f۱۱۰۹۴b = -1L;
            return;
        }
        float hourAngle = (float) (Math.acos(cosHourAngle) / 6.283185307179586d);
        double d5 = hourAngle;
        Double.isNaN(d5);
        this.f۱۱۰۹۳a = Math.round((d5 + solarTransitJ2000) * 8.64E7d) + 946728000000L;
        double d6 = hourAngle;
        Double.isNaN(d6);
        this.f۱۱۰۹۴b = Math.round((solarTransitJ2000 - d6) * 8.64E7d) + 946728000000L;
        if (this.f۱۱۰۹۴b >= time || this.f۱۱۰۹۳a <= time) {
            this.f۱۱۰۹۵c = 1;
        } else {
            this.f۱۱۰۹۵c = 0;
        }
    }
}
