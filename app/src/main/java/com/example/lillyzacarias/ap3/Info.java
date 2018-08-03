package com.example.lillyzacarias.ap3; /*indica el nombre del paquete donde se encuentra la clase*/

/*los imports que se encuentran aqui son lo que vamos a necesitar para trabajar dentro de la clase*/
import android.app.Activity;
import android.os.Bundle;

public class Info extends Activity{

    /*el Info.java es la actividad de la aplicacion, en esta clase es donde se van
   a definir los metodos y llamadas a otras clases, asi como el funcionamiento de layout*/

    @Override

     /* del metodo OnCretae lo mas importante es la linea de codigo: setContentView(R.layout.activity_main);
    que es la que hace el trabajo de enlazar la parte logica con la parte grafica
     */

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
