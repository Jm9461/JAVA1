package android.support.v7.app;

/* access modifiers changed from: package-private */
public class l {

    /* renamed from: d  reason: collision with root package name */
    private static l f۱۶۱۲d;

    /* renamed from: a  reason: collision with root package name */
    public long f۱۶۱۳a;

    /* renamed from: b  reason: collision with root package name */
    public long f۱۶۱۴b;

    /* renamed from: c  reason: collision with root package name */
    public int f۱۶۱۵c;

    l() {
    }

    static l a() {
        if (f۱۶۱۲d == null) {
            f۱۶۱۲d = new l();
        }
        return f۱۶۱۲d;
    }

    public void a(long time, double latitude, double longitude) {
        float daysSince2000 = ((float) (time - 946728000000L)) / 8.64E7f;
        float meanAnomaly = (0.01720197f * daysSince2000) + 6.24006f;
        double d2 = (double) meanAnomaly;
        Double.isNaN(d2);
        double solarLng = 1.796593063d + d2 + (Math.sin((double) meanAnomaly) * 0.03341960161924362d) + (Math.sin((double) (2.0f * meanAnomaly)) * 3.4906598739326E-4d) + (Math.sin((double) (3.0f * meanAnomaly)) * 5.236000106378924E-6d) + 3.141592653589793d;
        double arcLongitude = (-longitude) / 360.0d;
        double d3 = (double) (daysSince2000 - 9.0E-4f);
        Double.isNaN(d3);
        double round = (double) (9.0E-4f + ((float) Math.round(d3 - arcLongitude)));
        Double.isNaN(round);
        double solarTransitJ2000 = round + arcLongitude + (Math.sin((double) meanAnomaly) * 0.0053d) + (Math.sin(2.0d * solarLng) * -0.0069d);
        double solarDec = Math.asin(Math.sin(solarLng) * Math.sin(0.4092797040939331d));
        double latRad = 0.01745329238474369d * latitude;
        double cosHourAngle = (Math.sin(-0.10471975803375244d) - (Math.sin(latRad) * Math.sin(solarDec))) / (Math.cos(latRad) * Math.cos(solarDec));
        if (cosHourAngle >= 1.0d) {
            this.f۱۶۱۵c = 1;
            this.f۱۶۱۳a = -1;
            this.f۱۶۱۴b = -1;
        } else if (cosHourAngle <= -1.0d) {
            this.f۱۶۱۵c = 0;
            this.f۱۶۱۳a = -1;
            this.f۱۶۱۴b = -1;
        } else {
            float hourAngle = (float) (Math.acos(cosHourAngle) / 6.283185307179586d);
            double d4 = (double) hourAngle;
            Double.isNaN(d4);
            this.f۱۶۱۳a = Math.round((d4 + solarTransitJ2000) * 8.64E7d) + 946728000000L;
            double d5 = (double) hourAngle;
            Double.isNaN(d5);
            this.f۱۶۱۴b = Math.round((solarTransitJ2000 - d5) * 8.64E7d) + 946728000000L;
            if (this.f۱۶۱۴b >= time || this.f۱۶۱۳a <= time) {
                this.f۱۶۱۵c = 1;
            } else {
                this.f۱۶۱۵c = 0;
            }
        }
    }
}
