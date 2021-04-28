package id.ac.umn.w12_27137.TutorialDeteksiSensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import id.ac.umn.w12_27137.R;

public class DeteksiSensorActivity extends AppCompatActivity {
    private TextView tvDaftarSensor;
    private SensorManager mSensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deteksi_sensor);

        tvDaftarSensor = findViewById(R.id.daftarSensor);
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> daftarSensor = mSensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder sensorText = new StringBuilder();
        for (Sensor currentSensor : daftarSensor ) {
            sensorText.append(currentSensor.getName()).append(
                    System.getProperty("line.separator"));
        }
        tvDaftarSensor.setText(sensorText);
    }
}