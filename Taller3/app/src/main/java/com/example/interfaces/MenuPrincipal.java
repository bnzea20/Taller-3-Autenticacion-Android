package com.example.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.interfaz1.R;

public class MenuPrincipal extends AppCompatActivity {
    private Bundle datos;
    private String correo;
    private TextView titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        datos= this.getIntent().getExtras();
        titulo=findViewById(R.id.menuPrincipal);
        if(datos!=null) {
            correo = datos.getString("correo");
        }
    }
    public void irRecetas(View view){
        Intent i = new Intent(this,Recetas.class);
        startActivity(i);
        /* startActivity(i); */
    }
    public void irAlimentos(View view){
        Intent i = new Intent(MenuPrincipal.this,Alimentos.class);
        startActivity(i);
        /* startActivity(i); */
    }
    public void irPlato(View view){
        Intent i = new Intent(MenuPrincipal.this,SeleccionDeComidas.class);
        startActivity(i);
        /* startActivity(i); */
    }
    public void irConsejos(View view){
        Intent i = new Intent(MenuPrincipal.this,Consejos.class);
        startActivity(i);
        /* startActivity(i); */
    }
    public void irPanelUsuario(View view){
        Intent i = new Intent(MenuPrincipal.this,ControlDeUsuarios.class);
        i.putExtra("correo",correo);
        startActivity(i);
        /* startActivity(i); */
    }
    @Override
    public void onBackPressed() {
        // hacer nada
    }
}
