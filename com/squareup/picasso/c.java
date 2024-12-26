package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import android.os.Build;
import com.squareup.picasso.r;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import f.l;
import f.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public class c implements Runnable {
    private static final Object v = new Object();
    private static final ThreadLocal<StringBuilder> w = new a();
    private static final AtomicInteger x = new AtomicInteger();
    private static final y y = new b();

    /* renamed from: c  reason: collision with root package name */
    final int f۳۵۲۴c = x.incrementAndGet();

    /* renamed from: d  reason: collision with root package name */
    final t f۳۵۲۵d;

    /* renamed from: e  reason: collision with root package name */
    final i f۳۵۲۶e;

    /* renamed from: f  reason: collision with root package name */
    final d f۳۵۲۷f;

    /* renamed from: g  reason: collision with root package name */
    final a0 f۳۵۲۸g;

    /* renamed from: h  reason: collision with root package name */
    final String f۳۵۲۹h;
    final w i;
    final int j;
    int k;
    final y l;
    a m;
    List<a> n;
    Bitmap o;
    Future<?> p;
    t.e q;
    Exception r;
    int s;
    int t;
    t.f u;

    static class a extends ThreadLocal<StringBuilder> {
        a() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    static class b extends y {
        b() {
        }

        @Override // com.squareup.picasso.y
        public boolean a(w data) {
            return true;
        }

        @Override // com.squareup.picasso.y
        public y.a a(w request, int networkPolicy) {
            throw new IllegalStateException("Unrecognized type of request: " + request);
        }
    }

    c(t picasso, i dispatcher, d cache, a0 stats, a action, y requestHandler) {
        this.f۳۵۲۵d = picasso;
        this.f۳۵۲۶e = dispatcher;
        this.f۳۵۲۷f = cache;
        this.f۳۵۲۸g = stats;
        this.m = action;
        this.f۳۵۲۹h = action.b();
        this.i = action.g();
        this.u = action.f();
        this.j = action.c();
        this.k = action.d();
        this.l = requestHandler;
        this.t = requestHandler.a();
    }

    static Bitmap a(s source, w request) {
        f.e bufferedSource = l.a(source);
        boolean isWebPFile = d0.a(bufferedSource);
        boolean isPurgeable = request.r && Build.VERSION.SDK_INT < 21;
        BitmapFactory.Options options = y.b(request);
        boolean calculateSize = y.a(options);
        if (isWebPFile || isPurgeable) {
            byte[] bytes = bufferedSource.g();
            if (calculateSize) {
                BitmapFactory.decodeByteArray(bytes, 0, bytes.length, options);
                y.a(request.f۳۶۳۰h, request.i, options, request);
            }
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length, options);
        }
        InputStream stream = bufferedSource.k();
        if (calculateSize) {
            n markStream = new n(stream);
            stream = markStream;
            markStream.a(false);
            long mark = markStream.a(1024);
            BitmapFactory.decodeStream(stream, null, options);
            y.a(request.f۳۶۳۰h, request.i, options, request);
            markStream.g(mark);
            markStream.a(true);
        }
        Bitmap bitmap = BitmapFactory.decodeStream(stream, null, options);
        if (bitmap != null) {
            return bitmap;
        }
        throw new IOException("Failed to decode stream.");
    }

    public void run() {
        try {
            a(this.i);
            if (this.f۳۵۲۵d.n) {
                d0.a("Hunter", "executing", d0.a(this));
            }
            this.o = l();
            if (this.o == null) {
                this.f۳۵۲۶e.b(this);
            } else {
                this.f۳۵۲۶e.a(this);
            }
        } catch (r.b e2) {
            if (!q.a(e2.f۳۵۸۳d) || e2.f۳۵۸۲c != 504) {
                this.r = e2;
            }
            this.f۳۵۲۶e.b(this);
        } catch (IOException e3) {
            this.r = e3;
            this.f۳۵۲۶e.c(this);
        } catch (OutOfMemoryError e4) {
            StringWriter writer = new StringWriter();
            this.f۳۵۲۸g.a().a(new PrintWriter(writer));
            this.r = new RuntimeException(writer.toString(), e4);
            this.f۳۵۲۶e.b(this);
        } catch (Exception e5) {
            this.r = e5;
            this.f۳۵۲۶e.b(this);
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* access modifiers changed from: package-private */
    public Bitmap l() {
        Bitmap bitmap = null;
        if (!p.a(this.j) || (bitmap = this.f۳۵۲۷f.a(this.f۳۵۲۹h)) == null) {
            this.k = this.t == 0 ? q.OFFLINE.f۳۵۷۹c : this.k;
            y.a result = this.l.a(this.i, this.k);
            if (result != null) {
                this.q = result.c();
                this.s = result.b();
                bitmap = result.a();
                if (bitmap == null) {
                    s source = result.d();
                    try {
                        bitmap = a(source, this.i);
                    } finally {
                        try {
                            source.close();
                        } catch (IOException e2) {
                        }
                    }
                }
            }
            if (bitmap != null) {
                if (this.f۳۵۲۵d.n) {
                    d0.a("Hunter", "decoded", this.i.d());
                }
                this.f۳۵۲۸g.a(bitmap);
                if (this.i.f() || this.s != 0) {
                    synchronized (v) {
                        if (this.i.e() || this.s != 0) {
                            bitmap = a(this.i, bitmap, this.s);
                            if (this.f۳۵۲۵d.n) {
                                d0.a("Hunter", "transformed", this.i.d());
                            }
                        }
                        if (this.i.b()) {
                            bitmap = a(this.i.f۳۶۲۹g, bitmap);
                            if (this.f۳۵۲۵d.n) {
                                d0.a("Hunter", "transformed", this.i.d(), "from custom transformations");
                            }
                        }
                    }
                    if (bitmap != null) {
                        this.f۳۵۲۸g.b(bitmap);
                    }
                }
            }
            return bitmap;
        }
        this.f۳۵۲۸g.b();
        this.q = t.e.MEMORY;
        if (this.f۳۵۲۵d.n) {
            d0.a("Hunter", "decoded", this.i.d(), "from cache");
        }
        return bitmap;
    }

    /* access modifiers changed from: package-private */
    public void a(a action) {
        boolean loggingEnabled = this.f۳۵۲۵d.n;
        w request = action.f۳۴۹۴b;
        if (this.m == null) {
            this.m = action;
            if (loggingEnabled) {
                List<a> list = this.n;
                if (list == null || list.isEmpty()) {
                    d0.a("Hunter", "joined", request.d(), "to empty hunter");
                } else {
                    d0.a("Hunter", "joined", request.d(), d0.a(this, "to "));
                }
            }
        } else {
            if (this.n == null) {
                this.n = new ArrayList(3);
            }
            this.n.add(action);
            if (loggingEnabled) {
                d0.a("Hunter", "joined", request.d(), d0.a(this, "to "));
            }
            t.f actionPriority = action.f();
            if (actionPriority.ordinal() > this.u.ordinal()) {
                this.u = actionPriority;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(a action) {
        boolean detached = false;
        if (this.m == action) {
            this.m = null;
            detached = true;
        } else {
            List<a> list = this.n;
            if (list != null) {
                detached = list.remove(action);
            }
        }
        if (detached && action.f() == this.u) {
            this.u = o();
        }
        if (this.f۳۵۲۵d.n) {
            d0.a("Hunter", "removed", action.f۳۴۹۴b.d(), d0.a(this, "from "));
        }
    }

    private t.f o() {
        t.f newPriority = t.f.LOW;
        List<a> list = this.n;
        boolean hasAny = false;
        boolean hasMultiple = list != null && !list.isEmpty();
        if (this.m != null || hasMultiple) {
            hasAny = true;
        }
        if (!hasAny) {
            return newPriority;
        }
        a aVar = this.m;
        if (aVar != null) {
            newPriority = aVar.f();
        }
        if (hasMultiple) {
            int n2 = this.n.size();
            for (int i2 = 0; i2 < n2; i2++) {
                t.f actionPriority = this.n.get(i2).f();
                if (actionPriority.ordinal() > newPriority.ordinal()) {
                    newPriority = actionPriority;
                }
            }
        }
        return newPriority;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        Future<?> future;
        if (this.m != null) {
            return false;
        }
        List<a> list = this.n;
        if ((list == null || list.isEmpty()) && (future = this.p) != null && future.cancel(false)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        Future<?> future = this.p;
        return future != null && future.isCancelled();
    }

    /* access modifiers changed from: package-private */
    public boolean a(boolean airplaneMode, NetworkInfo info2) {
        if (!(this.t > 0)) {
            return false;
        }
        this.t--;
        return this.l.a(airplaneMode, info2);
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.l.b();
    }

    /* access modifiers changed from: package-private */
    public Bitmap k() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public String f() {
        return this.f۳۵۲۹h;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public w d() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public a b() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public t i() {
        return this.f۳۵۲۵d;
    }

    /* access modifiers changed from: package-private */
    public List<a> c() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public Exception e() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public t.e g() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public t.f j() {
        return this.u;
    }

    static void a(w data) {
        String name = data.a();
        StringBuilder builder = w.get();
        builder.ensureCapacity("Picasso-".length() + name.length());
        builder.replace("Picasso-".length(), builder.length(), name);
        Thread.currentThread().setName(builder.toString());
    }

    static c a(t picasso, i dispatcher, d cache, a0 stats, a action) {
        w request = action.g();
        List<RequestHandler> requestHandlers = picasso.a();
        int count = requestHandlers.size();
        for (int i2 = 0; i2 < count; i2++) {
            y requestHandler = (y) requestHandlers.get(i2);
            if (requestHandler.a(request)) {
                return new c(picasso, dispatcher, cache, stats, action, requestHandler);
            }
        }
        return new c(picasso, dispatcher, cache, stats, action, y);
    }

    static Bitmap a(List<c0> list, Bitmap result) {
        int count = list.size();
        for (int i2 = 0; i2 < count; i2++) {
            c0 transformation = list.get(i2);
            try {
                Bitmap newResult = transformation.a(result);
                if (newResult == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(transformation.a());
                    sb.append(" returned null after ");
                    sb.append(i2);
                    StringBuilder builder = sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (c0 t2 : list) {
                        builder.append(t2.a());
                        builder.append('\n');
                    }
                    t.p.post(new d(builder));
                    return null;
                } else if (newResult == result && result.isRecycled()) {
                    t.p.post(new e(transformation));
                    return null;
                } else if (newResult == result || result.isRecycled()) {
                    result = newResult;
                } else {
                    t.p.post(new f(transformation));
                    return null;
                }
            } catch (RuntimeException e2) {
                t.p.post(new RunnableC۰۱۱۳c(transformation, e2));
                return null;
            }
        }
        return result;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$c  reason: collision with other inner class name */
    public static class RunnableC۰۱۱۳c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c0 f۳۵۳۰c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RuntimeException f۳۵۳۱d;

        RunnableC۰۱۱۳c(c0 c0Var, RuntimeException runtimeException) {
            this.f۳۵۳۰c = c0Var;
            this.f۳۵۳۱d = runtimeException;
        }

        public void run() {
            throw new RuntimeException("Transformation " + this.f۳۵۳۰c.a() + " crashed with exception.", this.f۳۵۳۱d);
        }
    }

    /* access modifiers changed from: package-private */
    public static class d implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ StringBuilder f۳۵۳۲c;

        d(StringBuilder sb) {
            this.f۳۵۳۲c = sb;
        }

        public void run() {
            throw new NullPointerException(this.f۳۵۳۲c.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static class e implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c0 f۳۵۳۳c;

        e(c0 c0Var) {
            this.f۳۵۳۳c = c0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f۳۵۳۳c.a() + " returned input Bitmap but recycled it.");
        }
    }

    /* access modifiers changed from: package-private */
    public static class f implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c0 f۳۵۳۴c;

        f(c0 c0Var) {
            this.f۳۵۳۴c = c0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f۳۵۳۴c.a() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    static Bitmap a(w data, Bitmap result, int exifOrientation) {
        int drawHeight;
        int drawWidth;
        int drawY;
        int drawX;
        Matrix matrix;
        int inWidth;
        boolean onlyScaleDown;
        int inHeight;
        int targetWidth;
        int targetHeight;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        int inHeight2;
        int inWidth2;
        float widthRatio;
        float f10;
        float f11;
        float scaleY;
        float scaleX;
        int newSize;
        int drawX2;
        int drawY2;
        int inWidth3 = result.getWidth();
        int inHeight3 = result.getHeight();
        boolean onlyScaleDown2 = data.m;
        Matrix matrix2 = new Matrix();
        if (data.e() || exifOrientation != 0) {
            int targetWidth2 = data.f۳۶۳۰h;
            int targetHeight2 = data.i;
            float targetRotation = data.n;
            if (targetRotation != 0.0f) {
                double cosR = Math.cos(Math.toRadians((double) targetRotation));
                double sinR = Math.sin(Math.toRadians((double) targetRotation));
                drawX = 0;
                if (data.q) {
                    drawY = 0;
                    matrix2.setRotate(targetRotation, data.o, data.p);
                    float f12 = data.o;
                    drawWidth = inWidth3;
                    double d2 = (double) f12;
                    Double.isNaN(d2);
                    drawHeight = inHeight3;
                    float f13 = data.p;
                    double d3 = (double) f13;
                    Double.isNaN(d3);
                    double x1T = (d2 * (1.0d - cosR)) + (d3 * sinR);
                    double d4 = (double) f13;
                    Double.isNaN(d4);
                    double d5 = (double) f12;
                    Double.isNaN(d5);
                    double y1T = (d4 * (1.0d - cosR)) - (d5 * sinR);
                    int i2 = data.f۳۶۳۰h;
                    inHeight = inHeight3;
                    double d6 = (double) i2;
                    Double.isNaN(d6);
                    double x2T = (d6 * cosR) + x1T;
                    onlyScaleDown = onlyScaleDown2;
                    double d7 = (double) i2;
                    Double.isNaN(d7);
                    double y2T = (d7 * sinR) + y1T;
                    double y2T2 = (double) i2;
                    Double.isNaN(y2T2);
                    inWidth = inWidth3;
                    int inWidth4 = data.i;
                    double d8 = (double) inWidth4;
                    Double.isNaN(d8);
                    double x3T = ((y2T2 * cosR) + x1T) - (d8 * sinR);
                    double d9 = (double) i2;
                    Double.isNaN(d9);
                    double d10 = (double) inWidth4;
                    Double.isNaN(d10);
                    double y3T = (d9 * sinR) + y1T + (d10 * cosR);
                    double d11 = (double) inWidth4;
                    Double.isNaN(d11);
                    double x4T = x1T - (d11 * sinR);
                    double sinR2 = (double) inWidth4;
                    Double.isNaN(sinR2);
                    double y4T = (sinR2 * cosR) + y1T;
                    double maxX = Math.max(x4T, Math.max(x3T, Math.max(x1T, x2T)));
                    double minX = Math.min(x4T, Math.min(x3T, Math.min(x1T, x2T)));
                    double maxY = Math.max(y4T, Math.max(y3T, Math.max(y1T, y2T)));
                    double minY = Math.min(y4T, Math.min(y3T, Math.min(y1T, y2T)));
                    targetWidth = (int) Math.floor(maxX - minX);
                    targetHeight = (int) Math.floor(maxY - minY);
                    matrix = matrix2;
                } else {
                    inWidth = inWidth3;
                    inHeight = inHeight3;
                    onlyScaleDown = onlyScaleDown2;
                    drawY = 0;
                    drawWidth = inWidth3;
                    drawHeight = inHeight3;
                    matrix = matrix2;
                    matrix.setRotate(targetRotation);
                    int i3 = data.f۳۶۳۰h;
                    double d12 = (double) i3;
                    Double.isNaN(d12);
                    double x2T2 = d12 * cosR;
                    double d13 = (double) i3;
                    Double.isNaN(d13);
                    double y2T3 = d13 * sinR;
                    double d14 = (double) i3;
                    Double.isNaN(d14);
                    int i4 = data.i;
                    double y1T2 = (double) i4;
                    Double.isNaN(y1T2);
                    double x3T2 = (d14 * cosR) - (y1T2 * sinR);
                    double d15 = (double) i3;
                    Double.isNaN(d15);
                    double d16 = (double) i4;
                    Double.isNaN(d16);
                    double y3T2 = (d15 * sinR) + (d16 * cosR);
                    double d17 = (double) i4;
                    Double.isNaN(d17);
                    double x4T2 = -(d17 * sinR);
                    double d18 = (double) i4;
                    Double.isNaN(d18);
                    double y4T2 = d18 * cosR;
                    double maxX2 = Math.max(x4T2, Math.max(x3T2, Math.max(0.0d, x2T2)));
                    double minX2 = Math.min(x4T2, Math.min(x3T2, Math.min(0.0d, x2T2)));
                    double maxY2 = Math.max(y4T2, Math.max(y3T2, Math.max(0.0d, y2T3)));
                    double minY2 = Math.min(y4T2, Math.min(y3T2, Math.min(0.0d, y2T3)));
                    targetWidth = (int) Math.floor(maxX2 - minX2);
                    targetHeight = (int) Math.floor(maxY2 - minY2);
                }
            } else {
                inWidth = inWidth3;
                inHeight = inHeight3;
                onlyScaleDown = onlyScaleDown2;
                drawX = 0;
                drawY = 0;
                drawWidth = inWidth3;
                drawHeight = inHeight3;
                matrix = matrix2;
                targetWidth = targetWidth2;
                targetHeight = targetHeight2;
            }
            if (exifOrientation != 0) {
                int exifRotation = a(exifOrientation);
                int exifTranslation = b(exifOrientation);
                if (exifRotation != 0) {
                    matrix.preRotate((float) exifRotation);
                    if (exifRotation == 90 || exifRotation == 270) {
                        targetHeight = targetWidth;
                        targetWidth = targetHeight;
                    }
                }
                if (exifTranslation != 1) {
                    matrix.postScale((float) exifTranslation, 1.0f);
                }
            }
            if (data.j) {
                if (targetWidth != 0) {
                    inWidth2 = inWidth;
                    widthRatio = ((float) targetWidth) / ((float) inWidth2);
                    inHeight2 = inHeight;
                } else {
                    inWidth2 = inWidth;
                    inHeight2 = inHeight;
                    widthRatio = ((float) targetHeight) / ((float) inHeight2);
                }
                if (targetHeight != 0) {
                    f11 = (float) targetHeight;
                    f10 = (float) inHeight2;
                } else {
                    f11 = (float) targetWidth;
                    f10 = (float) inWidth2;
                }
                float heightRatio = f11 / f10;
                if (widthRatio > heightRatio) {
                    newSize = (int) Math.ceil((double) (((float) inHeight2) * (heightRatio / widthRatio)));
                    int i5 = data.k;
                    if ((i5 & 48) == 48) {
                        drawY2 = 0;
                    } else if ((i5 & 80) == 80) {
                        drawY2 = inHeight2 - newSize;
                    } else {
                        drawY2 = (inHeight2 - newSize) / 2;
                    }
                    scaleX = widthRatio;
                    scaleY = ((float) targetHeight) / ((float) newSize);
                    drawY = drawY2;
                } else if (widthRatio < heightRatio) {
                    int newSize2 = (int) Math.ceil((double) (((float) inWidth2) * (widthRatio / heightRatio)));
                    int i6 = data.k;
                    if ((i6 & 3) == 3) {
                        drawX2 = 0;
                    } else if ((i6 & 5) == 5) {
                        drawX2 = inWidth2 - newSize2;
                    } else {
                        drawX2 = (inWidth2 - newSize2) / 2;
                    }
                    scaleX = ((float) targetWidth) / ((float) newSize2);
                    scaleY = heightRatio;
                    drawX = drawX2;
                    drawWidth = newSize2;
                    newSize = drawHeight;
                } else {
                    scaleY = heightRatio;
                    scaleX = heightRatio;
                    drawX = 0;
                    drawWidth = inWidth2;
                    newSize = drawHeight;
                }
                if (a(onlyScaleDown, inWidth2, inHeight2, targetWidth, targetHeight)) {
                    matrix.preScale(scaleX, scaleY);
                }
                drawHeight = newSize;
            } else if (data.l) {
                if (targetWidth != 0) {
                    f7 = (float) targetWidth;
                    f6 = (float) inWidth;
                } else {
                    f7 = (float) targetHeight;
                    f6 = (float) inHeight;
                }
                float widthRatio2 = f7 / f6;
                if (targetHeight != 0) {
                    f9 = (float) targetHeight;
                    f8 = (float) inHeight;
                } else {
                    f9 = (float) targetWidth;
                    f8 = (float) inWidth;
                }
                float heightRatio2 = f9 / f8;
                float scale = widthRatio2 < heightRatio2 ? widthRatio2 : heightRatio2;
                if (a(onlyScaleDown, inWidth, inHeight, targetWidth, targetHeight)) {
                    matrix.preScale(scale, scale);
                }
            } else if (!((targetWidth == 0 && targetHeight == 0) || (targetWidth == inWidth && targetHeight == inHeight))) {
                if (targetWidth != 0) {
                    f3 = (float) targetWidth;
                    f2 = (float) inWidth;
                } else {
                    f3 = (float) targetHeight;
                    f2 = (float) inHeight;
                }
                float sx = f3 / f2;
                if (targetHeight != 0) {
                    f5 = (float) targetHeight;
                    f4 = (float) inHeight;
                } else {
                    f5 = (float) targetWidth;
                    f4 = (float) inWidth;
                }
                float sy = f5 / f4;
                if (a(onlyScaleDown, inWidth, inHeight, targetWidth, targetHeight)) {
                    matrix.preScale(sx, sy);
                }
            }
        } else {
            drawX = 0;
            drawY = 0;
            drawWidth = inWidth3;
            drawHeight = inHeight3;
            matrix = matrix2;
        }
        Bitmap newResult = Bitmap.createBitmap(result, drawX, drawY, drawWidth, drawHeight, matrix, true);
        if (newResult == result) {
            return result;
        }
        result.recycle();
        return newResult;
    }

    private static boolean a(boolean onlyScaleDown, int inWidth, int inHeight, int targetWidth, int targetHeight) {
        return !onlyScaleDown || (targetWidth != 0 && inWidth > targetWidth) || (targetHeight != 0 && inHeight > targetHeight);
    }

    static int a(int orientation) {
        switch (orientation) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int b(int orientation) {
        if (orientation == 2 || orientation == 7 || orientation == 4 || orientation == 5) {
            return -1;
        }
        return 1;
    }
}
