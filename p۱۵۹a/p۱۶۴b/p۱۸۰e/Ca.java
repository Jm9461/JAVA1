package p۱۵۹a.p۱۶۴b.p۱۸۰e;

import android.content.res.AssetManager;
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

/* renamed from: a.b.e.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {

    /* renamed from: A, reason: contains not printable characters */
    private static final d[] f۸۴۲۵A;

    /* renamed from: B, reason: contains not printable characters */
    private static final d[] f۸۴۲۶B;

    /* renamed from: C, reason: contains not printable characters */
    private static final d[] f۸۴۲۷C;

    /* renamed from: D, reason: contains not printable characters */
    private static final d[] f۸۴۲۸D;

    /* renamed from: E, reason: contains not printable characters */
    static final d[][] f۸۴۲۹E;

    /* renamed from: F, reason: contains not printable characters */
    private static final d[] f۸۴۳۰F;

    /* renamed from: G, reason: contains not printable characters */
    private static final HashMap<Integer, d>[] f۸۴۳۱G;

    /* renamed from: H, reason: contains not printable characters */
    private static final HashMap<String, d>[] f۸۴۳۲H;

    /* renamed from: I, reason: contains not printable characters */
    private static final HashSet<String> f۸۴۳۳I;

    /* renamed from: J, reason: contains not printable characters */
    private static final HashMap<Integer, Integer> f۸۴۳۴J;

    /* renamed from: K, reason: contains not printable characters */
    private static final Charset f۸۴۳۵K;

    /* renamed from: L, reason: contains not printable characters */
    static final byte[] f۸۴۳۶L;

    /* renamed from: l, reason: contains not printable characters */
    public static final int[] f۸۴۳۷l;

    /* renamed from: m, reason: contains not printable characters */
    public static final int[] f۸۴۳۸m;

    /* renamed from: n, reason: contains not printable characters */
    static final byte[] f۸۴۳۹n;

    /* renamed from: o, reason: contains not printable characters */
    private static final byte[] f۸۴۴۰o;

    /* renamed from: p, reason: contains not printable characters */
    private static final byte[] f۸۴۴۱p;

    /* renamed from: q, reason: contains not printable characters */
    private static SimpleDateFormat f۸۴۴۲q;

    /* renamed from: r, reason: contains not printable characters */
    static final String[] f۸۴۴۳r;

    /* renamed from: s, reason: contains not printable characters */
    static final int[] f۸۴۴۴s;

    /* renamed from: t, reason: contains not printable characters */
    private static final byte[] f۸۴۴۵t;

    /* renamed from: u, reason: contains not printable characters */
    private static final d[] f۸۴۴۶u;

    /* renamed from: v, reason: contains not printable characters */
    private static final d[] f۸۴۴۷v;

    /* renamed from: w, reason: contains not printable characters */
    private static final d[] f۸۴۴۸w;

    /* renamed from: x, reason: contains not printable characters */
    private static final d[] f۸۴۴۹x;

    /* renamed from: y, reason: contains not printable characters */
    private static final d[] f۸۴۵۰y;

    /* renamed from: z, reason: contains not printable characters */
    private static final d f۸۴۵۱z;

    /* renamed from: a, reason: contains not printable characters */
    private final String f۸۴۵۲a;

    /* renamed from: b, reason: contains not printable characters */
    private final AssetManager.AssetInputStream f۸۴۵۳b;

    /* renamed from: c, reason: contains not printable characters */
    private int f۸۴۵۴c;

    /* renamed from: d, reason: contains not printable characters */
    private final HashMap<String, c>[] f۸۴۵۵d = new HashMap[f۸۴۲۹E.length];

    /* renamed from: e, reason: contains not printable characters */
    private ByteOrder f۸۴۵۶e = ByteOrder.BIG_ENDIAN;

    /* renamed from: f, reason: contains not printable characters */
    private int f۸۴۵۷f;

    /* renamed from: g, reason: contains not printable characters */
    private int f۸۴۵۸g;

    /* renamed from: h, reason: contains not printable characters */
    private int f۸۴۵۹h;

    /* renamed from: i, reason: contains not printable characters */
    private int f۸۴۶۰i;

    /* renamed from: j, reason: contains not printable characters */
    private int f۸۴۶۱j;

    /* renamed from: k, reason: contains not printable characters */
    private int f۸۴۶۲k;

    static {
        int i = 4;
        int i2 = 3;
        int i3 = 2;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f۸۴۳۷l = new int[]{8, 8, 8};
        new int[1][0] = 4;
        f۸۴۳۸m = new int[]{8};
        f۸۴۳۹n = new byte[]{-1, -40, -1};
        f۸۴۴۰o = new byte[]{79, 76, 89, 77, 80, 0};
        f۸۴۴۱p = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f۸۴۴۳r = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
        f۸۴۴۴s = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f۸۴۴۵t = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        int i4 = 3;
        int i5 = 4;
        int i6 = 5;
        int i7 = 5;
        f۸۴۴۶u = new d[]{new d("NewSubfileType", 254, i), new d("SubfileType", 255, i), new d("ImageWidth", 256, i4, i5), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, i2), new d("Compression", 259, i2), new d("PhotometricInterpretation", 262, i2), new d("ImageDescription", 270, i3), new d("Make", 271, i3), new d("Model", 272, i3), new d("StripOffsets", 273, i4, i5), new d("Orientation", 274, i2), new d("SamplesPerPixel", 277, i2), new d("RowsPerStrip", 278, i4, i5), new d("StripByteCounts", 279, i4, i5), new d("XResolution", 282, i6), new d("YResolution", 283, i6), new d("PlanarConfiguration", 284, i2), new d("ResolutionUnit", 296, i2), new d("TransferFunction", 301, i2), new d("Software", 305, i3), new d("DateTime", 306, i3), new d("Artist", 315, i3), new d("WhitePoint", 318, i7), new d("PrimaryChromaticities", 319, i7), new d("SubIFDPointer", 330, i), new d("JPEGInterchangeFormat", 513, i), new d("JPEGInterchangeFormatLength", 514, i), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, i2), new d("YCbCrPositioning", 531, i2), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, i3), new d("ExifIFDPointer", 34665, i), new d("GPSInfoIFDPointer", 34853, i), new d("SensorTopBorder", i, i), new d("SensorLeftBorder", 5, i), new d("SensorBottomBorder", 6, i), new d("SensorRightBorder", 7, i), new d("ISO", 23, i2), new d("JpgFromRaw", 46, 7)};
        int i8 = 5;
        int i9 = 7;
        int i10 = 5;
        int i11 = 10;
        int i12 = 5;
        int i13 = 7;
        int i14 = 3;
        int i15 = 4;
        int i16 = 5;
        int i17 = 7;
        f۸۴۴۷v = new d[]{new d("ExposureTime", 33434, i8), new d("FNumber", 33437, i8), new d("ExposureProgram", 34850, i2), new d("SpectralSensitivity", 34852, i3), new d("PhotographicSensitivity", 34855, i2), new d("OECF", 34856, i9), new d("ExifVersion", 36864, i3), new d("DateTimeOriginal", 36867, i3), new d("DateTimeDigitized", 36868, i3), new d("ComponentsConfiguration", 37121, i9), new d("CompressedBitsPerPixel", 37122, i10), new d("ShutterSpeedValue", 37377, i11), new d("ApertureValue", 37378, i10), new d("BrightnessValue", 37379, i11), new d("ExposureBiasValue", 37380, i11), new d("MaxApertureValue", 37381, i12), new d("SubjectDistance", 37382, i12), new d("MeteringMode", 37383, i2), new d("LightSource", 37384, i2), new d("Flash", 37385, i2), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, i2), new d("MakerNote", 37500, i13), new d("UserComment", 37510, i13), new d("SubSecTime", 37520, i3), new d("SubSecTimeOriginal", 37521, i3), new d("SubSecTimeDigitized", 37522, i3), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, i2), new d("PixelXDimension", 40962, i14, i15), new d("PixelYDimension", 40963, i14, i15), new d("RelatedSoundFile", 40964, i3), new d("InteroperabilityIFDPointer", 40965, i), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, i16), new d("FocalPlaneYResolution", 41487, i16), new d("FocalPlaneResolutionUnit", 41488, i2), new d("SubjectLocation", 41492, i2), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, i2), new d("FileSource", 41728, i17), new d("SceneType", 41729, i17), new d("CFAPattern", 41730, i17), new d("CustomRendered", 41985, i2), new d("ExposureMode", 41986, i2), new d("WhiteBalance", 41987, i2), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, i2), new d("SceneCaptureType", 41990, i2), new d("GainControl", 41991, i2), new d("Contrast", 41992, i2), new d("Saturation", 41993, i2), new d("Sharpness", 41994, i2), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, i2), new d("ImageUniqueID", 42016, i3), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, i14, i15)};
        int i18 = 1;
        int i19 = 5;
        int i20 = 5;
        int i21 = 7;
        f۸۴۴۸w = new d[]{new d("GPSVersionID", 0, i18), new d("GPSLatitudeRef", i18, i3), new d("GPSLatitude", i3, i19), new d("GPSLongitudeRef", i2, i3), new d("GPSLongitude", i, i19), new d("GPSAltitudeRef", i19, 1), new d("GPSAltitude", 6, i19), new d("GPSTimeStamp", 7, i19), new d("GPSSatellites", 8, i3), new d("GPSStatus", 9, i3), new d("GPSMeasureMode", 10, i3), new d("GPSDOP", 11, i20), new d("GPSSpeedRef", 12, i3), new d("GPSSpeed", 13, i20), new d("GPSTrackRef", 14, i3), new d("GPSTrack", 15, i20), new d("GPSImgDirectionRef", 16, i3), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, i3), new d("GPSDestLatitudeRef", 19, i3), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, i3), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, i3), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, i3), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, i21), new d("GPSAreaInformation", 28, i21), new d("GPSDateStamp", 29, i3), new d("GPSDifferential", 30, i2)};
        f۸۴۴۹x = new d[]{new d("InteroperabilityIndex", 1, i3)};
        int i22 = 5;
        int i23 = 5;
        f۸۴۵۰y = new d[]{new d("NewSubfileType", 254, i), new d("SubfileType", 255, i), new d("ThumbnailImageWidth", 256, i14, i15), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, i2), new d("Compression", 259, i2), new d("PhotometricInterpretation", 262, i2), new d("ImageDescription", 270, i3), new d("Make", 271, i3), new d("Model", 272, i3), new d("StripOffsets", 273, i14, i15), new d("Orientation", 274, i2), new d("SamplesPerPixel", 277, i2), new d("RowsPerStrip", 278, i14, i15), new d("StripByteCounts", 279, i14, i15), new d("XResolution", 282, i22), new d("YResolution", 283, i22), new d("PlanarConfiguration", 284, i2), new d("ResolutionUnit", 296, i2), new d("TransferFunction", 301, i2), new d("Software", 305, i3), new d("DateTime", 306, i3), new d("Artist", 315, i3), new d("WhitePoint", 318, i23), new d("PrimaryChromaticities", 319, i23), new d("SubIFDPointer", 330, i), new d("JPEGInterchangeFormat", 513, i), new d("JPEGInterchangeFormatLength", 514, i), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, i2), new d("YCbCrPositioning", 531, i2), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, i3), new d("ExifIFDPointer", 34665, i), new d("GPSInfoIFDPointer", 34853, i), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, i14, i15)};
        f۸۴۵۱z = new d("StripOffsets", 273, i2);
        f۸۴۲۵A = new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, i), new d("ImageProcessingIFDPointer", 8256, i)};
        f۸۴۲۶B = new d[]{new d("PreviewImageStart", 257, i), new d("PreviewImageLength", 258, i)};
        f۸۴۲۷C = new d[]{new d("AspectFrame", 4371, i2)};
        f۸۴۲۸D = new d[]{new d("ColorSpace", 55, i2)};
        d[] dVarArr = f۸۴۴۶u;
        f۸۴۲۹E = new d[][]{dVarArr, f۸۴۴۷v, f۸۴۴۸w, f۸۴۴۹x, f۸۴۵۰y, dVarArr, f۸۴۲۵A, f۸۴۲۶B, f۸۴۲۷C, f۸۴۲۸D};
        int i24 = 1;
        f۸۴۳۰F = new d[]{new d("SubIFDPointer", 330, i), new d("ExifIFDPointer", 34665, i), new d("GPSInfoIFDPointer", 34853, i), new d("InteroperabilityIFDPointer", 40965, i), new d("CameraSettingsIFDPointer", 8224, i24), new d("ImageProcessingIFDPointer", 8256, i24)};
        new d("JPEGInterchangeFormat", 513, i);
        new d("JPEGInterchangeFormatLength", 514, i);
        d[][] dVarArr2 = f۸۴۲۹E;
        f۸۴۳۱G = new HashMap[dVarArr2.length];
        f۸۴۳۲H = new HashMap[dVarArr2.length];
        f۸۴۳۳I = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f۸۴۳۴J = new HashMap<>();
        f۸۴۳۵K = Charset.forName("US-ASCII");
        f۸۴۳۶L = "Exif\u0000\u0000".getBytes(f۸۴۳۵K);
        f۸۴۴۲q = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f۸۴۴۲q.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int ifdType = 0; ifdType < f۸۴۲۹E.length; ifdType++) {
            f۸۴۳۱G[ifdType] = new HashMap<>();
            f۸۴۳۲H[ifdType] = new HashMap<>();
            for (d tag : f۸۴۲۹E[ifdType]) {
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

    /* renamed from: a.b.e.a$e */
    private static class e {

        /* renamed from: a, reason: contains not printable characters */
        public final long f۸۴۷۶a;

        /* renamed from: b, reason: contains not printable characters */
        public final long f۸۴۷۷b;

        private e(long numerator, long denominator) {
            if (denominator == 0) {
                this.f۸۴۷۶a = 0L;
                this.f۸۴۷۷b = 1L;
            } else {
                this.f۸۴۷۶a = numerator;
                this.f۸۴۷۷b = denominator;
            }
        }

        public String toString() {
            return this.f۸۴۷۶a + "/" + this.f۸۴۷۷b;
        }

        /* renamed from: a, reason: contains not printable characters */
        public double m۸۰۹۶a() {
            double d2 = this.f۸۴۷۶a;
            double d3 = this.f۸۴۷۷b;
            Double.isNaN(d2);
            Double.isNaN(d3);
            return d2 / d3;
        }
    }

    /* renamed from: a.b.e.a$c */
    private static class c {

        /* renamed from: a, reason: contains not printable characters */
        public final int f۸۴۶۹a;

        /* renamed from: b, reason: contains not printable characters */
        public final int f۸۴۷۰b;

        /* renamed from: c, reason: contains not printable characters */
        public final byte[] f۸۴۷۱c;

        private c(int format, int numberOfComponents, byte[] bytes) {
            this.f۸۴۶۹a = format;
            this.f۸۴۷۰b = numberOfComponents;
            this.f۸۴۷۱c = bytes;
        }

        /* renamed from: a, reason: contains not printable characters */
        public static c m۸۰۸۶a(int[] values, ByteOrder byteOrder) {
            ByteBuffer buffer = ByteBuffer.wrap(new byte[Ca.f۸۴۴۴s[3] * values.length]);
            buffer.order(byteOrder);
            for (int value : values) {
                buffer.putShort((short) value);
            }
            return new c(3, values.length, buffer.array());
        }

        /* renamed from: a, reason: contains not printable characters */
        public static c m۸۰۸۲a(int value, ByteOrder byteOrder) {
            return m۸۰۸۶a(new int[]{value}, byteOrder);
        }

        /* renamed from: a, reason: contains not printable characters */
        public static c m۸۰۸۷a(long[] values, ByteOrder byteOrder) {
            ByteBuffer buffer = ByteBuffer.wrap(new byte[Ca.f۸۴۴۴s[4] * values.length]);
            buffer.order(byteOrder);
            for (long value : values) {
                buffer.putInt((int) value);
            }
            return new c(4, values.length, buffer.array());
        }

        /* renamed from: a, reason: contains not printable characters */
        public static c m۸۰۸۳a(long value, ByteOrder byteOrder) {
            return m۸۰۸۷a(new long[]{value}, byteOrder);
        }

        /* renamed from: a, reason: contains not printable characters */
        public static c m۸۰۸۵a(String value) {
            byte[] ascii = (value + (char) 0).getBytes(Ca.f۸۴۳۵K);
            return new c(2, ascii.length, ascii);
        }

        /* renamed from: a, reason: contains not printable characters */
        public static c m۸۰۸۸a(e[] values, ByteOrder byteOrder) {
            ByteBuffer buffer = ByteBuffer.wrap(new byte[Ca.f۸۴۴۴s[5] * values.length]);
            buffer.order(byteOrder);
            for (e value : values) {
                buffer.putInt((int) value.f۸۴۷۶a);
                buffer.putInt((int) value.f۸۴۷۷b);
            }
            return new c(5, values.length, buffer.array());
        }

        /* renamed from: a, reason: contains not printable characters */
        public static c m۸۰۸۴a(e value, ByteOrder byteOrder) {
            return m۸۰۸۸a(new e[]{value}, byteOrder);
        }

        public String toString() {
            return "(" + Ca.f۸۴۴۳r[this.f۸۴۶۹a] + ", data length:" + this.f۸۴۷۱c.length + ")";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:174:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:181:? A[SYNTHETIC] */
        /* renamed from: d, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object m۸۰۹۰d(java.nio.ByteOrder r22) {
            /*
                Method dump skipped, instructions count: 570
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p۱۵۹a.p۱۶۴b.p۱۸۰e.Ca.c.m۸۰۹۰d(java.nio.ByteOrder):java.lang.Object");
        }

        /* renamed from: a, reason: contains not printable characters */
        public double m۸۰۹۱a(ByteOrder byteOrder) {
            Object value = m۸۰۹۰d(byteOrder);
            if (value == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (value instanceof String) {
                return Double.parseDouble((String) value);
            }
            if (value instanceof long[]) {
                long[] array = (long[]) value;
                if (array.length == 1) {
                    return array[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (value instanceof int[]) {
                int[] array2 = (int[]) value;
                if (array2.length == 1) {
                    return array2[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (value instanceof double[]) {
                double[] array3 = (double[]) value;
                if (array3.length == 1) {
                    return array3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (value instanceof e[]) {
                e[] array4 = (e[]) value;
                if (array4.length == 1) {
                    return array4[0].m۸۰۹۶a();
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a double value");
        }

        /* renamed from: b, reason: contains not printable characters */
        public int m۸۰۹۲b(ByteOrder byteOrder) {
            Object value = m۸۰۹۰d(byteOrder);
            if (value == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (value instanceof String) {
                return Integer.parseInt((String) value);
            }
            if (value instanceof long[]) {
                long[] array = (long[]) value;
                if (array.length == 1) {
                    return (int) array[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (value instanceof int[]) {
                int[] array2 = (int[]) value;
                if (array2.length == 1) {
                    return array2[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a integer value");
        }

        /* renamed from: c, reason: contains not printable characters */
        public String m۸۰۹۳c(ByteOrder byteOrder) {
            Object value = m۸۰۹۰d(byteOrder);
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
            }
            if (value instanceof int[]) {
                int[] array2 = (int[]) value;
                for (int i2 = 0; i2 < array2.length; i2++) {
                    stringBuilder.append(array2[i2]);
                    if (i2 + 1 != array2.length) {
                        stringBuilder.append(",");
                    }
                }
                return stringBuilder.toString();
            }
            if (value instanceof double[]) {
                double[] array3 = (double[]) value;
                for (int i3 = 0; i3 < array3.length; i3++) {
                    stringBuilder.append(array3[i3]);
                    if (i3 + 1 != array3.length) {
                        stringBuilder.append(",");
                    }
                }
                return stringBuilder.toString();
            }
            if (!(value instanceof e[])) {
                return null;
            }
            e[] array4 = (e[]) value;
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

    /* renamed from: a.b.e.a$d */
    static class d {

        /* renamed from: a, reason: contains not printable characters */
        public final int f۸۴۷۲a;

        /* renamed from: b, reason: contains not printable characters */
        public final String f۸۴۷۳b;

        /* renamed from: c, reason: contains not printable characters */
        public final int f۸۴۷۴c;

        /* renamed from: d, reason: contains not printable characters */
        public final int f۸۴۷۵d;

        private d(String name, int number, int format) {
            this.f۸۴۷۳b = name;
            this.f۸۴۷۲a = number;
            this.f۸۴۷۴c = format;
            this.f۸۴۷۵d = -1;
        }

        private d(String name, int number, int primaryFormat, int secondaryFormat) {
            this.f۸۴۷۳b = name;
            this.f۸۴۷۲a = number;
            this.f۸۴۷۴c = primaryFormat;
            this.f۸۴۷۵d = secondaryFormat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a, reason: contains not printable characters */
        public boolean m۸۰۹۴a(int format) {
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
            return (this.f۸۴۷۴c == 12 || this.f۸۴۷۵d == 12) && format == 11;
        }
    }

    public Ca(String filename) {
        if (filename == null) {
            throw new IllegalArgumentException("filename cannot be null");
        }
        FileInputStream in = null;
        this.f۸۴۵۳b = null;
        this.f۸۴۵۲a = filename;
        try {
            in = new FileInputStream(filename);
            m۸۰۵۲a((InputStream) in);
        } finally {
            m۸۰۵۱a((Closeable) in);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private c m۸۰۵۷b(String tag) {
        if ("ISOSpeedRatings".equals(tag)) {
            tag = "PhotographicSensitivity";
        }
        for (int i = 0; i < f۸۴۲۹E.length; i++) {
            c value = this.f۸۴۵۵d[i].get(tag);
            if (value != null) {
                return value;
            }
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۸۰۷۵a(String tag) {
        c attribute = m۸۰۵۷b(tag);
        if (attribute == null) {
            return null;
        }
        if (!f۸۴۳۳I.contains(tag)) {
            return attribute.m۸۰۹۳c(this.f۸۴۵۶e);
        }
        if (tag.equals("GPSTimeStamp")) {
            int i = attribute.f۸۴۶۹a;
            if (i == 5 || i == 10) {
                e[] array = (e[]) attribute.m۸۰۹۰d(this.f۸۴۵۶e);
                if (array == null || array.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(array));
                    return null;
                }
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (array[0].f۸۴۷۶a / array[0].f۸۴۷۷b)), Integer.valueOf((int) (array[1].f۸۴۷۶a / array[1].f۸۴۷۷b)), Integer.valueOf((int) (array[2].f۸۴۷۶a / array[2].f۸۴۷۷b)));
            }
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + attribute.f۸۴۶۹a);
            return null;
        }
        try {
            return Double.toString(attribute.m۸۰۹۱a(this.f۸۴۵۶e));
        } catch (NumberFormatException e2) {
            return null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۸۰۷۴a(String tag, int defaultValue) {
        c exifAttribute = m۸۰۵۷b(tag);
        if (exifAttribute == null) {
            return defaultValue;
        }
        try {
            return exifAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
        } catch (NumberFormatException e2) {
            return defaultValue;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۸۰۵۲a(InputStream in) {
        for (int i = 0; i < f۸۴۲۹E.length; i++) {
            try {
                this.f۸۴۵۵d[i] = new HashMap<>();
            } catch (IOException e2) {
            } catch (Throwable th) {
                m۸۰۶۵c();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(in, 5000);
        this.f۸۴۵۴c = m۸۰۴۴a(bufferedInputStream);
        b inputStream = new b(bufferedInputStream);
        switch (this.f۸۴۵۴c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                m۸۰۶۶c(inputStream);
                break;
            case 4:
                m۸۰۴۹a(inputStream, 0, 0);
                break;
            case 7:
                m۸۰۴۷a(inputStream);
                break;
            case 9:
                m۸۰۵۸b(inputStream);
                break;
            case 10:
                m۸۰۶۹d(inputStream);
                break;
        }
        m۸۰۷۳f(inputStream);
        m۸۰۶۵c();
    }

    /* renamed from: a, reason: contains not printable characters */
    private int m۸۰۴۴a(BufferedInputStream in) {
        in.mark(5000);
        byte[] signatureCheckBytes = new byte[5000];
        in.read(signatureCheckBytes);
        in.reset();
        if (m۸۰۵۵a(signatureCheckBytes)) {
            return 4;
        }
        if (m۸۰۶۸c(signatureCheckBytes)) {
            return 9;
        }
        if (m۸۰۶۳b(signatureCheckBytes)) {
            return 7;
        }
        if (m۸۰۷۱d(signatureCheckBytes)) {
            return 10;
        }
        return 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۸۰۵۵a(byte[] signatureCheckBytes) {
        int i = 0;
        while (true) {
            byte[] bArr = f۸۴۳۹n;
            if (i < bArr.length) {
                if (signatureCheckBytes[i] == bArr[i]) {
                    i++;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private boolean m۸۰۶۸c(byte[] signatureCheckBytes) {
        byte[] rafSignatureBytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < rafSignatureBytes.length; i++) {
            if (signatureCheckBytes[i] != rafSignatureBytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۸۰۶۳b(byte[] signatureCheckBytes) {
        b signatureInputStream = new b(signatureCheckBytes);
        this.f۸۴۵۶e = m۸۰۷۲e(signatureInputStream);
        signatureInputStream.m۸۰۷۸a(this.f۸۴۵۶e);
        short orfSignature = signatureInputStream.readShort();
        signatureInputStream.close();
        return orfSignature == 20306 || orfSignature == 21330;
    }

    /* renamed from: d, reason: contains not printable characters */
    private boolean m۸۰۷۱d(byte[] signatureCheckBytes) {
        b signatureInputStream = new b(signatureCheckBytes);
        this.f۸۴۵۶e = m۸۰۷۲e(signatureInputStream);
        signatureInputStream.m۸۰۷۸a(this.f۸۴۵۶e);
        short signatureByte = signatureInputStream.readShort();
        signatureInputStream.close();
        return signatureByte == 85;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0059 A[FALL_THROUGH] */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m۸۰۴۹a(p۱۵۹a.p۱۶۴b.p۱۸۰e.Ca.b r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۵۹a.p۱۶۴b.p۱۸۰e.Ca.m۸۰۴۹a(a.b.e.a$b, int, int):void");
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۸۰۶۶c(b in) {
        c makerNoteAttribute;
        m۸۰۴۸a(in, in.available());
        m۸۰۵۹b(in, 0);
        m۸۰۷۰d(in, 0);
        m۸۰۷۰d(in, 5);
        m۸۰۷۰d(in, 4);
        m۸۰۶۱b((InputStream) in);
        if (this.f۸۴۵۴c == 8 && (makerNoteAttribute = this.f۸۴۵۵d[1].get("MakerNote")) != null) {
            b makerNoteDataInputStream = new b(makerNoteAttribute.f۸۴۷۱c);
            makerNoteDataInputStream.m۸۰۷۸a(this.f۸۴۵۶e);
            makerNoteDataInputStream.m۸۰۷۹g(6L);
            m۸۰۵۹b(makerNoteDataInputStream, 9);
            c colorSpaceAttribute = this.f۸۴۵۵d[9].get("ColorSpace");
            if (colorSpaceAttribute != null) {
                this.f۸۴۵۵d[1].put("ColorSpace", colorSpaceAttribute);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۸۰۵۸b(b in) {
        in.skipBytes(84);
        byte[] jpegOffsetBytes = new byte[4];
        byte[] cfaHeaderOffsetBytes = new byte[4];
        in.read(jpegOffsetBytes);
        in.skipBytes(4);
        in.read(cfaHeaderOffsetBytes);
        int rafJpegOffset = ByteBuffer.wrap(jpegOffsetBytes).getInt();
        int rafCfaHeaderOffset = ByteBuffer.wrap(cfaHeaderOffsetBytes).getInt();
        m۸۰۴۹a(in, rafJpegOffset, 5);
        in.m۸۰۷۹g(rafCfaHeaderOffset);
        in.m۸۰۷۸a(ByteOrder.BIG_ENDIAN);
        int numberOfDirectoryEntry = in.readInt();
        for (int i = 0; i < numberOfDirectoryEntry; i++) {
            int tagNumber = in.readUnsignedShort();
            int numberOfBytes = in.readUnsignedShort();
            if (tagNumber == f۸۴۵۱z.f۸۴۷۲a) {
                int imageLength = in.readShort();
                int imageWidth = in.readShort();
                c imageLengthAttribute = c.m۸۰۸۲a(imageLength, this.f۸۴۵۶e);
                c imageWidthAttribute = c.m۸۰۸۲a(imageWidth, this.f۸۴۵۶e);
                this.f۸۴۵۵d[0].put("ImageLength", imageLengthAttribute);
                this.f۸۴۵۵d[0].put("ImageWidth", imageWidthAttribute);
                return;
            }
            in.skipBytes(numberOfBytes);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۸۰۴۷a(b in) {
        m۸۰۶۶c(in);
        c makerNoteAttribute = this.f۸۴۵۵d[1].get("MakerNote");
        if (makerNoteAttribute != null) {
            b makerNoteDataInputStream = new b(makerNoteAttribute.f۸۴۷۱c);
            makerNoteDataInputStream.m۸۰۷۸a(this.f۸۴۵۶e);
            byte[] makerNoteHeader1Bytes = new byte[f۸۴۴۰o.length];
            makerNoteDataInputStream.readFully(makerNoteHeader1Bytes);
            makerNoteDataInputStream.m۸۰۷۹g(0L);
            byte[] makerNoteHeader2Bytes = new byte[f۸۴۴۱p.length];
            makerNoteDataInputStream.readFully(makerNoteHeader2Bytes);
            if (Arrays.equals(makerNoteHeader1Bytes, f۸۴۴۰o)) {
                makerNoteDataInputStream.m۸۰۷۹g(8L);
            } else if (Arrays.equals(makerNoteHeader2Bytes, f۸۴۴۱p)) {
                makerNoteDataInputStream.m۸۰۷۹g(12L);
            }
            m۸۰۵۹b(makerNoteDataInputStream, 6);
            c imageStartAttribute = this.f۸۴۵۵d[7].get("PreviewImageStart");
            c imageLengthAttribute = this.f۸۴۵۵d[7].get("PreviewImageLength");
            if (imageStartAttribute != null && imageLengthAttribute != null) {
                this.f۸۴۵۵d[5].put("JPEGInterchangeFormat", imageStartAttribute);
                this.f۸۴۵۵d[5].put("JPEGInterchangeFormatLength", imageLengthAttribute);
            }
            c aspectFrameAttribute = this.f۸۴۵۵d[8].get("AspectFrame");
            if (aspectFrameAttribute != null) {
                int[] aspectFrameValues = (int[]) aspectFrameAttribute.m۸۰۹۰d(this.f۸۴۵۶e);
                if (aspectFrameValues == null || aspectFrameValues.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(aspectFrameValues));
                    return;
                }
                if (aspectFrameValues[2] > aspectFrameValues[0] && aspectFrameValues[3] > aspectFrameValues[1]) {
                    int primaryImageWidth = (aspectFrameValues[2] - aspectFrameValues[0]) + 1;
                    int primaryImageLength = (aspectFrameValues[3] - aspectFrameValues[1]) + 1;
                    if (primaryImageWidth < primaryImageLength) {
                        int primaryImageWidth2 = primaryImageWidth + primaryImageLength;
                        primaryImageLength = primaryImageWidth2 - primaryImageLength;
                        primaryImageWidth = primaryImageWidth2 - primaryImageLength;
                    }
                    c primaryImageWidthAttribute = c.m۸۰۸۲a(primaryImageWidth, this.f۸۴۵۶e);
                    c primaryImageLengthAttribute = c.m۸۰۸۲a(primaryImageLength, this.f۸۴۵۶e);
                    this.f۸۴۵۵d[0].put("ImageWidth", primaryImageWidthAttribute);
                    this.f۸۴۵۵d[0].put("ImageLength", primaryImageLengthAttribute);
                }
            }
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۸۰۶۹d(b in) {
        m۸۰۶۶c(in);
        c jpgFromRawAttribute = this.f۸۴۵۵d[0].get("JpgFromRaw");
        if (jpgFromRawAttribute != null) {
            m۸۰۴۹a(in, this.f۸۴۶۲k, 5);
        }
        c rw2IsoAttribute = this.f۸۴۵۵d[0].get("ISO");
        c exifIsoAttribute = this.f۸۴۵۵d[1].get("PhotographicSensitivity");
        if (rw2IsoAttribute != null && exifIsoAttribute == null) {
            this.f۸۴۵۵d[1].put("PhotographicSensitivity", rw2IsoAttribute);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۸۰۵۳a(byte[] exifBytes, int imageType) {
        b dataInputStream = new b(exifBytes);
        m۸۰۴۸a(dataInputStream, exifBytes.length);
        m۸۰۵۹b(dataInputStream, imageType);
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۸۰۶۵c() {
        String valueOfDateTimeOriginal = m۸۰۷۵a("DateTimeOriginal");
        if (valueOfDateTimeOriginal != null && m۸۰۷۵a("DateTime") == null) {
            this.f۸۴۵۵d[0].put("DateTime", c.m۸۰۸۵a(valueOfDateTimeOriginal));
        }
        if (m۸۰۷۵a("ImageWidth") == null) {
            this.f۸۴۵۵d[0].put("ImageWidth", c.m۸۰۸۳a(0L, this.f۸۴۵۶e));
        }
        if (m۸۰۷۵a("ImageLength") == null) {
            this.f۸۴۵۵d[0].put("ImageLength", c.m۸۰۸۳a(0L, this.f۸۴۵۶e));
        }
        if (m۸۰۷۵a("Orientation") == null) {
            this.f۸۴۵۵d[0].put("Orientation", c.m۸۰۸۳a(0L, this.f۸۴۵۶e));
        }
        if (m۸۰۷۵a("LightSource") == null) {
            this.f۸۴۵۵d[1].put("LightSource", c.m۸۰۸۳a(0L, this.f۸۴۵۶e));
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    private ByteOrder m۸۰۷۲e(b dataInputStream) {
        short byteOrder = dataInputStream.readShort();
        if (byteOrder == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (byteOrder == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(byteOrder));
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۸۰۴۸a(b dataInputStream, int exifBytesLength) {
        this.f۸۴۵۶e = m۸۰۷۲e(dataInputStream);
        dataInputStream.m۸۰۷۸a(this.f۸۴۵۶e);
        int startCode = dataInputStream.readUnsignedShort();
        int i = this.f۸۴۵۴c;
        if (i != 7 && i != 10 && startCode != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(startCode));
        }
        int firstIfdOffset = dataInputStream.readInt();
        if (firstIfdOffset < 8 || firstIfdOffset >= exifBytesLength) {
            throw new IOException("Invalid first Ifd offset: " + firstIfdOffset);
        }
        int firstIfdOffset2 = firstIfdOffset - 8;
        if (firstIfdOffset2 > 0 && dataInputStream.skipBytes(firstIfdOffset2) != firstIfdOffset2) {
            throw new IOException("Couldn't jump to first Ifd: " + firstIfdOffset2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ff  */
    /* renamed from: b, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m۸۰۵۹b(p۱۵۹a.p۱۶۴b.p۱۸۰e.Ca.b r26, int r27) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۵۹a.p۱۶۴b.p۱۸۰e.Ca.m۸۰۵۹b(a.b.e.a$b, int):void");
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۸۰۶۷c(b in, int imageType) {
        c jpegInterchangeFormatAttribute;
        c imageLengthAttribute = this.f۸۴۵۵d[imageType].get("ImageLength");
        c imageWidthAttribute = this.f۸۴۵۵d[imageType].get("ImageWidth");
        if ((imageLengthAttribute == null || imageWidthAttribute == null) && (jpegInterchangeFormatAttribute = this.f۸۴۵۵d[imageType].get("JPEGInterchangeFormat")) != null) {
            int jpegInterchangeFormat = jpegInterchangeFormatAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
            m۸۰۴۹a(in, jpegInterchangeFormat, imageType);
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    private void m۸۰۷۳f(b in) {
        HashMap thumbnailData = this.f۸۴۵۵d[4];
        c compressionAttribute = thumbnailData.get("Compression");
        if (compressionAttribute != null) {
            this.f۸۴۵۷f = compressionAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
            int i = this.f۸۴۵۷f;
            if (i != 1) {
                if (i == 6) {
                    m۸۰۵۰a(in, thumbnailData);
                    return;
                } else if (i != 7) {
                    return;
                }
            }
            if (m۸۰۵۴a(thumbnailData)) {
                m۸۰۶۰b(in, thumbnailData);
                return;
            }
            return;
        }
        this.f۸۴۵۷f = 6;
        m۸۰۵۰a(in, thumbnailData);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۸۰۵۰a(b in, HashMap thumbnailData) {
        c jpegInterchangeFormatAttribute = (c) thumbnailData.get("JPEGInterchangeFormat");
        c jpegInterchangeFormatLengthAttribute = (c) thumbnailData.get("JPEGInterchangeFormatLength");
        if (jpegInterchangeFormatAttribute != null && jpegInterchangeFormatLengthAttribute != null) {
            int thumbnailOffset = jpegInterchangeFormatAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
            int thumbnailLength = Math.min(jpegInterchangeFormatLengthAttribute.m۸۰۹۲b(this.f۸۴۵۶e), in.available() - thumbnailOffset);
            int i = this.f۸۴۵۴c;
            if (i == 4 || i == 9 || i == 10) {
                thumbnailOffset += this.f۸۴۵۸g;
            } else if (i == 7) {
                thumbnailOffset += this.f۸۴۵۹h;
            }
            if (thumbnailOffset > 0 && thumbnailLength > 0 && this.f۸۴۵۲a == null && this.f۸۴۵۳b == null) {
                byte[] thumbnailBytes = new byte[thumbnailLength];
                in.m۸۰۷۹g(thumbnailOffset);
                in.readFully(thumbnailBytes);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۸۰۶۰b(b in, HashMap thumbnailData) {
        c stripOffsetsAttribute = (c) thumbnailData.get("StripOffsets");
        c stripByteCountsAttribute = (c) thumbnailData.get("StripByteCounts");
        if (stripOffsetsAttribute != null && stripByteCountsAttribute != null) {
            long[] stripOffsets = m۸۰۵۶a(stripOffsetsAttribute.m۸۰۹۰d(this.f۸۴۵۶e));
            long[] stripByteCounts = m۸۰۵۶a(stripByteCountsAttribute.m۸۰۹۰d(this.f۸۴۵۶e));
            if (stripOffsets == null) {
                Log.w("ExifInterface", "stripOffsets should not be null.");
                return;
            }
            if (stripByteCounts == null) {
                Log.w("ExifInterface", "stripByteCounts should not be null.");
                return;
            }
            long totalStripByteCount = 0;
            for (long byteCount : stripByteCounts) {
                totalStripByteCount += byteCount;
            }
            byte[] totalStripBytes = new byte[(int) totalStripByteCount];
            int bytesRead = 0;
            int bytesAdded = 0;
            int i = 0;
            while (i < stripOffsets.length) {
                long totalStripByteCount2 = totalStripByteCount;
                int stripOffset = (int) stripOffsets[i];
                c stripOffsetsAttribute2 = stripOffsetsAttribute;
                int stripByteCount = (int) stripByteCounts[i];
                int skipBytes = stripOffset - bytesRead;
                if (skipBytes < 0) {
                    Log.d("ExifInterface", "Invalid strip offset value");
                }
                c stripByteCountsAttribute2 = stripByteCountsAttribute;
                in.m۸۰۷۹g(skipBytes);
                byte[] stripBytes = new byte[stripByteCount];
                in.read(stripBytes);
                bytesRead = bytesRead + skipBytes + stripByteCount;
                System.arraycopy(stripBytes, 0, totalStripBytes, bytesAdded, stripBytes.length);
                bytesAdded += stripBytes.length;
                i++;
                stripOffsetsAttribute = stripOffsetsAttribute2;
                stripByteCountsAttribute = stripByteCountsAttribute2;
                totalStripByteCount = totalStripByteCount2;
                stripOffsets = stripOffsets;
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۸۰۵۴a(HashMap thumbnailData) {
        c photometricInterpretationAttribute;
        c bitsPerSampleAttribute = (c) thumbnailData.get("BitsPerSample");
        if (bitsPerSampleAttribute != null) {
            int[] bitsPerSampleValue = (int[]) bitsPerSampleAttribute.m۸۰۹۰d(this.f۸۴۵۶e);
            if (Arrays.equals(f۸۴۳۷l, bitsPerSampleValue)) {
                return true;
            }
            if (this.f۸۴۵۴c == 3 && (photometricInterpretationAttribute = (c) thumbnailData.get("PhotometricInterpretation")) != null) {
                int photometricInterpretationValue = photometricInterpretationAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
                return (photometricInterpretationValue == 1 && Arrays.equals(bitsPerSampleValue, f۸۴۳۸m)) || (photometricInterpretationValue == 6 && Arrays.equals(bitsPerSampleValue, f۸۴۳۷l));
            }
            return false;
        }
        return false;
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۸۰۶۲b(HashMap map) {
        c imageLengthAttribute = (c) map.get("ImageLength");
        c imageWidthAttribute = (c) map.get("ImageWidth");
        if (imageLengthAttribute != null && imageWidthAttribute != null) {
            int imageLengthValue = imageLengthAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
            int imageWidthValue = imageWidthAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
            if (imageLengthValue <= 512 && imageWidthValue <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۸۰۶۱b(InputStream in) {
        m۸۰۴۶a(0, 5);
        m۸۰۴۶a(0, 4);
        m۸۰۴۶a(5, 4);
        c pixelXDimAttribute = this.f۸۴۵۵d[1].get("PixelXDimension");
        c pixelYDimAttribute = this.f۸۴۵۵d[1].get("PixelYDimension");
        if (pixelXDimAttribute != null && pixelYDimAttribute != null) {
            this.f۸۴۵۵d[0].put("ImageWidth", pixelXDimAttribute);
            this.f۸۴۵۵d[0].put("ImageLength", pixelYDimAttribute);
        }
        if (this.f۸۴۵۵d[4].isEmpty() && m۸۰۶۲b(this.f۸۴۵۵d[5])) {
            HashMap<String, c>[] hashMapArr = this.f۸۴۵۵d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m۸۰۶۲b(this.f۸۴۵۵d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۸۰۷۰d(b in, int imageType) {
        c defaultCropSizeXAttribute;
        c defaultCropSizeYAttribute;
        c defaultCropSizeAttribute = this.f۸۴۵۵d[imageType].get("DefaultCropSize");
        c topBorderAttribute = this.f۸۴۵۵d[imageType].get("SensorTopBorder");
        c leftBorderAttribute = this.f۸۴۵۵d[imageType].get("SensorLeftBorder");
        c bottomBorderAttribute = this.f۸۴۵۵d[imageType].get("SensorBottomBorder");
        c rightBorderAttribute = this.f۸۴۵۵d[imageType].get("SensorRightBorder");
        if (defaultCropSizeAttribute != null) {
            if (defaultCropSizeAttribute.f۸۴۶۹a == 5) {
                e[] defaultCropSizeValue = (e[]) defaultCropSizeAttribute.m۸۰۹۰d(this.f۸۴۵۶e);
                if (defaultCropSizeValue == null || defaultCropSizeValue.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(defaultCropSizeValue));
                    return;
                }
                defaultCropSizeXAttribute = c.m۸۰۸۴a(defaultCropSizeValue[0], this.f۸۴۵۶e);
                defaultCropSizeYAttribute = c.m۸۰۸۴a(defaultCropSizeValue[1], this.f۸۴۵۶e);
            } else {
                int[] defaultCropSizeValue2 = (int[]) defaultCropSizeAttribute.m۸۰۹۰d(this.f۸۴۵۶e);
                if (defaultCropSizeValue2 == null || defaultCropSizeValue2.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(defaultCropSizeValue2));
                    return;
                }
                defaultCropSizeXAttribute = c.m۸۰۸۲a(defaultCropSizeValue2[0], this.f۸۴۵۶e);
                defaultCropSizeYAttribute = c.m۸۰۸۲a(defaultCropSizeValue2[1], this.f۸۴۵۶e);
            }
            this.f۸۴۵۵d[imageType].put("ImageWidth", defaultCropSizeXAttribute);
            this.f۸۴۵۵d[imageType].put("ImageLength", defaultCropSizeYAttribute);
            return;
        }
        if (topBorderAttribute != null && leftBorderAttribute != null && bottomBorderAttribute != null && rightBorderAttribute != null) {
            int topBorderValue = topBorderAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
            int bottomBorderValue = bottomBorderAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
            int rightBorderValue = rightBorderAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
            int leftBorderValue = leftBorderAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
            if (bottomBorderValue > topBorderValue && rightBorderValue > leftBorderValue) {
                int length = bottomBorderValue - topBorderValue;
                int width = rightBorderValue - leftBorderValue;
                c imageLengthAttribute = c.m۸۰۸۲a(length, this.f۸۴۵۶e);
                c imageWidthAttribute = c.m۸۰۸۲a(width, this.f۸۴۵۶e);
                this.f۸۴۵۵d[imageType].put("ImageLength", imageLengthAttribute);
                this.f۸۴۵۵d[imageType].put("ImageWidth", imageWidthAttribute);
                return;
            }
            return;
        }
        m۸۰۶۷c(in, imageType);
    }

    /* renamed from: a.b.e.a$b */
    private static class b extends InputStream implements DataInput {

        /* renamed from: g, reason: contains not printable characters */
        private static final ByteOrder f۸۴۶۳g = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: h, reason: contains not printable characters */
        private static final ByteOrder f۸۴۶۴h = ByteOrder.BIG_ENDIAN;

        /* renamed from: c, reason: contains not printable characters */
        private DataInputStream f۸۴۶۵c;

        /* renamed from: d, reason: contains not printable characters */
        private ByteOrder f۸۴۶۶d;

        /* renamed from: e, reason: contains not printable characters */
        private final int f۸۴۶۷e;

        /* renamed from: f, reason: contains not printable characters */
        private int f۸۴۶۸f;

        public b(InputStream in) {
            this.f۸۴۶۶d = ByteOrder.BIG_ENDIAN;
            this.f۸۴۶۵c = new DataInputStream(in);
            this.f۸۴۶۷e = this.f۸۴۶۵c.available();
            this.f۸۴۶۸f = 0;
            this.f۸۴۶۵c.mark(this.f۸۴۶۷e);
        }

        public b(byte[] bytes) {
            this(new ByteArrayInputStream(bytes));
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۸۰۷۸a(ByteOrder byteOrder) {
            this.f۸۴۶۶d = byteOrder;
        }

        /* renamed from: g, reason: contains not printable characters */
        public void m۸۰۷۹g(long byteCount) {
            int i = this.f۸۴۶۸f;
            if (i > byteCount) {
                this.f۸۴۶۸f = 0;
                this.f۸۴۶۵c.reset();
                this.f۸۴۶۵c.mark(this.f۸۴۶۷e);
            } else {
                byteCount -= i;
            }
            if (skipBytes((int) byteCount) != ((int) byteCount)) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: l, reason: contains not printable characters */
        public int m۸۰۸۰l() {
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
        public int read(byte[] b2, int off, int len) {
            int bytesRead = this.f۸۴۶۵c.read(b2, off, len);
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
            }
            if (this.f۸۴۶۵c.read(buffer, offset, length) != length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public void readFully(byte[] buffer) {
            this.f۸۴۶۸f += buffer.length;
            if (this.f۸۴۶۸f > this.f۸۴۶۷e) {
                throw new EOFException();
            }
            if (this.f۸۴۶۵c.read(buffer, 0, buffer.length) != buffer.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f۸۴۶۸f++;
            if (this.f۸۴۶۸f > this.f۸۴۶۷e) {
                throw new EOFException();
            }
            int ch = this.f۸۴۶۵c.read();
            if (ch < 0) {
                throw new EOFException();
            }
            return (byte) ch;
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f۸۴۶۸f += 2;
            if (this.f۸۴۶۸f > this.f۸۴۶۷e) {
                throw new EOFException();
            }
            int ch1 = this.f۸۴۶۵c.read();
            int ch2 = this.f۸۴۶۵c.read();
            if ((ch1 | ch2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f۸۴۶۶d;
            if (byteOrder == f۸۴۶۳g) {
                return (short) ((ch2 << 8) + ch1);
            }
            if (byteOrder == f۸۴۶۴h) {
                return (short) ((ch1 << 8) + ch2);
            }
            throw new IOException("Invalid byte order: " + this.f۸۴۶۶d);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f۸۴۶۸f += 4;
            if (this.f۸۴۶۸f > this.f۸۴۶۷e) {
                throw new EOFException();
            }
            int ch1 = this.f۸۴۶۵c.read();
            int ch2 = this.f۸۴۶۵c.read();
            int ch3 = this.f۸۴۶۵c.read();
            int ch4 = this.f۸۴۶۵c.read();
            if ((ch1 | ch2 | ch3 | ch4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f۸۴۶۶d;
            if (byteOrder == f۸۴۶۳g) {
                return (ch4 << 24) + (ch3 << 16) + (ch2 << 8) + ch1;
            }
            if (byteOrder == f۸۴۶۴h) {
                return (ch1 << 24) + (ch2 << 16) + (ch3 << 8) + ch4;
            }
            throw new IOException("Invalid byte order: " + this.f۸۴۶۶d);
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
            if (this.f۸۴۶۸f > this.f۸۴۶۷e) {
                throw new EOFException();
            }
            int ch1 = this.f۸۴۶۵c.read();
            int ch2 = this.f۸۴۶۵c.read();
            if ((ch1 | ch2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f۸۴۶۶d;
            if (byteOrder == f۸۴۶۳g) {
                return (ch2 << 8) + ch1;
            }
            if (byteOrder == f۸۴۶۴h) {
                return (ch1 << 8) + ch2;
            }
            throw new IOException("Invalid byte order: " + this.f۸۴۶۶d);
        }

        /* renamed from: m, reason: contains not printable characters */
        public long m۸۰۸۱m() {
            return readInt() & 4294967295L;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f۸۴۶۸f += 8;
            if (this.f۸۴۶۸f > this.f۸۴۶۷e) {
                throw new EOFException();
            }
            int ch1 = this.f۸۴۶۵c.read();
            int ch2 = this.f۸۴۶۵c.read();
            int ch3 = this.f۸۴۶۵c.read();
            int ch4 = this.f۸۴۶۵c.read();
            int ch5 = this.f۸۴۶۵c.read();
            int ch6 = this.f۸۴۶۵c.read();
            int ch7 = this.f۸۴۶۵c.read();
            int ch8 = this.f۸۴۶۵c.read();
            if ((ch1 | ch2 | ch3 | ch4 | ch5 | ch6 | ch7 | ch8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f۸۴۶۶d;
            if (byteOrder == f۸۴۶۳g) {
                return (ch8 << 56) + (ch7 << 48) + (ch6 << 40) + (ch5 << 32) + (ch4 << 24) + (ch3 << 16) + (ch2 << 8) + ch1;
            }
            if (byteOrder != f۸۴۶۴h) {
                throw new IOException("Invalid byte order: " + this.f۸۴۶۶d);
            }
            return (ch1 << 56) + (ch2 << 48) + (ch3 << 40) + (ch4 << 32) + (ch5 << 24) + (ch6 << 16) + (ch7 << 8) + ch8;
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

    /* renamed from: a, reason: contains not printable characters */
    private void m۸۰۴۶a(int firstIfdType, int secondIfdType) {
        if (this.f۸۴۵۵d[firstIfdType].isEmpty() || this.f۸۴۵۵d[secondIfdType].isEmpty()) {
            return;
        }
        c firstImageLengthAttribute = this.f۸۴۵۵d[firstIfdType].get("ImageLength");
        c firstImageWidthAttribute = this.f۸۴۵۵d[firstIfdType].get("ImageWidth");
        c secondImageLengthAttribute = this.f۸۴۵۵d[secondIfdType].get("ImageLength");
        c secondImageWidthAttribute = this.f۸۴۵۵d[secondIfdType].get("ImageWidth");
        if (firstImageLengthAttribute != null && firstImageWidthAttribute != null && secondImageLengthAttribute != null && secondImageWidthAttribute != null) {
            int firstImageLengthValue = firstImageLengthAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
            int firstImageWidthValue = firstImageWidthAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
            int secondImageLengthValue = secondImageLengthAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
            int secondImageWidthValue = secondImageWidthAttribute.m۸۰۹۲b(this.f۸۴۵۶e);
            if (firstImageLengthValue < secondImageLengthValue && firstImageWidthValue < secondImageWidthValue) {
                HashMap<String, c>[] hashMapArr = this.f۸۴۵۵d;
                HashMap<String, c> hashMap = hashMapArr[firstIfdType];
                hashMapArr[firstIfdType] = hashMapArr[secondIfdType];
                hashMapArr[secondIfdType] = hashMap;
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۸۰۵۱a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException rethrown) {
                throw rethrown;
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static long[] m۸۰۵۶a(Object inputObj) {
        if (inputObj instanceof int[]) {
            int[] input = (int[]) inputObj;
            long[] result = new long[input.length];
            for (int i = 0; i < input.length; i++) {
                result[i] = input[i];
            }
            return result;
        }
        if (inputObj instanceof long[]) {
            return (long[]) inputObj;
        }
        return null;
    }
}
