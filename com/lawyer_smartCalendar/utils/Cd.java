package com.lawyer_smartCalendar.utils;

import android.app.backup.BackupManager;
import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* renamed from: com.lawyer_smartCalendar.utils.d  reason: invalid class name */
public class Cd {

    /* renamed from: d  reason: contains not printable characters */
    public static String f۱۴۷۷۸d = "lawyerSmartCalendar";

    /* renamed from: a  reason: contains not printable characters */
    private String f۱۴۷۷۹a = "sahvBackUp.bk";

    /* renamed from: b  reason: contains not printable characters */
    private String f۱۴۷۸۰b = "sahv";

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۴۷۸۱c;

    public Cd(Context context) {
        this.f۱۴۷۸۱c = context;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۷۷۴۵b() {
        try {
            File backupDirectory = new File(Environment.getExternalStorageDirectory() + "/" + f۱۴۷۷۸d);
            File data = Environment.getDataDirectory();
            if (!backupDirectory.canWrite()) {
                return false;
            }
            File backupDB = new File(data, "//data//" + this.f۱۴۷۸۱c.getPackageName() + "//databases//" + this.f۱۴۷۸۰b);
            File currentDB = new File(backupDirectory, this.f۱۴۷۷۹a);
            if (!currentDB.exists()) {
                return false;
            }
            FileChannel src = new FileInputStream(currentDB).getChannel();
            FileChannel dst = new FileOutputStream(backupDB).getChannel();
            dst.transferFrom(src, 0, src.size());
            src.close();
            dst.close();
            return true;
        } catch (Exception e) {
            Ch hVar = new Ch();
            Context context = this.f۱۴۷۸۱c;
            hVar.m۱۷۷۵۳a(context, "error", "خطای : " + e.getMessage() + " رخ داده است. ");
            return false;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۴۴a() {
        try {
            File backupDirectory = new File(Environment.getExternalStorageDirectory() + "/" + f۱۴۷۷۸d);
            if (!backupDirectory.exists()) {
                backupDirectory.mkdirs();
            }
            File data = Environment.getDataDirectory();
            if (backupDirectory.canWrite()) {
                File currentDB = new File(data, "//data//" + this.f۱۴۷۸۱c.getPackageName() + "//databases//" + this.f۱۴۷۸۰b);
                File backupDB = new File(backupDirectory, this.f۱۴۷۷۹a);
                if (currentDB.exists()) {
                    FileChannel src = new FileInputStream(currentDB).getChannel();
                    FileChannel dst = new FileOutputStream(backupDB).getChannel();
                    dst.transferFrom(src, 0, src.size());
                    src.close();
                    dst.close();
                    BackupManager.dataChanged(this.f۱۴۷۸۱c.getPackageName());
                }
            }
        } catch (Exception e) {
            Ch hVar = new Ch();
            Context context = this.f۱۴۷۸۱c;
            hVar.m۱۷۷۵۳a(context, "error", "خطای : " + e.getMessage() + " رخ داده است. ");
        }
    }
}
