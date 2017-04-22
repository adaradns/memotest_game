package com.adaradenis.tpfinalutn;

import android.app.Activity;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Adara on 4/21/2017.
 */
public class ScreenManager {

    boolean isButtonClicked = false;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12;
    Button selectLevel;

    public ScreenManager(Activity a, View.OnClickListener buttonsListener)
    {
        /*BUTTONS*/
        btn1 =  (Button) a.findViewById(R.id.btn1);
        btn2 =  (Button) a.findViewById(R.id.btn2);
        btn3 =  (Button) a.findViewById(R.id.btn3);
        btn4 =  (Button) a.findViewById(R.id.btn4);
        btn5 =  (Button) a.findViewById(R.id.btn5);
        btn6 =  (Button) a.findViewById(R.id.btn6);
        btn7 =  (Button) a.findViewById(R.id.btn7);
        btn8 =  (Button) a.findViewById(R.id.btn8);
        btn9 =  (Button) a.findViewById(R.id.btn9);
        btn10 = (Button) a.findViewById(R.id.btn10);
        btn11 = (Button) a.findViewById(R.id.btn11);
        btn12 = (Button) a.findViewById(R.id.btn12);

        /*IMAGES*/
        img1 =  (ImageView) a.findViewById(R.id.img1);
        img2 =  (ImageView) a.findViewById(R.id.img2);
        img3 =  (ImageView) a.findViewById(R.id.img3);
        img4 =  (ImageView) a.findViewById(R.id.img4);
        img5 =  (ImageView) a.findViewById(R.id.img5);
        img6 =  (ImageView) a.findViewById(R.id.img6);
        img7 =  (ImageView) a.findViewById(R.id.img7);
        img8 =  (ImageView) a.findViewById(R.id.img8);
        img9 =  (ImageView) a.findViewById(R.id.img9);
        img10 = (ImageView) a.findViewById(R.id.img10);
        img11 = (ImageView) a.findViewById(R.id.img11);
        img12 = (ImageView) a.findViewById(R.id.img12);

        /*LAYOUTS
        selectLevel = (LinearLayout) a.findViewById(R.id.selectLevel);
*/
        /*TEXTS
        txtTime = (TextView) a.findViewById(R.id.txtTime);
        txtTime2 = (TextView) a.findViewById(R.id.txtTime2);
        */
        /*Listeners*/
        btn1.setOnClickListener(buttonsListener);
        btn2.setOnClickListener(buttonsListener);
        btn3.setOnClickListener(buttonsListener);
        btn4.setOnClickListener(buttonsListener);
        btn5.setOnClickListener(buttonsListener);
        btn6.setOnClickListener(buttonsListener);
        btn7.setOnClickListener(buttonsListener);
        btn8.setOnClickListener(buttonsListener);
        btn9.setOnClickListener(buttonsListener);
        btn10.setOnClickListener(buttonsListener);
        btn11.setOnClickListener(buttonsListener);
        btn12.setOnClickListener(buttonsListener);

        /*selectLevel.setOnClickListener(buttonsListener);*/

        /*new CountDownTimer(1000, 1000)
        {

            @Override
            public void onTick(long millisUntilFinished) {
                img1.setVisibility(View.VISIBLE);
                img2.setVisibility(View.VISIBLE);
                img3.setVisibility(View.VISIBLE);
                img4.setVisibility(View.VISIBLE);
                img5.setVisibility(View.VISIBLE);
                img6.setVisibility(View.VISIBLE);
                img7.setVisibility(View.VISIBLE);
                img8.setVisibility(View.VISIBLE);
                img9.setVisibility(View.VISIBLE);
                img10.setVisibility(View.VISIBLE);
                img11.setVisibility(View.VISIBLE);
                img12.setVisibility(View.VISIBLE);
            }

            @Override
            public void onFinish() {

            }
        }.start();*/
    }


}
