package anywhere.com.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text_1;
    private TextView text_2;
    private TextView text_3;
    private TextView text_4;
    private EditText edit_first_value;
    private Button btn_go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_first_value =  findViewById(R.id.edit_first_value);
        text_1 = findViewById(R.id.text_1);
        text_2 = findViewById(R.id.text_2);
        text_3 = findViewById(R.id.text_3);
        text_4 = findViewById(R.id.text_4);
        btn_go = findViewById(R.id.btn_go);
        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=edit_first_value.getText().toString();
                Travel travel = null;
                travel = new Travel();

                if( "Car".equalsIgnoreCase(value) )
                {
                    travel.setTravel(new Car());
                }
                else if("Plane".equalsIgnoreCase(value))
                {
                    travel.setTravel(new Plane());
                }

                System.out.println("Mode of Transportation has : "+
                        travel.getvehicle());
                int wheels=travel.wheels();
                int passengers=travel.passenger();
                boolean gas=travel.gas();
                text_1.setText("Transportation type is : "+value);
                text_2.setText("Total number of wheels : "+wheels);
                text_3.setText("Total number of passengers : "+passengers);
                if (gas){
                    text_4.setText("Gas are available : Yes");
                }
                else {
                    text_4.setText("Gas are available : No");
                }

                edit_first_value.setText("");


            }
        });
    }
}
