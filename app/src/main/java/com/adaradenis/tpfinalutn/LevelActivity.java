package com.adaradenis.tpfinalutn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class LevelActivity extends AppCompatActivity implements View.OnClickListener{

    RecyclerView recyclerView;
    ArrayList<Level> levels = new ArrayList<>();
    Button selectLevel;
    boolean isButtonClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        recyclerView = (RecyclerView) findViewById(R.id.list);
        selectLevel = (Button) findViewById(R.id.selectLevel);

        selectLevel.setOnClickListener(this);

        Level level1;

        level1 = new Level();
        level1.setNombre("NIVEL 1");
        level1.setDificultad("Facil");
        levels.add(level1);

        Level level2;
        level2 = new Level();
        level2.setNombre("NIVEL 2");
        level2.setDificultad("Intermedio");
        levels.add(level2);

        Level level3;
        level3 = new Level();
        level3.setNombre("NIVEL 3");
        level3.setDificultad("Avanzado");
        levels.add(level3);

        MyAdapter adapter = new MyAdapter(levels);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id){
            case R.id.selectLevel:
                Intent intent = new Intent(LevelActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }

    }

}
