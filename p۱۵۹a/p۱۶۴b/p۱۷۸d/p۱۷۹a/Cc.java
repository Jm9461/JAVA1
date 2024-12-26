package p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.p۲۰۲e.Cg;
import android.support.v4.graphics.drawable.Ca;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a.b.d.a.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc extends AbstractCh implements InterfaceCb {

    /* renamed from: d, reason: contains not printable characters */
    private b f۸۳۴۱d;

    /* renamed from: e, reason: contains not printable characters */
    private Context f۸۳۴۲e;

    /* renamed from: f, reason: contains not printable characters */
    private ArgbEvaluator f۸۳۴۳f;

    /* renamed from: g, reason: contains not printable characters */
    final Drawable.Callback f۸۳۴۴g;

    Cc() {
        this(null, null, null);
    }

    private Cc(Context context) {
        this(context, null, null);
    }

    private Cc(Context context, b state, Resources res) {
        this.f۸۳۴۳f = null;
        this.f۸۳۴۴g = new a();
        this.f۸۳۴۲e = context;
        if (state != null) {
            this.f۸۳۴۱d = state;
        } else {
            this.f۸۳۴۱d = new b(context, state, this.f۸۳۴۴g, res);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cc m۷۹۶۹a(Context context, Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Cc drawable = new Cc(context);
        drawable.inflate(r, parser, attrs, theme);
        return drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new c(drawable.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f۸۳۴۱d.f۸۳۴۶a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f۸۳۴۱d.f۸۳۴۷b.draw(canvas);
        if (this.f۸۳۴۱d.f۸۳۴۸c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setBounds(bounds);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setBounds(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] state) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.setState(state);
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.setState(state);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a.AbstractCh, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int level) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.setLevel(level);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return Ca.m۱۰۶۴۷c(drawable);
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setAlpha(alpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceCb
    public void setTint(int tint) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۰۶۴۶b(drawable, tint);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setTint(tint);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceCb
    public void setTintList(ColorStateList tint) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۰۶۳۸a(drawable, tint);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setTintList(tint);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceCb
    public void setTintMode(PorterDuff.Mode tintMode) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۰۶۴۱a(drawable, tintMode);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setTintMode(tintMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.setVisible(visible, restart);
        }
        this.f۸۳۴۱d.f۸۳۴۷b.setVisible(visible, restart);
        return super.setVisible(visible, restart);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return Ca.m۱۰۶۵۰f(drawable);
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean mirrored) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۰۶۴۲a(drawable, mirrored);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setAutoMirrored(mirrored);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۰۶۴۰a(drawable, res, parser, attrs, theme);
            return;
        }
        int eventType = parser.getEventType();
        int innerDepth = parser.getDepth() + 1;
        while (eventType != 1 && (parser.getDepth() >= innerDepth || eventType != 3)) {
            if (eventType == 2) {
                String tagName = parser.getName();
                if ("animated-vector".equals(tagName)) {
                    TypedArray a2 = Cg.m۱۰۶۲۱a(res, theme, attrs, Ca.f۸۳۳۳e);
                    int drawableRes = a2.getResourceId(0, 0);
                    if (drawableRes != 0) {
                        Ci vectorDrawable = Ci.m۸۰۰۱a(res, drawableRes, theme);
                        vectorDrawable.m۸۰۰۸a(false);
                        vectorDrawable.setCallback(this.f۸۳۴۴g);
                        Ci ci = this.f۸۳۴۱d.f۸۳۴۷b;
                        if (ci != null) {
                            ci.setCallback(null);
                        }
                        this.f۸۳۴۱d.f۸۳۴۷b = vectorDrawable;
                    }
                    a2.recycle();
                } else if ("target".equals(tagName)) {
                    TypedArray a3 = res.obtainAttributes(attrs, Ca.f۸۳۳۴f);
                    String target = a3.getString(0);
                    int id = a3.getResourceId(1, 0);
                    if (id != 0) {
                        Context context = this.f۸۳۴۲e;
                        if (context != null) {
                            Animator objectAnimator = Ce.m۷۹۷۷a(context, id);
                            m۷۹۷۱a(target, objectAnimator);
                        } else {
                            a3.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    a3.recycle();
                } else {
                    continue;
                }
            }
            eventType = parser.next();
        }
        this.f۸۳۴۱d.m۷۹۷۲a();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs) {
        inflate(res, parser, attrs, null);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a.AbstractCh, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme t) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۰۶۳۹a(drawable, t);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return Ca.m۱۰۶۴۳a(drawable);
        }
        return false;
    }

    /* renamed from: a.b.d.a.c$c */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: contains not printable characters */
        private final Drawable.ConstantState f۸۳۵۱a;

        public c(Drawable.ConstantState state) {
            this.f۸۳۵۱a = state;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            Cc drawableCompat = new Cc();
            drawableCompat.f۸۳۵۶c = this.f۸۳۵۱a.newDrawable();
            drawableCompat.f۸۳۵۶c.setCallback(drawableCompat.f۸۳۴۴g);
            return drawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources res) {
            Cc drawableCompat = new Cc();
            drawableCompat.f۸۳۵۶c = this.f۸۳۵۱a.newDrawable(res);
            drawableCompat.f۸۳۵۶c.setCallback(drawableCompat.f۸۳۴۴g);
            return drawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources res, Resources.Theme theme) {
            Cc drawableCompat = new Cc();
            drawableCompat.f۸۳۵۶c = this.f۸۳۵۱a.newDrawable(res, theme);
            drawableCompat.f۸۳۵۶c.setCallback(drawableCompat.f۸۳۴۴g);
            return drawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f۸۳۵۱a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f۸۳۵۱a.getChangingConfigurations();
        }
    }

    /* renamed from: a.b.d.a.c$b */
    private static class b extends Drawable.ConstantState {

        /* renamed from: a, reason: contains not printable characters */
        int f۸۳۴۶a;

        /* renamed from: b, reason: contains not printable characters */
        Ci f۸۳۴۷b;

        /* renamed from: c, reason: contains not printable characters */
        AnimatorSet f۸۳۴۸c;

        /* renamed from: d, reason: contains not printable characters */
        ArrayList<Animator> f۸۳۴۹d;

        /* renamed from: e, reason: contains not printable characters */
        p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ca<Animator, String> f۸۳۵۰e;

        public b(Context context, b copy, Drawable.Callback owner, Resources res) {
            if (copy != null) {
                this.f۸۳۴۶a = copy.f۸۳۴۶a;
                Ci ci = copy.f۸۳۴۷b;
                if (ci != null) {
                    Drawable.ConstantState cs = ci.getConstantState();
                    if (res != null) {
                        this.f۸۳۴۷b = (Ci) cs.newDrawable(res);
                    } else {
                        this.f۸۳۴۷b = (Ci) cs.newDrawable();
                    }
                    Ci ci2 = this.f۸۳۴۷b;
                    ci2.mutate();
                    this.f۸۳۴۷b = ci2;
                    this.f۸۳۴۷b.setCallback(owner);
                    this.f۸۳۴۷b.setBounds(copy.f۸۳۴۷b.getBounds());
                    this.f۸۳۴۷b.m۸۰۰۸a(false);
                }
                ArrayList<Animator> arrayList = copy.f۸۳۴۹d;
                if (arrayList != null) {
                    int numAnimators = arrayList.size();
                    this.f۸۳۴۹d = new ArrayList<>(numAnimators);
                    this.f۸۳۵۰e = new p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ca<>(numAnimators);
                    for (int i = 0; i < numAnimators; i++) {
                        Animator anim = copy.f۸۳۴۹d.get(i);
                        Animator animClone = anim.clone();
                        String targetName = copy.f۸۳۵۰e.get(anim);
                        Object targetObject = this.f۸۳۴۷b.m۸۰۰۷a(targetName);
                        animClone.setTarget(targetObject);
                        this.f۸۳۴۹d.add(animClone);
                        this.f۸۳۵۰e.put(animClone, targetName);
                    }
                    m۷۹۷۲a();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources res) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f۸۳۴۶a;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۷۹۷۲a() {
            if (this.f۸۳۴۸c == null) {
                this.f۸۳۴۸c = new AnimatorSet();
            }
            this.f۸۳۴۸c.playTogether(this.f۸۳۴۹d);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۷۹۷۰a(Animator animator) {
        List<Animator> childAnimators;
        if ((animator instanceof AnimatorSet) && (childAnimators = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimators.size(); i++) {
                m۷۹۷۰a(childAnimators.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnim = (ObjectAnimator) animator;
            String propertyName = objectAnim.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f۸۳۴۳f == null) {
                    this.f۸۳۴۳f = new ArgbEvaluator();
                }
                objectAnim.setEvaluator(this.f۸۳۴۳f);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۷۹۷۱a(String name, Animator animator) {
        Object target = this.f۸۳۴۱d.f۸۳۴۷b.m۸۰۰۷a(name);
        animator.setTarget(target);
        if (Build.VERSION.SDK_INT < 21) {
            m۷۹۷۰a(animator);
        }
        b bVar = this.f۸۳۴۱d;
        if (bVar.f۸۳۴۹d == null) {
            bVar.f۸۳۴۹d = new ArrayList<>();
            this.f۸۳۴۱d.f۸۳۵۰e = new p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ca<>();
        }
        this.f۸۳۴۱d.f۸۳۴۹d.add(animator);
        this.f۸۳۴۱d.f۸۳۵۰e.put(animator, name);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f۸۳۴۱d.f۸۳۴۸c.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f۸۳۴۱d.f۸۳۴۸c.isStarted()) {
                return;
            }
            this.f۸۳۴۱d.f۸۳۴۸c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f۸۳۴۱d.f۸۳۴۸c.end();
        }
    }

    /* renamed from: a.b.d.a.c$a */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable who) {
            Cc.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable who, Runnable what, long when) {
            Cc.this.scheduleSelf(what, when);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable who, Runnable what) {
            Cc.this.unscheduleSelf(what);
        }
    }
}
