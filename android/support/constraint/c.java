package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.d;
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

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f۵۸۹b = {0, 4, 8};

    /* renamed from: c  reason: collision with root package name */
    private static SparseIntArray f۵۹۰c = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    private HashMap<Integer, b> f۵۹۱a = new HashMap<>();

    static {
        f۵۹۰c.append(h.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f۵۹۰c.append(h.ConstraintSet_layout_editor_absoluteX, 6);
        f۵۹۰c.append(h.ConstraintSet_layout_editor_absoluteY, 7);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintGuide_begin, 17);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintGuide_end, 18);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintGuide_percent, 19);
        f۵۹۰c.append(h.ConstraintSet_android_orientation, 27);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f۵۹۰c.append(h.ConstraintSet_layout_goneMarginLeft, 13);
        f۵۹۰c.append(h.ConstraintSet_layout_goneMarginTop, 16);
        f۵۹۰c.append(h.ConstraintSet_layout_goneMarginRight, 14);
        f۵۹۰c.append(h.ConstraintSet_layout_goneMarginBottom, 11);
        f۵۹۰c.append(h.ConstraintSet_layout_goneMarginStart, 15);
        f۵۹۰c.append(h.ConstraintSet_layout_goneMarginEnd, 12);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintVertical_weight, 40);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintVertical_bias, 37);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintDimensionRatio, 5);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintLeft_creator, 64);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintTop_creator, 64);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintRight_creator, 64);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintBottom_creator, 64);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintBaseline_creator, 64);
        f۵۹۰c.append(h.ConstraintSet_android_layout_marginLeft, 24);
        f۵۹۰c.append(h.ConstraintSet_android_layout_marginRight, 28);
        f۵۹۰c.append(h.ConstraintSet_android_layout_marginStart, 31);
        f۵۹۰c.append(h.ConstraintSet_android_layout_marginEnd, 8);
        f۵۹۰c.append(h.ConstraintSet_android_layout_marginTop, 34);
        f۵۹۰c.append(h.ConstraintSet_android_layout_marginBottom, 2);
        f۵۹۰c.append(h.ConstraintSet_android_layout_width, 23);
        f۵۹۰c.append(h.ConstraintSet_android_layout_height, 21);
        f۵۹۰c.append(h.ConstraintSet_android_visibility, 22);
        f۵۹۰c.append(h.ConstraintSet_android_alpha, 43);
        f۵۹۰c.append(h.ConstraintSet_android_elevation, 44);
        f۵۹۰c.append(h.ConstraintSet_android_rotationX, 45);
        f۵۹۰c.append(h.ConstraintSet_android_rotationY, 46);
        f۵۹۰c.append(h.ConstraintSet_android_rotation, 60);
        f۵۹۰c.append(h.ConstraintSet_android_scaleX, 47);
        f۵۹۰c.append(h.ConstraintSet_android_scaleY, 48);
        f۵۹۰c.append(h.ConstraintSet_android_transformPivotX, 49);
        f۵۹۰c.append(h.ConstraintSet_android_transformPivotY, 50);
        f۵۹۰c.append(h.ConstraintSet_android_translationX, 51);
        f۵۹۰c.append(h.ConstraintSet_android_translationY, 52);
        f۵۹۰c.append(h.ConstraintSet_android_translationZ, 53);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintWidth_default, 54);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintHeight_default, 55);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintWidth_max, 56);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintHeight_max, 57);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintWidth_min, 58);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintHeight_min, 59);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintCircle, 61);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintCircleRadius, 62);
        f۵۹۰c.append(h.ConstraintSet_layout_constraintCircleAngle, 63);
        f۵۹۰c.append(h.ConstraintSet_android_id, 38);
    }

    /* access modifiers changed from: private */
    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public float U;
        public boolean V;
        public float W;
        public float X;
        public float Y;
        public float Z;

        /* renamed from: a  reason: collision with root package name */
        boolean f۵۹۲a;
        public float a0;

        /* renamed from: b  reason: collision with root package name */
        public int f۵۹۳b;
        public float b0;

        /* renamed from: c  reason: collision with root package name */
        public int f۵۹۴c;
        public float c0;

        /* renamed from: d  reason: collision with root package name */
        int f۵۹۵d;
        public float d0;

        /* renamed from: e  reason: collision with root package name */
        public int f۵۹۶e;
        public float e0;

        /* renamed from: f  reason: collision with root package name */
        public int f۵۹۷f;
        public float f0;

        /* renamed from: g  reason: collision with root package name */
        public float f۵۹۸g;
        public float g0;

        /* renamed from: h  reason: collision with root package name */
        public int f۵۹۹h;
        public boolean h0;
        public int i;
        public boolean i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public int m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public float q0;
        public int r;
        public int r0;
        public int s;
        public int s0;
        public int t;
        public int[] t0;
        public float u;
        public float v;
        public String w;
        public int x;
        public int y;
        public float z;

        private b() {
            this.f۵۹۲a = false;
            this.f۵۹۶e = -1;
            this.f۵۹۷f = -1;
            this.f۵۹۸g = -1.0f;
            this.f۵۹۹h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.w = null;
            this.x = -1;
            this.y = 0;
            this.z = 0.0f;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = false;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.a0 = 1.0f;
            this.b0 = 1.0f;
            this.c0 = Float.NaN;
            this.d0 = Float.NaN;
            this.e0 = 0.0f;
            this.f0 = 0.0f;
            this.g0 = 0.0f;
            this.h0 = false;
            this.i0 = false;
            this.j0 = 0;
            this.k0 = 0;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = 1.0f;
            this.q0 = 1.0f;
            this.r0 = -1;
            this.s0 = -1;
        }

        public b clone() {
            b clone = new b();
            clone.f۵۹۲a = this.f۵۹۲a;
            clone.f۵۹۳b = this.f۵۹۳b;
            clone.f۵۹۴c = this.f۵۹۴c;
            clone.f۵۹۶e = this.f۵۹۶e;
            clone.f۵۹۷f = this.f۵۹۷f;
            clone.f۵۹۸g = this.f۵۹۸g;
            clone.f۵۹۹h = this.f۵۹۹h;
            clone.i = this.i;
            clone.j = this.j;
            clone.k = this.k;
            clone.l = this.l;
            clone.m = this.m;
            clone.n = this.n;
            clone.o = this.o;
            clone.p = this.p;
            clone.q = this.q;
            clone.r = this.r;
            clone.s = this.s;
            clone.t = this.t;
            clone.u = this.u;
            clone.v = this.v;
            clone.w = this.w;
            clone.A = this.A;
            clone.B = this.B;
            clone.u = this.u;
            clone.u = this.u;
            clone.u = this.u;
            clone.u = this.u;
            clone.u = this.u;
            clone.C = this.C;
            clone.D = this.D;
            clone.E = this.E;
            clone.F = this.F;
            clone.G = this.G;
            clone.H = this.H;
            clone.I = this.I;
            clone.J = this.J;
            clone.K = this.K;
            clone.L = this.L;
            clone.M = this.M;
            clone.N = this.N;
            clone.O = this.O;
            clone.P = this.P;
            clone.Q = this.Q;
            clone.R = this.R;
            clone.S = this.S;
            clone.T = this.T;
            clone.U = this.U;
            clone.V = this.V;
            clone.W = this.W;
            clone.X = this.X;
            clone.Y = this.Y;
            clone.Z = this.Z;
            clone.a0 = this.a0;
            clone.b0 = this.b0;
            clone.c0 = this.c0;
            clone.d0 = this.d0;
            clone.e0 = this.e0;
            clone.f0 = this.f0;
            clone.g0 = this.g0;
            clone.h0 = this.h0;
            clone.i0 = this.i0;
            clone.j0 = this.j0;
            clone.k0 = this.k0;
            clone.l0 = this.l0;
            clone.m0 = this.m0;
            clone.n0 = this.n0;
            clone.o0 = this.o0;
            clone.p0 = this.p0;
            clone.q0 = this.q0;
            clone.r0 = this.r0;
            clone.s0 = this.s0;
            int[] iArr = this.t0;
            if (iArr != null) {
                clone.t0 = Arrays.copyOf(iArr, iArr.length);
            }
            clone.x = this.x;
            clone.y = this.y;
            clone.z = this.z;
            return clone;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void a(b helper, int viewId, d.a param) {
            a(viewId, param);
            if (helper instanceof a) {
                this.s0 = 1;
                a barrier = (a) helper;
                this.r0 = barrier.getType();
                this.t0 = barrier.getReferencedIds();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void a(int viewId, d.a param) {
            a(viewId, (ConstraintLayout.a) param);
            this.U = param.m0;
            this.X = param.p0;
            this.Y = param.q0;
            this.Z = param.r0;
            this.a0 = param.s0;
            this.b0 = param.t0;
            this.c0 = param.u0;
            this.d0 = param.v0;
            this.e0 = param.w0;
            this.f0 = param.x0;
            this.g0 = param.y0;
            this.W = param.o0;
            this.V = param.n0;
        }

        private void a(int viewId, ConstraintLayout.a param) {
            this.f۵۹۵d = viewId;
            this.f۵۹۹h = param.f۵۷۷d;
            this.i = param.f۵۷۸e;
            this.j = param.f۵۷۹f;
            this.k = param.f۵۸۰g;
            this.l = param.f۵۸۱h;
            this.m = param.i;
            this.n = param.j;
            this.o = param.k;
            this.p = param.l;
            this.q = param.p;
            this.r = param.q;
            this.s = param.r;
            this.t = param.s;
            this.u = param.z;
            this.v = param.A;
            this.w = param.B;
            this.x = param.m;
            this.y = param.n;
            this.z = param.o;
            this.A = param.P;
            this.B = param.Q;
            this.C = param.R;
            this.f۵۹۸g = param.f۵۷۶c;
            this.f۵۹۶e = param.f۵۷۴a;
            this.f۵۹۷f = param.f۵۷۵b;
            this.f۵۹۳b = ((ViewGroup.MarginLayoutParams) param).width;
            this.f۵۹۴c = ((ViewGroup.MarginLayoutParams) param).height;
            this.D = ((ViewGroup.MarginLayoutParams) param).leftMargin;
            this.E = ((ViewGroup.MarginLayoutParams) param).rightMargin;
            this.F = ((ViewGroup.MarginLayoutParams) param).topMargin;
            this.G = ((ViewGroup.MarginLayoutParams) param).bottomMargin;
            this.Q = param.E;
            this.R = param.D;
            this.T = param.G;
            this.S = param.F;
            boolean z2 = param.S;
            this.h0 = z2;
            this.i0 = param.T;
            this.j0 = param.H;
            this.k0 = param.I;
            this.h0 = z2;
            this.l0 = param.L;
            this.m0 = param.M;
            this.n0 = param.J;
            this.o0 = param.K;
            this.p0 = param.N;
            this.q0 = param.O;
            if (Build.VERSION.SDK_INT >= 17) {
                this.H = param.getMarginEnd();
                this.I = param.getMarginStart();
            }
        }

        public void a(ConstraintLayout.a param) {
            param.f۵۷۷d = this.f۵۹۹h;
            param.f۵۷۸e = this.i;
            param.f۵۷۹f = this.j;
            param.f۵۸۰g = this.k;
            param.f۵۸۱h = this.l;
            param.i = this.m;
            param.j = this.n;
            param.k = this.o;
            param.l = this.p;
            param.p = this.q;
            param.q = this.r;
            param.r = this.s;
            param.s = this.t;
            ((ViewGroup.MarginLayoutParams) param).leftMargin = this.D;
            ((ViewGroup.MarginLayoutParams) param).rightMargin = this.E;
            ((ViewGroup.MarginLayoutParams) param).topMargin = this.F;
            ((ViewGroup.MarginLayoutParams) param).bottomMargin = this.G;
            param.x = this.P;
            param.y = this.O;
            param.z = this.u;
            param.A = this.v;
            param.m = this.x;
            param.n = this.y;
            param.o = this.z;
            param.B = this.w;
            param.P = this.A;
            param.Q = this.B;
            param.E = this.Q;
            param.D = this.R;
            param.G = this.T;
            param.F = this.S;
            param.S = this.h0;
            param.T = this.i0;
            param.H = this.j0;
            param.I = this.k0;
            param.L = this.l0;
            param.M = this.m0;
            param.J = this.n0;
            param.K = this.o0;
            param.N = this.p0;
            param.O = this.q0;
            param.R = this.C;
            param.f۵۷۶c = this.f۵۹۸g;
            param.f۵۷۴a = this.f۵۹۶e;
            param.f۵۷۵b = this.f۵۹۷f;
            ((ViewGroup.MarginLayoutParams) param).width = this.f۵۹۳b;
            ((ViewGroup.MarginLayoutParams) param).height = this.f۵۹۴c;
            if (Build.VERSION.SDK_INT >= 17) {
                param.setMarginStart(this.I);
                param.setMarginEnd(this.H);
            }
            param.a();
        }
    }

    public void a(d constraints) {
        int count = constraints.getChildCount();
        this.f۵۹۱a.clear();
        for (int i = 0; i < count; i++) {
            View view = constraints.getChildAt(i);
            d.a param = (d.a) view.getLayoutParams();
            int id = view.getId();
            if (id != -1) {
                if (!this.f۵۹۱a.containsKey(Integer.valueOf(id))) {
                    this.f۵۹۱a.put(Integer.valueOf(id), new b());
                }
                b constraint = this.f۵۹۱a.get(Integer.valueOf(id));
                if (view instanceof b) {
                    constraint.a((b) ((b) view), (b) id, (int) param);
                }
                constraint.a((b) id, (int) param);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ConstraintLayout constraintLayout) {
        int count = constraintLayout.getChildCount();
        HashSet<Integer> used = new HashSet<>(this.f۵۹۱a.keySet());
        for (int i = 0; i < count; i++) {
            View view = constraintLayout.getChildAt(i);
            int id = view.getId();
            if (id != -1) {
                if (this.f۵۹۱a.containsKey(Integer.valueOf(id))) {
                    used.remove(Integer.valueOf(id));
                    b constraint = this.f۵۹۱a.get(Integer.valueOf(id));
                    int i2 = constraint.s0;
                    if (i2 != -1 && i2 == 1) {
                        a barrier = (a) view;
                        barrier.setId(id);
                        barrier.setReferencedIds(constraint.t0);
                        barrier.setType(constraint.r0);
                        constraint.a(constraintLayout.generateDefaultLayoutParams());
                    }
                    ConstraintLayout.a param = (ConstraintLayout.a) view.getLayoutParams();
                    constraint.a(param);
                    view.setLayoutParams(param);
                    view.setVisibility(constraint.J);
                    if (Build.VERSION.SDK_INT >= 17) {
                        view.setAlpha(constraint.U);
                        view.setRotation(constraint.X);
                        view.setRotationX(constraint.Y);
                        view.setRotationY(constraint.Z);
                        view.setScaleX(constraint.a0);
                        view.setScaleY(constraint.b0);
                        if (!Float.isNaN(constraint.c0)) {
                            view.setPivotX(constraint.c0);
                        }
                        if (!Float.isNaN(constraint.d0)) {
                            view.setPivotY(constraint.d0);
                        }
                        view.setTranslationX(constraint.e0);
                        view.setTranslationY(constraint.f0);
                        if (Build.VERSION.SDK_INT >= 21) {
                            view.setTranslationZ(constraint.g0);
                            if (constraint.V) {
                                view.setElevation(constraint.W);
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
            b constraint2 = this.f۵۹۱a.get(id2);
            int i3 = constraint2.s0;
            if (i3 != -1 && i3 == 1) {
                a barrier2 = new a(constraintLayout.getContext());
                barrier2.setId(id2.intValue());
                barrier2.setReferencedIds(constraint2.t0);
                barrier2.setType(constraint2.r0);
                ConstraintLayout.a param2 = constraintLayout.generateDefaultLayoutParams();
                constraint2.a(param2);
                constraintLayout.addView(barrier2, param2);
            }
            if (constraint2.f۵۹۲a) {
                e g2 = new e(constraintLayout.getContext());
                g2.setId(id2.intValue());
                ConstraintLayout.a param3 = constraintLayout.generateDefaultLayoutParams();
                constraint2.a(param3);
                constraintLayout.addView(g2, param3);
            }
        }
    }

    public void a(Context context, int resourceId) {
        XmlPullParser parser = context.getResources().getXml(resourceId);
        try {
            for (int eventType = parser.getEventType(); eventType != 1; eventType = parser.next()) {
                if (eventType == 0) {
                    parser.getName();
                } else if (eventType == 2) {
                    String tagName = parser.getName();
                    b constraint = a(context, Xml.asAttributeSet(parser));
                    if (tagName.equalsIgnoreCase("Guideline")) {
                        constraint.f۵۹۲a = true;
                    }
                    this.f۵۹۱a.put(Integer.valueOf(constraint.f۵۹۵d), constraint);
                } else if (eventType != 3) {
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    private static int a(TypedArray a2, int index, int def) {
        int ret = a2.getResourceId(index, def);
        if (ret == -1) {
            return a2.getInt(index, -1);
        }
        return ret;
    }

    private b a(Context context, AttributeSet attrs) {
        b c2 = new b();
        TypedArray a2 = context.obtainStyledAttributes(attrs, h.ConstraintSet);
        a(c2, a2);
        a2.recycle();
        return c2;
    }

    private void a(b c2, TypedArray a2) {
        int N = a2.getIndexCount();
        for (int i = 0; i < N; i++) {
            int attr = a2.getIndex(i);
            int i2 = f۵۹۰c.get(attr);
            switch (i2) {
                case 1:
                    c2.p = a(a2, attr, c2.p);
                    break;
                case 2:
                    c2.G = a2.getDimensionPixelSize(attr, c2.G);
                    break;
                case 3:
                    c2.o = a(a2, attr, c2.o);
                    break;
                case 4:
                    c2.n = a(a2, attr, c2.n);
                    break;
                case 5:
                    c2.w = a2.getString(attr);
                    break;
                case 6:
                    c2.A = a2.getDimensionPixelOffset(attr, c2.A);
                    break;
                case 7:
                    c2.B = a2.getDimensionPixelOffset(attr, c2.B);
                    break;
                case 8:
                    c2.H = a2.getDimensionPixelSize(attr, c2.H);
                    break;
                case 9:
                    c2.t = a(a2, attr, c2.t);
                    break;
                case 10:
                    c2.s = a(a2, attr, c2.s);
                    break;
                case 11:
                    c2.N = a2.getDimensionPixelSize(attr, c2.N);
                    break;
                case 12:
                    c2.O = a2.getDimensionPixelSize(attr, c2.O);
                    break;
                case 13:
                    c2.K = a2.getDimensionPixelSize(attr, c2.K);
                    break;
                case 14:
                    c2.M = a2.getDimensionPixelSize(attr, c2.M);
                    break;
                case 15:
                    c2.P = a2.getDimensionPixelSize(attr, c2.P);
                    break;
                case 16:
                    c2.L = a2.getDimensionPixelSize(attr, c2.L);
                    break;
                case 17:
                    c2.f۵۹۶e = a2.getDimensionPixelOffset(attr, c2.f۵۹۶e);
                    break;
                case 18:
                    c2.f۵۹۷f = a2.getDimensionPixelOffset(attr, c2.f۵۹۷f);
                    break;
                case 19:
                    c2.f۵۹۸g = a2.getFloat(attr, c2.f۵۹۸g);
                    break;
                case 20:
                    c2.u = a2.getFloat(attr, c2.u);
                    break;
                case 21:
                    c2.f۵۹۴c = a2.getLayoutDimension(attr, c2.f۵۹۴c);
                    break;
                case 22:
                    c2.J = a2.getInt(attr, c2.J);
                    c2.J = f۵۸۹b[c2.J];
                    break;
                case 23:
                    c2.f۵۹۳b = a2.getLayoutDimension(attr, c2.f۵۹۳b);
                    break;
                case 24:
                    c2.D = a2.getDimensionPixelSize(attr, c2.D);
                    break;
                case 25:
                    c2.f۵۹۹h = a(a2, attr, c2.f۵۹۹h);
                    break;
                case 26:
                    c2.i = a(a2, attr, c2.i);
                    break;
                case 27:
                    c2.C = a2.getInt(attr, c2.C);
                    break;
                case 28:
                    c2.E = a2.getDimensionPixelSize(attr, c2.E);
                    break;
                case 29:
                    c2.j = a(a2, attr, c2.j);
                    break;
                case 30:
                    c2.k = a(a2, attr, c2.k);
                    break;
                case 31:
                    c2.I = a2.getDimensionPixelSize(attr, c2.I);
                    break;
                case 32:
                    c2.q = a(a2, attr, c2.q);
                    break;
                case 33:
                    c2.r = a(a2, attr, c2.r);
                    break;
                case 34:
                    c2.F = a2.getDimensionPixelSize(attr, c2.F);
                    break;
                case 35:
                    c2.m = a(a2, attr, c2.m);
                    break;
                case 36:
                    c2.l = a(a2, attr, c2.l);
                    break;
                case 37:
                    c2.v = a2.getFloat(attr, c2.v);
                    break;
                case 38:
                    c2.f۵۹۵d = a2.getResourceId(attr, c2.f۵۹۵d);
                    break;
                case 39:
                    c2.R = a2.getFloat(attr, c2.R);
                    break;
                case 40:
                    c2.Q = a2.getFloat(attr, c2.Q);
                    break;
                case 41:
                    c2.S = a2.getInt(attr, c2.S);
                    break;
                case 42:
                    c2.T = a2.getInt(attr, c2.T);
                    break;
                case 43:
                    c2.U = a2.getFloat(attr, c2.U);
                    break;
                case 44:
                    c2.V = true;
                    c2.W = a2.getDimension(attr, c2.W);
                    break;
                case 45:
                    c2.Y = a2.getFloat(attr, c2.Y);
                    break;
                case 46:
                    c2.Z = a2.getFloat(attr, c2.Z);
                    break;
                case 47:
                    c2.a0 = a2.getFloat(attr, c2.a0);
                    break;
                case 48:
                    c2.b0 = a2.getFloat(attr, c2.b0);
                    break;
                case 49:
                    c2.c0 = a2.getFloat(attr, c2.c0);
                    break;
                case 50:
                    c2.d0 = a2.getFloat(attr, c2.d0);
                    break;
                case 51:
                    c2.e0 = a2.getDimension(attr, c2.e0);
                    break;
                case 52:
                    c2.f0 = a2.getDimension(attr, c2.f0);
                    break;
                case 53:
                    c2.g0 = a2.getDimension(attr, c2.g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            c2.X = a2.getFloat(attr, c2.X);
                            continue;
                        case 61:
                            c2.x = a(a2, attr, c2.x);
                            continue;
                        case 62:
                            c2.y = a2.getDimensionPixelSize(attr, c2.y);
                            continue;
                        case 63:
                            c2.z = a2.getFloat(attr, c2.z);
                            continue;
                        case 64:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(attr) + "   " + f۵۹۰c.get(attr));
                            continue;
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(attr) + "   " + f۵۹۰c.get(attr));
                            continue;
                    }
            }
        }
    }
}
