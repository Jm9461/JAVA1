package a.b.d.a;

import a.b.g.a.b;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class i extends h {
    static final PorterDuff.Mode l = PorterDuff.Mode.SRC_IN;

    /* renamed from: d  reason: collision with root package name */
    private h f۱۰۲d;

    /* renamed from: e  reason: collision with root package name */
    private PorterDuffColorFilter f۱۰۳e;

    /* renamed from: f  reason: collision with root package name */
    private ColorFilter f۱۰۴f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f۱۰۵g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۱۰۶h;
    private final float[] i;
    private final Matrix j;
    private final Rect k;

    i() {
        this.f۱۰۶h = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.f۱۰۲d = new h();
    }

    i(h state) {
        this.f۱۰۶h = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.f۱۰۲d = state;
        this.f۱۰۳e = a(this.f۱۰۳e, state.f۱۳۳c, state.f۱۳۴d);
    }

    public Drawable mutate() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f۱۰۵g && super.mutate() == this) {
            this.f۱۰۲d = new h(this.f۱۰۲d);
            this.f۱۰۵g = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public Object a(String name) {
        return this.f۱۰۲d.f۱۳۲b.p.get(name);
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new C۰۰۰۶i(drawable.getConstantState());
        }
        this.f۱۰۲d.f۱۳۱a = getChangingConfigurations();
        return this.f۱۰۲d;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.k);
        if (this.k.width() > 0 && this.k.height() > 0) {
            ColorFilter colorFilter = this.f۱۰۴f;
            if (colorFilter == null) {
                colorFilter = this.f۱۰۳e;
            }
            canvas.getMatrix(this.j);
            this.j.getValues(this.i);
            float canvasScaleX = Math.abs(this.i[0]);
            float canvasScaleY = Math.abs(this.i[4]);
            float canvasSkewX = Math.abs(this.i[1]);
            float canvasSkewY = Math.abs(this.i[3]);
            if (!(canvasSkewX == 0.0f && canvasSkewY == 0.0f)) {
                canvasScaleX = 1.0f;
                canvasScaleY = 1.0f;
            }
            int scaledWidth = Math.min(2048, (int) (((float) this.k.width()) * canvasScaleX));
            int scaledHeight = Math.min(2048, (int) (((float) this.k.height()) * canvasScaleY));
            if (scaledWidth > 0 && scaledHeight > 0) {
                int saveCount = canvas.save();
                Rect rect = this.k;
                canvas.translate((float) rect.left, (float) rect.top);
                if (a()) {
                    canvas.translate((float) this.k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.k.offsetTo(0, 0);
                this.f۱۰۲d.b(scaledWidth, scaledHeight);
                if (!this.f۱۰۶h) {
                    this.f۱۰۲d.c(scaledWidth, scaledHeight);
                } else if (!this.f۱۰۲d.a()) {
                    this.f۱۰۲d.c(scaledWidth, scaledHeight);
                    this.f۱۰۲d.d();
                }
                this.f۱۰۲d.a(canvas, colorFilter, this.k);
                canvas.restoreToCount(saveCount);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return android.support.v4.graphics.drawable.a.c(drawable);
        }
        return this.f۱۰۲d.f۱۳۲b.getRootAlpha();
    }

    public void setAlpha(int alpha) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        } else if (this.f۱۰۲d.f۱۳۲b.getRootAlpha() != alpha) {
            this.f۱۰۲d.f۱۳۲b.setRootAlpha(alpha);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f۱۰۴f = colorFilter;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter a(PorterDuffColorFilter tintFilter, ColorStateList tint, PorterDuff.Mode tintMode) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return new PorterDuffColorFilter(tint.getColorForState(getState(), 0), tintMode);
    }

    @Override // android.support.v4.graphics.drawable.b
    public void setTint(int tint) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.b(drawable, tint);
        } else {
            setTintList(ColorStateList.valueOf(tint));
        }
    }

    @Override // android.support.v4.graphics.drawable.b
    public void setTintList(ColorStateList tint) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, tint);
            return;
        }
        h state = this.f۱۰۲d;
        if (state.f۱۳۳c != tint) {
            state.f۱۳۳c = tint;
            this.f۱۰۳e = a(this.f۱۰۳e, tint, state.f۱۳۴d);
            invalidateSelf();
        }
    }

    @Override // android.support.v4.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode tintMode) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, tintMode);
            return;
        }
        h state = this.f۱۰۲d;
        if (state.f۱۳۴d != tintMode) {
            state.f۱۳۴d = tintMode;
            this.f۱۰۳e = a(this.f۱۰۳e, state.f۱۳۳c, tintMode);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f۱۰۲d) != null && (hVar.c() || ((colorStateList = this.f۱۰۲d.f۱۳۳c) != null && colorStateList.isStateful())));
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] stateSet) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.setState(stateSet);
        }
        boolean changed = false;
        h state = this.f۱۰۲d;
        ColorStateList colorStateList = state.f۱۳۳c;
        if (!(colorStateList == null || (mode = state.f۱۳۴d) == null)) {
            this.f۱۰۳e = a(this.f۱۰۳e, colorStateList, mode);
            invalidateSelf();
            changed = true;
        }
        if (!state.c() || !state.a(stateSet)) {
            return changed;
        }
        invalidateSelf();
        return true;
    }

    public int getOpacity() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f۱۰۲d.f۱۳۲b.i;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f۱۰۲d.f۱۳۲b.j;
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable == null) {
            return false;
        }
        android.support.v4.graphics.drawable.a.a(drawable);
        return false;
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return android.support.v4.graphics.drawable.a.f(drawable);
        }
        return this.f۱۰۲d.f۱۳۵e;
    }

    public void setAutoMirrored(boolean mirrored) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, mirrored);
        } else {
            this.f۱۰۲d.f۱۳۵e = mirrored;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037 A[Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c A[Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a.b.d.a.i a(android.content.res.Resources r7, int r8, android.content.res.Resources.Theme r9) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            a.b.d.a.i r0 = new a.b.d.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r1 = android.support.v4.content.e.f.a(r7, r8, r9)
            r0.f۱۰۱c = r1
            a.b.d.a.i$i r1 = new a.b.d.a.i$i
            android.graphics.drawable.Drawable r2 = r0.f۱۰۱c
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r1.<init>(r2)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r2 = r7.getXml(r8)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
        L_0x0029:
            int r4 = r2.next()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            r5 = r4
            r6 = 2
            if (r4 == r6) goto L_0x0035
            r4 = 1
            if (r5 == r4) goto L_0x0035
            goto L_0x0029
        L_0x0035:
            if (r5 != r6) goto L_0x003c
            a.b.d.a.i r0 = createFromXmlInner(r7, r2, r3, r9)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            return r0
        L_0x003c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            java.lang.String r6 = "No start tag found"
            r4.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            throw r4     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
        L_0x0044:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
            goto L_0x004e
        L_0x0049:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x004e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.d.a.i.a(android.content.res.Resources, int, android.content.res.Resources$Theme):a.b.d.a.i");
    }

    public static i createFromXmlInner(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        i drawable = new i();
        drawable.inflate(r, parser, attrs, theme);
        return drawable;
    }

    static int a(int color, float alpha) {
        return (color & 16777215) | (((int) (((float) Color.alpha(color)) * alpha)) << 24);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.inflate(res, parser, attrs);
        } else {
            inflate(res, parser, attrs, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, res, parser, attrs, theme);
            return;
        }
        h state = this.f۱۰۲d;
        state.f۱۳۲b = new g();
        TypedArray a2 = android.support.v4.content.e.g.a(res, theme, attrs, a.f۷۸a);
        a(a2, parser);
        a2.recycle();
        state.f۱۳۱a = getChangingConfigurations();
        state.k = true;
        a(res, parser, attrs, theme);
        this.f۱۰۳e = a(this.f۱۰۳e, state.f۱۳۳c, state.f۱۳۴d);
    }

    private static PorterDuff.Mode a(int value, PorterDuff.Mode defaultMode) {
        if (value == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (value == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (value == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (value) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return defaultMode;
        }
    }

    private void a(TypedArray a2, XmlPullParser parser) {
        h state = this.f۱۰۲d;
        g pathRenderer = state.f۱۳۲b;
        state.f۱۳۴d = a(android.support.v4.content.e.g.b(a2, parser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList tint = a2.getColorStateList(1);
        if (tint != null) {
            state.f۱۳۳c = tint;
        }
        state.f۱۳۵e = android.support.v4.content.e.g.a(a2, parser, "autoMirrored", 5, state.f۱۳۵e);
        pathRenderer.k = android.support.v4.content.e.g.a(a2, parser, "viewportWidth", 7, pathRenderer.k);
        pathRenderer.l = android.support.v4.content.e.g.a(a2, parser, "viewportHeight", 8, pathRenderer.l);
        if (pathRenderer.k <= 0.0f) {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (pathRenderer.l > 0.0f) {
            pathRenderer.i = a2.getDimension(3, pathRenderer.i);
            pathRenderer.j = a2.getDimension(2, pathRenderer.j);
            if (pathRenderer.i <= 0.0f) {
                throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (pathRenderer.j > 0.0f) {
                pathRenderer.setAlpha(android.support.v4.content.e.g.a(a2, parser, "alpha", 4, pathRenderer.getAlpha()));
                String name = a2.getString(0);
                if (name != null) {
                    pathRenderer.n = name;
                    pathRenderer.p.put(name, pathRenderer);
                }
            } else {
                throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    private void a(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        h state = this.f۱۰۲d;
        g pathRenderer = state.f۱۳۲b;
        boolean noPathTag = true;
        ArrayDeque<VectorDrawableCompat.VGroup> groupStack = new ArrayDeque<>();
        groupStack.push(pathRenderer.f۱۳۰h);
        int eventType = parser.getEventType();
        int innerDepth = parser.getDepth() + 1;
        for (int i2 = 1; eventType != i2 && (parser.getDepth() >= innerDepth || eventType != 3); i2 = 1) {
            if (eventType == 2) {
                String tagName = parser.getName();
                d currentGroup = (d) groupStack.peek();
                if ("path".equals(tagName)) {
                    c path = new c();
                    path.a(res, attrs, theme, parser);
                    currentGroup.f۱۱۳b.add(path);
                    if (path.getPathName() != null) {
                        pathRenderer.p.put(path.getPathName(), path);
                    }
                    noPathTag = false;
                    state.f۱۳۱a |= path.f۱۲۲c;
                } else if ("clip-path".equals(tagName)) {
                    b path2 = new b();
                    path2.a(res, attrs, theme, parser);
                    currentGroup.f۱۱۳b.add(path2);
                    if (path2.getPathName() != null) {
                        pathRenderer.p.put(path2.getPathName(), path2);
                    }
                    state.f۱۳۱a |= path2.f۱۲۲c;
                } else if ("group".equals(tagName)) {
                    d newChildGroup = new d();
                    newChildGroup.a(res, attrs, theme, parser);
                    currentGroup.f۱۱۳b.add(newChildGroup);
                    groupStack.push(newChildGroup);
                    if (newChildGroup.getGroupName() != null) {
                        pathRenderer.p.put(newChildGroup.getGroupName(), newChildGroup);
                    }
                    state.f۱۳۱a |= newChildGroup.k;
                }
            } else if (eventType == 3 && "group".equals(parser.getName())) {
                groupStack.pop();
            }
            eventType = parser.next();
        }
        if (noPathTag) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean allowCaching) {
        this.f۱۰۶h = allowCaching;
    }

    private boolean a() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || android.support.v4.graphics.drawable.a.e(this) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f۱۰۲d.getChangingConfigurations();
    }

    public void invalidateSelf() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable what, long when) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.scheduleSelf(what, when);
        } else {
            super.scheduleSelf(what, when);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.setVisible(visible, restart);
        }
        return super.setVisible(visible, restart);
    }

    public void unscheduleSelf(Runnable what) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.unscheduleSelf(what);
        } else {
            super.unscheduleSelf(what);
        }
    }

    /* renamed from: a.b.d.a.i$i  reason: collision with other inner class name */
    private static class C۰۰۰۶i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f۱۳۹a;

        public C۰۰۰۶i(Drawable.ConstantState state) {
            this.f۱۳۹a = state;
        }

        public Drawable newDrawable() {
            i drawableCompat = new i();
            drawableCompat.f۱۰۱c = (VectorDrawable) this.f۱۳۹a.newDrawable();
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res) {
            i drawableCompat = new i();
            drawableCompat.f۱۰۱c = (VectorDrawable) this.f۱۳۹a.newDrawable(res);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res, Resources.Theme theme) {
            i drawableCompat = new i();
            drawableCompat.f۱۰۱c = (VectorDrawable) this.f۱۳۹a.newDrawable(res, theme);
            return drawableCompat;
        }

        public boolean canApplyTheme() {
            return this.f۱۳۹a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f۱۳۹a.getChangingConfigurations();
        }
    }

    /* access modifiers changed from: private */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f۱۳۱a;

        /* renamed from: b  reason: collision with root package name */
        g f۱۳۲b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f۱۳۳c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f۱۳۴d;

        /* renamed from: e  reason: collision with root package name */
        boolean f۱۳۵e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f۱۳۶f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f۱۳۷g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f۱۳۸h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public h(h copy) {
            this.f۱۳۳c = null;
            this.f۱۳۴d = i.l;
            if (copy != null) {
                this.f۱۳۱a = copy.f۱۳۱a;
                this.f۱۳۲b = new g(copy.f۱۳۲b);
                Paint paint = copy.f۱۳۲b.f۱۲۷e;
                if (paint != null) {
                    this.f۱۳۲b.f۱۲۷e = new Paint(paint);
                }
                Paint paint2 = copy.f۱۳۲b.f۱۲۶d;
                if (paint2 != null) {
                    this.f۱۳۲b.f۱۲۶d = new Paint(paint2);
                }
                this.f۱۳۳c = copy.f۱۳۳c;
                this.f۱۳۴d = copy.f۱۳۴d;
                this.f۱۳۵e = copy.f۱۳۵e;
            }
        }

        public void a(Canvas canvas, ColorFilter filter, Rect originalBounds) {
            canvas.drawBitmap(this.f۱۳۶f, (Rect) null, originalBounds, a(filter));
        }

        public boolean b() {
            return this.f۱۳۲b.getRootAlpha() < 255;
        }

        public Paint a(ColorFilter filter) {
            if (!b() && filter == null) {
                return null;
            }
            if (this.l == null) {
                this.l = new Paint();
                this.l.setFilterBitmap(true);
            }
            this.l.setAlpha(this.f۱۳۲b.getRootAlpha());
            this.l.setColorFilter(filter);
            return this.l;
        }

        public void c(int width, int height) {
            this.f۱۳۶f.eraseColor(0);
            this.f۱۳۲b.a(new Canvas(this.f۱۳۶f), width, height, (ColorFilter) null);
        }

        public void b(int width, int height) {
            if (this.f۱۳۶f == null || !a(width, height)) {
                this.f۱۳۶f = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public boolean a(int width, int height) {
            if (width == this.f۱۳۶f.getWidth() && height == this.f۱۳۶f.getHeight()) {
                return true;
            }
            return false;
        }

        public boolean a() {
            if (!this.k && this.f۱۳۷g == this.f۱۳۳c && this.f۱۳۸h == this.f۱۳۴d && this.j == this.f۱۳۵e && this.i == this.f۱۳۲b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        public void d() {
            this.f۱۳۷g = this.f۱۳۳c;
            this.f۱۳۸h = this.f۱۳۴d;
            this.i = this.f۱۳۲b.getRootAlpha();
            this.j = this.f۱۳۵e;
            this.k = false;
        }

        public h() {
            this.f۱۳۳c = null;
            this.f۱۳۴d = i.l;
            this.f۱۳۲b = new g();
        }

        public Drawable newDrawable() {
            return new i(this);
        }

        public Drawable newDrawable(Resources res) {
            return new i(this);
        }

        public int getChangingConfigurations() {
            return this.f۱۳۱a;
        }

        public boolean c() {
            return this.f۱۳۲b.a();
        }

        public boolean a(int[] stateSet) {
            boolean changed = this.f۱۳۲b.a(stateSet);
            this.k |= changed;
            return changed;
        }
    }

    /* access modifiers changed from: private */
    public static class g {
        private static final Matrix q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f۱۲۳a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f۱۲۴b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f۱۲۵c;

        /* renamed from: d  reason: collision with root package name */
        Paint f۱۲۶d;

        /* renamed from: e  reason: collision with root package name */
        Paint f۱۲۷e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f۱۲۸f;

        /* renamed from: g  reason: collision with root package name */
        private int f۱۲۹g;

        /* renamed from: h  reason: collision with root package name */
        final d f۱۳۰h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final a.b.g.g.a<String, Object> p;

        public g() {
            this.f۱۲۵c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new a.b.g.g.a<>();
            this.f۱۳۰h = new d();
            this.f۱۲۳a = new Path();
            this.f۱۲۴b = new Path();
        }

        public void setRootAlpha(int alpha) {
            this.m = alpha;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float alpha) {
            setRootAlpha((int) (255.0f * alpha));
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public g(g copy) {
            this.f۱۲۵c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new a.b.g.g.a<>();
            this.f۱۳۰h = new d(copy.f۱۳۰h, this.p);
            this.f۱۲۳a = new Path(copy.f۱۲۳a);
            this.f۱۲۴b = new Path(copy.f۱۲۴b);
            this.i = copy.i;
            this.j = copy.j;
            this.k = copy.k;
            this.l = copy.l;
            this.f۱۲۹g = copy.f۱۲۹g;
            this.m = copy.m;
            this.n = copy.n;
            String str = copy.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = copy.o;
        }

        private void a(d currentGroup, Matrix currentMatrix, Canvas canvas, int w, int h2, ColorFilter filter) {
            currentGroup.f۱۱۲a.set(currentMatrix);
            currentGroup.f۱۱۲a.preConcat(currentGroup.j);
            canvas.save();
            for (int i2 = 0; i2 < currentGroup.f۱۱۳b.size(); i2++) {
                e child = currentGroup.f۱۱۳b.get(i2);
                if (child instanceof d) {
                    a((d) child, currentGroup.f۱۱۲a, canvas, w, h2, filter);
                } else if (child instanceof f) {
                    a(currentGroup, (f) child, canvas, w, h2, filter);
                }
            }
            canvas.restore();
        }

        public void a(Canvas canvas, int w, int h2, ColorFilter filter) {
            a(this.f۱۳۰h, q, canvas, w, h2, filter);
        }

        private void a(d vGroup, f vPath, Canvas canvas, int w, int h2, ColorFilter filter) {
            float len;
            float scaleX = ((float) w) / this.k;
            float scaleY = ((float) h2) / this.l;
            float minScale = Math.min(scaleX, scaleY);
            Matrix groupStackedMatrix = vGroup.f۱۱۲a;
            this.f۱۲۵c.set(groupStackedMatrix);
            this.f۱۲۵c.postScale(scaleX, scaleY);
            float matrixScale = a(groupStackedMatrix);
            if (matrixScale != 0.0f) {
                vPath.a(this.f۱۲۳a);
                Path path = this.f۱۲۳a;
                this.f۱۲۴b.reset();
                if (vPath.b()) {
                    this.f۱۲۴b.addPath(path, this.f۱۲۵c);
                    canvas.clipPath(this.f۱۲۴b);
                    return;
                }
                c fullPath = (c) vPath;
                if (fullPath.k != 0.0f || fullPath.l != 1.0f) {
                    float f2 = fullPath.k;
                    float f3 = fullPath.m;
                    float start = (f2 + f3) % 1.0f;
                    float end = (fullPath.l + f3) % 1.0f;
                    if (this.f۱۲۸f == null) {
                        this.f۱۲۸f = new PathMeasure();
                    }
                    this.f۱۲۸f.setPath(this.f۱۲۳a, false);
                    float len2 = this.f۱۲۸f.getLength();
                    float start2 = start * len2;
                    float end2 = end * len2;
                    path.reset();
                    if (start2 > end2) {
                        this.f۱۲۸f.getSegment(start2, len2, path, true);
                        len = 0.0f;
                        this.f۱۲۸f.getSegment(0.0f, end2, path, true);
                    } else {
                        len = 0.0f;
                        this.f۱۲۸f.getSegment(start2, end2, path, true);
                    }
                    path.rLineTo(len, len);
                }
                this.f۱۲۴b.addPath(path, this.f۱۲۵c);
                if (fullPath.f۱۱۰g.e()) {
                    android.support.v4.content.e.b fill = fullPath.f۱۱۰g;
                    if (this.f۱۲۷e == null) {
                        this.f۱۲۷e = new Paint(1);
                        this.f۱۲۷e.setStyle(Paint.Style.FILL);
                    }
                    Paint fillPaint = this.f۱۲۷e;
                    if (fill.c()) {
                        Shader shader = fill.b();
                        shader.setLocalMatrix(this.f۱۲۵c);
                        fillPaint.setShader(shader);
                        fillPaint.setAlpha(Math.round(fullPath.j * 255.0f));
                    } else {
                        fillPaint.setColor(i.a(fill.a(), fullPath.j));
                    }
                    fillPaint.setColorFilter(filter);
                    this.f۱۲۴b.setFillType(fullPath.i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f۱۲۴b, fillPaint);
                }
                if (fullPath.f۱۰۸e.e()) {
                    android.support.v4.content.e.b strokeColor = fullPath.f۱۰۸e;
                    if (this.f۱۲۶d == null) {
                        this.f۱۲۶d = new Paint(1);
                        this.f۱۲۶d.setStyle(Paint.Style.STROKE);
                    }
                    Paint strokePaint = this.f۱۲۶d;
                    Paint.Join join = fullPath.o;
                    if (join != null) {
                        strokePaint.setStrokeJoin(join);
                    }
                    Paint.Cap cap = fullPath.n;
                    if (cap != null) {
                        strokePaint.setStrokeCap(cap);
                    }
                    strokePaint.setStrokeMiter(fullPath.p);
                    if (strokeColor.c()) {
                        Shader shader2 = strokeColor.b();
                        shader2.setLocalMatrix(this.f۱۲۵c);
                        strokePaint.setShader(shader2);
                        strokePaint.setAlpha(Math.round(fullPath.f۱۱۱h * 255.0f));
                    } else {
                        strokePaint.setColor(i.a(strokeColor.a(), fullPath.f۱۱۱h));
                    }
                    strokePaint.setColorFilter(filter);
                    strokePaint.setStrokeWidth(fullPath.f۱۰۹f * minScale * matrixScale);
                    canvas.drawPath(this.f۱۲۴b, strokePaint);
                }
            }
        }

        private static float a(float v1x, float v1y, float v2x, float v2y) {
            return (v1x * v2y) - (v1y * v2x);
        }

        private float a(Matrix groupStackedMatrix) {
            float[] unitVectors = {0.0f, 1.0f, 1.0f, 0.0f};
            groupStackedMatrix.mapVectors(unitVectors);
            float crossProduct = a(unitVectors[0], unitVectors[1], unitVectors[2], unitVectors[3]);
            float maxScale = Math.max((float) Math.hypot((double) unitVectors[0], (double) unitVectors[1]), (float) Math.hypot((double) unitVectors[2], (double) unitVectors[3]));
            if (maxScale > 0.0f) {
                return Math.abs(crossProduct) / maxScale;
            }
            return 0.0f;
        }

        public boolean a() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.f۱۳۰h.a());
            }
            return this.o.booleanValue();
        }

        public boolean a(int[] stateSet) {
            return this.f۱۳۰h.a(stateSet);
        }
    }

    /* access modifiers changed from: private */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean a(int[] stateSet) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f۱۱۲a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f۱۱۳b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        float f۱۱۴c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        private float f۱۱۵d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        private float f۱۱۶e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        private float f۱۱۷f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        private float f۱۱۸g = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        private float f۱۱۹h = 0.0f;
        private float i = 0.0f;
        final Matrix j = new Matrix();
        int k;
        private int[] l;
        private String m = null;

        public d(d copy, a.b.g.g.a<String, Object> aVar) {
            super();
            f newPath;
            this.f۱۱۴c = copy.f۱۱۴c;
            this.f۱۱۵d = copy.f۱۱۵d;
            this.f۱۱۶e = copy.f۱۱۶e;
            this.f۱۱۷f = copy.f۱۱۷f;
            this.f۱۱۸g = copy.f۱۱۸g;
            this.f۱۱۹h = copy.f۱۱۹h;
            this.i = copy.i;
            this.l = copy.l;
            this.m = copy.m;
            this.k = copy.k;
            String str = this.m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.j.set(copy.j);
            ArrayList<VectorDrawableCompat.VObject> children = copy.f۱۱۳b;
            for (int i2 = 0; i2 < children.size(); i2++) {
                Object copyChild = children.get(i2);
                if (copyChild instanceof d) {
                    this.f۱۱۳b.add(new d((d) copyChild, aVar));
                } else {
                    if (copyChild instanceof c) {
                        newPath = new c((c) copyChild);
                    } else if (copyChild instanceof b) {
                        newPath = new b((b) copyChild);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f۱۱۳b.add(newPath);
                    String str2 = newPath.f۱۲۱b;
                    if (str2 != null) {
                        aVar.put(str2, newPath);
                    }
                }
            }
        }

        public d() {
            super();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public void a(Resources res, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            TypedArray a2 = android.support.v4.content.e.g.a(res, theme, attrs, a.f۷۹b);
            a(a2, parser);
            a2.recycle();
        }

        private void a(TypedArray a2, XmlPullParser parser) {
            this.l = null;
            this.f۱۱۴c = android.support.v4.content.e.g.a(a2, parser, "rotation", 5, this.f۱۱۴c);
            this.f۱۱۵d = a2.getFloat(1, this.f۱۱۵d);
            this.f۱۱۶e = a2.getFloat(2, this.f۱۱۶e);
            this.f۱۱۷f = android.support.v4.content.e.g.a(a2, parser, "scaleX", 3, this.f۱۱۷f);
            this.f۱۱۸g = android.support.v4.content.e.g.a(a2, parser, "scaleY", 4, this.f۱۱۸g);
            this.f۱۱۹h = android.support.v4.content.e.g.a(a2, parser, "translateX", 6, this.f۱۱۹h);
            this.i = android.support.v4.content.e.g.a(a2, parser, "translateY", 7, this.i);
            String groupName = a2.getString(0);
            if (groupName != null) {
                this.m = groupName;
            }
            b();
        }

        private void b() {
            this.j.reset();
            this.j.postTranslate(-this.f۱۱۵d, -this.f۱۱۶e);
            this.j.postScale(this.f۱۱۷f, this.f۱۱۸g);
            this.j.postRotate(this.f۱۱۴c, 0.0f, 0.0f);
            this.j.postTranslate(this.f۱۱۹h + this.f۱۱۵d, this.i + this.f۱۱۶e);
        }

        public float getRotation() {
            return this.f۱۱۴c;
        }

        public void setRotation(float rotation) {
            if (rotation != this.f۱۱۴c) {
                this.f۱۱۴c = rotation;
                b();
            }
        }

        public float getPivotX() {
            return this.f۱۱۵d;
        }

        public void setPivotX(float pivotX) {
            if (pivotX != this.f۱۱۵d) {
                this.f۱۱۵d = pivotX;
                b();
            }
        }

        public float getPivotY() {
            return this.f۱۱۶e;
        }

        public void setPivotY(float pivotY) {
            if (pivotY != this.f۱۱۶e) {
                this.f۱۱۶e = pivotY;
                b();
            }
        }

        public float getScaleX() {
            return this.f۱۱۷f;
        }

        public void setScaleX(float scaleX) {
            if (scaleX != this.f۱۱۷f) {
                this.f۱۱۷f = scaleX;
                b();
            }
        }

        public float getScaleY() {
            return this.f۱۱۸g;
        }

        public void setScaleY(float scaleY) {
            if (scaleY != this.f۱۱۸g) {
                this.f۱۱۸g = scaleY;
                b();
            }
        }

        public float getTranslateX() {
            return this.f۱۱۹h;
        }

        public void setTranslateX(float translateX) {
            if (translateX != this.f۱۱۹h) {
                this.f۱۱۹h = translateX;
                b();
            }
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setTranslateY(float translateY) {
            if (translateY != this.i) {
                this.i = translateY;
                b();
            }
        }

        @Override // a.b.d.a.i.e
        public boolean a() {
            for (int i2 = 0; i2 < this.f۱۱۳b.size(); i2++) {
                if (this.f۱۱۳b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // a.b.d.a.i.e
        public boolean a(int[] stateSet) {
            boolean changed = false;
            for (int i2 = 0; i2 < this.f۱۱۳b.size(); i2++) {
                changed |= this.f۱۱۳b.get(i2).a(stateSet);
            }
            return changed;
        }
    }

    /* access modifiers changed from: private */
    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected b.C۰۰۱۱b[] f۱۲۰a = null;

        /* renamed from: b  reason: collision with root package name */
        String f۱۲۱b;

        /* renamed from: c  reason: collision with root package name */
        int f۱۲۲c;

        public f() {
            super();
        }

        public f(f copy) {
            super();
            this.f۱۲۱b = copy.f۱۲۱b;
            this.f۱۲۲c = copy.f۱۲۲c;
            this.f۱۲۰a = a.b.g.a.b.a(copy.f۱۲۰a);
        }

        public void a(Path path) {
            path.reset();
            b.C۰۰۱۱b[] bVarArr = this.f۱۲۰a;
            if (bVarArr != null) {
                b.C۰۰۱۱b.a(bVarArr, path);
            }
        }

        public String getPathName() {
            return this.f۱۲۱b;
        }

        public boolean b() {
            return false;
        }

        public b.C۰۰۱۱b[] getPathData() {
            return this.f۱۲۰a;
        }

        public void setPathData(b.C۰۰۱۱b[] nodes) {
            if (!a.b.g.a.b.a(this.f۱۲۰a, nodes)) {
                this.f۱۲۰a = a.b.g.a.b.a(nodes);
            } else {
                a.b.g.a.b.b(this.f۱۲۰a, nodes);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class b extends f {
        public b() {
        }

        public b(b copy) {
            super(copy);
        }

        public void a(Resources r, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            if (android.support.v4.content.e.g.a(parser, "pathData")) {
                TypedArray a2 = android.support.v4.content.e.g.a(r, theme, attrs, a.f۸۱d);
                a(a2);
                a2.recycle();
            }
        }

        private void a(TypedArray a2) {
            String pathName = a2.getString(0);
            if (pathName != null) {
                this.f۱۲۱b = pathName;
            }
            String pathData = a2.getString(1);
            if (pathData != null) {
                this.f۱۲۰a = a.b.g.a.b.a(pathData);
            }
        }

        @Override // a.b.d.a.i.f
        public boolean b() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static class c extends f {

        /* renamed from: d  reason: collision with root package name */
        private int[] f۱۰۷d;

        /* renamed from: e  reason: collision with root package name */
        android.support.v4.content.e.b f۱۰۸e;

        /* renamed from: f  reason: collision with root package name */
        float f۱۰۹f = 0.0f;

        /* renamed from: g  reason: collision with root package name */
        android.support.v4.content.e.b f۱۱۰g;

        /* renamed from: h  reason: collision with root package name */
        float f۱۱۱h = 1.0f;
        int i = 0;
        float j = 1.0f;
        float k = 0.0f;
        float l = 1.0f;
        float m = 0.0f;
        Paint.Cap n = Paint.Cap.BUTT;
        Paint.Join o = Paint.Join.MITER;
        float p = 4.0f;

        public c() {
        }

        public c(c copy) {
            super(copy);
            this.f۱۰۷d = copy.f۱۰۷d;
            this.f۱۰۸e = copy.f۱۰۸e;
            this.f۱۰۹f = copy.f۱۰۹f;
            this.f۱۱۱h = copy.f۱۱۱h;
            this.f۱۱۰g = copy.f۱۱۰g;
            this.i = copy.i;
            this.j = copy.j;
            this.k = copy.k;
            this.l = copy.l;
            this.m = copy.m;
            this.n = copy.n;
            this.o = copy.o;
            this.p = copy.p;
        }

        private Paint.Cap a(int id, Paint.Cap defValue) {
            if (id == 0) {
                return Paint.Cap.BUTT;
            }
            if (id == 1) {
                return Paint.Cap.ROUND;
            }
            if (id != 2) {
                return defValue;
            }
            return Paint.Cap.SQUARE;
        }

        private Paint.Join a(int id, Paint.Join defValue) {
            if (id == 0) {
                return Paint.Join.MITER;
            }
            if (id == 1) {
                return Paint.Join.ROUND;
            }
            if (id != 2) {
                return defValue;
            }
            return Paint.Join.BEVEL;
        }

        public void a(Resources r, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            TypedArray a2 = android.support.v4.content.e.g.a(r, theme, attrs, a.f۸۰c);
            a(a2, parser, theme);
            a2.recycle();
        }

        private void a(TypedArray a2, XmlPullParser parser, Resources.Theme theme) {
            this.f۱۰۷d = null;
            if (android.support.v4.content.e.g.a(parser, "pathData")) {
                String pathName = a2.getString(0);
                if (pathName != null) {
                    this.f۱۲۱b = pathName;
                }
                String pathData = a2.getString(2);
                if (pathData != null) {
                    this.f۱۲۰a = a.b.g.a.b.a(pathData);
                }
                this.f۱۱۰g = android.support.v4.content.e.g.a(a2, parser, theme, "fillColor", 1, 0);
                this.j = android.support.v4.content.e.g.a(a2, parser, "fillAlpha", 12, this.j);
                this.n = a(android.support.v4.content.e.g.b(a2, parser, "strokeLineCap", 8, -1), this.n);
                this.o = a(android.support.v4.content.e.g.b(a2, parser, "strokeLineJoin", 9, -1), this.o);
                this.p = android.support.v4.content.e.g.a(a2, parser, "strokeMiterLimit", 10, this.p);
                this.f۱۰۸e = android.support.v4.content.e.g.a(a2, parser, theme, "strokeColor", 3, 0);
                this.f۱۱۱h = android.support.v4.content.e.g.a(a2, parser, "strokeAlpha", 11, this.f۱۱۱h);
                this.f۱۰۹f = android.support.v4.content.e.g.a(a2, parser, "strokeWidth", 4, this.f۱۰۹f);
                this.l = android.support.v4.content.e.g.a(a2, parser, "trimPathEnd", 6, this.l);
                this.m = android.support.v4.content.e.g.a(a2, parser, "trimPathOffset", 7, this.m);
                this.k = android.support.v4.content.e.g.a(a2, parser, "trimPathStart", 5, this.k);
                this.i = android.support.v4.content.e.g.b(a2, parser, "fillType", 13, this.i);
            }
        }

        @Override // a.b.d.a.i.e
        public boolean a() {
            return this.f۱۱۰g.d() || this.f۱۰۸e.d();
        }

        @Override // a.b.d.a.i.e
        public boolean a(int[] stateSet) {
            return this.f۱۱۰g.a(stateSet) | this.f۱۰۸e.a(stateSet);
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f۱۰۸e.a();
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int strokeColor) {
            this.f۱۰۸e.a(strokeColor);
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f۱۰۹f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float strokeWidth) {
            this.f۱۰۹f = strokeWidth;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f۱۱۱h;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float strokeAlpha) {
            this.f۱۱۱h = strokeAlpha;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f۱۱۰g.a();
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int fillColor) {
            this.f۱۱۰g.a(fillColor);
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.j;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float fillAlpha) {
            this.j = fillAlpha;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.k;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float trimPathStart) {
            this.k = trimPathStart;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.l;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float trimPathEnd) {
            this.l = trimPathEnd;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float trimPathOffset) {
            this.m = trimPathOffset;
        }
    }
}
