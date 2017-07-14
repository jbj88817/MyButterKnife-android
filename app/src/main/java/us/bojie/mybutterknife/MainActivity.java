package us.bojie.mybutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @BindView(R.id.tv1)
    private TextView mTextView;
    @BindView(R.id.tv2)
    private TextView mTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        Log.d(TAG, "onCreate: " + mTextView.getText().toString() + " " + mTextView2.getText().toString());
    }
}
