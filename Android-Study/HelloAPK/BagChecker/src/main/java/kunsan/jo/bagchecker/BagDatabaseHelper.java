package kunsan.jo.bagchecker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class BagDatabaseHelper extends SQLiteOpenHelper
{
    public static String NAME = "bagcheck.db";
    public static int VERSION = 1;

    public BagDatabaseHelper(Context context)
    {
        super(context, NAME, null, VERSION);
    }

    public void onCreate(SQLiteDatabase db)
    {
        println("onCreate 호출");


        String sql = "create table if not exists bag("
                + "_id integer PRIMARY KEY autoincrement,"
                + " uid text,"
                + " name text,"
                + " issun integer, "
                + " ismon integer, "
                + " istue integer, "
                + " iswed integer, "
                + " isthur integer, "
                + " isfri integer, "
                + " issat integer, "
                + " isinbag integer)";

        db.execSQL(sql);

        println("테이블 생성완료");
    }



     public void onOpen(SQLiteDatabase db)
    {
        println("onOpen 호출");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        println("onUpgrade 호출, " + oldVersion + "->" + newVersion);


        if(newVersion > 1)
        {
            db.execSQL("DROP TABLE IF EXISTS bag");
        }

    }

    public void println(String Data)
    {
        Log.d("BagDatabaseHelper", Data);
    }
}
