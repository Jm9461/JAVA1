package cafe.adriel.androidaudiorecorder;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Environment;
import cafe.adriel.androidaudiorecorder.p۱۲۸j.EnumCa;
import cafe.adriel.androidaudiorecorder.p۱۲۸j.EnumCb;
import cafe.adriel.androidaudiorecorder.p۱۲۸j.EnumCc;

/* renamed from: cafe.adriel.androidaudiorecorder.a  reason: invalid class name */
public class Ca {

    /* renamed from: a  reason: contains not printable characters */
    private Activity f۱۳۲۰۴a;

    /* renamed from: b  reason: contains not printable characters */
    private String f۱۳۲۰۵b = (Environment.getExternalStorageDirectory() + "/recorded_audio.wav");

    /* renamed from: c  reason: contains not printable characters */
    private EnumCc f۱۳۲۰۶c = EnumCc.MIC;

    /* renamed from: d  reason: contains not printable characters */
    private EnumCa f۱۳۲۰۷d = EnumCa.STEREO;

    /* renamed from: e  reason: contains not printable characters */
    private EnumCb f۱۳۲۰۸e = EnumCb.HZ_44100;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۳۲۰۹f = Color.parseColor("#546E7A");

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۳۲۱۰g = 0;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۳۲۱۱h = false;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۱۳۲۱۲i = false;

    private Ca(Activity activity) {
        this.f۱۳۲۰۴a = activity;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Ca m۱۶۶۴۸a(Activity activity) {
        return new Ca(activity);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۶۶۵۳a(String filePath) {
        this.f۱۳۲۰۵b = filePath;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۶۶۴۹a(int color) {
        this.f۱۳۲۰۹f = color;
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۶۶۵۶b(int requestCode) {
        this.f۱۳۲۱۰g = requestCode;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۶۶۵۲a(EnumCc source) {
        this.f۱۳۲۰۶c = source;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۶۶۵۰a(EnumCa channel) {
        this.f۱۳۲۰۷d = channel;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۶۶۵۱a(EnumCb sampleRate) {
        this.f۱۳۲۰۸e = sampleRate;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۶۶۵۴a(boolean autoStart) {
        this.f۱۳۲۱۱h = autoStart;
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۶۶۵۷b(boolean keepDisplayOn) {
        this.f۱۳۲۱۲i = keepDisplayOn;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۶۵۵a() {
        Intent intent = new Intent(this.f۱۳۲۰۴a, AudioRecorderActivity.class);
        intent.putExtra("filePath", this.f۱۳۲۰۵b);
        intent.putExtra("color", this.f۱۳۲۰۹f);
        intent.putExtra("source", this.f۱۳۲۰۶c);
        intent.putExtra("channel", this.f۱۳۲۰۷d);
        intent.putExtra("sampleRate", this.f۱۳۲۰۸e);
        intent.putExtra("autoStart", this.f۱۳۲۱۱h);
        intent.putExtra("keepDisplayOn", this.f۱۳۲۱۲i);
        this.f۱۳۲۰۴a.startActivityForResult(intent, this.f۱۳۲۱۰g);
    }
}
