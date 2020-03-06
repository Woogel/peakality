package ch.zli.peakality;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ch.zli.peakality.database.entity.Score;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ScoreActivity extends Activity {

    private Score score;

    public static final String SCORE_EXTRA_NAME = "score_extra";

    FloatingActionButton shareScoreButton;

    TextView positionView;

    TextView temperatureView;

    TextView pressureView;

    TextView altitudeView;

    TextView dateView;

    TextView weatherView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        score = (Score) getIntent().getSerializableExtra(SCORE_EXTRA_NAME);
        shareScoreButton = findViewById(R.id.fabShareScore);

        shareScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                // @TODO: Set actual score.
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "My score is: " + score.getAirPressure());
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
            }
        });
    }

    private void updateMeasuredValues(Score score) {

    }
}
