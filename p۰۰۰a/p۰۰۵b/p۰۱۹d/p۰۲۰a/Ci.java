package p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a;

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
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Cb;

/* renamed from: a.b.d.a.i  reason: invalid class name */
public class Ci extends AbstractCh {

    /* renamed from: l  reason: contains not printable characters */
    static final PorterDuff.Mode f۸۳۵۷l = PorterDuff.Mode.SRC_IN;

    /* renamed from: d  reason: contains not printable characters */
    private Ch f۸۳۵۸d;

    /* renamed from: e  reason: contains not printable characters */
    private PorterDuffColorFilter f۸۳۵۹e;

    /* renamed from: f  reason: contains not printable characters */
    private ColorFilter f۸۳۶۰f;

    /* renamed from: g  reason: contains not printable characters */
    private boolean f۸۳۶۱g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۸۳۶۲h;

    /* renamed from: i  reason: contains not printable characters */
    private final float[] f۸۳۶۳i;

    /* renamed from: j  reason: contains not printable characters */
    private final Matrix f۸۳۶۴j;

    /* renamed from: k  reason: contains not printable characters */
    private final Rect f۸۳۶۵k;

    Ci() {
        this.f۸۳۶۲h = true;
        this.f۸۳۶۳i = new float[9];
        this.f۸۳۶۴j = new Matrix();
        this.f۸۳۶۵k = new Rect();
        this.f۸۳۵۸d = new Ch();
    }

    Ci(Ch state) {
        this.f۸۳۶۲h = true;
        this.f۸۳۶۳i = new float[9];
        this.f۸۳۶۴j = new Matrix();
        this.f۸۳۶۵k = new Rect();
        this.f۸۳۵۸d = state;
        this.f۸۳۵۹e = m۱۰۰۷۳a(this.f۸۳۵۹e, state.f۸۴۱۴c, state.f۸۴۱۵d);
    }

