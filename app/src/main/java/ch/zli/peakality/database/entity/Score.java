package ch.zli.peakality.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Score implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int scoreId;

    public double longitude;

    public double latitude;

    public double altitude;

    public double temperature;

    public String weather;

    public double windSpeed;

    public float airPressure;

}