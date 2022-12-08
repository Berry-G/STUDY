package kunsan.kim.bagchecker;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import app.akexorcist.bluetotohspp.library.BluetoothSPP;
import app.akexorcist.bluetotohspp.library.BluetoothState;
import app.akexorcist.bluetotohspp.library.DeviceList;
import kunsan.jo.bagchecker.BagDatabaseHelper;


public class MainActivity extends AppCompatActivity {

    // DB 선언
    BagDatabaseHelper bagDBHelper;
    SQLiteDatabase bagDatabase;
    String tableName;

    private BluetoothSPP bt;



    // bagDatabaseControl bagDBControl;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDatabase("bagcheck.db");
        bt = new BluetoothSPP(this); // 초기화
        if (!bt.isBluetoothAvailable()) { //블루투스 사용 불가
            Toast.makeText(getApplicationContext()
                    , "Bluetooth is not available"
                    , Toast.LENGTH_SHORT).show();
            finish();
        }

        bt.setOnDataReceivedListener(new BluetoothSPP.OnDataReceivedListener() { //데이터 수신
            public void onDataReceived(byte[] data, String message) {
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

        bt.setBluetoothConnectionListener(new BluetoothSPP.BluetoothConnectionListener() { //연결됐을 때
            public void onDeviceConnected(String name, String address) {
                Toast.makeText(getApplicationContext()
                        , "Connected to " + name + "\n" + address
                        , Toast.LENGTH_SHORT).show();
            }

            public void onDeviceDisconnected() { //연결해제
                Toast.makeText(getApplicationContext()
                        , "Connection lost", Toast.LENGTH_SHORT).show();
            }

            public void onDeviceConnectionFailed() { //연결실패
                Toast.makeText(getApplicationContext()
                        , "Unable to connect", Toast.LENGTH_SHORT).show();
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = findViewById(R.id.recyclerView); //리사이클러 뷰 부분

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Cursor cursor = bagDatabase.rawQuery("select _id, uid, name, issun, ismon, istue, iswed, isthur, isfri, issat, isinbag from bag ", null);
                int recordCounter = cursor.getCount();
                if(recordCounter == 0)
                {
                    insertRecord();
                }
                executeQuery();
            }
        });

        Button btnConnect = findViewById(R.id.btnConnect); //연결시도
        btnConnect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bt.getServiceState() == BluetoothState.STATE_CONNECTED) {
                    bt.disconnect();
                } else {
                    Intent intent = new Intent(getApplicationContext(), DeviceList.class);
                    startActivityForResult(intent, BluetoothState.REQUEST_CONNECT_DEVICE);
                }
            }
        });




        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false); //리사이클러 뷰에 레이아웃 메니저 설정하기
        recyclerView.setLayoutManager(layoutManager);
        Data_BookAdapter adapter = new Data_BookAdapter();

        /*
        adapter.addItem(new Data_Book("정보교과서", "12345678111"));         // 예제 추가
        adapter.addItem(new Data_Book("수학교과서", "23595246235"));
        adapter.addItem(new Data_Book("과학교과서", "15298356374"));
        adapter.addItem(new Data_Book("음악교과서", "05128356321"));
        adapter.addItem(new Data_Book("음악노트", "15240156374"));
        adapter.addItem(new Data_Book("국어교과서", "29578356374"));
        adapter.addItem(new Data_Book("영어교과서", "72298356374"));
        adapter.addItem(new Data_Book("영어회화교과서", "48085123374"));
        adapter.addItem(new Data_Book("철학교과서", "1529157894"));
        */

        recyclerView.setAdapter(adapter);                                           //리사이클러뷰에 어댑터 추가하기

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onDestroy() {
        super.onDestroy();
        bt.stopService(); //블루투스 중지
    }

    public void onStart() {
        super.onStart();
        if (!bt.isBluetoothEnabled()) { //
            Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(intent, BluetoothState.REQUEST_ENABLE_BT);
        } else {
            if (!bt.isServiceAvailable()) {
                bt.setupService();
                bt.startService(BluetoothState.DEVICE_OTHER); //DEVICE_ANDROID는 안드로이드 기기 끼리
                setup();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setup() {
        Button btnSend = findViewById(R.id.btnSend); //데이터 전송
        btnSend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bt.send("Text", true);
            }
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == BluetoothState.REQUEST_CONNECT_DEVICE) {
            if (resultCode == Activity.RESULT_OK)
                bt.connect(data);
        } else if (requestCode == BluetoothState.REQUEST_ENABLE_BT) {
            if (resultCode == Activity.RESULT_OK) {
                bt.setupService();
                bt.startService(BluetoothState.DEVICE_OTHER);
                setup();
            } else {
                Toast.makeText(getApplicationContext()
                        , "Bluetooth was not enabled."
                        , Toast.LENGTH_SHORT).show();
                finish();
            }
        }
    }

    // DB 생성
    private void createDatabase(String name)
    {
        println("createDatabase 호출");


        bagDBHelper = new BagDatabaseHelper(this);
        bagDatabase = bagDBHelper.getWritableDatabase();


        println("데이터베이스 생성 :" + name);
    }

    public void executeQuery()
    {

        println("executeQuery 호출");


        Cursor cursor = bagDatabase.rawQuery("select _id, uid, name, issun, ismon, istue, iswed, isthur, isfri, issat, isinbag from bag ", null);
        int recordCount = cursor.getCount();
        println("레코드 개수: " + recordCount);

        for(int i = 0; i < recordCount; i++)
        {
            cursor.moveToNext();

            int id = cursor.getInt(0);
            String uid = cursor.getString(1);
            String name = cursor.getString(2);
            int isSun = cursor.getInt(3);
            int isMon = cursor.getInt(4);
            int isTue = cursor.getInt(5);
            int isWed = cursor.getInt(6);
            int isThur = cursor.getInt(7);
            int isFri = cursor.getInt(8);
            int isSat = cursor.getInt(9);
            int isInBag = cursor.getInt(10);

            println("레코드 #" + i+1 + " : " + id + ", " +uid + ", " + name + ", " + isSun + ", " + isMon + ", " + isTue + ", "
                    + isWed + ", " + isThur + ", " + isFri + ", " + isSat + ", " + isInBag);
        }

        cursor.close();
    }

    private void insertRecord()
    {
        println("insertRecord 호출");
        if(bagDatabase == null)
        {
            println("데이터베이스 생성 필요");
            return;
        }

        bagDatabase.execSQL("insert into bag (uid, name, issun, ismon, istue, iswed, isthur, isfri, issat, isinbag) "
        + "values "
        + "('FFFFFFFF', '더미 태그', 1, 0, 1, 0, 0, 0, 0, 0)");

        println("레코드 추가");
    }

    public void println(String Data)
    {
        Log.d("MainActivity", Data);
    }
}
