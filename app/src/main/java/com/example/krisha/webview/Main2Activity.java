package com.example.krisha.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;


public class Main2Activity extends AppCompatActivity {

     Button b;
     WebView vv;
     EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ClickUrl();
    }

    public void ClickUrl(){
        b=(Button)findViewById(R.id.button2);
        vv=(WebView)findViewById(R.id.WebView);
        ed=(EditText)findViewById(R.id.editText);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=ed.getText().toString();
                vv.getSettings().setLoadsImagesAutomatically(true);
                vv.getSettings().setJavaScriptEnabled(true);
                vv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                vv.loadUrl(s);
            }
        });
    }
}
