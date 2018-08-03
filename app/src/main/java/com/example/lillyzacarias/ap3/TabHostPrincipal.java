package com.example.lillyzacarias.ap3; /*indica el nombre del paquete donde se encuentra la clase*/

/*los imports que se encuentran aqui son lo que vamos a necesitar para trabajar dentro de la clase*/
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class TabHostPrincipal extends TabActivity {

    /*el TabHostPrincipal.java es la actividad de la aplicacion, en esta clase es donde se van
    a definir los metodos y llamadas a otras clases, asi como el funcionamiento de layout*/

    @Override

     /* del metodo OnCretae lo mas importante es la linea de codigo: setContentView(R.layout.activity_main);
    que es la que hace el trabajo de enlazar la parte logica con la parte grafica
     */

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TabHost tab = getTabHost();
        tab.addTab
                (tab.newTabSpec("Tab1").setIndicator
                        ("Info",getResources().getDrawable
                                (android.R.drawable.ic_dialog_info)).setContent
                        (new Intent(this,Info.class)));
        tab.addTab
                (tab.newTabSpec("Tab2").setIndicator
                        ("",getResources().getDrawable
                                (android.R.drawable.ic_menu_today)).setContent
                        (new Intent(this,Info.class)));
        tab.addTab
                (tab.newTabSpec("Tab3").setIndicator
                        ("Alarma",getResources().getDrawable
                                (android.R.drawable.ic_lock_idle_alarm)).setContent
                        (new Intent(this,Info.class).addFlags
                                (Intent.FLAG_ACTIVITY_CLEAR_TOP)));

    }
}
