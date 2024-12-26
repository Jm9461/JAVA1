package p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.p۲۰۲e.Cg;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a.Cc;
import p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a.Ci;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cf;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Co;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ce;

/* renamed from: a.b.h.d.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends Ce {

    /* renamed from: q, reason: contains not printable characters */
    private c f۸۷۹۸q;

    /* renamed from: r, reason: contains not printable characters */
    private g f۸۷۹۹r;

    /* renamed from: s, reason: contains not printable characters */
    private int f۸۸۰۰s;

    /* renamed from: t, reason: contains not printable characters */
    private int f۸۸۰۱t;

    /* renamed from: u, reason: contains not printable characters */
    private boolean f۸۸۰۲u;

    static {
        Ca.class.getSimpleName();
    }

    public Ca() {
        this(null, null);
    }

    Ca(c state, Resources res) {
        super(null);
        this.f۸۸۰۰s = -1;
        this.f۸۸۰۱t = -1;
        c newState = new c(state, this, res);
        mo۸۶۸۹a(newState);
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: b, reason: contains not printable characters */
    public static Ca m۸۶۰۸b(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        String name = parser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(parser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        Ca asl = new Ca();
        asl.m۸۶۱۸a(context, resources, parser, attrs, theme);
        return asl;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۶۱۸a(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        TypedArray a2 = Cg.m۱۰۶۲۱a(resources, theme, attrs, Cj.AnimatedStateListDrawableCompat);
        setVisible(a2.getBoolean(Cj.AnimatedStateListDrawableCompat_android_visible, true), true);
        m۸۶۰۷a(a2);
        m۸۶۴۷a(resources);
        a2.recycle();
        m۸۶۱۱c(context, resources, parser, attrs, theme);
        m۸۶۱۰c();
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb, android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        boolean changed = super.setVisible(visible, restart);
        if (this.f۸۷۹۹r != null && (changed || restart)) {
            if (visible) {
                this.f۸۷۹۹r.mo۸۶۴۰c();
            } else {
                jumpToCurrentState();
            }
        }
        return changed;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ce, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f۸۷۹۹r;
        if (gVar != null) {
            gVar.mo۸۶۴۱d();
            this.f۸۷۹۹r = null;
            m۸۶۴۹a(this.f۸۸۰۰s);
            this.f۸۸۰۰s = -1;
            this.f۸۸۰۱t = -1;
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ce, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] stateSet) {
        int targetIndex = this.f۸۷۹۸q.m۸۶۲۴b(stateSet);
        boolean changed = targetIndex != m۸۶۵۰b() && (m۸۶۰۹b(targetIndex) || m۸۶۴۹a(targetIndex));
        Drawable current = getCurrent();
        if (current != null) {
            return changed | current.setState(stateSet);
        }
        return changed;
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۸۶۰۹b(int toIndex) {
        int fromIndex;
        int transitionIndex;
        g transition;
        g currentTransition = this.f۸۷۹۹r;
        if (currentTransition != null) {
            if (toIndex == this.f۸۸۰۰s) {
                return true;
            }
            if (toIndex == this.f۸۸۰۱t && currentTransition.mo۸۶۳۸a()) {
                currentTransition.mo۸۶۳۹b();
                this.f۸۸۰۰s = this.f۸۸۰۱t;
                this.f۸۸۰۱t = toIndex;
                return true;
            }
            fromIndex = this.f۸۸۰۰s;
            currentTransition.mo۸۶۴۱d();
        } else {
            fromIndex = m۸۶۵۰b();
        }
        this.f۸۷۹۹r = null;
        this.f۸۸۰۱t = -1;
        this.f۸۸۰۰s = -1;
        c state = this.f۸۷۹۸q;
        int fromId = state.m۸۶۲۶d(fromIndex);
        int toId = state.m۸۶۲۶d(toIndex);
        if (toId == 0 || fromId == 0 || (transitionIndex = state.m۸۶۲۵c(fromId, toId)) < 0) {
            return false;
        }
        boolean hasReversibleFlag = state.m۸۶۲۸e(fromId, toId);
        m۸۶۴۹a(transitionIndex);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            boolean reversed = state.m۸۶۲۷d(fromId, toId);
            transition = new e((AnimationDrawable) current, reversed, hasReversibleFlag);
        } else if (current instanceof Cc) {
            transition = new d((Cc) current);
        } else {
            if (!(current instanceof Animatable)) {
                return false;
            }
            transition = new b((Animatable) current);
        }
        transition.mo۸۶۴۰c();
        this.f۸۷۹۹r = transition;
        this.f۸۸۰۱t = fromIndex;
        this.f۸۸۰۰s = toIndex;
        return true;
    }

    /* renamed from: a.b.h.d.a.a$g */
    private static abstract class g {
        /* renamed from: c, reason: contains not printable characters */
        public abstract void mo۸۶۴۰c();

        /* renamed from: d, reason: contains not printable characters */
        public abstract void mo۸۶۴۱d();

        private g() {
        }

        /* renamed from: b, reason: contains not printable characters */
        public void mo۸۶۳۹b() {
        }

        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۸۶۳۸a() {
            return false;
        }
    }

    /* renamed from: a.b.h.d.a.a$b */
    private static class b extends g {

        /* renamed from: a, reason: contains not printable characters */
        private final Animatable f۸۸۰۳a;

        b(Animatable a2) {
            super();
            this.f۸۸۰۳a = a2;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ca.g
        /* renamed from: c, reason: contains not printable characters */
        public void mo۸۶۴۰c() {
            this.f۸۸۰۳a.start();
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ca.g
        /* renamed from: d, reason: contains not printable characters */
        public void mo۸۶۴۱d() {
            this.f۸۸۰۳a.stop();
        }
    }

    /* renamed from: a.b.h.d.a.a$e */
    private static class e extends g {

        /* renamed from: a, reason: contains not printable characters */
        private final ObjectAnimator f۸۸۰۷a;

        /* renamed from: b, reason: contains not printable characters */
        private final boolean f۸۸۰۸b;

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
            anim.setDuration(interp.m۸۶۳۶a());
            anim.setInterpolator(interp);
            this.f۸۸۰۸b = hasReversibleFlag;
            this.f۸۸۰۷a = anim;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ca.g
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۸۶۳۸a() {
            return this.f۸۸۰۸b;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ca.g
        /* renamed from: c, reason: contains not printable characters */
        public void mo۸۶۴۰c() {
            this.f۸۸۰۷a.start();
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ca.g
        /* renamed from: b, reason: contains not printable characters */
        public void mo۸۶۳۹b() {
            this.f۸۸۰۷a.reverse();
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ca.g
        /* renamed from: d, reason: contains not printable characters */
        public void mo۸۶۴۱d() {
            this.f۸۸۰۷a.cancel();
        }
    }

    /* renamed from: a.b.h.d.a.a$d */
    private static class d extends g {

        /* renamed from: a, reason: contains not printable characters */
        private final Cc f۸۸۰۶a;

        d(Cc avd) {
            super();
            this.f۸۸۰۶a = avd;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ca.g
        /* renamed from: c, reason: contains not printable characters */
        public void mo۸۶۴۰c() {
            this.f۸۸۰۶a.start();
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ca.g
        /* renamed from: d, reason: contains not printable characters */
        public void mo۸۶۴۱d() {
            this.f۸۸۰۶a.stop();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۸۶۰۷a(TypedArray a2) {
        c state = this.f۸۷۹۸q;
        if (Build.VERSION.SDK_INT >= 21) {
            state.f۸۸۳۸d |= a2.getChangingConfigurations();
        }
        state.m۸۶۶۴b(a2.getBoolean(Cj.AnimatedStateListDrawableCompat_android_variablePadding, state.f۸۸۴۳i));
        state.m۸۶۶۰a(a2.getBoolean(Cj.AnimatedStateListDrawableCompat_android_constantSize, state.f۸۸۴۶l));
        state.m۸۶۶۳b(a2.getInt(Cj.AnimatedStateListDrawableCompat_android_enterFadeDuration, state.f۸۸۲۶A));
        state.m۸۶۶۷c(a2.getInt(Cj.AnimatedStateListDrawableCompat_android_exitFadeDuration, state.f۸۸۲۷B));
        setDither(a2.getBoolean(Cj.AnimatedStateListDrawableCompat_android_dither, state.f۸۸۵۸x));
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۸۶۱۰c() {
        onStateChange(getState());
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۸۶۱۱c(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int innerDepth = parser.getDepth() + 1;
        while (true) {
            int type = parser.next();
            if (type != 1) {
                int depth = parser.getDepth();
                if (depth >= innerDepth || type != 3) {
                    if (type == 2 && depth <= innerDepth) {
                        if (parser.getName().equals("item")) {
                            m۸۶۱۲d(context, resources, parser, attrs, theme);
                        } else if (parser.getName().equals("transition")) {
                            m۸۶۱۳e(context, resources, parser, attrs, theme);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    private int m۸۶۱۳e(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int type;
        TypedArray a2 = Cg.m۱۰۶۲۱a(resources, theme, attrs, Cj.AnimatedStateListDrawableTransition);
        int fromId = a2.getResourceId(Cj.AnimatedStateListDrawableTransition_android_fromId, -1);
        int toId = a2.getResourceId(Cj.AnimatedStateListDrawableTransition_android_toId, -1);
        Drawable dr = null;
        int drawableId = a2.getResourceId(Cj.AnimatedStateListDrawableTransition_android_drawable, -1);
        if (drawableId > 0) {
            dr = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۴c(context, drawableId);
        }
        boolean reversible = a2.getBoolean(Cj.AnimatedStateListDrawableTransition_android_reversible, false);
        a2.recycle();
        if (dr == null) {
            do {
                type = parser.next();
            } while (type == 4);
            if (type != 2) {
                throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            if (parser.getName().equals("animated-vector")) {
                dr = Cc.m۷۹۶۹a(context, resources, parser, attrs, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                dr = Drawable.createFromXmlInner(resources, parser, attrs, theme);
            } else {
                dr = Drawable.createFromXmlInner(resources, parser, attrs);
            }
        }
        if (dr == null) {
            throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (fromId == -1 || toId == -1) {
            throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
        return this.f۸۷۹۸q.m۸۶۲۲a(fromId, toId, dr, reversible);
    }

    /* renamed from: d, reason: contains not printable characters */
    private int m۸۶۱۲d(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int type;
        TypedArray a2 = Cg.m۱۰۶۲۱a(resources, theme, attrs, Cj.AnimatedStateListDrawableItem);
        int keyframeId = a2.getResourceId(Cj.AnimatedStateListDrawableItem_android_id, 0);
        Drawable dr = null;
        int drawableId = a2.getResourceId(Cj.AnimatedStateListDrawableItem_android_drawable, -1);
        if (drawableId > 0) {
            dr = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۴c(context, drawableId);
        }
        a2.recycle();
        int[] states = m۸۶۹۰a(attrs);
        if (dr == null) {
            do {
                type = parser.next();
            } while (type == 4);
            if (type != 2) {
                throw new XmlPullParserException(parser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            if (parser.getName().equals("vector")) {
                dr = Ci.createFromXmlInner(resources, parser, attrs, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                dr = Drawable.createFromXmlInner(resources, parser, attrs, theme);
            } else {
                dr = Drawable.createFromXmlInner(resources, parser, attrs);
            }
        }
        if (dr == null) {
            throw new XmlPullParserException(parser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        return this.f۸۷۹۸q.m۸۶۲۳a(states, dr, keyframeId);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ce, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f۸۸۰۲u) {
            super.mutate();
            if (this == this) {
                this.f۸۷۹۸q.mo۸۶۹۴m();
                this.f۸۸۰۲u = true;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ce, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb
    /* renamed from: a, reason: contains not printable characters */
    public c mo۸۶۸۸a() {
        return new c(this.f۸۷۹۸q, this, null);
    }

    /* renamed from: a.b.h.d.a.a$c */
    static class c extends Ce.a {

        /* renamed from: K, reason: contains not printable characters */
        Cf<Long> f۸۸۰۴K;

        /* renamed from: L, reason: contains not printable characters */
        Co<Integer> f۸۸۰۵L;

        c(c orig, Ca owner, Resources res) {
            super(orig, owner, res);
            if (orig != null) {
                this.f۸۸۰۴K = orig.f۸۸۰۴K;
                this.f۸۸۰۵L = orig.f۸۸۰۵L;
            } else {
                this.f۸۸۰۴K = new Cf<>();
                this.f۸۸۰۵L = new Co<>();
            }
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ce.a, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb.c
        /* renamed from: m, reason: contains not printable characters */
        void mo۸۶۹۴m() {
            this.f۸۸۰۴K = this.f۸۸۰۴K.m۸۵۳۵clone();
            this.f۸۸۰۵L = this.f۸۸۰۵L.m۸۵۹۹clone();
        }

        /* renamed from: a, reason: contains not printable characters */
        int m۸۶۲۲a(int fromId, int toId, Drawable anim, boolean reversible) {
            int pos = super.m۸۶۵۵a(anim);
            long keyFromTo = m۸۶۲۱f(fromId, toId);
            long reversibleBit = 0;
            if (reversible) {
                reversibleBit = 8589934592L;
            }
            this.f۸۸۰۴K.m۸۵۲۷a(keyFromTo, Long.valueOf(pos | reversibleBit));
            if (reversible) {
                long keyToFrom = m۸۶۲۱f(toId, fromId);
                this.f۸۸۰۴K.m۸۵۲۷a(keyToFrom, Long.valueOf(pos | 4294967296L | reversibleBit));
            }
            return pos;
        }

        /* renamed from: a, reason: contains not printable characters */
        int m۸۶۲۳a(int[] stateSet, Drawable drawable, int id) {
            int index = super.m۸۶۹۲a(stateSet, drawable);
            this.f۸۸۰۵L.m۸۵۹۵c(index, Integer.valueOf(id));
            return index;
        }

        /* renamed from: b, reason: contains not printable characters */
        int m۸۶۲۴b(int[] stateSet) {
            int index = super.m۸۶۹۱a(stateSet);
            if (index >= 0) {
                return index;
            }
            return super.m۸۶۹۱a(StateSet.WILD_CARD);
        }

        /* renamed from: d, reason: contains not printable characters */
        int m۸۶۲۶d(int index) {
            if (index < 0) {
                return 0;
            }
            return this.f۸۸۰۵L.m۸۵۹۳b(index, 0).intValue();
        }

        /* renamed from: c, reason: contains not printable characters */
        int m۸۶۲۵c(int fromId, int toId) {
            long keyFromTo = m۸۶۲۱f(fromId, toId);
            return (int) this.f۸۸۰۴K.m۸۵۳۰b(keyFromTo, -1L).longValue();
        }

        /* renamed from: d, reason: contains not printable characters */
        boolean m۸۶۲۷d(int fromId, int toId) {
            long keyFromTo = m۸۶۲۱f(fromId, toId);
            return (this.f۸۸۰۴K.m۸۵۳۰b(keyFromTo, -1L).longValue() & 4294967296L) != 0;
        }

        /* renamed from: e, reason: contains not printable characters */
        boolean m۸۶۲۸e(int fromId, int toId) {
            long keyFromTo = m۸۶۲۱f(fromId, toId);
            return (this.f۸۸۰۴K.m۸۵۳۰b(keyFromTo, -1L).longValue() & 8589934592L) != 0;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ce.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new Ca(this, null);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ce.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources res) {
            return new Ca(this, res);
        }

        /* renamed from: f, reason: contains not printable characters */
        private static long m۸۶۲۱f(int fromId, int toId) {
            return (fromId << 32) | toId;
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ce, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb
    /* renamed from: a, reason: contains not printable characters */
    protected void mo۸۶۸۹a(Cb.c state) {
        super.mo۸۶۸۹a(state);
        if (state instanceof c) {
            this.f۸۷۹۸q = (c) state;
        }
    }

    /* renamed from: a.b.h.d.a.a$f */
    private static class f implements TimeInterpolator {

        /* renamed from: a, reason: contains not printable characters */
        private int[] f۸۸۰۹a;

        /* renamed from: b, reason: contains not printable characters */
        private int f۸۸۱۰b;

        /* renamed from: c, reason: contains not printable characters */
        private int f۸۸۱۱c;

        f(AnimationDrawable d2, boolean reversed) {
            m۸۶۳۷a(d2, reversed);
        }

        /* renamed from: a, reason: contains not printable characters */
        int m۸۶۳۷a(AnimationDrawable d2, boolean reversed) {
            int frameCount = d2.getNumberOfFrames();
            this.f۸۸۱۰b = frameCount;
            int[] iArr = this.f۸۸۰۹a;
            if (iArr == null || iArr.length < frameCount) {
                this.f۸۸۰۹a = new int[frameCount];
            }
            int[] frameTimes = this.f۸۸۰۹a;
            int totalDuration = 0;
            for (int i = 0; i < frameCount; i++) {
                int duration = d2.getDuration(reversed ? (frameCount - i) - 1 : i);
                frameTimes[i] = duration;
                totalDuration += duration;
            }
            this.f۸۸۱۱c = totalDuration;
            return totalDuration;
        }

        /* renamed from: a, reason: contains not printable characters */
        int m۸۶۳۶a() {
            return this.f۸۸۱۱c;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float input) {
            float frameElapsed;
            int elapsed = (int) ((this.f۸۸۱۱c * input) + 0.5f);
            int frameCount = this.f۸۸۱۰b;
            int[] frameTimes = this.f۸۸۰۹a;
            int remaining = elapsed;
            int i = 0;
            while (i < frameCount && remaining >= frameTimes[i]) {
                remaining -= frameTimes[i];
                i++;
            }
            if (i < frameCount) {
                frameElapsed = remaining / this.f۸۸۱۱c;
            } else {
                frameElapsed = 0.0f;
            }
            return (i / frameCount) + frameElapsed;
        }
    }
}
