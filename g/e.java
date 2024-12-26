package g;

import android.media.AudioRecord;
import g.b;
import g.k;
import java.io.OutputStream;

public interface e {

    public interface c {
        void a(b bVar);
    }

    c a();

    void a(OutputStream outputStream);

    void stop();

    public static abstract class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final c f۴۲۳۳a;

        /* renamed from: b  reason: collision with root package name */
        final c f۴۲۳۴b;

        /* renamed from: c  reason: collision with root package name */
        private final h f۴۲۳۵c = new h();

        /* access modifiers changed from: package-private */
        public abstract void a(AudioRecord audioRecord, int i, OutputStream outputStream);

        a(c audioRecordSource, c onAudioChunkPulledListener) {
            this.f۴۲۳۳a = audioRecordSource;
            this.f۴۲۳۴b = onAudioChunkPulledListener;
        }

        @Override // g.e
        public void a(OutputStream outputStream) {
            a(b(), this.f۴۲۳۳a.a(), outputStream);
        }

        @Override // g.e
        public void stop() {
            this.f۴۲۳۳a.a(false);
            this.f۴۲۳۳a.b().stop();
        }

        @Override // g.e
        public c a() {
            return this.f۴۲۳۳a;
        }

        /* access modifiers changed from: package-private */
        public AudioRecord b() {
            AudioRecord audioRecord = this.f۴۲۳۳a.b();
            audioRecord.startRecording();
            this.f۴۲۳۳a.a(true);
            return audioRecord;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g.e$a$a  reason: collision with other inner class name */
        public class RunnableC۰۱۲۶a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f۴۲۳۶c;

            RunnableC۰۱۲۶a(b bVar) {
                this.f۴۲۳۶c = bVar;
            }

            public void run() {
                a.this.f۴۲۳۴b.a(this.f۴۲۳۶c);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(b audioChunk) {
            this.f۴۲۳۵c.a(new RunnableC۰۱۲۶a(audioChunk));
        }
    }

    public static final class b extends a {

        /* renamed from: d  reason: collision with root package name */
        private final k f۴۲۳۸d;

        public b(c audioRecordSource, c onAudioChunkPulledListener, k writeAction) {
            super(audioRecordSource, onAudioChunkPulledListener);
            this.f۴۲۳۸d = writeAction;
        }

        public b(c audioRecordSource, c onAudioChunkPulledListener) {
            this(audioRecordSource, onAudioChunkPulledListener, new k.a());
        }

        /* access modifiers changed from: package-private */
        @Override // g.e.a
        public void a(AudioRecord audioRecord, int minimumBufferSize, OutputStream outputStream) {
            while (this.f۴۲۳۳a.d()) {
                b audioChunk = new b.a(new byte[minimumBufferSize]);
                if (-3 != audioRecord.read(audioChunk.b(), 0, minimumBufferSize)) {
                    if (this.f۴۲۳۴b != null) {
                        a(audioChunk);
                    }
                    this.f۴۲۳۸d.a(audioChunk.b(), outputStream);
                }
            }
        }
    }
}
