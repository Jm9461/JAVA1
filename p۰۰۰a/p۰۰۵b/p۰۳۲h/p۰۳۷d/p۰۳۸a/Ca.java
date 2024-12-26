package p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p۰۴۳v4.content.p۰۴۴e.Cg;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Ci;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Co;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ce;

/* renamed from: a.b.h.d.a.a  reason: invalid class name */
public class Ca extends Ce {

    /* renamed from: q  reason: contains not printable characters */
    private Cc f۸۷۹۸q;

    /* renamed from: r  reason: contains not printable characters */
    private AbstractCg f۸۷۹۹r;

    /* renamed from: s  reason: contains not printable characters */
    private int f۸۸۰۰s;

    /* renamed from: t  reason: contains not printable characters */
    private int f۸۸۰۱t;

    /* renamed from: u  reason: contains not printable characters */
    private boolean f۸۸۰۲u;

    static {
        Ca.class.getSimpleName();
    }

    public Ca() {
        this(null, null);
    }

    Ca(Cc state, Resources res) {
        super(null);
        this.f۸۸۰۰s = -1;
        this.f۸۸۰۱t = -1;
        m۱۰۶۸۶a(new Cc(state, this, res));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: b  reason: contains not printable characters */
    public static Ca m۱۰۶۷۷b(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        String name = parser.getName();
        if (name.equals("animated-selector")) {
            Ca asl = new Ca();
            asl.m۱۰۶۸۷a(context, resources, parser, attrs, theme);
            return asl;
        }
        throw new XmlPullParserException(parser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۶۸۷a(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        TypedArray a = Cg.m۱۲۶۹۱a(resources, theme, attrs, Cj.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(Cj.AnimatedStateListDrawableCompat_android_visible, true), true);
        m۱۰۶۷۶a(a);
        m۱۰۷۱۶a(resources);
        a.recycle();
        m۱۰۶۸۰c(context, resources, parser, attrs, theme);
        m۱۰۶۷۹c();
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb
    public boolean setVisible(boolean visible, boolean restart) {
        boolean changed = super.setVisible(visible, restart);
        if (this.f۸۷۹۹r != null && (changed || restart)) {
            if (visible) {
                this.f۸۷۹۹r.m۱۰۷۰۹c();
            } else {
                jumpToCurrentState();
            }
        }
        return changed;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ce
    public boolean isStateful() {
        return true;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractCg gVar = this.f۸۷۹۹r;
        if (gVar != null) {
            gVar.m۱۰۷۱۰d();
            this.f۸۷۹۹r = null;
            m۱۰۷۱۸a(this.f۸۸۰۰s);
            this.f۸۸۰۰s = -1;
            this.f۸۸۰۱t = -1;
        }
    }

    /* access modifiers changed from: protected */
    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ce
    public boolean onStateChange(int[] stateSet) {
        int targetIndex = this.f۸۷۹۸q.m۱۰۶۹۳b(stateSet);
        boolean changed = targetIndex != m۱۰۷۱۹b() && (m۱۰۶۷۸b(targetIndex) || m۱۰۷۱۸a(targetIndex));
        Drawable current = getCurrent();
        if (current != null) {
            return changed | current.setState(stateSet);
        }
        return changed;
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۰۶۷۸b(int toIndex) {
        int fromIndex;
        int transitionIndex;
        AbstractCg transition;
        AbstractCg currentTransition = this.f۸۷۹۹r;
        if (currentTransition == null) {
            fromIndex = m۱۰۷۱۹b();
        } else if (toIndex == this.f۸۸۰۰s) {
            return true;
        } else {
            if (toIndex != this.f۸۸۰۱t || !currentTransition.m۱۰۷۰۷a()) {
                fromIndex = this.f۸۸۰۰s;
                currentTransition.m۱۰۷۱۰d();
            } else {
                currentTransition.m۱۰۷۰۸b();
                this.f۸۸۰۰s = this.f۸۸۰۱t;
                this.f۸۸۰۱t = toIndex;
                return true;
            }
        }
        this.f۸۷۹۹r = null;
        this.f۸۸۰۱t = -1;
        this.f۸۸۰۰s = -1;
        Cc state = this.f۸۷۹۸q;
        int fromId = state.m۱۰۶۹۵d(fromIndex);
        int toId = state.m۱۰۶۹۵d(toIndex);
        if (toId == 0 || fromId == 0 || (transitionIndex = state.m۱۰۶۹۴c(fromId, toId)) < 0) {
            return false;
        }
        boolean hasReversibleFlag = state.m۱۰۶۹۷e(fromId, toId);
        m۱۰۷۱۸a(transitionIndex);
        Drawable d = getCurrent();
        if (d instanceof AnimationDrawable) {
            transition = new Ce((AnimationDrawable) d, state.m۱۰۶۹۶d(fromId, toId), hasReversibleFlag);
        } else if (d instanceof p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Cc) {
            transition = new Cd((p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Cc) d);
        } else if (!(d instanceof Animatable)) {
            return false;
        } else {
            transition = new Cb((Animatable) d);
        }
        transition.m۱۰۷۰۹c();
        this.f۸۷۹۹r = transition;
        this.f۸۸۰۱t = fromIndex;
        this.f۸۸۰۰s = toIndex;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.h.d.a.a$g  reason: invalid class name */
    public static abstract class AbstractCg {
        /* renamed from: c  reason: contains not printable characters */
        public abstract void m۱۰۷۰۹c();

        /* renamed from: d  reason: contains not printable characters */
        public abstract void m۱۰۷۱۰d();

        private AbstractCg() {
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۷۰۸b() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۷۰۷a() {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.h.d.a.a$b  reason: invalid class name */
    public static class Cb extends AbstractCg {

        /* renamed from: a  reason: contains not printable characters */
        private final Animatable f۸۸۰۳a;

        Cb(Animatable a) {
            super();
            this.f۸۸۰۳a = a;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ca.AbstractCg
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۰۶۸۸c() {
            this.f۸۸۰۳a.start();
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ca.AbstractCg
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۰۶۸۹d() {
            this.f۸۸۰۳a.stop();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.h.d.a.a$e  reason: invalid class name */
    public static class Ce extends AbstractCg {

        /* renamed from: a  reason: contains not printable characters */
        private final ObjectAnimator f۸۸۰۷a;

        /* renamed from: b  reason: contains not printable characters */
        private final boolean f۸۸۰۸b;

        Ce(AnimationDrawable ad, boolean reversed, boolean hasReversibleFlag) {
            super();
            int frameCount = ad.getNumberOfFrames();
            int fromFrame = reversed ? frameCount - 1 : 0;
            int toFrame = reversed ? 0 : frameCount - 1;
            Cf interp = new Cf(ad, reversed);
            ObjectAnimator anim = ObjectAnimator.ofInt(ad, "currentIndex", fromFrame, toFrame);
            if (Build.VERSION.SDK_INT >= 18) {
                anim.setAutoCancel(true);
            }
            anim.setDuration((long) interp.m۱۰۷۰۵a());
            anim.setInterpolator(interp);
            this.f۸۸۰۸b = hasReversibleFlag;
            this.f۸۸۰۷a = anim;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ca.AbstractCg
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۷۰۱a() {
            return this.f۸۸۰۸b;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ca.AbstractCg
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۰۷۰۳c() {
            this.f۸۸۰۷a.start();
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ca.AbstractCg
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۷۰۲b() {
            this.f۸۸۰۷a.reverse();
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ca.AbstractCg
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۰۷۰۴d() {
            this.f۸۸۰۷a.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.h.d.a.a$d  reason: invalid class name */
    public static class Cd extends AbstractCg {

        /* renamed from: a  reason: contains not printable characters */
        private final p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Cc f۸۸۰۶a;

        Cd(p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Cc avd) {
            super();
            this.f۸۸۰۶a = avd;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ca.AbstractCg
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۰۶۹۹c() {
            this.f۸۸۰۶a.start();
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ca.AbstractCg
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۰۷۰۰d() {
            this.f۸۸۰۶a.stop();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۶۷۶a(TypedArray a) {
        Cc state = this.f۸۷۹۸q;
        if (Build.VERSION.SDK_INT >= 21) {
            state.f۸۸۳۸d |= a.getChangingConfigurations();
        }
        state.m۱۰۷۳۳b(a.getBoolean(Cj.AnimatedStateListDrawableCompat_android_variablePadding, state.f۸۸۴۳i));
        state.m۱۰۷۲۹a(a.getBoolean(Cj.AnimatedStateListDrawableCompat_android_constantSize, state.f۸۸۴۶l));
        state.m۱۰۷۳۲b(a.getInt(Cj.AnimatedStateListDrawableCompat_android_enterFadeDuration, state.f۸۸۲۶A));
        state.m۱۰۷۳۶c(a.getInt(Cj.AnimatedStateListDrawableCompat_android_exitFadeDuration, state.f۸۸۲۷B));
        setDither(a.getBoolean(Cj.AnimatedStateListDrawableCompat_android_dither, state.f۸۸۵۸x));
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۶۷۹c() {
        onStateChange(getState());
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۶۸۰c(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
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
                        m۱۰۶۸۱d(context, resources, parser, attrs, theme);
                    } else if (parser.getName().equals("transition")) {
                        m۱۰۶۸۲e(context, resources, parser, attrs, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private int m۱۰۶۸۲e(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int type;
        TypedArray a = Cg.m۱۲۶۹۱a(resources, theme, attrs, Cj.AnimatedStateListDrawableTransition);
        int fromId = a.getResourceId(Cj.AnimatedStateListDrawableTransition_android_fromId, -1);
        int toId = a.getResourceId(Cj.AnimatedStateListDrawableTransition_android_toId, -1);
        Drawable dr = null;
        int drawableId = a.getResourceId(Cj.AnimatedStateListDrawableTransition_android_drawable, -1);
        if (drawableId > 0) {
            dr = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(context, drawableId);
        }
        boolean reversible = a.getBoolean(Cj.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        if (dr == null) {
            do {
                type = parser.next();
            } while (type == 4);
            if (type != 2) {
                throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (parser.getName().equals("animated-vector")) {
                dr = p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Cc.m۱۰۰۳۶a(context, resources, parser, attrs, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                dr = Drawable.createFromXmlInner(resources, parser, attrs, theme);
            } else {
                dr = Drawable.createFromXmlInner(resources, parser, attrs);
            }
        }
        if (dr == null) {
            throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (fromId != -1 && toId != -1) {
            return this.f۸۷۹۸q.m۱۰۶۹۱a(fromId, toId, dr, reversible);
        } else {
            throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private int m۱۰۶۸۱d(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int type;
        TypedArray a = Cg.m۱۲۶۹۱a(resources, theme, attrs, Cj.AnimatedStateListDrawableItem);
        int keyframeId = a.getResourceId(Cj.AnimatedStateListDrawableItem_android_id, 0);
        Drawable dr = null;
        int drawableId = a.getResourceId(Cj.AnimatedStateListDrawableItem_android_drawable, -1);
        if (drawableId > 0) {
            dr = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(context, drawableId);
        }
        a.recycle();
        int[] states = m۱۰۷۵۹a(attrs);
        if (dr == null) {
            do {
                type = parser.next();
            } while (type == 4);
            if (type != 2) {
                throw new XmlPullParserException(parser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (parser.getName().equals("vector")) {
                dr = Ci.createFromXmlInner(resources, parser, attrs, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                dr = Drawable.createFromXmlInner(resources, parser, attrs, theme);
            } else {
                dr = Drawable.createFromXmlInner(resources, parser, attrs);
            }
        }
        if (dr != null) {
            return this.f۸۷۹۸q.m۱۰۶۹۲a(states, dr, keyframeId);
        }
        throw new XmlPullParserException(parser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ce
    public Drawable mutate() {
        if (!this.f۸۸۰۲u) {
            super.mutate();
            if (this == this) {
                this.f۸۷۹۸q.m۱۰۶۹۸m();
                this.f۸۸۰۲u = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ce, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ce
    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۰۶۸۵a() {
        return new Cc(this.f۸۷۹۸q, this, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.h.d.a.a$c  reason: invalid class name */
    public static class Cc extends Ce.Ca {

        /* renamed from: K  reason: contains not printable characters */
        p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cf<Long> f۸۸۰۴K;

        /* renamed from: L  reason: contains not printable characters */
        Co<Integer> f۸۸۰۵L;

        Cc(Cc orig, Ca owner, Resources res) {
            super(orig, owner, res);
            if (orig != null) {
                this.f۸۸۰۴K = orig.f۸۸۰۴K;
                this.f۸۸۰۵L = orig.f۸۸۰۵L;
                return;
            }
            this.f۸۸۰۴K = new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cf<>();
            this.f۸۸۰۵L = new Co<>();
        }

        /* access modifiers changed from: package-private */
        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ce.Ca, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb.AbstractCc
        /* renamed from: m  reason: contains not printable characters */
        public void m۱۰۶۹۸m() {
            this.f۸۸۰۴K = this.f۸۸۰۴K.clone();
            this.f۸۸۰۵L = this.f۸۸۰۵L.clone();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۶۹۱a(int fromId, int toId, Drawable anim, boolean reversible) {
            int pos = super.m۱۰۷۲۴a(anim);
            long keyFromTo = m۱۰۶۹۰f(fromId, toId);
            long reversibleBit = 0;
            if (reversible) {
                reversibleBit = 8589934592L;
            }
            this.f۸۸۰۴K.m۱۰۵۹۸a(keyFromTo, Long.valueOf(((long) pos) | reversibleBit));
            if (reversible) {
                this.f۸۸۰۴K.m۱۰۵۹۸a(m۱۰۶۹۰f(toId, fromId), Long.valueOf(((long) pos) | 4294967296L | reversibleBit));
            }
            return pos;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۶۹۲a(int[] stateSet, Drawable drawable, int id) {
            int index = super.m۱۰۷۶۱a(stateSet, drawable);
            this.f۸۸۰۵L.m۱۰۶۶۵c(index, Integer.valueOf(id));
            return index;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۰۶۹۳b(int[] stateSet) {
            int index = super.m۱۰۷۶۰a(stateSet);
            if (index >= 0) {
                return index;
            }
            return super.m۱۰۷۶۰a(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d  reason: contains not printable characters */
        public int m۱۰۶۹۵d(int index) {
            if (index < 0) {
                return 0;
            }
            return this.f۸۸۰۵L.m۱۰۶۶۳b(index, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public int m۱۰۶۹۴c(int fromId, int toId) {
            return (int) this.f۸۸۰۴K.m۱۰۶۰۱b(m۱۰۶۹۰f(fromId, toId), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d  reason: contains not printable characters */
        public boolean m۱۰۶۹۶d(int fromId, int toId) {
            return (this.f۸۸۰۴K.m۱۰۶۰۱b(m۱۰۶۹۰f(fromId, toId), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e  reason: contains not printable characters */
        public boolean m۱۰۶۹۷e(int fromId, int toId) {
            return (this.f۸۸۰۴K.m۱۰۶۰۱b(m۱۰۶۹۰f(fromId, toId), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ce.Ca
        public Drawable newDrawable() {
            return new Ca(this, null);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ce.Ca
        public Drawable newDrawable(Resources res) {
            return new Ca(this, res);
        }

        /* renamed from: f  reason: contains not printable characters */
        private static long m۱۰۶۹۰f(int fromId, int toId) {
            return (((long) fromId) << 32) | ((long) toId);
        }
    }

    /* access modifiers changed from: protected */
    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ce
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۶۸۶a(Cb.AbstractCc state) {
        super.m۱۰۷۵۸a(state);
        if (state instanceof Cc) {
            this.f۸۷۹۸q = (Cc) state;
        }
    }

    /* renamed from: a.b.h.d.a.a$f  reason: invalid class name */
    private static class Cf implements TimeInterpolator {

        /* renamed from: a  reason: contains not printable characters */
        private int[] f۸۸۰۹a;

        /* renamed from: b  reason: contains not printable characters */
        private int f۸۸۱۰b;

        /* renamed from: c  reason: contains not printable characters */
        private int f۸۸۱۱c;

        Cf(AnimationDrawable d, boolean reversed) {
            m۱۰۷۰۶a(d, reversed);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۷۰۶a(AnimationDrawable d, boolean reversed) {
            int frameCount = d.getNumberOfFrames();
            this.f۸۸۱۰b = frameCount;
            int[] iArr = this.f۸۸۰۹a;
            if (iArr == null || iArr.length < frameCount) {
                this.f۸۸۰۹a = new int[frameCount];
            }
            int[] frameTimes = this.f۸۸۰۹a;
            int totalDuration = 0;
            for (int i = 0; i < frameCount; i++) {
                int duration = d.getDuration(reversed ? (frameCount - i) - 1 : i);
                frameTimes[i] = duration;
                totalDuration += duration;
            }
            this.f۸۸۱۱c = totalDuration;
            return totalDuration;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۷۰۵a() {
            return this.f۸۸۱۱c;
        }

        public float getInterpolation(float input) {
            float frameElapsed;
            int frameCount = this.f۸۸۱۰b;
            int[] frameTimes = this.f۸۸۰۹a;
            int remaining = (int) ((((float) this.f۸۸۱۱c) * input) + 0.5f);
            int i = 0;
            while (i < frameCount && remaining >= frameTimes[i]) {
                remaining -= frameTimes[i];
                i++;
            }
            if (i < frameCount) {
                frameElapsed = ((float) remaining) / ((float) this.f۸۸۱۱c);
            } else {
                frameElapsed = 0.0f;
            }
            return (((float) i) / ((float) frameCount)) + frameElapsed;
        }
    }
}
