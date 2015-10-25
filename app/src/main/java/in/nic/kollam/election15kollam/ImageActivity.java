package in.nic.kollam.election15kollam;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageView;


public class ImageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_image);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.info_title);


        Intent getImageIntent = getIntent();
        int temp = getImageIntent.getIntExtra("int_value", 0);
        ImageView iv = (ImageView)findViewById(R.id.imgView);
       // String res = "R.drawable.slide"+temp;
        Log.i("image", "");
        String variableValue=temp+"";
        int[] image = new int[71];
     /*   image[0] = R.drawable.slide1;
        image[1] = R.drawable.slide2;
        image[2] = R.drawable.slide3;
        image[3] = R.drawable.slide4;
        image[4] = R.drawable.slide5;
        image[5] = R.drawable.slide6;
        image[6] = R.drawable.slide7;
        image[7] = R.drawable.slide8;
        image[8] = R.drawable.slide9;
        image[9] = R.drawable.slide10;
        image[10] = R.drawable.slide11;
        image[11] = R.drawable.slide12;
        image[12] = R.drawable.slide13;
        image[13] = R.drawable.slide14;
        image[14] = R.drawable.slide15;
        image[15] = R.drawable.slide16;
        image[16] = R.drawable.slide17;
        image[17] = R.drawable.slide18;
        image[18] = R.drawable.slide19;
        image[19] = R.drawable.slide20;
        image[20] = R.drawable.slide21;
        image[21] = R.drawable.slide22;
        image[22] = R.drawable.slide23;
        image[23] = R.drawable.slide24;
        image[24] = R.drawable.slide25;
        image[25] = R.drawable.slide26;
        image[26] = R.drawable.slide27;
        image[27] = R.drawable.slide28;
        image[28] = R.drawable.slide29;
        image[29] = R.drawable.slide30;
        image[30] = R.drawable.slide31;
        image[31] = R.drawable.slide32;
        image[32] = R.drawable.slide33;
        image[33] = R.drawable.slide34;
        image[34] = R.drawable.slide35;
        image[35] = R.drawable.slide36;
        image[36] = R.drawable.slide37;
        image[37] = R.drawable.slide38;
        image[38] = R.drawable.slide39;
        image[39] = R.drawable.slide40;
        image[40] = R.drawable.slide41;
        image[41] = R.drawable.slide42;
        image[42] = R.drawable.slide43;
        image[43] = R.drawable.slide44;
        image[44] = R.drawable.slide45;
        image[45] = R.drawable.slide46;
        image[46] = R.drawable.slide47;
        image[47] = R.drawable.slide48;
        image[48] = R.drawable.slide49;
        image[49] = R.drawable.slide50;
        image[50] = R.drawable.slide51;
        image[51] = R.drawable.slide52;
        image[52] = R.drawable.slide53;
        image[53] = R.drawable.slide54;
        image[54] = R.drawable.slide55;
        image[55] = R.drawable.slide56;
        image[56] = R.drawable.slide57;
        image[57] = R.drawable.slide58;
        image[58] = R.drawable.slide59;
        image[59] = R.drawable.slide60;
        image[60] = R.drawable.slide61;
        image[61] = R.drawable.slide62;
        image[62] = R.drawable.slide63;
        image[63] = R.drawable.slide64;
        image[64] = R.drawable.slide65;
        image[65] = R.drawable.slide66;
        image[66] = R.drawable.slide67;
        image[67] = R.drawable.slide68;
        image[68] = R.drawable.slide69;
        image[69] = R.drawable.slide70;*/
        image[0] = R.drawable.slide1;
        image[1] = R.drawable.slide2;
        image[2] = R.drawable.slide3;
        image[3] = R.drawable.slide4;
        image[4] = R.drawable.slide5;
        image[5] = R.drawable.slide6;
        image[6] = R.drawable.slide7;
        image[7] = R.drawable.slide8;
        image[8] = R.drawable.slide9;
        image[9] = R.drawable.slide10;
        image[10] = R.drawable.slide11;
        image[11] = R.drawable.slide12;
        image[12] = R.drawable.slide13;
        image[13] = R.drawable.slide14;
        image[14] = R.drawable.slide15;
        image[15] = R.drawable.slide16;
        image[16] = R.drawable.slide17;
        image[17] = R.drawable.slide18;
        image[18] = R.drawable.slide19;
        image[19] = R.drawable.slide20;
        image[20] = R.drawable.slide21;
        image[21] = R.drawable.slide22;
        image[22] = R.drawable.slide23;
        image[23] = R.drawable.slide24;
        image[24] = R.drawable.slide25;
        image[25] = R.drawable.slide26;
        image[26] = R.drawable.slide27;
        image[27] = R.drawable.slide28;
        image[28] = R.drawable.slide29;
        image[29] = R.drawable.slide30;
        image[30] = R.drawable.slide31;
        image[31] = R.drawable.slide32;
        image[32] = R.drawable.slide33;
        image[33] = R.drawable.slide34;
        image[34] = R.drawable.slide35;
        image[35] = R.drawable.slide36;
        image[36] = R.drawable.slide37;
        image[37] = R.drawable.slide38;
        image[38] = R.drawable.slide39;
        image[39] = R.drawable.slide40;
        image[40] = R.drawable.slide41;
        image[41] = R.drawable.slide42;
        image[42] = R.drawable.slide43;
        image[43] = R.drawable.slide44;
        image[44] = R.drawable.slide45;
        image[45] = R.drawable.slide46;
        image[46] = R.drawable.slide47;
        image[47] = R.drawable.slide48;
        image[48] = R.drawable.slide49;
        image[49] = R.drawable.slide50;
        image[50] = R.drawable.slide51;
        image[51] = R.drawable.slide52;
        image[52] = R.drawable.slide53;
        image[53] = R.drawable.slide54;
        image[54] = R.drawable.slide55;
        image[55] = R.drawable.slide56;
        image[56] = R.drawable.slide57;
        image[57] = R.drawable.slide58;
        image[58] = R.drawable.slide59;
        image[59] = R.drawable.slide60;
        image[60] = R.drawable.slide61;
        image[61] = R.drawable.slide62;
        image[62] = R.drawable.slide63;
        image[63] = R.drawable.slide64;
        image[64] = R.drawable.slide65;
        image[65] = R.drawable.slide66;
        image[66] = R.drawable.slide67;
        image[67] = R.drawable.slide68;
        image[68] = R.drawable.slide69;
        image[69] = R.drawable.slide70;
        iv.setImageResource(image[temp]);

    }


}
