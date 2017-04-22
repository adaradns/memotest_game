package com.adaradenis.tpfinalutn;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Adara on 4/21/2017.
 */
public class Controller implements View.OnClickListener {

    private int valor;
    private ScreenManager screenManager;

    public void setScreenManager(ScreenManager sm) {
        this.screenManager = sm;
    }

    @Override
    public void onClick(View view) {
        valor = view.getId();

        try {
            switch (valor){
                case R.id.btn1:
                    screenManager.img1.setVisibility(View.VISIBLE);
                    screenManager.btn1.setVisibility(View.GONE);
                    break;
                case R.id.btn2:
                    screenManager.img2.setVisibility(View.VISIBLE);
                    screenManager.btn2.setVisibility(View.GONE);
                    break;
                case R.id.btn3:
                    screenManager.img3.setVisibility(View.VISIBLE);
                    screenManager.btn3.setVisibility(View.GONE);
                    break;
                case R.id.btn4:
                    screenManager.img4.setVisibility(View.VISIBLE);
                    screenManager.btn4.setVisibility(View.GONE);
                    break;
                case R.id.btn5:
                    screenManager.img5.setVisibility(View.VISIBLE);
                    screenManager.btn5.setVisibility(View.GONE);
                    break;
                case R.id.btn6:
                    screenManager.img6.setVisibility(View.VISIBLE);
                    screenManager.btn6.setVisibility(View.GONE);
                    break;
                case R.id.btn7:
                    screenManager.img7.setVisibility(View.VISIBLE);
                    screenManager.btn7.setVisibility(View.GONE);
                    break;
                case R.id.btn8:
                    screenManager.img8.setVisibility(View.VISIBLE);
                    screenManager.btn8.setVisibility(View.GONE);
                    break;
                case R.id.btn9:
                    screenManager.img9.setVisibility(View.VISIBLE);
                    screenManager.btn9.setVisibility(View.GONE);
                    break;
                case R.id.btn10:
                    screenManager.img10.setVisibility(View.VISIBLE);
                    screenManager.btn10.setVisibility(View.GONE);
                    break;
                case R.id.btn11:
                    screenManager.img11.setVisibility(View.VISIBLE);
                    screenManager.btn11.setVisibility(View.GONE);
                    break;
                case R.id.btn12:
                    screenManager.img12.setVisibility(View.VISIBLE);
                    screenManager.btn12.setVisibility(View.GONE);
                    break;
            }
        }catch (Exception e) {
            screenManager.img1.setVisibility(View.GONE);
        }
    }
}
