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

/* access modifiers changed from: package-private */
public class w0 extends Resources {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f۲۲۸۷a;

    public w0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f۲۲۸۷a = resources;
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int id) {
        return this.f۲۲۸۷a.getText(id);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int id, int quantity) {
        return this.f۲۲۸۷a.getQuantityText(id, quantity);
    }

    @Override // android.content.res.Resources
    public String getString(int id) {
        return this.f۲۲۸۷a.getString(id);
    }

    @Override // android.content.res.Resources
    public String getString(int id, Object... formatArgs) {
        return this.f۲۲۸۷a.getString(id, formatArgs);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int id, int quantity, Object... formatArgs) {
        return this.f۲۲۸۷a.getQuantityString(id, quantity, formatArgs);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int id, int quantity) {
        return this.f۲۲۸۷a.getQuantityString(id, quantity);
    }

    public CharSequence getText(int id, CharSequence def) {
        return this.f۲۲۸۷a.getText(id, def);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int id) {
        return this.f۲۲۸۷a.getTextArray(id);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int id) {
        return this.f۲۲۸۷a.getStringArray(id);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int id) {
        return this.f۲۲۸۷a.getIntArray(id);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int id) {
        return this.f۲۲۸۷a.obtainTypedArray(id);
    }

    @Override // android.content.res.Resources
    public float getDimension(int id) {
        return this.f۲۲۸۷a.getDimension(id);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int id) {
        return this.f۲۲۸۷a.getDimensionPixelOffset(id);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int id) {
        return this.f۲۲۸۷a.getDimensionPixelSize(id);
    }

    public float getFraction(int id, int base, int pbase) {
        return this.f۲۲۸۷a.getFraction(id, base, pbase);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int id) {
        return this.f۲۲۸۷a.getDrawable(id);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int id, Resources.Theme theme) {
        return this.f۲۲۸۷a.getDrawable(id, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int id, int density) {
        return this.f۲۲۸۷a.getDrawableForDensity(id, density);
    }

    public Drawable getDrawableForDensity(int id, int density, Resources.Theme theme) {
        return this.f۲۲۸۷a.getDrawableForDensity(id, density, theme);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int id) {
        return this.f۲۲۸۷a.getMovie(id);
    }

    @Override // android.content.res.Resources
    public int getColor(int id) {
        return this.f۲۲۸۷a.getColor(id);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int id) {
        return this.f۲۲۸۷a.getColorStateList(id);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int id) {
        return this.f۲۲۸۷a.getBoolean(id);
    }

    @Override // android.content.res.Resources
    public int getInteger(int id) {
        return this.f۲۲۸۷a.getInteger(id);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int id) {
        return this.f۲۲۸۷a.getLayout(id);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int id) {
        return this.f۲۲۸۷a.getAnimation(id);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int id) {
        return this.f۲۲۸۷a.getXml(id);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int id) {
        return this.f۲۲۸۷a.openRawResource(id);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int id, TypedValue value) {
        return this.f۲۲۸۷a.openRawResource(id, value);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int id) {
        return this.f۲۲۸۷a.openRawResourceFd(id);
    }

    @Override // android.content.res.Resources
    public void getValue(int id, TypedValue outValue, boolean resolveRefs) {
        this.f۲۲۸۷a.getValue(id, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int id, int density, TypedValue outValue, boolean resolveRefs) {
        this.f۲۲۸۷a.getValueForDensity(id, density, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    public void getValue(String name, TypedValue outValue, boolean resolveRefs) {
        this.f۲۲۸۷a.getValue(name, outValue, resolveRefs);
    }

    public TypedArray obtainAttributes(AttributeSet set, int[] attrs) {
        return this.f۲۲۸۷a.obtainAttributes(set, attrs);
    }

    public void updateConfiguration(Configuration config, DisplayMetrics metrics) {
        super.updateConfiguration(config, metrics);
        Resources resources = this.f۲۲۸۷a;
        if (resources != null) {
            resources.updateConfiguration(config, metrics);
        }
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f۲۲۸۷a.getDisplayMetrics();
    }

    public Configuration getConfiguration() {
        return this.f۲۲۸۷a.getConfiguration();
    }

    public int getIdentifier(String name, String defType, String defPackage) {
        return this.f۲۲۸۷a.getIdentifier(name, defType, defPackage);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int resid) {
        return this.f۲۲۸۷a.getResourceName(resid);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int resid) {
        return this.f۲۲۸۷a.getResourcePackageName(resid);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int resid) {
        return this.f۲۲۸۷a.getResourceTypeName(resid);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int resid) {
        return this.f۲۲۸۷a.getResourceEntryName(resid);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser parser, Bundle outBundle) {
        this.f۲۲۸۷a.parseBundleExtras(parser, outBundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String tagName, AttributeSet attrs, Bundle outBundle) {
        this.f۲۲۸۷a.parseBundleExtra(tagName, attrs, outBundle);
    }
}
