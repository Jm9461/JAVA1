package p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a;

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
import android.support.v4.content.p۲۰۲e.Cb;
import android.support.v4.content.p۲۰۲e.Cf;
import android.support.v4.content.p۲۰۲e.Cg;
import android.support.v4.graphics.drawable.Ca;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cb;

/* renamed from: a.b.d.a.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ci extends AbstractCh {

    /* renamed from: l, reason: contains not printable characters */
    static final PorterDuff.Mode f۸۳۵۷l = PorterDuff.Mode.SRC_IN;

    /* renamed from: d, reason: contains not printable characters */
    private h f۸۳۵۸d;

    /* renamed from: e, reason: contains not printable characters */
    private PorterDuffColorFilter f۸۳۵۹e;

    /* renamed from: f, reason: contains not printable characters */
    private ColorFilter f۸۳۶۰f;

    /* renamed from: g, reason: contains not printable characters */
    private boolean f۸۳۶۱g;

    /* renamed from: h, reason: contains not printable characters */
    private boolean f۸۳۶۲h;

    /* renamed from: i, reason: contains not printable characters */
    private final float[] f۸۳۶۳i;

    /* renamed from: j, reason: contains not printable characters */
    private final Matrix f۸۳۶۴j;

    /* renamed from: k, reason: contains not printable characters */
    private final Rect f۸۳۶۵k;

    Ci() {
        this.f۸۳۶۲h = true;
        this.f۸۳۶۳i = new float[9];
        this.f۸۳۶۴j = new Matrix();
        this.f۸۳۶۵k = new Rect();
        this.f۸۳۵۸d = new h();
    }

    Ci(h state) {
        this.f۸۳۶۲h = true;
        this.f۸۳۶۳i = new float[9];
        this.f۸۳۶۴j = new Matrix();
        this.f۸۳۶۵k = new Rect();
        this.f۸۳۵۸d = state;
        this.f۸۳۵۹e = m۸۰۰۶a(this.f۸۳۵۹e, state.f۸۴۱۴c, state.f۸۴۱۵d);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f۸۳۶۱g && super.mutate() == this) {
            this.f۸۳۵۸d = new h(this.f۸۳۵۸d);
            this.f۸۳۶۱g = true;
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    Object m۸۰۰۷a(String name) {
        return this.f۸۳۵۸d.f۸۴۱۳b.f۸۴۱۱p.get(name);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new i(drawable.getConstantState());
        }
        this.f۸۳۵۸d.f۸۴۱۲a = getChangingConfigurations();
        return this.f۸۳۵۸d;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f۸۳۶۵k);
        if (this.f۸۳۶۵k.width() <= 0 || this.f۸۳۶۵k.height() <= 0) {
            return;
        }
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
        if (canvasSkewX != 0.0f || canvasSkewY != 0.0f) {
            canvasScaleX = 1.0f;
            canvasScaleY = 1.0f;
        }
        int scaledWidth = Math.min(2048, (int) (this.f۸۳۶۵k.width() * canvasScaleX));
        int scaledHeight = Math.min(2048, (int) (this.f۸۳۶۵k.height() * canvasScaleY));
        if (scaledWidth <= 0 || scaledHeight <= 0) {
            return;
        }
        int saveCount = canvas.save();
        Rect rect = this.f۸۳۶۵k;
        canvas.translate(rect.left, rect.top);
        boolean needMirroring = m۸۰۰۵a();
        if (needMirroring) {
            canvas.translate(this.f۸۳۶۵k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f۸۳۶۵k.offsetTo(0, 0);
        this.f۸۳۵۸d.m۸۰۳۹b(scaledWidth, scaledHeight);
        if (!this.f۸۳۶۲h) {
            this.f۸۳۵۸d.m۸۰۴۱c(scaledWidth, scaledHeight);
        } else if (!this.f۸۳۵۸d.m۸۰۳۶a()) {
            this.f۸۳۵۸d.m۸۰۴۱c(scaledWidth, scaledHeight);
            this.f۸۳۵۸d.m۸۰۴۳d();
        }
        this.f۸۳۵۸d.m۸۰۳۵a(canvas, colorFilter, this.f۸۳۶۵k);
        canvas.restoreToCount(saveCount);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return Ca.m۱۰۶۴۷c(drawable);
        }
        return this.f۸۳۵۸d.f۸۴۱۳b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        } else if (this.f۸۳۵۸d.f۸۴۱۳b.getRootAlpha() != alpha) {
            this.f۸۳۵۸d.f۸۴۱۳b.setRootAlpha(alpha);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f۸۳۶۰f = colorFilter;
            invalidateSelf();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    PorterDuffColorFilter m۸۰۰۶a(PorterDuffColorFilter tintFilter, ColorStateList tint, PorterDuff.Mode tintMode) {
        if (tint == null || tintMode == null) {
            return null;
        }
        int color = tint.getColorForState(getState(), 0);
        return new PorterDuffColorFilter(color, tintMode);
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceCb
    public void setTint(int tint) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۰۶۴۶b(drawable, tint);
        } else {
            setTintList(ColorStateList.valueOf(tint));
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceCb
    public void setTintList(ColorStateList tint) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۰۶۳۸a(drawable, tint);
            return;
        }
        h state = this.f۸۳۵۸d;
        if (state.f۸۴۱۴c != tint) {
            state.f۸۴۱۴c = tint;
            this.f۸۳۵۹e = m۸۰۰۶a(this.f۸۳۵۹e, tint, state.f۸۴۱۵d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceCb
    public void setTintMode(PorterDuff.Mode tintMode) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۰۶۴۱a(drawable, tintMode);
            return;
        }
        h state = this.f۸۳۵۸d;
        if (state.f۸۴۱۵d != tintMode) {
            state.f۸۴۱۵d = tintMode;
            this.f۸۳۵۹e = m۸۰۰۶a(this.f۸۳۵۹e, state.f۸۴۱۴c, tintMode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f۸۳۵۸d) != null && (hVar.m۸۰۴۲c() || ((colorStateList = this.f۸۳۵۸d.f۸۴۱۴c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] stateSet) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.setState(stateSet);
        }
        boolean changed = false;
        h state = this.f۸۳۵۸d;
        ColorStateList colorStateList = state.f۸۴۱۴c;
        if (colorStateList != null && (mode = state.f۸۴۱۵d) != null) {
            this.f۸۳۵۹e = m۸۰۰۶a(this.f۸۳۵۹e, colorStateList, mode);
            invalidateSelf();
            changed = true;
        }
        if (state.m۸۰۴۲c() && state.m۸۰۳۸a(stateSet)) {
            invalidateSelf();
            return true;
        }
        return changed;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f۸۳۵۸d.f۸۴۱۳b.f۸۴۰۴i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f۸۳۵۸d.f۸۴۱۳b.f۸۴۰۵j;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۰۶۴۳a(drawable);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return Ca.m۱۰۶۵۰f(drawable);
        }
        return this.f۸۳۵۸d.f۸۴۱۶e;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean mirrored) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۰۶۴۲a(drawable, mirrored);
        } else {
            this.f۸۳۵۸d.f۸۴۱۶e = mirrored;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Ci m۸۰۰۱a(Resources res, int resId, Resources.Theme theme) {
        int type;
        if (Build.VERSION.SDK_INT >= 24) {
            Ci drawable = new Ci();
            drawable.f۸۳۵۶c = Cf.m۱۰۶۱۴a(res, resId, theme);
            new i(drawable.f۸۳۵۶c.getConstantState());
            return drawable;
        }
        try {
            XmlPullParser parser = res.getXml(resId);
            AttributeSet attrs = Xml.asAttributeSet(parser);
            do {
                type = parser.next();
                if (type == 2) {
                    break;
                }
            } while (type != 1);
            if (type != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return createFromXmlInner(res, parser, attrs, theme);
        } catch (IOException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    public static Ci createFromXmlInner(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Ci drawable = new Ci();
        drawable.inflate(r, parser, attrs, theme);
        return drawable;
    }

    /* renamed from: a, reason: contains not printable characters */
    static int m۸۰۰۰a(int color, float alpha) {
        int alphaBytes = Color.alpha(color);
        return (color & 16777215) | (((int) (alphaBytes * alpha)) << 24);
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
            Ca.m۱۰۶۴۰a(drawable, res, parser, attrs, theme);
            return;
        }
        h state = this.f۸۳۵۸d;
        g pathRenderer = new g();
        state.f۸۴۱۳b = pathRenderer;
        TypedArray a2 = Cg.m۱۰۶۲۱a(res, theme, attrs, Ca.f۸۳۲۹a);
        m۸۰۰۴a(a2, parser);
        a2.recycle();
        state.f۸۴۱۲a = getChangingConfigurations();
        state.f۸۴۲۲k = true;
        m۸۰۰۳a(res, parser, attrs, theme);
        this.f۸۳۵۹e = m۸۰۰۶a(this.f۸۳۵۹e, state.f۸۴۱۴c, state.f۸۴۱۵d);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static PorterDuff.Mode m۸۰۰۲a(int value, PorterDuff.Mode defaultMode) {
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

    /* renamed from: a, reason: contains not printable characters */
    private void m۸۰۰۴a(TypedArray a2, XmlPullParser parser) {
        h state = this.f۸۳۵۸d;
        g pathRenderer = state.f۸۴۱۳b;
        int mode = Cg.m۱۰۶۲۶b(a2, parser, "tintMode", 6, -1);
        state.f۸۴۱۵d = m۸۰۰۲a(mode, PorterDuff.Mode.SRC_IN);
        ColorStateList tint = a2.getColorStateList(1);
        if (tint != null) {
            state.f۸۴۱۴c = tint;
        }
        state.f۸۴۱۶e = Cg.m۱۰۶۲۴a(a2, parser, "autoMirrored", 5, state.f۸۴۱۶e);
        pathRenderer.f۸۴۰۶k = Cg.m۱۰۶۱۹a(a2, parser, "viewportWidth", 7, pathRenderer.f۸۴۰۶k);
        pathRenderer.f۸۴۰۷l = Cg.m۱۰۶۱۹a(a2, parser, "viewportHeight", 8, pathRenderer.f۸۴۰۷l);
        if (pathRenderer.f۸۴۰۶k <= 0.0f) {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (pathRenderer.f۸۴۰۷l <= 0.0f) {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        pathRenderer.f۸۴۰۴i = a2.getDimension(3, pathRenderer.f۸۴۰۴i);
        pathRenderer.f۸۴۰۵j = a2.getDimension(2, pathRenderer.f۸۴۰۵j);
        if (pathRenderer.f۸۴۰۴i <= 0.0f) {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (pathRenderer.f۸۴۰۵j <= 0.0f) {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alphaInFloat = Cg.m۱۰۶۱۹a(a2, parser, "alpha", 4, pathRenderer.getAlpha());
        pathRenderer.setAlpha(alphaInFloat);
        String name = a2.getString(0);
        if (name != null) {
            pathRenderer.f۸۴۰۹n = name;
            pathRenderer.f۸۴۱۱p.put(name, pathRenderer);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۸۰۰۳a(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        h state = this.f۸۳۵۸d;
        g pathRenderer = state.f۸۴۱۳b;
        boolean noPathTag = true;
        ArrayDeque<VectorDrawableCompat.VGroup> groupStack = new ArrayDeque<>();
        groupStack.push(pathRenderer.f۸۴۰۳h);
        int eventType = parser.getEventType();
        int innerDepth = parser.getDepth() + 1;
        for (int i2 = 1; eventType != i2 && (parser.getDepth() >= innerDepth || eventType != 3); i2 = 1) {
            if (eventType == 2) {
                String tagName = parser.getName();
                d currentGroup = (d) groupStack.peek();
                if ("path".equals(tagName)) {
                    c path = new c();
                    path.m۸۰۱۵a(res, attrs, theme, parser);
                    currentGroup.f۸۳۸۰b.add(path);
                    if (path.getPathName() != null) {
                        pathRenderer.f۸۴۱۱p.put(path.getPathName(), path);
                    }
                    noPathTag = false;
                    state.f۸۴۱۲a |= path.f۸۳۹۴c;
                } else if ("clip-path".equals(tagName)) {
                    b path2 = new b();
                    path2.m۸۰۱۰a(res, attrs, theme, parser);
                    currentGroup.f۸۳۸۰b.add(path2);
                    if (path2.getPathName() != null) {
                        pathRenderer.f۸۴۱۱p.put(path2.getPathName(), path2);
                    }
                    state.f۸۴۱۲a |= path2.f۸۳۹۴c;
                } else if ("group".equals(tagName)) {
                    d newChildGroup = new d();
                    newChildGroup.m۸۰۲۰a(res, attrs, theme, parser);
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

    /* renamed from: a, reason: contains not printable characters */
    void m۸۰۰۸a(boolean allowCaching) {
        this.f۸۳۶۲h = allowCaching;
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۸۰۰۵a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && Ca.m۱۰۶۴۹e(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f۸۳۵۸d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable what, long when) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.scheduleSelf(what, when);
        } else {
            super.scheduleSelf(what, when);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.setVisible(visible, restart);
        }
        return super.setVisible(visible, restart);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable what) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.unscheduleSelf(what);
        } else {
            super.unscheduleSelf(what);
        }
    }

    /* renamed from: a.b.d.a.i$i */
    private static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: contains not printable characters */
        private final Drawable.ConstantState f۸۴۲۴a;

        public i(Drawable.ConstantState state) {
            this.f۸۴۲۴a = state;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            Ci drawableCompat = new Ci();
            drawableCompat.f۸۳۵۶c = (VectorDrawable) this.f۸۴۲۴a.newDrawable();
            return drawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources res) {
            Ci drawableCompat = new Ci();
            drawableCompat.f۸۳۵۶c = (VectorDrawable) this.f۸۴۲۴a.newDrawable(res);
            return drawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources res, Resources.Theme theme) {
            Ci drawableCompat = new Ci();
            drawableCompat.f۸۳۵۶c = (VectorDrawable) this.f۸۴۲۴a.newDrawable(res, theme);
            return drawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f۸۴۲۴a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f۸۴۲۴a.getChangingConfigurations();
        }
    }

    /* renamed from: a.b.d.a.i$h */
    private static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: contains not printable characters */
        int f۸۴۱۲a;

        /* renamed from: b, reason: contains not printable characters */
        g f۸۴۱۳b;

        /* renamed from: c, reason: contains not printable characters */
        ColorStateList f۸۴۱۴c;

        /* renamed from: d, reason: contains not printable characters */
        PorterDuff.Mode f۸۴۱۵d;

        /* renamed from: e, reason: contains not printable characters */
        boolean f۸۴۱۶e;

        /* renamed from: f, reason: contains not printable characters */
        Bitmap f۸۴۱۷f;

        /* renamed from: g, reason: contains not printable characters */
        ColorStateList f۸۴۱۸g;

        /* renamed from: h, reason: contains not printable characters */
        PorterDuff.Mode f۸۴۱۹h;

        /* renamed from: i, reason: contains not printable characters */
        int f۸۴۲۰i;

        /* renamed from: j, reason: contains not printable characters */
        boolean f۸۴۲۱j;

        /* renamed from: k, reason: contains not printable characters */
        boolean f۸۴۲۲k;

        /* renamed from: l, reason: contains not printable characters */
        Paint f۸۴۲۳l;

        public h(h copy) {
            this.f۸۴۱۴c = null;
            this.f۸۴۱۵d = Ci.f۸۳۵۷l;
            if (copy != null) {
                this.f۸۴۱۲a = copy.f۸۴۱۲a;
                this.f۸۴۱۳b = new g(copy.f۸۴۱۳b);
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

        /* renamed from: a, reason: contains not printable characters */
        public void m۸۰۳۵a(Canvas canvas, ColorFilter filter, Rect originalBounds) {
            Paint p = m۸۰۳۴a(filter);
            canvas.drawBitmap(this.f۸۴۱۷f, (Rect) null, originalBounds, p);
        }

        /* renamed from: b, reason: contains not printable characters */
        public boolean m۸۰۴۰b() {
            return this.f۸۴۱۳b.getRootAlpha() < 255;
        }

        /* renamed from: a, reason: contains not printable characters */
        public Paint m۸۰۳۴a(ColorFilter filter) {
            if (!m۸۰۴۰b() && filter == null) {
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

        /* renamed from: c, reason: contains not printable characters */
        public void m۸۰۴۱c(int width, int height) {
            this.f۸۴۱۷f.eraseColor(0);
            Canvas tmpCanvas = new Canvas(this.f۸۴۱۷f);
            this.f۸۴۱۳b.m۸۰۳۱a(tmpCanvas, width, height, (ColorFilter) null);
        }

        /* renamed from: b, reason: contains not printable characters */
        public void m۸۰۳۹b(int width, int height) {
            if (this.f۸۴۱۷f == null || !m۸۰۳۷a(width, height)) {
                this.f۸۴۱۷f = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f۸۴۲۲k = true;
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        public boolean m۸۰۳۷a(int width, int height) {
            if (width == this.f۸۴۱۷f.getWidth() && height == this.f۸۴۱۷f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: a, reason: contains not printable characters */
        public boolean m۸۰۳۶a() {
            if (!this.f۸۴۲۲k && this.f۸۴۱۸g == this.f۸۴۱۴c && this.f۸۴۱۹h == this.f۸۴۱۵d && this.f۸۴۲۱j == this.f۸۴۱۶e && this.f۸۴۲۰i == this.f۸۴۱۳b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: d, reason: contains not printable characters */
        public void m۸۰۴۳d() {
            this.f۸۴۱۸g = this.f۸۴۱۴c;
            this.f۸۴۱۹h = this.f۸۴۱۵d;
            this.f۸۴۲۰i = this.f۸۴۱۳b.getRootAlpha();
            this.f۸۴۲۱j = this.f۸۴۱۶e;
            this.f۸۴۲۲k = false;
        }

        public h() {
            this.f۸۴۱۴c = null;
            this.f۸۴۱۵d = Ci.f۸۳۵۷l;
            this.f۸۴۱۳b = new g();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new Ci(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources res) {
            return new Ci(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f۸۴۱۲a;
        }

        /* renamed from: c, reason: contains not printable characters */
        public boolean m۸۰۴۲c() {
            return this.f۸۴۱۳b.m۸۰۳۲a();
        }

        /* renamed from: a, reason: contains not printable characters */
        public boolean m۸۰۳۸a(int[] stateSet) {
            boolean changed = this.f۸۴۱۳b.m۸۰۳۳a(stateSet);
            this.f۸۴۲۲k |= changed;
            return changed;
        }
    }

    /* renamed from: a.b.d.a.i$g */
    private static class g {

        /* renamed from: q, reason: contains not printable characters */
        private static final Matrix f۸۳۹۵q = new Matrix();

        /* renamed from: a, reason: contains not printable characters */
        private final Path f۸۳۹۶a;

        /* renamed from: b, reason: contains not printable characters */
        private final Path f۸۳۹۷b;

        /* renamed from: c, reason: contains not printable characters */
        private final Matrix f۸۳۹۸c;

        /* renamed from: d, reason: contains not printable characters */
        Paint f۸۳۹۹d;

        /* renamed from: e, reason: contains not printable characters */
        Paint f۸۴۰۰e;

        /* renamed from: f, reason: contains not printable characters */
        private PathMeasure f۸۴۰۱f;

        /* renamed from: g, reason: contains not printable characters */
        private int f۸۴۰۲g;

        /* renamed from: h, reason: contains not printable characters */
        final d f۸۴۰۳h;

        /* renamed from: i, reason: contains not printable characters */
        float f۸۴۰۴i;

        /* renamed from: j, reason: contains not printable characters */
        float f۸۴۰۵j;

        /* renamed from: k, reason: contains not printable characters */
        float f۸۴۰۶k;

        /* renamed from: l, reason: contains not printable characters */
        float f۸۴۰۷l;

        /* renamed from: m, reason: contains not printable characters */
        int f۸۴۰۸m;

        /* renamed from: n, reason: contains not printable characters */
        String f۸۴۰۹n;

        /* renamed from: o, reason: contains not printable characters */
        Boolean f۸۴۱۰o;

        /* renamed from: p, reason: contains not printable characters */
        final p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ca<String, Object> f۸۴۱۱p;

        public g() {
            this.f۸۳۹۸c = new Matrix();
            this.f۸۴۰۴i = 0.0f;
            this.f۸۴۰۵j = 0.0f;
            this.f۸۴۰۶k = 0.0f;
            this.f۸۴۰۷l = 0.0f;
            this.f۸۴۰۸m = 255;
            this.f۸۴۰۹n = null;
            this.f۸۴۱۰o = null;
            this.f۸۴۱۱p = new p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ca<>();
            this.f۸۴۰۳h = new d();
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
            return getRootAlpha() / 255.0f;
        }

        public g(g copy) {
            this.f۸۳۹۸c = new Matrix();
            this.f۸۴۰۴i = 0.0f;
            this.f۸۴۰۵j = 0.0f;
            this.f۸۴۰۶k = 0.0f;
            this.f۸۴۰۷l = 0.0f;
            this.f۸۴۰۸m = 255;
            this.f۸۴۰۹n = null;
            this.f۸۴۱۰o = null;
            this.f۸۴۱۱p = new p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ca<>();
            this.f۸۴۰۳h = new d(copy.f۸۴۰۳h, this.f۸۴۱۱p);
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

        /* renamed from: a, reason: contains not printable characters */
        private void m۸۰۳۰a(d currentGroup, Matrix currentMatrix, Canvas canvas, int w, int h2, ColorFilter filter) {
            currentGroup.f۸۳۷۹a.set(currentMatrix);
            currentGroup.f۸۳۷۹a.preConcat(currentGroup.f۸۳۸۸j);
            canvas.save();
            for (int i = 0; i < currentGroup.f۸۳۸۰b.size(); i++) {
                e child = currentGroup.f۸۳۸۰b.get(i);
                if (child instanceof d) {
                    d childGroup = (d) child;
                    m۸۰۳۰a(childGroup, currentGroup.f۸۳۷۹a, canvas, w, h2, filter);
                } else if (child instanceof f) {
                    f childPath = (f) child;
                    m۸۰۲۹a(currentGroup, childPath, canvas, w, h2, filter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۸۰۳۱a(Canvas canvas, int w, int h2, ColorFilter filter) {
            m۸۰۳۰a(this.f۸۴۰۳h, f۸۳۹۵q, canvas, w, h2, filter);
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۸۰۲۹a(d vGroup, f vPath, Canvas canvas, int w, int h2, ColorFilter filter) {
            float len;
            float scaleX = w / this.f۸۴۰۶k;
            float scaleY = h2 / this.f۸۴۰۷l;
            float minScale = Math.min(scaleX, scaleY);
            Matrix groupStackedMatrix = vGroup.f۸۳۷۹a;
            this.f۸۳۹۸c.set(groupStackedMatrix);
            this.f۸۳۹۸c.postScale(scaleX, scaleY);
            float matrixScale = m۸۰۲۸a(groupStackedMatrix);
            if (matrixScale == 0.0f) {
                return;
            }
            vPath.m۸۰۲۵a(this.f۸۳۹۶a);
            Path path = this.f۸۳۹۶a;
            this.f۸۳۹۷b.reset();
            if (vPath.mo۸۰۲۶b()) {
                this.f۸۳۹۷b.addPath(path, this.f۸۳۹۸c);
                canvas.clipPath(this.f۸۳۹۷b);
                return;
            }
            c fullPath = (c) vPath;
            if (fullPath.f۸۳۷۳k != 0.0f || fullPath.f۸۳۷۴l != 1.0f) {
                float f2 = fullPath.f۸۳۷۳k;
                float f3 = fullPath.f۸۳۷۵m;
                float start = (f2 + f3) % 1.0f;
                float end = (fullPath.f۸۳۷۴l + f3) % 1.0f;
                if (this.f۸۴۰۱f == null) {
                    this.f۸۴۰۱f = new PathMeasure();
                }
                this.f۸۴۰۱f.setPath(this.f۸۳۹۶a, false);
                float len2 = this.f۸۴۰۱f.getLength();
                float start2 = start * len2;
                float end2 = end * len2;
                path.reset();
                if (start2 <= end2) {
                    len = 0.0f;
                    this.f۸۴۰۱f.getSegment(start2, end2, path, true);
                } else {
                    this.f۸۴۰۱f.getSegment(start2, len2, path, true);
                    len = 0.0f;
                    this.f۸۴۰۱f.getSegment(0.0f, end2, path, true);
                }
                path.rLineTo(len, len);
            }
            this.f۸۳۹۷b.addPath(path, this.f۸۳۹۸c);
            if (fullPath.f۸۳۶۹g.m۱۰۵۸۵e()) {
                Cb fill = fullPath.f۸۳۶۹g;
                if (this.f۸۴۰۰e == null) {
                    this.f۸۴۰۰e = new Paint(1);
                    this.f۸۴۰۰e.setStyle(Paint.Style.FILL);
                }
                Paint fillPaint = this.f۸۴۰۰e;
                if (fill.m۱۰۵۸۳c()) {
                    Shader shader = fill.m۱۰۵۸۲b();
                    shader.setLocalMatrix(this.f۸۳۹۸c);
                    fillPaint.setShader(shader);
                    fillPaint.setAlpha(Math.round(fullPath.f۸۳۷۲j * 255.0f));
                } else {
                    fillPaint.setColor(Ci.m۸۰۰۰a(fill.m۱۰۵۷۹a(), fullPath.f۸۳۷۲j));
                }
                fillPaint.setColorFilter(filter);
                this.f۸۳۹۷b.setFillType(fullPath.f۸۳۷۱i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f۸۳۹۷b, fillPaint);
            }
            if (fullPath.f۸۳۶۷e.m۱۰۵۸۵e()) {
                Cb strokeColor = fullPath.f۸۳۶۷e;
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
                if (strokeColor.m۱۰۵۸۳c()) {
                    Shader shader2 = strokeColor.m۱۰۵۸۲b();
                    shader2.setLocalMatrix(this.f۸۳۹۸c);
                    strokePaint.setShader(shader2);
                    strokePaint.setAlpha(Math.round(fullPath.f۸۳۷۰h * 255.0f));
                } else {
                    strokePaint.setColor(Ci.m۸۰۰۰a(strokeColor.m۱۰۵۷۹a(), fullPath.f۸۳۷۰h));
                }
                strokePaint.setColorFilter(filter);
                float finalStrokeScale = minScale * matrixScale;
                strokePaint.setStrokeWidth(fullPath.f۸۳۶۸f * finalStrokeScale);
                canvas.drawPath(this.f۸۳۹۷b, strokePaint);
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        private static float m۸۰۲۷a(float v1x, float v1y, float v2x, float v2y) {
            return (v1x * v2y) - (v1y * v2x);
        }

        /* renamed from: a, reason: contains not printable characters */
        private float m۸۰۲۸a(Matrix groupStackedMatrix) {
            float[] unitVectors = {0.0f, 1.0f, 1.0f, 0.0f};
            groupStackedMatrix.mapVectors(unitVectors);
            float scaleX = (float) Math.hypot(unitVectors[0], unitVectors[1]);
            float scaleY = (float) Math.hypot(unitVectors[2], unitVectors[3]);
            float crossProduct = m۸۰۲۷a(unitVectors[0], unitVectors[1], unitVectors[2], unitVectors[3]);
            float maxScale = Math.max(scaleX, scaleY);
            if (maxScale <= 0.0f) {
                return 0.0f;
            }
            float matrixScale = Math.abs(crossProduct) / maxScale;
            return matrixScale;
        }

        /* renamed from: a, reason: contains not printable characters */
        public boolean m۸۰۳۲a() {
            if (this.f۸۴۱۰o == null) {
                this.f۸۴۱۰o = Boolean.valueOf(this.f۸۴۰۳h.mo۸۰۲۳a());
            }
            return this.f۸۴۱۰o.booleanValue();
        }

        /* renamed from: a, reason: contains not printable characters */
        public boolean m۸۰۳۳a(int[] stateSet) {
            return this.f۸۴۰۳h.mo۸۰۲۴a(stateSet);
        }
    }

    /* renamed from: a.b.d.a.i$e */
    private static abstract class e {
        private e() {
        }

        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۸۰۲۳a() {
            return false;
        }

        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۸۰۲۴a(int[] stateSet) {
            return false;
        }
    }

    /* renamed from: a.b.d.a.i$d */
    private static class d extends e {

        /* renamed from: a, reason: contains not printable characters */
        final Matrix f۸۳۷۹a;

        /* renamed from: b, reason: contains not printable characters */
        final ArrayList<e> f۸۳۸۰b;

        /* renamed from: c, reason: contains not printable characters */
        float f۸۳۸۱c;

        /* renamed from: d, reason: contains not printable characters */
        private float f۸۳۸۲d;

        /* renamed from: e, reason: contains not printable characters */
        private float f۸۳۸۳e;

        /* renamed from: f, reason: contains not printable characters */
        private float f۸۳۸۴f;

        /* renamed from: g, reason: contains not printable characters */
        private float f۸۳۸۵g;

        /* renamed from: h, reason: contains not printable characters */
        private float f۸۳۸۶h;

        /* renamed from: i, reason: contains not printable characters */
        private float f۸۳۸۷i;

        /* renamed from: j, reason: contains not printable characters */
        final Matrix f۸۳۸۸j;

        /* renamed from: k, reason: contains not printable characters */
        int f۸۳۸۹k;

        /* renamed from: l, reason: contains not printable characters */
        private int[] f۸۳۹۰l;

        /* renamed from: m, reason: contains not printable characters */
        private String f۸۳۹۱m;

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, java.lang.Object> */
        public d(d copy, p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ca<String, Object> ca) {
            super();
            f newPath;
            this.f۸۳۷۹a = new Matrix();
            this.f۸۳۸۰b = new ArrayList<>();
            this.f۸۳۸۱c = 0.0f;
            this.f۸۳۸۲d = 0.0f;
            this.f۸۳۸۳e = 0.0f;
            this.f۸۳۸۴f = 1.0f;
            this.f۸۳۸۵g = 1.0f;
            this.f۸۳۸۶h = 0.0f;
            this.f۸۳۸۷i = 0.0f;
            this.f۸۳۸۸j = new Matrix();
            this.f۸۳۹۱m = null;
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
                ca.put(str, this);
            }
            this.f۸۳۸۸j.set(copy.f۸۳۸۸j);
            ArrayList<e> arrayList = copy.f۸۳۸۰b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object copyChild = arrayList.get(i);
                if (copyChild instanceof d) {
                    d copyGroup = (d) copyChild;
                    this.f۸۳۸۰b.add(new d(copyGroup, ca));
                } else {
                    if (copyChild instanceof c) {
                        newPath = new c((c) copyChild);
                    } else if (copyChild instanceof b) {
                        newPath = new b((b) copyChild);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f۸۳۸۰b.add(newPath);
                    String str2 = newPath.f۸۳۹۳b;
                    if (str2 != null) {
                        ca.put(str2, newPath);
                    }
                }
            }
        }

        public d() {
            super();
            this.f۸۳۷۹a = new Matrix();
            this.f۸۳۸۰b = new ArrayList<>();
            this.f۸۳۸۱c = 0.0f;
            this.f۸۳۸۲d = 0.0f;
            this.f۸۳۸۳e = 0.0f;
            this.f۸۳۸۴f = 1.0f;
            this.f۸۳۸۵g = 1.0f;
            this.f۸۳۸۶h = 0.0f;
            this.f۸۳۸۷i = 0.0f;
            this.f۸۳۸۸j = new Matrix();
            this.f۸۳۹۱m = null;
        }

        public String getGroupName() {
            return this.f۸۳۹۱m;
        }

        public Matrix getLocalMatrix() {
            return this.f۸۳۸۸j;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۸۰۲۰a(Resources res, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            TypedArray a2 = Cg.m۱۰۶۲۱a(res, theme, attrs, Ca.f۸۳۳۰b);
            m۸۰۱۸a(a2, parser);
            a2.recycle();
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۸۰۱۸a(TypedArray a2, XmlPullParser parser) {
            this.f۸۳۹۰l = null;
            this.f۸۳۸۱c = Cg.m۱۰۶۱۹a(a2, parser, "rotation", 5, this.f۸۳۸۱c);
            this.f۸۳۸۲d = a2.getFloat(1, this.f۸۳۸۲d);
            this.f۸۳۸۳e = a2.getFloat(2, this.f۸۳۸۳e);
            this.f۸۳۸۴f = Cg.m۱۰۶۱۹a(a2, parser, "scaleX", 3, this.f۸۳۸۴f);
            this.f۸۳۸۵g = Cg.m۱۰۶۱۹a(a2, parser, "scaleY", 4, this.f۸۳۸۵g);
            this.f۸۳۸۶h = Cg.m۱۰۶۱۹a(a2, parser, "translateX", 6, this.f۸۳۸۶h);
            this.f۸۳۸۷i = Cg.m۱۰۶۱۹a(a2, parser, "translateY", 7, this.f۸۳۸۷i);
            String groupName = a2.getString(0);
            if (groupName != null) {
                this.f۸۳۹۱m = groupName;
            }
            m۸۰۱۹b();
        }

        /* renamed from: b, reason: contains not printable characters */
        private void m۸۰۱۹b() {
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
                m۸۰۱۹b();
            }
        }

        public float getPivotX() {
            return this.f۸۳۸۲d;
        }

        public void setPivotX(float pivotX) {
            if (pivotX != this.f۸۳۸۲d) {
                this.f۸۳۸۲d = pivotX;
                m۸۰۱۹b();
            }
        }

        public float getPivotY() {
            return this.f۸۳۸۳e;
        }

        public void setPivotY(float pivotY) {
            if (pivotY != this.f۸۳۸۳e) {
                this.f۸۳۸۳e = pivotY;
                m۸۰۱۹b();
            }
        }

        public float getScaleX() {
            return this.f۸۳۸۴f;
        }

        public void setScaleX(float scaleX) {
            if (scaleX != this.f۸۳۸۴f) {
                this.f۸۳۸۴f = scaleX;
                m۸۰۱۹b();
            }
        }

        public float getScaleY() {
            return this.f۸۳۸۵g;
        }

        public void setScaleY(float scaleY) {
            if (scaleY != this.f۸۳۸۵g) {
                this.f۸۳۸۵g = scaleY;
                m۸۰۱۹b();
            }
        }

        public float getTranslateX() {
            return this.f۸۳۸۶h;
        }

        public void setTranslateX(float translateX) {
            if (translateX != this.f۸۳۸۶h) {
                this.f۸۳۸۶h = translateX;
                m۸۰۱۹b();
            }
        }

        public float getTranslateY() {
            return this.f۸۳۸۷i;
        }

        public void setTranslateY(float translateY) {
            if (translateY != this.f۸۳۸۷i) {
                this.f۸۳۸۷i = translateY;
                m۸۰۱۹b();
            }
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a.Ci.e
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۸۰۲۳a() {
            for (int i = 0; i < this.f۸۳۸۰b.size(); i++) {
                if (this.f۸۳۸۰b.get(i).mo۸۰۲۳a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a.Ci.e
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۸۰۲۴a(int[] stateSet) {
            boolean changed = false;
            for (int i = 0; i < this.f۸۳۸۰b.size(); i++) {
                changed |= this.f۸۳۸۰b.get(i).mo۸۰۲۴a(stateSet);
            }
            return changed;
        }
    }

    /* renamed from: a.b.d.a.i$f */
    private static abstract class f extends e {

        /* renamed from: a, reason: contains not printable characters */
        protected Cb.b[] f۸۳۹۲a;

        /* renamed from: b, reason: contains not printable characters */
        String f۸۳۹۳b;

        /* renamed from: c, reason: contains not printable characters */
        int f۸۳۹۴c;

        public f() {
            super();
            this.f۸۳۹۲a = null;
        }

        public f(f copy) {
            super();
            this.f۸۳۹۲a = null;
            this.f۸۳۹۳b = copy.f۸۳۹۳b;
            this.f۸۳۹۴c = copy.f۸۳۹۴c;
            this.f۸۳۹۲a = p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cb.m۸۳۶۲a(copy.f۸۳۹۲a);
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۸۰۲۵a(Path path) {
            path.reset();
            Cb.b[] bVarArr = this.f۸۳۹۲a;
            if (bVarArr != null) {
                Cb.b.m۸۳۶۹a(bVarArr, path);
            }
        }

        public String getPathName() {
            return this.f۸۳۹۳b;
        }

        /* renamed from: b, reason: contains not printable characters */
        public boolean mo۸۰۲۶b() {
            return false;
        }

        public Cb.b[] getPathData() {
            return this.f۸۳۹۲a;
        }

        public void setPathData(Cb.b[] nodes) {
            if (!p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cb.m۸۳۵۹a(this.f۸۳۹۲a, nodes)) {
                this.f۸۳۹۲a = p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cb.m۸۳۶۲a(nodes);
            } else {
                p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cb.m۸۳۶۴b(this.f۸۳۹۲a, nodes);
            }
        }
    }

    /* renamed from: a.b.d.a.i$b */
    private static class b extends f {
        public b() {
        }

        public b(b copy) {
            super(copy);
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۸۰۱۰a(Resources r, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            boolean hasPathData = Cg.m۱۰۶۲۵a(parser, "pathData");
            if (!hasPathData) {
                return;
            }
            TypedArray a2 = Cg.m۱۰۶۲۱a(r, theme, attrs, Ca.f۸۳۳۲d);
            m۸۰۰۹a(a2);
            a2.recycle();
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۸۰۰۹a(TypedArray a2) {
            String pathName = a2.getString(0);
            if (pathName != null) {
                this.f۸۳۹۳b = pathName;
            }
            String pathData = a2.getString(1);
            if (pathData != null) {
                this.f۸۳۹۲a = p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cb.m۸۳۶۱a(pathData);
            }
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a.Ci.f
        /* renamed from: b, reason: contains not printable characters */
        public boolean mo۸۰۲۶b() {
            return true;
        }
    }

    /* renamed from: a.b.d.a.i$c */
    private static class c extends f {

        /* renamed from: d, reason: contains not printable characters */
        private int[] f۸۳۶۶d;

        /* renamed from: e, reason: contains not printable characters */
        android.support.v4.content.p۲۰۲e.Cb f۸۳۶۷e;

        /* renamed from: f, reason: contains not printable characters */
        float f۸۳۶۸f;

        /* renamed from: g, reason: contains not printable characters */
        android.support.v4.content.p۲۰۲e.Cb f۸۳۶۹g;

        /* renamed from: h, reason: contains not printable characters */
        float f۸۳۷۰h;

        /* renamed from: i, reason: contains not printable characters */
        int f۸۳۷۱i;

        /* renamed from: j, reason: contains not printable characters */
        float f۸۳۷۲j;

        /* renamed from: k, reason: contains not printable characters */
        float f۸۳۷۳k;

        /* renamed from: l, reason: contains not printable characters */
        float f۸۳۷۴l;

        /* renamed from: m, reason: contains not printable characters */
        float f۸۳۷۵m;

        /* renamed from: n, reason: contains not printable characters */
        Paint.Cap f۸۳۷۶n;

        /* renamed from: o, reason: contains not printable characters */
        Paint.Join f۸۳۷۷o;

        /* renamed from: p, reason: contains not printable characters */
        float f۸۳۷۸p;

        public c() {
            this.f۸۳۶۸f = 0.0f;
            this.f۸۳۷۰h = 1.0f;
            this.f۸۳۷۱i = 0;
            this.f۸۳۷۲j = 1.0f;
            this.f۸۳۷۳k = 0.0f;
            this.f۸۳۷۴l = 1.0f;
            this.f۸۳۷۵m = 0.0f;
            this.f۸۳۷۶n = Paint.Cap.BUTT;
            this.f۸۳۷۷o = Paint.Join.MITER;
            this.f۸۳۷۸p = 4.0f;
        }

        public c(c copy) {
            super(copy);
            this.f۸۳۶۸f = 0.0f;
            this.f۸۳۷۰h = 1.0f;
            this.f۸۳۷۱i = 0;
            this.f۸۳۷۲j = 1.0f;
            this.f۸۳۷۳k = 0.0f;
            this.f۸۳۷۴l = 1.0f;
            this.f۸۳۷۵m = 0.0f;
            this.f۸۳۷۶n = Paint.Cap.BUTT;
            this.f۸۳۷۷o = Paint.Join.MITER;
            this.f۸۳۷۸p = 4.0f;
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

        /* renamed from: a, reason: contains not printable characters */
        private Paint.Cap m۸۰۱۲a(int id, Paint.Cap defValue) {
            if (id == 0) {
                return Paint.Cap.BUTT;
            }
            if (id == 1) {
                return Paint.Cap.ROUND;
            }
            if (id == 2) {
                return Paint.Cap.SQUARE;
            }
            return defValue;
        }

        /* renamed from: a, reason: contains not printable characters */
        private Paint.Join m۸۰۱۳a(int id, Paint.Join defValue) {
            if (id == 0) {
                return Paint.Join.MITER;
            }
            if (id == 1) {
                return Paint.Join.ROUND;
            }
            if (id == 2) {
                return Paint.Join.BEVEL;
            }
            return defValue;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۸۰۱۵a(Resources r, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            TypedArray a2 = Cg.m۱۰۶۲۱a(r, theme, attrs, Ca.f۸۳۳۱c);
            m۸۰۱۴a(a2, parser, theme);
            a2.recycle();
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۸۰۱۴a(TypedArray a2, XmlPullParser parser, Resources.Theme theme) {
            this.f۸۳۶۶d = null;
            boolean hasPathData = Cg.m۱۰۶۲۵a(parser, "pathData");
            if (!hasPathData) {
                return;
            }
            String pathName = a2.getString(0);
            if (pathName != null) {
                this.f۸۳۹۳b = pathName;
            }
            String pathData = a2.getString(2);
            if (pathData != null) {
                this.f۸۳۹۲a = p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cb.m۸۳۶۱a(pathData);
            }
            this.f۸۳۶۹g = Cg.m۱۰۶۲۲a(a2, parser, theme, "fillColor", 1, 0);
            this.f۸۳۷۲j = Cg.m۱۰۶۱۹a(a2, parser, "fillAlpha", 12, this.f۸۳۷۲j);
            int lineCap = Cg.m۱۰۶۲۶b(a2, parser, "strokeLineCap", 8, -1);
            this.f۸۳۷۶n = m۸۰۱۲a(lineCap, this.f۸۳۷۶n);
            int lineJoin = Cg.m۱۰۶۲۶b(a2, parser, "strokeLineJoin", 9, -1);
            this.f۸۳۷۷o = m۸۰۱۳a(lineJoin, this.f۸۳۷۷o);
            this.f۸۳۷۸p = Cg.m۱۰۶۱۹a(a2, parser, "strokeMiterLimit", 10, this.f۸۳۷۸p);
            this.f۸۳۶۷e = Cg.m۱۰۶۲۲a(a2, parser, theme, "strokeColor", 3, 0);
            this.f۸۳۷۰h = Cg.m۱۰۶۱۹a(a2, parser, "strokeAlpha", 11, this.f۸۳۷۰h);
            this.f۸۳۶۸f = Cg.m۱۰۶۱۹a(a2, parser, "strokeWidth", 4, this.f۸۳۶۸f);
            this.f۸۳۷۴l = Cg.m۱۰۶۱۹a(a2, parser, "trimPathEnd", 6, this.f۸۳۷۴l);
            this.f۸۳۷۵m = Cg.m۱۰۶۱۹a(a2, parser, "trimPathOffset", 7, this.f۸۳۷۵m);
            this.f۸۳۷۳k = Cg.m۱۰۶۱۹a(a2, parser, "trimPathStart", 5, this.f۸۳۷۳k);
            this.f۸۳۷۱i = Cg.m۱۰۶۲۶b(a2, parser, "fillType", 13, this.f۸۳۷۱i);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a.Ci.e
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۸۰۲۳a() {
            return this.f۸۳۶۹g.m۱۰۵۸۴d() || this.f۸۳۶۷e.m۱۰۵۸۴d();
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a.Ci.e
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۸۰۲۴a(int[] stateSet) {
            boolean changed = this.f۸۳۶۹g.m۱۰۵۸۱a(stateSet);
            return changed | this.f۸۳۶۷e.m۱۰۵۸۱a(stateSet);
        }

        int getStrokeColor() {
            return this.f۸۳۶۷e.m۱۰۵۷۹a();
        }

        void setStrokeColor(int strokeColor) {
            this.f۸۳۶۷e.m۱۰۵۸۰a(strokeColor);
        }

        float getStrokeWidth() {
            return this.f۸۳۶۸f;
        }

        void setStrokeWidth(float strokeWidth) {
            this.f۸۳۶۸f = strokeWidth;
        }

        float getStrokeAlpha() {
            return this.f۸۳۷۰h;
        }

        void setStrokeAlpha(float strokeAlpha) {
            this.f۸۳۷۰h = strokeAlpha;
        }

        int getFillColor() {
            return this.f۸۳۶۹g.m۱۰۵۷۹a();
        }

        void setFillColor(int fillColor) {
            this.f۸۳۶۹g.m۱۰۵۸۰a(fillColor);
        }

        float getFillAlpha() {
            return this.f۸۳۷۲j;
        }

        void setFillAlpha(float fillAlpha) {
            this.f۸۳۷۲j = fillAlpha;
        }

        float getTrimPathStart() {
            return this.f۸۳۷۳k;
        }

        void setTrimPathStart(float trimPathStart) {
            this.f۸۳۷۳k = trimPathStart;
        }

        float getTrimPathEnd() {
            return this.f۸۳۷۴l;
        }

        void setTrimPathEnd(float trimPathEnd) {
            this.f۸۳۷۴l = trimPathEnd;
        }

        float getTrimPathOffset() {
            return this.f۸۳۷۵m;
        }

        void setTrimPathOffset(float trimPathOffset) {
            this.f۸۳۷۵m = trimPathOffset;
        }
    }
}
