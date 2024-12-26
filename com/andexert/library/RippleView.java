package com.andexert.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView;
import android.widget.RelativeLayout;

public class RippleView extends RelativeLayout {

    /* renamed from: A  reason: contains not printable characters */
    private final Runnable f۱۳۳۴۷A = new RunnableCa();

    /* renamed from: B  reason: contains not printable characters */
    private AbstractCc f۱۳۳۴۸B;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۳۳۴۹c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۳۳۵۰d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۳۳۵۱e = 10;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۳۳۵۲f = 400;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۳۳۵۳g = 90;

    /* renamed from: h  reason: contains not printable characters */
    private Handler f۱۳۳۵۴h;

    /* renamed from: i  reason: contains not printable characters */
    private float f۱۳۳۵۵i = 0.0f;

    /* renamed from: j  reason: contains not printable characters */
    private boolean f۱۳۳۵۶j = false;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۳۳۵۷k = 0;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۳۳۵۸l = 0;

    /* renamed from: m  reason: contains not printable characters */
    private int f۱۳۳۵۹m = -1;

    /* renamed from: n  reason: contains not printable characters */
    private float f۱۳۳۶۰n = -1.0f;

    /* renamed from: o  reason: contains not printable characters */
    private float f۱۳۳۶۱o = -1.0f;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۳۳۶۲p;

    /* renamed from: q  reason: contains not printable characters */
    private float f۱۳۳۶۳q;

    /* renamed from: r  reason: contains not printable characters */
    private ScaleAnimation f۱۳۳۶۴r;

    /* renamed from: s  reason: contains not printable characters */
    private Boolean f۱۳۳۶۵s;

    /* renamed from: t  reason: contains not printable characters */
    private Boolean f۱۳۳۶۶t;

    /* renamed from: u  reason: contains not printable characters */
    private Integer f۱۳۳۶۷u;

    /* renamed from: v  reason: contains not printable characters */
    private Paint f۱۳۳۶۸v;

    /* renamed from: w  reason: contains not printable characters */
    private Bitmap f۱۳۳۶۹w;

    /* renamed from: x  reason: contains not printable characters */
    private int f۱۳۳۷۰x;

    /* renamed from: y  reason: contains not printable characters */
    private int f۱۳۳۷۱y;

    /* renamed from: z  reason: contains not printable characters */
    private GestureDetector f۱۳۳۷۲z;

    /* renamed from: com.andexert.library.RippleView$c  reason: invalid class name */
    public interface AbstractCc {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۶۷۸۱a(RippleView rippleView);
    }

    /* renamed from: com.andexert.library.RippleView$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            RippleView.this.invalidate();
        }
    }

    public RippleView(Context context) {
        super(context);
    }

    public RippleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        m۱۶۷۷۷a(context, attrs);
    }

    public RippleView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        m۱۶۷۷۷a(context, attrs);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۷۷۷a(Context context, AttributeSet attrs) {
        if (!isInEditMode()) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, Cb.RippleView);
            this.f۱۳۳۷۰x = typedArray.getColor(Cb.RippleView_rv_color, getResources().getColor(Ca.rippelColor));
            this.f۱۳۳۶۷u = Integer.valueOf(typedArray.getInt(Cb.RippleView_rv_type, 0));
            this.f۱۳۳۶۵s = Boolean.valueOf(typedArray.getBoolean(Cb.RippleView_rv_zoom, false));
            this.f۱۳۳۶۶t = Boolean.valueOf(typedArray.getBoolean(Cb.RippleView_rv_centered, false));
            this.f۱۳۳۵۲f = typedArray.getInteger(Cb.RippleView_rv_rippleDuration, this.f۱۳۳۵۲f);
            this.f۱۳۳۵۱e = typedArray.getInteger(Cb.RippleView_rv_framerate, this.f۱۳۳۵۱e);
            this.f۱۳۳۵۳g = typedArray.getInteger(Cb.RippleView_rv_alpha, this.f۱۳۳۵۳g);
            this.f۱۳۳۷۱y = typedArray.getDimensionPixelSize(Cb.RippleView_rv_ripplePadding, 0);
            this.f۱۳۳۵۴h = new Handler();
            this.f۱۳۳۶۳q = typedArray.getFloat(Cb.RippleView_rv_zoomScale, 1.03f);
            this.f۱۳۳۶۲p = typedArray.getInt(Cb.RippleView_rv_zoomDuration, 200);
            typedArray.recycle();
            this.f۱۳۳۶۸v = new Paint();
            this.f۱۳۳۶۸v.setAntiAlias(true);
            this.f۱۳۳۶۸v.setStyle(Paint.Style.FILL);
            this.f۱۳۳۶۸v.setColor(this.f۱۳۳۷۰x);
            this.f۱۳۳۶۸v.setAlpha(this.f۱۳۳۵۳g);
            setWillNotDraw(false);
            this.f۱۳۳۷۲z = new GestureDetector(context, new Cb());
            setDrawingCacheEnabled(true);
            setClickable(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.andexert.library.RippleView$b  reason: invalid class name */
    public class Cb extends GestureDetector.SimpleOnGestureListener {
        Cb() {
        }

