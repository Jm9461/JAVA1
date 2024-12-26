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

/* renamed from: com.devs.acr.a  reason: invalid class name */
public class Ca implements Thread.UncaughtExceptionHandler {

    /* renamed from: w  reason: contains not printable characters */
    private static String f۱۳۴۸۲w = "ACR: New Crash Report Generated";

    /* renamed from: x  reason: contains not printable characters */
    private static Ca f۱۳۴۸۳x;

    /* renamed from: a  reason: contains not printable characters */
    private String[] f۱۳۴۸۴a;

    /* renamed from: b  reason: contains not printable characters */
    private String f۱۳۴۸۵b;

    /* renamed from: c  reason: contains not printable characters */
    private String f۱۳۴۸۶c;

    /* renamed from: d  reason: contains not printable characters */
    private String f۱۳۴۸۷d;

    /* renamed from: e  reason: contains not printable characters */
    private String f۱۳۴۸۸e;

    /* renamed from: f  reason: contains not printable characters */
    private String f۱۳۴۸۹f;

    /* renamed from: g  reason: contains not printable characters */
    private String f۱۳۴۹۰g;

    /* renamed from: h  reason: contains not printable characters */
    private String f۱۳۴۹۱h;

    /* renamed from: i  reason: contains not printable characters */
    private String f۱۳۴۹۲i;

    /* renamed from: j  reason: contains not printable characters */
    private String f۱۳۴۹۳j;

    /* renamed from: k  reason: contains not printable characters */
    private String f۱۳۴۹۴k;

    /* renamed from: l  reason: contains not printable characters */
    private String f۱۳۴۹۵l;

    /* renamed from: m  reason: contains not printable characters */
    private String f۱۳۴۹۶m;

    /* renamed from: n  reason: contains not printable characters */
    private String f۱۳۴۹۷n;

    /* renamed from: o  reason: contains not printable characters */
    private String f۱۳۴۹۸o;

    /* renamed from: p  reason: contains not printable characters */
    private String f۱۳۴۹۹p;

    /* renamed from: q  reason: contains not printable characters */
    private String f۱۳۵۰۰q;

    /* renamed from: r  reason: contains not printable characters */
    private long f۱۳۵۰۱r;

    /* renamed from: s  reason: contains not printable characters */
    private String f۱۳۵۰۲s;

    /* renamed from: t  reason: contains not printable characters */
    private String f۱۳۵۰۳t;

    /* renamed from: u  reason: contains not printable characters */
    private HashMap<String, String> f۱۳۵۰۴u = new HashMap<>();

    /* renamed from: v  reason: contains not printable characters */
    private Application f۱۳۵۰۵v;

    static {
        Ca.class.getSimpleName();
    }

