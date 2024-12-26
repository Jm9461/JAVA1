package p۰۰۰a.p۰۰۵b.p۰۲۱e;

import android.content.res.AssetManager;
import android.support.media.ExifInterface;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: a.b.e.a  reason: invalid class name */
public class Ca {

    /* renamed from: A  reason: contains not printable characters */
    private static final Cd[] f۸۴۲۵A = {new Cd("ThumbnailImage", 256, 7), new Cd("CameraSettingsIFDPointer", 8224, 4), new Cd("ImageProcessingIFDPointer", 8256, 4)};

    /* renamed from: B  reason: contains not printable characters */
    private static final Cd[] f۸۴۲۶B = {new Cd("PreviewImageStart", 257, 4), new Cd("PreviewImageLength", 258, 4)};

    /* renamed from: C  reason: contains not printable characters */
    private static final Cd[] f۸۴۲۷C = {new Cd("AspectFrame", 4371, 3)};

    /* renamed from: D  reason: contains not printable characters */
    private static final Cd[] f۸۴۲۸D = {new Cd("ColorSpace", 55, 3)};

    /* renamed from: E  reason: contains not printable characters */
    static final Cd[][] f۸۴۲۹E;

    /* renamed from: F  reason: contains not printable characters */
    private static final Cd[] f۸۴۳۰F = {new Cd("SubIFDPointer", 330, 4), new Cd("ExifIFDPointer", 34665, 4), new Cd("GPSInfoIFDPointer", 34853, 4), new Cd("InteroperabilityIFDPointer", 40965, 4), new Cd("CameraSettingsIFDPointer", 8224, 1), new Cd("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: G  reason: contains not printable characters */
    private static final HashMap<Integer, Cd>[] f۸۴۳۱G;

    /* renamed from: H  reason: contains not printable characters */
    private static final HashMap<String, Cd>[] f۸۴۳۲H;

    /* renamed from: I  reason: contains not printable characters */
    private static final HashSet<String> f۸۴۳۳I = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));

    /* renamed from: J  reason: contains not printable characters */
    private static final HashMap<Integer, Integer> f۸۴۳۴J = new HashMap<>();

    /* renamed from: K  reason: contains not printable characters */
    private static final Charset f۸۴۳۵K = Charset.forName("US-ASCII");

    /* renamed from: L  reason: contains not printable characters */
    static final byte[] f۸۴۳۶L = "Exif\u0000\u0000".getBytes(f۸۴۳۵K);

    /* renamed from: l  reason: contains not printable characters */
    public static final int[] f۸۴۳۷l = {8, 8, 8};

    /* renamed from: m  reason: contains not printable characters */
    public static final int[] f۸۴۳۸m = {8};

    /* renamed from: n  reason: contains not printable characters */
    static final byte[] f۸۴۳۹n = {-1, -40, -1};

    /* renamed from: o  reason: contains not printable characters */
    private static final byte[] f۸۴۴۰o = {79, 76, 89, 77, 80, 0};

    /* renamed from: p  reason: contains not printable characters */
    private static final byte[] f۸۴۴۱p = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: q  reason: contains not printable characters */
    private static SimpleDateFormat f۸۴۴۲q = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");

    /* renamed from: r  reason: contains not printable characters */
    static final String[] f۸۴۴۳r = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: s  reason: contains not printable characters */
    static final int[] f۸۴۴۴s = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: t  reason: contains not printable characters */
    private static final byte[] f۸۴۴۵t = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: u  reason: contains not printable characters */
    private static final Cd[] f۸۴۴۶u = {new Cd("NewSubfileType", 254, 4), new Cd("SubfileType", 255, 4), new Cd("ImageWidth", 256, 3, 4), new Cd("ImageLength", 257, 3, 4), new Cd("BitsPerSample", 258, 3), new Cd("Compression", 259, 3), new Cd("PhotometricInterpretation", 262, 3), new Cd("ImageDescription", 270, 2), new Cd("Make", 271, 2), new Cd("Model", 272, 2), new Cd("StripOffsets", 273, 3, 4), new Cd("Orientation", 274, 3), new Cd("SamplesPerPixel", 277, 3), new Cd("RowsPerStrip", 278, 3, 4), new Cd("StripByteCounts", 279, 3, 4), new Cd("XResolution", 282, 5), new Cd("YResolution", 283, 5), new Cd("PlanarConfiguration", 284, 3), new Cd("ResolutionUnit", 296, 3), new Cd("TransferFunction", 301, 3), new Cd("Software", 305, 2), new Cd("DateTime", 306, 2), new Cd("Artist", 315, 2), new Cd("WhitePoint", 318, 5), new Cd("PrimaryChromaticities", 319, 5), new Cd("SubIFDPointer", 330, 4), new Cd("JPEGInterchangeFormat", 513, 4), new Cd("JPEGInterchangeFormatLength", 514, 4), new Cd("YCbCrCoefficients", 529, 5), new Cd("YCbCrSubSampling", 530, 3), new Cd("YCbCrPositioning", 531, 3), new Cd("ReferenceBlackWhite", 532, 5), new Cd("Copyright", 33432, 2), new Cd("ExifIFDPointer", 34665, 4), new Cd("GPSInfoIFDPointer", 34853, 4), new Cd("SensorTopBorder", 4, 4), new Cd("SensorLeftBorder", 5, 4), new Cd("SensorBottomBorder", 6, 4), new Cd("SensorRightBorder", 7, 4), new Cd("ISO", 23, 3), new Cd("JpgFromRaw", 46, 7)};

    /* renamed from: v  reason: contains not printable characters */
    private static final Cd[] f۸۴۴۷v = {new Cd("ExposureTime", 33434, 5), new Cd("FNumber", 33437, 5), new Cd("ExposureProgram", 34850, 3), new Cd("SpectralSensitivity", 34852, 2), new Cd("PhotographicSensitivity", 34855, 3), new Cd("OECF", 34856, 7), new Cd("ExifVersion", 36864, 2), new Cd("DateTimeOriginal", 36867, 2), new Cd("DateTimeDigitized", 36868, 2), new Cd("ComponentsConfiguration", 37121, 7), new Cd("CompressedBitsPerPixel", 37122, 5), new Cd("ShutterSpeedValue", 37377, 10), new Cd("ApertureValue", 37378, 5), new Cd("BrightnessValue", 37379, 10), new Cd("ExposureBiasValue", 37380, 10), new Cd("MaxApertureValue", 37381, 5), new Cd("SubjectDistance", 37382, 5), new Cd("MeteringMode", 37383, 3), new Cd("LightSource", 37384, 3), new Cd("Flash", 37385, 3), new Cd("FocalLength", 37386, 5), new Cd("SubjectArea", 37396, 3), new Cd("MakerNote", 37500, 7), new Cd("UserComment", 37510, 7), new Cd("SubSecTime", 37520, 2), new Cd("SubSecTimeOriginal", 37521, 2), new Cd("SubSecTimeDigitized", 37522, 2), new Cd("FlashpixVersion", 40960, 7), new Cd("ColorSpace", 40961, 3), new Cd("PixelXDimension", 40962, 3, 4), new Cd("PixelYDimension", 40963, 3, 4), new Cd("RelatedSoundFile", 40964, 2), new Cd("InteroperabilityIFDPointer", 40965, 4), new Cd("FlashEnergy", 41483, 5), new Cd("SpatialFrequencyResponse", 41484, 7), new Cd("FocalPlaneXResolution", 41486, 5), new Cd("FocalPlaneYResolution", 41487, 5), new Cd("FocalPlaneResolutionUnit", 41488, 3), new Cd("SubjectLocation", 41492, 3), new Cd("ExposureIndex", 41493, 5), new Cd("SensingMethod", 41495, 3), new Cd("FileSource", 41728, 7), new Cd("SceneType", 41729, 7), new Cd("CFAPattern", 41730, 7), new Cd("CustomRendered", 41985, 3), new Cd("ExposureMode", 41986, 3), new Cd("WhiteBalance", 41987, 3), new Cd("DigitalZoomRatio", 41988, 5), new Cd("FocalLengthIn35mmFilm", 41989, 3), new Cd("SceneCaptureType", 41990, 3), new Cd("GainControl", 41991, 3), new Cd("Contrast", 41992, 3), new Cd("Saturation", 41993, 3), new Cd("Sharpness", 41994, 3), new Cd("DeviceSettingDescription", 41995, 7), new Cd("SubjectDistanceRange", 41996, 3), new Cd("ImageUniqueID", 42016, 2), new Cd("DNGVersion", 50706, 1), new Cd("DefaultCropSize", 50720, 3, 4)};

