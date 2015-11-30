package com.example.abed.random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;
import org.w3c.dom.Text;

import java.util.Random;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button checked = (Button)findViewById(R.id.button2);

        checked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText texter =(EditText) findViewById(R.id.editText);
                int number=Integer.parseInt(texter.getText().toString());
                TextView text = (TextView)findViewById(R.id.textView);



                Button button1 = (Button)findViewById(R.id.button);
                Button button2 = (Button)findViewById(R.id.button2);


                if(number==x){
                    text.setText(x + "");Toast.makeText(getApplicationContext(), "Equal!", Toast.LENGTH_SHORT).show();
                    button1.setEnabled(true);button2.setEnabled(false);
                }
                else if(Math.abs((x-number))<5){
                    Toast.makeText(getApplicationContext(),"reach",Toast.LENGTH_SHORT).show();
                }

                else if(number > x)
                    Toast.makeText(getApplicationContext(),"bigger",Toast.LENGTH_SHORT).show();
                else
                if(number<x)
                    Toast.makeText(getApplicationContext(),"Smaller",Toast.LENGTH_SHORT).show();

            }
        });
    }
    private int x;


    public void calculate(View v){

        Button getAnswerButton =(Button)findViewById(v.getId());
        EditText complex =(EditText) findViewById(R.id.editText);
        TextView text = (TextView)findViewById(R.id.textView);
        TextView text1=(TextView)findViewById(R.id.textView2);
        Button getreply=(Button)findViewById(R.id.button2);

        getAnswerButton .setEnabled(false);
        getreply.setEnabled(true);
        complex.setVisibility(View.VISIBLE);
        text.setVisibility(View.VISIBLE);
        text1.setVisibility(View.VISIBLE);
        getreply.setVisibility(View.VISIBLE);
        complex.setText("");
        text.setText("Anonymous Number");
        x= new Random().nextInt(1000);
    }
}
