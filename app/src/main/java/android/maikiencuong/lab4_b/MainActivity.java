package android.maikiencuong.lab4_b;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameContent, FrgRecyclerView.newInstance()).commit();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.framTop,FragTop.newInstance("Chat")).commit();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.framBot, Frag_Bot.newInstance()).commit();
    }
}