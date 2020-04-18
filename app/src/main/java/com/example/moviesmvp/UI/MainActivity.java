package com.example.moviesmvp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.moviesmvp.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,MovieView{

    TextView textView;
    Button button;
    MoviePresenter moviePresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.tv);
        button=findViewById(R.id.btn);
        button.setOnClickListener(this);
        moviePresenter=new MoviePresenter(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btn){
            moviePresenter.getMovie();
        }
    }

    @Override
    public void onGetMovie(String movie) {
        textView.setText(movie);
    }
}
