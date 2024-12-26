package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: a.b.c.l.f  reason: invalid class name */
public class Cf extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: contains not printable characters */
    private final Matrix f۸۲۶۰a = new Matrix();

    public Cf() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a  reason: contains not printable characters */
    public void set(ImageView object, Matrix value) {
        object.setImageMatrix(value);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Matrix get(ImageView object) {
        this.f۸۲۶۰a.set(object.getImageMatrix());
        return this.f۸۲۶۰a;
    }
}
