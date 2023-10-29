package co.edu.ue.hospedaje2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registroTTransaccion extends AppCompatActivity {

    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_persona);
        begin();

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irVolver = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(irVolver);
            }
        });
    }
    private void begin(){
        this.btnVolver = findViewById(R.id.btnVolver);
    }
}