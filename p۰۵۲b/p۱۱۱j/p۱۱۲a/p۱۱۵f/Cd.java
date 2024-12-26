package p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.Ca;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc;

/* renamed from: b.j.a.f.d  reason: invalid class name */
public class Cd {
    static {
        new AtomicInteger(1);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۶۵۱۳a(int[] states, int state) {
        if (states == null) {
            return false;
        }
        for (int state1 : states) {
            if (state1 == state) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۵۰۸a(View v, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            v.setBackground(drawable);
        } else {
            v.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۵۰۷a(View v, int resId) {
        m۱۶۵۰۹a(v, (AttributeSet) null, 0, resId);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۵۰۹a(View v, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        int rightPadding;
        int rightPadding2;
        int rightPadding3;
        TypedArray a = v.getContext().obtainStyledAttributes(attrs, Cc.View, defStyleAttr, defStyleRes);
        int attr = -1;
        int startPadding = Integer.MIN_VALUE;
        int endPadding = Integer.MIN_VALUE;
        int padding = -1;
        boolean startPaddingDefined = false;
        boolean endPaddingDefined = false;
        boolean leftPaddingDefined = false;
        boolean rightPaddingDefined = false;
        int leftPadding = -1;
        int topPadding = -1;
        int i = 0;
        int bottomPadding = -1;
        for (int count = a.getIndexCount(); i < count; count = count) {
            int attr2 = a.getIndex(i);
            if (attr2 == Cc.View_android_background) {
                m۱۶۵۰۸a(v, a.getDrawable(attr2));
            } else if (attr2 == Cc.View_android_backgroundTint) {
                if (Build.VERSION.SDK_INT >= 21) {
                    v.setBackgroundTintList(a.getColorStateList(attr2));
                }
            } else if (attr2 == Cc.View_android_backgroundTintMode) {
                if (Build.VERSION.SDK_INT >= 21) {
                    int value = a.getInt(attr2, 3);
                    if (value == 3) {
                        v.setBackgroundTintMode(PorterDuff.Mode.SRC_OVER);
                    } else if (value == 5) {
                        v.setBackgroundTintMode(PorterDuff.Mode.SRC_IN);
                    } else if (value != 9) {
                        switch (value) {
                            case 14:
                                v.setBackgroundTintMode(PorterDuff.Mode.MULTIPLY);
                                break;
                            case 15:
                                v.setBackgroundTintMode(PorterDuff.Mode.SCREEN);
                                break;
                            case 16:
                                v.setBackgroundTintMode(PorterDuff.Mode.ADD);
                                break;
                        }
                    } else {
                        v.setBackgroundTintMode(PorterDuff.Mode.SRC_ATOP);
                    }
                }
            } else if (attr2 != Cc.View_android_elevation) {
                if (attr2 == Cc.View_android_padding) {
                    int padding2 = a.getDimensionPixelSize(attr2, -1);
                    leftPaddingDefined = true;
                    rightPaddingDefined = true;
                    attr = attr;
                    padding = padding2;
                } else if (attr2 == Cc.View_android_paddingLeft) {
                    leftPadding = a.getDimensionPixelSize(attr2, -1);
                    leftPaddingDefined = true;
                    attr = attr;
                } else if (attr2 == Cc.View_android_paddingTop) {
                    topPadding = a.getDimensionPixelSize(attr2, -1);
                    attr = attr;
                } else if (attr2 == Cc.View_android_paddingRight) {
                    attr = a.getDimensionPixelSize(attr2, -1);
                    rightPaddingDefined = true;
                } else if (attr2 == Cc.View_android_paddingBottom) {
                    bottomPadding = a.getDimensionPixelSize(attr2, -1);
                    attr = attr;
                } else if (attr2 == Cc.View_android_paddingStart) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        int startPadding2 = a.getDimensionPixelSize(attr2, Integer.MIN_VALUE);
                        startPaddingDefined = startPadding2 != Integer.MIN_VALUE;
                        startPadding = startPadding2;
                        attr = attr;
                    }
                } else if (attr2 == Cc.View_android_paddingEnd) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        int endPadding2 = a.getDimensionPixelSize(attr2, Integer.MIN_VALUE);
                        endPaddingDefined = endPadding2 != Integer.MIN_VALUE;
                        endPadding = endPadding2;
                        attr = attr;
                    }
                } else if (attr2 == Cc.View_android_fadeScrollbars) {
                    v.setScrollbarFadingEnabled(a.getBoolean(attr2, true));
                } else if (attr2 == Cc.View_android_fadingEdgeLength) {
                    v.setFadingEdgeLength(a.getDimensionPixelOffset(attr2, 0));
                } else if (attr2 == Cc.View_android_minHeight) {
                    v.setMinimumHeight(a.getDimensionPixelSize(attr2, 0));
                } else if (attr2 == Cc.View_android_minWidth) {
                    v.setMinimumWidth(a.getDimensionPixelSize(attr2, 0));
                } else if (attr2 == Cc.View_android_requiresFadingEdge) {
                    v.setVerticalFadingEdgeEnabled(a.getBoolean(attr2, true));
                } else if (attr2 == Cc.View_android_scrollbarDefaultDelayBeforeFade) {
                    if (Build.VERSION.SDK_INT >= 16) {
                        v.setScrollBarDefaultDelayBeforeFade(a.getInteger(attr2, 0));
                    }
                } else if (attr2 == Cc.View_android_scrollbarFadeDuration) {
                    if (Build.VERSION.SDK_INT >= 16) {
                        v.setScrollBarFadeDuration(a.getInteger(attr2, 0));
                    }
                } else if (attr2 == Cc.View_android_scrollbarSize) {
                    if (Build.VERSION.SDK_INT >= 16) {
                        v.setScrollBarSize(a.getDimensionPixelSize(attr2, 0));
                    }
                } else if (attr2 == Cc.View_android_scrollbarStyle) {
                    int value2 = a.getInteger(attr2, 0);
                    if (value2 == 0) {
                        v.setScrollBarStyle(0);
                    } else if (value2 == 16777216) {
                        v.setScrollBarStyle(16777216);
                    } else if (value2 == 33554432) {
                        v.setScrollBarStyle(33554432);
                    } else if (value2 == 50331648) {
                        v.setScrollBarStyle(50331648);
                    }
                } else if (attr2 == Cc.View_android_soundEffectsEnabled) {
                    v.setSoundEffectsEnabled(a.getBoolean(attr2, true));
                } else if (attr2 == Cc.View_android_textAlignment) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        switch (a.getInteger(attr2, 0)) {
                            case 0:
                                v.setTextAlignment(0);
                                break;
                            case 1:
                                v.setTextAlignment(1);
                                break;
                            case 2:
                                v.setTextAlignment(2);
                                break;
                            case 3:
                                v.setTextAlignment(3);
                                break;
                            case 4:
                                v.setTextAlignment(4);
                                break;
                            case 5:
                                v.setTextAlignment(5);
                                break;
                            case 6:
                                v.setTextAlignment(6);
                                break;
                        }
                    }
                } else if (attr2 == Cc.View_android_textDirection) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        int value3 = a.getInteger(attr2, 0);
                        if (value3 == 0) {
                            v.setTextDirection(0);
                        } else if (value3 == 1) {
                            v.setTextDirection(1);
                        } else if (value3 == 2) {
                            v.setTextDirection(2);
                        } else if (value3 == 3) {
                            v.setTextDirection(3);
                        } else if (value3 == 4) {
                            v.setTextDirection(4);
                        } else if (value3 == 5) {
                            v.setTextDirection(5);
                        }
                    }
                } else if (attr2 == Cc.View_android_visibility) {
                    int value4 = a.getInteger(attr2, 0);
                    if (value4 == 0) {
                        v.setVisibility(0);
                    } else if (value4 == 1) {
                        v.setVisibility(4);
                    } else if (value4 == 2) {
                        v.setVisibility(8);
                    }
                } else if (attr2 == Cc.View_android_layoutDirection) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        int value5 = a.getInteger(attr2, 0);
                        if (value5 == 0) {
                            v.setLayoutDirection(0);
                        } else if (value5 == 1) {
                            v.setLayoutDirection(1);
                        } else if (value5 == 2) {
                            v.setLayoutDirection(2);
                        } else if (value5 == 3) {
                            v.setLayoutDirection(3);
                        }
                    }
                } else if (attr2 == Cc.View_android_src && (v instanceof ImageView)) {
                    ((ImageView) v).setImageResource(a.getResourceId(attr2, 0));
                }
                i++;
            } else if (Build.VERSION.SDK_INT >= 21) {
                v.setElevation((float) a.getDimensionPixelOffset(attr2, 0));
            }
            attr = attr;
            i++;
        }
        if (padding >= 0) {
            v.setPadding(padding, padding, padding, padding);
        } else if (Build.VERSION.SDK_INT < 17) {
            if (startPaddingDefined) {
                leftPadding = startPadding;
            }
            if (endPaddingDefined) {
                rightPadding = endPadding;
            } else {
                rightPadding = attr;
            }
            int paddingLeft = leftPadding >= 0 ? leftPadding : v.getPaddingLeft();
            int paddingTop = topPadding >= 0 ? topPadding : v.getPaddingTop();
            int paddingRight = rightPadding >= 0 ? rightPadding : v.getPaddingRight();
            if (bottomPadding >= 0) {
                rightPadding2 = rightPadding;
                rightPadding3 = bottomPadding;
            } else {
                rightPadding2 = rightPadding;
                rightPadding3 = v.getPaddingBottom();
            }
            v.setPadding(paddingLeft, paddingTop, paddingRight, rightPadding3);
        } else {
            if (leftPaddingDefined || rightPaddingDefined) {
                v.setPadding(leftPaddingDefined ? leftPadding : v.getPaddingLeft(), topPadding >= 0 ? topPadding : v.getPaddingTop(), rightPaddingDefined ? attr : v.getPaddingRight(), bottomPadding >= 0 ? bottomPadding : v.getPaddingBottom());
            }
            if (startPaddingDefined || endPaddingDefined) {
                v.setPaddingRelative(startPaddingDefined ? startPadding : v.getPaddingStart(), topPadding >= 0 ? topPadding : v.getPaddingTop(), endPaddingDefined ? endPadding : v.getPaddingEnd(), bottomPadding >= 0 ? bottomPadding : v.getPaddingBottom());
            }
        }
        a.recycle();
        if (v instanceof TextView) {
            m۱۶۵۱۴b((TextView) v, attrs, defStyleAttr, defStyleRes);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۵۱۲a(TextView v, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a = v.getContext().obtainStyledAttributes(attrs, new int[]{Ca.tv_fontFamily}, defStyleAttr, defStyleRes);
        String fontFamily = a.getString(0);
        if (fontFamily != null) {
            v.setTypeface(Cc.m۱۶۵۰۶a(v.getContext(), fontFamily, 0));
        }
        a.recycle();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۵۱۱a(TextView v, int resId) {
        if (resId != 0) {
            String fontFamily = null;
            int typefaceIndex = -1;
            int styleIndex = -1;
            int shadowColor = 0;
            float dx = 0.0f;
            float dy = 0.0f;
            float r = 0.0f;
            TypedArray appearance = v.getContext().obtainStyledAttributes(resId, Cc.TextAppearance);
            if (appearance != null) {
                int n = appearance.getIndexCount();
                for (int i = 0; i < n; i++) {
                    int attr = appearance.getIndex(i);
                    if (attr == Cc.TextAppearance_android_textColorHighlight) {
                        v.setHighlightColor(appearance.getColor(attr, 0));
                    } else if (attr == Cc.TextAppearance_android_textColor) {
                        v.setTextColor(appearance.getColorStateList(attr));
                    } else if (attr == Cc.TextAppearance_android_textColorHint) {
                        v.setHintTextColor(appearance.getColorStateList(attr));
                    } else if (attr == Cc.TextAppearance_android_textColorLink) {
                        v.setLinkTextColor(appearance.getColorStateList(attr));
                    } else if (attr == Cc.TextAppearance_android_textSize) {
                        v.setTextSize(0, (float) appearance.getDimensionPixelSize(attr, 0));
                    } else if (attr == Cc.TextAppearance_android_typeface) {
                        typefaceIndex = appearance.getInt(attr, -1);
                    } else if (attr == Cc.TextAppearance_android_fontFamily) {
                        fontFamily = appearance.getString(attr);
                    } else if (attr == Cc.TextAppearance_tv_fontFamily) {
                        fontFamily = appearance.getString(attr);
                    } else if (attr == Cc.TextAppearance_android_textStyle) {
                        styleIndex = appearance.getInt(attr, -1);
                    } else if (attr == Cc.TextAppearance_android_textAllCaps) {
                        if (Build.VERSION.SDK_INT >= 14) {
                            v.setAllCaps(appearance.getBoolean(attr, false));
                        }
                    } else if (attr == Cc.TextAppearance_android_shadowColor) {
                        shadowColor = appearance.getInt(attr, 0);
                    } else if (attr == Cc.TextAppearance_android_shadowDx) {
                        dx = appearance.getFloat(attr, 0.0f);
                    } else if (attr == Cc.TextAppearance_android_shadowDy) {
                        dy = appearance.getFloat(attr, 0.0f);
                    } else if (attr == Cc.TextAppearance_android_shadowRadius) {
                        r = appearance.getFloat(attr, 0.0f);
                    } else if (attr == Cc.TextAppearance_android_elegantTextHeight) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            v.setElegantTextHeight(appearance.getBoolean(attr, false));
                        }
                    } else if (attr == Cc.TextAppearance_android_letterSpacing) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            v.setLetterSpacing(appearance.getFloat(attr, 0.0f));
                        }
                    } else if (attr == Cc.TextAppearance_android_fontFeatureSettings && Build.VERSION.SDK_INT >= 21) {
                        v.setFontFeatureSettings(appearance.getString(attr));
                    }
                }
                appearance.recycle();
            }
            if (shadowColor != 0) {
                v.setShadowLayer(r, dx, dy, shadowColor);
            }
            Typeface tf = null;
            if (!(fontFamily == null || (tf = Cc.m۱۶۵۰۶a(v.getContext(), fontFamily, styleIndex)) == null)) {
                v.setTypeface(tf);
            }
            if (tf != null) {
                if (typefaceIndex == 1) {
                    tf = Typeface.SANS_SERIF;
                } else if (typefaceIndex == 2) {
                    tf = Typeface.SERIF;
                } else if (typefaceIndex == 3) {
                    tf = Typeface.MONOSPACE;
                }
                v.setTypeface(tf, styleIndex);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private static void m۱۶۵۱۴b(TextView v, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        int shadowColor;
        int styleIndex;
        String fontFamily;
        float r;
        int typefaceIndex;
        char c;
        int typefaceIndex2;
        int shadowColor2;
        float dx = 0.0f;
        float dx2 = 0.0f;
        Drawable drawableStart = null;
        boolean drawableDefined = false;
        int typefaceIndex3 = -1;
        TypedArray a = v.getContext().obtainStyledAttributes(attrs, Cc.TextViewAppearance, defStyleAttr, defStyleRes);
        int ap = a.getResourceId(Cc.TextViewAppearance_android_textAppearance, 0);
        a.recycle();
        TypedArray appearance = ap != 0 ? v.getContext().obtainStyledAttributes(ap, Cc.TextAppearance) : null;
        if (appearance != null) {
            int shadowColor3 = 0;
            int i = 0;
            styleIndex = -1;
            fontFamily = null;
            r = 0.0f;
            float dy = 0.0f;
            float dx3 = 0.0f;
            for (int n = appearance.getIndexCount(); i < n; n = n) {
                int attr = appearance.getIndex(i);
                if (attr == Cc.TextAppearance_android_textColorHighlight) {
                    shadowColor2 = shadowColor3;
                    v.setHighlightColor(appearance.getColor(attr, 0));
                } else {
                    shadowColor2 = shadowColor3;
                    if (attr == Cc.TextAppearance_android_textColor) {
                        v.setTextColor(appearance.getColorStateList(attr));
                    } else if (attr == Cc.TextAppearance_android_textColorHint) {
                        v.setHintTextColor(appearance.getColorStateList(attr));
                    } else if (attr == Cc.TextAppearance_android_textColorLink) {
                        v.setLinkTextColor(appearance.getColorStateList(attr));
                    } else if (attr == Cc.TextAppearance_android_textSize) {
                        v.setTextSize(0, (float) appearance.getDimensionPixelSize(attr, 0));
                    } else {
                        if (attr == Cc.TextAppearance_android_typeface) {
                            typefaceIndex3 = appearance.getInt(attr, -1);
                            shadowColor3 = shadowColor2;
                        } else if (attr == Cc.TextAppearance_android_fontFamily) {
                            fontFamily = appearance.getString(attr);
                            shadowColor3 = shadowColor2;
                        } else if (attr == Cc.TextAppearance_tv_fontFamily) {
                            fontFamily = appearance.getString(attr);
                            shadowColor3 = shadowColor2;
                        } else if (attr == Cc.TextAppearance_android_textStyle) {
                            styleIndex = appearance.getInt(attr, -1);
                            shadowColor3 = shadowColor2;
                        } else if (attr == Cc.TextAppearance_android_textAllCaps) {
                            if (Build.VERSION.SDK_INT >= 14) {
                                v.setAllCaps(appearance.getBoolean(attr, false));
                            }
                        } else if (attr == Cc.TextAppearance_android_shadowColor) {
                            shadowColor3 = appearance.getInt(attr, 0);
                        } else if (attr == Cc.TextAppearance_android_shadowDx) {
                            dx3 = appearance.getFloat(attr, 0.0f);
                            shadowColor3 = shadowColor2;
                        } else if (attr == Cc.TextAppearance_android_shadowDy) {
                            dy = appearance.getFloat(attr, 0.0f);
                            shadowColor3 = shadowColor2;
                        } else if (attr == Cc.TextAppearance_android_shadowRadius) {
                            r = appearance.getFloat(attr, 0.0f);
                            shadowColor3 = shadowColor2;
                        } else if (attr == Cc.TextAppearance_android_elegantTextHeight) {
                            if (Build.VERSION.SDK_INT >= 21) {
                                v.setElegantTextHeight(appearance.getBoolean(attr, false));
                            }
                        } else if (attr == Cc.TextAppearance_android_letterSpacing) {
                            if (Build.VERSION.SDK_INT >= 21) {
                                v.setLetterSpacing(appearance.getFloat(attr, 0.0f));
                            }
                        } else if (attr == Cc.TextAppearance_android_fontFeatureSettings && Build.VERSION.SDK_INT >= 21) {
                            v.setFontFeatureSettings(appearance.getString(attr));
                        }
                        i++;
                        ap = ap;
                    }
                }
                shadowColor3 = shadowColor2;
                i++;
                ap = ap;
            }
            shadowColor = shadowColor3;
            appearance.recycle();
            dx = dx3;
            dx2 = dy;
        } else {
            shadowColor = 0;
            styleIndex = -1;
            fontFamily = null;
            r = 0.0f;
        }
        TypedArray a2 = v.getContext().obtainStyledAttributes(attrs, Cc.TextView, defStyleAttr, defStyleRes);
        int n2 = a2.getIndexCount();
        int i2 = 0;
        float dx4 = dx;
        int typefaceIndex4 = typefaceIndex3;
        int styleIndex2 = styleIndex;
        int shadowColor4 = shadowColor;
        String fontFamily2 = fontFamily;
        float dy2 = dx2;
        float r2 = r;
        boolean drawableRelativeDefined = false;
        Drawable drawableEnd = null;
        Drawable drawableBottom = null;
        Drawable drawableRight = null;
        Drawable drawableTop = null;
        Drawable drawableLeft = null;
        while (i2 < n2) {
            int attr2 = a2.getIndex(i2);
            if (attr2 == Cc.TextView_android_drawableLeft) {
                typefaceIndex2 = typefaceIndex4;
                drawableDefined = true;
                drawableLeft = a2.getDrawable(attr2);
            } else if (attr2 == Cc.TextView_android_drawableTop) {
                typefaceIndex2 = typefaceIndex4;
                drawableDefined = true;
                drawableTop = a2.getDrawable(attr2);
            } else if (attr2 == Cc.TextView_android_drawableRight) {
                typefaceIndex2 = typefaceIndex4;
                drawableDefined = true;
                drawableRight = a2.getDrawable(attr2);
            } else if (attr2 == Cc.TextView_android_drawableBottom) {
                typefaceIndex2 = typefaceIndex4;
                drawableDefined = true;
                drawableBottom = a2.getDrawable(attr2);
            } else if (attr2 == Cc.TextView_android_drawableStart) {
                typefaceIndex2 = typefaceIndex4;
                drawableRelativeDefined = true;
                drawableStart = a2.getDrawable(attr2);
            } else if (attr2 == Cc.TextView_android_drawableEnd) {
                typefaceIndex2 = typefaceIndex4;
                drawableRelativeDefined = true;
                drawableEnd = a2.getDrawable(attr2);
            } else if (attr2 == Cc.TextView_android_drawablePadding) {
                typefaceIndex2 = typefaceIndex4;
                v.setCompoundDrawablePadding(a2.getDimensionPixelSize(attr2, 0));
            } else {
                typefaceIndex2 = typefaceIndex4;
                if (attr2 == Cc.TextView_android_maxLines) {
                    v.setMaxLines(a2.getInt(attr2, -1));
                } else if (attr2 == Cc.TextView_android_maxHeight) {
                    v.setMaxHeight(a2.getDimensionPixelSize(attr2, -1));
                } else if (attr2 == Cc.TextView_android_lines) {
                    v.setLines(a2.getInt(attr2, -1));
                } else if (attr2 == Cc.TextView_android_height) {
                    v.setHeight(a2.getDimensionPixelSize(attr2, -1));
                } else if (attr2 == Cc.TextView_android_minLines) {
                    v.setMinLines(a2.getInt(attr2, -1));
                } else if (attr2 == Cc.TextView_android_minHeight) {
                    v.setMinHeight(a2.getDimensionPixelSize(attr2, -1));
                } else if (attr2 == Cc.TextView_android_maxEms) {
                    v.setMaxEms(a2.getInt(attr2, -1));
                } else if (attr2 == Cc.TextView_android_maxWidth) {
                    v.setMaxWidth(a2.getDimensionPixelSize(attr2, -1));
                } else if (attr2 == Cc.TextView_android_ems) {
                    v.setEms(a2.getInt(attr2, -1));
                } else if (attr2 == Cc.TextView_android_width) {
                    v.setWidth(a2.getDimensionPixelSize(attr2, -1));
                } else if (attr2 == Cc.TextView_android_minEms) {
                    v.setMinEms(a2.getInt(attr2, -1));
                } else if (attr2 == Cc.TextView_android_minWidth) {
                    v.setMinWidth(a2.getDimensionPixelSize(attr2, -1));
                } else if (attr2 == Cc.TextView_android_gravity) {
                    v.setGravity(a2.getInt(attr2, -1));
                } else if (attr2 == Cc.TextView_android_scrollHorizontally) {
                    v.setHorizontallyScrolling(a2.getBoolean(attr2, false));
                } else if (attr2 == Cc.TextView_android_includeFontPadding) {
                    v.setIncludeFontPadding(a2.getBoolean(attr2, true));
                } else if (attr2 == Cc.TextView_android_cursorVisible) {
                    v.setCursorVisible(a2.getBoolean(attr2, true));
                } else if (attr2 == Cc.TextView_android_textScaleX) {
                    v.setTextScaleX(a2.getFloat(attr2, 1.0f));
                } else if (attr2 == Cc.TextView_android_shadowColor) {
                    shadowColor4 = a2.getInt(attr2, 0);
                } else if (attr2 == Cc.TextView_android_shadowDx) {
                    dx4 = a2.getFloat(attr2, 0.0f);
                } else if (attr2 == Cc.TextView_android_shadowDy) {
                    dy2 = a2.getFloat(attr2, 0.0f);
                } else if (attr2 == Cc.TextView_android_shadowRadius) {
                    r2 = a2.getFloat(attr2, 0.0f);
                } else if (attr2 == Cc.TextView_android_textColorHighlight) {
                    v.setHighlightColor(a2.getColor(attr2, 0));
                } else if (attr2 == Cc.TextView_android_textColor) {
                    v.setTextColor(a2.getColorStateList(attr2));
                } else if (attr2 == Cc.TextView_android_textColorHint) {
                    v.setHintTextColor(a2.getColorStateList(attr2));
                } else if (attr2 == Cc.TextView_android_textColorLink) {
                    v.setLinkTextColor(a2.getColorStateList(attr2));
                } else if (attr2 == Cc.TextView_android_textSize) {
                    v.setTextSize(0, (float) a2.getDimensionPixelSize(attr2, 0));
                } else if (attr2 == Cc.TextView_android_typeface) {
                    typefaceIndex2 = a2.getInt(attr2, -1);
                } else if (attr2 == Cc.TextView_android_textStyle) {
                    styleIndex2 = a2.getInt(attr2, -1);
                } else if (attr2 == Cc.TextView_android_fontFamily) {
                    fontFamily2 = a2.getString(attr2);
                } else if (attr2 == Cc.TextView_tv_fontFamily) {
                    fontFamily2 = a2.getString(attr2);
                } else if (attr2 == Cc.TextView_android_textAllCaps) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        v.setAllCaps(a2.getBoolean(attr2, false));
                    }
                } else if (attr2 == Cc.TextView_android_elegantTextHeight) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        v.setElegantTextHeight(a2.getBoolean(attr2, false));
                    }
                } else if (attr2 == Cc.TextView_android_letterSpacing) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        v.setLetterSpacing(a2.getFloat(attr2, 0.0f));
                    }
                } else if (attr2 == Cc.TextView_android_fontFeatureSettings) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        v.setFontFeatureSettings(a2.getString(attr2));
                    }
                }
            }
            i2++;
            n2 = n2;
            typefaceIndex4 = typefaceIndex2;
        }
        a2.recycle();
        if (shadowColor4 != 0) {
            v.setShadowLayer(r2, dx4, dy2, shadowColor4);
        }
        if (drawableDefined) {
            Drawable[] drawables = v.getCompoundDrawables();
            if (drawableStart != null) {
                drawables[0] = drawableStart;
            } else if (drawableLeft != null) {
                drawables[0] = drawableLeft;
            }
            if (drawableTop != null) {
                drawables[1] = drawableTop;
            }
            if (drawableEnd != null) {
                drawables[2] = drawableEnd;
            } else if (drawableRight != null) {
                drawables[2] = drawableRight;
            }
            if (drawableBottom != null) {
                drawables[3] = drawableBottom;
            }
            v.setCompoundDrawablesWithIntrinsicBounds(drawables[0], drawables[1], drawables[2], drawables[3]);
        }
        if (drawableRelativeDefined && Build.VERSION.SDK_INT >= 17) {
            Drawable[] drawables2 = v.getCompoundDrawablesRelative();
            if (drawableStart != null) {
                drawables2[0] = drawableStart;
            }
            if (drawableEnd != null) {
                c = 2;
                drawables2[2] = drawableEnd;
            } else {
                c = 2;
            }
            v.setCompoundDrawablesRelativeWithIntrinsicBounds(drawables2[0], drawables2[1], drawables2[c], drawables2[3]);
        }
        Typeface tf = null;
        if (!(fontFamily2 == null || (tf = Cc.m۱۶۵۰۶a(v.getContext(), fontFamily2, styleIndex2)) == null)) {
            v.setTypeface(tf);
        }
        if (tf != null) {
            typefaceIndex = typefaceIndex4;
            if (typefaceIndex == 1) {
                tf = Typeface.SANS_SERIF;
            } else if (typefaceIndex == 2) {
                tf = Typeface.SERIF;
            } else if (typefaceIndex == 3) {
                tf = Typeface.MONOSPACE;
            }
            v.setTypeface(tf, styleIndex2);
        } else {
            typefaceIndex = typefaceIndex4;
        }
        if (v instanceof AutoCompleteTextView) {
            m۱۶۵۱۰a((AutoCompleteTextView) v, attrs, defStyleAttr, defStyleRes);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۶۵۱۰a(AutoCompleteTextView v, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a = v.getContext().obtainStyledAttributes(attrs, Cc.AutoCompleteTextView, defStyleAttr, defStyleRes);
        int n = a.getIndexCount();
        for (int i = 0; i < n; i++) {
            int attr = a.getIndex(i);
            if (attr == Cc.AutoCompleteTextView_android_completionHint) {
                v.setCompletionHint(a.getString(attr));
            } else if (attr == Cc.AutoCompleteTextView_android_completionThreshold) {
                v.setThreshold(a.getInteger(attr, 0));
            } else if (attr == Cc.AutoCompleteTextView_android_dropDownAnchor) {
                v.setDropDownAnchor(a.getResourceId(attr, 0));
            } else if (attr == Cc.AutoCompleteTextView_android_dropDownHeight) {
                v.setDropDownHeight(a.getLayoutDimension(attr, -2));
            } else if (attr == Cc.AutoCompleteTextView_android_dropDownWidth) {
                v.setDropDownWidth(a.getLayoutDimension(attr, -2));
            } else if (attr == Cc.AutoCompleteTextView_android_dropDownHorizontalOffset) {
                v.setDropDownHorizontalOffset(a.getDimensionPixelSize(attr, 0));
            } else if (attr == Cc.AutoCompleteTextView_android_dropDownVerticalOffset) {
                v.setDropDownVerticalOffset(a.getDimensionPixelSize(attr, 0));
            } else if (attr == Cc.AutoCompleteTextView_android_popupBackground) {
                v.setDropDownBackgroundDrawable(a.getDrawable(attr));
            }
        }
        a.recycle();
    }
}
