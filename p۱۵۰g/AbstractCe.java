package p۱۵۰g;

import android.media.AudioRecord;
import java.io.OutputStream;
import p۱۵۰g.AbstractCb;
import p۱۵۰g.AbstractCk;

/* renamed from: g.e  reason: invalid class name */
public interface AbstractCe {

    /* renamed from: g.e$c  reason: invalid class name */
    public interface AbstractCc {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۹۶۰۷a(AbstractCb bVar);
    }

    /* renamed from: a  reason: contains not printable characters */
    AbstractCc m۱۹۵۹۹a();

    /* renamed from: a  reason: contains not printable characters */
    void m۱۹۶۰۰a(OutputStream outputStream);

    void stop();

    /* renamed from: g.e$a  reason: invalid class name */
    public static abstract class AbstractCa implements AbstractCe {

        /* renamed from: a  reason: contains not printable characters */
        final AbstractCc f۱۶۳۲۸a;

        /* renamed from: b  reason: contains not printable characters */
        final AbstractCc f۱۶۳۲۹b;

        /* renamed from: c  reason: contains not printable characters */
        private final Ch f۱۶۳۳۰c = new Ch();

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۹۶۰۲a(AudioRecord audioRecord, int i, OutputStream outputStream);

        AbstractCa(AbstractCc audioRecordSource, AbstractCc onAudioChunkPulledListener) {
            this.f۱۶۳۲۸a = audioRecordSource;
            this.f۱۶۳۲۹b = onAudioChunkPulledListener;
        }

        @Override // p۱۵۰g.AbstractCe
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۶۰۴a(OutputStream outputStream) {
            m۱۹۶۰۲a(m۱۹۶۰۵b(), this.f۱۶۳۲۸a.m۱۹۵۸۴a(), outputStream);
        }

        @Override // p۱۵۰g.AbstractCe
        public void stop() {
            this.f۱۶۳۲۸a.m۱۹۵۸۵a(false);
            this.f۱۶۳۲۸a.m۱۹۵۸۶b().stop();
        }

        @Override // p۱۵۰g.AbstractCe
        /* renamed from: a  reason: contains not printable characters */
        public AbstractCc m۱۹۶۰۱a() {
            return this.f۱۶۳۲۸a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public AudioRecord m۱۹۶۰۵b() {
            AudioRecord audioRecord = this.f۱۶۳۲۸a.m۱۹۵۸۶b();
            audioRecord.startRecording();
            this.f۱۶۳۲۸a.m۱۹۵۸۵a(true);
            return audioRecord;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g.e$a$a  reason: invalid class name */
        public class RunnableCa implements Runnable {

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ AbstractCb f۱۶۳۳۱c;

            RunnableCa(AbstractCb bVar) {
                this.f۱۶۳۳۱c = bVar;
            }

            public void run() {
                AbstractCa.this.f۱۶۳۲۹b.m۱۹۶۰۷a(this.f۱۶۳۳۱c);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۶۰۳a(AbstractCb audioChunk) {
            this.f۱۶۳۳۰c.m۱۹۶۱۱a(new RunnableCa(audioChunk));
        }
    }

    /* renamed from: g.e$b  reason: invalid class name */
    public static final class Cb extends AbstractCa {

        /* renamed from: d  reason: contains not printable characters */
        private final AbstractCk f۱۶۳۳۳d;

        public Cb(AbstractCc audioRecordSource, AbstractCc onAudioChunkPulledListener, AbstractCk writeAction) {
            super(audioRecordSource, onAudioChunkPulledListener);
            this.f۱۶۳۳۳d = writeAction;
        }

        public Cb(AbstractCc audioRecordSource, AbstractCc onAudioChunkPulledListener) {
            this(audioRecordSource, onAudioChunkPulledListener, new AbstractCk.Ca());
        }

        /* access modifiers changed from: package-private */
        @Override // p۱۵۰g.AbstractCe.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۶۰۶a(AudioRecord audioRecord, int minimumBufferSize, OutputStream outputStream) {
            while (this.f۱۶۳۲۸a.m۱۹۵۸۸d()) {
                AbstractCb audioChunk = new AbstractCb.Ca(new byte[minimumBufferSize]);
                if (-3 != audioRecord.read(audioChunk.m۱۹۵۸۰b(), 0, minimumBufferSize)) {
                    if (this.f۱۶۳۲۹b != null) {
                        m۱۹۶۰۳a(audioChunk);
                    }
                    this.f۱۶۳۳۳d.m۱۹۶۱۷a(audioChunk.m۱۹۵۸۰b(), outputStream);
                }
            }
        }
    }
}
