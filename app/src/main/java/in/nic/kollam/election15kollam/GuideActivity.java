package in.nic.kollam.election15kollam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;

public class GuideActivity extends Activity {
    ListView list;
    String[] web = {
            "1",
            "2",
            "3",
            "4"

    } ;
    Integer[] imageId = {
            R.drawable.guides1,
            R.drawable.guides2,
            R.drawable.guides3,
            R.drawable.guides4,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_guide);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.guide_title);

        //Drawable d = getResources().(R.drawable.home2);
        //getActionBar().setBackgroundDrawable(d);

        CustomList adapter = new CustomList(GuideActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.listguide);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
               // Toast.makeText(InfoActivity.this, "You Clicked at " +position, Toast.LENGTH_SHORT).show();
                Intent openImageIntent = new Intent(GuideActivity.this,GuideImageActivity.class);
                openImageIntent.putExtra("int_value", position);
//                openImageIntent.setAction(Intent.ACTION_VIEW);
//                openImageIntent.setDataAndType(Uri.parse("file://" + "/sdcard/test.jpg"), "image/*");
                startActivity(openImageIntent);

            }
        });

    }

}