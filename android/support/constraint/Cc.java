package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.constraint.Cd;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.constraint.c  reason: invalid class name */
public class Cc {

    /* renamed from: b  reason: contains not printable characters */
    private static final int[] f۹۱۱۰b = {0, 4, 8};

    /* renamed from: c  reason: contains not printable characters */
    private static SparseIntArray f۹۱۱۱c = new SparseIntArray();

    /* renamed from: a  reason: contains not printable characters */
    private HashMap<Integer, Cb> f۹۱۱۲a = new HashMap<>();

    static {
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_editor_absoluteX, 6);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_editor_absoluteY, 7);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintGuide_begin, 17);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintGuide_end, 18);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintGuide_percent, 19);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_orientation, 27);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_goneMarginLeft, 13);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_goneMarginTop, 16);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_goneMarginRight, 14);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_goneMarginBottom, 11);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_goneMarginStart, 15);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_goneMarginEnd, 12);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintVertical_weight, 40);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintVertical_bias, 37);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintDimensionRatio, 5);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintLeft_creator, 64);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintTop_creator, 64);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintRight_creator, 64);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintBottom_creator, 64);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintBaseline_creator, 64);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_layout_marginLeft, 24);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_layout_marginRight, 28);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_layout_marginStart, 31);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_layout_marginEnd, 8);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_layout_marginTop, 34);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_layout_marginBottom, 2);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_layout_width, 23);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_layout_height, 21);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_visibility, 22);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_alpha, 43);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_elevation, 44);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_rotationX, 45);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_rotationY, 46);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_rotation, 60);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_scaleX, 47);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_scaleY, 48);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_transformPivotX, 49);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_transformPivotY, 50);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_translationX, 51);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_translationY, 52);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_translationZ, 53);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintWidth_default, 54);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintHeight_default, 55);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintWidth_max, 56);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintHeight_max, 57);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintWidth_min, 58);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintHeight_min, 59);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintCircle, 61);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintCircleRadius, 62);
        f۹۱۱۱c.append(Ch.ConstraintSet_layout_constraintCircleAngle, 63);
        f۹۱۱۱c.append(Ch.ConstraintSet_android_id, 38);
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.constraint.c$b  reason: invalid class name */
    public static class Cb {

        /* renamed from: A  reason: contains not printable characters */
        public int f۹۱۱۳A;

        /* renamed from: B  reason: contains not printable characters */
        public int f۹۱۱۴B;

        /* renamed from: C  reason: contains not printable characters */
        public int f۹۱۱۵C;

        /* renamed from: D  reason: contains not printable characters */
        public int f۹۱۱۶D;

        /* renamed from: E  reason: contains not printable characters */
        public int f۹۱۱۷E;

        /* renamed from: F  reason: contains not printable characters */
        public int f۹۱۱۸F;

        /* renamed from: G  reason: contains not printable characters */
        public int f۹۱۱۹G;

        /* renamed from: H  reason: contains not printable characters */
        public int f۹۱۲۰H;

        /* renamed from: I  reason: contains not printable characters */
        public int f۹۱۲۱I;

        /* renamed from: J  reason: contains not printable characters */
        public int f۹۱۲۲J;

        /* renamed from: K  reason: contains not printable characters */
        public int f۹۱۲۳K;

        /* renamed from: L  reason: contains not printable characters */
        public int f۹۱۲۴L;

        /* renamed from: M  reason: contains not printable characters */
        public int f۹۱۲۵M;

        /* renamed from: N  reason: contains not printable characters */
        public int f۹۱۲۶N;

        /* renamed from: O  reason: contains not printable characters */
        public int f۹۱۲۷O;

        /* renamed from: P  reason: contains not printable characters */
        public int f۹۱۲۸P;

        /* renamed from: Q  reason: contains not printable characters */
        public float f۹۱۲۹Q;

        /* renamed from: R  reason: contains not printable characters */
        public float f۹۱۳۰R;

        /* renamed from: S  reason: contains not printable characters */
        public int f۹۱۳۱S;

        /* renamed from: T  reason: contains not printable characters */
        public int f۹۱۳۲T;

        /* renamed from: U  reason: contains not printable characters */
        public float f۹۱۳۳U;

        /* renamed from: V  reason: contains not printable characters */
        public boolean f۹۱۳۴V;

        /* renamed from: W  reason: contains not printable characters */
        public float f۹۱۳۵W;

        /* renamed from: X  reason: contains not printable characters */
        public float f۹۱۳۶X;

        /* renamed from: Y  reason: contains not printable characters */
        public float f۹۱۳۷Y;

        /* renamed from: Z  reason: contains not printable characters */
        public float f۹۱۳۸Z;

        /* renamed from: a  reason: contains not printable characters */
        boolean f۹۱۳۹a;

        /* renamed from: a0  reason: contains not printable characters */
        public float f۹۱۴۰a0;

        /* renamed from: b  reason: contains not printable characters */
        public int f۹۱۴۱b;

        /* renamed from: b0  reason: contains not printable characters */
        public float f۹۱۴۲b0;

        /* renamed from: c  reason: contains not printable characters */
        public int f۹۱۴۳c;

        /* renamed from: c0  reason: contains not printable characters */
        public float f۹۱۴۴c0;

        /* renamed from: d  reason: contains not printable characters */
        int f۹۱۴۵d;

        /* renamed from: d0  reason: contains not printable characters */
        public float f۹۱۴۶d0;

        /* renamed from: e  reason: contains not printable characters */
        public int f۹۱۴۷e;

        /* renamed from: e0  reason: contains not printable characters */
        public float f۹۱۴۸e0;

        /* renamed from: f  reason: contains not printable characters */
        public int f۹۱۴۹f;

        /* renamed from: f0  reason: contains not printable characters */
        public float f۹۱۵۰f0;

        /* renamed from: g  reason: contains not printable characters */
        public float f۹۱۵۱g;

        /* renamed from: g0  reason: contains not printable characters */
        public float f۹۱۵۲g0;

        /* renamed from: h  reason: contains not printable characters */
        public int f۹۱۵۳h;

        /* renamed from: h0  reason: contains not printable characters */
        public boolean f۹۱۵۴h0;

        /* renamed from: i  reason: contains not printable characters */
        public int f۹۱۵۵i;

        /* renamed from: i0  reason: contains not printable characters */
        public boolean f۹۱۵۶i0;

        /* renamed from: j  reason: contains not printable characters */
        public int f۹۱۵۷j;

        /* renamed from: j0  reason: contains not printable characters */
        public int f۹۱۵۸j0;

        /* renamed from: k  reason: contains not printable characters */
        public int f۹۱۵۹k;

        /* renamed from: k0  reason: contains not printable characters */
        public int f۹۱۶۰k0;

        /* renamed from: l  reason: contains not printable characters */
        public int f۹۱۶۱l;

        /* renamed from: l0  reason: contains not printable characters */
        public int f۹۱۶۲l0;

        /* renamed from: m  reason: contains not printable characters */
        public int f۹۱۶۳m;

        /* renamed from: m0  reason: contains not printable characters */
        public int f۹۱۶۴m0;

        /* renamed from: n  reason: contains not printable characters */
        public int f۹۱۶۵n;

        /* renamed from: n0  reason: contains not printable characters */
        public int f۹۱۶۶n0;

        /* renamed from: o  reason: contains not printable characters */
        public int f۹۱۶۷o;

        /* renamed from: o0  reason: contains not printable characters */
        public int f۹۱۶۸o0;

        /* renamed from: p  reason: contains not printable characters */
        public int f۹۱۶۹p;

        /* renamed from: p0  reason: contains not printable characters */
        public float f۹۱۷۰p0;

        /* renamed from: q  reason: contains not printable characters */
        public int f۹۱۷۱q;

        /* renamed from: q0  reason: contains not printable characters */
        public float f۹۱۷۲q0;

        /* renamed from: r  reason: contains not printable characters */
        public int f۹۱۷۳r;

        /* renamed from: r0  reason: contains not printable characters */
        public int f۹۱۷۴r0;

        /* renamed from: s  reason: contains not printable characters */
        public int f۹۱۷۵s;

        /* renamed from: s0  reason: contains not printable characters */
        public int f۹۱۷۶s0;

        /* renamed from: t  reason: contains not printable characters */
        public int f۹۱۷۷t;

        /* renamed from: t0  reason: contains not printable characters */
        public int[] f۹۱۷۸t0;

        /* renamed from: u  reason: contains not printable characters */
        public float f۹۱۷۹u;

        /* renamed from: v  reason: contains not printable characters */
        public float f۹۱۸۰v;

        /* renamed from: w  reason: contains not printable characters */
        public String f۹۱۸۱w;

        /* renamed from: x  reason: contains not printable characters */
        public int f۹۱۸۲x;

        /* renamed from: y  reason: contains not printable characters */
        public int f۹۱۸۳y;

        /* renamed from: z  reason: contains not printable characters */
        public float f۹۱۸۴z;

        private Cb() {
            this.f۹۱۳۹a = false;
            this.f۹۱۴۷e = -1;
            this.f۹۱۴۹f = -1;
            this.f۹۱۵۱g = -1.0f;
            this.f۹۱۵۳h = -1;
            this.f۹۱۵۵i = -1;
            this.f۹۱۵۷j = -1;
            this.f۹۱۵۹k = -1;
            this.f۹۱۶۱l = -1;
            this.f۹۱۶۳m = -1;
            this.f۹۱۶۵n = -1;
            this.f۹۱۶۷o = -1;
            this.f۹۱۶۹p = -1;
            this.f۹۱۷۱q = -1;
            this.f۹۱۷۳r = -1;
            this.f۹۱۷۵s = -1;
            this.f۹۱۷۷t = -1;
            this.f۹۱۷۹u = 0.5f;
            this.f۹۱۸۰v = 0.5f;
            this.f۹۱۸۱w = null;
            this.f۹۱۸۲x = -1;
            this.f۹۱۸۳y = 0;
            this.f۹۱۸۴z = 0.0f;
            this.f۹۱۱۳A = -1;
            this.f۹۱۱۴B = -1;
            this.f۹۱۱۵C = -1;
            this.f۹۱۱۶D = -1;
            this.f۹۱۱۷E = -1;
            this.f۹۱۱۸F = -1;
            this.f۹۱۱۹G = -1;
            this.f۹۱۲۰H = -1;
            this.f۹۱۲۱I = -1;
            this.f۹۱۲۲J = 0;
            this.f۹۱۲۳K = -1;
            this.f۹۱۲۴L = -1;
            this.f۹۱۲۵M = -1;
            this.f۹۱۲۶N = -1;
            this.f۹۱۲۷O = -1;
            this.f۹۱۲۸P = -1;
            this.f۹۱۲۹Q = 0.0f;
            this.f۹۱۳۰R = 0.0f;
            this.f۹۱۳۱S = 0;
            this.f۹۱۳۲T = 0;
            this.f۹۱۳۳U = 1.0f;
            this.f۹۱۳۴V = false;
            this.f۹۱۳۵W = 0.0f;
            this.f۹۱۳۶X = 0.0f;
            this.f۹۱۳۷Y = 0.0f;
            this.f۹۱۳۸Z = 0.0f;
            this.f۹۱۴۰a0 = 1.0f;
            this.f۹۱۴۲b0 = 1.0f;
            this.f۹۱۴۴c0 = Float.NaN;
            this.f۹۱۴۶d0 = Float.NaN;
            this.f۹۱۴۸e0 = 0.0f;
            this.f۹۱۵۰f0 = 0.0f;
            this.f۹۱۵۲g0 = 0.0f;
            this.f۹۱۵۴h0 = false;
            this.f۹۱۵۶i0 = false;
            this.f۹۱۵۸j0 = 0;
            this.f۹۱۶۰k0 = 0;
            this.f۹۱۶۲l0 = -1;
            this.f۹۱۶۴m0 = -1;
            this.f۹۱۶۶n0 = -1;
            this.f۹۱۶۸o0 = -1;
            this.f۹۱۷۰p0 = 1.0f;
            this.f۹۱۷۲q0 = 1.0f;
            this.f۹۱۷۴r0 = -1;
            this.f۹۱۷۶s0 = -1;
        }

        public Cb clone() {
            Cb clone = new Cb();
            clone.f۹۱۳۹a = this.f۹۱۳۹a;
            clone.f۹۱۴۱b = this.f۹۱۴۱b;
            clone.f۹۱۴۳c = this.f۹۱۴۳c;
            clone.f۹۱۴۷e = this.f۹۱۴۷e;
            clone.f۹۱۴۹f = this.f۹۱۴۹f;
            clone.f۹۱۵۱g = this.f۹۱۵۱g;
            clone.f۹۱۵۳h = this.f۹۱۵۳h;
            clone.f۹۱۵۵i = this.f۹۱۵۵i;
            clone.f۹۱۵۷j = this.f۹۱۵۷j;
            clone.f۹۱۵۹k = this.f۹۱۵۹k;
            clone.f۹۱۶۱l = this.f۹۱۶۱l;
            clone.f۹۱۶۳m = this.f۹۱۶۳m;
            clone.f۹۱۶۵n = this.f۹۱۶۵n;
            clone.f۹۱۶۷o = this.f۹۱۶۷o;
            clone.f۹۱۶۹p = this.f۹۱۶۹p;
            clone.f۹۱۷۱q = this.f۹۱۷۱q;
            clone.f۹۱۷۳r = this.f۹۱۷۳r;
            clone.f۹۱۷۵s = this.f۹۱۷۵s;
            clone.f۹۱۷۷t = this.f۹۱۷۷t;
            clone.f۹۱۷۹u = this.f۹۱۷۹u;
            clone.f۹۱۸۰v = this.f۹۱۸۰v;
            clone.f۹۱۸۱w = this.f۹۱۸۱w;
            clone.f۹۱۱۳A = this.f۹۱۱۳A;
            clone.f۹۱۱۴B = this.f۹۱۱۴B;
            clone.f۹۱۷۹u = this.f۹۱۷۹u;
            clone.f۹۱۷۹u = this.f۹۱۷۹u;
            clone.f۹۱۷۹u = this.f۹۱۷۹u;
            clone.f۹۱۷۹u = this.f۹۱۷۹u;
            clone.f۹۱۷۹u = this.f۹۱۷۹u;
            clone.f۹۱۱۵C = this.f۹۱۱۵C;
            clone.f۹۱۱۶D = this.f۹۱۱۶D;
            clone.f۹۱۱۷E = this.f۹۱۱۷E;
            clone.f۹۱۱۸F = this.f۹۱۱۸F;
            clone.f۹۱۱۹G = this.f۹۱۱۹G;
            clone.f۹۱۲۰H = this.f۹۱۲۰H;
            clone.f۹۱۲۱I = this.f۹۱۲۱I;
            clone.f۹۱۲۲J = this.f۹۱۲۲J;
            clone.f۹۱۲۳K = this.f۹۱۲۳K;
            clone.f۹۱۲۴L = this.f۹۱۲۴L;
            clone.f۹۱۲۵M = this.f۹۱۲۵M;
            clone.f۹۱۲۶N = this.f۹۱۲۶N;
            clone.f۹۱۲۷O = this.f۹۱۲۷O;
            clone.f۹۱۲۸P = this.f۹۱۲۸P;
            clone.f۹۱۲۹Q = this.f۹۱۲۹Q;
            clone.f۹۱۳۰R = this.f۹۱۳۰R;
            clone.f۹۱۳۱S = this.f۹۱۳۱S;
            clone.f۹۱۳۲T = this.f۹۱۳۲T;
            clone.f۹۱۳۳U = this.f۹۱۳۳U;
            clone.f۹۱۳۴V = this.f۹۱۳۴V;
            clone.f۹۱۳۵W = this.f۹۱۳۵W;
            clone.f۹۱۳۶X = this.f۹۱۳۶X;
            clone.f۹۱۳۷Y = this.f۹۱۳۷Y;
            clone.f۹۱۳۸Z = this.f۹۱۳۸Z;
            clone.f۹۱۴۰a0 = this.f۹۱۴۰a0;
            clone.f۹۱۴۲b0 = this.f۹۱۴۲b0;
            clone.f۹۱۴۴c0 = this.f۹۱۴۴c0;
            clone.f۹۱۴۶d0 = this.f۹۱۴۶d0;
            clone.f۹۱۴۸e0 = this.f۹۱۴۸e0;
            clone.f۹۱۵۰f0 = this.f۹۱۵۰f0;
            clone.f۹۱۵۲g0 = this.f۹۱۵۲g0;
            clone.f۹۱۵۴h0 = this.f۹۱۵۴h0;
            clone.f۹۱۵۶i0 = this.f۹۱۵۶i0;
            clone.f۹۱۵۸j0 = this.f۹۱۵۸j0;
            clone.f۹۱۶۰k0 = this.f۹۱۶۰k0;
            clone.f۹۱۶۲l0 = this.f۹۱۶۲l0;
            clone.f۹۱۶۴m0 = this.f۹۱۶۴m0;
            clone.f۹۱۶۶n0 = this.f۹۱۶۶n0;
            clone.f۹۱۶۸o0 = this.f۹۱۶۸o0;
            clone.f۹۱۷۰p0 = this.f۹۱۷۰p0;
            clone.f۹۱۷۲q0 = this.f۹۱۷۲q0;
            clone.f۹۱۷۴r0 = this.f۹۱۷۴r0;
            clone.f۹۱۷۶s0 = this.f۹۱۷۶s0;
            int[] iArr = this.f۹۱۷۸t0;
            if (iArr != null) {
                clone.f۹۱۷۸t0 = Arrays.copyOf(iArr, iArr.length);
            }
            clone.f۹۱۸۲x = this.f۹۱۸۲x;
            clone.f۹۱۸۳y = this.f۹۱۸۳y;
            clone.f۹۱۸۴z = this.f۹۱۸۴z;
            return clone;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۹۷۴a(AbstractCb helper, int viewId, Cd.Ca param) {
            m۱۰۹۷۳a(viewId, param);
            if (helper instanceof Ca) {
                this.f۹۱۷۶s0 = 1;
                Ca barrier = (Ca) helper;
                this.f۹۱۷۴r0 = barrier.getType();
                this.f۹۱۷۸t0 = barrier.getReferencedIds();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۹۷۳a(int viewId, Cd.Ca param) {
            m۱۰۹۷۲a(viewId, (ConstraintLayout.Ca) param);
            this.f۹۱۳۳U = param.f۹۱۸۶m0;
            this.f۹۱۳۶X = param.f۹۱۸۹p0;
            this.f۹۱۳۷Y = param.f۹۱۹۰q0;
            this.f۹۱۳۸Z = param.f۹۱۹۱r0;
            this.f۹۱۴۰a0 = param.f۹۱۹۲s0;
            this.f۹۱۴۲b0 = param.f۹۱۹۳t0;
            this.f۹۱۴۴c0 = param.f۹۱۹۴u0;
            this.f۹۱۴۶d0 = param.f۹۱۹۵v0;
            this.f۹۱۴۸e0 = param.f۹۱۹۶w0;
            this.f۹۱۵۰f0 = param.f۹۱۹۷x0;
            this.f۹۱۵۲g0 = param.f۹۱۹۸y0;
            this.f۹۱۳۵W = param.f۹۱۸۸o0;
            this.f۹۱۳۴V = param.f۹۱۸۷n0;
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۹۷۲a(int viewId, ConstraintLayout.Ca param) {
            this.f۹۱۴۵d = viewId;
            this.f۹۱۵۳h = param.f۹۰۶۸d;
            this.f۹۱۵۵i = param.f۹۰۷۰e;
            this.f۹۱۵۷j = param.f۹۰۷۲f;
            this.f۹۱۵۹k = param.f۹۰۷۴g;
            this.f۹۱۶۱l = param.f۹۰۷۶h;
            this.f۹۱۶۳m = param.f۹۰۷۸i;
            this.f۹۱۶۵n = param.f۹۰۸۰j;
            this.f۹۱۶۷o = param.f۹۰۸۲k;
            this.f۹۱۶۹p = param.f۹۰۸۴l;
            this.f۹۱۷۱q = param.f۹۰۸۹p;
            this.f۹۱۷۳r = param.f۹۰۹۰q;
            this.f۹۱۷۵s = param.f۹۰۹۱r;
            this.f۹۱۷۷t = param.f۹۰۹۲s;
            this.f۹۱۷۹u = param.f۹۰۹۹z;
            this.f۹۱۸۰v = param.f۹۰۳۶A;
            this.f۹۱۸۱w = param.f۹۰۳۷B;
            this.f۹۱۸۲x = param.f۹۰۸۶m;
            this.f۹۱۸۳y = param.f۹۰۸۷n;
            this.f۹۱۸۴z = param.f۹۰۸۸o;
            this.f۹۱۱۳A = param.f۹۰۵۱P;
            this.f۹۱۱۴B = param.f۹۰۵۲Q;
            this.f۹۱۱۵C = param.f۹۰۵۳R;
            this.f۹۱۵۱g = param.f۹۰۶۶c;
            this.f۹۱۴۷e = param.f۹۰۶۲a;
            this.f۹۱۴۹f = param.f۹۰۶۴b;
            this.f۹۱۴۱b = ((ViewGroup.MarginLayoutParams) param).width;
            this.f۹۱۴۳c = ((ViewGroup.MarginLayoutParams) param).height;
            this.f۹۱۱۶D = ((ViewGroup.MarginLayoutParams) param).leftMargin;
            this.f۹۱۱۷E = ((ViewGroup.MarginLayoutParams) param).rightMargin;
            this.f۹۱۱۸F = ((ViewGroup.MarginLayoutParams) param).topMargin;
            this.f۹۱۱۹G = ((ViewGroup.MarginLayoutParams) param).bottomMargin;
            this.f۹۱۲۹Q = param.f۹۰۴۰E;
            this.f۹۱۳۰R = param.f۹۰۳۹D;
            this.f۹۱۳۲T = param.f۹۰۴۲G;
            this.f۹۱۳۱S = param.f۹۰۴۱F;
            boolean z = param.f۹۰۵۴S;
            this.f۹۱۵۴h0 = z;
            this.f۹۱۵۶i0 = param.f۹۰۵۵T;
            this.f۹۱۵۸j0 = param.f۹۰۴۳H;
            this.f۹۱۶۰k0 = param.f۹۰۴۴I;
            this.f۹۱۵۴h0 = z;
            this.f۹۱۶۲l0 = param.f۹۰۴۷L;
            this.f۹۱۶۴m0 = param.f۹۰۴۸M;
            this.f۹۱۶۶n0 = param.f۹۰۴۵J;
            this.f۹۱۶۸o0 = param.f۹۰۴۶K;
            this.f۹۱۷۰p0 = param.f۹۰۴۹N;
            this.f۹۱۷۲q0 = param.f۹۰۵۰O;
            if (Build.VERSION.SDK_INT >= 17) {
                this.f۹۱۲۰H = param.getMarginEnd();
                this.f۹۱۲۱I = param.getMarginStart();
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۹۷۷a(ConstraintLayout.Ca param) {
            param.f۹۰۶۸d = this.f۹۱۵۳h;
            param.f۹۰۷۰e = this.f۹۱۵۵i;
            param.f۹۰۷۲f = this.f۹۱۵۷j;
            param.f۹۰۷۴g = this.f۹۱۵۹k;
            param.f۹۰۷۶h = this.f۹۱۶۱l;
            param.f۹۰۷۸i = this.f۹۱۶۳m;
            param.f۹۰۸۰j = this.f۹۱۶۵n;
            param.f۹۰۸۲k = this.f۹۱۶۷o;
            param.f۹۰۸۴l = this.f۹۱۶۹p;
            param.f۹۰۸۹p = this.f۹۱۷۱q;
            param.f۹۰۹۰q = this.f۹۱۷۳r;
            param.f۹۰۹۱r = this.f۹۱۷۵s;
            param.f۹۰۹۲s = this.f۹۱۷۷t;
            ((ViewGroup.MarginLayoutParams) param).leftMargin = this.f۹۱۱۶D;
            ((ViewGroup.MarginLayoutParams) param).rightMargin = this.f۹۱۱۷E;
            ((ViewGroup.MarginLayoutParams) param).topMargin = this.f۹۱۱۸F;
            ((ViewGroup.MarginLayoutParams) param).bottomMargin = this.f۹۱۱۹G;
            param.f۹۰۹۷x = this.f۹۱۲۸P;
            param.f۹۰۹۸y = this.f۹۱۲۷O;
            param.f۹۰۹۹z = this.f۹۱۷۹u;
            param.f۹۰۳۶A = this.f۹۱۸۰v;
            param.f۹۰۸۶m = this.f۹۱۸۲x;
            param.f۹۰۸۷n = this.f۹۱۸۳y;
            param.f۹۰۸۸o = this.f۹۱۸۴z;
            param.f۹۰۳۷B = this.f۹۱۸۱w;
            param.f۹۰۵۱P = this.f۹۱۱۳A;
            param.f۹۰۵۲Q = this.f۹۱۱۴B;
            param.f۹۰۴۰E = this.f۹۱۲۹Q;
            param.f۹۰۳۹D = this.f۹۱۳۰R;
            param.f۹۰۴۲G = this.f۹۱۳۲T;
            param.f۹۰۴۱F = this.f۹۱۳۱S;
            param.f۹۰۵۴S = this.f۹۱۵۴h0;
            param.f۹۰۵۵T = this.f۹۱۵۶i0;
            param.f۹۰۴۳H = this.f۹۱۵۸j0;
            param.f۹۰۴۴I = this.f۹۱۶۰k0;
            param.f۹۰۴۷L = this.f۹۱۶۲l0;
            param.f۹۰۴۸M = this.f۹۱۶۴m0;
            param.f۹۰۴۵J = this.f۹۱۶۶n0;
            param.f۹۰۴۶K = this.f۹۱۶۸o0;
            param.f۹۰۴۹N = this.f۹۱۷۰p0;
            param.f۹۰۵۰O = this.f۹۱۷۲q0;
            param.f۹۰۵۳R = this.f۹۱۱۵C;
            param.f۹۰۶۶c = this.f۹۱۵۱g;
            param.f۹۰۶۲a = this.f۹۱۴۷e;
            param.f۹۰۶۴b = this.f۹۱۴۹f;
            ((ViewGroup.MarginLayoutParams) param).width = this.f۹۱۴۱b;
            ((ViewGroup.MarginLayoutParams) param).height = this.f۹۱۴۳c;
            if (Build.VERSION.SDK_INT >= 17) {
                param.setMarginStart(this.f۹۱۲۱I);
                param.setMarginEnd(this.f۹۱۲۰H);
            }
            param.m۱۰۹۵۸a();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۷۱a(Cd constraints) {
        int count = constraints.getChildCount();
        this.f۹۱۱۲a.clear();
        for (int i = 0; i < count; i++) {
            View view = constraints.getChildAt(i);
            Cd.Ca param = (Cd.Ca) view.getLayoutParams();
            int id = view.getId();
            if (id != -1) {
                if (!this.f۹۱۱۲a.containsKey(Integer.valueOf(id))) {
                    this.f۹۱۱۲a.put(Integer.valueOf(id), new Cb());
                }
                Cb constraint = this.f۹۱۱۲a.get(Integer.valueOf(id));
                if (view instanceof AbstractCb) {
                    constraint.m۱۰۹۷۴a((Cb) ((AbstractCb) view), (AbstractCb) id, (int) param);
                }
                constraint.m۱۰۹۷۳a((Cb) id, (int) param);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۷۰a(ConstraintLayout constraintLayout) {
        int count = constraintLayout.getChildCount();
        HashSet<Integer> used = new HashSet<>(this.f۹۱۱۲a.keySet());
        for (int i = 0; i < count; i++) {
            View view = constraintLayout.getChildAt(i);
            int id = view.getId();
            if (id != -1) {
                if (this.f۹۱۱۲a.containsKey(Integer.valueOf(id))) {
                    used.remove(Integer.valueOf(id));
                    Cb constraint = this.f۹۱۱۲a.get(Integer.valueOf(id));
                    int i2 = constraint.f۹۱۷۶s0;
                    if (i2 != -1 && i2 == 1) {
                        Ca barrier = (Ca) view;
                        barrier.setId(id);
                        barrier.setReferencedIds(constraint.f۹۱۷۸t0);
                        barrier.setType(constraint.f۹۱۷۴r0);
                        constraint.m۱۰۹۷۷a(constraintLayout.generateDefaultLayoutParams());
                    }
                    ConstraintLayout.Ca param = (ConstraintLayout.Ca) view.getLayoutParams();
                    constraint.m۱۰۹۷۷a(param);
                    view.setLayoutParams(param);
                    view.setVisibility(constraint.f۹۱۲۲J);
                    if (Build.VERSION.SDK_INT >= 17) {
                        view.setAlpha(constraint.f۹۱۳۳U);
                        view.setRotation(constraint.f۹۱۳۶X);
                        view.setRotationX(constraint.f۹۱۳۷Y);
                        view.setRotationY(constraint.f۹۱۳۸Z);
                        view.setScaleX(constraint.f۹۱۴۰a0);
                        view.setScaleY(constraint.f۹۱۴۲b0);
                        if (!Float.isNaN(constraint.f۹۱۴۴c0)) {
                            view.setPivotX(constraint.f۹۱۴۴c0);
                        }
                        if (!Float.isNaN(constraint.f۹۱۴۶d0)) {
                            view.setPivotY(constraint.f۹۱۴۶d0);
                        }
                        view.setTranslationX(constraint.f۹۱۴۸e0);
                        view.setTranslationY(constraint.f۹۱۵۰f0);
                        if (Build.VERSION.SDK_INT >= 21) {
                            view.setTranslationZ(constraint.f۹۱۵۲g0);
                            if (constraint.f۹۱۳۴V) {
                                view.setElevation(constraint.f۹۱۳۵W);
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator<Integer> it = used.iterator();
        while (it.hasNext()) {
            Integer id2 = it.next();
            Cb constraint2 = this.f۹۱۱۲a.get(id2);
            int i3 = constraint2.f۹۱۷۶s0;
            if (i3 != -1 && i3 == 1) {
                Ca barrier2 = new Ca(constraintLayout.getContext());
                barrier2.setId(id2.intValue());
                barrier2.setReferencedIds(constraint2.f۹۱۷۸t0);
                barrier2.setType(constraint2.f۹۱۷۴r0);
                ConstraintLayout.Ca param2 = constraintLayout.generateDefaultLayoutParams();
                constraint2.m۱۰۹۷۷a(param2);
                constraintLayout.addView(barrier2, param2);
            }
            if (constraint2.f۹۱۳۹a) {
                Ce g = new Ce(constraintLayout.getContext());
                g.setId(id2.intValue());
                ConstraintLayout.Ca param3 = constraintLayout.generateDefaultLayoutParams();
                constraint2.m۱۰۹۷۷a(param3);
                constraintLayout.addView(g, param3);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۶۹a(Context context, int resourceId) {
        XmlPullParser parser = context.getResources().getXml(resourceId);
        try {
            for (int eventType = parser.getEventType(); eventType != 1; eventType = parser.next()) {
                if (eventType == 0) {
                    parser.getName();
                } else if (eventType == 2) {
                    String tagName = parser.getName();
                    Cb constraint = m۱۰۹۶۷a(context, Xml.asAttributeSet(parser));
                    if (tagName.equalsIgnoreCase("Guideline")) {
                        constraint.f۹۱۳۹a = true;
                    }
                    this.f۹۱۱۲a.put(Integer.valueOf(constraint.f۹۱۴۵d), constraint);
                } else if (eventType != 3) {
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۰۹۶۶a(TypedArray a, int index, int def) {
        int ret = a.getResourceId(index, def);
        if (ret == -1) {
            return a.getInt(index, -1);
        }
        return ret;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Cb m۱۰۹۶۷a(Context context, AttributeSet attrs) {
        Cb c = new Cb();
        TypedArray a = context.obtainStyledAttributes(attrs, Ch.ConstraintSet);
        m۱۰۹۶۸a(c, a);
        a.recycle();
        return c;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۹۶۸a(Cb c, TypedArray a) {
        int N = a.getIndexCount();
        for (int i = 0; i < N; i++) {
            int attr = a.getIndex(i);
            int i2 = f۹۱۱۱c.get(attr);
            switch (i2) {
                case 1:
                    c.f۹۱۶۹p = m۱۰۹۶۶a(a, attr, c.f۹۱۶۹p);
                    break;
                case 2:
                    c.f۹۱۱۹G = a.getDimensionPixelSize(attr, c.f۹۱۱۹G);
                    break;
                case 3:
                    c.f۹۱۶۷o = m۱۰۹۶۶a(a, attr, c.f۹۱۶۷o);
                    break;
                case 4:
                    c.f۹۱۶۵n = m۱۰۹۶۶a(a, attr, c.f۹۱۶۵n);
                    break;
                case 5:
                    c.f۹۱۸۱w = a.getString(attr);
                    break;
                case 6:
                    c.f۹۱۱۳A = a.getDimensionPixelOffset(attr, c.f۹۱۱۳A);
                    break;
                case 7:
                    c.f۹۱۱۴B = a.getDimensionPixelOffset(attr, c.f۹۱۱۴B);
                    break;
                case 8:
                    c.f۹۱۲۰H = a.getDimensionPixelSize(attr, c.f۹۱۲۰H);
                    break;
                case 9:
                    c.f۹۱۷۷t = m۱۰۹۶۶a(a, attr, c.f۹۱۷۷t);
                    break;
                case 10:
                    c.f۹۱۷۵s = m۱۰۹۶۶a(a, attr, c.f۹۱۷۵s);
                    break;
                case 11:
                    c.f۹۱۲۶N = a.getDimensionPixelSize(attr, c.f۹۱۲۶N);
                    break;
                case 12:
                    c.f۹۱۲۷O = a.getDimensionPixelSize(attr, c.f۹۱۲۷O);
                    break;
                case 13:
                    c.f۹۱۲۳K = a.getDimensionPixelSize(attr, c.f۹۱۲۳K);
                    break;
                case 14:
                    c.f۹۱۲۵M = a.getDimensionPixelSize(attr, c.f۹۱۲۵M);
                    break;
                case 15:
                    c.f۹۱۲۸P = a.getDimensionPixelSize(attr, c.f۹۱۲۸P);
                    break;
                case 16:
                    c.f۹۱۲۴L = a.getDimensionPixelSize(attr, c.f۹۱۲۴L);
                    break;
                case 17:
                    c.f۹۱۴۷e = a.getDimensionPixelOffset(attr, c.f۹۱۴۷e);
                    break;
                case 18:
                    c.f۹۱۴۹f = a.getDimensionPixelOffset(attr, c.f۹۱۴۹f);
                    break;
                case 19:
                    c.f۹۱۵۱g = a.getFloat(attr, c.f۹۱۵۱g);
                    break;
                case 20:
                    c.f۹۱۷۹u = a.getFloat(attr, c.f۹۱۷۹u);
                    break;
                case 21:
                    c.f۹۱۴۳c = a.getLayoutDimension(attr, c.f۹۱۴۳c);
                    break;
                case 22:
                    c.f۹۱۲۲J = a.getInt(attr, c.f۹۱۲۲J);
                    c.f۹۱۲۲J = f۹۱۱۰b[c.f۹۱۲۲J];
                    break;
                case 23:
                    c.f۹۱۴۱b = a.getLayoutDimension(attr, c.f۹۱۴۱b);
                    break;
                case 24:
                    c.f۹۱۱۶D = a.getDimensionPixelSize(attr, c.f۹۱۱۶D);
                    break;
                case 25:
                    c.f۹۱۵۳h = m۱۰۹۶۶a(a, attr, c.f۹۱۵۳h);
                    break;
                case 26:
                    c.f۹۱۵۵i = m۱۰۹۶۶a(a, attr, c.f۹۱۵۵i);
                    break;
                case 27:
                    c.f۹۱۱۵C = a.getInt(attr, c.f۹۱۱۵C);
                    break;
                case 28:
                    c.f۹۱۱۷E = a.getDimensionPixelSize(attr, c.f۹۱۱۷E);
                    break;
                case 29:
                    c.f۹۱۵۷j = m۱۰۹۶۶a(a, attr, c.f۹۱۵۷j);
                    break;
                case 30:
                    c.f۹۱۵۹k = m۱۰۹۶۶a(a, attr, c.f۹۱۵۹k);
                    break;
                case 31:
                    c.f۹۱۲۱I = a.getDimensionPixelSize(attr, c.f۹۱۲۱I);
                    break;
                case 32:
                    c.f۹۱۷۱q = m۱۰۹۶۶a(a, attr, c.f۹۱۷۱q);
                    break;
                case 33:
                    c.f۹۱۷۳r = m۱۰۹۶۶a(a, attr, c.f۹۱۷۳r);
                    break;
                case 34:
                    c.f۹۱۱۸F = a.getDimensionPixelSize(attr, c.f۹۱۱۸F);
                    break;
                case 35:
                    c.f۹۱۶۳m = m۱۰۹۶۶a(a, attr, c.f۹۱۶۳m);
                    break;
                case 36:
                    c.f۹۱۶۱l = m۱۰۹۶۶a(a, attr, c.f۹۱۶۱l);
                    break;
                case 37:
                    c.f۹۱۸۰v = a.getFloat(attr, c.f۹۱۸۰v);
                    break;
                case 38:
                    c.f۹۱۴۵d = a.getResourceId(attr, c.f۹۱۴۵d);
                    break;
                case 39:
                    c.f۹۱۳۰R = a.getFloat(attr, c.f۹۱۳۰R);
                    break;
                case 40:
                    c.f۹۱۲۹Q = a.getFloat(attr, c.f۹۱۲۹Q);
                    break;
                case 41:
                    c.f۹۱۳۱S = a.getInt(attr, c.f۹۱۳۱S);
                    break;
                case 42:
                    c.f۹۱۳۲T = a.getInt(attr, c.f۹۱۳۲T);
                    break;
                case 43:
                    c.f۹۱۳۳U = a.getFloat(attr, c.f۹۱۳۳U);
                    break;
                case 44:
                    c.f۹۱۳۴V = true;
                    c.f۹۱۳۵W = a.getDimension(attr, c.f۹۱۳۵W);
                    break;
                case 45:
                    c.f۹۱۳۷Y = a.getFloat(attr, c.f۹۱۳۷Y);
                    break;
                case 46:
                    c.f۹۱۳۸Z = a.getFloat(attr, c.f۹۱۳۸Z);
                    break;
                case 47:
                    c.f۹۱۴۰a0 = a.getFloat(attr, c.f۹۱۴۰a0);
                    break;
                case 48:
                    c.f۹۱۴۲b0 = a.getFloat(attr, c.f۹۱۴۲b0);
                    break;
                case 49:
                    c.f۹۱۴۴c0 = a.getFloat(attr, c.f۹۱۴۴c0);
                    break;
                case 50:
                    c.f۹۱۴۶d0 = a.getFloat(attr, c.f۹۱۴۶d0);
                    break;
                case 51:
                    c.f۹۱۴۸e0 = a.getDimension(attr, c.f۹۱۴۸e0);
                    break;
                case 52:
                    c.f۹۱۵۰f0 = a.getDimension(attr, c.f۹۱۵۰f0);
                    break;
                case 53:
                    c.f۹۱۵۲g0 = a.getDimension(attr, c.f۹۱۵۲g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            c.f۹۱۳۶X = a.getFloat(attr, c.f۹۱۳۶X);
                            continue;
                        case 61:
                            c.f۹۱۸۲x = m۱۰۹۶۶a(a, attr, c.f۹۱۸۲x);
                            continue;
                        case 62:
                            c.f۹۱۸۳y = a.getDimensionPixelSize(attr, c.f۹۱۸۳y);
                            continue;
                        case 63:
                            c.f۹۱۸۴z = a.getFloat(attr, c.f۹۱۸۴z);
                            continue;
                        case 64:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(attr) + "   " + f۹۱۱۱c.get(attr));
                            continue;
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(attr) + "   " + f۹۱۱۱c.get(attr));
                            continue;
                    }
            }
        }
    }
}
