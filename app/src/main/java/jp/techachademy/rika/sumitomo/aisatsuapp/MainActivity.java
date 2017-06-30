package jp.techachademy.rika.sumitomo.aisatsuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.tpd1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.bt1);
        button2.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView);

    @Override
    public void onClick(View v){
            if(v.getId()==R.id.tpd1){
                showTimePickerDialog();
            }else if(v.getId==R.id.bt1){
                mTextView.setText(String.valueOf(hourOfDay)+ ":" + String.valueOf(minute));
            }
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                @Override
                public void onClick(View v) {
                    Log.d("UI_PARTS", "ボタンをタップしました");
                }


            TextView textView = (TextView) findViewById(R.id.textView);
    }

    private void showTimePickerDialog(){
        TimePickerDialog tpd= new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener(){
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Log.d("UI-PARTS", String.valueOf(hourOfDay) + ":" + String.valueOf(minute));
                    }
                },13,0,
                true);
        tpd.show();
    }


    TextView textView = (TextView) findViewById(R.id.tv1);
}