        public void onLongPress(MotionEvent event) {
            super.onLongPress(event);
            RippleView.this.m۱۶۷۸۰a(event);
            RippleView.this.m۱۶۷۷۹a((RippleView) true);
        }

        public boolean onSingleTapConfirmed(MotionEvent e) {
            return true;
        }

        public boolean onSingleTapUp(MotionEvent e) {
            return true;
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f۱۳۳۵۶j) {
            canvas.save();
            int i = this.f۱۳۳۵۲f;
            int i2 = this.f۱۳۳۵۷k;
            int i3 = this.f۱۳۳۵۱e;
            if (i <= i2 * i3) {
                this.f۱۳۳۵۶j = false;
                this.f۱۳۳۵۷k = 0;
                this.f۱۳۳۵۹m = -1;
                this.f۱۳۳۵۸l = 0;
                if (Build.VERSION.SDK_INT < 23) {
                    canvas.restore();
                }
                invalidate();
                AbstractCc cVar = this.f۱۳۳۴۸B;
                if (cVar != null) {
                    cVar.m۱۶۷۸۱a(this);
                    return;
                }
                return;
            }
            this.f۱۳۳۵۴h.postDelayed(this.f۱۳۳۴۷A, (long) i3);
            if (this.f۱۳۳۵۷k == 0) {
                canvas.save();
            }
            canvas.drawCircle(this.f۱۳۳۶۰n, this.f۱۳۳۶۱o, this.f۱۳۳۵۵i * ((((float) this.f۱۳۳۵۷k) * ((float) this.f۱۳۳۵۱e)) / ((float) this.f۱۳۳۵۲f)), this.f۱۳۳۶۸v);
            this.f۱۳۳۶۸v.setColor(Color.parseColor("#ffff4444"));
            if (this.f۱۳۳۶۷u.intValue() == 1 && this.f۱۳۳۶۹w != null) {
                int i4 = this.f۱۳۳۵۷k;
                int i5 = this.f۱۳۳۵۱e;
                float f = ((float) i4) * ((float) i5);
                int i6 = this.f۱۳۳۵۲f;
                if (f / ((float) i6) > 0.4f) {
                    if (this.f۱۳۳۵۹m == -1) {
                        this.f۱۳۳۵۹m = i6 - (i4 * i5);
                    }
                    this.f۱۳۳۵۸l++;
                    Bitmap tmpBitmap = m۱۶۷۷۵a((int) (this.f۱۳۳۵۵i * ((((float) this.f۱۳۳۵۸l) * ((float) this.f۱۳۳۵۱e)) / ((float) this.f۱۳۳۵۹m))));
                    canvas.drawBitmap(tmpBitmap, 0.0f, 0.0f, this.f۱۳۳۶۸v);
                    tmpBitmap.recycle();
                }
            }
            this.f۱۳۳۶۸v.setColor(this.f۱۳۳۷۰x);
            if (this.f۱۳۳۶۷u.intValue() == 1) {
                int i7 = this.f۱۳۳۵۱e;
                if ((((float) this.f۱۳۳۵۷k) * ((float) i7)) / ((float) this.f۱۳۳۵۲f) > 0.6f) {
                    Paint paint = this.f۱۳۳۶۸v;
                    int i8 = this.f۱۳۳۵۳g;
                    paint.setAlpha((int) (((float) i8) - (((float) i8) * ((((float) this.f۱۳۳۵۸l) * ((float) i7)) / ((float) this.f۱۳۳۵۹m)))));
                } else {
                    this.f۱۳۳۶۸v.setAlpha(this.f۱۳۳۵۳g);
                }
            } else {
                Paint paint2 = this.f۱۳۳۶۸v;
                int i9 = this.f۱۳۳۵۳g;
                paint2.setAlpha((int) (((float) i9) - (((float) i9) * ((((float) this.f۱۳۳۵۷k) * ((float) this.f۱۳۳۵۱e)) / ((float) this.f۱۳۳۵۲f)))));
            }
            this.f۱۳۳۵۷k++;
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.f۱۳۳۴۹c = w;
        this.f۱۳۳۵۰d = h;
        float f = this.f۱۳۳۶۳q;
        this.f۱۳۳۶۴r = new ScaleAnimation(1.0f, f, 1.0f, f, (float) (w / 2), (float) (h / 2));
        this.f۱۳۳۶۴r.setDuration((long) this.f۱۳۳۶۲p);
        this.f۱۳۳۶۴r.setRepeatMode(2);
        this.f۱۳۳۶۴r.setRepeatCount(1);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۷۸۰a(MotionEvent event) {
        m۱۶۷۷۶a(event.getX(), event.getY());
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۷۷۶a(float x, float y) {
        if (isEnabled() && !this.f۱۳۳۵۶j) {
            if (this.f۱۳۳۶۵s.booleanValue()) {
                startAnimation(this.f۱۳۳۶۴r);
            }
            this.f۱۳۳۵۵i = (float) Math.max(this.f۱۳۳۴۹c, this.f۱۳۳۵۰d);
            if (this.f۱۳۳۶۷u.intValue() != 2) {
                this.f۱۳۳۵۵i /= 2.0f;
            }
            this.f۱۳۳۵۵i -= (float) this.f۱۳۳۷۱y;
            if (this.f۱۳۳۶۶t.booleanValue() || this.f۱۳۳۶۷u.intValue() == 1) {
                this.f۱۳۳۶۰n = (float) (getMeasuredWidth() / 2);
                this.f۱۳۳۶۱o = (float) (getMeasuredHeight() / 2);
            } else {
                this.f۱۳۳۶۰n = x;
                this.f۱۳۳۶۱o = y;
            }
            this.f۱۳۳۵۶j = true;
            if (this.f۱۳۳۶۷u.intValue() == 1 && this.f۱۳۳۶۹w == null) {
                this.f۱۳۳۶۹w = getDrawingCache(true);
            }
            invalidate();
        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (this.f۱۳۳۷۲z.onTouchEvent(event)) {
            m۱۶۷۸۰a(event);
            m۱۶۷۷۹a((Boolean) false);
        }
        return super.onTouchEvent(event);
    }

    public boolean onInterceptTouchEvent(MotionEvent event) {
        onTouchEvent(event);
        return super.onInterceptTouchEvent(event);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۷۷۹a(Boolean isLongClick) {
        if (getParent() instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) getParent();
            int position = adapterView.getPositionForView(this);
            long id = adapterView.getItemIdAtPosition(position);
            if (isLongClick.booleanValue()) {
                if (adapterView.getOnItemLongClickListener() != null) {
                    adapterView.getOnItemLongClickListener().onItemLongClick(adapterView, this, position, id);
                }
            } else if (adapterView.getOnItemClickListener() != null) {
                adapterView.getOnItemClickListener().onItemClick(adapterView, this, position, id);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private Bitmap m۱۶۷۷۵a(int radius) {
        Bitmap output = Bitmap.createBitmap(this.f۱۳۳۶۹w.getWidth(), this.f۱۳۳۶۹w.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(output);
        Paint paint = new Paint();
        float f = this.f۱۳۳۶۰n;
        float f2 = this.f۱۳۳۶۱o;
        Rect rect = new Rect((int) (f - ((float) radius)), (int) (f2 - ((float) radius)), (int) (f + ((float) radius)), (int) (f2 + ((float) radius)));
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(this.f۱۳۳۶۰n, this.f۱۳۳۶۱o, (float) radius, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.f۱۳۳۶۹w, rect, rect, paint);
        return output;
    }

    public void setRippleColor(int rippleColor) {
        this.f۱۳۳۷۰x = getResources().getColor(rippleColor);
    }

    public int getRippleColor() {
        return this.f۱۳۳۷۰x;
    }

    public EnumCd getRippleType() {
        return EnumCd.values()[this.f۱۳۳۶۷u.intValue()];
    }

    public void setRippleType(EnumCd rippleType) {
        this.f۱۳۳۶۷u = Integer.valueOf(rippleType.ordinal());
    }

    public void setCentered(Boolean isCentered) {
        this.f۱۳۳۶۶t = isCentered;
    }

    public int getRipplePadding() {
        return this.f۱۳۳۷۱y;
    }

    public void setRipplePadding(int ripplePadding) {
        this.f۱۳۳۷۱y = ripplePadding;
    }

    public void setZooming(Boolean hasToZoom) {
        this.f۱۳۳۶۵s = hasToZoom;
    }

    public float getZoomScale() {
        return this.f۱۳۳۶۳q;
    }

    public void setZoomScale(float zoomScale) {
        this.f۱۳۳۶۳q = zoomScale;
    }

    public int getZoomDuration() {
        return this.f۱۳۳۶۲p;
    }

    public void setZoomDuration(int zoomDuration) {
        this.f۱۳۳۶۲p = zoomDuration;
    }

    public int getRippleDuration() {
        return this.f۱۳۳۵۲f;
    }

    public void setRippleDuration(int rippleDuration) {
        this.f۱۳۳۵۲f = rippleDuration;
    }

    public int getFrameRate() {
        return this.f۱۳۳۵۱e;
    }

    public void setFrameRate(int frameRate) {
        this.f۱۳۳۵۱e = frameRate;
    }

    public int getRippleAlpha() {
        return this.f۱۳۳۵۳g;
    }

    public void setRippleAlpha(int rippleAlpha) {
        this.f۱۳۳۵۳g = rippleAlpha;
    }

    public void setOnRippleCompleteListener(AbstractCc listener) {
        this.f۱۳۳۴۸B = listener;
    }

    /* renamed from: com.andexert.library.RippleView$d  reason: invalid class name */
    public enum EnumCd {
        SIMPLE(0),
        DOUBLE(1),
        RECTANGLE(2);

        private EnumCd(int type) {
        }
    }
}
