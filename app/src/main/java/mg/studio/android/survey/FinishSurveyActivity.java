package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.app.Activity;

import java.util.LinkedList;
import java.util.List;

public class FinishSurveyActivity extends AppCompatActivity {
    private Button button1;
    public static List<Activity> activityList = new LinkedList();

    public void exit()

    {
        for(Activity act:activityList)
        {
            act.finish();
        }
        System.exit(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_survey);
        button1 = (Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                exit();
            }

        });
    }
}
