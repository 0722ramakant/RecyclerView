package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programmingList=findViewById(R.id.programmingLanguage);
        programmingList.setLayoutManager(new LinearLayoutManager(this));

        String[] language={"java","C++","php","c","python","c#"};
        programmingList.setAdapter(new ProgrammingAdapter(language));


    }
}