    private Ca(Application application) {
        this.f۱۳۵۰۵v = application;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Ca m۱۶۸۶۳a(Application application) {
        if (f۱۳۴۸۳x == null) {
            f۱۳۴۸۳x = new Ca(application);
        }
        return f۱۳۴۸۳x;
    }

    /* renamed from: b  reason: contains not printable characters */
    private String m۱۶۸۶۷b() {
        String customInfo = "";
        for (Object currentKey : this.f۱۳۵۰۴u.keySet()) {
            customInfo = customInfo + currentKey + " = " + this.f۱۳۵۰۴u.get(currentKey) + "\n";
        }
        return customInfo;
    }

    /* renamed from: d  reason: contains not printable characters */
    private long m۱۶۸۷۱d() {
        StatFs stat = new StatFs(Environment.getDataDirectory().getPath());
        return (((long) stat.getAvailableBlocks()) * ((long) stat.getBlockSize())) / 1048576;
    }

    /* renamed from: f  reason: contains not printable characters */
    private long m۱۶۸۷۳f() {
        StatFs stat = new StatFs(Environment.getDataDirectory().getPath());
        return (((long) stat.getBlockCount()) * ((long) stat.getBlockSize())) / 1048576;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۸۶۸b(Context context) {
        try {
            PackageInfo pi = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f۱۳۴۸۵b = pi.versionName;
            this.f۱۳۴۸۶c = pi.packageName;
            this.f۱۳۴۸۸e = Build.MODEL;
            this.f۱۳۴۸۹f = Build.VERSION.RELEASE;
            this.f۱۳۴۹۰g = Build.BOARD;
            this.f۱۳۴۹۱h = Build.BRAND;
            this.f۱۳۴۹۲i = Build.DEVICE;
            this.f۱۳۴۹۳j = Build.DISPLAY;
            this.f۱۳۴۹۴k = Build.FINGERPRINT;
            this.f۱۳۴۹۵l = Build.HOST;
            this.f۱۳۴۹۶m = Build.ID;
            this.f۱۳۴۹۸o = Build.MODEL;
            this.f۱۳۴۹۹p = Build.PRODUCT;
            this.f۱۳۴۹۷n = Build.MANUFACTURER;
            this.f۱۳۵۰۰q = Build.TAGS;
            this.f۱۳۵۰۱r = Build.TIME;
            this.f۱۳۵۰۲s = Build.TYPE;
            this.f۱۳۵۰۳t = Build.USER;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private String m۱۶۸۷۰c() {
        m۱۶۸۶۸b(this.f۱۳۵۰۵v);
        StringBuilder infoStringBuffer = new StringBuilder();
        infoStringBuffer.append("\nVERSION\t\t: ");
        infoStringBuffer.append(this.f۱۳۴۸۵b);
        infoStringBuffer.append("\nPACKAGE      : ");
        infoStringBuffer.append(this.f۱۳۴۸۶c);
        infoStringBuffer.append("\nFILE-PATH    : ");
        infoStringBuffer.append(this.f۱۳۴۸۷d);
        infoStringBuffer.append("\nPHONE-MODEL  : ");
        infoStringBuffer.append(this.f۱۳۴۸۸e);
        infoStringBuffer.append("\nANDROID_VERS : ");
        infoStringBuffer.append(this.f۱۳۴۸۹f);
        infoStringBuffer.append("\nBOARD        : ");
        infoStringBuffer.append(this.f۱۳۴۹۰g);
        infoStringBuffer.append("\nBRAND        : ");
        infoStringBuffer.append(this.f۱۳۴۹۱h);
        infoStringBuffer.append("\nDEVICE       : ");
        infoStringBuffer.append(this.f۱۳۴۹۲i);
        infoStringBuffer.append("\nDISPLAY      : ");
        infoStringBuffer.append(this.f۱۳۴۹۳j);
        infoStringBuffer.append("\nFINGER-PRINT : ");
        infoStringBuffer.append(this.f۱۳۴۹۴k);
        infoStringBuffer.append("\nHOST         : ");
        infoStringBuffer.append(this.f۱۳۴۹۵l);
        infoStringBuffer.append("\nID           : ");
        infoStringBuffer.append(this.f۱۳۴۹۶m);
        infoStringBuffer.append("\nMODEL        : ");
        infoStringBuffer.append(this.f۱۳۴۹۸o);
        infoStringBuffer.append("\nPRODUCT      : ");
        infoStringBuffer.append(this.f۱۳۴۹۹p);
        infoStringBuffer.append("\nMANUFACTURER : ");
        infoStringBuffer.append(this.f۱۳۴۹۷n);
        infoStringBuffer.append("\nTAGS         : ");
        infoStringBuffer.append(this.f۱۳۵۰۰q);
        infoStringBuffer.append("\nTIME         : ");
        infoStringBuffer.append(this.f۱۳۵۰۱r);
        infoStringBuffer.append("\nTYPE         : ");
        infoStringBuffer.append(this.f۱۳۵۰۲s);
        infoStringBuffer.append("\nUSER         : ");
        infoStringBuffer.append(this.f۱۳۵۰۳t);
        infoStringBuffer.append("\nTOTAL-INTERNAL-MEMORY     : ");
        infoStringBuffer.append(m۱۶۸۷۳f() + " mb");
        infoStringBuffer.append("\nAVAILABLE-INTERNAL-MEMORY : ");
        infoStringBuffer.append(m۱۶۸۷۱d() + " mb");
        return infoStringBuffer.toString();
    }

    public void uncaughtException(Thread t, Throwable e) {
        m۱۶۸۶۹b("====uncaughtException");
        StringBuilder reportStringBuffer = new StringBuilder();
        reportStringBuffer.append("Error Report collected on : ");
        reportStringBuffer.append(new Date().toString());
        reportStringBuffer.append("\n\nInformations :\n==============");
        reportStringBuffer.append(m۱۶۸۷۰c());
        String customInfo = m۱۶۸۶۷b();
        if (!customInfo.equals("")) {
            reportStringBuffer.append("\n\nCustom Informations :\n==============\n");
            reportStringBuffer.append(customInfo);
        }
        reportStringBuffer.append("\n\nStack :\n==============\n");
        Writer result = new StringWriter();
        PrintWriter printWriter = new PrintWriter(result);
        e.printStackTrace(printWriter);
        reportStringBuffer.append(result.toString());
        reportStringBuffer.append("\nCause :\n==============");
        for (Throwable cause = e.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
            reportStringBuffer.append(result.toString());
        }
        printWriter.close();
        reportStringBuffer.append("\n\n**** End of current Report ***");
        m۱۶۸۶۹b("====uncaughtException \n Report: " + reportStringBuffer.toString());
        m۱۶۸۶۵a(reportStringBuffer.toString());
        Intent intent = new Intent(this.f۱۳۵۰۵v, ErrorReporterActivity.class);
        intent.setFlags(268435456);
        this.f۱۳۵۰۵v.startActivity(intent);
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۸۶۴a(Context _context, String errorContent) {
        m۱۶۸۶۹b("====sendErrorMail");
        Intent sendIntent = new Intent("android.intent.action.SEND");
        String subject = f۱۳۴۸۲w;
        sendIntent.putExtra("android.intent.extra.EMAIL", this.f۱۳۴۸۴a);
        sendIntent.putExtra("android.intent.extra.TEXT", "\n\n" + errorContent + "\n\n");
        sendIntent.putExtra("android.intent.extra.SUBJECT", subject);
        sendIntent.setType("message/rfc822");
        sendIntent.setFlags(268435456);
        _context.startActivity(Intent.createChooser(sendIntent, "Title:"));
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۸۶۵a(String errorContent) {
        m۱۶۸۶۹b("====SaveAsFile");
        try {
            int random = new Random().nextInt(99999);
            FileOutputStream trace = this.f۱۳۵۰۵v.openFileOutput("stack-" + random + ".stacktrace", 0);
            trace.write(errorContent.getBytes());
            trace.close();
        } catch (Exception e) {
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private String[] m۱۶۸۷۲e() {
        File dir = new File(this.f۱۳۴۸۷d + "/");
        dir.mkdir();
        return dir.list(new Ca(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.devs.acr.a$a  reason: invalid class name */
    public class Ca implements FilenameFilter {
        Ca(Ca this$0) {
        }

        public boolean accept(File dir, String name) {
            return name.endsWith(".stacktrace");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۶۸۶۶a() {
        return m۱۶۸۷۲e().length > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۸۷۴a(Context _context) {
        try {
            this.f۱۳۴۸۷d = _context.getFilesDir().getAbsolutePath();
            if (m۱۶۸۶۶a()) {
                StringBuilder wholeErrorTextSB = new StringBuilder();
                String[] errorFileList = m۱۶۸۷۲e();
                int curIndex = 0;
                int length = errorFileList.length;
                int i = 0;
                while (i < length) {
                    String curString = errorFileList[i];
                    int curIndex2 = curIndex + 1;
                    if (curIndex <= 5) {
                        wholeErrorTextSB.append("New Trace collected :\n=====================\n");
                        BufferedReader input = new BufferedReader(new FileReader(this.f۱۳۴۸۷d + "/" + curString));
                        while (true) {
                            String line = input.readLine();
                            if (line == null) {
                                break;
                            }
                            wholeErrorTextSB.append(line + "\n");
                        }
                        input.close();
                    }
                    new File(this.f۱۳۴۸۷d + "/" + curString).delete();
                    i++;
                    curIndex = curIndex2;
                }
                m۱۶۸۶۴a(_context, wholeErrorTextSB.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۸۶۹b(String msg) {
    }
}
