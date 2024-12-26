package p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.support.v4.content.p۲۰۲e.Cg;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.Interpolator;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cb;

/* renamed from: a.b.d.a.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ce {
    /* renamed from: a, reason: contains not printable characters */
    public static Animator m۷۹۷۷a(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 24) {
            Animator objectAnimator = AnimatorInflater.loadAnimator(context, id);
            return objectAnimator;
        }
        Animator objectAnimator2 = m۷۹۷۸a(context, context.getResources(), context.getTheme(), id);
        return objectAnimator2;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Animator m۷۹۷۸a(Context context, Resources resources, Resources.Theme theme, int id) {
        return m۷۹۷۹a(context, resources, theme, id, 1.0f);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Animator m۷۹۷۹a(Context context, Resources resources, Resources.Theme theme, int id, float pathErrorScale) {
        XmlResourceParser parser = null;
        try {
            try {
                try {
                    parser = resources.getAnimation(id);
                    Animator animator = m۷۹۸۰a(context, resources, theme, parser, pathErrorScale);
                    return animator;
                } catch (XmlPullParserException ex) {
                    Resources.NotFoundException rnf = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(id));
                    rnf.initCause(ex);
                    throw rnf;
                }
            } catch (IOException ex2) {
                Resources.NotFoundException rnf2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(id));
                rnf2.initCause(ex2);
                throw rnf2;
            }
        } finally {
            if (parser != null) {
                parser.close();
            }
        }
    }

    /* renamed from: a.b.d.a.e$a */
    private static class a implements TypeEvaluator<Cb.b[]> {

        /* renamed from: a, reason: contains not printable characters */
        private Cb.b[] f۸۳۵۲a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Cb.b[] evaluate(float fraction, Cb.b[] startPathData, Cb.b[] endPathData) {
            if (!Cb.m۸۳۵۹a(startPathData, endPathData)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            Cb.b[] bVarArr = this.f۸۳۵۲a;
            if (bVarArr == null || !Cb.m۸۳۵۹a(bVarArr, startPathData)) {
                this.f۸۳۵۲a = Cb.m۸۳۶۲a(startPathData);
            }
            for (int i = 0; i < startPathData.length; i++) {
                this.f۸۳۵۲a[i].m۸۳۷۰a(startPathData[i], endPathData[i], fraction);
            }
            return this.f۸۳۵۲a;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static PropertyValuesHolder m۷۹۸۶a(TypedArray styledAttributes, int valueType, int valueFromId, int valueToId, String propertyName) {
        int valueType2;
        PropertyValuesHolder returnValue;
        char c2;
        int valueTo;
        int valueFrom;
        char c3;
        int valueTo2;
        float valueTo3;
        float valueFrom2;
        int toType;
        PropertyValuesHolder propertyValuesHolder;
        TypedValue tvFrom = styledAttributes.peekValue(valueFromId);
        boolean hasFrom = tvFrom != null;
        int fromType = hasFrom ? tvFrom.type : 0;
        TypedValue tvTo = styledAttributes.peekValue(valueToId);
        boolean hasTo = tvTo != null;
        int toType2 = hasTo ? tvTo.type : 0;
        if (valueType != 4) {
            valueType2 = valueType;
        } else if ((hasFrom && m۷۹۹۲a(fromType)) || (hasTo && m۷۹۹۲a(toType2))) {
            valueType2 = 3;
        } else {
            valueType2 = 0;
        }
        boolean getFloats = valueType2 == 0;
        if (valueType2 == 2) {
            String fromString = styledAttributes.getString(valueFromId);
            String toString = styledAttributes.getString(valueToId);
            Cb.b[] nodesFrom = Cb.m۸۳۶۱a(fromString);
            Cb.b[] nodesTo = Cb.m۸۳۶۱a(toString);
            if (nodesFrom == null && nodesTo == null) {
                toType = toType2;
                propertyValuesHolder = null;
            } else if (nodesFrom == null) {
                toType = toType2;
                propertyValuesHolder = null;
                if (nodesTo != null) {
                    returnValue = PropertyValuesHolder.ofObject(propertyName, new a(), nodesTo);
                }
            } else {
                TypeEvaluator evaluator = new a();
                if (nodesTo == null) {
                    toType = toType2;
                    returnValue = PropertyValuesHolder.ofObject(propertyName, evaluator, nodesFrom);
                } else {
                    if (!Cb.m۸۳۵۹a(nodesFrom, nodesTo)) {
                        throw new InflateException(" Can't morph from " + fromString + " to " + toString);
                    }
                    returnValue = PropertyValuesHolder.ofObject(propertyName, evaluator, nodesFrom, nodesTo);
                    toType = toType2;
                }
            }
            returnValue = propertyValuesHolder;
        } else {
            int toType3 = toType2;
            TypeEvaluator evaluator2 = valueType2 == 3 ? Cf.m۷۹۹۵a() : null;
            if (getFloats) {
                if (!hasFrom) {
                    if (toType3 == 5) {
                        valueTo3 = styledAttributes.getDimension(valueToId, 0.0f);
                    } else {
                        valueTo3 = styledAttributes.getFloat(valueToId, 0.0f);
                    }
                    returnValue = PropertyValuesHolder.ofFloat(propertyName, valueTo3);
                } else {
                    if (fromType == 5) {
                        valueFrom2 = styledAttributes.getDimension(valueFromId, 0.0f);
                    } else {
                        valueFrom2 = styledAttributes.getFloat(valueFromId, 0.0f);
                    }
                    if (hasTo) {
                        float valueTo4 = toType3 == 5 ? styledAttributes.getDimension(valueToId, 0.0f) : styledAttributes.getFloat(valueToId, 0.0f);
                        returnValue = PropertyValuesHolder.ofFloat(propertyName, valueFrom2, valueTo4);
                    } else {
                        returnValue = PropertyValuesHolder.ofFloat(propertyName, valueFrom2);
                    }
                }
            } else if (hasFrom) {
                if (fromType == 5) {
                    valueFrom = (int) styledAttributes.getDimension(valueFromId, 0.0f);
                } else {
                    valueFrom = m۷۹۹۲a(fromType) ? styledAttributes.getColor(valueFromId, 0) : styledAttributes.getInt(valueFromId, 0);
                }
                if (hasTo) {
                    if (toType3 == 5) {
                        valueTo2 = (int) styledAttributes.getDimension(valueToId, 0.0f);
                        c3 = 0;
                    } else if (m۷۹۹۲a(toType3)) {
                        c3 = 0;
                        valueTo2 = styledAttributes.getColor(valueToId, 0);
                    } else {
                        c3 = 0;
                        valueTo2 = styledAttributes.getInt(valueToId, 0);
                    }
                    int[] iArr = new int[2];
                    iArr[c3] = valueFrom;
                    iArr[1] = valueTo2;
                    returnValue = PropertyValuesHolder.ofInt(propertyName, iArr);
                } else {
                    returnValue = PropertyValuesHolder.ofInt(propertyName, valueFrom);
                }
            } else if (!hasTo) {
                returnValue = null;
            } else {
                if (toType3 == 5) {
                    valueTo = (int) styledAttributes.getDimension(valueToId, 0.0f);
                    c2 = 0;
                } else if (m۷۹۹۲a(toType3)) {
                    c2 = 0;
                    valueTo = styledAttributes.getColor(valueToId, 0);
                } else {
                    c2 = 0;
                    valueTo = styledAttributes.getInt(valueToId, 0);
                }
                int[] iArr2 = new int[1];
                iArr2[c2] = valueTo;
                returnValue = PropertyValuesHolder.ofInt(propertyName, iArr2);
            }
            if (returnValue != null && evaluator2 != null) {
                returnValue.setEvaluator(evaluator2);
            }
        }
        return returnValue;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۷۹۸۹a(ValueAnimator anim, TypedArray arrayAnimator, TypedArray arrayObjectAnimator, float pixelSize, XmlPullParser parser) {
        long duration = Cg.m۱۰۶۲۶b(arrayAnimator, parser, "duration", 1, 300);
        long startDelay = Cg.m۱۰۶۲۶b(arrayAnimator, parser, "startOffset", 2, 0);
        int valueType = Cg.m۱۰۶۲۶b(arrayAnimator, parser, "valueType", 7, 4);
        if (Cg.m۱۰۶۲۵a(parser, "valueFrom") && Cg.m۱۰۶۲۵a(parser, "valueTo")) {
            if (valueType == 4) {
                valueType = m۷۹۷۶a(arrayAnimator, 5, 6);
            }
            PropertyValuesHolder pvh = m۷۹۸۶a(arrayAnimator, valueType, 5, 6, "");
            if (pvh != null) {
                anim.setValues(pvh);
            }
        }
        anim.setDuration(duration);
        anim.setStartDelay(startDelay);
        anim.setRepeatCount(Cg.m۱۰۶۲۶b(arrayAnimator, parser, "repeatCount", 3, 0));
        anim.setRepeatMode(Cg.m۱۰۶۲۶b(arrayAnimator, parser, "repeatMode", 4, 1));
        if (arrayObjectAnimator != null) {
            m۷۹۸۸a(anim, arrayObjectAnimator, valueType, pixelSize, parser);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۷۹۸۸a(ValueAnimator anim, TypedArray arrayObjectAnimator, int valueType, float pixelSize, XmlPullParser parser) {
        ObjectAnimator oa = (ObjectAnimator) anim;
        String pathData = Cg.m۱۰۶۲۳a(arrayObjectAnimator, parser, "pathData", 1);
        if (pathData != null) {
            String propertyXName = Cg.m۱۰۶۲۳a(arrayObjectAnimator, parser, "propertyXName", 2);
            String propertyYName = Cg.m۱۰۶۲۳a(arrayObjectAnimator, parser, "propertyYName", 3);
            if (valueType == 2 || valueType == 4) {
            }
            if (propertyXName == null && propertyYName == null) {
                throw new InflateException(arrayObjectAnimator.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            Path path = Cb.m۸۳۶۳b(pathData);
            m۷۹۹۰a(path, oa, 0.5f * pixelSize, propertyXName, propertyYName);
            return;
        }
        String propertyName = Cg.m۱۰۶۲۳a(arrayObjectAnimator, parser, "propertyName", 0);
        oa.setPropertyName(propertyName);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۷۹۹۰a(Path path, ObjectAnimator oa, float precision, String propertyXName, String propertyYName) {
        Path path2 = path;
        boolean z = false;
        PathMeasure measureForTotalLength = new PathMeasure(path2, false);
        float totalLength = 0.0f;
        ArrayList<Float> contourLengths = new ArrayList<>();
        contourLengths.add(Float.valueOf(0.0f));
        while (true) {
            float pathLength = measureForTotalLength.getLength();
            totalLength += pathLength;
            contourLengths.add(Float.valueOf(totalLength));
            if (!measureForTotalLength.nextContour()) {
                break;
            }
            z = false;
            path2 = path;
        }
        PathMeasure pathMeasure = new PathMeasure(path2, z);
        int numPoints = Math.min(100, ((int) (totalLength / precision)) + 1);
        float[] mX = new float[numPoints];
        float[] mY = new float[numPoints];
        float[] position = new float[2];
        float step = totalLength / (numPoints - 1);
        float currentDistance = 0.0f;
        int contourIndex = 0;
        for (int contourIndex2 = 0; contourIndex2 < numPoints; contourIndex2++) {
            pathMeasure.getPosTan(currentDistance - contourLengths.get(contourIndex).floatValue(), position, null);
            mX[contourIndex2] = position[0];
            mY[contourIndex2] = position[1];
            currentDistance += step;
            if (contourIndex + 1 < contourLengths.size() && currentDistance > contourLengths.get(contourIndex + 1).floatValue()) {
                contourIndex++;
                pathMeasure.nextContour();
            }
        }
        PropertyValuesHolder x = null;
        PropertyValuesHolder y = null;
        if (propertyXName != null) {
            x = PropertyValuesHolder.ofFloat(propertyXName, mX);
        }
        if (propertyYName != null) {
            y = PropertyValuesHolder.ofFloat(propertyYName, mY);
        }
        if (x == null) {
            oa.setValues(y);
        } else if (y == null) {
            oa.setValues(x);
        } else {
            oa.setValues(x, y);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Animator m۷۹۸۰a(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, float pixelSize) {
        return m۷۹۸۱a(context, res, theme, parser, Xml.asAttributeSet(parser), null, 0, pixelSize);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f8, code lost:
    
        r0 = new android.animation.Animator[r13.size()];
        r2 = 0;
        r3 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0107, code lost:
    
        if (r3.hasNext() == false) goto L۶۲;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0109, code lost:
    
        r0[r2] = r3.next();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0115, code lost:
    
        if (r25 != 0) goto L۴۹;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0117, code lost:
    
        r24.playTogether(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x011b, code lost:
    
        r24.playSequentially(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011e, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00f4, code lost:
    
        if (r24 == null) goto L۵۰;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00f6, code lost:
    
        if (r13 == null) goto L۵۰;
     */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator m۷۹۸۱a(android.content.Context r19, android.content.res.Resources r20, android.content.res.Resources.Theme r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.animation.AnimatorSet r24, int r25, float r26) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a.Ce.m۷۹۸۱a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: a, reason: contains not printable characters */
    private static PropertyValuesHolder[] m۷۹۹۳a(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, AttributeSet attrs) {
        ArrayList<PropertyValuesHolder> values = null;
        while (true) {
            int type = parser.getEventType();
            if (type == 3 || type == 1) {
                break;
            }
            if (type != 2) {
                parser.next();
            } else {
                String name = parser.getName();
                if (name.equals("propertyValuesHolder")) {
                    TypedArray a2 = Cg.m۱۰۶۲۱a(res, theme, attrs, Ca.f۸۳۳۷i);
                    String propertyName = Cg.m۱۰۶۲۳a(a2, parser, "propertyName", 3);
                    int valueType = Cg.m۱۰۶۲۶b(a2, parser, "valueType", 2, 4);
                    PropertyValuesHolder pvh = m۷۹۸۵a(context, res, theme, parser, propertyName, valueType);
                    if (pvh == null) {
                        pvh = m۷۹۸۶a(a2, valueType, 0, 1, propertyName);
                    }
                    if (pvh != null) {
                        if (values == null) {
                            values = new ArrayList<>();
                        }
                        values.add(pvh);
                    }
                    a2.recycle();
                }
                parser.next();
            }
        }
        PropertyValuesHolder[] valuesArray = null;
        if (values != null) {
            int count = values.size();
            valuesArray = new PropertyValuesHolder[count];
            for (int i = 0; i < count; i++) {
                valuesArray[i] = values.get(i);
            }
        }
        return valuesArray;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۷۹۷۵a(Resources res, Resources.Theme theme, AttributeSet attrs, XmlPullParser parser) {
        int valueType;
        TypedArray a2 = Cg.m۱۰۶۲۱a(res, theme, attrs, Ca.f۸۳۳۸j);
        TypedValue keyframeValue = Cg.m۱۰۶۲۷b(a2, parser, "value", 0);
        boolean hasValue = keyframeValue != null;
        if (hasValue && m۷۹۹۲a(keyframeValue.type)) {
            valueType = 3;
        } else {
            valueType = 0;
        }
        a2.recycle();
        return valueType;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۷۹۷۶a(TypedArray styledAttributes, int valueFromId, int valueToId) {
        TypedValue tvFrom = styledAttributes.peekValue(valueFromId);
        boolean hasFrom = tvFrom != null;
        int fromType = hasFrom ? tvFrom.type : 0;
        TypedValue tvTo = styledAttributes.peekValue(valueToId);
        boolean hasTo = tvTo != null;
        int toType = hasTo ? tvTo.type : 0;
        if ((hasFrom && m۷۹۹۲a(fromType)) || (hasTo && m۷۹۹۲a(toType))) {
            return 3;
        }
        return 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static PropertyValuesHolder m۷۹۸۵a(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, String propertyName, int valueType) {
        int type;
        PropertyValuesHolder value;
        PropertyValuesHolder value2;
        ArrayList<Keyframe> keyframes;
        int type2;
        PropertyValuesHolder value3 = null;
        ArrayList<Keyframe> keyframes2 = null;
        int valueType2 = valueType;
        while (true) {
            int next = parser.next();
            type = next;
            if (next == 3 || type == 1) {
                break;
            }
            String name = parser.getName();
            if (name.equals("keyframe")) {
                if (valueType2 == 4) {
                    valueType2 = m۷۹۷۵a(res, theme, Xml.asAttributeSet(parser), parser);
                }
                Keyframe keyframe = m۷۹۸۳a(context, res, theme, Xml.asAttributeSet(parser), valueType2, parser);
                if (keyframe != null) {
                    if (keyframes2 == null) {
                        keyframes2 = new ArrayList<>();
                    }
                    keyframes2.add(keyframe);
                }
                parser.next();
            }
        }
        if (keyframes2 != null) {
            int size = keyframes2.size();
            int count = size;
            if (size <= 0) {
                value = null;
            } else {
                Keyframe firstKeyframe = keyframes2.get(0);
                Keyframe lastKeyframe = keyframes2.get(count - 1);
                float endFraction = lastKeyframe.getFraction();
                float f2 = 0.0f;
                if (endFraction < 1.0f) {
                    if (endFraction >= 0.0f) {
                        keyframes2.add(keyframes2.size(), m۷۹۸۲a(lastKeyframe, 1.0f));
                        count++;
                    } else {
                        lastKeyframe.setFraction(1.0f);
                    }
                }
                float startFraction = firstKeyframe.getFraction();
                if (startFraction != 0.0f) {
                    if (startFraction >= 0.0f) {
                        keyframes2.add(0, m۷۹۸۲a(firstKeyframe, 0.0f));
                        count++;
                    } else {
                        firstKeyframe.setFraction(0.0f);
                    }
                }
                Keyframe[] keyframeArray = new Keyframe[count];
                keyframes2.toArray(keyframeArray);
                int i = 0;
                while (i < count) {
                    Keyframe keyframe2 = keyframeArray[i];
                    if (keyframe2.getFraction() >= f2) {
                        value2 = value3;
                        keyframes = keyframes2;
                        type2 = type;
                    } else if (i == 0) {
                        keyframe2.setFraction(f2);
                        value2 = value3;
                        keyframes = keyframes2;
                        type2 = type;
                    } else if (i == count - 1) {
                        keyframe2.setFraction(1.0f);
                        value2 = value3;
                        keyframes = keyframes2;
                        type2 = type;
                    } else {
                        int startIndex = i;
                        int endIndex = i;
                        value2 = value3;
                        int j = startIndex + 1;
                        keyframes = keyframes2;
                        int endIndex2 = endIndex;
                        while (true) {
                            type2 = type;
                            if (j >= count - 1 || keyframeArray[j].getFraction() >= 0.0f) {
                                break;
                            }
                            endIndex2 = j;
                            j++;
                            type = type2;
                        }
                        int j2 = endIndex2 + 1;
                        float gap = keyframeArray[j2].getFraction() - keyframeArray[startIndex - 1].getFraction();
                        m۷۹۹۱a(keyframeArray, gap, startIndex, endIndex2);
                    }
                    i++;
                    keyframes2 = keyframes;
                    type = type2;
                    value3 = value2;
                    f2 = 0.0f;
                }
                PropertyValuesHolder value4 = PropertyValuesHolder.ofKeyframe(propertyName, keyframeArray);
                if (valueType2 != 3) {
                    return value4;
                }
                value4.setEvaluator(Cf.m۷۹۹۵a());
                return value4;
            }
        } else {
            value = null;
        }
        return value;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Keyframe m۷۹۸۲a(Keyframe sampleKeyframe, float fraction) {
        if (sampleKeyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(fraction);
        }
        if (sampleKeyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(fraction);
        }
        return Keyframe.ofObject(fraction);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۷۹۹۱a(Keyframe[] keyframes, float gap, int startIndex, int endIndex) {
        int count = (endIndex - startIndex) + 2;
        float increment = gap / count;
        for (int i = startIndex; i <= endIndex; i++) {
            keyframes[i].setFraction(keyframes[i - 1].getFraction() + increment);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Keyframe m۷۹۸۳a(Context context, Resources res, Resources.Theme theme, AttributeSet attrs, int valueType, XmlPullParser parser) {
        TypedArray a2 = Cg.m۱۰۶۲۱a(res, theme, attrs, Ca.f۸۳۳۸j);
        Keyframe keyframe = null;
        float fraction = Cg.m۱۰۶۱۹a(a2, parser, "fraction", 3, -1.0f);
        TypedValue keyframeValue = Cg.m۱۰۶۲۷b(a2, parser, "value", 0);
        boolean hasValue = keyframeValue != null;
        if (valueType == 4) {
            if (hasValue && m۷۹۹۲a(keyframeValue.type)) {
                valueType = 3;
            } else {
                valueType = 0;
            }
        }
        if (hasValue) {
            if (valueType == 0) {
                float value = Cg.m۱۰۶۱۹a(a2, parser, "value", 0, 0.0f);
                keyframe = Keyframe.ofFloat(fraction, value);
            } else if (valueType == 1 || valueType == 3) {
                int intValue = Cg.m۱۰۶۲۶b(a2, parser, "value", 0, 0);
                keyframe = Keyframe.ofInt(fraction, intValue);
            }
        } else {
            keyframe = valueType == 0 ? Keyframe.ofFloat(fraction) : Keyframe.ofInt(fraction);
        }
        int resID = Cg.m۱۰۶۲۸c(a2, parser, "interpolator", 1, 0);
        if (resID > 0) {
            Interpolator interpolator = Cd.m۷۹۷۳a(context, resID);
            keyframe.setInterpolator(interpolator);
        }
        a2.recycle();
        return keyframe;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static ObjectAnimator m۷۹۸۴a(Context context, Resources res, Resources.Theme theme, AttributeSet attrs, float pathErrorScale, XmlPullParser parser) {
        ObjectAnimator anim = new ObjectAnimator();
        m۷۹۸۷a(context, res, theme, attrs, anim, pathErrorScale, parser);
        return anim;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static ValueAnimator m۷۹۸۷a(Context context, Resources res, Resources.Theme theme, AttributeSet attrs, ValueAnimator anim, float pathErrorScale, XmlPullParser parser) {
        TypedArray arrayAnimator = Cg.m۱۰۶۲۱a(res, theme, attrs, Ca.f۸۳۳۵g);
        TypedArray arrayObjectAnimator = Cg.m۱۰۶۲۱a(res, theme, attrs, Ca.f۸۳۳۹k);
        if (anim == null) {
            anim = new ValueAnimator();
        }
        m۷۹۸۹a(anim, arrayAnimator, arrayObjectAnimator, pathErrorScale, parser);
        int resID = Cg.m۱۰۶۲۸c(arrayAnimator, parser, "interpolator", 0, 0);
        if (resID > 0) {
            Interpolator interpolator = Cd.m۷۹۷۳a(context, resID);
            anim.setInterpolator(interpolator);
        }
        arrayAnimator.recycle();
        if (arrayObjectAnimator != null) {
            arrayObjectAnimator.recycle();
        }
        return anim;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۷۹۹۲a(int type) {
        return type >= 28 && type <= 31;
    }
}
