package a.b.c.l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public class f extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f۳۱a = new Matrix();

    public f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public void set(ImageView object, Matrix value) {
        object.setImageMatrix(value);
    }

    /* renamed from: a */
    public Matrix get(ImageView object) {
        this.f۳۱a.set(object.getImageMatrix());
        return this.f۳۱a;
    }
}
