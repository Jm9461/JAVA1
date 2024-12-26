package com.mikhaellopez.circularimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class CircularImageView extends ImageView {

    /* renamed from: k  reason: contains not printable characters */
    private static final ImageView.ScaleType f۱۴۸۴۷k = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: c  reason: contains not printable characters */
    private float f۱۴۸۴۸c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۴۸۴۹d;

    /* renamed from: e  reason: contains not printable characters */
    private float f۱۴۸۵۰e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۴۸۵۱f;

    /* renamed from: g  reason: contains not printable characters */
    private Bitmap f۱۴۸۵۲g;

    /* renamed from: h  reason: contains not printable characters */
    private Drawable f۱۴۸۵۳h;

    /* renamed from: i  reason: contains not printable characters */
    private Paint f۱۴۸۵۴i;

    /* renamed from: j  reason: contains not printable characters */
    private Paint f۱۴۸۵۵j;

    public CircularImageView(Context context) {
        this(context, null);
    }

    public CircularImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircularImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۴۸۵۱f = -16777216;
        m۱۷۸۸۴a(context, attrs, defStyleAttr);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۷۸۸۴a(Context context, AttributeSet attrs, int defStyleAttr) {
        this.f۱۴۸۵۴i = new Paint();
        this.f۱۴۸۵۴i.setAntiAlias(true);
        this.f۱۴۸۵۵j = new Paint();
        this.f۱۴۸۵۵j.setAntiAlias(true);
        TypedArray attributes = context.obtainStyledAttributes(attrs, Ca.CircularImageView, defStyleAttr, 0);
        if (attributes.getBoolean(Ca.CircularImageView_civ_border, true)) {
            setBorderWidth(attributes.getDimension(Ca.CircularImageView_civ_border_width, getContext().getResources().getDisplayMetrics().density * 4.0f));
            setBorderColor(attributes.getColor(Ca.CircularImageView_civ_border_color, -1));
        }
        if (attributes.getBoolean(Ca.CircularImageView_civ_shadow, false)) {
            this.f۱۴۸۵۰e = 8.0f;
            m۱۷۸۸۳a(attributes.getFloat(Ca.CircularImageView_civ_shadow_radius, this.f۱۴۸۵۰e), attributes.getColor(Ca.CircularImageView_civ_shadow_color, this.f۱۴۸۵۱f));
        }
    }

    public void setBorderWidth(float borderWidth) {
        this.f۱۴۸۴۸c = borderWidth;
        requestLayout();
        invalidate();
    }

    public void setBorderColor(int borderColor) {
        Paint paint = this.f۱۴۸۵۵j;
        if (paint != null) {
            paint.setColor(borderColor);
        }
        invalidate();
    }

    public void setShadowRadius(float shadowRadius) {
        m۱۷۸۸۳a(shadowRadius, this.f۱۴۸۵۱f);
        invalidate();
    }

    public void setShadowColor(int shadowColor) {
        m۱۷۸۸۳a(this.f۱۴۸۵۰e, shadowColor);
        invalidate();
    }

    public ImageView.ScaleType getScaleType() {
        return f۱۴۸۴۷k;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f۱۴۸۴۷k) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported. ScaleType.CENTER_CROP is used by default. So you don't need to use ScaleType.", scaleType));
        }
    }

    public void onDraw(Canvas canvas) {
        m۱۷۸۸۲a();
        if (this.f۱۴۸۵۲g != null) {
            if (!isInEditMode()) {
                this.f۱۴۸۴۹d = canvas.getWidth();
                if (canvas.getHeight() < this.f۱۴۸۴۹d) {
                    this.f۱۴۸۴۹d = canvas.getHeight();
                }
            }
            float f = this.f۱۴۸۴۸c;
            int circleCenter = ((int) (((float) this.f۱۴۸۴۹d) - (f * 2.0f))) / 2;
            float f2 = ((float) circleCenter) + f;
            float f3 = ((float) circleCenter) + f;
            float f4 = ((float) circleCenter) + f;
            float f5 = this.f۱۴۸۵۰e;
            canvas.drawCircle(f2, f3, f4 - (f5 + (f5 / 2.0f)), this.f۱۴۸۵۵j);
            float f6 = this.f۱۴۸۴۸c;
            float f7 = this.f۱۴۸۵۰e;
            canvas.drawCircle(((float) circleCenter) + f6, ((float) circleCenter) + f6, ((float) circleCenter) - (f7 + (f7 / 2.0f)), this.f۱۴۸۵۴i);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۷۸۸۲a() {
        if (this.f۱۴۸۵۳h != getDrawable()) {
            this.f۱۴۸۵۳h = getDrawable();
            this.f۱۴۸۵۲g = m۱۷۸۸۱a(this.f۱۴۸۵۳h);
            m۱۷۸۸۶b();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.f۱۴۸۴۹d = w;
        if (h < this.f۱۴۸۴۹d) {
            this.f۱۴۸۴۹d = h;
        }
        if (this.f۱۴۸۵۲g != null) {
            m۱۷۸۸۶b();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۷۸۸۳a(float shadowRadius, int shadowColor) {
        this.f۱۴۸۵۰e = shadowRadius;
        this.f۱۴۸۵۱f = shadowColor;
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, this.f۱۴۸۵۵j);
        }
        this.f۱۴۸۵۵j.setShadowLayer(shadowRadius, 0.0f, shadowRadius / 2.0f, shadowColor);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۷۸۸۶b() {
        Bitmap bitmap = this.f۱۴۸۵۲g;
        if (bitmap != null) {
            this.f۱۴۸۵۲g = m۱۷۸۸۰a(bitmap);
            Bitmap bitmap2 = this.f۱۴۸۵۲g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader shader = new BitmapShader(bitmap2, tileMode, tileMode);
            Matrix matrix = new Matrix();
            matrix.setScale(((float) this.f۱۴۸۴۹d) / ((float) this.f۱۴۸۵۲g.getWidth()), ((float) this.f۱۴۸۴۹d) / ((float) this.f۱۴۸۵۲g.getHeight()));
            shader.setLocalMatrix(matrix);
            this.f۱۴۸۵۴i.setShader(shader);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private Bitmap m۱۷۸۸۰a(Bitmap bitmap) {
        if (bitmap.getWidth() >= bitmap.getHeight()) {
            return Bitmap.createBitmap(bitmap, (bitmap.getWidth() / 2) - (bitmap.getHeight() / 2), 0, bitmap.getHeight(), bitmap.getHeight());
        }
        return Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() / 2) - (bitmap.getWidth() / 2), bitmap.getWidth(), bitmap.getWidth());
    }

    /* renamed from: a  reason: contains not printable characters */
    private Bitmap m۱۷۸۸۱a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        try {
            Bitmap bitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        } catch (OutOfMemoryError e) {
            Log.e(getClass().toString(), "Encountered OutOfMemoryError while generating bitmap!");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(m۱۷۸۸۵b(widthMeasureSpec), m۱۷۸۷۹a(heightMeasureSpec));
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۷۸۸۵b(int measureSpec) {
        int specMode = View.MeasureSpec.getMode(measureSpec);
        int specSize = View.MeasureSpec.getSize(measureSpec);
        if (specMode == 1073741824) {
            return specSize;
        }
        if (specMode == Integer.MIN_VALUE) {
            return specSize;
        }
        return this.f۱۴۸۴۹d;
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۷۸۷۹a(int measureSpecHeight) {
        int result;
        int specMode = View.MeasureSpec.getMode(measureSpecHeight);
        int specSize = View.MeasureSpec.getSize(measureSpecHeight);
        if (specMode == 1073741824) {
            result = specSize;
        } else if (specMode == Integer.MIN_VALUE) {
            result = specSize;
        } else {
            result = this.f۱۴۸۴۹d;
        }
        return result + 2;
    }
}
