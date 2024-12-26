package android.support.v7.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: android.support.v7.widget.w0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cw0 extends Resources {

    /* renamed from: a, reason: contains not printable characters */
    private final Resources f۱۲۳۸۷a;

    public Cw0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f۱۲۳۸۷a = resources;
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int id) {
        return this.f۱۲۳۸۷a.getText(id);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int id, int quantity) {
        return this.f۱۲۳۸۷a.getQuantityText(id, quantity);
    }

    @Override // android.content.res.Resources
    public String getString(int id) {
        return this.f۱۲۳۸۷a.getString(id);
    }

    @Override // android.content.res.Resources
    public String getString(int id, Object... formatArgs) {
        return this.f۱۲۳۸۷a.getString(id, formatArgs);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int id, int quantity, Object... formatArgs) {
        return this.f۱۲۳۸۷a.getQuantityString(id, quantity, formatArgs);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int id, int quantity) {
        return this.f۱۲۳۸۷a.getQuantityString(id, quantity);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int id, CharSequence def) {
        return this.f۱۲۳۸۷a.getText(id, def);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int id) {
        return this.f۱۲۳۸۷a.getTextArray(id);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int id) {
        return this.f۱۲۳۸۷a.getStringArray(id);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int id) {
        return this.f۱۲۳۸۷a.getIntArray(id);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int id) {
        return this.f۱۲۳۸۷a.obtainTypedArray(id);
    }

    @Override // android.content.res.Resources
    public float getDimension(int id) {
        return this.f۱۲۳۸۷a.getDimension(id);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int id) {
        return this.f۱۲۳۸۷a.getDimensionPixelOffset(id);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int id) {
        return this.f۱۲۳۸۷a.getDimensionPixelSize(id);
    }

    @Override // android.content.res.Resources
    public float getFraction(int id, int base, int pbase) {
        return this.f۱۲۳۸۷a.getFraction(id, base, pbase);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int id) {
        return this.f۱۲۳۸۷a.getDrawable(id);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int id, Resources.Theme theme) {
        return this.f۱۲۳۸۷a.getDrawable(id, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int id, int density) {
        return this.f۱۲۳۸۷a.getDrawableForDensity(id, density);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int id, int density, Resources.Theme theme) {
        return this.f۱۲۳۸۷a.getDrawableForDensity(id, density, theme);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int id) {
        return this.f۱۲۳۸۷a.getMovie(id);
    }

    @Override // android.content.res.Resources
    public int getColor(int id) {
        return this.f۱۲۳۸۷a.getColor(id);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int id) {
        return this.f۱۲۳۸۷a.getColorStateList(id);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int id) {
        return this.f۱۲۳۸۷a.getBoolean(id);
    }

    @Override // android.content.res.Resources
    public int getInteger(int id) {
        return this.f۱۲۳۸۷a.getInteger(id);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int id) {
        return this.f۱۲۳۸۷a.getLayout(id);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int id) {
        return this.f۱۲۳۸۷a.getAnimation(id);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int id) {
        return this.f۱۲۳۸۷a.getXml(id);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int id) {
        return this.f۱۲۳۸۷a.openRawResource(id);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int id, TypedValue value) {
        return this.f۱۲۳۸۷a.openRawResource(id, value);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int id) {
        return this.f۱۲۳۸۷a.openRawResourceFd(id);
    }

    @Override // android.content.res.Resources
    public void getValue(int id, TypedValue outValue, boolean resolveRefs) {
        this.f۱۲۳۸۷a.getValue(id, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int id, int density, TypedValue outValue, boolean resolveRefs) {
        this.f۱۲۳۸۷a.getValueForDensity(id, density, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    public void getValue(String name, TypedValue outValue, boolean resolveRefs) {
        this.f۱۲۳۸۷a.getValue(name, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet set, int[] attrs) {
        return this.f۱۲۳۸۷a.obtainAttributes(set, attrs);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration config, DisplayMetrics metrics) {
        super.updateConfiguration(config, metrics);
        Resources resources = this.f۱۲۳۸۷a;
        if (resources != null) {
            resources.updateConfiguration(config, metrics);
        }
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f۱۲۳۸۷a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f۱۲۳۸۷a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String name, String defType, String defPackage) {
        return this.f۱۲۳۸۷a.getIdentifier(name, defType, defPackage);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int resid) {
        return this.f۱۲۳۸۷a.getResourceName(resid);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int resid) {
        return this.f۱۲۳۸۷a.getResourcePackageName(resid);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int resid) {
        return this.f۱۲۳۸۷a.getResourceTypeName(resid);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int resid) {
        return this.f۱۲۳۸۷a.getResourceEntryName(resid);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser parser, Bundle outBundle) {
        this.f۱۲۳۸۷a.parseBundleExtras(parser, outBundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String tagName, AttributeSet attrs, Bundle outBundle) {
        this.f۱۲۳۸۷a.parseBundleExtra(tagName, attrs, outBundle);
    }
}
