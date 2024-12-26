package android.arch.lifecycle;

public abstract class c {

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public abstract b a();

    public abstract void a(d dVar);

    public abstract void b(d dVar);

    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean a(b state) {
            return compareTo(state) >= 0;
        }
    }
}
