package ch.zli.peakality.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Score {

    @PrimaryKey(autoGenerate = true)
    private int scoreId;

    public String longitude;

    public String latitude;

    public String altitude;

    public double temperature;

    public String weather;

    public double windSpeed;

    public double airPressure;

    public Score(int scoreId) {
        this.scoreId = scoreId;
    }

}
