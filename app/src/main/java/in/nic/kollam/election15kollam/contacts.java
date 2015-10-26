package in.nic.kollam.election15kollam;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static android.R.layout.simple_list_item_1;


public class contacts extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_contacts_list);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.contacts_title);


        String s = getIntent().getStringExtra("number");
        ListView lv = (ListView) findViewById(R.id.listView);
        TextView tv = (TextView) findViewById(R.id.textView1);
           Log.d("number",s);
        Cursor resultSet = null;
        Cursor rs1 = null;
        ArrayList<String> x = new ArrayList<String>();

        SQLiteDatabase sb = openOrCreateDatabase("arjun", MODE_PRIVATE, null);

        if (s.equals("1")) {
            tv.setText("State Election Commission");
            resultSet = sb.rawQuery("Select * from  state_election_commission", null);
            while (resultSet.moveToNext()) {
                String username = resultSet.getString(0);


                x.add("\n" + resultSet.getString(0) + "\n" + resultSet.getString(1) + "\n" + resultSet.getString(2) + "\n");

            }


        } else if (s.equals("2")) {
            tv.setText("District Administration");

            resultSet = sb.rawQuery("Select * from  district_administration", null);
            while (resultSet.moveToNext()) {


                x.add("\n" + resultSet.getString(0) + "\n" + resultSet.getString(1) + "\n" + resultSet.getString(2) + "\n");

            }


        } else if (s.equals("3")) {
            tv.setText("District Election Wing");

            resultSet = sb.rawQuery("Select * from  district_election_wing", null);
            while (resultSet.moveToNext()) {


                x.add("\n" + resultSet.getString(0) + "\n" + resultSet.getString(1) + "\n" + resultSet.getString(2) + "\n");

            }

        } else if (s.equals("4")) {
            tv.setText("Police Officers in Kollam City");
            resultSet = sb.rawQuery("Select * from  police_officer_city", null);
            while (resultSet.moveToNext()) {


                x.add("\n" + resultSet.getString(0) + "\n" + resultSet.getString(1) + "\n" + resultSet.getString(2) + "\n" + resultSet.getString(3) + "\n" + resultSet.getString(4) + "\n");
            }


            rs1 = sb.rawQuery("Select * from  station_house_officers_city", null);
            while (rs1.moveToNext()) {


                x.add("\n" + rs1.getString(0) + "\n" + rs1.getString(1) + "\n");
            }

        } else if (s.equals("5")) {
            tv.setText("Police Officers in Kollam Rural");
            resultSet = sb.rawQuery("Select * from  police_officers_kollam_rural", null);
            while (resultSet.moveToNext()) {


                x.add("\n" + resultSet.getString(0) + "\n" + resultSet.getString(1) + "\n" + resultSet.getString(2) + "\n" + resultSet.getString(3) + "\n" + resultSet.getString(4) + "\n");
            }


            rs1 = sb.rawQuery("Select * from  station_house_officers_rural", null);
            while (rs1.moveToNext()) {


                x.add("\n" + rs1.getString(0) + "\n" + rs1.getString(1) + "\n");
            }


        }
        else
        if(s.equals("6"))
        {
            tv.setText("Block Resource Personnel");

            resultSet = sb.rawQuery("Select * from  block_resourse_personnel",null);

            while(resultSet.moveToNext()) {


                x.add("\n"+resultSet.getString(1)+"\n"+resultSet.getString(0)+"\n"+resultSet.getString(2)+"\n"+resultSet.getString(3)+"\n"+resultSet.getString(4)+"\n");

            }


        }
        else
        if(s.equals("7"))
        {
            tv.setText("Election Master Trainers");




            Log.d("before select","rs");
            resultSet = sb.rawQuery("Select * from  election_masters_trainer",null);
            Log.d("rs","rs");
            while(resultSet.moveToNext()) {


                x.add("\n"+resultSet.getString(0)+"\n"+resultSet.getString(1)+"\n"+resultSet.getString(2)+"\n");

            }
            Log.d("after select", "main");

        }



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, simple_list_item_1, x);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long ld) {

                String s = (String) adapter.getItemAtPosition(position);
                //Toast.makeText(getApplication(),getNumber(s), Toast.LENGTH_LONG).show();
                Log.i("Number",getNumber(s));
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + getNumber(s)));
                startActivity(intent);


            }

            public String getNumber(String str) {
//                Pattern pattern = Pattern.compile("([0-9]+)");
//                Matcher matcher = pattern.matcher(str);
//                int number = 0;
//                String contactNo = "";
//                while (matcher.find()) {
//                    contactNo += Integer.parseInt(matcher.group(1 ));
//                }
//                return Integer.parseInt(contactNo);

                //String arr[] = str.trim().split("[a-zA-Z ]+"); // Please note a space is there after Z

                //String contact = "";

                //for (int i = 3; i < arr.length; i++)
               //     contact += (arr[i]);
               // return contact;

                String numberOnly= str.replaceAll("[^0-9]{10}","");
                String numberOnly1= numberOnly.replaceAll("[a-zA-Z]+","");
                return numberOnly1;
            }

        });


    }
}