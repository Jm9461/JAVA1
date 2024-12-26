package a.b.e;

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

public class a {
    private static final d[] A = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
    private static final d[] B = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
    private static final d[] C = {new d("AspectFrame", 4371, 3)};
    private static final d[] D = {new d("ColorSpace", 55, 3)};
    static final d[][] E;
    private static final d[] F = {new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
    private static final HashMap<Integer, d>[] G;
    private static final HashMap<String, d>[] H;
    private static final HashSet<String> I = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
    private static final HashMap<Integer, Integer> J = new HashMap<>();
    private static final Charset K = Charset.forName("US-ASCII");
    static final byte[] L = "Exif\u0000\u0000".getBytes(K);
    public static final int[] l = {8, 8, 8};
    public static final int[] m = {8};
    static final byte[] n = {-1, -40, -1};
    private static final byte[] o = {79, 76, 89, 77, 80, 0};
    private static final byte[] p = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static SimpleDateFormat q = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    static final String[] r = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    static final int[] s = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static final byte[] t = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final d[] u = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7)};
    private static final d[] v = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
    private static final d[] w = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3)};
    private static final d[] x = {new d("InteroperabilityIndex", 1, 2)};
    private static final d[] y = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
    private static final d z = new d("StripOffsets", 273, 3);

    /* renamed from: a  reason: collision with root package name */
    private final String f۱۴۰a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager.AssetInputStream f۱۴۱b;

    /* renamed from: c  reason: collision with root package name */
    private int f۱۴۲c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, c>[] f۱۴۳d = new HashMap[E.length];

    /* renamed from: e  reason: collision with root package name */
    private ByteOrder f۱۴۴e = ByteOrder.BIG_ENDIAN;

    /* renamed from: f  reason: collision with root package name */
    private int f۱۴۵f;

    /* renamed from: g  reason: collision with root package name */
    private int f۱۴۶g;

    /* renamed from: h  reason: collision with root package name */
    private int f۱۴۷h;
    private int i;
    private int j;
    private int k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        new int[1][0] = 4;
        d[] dVarArr = u;
        E = new d[][]{dVarArr, v, w, x, y, dVarArr, A, B, C, D};
        new d("JPEGInterchangeFormat", 513, 4);
        new d("JPEGInterchangeFormatLength", 514, 4);
        d[][] dVarArr2 = E;
        G = new HashMap[dVarArr2.length];
        H = new HashMap[dVarArr2.length];
        q.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int ifdType = 0; ifdType < E.length; ifdType++) {
            G[ifdType] = new HashMap<>();
            H[ifdType] = new HashMap<>();
            d[] dVarArr3 = E[ifdType];
            for (d tag : dVarArr3) {
                G[ifdType].put(Integer.valueOf(tag.f۱۵۷a), tag);
                H[ifdType].put(tag.f۱۵۸b, tag);
            }
        }
        J.put(Integer.valueOf(F[0].f۱۵۷a), 5);
        J.put(Integer.valueOf(F[1].f۱۵۷a), 1);
        J.put(Integer.valueOf(F[2].f۱۵۷a), 2);
        J.put(Integer.valueOf(F[3].f۱۵۷a), 3);
        J.put(Integer.valueOf(F[4].f۱۵۷a), 7);
        J.put(Integer.valueOf(F[5].f۱۵۷a), 8);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    /* access modifiers changed from: private */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f۱۶۱a;

        /* renamed from: b  reason: collision with root package name */
        public final long f۱۶۲b;

        private e(long numerator, long denominator) {
            if (denominator == 0) {
                this.f۱۶۱a = 0;
                this.f۱۶۲b = 1;
                return;
            }
            this.f۱۶۱a = numerator;
            this.f۱۶۲b = denominator;
        }

        public String toString() {
            return this.f۱۶۱a + "/" + this.f۱۶۲b;
        }

        public double a() {
            double d2 = (double) this.f۱۶۱a;
            double d3 = (double) this.f۱۶۲b;
            Double.isNaN(d2);
            Double.isNaN(d3);
            return d2 / d3;
        }
    }

    /* access modifiers changed from: private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f۱۵۴a;

        /* renamed from: b  reason: collision with root package name */
        public final int f۱۵۵b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f۱۵۶c;

        private c(int format, int numberOfComponents, byte[] bytes) {
            this.f۱۵۴a = format;
            this.f۱۵۵b = numberOfComponents;
            this.f۱۵۶c = bytes;
        }

        public static c a(int[] values, ByteOrder byteOrder) {
            ByteBuffer buffer = ByteBuffer.wrap(new byte[(a.s[3] * values.length)]);
            buffer.order(byteOrder);
            for (int value : values) {
                buffer.putShort((short) value);
            }
            return new c(3, values.length, buffer.array());
        }

        public static c a(int value, ByteOrder byteOrder) {
            return a(new int[]{value}, byteOrder);
        }

        public static c a(long[] values, ByteOrder byteOrder) {
            ByteBuffer buffer = ByteBuffer.wrap(new byte[(a.s[4] * values.length)]);
            buffer.order(byteOrder);
            for (long value : values) {
                buffer.putInt((int) value);
            }
            return new c(4, values.length, buffer.array());
        }

        public static c a(long value, ByteOrder byteOrder) {
            return a(new long[]{value}, byteOrder);
        }

        public static c a(String value) {
            byte[] ascii = (value + (char) 0).getBytes(a.K);
            return new c(2, ascii.length, ascii);
        }

        public static c a(e[] values, ByteOrder byteOrder) {
            ByteBuffer buffer = ByteBuffer.wrap(new byte[(a.s[5] * values.length)]);
            buffer.order(byteOrder);
            for (e value : values) {
                buffer.putInt((int) value.f۱۶۱a);
                buffer.putInt((int) value.f۱۶۲b);
            }
            return new c(5, values.length, buffer.array());
        }

        public static c a(e value, ByteOrder byteOrder) {
            return a(new e[]{value}, byteOrder);
        }

        public String toString() {
            return "(" + a.r[this.f۱۵۴a] + ", data length:" + this.f۱۵۶c.length + ")";
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x0202 A[SYNTHETIC, Splitter:B:141:0x0202] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Object d(java.nio.ByteOrder r22) {
            /*
            // Method dump skipped, instructions count: 570
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.e.a.c.d(java.nio.ByteOrder):java.lang.Object");
        }

        public double a(ByteOrder byteOrder) {
            Object value = d(byteOrder);
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
                } else if (value instanceof e[]) {
                    e[] array4 = (e[]) value;
                    if (array4.length == 1) {
                        return array4[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int b(ByteOrder byteOrder) {
            Object value = d(byteOrder);
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

        public String c(ByteOrder byteOrder) {
            Object value = d(byteOrder);
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
            } else if (!(value instanceof e[])) {
                return null;
            } else {
                e[] array4 = (e[]) value;
                for (int i4 = 0; i4 < array4.length; i4++) {
                    stringBuilder.append(array4[i4].f۱۶۱a);
                    stringBuilder.append('/');
                    stringBuilder.append(array4[i4].f۱۶۲b);
                    if (i4 + 1 != array4.length) {
                        stringBuilder.append(",");
                    }
                }
                return stringBuilder.toString();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f۱۵۷a;

        /* renamed from: b  reason: collision with root package name */
        public final String f۱۵۸b;

        /* renamed from: c  reason: collision with root package name */
        public final int f۱۵۹c;

        /* renamed from: d  reason: collision with root package name */
        public final int f۱۶۰d;

        private d(String name, int number, int format) {
            this.f۱۵۸b = name;
            this.f۱۵۷a = number;
            this.f۱۵۹c = format;
            this.f۱۶۰d = -1;
        }

        private d(String name, int number, int primaryFormat, int secondaryFormat) {
            this.f۱۵۸b = name;
            this.f۱۵۷a = number;
            this.f۱۵۹c = primaryFormat;
            this.f۱۶۰d = secondaryFormat;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private boolean a(int format) {
            int i;
            int i2 = this.f۱۵۹c;
            if (i2 == 7 || format == 7 || i2 == format || (i = this.f۱۶۰d) == format) {
                return true;
            }
            if ((i2 == 4 || i == 4) && format == 3) {
                return true;
            }
            if ((this.f۱۵۹c == 9 || this.f۱۶۰d == 9) && format == 8) {
                return true;
            }
            if ((this.f۱۵۹c == 12 || this.f۱۶۰d == 12) && format == 11) {
                return true;
            }
            return false;
        }
    }

    public a(String filename) {
        if (filename != null) {
            FileInputStream in = null;
            this.f۱۴۱b = null;
            this.f۱۴۰a = filename;
            try {
                in = new FileInputStream(filename);
                a((InputStream) in);
            } finally {
                a((Closeable) in);
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    private c b(String tag) {
        if ("ISOSpeedRatings".equals(tag)) {
            tag = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < E.length; i2++) {
            c value = this.f۱۴۳d[i2].get(tag);
            if (value != null) {
                return value;
            }
        }
        return null;
    }

    public String a(String tag) {
        c attribute = b(tag);
        if (attribute == null) {
            return null;
        }
        if (!I.contains(tag)) {
            return attribute.c(this.f۱۴۴e);
        }
        if (tag.equals("GPSTimeStamp")) {
            int i2 = attribute.f۱۵۴a;
            if (i2 == 5 || i2 == 10) {
                e[] array = (e[]) attribute.d(this.f۱۴۴e);
                if (array == null || array.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(array));
                    return null;
                }
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) array[0].f۱۶۱a) / ((float) array[0].f۱۶۲b))), Integer.valueOf((int) (((float) array[1].f۱۶۱a) / ((float) array[1].f۱۶۲b))), Integer.valueOf((int) (((float) array[2].f۱۶۱a) / ((float) array[2].f۱۶۲b))));
            }
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + attribute.f۱۵۴a);
            return null;
        }
        try {
            return Double.toString(attribute.a(this.f۱۴۴e));
        } catch (NumberFormatException e2) {
            return null;
        }
    }

    public int a(String tag, int defaultValue) {
        c exifAttribute = b(tag);
        if (exifAttribute == null) {
            return defaultValue;
        }
        try {
            return exifAttribute.b(this.f۱۴۴e);
        } catch (NumberFormatException e2) {
            return defaultValue;
        }
    }

    private void a(InputStream in) {
        for (int i2 = 0; i2 < E.length; i2++) {
            try {
                this.f۱۴۳d[i2] = new HashMap<>();
            } catch (IOException e2) {
            } catch (Throwable th) {
                c();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(in, 5000);
        this.f۱۴۲c = a(bufferedInputStream);
        b inputStream = new b(bufferedInputStream);
        switch (this.f۱۴۲c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                c(inputStream);
                break;
            case 4:
                a(inputStream, 0, 0);
                break;
            case 7:
                a(inputStream);
                break;
            case 9:
                b(inputStream);
                break;
            case 10:
                d(inputStream);
                break;
        }
        f(inputStream);
        c();
    }

    private int a(BufferedInputStream in) {
        in.mark(5000);
        byte[] signatureCheckBytes = new byte[5000];
        in.read(signatureCheckBytes);
        in.reset();
        if (a(signatureCheckBytes)) {
            return 4;
        }
        if (c(signatureCheckBytes)) {
            return 9;
        }
        if (b(signatureCheckBytes)) {
            return 7;
        }
        if (d(signatureCheckBytes)) {
            return 10;
        }
        return 0;
    }

    private static boolean a(byte[] signatureCheckBytes) {
        int i2 = 0;
        while (true) {
            byte[] bArr = n;
            if (i2 >= bArr.length) {
                return true;
            }
            if (signatureCheckBytes[i2] != bArr[i2]) {
                return false;
            }
            i2++;
        }
    }

    private boolean c(byte[] signatureCheckBytes) {
        byte[] rafSignatureBytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < rafSignatureBytes.length; i2++) {
            if (signatureCheckBytes[i2] != rafSignatureBytes[i2]) {
                return false;
            }
        }
        return true;
    }

    private boolean b(byte[] signatureCheckBytes) {
        b signatureInputStream = new b(signatureCheckBytes);
        this.f۱۴۴e = e(signatureInputStream);
        signatureInputStream.a(this.f۱۴۴e);
        short orfSignature = signatureInputStream.readShort();
        signatureInputStream.close();
        return orfSignature == 20306 || orfSignature == 21330;
    }

    private boolean d(byte[] signatureCheckBytes) {
        b signatureInputStream = new b(signatureCheckBytes);
        this.f۱۴۴e = e(signatureInputStream);
        signatureInputStream.a(this.f۱۴۴e);
        short signatureByte = signatureInputStream.readShort();
        signatureInputStream.close();
        return signatureByte == 85;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059 A[FALL_THROUGH] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(a.b.e.a.b r12, int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 414
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.e.a.a(a.b.e.a$b, int, int):void");
    }

    private void c(b in) {
        c makerNoteAttribute;
        a(in, in.available());
        b(in, 0);
        d(in, 0);
        d(in, 5);
        d(in, 4);
        b((InputStream) in);
        if (this.f۱۴۲c == 8 && (makerNoteAttribute = this.f۱۴۳d[1].get("MakerNote")) != null) {
            b makerNoteDataInputStream = new b(makerNoteAttribute.f۱۵۶c);
            makerNoteDataInputStream.a(this.f۱۴۴e);
            makerNoteDataInputStream.g(6);
            b(makerNoteDataInputStream, 9);
            c colorSpaceAttribute = this.f۱۴۳d[9].get("ColorSpace");
            if (colorSpaceAttribute != null) {
                this.f۱۴۳d[1].put("ColorSpace", colorSpaceAttribute);
            }
        }
    }

    private void b(b in) {
        in.skipBytes(84);
        byte[] jpegOffsetBytes = new byte[4];
        byte[] cfaHeaderOffsetBytes = new byte[4];
        in.read(jpegOffsetBytes);
        in.skipBytes(4);
        in.read(cfaHeaderOffsetBytes);
        int rafJpegOffset = ByteBuffer.wrap(jpegOffsetBytes).getInt();
        int rafCfaHeaderOffset = ByteBuffer.wrap(cfaHeaderOffsetBytes).getInt();
        a(in, rafJpegOffset, 5);
        in.g((long) rafCfaHeaderOffset);
        in.a(ByteOrder.BIG_ENDIAN);
        int numberOfDirectoryEntry = in.readInt();
        for (int i2 = 0; i2 < numberOfDirectoryEntry; i2++) {
            int tagNumber = in.readUnsignedShort();
            int numberOfBytes = in.readUnsignedShort();
            if (tagNumber == z.f۱۵۷a) {
                int imageLength = in.readShort();
                int imageWidth = in.readShort();
                c imageLengthAttribute = c.a(imageLength, this.f۱۴۴e);
                c imageWidthAttribute = c.a(imageWidth, this.f۱۴۴e);
                this.f۱۴۳d[0].put("ImageLength", imageLengthAttribute);
                this.f۱۴۳d[0].put("ImageWidth", imageWidthAttribute);
                return;
            }
            in.skipBytes(numberOfBytes);
        }
    }

    private void a(b in) {
        c(in);
        c makerNoteAttribute = this.f۱۴۳d[1].get("MakerNote");
        if (makerNoteAttribute != null) {
            b makerNoteDataInputStream = new b(makerNoteAttribute.f۱۵۶c);
            makerNoteDataInputStream.a(this.f۱۴۴e);
            byte[] makerNoteHeader1Bytes = new byte[o.length];
            makerNoteDataInputStream.readFully(makerNoteHeader1Bytes);
            makerNoteDataInputStream.g(0);
            byte[] makerNoteHeader2Bytes = new byte[p.length];
            makerNoteDataInputStream.readFully(makerNoteHeader2Bytes);
            if (Arrays.equals(makerNoteHeader1Bytes, o)) {
                makerNoteDataInputStream.g(8);
            } else if (Arrays.equals(makerNoteHeader2Bytes, p)) {
                makerNoteDataInputStream.g(12);
            }
            b(makerNoteDataInputStream, 6);
            c imageStartAttribute = this.f۱۴۳d[7].get("PreviewImageStart");
            c imageLengthAttribute = this.f۱۴۳d[7].get("PreviewImageLength");
            if (!(imageStartAttribute == null || imageLengthAttribute == null)) {
                this.f۱۴۳d[5].put("JPEGInterchangeFormat", imageStartAttribute);
                this.f۱۴۳d[5].put("JPEGInterchangeFormatLength", imageLengthAttribute);
            }
            c aspectFrameAttribute = this.f۱۴۳d[8].get("AspectFrame");
            if (aspectFrameAttribute != null) {
                int[] aspectFrameValues = (int[]) aspectFrameAttribute.d(this.f۱۴۴e);
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
                    c primaryImageWidthAttribute = c.a(primaryImageWidth, this.f۱۴۴e);
                    c primaryImageLengthAttribute = c.a(primaryImageLength, this.f۱۴۴e);
                    this.f۱۴۳d[0].put("ImageWidth", primaryImageWidthAttribute);
                    this.f۱۴۳d[0].put("ImageLength", primaryImageLengthAttribute);
                }
            }
        }
    }

    private void d(b in) {
        c(in);
        if (this.f۱۴۳d[0].get("JpgFromRaw") != null) {
            a(in, this.k, 5);
        }
        c rw2IsoAttribute = this.f۱۴۳d[0].get("ISO");
        c exifIsoAttribute = this.f۱۴۳d[1].get("PhotographicSensitivity");
        if (rw2IsoAttribute != null && exifIsoAttribute == null) {
            this.f۱۴۳d[1].put("PhotographicSensitivity", rw2IsoAttribute);
        }
    }

    private void a(byte[] exifBytes, int imageType) {
        b dataInputStream = new b(exifBytes);
        a(dataInputStream, exifBytes.length);
        b(dataInputStream, imageType);
    }

    private void c() {
        String valueOfDateTimeOriginal = a("DateTimeOriginal");
        if (valueOfDateTimeOriginal != null && a("DateTime") == null) {
            this.f۱۴۳d[0].put("DateTime", c.a(valueOfDateTimeOriginal));
        }
        if (a("ImageWidth") == null) {
            this.f۱۴۳d[0].put("ImageWidth", c.a(0L, this.f۱۴۴e));
        }
        if (a("ImageLength") == null) {
            this.f۱۴۳d[0].put("ImageLength", c.a(0L, this.f۱۴۴e));
        }
        if (a("Orientation") == null) {
            this.f۱۴۳d[0].put("Orientation", c.a(0L, this.f۱۴۴e));
        }
        if (a("LightSource") == null) {
            this.f۱۴۳d[1].put("LightSource", c.a(0L, this.f۱۴۴e));
        }
    }

    private ByteOrder e(b dataInputStream) {
        short byteOrder = dataInputStream.readShort();
        if (byteOrder == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (byteOrder == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(byteOrder));
    }

    private void a(b dataInputStream, int exifBytesLength) {
        this.f۱۴۴e = e(dataInputStream);
        dataInputStream.a(this.f۱۴۴e);
        int startCode = dataInputStream.readUnsignedShort();
        int i2 = this.f۱۴۲c;
        if (i2 == 7 || i2 == 10 || startCode == 42) {
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
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(a.b.e.a.b r26, int r27) {
        /*
        // Method dump skipped, instructions count: 755
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.e.a.b(a.b.e.a$b, int):void");
    }

    private void c(b in, int imageType) {
        c jpegInterchangeFormatAttribute;
        c imageLengthAttribute = this.f۱۴۳d[imageType].get("ImageLength");
        c imageWidthAttribute = this.f۱۴۳d[imageType].get("ImageWidth");
        if ((imageLengthAttribute == null || imageWidthAttribute == null) && (jpegInterchangeFormatAttribute = this.f۱۴۳d[imageType].get("JPEGInterchangeFormat")) != null) {
            a(in, jpegInterchangeFormatAttribute.b(this.f۱۴۴e), imageType);
        }
    }

    private void f(b in) {
        HashMap thumbnailData = this.f۱۴۳d[4];
        c compressionAttribute = thumbnailData.get("Compression");
        if (compressionAttribute != null) {
            this.f۱۴۵f = compressionAttribute.b(this.f۱۴۴e);
            int i2 = this.f۱۴۵f;
            if (i2 != 1) {
                if (i2 == 6) {
                    a(in, thumbnailData);
                    return;
                } else if (i2 != 7) {
                    return;
                }
            }
            if (a(thumbnailData)) {
                b(in, thumbnailData);
                return;
            }
            return;
        }
        this.f۱۴۵f = 6;
        a(in, thumbnailData);
    }

    private void a(b in, HashMap thumbnailData) {
        c jpegInterchangeFormatAttribute = (c) thumbnailData.get("JPEGInterchangeFormat");
        c jpegInterchangeFormatLengthAttribute = (c) thumbnailData.get("JPEGInterchangeFormatLength");
        if (jpegInterchangeFormatAttribute != null && jpegInterchangeFormatLengthAttribute != null) {
            int thumbnailOffset = jpegInterchangeFormatAttribute.b(this.f۱۴۴e);
            int thumbnailLength = Math.min(jpegInterchangeFormatLengthAttribute.b(this.f۱۴۴e), in.available() - thumbnailOffset);
            int i2 = this.f۱۴۲c;
            if (i2 == 4 || i2 == 9 || i2 == 10) {
                thumbnailOffset += this.f۱۴۶g;
            } else if (i2 == 7) {
                thumbnailOffset += this.f۱۴۷h;
            }
            if (thumbnailOffset > 0 && thumbnailLength > 0 && this.f۱۴۰a == null && this.f۱۴۱b == null) {
                in.g((long) thumbnailOffset);
                in.readFully(new byte[thumbnailLength]);
            }
        }
    }

    private void b(b in, HashMap thumbnailData) {
        c stripOffsetsAttribute = (c) thumbnailData.get("StripOffsets");
        c stripByteCountsAttribute = (c) thumbnailData.get("StripByteCounts");
        if (stripOffsetsAttribute != null && stripByteCountsAttribute != null) {
            long[] stripOffsets = a(stripOffsetsAttribute.d(this.f۱۴۴e));
            long[] stripByteCounts = a(stripByteCountsAttribute.d(this.f۱۴۴e));
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
                int i2 = 0;
                while (i2 < stripOffsets.length) {
                    int stripByteCount = (int) stripByteCounts[i2];
                    int skipBytes = ((int) stripOffsets[i2]) - bytesRead;
                    if (skipBytes < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                    }
                    in.g((long) skipBytes);
                    byte[] stripBytes = new byte[stripByteCount];
                    in.read(stripBytes);
                    bytesRead = bytesRead + skipBytes + stripByteCount;
                    System.arraycopy(stripBytes, 0, totalStripBytes, bytesAdded, stripBytes.length);
                    bytesAdded += stripBytes.length;
                    i2++;
                    stripOffsetsAttribute = stripOffsetsAttribute;
                    stripByteCountsAttribute = stripByteCountsAttribute;
                    totalStripByteCount = totalStripByteCount;
                    stripOffsets = stripOffsets;
                }
            }
        }
    }

    private boolean a(HashMap thumbnailData) {
        c photometricInterpretationAttribute;
        c bitsPerSampleAttribute = (c) thumbnailData.get("BitsPerSample");
        if (bitsPerSampleAttribute == null) {
            return false;
        }
        int[] bitsPerSampleValue = (int[]) bitsPerSampleAttribute.d(this.f۱۴۴e);
        if (Arrays.equals(l, bitsPerSampleValue)) {
            return true;
        }
        if (this.f۱۴۲c != 3 || (photometricInterpretationAttribute = (c) thumbnailData.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int photometricInterpretationValue = photometricInterpretationAttribute.b(this.f۱۴۴e);
        if ((photometricInterpretationValue != 1 || !Arrays.equals(bitsPerSampleValue, m)) && (photometricInterpretationValue != 6 || !Arrays.equals(bitsPerSampleValue, l))) {
            return false;
        }
        return true;
    }

    private boolean b(HashMap map) {
        c imageLengthAttribute = (c) map.get("ImageLength");
        c imageWidthAttribute = (c) map.get("ImageWidth");
        if (imageLengthAttribute == null || imageWidthAttribute == null) {
            return false;
        }
        int imageLengthValue = imageLengthAttribute.b(this.f۱۴۴e);
        int imageWidthValue = imageWidthAttribute.b(this.f۱۴۴e);
        if (imageLengthValue > 512 || imageWidthValue > 512) {
            return false;
        }
        return true;
    }

    private void b(InputStream in) {
        a(0, 5);
        a(0, 4);
        a(5, 4);
        c pixelXDimAttribute = this.f۱۴۳d[1].get("PixelXDimension");
        c pixelYDimAttribute = this.f۱۴۳d[1].get("PixelYDimension");
        if (!(pixelXDimAttribute == null || pixelYDimAttribute == null)) {
            this.f۱۴۳d[0].put("ImageWidth", pixelXDimAttribute);
            this.f۱۴۳d[0].put("ImageLength", pixelYDimAttribute);
        }
        if (this.f۱۴۳d[4].isEmpty() && b(this.f۱۴۳d[5])) {
            HashMap<String, c>[] hashMapArr = this.f۱۴۳d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!b(this.f۱۴۳d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    private void d(b in, int imageType) {
        c defaultCropSizeXAttribute;
        c defaultCropSizeYAttribute;
        c defaultCropSizeAttribute = this.f۱۴۳d[imageType].get("DefaultCropSize");
        c topBorderAttribute = this.f۱۴۳d[imageType].get("SensorTopBorder");
        c leftBorderAttribute = this.f۱۴۳d[imageType].get("SensorLeftBorder");
        c bottomBorderAttribute = this.f۱۴۳d[imageType].get("SensorBottomBorder");
        c rightBorderAttribute = this.f۱۴۳d[imageType].get("SensorRightBorder");
        if (defaultCropSizeAttribute != null) {
            if (defaultCropSizeAttribute.f۱۵۴a == 5) {
                e[] defaultCropSizeValue = (e[]) defaultCropSizeAttribute.d(this.f۱۴۴e);
                if (defaultCropSizeValue == null || defaultCropSizeValue.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(defaultCropSizeValue));
                    return;
                }
                defaultCropSizeXAttribute = c.a(defaultCropSizeValue[0], this.f۱۴۴e);
                defaultCropSizeYAttribute = c.a(defaultCropSizeValue[1], this.f۱۴۴e);
            } else {
                int[] defaultCropSizeValue2 = (int[]) defaultCropSizeAttribute.d(this.f۱۴۴e);
                if (defaultCropSizeValue2 == null || defaultCropSizeValue2.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(defaultCropSizeValue2));
                    return;
                }
                defaultCropSizeXAttribute = c.a(defaultCropSizeValue2[0], this.f۱۴۴e);
                defaultCropSizeYAttribute = c.a(defaultCropSizeValue2[1], this.f۱۴۴e);
            }
            this.f۱۴۳d[imageType].put("ImageWidth", defaultCropSizeXAttribute);
            this.f۱۴۳d[imageType].put("ImageLength", defaultCropSizeYAttribute);
        } else if (topBorderAttribute == null || leftBorderAttribute == null || bottomBorderAttribute == null || rightBorderAttribute == null) {
            c(in, imageType);
        } else {
            int topBorderValue = topBorderAttribute.b(this.f۱۴۴e);
            int bottomBorderValue = bottomBorderAttribute.b(this.f۱۴۴e);
            int rightBorderValue = rightBorderAttribute.b(this.f۱۴۴e);
            int leftBorderValue = leftBorderAttribute.b(this.f۱۴۴e);
            if (bottomBorderValue > topBorderValue && rightBorderValue > leftBorderValue) {
                c imageLengthAttribute = c.a(bottomBorderValue - topBorderValue, this.f۱۴۴e);
                c imageWidthAttribute = c.a(rightBorderValue - leftBorderValue, this.f۱۴۴e);
                this.f۱۴۳d[imageType].put("ImageLength", imageLengthAttribute);
                this.f۱۴۳d[imageType].put("ImageWidth", imageWidthAttribute);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class b extends InputStream implements DataInput {

        /* renamed from: g  reason: collision with root package name */
        private static final ByteOrder f۱۴۸g = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: h  reason: collision with root package name */
        private static final ByteOrder f۱۴۹h = ByteOrder.BIG_ENDIAN;

        /* renamed from: c  reason: collision with root package name */
        private DataInputStream f۱۵۰c;

        /* renamed from: d  reason: collision with root package name */
        private ByteOrder f۱۵۱d;

        /* renamed from: e  reason: collision with root package name */
        private final int f۱۵۲e;

        /* renamed from: f  reason: collision with root package name */
        private int f۱۵۳f;

        public b(InputStream in) {
            this.f۱۵۱d = ByteOrder.BIG_ENDIAN;
            this.f۱۵۰c = new DataInputStream(in);
            this.f۱۵۲e = this.f۱۵۰c.available();
            this.f۱۵۳f = 0;
            this.f۱۵۰c.mark(this.f۱۵۲e);
        }

        public b(byte[] bytes) {
            this(new ByteArrayInputStream(bytes));
        }

        public void a(ByteOrder byteOrder) {
            this.f۱۵۱d = byteOrder;
        }

        public void g(long byteCount) {
            int i = this.f۱۵۳f;
            if (((long) i) > byteCount) {
                this.f۱۵۳f = 0;
                this.f۱۵۰c.reset();
                this.f۱۵۰c.mark(this.f۱۵۲e);
            } else {
                byteCount -= (long) i;
            }
            if (skipBytes((int) byteCount) != ((int) byteCount)) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public int l() {
            return this.f۱۵۳f;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f۱۵۰c.available();
        }

        @Override // java.io.InputStream
        public int read() {
            this.f۱۵۳f++;
            return this.f۱۵۰c.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] b2, int off, int len) {
            int bytesRead = this.f۱۵۰c.read(b2, off, len);
            this.f۱۵۳f += bytesRead;
            return bytesRead;
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f۱۵۳f++;
            return this.f۱۵۰c.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f۱۵۳f++;
            return this.f۱۵۰c.readBoolean();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f۱۵۳f += 2;
            return this.f۱۵۰c.readChar();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f۱۵۳f += 2;
            return this.f۱۵۰c.readUTF();
        }

        @Override // java.io.DataInput
        public void readFully(byte[] buffer, int offset, int length) {
            this.f۱۵۳f += length;
            if (this.f۱۵۳f > this.f۱۵۲e) {
                throw new EOFException();
            } else if (this.f۱۵۰c.read(buffer, offset, length) != length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public void readFully(byte[] buffer) {
            this.f۱۵۳f += buffer.length;
            if (this.f۱۵۳f > this.f۱۵۲e) {
                throw new EOFException();
            } else if (this.f۱۵۰c.read(buffer, 0, buffer.length) != buffer.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f۱۵۳f++;
            if (this.f۱۵۳f <= this.f۱۵۲e) {
                int ch = this.f۱۵۰c.read();
                if (ch >= 0) {
                    return (byte) ch;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f۱۵۳f += 2;
            if (this.f۱۵۳f <= this.f۱۵۲e) {
                int ch1 = this.f۱۵۰c.read();
                int ch2 = this.f۱۵۰c.read();
                if ((ch1 | ch2) >= 0) {
                    ByteOrder byteOrder = this.f۱۵۱d;
                    if (byteOrder == f۱۴۸g) {
                        return (short) ((ch2 << 8) + ch1);
                    }
                    if (byteOrder == f۱۴۹h) {
                        return (short) ((ch1 << 8) + ch2);
                    }
                    throw new IOException("Invalid byte order: " + this.f۱۵۱d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f۱۵۳f += 4;
            if (this.f۱۵۳f <= this.f۱۵۲e) {
                int ch1 = this.f۱۵۰c.read();
                int ch2 = this.f۱۵۰c.read();
                int ch3 = this.f۱۵۰c.read();
                int ch4 = this.f۱۵۰c.read();
                if ((ch1 | ch2 | ch3 | ch4) >= 0) {
                    ByteOrder byteOrder = this.f۱۵۱d;
                    if (byteOrder == f۱۴۸g) {
                        return (ch4 << 24) + (ch3 << 16) + (ch2 << 8) + ch1;
                    }
                    if (byteOrder == f۱۴۹h) {
                        return (ch1 << 24) + (ch2 << 16) + (ch3 << 8) + ch4;
                    }
                    throw new IOException("Invalid byte order: " + this.f۱۵۱d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int byteCount) {
            int totalSkip = Math.min(byteCount, this.f۱۵۲e - this.f۱۵۳f);
            int skipped = 0;
            while (skipped < totalSkip) {
                skipped += this.f۱۵۰c.skipBytes(totalSkip - skipped);
            }
            this.f۱۵۳f += skipped;
            return skipped;
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f۱۵۳f += 2;
            if (this.f۱۵۳f <= this.f۱۵۲e) {
                int ch1 = this.f۱۵۰c.read();
                int ch2 = this.f۱۵۰c.read();
                if ((ch1 | ch2) >= 0) {
                    ByteOrder byteOrder = this.f۱۵۱d;
                    if (byteOrder == f۱۴۸g) {
                        return (ch2 << 8) + ch1;
                    }
                    if (byteOrder == f۱۴۹h) {
                        return (ch1 << 8) + ch2;
                    }
                    throw new IOException("Invalid byte order: " + this.f۱۵۱d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public long m() {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f۱۵۳f += 8;
            if (this.f۱۵۳f <= this.f۱۵۲e) {
                int ch1 = this.f۱۵۰c.read();
                int ch2 = this.f۱۵۰c.read();
                int ch3 = this.f۱۵۰c.read();
                int ch4 = this.f۱۵۰c.read();
                int ch5 = this.f۱۵۰c.read();
                int ch6 = this.f۱۵۰c.read();
                int ch7 = this.f۱۵۰c.read();
                int ch8 = this.f۱۵۰c.read();
                if ((ch1 | ch2 | ch3 | ch4 | ch5 | ch6 | ch7 | ch8) >= 0) {
                    ByteOrder byteOrder = this.f۱۵۱d;
                    if (byteOrder == f۱۴۸g) {
                        return (((long) ch8) << 56) + (((long) ch7) << 48) + (((long) ch6) << 40) + (((long) ch5) << 32) + (((long) ch4) << 24) + (((long) ch3) << 16) + (((long) ch2) << 8) + ((long) ch1);
                    }
                    if (byteOrder == f۱۴۹h) {
                        return (((long) ch1) << 56) + (((long) ch2) << 48) + (((long) ch3) << 40) + (((long) ch4) << 32) + (((long) ch5) << 24) + (((long) ch6) << 16) + (((long) ch7) << 8) + ((long) ch8);
                    }
                    throw new IOException("Invalid byte order: " + this.f۱۵۱d);
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

    private void a(int firstIfdType, int secondIfdType) {
        if (!this.f۱۴۳d[firstIfdType].isEmpty() && !this.f۱۴۳d[secondIfdType].isEmpty()) {
            c firstImageLengthAttribute = this.f۱۴۳d[firstIfdType].get("ImageLength");
            c firstImageWidthAttribute = this.f۱۴۳d[firstIfdType].get("ImageWidth");
            c secondImageLengthAttribute = this.f۱۴۳d[secondIfdType].get("ImageLength");
            c secondImageWidthAttribute = this.f۱۴۳d[secondIfdType].get("ImageWidth");
            if (firstImageLengthAttribute != null && firstImageWidthAttribute != null && secondImageLengthAttribute != null && secondImageWidthAttribute != null) {
                int firstImageLengthValue = firstImageLengthAttribute.b(this.f۱۴۴e);
                int firstImageWidthValue = firstImageWidthAttribute.b(this.f۱۴۴e);
                int secondImageLengthValue = secondImageLengthAttribute.b(this.f۱۴۴e);
                int secondImageWidthValue = secondImageWidthAttribute.b(this.f۱۴۴e);
                if (firstImageLengthValue < secondImageLengthValue && firstImageWidthValue < secondImageWidthValue) {
                    HashMap<String, ExifInterface.ExifAttribute>[] hashMapArr = this.f۱۴۳d;
                    HashMap<String, ExifInterface.ExifAttribute> tempMap = hashMapArr[firstIfdType];
                    hashMapArr[firstIfdType] = hashMapArr[secondIfdType];
                    hashMapArr[secondIfdType] = tempMap;
                }
            }
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException rethrown) {
                throw rethrown;
            } catch (Exception e2) {
            }
        }
    }

    private static long[] a(Object inputObj) {
        if (inputObj instanceof int[]) {
            int[] input = (int[]) inputObj;
            long[] result = new long[input.length];
            for (int i2 = 0; i2 < input.length; i2++) {
                result[i2] = (long) input[i2];
            }
            return result;
        } else if (inputObj instanceof long[]) {
            return (long[]) inputObj;
        } else {
            return null;
        }
    }
}