    /* renamed from: w  reason: contains not printable characters */
    private static final Cd[] f۸۴۴۸w = {new Cd("GPSVersionID", 0, 1), new Cd("GPSLatitudeRef", 1, 2), new Cd("GPSLatitude", 2, 5), new Cd("GPSLongitudeRef", 3, 2), new Cd("GPSLongitude", 4, 5), new Cd("GPSAltitudeRef", 5, 1), new Cd("GPSAltitude", 6, 5), new Cd("GPSTimeStamp", 7, 5), new Cd("GPSSatellites", 8, 2), new Cd("GPSStatus", 9, 2), new Cd("GPSMeasureMode", 10, 2), new Cd("GPSDOP", 11, 5), new Cd("GPSSpeedRef", 12, 2), new Cd("GPSSpeed", 13, 5), new Cd("GPSTrackRef", 14, 2), new Cd("GPSTrack", 15, 5), new Cd("GPSImgDirectionRef", 16, 2), new Cd("GPSImgDirection", 17, 5), new Cd("GPSMapDatum", 18, 2), new Cd("GPSDestLatitudeRef", 19, 2), new Cd("GPSDestLatitude", 20, 5), new Cd("GPSDestLongitudeRef", 21, 2), new Cd("GPSDestLongitude", 22, 5), new Cd("GPSDestBearingRef", 23, 2), new Cd("GPSDestBearing", 24, 5), new Cd("GPSDestDistanceRef", 25, 2), new Cd("GPSDestDistance", 26, 5), new Cd("GPSProcessingMethod", 27, 7), new Cd("GPSAreaInformation", 28, 7), new Cd("GPSDateStamp", 29, 2), new Cd("GPSDifferential", 30, 3)};

    /* renamed from: x  reason: contains not printable characters */
    private static final Cd[] f۸۴۴۹x = {new Cd("InteroperabilityIndex", 1, 2)};

    /* renamed from: y  reason: contains not printable characters */
    private static final Cd[] f۸۴۵۰y = {new Cd("NewSubfileType", 254, 4), new Cd("SubfileType", 255, 4), new Cd("ThumbnailImageWidth", 256, 3, 4), new Cd("ThumbnailImageLength", 257, 3, 4), new Cd("BitsPerSample", 258, 3), new Cd("Compression", 259, 3), new Cd("PhotometricInterpretation", 262, 3), new Cd("ImageDescription", 270, 2), new Cd("Make", 271, 2), new Cd("Model", 272, 2), new Cd("StripOffsets", 273, 3, 4), new Cd("Orientation", 274, 3), new Cd("SamplesPerPixel", 277, 3), new Cd("RowsPerStrip", 278, 3, 4), new Cd("StripByteCounts", 279, 3, 4), new Cd("XResolution", 282, 5), new Cd("YResolution", 283, 5), new Cd("PlanarConfiguration", 284, 3), new Cd("ResolutionUnit", 296, 3), new Cd("TransferFunction", 301, 3), new Cd("Software", 305, 2), new Cd("DateTime", 306, 2), new Cd("Artist", 315, 2), new Cd("WhitePoint", 318, 5), new Cd("PrimaryChromaticities", 319, 5), new Cd("SubIFDPointer", 330, 4), new Cd("JPEGInterchangeFormat", 513, 4), new Cd("JPEGInterchangeFormatLength", 514, 4), new Cd("YCbCrCoefficients", 529, 5), new Cd("YCbCrSubSampling", 530, 3), new Cd("YCbCrPositioning", 531, 3), new Cd("ReferenceBlackWhite", 532, 5), new Cd("Copyright", 33432, 2), new Cd("ExifIFDPointer", 34665, 4), new Cd("GPSInfoIFDPointer", 34853, 4), new Cd("DNGVersion", 50706, 1), new Cd("DefaultCropSize", 50720, 3, 4)};

    /* renamed from: z  reason: contains not printable characters */
    private static final Cd f۸۴۵۱z = new Cd("StripOffsets", 273, 3);

    /* renamed from: a  reason: contains not printable characters */
    private final String f۸۴۵۲a;

    /* renamed from: b  reason: contains not printable characters */
    private final AssetManager.AssetInputStream f۸۴۵۳b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۸۴۵۴c;

    /* renamed from: d  reason: contains not printable characters */
    private final HashMap<String, Cc>[] f۸۴۵۵d = new HashMap[f۸۴۲۹E.length];

    /* renamed from: e  reason: contains not printable characters */
    private ByteOrder f۸۴۵۶e = ByteOrder.BIG_ENDIAN;

