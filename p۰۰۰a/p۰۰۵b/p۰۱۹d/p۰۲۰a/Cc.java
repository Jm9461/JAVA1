package p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a;

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
import android.support.p۰۴۳v4.content.p۰۴۴e.Cg;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a.b.d.a.c  reason: invalid class name */
public class Cc extends AbstractCh implements AbstractCb {

    /* renamed from: d  reason: contains not printable characters */
    private Cb f۸۳۴۱d;

    /* renamed from: e  reason: contains not printable characters */
    private Context f۸۳۴۲e;

    /* renamed from: f  reason: contains not printable characters */
    private ArgbEvaluator f۸۳۴۳f;

    /* renamed from: g  reason: contains not printable characters */
    final Drawable.Callback f۸۳۴۴g;

    Cc() {
        this(null, null, null);
    }

    private Cc(Context context) {
        this(context, null, null);
    }

    private Cc(Context context, Cb state, Resources res) {
        this.f۸۳۴۳f = null;
        this.f۸۳۴۴g = new Ca();
        this.f۸۳۴۲e = context;
        if (state != null) {
            this.f۸۳۴۱d = state;
        } else {
            this.f۸۳۴۱d = new Cb(context, state, this.f۸۳۴۴g, res);
        }
    }

    public Drawable mutate() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cc m۱۰۰۳۶a(Context context, Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Cc drawable = new Cc(context);
        drawable.inflate(r, parser, attrs, theme);
        return drawable;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new Cc(drawable.getConstantState());
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f۸۳۴۱d.f۸۳۴۶a;
    }

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

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setBounds(bounds);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setBounds(bounds);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.setState(state);
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.setState(state);
    }

    /* access modifiers changed from: protected */
    @Override // p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.AbstractCh
    public boolean onLevelChange(int level) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.setLevel(level);
    }

    public int getAlpha() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۷c(drawable);
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.getAlpha();
    }

    public void setAlpha(int alpha) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setAlpha(alpha);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setColorFilter(colorFilter);
        }
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCb
    public void setTint(int tint) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۶b(drawable, tint);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setTint(tint);
        }
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCb
    public void setTintList(ColorStateList tint) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(drawable, tint);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setTintList(tint);
        }
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCb
    public void setTintMode(PorterDuff.Mode tintMode) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(drawable, tintMode);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setTintMode(tintMode);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.setVisible(visible, restart);
        }
        this.f۸۳۴۱d.f۸۳۴۷b.setVisible(visible, restart);
        return super.setVisible(visible, restart);
    }

    public boolean isStateful() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.isStateful();
    }

    public int getOpacity() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.getOpacity();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۰f(drawable);
        }
        return this.f۸۳۴۱d.f۸۳۴۷b.isAutoMirrored();
    }

    public void setAutoMirrored(boolean mirrored) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۲a(drawable, mirrored);
        } else {
            this.f۸۳۴۱d.f۸۳۴۷b.setAutoMirrored(mirrored);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۰a(drawable, res, parser, attrs, theme);
            return;
        }
        int eventType = parser.getEventType();
        int innerDepth = parser.getDepth() + 1;
        while (eventType != 1 && (parser.getDepth() >= innerDepth || eventType != 3)) {
            if (eventType == 2) {
                String tagName = parser.getName();
                if ("animated-vector".equals(tagName)) {
                    TypedArray a = Cg.m۱۲۶۹۱a(res, theme, attrs, Ca.f۸۳۳۳e);
                    int drawableRes = a.getResourceId(0, 0);
                    if (drawableRes != 0) {
                        Ci vectorDrawable = Ci.m۱۰۰۶۸a(res, drawableRes, theme);
                        vectorDrawable.m۱۰۰۷۵a(false);
                        vectorDrawable.setCallback(this.f۸۳۴۴g);
                        Ci iVar = this.f۸۳۴۱d.f۸۳۴۷b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f۸۳۴۱d.f۸۳۴۷b = vectorDrawable;
                    }
                    a.recycle();
                } else if ("target".equals(tagName)) {
                    TypedArray a2 = res.obtainAttributes(attrs, Ca.f۸۳۳۴f);
                    String target = a2.getString(0);
                    int id = a2.getResourceId(1, 0);
                    if (id != 0) {
                        Context context = this.f۸۳۴۲e;
                        if (context != null) {
                            m۱۰۰۳۸a(target, Ce.m۱۰۰۴۴a(context, id));
                        } else {
                            a2.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    a2.recycle();
                } else {
                    continue;
                }
            }
            eventType = parser.next();
        }
        this.f۸۳۴۱d.m۱۰۰۳۹a();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs) {
        inflate(res, parser, attrs, null);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.AbstractCh
    public void applyTheme(Resources.Theme t) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۹a(drawable, t);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۳a(drawable);
        }
        return false;
    }

    /* renamed from: a.b.d.a.c$c  reason: invalid class name */
    private static class Cc extends Drawable.ConstantState {

        /* renamed from: a  reason: contains not printable characters */
        private final Drawable.ConstantState f۸۳۵۱a;

        public Cc(Drawable.ConstantState state) {
            this.f۸۳۵۱a = state;
        }

        public Drawable newDrawable() {
            Cc drawableCompat = new Cc();
            drawableCompat.f۸۳۵۶c = this.f۸۳۵۱a.newDrawable();
            drawableCompat.f۸۳۵۶c.setCallback(drawableCompat.f۸۳۴۴g);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res) {
            Cc drawableCompat = new Cc();
            drawableCompat.f۸۳۵۶c = this.f۸۳۵۱a.newDrawable(res);
            drawableCompat.f۸۳۵۶c.setCallback(drawableCompat.f۸۳۴۴g);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res, Resources.Theme theme) {
            Cc drawableCompat = new Cc();
            drawableCompat.f۸۳۵۶c = this.f۸۳۵۱a.newDrawable(res, theme);
            drawableCompat.f۸۳۵۶c.setCallback(drawableCompat.f۸۳۴۴g);
            return drawableCompat;
        }

        public boolean canApplyTheme() {
            return this.f۸۳۵۱a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f۸۳۵۱a.getChangingConfigurations();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.d.a.c$b  reason: invalid class name */
    public static class Cb extends Drawable.ConstantState {

        /* renamed from: a  reason: contains not printable characters */
        int f۸۳۴۶a;

        /* renamed from: b  reason: contains not printable characters */
        Ci f۸۳۴۷b;

        /* renamed from: c  reason: contains not printable characters */
        AnimatorSet f۸۳۴۸c;

        /* renamed from: d  reason: contains not printable characters */
        ArrayList<Animator> f۸۳۴۹d;

        /* renamed from: e  reason: contains not printable characters */
        p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<Animator, String> f۸۳۵۰e;

        public Cb(Context context, Cb copy, Drawable.Callback owner, Resources res) {
            if (copy != null) {
                this.f۸۳۴۶a = copy.f۸۳۴۶a;
                Ci iVar = copy.f۸۳۴۷b;
                if (iVar != null) {
                    Drawable.ConstantState cs = iVar.getConstantState();
                    if (res != null) {
                        this.f۸۳۴۷b = (Ci) cs.newDrawable(res);
                    } else {
                        this.f۸۳۴۷b = (Ci) cs.newDrawable();
                    }
                    Ci iVar2 = this.f۸۳۴۷b;
                    iVar2.mutate();
                    this.f۸۳۴۷b = iVar2;
                    this.f۸۳۴۷b.setCallback(owner);
                    this.f۸۳۴۷b.setBounds(copy.f۸۳۴۷b.getBounds());
                    this.f۸۳۴۷b.m۱۰۰۷۵a(false);
                }
                ArrayList<Animator> arrayList = copy.f۸۳۴۹d;
                if (arrayList != null) {
                    int numAnimators = arrayList.size();
                    this.f۸۳۴۹d = new ArrayList<>(numAnimators);
                    this.f۸۳۵۰e = new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<>(numAnimators);
                    for (int i = 0; i < numAnimators; i++) {
                        Animator anim = copy.f۸۳۴۹d.get(i);
                        Animator animClone = anim.clone();
                        String targetName = copy.f۸۳۵۰e.get(anim);
                        animClone.setTarget(this.f۸۳۴۷b.m۱۰۰۷۴a(targetName));
                        this.f۸۳۴۹d.add(animClone);
                        this.f۸۳۵۰e.put(animClone, targetName);
                    }
                    m۱۰۰۳۹a();
                }
            }
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources res) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public int getChangingConfigurations() {
            return this.f۸۳۴۶a;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۰۳۹a() {
            if (this.f۸۳۴۸c == null) {
                this.f۸۳۴۸c = new AnimatorSet();
            }
            this.f۸۳۴۸c.playTogether(this.f۸۳۴۹d);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۰۳۷a(Animator animator) {
        List<Animator> childAnimators;
        if ((animator instanceof AnimatorSet) && (childAnimators = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimators.size(); i++) {
                m۱۰۰۳۷a(childAnimators.get(i));
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

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۰۳۸a(String name, Animator animator) {
        animator.setTarget(this.f۸۳۴۱d.f۸۳۴۷b.m۱۰۰۷۴a(name));
        if (Build.VERSION.SDK_INT < 21) {
            m۱۰۰۳۷a(animator);
        }
        Cb bVar = this.f۸۳۴۱d;
        if (bVar.f۸۳۴۹d == null) {
            bVar.f۸۳۴۹d = new ArrayList<>();
            this.f۸۳۴۱d.f۸۳۵۰e = new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<>();
        }
        this.f۸۳۴۱d.f۸۳۴۹d.add(animator);
        this.f۸۳۴۱d.f۸۳۵۰e.put(animator, name);
    }

    public boolean isRunning() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f۸۳۴۱d.f۸۳۴۸c.isRunning();
    }

    public void start() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f۸۳۴۱d.f۸۳۴۸c.isStarted()) {
            this.f۸۳۴۱d.f۸۳۴۸c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f۸۳۴۱d.f۸۳۴۸c.end();
        }
    }

    /* renamed from: a.b.d.a.c$a  reason: invalid class name */
    class Ca implements Drawable.Callback {
        Ca() {
        }

        public void invalidateDrawable(Drawable who) {
            Cc.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable who, Runnable what, long when) {
            Cc.this.scheduleSelf(what, when);
        }

        public void unscheduleDrawable(Drawable who, Runnable what) {
            Cc.this.unscheduleSelf(what);
        }
    }
}
