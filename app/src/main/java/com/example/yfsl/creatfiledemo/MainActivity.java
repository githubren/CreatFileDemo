package com.example.yfsl.creatfiledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File internalFile = getCacheDir();
                String internalPath = internalFile.getPath();
                File file1 = new File(internalPath,"demo1");
                File file2 = new File(internalPath,"demo2/demo");
                File file3 = new File(internalPath,"demo3/demo");
                File file4 = new File(internalPath+"/demo3","demo4");
                File file5 = new File(internalPath,"demo5/demo");
                file2.mkdir();
                file3.mkdirs();
                file4.mkdir();
                try {
                    file1.createNewFile();
                    file5.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
