package a.b.d.a;

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
import android.support.v4.content.e.g;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class c extends h implements b {

    /* renamed from: d  reason: collision with root package name */
    private b f۸۶d;

    /* renamed from: e  reason: collision with root package name */
    private Context f۸۷e;

    /* renamed from: f  reason: collision with root package name */
    private ArgbEvaluator f۸۸f;

    /* renamed from: g  reason: collision with root package name */
    final Drawable.Callback f۸۹g;

    c() {
        this(null, null, null);
    }

    private c(Context context) {
        this(context, null, null);
    }

    private c(Context context, b state, Resources res) {
        this.f۸۸f = null;
        this.f۸۹g = new a();
        this.f۸۷e = context;
        if (state != null) {
            this.f۸۶d = state;
        } else {
            this.f۸۶d = new b(context, state, this.f۸۹g, res);
        }
    }

    public Drawable mutate() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public static c a(Context context, Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        c drawable = new c(context);
        drawable.inflate(r, parser, attrs, theme);
        return drawable;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C۰۰۰۵c(drawable.getConstantState());
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f۸۶d.f۹۱a;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f۸۶d.f۹۲b.draw(canvas);
        if (this.f۸۶d.f۹۳c.isStarted()) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.setBounds(bounds);
        } else {
            this.f۸۶d.f۹۲b.setBounds(bounds);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.setState(state);
        }
        return this.f۸۶d.f۹۲b.setState(state);
    }

    /* access modifiers changed from: protected */
    @Override // a.b.d.a.h
    public boolean onLevelChange(int level) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        return this.f۸۶d.f۹۲b.setLevel(level);
    }

    public int getAlpha() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return android.support.v4.graphics.drawable.a.c(drawable);
        }
        return this.f۸۶d.f۹۲b.getAlpha();
    }

    public void setAlpha(int alpha) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        } else {
            this.f۸۶d.f۹۲b.setAlpha(alpha);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f۸۶d.f۹۲b.setColorFilter(colorFilter);
        }
    }

    @Override // android.support.v4.graphics.drawable.b
    public void setTint(int tint) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.b(drawable, tint);
        } else {
            this.f۸۶d.f۹۲b.setTint(tint);
        }
    }

    @Override // android.support.v4.graphics.drawable.b
    public void setTintList(ColorStateList tint) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, tint);
        } else {
            this.f۸۶d.f۹۲b.setTintList(tint);
        }
    }

    @Override // android.support.v4.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode tintMode) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, tintMode);
        } else {
            this.f۸۶d.f۹۲b.setTintMode(tintMode);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.setVisible(visible, restart);
        }
        this.f۸۶d.f۹۲b.setVisible(visible, restart);
        return super.setVisible(visible, restart);
    }

    public boolean isStateful() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f۸۶d.f۹۲b.isStateful();
    }

    public int getOpacity() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f۸۶d.f۹۲b.getOpacity();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f۸۶d.f۹۲b.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f۸۶d.f۹۲b.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return android.support.v4.graphics.drawable.a.f(drawable);
        }
        return this.f۸۶d.f۹۲b.isAutoMirrored();
    }

    public void setAutoMirrored(boolean mirrored) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, mirrored);
        } else {
            this.f۸۶d.f۹۲b.setAutoMirrored(mirrored);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, res, parser, attrs, theme);
            return;
        }
        int eventType = parser.getEventType();
        int innerDepth = parser.getDepth() + 1;
        while (eventType != 1 && (parser.getDepth() >= innerDepth || eventType != 3)) {
            if (eventType == 2) {
                String tagName = parser.getName();
                if ("animated-vector".equals(tagName)) {
                    TypedArray a2 = g.a(res, theme, attrs, a.f۸۲e);
                    int drawableRes = a2.getResourceId(0, 0);
                    if (drawableRes != 0) {
                        i vectorDrawable = i.a(res, drawableRes, theme);
                        vectorDrawable.a(false);
                        vectorDrawable.setCallback(this.f۸۹g);
                        i iVar = this.f۸۶d.f۹۲b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f۸۶d.f۹۲b = vectorDrawable;
                    }
                    a2.recycle();
                } else if ("target".equals(tagName)) {
                    TypedArray a3 = res.obtainAttributes(attrs, a.f۸۳f);
                    String target = a3.getString(0);
                    int id = a3.getResourceId(1, 0);
                    if (id != 0) {
                        Context context = this.f۸۷e;
                        if (context != null) {
                            a(target, e.a(context, id));
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
        this.f۸۶d.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs) {
        inflate(res, parser, attrs, null);
    }

    @Override // a.b.d.a.h
    public void applyTheme(Resources.Theme t) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, t);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return android.support.v4.graphics.drawable.a.a(drawable);
        }
        return false;
    }

    /* renamed from: a.b.d.a.c$c  reason: collision with other inner class name */
    private static class C۰۰۰۵c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f۹۶a;

        public C۰۰۰۵c(Drawable.ConstantState state) {
            this.f۹۶a = state;
        }

        public Drawable newDrawable() {
            c drawableCompat = new c();
            drawableCompat.f۱۰۱c = this.f۹۶a.newDrawable();
            drawableCompat.f۱۰۱c.setCallback(drawableCompat.f۸۹g);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res) {
            c drawableCompat = new c();
            drawableCompat.f۱۰۱c = this.f۹۶a.newDrawable(res);
            drawableCompat.f۱۰۱c.setCallback(drawableCompat.f۸۹g);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res, Resources.Theme theme) {
            c drawableCompat = new c();
            drawableCompat.f۱۰۱c = this.f۹۶a.newDrawable(res, theme);
            drawableCompat.f۱۰۱c.setCallback(drawableCompat.f۸۹g);
            return drawableCompat;
        }

        public boolean canApplyTheme() {
            return this.f۹۶a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f۹۶a.getChangingConfigurations();
        }
    }

    /* access modifiers changed from: private */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f۹۱a;

        /* renamed from: b  reason: collision with root package name */
        i f۹۲b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f۹۳c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f۹۴d;

        /* renamed from: e  reason: collision with root package name */
        a.b.g.g.a<Animator, String> f۹۵e;

        public b(Context context, b copy, Drawable.Callback owner, Resources res) {
            if (copy != null) {
                this.f۹۱a = copy.f۹۱a;
                i iVar = copy.f۹۲b;
                if (iVar != null) {
                    Drawable.ConstantState cs = iVar.getConstantState();
                    if (res != null) {
                        this.f۹۲b = (i) cs.newDrawable(res);
                    } else {
                        this.f۹۲b = (i) cs.newDrawable();
                    }
                    i iVar2 = this.f۹۲b;
                    iVar2.mutate();
                    this.f۹۲b = iVar2;
                    this.f۹۲b.setCallback(owner);
                    this.f۹۲b.setBounds(copy.f۹۲b.getBounds());
                    this.f۹۲b.a(false);
                }
                ArrayList<Animator> arrayList = copy.f۹۴d;
                if (arrayList != null) {
                    int numAnimators = arrayList.size();
                    this.f۹۴d = new ArrayList<>(numAnimators);
                    this.f۹۵e = new a.b.g.g.a<>(numAnimators);
                    for (int i = 0; i < numAnimators; i++) {
                        Animator anim = copy.f۹۴d.get(i);
                        Animator animClone = anim.clone();
                        String targetName = copy.f۹۵e.get(anim);
                        animClone.setTarget(this.f۹۲b.a(targetName));
                        this.f۹۴d.add(animClone);
                        this.f۹۵e.put(animClone, targetName);
                    }
                    a();
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
            return this.f۹۱a;
        }

        public void a() {
            if (this.f۹۳c == null) {
                this.f۹۳c = new AnimatorSet();
            }
            this.f۹۳c.playTogether(this.f۹۴d);
        }
    }

    private void a(Animator animator) {
        List<Animator> childAnimators;
        if ((animator instanceof AnimatorSet) && (childAnimators = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimators.size(); i++) {
                a(childAnimators.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnim = (ObjectAnimator) animator;
            String propertyName = objectAnim.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f۸۸f == null) {
                    this.f۸۸f = new ArgbEvaluator();
                }
                objectAnim.setEvaluator(this.f۸۸f);
            }
        }
    }

    private void a(String name, Animator animator) {
        animator.setTarget(this.f۸۶d.f۹۲b.a(name));
        if (Build.VERSION.SDK_INT < 21) {
            a(animator);
        }
        b bVar = this.f۸۶d;
        if (bVar.f۹۴d == null) {
            bVar.f۹۴d = new ArrayList<>();
            this.f۸۶d.f۹۵e = new a.b.g.g.a<>();
        }
        this.f۸۶d.f۹۴d.add(animator);
        this.f۸۶d.f۹۵e.put(animator, name);
    }

    public boolean isRunning() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f۸۶d.f۹۳c.isRunning();
    }

    public void start() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f۸۶d.f۹۳c.isStarted()) {
            this.f۸۶d.f۹۳c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f۸۶d.f۹۳c.end();
        }
    }

    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable who) {
            c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable who, Runnable what, long when) {
            c.this.scheduleSelf(what, when);
        }

        public void unscheduleDrawable(Drawable who, Runnable what) {
            c.this.unscheduleSelf(what);
        }
    }
}
