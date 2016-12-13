package com.king_mi.customcarcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.cv_counter)
    CounterView cvCounter;
    @BindView(R.id.tv_show_count)
    TextView tvShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        cvCounter.setMaxValue(5);
        cvCounter.setCallback(callback);
    }


    private IChangeCoutCallback callback = new IChangeCoutCallback() {
        @Override
        public void change(int count) {            //总价变化
            tvShowCount.setText("我变成了" + count);
        }
    };
}
