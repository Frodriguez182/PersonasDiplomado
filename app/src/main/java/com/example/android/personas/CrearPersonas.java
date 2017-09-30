package com.example.android.personas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearPersonas extends AppCompatActivity {
    private EditText cajaCedula,cajaNombre,cajaApellido;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        cajaCedula = (EditText)findViewById(R.id.txtCedula);
        cajaNombre= (EditText)findViewById(R.id.txtNombre);
        cajaApellido= (EditText)findViewById(R.id.txtApellido);
        res = this.getResources();
    }

    public void guardar(View v){
        String cedula,nombre,apellido;
        cedula = cajaCedula.getText().toString();
        nombre = cajaNombre.getText().toString();
        apellido = cajaApellido.getText().toString();

        Persona p = new Persona(cedula,nombre,apellido);
        p.guardar();

        Toast.makeText(this,res.getString(R.string.mensaje_guardado),Toast.LENGTH_SHORT).show();
        limpiar();
    }

    public void limpiar(View v){
        limpiar();
    }

    private void limpiar(){
        cajaCedula.setText("");
        cajaNombre.setText("");
        cajaApellido.setText("");
        cajaCedula.requestFocus();
    }
}
