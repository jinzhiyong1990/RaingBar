package com.example.zhiyong.raingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar= findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//                ratingBar: 当前绑定的ratingBar对象
//                rating: 当前rating评分的进度
//                fromUser: 是否由用户触发
                System.out.println("当前ratingBar: 评分" + rating + "是否来自用户: " + fromUser +"每次评分刻度" +
                ratingBar.getStepSize());

            }
        });
    }
}
