package in.nic.kollam.election15kollam;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;

public class InfoActivity extends Activity {
    ListView list;
    String[] web = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35",
            "36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60","61","62","63","64","65",
            "66","67","68","69","70"
    } ;
    Integer[] imageId = {
            R.drawable.prev_slide1,
            R.drawable.prev_slide2,
            R.drawable.prev_slide3,
            R.drawable.prev_slide4,
            R.drawable.prev_slide5,
            R.drawable.prev_slide6,
            R.drawable.prev_slide7,
            R.drawable.prev_slide8,
            R.drawable.prev_slide9,
            R.drawable.prev_slide10,
            R.drawable.prev_slide11,
            R.drawable.prev_slide12,
            R.drawable.prev_slide13,
            R.drawable.prev_slide14,
            R.drawable.prev_slide15,
            R.drawable.prev_slide16,
            R.drawable.prev_slide17,
            R.drawable.prev_slide18,
            R.drawable.prev_slide19,
            R.drawable.prev_slide20,
            R.drawable.prev_slide21,
            R.drawable.prev_slide22,
            R.drawable.prev_slide23,
            R.drawable.prev_slide24,
            R.drawable.prev_slide25,
            R.drawable.prev_slide26,
            R.drawable.prev_slide27,
            R.drawable.prev_slide28,
            R.drawable.prev_slide29,
            R.drawable.prev_slide30,
            R.drawable.prev_slide31,
            R.drawable.prev_slide32,
            R.drawable.prev_slide33,
            R.drawable.prev_slide34,
            R.drawable.prev_slide35,
            R.drawable.prev_slide36,
            R.drawable.prev_slide37,
            R.drawable.prev_slide38,
            R.drawable.prev_slide39,
            R.drawable.prev_slide40,
            R.drawable.prev_slide41,
            R.drawable.prev_slide42,
            R.drawable.prev_slide43,
            R.drawable.prev_slide44,
            R.drawable.prev_slide45,
            R.drawable.prev_slide46,
            R.drawable.prev_slide47,
            R.drawable.prev_slide48,
            R.drawable.prev_slide49,
            R.drawable.prev_slide50,
            R.drawable.prev_slide51,
            R.drawable.prev_slide52,
            R.drawable.prev_slide53,
            R.drawable.prev_slide54,
            R.drawable.prev_slide55,
            R.drawable.prev_slide56,
            R.drawable.prev_slide57,
            R.drawable.prev_slide58,
            R.drawable.prev_slide59,
            R.drawable.prev_slide60,
            R.drawable.prev_slide61,
            R.drawable.prev_slide62,
            R.drawable.prev_slide63,
            R.drawable.prev_slide64,
            R.drawable.prev_slide65,
            R.drawable.prev_slide66,
            R.drawable.prev_slide67,
            R.drawable.prev_slide68,
            R.drawable.prev_slide69,
            R.drawable.prev_slide70
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_info);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.info_title);

        //Drawable d = getResources().(R.drawable.home2);
        //getActionBar().setBackgroundDrawable(d);

        CustomList adapter = new CustomList(InfoActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
               // Toast.makeText(InfoActivity.this, "You Clicked at " +position, Toast.LENGTH_SHORT).show();
                Intent openImageIntent = new Intent(InfoActivity.this,ImageActivity.class);
                openImageIntent.putExtra("int_value", position);
//                openImageIntent.setAction(Intent.ACTION_VIEW);
//                openImageIntent.setDataAndType(Uri.parse("file://" + "/sdcard/test.jpg"), "image/*");
                startActivity(openImageIntent);

            }
        });

    }

}