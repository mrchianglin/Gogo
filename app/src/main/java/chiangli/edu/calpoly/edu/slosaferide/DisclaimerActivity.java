package chiangli.edu.calpoly.edu.slosaferide;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class DisclaimerActivity extends AppCompatActivity {

    private static final String TAG = "DisclaimerActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);

        timeToSignIn();
        Log.e(TAG, "onCreate");
    }

    public void timeToSignIn(){
        // wait 5 seconds
        // go to next activity

        new CountDownTimer(5000, 1000) {
            public void onFinish() {
                Intent startActivity = new Intent(DisclaimerActivity.this, HomeActivity.class);
                DisclaimerActivity.this.startActivity(startActivity);
                finish();
            }

            public void onTick(long millisUntilFinished) {
                Log.e(TAG, "onTick: " + millisUntilFinished);
            }

        }.start();
    }
}
