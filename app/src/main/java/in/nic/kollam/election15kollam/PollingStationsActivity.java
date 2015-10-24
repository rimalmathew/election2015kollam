package in.nic.kollam.election15kollam;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
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
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;


public class PollingStationsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_polling_stations);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.polling_title);

        ArrayList<String> list = new ArrayList<String>();
        String[] slist = new String[] {"Kollam Corporation",
                "Karunagapally Municipality",
                "Kottarakkara Municipality",
                "Paravoor Municipality",
                "Punalur Municipality",
                "Adhichalnalloor GP",
                "Alappad GP",
                "Alayamon GP",
                "Anchal GP",
                "Aryankavu GP",
                "Chadayamangalam GP",
                "Chathanoor GP",
                "Chavara GP",
                "Chirakkara GP",
                "Chithara GP",
                "Clappana GP",
                "East Kallada GP",
                "Edamulakkal GP",
                "Elemadu GP",
                "Elamballoor GP",
                "Ezhukone GP",
                 "Ittiva GP",
                "Kadakkal GP",
                "Kalluvathukkal GP",
                "Karavaloor GP",
                "Kareepra GP",
                "Kottamkara GP",
                "Kulakkada GP",
                "Kulasekhapuram GP",
                "Kulathupuzha GP",
                "Kummil GP",
                "Kundara GP",
                "Kunnathur GP",
                "Mandrothuruthu GP",
                "Mayyanad GP",
                "Melila GP",
                "Mylom GP",
                "Mynagapally GP",
                "Nedumpana GP",
                "Neduvathur GP",
                "Neendakara GP",
                "Nilemel GP",
                "Oachira GP",
                "Panayam GP",
                "Panmana GP",
                "Pathanapuram GP",
                "Pattazhi GP",
                "Pattazhi Vadekkekara GP",
                "Pavithreshwaram GP",
                "Perayam GP",
                "Perinad GP",
                "Peravanthoor GP",
                "Poothakkulam GP",
                "Pooyapally GP",
                "Poruvazhi GP",
                "Sasthamcotta GP",
                "Sooranadu North GP",
                "Sooranadu South GP",
                "Thalavoor GP",
                "Thazhava GP",
                "Thekkumbhagam GP",
                "Thenmala GP",
                "Thevalakkara GP",
                "Thodiyoor GP",
                "Thrikkaruva GP",
                "Thrikkovil Vattom GP",
                "Ummannoor GP",
                "Velinelloor GP",
                "Veliyam GP",
                "Vettikavala GP",
                "Vilakkudy GP",
                "West Kallada GP",
                "Yeroor GP"
        };

        ListView pollingStationsListView = (ListView) findViewById(R.id.pollingStationsListView);
        ArrayAdapter<String> ar = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, slist);
        pollingStationsListView.setAdapter(ar);

        pollingStationsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),"HI "+position,Toast.LENGTH_LONG).show();
                CopyReadAssets(position);
            }
        });
    }
    private void CopyReadAssets(int position)
    {
        AssetManager assetManager = getAssets();

        InputStream in = null;
        OutputStream out = null;
        File file = new File(getFilesDir(),position+ ".pdf");
        try
        {
            in = assetManager.open(position+".pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e)
        {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/"+position+".pdf"),
                "application/pdf");

        startActivity(intent);
    }

    private void copyFile(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1)
        {
            out.write(buffer, 0, read);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this add
        //
        //
        //
        //
        //
        //
        // s items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_polling_stations, menu);
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
}
