package com.lawyer_smartCalendar.utils;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.lawyer_smartCalendar.model.AccountNumber;
import com.lawyer_smartCalendar.model.Case;
import com.lawyer_smartCalendar.model.Client;
import com.lawyer_smartCalendar.model.ClientDocument;
import com.lawyer_smartCalendar.model.File;
import com.lawyer_smartCalendar.model.Note;
import com.lawyer_smartCalendar.model.Payment;
import com.lawyer_smartCalendar.model.PaymentDetail;
import com.lawyer_smartCalendar.model.Schedule;
import com.lawyer_smartCalendar.model.Tax;
import com.lawyer_smartCalendar.p۱۳۳d.Cb;
import com.lawyer_smartCalendar.p۱۳۳d.Cc;
import com.lawyer_smartCalendar.p۱۳۳d.Cd;
import com.lawyer_smartCalendar.p۱۳۳d.Ce;
import com.lawyer_smartCalendar.p۱۳۳d.Cf;
import com.lawyer_smartCalendar.p۱۳۳d.Cg;
import com.lawyer_smartCalendar.p۱۳۳d.Ch;
import com.lawyer_smartCalendar.p۱۳۳d.Cj;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca;

/* renamed from: com.lawyer_smartCalendar.utils.i  reason: invalid class name */
public class Ci extends SQLiteOpenHelper {

    /* renamed from: d  reason: contains not printable characters */
    public static String f۱۴۷۹۰d = "sahv";

    /* renamed from: a  reason: contains not printable characters */
    private final Context f۱۴۷۹۱a;

    /* renamed from: b  reason: contains not printable characters */
    public String f۱۴۷۹۲b = "data/data/[package]/databases/";

    /* renamed from: c  reason: contains not printable characters */
    public SQLiteDatabase f۱۴۷۹۳c;

    public Ci(Context context) {
        super(context, f۱۴۷۹۰d, (SQLiteDatabase.CursorFactory) null, 1);
        this.f۱۴۷۹۱a = context;
        this.f۱۴۷۹۲b = this.f۱۴۷۹۲b.replace("[package]", this.f۱۴۷۹۱a.getPackageName());
    }

