package android.support.p۰۴۷v7.app;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.l  reason: invalid class name */
public class Cl {

    /* renamed from: d  reason: contains not printable characters */
    private static Cl f۱۱۰۹۲d;

    /* renamed from: a  reason: contains not printable characters */
    public long f۱۱۰۹۳a;

    /* renamed from: b  reason: contains not printable characters */
    public long f۱۱۰۹۴b;

    /* renamed from: c  reason: contains not printable characters */
    public int f۱۱۰۹۵c;

    Cl() {
    }

    /* renamed from: a  reason: contains not printable characters */
    static Cl m۱۳۶۶۸a() {
        if (f۱۱۰۹۲d == null) {
            f۱۱۰۹۲d = new Cl();
        }
        return f۱۱۰۹۲d;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۶۹a(long time, double latitude, double longitude) {
        float daysSince2000 = ((float) (time - 946728000000L)) / 8.64E7f;
        float meanAnomaly = (0.01720197f * daysSince2000) + 6.24006f;
        double d = (double) meanAnomaly;
        Double.isNaN(d);
        double solarLng = 1.796593063d + d + (Math.sin((double) meanAnomaly) * 0.03341960161924362d) + (Math.sin((double) (2.0f * meanAnomaly)) * 3.4906598739326E-4d) + (Math.sin((double) (3.0f * meanAnomaly)) * 5.236000106378924E-6d) + 3.141592653589793d;
        double arcLongitude = (-longitude) / 360.0d;
        double d2 = (double) (daysSince2000 - 9.0E-4f);
        Double.isNaN(d2);
        double round = (double) (9.0E-4f + ((float) Math.round(d2 - arcLongitude)));
        Double.isNaN(round);
        double solarTransitJ2000 = round + arcLongitude + (Math.sin((double) meanAnomaly) * 0.0053d) + (Math.sin(2.0d * solarLng) * -0.0069d);
        double solarDec = Math.asin(Math.sin(solarLng) * Math.sin(0.4092797040939331d));
        double latRad = 0.01745329238474369d * latitude;
        double cosHourAngle = (Math.sin(-0.10471975803375244d) - (Math.sin(latRad) * Math.sin(solarDec))) / (Math.cos(latRad) * Math.cos(solarDec));
        if (cosHourAngle >= 1.0d) {
            this.f۱۱۰۹۵c = 1;
            this.f۱۱۰۹۳a = -1;
            this.f۱۱۰۹۴b = -1;
        } else if (cosHourAngle <= -1.0d) {
            this.f۱۱۰۹۵c = 0;
            this.f۱۱۰۹۳a = -1;
            this.f۱۱۰۹۴b = -1;
        } else {
            float hourAngle = (float) (Math.acos(cosHourAngle) / 6.283185307179586d);
            double d3 = (double) hourAngle;
            Double.isNaN(d3);
            this.f۱۱۰۹۳a = Math.round((d3 + solarTransitJ2000) * 8.64E7d) + 946728000000L;
            double d4 = (double) hourAngle;
            Double.isNaN(d4);
            this.f۱۱۰۹۴b = Math.round((solarTransitJ2000 - d4) * 8.64E7d) + 946728000000L;
            if (this.f۱۱۰۹۴b >= time || this.f۱۱۰۹۳a <= time) {
                this.f۱۱۰۹۵c = 1;
            } else {
                this.f۱۱۰۹۵c = 0;
            }
        }
    }
}
