package cafe.adriel.androidaudiorecorder;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Environment;
import cafe.adriel.androidaudiorecorder.j.b;
import cafe.adriel.androidaudiorecorder.j.c;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private Activity f۲۶۸۱a;

    /* renamed from: b  reason: collision with root package name */
    private String f۲۶۸۲b = (Environment.getExternalStorageDirectory() + "/recorded_audio.wav");

    /* renamed from: c  reason: collision with root package name */
    private c f۲۶۸۳c = c.MIC;

    /* renamed from: d  reason: collision with root package name */
    private cafe.adriel.androidaudiorecorder.j.a f۲۶۸۴d = cafe.adriel.androidaudiorecorder.j.a.STEREO;

    /* renamed from: e  reason: collision with root package name */
    private b f۲۶۸۵e = b.HZ_44100;

    /* renamed from: f  reason: collision with root package name */
    private int f۲۶۸۶f = Color.parseColor("#546E7A");

    /* renamed from: g  reason: collision with root package name */
    private int f۲۶۸۷g = 0;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۲۶۸۸h = false;
    private boolean i = false;

    private a(Activity activity) {
        this.f۲۶۸۱a = activity;
    }

    public static a a(Activity activity) {
        return new a(activity);
    }

    public a a(String filePath) {
        this.f۲۶۸۲b = filePath;
        return this;
    }

    public a a(int color) {
        this.f۲۶۸۶f = color;
        return this;
    }

    public a b(int requestCode) {
        this.f۲۶۸۷g = requestCode;
        return this;
    }

    public a a(c source) {
        this.f۲۶۸۳c = source;
        return this;
    }

    public a a(cafe.adriel.androidaudiorecorder.j.a channel) {
        this.f۲۶۸۴d = channel;
        return this;
    }

    public a a(b sampleRate) {
        this.f۲۶۸۵e = sampleRate;
        return this;
    }

    public a a(boolean autoStart) {
        this.f۲۶۸۸h = autoStart;
        return this;
    }

    public a b(boolean keepDisplayOn) {
        this.i = keepDisplayOn;
        return this;
    }

    public void a() {
        Intent intent = new Intent(this.f۲۶۸۱a, AudioRecorderActivity.class);
        intent.putExtra("filePath", this.f۲۶۸۲b);
        intent.putExtra("color", this.f۲۶۸۶f);
        intent.putExtra("source", this.f۲۶۸۳c);
        intent.putExtra("channel", this.f۲۶۸۴d);
        intent.putExtra("sampleRate", this.f۲۶۸۵e);
        intent.putExtra("autoStart", this.f۲۶۸۸h);
        intent.putExtra("keepDisplayOn", this.i);
        this.f۲۶۸۱a.startActivityForResult(intent, this.f۲۶۸۷g);
    }
}
