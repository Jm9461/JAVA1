package com.lawyer_smartCalendar.utils;

import android.app.backup.BackupManager;
import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class d {

    /* renamed from: d  reason: collision with root package name */
    public static String f۳۲۵۲d = "lawyerSmartCalendar";

    /* renamed from: a  reason: collision with root package name */
    private String f۳۲۵۳a = "sahvBackUp.bk";

    /* renamed from: b  reason: collision with root package name */
    private String f۳۲۵۴b = "sahv";

    /* renamed from: c  reason: collision with root package name */
    private Context f۳۲۵۵c;

    public d(Context context) {
        this.f۳۲۵۵c = context;
    }

    public boolean b() {
        try {
            File backupDirectory = new File(Environment.getExternalStorageDirectory() + "/" + f۳۲۵۲d);
            File data = Environment.getDataDirectory();
            if (!backupDirectory.canWrite()) {
                return false;
            }
            File backupDB = new File(data, "//data//" + this.f۳۲۵۵c.getPackageName() + "//databases//" + this.f۳۲۵۴b);
            File currentDB = new File(backupDirectory, this.f۳۲۵۳a);
            if (!currentDB.exists()) {
                return false;
            }
            FileChannel src = new FileInputStream(currentDB).getChannel();
            FileChannel dst = new FileOutputStream(backupDB).getChannel();
            dst.transferFrom(src, 0, src.size());
            src.close();
            dst.close();
            return true;
        } catch (Exception e2) {
            h hVar = new h();
            Context context = this.f۳۲۵۵c;
            hVar.a(context, "error", "خطای : " + e2.getMessage() + " رخ داده است. ");
            return false;
        }
    }

    public void a() {
        try {
            File backupDirectory = new File(Environment.getExternalStorageDirectory() + "/" + f۳۲۵۲d);
            if (!backupDirectory.exists()) {
                backupDirectory.mkdirs();
            }
            File data = Environment.getDataDirectory();
            if (backupDirectory.canWrite()) {
                File currentDB = new File(data, "//data//" + this.f۳۲۵۵c.getPackageName() + "//databases//" + this.f۳۲۵۴b);
                File backupDB = new File(backupDirectory, this.f۳۲۵۳a);
                if (currentDB.exists()) {
                    FileChannel src = new FileInputStream(currentDB).getChannel();
                    FileChannel dst = new FileOutputStream(backupDB).getChannel();
                    dst.transferFrom(src, 0, src.size());
                    src.close();
                    dst.close();
                    BackupManager.dataChanged(this.f۳۲۵۵c.getPackageName());
                }
            }
        } catch (Exception e2) {
            h hVar = new h();
            Context context = this.f۳۲۵۵c;
            hVar.a(context, "error", "خطای : " + e2.getMessage() + " رخ داده است. ");
        }
    }
}
