package co.edu.ue.hospedaje2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnPersona;
    private Button btncambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        begin();
        //2da Forma de hacer Eventos -> Onlclick

        btnPersona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irPersona = new Intent(getApplicationContext(),registroPersona.class);
                startActivity(irPersona);
            }
        });



    }


    public void goTrans(View view){
        Intent intent = new Intent(getApplicationContext(), RegisterTransaccion.class);
        startActivity(intent);

    }
    private void begin(){
        this.btnPersona = findViewById(R.id.btnPerson);
        this.btncambio= findViewById(R.id.btnTransaccio);

    }
}
