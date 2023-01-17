package edu.ucsd.cse110.lab2;

import static org.junit.Assert.assertTrue;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class BetterMainActvityTest {
    @Test
    public void calcTest() {
        try(ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class)) {
            scenario.moveToState(Lifecycle.State.CREATED);
            scenario.moveToState(Lifecycle.State.STARTED);

            scenario.onActivity(activity -> {
                final Button one = activity.findViewById(R.id.btn_one);
                final Button plus = activity.findViewById(R.id.btn_plus);
                final Button equal = activity.findViewById(R.id.btn_equals);
                final TextView disp = activity.findViewById(R.id.display);

                one.performClick();
                plus.performClick();
                one.performClick();
                equal.performClick();

                //System.out.println(disp.getText().toString());

                assertTrue(disp.getText().toString().equals("2"));
            });
        }
    }
}