    public Drawable mutate() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f۸۳۶۱g && super.mutate() == this) {
            this.f۸۳۵۸d = new Ch(this.f۸۳۵۸d);
            this.f۸۳۶۱g = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۰۰۷۴a(String name) {
        return this.f۸۳۵۸d.f۸۴۱۳b.f۸۴۱۱p.get(name);
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new Ci(drawable.getConstantState());
        }
        this.f۸۳۵۸d.f۸۴۱۲a = getChangingConfigurations();
        return this.f۸۳۵۸d;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f۸۳۶۵k);
        if (this.f۸۳۶۵k.width() > 0 && this.f۸۳۶۵k.height() > 0) {
            ColorFilter colorFilter = this.f۸۳۶۰f;
            if (colorFilter == null) {
                colorFilter = this.f۸۳۵۹e;
            }
            canvas.getMatrix(this.f۸۳۶۴j);
            this.f۸۳۶۴j.getValues(this.f۸۳۶۳i);
            float canvasScaleX = Math.abs(this.f۸۳۶۳i[0]);
            float canvasScaleY = Math.abs(this.f۸۳۶۳i[4]);
            float canvasSkewX = Math.abs(this.f۸۳۶۳i[1]);
            float canvasSkewY = Math.abs(this.f۸۳۶۳i[3]);
            if (!(canvasSkewX == 0.0f && canvasSkewY == 0.0f)) {
                canvasScaleX = 1.0f;
                canvasScaleY = 1.0f;
            }
            int scaledWidth = Math.min(2048, (int) (((float) this.f۸۳۶۵k.width()) * canvasScaleX));
            int scaledHeight = Math.min(2048, (int) (((float) this.f۸۳۶۵k.height()) * canvasScaleY));
            if (scaledWidth > 0 && scaledHeight > 0) {
                int saveCount = canvas.save();
                Rect rect = this.f۸۳۶۵k;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m۱۰۰۷۲a()) {
                    canvas.translate((float) this.f۸۳۶۵k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f۸۳۶۵k.offsetTo(0, 0);
                this.f۸۳۵۸d.m۱۰۱۰۶b(scaledWidth, scaledHeight);
                if (!this.f۸۳۶۲h) {
                    this.f۸۳۵۸d.m۱۰۱۰۸c(scaledWidth, scaledHeight);
                } else if (!this.f۸۳۵۸d.m۱۰۱۰۳a()) {
                    this.f۸۳۵۸d.m۱۰۱۰۸c(scaledWidth, scaledHeight);
                    this.f۸۳۵۸d.m۱۰۱۱۰d();
                }
                this.f۸۳۵۸d.m۱۰۱۰۲a(canvas, colorFilter, this.f۸۳۶۵k);
                canvas.restoreToCount(saveCount);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۷c(drawable);
        }
        return this.f۸۳۵۸d.f۸۴۱۳b.getRootAlpha();
    }

    public void setAlpha(int alpha) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        } else if (this.f۸۳۵۸d.f۸۴۱۳b.getRootAlpha() != alpha) {
            this.f۸۳۵۸d.f۸۴۱۳b.setRootAlpha(alpha);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f۸۳۶۰f = colorFilter;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public PorterDuffColorFilter m۱۰۰۷۳a(PorterDuffColorFilter tintFilter, ColorStateList tint, PorterDuff.Mode tintMode) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return new PorterDuffColorFilter(tint.getColorForState(getState(), 0), tintMode);
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCb
    public void setTint(int tint) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۶b(drawable, tint);
        } else {
            setTintList(ColorStateList.valueOf(tint));
        }
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCb
    public void setTintList(ColorStateList tint) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(drawable, tint);
            return;
        }
        Ch state = this.f۸۳۵۸d;
        if (state.f۸۴۱۴c != tint) {
            state.f۸۴۱۴c = tint;
            this.f۸۳۵۹e = m۱۰۰۷۳a(this.f۸۳۵۹e, tint, state.f۸۴۱۵d);
            invalidateSelf();
        }
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCb
    public void setTintMode(PorterDuff.Mode tintMode) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(drawable, tintMode);
            return;
        }
        Ch state = this.f۸۳۵۸d;
        if (state.f۸۴۱۵d != tintMode) {
            state.f۸۴۱۵d = tintMode;
            this.f۸۳۵۹e = m۱۰۰۷۳a(this.f۸۳۵۹e, state.f۸۴۱۴c, tintMode);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        Ch hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f۸۳۵۸d) != null && (hVar.m۱۰۱۰۹c() || ((colorStateList = this.f۸۳۵۸d.f۸۴۱۴c) != null && colorStateList.isStateful())));
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] stateSet) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.setState(stateSet);
        }
        boolean changed = false;
        Ch state = this.f۸۳۵۸d;
        ColorStateList colorStateList = state.f۸۴۱۴c;
        if (!(colorStateList == null || (mode = state.f۸۴۱۵d) == null)) {
            this.f۸۳۵۹e = m۱۰۰۷۳a(this.f۸۳۵۹e, colorStateList, mode);
            invalidateSelf();
            changed = true;
        }
        if (!state.m۱۰۱۰۹c() || !state.m۱۰۱۰۵a(stateSet)) {
            return changed;
        }
        invalidateSelf();
        return true;
    }

    public int getOpacity() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f۸۳۵۸d.f۸۴۱۳b.f۸۴۰۴i;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f۸۳۵۸d.f۸۴۱۳b.f۸۴۰۵j;
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable == null) {
            return false;
        }
        android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۳a(drawable);
        return false;
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۰f(drawable);
        }
        return this.f۸۳۵۸d.f۸۴۱۶e;
    }

    public void setAutoMirrored(boolean mirrored) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۲a(drawable, mirrored);
        } else {
            this.f۸۳۵۸d.f۸۴۱۶e = mirrored;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037 A[Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c A[Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }] */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Ci m۱۰۰۶۸a(android.content.res.Resources r7, int r8, android.content.res.Resources.Theme r9) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            a.b.d.a.i r0 = new a.b.d.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r1 = android.support.p۰۴۳v4.content.p۰۴۴e.Cf.m۱۲۶۸۴a(r7, r8, r9)
            r0.f۸۳۵۶c = r1
            a.b.d.a.i$i r1 = new a.b.d.a.i$i
            android.graphics.drawable.Drawable r2 = r0.f۸۳۵۶c
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
        throw new UnsupportedOperationException("Method not decompiled: p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Ci.m۱۰۰۶۸a(android.content.res.Resources, int, android.content.res.Resources$Theme):a.b.d.a.i");
    }

    public static Ci createFromXmlInner(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Ci drawable = new Ci();
        drawable.inflate(r, parser, attrs, theme);
        return drawable;
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۰۰۶۷a(int color, float alpha) {
        return (color & 16777215) | (((int) (((float) Color.alpha(color)) * alpha)) << 24);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.inflate(res, parser, attrs);
        } else {
            inflate(res, parser, attrs, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۰a(drawable, res, parser, attrs, theme);
            return;
        }
        Ch state = this.f۸۳۵۸d;
        state.f۸۴۱۳b = new Cg();
        TypedArray a = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۹۱a(res, theme, attrs, Ca.f۸۳۲۹a);
        m۱۰۰۷۱a(a, parser);
        a.recycle();
        state.f۸۴۱۲a = getChangingConfigurations();
        state.f۸۴۲۲k = true;
        m۱۰۰۷۰a(res, parser, attrs, theme);
        this.f۸۳۵۹e = m۱۰۰۷۳a(this.f۸۳۵۹e, state.f۸۴۱۴c, state.f۸۴۱۵d);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static PorterDuff.Mode m۱۰۰۶۹a(int value, PorterDuff.Mode defaultMode) {
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

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۰۷۱a(TypedArray a, XmlPullParser parser) {
        Ch state = this.f۸۳۵۸d;
        Cg pathRenderer = state.f۸۴۱۳b;
        state.f۸۴۱۵d = m۱۰۰۶۹a(android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۹۶b(a, parser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList tint = a.getColorStateList(1);
        if (tint != null) {
            state.f۸۴۱۴c = tint;
        }
        state.f۸۴۱۶e = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۹۴a(a, parser, "autoMirrored", 5, state.f۸۴۱۶e);
        pathRenderer.f۸۴۰۶k = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "viewportWidth", 7, pathRenderer.f۸۴۰۶k);
        pathRenderer.f۸۴۰۷l = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "viewportHeight", 8, pathRenderer.f۸۴۰۷l);
        if (pathRenderer.f۸۴۰۶k <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (pathRenderer.f۸۴۰۷l > 0.0f) {
            pathRenderer.f۸۴۰۴i = a.getDimension(3, pathRenderer.f۸۴۰۴i);
            pathRenderer.f۸۴۰۵j = a.getDimension(2, pathRenderer.f۸۴۰۵j);
            if (pathRenderer.f۸۴۰۴i <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (pathRenderer.f۸۴۰۵j > 0.0f) {
                pathRenderer.setAlpha(android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "alpha", 4, pathRenderer.getAlpha()));
                String name = a.getString(0);
                if (name != null) {
                    pathRenderer.f۸۴۰۹n = name;
                    pathRenderer.f۸۴۱۱p.put(name, pathRenderer);
                }
            } else {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۰۷۰a(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Ch state = this.f۸۳۵۸d;
        Cg pathRenderer = state.f۸۴۱۳b;
        boolean noPathTag = true;
        ArrayDeque<VectorDrawableCompat.VGroup> groupStack = new ArrayDeque<>();
        groupStack.push(pathRenderer.f۸۴۰۳h);
        int eventType = parser.getEventType();
        int innerDepth = parser.getDepth() + 1;
        for (int i = 1; eventType != i && (parser.getDepth() >= innerDepth || eventType != 3); i = 1) {
            if (eventType == 2) {
                String tagName = parser.getName();
                Cd currentGroup = (Cd) groupStack.peek();
                if ("path".equals(tagName)) {
                    Cc path = new Cc();
                    path.m۱۰۰۸۲a(res, attrs, theme, parser);
                    currentGroup.f۸۳۸۰b.add(path);
                    if (path.getPathName() != null) {
                        pathRenderer.f۸۴۱۱p.put(path.getPathName(), path);
                    }
                    noPathTag = false;
                    state.f۸۴۱۲a |= path.f۸۳۹۴c;
                } else if ("clip-path".equals(tagName)) {
                    Cb path2 = new Cb();
                    path2.m۱۰۰۷۷a(res, attrs, theme, parser);
                    currentGroup.f۸۳۸۰b.add(path2);
                    if (path2.getPathName() != null) {
                        pathRenderer.f۸۴۱۱p.put(path2.getPathName(), path2);
                    }
                    state.f۸۴۱۲a |= path2.f۸۳۹۴c;
                } else if ("group".equals(tagName)) {
                    Cd newChildGroup = new Cd();
                    newChildGroup.m۱۰۰۸۷a(res, attrs, theme, parser);
                    currentGroup.f۸۳۸۰b.add(newChildGroup);
                    groupStack.push(newChildGroup);
                    if (newChildGroup.getGroupName() != null) {
                        pathRenderer.f۸۴۱۱p.put(newChildGroup.getGroupName(), newChildGroup);
                    }
                    state.f۸۴۱۲a |= newChildGroup.f۸۳۸۹k;
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
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۰۷۵a(boolean allowCaching) {
        this.f۸۳۶۲h = allowCaching;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۰۰۷۲a() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۹e(this) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f۸۳۵۸d.getChangingConfigurations();
    }

    public void invalidateSelf() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable what, long when) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.scheduleSelf(what, when);
        } else {
            super.scheduleSelf(what, when);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.setVisible(visible, restart);
        }
        return super.setVisible(visible, restart);
    }

    public void unscheduleSelf(Runnable what) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.unscheduleSelf(what);
        } else {
            super.unscheduleSelf(what);
        }
    }

    /* renamed from: a.b.d.a.i$i  reason: invalid class name */
    private static class Ci extends Drawable.ConstantState {

        /* renamed from: a  reason: contains not printable characters */
        private final Drawable.ConstantState f۸۴۲۴a;

        public Ci(Drawable.ConstantState state) {
            this.f۸۴۲۴a = state;
        }

        public Drawable newDrawable() {
            Ci drawableCompat = new Ci();
            drawableCompat.f۸۳۵۶c = (VectorDrawable) this.f۸۴۲۴a.newDrawable();
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res) {
            Ci drawableCompat = new Ci();
            drawableCompat.f۸۳۵۶c = (VectorDrawable) this.f۸۴۲۴a.newDrawable(res);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res, Resources.Theme theme) {
            Ci drawableCompat = new Ci();
            drawableCompat.f۸۳۵۶c = (VectorDrawable) this.f۸۴۲۴a.newDrawable(res, theme);
            return drawableCompat;
        }

        public boolean canApplyTheme() {
            return this.f۸۴۲۴a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f۸۴۲۴a.getChangingConfigurations();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.d.a.i$h  reason: invalid class name */
    public static class Ch extends Drawable.ConstantState {

        /* renamed from: a  reason: contains not printable characters */
        int f۸۴۱۲a;

        /* renamed from: b  reason: contains not printable characters */
        Cg f۸۴۱۳b;

        /* renamed from: c  reason: contains not printable characters */
        ColorStateList f۸۴۱۴c;

        /* renamed from: d  reason: contains not printable characters */
        PorterDuff.Mode f۸۴۱۵d;

        /* renamed from: e  reason: contains not printable characters */
        boolean f۸۴۱۶e;

        /* renamed from: f  reason: contains not printable characters */
        Bitmap f۸۴۱۷f;

        /* renamed from: g  reason: contains not printable characters */
        ColorStateList f۸۴۱۸g;

        /* renamed from: h  reason: contains not printable characters */
        PorterDuff.Mode f۸۴۱۹h;

        /* renamed from: i  reason: contains not printable characters */
        int f۸۴۲۰i;

        /* renamed from: j  reason: contains not printable characters */
        boolean f۸۴۲۱j;

        /* renamed from: k  reason: contains not printable characters */
        boolean f۸۴۲۲k;

        /* renamed from: l  reason: contains not printable characters */
        Paint f۸۴۲۳l;

        public Ch(Ch copy) {
            this.f۸۴۱۴c = null;
            this.f۸۴۱۵d = Ci.f۸۳۵۷l;
            if (copy != null) {
                this.f۸۴۱۲a = copy.f۸۴۱۲a;
                this.f۸۴۱۳b = new Cg(copy.f۸۴۱۳b);
                Paint paint = copy.f۸۴۱۳b.f۸۴۰۰e;
                if (paint != null) {
                    this.f۸۴۱۳b.f۸۴۰۰e = new Paint(paint);
                }
                Paint paint2 = copy.f۸۴۱۳b.f۸۳۹۹d;
                if (paint2 != null) {
                    this.f۸۴۱۳b.f۸۳۹۹d = new Paint(paint2);
                }
                this.f۸۴۱۴c = copy.f۸۴۱۴c;
                this.f۸۴۱۵d = copy.f۸۴۱۵d;
                this.f۸۴۱۶e = copy.f۸۴۱۶e;
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۱۰۲a(Canvas canvas, ColorFilter filter, Rect originalBounds) {
            canvas.drawBitmap(this.f۸۴۱۷f, (Rect) null, originalBounds, m۱۰۱۰۱a(filter));
        }

        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۰۱۰۷b() {
            return this.f۸۴۱۳b.getRootAlpha() < 255;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Paint m۱۰۱۰۱a(ColorFilter filter) {
            if (!m۱۰۱۰۷b() && filter == null) {
                return null;
            }
            if (this.f۸۴۲۳l == null) {
                this.f۸۴۲۳l = new Paint();
                this.f۸۴۲۳l.setFilterBitmap(true);
            }
            this.f۸۴۲۳l.setAlpha(this.f۸۴۱۳b.getRootAlpha());
            this.f۸۴۲۳l.setColorFilter(filter);
            return this.f۸۴۲۳l;
        }

        /* renamed from: c  reason: contains not printable characters */
        public void m۱۰۱۰۸c(int width, int height) {
            this.f۸۴۱۷f.eraseColor(0);
            this.f۸۴۱۳b.m۱۰۰۹۸a(new Canvas(this.f۸۴۱۷f), width, height, (ColorFilter) null);
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۱۰۶b(int width, int height) {
            if (this.f۸۴۱۷f == null || !m۱۰۱۰۴a(width, height)) {
                this.f۸۴۱۷f = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f۸۴۲۲k = true;
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۱۰۴a(int width, int height) {
            if (width == this.f۸۴۱۷f.getWidth() && height == this.f۸۴۱۷f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۱۰۳a() {
            if (!this.f۸۴۲۲k && this.f۸۴۱۸g == this.f۸۴۱۴c && this.f۸۴۱۹h == this.f۸۴۱۵d && this.f۸۴۲۱j == this.f۸۴۱۶e && this.f۸۴۲۰i == this.f۸۴۱۳b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: d  reason: contains not printable characters */
        public void m۱۰۱۱۰d() {
            this.f۸۴۱۸g = this.f۸۴۱۴c;
            this.f۸۴۱۹h = this.f۸۴۱۵d;
            this.f۸۴۲۰i = this.f۸۴۱۳b.getRootAlpha();
            this.f۸۴۲۱j = this.f۸۴۱۶e;
            this.f۸۴۲۲k = false;
        }

        public Ch() {
            this.f۸۴۱۴c = null;
            this.f۸۴۱۵d = Ci.f۸۳۵۷l;
            this.f۸۴۱۳b = new Cg();
        }

        public Drawable newDrawable() {
            return new Ci(this);
        }

        public Drawable newDrawable(Resources res) {
            return new Ci(this);
        }

        public int getChangingConfigurations() {
            return this.f۸۴۱۲a;
        }

        /* renamed from: c  reason: contains not printable characters */
        public boolean m۱۰۱۰۹c() {
            return this.f۸۴۱۳b.m۱۰۰۹۹a();
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۱۰۵a(int[] stateSet) {
            boolean changed = this.f۸۴۱۳b.m۱۰۱۰۰a(stateSet);
            this.f۸۴۲۲k |= changed;
            return changed;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.d.a.i$g  reason: invalid class name */
    public static class Cg {

        /* renamed from: q  reason: contains not printable characters */
        private static final Matrix f۸۳۹۵q = new Matrix();

        /* renamed from: a  reason: contains not printable characters */
        private final Path f۸۳۹۶a;

        /* renamed from: b  reason: contains not printable characters */
        private final Path f۸۳۹۷b;

        /* renamed from: c  reason: contains not printable characters */
        private final Matrix f۸۳۹۸c;

        /* renamed from: d  reason: contains not printable characters */
        Paint f۸۳۹۹d;

        /* renamed from: e  reason: contains not printable characters */
        Paint f۸۴۰۰e;

        /* renamed from: f  reason: contains not printable characters */
        private PathMeasure f۸۴۰۱f;

        /* renamed from: g  reason: contains not printable characters */
        private int f۸۴۰۲g;

        /* renamed from: h  reason: contains not printable characters */
        final Cd f۸۴۰۳h;

        /* renamed from: i  reason: contains not printable characters */
        float f۸۴۰۴i;

        /* renamed from: j  reason: contains not printable characters */
        float f۸۴۰۵j;

        /* renamed from: k  reason: contains not printable characters */
        float f۸۴۰۶k;

        /* renamed from: l  reason: contains not printable characters */
        float f۸۴۰۷l;

        /* renamed from: m  reason: contains not printable characters */
        int f۸۴۰۸m;

        /* renamed from: n  reason: contains not printable characters */
        String f۸۴۰۹n;

        /* renamed from: o  reason: contains not printable characters */
        Boolean f۸۴۱۰o;

        /* renamed from: p  reason: contains not printable characters */
        final p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<String, Object> f۸۴۱۱p;

        public Cg() {
            this.f۸۳۹۸c = new Matrix();
            this.f۸۴۰۴i = 0.0f;
            this.f۸۴۰۵j = 0.0f;
            this.f۸۴۰۶k = 0.0f;
            this.f۸۴۰۷l = 0.0f;
            this.f۸۴۰۸m = 255;
            this.f۸۴۰۹n = null;
            this.f۸۴۱۰o = null;
            this.f۸۴۱۱p = new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<>();
            this.f۸۴۰۳h = new Cd();
            this.f۸۳۹۶a = new Path();
            this.f۸۳۹۷b = new Path();
        }

        public void setRootAlpha(int alpha) {
            this.f۸۴۰۸m = alpha;
        }

        public int getRootAlpha() {
            return this.f۸۴۰۸m;
        }

        public void setAlpha(float alpha) {
            setRootAlpha((int) (255.0f * alpha));
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public Cg(Cg copy) {
            this.f۸۳۹۸c = new Matrix();
            this.f۸۴۰۴i = 0.0f;
            this.f۸۴۰۵j = 0.0f;
            this.f۸۴۰۶k = 0.0f;
            this.f۸۴۰۷l = 0.0f;
            this.f۸۴۰۸m = 255;
            this.f۸۴۰۹n = null;
            this.f۸۴۱۰o = null;
            this.f۸۴۱۱p = new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<>();
            this.f۸۴۰۳h = new Cd(copy.f۸۴۰۳h, this.f۸۴۱۱p);
            this.f۸۳۹۶a = new Path(copy.f۸۳۹۶a);
            this.f۸۳۹۷b = new Path(copy.f۸۳۹۷b);
            this.f۸۴۰۴i = copy.f۸۴۰۴i;
            this.f۸۴۰۵j = copy.f۸۴۰۵j;
            this.f۸۴۰۶k = copy.f۸۴۰۶k;
            this.f۸۴۰۷l = copy.f۸۴۰۷l;
            this.f۸۴۰۲g = copy.f۸۴۰۲g;
            this.f۸۴۰۸m = copy.f۸۴۰۸m;
            this.f۸۴۰۹n = copy.f۸۴۰۹n;
            String str = copy.f۸۴۰۹n;
            if (str != null) {
                this.f۸۴۱۱p.put(str, this);
            }
            this.f۸۴۱۰o = copy.f۸۴۱۰o;
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۰۹۷a(Cd currentGroup, Matrix currentMatrix, Canvas canvas, int w, int h, ColorFilter filter) {
            currentGroup.f۸۳۷۹a.set(currentMatrix);
            currentGroup.f۸۳۷۹a.preConcat(currentGroup.f۸۳۸۸j);
            canvas.save();
            for (int i = 0; i < currentGroup.f۸۳۸۰b.size(); i++) {
                AbstractCe child = currentGroup.f۸۳۸۰b.get(i);
                if (child instanceof Cd) {
                    m۱۰۰۹۷a((Cd) child, currentGroup.f۸۳۷۹a, canvas, w, h, filter);
                } else if (child instanceof AbstractCf) {
                    m۱۰۰۹۶a(currentGroup, (AbstractCf) child, canvas, w, h, filter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۰۹۸a(Canvas canvas, int w, int h, ColorFilter filter) {
            m۱۰۰۹۷a(this.f۸۴۰۳h, f۸۳۹۵q, canvas, w, h, filter);
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۰۹۶a(Cd vGroup, AbstractCf vPath, Canvas canvas, int w, int h, ColorFilter filter) {
            float len;
            float scaleX = ((float) w) / this.f۸۴۰۶k;
            float scaleY = ((float) h) / this.f۸۴۰۷l;
            float minScale = Math.min(scaleX, scaleY);
            Matrix groupStackedMatrix = vGroup.f۸۳۷۹a;
            this.f۸۳۹۸c.set(groupStackedMatrix);
            this.f۸۳۹۸c.postScale(scaleX, scaleY);
            float matrixScale = m۱۰۰۹۵a(groupStackedMatrix);
            if (matrixScale != 0.0f) {
                vPath.m۱۰۰۹۲a(this.f۸۳۹۶a);
                Path path = this.f۸۳۹۶a;
                this.f۸۳۹۷b.reset();
                if (vPath.m۱۰۰۹۳b()) {
                    this.f۸۳۹۷b.addPath(path, this.f۸۳۹۸c);
                    canvas.clipPath(this.f۸۳۹۷b);
                    return;
                }
                Cc fullPath = (Cc) vPath;
                if (fullPath.f۸۳۷۳k != 0.0f || fullPath.f۸۳۷۴l != 1.0f) {
                    float f = fullPath.f۸۳۷۳k;
                    float f2 = fullPath.f۸۳۷۵m;
                    float start = (f + f2) % 1.0f;
                    float end = (fullPath.f۸۳۷۴l + f2) % 1.0f;
                    if (this.f۸۴۰۱f == null) {
                        this.f۸۴۰۱f = new PathMeasure();
                    }
                    this.f۸۴۰۱f.setPath(this.f۸۳۹۶a, false);
                    float len2 = this.f۸۴۰۱f.getLength();
                    float start2 = start * len2;
                    float end2 = end * len2;
                    path.reset();
                    if (start2 > end2) {
                        this.f۸۴۰۱f.getSegment(start2, len2, path, true);
                        len = 0.0f;
                        this.f۸۴۰۱f.getSegment(0.0f, end2, path, true);
                    } else {
                        len = 0.0f;
                        this.f۸۴۰۱f.getSegment(start2, end2, path, true);
                    }
                    path.rLineTo(len, len);
                }
                this.f۸۳۹۷b.addPath(path, this.f۸۳۹۸c);
                if (fullPath.f۸۳۶۹g.m۱۲۶۵۵e()) {
                    android.support.p۰۴۳v4.content.p۰۴۴e.Cb fill = fullPath.f۸۳۶۹g;
                    if (this.f۸۴۰۰e == null) {
                        this.f۸۴۰۰e = new Paint(1);
                        this.f۸۴۰۰e.setStyle(Paint.Style.FILL);
                    }
                    Paint fillPaint = this.f۸۴۰۰e;
                    if (fill.m۱۲۶۵۳c()) {
                        Shader shader = fill.m۱۲۶۵۲b();
                        shader.setLocalMatrix(this.f۸۳۹۸c);
                        fillPaint.setShader(shader);
                        fillPaint.setAlpha(Math.round(fullPath.f۸۳۷۲j * 255.0f));
                    } else {
                        fillPaint.setColor(Ci.m۱۰۰۶۷a(fill.m۱۲۶۴۹a(), fullPath.f۸۳۷۲j));
                    }
                    fillPaint.setColorFilter(filter);
                    this.f۸۳۹۷b.setFillType(fullPath.f۸۳۷۱i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f۸۳۹۷b, fillPaint);
                }
                if (fullPath.f۸۳۶۷e.m۱۲۶۵۵e()) {
                    android.support.p۰۴۳v4.content.p۰۴۴e.Cb strokeColor = fullPath.f۸۳۶۷e;
                    if (this.f۸۳۹۹d == null) {
                        this.f۸۳۹۹d = new Paint(1);
                        this.f۸۳۹۹d.setStyle(Paint.Style.STROKE);
                    }
                    Paint strokePaint = this.f۸۳۹۹d;
                    Paint.Join join = fullPath.f۸۳۷۷o;
                    if (join != null) {
                        strokePaint.setStrokeJoin(join);
                    }
                    Paint.Cap cap = fullPath.f۸۳۷۶n;
                    if (cap != null) {
                        strokePaint.setStrokeCap(cap);
                    }
                    strokePaint.setStrokeMiter(fullPath.f۸۳۷۸p);
                    if (strokeColor.m۱۲۶۵۳c()) {
                        Shader shader2 = strokeColor.m۱۲۶۵۲b();
                        shader2.setLocalMatrix(this.f۸۳۹۸c);
                        strokePaint.setShader(shader2);
                        strokePaint.setAlpha(Math.round(fullPath.f۸۳۷۰h * 255.0f));
                    } else {
                        strokePaint.setColor(Ci.m۱۰۰۶۷a(strokeColor.m۱۲۶۴۹a(), fullPath.f۸۳۷۰h));
                    }
                    strokePaint.setColorFilter(filter);
                    strokePaint.setStrokeWidth(fullPath.f۸۳۶۸f * minScale * matrixScale);
                    canvas.drawPath(this.f۸۳۹۷b, strokePaint);
                }
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private static float m۱۰۰۹۴a(float v1x, float v1y, float v2x, float v2y) {
            return (v1x * v2y) - (v1y * v2x);
        }

        /* renamed from: a  reason: contains not printable characters */
        private float m۱۰۰۹۵a(Matrix groupStackedMatrix) {
            float[] unitVectors = {0.0f, 1.0f, 1.0f, 0.0f};
            groupStackedMatrix.mapVectors(unitVectors);
            float crossProduct = m۱۰۰۹۴a(unitVectors[0], unitVectors[1], unitVectors[2], unitVectors[3]);
            float maxScale = Math.max((float) Math.hypot((double) unitVectors[0], (double) unitVectors[1]), (float) Math.hypot((double) unitVectors[2], (double) unitVectors[3]));
            if (maxScale > 0.0f) {
                return Math.abs(crossProduct) / maxScale;
            }
            return 0.0f;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۰۹۹a() {
            if (this.f۸۴۱۰o == null) {
                this.f۸۴۱۰o = Boolean.valueOf(this.f۸۴۰۳h.m۱۰۰۸۸a());
            }
            return this.f۸۴۱۰o.booleanValue();
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۱۰۰a(int[] stateSet) {
            return this.f۸۴۰۳h.m۱۰۰۸۹a(stateSet);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.d.a.i$e  reason: invalid class name */
    public static abstract class AbstractCe {
        private AbstractCe() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۰۹۰a() {
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۰۹۱a(int[] stateSet) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.d.a.i$d  reason: invalid class name */
    public static class Cd extends AbstractCe {

        /* renamed from: a  reason: contains not printable characters */
        final Matrix f۸۳۷۹a = new Matrix();

        /* renamed from: b  reason: contains not printable characters */
        final ArrayList<AbstractCe> f۸۳۸۰b = new ArrayList<>();

        /* renamed from: c  reason: contains not printable characters */
        float f۸۳۸۱c = 0.0f;

        /* renamed from: d  reason: contains not printable characters */
        private float f۸۳۸۲d = 0.0f;

        /* renamed from: e  reason: contains not printable characters */
        private float f۸۳۸۳e = 0.0f;

        /* renamed from: f  reason: contains not printable characters */
        private float f۸۳۸۴f = 1.0f;

        /* renamed from: g  reason: contains not printable characters */
        private float f۸۳۸۵g = 1.0f;

        /* renamed from: h  reason: contains not printable characters */
        private float f۸۳۸۶h = 0.0f;

        /* renamed from: i  reason: contains not printable characters */
        private float f۸۳۸۷i = 0.0f;

        /* renamed from: j  reason: contains not printable characters */
        final Matrix f۸۳۸۸j = new Matrix();

        /* renamed from: k  reason: contains not printable characters */
        int f۸۳۸۹k;

        /* renamed from: l  reason: contains not printable characters */
        private int[] f۸۳۹۰l;

        /* renamed from: m  reason: contains not printable characters */
        private String f۸۳۹۱m = null;

        public Cd(Cd copy, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<String, Object> aVar) {
            super();
            AbstractCf newPath;
            this.f۸۳۸۱c = copy.f۸۳۸۱c;
            this.f۸۳۸۲d = copy.f۸۳۸۲d;
            this.f۸۳۸۳e = copy.f۸۳۸۳e;
            this.f۸۳۸۴f = copy.f۸۳۸۴f;
            this.f۸۳۸۵g = copy.f۸۳۸۵g;
            this.f۸۳۸۶h = copy.f۸۳۸۶h;
            this.f۸۳۸۷i = copy.f۸۳۸۷i;
            this.f۸۳۹۰l = copy.f۸۳۹۰l;
            this.f۸۳۹۱m = copy.f۸۳۹۱m;
            this.f۸۳۸۹k = copy.f۸۳۸۹k;
            String str = this.f۸۳۹۱m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f۸۳۸۸j.set(copy.f۸۳۸۸j);
            ArrayList<VectorDrawableCompat.VObject> children = copy.f۸۳۸۰b;
            for (int i = 0; i < children.size(); i++) {
                Object copyChild = children.get(i);
                if (copyChild instanceof Cd) {
                    this.f۸۳۸۰b.add(new Cd((Cd) copyChild, aVar));
                } else {
                    if (copyChild instanceof Cc) {
                        newPath = new Cc((Cc) copyChild);
                    } else if (copyChild instanceof Cb) {
                        newPath = new Cb((Cb) copyChild);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f۸۳۸۰b.add(newPath);
                    String str2 = newPath.f۸۳۹۳b;
                    if (str2 != null) {
                        aVar.put(str2, newPath);
                    }
                }
            }
        }

        public Cd() {
            super();
        }

        public String getGroupName() {
            return this.f۸۳۹۱m;
        }

        public Matrix getLocalMatrix() {
            return this.f۸۳۸۸j;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۰۸۷a(Resources res, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            TypedArray a = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۹۱a(res, theme, attrs, Ca.f۸۳۳۰b);
            m۱۰۰۸۵a(a, parser);
            a.recycle();
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۰۸۵a(TypedArray a, XmlPullParser parser) {
            this.f۸۳۹۰l = null;
            this.f۸۳۸۱c = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "rotation", 5, this.f۸۳۸۱c);
            this.f۸۳۸۲d = a.getFloat(1, this.f۸۳۸۲d);
            this.f۸۳۸۳e = a.getFloat(2, this.f۸۳۸۳e);
            this.f۸۳۸۴f = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "scaleX", 3, this.f۸۳۸۴f);
            this.f۸۳۸۵g = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "scaleY", 4, this.f۸۳۸۵g);
            this.f۸۳۸۶h = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "translateX", 6, this.f۸۳۸۶h);
            this.f۸۳۸۷i = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "translateY", 7, this.f۸۳۸۷i);
            String groupName = a.getString(0);
            if (groupName != null) {
                this.f۸۳۹۱m = groupName;
            }
            m۱۰۰۸۶b();
        }

        /* renamed from: b  reason: contains not printable characters */
        private void m۱۰۰۸۶b() {
            this.f۸۳۸۸j.reset();
            this.f۸۳۸۸j.postTranslate(-this.f۸۳۸۲d, -this.f۸۳۸۳e);
            this.f۸۳۸۸j.postScale(this.f۸۳۸۴f, this.f۸۳۸۵g);
            this.f۸۳۸۸j.postRotate(this.f۸۳۸۱c, 0.0f, 0.0f);
            this.f۸۳۸۸j.postTranslate(this.f۸۳۸۶h + this.f۸۳۸۲d, this.f۸۳۸۷i + this.f۸۳۸۳e);
        }

        public float getRotation() {
            return this.f۸۳۸۱c;
        }

        public void setRotation(float rotation) {
            if (rotation != this.f۸۳۸۱c) {
                this.f۸۳۸۱c = rotation;
                m۱۰۰۸۶b();
            }
        }

        public float getPivotX() {
            return this.f۸۳۸۲d;
        }

        public void setPivotX(float pivotX) {
            if (pivotX != this.f۸۳۸۲d) {
                this.f۸۳۸۲d = pivotX;
                m۱۰۰۸۶b();
            }
        }

        public float getPivotY() {
            return this.f۸۳۸۳e;
        }

        public void setPivotY(float pivotY) {
            if (pivotY != this.f۸۳۸۳e) {
                this.f۸۳۸۳e = pivotY;
                m۱۰۰۸۶b();
            }
        }

        public float getScaleX() {
            return this.f۸۳۸۴f;
        }

        public void setScaleX(float scaleX) {
            if (scaleX != this.f۸۳۸۴f) {
                this.f۸۳۸۴f = scaleX;
                m۱۰۰۸۶b();
            }
        }

        public float getScaleY() {
            return this.f۸۳۸۵g;
        }

        public void setScaleY(float scaleY) {
            if (scaleY != this.f۸۳۸۵g) {
                this.f۸۳۸۵g = scaleY;
                m۱۰۰۸۶b();
            }
        }

        public float getTranslateX() {
            return this.f۸۳۸۶h;
        }

        public void setTranslateX(float translateX) {
            if (translateX != this.f۸۳۸۶h) {
                this.f۸۳۸۶h = translateX;
                m۱۰۰۸۶b();
            }
        }

        public float getTranslateY() {
            return this.f۸۳۸۷i;
        }

        public void setTranslateY(float translateY) {
            if (translateY != this.f۸۳۸۷i) {
                this.f۸۳۸۷i = translateY;
                m۱۰۰۸۶b();
            }
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Ci.AbstractCe
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۰۸۸a() {
            for (int i = 0; i < this.f۸۳۸۰b.size(); i++) {
                if (this.f۸۳۸۰b.get(i).m۱۰۰۹۰a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Ci.AbstractCe
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۰۸۹a(int[] stateSet) {
            boolean changed = false;
            for (int i = 0; i < this.f۸۳۸۰b.size(); i++) {
                changed |= this.f۸۳۸۰b.get(i).m۱۰۰۹۱a(stateSet);
            }
            return changed;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.d.a.i$f  reason: invalid class name */
    public static abstract class AbstractCf extends AbstractCe {

        /* renamed from: a  reason: contains not printable characters */
        protected Cb.Cb[] f۸۳۹۲a = null;

        /* renamed from: b  reason: contains not printable characters */
        String f۸۳۹۳b;

        /* renamed from: c  reason: contains not printable characters */
        int f۸۳۹۴c;

        public AbstractCf() {
            super();
        }

        public AbstractCf(AbstractCf copy) {
            super();
            this.f۸۳۹۳b = copy.f۸۳۹۳b;
            this.f۸۳۹۴c = copy.f۸۳۹۴c;
            this.f۸۳۹۲a = p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Cb.m۱۰۴۲۷a(copy.f۸۳۹۲a);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۰۹۲a(Path path) {
            path.reset();
            Cb.Cb[] bVarArr = this.f۸۳۹۲a;
            if (bVarArr != null) {
                Cb.Cb.m۱۰۴۳۴a(bVarArr, path);
            }
        }

        public String getPathName() {
            return this.f۸۳۹۳b;
        }

        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۰۰۹۳b() {
            return false;
        }

        public Cb.Cb[] getPathData() {
            return this.f۸۳۹۲a;
        }

        public void setPathData(Cb.Cb[] nodes) {
            if (!p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Cb.m۱۰۴۲۴a(this.f۸۳۹۲a, nodes)) {
                this.f۸۳۹۲a = p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Cb.m۱۰۴۲۷a(nodes);
            } else {
                p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Cb.m۱۰۴۲۹b(this.f۸۳۹۲a, nodes);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.d.a.i$b  reason: invalid class name */
    public static class Cb extends AbstractCf {
        public Cb() {
        }

        public Cb(Cb copy) {
            super(copy);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۰۷۷a(Resources r, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            if (android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۹۵a(parser, "pathData")) {
                TypedArray a = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۹۱a(r, theme, attrs, Ca.f۸۳۳۲d);
                m۱۰۰۷۶a(a);
                a.recycle();
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۰۷۶a(TypedArray a) {
            String pathName = a.getString(0);
            if (pathName != null) {
                this.f۸۳۹۳b = pathName;
            }
            String pathData = a.getString(1);
            if (pathData != null) {
                this.f۸۳۹۲a = p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Cb.m۱۰۴۲۶a(pathData);
            }
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Ci.AbstractCf
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۰۰۷۸b() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.d.a.i$c  reason: invalid class name */
    public static class Cc extends AbstractCf {

        /* renamed from: d  reason: contains not printable characters */
        private int[] f۸۳۶۶d;

        /* renamed from: e  reason: contains not printable characters */
        android.support.p۰۴۳v4.content.p۰۴۴e.Cb f۸۳۶۷e;

        /* renamed from: f  reason: contains not printable characters */
        float f۸۳۶۸f = 0.0f;

        /* renamed from: g  reason: contains not printable characters */
        android.support.p۰۴۳v4.content.p۰۴۴e.Cb f۸۳۶۹g;

        /* renamed from: h  reason: contains not printable characters */
        float f۸۳۷۰h = 1.0f;

        /* renamed from: i  reason: contains not printable characters */
        int f۸۳۷۱i = 0;

        /* renamed from: j  reason: contains not printable characters */
        float f۸۳۷۲j = 1.0f;

        /* renamed from: k  reason: contains not printable characters */
        float f۸۳۷۳k = 0.0f;

        /* renamed from: l  reason: contains not printable characters */
        float f۸۳۷۴l = 1.0f;

        /* renamed from: m  reason: contains not printable characters */
        float f۸۳۷۵m = 0.0f;

        /* renamed from: n  reason: contains not printable characters */
        Paint.Cap f۸۳۷۶n = Paint.Cap.BUTT;

        /* renamed from: o  reason: contains not printable characters */
        Paint.Join f۸۳۷۷o = Paint.Join.MITER;

        /* renamed from: p  reason: contains not printable characters */
        float f۸۳۷۸p = 4.0f;

        public Cc() {
        }

        public Cc(Cc copy) {
            super(copy);
            this.f۸۳۶۶d = copy.f۸۳۶۶d;
            this.f۸۳۶۷e = copy.f۸۳۶۷e;
            this.f۸۳۶۸f = copy.f۸۳۶۸f;
            this.f۸۳۷۰h = copy.f۸۳۷۰h;
            this.f۸۳۶۹g = copy.f۸۳۶۹g;
            this.f۸۳۷۱i = copy.f۸۳۷۱i;
            this.f۸۳۷۲j = copy.f۸۳۷۲j;
            this.f۸۳۷۳k = copy.f۸۳۷۳k;
            this.f۸۳۷۴l = copy.f۸۳۷۴l;
            this.f۸۳۷۵m = copy.f۸۳۷۵m;
            this.f۸۳۷۶n = copy.f۸۳۷۶n;
            this.f۸۳۷۷o = copy.f۸۳۷۷o;
            this.f۸۳۷۸p = copy.f۸۳۷۸p;
        }

        /* renamed from: a  reason: contains not printable characters */
        private Paint.Cap m۱۰۰۷۹a(int id, Paint.Cap defValue) {
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

        /* renamed from: a  reason: contains not printable characters */
        private Paint.Join m۱۰۰۸۰a(int id, Paint.Join defValue) {
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

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۰۸۲a(Resources r, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            TypedArray a = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۹۱a(r, theme, attrs, Ca.f۸۳۳۱c);
            m۱۰۰۸۱a(a, parser, theme);
            a.recycle();
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۰۸۱a(TypedArray a, XmlPullParser parser, Resources.Theme theme) {
            this.f۸۳۶۶d = null;
            if (android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۹۵a(parser, "pathData")) {
                String pathName = a.getString(0);
                if (pathName != null) {
                    this.f۸۳۹۳b = pathName;
                }
                String pathData = a.getString(2);
                if (pathData != null) {
                    this.f۸۳۹۲a = p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Cb.m۱۰۴۲۶a(pathData);
                }
                this.f۸۳۶۹g = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۹۲a(a, parser, theme, "fillColor", 1, 0);
                this.f۸۳۷۲j = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "fillAlpha", 12, this.f۸۳۷۲j);
                this.f۸۳۷۶n = m۱۰۰۷۹a(android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۹۶b(a, parser, "strokeLineCap", 8, -1), this.f۸۳۷۶n);
                this.f۸۳۷۷o = m۱۰۰۸۰a(android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۹۶b(a, parser, "strokeLineJoin", 9, -1), this.f۸۳۷۷o);
                this.f۸۳۷۸p = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "strokeMiterLimit", 10, this.f۸۳۷۸p);
                this.f۸۳۶۷e = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۹۲a(a, parser, theme, "strokeColor", 3, 0);
                this.f۸۳۷۰h = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "strokeAlpha", 11, this.f۸۳۷۰h);
                this.f۸۳۶۸f = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "strokeWidth", 4, this.f۸۳۶۸f);
                this.f۸۳۷۴l = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "trimPathEnd", 6, this.f۸۳۷۴l);
                this.f۸۳۷۵m = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "trimPathOffset", 7, this.f۸۳۷۵m);
                this.f۸۳۷۳k = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۸۹a(a, parser, "trimPathStart", 5, this.f۸۳۷۳k);
                this.f۸۳۷۱i = android.support.p۰۴۳v4.content.p۰۴۴e.Cg.m۱۲۶۹۶b(a, parser, "fillType", 13, this.f۸۳۷۱i);
            }
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Ci.AbstractCe
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۰۸۳a() {
            return this.f۸۳۶۹g.m۱۲۶۵۴d() || this.f۸۳۶۷e.m۱۲۶۵۴d();
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Ci.AbstractCe
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۰۸۴a(int[] stateSet) {
            return this.f۸۳۶۹g.m۱۲۶۵۱a(stateSet) | this.f۸۳۶۷e.m۱۲۶۵۱a(stateSet);
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f۸۳۶۷e.m۱۲۶۴۹a();
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int strokeColor) {
            this.f۸۳۶۷e.m۱۲۶۵۰a(strokeColor);
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f۸۳۶۸f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float strokeWidth) {
            this.f۸۳۶۸f = strokeWidth;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f۸۳۷۰h;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float strokeAlpha) {
            this.f۸۳۷۰h = strokeAlpha;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f۸۳۶۹g.m۱۲۶۴۹a();
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int fillColor) {
            this.f۸۳۶۹g.m۱۲۶۵۰a(fillColor);
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f۸۳۷۲j;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float fillAlpha) {
            this.f۸۳۷۲j = fillAlpha;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f۸۳۷۳k;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float trimPathStart) {
            this.f۸۳۷۳k = trimPathStart;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f۸۳۷۴l;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float trimPathEnd) {
            this.f۸۳۷۴l = trimPathEnd;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f۸۳۷۵m;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float trimPathOffset) {
            this.f۸۳۷۵m = trimPathOffset;
        }
    }
}
