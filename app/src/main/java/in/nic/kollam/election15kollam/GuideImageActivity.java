package in.nic.kollam.election15kollam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;


public class GuideImageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_guideimage);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.guide_title);


        Intent getImageIntent = getIntent();
        int temp = getImageIntent.getIntExtra("int_value", 0);
        ImageView iv = (ImageView)findViewById(R.id.guideimgView);
       // String res = "R.drawable.slide"+temp;
        Log.i("image", "");
        String variableValue=temp+"";
        int[] image = new int[4];

        image[0] = R.drawable.guide1;
        image[1] = R.drawable.guide2;
        image[2] = R.drawable.guide3;
        image[3] = R.drawable.guide4;

        iv.setImageResource(image[temp]);

    }


}
