package com.devs.acr;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class a implements Thread.UncaughtExceptionHandler {
    private static String w = "ACR: New Crash Report Generated";
    private static a x;

    /* renamed from: a  reason: collision with root package name */
    private String[] f۲۸۲۴a;

    /* renamed from: b  reason: collision with root package name */
    private String f۲۸۲۵b;

    /* renamed from: c  reason: collision with root package name */
    private String f۲۸۲۶c;

    /* renamed from: d  reason: collision with root package name */
    private String f۲۸۲۷d;

    /* renamed from: e  reason: collision with root package name */
    private String f۲۸۲۸e;

    /* renamed from: f  reason: collision with root package name */
    private String f۲۸۲۹f;

    /* renamed from: g  reason: collision with root package name */
    private String f۲۸۳۰g;

    /* renamed from: h  reason: collision with root package name */
    private String f۲۸۳۱h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private long r;
    private String s;
    private String t;
    private HashMap<String, String> u = new HashMap<>();
    private Application v;

    static {
        a.class.getSimpleName();
    }

    private a(Application application) {
        this.v = application;
    }

    public static a a(Application application) {
        if (x == null) {
            x = new a(application);
        }
        return x;
    }

    private String b() {
        String customInfo = "";
        for (Object currentKey : this.u.keySet()) {
            customInfo = customInfo + currentKey + " = " + this.u.get(currentKey) + "\n";
        }
        return customInfo;
    }

    private long d() {
        StatFs stat = new StatFs(Environment.getDataDirectory().getPath());
        return (((long) stat.getAvailableBlocks()) * ((long) stat.getBlockSize())) / 1048576;
    }

    private long f() {
        StatFs stat = new StatFs(Environment.getDataDirectory().getPath());
        return (((long) stat.getBlockCount()) * ((long) stat.getBlockSize())) / 1048576;
    }

    private void b(Context context) {
        try {
            PackageInfo pi = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f۲۸۲۵b = pi.versionName;
            this.f۲۸۲۶c = pi.packageName;
            this.f۲۸۲۸e = Build.MODEL;
            this.f۲۸۲۹f = Build.VERSION.RELEASE;
            this.f۲۸۳۰g = Build.BOARD;
            this.f۲۸۳۱h = Build.BRAND;
            this.i = Build.DEVICE;
            this.j = Build.DISPLAY;
            this.k = Build.FINGERPRINT;
            this.l = Build.HOST;
            this.m = Build.ID;
            this.o = Build.MODEL;
            this.p = Build.PRODUCT;
            this.n = Build.MANUFACTURER;
            this.q = Build.TAGS;
            this.r = Build.TIME;
            this.s = Build.TYPE;
            this.t = Build.USER;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private String c() {
        b(this.v);
        StringBuilder infoStringBuffer = new StringBuilder();
        infoStringBuffer.append("\nVERSION\t\t: ");
        infoStringBuffer.append(this.f۲۸۲۵b);
        infoStringBuffer.append("\nPACKAGE      : ");
        infoStringBuffer.append(this.f۲۸۲۶c);
        infoStringBuffer.append("\nFILE-PATH    : ");
        infoStringBuffer.append(this.f۲۸۲۷d);
        infoStringBuffer.append("\nPHONE-MODEL  : ");
        infoStringBuffer.append(this.f۲۸۲۸e);
        infoStringBuffer.append("\nANDROID_VERS : ");
        infoStringBuffer.append(this.f۲۸۲۹f);
        infoStringBuffer.append("\nBOARD        : ");
        infoStringBuffer.append(this.f۲۸۳۰g);
        infoStringBuffer.append("\nBRAND        : ");
        infoStringBuffer.append(this.f۲۸۳۱h);
        infoStringBuffer.append("\nDEVICE       : ");
        infoStringBuffer.append(this.i);
        infoStringBuffer.append("\nDISPLAY      : ");
        infoStringBuffer.append(this.j);
        infoStringBuffer.append("\nFINGER-PRINT : ");
        infoStringBuffer.append(this.k);
        infoStringBuffer.append("\nHOST         : ");
        infoStringBuffer.append(this.l);
        infoStringBuffer.append("\nID           : ");
        infoStringBuffer.append(this.m);
        infoStringBuffer.append("\nMODEL        : ");
        infoStringBuffer.append(this.o);
        infoStringBuffer.append("\nPRODUCT      : ");
        infoStringBuffer.append(this.p);
        infoStringBuffer.append("\nMANUFACTURER : ");
        infoStringBuffer.append(this.n);
        infoStringBuffer.append("\nTAGS         : ");
        infoStringBuffer.append(this.q);
        infoStringBuffer.append("\nTIME         : ");
        infoStringBuffer.append(this.r);
        infoStringBuffer.append("\nTYPE         : ");
        infoStringBuffer.append(this.s);
        infoStringBuffer.append("\nUSER         : ");
        infoStringBuffer.append(this.t);
        infoStringBuffer.append("\nTOTAL-INTERNAL-MEMORY     : ");
        infoStringBuffer.append(f() + " mb");
        infoStringBuffer.append("\nAVAILABLE-INTERNAL-MEMORY : ");
        infoStringBuffer.append(d() + " mb");
        return infoStringBuffer.toString();
    }

    public void uncaughtException(Thread t2, Throwable e2) {
        b("====uncaughtException");
        StringBuilder reportStringBuffer = new StringBuilder();
        reportStringBuffer.append("Error Report collected on : ");
        reportStringBuffer.append(new Date().toString());
        reportStringBuffer.append("\n\nInformations :\n==============");
        reportStringBuffer.append(c());
        String customInfo = b();
        if (!customInfo.equals("")) {
            reportStringBuffer.append("\n\nCustom Informations :\n==============\n");
            reportStringBuffer.append(customInfo);
        }
        reportStringBuffer.append("\n\nStack :\n==============\n");
        Writer result = new StringWriter();
        PrintWriter printWriter = new PrintWriter(result);
        e2.printStackTrace(printWriter);
        reportStringBuffer.append(result.toString());
        reportStringBuffer.append("\nCause :\n==============");
        for (Throwable cause = e2.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
            reportStringBuffer.append(result.toString());
        }
        printWriter.close();
        reportStringBuffer.append("\n\n**** End of current Report ***");
        b("====uncaughtException \n Report: " + reportStringBuffer.toString());
        a(reportStringBuffer.toString());
        Intent intent = new Intent(this.v, ErrorReporterActivity.class);
        intent.setFlags(268435456);
        this.v.startActivity(intent);
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    private void a(Context _context, String errorContent) {
        b("====sendErrorMail");
        Intent sendIntent = new Intent("android.intent.action.SEND");
        String subject = w;
        sendIntent.putExtra("android.intent.extra.EMAIL", this.f۲۸۲۴a);
        sendIntent.putExtra("android.intent.extra.TEXT", "\n\n" + errorContent + "\n\n");
        sendIntent.putExtra("android.intent.extra.SUBJECT", subject);
        sendIntent.setType("message/rfc822");
        sendIntent.setFlags(268435456);
        _context.startActivity(Intent.createChooser(sendIntent, "Title:"));
    }

    private void a(String errorContent) {
        b("====SaveAsFile");
        try {
            int random = new Random().nextInt(99999);
            FileOutputStream trace = this.v.openFileOutput("stack-" + random + ".stacktrace", 0);
            trace.write(errorContent.getBytes());
            trace.close();
        } catch (Exception e2) {
        }
    }

    private String[] e() {
        File dir = new File(this.f۲۸۲۷d + "/");
        dir.mkdir();
        return dir.list(new C۰۰۶۵a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.devs.acr.a$a  reason: collision with other inner class name */
    public class C۰۰۶۵a implements FilenameFilter {
        C۰۰۶۵a(a this$0) {
        }

        public boolean accept(File dir, String name) {
            return name.endsWith(".stacktrace");
        }
    }

    private boolean a() {
        return e().length > 0;
    }

    /* access modifiers changed from: package-private */
    public void a(Context _context) {
        try {
            this.f۲۸۲۷d = _context.getFilesDir().getAbsolutePath();
            if (a()) {
                StringBuilder wholeErrorTextSB = new StringBuilder();
                String[] errorFileList = e();
                int curIndex = 0;
                int length = errorFileList.length;
                int i2 = 0;
                while (i2 < length) {
                    String curString = errorFileList[i2];
                    int curIndex2 = curIndex + 1;
                    if (curIndex <= 5) {
                        wholeErrorTextSB.append("New Trace collected :\n=====================\n");
                        BufferedReader input = new BufferedReader(new FileReader(this.f۲۸۲۷d + "/" + curString));
                        while (true) {
                            String line = input.readLine();
                            if (line == null) {
                                break;
                            }
                            wholeErrorTextSB.append(line + "\n");
                        }
                        input.close();
                    }
                    new File(this.f۲۸۲۷d + "/" + curString).delete();
                    i2++;
                    curIndex = curIndex2;
                }
                a(_context, wholeErrorTextSB.toString());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void b(String msg) {
    }
}
