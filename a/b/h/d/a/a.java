package a.b.h.d.a;

import a.b.d.a.i;
import a.b.g.g.o;
import a.b.h.a.j;
import a.b.h.d.a.b;
import a.b.h.d.a.e;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class a extends e {
    private c q;
    private g r;
    private int s;
    private int t;
    private boolean u;

    static {
        a.class.getSimpleName();
    }

    public a() {
        this(null, null);
    }

    a(c state, Resources res) {
        super(null);
        this.s = -1;
        this.t = -1;
        a(new c(state, this, res));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static a b(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        String name = parser.getName();
        if (name.equals("animated-selector")) {
            a asl = new a();
            asl.a(context, resources, parser, attrs, theme);
            return asl;
        }
        throw new XmlPullParserException(parser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    public void a(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        TypedArray a2 = android.support.v4.content.e.g.a(resources, theme, attrs, j.AnimatedStateListDrawableCompat);
        setVisible(a2.getBoolean(j.AnimatedStateListDrawableCompat_android_visible, true), true);
        a(a2);
        a(resources);
        a2.recycle();
        c(context, resources, parser, attrs, theme);
        c();
    }

    @Override // a.b.h.d.a.b
    public boolean setVisible(boolean visible, boolean restart) {
        boolean changed = super.setVisible(visible, restart);
        if (this.r != null && (changed || restart)) {
            if (visible) {
                this.r.c();
            } else {
                jumpToCurrentState();
            }
        }
        return changed;
    }

    @Override // a.b.h.d.a.e
    public boolean isStateful() {
        return true;
    }

    @Override // a.b.h.d.a.b
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.r;
        if (gVar != null) {
            gVar.d();
            this.r = null;
            a(this.s);
            this.s = -1;
            this.t = -1;
        }
    }

    /* access modifiers changed from: protected */
    @Override // a.b.h.d.a.b, a.b.h.d.a.e
    public boolean onStateChange(int[] stateSet) {
        int targetIndex = this.q.b(stateSet);
        boolean changed = targetIndex != b() && (b(targetIndex) || a(targetIndex));
        Drawable current = getCurrent();
        if (current != null) {
            return changed | current.setState(stateSet);
        }
        return changed;
    }

    private boolean b(int toIndex) {
        int fromIndex;
        int transitionIndex;
        g transition;
        g currentTransition = this.r;
        if (currentTransition == null) {
            fromIndex = b();
        } else if (toIndex == this.s) {
            return true;
        } else {
            if (toIndex != this.t || !currentTransition.a()) {
                fromIndex = this.s;
                currentTransition.d();
            } else {
                currentTransition.b();
                this.s = this.t;
                this.t = toIndex;
                return true;
            }
        }
        this.r = null;
        this.t = -1;
        this.s = -1;
        c state = this.q;
        int fromId = state.d(fromIndex);
        int toId = state.d(toIndex);
        if (toId == 0 || fromId == 0 || (transitionIndex = state.c(fromId, toId)) < 0) {
            return false;
        }
        boolean hasReversibleFlag = state.e(fromId, toId);
        a(transitionIndex);
        Drawable d2 = getCurrent();
        if (d2 instanceof AnimationDrawable) {
            transition = new e((AnimationDrawable) d2, state.d(fromId, toId), hasReversibleFlag);
        } else if (d2 instanceof a.b.d.a.c) {
            transition = new d((a.b.d.a.c) d2);
        } else if (!(d2 instanceof Animatable)) {
            return false;
        } else {
            transition = new b((Animatable) d2);
        }
        transition.c();
        this.r = transition;
        this.t = fromIndex;
        this.s = toIndex;
        return true;
    }

    /* access modifiers changed from: private */
    public static abstract class g {
        public abstract void c();

        public abstract void d();

        private g() {
        }

        public void b() {
        }

        public boolean a() {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable f۴۲۹a;

        b(Animatable a2) {
            super();
            this.f۴۲۹a = a2;
        }

        @Override // a.b.h.d.a.a.g
        public void c() {
            this.f۴۲۹a.start();
        }

        @Override // a.b.h.d.a.a.g
        public void d() {
            this.f۴۲۹a.stop();
        }
    }

    /* access modifiers changed from: private */
    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        private final ObjectAnimator f۴۳۱a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f۴۳۲b;

        e(AnimationDrawable ad, boolean reversed, boolean hasReversibleFlag) {
            super();
            int frameCount = ad.getNumberOfFrames();
            int fromFrame = reversed ? frameCount - 1 : 0;
            int toFrame = reversed ? 0 : frameCount - 1;
            f interp = new f(ad, reversed);
            ObjectAnimator anim = ObjectAnimator.ofInt(ad, "currentIndex", fromFrame, toFrame);
            if (Build.VERSION.SDK_INT >= 18) {
                anim.setAutoCancel(true);
            }
            anim.setDuration((long) interp.a());
            anim.setInterpolator(interp);
            this.f۴۳۲b = hasReversibleFlag;
            this.f۴۳۱a = anim;
        }

        @Override // a.b.h.d.a.a.g
        public boolean a() {
            return this.f۴۳۲b;
        }

        @Override // a.b.h.d.a.a.g
        public void c() {
            this.f۴۳۱a.start();
        }

        @Override // a.b.h.d.a.a.g
        public void b() {
            this.f۴۳۱a.reverse();
        }

        @Override // a.b.h.d.a.a.g
        public void d() {
            this.f۴۳۱a.cancel();
        }
    }

    /* access modifiers changed from: private */
    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        private final a.b.d.a.c f۴۳۰a;

        d(a.b.d.a.c avd) {
            super();
            this.f۴۳۰a = avd;
        }

        @Override // a.b.h.d.a.a.g
        public void c() {
            this.f۴۳۰a.start();
        }

        @Override // a.b.h.d.a.a.g
        public void d() {
            this.f۴۳۰a.stop();
        }
    }

    private void a(TypedArray a2) {
        c state = this.q;
        if (Build.VERSION.SDK_INT >= 21) {
            state.f۴۴۷d |= a2.getChangingConfigurations();
        }
        state.b(a2.getBoolean(j.AnimatedStateListDrawableCompat_android_variablePadding, state.i));
        state.a(a2.getBoolean(j.AnimatedStateListDrawableCompat_android_constantSize, state.l));
        state.b(a2.getInt(j.AnimatedStateListDrawableCompat_android_enterFadeDuration, state.A));
        state.c(a2.getInt(j.AnimatedStateListDrawableCompat_android_exitFadeDuration, state.B));
        setDither(a2.getBoolean(j.AnimatedStateListDrawableCompat_android_dither, state.x));
    }

    private void c() {
        onStateChange(getState());
    }

    private void c(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int innerDepth = parser.getDepth() + 1;
        while (true) {
            int type = parser.next();
            if (type != 1) {
                int depth = parser.getDepth();
                if (depth < innerDepth && type == 3) {
                    return;
                }
                if (type == 2 && depth <= innerDepth) {
                    if (parser.getName().equals("item")) {
                        d(context, resources, parser, attrs, theme);
                    } else if (parser.getName().equals("transition")) {
                        e(context, resources, parser, attrs, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private int e(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int type;
        TypedArray a2 = android.support.v4.content.e.g.a(resources, theme, attrs, j.AnimatedStateListDrawableTransition);
        int fromId = a2.getResourceId(j.AnimatedStateListDrawableTransition_android_fromId, -1);
        int toId = a2.getResourceId(j.AnimatedStateListDrawableTransition_android_toId, -1);
        Drawable dr = null;
        int drawableId = a2.getResourceId(j.AnimatedStateListDrawableTransition_android_drawable, -1);
        if (drawableId > 0) {
            dr = a.b.h.c.a.a.c(context, drawableId);
        }
        boolean reversible = a2.getBoolean(j.AnimatedStateListDrawableTransition_android_reversible, false);
        a2.recycle();
        if (dr == null) {
            do {
                type = parser.next();
            } while (type == 4);
            if (type != 2) {
                throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (parser.getName().equals("animated-vector")) {
                dr = a.b.d.a.c.a(context, resources, parser, attrs, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                dr = Drawable.createFromXmlInner(resources, parser, attrs, theme);
            } else {
                dr = Drawable.createFromXmlInner(resources, parser, attrs);
            }
        }
        if (dr == null) {
            throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (fromId != -1 && toId != -1) {
            return this.q.a(fromId, toId, dr, reversible);
        } else {
            throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private int d(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int type;
        TypedArray a2 = android.support.v4.content.e.g.a(resources, theme, attrs, j.AnimatedStateListDrawableItem);
        int keyframeId = a2.getResourceId(j.AnimatedStateListDrawableItem_android_id, 0);
        Drawable dr = null;
        int drawableId = a2.getResourceId(j.AnimatedStateListDrawableItem_android_drawable, -1);
        if (drawableId > 0) {
            dr = a.b.h.c.a.a.c(context, drawableId);
        }
        a2.recycle();
        int[] states = a(attrs);
        if (dr == null) {
            do {
                type = parser.next();
            } while (type == 4);
            if (type != 2) {
                throw new XmlPullParserException(parser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (parser.getName().equals("vector")) {
                dr = i.createFromXmlInner(resources, parser, attrs, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                dr = Drawable.createFromXmlInner(resources, parser, attrs, theme);
            } else {
                dr = Drawable.createFromXmlInner(resources, parser, attrs);
            }
        }
        if (dr != null) {
            return this.q.a(states, dr, keyframeId);
        }
        throw new XmlPullParserException(parser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    @Override // a.b.h.d.a.b, a.b.h.d.a.e
    public Drawable mutate() {
        if (!this.u) {
            super.mutate();
            if (this == this) {
                this.q.m();
                this.u = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // a.b.h.d.a.b, a.b.h.d.a.e, a.b.h.d.a.e
    public c a() {
        return new c(this.q, this, null);
    }

    /* access modifiers changed from: package-private */
    public static class c extends e.a {
        a.b.g.g.f<Long> K;
        o<Integer> L;

        c(c orig, a owner, Resources res) {
            super(orig, owner, res);
            if (orig != null) {
                this.K = orig.K;
                this.L = orig.L;
                return;
            }
            this.K = new a.b.g.g.f<>();
            this.L = new o<>();
        }

        /* access modifiers changed from: package-private */
        @Override // a.b.h.d.a.e.a, a.b.h.d.a.b.c
        public void m() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        /* access modifiers changed from: package-private */
        public int a(int fromId, int toId, Drawable anim, boolean reversible) {
            int pos = super.a(anim);
            long keyFromTo = f(fromId, toId);
            long reversibleBit = 0;
            if (reversible) {
                reversibleBit = 8589934592L;
            }
            this.K.a(keyFromTo, Long.valueOf(((long) pos) | reversibleBit));
            if (reversible) {
                this.K.a(f(toId, fromId), Long.valueOf(((long) pos) | 4294967296L | reversibleBit));
            }
            return pos;
        }

        /* access modifiers changed from: package-private */
        public int a(int[] stateSet, Drawable drawable, int id) {
            int index = super.a(stateSet, drawable);
            this.L.c(index, Integer.valueOf(id));
            return index;
        }

        /* access modifiers changed from: package-private */
        public int b(int[] stateSet) {
            int index = super.a(stateSet);
            if (index >= 0) {
                return index;
            }
            return super.a(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        public int d(int index) {
            if (index < 0) {
                return 0;
            }
            return this.L.b(index, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        public int c(int fromId, int toId) {
            return (int) this.K.b(f(fromId, toId), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        public boolean d(int fromId, int toId) {
            return (this.K.b(f(fromId, toId), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean e(int fromId, int toId) {
            return (this.K.b(f(fromId, toId), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // a.b.h.d.a.e.a
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // a.b.h.d.a.e.a
        public Drawable newDrawable(Resources res) {
            return new a(this, res);
        }

        private static long f(int fromId, int toId) {
            return (((long) fromId) << 32) | ((long) toId);
        }
    }

    /* access modifiers changed from: protected */
    @Override // a.b.h.d.a.b, a.b.h.d.a.e
    public void a(b.c state) {
        super.a(state);
        if (state instanceof c) {
            this.q = (c) state;
        }
    }

    private static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        private int[] f۴۳۳a;

        /* renamed from: b  reason: collision with root package name */
        private int f۴۳۴b;

        /* renamed from: c  reason: collision with root package name */
        private int f۴۳۵c;

        f(AnimationDrawable d2, boolean reversed) {
            a(d2, reversed);
        }

        /* access modifiers changed from: package-private */
        public int a(AnimationDrawable d2, boolean reversed) {
            int frameCount = d2.getNumberOfFrames();
            this.f۴۳۴b = frameCount;
            int[] iArr = this.f۴۳۳a;
            if (iArr == null || iArr.length < frameCount) {
                this.f۴۳۳a = new int[frameCount];
            }
            int[] frameTimes = this.f۴۳۳a;
            int totalDuration = 0;
            for (int i = 0; i < frameCount; i++) {
                int duration = d2.getDuration(reversed ? (frameCount - i) - 1 : i);
                frameTimes[i] = duration;
                totalDuration += duration;
            }
            this.f۴۳۵c = totalDuration;
            return totalDuration;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f۴۳۵c;
        }

        public float getInterpolation(float input) {
            float frameElapsed;
            int frameCount = this.f۴۳۴b;
            int[] frameTimes = this.f۴۳۳a;
            int remaining = (int) ((((float) this.f۴۳۵c) * input) + 0.5f);
            int i = 0;
            while (i < frameCount && remaining >= frameTimes[i]) {
                remaining -= frameTimes[i];
                i++;
            }
            if (i < frameCount) {
                frameElapsed = ((float) remaining) / ((float) this.f۴۳۵c);
            } else {
                frameElapsed = 0.0f;
            }
            return (((float) i) / ((float) frameCount)) + frameElapsed;
        }
    }
}