    /* renamed from: f  reason: contains not printable characters */
    private int f۸۴۵۷f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۸۴۵۸g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۸۴۵۹h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۸۴۶۰i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۸۴۶۱j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۸۴۶۲k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        new int[1][0] = 4;
        Cd[] dVarArr = f۸۴۴۶u;
        f۸۴۲۹E = new Cd[][]{dVarArr, f۸۴۴۷v, f۸۴۴۸w, f۸۴۴۹x, f۸۴۵۰y, dVarArr, f۸۴۲۵A, f۸۴۲۶B, f۸۴۲۷C, f۸۴۲۸D};
        new Cd("JPEGInterchangeFormat", 513, 4);
        new Cd("JPEGInterchangeFormatLength", 514, 4);
        Cd[][] dVarArr2 = f۸۴۲۹E;
        f۸۴۳۱G = new HashMap[dVarArr2.length];
        f۸۴۳۲H = new HashMap[dVarArr2.length];
        f۸۴۴۲q.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int ifdType = 0; ifdType < f۸۴۲۹E.length; ifdType++) {
            f۸۴۳۱G[ifdType] = new HashMap<>();
            f۸۴۳۲H[ifdType] = new HashMap<>();
            Cd[] dVarArr3 = f۸۴۲۹E[ifdType];
            for (Cd tag : dVarArr3) {
                f۸۴۳۱G[ifdType].put(Integer.valueOf(tag.f۸۴۷۲a), tag);
                f۸۴۳۲H[ifdType].put(tag.f۸۴۷۳b, tag);
            }
        }
        f۸۴۳۴J.put(Integer.valueOf(f۸۴۳۰F[0].f۸۴۷۲a), 5);
        f۸۴۳۴J.put(Integer.valueOf(f۸۴۳۰F[1].f۸۴۷۲a), 1);
        f۸۴۳۴J.put(Integer.valueOf(f۸۴۳۰F[2].f۸۴۷۲a), 2);
        f۸۴۳۴J.put(Integer.valueOf(f۸۴۳۰F[3].f۸۴۷۲a), 3);
        f۸۴۳۴J.put(Integer.valueOf(f۸۴۳۰F[4].f۸۴۷۲a), 7);
        f۸۴۳۴J.put(Integer.valueOf(f۸۴۳۰F[5].f۸۴۷۲a), 8);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.e.a$e  reason: invalid class name */
    public static class Ce {

        /* renamed from: a  reason: contains not printable characters */
        public final long f۸۴۷۶a;

        /* renamed from: b  reason: contains not printable characters */
        public final long f۸۴۷۷b;

        private Ce(long numerator, long denominator) {
            if (denominator == 0) {
                this.f۸۴۷۶a = 0;
                this.f۸۴۷۷b = 1;
                return;
            }
            this.f۸۴۷۶a = numerator;
            this.f۸۴۷۷b = denominator;
        }

        public String toString() {
            return this.f۸۴۷۶a + "/" + this.f۸۴۷۷b;
        }

        /* renamed from: a  reason: contains not printable characters */
        public double m۱۰۱۶۳a() {
            double d = (double) this.f۸۴۷۶a;
            double d2 = (double) this.f۸۴۷۷b;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.e.a$c  reason: invalid class name */
    public static class Cc {

        /* renamed from: a  reason: contains not printable characters */
        public final int f۸۴۶۹a;

        /* renamed from: b  reason: contains not printable characters */
        public final int f۸۴۷۰b;

        /* renamed from: c  reason: contains not printable characters */
        public final byte[] f۸۴۷۱c;

        private Cc(int format, int numberOfComponents, byte[] bytes) {
            this.f۸۴۶۹a = format;
            this.f۸۴۷۰b = numberOfComponents;
            this.f۸۴۷۱c = bytes;
        }

        /* renamed from: a  reason: contains not printable characters */
        public static Cc m۱۰۱۵۳a(int[] values, ByteOrder byteOrder) {
            ByteBuffer buffer = ByteBuffer.wrap(new byte[(Ca.f۸۴۴۴s[3] * values.length)]);
            buffer.order(byteOrder);
            for (int value : values) {
                buffer.putShort((short) value);
            }
            return new Cc(3, values.length, buffer.array());
        }

        /* renamed from: a  reason: contains not printable characters */
        public static Cc m۱۰۱۴۹a(int value, ByteOrder byteOrder) {
            return m۱۰۱۵۳a(new int[]{value}, byteOrder);
        }

        /* renamed from: a  reason: contains not printable characters */
        public static Cc m۱۰۱۵۴a(long[] values, ByteOrder byteOrder) {
            ByteBuffer buffer = ByteBuffer.wrap(new byte[(Ca.f۸۴۴۴s[4] * values.length)]);
            buffer.order(byteOrder);
            for (long value : values) {
                buffer.putInt((int) value);
            }
            return new Cc(4, values.length, buffer.array());
        }

        /* renamed from: a  reason: contains not printable characters */
        public static Cc m۱۰۱۵۰a(long value, ByteOrder byteOrder) {
            return m۱۰۱۵۴a(new long[]{value}, byteOrder);
        }

        /* renamed from: a  reason: contains not printable characters */
        public static Cc m۱۰۱۵۲a(String value) {
            byte[] ascii = (value + (char) 0).getBytes(Ca.f۸۴۳۵K);
            return new Cc(2, ascii.length, ascii);
        }

        /* renamed from: a  reason: contains not printable characters */
        public static Cc m۱۰۱۵۵a(Ce[] values, ByteOrder byteOrder) {
            ByteBuffer buffer = ByteBuffer.wrap(new byte[(Ca.f۸۴۴۴s[5] * values.length)]);
            buffer.order(byteOrder);
            for (Ce value : values) {
                buffer.putInt((int) value.f۸۴۷۶a);
                buffer.putInt((int) value.f۸۴۷۷b);
            }
            return new Cc(5, values.length, buffer.array());
        }

        /* renamed from: a  reason: contains not printable characters */
        public static Cc m۱۰۱۵۱a(Ce value, ByteOrder byteOrder) {
            return m۱۰۱۵۵a(new Ce[]{value}, byteOrder);
        }

        public String toString() {
            return "(" + Ca.f۸۴۴۳r[this.f۸۴۶۹a] + ", data length:" + this.f۸۴۷۱c.length + ")";
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x0202 A[SYNTHETIC, Splitter:B:141:0x0202] */
        /* renamed from: d  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Object m۱۰۱۵۷d(java.nio.ByteOrder r22) {
            /*
            // Method dump skipped, instructions count: 570
            */
            throw new UnsupportedOperationException("Method not decompiled: p۰۰۰a.p۰۰۵b.p۰۲۱e.Ca.Cc.m۱۰۱۵۷d(java.nio.ByteOrder):java.lang.Object");
        }

        /* renamed from: a  reason: contains not printable characters */
        public double m۱۰۱۵۸a(ByteOrder byteOrder) {
            Object value = m۱۰۱۵۷d(byteOrder);
            if (value == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (value instanceof String) {
                return Double.parseDouble((String) value);
            } else {
                if (value instanceof long[]) {
                    long[] array = (long[]) value;
                    if (array.length == 1) {
                        return (double) array[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (value instanceof int[]) {
                    int[] array2 = (int[]) value;
                    if (array2.length == 1) {
                        return (double) array2[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (value instanceof double[]) {
                    double[] array3 = (double[]) value;
                    if (array3.length == 1) {
                        return array3[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (value instanceof Ce[]) {
                    Ce[] array4 = (Ce[]) value;
                    if (array4.length == 1) {
                        return array4[0].m۱۰۱۶۳a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۰۱۵۹b(ByteOrder byteOrder) {
            Object value = m۱۰۱۵۷d(byteOrder);
            if (value == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (value instanceof String) {
                return Integer.parseInt((String) value);
            } else {
                if (value instanceof long[]) {
                    long[] array = (long[]) value;
                    if (array.length == 1) {
                        return (int) array[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (value instanceof int[]) {
                    int[] array2 = (int[]) value;
                    if (array2.length == 1) {
                        return array2[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: c  reason: contains not printable characters */
        public String m۱۰۱۶۰c(ByteOrder byteOrder) {
            Object value = m۱۰۱۵۷d(byteOrder);
            if (value == null) {
                return null;
            }
            if (value instanceof String) {
                return (String) value;
            }
            StringBuilder stringBuilder = new StringBuilder();
            if (value instanceof long[]) {
                long[] array = (long[]) value;
                for (int i = 0; i < array.length; i++) {
                    stringBuilder.append(array[i]);
                    if (i + 1 != array.length) {
                        stringBuilder.append(",");
                    }
                }
                return stringBuilder.toString();
            } else if (value instanceof int[]) {
                int[] array2 = (int[]) value;
                for (int i2 = 0; i2 < array2.length; i2++) {
                    stringBuilder.append(array2[i2]);
                    if (i2 + 1 != array2.length) {
                        stringBuilder.append(",");
                    }
                }
                return stringBuilder.toString();
            } else if (value instanceof double[]) {
                double[] array3 = (double[]) value;
                for (int i3 = 0; i3 < array3.length; i3++) {
                    stringBuilder.append(array3[i3]);
                    if (i3 + 1 != array3.length) {
                        stringBuilder.append(",");
                    }
                }
                return stringBuilder.toString();
            } else if (!(value instanceof Ce[])) {
                return null;
            } else {
                Ce[] array4 = (Ce[]) value;
                for (int i4 = 0; i4 < array4.length; i4++) {
                    stringBuilder.append(array4[i4].f۸۴۷۶a);
                    stringBuilder.append('/');
                    stringBuilder.append(array4[i4].f۸۴۷۷b);
                    if (i4 + 1 != array4.length) {
                        stringBuilder.append(",");
                    }
                }
                return stringBuilder.toString();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.e.a$d  reason: invalid class name */
    public static class Cd {

        /* renamed from: a  reason: contains not printable characters */
        public final int f۸۴۷۲a;

        /* renamed from: b  reason: contains not printable characters */
        public final String f۸۴۷۳b;

        /* renamed from: c  reason: contains not printable characters */
        public final int f۸۴۷۴c;

        /* renamed from: d  reason: contains not printable characters */
        public final int f۸۴۷۵d;

        private Cd(String name, int number, int format) {
            this.f۸۴۷۳b = name;
            this.f۸۴۷۲a = number;
            this.f۸۴۷۴c = format;
            this.f۸۴۷۵d = -1;
        }

        private Cd(String name, int number, int primaryFormat, int secondaryFormat) {
            this.f۸۴۷۳b = name;
            this.f۸۴۷۲a = number;
            this.f۸۴۷۴c = primaryFormat;
            this.f۸۴۷۵d = secondaryFormat;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a  reason: contains not printable characters */
        private boolean m۱۰۱۶۱a(int format) {
            int i;
            int i2 = this.f۸۴۷۴c;
            if (i2 == 7 || format == 7 || i2 == format || (i = this.f۸۴۷۵d) == format) {
                return true;
            }
            if ((i2 == 4 || i == 4) && format == 3) {
                return true;
            }
            if ((this.f۸۴۷۴c == 9 || this.f۸۴۷۵d == 9) && format == 8) {
                return true;
            }
            if ((this.f۸۴۷۴c == 12 || this.f۸۴۷۵d == 12) && format == 11) {
                return true;
            }
            return false;
        }
    }

    public Ca(String filename) {
        if (filename != null) {
            FileInputStream in = null;
            this.f۸۴۵۳b = null;
            this.f۸۴۵۲a = filename;
            try {
                in = new FileInputStream(filename);
                m۱۰۱۱۹a((InputStream) in);
            } finally {
                m۱۰۱۱۸a((Closeable) in);
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private Cc m۱۰۱۲۴b(String tag) {
        if ("ISOSpeedRatings".equals(tag)) {
            tag = "PhotographicSensitivity";
        }
        for (int i = 0; i < f۸۴۲۹E.length; i++) {
            Cc value = this.f۸۴۵۵d[i].get(tag);
            if (value != null) {
                return value;
            }
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۰۱۴۲a(String tag) {
        Cc attribute = m۱۰۱۲۴b(tag);
        if (attribute == null) {
            return null;
        }
        if (!f۸۴۳۳I.contains(tag)) {
            return attribute.m۱۰۱۶۰c(this.f۸۴۵۶e);
        }
        if (tag.equals("GPSTimeStamp")) {
            int i = attribute.f۸۴۶۹a;
            if (i == 5 || i == 10) {
                Ce[] array = (Ce[]) attribute.m۱۰۱۵۷d(this.f۸۴۵۶e);
                if (array == null || array.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(array));
                    return null;
                }
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) array[0].f۸۴۷۶a) / ((float) array[0].f۸۴۷۷b))), Integer.valueOf((int) (((float) array[1].f۸۴۷۶a) / ((float) array[1].f۸۴۷۷b))), Integer.valueOf((int) (((float) array[2].f۸۴۷۶a) / ((float) array[2].f۸۴۷۷b))));
            }
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + attribute.f۸۴۶۹a);
            return null;
        }
        try {
            return Double.toString(attribute.m۱۰۱۵۸a(this.f۸۴۵۶e));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۰۱۴۱a(String tag, int defaultValue) {
        Cc exifAttribute = m۱۰۱۲۴b(tag);
        if (exifAttribute == null) {
            return defaultValue;
        }
        try {
            return exifAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۱۱۹a(InputStream in) {
        for (int i = 0; i < f۸۴۲۹E.length; i++) {
            try {
                this.f۸۴۵۵d[i] = new HashMap<>();
            } catch (IOException e) {
            } catch (Throwable th) {
                m۱۰۱۳۲c();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(in, 5000);
        this.f۸۴۵۴c = m۱۰۱۱۱a(bufferedInputStream);
        Cb inputStream = new Cb(bufferedInputStream);
        switch (this.f۸۴۵۴c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                m۱۰۱۳۳c(inputStream);
                break;
            case 4:
                m۱۰۱۱۶a(inputStream, 0, 0);
                break;
            case 7:
                m۱۰۱۱۴a(inputStream);
                break;
            case 9:
                m۱۰۱۲۵b(inputStream);
                break;
            case 10:
                m۱۰۱۳۶d(inputStream);
                break;
        }
        m۱۰۱۴۰f(inputStream);
        m۱۰۱۳۲c();
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۰۱۱۱a(BufferedInputStream in) {
        in.mark(5000);
        byte[] signatureCheckBytes = new byte[5000];
        in.read(signatureCheckBytes);
        in.reset();
        if (m۱۰۱۲۲a(signatureCheckBytes)) {
            return 4;
        }
        if (m۱۰۱۳۵c(signatureCheckBytes)) {
            return 9;
        }
        if (m۱۰۱۳۰b(signatureCheckBytes)) {
            return 7;
        }
        if (m۱۰۱۳۸d(signatureCheckBytes)) {
            return 10;
        }
        return 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۰۱۲۲a(byte[] signatureCheckBytes) {
        int i = 0;
        while (true) {
            byte[] bArr = f۸۴۳۹n;
            if (i >= bArr.length) {
                return true;
            }
            if (signatureCheckBytes[i] != bArr[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private boolean m۱۰۱۳۵c(byte[] signatureCheckBytes) {
        byte[] rafSignatureBytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < rafSignatureBytes.length; i++) {
            if (signatureCheckBytes[i] != rafSignatureBytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۰۱۳۰b(byte[] signatureCheckBytes) {
        Cb signatureInputStream = new Cb(signatureCheckBytes);
        this.f۸۴۵۶e = m۱۰۱۳۹e(signatureInputStream);
        signatureInputStream.m۱۰۱۴۵a(this.f۸۴۵۶e);
        short orfSignature = signatureInputStream.readShort();
        signatureInputStream.close();
        return orfSignature == 20306 || orfSignature == 21330;
    }

    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۰۱۳۸d(byte[] signatureCheckBytes) {
        Cb signatureInputStream = new Cb(signatureCheckBytes);
        this.f۸۴۵۶e = m۱۰۱۳۹e(signatureInputStream);
        signatureInputStream.m۱۰۱۴۵a(this.f۸۴۵۶e);
        short signatureByte = signatureInputStream.readShort();
        signatureInputStream.close();
        return signatureByte == 85;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059 A[FALL_THROUGH] */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m۱۰۱۱۶a(p۰۰۰a.p۰۰۵b.p۰۲۱e.Ca.Cb r12, int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 414
        */
        throw new UnsupportedOperationException("Method not decompiled: p۰۰۰a.p۰۰۵b.p۰۲۱e.Ca.m۱۰۱۱۶a(a.b.e.a$b, int, int):void");
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۱۳۳c(Cb in) {
        Cc makerNoteAttribute;
        m۱۰۱۱۵a(in, in.available());
        m۱۰۱۲۶b(in, 0);
        m۱۰۱۳۷d(in, 0);
        m۱۰۱۳۷d(in, 5);
        m۱۰۱۳۷d(in, 4);
        m۱۰۱۲۸b((InputStream) in);
        if (this.f۸۴۵۴c == 8 && (makerNoteAttribute = this.f۸۴۵۵d[1].get("MakerNote")) != null) {
            Cb makerNoteDataInputStream = new Cb(makerNoteAttribute.f۸۴۷۱c);
            makerNoteDataInputStream.m۱۰۱۴۵a(this.f۸۴۵۶e);
            makerNoteDataInputStream.m۱۰۱۴۶g(6);
            m۱۰۱۲۶b(makerNoteDataInputStream, 9);
            Cc colorSpaceAttribute = this.f۸۴۵۵d[9].get("ColorSpace");
            if (colorSpaceAttribute != null) {
                this.f۸۴۵۵d[1].put("ColorSpace", colorSpaceAttribute);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۰۱۲۵b(Cb in) {
        in.skipBytes(84);
        byte[] jpegOffsetBytes = new byte[4];
        byte[] cfaHeaderOffsetBytes = new byte[4];
        in.read(jpegOffsetBytes);
        in.skipBytes(4);
        in.read(cfaHeaderOffsetBytes);
        int rafJpegOffset = ByteBuffer.wrap(jpegOffsetBytes).getInt();
        int rafCfaHeaderOffset = ByteBuffer.wrap(cfaHeaderOffsetBytes).getInt();
        m۱۰۱۱۶a(in, rafJpegOffset, 5);
        in.m۱۰۱۴۶g((long) rafCfaHeaderOffset);
        in.m۱۰۱۴۵a(ByteOrder.BIG_ENDIAN);
        int numberOfDirectoryEntry = in.readInt();
        for (int i = 0; i < numberOfDirectoryEntry; i++) {
            int tagNumber = in.readUnsignedShort();
            int numberOfBytes = in.readUnsignedShort();
            if (tagNumber == f۸۴۵۱z.f۸۴۷۲a) {
                int imageLength = in.readShort();
                int imageWidth = in.readShort();
                Cc imageLengthAttribute = Cc.m۱۰۱۴۹a(imageLength, this.f۸۴۵۶e);
                Cc imageWidthAttribute = Cc.m۱۰۱۴۹a(imageWidth, this.f۸۴۵۶e);
                this.f۸۴۵۵d[0].put("ImageLength", imageLengthAttribute);
                this.f۸۴۵۵d[0].put("ImageWidth", imageWidthAttribute);
                return;
            }
            in.skipBytes(numberOfBytes);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۱۱۴a(Cb in) {
        m۱۰۱۳۳c(in);
        Cc makerNoteAttribute = this.f۸۴۵۵d[1].get("MakerNote");
        if (makerNoteAttribute != null) {
            Cb makerNoteDataInputStream = new Cb(makerNoteAttribute.f۸۴۷۱c);
            makerNoteDataInputStream.m۱۰۱۴۵a(this.f۸۴۵۶e);
            byte[] makerNoteHeader1Bytes = new byte[f۸۴۴۰o.length];
            makerNoteDataInputStream.readFully(makerNoteHeader1Bytes);
            makerNoteDataInputStream.m۱۰۱۴۶g(0);
            byte[] makerNoteHeader2Bytes = new byte[f۸۴۴۱p.length];
            makerNoteDataInputStream.readFully(makerNoteHeader2Bytes);
            if (Arrays.equals(makerNoteHeader1Bytes, f۸۴۴۰o)) {
                makerNoteDataInputStream.m۱۰۱۴۶g(8);
            } else if (Arrays.equals(makerNoteHeader2Bytes, f۸۴۴۱p)) {
                makerNoteDataInputStream.m۱۰۱۴۶g(12);
            }
            m۱۰۱۲۶b(makerNoteDataInputStream, 6);
            Cc imageStartAttribute = this.f۸۴۵۵d[7].get("PreviewImageStart");
            Cc imageLengthAttribute = this.f۸۴۵۵d[7].get("PreviewImageLength");
            if (!(imageStartAttribute == null || imageLengthAttribute == null)) {
                this.f۸۴۵۵d[5].put("JPEGInterchangeFormat", imageStartAttribute);
                this.f۸۴۵۵d[5].put("JPEGInterchangeFormatLength", imageLengthAttribute);
            }
            Cc aspectFrameAttribute = this.f۸۴۵۵d[8].get("AspectFrame");
            if (aspectFrameAttribute != null) {
                int[] aspectFrameValues = (int[]) aspectFrameAttribute.m۱۰۱۵۷d(this.f۸۴۵۶e);
                if (aspectFrameValues == null || aspectFrameValues.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(aspectFrameValues));
                } else if (aspectFrameValues[2] > aspectFrameValues[0] && aspectFrameValues[3] > aspectFrameValues[1]) {
                    int primaryImageWidth = (aspectFrameValues[2] - aspectFrameValues[0]) + 1;
                    int primaryImageLength = (aspectFrameValues[3] - aspectFrameValues[1]) + 1;
                    if (primaryImageWidth < primaryImageLength) {
                        int primaryImageWidth2 = primaryImageWidth + primaryImageLength;
                        primaryImageLength = primaryImageWidth2 - primaryImageLength;
                        primaryImageWidth = primaryImageWidth2 - primaryImageLength;
                    }
                    Cc primaryImageWidthAttribute = Cc.m۱۰۱۴۹a(primaryImageWidth, this.f۸۴۵۶e);
                    Cc primaryImageLengthAttribute = Cc.m۱۰۱۴۹a(primaryImageLength, this.f۸۴۵۶e);
                    this.f۸۴۵۵d[0].put("ImageWidth", primaryImageWidthAttribute);
                    this.f۸۴۵۵d[0].put("ImageLength", primaryImageLengthAttribute);
                }
            }
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۰۱۳۶d(Cb in) {
        m۱۰۱۳۳c(in);
        if (this.f۸۴۵۵d[0].get("JpgFromRaw") != null) {
            m۱۰۱۱۶a(in, this.f۸۴۶۲k, 5);
        }
        Cc rw2IsoAttribute = this.f۸۴۵۵d[0].get("ISO");
        Cc exifIsoAttribute = this.f۸۴۵۵d[1].get("PhotographicSensitivity");
        if (rw2IsoAttribute != null && exifIsoAttribute == null) {
            this.f۸۴۵۵d[1].put("PhotographicSensitivity", rw2IsoAttribute);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۱۲۰a(byte[] exifBytes, int imageType) {
        Cb dataInputStream = new Cb(exifBytes);
        m۱۰۱۱۵a(dataInputStream, exifBytes.length);
        m۱۰۱۲۶b(dataInputStream, imageType);
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۱۳۲c() {
        String valueOfDateTimeOriginal = m۱۰۱۴۲a("DateTimeOriginal");
        if (valueOfDateTimeOriginal != null && m۱۰۱۴۲a("DateTime") == null) {
            this.f۸۴۵۵d[0].put("DateTime", Cc.m۱۰۱۵۲a(valueOfDateTimeOriginal));
        }
        if (m۱۰۱۴۲a("ImageWidth") == null) {
            this.f۸۴۵۵d[0].put("ImageWidth", Cc.m۱۰۱۵۰a(0L, this.f۸۴۵۶e));
        }
        if (m۱۰۱۴۲a("ImageLength") == null) {
            this.f۸۴۵۵d[0].put("ImageLength", Cc.m۱۰۱۵۰a(0L, this.f۸۴۵۶e));
        }
        if (m۱۰۱۴۲a("Orientation") == null) {
            this.f۸۴۵۵d[0].put("Orientation", Cc.m۱۰۱۵۰a(0L, this.f۸۴۵۶e));
        }
        if (m۱۰۱۴۲a("LightSource") == null) {
            this.f۸۴۵۵d[1].put("LightSource", Cc.m۱۰۱۵۰a(0L, this.f۸۴۵۶e));
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private ByteOrder m۱۰۱۳۹e(Cb dataInputStream) {
        short byteOrder = dataInputStream.readShort();
        if (byteOrder == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (byteOrder == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(byteOrder));
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۱۱۵a(Cb dataInputStream, int exifBytesLength) {
        this.f۸۴۵۶e = m۱۰۱۳۹e(dataInputStream);
        dataInputStream.m۱۰۱۴۵a(this.f۸۴۵۶e);
        int startCode = dataInputStream.readUnsignedShort();
        int i = this.f۸۴۵۴c;
        if (i == 7 || i == 10 || startCode == 42) {
            int firstIfdOffset = dataInputStream.readInt();
            if (firstIfdOffset < 8 || firstIfdOffset >= exifBytesLength) {
                throw new IOException("Invalid first Ifd offset: " + firstIfdOffset);
            }
            int firstIfdOffset2 = firstIfdOffset - 8;
            if (firstIfdOffset2 > 0 && dataInputStream.skipBytes(firstIfdOffset2) != firstIfdOffset2) {
                throw new IOException("Couldn't jump to first Ifd: " + firstIfdOffset2);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(startCode));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ff  */
    /* renamed from: b  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m۱۰۱۲۶b(p۰۰۰a.p۰۰۵b.p۰۲۱e.Ca.Cb r26, int r27) {
        /*
        // Method dump skipped, instructions count: 755
        */
        throw new UnsupportedOperationException("Method not decompiled: p۰۰۰a.p۰۰۵b.p۰۲۱e.Ca.m۱۰۱۲۶b(a.b.e.a$b, int):void");
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۱۳۴c(Cb in, int imageType) {
        Cc jpegInterchangeFormatAttribute;
        Cc imageLengthAttribute = this.f۸۴۵۵d[imageType].get("ImageLength");
        Cc imageWidthAttribute = this.f۸۴۵۵d[imageType].get("ImageWidth");
        if ((imageLengthAttribute == null || imageWidthAttribute == null) && (jpegInterchangeFormatAttribute = this.f۸۴۵۵d[imageType].get("JPEGInterchangeFormat")) != null) {
            m۱۰۱۱۶a(in, jpegInterchangeFormatAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e), imageType);
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۰۱۴۰f(Cb in) {
        HashMap thumbnailData = this.f۸۴۵۵d[4];
        Cc compressionAttribute = thumbnailData.get("Compression");
        if (compressionAttribute != null) {
            this.f۸۴۵۷f = compressionAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
            int i = this.f۸۴۵۷f;
            if (i != 1) {
                if (i == 6) {
                    m۱۰۱۱۷a(in, thumbnailData);
                    return;
                } else if (i != 7) {
                    return;
                }
            }
            if (m۱۰۱۲۱a(thumbnailData)) {
                m۱۰۱۲۷b(in, thumbnailData);
                return;
            }
            return;
        }
        this.f۸۴۵۷f = 6;
        m۱۰۱۱۷a(in, thumbnailData);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۱۱۷a(Cb in, HashMap thumbnailData) {
        Cc jpegInterchangeFormatAttribute = (Cc) thumbnailData.get("JPEGInterchangeFormat");
        Cc jpegInterchangeFormatLengthAttribute = (Cc) thumbnailData.get("JPEGInterchangeFormatLength");
        if (jpegInterchangeFormatAttribute != null && jpegInterchangeFormatLengthAttribute != null) {
            int thumbnailOffset = jpegInterchangeFormatAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
            int thumbnailLength = Math.min(jpegInterchangeFormatLengthAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e), in.available() - thumbnailOffset);
            int i = this.f۸۴۵۴c;
            if (i == 4 || i == 9 || i == 10) {
                thumbnailOffset += this.f۸۴۵۸g;
            } else if (i == 7) {
                thumbnailOffset += this.f۸۴۵۹h;
            }
            if (thumbnailOffset > 0 && thumbnailLength > 0 && this.f۸۴۵۲a == null && this.f۸۴۵۳b == null) {
                in.m۱۰۱۴۶g((long) thumbnailOffset);
                in.readFully(new byte[thumbnailLength]);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۰۱۲۷b(Cb in, HashMap thumbnailData) {
        Cc stripOffsetsAttribute = (Cc) thumbnailData.get("StripOffsets");
        Cc stripByteCountsAttribute = (Cc) thumbnailData.get("StripByteCounts");
        if (stripOffsetsAttribute != null && stripByteCountsAttribute != null) {
            long[] stripOffsets = m۱۰۱۲۳a(stripOffsetsAttribute.m۱۰۱۵۷d(this.f۸۴۵۶e));
            long[] stripByteCounts = m۱۰۱۲۳a(stripByteCountsAttribute.m۱۰۱۵۷d(this.f۸۴۵۶e));
            if (stripOffsets == null) {
                Log.w("ExifInterface", "stripOffsets should not be null.");
            } else if (stripByteCounts == null) {
                Log.w("ExifInterface", "stripByteCounts should not be null.");
            } else {
                long totalStripByteCount = 0;
                for (long byteCount : stripByteCounts) {
                    totalStripByteCount += byteCount;
                }
                byte[] totalStripBytes = new byte[((int) totalStripByteCount)];
                int bytesRead = 0;
                int bytesAdded = 0;
                int i = 0;
                while (i < stripOffsets.length) {
                    int stripByteCount = (int) stripByteCounts[i];
                    int skipBytes = ((int) stripOffsets[i]) - bytesRead;
                    if (skipBytes < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                    }
                    in.m۱۰۱۴۶g((long) skipBytes);
                    byte[] stripBytes = new byte[stripByteCount];
                    in.read(stripBytes);
                    bytesRead = bytesRead + skipBytes + stripByteCount;
                    System.arraycopy(stripBytes, 0, totalStripBytes, bytesAdded, stripBytes.length);
                    bytesAdded += stripBytes.length;
                    i++;
                    stripOffsetsAttribute = stripOffsetsAttribute;
                    stripByteCountsAttribute = stripByteCountsAttribute;
                    totalStripByteCount = totalStripByteCount;
                    stripOffsets = stripOffsets;
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۰۱۲۱a(HashMap thumbnailData) {
        Cc photometricInterpretationAttribute;
        Cc bitsPerSampleAttribute = (Cc) thumbnailData.get("BitsPerSample");
        if (bitsPerSampleAttribute == null) {
            return false;
        }
        int[] bitsPerSampleValue = (int[]) bitsPerSampleAttribute.m۱۰۱۵۷d(this.f۸۴۵۶e);
        if (Arrays.equals(f۸۴۳۷l, bitsPerSampleValue)) {
            return true;
        }
        if (this.f۸۴۵۴c != 3 || (photometricInterpretationAttribute = (Cc) thumbnailData.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int photometricInterpretationValue = photometricInterpretationAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
        if ((photometricInterpretationValue != 1 || !Arrays.equals(bitsPerSampleValue, f۸۴۳۸m)) && (photometricInterpretationValue != 6 || !Arrays.equals(bitsPerSampleValue, f۸۴۳۷l))) {
            return false;
        }
        return true;
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۰۱۲۹b(HashMap map) {
        Cc imageLengthAttribute = (Cc) map.get("ImageLength");
        Cc imageWidthAttribute = (Cc) map.get("ImageWidth");
        if (imageLengthAttribute == null || imageWidthAttribute == null) {
            return false;
        }
        int imageLengthValue = imageLengthAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
        int imageWidthValue = imageWidthAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
        if (imageLengthValue > 512 || imageWidthValue > 512) {
            return false;
        }
        return true;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۰۱۲۸b(InputStream in) {
        m۱۰۱۱۳a(0, 5);
        m۱۰۱۱۳a(0, 4);
        m۱۰۱۱۳a(5, 4);
        Cc pixelXDimAttribute = this.f۸۴۵۵d[1].get("PixelXDimension");
        Cc pixelYDimAttribute = this.f۸۴۵۵d[1].get("PixelYDimension");
        if (!(pixelXDimAttribute == null || pixelYDimAttribute == null)) {
            this.f۸۴۵۵d[0].put("ImageWidth", pixelXDimAttribute);
            this.f۸۴۵۵d[0].put("ImageLength", pixelYDimAttribute);
        }
        if (this.f۸۴۵۵d[4].isEmpty() && m۱۰۱۲۹b(this.f۸۴۵۵d[5])) {
            HashMap<String, Cc>[] hashMapArr = this.f۸۴۵۵d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m۱۰۱۲۹b(this.f۸۴۵۵d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۰۱۳۷d(Cb in, int imageType) {
        Cc defaultCropSizeXAttribute;
        Cc defaultCropSizeYAttribute;
        Cc defaultCropSizeAttribute = this.f۸۴۵۵d[imageType].get("DefaultCropSize");
        Cc topBorderAttribute = this.f۸۴۵۵d[imageType].get("SensorTopBorder");
        Cc leftBorderAttribute = this.f۸۴۵۵d[imageType].get("SensorLeftBorder");
        Cc bottomBorderAttribute = this.f۸۴۵۵d[imageType].get("SensorBottomBorder");
        Cc rightBorderAttribute = this.f۸۴۵۵d[imageType].get("SensorRightBorder");
        if (defaultCropSizeAttribute != null) {
            if (defaultCropSizeAttribute.f۸۴۶۹a == 5) {
                Ce[] defaultCropSizeValue = (Ce[]) defaultCropSizeAttribute.m۱۰۱۵۷d(this.f۸۴۵۶e);
                if (defaultCropSizeValue == null || defaultCropSizeValue.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(defaultCropSizeValue));
                    return;
                }
                defaultCropSizeXAttribute = Cc.m۱۰۱۵۱a(defaultCropSizeValue[0], this.f۸۴۵۶e);
                defaultCropSizeYAttribute = Cc.m۱۰۱۵۱a(defaultCropSizeValue[1], this.f۸۴۵۶e);
            } else {
                int[] defaultCropSizeValue2 = (int[]) defaultCropSizeAttribute.m۱۰۱۵۷d(this.f۸۴۵۶e);
                if (defaultCropSizeValue2 == null || defaultCropSizeValue2.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(defaultCropSizeValue2));
                    return;
                }
                defaultCropSizeXAttribute = Cc.m۱۰۱۴۹a(defaultCropSizeValue2[0], this.f۸۴۵۶e);
                defaultCropSizeYAttribute = Cc.m۱۰۱۴۹a(defaultCropSizeValue2[1], this.f۸۴۵۶e);
            }
            this.f۸۴۵۵d[imageType].put("ImageWidth", defaultCropSizeXAttribute);
            this.f۸۴۵۵d[imageType].put("ImageLength", defaultCropSizeYAttribute);
        } else if (topBorderAttribute == null || leftBorderAttribute == null || bottomBorderAttribute == null || rightBorderAttribute == null) {
            m۱۰۱۳۴c(in, imageType);
        } else {
            int topBorderValue = topBorderAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
            int bottomBorderValue = bottomBorderAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
            int rightBorderValue = rightBorderAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
            int leftBorderValue = leftBorderAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
            if (bottomBorderValue > topBorderValue && rightBorderValue > leftBorderValue) {
                Cc imageLengthAttribute = Cc.m۱۰۱۴۹a(bottomBorderValue - topBorderValue, this.f۸۴۵۶e);
                Cc imageWidthAttribute = Cc.m۱۰۱۴۹a(rightBorderValue - leftBorderValue, this.f۸۴۵۶e);
                this.f۸۴۵۵d[imageType].put("ImageLength", imageLengthAttribute);
                this.f۸۴۵۵d[imageType].put("ImageWidth", imageWidthAttribute);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.e.a$b  reason: invalid class name */
    public static class Cb extends InputStream implements DataInput {

        /* renamed from: g  reason: contains not printable characters */
        private static final ByteOrder f۸۴۶۳g = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: h  reason: contains not printable characters */
        private static final ByteOrder f۸۴۶۴h = ByteOrder.BIG_ENDIAN;

        /* renamed from: c  reason: contains not printable characters */
        private DataInputStream f۸۴۶۵c;

        /* renamed from: d  reason: contains not printable characters */
        private ByteOrder f۸۴۶۶d;

        /* renamed from: e  reason: contains not printable characters */
        private final int f۸۴۶۷e;

        /* renamed from: f  reason: contains not printable characters */
        private int f۸۴۶۸f;

        public Cb(InputStream in) {
            this.f۸۴۶۶d = ByteOrder.BIG_ENDIAN;
            this.f۸۴۶۵c = new DataInputStream(in);
            this.f۸۴۶۷e = this.f۸۴۶۵c.available();
            this.f۸۴۶۸f = 0;
            this.f۸۴۶۵c.mark(this.f۸۴۶۷e);
        }

        public Cb(byte[] bytes) {
            this(new ByteArrayInputStream(bytes));
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۱۴۵a(ByteOrder byteOrder) {
            this.f۸۴۶۶d = byteOrder;
        }

        /* renamed from: g  reason: contains not printable characters */
        public void m۱۰۱۴۶g(long byteCount) {
            int i = this.f۸۴۶۸f;
            if (((long) i) > byteCount) {
                this.f۸۴۶۸f = 0;
                this.f۸۴۶۵c.reset();
                this.f۸۴۶۵c.mark(this.f۸۴۶۷e);
            } else {
                byteCount -= (long) i;
            }
            if (skipBytes((int) byteCount) != ((int) byteCount)) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: l  reason: contains not printable characters */
        public int m۱۰۱۴۷l() {
            return this.f۸۴۶۸f;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f۸۴۶۵c.available();
        }

        @Override // java.io.InputStream
        public int read() {
            this.f۸۴۶۸f++;
            return this.f۸۴۶۵c.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] b, int off, int len) {
            int bytesRead = this.f۸۴۶۵c.read(b, off, len);
            this.f۸۴۶۸f += bytesRead;
            return bytesRead;
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f۸۴۶۸f++;
            return this.f۸۴۶۵c.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f۸۴۶۸f++;
            return this.f۸۴۶۵c.readBoolean();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f۸۴۶۸f += 2;
            return this.f۸۴۶۵c.readChar();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f۸۴۶۸f += 2;
            return this.f۸۴۶۵c.readUTF();
        }

        @Override // java.io.DataInput
        public void readFully(byte[] buffer, int offset, int length) {
            this.f۸۴۶۸f += length;
            if (this.f۸۴۶۸f > this.f۸۴۶۷e) {
                throw new EOFException();
            } else if (this.f۸۴۶۵c.read(buffer, offset, length) != length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public void readFully(byte[] buffer) {
            this.f۸۴۶۸f += buffer.length;
            if (this.f۸۴۶۸f > this.f۸۴۶۷e) {
                throw new EOFException();
            } else if (this.f۸۴۶۵c.read(buffer, 0, buffer.length) != buffer.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f۸۴۶۸f++;
            if (this.f۸۴۶۸f <= this.f۸۴۶۷e) {
                int ch = this.f۸۴۶۵c.read();
                if (ch >= 0) {
                    return (byte) ch;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f۸۴۶۸f += 2;
            if (this.f۸۴۶۸f <= this.f۸۴۶۷e) {
                int ch1 = this.f۸۴۶۵c.read();
                int ch2 = this.f۸۴۶۵c.read();
                if ((ch1 | ch2) >= 0) {
                    ByteOrder byteOrder = this.f۸۴۶۶d;
                    if (byteOrder == f۸۴۶۳g) {
                        return (short) ((ch2 << 8) + ch1);
                    }
                    if (byteOrder == f۸۴۶۴h) {
                        return (short) ((ch1 << 8) + ch2);
                    }
                    throw new IOException("Invalid byte order: " + this.f۸۴۶۶d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f۸۴۶۸f += 4;
            if (this.f۸۴۶۸f <= this.f۸۴۶۷e) {
                int ch1 = this.f۸۴۶۵c.read();
                int ch2 = this.f۸۴۶۵c.read();
                int ch3 = this.f۸۴۶۵c.read();
                int ch4 = this.f۸۴۶۵c.read();
                if ((ch1 | ch2 | ch3 | ch4) >= 0) {
                    ByteOrder byteOrder = this.f۸۴۶۶d;
                    if (byteOrder == f۸۴۶۳g) {
                        return (ch4 << 24) + (ch3 << 16) + (ch2 << 8) + ch1;
                    }
                    if (byteOrder == f۸۴۶۴h) {
                        return (ch1 << 24) + (ch2 << 16) + (ch3 << 8) + ch4;
                    }
                    throw new IOException("Invalid byte order: " + this.f۸۴۶۶d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int byteCount) {
            int totalSkip = Math.min(byteCount, this.f۸۴۶۷e - this.f۸۴۶۸f);
            int skipped = 0;
            while (skipped < totalSkip) {
                skipped += this.f۸۴۶۵c.skipBytes(totalSkip - skipped);
            }
            this.f۸۴۶۸f += skipped;
            return skipped;
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f۸۴۶۸f += 2;
            if (this.f۸۴۶۸f <= this.f۸۴۶۷e) {
                int ch1 = this.f۸۴۶۵c.read();
                int ch2 = this.f۸۴۶۵c.read();
                if ((ch1 | ch2) >= 0) {
                    ByteOrder byteOrder = this.f۸۴۶۶d;
                    if (byteOrder == f۸۴۶۳g) {
                        return (ch2 << 8) + ch1;
                    }
                    if (byteOrder == f۸۴۶۴h) {
                        return (ch1 << 8) + ch2;
                    }
                    throw new IOException("Invalid byte order: " + this.f۸۴۶۶d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        /* renamed from: m  reason: contains not printable characters */
        public long m۱۰۱۴۸m() {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f۸۴۶۸f += 8;
            if (this.f۸۴۶۸f <= this.f۸۴۶۷e) {
                int ch1 = this.f۸۴۶۵c.read();
                int ch2 = this.f۸۴۶۵c.read();
                int ch3 = this.f۸۴۶۵c.read();
                int ch4 = this.f۸۴۶۵c.read();
                int ch5 = this.f۸۴۶۵c.read();
                int ch6 = this.f۸۴۶۵c.read();
                int ch7 = this.f۸۴۶۵c.read();
                int ch8 = this.f۸۴۶۵c.read();
                if ((ch1 | ch2 | ch3 | ch4 | ch5 | ch6 | ch7 | ch8) >= 0) {
                    ByteOrder byteOrder = this.f۸۴۶۶d;
                    if (byteOrder == f۸۴۶۳g) {
                        return (((long) ch8) << 56) + (((long) ch7) << 48) + (((long) ch6) << 40) + (((long) ch5) << 32) + (((long) ch4) << 24) + (((long) ch3) << 16) + (((long) ch2) << 8) + ((long) ch1);
                    }
                    if (byteOrder == f۸۴۶۴h) {
                        return (((long) ch1) << 56) + (((long) ch2) << 48) + (((long) ch3) << 40) + (((long) ch4) << 32) + (((long) ch5) << 24) + (((long) ch6) << 16) + (((long) ch7) << 8) + ((long) ch8);
                    }
                    throw new IOException("Invalid byte order: " + this.f۸۴۶۶d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۱۱۳a(int firstIfdType, int secondIfdType) {
        if (!this.f۸۴۵۵d[firstIfdType].isEmpty() && !this.f۸۴۵۵d[secondIfdType].isEmpty()) {
            Cc firstImageLengthAttribute = this.f۸۴۵۵d[firstIfdType].get("ImageLength");
            Cc firstImageWidthAttribute = this.f۸۴۵۵d[firstIfdType].get("ImageWidth");
            Cc secondImageLengthAttribute = this.f۸۴۵۵d[secondIfdType].get("ImageLength");
            Cc secondImageWidthAttribute = this.f۸۴۵۵d[secondIfdType].get("ImageWidth");
            if (firstImageLengthAttribute != null && firstImageWidthAttribute != null && secondImageLengthAttribute != null && secondImageWidthAttribute != null) {
                int firstImageLengthValue = firstImageLengthAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
                int firstImageWidthValue = firstImageWidthAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
                int secondImageLengthValue = secondImageLengthAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
                int secondImageWidthValue = secondImageWidthAttribute.m۱۰۱۵۹b(this.f۸۴۵۶e);
                if (firstImageLengthValue < secondImageLengthValue && firstImageWidthValue < secondImageWidthValue) {
                    HashMap<String, ExifInterface.ExifAttribute>[] hashMapArr = this.f۸۴۵۵d;
                    HashMap<String, ExifInterface.ExifAttribute> tempMap = hashMapArr[firstIfdType];
                    hashMapArr[firstIfdType] = hashMapArr[secondIfdType];
                    hashMapArr[secondIfdType] = tempMap;
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۰۱۱۸a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException rethrown) {
                throw rethrown;
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static long[] m۱۰۱۲۳a(Object inputObj) {
        if (inputObj instanceof int[]) {
            int[] input = (int[]) inputObj;
            long[] result = new long[input.length];
            for (int i = 0; i < input.length; i++) {
                result[i] = (long) input[i];
            }
            return result;
        } else if (inputObj instanceof long[]) {
            return (long[]) inputObj;
        } else {
            return null;
        }
    }
}
