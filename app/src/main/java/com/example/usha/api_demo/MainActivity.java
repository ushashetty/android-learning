package com.example.usha.api_demo;

import android.app.Activity;
import android.app.AlertDialog;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;


public class  MainActivity extends AppCompatActivity  {
       // EditText name, address;
      Button btn_single,btn_auth,btn_all,btn_update;
       // WebView wv;
      //  SQLiteDatabase db;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
               setContentView(R.layout.activity_main);
              btn_single=(Button)findViewById(R.id.button_single);
            btn_auth=(Button)findViewById(R.id.button2_auth);
            btn_update=(Button)findViewById(R.id.button3_update);
            btn_all=(Button)findViewById(R.id.button4_all);

            btn_single.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Inten
                }
            });

               // btn_display.setOnClickListener(new View.OnClickListener() {
                    //    @Override
                      //public void onClick(View v) {
                          //      Intent i=new Intent()
                        }
               // });
     //   }
}





