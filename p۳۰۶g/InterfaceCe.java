package p۳۰۶g;

import android.media.AudioRecord;
import java.io.OutputStream;
import p۳۰۶g.InterfaceCb;
import p۳۰۶g.InterfaceCk;

/* renamed from: g.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public interface InterfaceCe {

    /* renamed from: g.e$c */
    public interface c {
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۷۵۳۰a(InterfaceCb interfaceCb);
    }

    /* renamed from: a, reason: contains not printable characters */
    InterfaceCc mo۱۷۵۲۴a();

    /* renamed from: a, reason: contains not printable characters */
    void mo۱۷۵۲۷a(OutputStream outputStream);

    void stop();

    /* renamed from: g.e$a */
    public static abstract class a implements InterfaceCe {

        /* renamed from: a, reason: contains not printable characters */
        final InterfaceCc f۱۶۳۲۸a;

        /* renamed from: b, reason: contains not printable characters */
        final c f۱۶۳۲۹b;

        /* renamed from: c, reason: contains not printable characters */
        private final Ch f۱۶۳۳۰c = new Ch();

        /* renamed from: a, reason: contains not printable characters */
        abstract void mo۱۷۵۲۹a(AudioRecord audioRecord, int i, OutputStream outputStream);

        a(InterfaceCc audioRecordSource, c onAudioChunkPulledListener) {
            this.f۱۶۳۲۸a = audioRecordSource;
            this.f۱۶۳۲۹b = onAudioChunkPulledListener;
        }

        @Override // p۳۰۶g.InterfaceCe
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۵۲۷a(OutputStream outputStream) {
            mo۱۷۵۲۹a(m۱۷۵۲۸b(), this.f۱۶۳۲۸a.mo۱۷۵۱۴a(), outputStream);
        }

        @Override // p۳۰۶g.InterfaceCe
        public void stop() {
            this.f۱۶۳۲۸a.mo۱۷۵۱۵a(false);
            this.f۱۶۳۲۸a.mo۱۷۵۱۶b().stop();
        }

        @Override // p۳۰۶g.InterfaceCe
        /* renamed from: a, reason: contains not printable characters */
        public InterfaceCc mo۱۷۵۲۴a() {
            return this.f۱۶۳۲۸a;
        }

        /* renamed from: b, reason: contains not printable characters */
        AudioRecord m۱۷۵۲۸b() {
            AudioRecord audioRecord = this.f۱۶۳۲۸a.mo۱۷۵۱۶b();
            audioRecord.startRecording();
            this.f۱۶۳۲۸a.mo۱۷۵۱۵a(true);
            return audioRecord;
        }

        /* renamed from: g.e$a$a, reason: collision with other inner class name */
        class RunnableC۱۴۷۲a implements Runnable {

            /* renamed from: c, reason: contains not printable characters */
            final /* synthetic */ InterfaceCb f۱۶۳۳۱c;

            RunnableC۱۴۷۲a(InterfaceCb interfaceCb) {
                this.f۱۶۳۳۱c = interfaceCb;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f۱۶۳۲۹b.mo۱۷۵۳۰a(this.f۱۶۳۳۱c);
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۷۵۲۶a(InterfaceCb audioChunk) {
            this.f۱۶۳۳۰c.m۱۷۵۳۴a(new RunnableC۱۴۷۲a(audioChunk));
        }
    }

    /* renamed from: g.e$b */
    public static final class b extends a {

        /* renamed from: d, reason: contains not printable characters */
        private final InterfaceCk f۱۶۳۳۳d;

        public b(InterfaceCc audioRecordSource, c onAudioChunkPulledListener, InterfaceCk writeAction) {
            super(audioRecordSource, onAudioChunkPulledListener);
            this.f۱۶۳۳۳d = writeAction;
        }

        public b(InterfaceCc audioRecordSource, c onAudioChunkPulledListener) {
            this(audioRecordSource, onAudioChunkPulledListener, new InterfaceCk.a());
        }

        @Override // p۳۰۶g.InterfaceCe.a
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۷۵۲۹a(AudioRecord audioRecord, int minimumBufferSize, OutputStream outputStream) {
            while (this.f۱۶۳۲۸a.mo۱۷۵۱۸d()) {
                InterfaceCb audioChunk = new InterfaceCb.a(new byte[minimumBufferSize]);
                if (-3 != audioRecord.read(audioChunk.mo۱۷۵۰۵b(), 0, minimumBufferSize)) {
                    if (this.f۱۶۳۲۹b != null) {
                        m۱۷۵۲۶a(audioChunk);
                    }
                    this.f۱۶۳۳۳d.mo۱۷۵۴۱a(audioChunk.mo۱۷۵۰۵b(), outputStream);
                }
            }
        }
    }
}