    public void onCreate(SQLiteDatabase db) {
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۷۷۷۹a() {
        if (Ca.m۱۶۴۱۵a("installed", false)) {
            return true;
        }
        SQLiteDatabase db = null;
        try {
            db = SQLiteDatabase.openDatabase(this.f۱۴۷۹۲b + f۱۴۷۹۰d, null, 1);
        } catch (SQLException e) {
        }
        if (db != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۷۸۳b() {
        OutputStream op = new FileOutputStream(this.f۱۴۷۹۲b + f۱۴۷۹۰d);
        byte[] buffer = new byte[1024];
        InputStream ip = this.f۱۴۷۹۱a.getAssets().open(f۱۴۷۹۰d);
        while (true) {
            int lentgth = ip.read(buffer);
            if (lentgth > 0) {
                op.write(buffer, 0, lentgth);
            } else {
                ip.close();
                op.flush();
                op.close();
                Ca.m۱۶۴۱۹b("installed", true);
                return;
            }
        }
    }

    /* renamed from: n  reason: contains not printable characters */
    public void m۱۷۸۱۱n() {
        this.f۱۴۷۹۳c = SQLiteDatabase.openDatabase(this.f۱۴۷۹۲b + f۱۴۷۹۰d, null, 0);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f۱۴۷۹۳c.close();
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۷۷۸۷c() {
        if (!Boolean.valueOf(m۱۷۷۷۹a()).booleanValue()) {
            getReadableDatabase();
            try {
                m۱۷۷۸۳b();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۶۵a(com.lawyer_smartCalendar.p۱۳۳d.Ca accountNumber) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("city_id", Integer.valueOf(accountNumber.m۱۷۵۹۸b()));
        contentValues.put("accountNumber_id", Integer.valueOf(accountNumber.m۱۷۵۹۵a()));
        contentValues.put("number", accountNumber.m۱۷۶۰۲d());
        this.f۱۴۷۹۳c.insert("tbl_cityBankAccountValue", null, contentValues);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۶۹a(Cc client) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", client.m۱۷۶۴۴f());
        contentValues.put("fatherName", client.m۱۷۶۳۸c());
        contentValues.put("nationalCode", client.m۱۷۶۴۶g());
        contentValues.put("phoneNumber", client.m۱۷۶۴۸h());
        contentValues.put("landlinePhone", client.m۱۷۶۴۲e());
        contentValues.put("emailAddress", client.m۱۷۶۳۶b());
        contentValues.put("address", client.m۱۷۶۳۳a());
        contentValues.put("type", client.m۱۷۶۵۰i());
        this.f۱۴۷۹۳c.insert("tbl_client", null, contentValues);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۶۷a(Cb case1) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(case1.m۱۷۶۱۸g()));
        contentValues.put("title", case1.m۱۷۶۳۲o());
        contentValues.put("date", case1.m۱۷۶۲۴j());
        contentValues.put("clientTitleType", case1.m۱۷۶۱۶f());
        contentValues.put("subject", case1.m۱۷۶۳۱n());
        contentValues.put("courtType", case1.m۱۷۶۲۲i());
        contentValues.put("courtCityId", Integer.valueOf(case1.m۱۷۶۲۰h()));
        contentValues.put("branchName", case1.m۱۷۶۰۹c());
        contentValues.put("caseNumber", case1.m۱۷۶۱۲d());
        contentValues.put("archiveNumber", case1.m۱۷۶۰۳a());
        contentValues.put("attorneyLetterNumber", case1.m۱۷۶۰۶b());
        contentValues.put("lawsuitInfo", case1.m۱۷۶۲۸l());
        contentValues.put("status", case1.m۱۷۶۳۰m());
        contentValues.put("caseStatus", case1.m۱۷۶۱۴e());
        this.f۱۴۷۹۳c.insert("tbl_case", null, contentValues);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۷۴a(Cj tax) {
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select id from tbl_tax where year=" + tax.m۱۷۷۳۷f(), null);
        if (cu.getCount() > 0) {
            cu.moveToFirst();
            m۱۷۷۷۵a(tax, cu.getString(0));
            cu.close();
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("year", Integer.valueOf(tax.m۱۷۷۳۷f()));
        contentValues.put("total", Long.valueOf(tax.m۱۷۷۳۶e()));
        contentValues.put("incomeTax", Long.valueOf(tax.m۱۷۷۳۳c()));
        contentValues.put("income", Long.valueOf(tax.m۱۷۷۳۰b()));
        contentValues.put("note", tax.m۱۷۷۳۵d());
        this.f۱۴۷۹۳c.insert("tbl_tax", null, contentValues);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۷۵a(Cj tax, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("year", Integer.valueOf(tax.m۱۷۷۳۷f()));
        contentValues.put("total", Long.valueOf(tax.m۱۷۷۳۶e()));
        contentValues.put("incomeTax", Long.valueOf(tax.m۱۷۷۳۳c()));
        contentValues.put("income", Long.valueOf(tax.m۱۷۷۳۰b()));
        contentValues.put("note", tax.m۱۷۷۳۵d());
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.update("tbl_tax", contentValues, "id =" + id, null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۷۵۷a(Cd document) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(document.m۱۷۶۵۴b()));
        contentValues.put("case_id", Integer.valueOf(document.m۱۷۶۵۱a()));
        contentValues.put("documentType", document.m۱۷۶۶۰d());
        contentValues.put("receivedDate", document.m۱۷۶۶۴g());
        contentValues.put("deliveredDate", document.m۱۷۶۵۷c());
        contentValues.put("note", document.m۱۷۶۶۳f());
        return this.f۱۴۷۹۳c.insert("tbl_clientDocuments", null, contentValues);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۷۷a(List<Ce> list) {
        for (int i = 0; i < list.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("fk_id", Integer.valueOf(list.get(i).m۱۷۶۷۱c()));
            contentValues.put("title", list.get(i).m۱۷۶۷۳d());
            contentValues.put("file_type", list.get(i).m۱۷۶۶۸b());
            contentValues.put("file_address", list.get(i).m۱۷۶۶۵a());
            this.f۱۴۷۹۳c.insert("tbl_file", null, contentValues);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۷۸a(List<Ch> list, String pay_id) {
        for (int i = 0; i < list.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("payment_id", pay_id);
            contentValues.put("date", list.get(i).m۱۷۷۰۶b());
            contentValues.put("amount", list.get(i).m۱۷۷۰۲a());
            contentValues.put("detail", list.get(i).m۱۷۷۰۸c());
            this.f۱۴۷۹۳c.insert("tbl_paymentDetail", null, contentValues);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۷۸۶b(List<Ch> list, String pay_id) {
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.delete("tbl_paymentDetail", "payment_id =" + pay_id, null);
        for (int i = 0; i < list.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("payment_id", pay_id);
            contentValues.put("date", list.get(i).m۱۷۷۰۶b());
            contentValues.put("amount", list.get(i).m۱۷۷۰۲a());
            contentValues.put("detail", list.get(i).m۱۷۷۰۸c());
            this.f۱۴۷۹۳c.insert("tbl_paymentDetail", null, contentValues);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۷۶۰a(Cg payment) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("case_id", Integer.valueOf(payment.m۱۷۶۹۱b()));
        contentValues.put("date", payment.m۱۷۶۹۴c());
        contentValues.put("payType", payment.m۱۷۷۰۱g());
        contentValues.put("payFor", payment.m۱۷۷۰۰f());
        contentValues.put("amount", payment.m۱۷۶۸۸a());
        contentValues.put("detail", payment.m۱۷۶۹۶d());
        return this.f۱۴۷۹۳c.insert("tbl_payment", null, contentValues);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۷۲a(Cg payment, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("case_id", Integer.valueOf(payment.m۱۷۶۹۱b()));
        contentValues.put("date", payment.m۱۷۶۹۴c());
        contentValues.put("payType", payment.m۱۷۷۰۱g());
        contentValues.put("payFor", payment.m۱۷۷۰۰f());
        contentValues.put("amount", payment.m۱۷۶۸۸a());
        contentValues.put("detail", payment.m۱۷۶۹۶d());
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.update("tbl_payment", contentValues, "id =" + id, null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۷۶۱a(com.lawyer_smartCalendar.p۱۳۳d.Ci schedule) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(schedule.m۱۷۷۱۶c()));
        contentValues.put("case_id", Integer.valueOf(schedule.m۱۷۷۱۳b()));
        contentValues.put("scheduleType", schedule.m۱۷۷۲۴g());
        contentValues.put("subject", schedule.m۱۷۷۲۵h());
        contentValues.put("date", schedule.m۱۷۷۱۹d());
        contentValues.put("result", schedule.m۱۷۷۲۳f());
        contentValues.put("alarmDate", schedule.m۱۷۷۱۰a());
        return this.f۱۴۷۹۳c.insert("tbl_schedule", null, contentValues);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۷۳a(com.lawyer_smartCalendar.p۱۳۳d.Ci schedule, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(schedule.m۱۷۷۱۶c()));
        contentValues.put("case_id", Integer.valueOf(schedule.m۱۷۷۱۳b()));
        contentValues.put("scheduleType", schedule.m۱۷۷۲۴g());
        contentValues.put("subject", schedule.m۱۷۷۲۵h());
        contentValues.put("date", schedule.m۱۷۷۱۹d());
        contentValues.put("result", schedule.m۱۷۷۲۳f());
        contentValues.put("alarmDate", schedule.m۱۷۷۱۰a());
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.update("tbl_schedule", contentValues, "id =" + id, null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۷۵۸a(Cd document, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(document.m۱۷۶۵۴b()));
        contentValues.put("case_id", Integer.valueOf(document.m۱۷۶۵۱a()));
        contentValues.put("documentType", document.m۱۷۶۶۰d());
        contentValues.put("receivedDate", document.m۱۷۶۶۴g());
        contentValues.put("deliveredDate", document.m۱۷۶۵۷c());
        contentValues.put("note", document.m۱۷۶۶۳f());
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        return (long) sQLiteDatabase.update("tbl_clientDocuments", contentValues, "id =" + id, null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۷۰a(Cc client, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", client.m۱۷۶۴۴f());
        contentValues.put("fatherName", client.m۱۷۶۳۸c());
        contentValues.put("nationalCode", client.m۱۷۶۴۶g());
        contentValues.put("phoneNumber", client.m۱۷۶۴۸h());
        contentValues.put("landlinePhone", client.m۱۷۶۴۲e());
        contentValues.put("emailAddress", client.m۱۷۶۳۶b());
        contentValues.put("address", client.m۱۷۶۳۳a());
        contentValues.put("type", client.m۱۷۶۵۰i());
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.update("tbl_client", contentValues, "id =" + id, null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۶۸a(Cb case1, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(case1.m۱۷۶۱۸g()));
        contentValues.put("title", case1.m۱۷۶۳۲o());
        contentValues.put("date", case1.m۱۷۶۲۴j());
        contentValues.put("clientTitleType", case1.m۱۷۶۱۶f());
        contentValues.put("subject", case1.m۱۷۶۳۱n());
        contentValues.put("courtType", case1.m۱۷۶۲۲i());
        contentValues.put("courtCityId", Integer.valueOf(case1.m۱۷۶۲۰h()));
        contentValues.put("branchName", case1.m۱۷۶۰۹c());
        contentValues.put("caseNumber", case1.m۱۷۶۱۲d());
        contentValues.put("archiveNumber", case1.m۱۷۶۰۳a());
        contentValues.put("attorneyLetterNumber", case1.m۱۷۶۰۶b());
        contentValues.put("lawsuitInfo", case1.m۱۷۶۲۸l());
        contentValues.put("status", case1.m۱۷۶۳۰m());
        contentValues.put("caseStatus", case1.m۱۷۶۱۴e());
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.update("tbl_case", contentValues, "id =" + id, null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۶۶a(com.lawyer_smartCalendar.p۱۳۳d.Ca accountNumber, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("city_id", Integer.valueOf(accountNumber.m۱۷۵۹۸b()));
        contentValues.put("accountNumber_id", Integer.valueOf(accountNumber.m۱۷۵۹۵a()));
        contentValues.put("number", accountNumber.m۱۷۶۰۲d());
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.update("tbl_cityBankAccountValue", contentValues, "id =" + id, null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۷۱a(Cf note, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(note.m۱۷۶۷۷b()));
        contentValues.put("case_id", Integer.valueOf(note.m۱۷۶۷۴a()));
        contentValues.put("title", note.m۱۷۶۸۷g());
        contentValues.put("note_type", note.m۱۷۶۸۶f());
        contentValues.put("date", note.m۱۷۶۸۰c());
        contentValues.put("detail", note.m۱۷۶۸۳d());
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.update("tbl_note", contentValues, "id =" + id, null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۷۵۹a(Cf note) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(note.m۱۷۶۷۷b()));
        contentValues.put("case_id", Integer.valueOf(note.m۱۷۶۷۴a()));
        contentValues.put("title", note.m۱۷۶۸۷g());
        contentValues.put("note_type", note.m۱۷۶۸۶f());
        contentValues.put("date", note.m۱۷۶۸۰c());
        contentValues.put("detail", note.m۱۷۶۸۳d());
        return this.f۱۴۷۹۳c.insert("tbl_note", null, contentValues);
    }

    /* renamed from: g  reason: contains not printable characters */
    public String[][] m۱۷۷۹۷g() {
        String[][] data = null;
        Cursor cu = this.f۱۴۷۹۳c.rawQuery("select id,city from tbl_city order by city asc", null);
        if (cu != null) {
            int i = 0;
            data = (String[][]) Array.newInstance(String.class, cu.getCount(), 2);
            while (cu.moveToNext()) {
                data[i][0] = cu.getString(0);
                data[i][1] = cu.getString(1);
                i++;
            }
        }
        return data;
    }

    /* renamed from: l  reason: contains not printable characters */
    public String m۱۷۸۰۶l(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select city from tbl_city where id=" + id, null);
        if (cu == null || !cu.moveToFirst()) {
            return "";
        }
        return cu.getString(0);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۷۷۸۰a(String case_id) {
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_payment where case_id=" + case_id, null);
        if (cu == null || cu.getCount() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i  reason: contains not printable characters */
    public String m۱۷۸۰۰i(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select title from tbl_accountNumber where id=" + id, null);
        if (cu == null || !cu.moveToFirst()) {
            return "";
        }
        return cu.getString(0);
    }

    /* renamed from: k  reason: contains not printable characters */
    public Cb m۱۷۸۰۴k(String id) {
        Cb case1 = new Cb();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_case where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            case1.m۱۷۶۱۰c(cu.getInt(0));
            case1.m۱۷۶۰۴a(cu.getInt(1));
            case1.m۱۷۶۲۹l(cu.getString(2));
            case1.m۱۷۶۲۱h(cu.getString(3));
            case1.m۱۷۶۱۷f(cu.getString(4));
            case1.m۱۷۶۲۷k(cu.getString(5));
            case1.m۱۷۶۱۹g(cu.getString(6));
            case1.m۱۷۶۰۷b(cu.getInt(7));
            case1.m۱۷۶۱۱c(cu.getString(8));
            case1.m۱۷۶۱۳d(cu.getString(9));
            case1.m۱۷۶۰۵a(cu.getString(10));
            case1.m۱۷۶۰۸b(cu.getString(11));
            case1.m۱۷۶۲۳i(cu.getString(12));
            case1.m۱۷۶۲۵j(cu.getString(13));
            case1.m۱۷۶۱۵e(cu.getString(14));
        }
        return case1;
    }

    /* renamed from: j  reason: contains not printable characters */
    public String[][] m۱۷۸۰۳j() {
        String[][] data = null;
        Cursor cu = this.f۱۴۷۹۳c.rawQuery("select *from tbl_link order by title asc", null);
        if (cu != null) {
            int i = 0;
            data = (String[][]) Array.newInstance(String.class, cu.getCount(), 3);
            while (cu.moveToNext()) {
                data[i][0] = cu.getString(0);
                data[i][1] = cu.getString(1);
                data[i][2] = cu.getString(2);
                i++;
            }
        }
        return data;
    }

    /* renamed from: f  reason: contains not printable characters */
    public List<Cb> m۱۷۷۹۴f() {
        List<Case> caseList = new ArrayList<>();
        Cursor cu = this.f۱۴۷۹۳c.rawQuery("select *from tbl_case order by date desc", null);
        if (cu != null) {
            while (cu.moveToNext()) {
                Cb case1 = new Cb();
                case1.m۱۷۶۱۰c(cu.getInt(0));
                case1.m۱۷۶۰۴a(cu.getInt(1));
                case1.m۱۷۶۲۹l(cu.getString(2));
                case1.m۱۷۶۲۱h(cu.getString(3));
                case1.m۱۷۶۱۷f(cu.getString(4));
                case1.m۱۷۶۲۷k(cu.getString(5));
                case1.m۱۷۶۱۹g(cu.getString(6));
                case1.m۱۷۶۰۷b(cu.getInt(7));
                case1.m۱۷۶۱۱c(cu.getString(8));
                case1.m۱۷۶۱۳d(cu.getString(9));
                case1.m۱۷۶۰۵a(cu.getString(10));
                case1.m۱۷۶۰۸b(cu.getString(11));
                case1.m۱۷۶۲۳i(cu.getString(12));
                case1.m۱۷۶۲۵j(cu.getString(13));
                case1.m۱۷۶۱۵e(cu.getString(14));
                caseList.add(case1);
            }
        }
        return caseList;
    }

    /* renamed from: j  reason: contains not printable characters */
    public List<Cb> m۱۷۸۰۲j(String query) {
        List<Case> caseList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_case where lawsuitInfo like'%" + query + "%' or subject like'%" + query + "%' order by date desc", null);
        if (cu != null) {
            while (cu.moveToNext()) {
                Cb case1 = new Cb();
                case1.m۱۷۶۱۰c(cu.getInt(0));
                case1.m۱۷۶۰۴a(cu.getInt(1));
                case1.m۱۷۶۲۹l(cu.getString(2));
                case1.m۱۷۶۲۱h(cu.getString(3));
                case1.m۱۷۶۱۷f(cu.getString(4));
                case1.m۱۷۶۲۷k(cu.getString(5));
                case1.m۱۷۶۱۹g(cu.getString(6));
                case1.m۱۷۶۰۷b(cu.getInt(7));
                case1.m۱۷۶۱۱c(cu.getString(8));
                case1.m۱۷۶۱۳d(cu.getString(9));
                case1.m۱۷۶۰۵a(cu.getString(10));
                case1.m۱۷۶۰۸b(cu.getString(11));
                case1.m۱۷۶۲۳i(cu.getString(12));
                case1.m۱۷۶۲۵j(cu.getString(13));
                case1.m۱۷۶۱۵e(cu.getString(14));
                caseList.add(case1);
            }
        }
        return caseList;
    }

    /* renamed from: a  reason: contains not printable characters */
    public List<Cb> m۱۷۷۶۲a(int client_id) {
        List<Case> caseList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_case where client_id=" + client_id + " order by date desc", null);
        if (cu != null) {
            while (cu.moveToNext()) {
                Cb case1 = new Cb();
                case1.m۱۷۶۱۰c(cu.getInt(0));
                case1.m۱۷۶۰۴a(cu.getInt(1));
                case1.m۱۷۶۲۹l(cu.getString(2));
                case1.m۱۷۶۲۱h(cu.getString(3));
                case1.m۱۷۶۱۷f(cu.getString(4));
                case1.m۱۷۶۲۷k(cu.getString(5));
                case1.m۱۷۶۱۹g(cu.getString(6));
                case1.m۱۷۶۰۷b(cu.getInt(7));
                case1.m۱۷۶۱۱c(cu.getString(8));
                case1.m۱۷۶۱۳d(cu.getString(9));
                case1.m۱۷۶۰۵a(cu.getString(10));
                case1.m۱۷۶۰۸b(cu.getString(11));
                case1.m۱۷۶۲۳i(cu.getString(12));
                case1.m۱۷۶۲۵j(cu.getString(13));
                case1.m۱۷۶۱۵e(cu.getString(14));
                caseList.add(case1);
            }
        }
        return caseList;
    }

    /* renamed from: b  reason: contains not printable characters */
    public String m۱۷۷۸۱b(int id) {
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select name from tbl_client where id=" + id + " limit 1", null);
        if (cu == null || !cu.moveToFirst()) {
            return "";
        }
        return cu.getString(0);
    }

    /* renamed from: B  reason: contains not printable characters */
    public com.lawyer_smartCalendar.p۱۳۳d.Ci m۱۷۷۵۵B(String id) {
        com.lawyer_smartCalendar.p۱۳۳d.Ci schedule = new com.lawyer_smartCalendar.p۱۳۳d.Ci();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_schedule where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            schedule.m۱۷۷۱۷c(cu.getInt(0));
            schedule.m۱۷۷۱۴b(cu.getInt(1));
            schedule.m۱۷۷۱۱a(cu.getInt(2));
            schedule.m۱۷۷۲۰d(cu.getString(3));
            schedule.m۱۷۷۲۲e(cu.getString(4));
            schedule.m۱۷۷۱۵b(cu.getString(5));
            schedule.m۱۷۷۱۸c(cu.getString(6));
            schedule.m۱۷۷۱۲a(cu.getString(7));
        }
        return schedule;
    }

    /* renamed from: p  reason: contains not printable characters */
    public Cd m۱۷۸۱۳p(String id) {
        Cd clientDocument = new Cd();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_clientDocuments where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            clientDocument.m۱۷۶۵۸c(cu.getInt(0));
            clientDocument.m۱۷۶۵۵b(cu.getInt(1));
            clientDocument.m۱۷۶۵۲a(cu.getInt(2));
            clientDocument.m۱۷۶۵۶b(cu.getString(3));
            clientDocument.m۱۷۶۶۱d(cu.getString(4));
            clientDocument.m۱۷۶۵۳a(cu.getString(5));
            clientDocument.m۱۷۶۵۹c(cu.getString(6));
        }
        return clientDocument;
    }

    /* renamed from: w  reason: contains not printable characters */
    public Cg m۱۷۸۲۰w(String id) {
        Cg payment = new Cg();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_payment where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            payment.m۱۷۶۹۲b(cu.getInt(0));
            payment.m۱۷۶۸۹a(cu.getInt(1));
            payment.m۱۷۶۹۳b(cu.getString(2));
            payment.m۱۷۶۹۹e(cu.getString(3));
            payment.m۱۷۶۹۷d(cu.getString(4));
            payment.m۱۷۶۹۰a(cu.getString(5));
            payment.m۱۷۶۹۵c(cu.getString(6));
        }
        return payment;
    }

    /* renamed from: v  reason: contains not printable characters */
    public Cg m۱۷۸۱۹v(String case_id) {
        Cg payment = new Cg();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_payment where case_id=" + case_id, null);
        if (cu != null && cu.moveToFirst()) {
            payment.m۱۷۶۹۲b(cu.getInt(0));
            payment.m۱۷۶۸۹a(cu.getInt(1));
            payment.m۱۷۶۹۳b(cu.getString(2));
            payment.m۱۷۶۹۹e(cu.getString(3));
            payment.m۱۷۶۹۷d(cu.getString(4));
            payment.m۱۷۶۹۰a(cu.getString(5));
            payment.m۱۷۶۹۵c(cu.getString(6));
        }
        return payment;
    }

    /* renamed from: u  reason: contains not printable characters */
    public Cf m۱۷۸۱۸u(String id) {
        Cf note = new Cf();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_note where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            note.m۱۷۶۸۱c(cu.getInt(0));
            note.m۱۷۶۷۸b(cu.getInt(1));
            note.m۱۷۶۷۵a(cu.getInt(2));
            note.m۱۷۶۸۴d(cu.getString(3));
            note.m۱۷۶۸۲c(cu.getString(4));
            note.m۱۷۶۷۶a(cu.getString(5));
            note.m۱۷۶۷۹b(cu.getString(6));
        }
        return note;
    }

    /* renamed from: a  reason: contains not printable characters */
    public List<com.lawyer_smartCalendar.p۱۳۳d.Ci> m۱۷۷۶۳a(long firstDayDate, long lastDayDate) {
        List<Schedule> scheduleList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_schedule where  CAST(date as long)>=" + firstDayDate + " and CAST(date as long)<=" + lastDayDate + " order by date asc", null);
        if (cu == null) {
            return scheduleList;
        }
        while (cu.moveToNext()) {
            com.lawyer_smartCalendar.p۱۳۳d.Ci schedule = new com.lawyer_smartCalendar.p۱۳۳d.Ci();
            schedule.m۱۷۷۱۷c(cu.getInt(0));
            schedule.m۱۷۷۱۴b(cu.getInt(1));
            schedule.m۱۷۷۱۱a(cu.getInt(2));
            schedule.m۱۷۷۲۰d(cu.getString(3));
            schedule.m۱۷۷۲۲e(cu.getString(4));
            schedule.m۱۷۷۱۵b(cu.getString(5));
            schedule.m۱۷۷۱۸c(cu.getString(6));
            schedule.m۱۷۷۱۲a(cu.getString(7));
            scheduleList.add(schedule);
        }
        cu.close();
        return scheduleList;
    }

    /* renamed from: l  reason: contains not printable characters */
    public List<com.lawyer_smartCalendar.p۱۳۳d.Ci> m۱۷۸۰۷l() {
        List<Schedule> scheduleList = new ArrayList<>();
        Cursor cu = this.f۱۴۷۹۳c.rawQuery("select *from tbl_schedule order by date asc", null);
        if (cu == null) {
            return scheduleList;
        }
        while (cu.moveToNext()) {
            com.lawyer_smartCalendar.p۱۳۳d.Ci schedule = new com.lawyer_smartCalendar.p۱۳۳d.Ci();
            schedule.m۱۷۷۱۷c(cu.getInt(0));
            schedule.m۱۷۷۱۴b(cu.getInt(1));
            schedule.m۱۷۷۱۱a(cu.getInt(2));
            schedule.m۱۷۷۲۰d(cu.getString(3));
            schedule.m۱۷۷۲۲e(cu.getString(4));
            schedule.m۱۷۷۱۵b(cu.getString(5));
            schedule.m۱۷۷۱۸c(cu.getString(6));
            schedule.m۱۷۷۱۲a(cu.getString(7));
            scheduleList.add(schedule);
        }
        cu.close();
        return scheduleList;
    }

    /* renamed from: A  reason: contains not printable characters */
    public List<com.lawyer_smartCalendar.p۱۳۳d.Ci> m۱۷۷۵۴A(String query) {
        List<Schedule> scheduleList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_schedule where subject like'%" + query + "%' order by date asc ", null);
        if (cu == null) {
            return scheduleList;
        }
        while (cu.moveToNext()) {
            com.lawyer_smartCalendar.p۱۳۳d.Ci schedule = new com.lawyer_smartCalendar.p۱۳۳d.Ci();
            schedule.m۱۷۷۱۷c(cu.getInt(0));
            schedule.m۱۷۷۱۴b(cu.getInt(1));
            schedule.m۱۷۷۱۱a(cu.getInt(2));
            schedule.m۱۷۷۲۰d(cu.getString(3));
            schedule.m۱۷۷۲۲e(cu.getString(4));
            schedule.m۱۷۷۱۵b(cu.getString(5));
            schedule.m۱۷۷۱۸c(cu.getString(6));
            schedule.m۱۷۷۱۲a(cu.getString(7));
            scheduleList.add(schedule);
        }
        cu.close();
        return scheduleList;
    }

    /* renamed from: z  reason: contains not printable characters */
    public List<com.lawyer_smartCalendar.p۱۳۳d.Ci> m۱۷۸۲۳z(String client_id) {
        List<Schedule> scheduleList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_schedule where client_id=" + client_id + " order by date asc", null);
        if (cu == null) {
            return scheduleList;
        }
        while (cu.moveToNext()) {
            com.lawyer_smartCalendar.p۱۳۳d.Ci schedule = new com.lawyer_smartCalendar.p۱۳۳d.Ci();
            schedule.m۱۷۷۱۷c(cu.getInt(0));
            schedule.m۱۷۷۱۴b(cu.getInt(1));
            schedule.m۱۷۷۱۱a(cu.getInt(2));
            schedule.m۱۷۷۲۰d(cu.getString(3));
            schedule.m۱۷۷۲۲e(cu.getString(4));
            schedule.m۱۷۷۱۵b(cu.getString(5));
            schedule.m۱۷۷۱۸c(cu.getString(6));
            schedule.m۱۷۷۱۲a(cu.getString(7));
            scheduleList.add(schedule);
        }
        cu.close();
        return scheduleList;
    }

    /* renamed from: y  reason: contains not printable characters */
    public List<com.lawyer_smartCalendar.p۱۳۳d.Ci> m۱۷۸۲۲y(String case_id) {
        List<Schedule> scheduleList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_schedule where case_id=" + case_id + " order by date asc", null);
        if (cu == null) {
            return scheduleList;
        }
        while (cu.moveToNext()) {
            com.lawyer_smartCalendar.p۱۳۳d.Ci schedule = new com.lawyer_smartCalendar.p۱۳۳d.Ci();
            schedule.m۱۷۷۱۷c(cu.getInt(0));
            schedule.m۱۷۷۱۴b(cu.getInt(1));
            schedule.m۱۷۷۱۱a(cu.getInt(2));
            schedule.m۱۷۷۲۰d(cu.getString(3));
            schedule.m۱۷۷۲۲e(cu.getString(4));
            schedule.m۱۷۷۱۵b(cu.getString(5));
            schedule.m۱۷۷۱۸c(cu.getString(6));
            schedule.m۱۷۷۱۲a(cu.getString(7));
            scheduleList.add(schedule);
        }
        cu.close();
        return scheduleList;
    }

    /* renamed from: b  reason: contains not printable characters */
    public List<Ce> m۱۷۷۸۲b(String fk_id, String fileType) {
        List<File> fileList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_file where fk_id=" + fk_id + " and file_type='" + fileType + "'", null);
        if (cu == null) {
            return fileList;
        }
        while (cu.moveToNext()) {
            Ce file = new Ce();
            file.m۱۷۶۶۹b(cu.getInt(0));
            file.m۱۷۶۶۶a(cu.getInt(1));
            file.m۱۷۶۷۲c(cu.getString(2));
            file.m۱۷۶۷۰b(cu.getString(3));
            file.m۱۷۶۶۷a(cu.getString(4));
            fileList.add(file);
        }
        cu.close();
        return fileList;
    }

    /* renamed from: r  reason: contains not printable characters */
    public List<Cf> m۱۷۸۱۵r(String client_id) {
        List<Note> noteList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_note where client_id=" + client_id + " order by date asc", null);
        if (cu == null) {
            return noteList;
        }
        while (cu.moveToNext()) {
            Cf note = new Cf();
            note.m۱۷۶۸۱c(cu.getInt(0));
            note.m۱۷۶۷۸b(cu.getInt(1));
            note.m۱۷۶۷۵a(cu.getInt(2));
            note.m۱۷۶۸۴d(cu.getString(3));
            note.m۱۷۶۸۲c(cu.getString(4));
            note.m۱۷۶۷۶a(cu.getString(5));
            note.m۱۷۶۷۹b(cu.getString(6));
            noteList.add(note);
        }
        cu.close();
        return noteList;
    }

    /* renamed from: s  reason: contains not printable characters */
    public List<Cf> m۱۷۸۱۶s(String type) {
        List<Note> noteList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_note where note_type='" + type + "' order by date asc", null);
        if (cu == null) {
            return noteList;
        }
        while (cu.moveToNext()) {
            Cf note = new Cf();
            note.m۱۷۶۸۱c(cu.getInt(0));
            note.m۱۷۶۷۸b(cu.getInt(1));
            note.m۱۷۶۷۵a(cu.getInt(2));
            note.m۱۷۶۸۴d(cu.getString(3));
            note.m۱۷۶۸۲c(cu.getString(4));
            note.m۱۷۶۷۶a(cu.getString(5));
            note.m۱۷۶۷۹b(cu.getString(6));
            noteList.add(note);
        }
        cu.close();
        return noteList;
    }

    /* renamed from: t  reason: contains not printable characters */
    public List<Cf> m۱۷۸۱۷t(String query) {
        List<Note> noteList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_note where title like'%" + query + "%' or detail like'%" + query + "%' order by date asc", null);
        if (cu == null) {
            return noteList;
        }
        while (cu.moveToNext()) {
            Cf note = new Cf();
            note.m۱۷۶۸۱c(cu.getInt(0));
            note.m۱۷۶۷۸b(cu.getInt(1));
            note.m۱۷۶۷۵a(cu.getInt(2));
            note.m۱۷۶۸۴d(cu.getString(3));
            note.m۱۷۶۸۲c(cu.getString(4));
            note.m۱۷۶۷۶a(cu.getString(5));
            note.m۱۷۶۷۹b(cu.getString(6));
            noteList.add(note);
        }
        cu.close();
        return noteList;
    }

    /* renamed from: k  reason: contains not printable characters */
    public List<Cg> m۱۷۸۰۵k() {
        List<Payment> paymentList = new ArrayList<>();
        Cursor cu = this.f۱۴۷۹۳c.rawQuery("select *from tbl_payment order by date asc", null);
        if (cu == null) {
            return paymentList;
        }
        while (cu.moveToNext()) {
            Cg payment = new Cg();
            payment.m۱۷۶۹۲b(cu.getInt(0));
            payment.m۱۷۶۸۹a(cu.getInt(1));
            payment.m۱۷۶۹۳b(cu.getString(2));
            payment.m۱۷۶۹۹e(cu.getString(3));
            payment.m۱۷۶۹۷d(cu.getString(4));
            payment.m۱۷۶۹۰a(cu.getString(5));
            payment.m۱۷۶۹۵c(cu.getString(6));
            paymentList.add(payment);
        }
        cu.close();
        return paymentList;
    }

    /* renamed from: x  reason: contains not printable characters */
    public List<Ch> m۱۷۸۲۱x(String payment_id) {
        List<PaymentDetail> paymentDetailList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_paymentDetail where payment_id=" + payment_id + " order by date asc", null);
        if (cu == null) {
            return paymentDetailList;
        }
        while (cu.moveToNext()) {
            Ch paymentDetail = new Ch();
            paymentDetail.m۱۷۷۰۳a(cu.getInt(0));
            paymentDetail.m۱۷۷۰۴a((long) cu.getInt(1));
            paymentDetail.m۱۷۷۰۷b(cu.getString(2));
            paymentDetail.m۱۷۷۰۵a(cu.getString(3));
            paymentDetail.m۱۷۷۰۹c(cu.getString(4));
            paymentDetailList.add(paymentDetail);
        }
        cu.close();
        return paymentDetailList;
    }

    /* renamed from: m  reason: contains not printable characters */
    public List<Cj> m۱۷۸۰۸m() {
        List<Tax> taxList = new ArrayList<>();
        Cursor cu = this.f۱۴۷۹۳c.rawQuery("select *from tbl_tax order by year asc", null);
        if (cu == null) {
            return taxList;
        }
        while (cu.moveToNext()) {
            Cj tax = new Cj();
            tax.m۱۷۷۲۷a(cu.getInt(0));
            tax.m۱۷۷۳۱b(cu.getInt(1));
            tax.m۱۷۷۳۴c(cu.getLong(2));
            tax.m۱۷۷۳۲b(cu.getLong(3));
            tax.m۱۷۷۲۸a(cu.getLong(4));
            tax.m۱۷۷۲۹a(cu.getString(5));
            taxList.add(tax);
        }
        cu.close();
        return taxList;
    }

    /* renamed from: d  reason: contains not printable characters */
    public List<com.lawyer_smartCalendar.p۱۳۳d.Ca> m۱۷۷۹۰d() {
        List<AccountNumber> accountNumberList = new ArrayList<>();
        Cursor cu = this.f۱۴۷۹۳c.rawQuery("select *from tbl_cityBankAccountValue order by id asc", null);
        if (cu == null) {
            return accountNumberList;
        }
        while (cu.moveToNext()) {
            com.lawyer_smartCalendar.p۱۳۳d.Ca accountNumber = new com.lawyer_smartCalendar.p۱۳۳d.Ca();
            accountNumber.m۱۷۶۰۱c(cu.getInt(0));
            accountNumber.m۱۷۵۹۹b(cu.getInt(1));
            accountNumber.m۱۷۵۹۶a(cu.getInt(2));
            accountNumber.m۱۷۵۹۷a(cu.getString(3));
            accountNumberList.add(accountNumber);
        }
        cu.close();
        return accountNumberList;
    }

    /* renamed from: q  reason: contains not printable characters */
    public List<Cf> m۱۷۸۱۴q(String case_id) {
        List<Note> noteList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_note where case_id=" + case_id + " order by date asc", null);
        if (cu == null) {
            return noteList;
        }
        while (cu.moveToNext()) {
            Cf note = new Cf();
            note.m۱۷۶۸۱c(cu.getInt(0));
            note.m۱۷۶۷۸b(cu.getInt(1));
            note.m۱۷۶۷۵a(cu.getInt(2));
            note.m۱۷۶۸۴d(cu.getString(3));
            note.m۱۷۶۸۲c(cu.getString(4));
            note.m۱۷۶۷۶a(cu.getString(5));
            note.m۱۷۶۷۹b(cu.getString(6));
            noteList.add(note);
        }
        cu.close();
        return noteList;
    }

    /* renamed from: m  reason: contains not printable characters */
    public List<Cd> m۱۷۸۰۹m(String case_id) {
        List<ClientDocument> clientDocuments = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_clientDocuments where case_id=" + case_id + " order by receivedDate asc", null);
        if (cu == null) {
            return clientDocuments;
        }
        while (cu.moveToNext()) {
            Cd clientDocument = new Cd();
            clientDocument.m۱۷۶۵۸c(cu.getInt(0));
            clientDocument.m۱۷۶۵۵b(cu.getInt(1));
            clientDocument.m۱۷۶۵۲a(cu.getInt(2));
            clientDocument.m۱۷۶۵۶b(cu.getString(3));
            clientDocument.m۱۷۶۶۱d(cu.getString(4));
            clientDocument.m۱۷۶۵۳a(cu.getString(5));
            clientDocument.m۱۷۶۵۹c(cu.getString(6));
            clientDocuments.add(clientDocument);
        }
        cu.close();
        return clientDocuments;
    }

    /* renamed from: h  reason: contains not printable characters */
    public List<Cd> m۱۷۷۹۹h() {
        List<ClientDocument> clientDocuments = new ArrayList<>();
        Cursor cu = this.f۱۴۷۹۳c.rawQuery("select *from tbl_clientDocuments order by receivedDate asc", null);
        if (cu == null) {
            return clientDocuments;
        }
        while (cu.moveToNext()) {
            Cd clientDocument = new Cd();
            clientDocument.m۱۷۶۵۸c(cu.getInt(0));
            clientDocument.m۱۷۶۵۵b(cu.getInt(1));
            clientDocument.m۱۷۶۵۲a(cu.getInt(2));
            clientDocument.m۱۷۶۵۶b(cu.getString(3));
            clientDocument.m۱۷۶۶۱d(cu.getString(4));
            clientDocument.m۱۷۶۵۳a(cu.getString(5));
            clientDocument.m۱۷۶۵۹c(cu.getString(6));
            clientDocuments.add(clientDocument);
        }
        cu.close();
        return clientDocuments;
    }

    /* renamed from: i  reason: contains not printable characters */
    public List<Cc> m۱۷۸۰۱i() {
        List<Client> clientList = new ArrayList<>();
        Cursor cu = this.f۱۴۷۹۳c.rawQuery("select *from tbl_client order by name asc", null);
        if (cu != null) {
            while (cu.moveToNext()) {
                Cc client = new Cc();
                client.m۱۷۶۳۴a(cu.getInt(0));
                client.m۱۷۶۴۳e(cu.getString(1));
                client.m۱۷۶۳۹c(cu.getString(2));
                client.m۱۷۶۴۵f(cu.getString(3));
                client.m۱۷۶۴۷g(cu.getString(4));
                client.m۱۷۶۴۱d(cu.getString(5));
                client.m۱۷۶۳۷b(cu.getString(6));
                client.m۱۷۶۳۵a(cu.getString(7));
                client.m۱۷۶۴۹h(cu.getString(8));
                clientList.add(client);
            }
        }
        return clientList;
    }

    /* renamed from: n  reason: contains not printable characters */
    public List<Cc> m۱۷۸۱۰n(String query) {
        List<Client> clientList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_client where name like'%" + query + "%' order by name asc", null);
        if (cu != null) {
            while (cu.moveToNext()) {
                Cc client = new Cc();
                client.m۱۷۶۳۴a(cu.getInt(0));
                client.m۱۷۶۴۳e(cu.getString(1));
                client.m۱۷۶۳۹c(cu.getString(2));
                client.m۱۷۶۴۵f(cu.getString(3));
                client.m۱۷۶۴۷g(cu.getString(4));
                client.m۱۷۶۴۱d(cu.getString(5));
                client.m۱۷۶۳۷b(cu.getString(6));
                client.m۱۷۶۳۵a(cu.getString(7));
                client.m۱۷۶۴۹h(cu.getString(8));
                clientList.add(client);
            }
        }
        return clientList;
    }

    /* renamed from: o  reason: contains not printable characters */
    public Cc m۱۷۸۱۲o(String id) {
        Cc client = new Cc();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_client where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            client.m۱۷۶۳۴a(cu.getInt(0));
            client.m۱۷۶۴۳e(cu.getString(1));
            client.m۱۷۶۳۹c(cu.getString(2));
            client.m۱۷۶۴۵f(cu.getString(3));
            client.m۱۷۶۴۷g(cu.getString(4));
            client.m۱۷۶۴۱d(cu.getString(5));
            client.m۱۷۶۳۷b(cu.getString(6));
            client.m۱۷۶۳۵a(cu.getString(7));
            client.m۱۷۶۴۹h(cu.getString(8));
        }
        return client;
    }

    /* renamed from: C  reason: contains not printable characters */
    public Cj m۱۷۷۵۶C(String id) {
        Cj tax = new Cj();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_tax where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            tax.m۱۷۷۲۷a(cu.getInt(0));
            tax.m۱۷۷۳۱b(cu.getInt(1));
            tax.m۱۷۷۳۴c((long) cu.getInt(2));
            tax.m۱۷۷۳۲b((long) cu.getInt(3));
            tax.m۱۷۷۲۸a((long) cu.getInt(4));
            tax.m۱۷۷۲۹a(cu.getString(5));
        }
        return tax;
    }

    /* renamed from: h  reason: contains not printable characters */
    public com.lawyer_smartCalendar.p۱۳۳d.Ca m۱۷۷۹۸h(String id) {
        com.lawyer_smartCalendar.p۱۳۳d.Ca accountNumber = new com.lawyer_smartCalendar.p۱۳۳d.Ca();
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_cityBankAccountValue where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            accountNumber.m۱۷۶۰۱c(cu.getInt(0));
            accountNumber.m۱۷۵۹۹b(cu.getInt(1));
            accountNumber.m۱۷۵۹۶a(cu.getInt(2));
            accountNumber.m۱۷۵۹۷a(cu.getString(3));
        }
        return accountNumber;
    }

    /* renamed from: e  reason: contains not printable characters */
    public String[][] m۱۷۷۹۳e() {
        String[][] data = null;
        Cursor cu = this.f۱۴۷۹۳c.rawQuery("select id,title from tbl_accountNumber order by title asc", null);
        if (cu != null) {
            int i = 0;
            data = (String[][]) Array.newInstance(String.class, cu.getCount(), 2);
            while (cu.moveToNext()) {
                data[i][0] = cu.getString(0);
                data[i][1] = cu.getString(1);
                i++;
            }
        }
        return data;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۷۷۸۸c(Context ctx, String id) {
        Calendar alarmCal = Calendar.getInstance();
        alarmCal.setTimeInMillis(Long.parseLong(m۱۷۷۵۵B(id).m۱۷۷۱۰a()));
        new Ck(ctx, new Intent(ctx, OnAlarmReceiver.class), alarmCal.getTimeInMillis(), (long) Integer.parseInt(id)).m۱۷۸۲۴a();
        Cg.m۱۷۷۵۰a(ctx, Integer.parseInt(id));
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.delete("tbl_schedule", "id =" + id, null);
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۷۷۹۱d(String path) {
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.delete("tbl_file", "file_address ='" + path + "'", null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۷۶a(String fk_id, String file_type) {
        List<File> files = m۱۷۷۸۲b(fk_id, file_type);
        for (int i = 0; i < files.size(); i++) {
            java.io.File f = new java.io.File(Uri.decode(((Ce) files.get(i)).m۱۷۶۶۵a()));
            if (f.exists()) {
                f.delete();
            }
        }
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.delete("tbl_file", "fk_id =" + fk_id, null);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۷۸۵b(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.delete("tbl_cityBankAccountValue", "id =" + id, null);
    }

    /* renamed from: g  reason: contains not printable characters */
    public void m۱۷۷۹۶g(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.delete("tbl_tax", "id =" + id, null);
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۷۷۹۲e(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.delete("tbl_note", "id =" + id, null);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۷۷۸۹c(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.delete("tbl_clientDocuments", "id =" + id, null);
    }

    /* renamed from: f  reason: contains not printable characters */
    public void m۱۷۷۹۵f(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.delete("tbl_paymentDetail", "payment_id =" + id, null);
        SQLiteDatabase sQLiteDatabase2 = this.f۱۴۷۹۳c;
        sQLiteDatabase2.delete("tbl_payment", "id =" + id, null);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۷۸۴b(Context ctx, String id) {
        List<Case> caseList = m۱۷۷۶۲a(Integer.parseInt(id));
        for (int i = 0; i < caseList.size(); i++) {
            m۱۷۷۶۴a(ctx, ((Cb) caseList.get(i)).m۱۷۶۲۶k() + "");
        }
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.delete("tbl_schedule", "client_id =" + id, null);
        SQLiteDatabase sQLiteDatabase2 = this.f۱۴۷۹۳c;
        sQLiteDatabase2.delete("tbl_client", "id =" + id, null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۶۴a(Context ctx, String id) {
        List<Schedule> scheduleList = m۱۷۸۲۲y(id);
        for (int i = 0; i < scheduleList.size(); i++) {
            m۱۷۷۸۸c(ctx, ((com.lawyer_smartCalendar.p۱۳۳d.Ci) scheduleList.get(i)).m۱۷۷۲۱e() + "");
        }
        List<Note> noteList = m۱۷۸۱۴q(id);
        for (int j = 0; j < noteList.size(); j++) {
            m۱۷۷۷۶a(((Cf) noteList.get(j)).m۱۷۶۸۵e() + "", Ca.f۱۴۷۷۳b);
        }
        SQLiteDatabase sQLiteDatabase = this.f۱۴۷۹۳c;
        sQLiteDatabase.delete("tbl_note", "case_id =" + id, null);
        List<ClientDocument> clientDocuments = m۱۷۸۰۹m(id);
        for (int k = 0; k < clientDocuments.size(); k++) {
            m۱۷۷۷۶a(((Cd) clientDocuments.get(k)).m۱۷۶۶۲e() + "", Ca.f۱۴۷۷۲a);
        }
        SQLiteDatabase sQLiteDatabase2 = this.f۱۴۷۹۳c;
        sQLiteDatabase2.delete("tbl_clientDocuments", "case_id =" + id, null);
        Cg payment = m۱۷۸۱۹v(id);
        SQLiteDatabase sQLiteDatabase3 = this.f۱۴۷۹۳c;
        sQLiteDatabase3.delete("tbl_paymentDetail", "payment_id =" + payment.m۱۷۶۹۸e(), null);
        SQLiteDatabase sQLiteDatabase4 = this.f۱۴۷۹۳c;
        sQLiteDatabase4.delete("tbl_payment", "case_id =" + id, null);
        SQLiteDatabase sQLiteDatabase5 = this.f۱۴۷۹۳c;
        sQLiteDatabase5.delete("tbl_case", "id =" + id, null);
    }
}
