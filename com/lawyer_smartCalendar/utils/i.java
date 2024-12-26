package com.lawyer_smartCalendar.utils;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import b.i.a.a.a;
import com.lawyer_smartCalendar.d.b;
import com.lawyer_smartCalendar.d.c;
import com.lawyer_smartCalendar.d.d;
import com.lawyer_smartCalendar.d.e;
import com.lawyer_smartCalendar.d.f;
import com.lawyer_smartCalendar.d.g;
import com.lawyer_smartCalendar.d.h;
import com.lawyer_smartCalendar.d.j;
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class i extends SQLiteOpenHelper {

    /* renamed from: d  reason: collision with root package name */
    public static String f۳۲۶۴d = "sahv";

    /* renamed from: a  reason: collision with root package name */
    private final Context f۳۲۶۵a;

    /* renamed from: b  reason: collision with root package name */
    public String f۳۲۶۶b = "data/data/[package]/databases/";

    /* renamed from: c  reason: collision with root package name */
    public SQLiteDatabase f۳۲۶۷c;

    public i(Context context) {
        super(context, f۳۲۶۴d, (SQLiteDatabase.CursorFactory) null, 1);
        this.f۳۲۶۵a = context;
        this.f۳۲۶۶b = this.f۳۲۶۶b.replace("[package]", this.f۳۲۶۵a.getPackageName());
    }

    public void onCreate(SQLiteDatabase db) {
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public boolean a() {
        if (a.a("installed", false)) {
            return true;
        }
        SQLiteDatabase db = null;
        try {
            db = SQLiteDatabase.openDatabase(this.f۳۲۶۶b + f۳۲۶۴d, null, 1);
        } catch (SQLException e2) {
        }
        if (db != null) {
            return true;
        }
        return false;
    }

    public void b() {
        OutputStream op = new FileOutputStream(this.f۳۲۶۶b + f۳۲۶۴d);
        byte[] buffer = new byte[1024];
        InputStream ip = this.f۳۲۶۵a.getAssets().open(f۳۲۶۴d);
        while (true) {
            int lentgth = ip.read(buffer);
            if (lentgth > 0) {
                op.write(buffer, 0, lentgth);
            } else {
                ip.close();
                op.flush();
                op.close();
                a.b("installed", true);
                return;
            }
        }
    }

    public void n() {
        this.f۳۲۶۷c = SQLiteDatabase.openDatabase(this.f۳۲۶۶b + f۳۲۶۴d, null, 0);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f۳۲۶۷c.close();
    }

    public void c() {
        if (!Boolean.valueOf(a()).booleanValue()) {
            getReadableDatabase();
            try {
                b();
            } catch (IOException e2) {
            }
        }
    }

    public void a(com.lawyer_smartCalendar.d.a accountNumber) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("city_id", Integer.valueOf(accountNumber.b()));
        contentValues.put("accountNumber_id", Integer.valueOf(accountNumber.a()));
        contentValues.put("number", accountNumber.d());
        this.f۳۲۶۷c.insert("tbl_cityBankAccountValue", null, contentValues);
    }

    public void a(c client) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", client.f());
        contentValues.put("fatherName", client.c());
        contentValues.put("nationalCode", client.g());
        contentValues.put("phoneNumber", client.h());
        contentValues.put("landlinePhone", client.e());
        contentValues.put("emailAddress", client.b());
        contentValues.put("address", client.a());
        contentValues.put("type", client.i());
        this.f۳۲۶۷c.insert("tbl_client", null, contentValues);
    }

    public void a(b case1) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(case1.g()));
        contentValues.put("title", case1.o());
        contentValues.put("date", case1.j());
        contentValues.put("clientTitleType", case1.f());
        contentValues.put("subject", case1.n());
        contentValues.put("courtType", case1.i());
        contentValues.put("courtCityId", Integer.valueOf(case1.h()));
        contentValues.put("branchName", case1.c());
        contentValues.put("caseNumber", case1.d());
        contentValues.put("archiveNumber", case1.a());
        contentValues.put("attorneyLetterNumber", case1.b());
        contentValues.put("lawsuitInfo", case1.l());
        contentValues.put("status", case1.m());
        contentValues.put("caseStatus", case1.e());
        this.f۳۲۶۷c.insert("tbl_case", null, contentValues);
    }

    public void a(j tax) {
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select id from tbl_tax where year=" + tax.f(), null);
        if (cu.getCount() > 0) {
            cu.moveToFirst();
            a(tax, cu.getString(0));
            cu.close();
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("year", Integer.valueOf(tax.f()));
        contentValues.put("total", Long.valueOf(tax.e()));
        contentValues.put("incomeTax", Long.valueOf(tax.c()));
        contentValues.put("income", Long.valueOf(tax.b()));
        contentValues.put("note", tax.d());
        this.f۳۲۶۷c.insert("tbl_tax", null, contentValues);
    }

    public void a(j tax, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("year", Integer.valueOf(tax.f()));
        contentValues.put("total", Long.valueOf(tax.e()));
        contentValues.put("incomeTax", Long.valueOf(tax.c()));
        contentValues.put("income", Long.valueOf(tax.b()));
        contentValues.put("note", tax.d());
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.update("tbl_tax", contentValues, "id =" + id, null);
    }

    public long a(d document) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(document.b()));
        contentValues.put("case_id", Integer.valueOf(document.a()));
        contentValues.put("documentType", document.d());
        contentValues.put("receivedDate", document.g());
        contentValues.put("deliveredDate", document.c());
        contentValues.put("note", document.f());
        return this.f۳۲۶۷c.insert("tbl_clientDocuments", null, contentValues);
    }

    public void a(List<e> list) {
        for (int i = 0; i < list.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("fk_id", Integer.valueOf(list.get(i).c()));
            contentValues.put("title", list.get(i).d());
            contentValues.put("file_type", list.get(i).b());
            contentValues.put("file_address", list.get(i).a());
            this.f۳۲۶۷c.insert("tbl_file", null, contentValues);
        }
    }

    public void a(List<h> list, String pay_id) {
        for (int i = 0; i < list.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("payment_id", pay_id);
            contentValues.put("date", list.get(i).b());
            contentValues.put("amount", list.get(i).a());
            contentValues.put("detail", list.get(i).c());
            this.f۳۲۶۷c.insert("tbl_paymentDetail", null, contentValues);
        }
    }

    public void b(List<h> list, String pay_id) {
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.delete("tbl_paymentDetail", "payment_id =" + pay_id, null);
        for (int i = 0; i < list.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("payment_id", pay_id);
            contentValues.put("date", list.get(i).b());
            contentValues.put("amount", list.get(i).a());
            contentValues.put("detail", list.get(i).c());
            this.f۳۲۶۷c.insert("tbl_paymentDetail", null, contentValues);
        }
    }

    public long a(g payment) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("case_id", Integer.valueOf(payment.b()));
        contentValues.put("date", payment.c());
        contentValues.put("payType", payment.g());
        contentValues.put("payFor", payment.f());
        contentValues.put("amount", payment.a());
        contentValues.put("detail", payment.d());
        return this.f۳۲۶۷c.insert("tbl_payment", null, contentValues);
    }

    public void a(g payment, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("case_id", Integer.valueOf(payment.b()));
        contentValues.put("date", payment.c());
        contentValues.put("payType", payment.g());
        contentValues.put("payFor", payment.f());
        contentValues.put("amount", payment.a());
        contentValues.put("detail", payment.d());
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.update("tbl_payment", contentValues, "id =" + id, null);
    }

    public long a(com.lawyer_smartCalendar.d.i schedule) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(schedule.c()));
        contentValues.put("case_id", Integer.valueOf(schedule.b()));
        contentValues.put("scheduleType", schedule.g());
        contentValues.put("subject", schedule.h());
        contentValues.put("date", schedule.d());
        contentValues.put("result", schedule.f());
        contentValues.put("alarmDate", schedule.a());
        return this.f۳۲۶۷c.insert("tbl_schedule", null, contentValues);
    }

    public void a(com.lawyer_smartCalendar.d.i schedule, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(schedule.c()));
        contentValues.put("case_id", Integer.valueOf(schedule.b()));
        contentValues.put("scheduleType", schedule.g());
        contentValues.put("subject", schedule.h());
        contentValues.put("date", schedule.d());
        contentValues.put("result", schedule.f());
        contentValues.put("alarmDate", schedule.a());
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.update("tbl_schedule", contentValues, "id =" + id, null);
    }

    public long a(d document, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(document.b()));
        contentValues.put("case_id", Integer.valueOf(document.a()));
        contentValues.put("documentType", document.d());
        contentValues.put("receivedDate", document.g());
        contentValues.put("deliveredDate", document.c());
        contentValues.put("note", document.f());
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        return (long) sQLiteDatabase.update("tbl_clientDocuments", contentValues, "id =" + id, null);
    }

    public void a(c client, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", client.f());
        contentValues.put("fatherName", client.c());
        contentValues.put("nationalCode", client.g());
        contentValues.put("phoneNumber", client.h());
        contentValues.put("landlinePhone", client.e());
        contentValues.put("emailAddress", client.b());
        contentValues.put("address", client.a());
        contentValues.put("type", client.i());
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.update("tbl_client", contentValues, "id =" + id, null);
    }

    public void a(b case1, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(case1.g()));
        contentValues.put("title", case1.o());
        contentValues.put("date", case1.j());
        contentValues.put("clientTitleType", case1.f());
        contentValues.put("subject", case1.n());
        contentValues.put("courtType", case1.i());
        contentValues.put("courtCityId", Integer.valueOf(case1.h()));
        contentValues.put("branchName", case1.c());
        contentValues.put("caseNumber", case1.d());
        contentValues.put("archiveNumber", case1.a());
        contentValues.put("attorneyLetterNumber", case1.b());
        contentValues.put("lawsuitInfo", case1.l());
        contentValues.put("status", case1.m());
        contentValues.put("caseStatus", case1.e());
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.update("tbl_case", contentValues, "id =" + id, null);
    }

    public void a(com.lawyer_smartCalendar.d.a accountNumber, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("city_id", Integer.valueOf(accountNumber.b()));
        contentValues.put("accountNumber_id", Integer.valueOf(accountNumber.a()));
        contentValues.put("number", accountNumber.d());
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.update("tbl_cityBankAccountValue", contentValues, "id =" + id, null);
    }

    public void a(f note, String id) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(note.b()));
        contentValues.put("case_id", Integer.valueOf(note.a()));
        contentValues.put("title", note.g());
        contentValues.put("note_type", note.f());
        contentValues.put("date", note.c());
        contentValues.put("detail", note.d());
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.update("tbl_note", contentValues, "id =" + id, null);
    }

    public long a(f note) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_id", Integer.valueOf(note.b()));
        contentValues.put("case_id", Integer.valueOf(note.a()));
        contentValues.put("title", note.g());
        contentValues.put("note_type", note.f());
        contentValues.put("date", note.c());
        contentValues.put("detail", note.d());
        return this.f۳۲۶۷c.insert("tbl_note", null, contentValues);
    }

    public String[][] g() {
        String[][] data = null;
        Cursor cu = this.f۳۲۶۷c.rawQuery("select id,city from tbl_city order by city asc", null);
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

    public String l(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select city from tbl_city where id=" + id, null);
        if (cu == null || !cu.moveToFirst()) {
            return "";
        }
        return cu.getString(0);
    }

    public boolean a(String case_id) {
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_payment where case_id=" + case_id, null);
        if (cu == null || cu.getCount() <= 0) {
            return false;
        }
        return true;
    }

    public String i(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select title from tbl_accountNumber where id=" + id, null);
        if (cu == null || !cu.moveToFirst()) {
            return "";
        }
        return cu.getString(0);
    }

    public b k(String id) {
        b case1 = new b();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_case where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            case1.c(cu.getInt(0));
            case1.a(cu.getInt(1));
            case1.l(cu.getString(2));
            case1.h(cu.getString(3));
            case1.f(cu.getString(4));
            case1.k(cu.getString(5));
            case1.g(cu.getString(6));
            case1.b(cu.getInt(7));
            case1.c(cu.getString(8));
            case1.d(cu.getString(9));
            case1.a(cu.getString(10));
            case1.b(cu.getString(11));
            case1.i(cu.getString(12));
            case1.j(cu.getString(13));
            case1.e(cu.getString(14));
        }
        return case1;
    }

    public String[][] j() {
        String[][] data = null;
        Cursor cu = this.f۳۲۶۷c.rawQuery("select *from tbl_link order by title asc", null);
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

    public List<b> f() {
        List<Case> caseList = new ArrayList<>();
        Cursor cu = this.f۳۲۶۷c.rawQuery("select *from tbl_case order by date desc", null);
        if (cu != null) {
            while (cu.moveToNext()) {
                b case1 = new b();
                case1.c(cu.getInt(0));
                case1.a(cu.getInt(1));
                case1.l(cu.getString(2));
                case1.h(cu.getString(3));
                case1.f(cu.getString(4));
                case1.k(cu.getString(5));
                case1.g(cu.getString(6));
                case1.b(cu.getInt(7));
                case1.c(cu.getString(8));
                case1.d(cu.getString(9));
                case1.a(cu.getString(10));
                case1.b(cu.getString(11));
                case1.i(cu.getString(12));
                case1.j(cu.getString(13));
                case1.e(cu.getString(14));
                caseList.add(case1);
            }
        }
        return caseList;
    }

    public List<b> j(String query) {
        List<Case> caseList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_case where lawsuitInfo like'%" + query + "%' or subject like'%" + query + "%' order by date desc", null);
        if (cu != null) {
            while (cu.moveToNext()) {
                b case1 = new b();
                case1.c(cu.getInt(0));
                case1.a(cu.getInt(1));
                case1.l(cu.getString(2));
                case1.h(cu.getString(3));
                case1.f(cu.getString(4));
                case1.k(cu.getString(5));
                case1.g(cu.getString(6));
                case1.b(cu.getInt(7));
                case1.c(cu.getString(8));
                case1.d(cu.getString(9));
                case1.a(cu.getString(10));
                case1.b(cu.getString(11));
                case1.i(cu.getString(12));
                case1.j(cu.getString(13));
                case1.e(cu.getString(14));
                caseList.add(case1);
            }
        }
        return caseList;
    }

    public List<b> a(int client_id) {
        List<Case> caseList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_case where client_id=" + client_id + " order by date desc", null);
        if (cu != null) {
            while (cu.moveToNext()) {
                b case1 = new b();
                case1.c(cu.getInt(0));
                case1.a(cu.getInt(1));
                case1.l(cu.getString(2));
                case1.h(cu.getString(3));
                case1.f(cu.getString(4));
                case1.k(cu.getString(5));
                case1.g(cu.getString(6));
                case1.b(cu.getInt(7));
                case1.c(cu.getString(8));
                case1.d(cu.getString(9));
                case1.a(cu.getString(10));
                case1.b(cu.getString(11));
                case1.i(cu.getString(12));
                case1.j(cu.getString(13));
                case1.e(cu.getString(14));
                caseList.add(case1);
            }
        }
        return caseList;
    }

    public String b(int id) {
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select name from tbl_client where id=" + id + " limit 1", null);
        if (cu == null || !cu.moveToFirst()) {
            return "";
        }
        return cu.getString(0);
    }

    public com.lawyer_smartCalendar.d.i B(String id) {
        com.lawyer_smartCalendar.d.i schedule = new com.lawyer_smartCalendar.d.i();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_schedule where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            schedule.c(cu.getInt(0));
            schedule.b(cu.getInt(1));
            schedule.a(cu.getInt(2));
            schedule.d(cu.getString(3));
            schedule.e(cu.getString(4));
            schedule.b(cu.getString(5));
            schedule.c(cu.getString(6));
            schedule.a(cu.getString(7));
        }
        return schedule;
    }

    public d p(String id) {
        d clientDocument = new d();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_clientDocuments where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            clientDocument.c(cu.getInt(0));
            clientDocument.b(cu.getInt(1));
            clientDocument.a(cu.getInt(2));
            clientDocument.b(cu.getString(3));
            clientDocument.d(cu.getString(4));
            clientDocument.a(cu.getString(5));
            clientDocument.c(cu.getString(6));
        }
        return clientDocument;
    }

    public g w(String id) {
        g payment = new g();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_payment where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            payment.b(cu.getInt(0));
            payment.a(cu.getInt(1));
            payment.b(cu.getString(2));
            payment.e(cu.getString(3));
            payment.d(cu.getString(4));
            payment.a(cu.getString(5));
            payment.c(cu.getString(6));
        }
        return payment;
    }

    public g v(String case_id) {
        g payment = new g();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_payment where case_id=" + case_id, null);
        if (cu != null && cu.moveToFirst()) {
            payment.b(cu.getInt(0));
            payment.a(cu.getInt(1));
            payment.b(cu.getString(2));
            payment.e(cu.getString(3));
            payment.d(cu.getString(4));
            payment.a(cu.getString(5));
            payment.c(cu.getString(6));
        }
        return payment;
    }

    public f u(String id) {
        f note = new f();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_note where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            note.c(cu.getInt(0));
            note.b(cu.getInt(1));
            note.a(cu.getInt(2));
            note.d(cu.getString(3));
            note.c(cu.getString(4));
            note.a(cu.getString(5));
            note.b(cu.getString(6));
        }
        return note;
    }

    public List<com.lawyer_smartCalendar.d.i> a(long firstDayDate, long lastDayDate) {
        List<Schedule> scheduleList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_schedule where  CAST(date as long)>=" + firstDayDate + " and CAST(date as long)<=" + lastDayDate + " order by date asc", null);
        if (cu == null) {
            return scheduleList;
        }
        while (cu.moveToNext()) {
            com.lawyer_smartCalendar.d.i schedule = new com.lawyer_smartCalendar.d.i();
            schedule.c(cu.getInt(0));
            schedule.b(cu.getInt(1));
            schedule.a(cu.getInt(2));
            schedule.d(cu.getString(3));
            schedule.e(cu.getString(4));
            schedule.b(cu.getString(5));
            schedule.c(cu.getString(6));
            schedule.a(cu.getString(7));
            scheduleList.add(schedule);
        }
        cu.close();
        return scheduleList;
    }

    public List<com.lawyer_smartCalendar.d.i> l() {
        List<Schedule> scheduleList = new ArrayList<>();
        Cursor cu = this.f۳۲۶۷c.rawQuery("select *from tbl_schedule order by date asc", null);
        if (cu == null) {
            return scheduleList;
        }
        while (cu.moveToNext()) {
            com.lawyer_smartCalendar.d.i schedule = new com.lawyer_smartCalendar.d.i();
            schedule.c(cu.getInt(0));
            schedule.b(cu.getInt(1));
            schedule.a(cu.getInt(2));
            schedule.d(cu.getString(3));
            schedule.e(cu.getString(4));
            schedule.b(cu.getString(5));
            schedule.c(cu.getString(6));
            schedule.a(cu.getString(7));
            scheduleList.add(schedule);
        }
        cu.close();
        return scheduleList;
    }

    public List<com.lawyer_smartCalendar.d.i> A(String query) {
        List<Schedule> scheduleList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_schedule where subject like'%" + query + "%' order by date asc ", null);
        if (cu == null) {
            return scheduleList;
        }
        while (cu.moveToNext()) {
            com.lawyer_smartCalendar.d.i schedule = new com.lawyer_smartCalendar.d.i();
            schedule.c(cu.getInt(0));
            schedule.b(cu.getInt(1));
            schedule.a(cu.getInt(2));
            schedule.d(cu.getString(3));
            schedule.e(cu.getString(4));
            schedule.b(cu.getString(5));
            schedule.c(cu.getString(6));
            schedule.a(cu.getString(7));
            scheduleList.add(schedule);
        }
        cu.close();
        return scheduleList;
    }

    public List<com.lawyer_smartCalendar.d.i> z(String client_id) {
        List<Schedule> scheduleList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_schedule where client_id=" + client_id + " order by date asc", null);
        if (cu == null) {
            return scheduleList;
        }
        while (cu.moveToNext()) {
            com.lawyer_smartCalendar.d.i schedule = new com.lawyer_smartCalendar.d.i();
            schedule.c(cu.getInt(0));
            schedule.b(cu.getInt(1));
            schedule.a(cu.getInt(2));
            schedule.d(cu.getString(3));
            schedule.e(cu.getString(4));
            schedule.b(cu.getString(5));
            schedule.c(cu.getString(6));
            schedule.a(cu.getString(7));
            scheduleList.add(schedule);
        }
        cu.close();
        return scheduleList;
    }

    public List<com.lawyer_smartCalendar.d.i> y(String case_id) {
        List<Schedule> scheduleList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_schedule where case_id=" + case_id + " order by date asc", null);
        if (cu == null) {
            return scheduleList;
        }
        while (cu.moveToNext()) {
            com.lawyer_smartCalendar.d.i schedule = new com.lawyer_smartCalendar.d.i();
            schedule.c(cu.getInt(0));
            schedule.b(cu.getInt(1));
            schedule.a(cu.getInt(2));
            schedule.d(cu.getString(3));
            schedule.e(cu.getString(4));
            schedule.b(cu.getString(5));
            schedule.c(cu.getString(6));
            schedule.a(cu.getString(7));
            scheduleList.add(schedule);
        }
        cu.close();
        return scheduleList;
    }

    public List<e> b(String fk_id, String fileType) {
        List<File> fileList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_file where fk_id=" + fk_id + " and file_type='" + fileType + "'", null);
        if (cu == null) {
            return fileList;
        }
        while (cu.moveToNext()) {
            e file = new e();
            file.b(cu.getInt(0));
            file.a(cu.getInt(1));
            file.c(cu.getString(2));
            file.b(cu.getString(3));
            file.a(cu.getString(4));
            fileList.add(file);
        }
        cu.close();
        return fileList;
    }

    public List<f> r(String client_id) {
        List<Note> noteList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_note where client_id=" + client_id + " order by date asc", null);
        if (cu == null) {
            return noteList;
        }
        while (cu.moveToNext()) {
            f note = new f();
            note.c(cu.getInt(0));
            note.b(cu.getInt(1));
            note.a(cu.getInt(2));
            note.d(cu.getString(3));
            note.c(cu.getString(4));
            note.a(cu.getString(5));
            note.b(cu.getString(6));
            noteList.add(note);
        }
        cu.close();
        return noteList;
    }

    public List<f> s(String type) {
        List<Note> noteList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_note where note_type='" + type + "' order by date asc", null);
        if (cu == null) {
            return noteList;
        }
        while (cu.moveToNext()) {
            f note = new f();
            note.c(cu.getInt(0));
            note.b(cu.getInt(1));
            note.a(cu.getInt(2));
            note.d(cu.getString(3));
            note.c(cu.getString(4));
            note.a(cu.getString(5));
            note.b(cu.getString(6));
            noteList.add(note);
        }
        cu.close();
        return noteList;
    }

    public List<f> t(String query) {
        List<Note> noteList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_note where title like'%" + query + "%' or detail like'%" + query + "%' order by date asc", null);
        if (cu == null) {
            return noteList;
        }
        while (cu.moveToNext()) {
            f note = new f();
            note.c(cu.getInt(0));
            note.b(cu.getInt(1));
            note.a(cu.getInt(2));
            note.d(cu.getString(3));
            note.c(cu.getString(4));
            note.a(cu.getString(5));
            note.b(cu.getString(6));
            noteList.add(note);
        }
        cu.close();
        return noteList;
    }

    public List<g> k() {
        List<Payment> paymentList = new ArrayList<>();
        Cursor cu = this.f۳۲۶۷c.rawQuery("select *from tbl_payment order by date asc", null);
        if (cu == null) {
            return paymentList;
        }
        while (cu.moveToNext()) {
            g payment = new g();
            payment.b(cu.getInt(0));
            payment.a(cu.getInt(1));
            payment.b(cu.getString(2));
            payment.e(cu.getString(3));
            payment.d(cu.getString(4));
            payment.a(cu.getString(5));
            payment.c(cu.getString(6));
            paymentList.add(payment);
        }
        cu.close();
        return paymentList;
    }

    public List<h> x(String payment_id) {
        List<PaymentDetail> paymentDetailList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_paymentDetail where payment_id=" + payment_id + " order by date asc", null);
        if (cu == null) {
            return paymentDetailList;
        }
        while (cu.moveToNext()) {
            h paymentDetail = new h();
            paymentDetail.a(cu.getInt(0));
            paymentDetail.a((long) cu.getInt(1));
            paymentDetail.b(cu.getString(2));
            paymentDetail.a(cu.getString(3));
            paymentDetail.c(cu.getString(4));
            paymentDetailList.add(paymentDetail);
        }
        cu.close();
        return paymentDetailList;
    }

    public List<j> m() {
        List<Tax> taxList = new ArrayList<>();
        Cursor cu = this.f۳۲۶۷c.rawQuery("select *from tbl_tax order by year asc", null);
        if (cu == null) {
            return taxList;
        }
        while (cu.moveToNext()) {
            j tax = new j();
            tax.a(cu.getInt(0));
            tax.b(cu.getInt(1));
            tax.c(cu.getLong(2));
            tax.b(cu.getLong(3));
            tax.a(cu.getLong(4));
            tax.a(cu.getString(5));
            taxList.add(tax);
        }
        cu.close();
        return taxList;
    }

    public List<com.lawyer_smartCalendar.d.a> d() {
        List<AccountNumber> accountNumberList = new ArrayList<>();
        Cursor cu = this.f۳۲۶۷c.rawQuery("select *from tbl_cityBankAccountValue order by id asc", null);
        if (cu == null) {
            return accountNumberList;
        }
        while (cu.moveToNext()) {
            com.lawyer_smartCalendar.d.a accountNumber = new com.lawyer_smartCalendar.d.a();
            accountNumber.c(cu.getInt(0));
            accountNumber.b(cu.getInt(1));
            accountNumber.a(cu.getInt(2));
            accountNumber.a(cu.getString(3));
            accountNumberList.add(accountNumber);
        }
        cu.close();
        return accountNumberList;
    }

    public List<f> q(String case_id) {
        List<Note> noteList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_note where case_id=" + case_id + " order by date asc", null);
        if (cu == null) {
            return noteList;
        }
        while (cu.moveToNext()) {
            f note = new f();
            note.c(cu.getInt(0));
            note.b(cu.getInt(1));
            note.a(cu.getInt(2));
            note.d(cu.getString(3));
            note.c(cu.getString(4));
            note.a(cu.getString(5));
            note.b(cu.getString(6));
            noteList.add(note);
        }
        cu.close();
        return noteList;
    }

    public List<d> m(String case_id) {
        List<ClientDocument> clientDocuments = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_clientDocuments where case_id=" + case_id + " order by receivedDate asc", null);
        if (cu == null) {
            return clientDocuments;
        }
        while (cu.moveToNext()) {
            d clientDocument = new d();
            clientDocument.c(cu.getInt(0));
            clientDocument.b(cu.getInt(1));
            clientDocument.a(cu.getInt(2));
            clientDocument.b(cu.getString(3));
            clientDocument.d(cu.getString(4));
            clientDocument.a(cu.getString(5));
            clientDocument.c(cu.getString(6));
            clientDocuments.add(clientDocument);
        }
        cu.close();
        return clientDocuments;
    }

    public List<d> h() {
        List<ClientDocument> clientDocuments = new ArrayList<>();
        Cursor cu = this.f۳۲۶۷c.rawQuery("select *from tbl_clientDocuments order by receivedDate asc", null);
        if (cu == null) {
            return clientDocuments;
        }
        while (cu.moveToNext()) {
            d clientDocument = new d();
            clientDocument.c(cu.getInt(0));
            clientDocument.b(cu.getInt(1));
            clientDocument.a(cu.getInt(2));
            clientDocument.b(cu.getString(3));
            clientDocument.d(cu.getString(4));
            clientDocument.a(cu.getString(5));
            clientDocument.c(cu.getString(6));
            clientDocuments.add(clientDocument);
        }
        cu.close();
        return clientDocuments;
    }

    public List<c> i() {
        List<Client> clientList = new ArrayList<>();
        Cursor cu = this.f۳۲۶۷c.rawQuery("select *from tbl_client order by name asc", null);
        if (cu != null) {
            while (cu.moveToNext()) {
                c client = new c();
                client.a(cu.getInt(0));
                client.e(cu.getString(1));
                client.c(cu.getString(2));
                client.f(cu.getString(3));
                client.g(cu.getString(4));
                client.d(cu.getString(5));
                client.b(cu.getString(6));
                client.a(cu.getString(7));
                client.h(cu.getString(8));
                clientList.add(client);
            }
        }
        return clientList;
    }

    public List<c> n(String query) {
        List<Client> clientList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_client where name like'%" + query + "%' order by name asc", null);
        if (cu != null) {
            while (cu.moveToNext()) {
                c client = new c();
                client.a(cu.getInt(0));
                client.e(cu.getString(1));
                client.c(cu.getString(2));
                client.f(cu.getString(3));
                client.g(cu.getString(4));
                client.d(cu.getString(5));
                client.b(cu.getString(6));
                client.a(cu.getString(7));
                client.h(cu.getString(8));
                clientList.add(client);
            }
        }
        return clientList;
    }

    public c o(String id) {
        c client = new c();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_client where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            client.a(cu.getInt(0));
            client.e(cu.getString(1));
            client.c(cu.getString(2));
            client.f(cu.getString(3));
            client.g(cu.getString(4));
            client.d(cu.getString(5));
            client.b(cu.getString(6));
            client.a(cu.getString(7));
            client.h(cu.getString(8));
        }
        return client;
    }

    public j C(String id) {
        j tax = new j();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_tax where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            tax.a(cu.getInt(0));
            tax.b(cu.getInt(1));
            tax.c((long) cu.getInt(2));
            tax.b((long) cu.getInt(3));
            tax.a((long) cu.getInt(4));
            tax.a(cu.getString(5));
        }
        return tax;
    }

    public com.lawyer_smartCalendar.d.a h(String id) {
        com.lawyer_smartCalendar.d.a accountNumber = new com.lawyer_smartCalendar.d.a();
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        Cursor cu = sQLiteDatabase.rawQuery("select *from tbl_cityBankAccountValue where id=" + id, null);
        if (cu != null && cu.moveToFirst()) {
            accountNumber.c(cu.getInt(0));
            accountNumber.b(cu.getInt(1));
            accountNumber.a(cu.getInt(2));
            accountNumber.a(cu.getString(3));
        }
        return accountNumber;
    }

    public String[][] e() {
        String[][] data = null;
        Cursor cu = this.f۳۲۶۷c.rawQuery("select id,title from tbl_accountNumber order by title asc", null);
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

    public void c(Context ctx, String id) {
        Calendar alarmCal = Calendar.getInstance();
        alarmCal.setTimeInMillis(Long.parseLong(B(id).a()));
        new k(ctx, new Intent(ctx, OnAlarmReceiver.class), alarmCal.getTimeInMillis(), (long) Integer.parseInt(id)).a();
        g.a(ctx, Integer.parseInt(id));
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.delete("tbl_schedule", "id =" + id, null);
    }

    public void d(String path) {
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.delete("tbl_file", "file_address ='" + path + "'", null);
    }

    public void a(String fk_id, String file_type) {
        List<File> files = b(fk_id, file_type);
        for (int i = 0; i < files.size(); i++) {
            java.io.File f2 = new java.io.File(Uri.decode(((e) files.get(i)).a()));
            if (f2.exists()) {
                f2.delete();
            }
        }
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.delete("tbl_file", "fk_id =" + fk_id, null);
    }

    public void b(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.delete("tbl_cityBankAccountValue", "id =" + id, null);
    }

    public void g(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.delete("tbl_tax", "id =" + id, null);
    }

    public void e(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.delete("tbl_note", "id =" + id, null);
    }

    public void c(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.delete("tbl_clientDocuments", "id =" + id, null);
    }

    public void f(String id) {
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.delete("tbl_paymentDetail", "payment_id =" + id, null);
        SQLiteDatabase sQLiteDatabase2 = this.f۳۲۶۷c;
        sQLiteDatabase2.delete("tbl_payment", "id =" + id, null);
    }

    public void b(Context ctx, String id) {
        List<Case> caseList = a(Integer.parseInt(id));
        for (int i = 0; i < caseList.size(); i++) {
            a(ctx, ((b) caseList.get(i)).k() + "");
        }
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.delete("tbl_schedule", "client_id =" + id, null);
        SQLiteDatabase sQLiteDatabase2 = this.f۳۲۶۷c;
        sQLiteDatabase2.delete("tbl_client", "id =" + id, null);
    }

    public void a(Context ctx, String id) {
        List<Schedule> scheduleList = y(id);
        for (int i = 0; i < scheduleList.size(); i++) {
            c(ctx, ((com.lawyer_smartCalendar.d.i) scheduleList.get(i)).e() + "");
        }
        List<Note> noteList = q(id);
        for (int j = 0; j < noteList.size(); j++) {
            a(((f) noteList.get(j)).e() + "", a.f۳۲۴۷b);
        }
        SQLiteDatabase sQLiteDatabase = this.f۳۲۶۷c;
        sQLiteDatabase.delete("tbl_note", "case_id =" + id, null);
        List<ClientDocument> clientDocuments = m(id);
        for (int k = 0; k < clientDocuments.size(); k++) {
            a(((d) clientDocuments.get(k)).e() + "", a.f۳۲۴۶a);
        }
        SQLiteDatabase sQLiteDatabase2 = this.f۳۲۶۷c;
        sQLiteDatabase2.delete("tbl_clientDocuments", "case_id =" + id, null);
        g payment = v(id);
        SQLiteDatabase sQLiteDatabase3 = this.f۳۲۶۷c;
        sQLiteDatabase3.delete("tbl_paymentDetail", "payment_id =" + payment.e(), null);
        SQLiteDatabase sQLiteDatabase4 = this.f۳۲۶۷c;
        sQLiteDatabase4.delete("tbl_payment", "case_id =" + id, null);
        SQLiteDatabase sQLiteDatabase5 = this.f۳۲۶۷c;
        sQLiteDatabase5.delete("tbl_case", "id =" + id, null);
    }
}
