package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۶۸l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: a.b.c.l.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cf extends Property<ImageView, Matrix> {

    /* renamed from: a, reason: contains not printable characters */
    private final Matrix f۸۲۶۰a;

    public Cf() {
        super(Matrix.class, "imageMatrixProperty");
        this.f۸۲۶۰a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void set(ImageView object, Matrix value) {
        object.setImageMatrix(value);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Matrix get(ImageView object) {
        this.f۸۲۶۰a.set(object.getImageMatrix());
        return this.f۸۲۶۰a;
    }
}
