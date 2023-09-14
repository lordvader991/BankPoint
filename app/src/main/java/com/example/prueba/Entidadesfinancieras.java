package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Entidadesfinancieras extends AppCompatActivity {
    ImageView banco1, banco2, banco3, banco4, banco5, banco6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entidadesfinancieras);
        banco1 =findViewById(R.id.banco1);
        banco2 =findViewById(R.id.banco2);
        banco3 =findViewById(R.id.banco3);
        banco4 =findViewById(R.id.banco4);
        banco5 =findViewById(R.id.banco5);
        banco6 =findViewById(R.id.banco6);
    }
    public void mostrarMapaLugar1 (View view){ //banco mercantil
        List<Ubicacion> ubicacionesLugar1 = new ArrayList<>();
        ubicacionesLugar1.add(new Ubicacion(-17.728719,-63.166313, "Hipermaxi"));
        ubicacionesLugar1.add(new Ubicacion(-17.7557677,-63.1722757, "Domingo Savio"));
        ubicacionesLugar1.add(new Ubicacion(-17.7539786,-63.1996628, "Ventura Mall"));
        ubicacionesLugar1.add(new Ubicacion(-17.767475, -63.143535, "Parque Industrial"));
        ubicacionesLugar1.add(new Ubicacion(-17.781183, -63.189088,"Av Cañoto"));
        mostrarMapa(ubicacionesLugar1);
    }
    public void mostrarMapaLugar2 (View view){ //banco ganadero
        List<Ubicacion> ubicacionesLugar2 = new ArrayList<>();
        ubicacionesLugar2.add(new Ubicacion(-17.728879, -63.166239, "Hipermaxi - Supercenter"));
        ubicacionesLugar2.add(new Ubicacion(-17.750249, -63.1760894, "4to anillo Le mans"));
        ubicacionesLugar2.add(new Ubicacion(-17.7729902,-63.2040003, "IC Norte"));
        ubicacionesLugar2.add(new Ubicacion(-17.759963, -63.178402, "3er anillo Banzer Hipermaxi"));
        ubicacionesLugar2.add(new Ubicacion(-17.771586, -63.124334, "Hipermaxi Pampa de la Isla"));
        ubicacionesLugar2.add(new Ubicacion(-17.7920314,-63.1812892, "Av Irala y Rene Moreno"));
        ubicacionesLugar2.add(new Ubicacion(-17.772202, -63.188502, "Av Cristobal de  Mendoza y Av La Salle"));
        ubicacionesLugar2.add(new Ubicacion(-17.778495, -63.188664, "Av Cañoto"));
        ubicacionesLugar2.add(new Ubicacion(-17.784617, -63.195342, "2do anillo Av Landivar"));
        ubicacionesLugar2.add(new Ubicacion(-17.7821946,-63.1982162, "Calle Bibosi"));
        ubicacionesLugar2.add(new Ubicacion(-17.799411, -63.193881, "Av Grigotá"));
        ubicacionesLugar2.add(new Ubicacion(-17.782289, -63.163389, "Av Virgen de Cotoca"));
        ubicacionesLugar2.add(new Ubicacion(-17.755446, -63.171994, "Av Beni"));
        ubicacionesLugar2.add(new Ubicacion(-17.767304, -63.156498, "3er anillo externo C Ponce León"));
        ubicacionesLugar2.add(new Ubicacion(-17.798987, -63.169203, "Av El Trompillo"));
        ubicacionesLugar2.add(new Ubicacion(-17.7951181,-63.1612565, "Hipermaxi 3 Pasos al Frente"));
        ubicacionesLugar2.add(new Ubicacion(-17.762904, -63.163260, "Av Tercer Anillo interno"));
        ubicacionesLugar2.add(new Ubicacion(-17.789879, -63.194875, "Hipermaxi Piraí"));
        ubicacionesLugar2.add(new Ubicacion(-17.821235, -63.218619, "Doble vía la Guardia"));
        mostrarMapa(ubicacionesLugar2);
    }
    public void mostrarMapaLugar3 (View view){ //banco BCP

    }
    public void mostrarMapaLugar4 (View view){ //Banco Union
        List<Ubicacion> ubicacionesLugar4 = new ArrayList<>();
        ubicacionesLugar4.add(new Ubicacion(-17.781158356263802, -63.189053070563055, "Av. Cañoto"));
        ubicacionesLugar4.add(new Ubicacion(-17.792060497455026, -63.17794603227116, "Av. Irala"));
        ubicacionesLugar4.add(new Ubicacion(-17.772952549274446, -63.203545269061294, "IC-NORTE Av. 3er anillo"));
        ubicacionesLugar4.add(new Ubicacion(-17.77887193160621, -63.19124337872135, "Av. Centenario"));
        ubicacionesLugar4.add(new Ubicacion(-17.781926110903164, -63.18276224320779, "Calle Libertad"));
        ubicacionesLugar4.add(new Ubicacion(-17.77652618531688, -63.17325807117722, "Avion Pirata"));
        ubicacionesLugar4.add(new Ubicacion(-17.781250343326764, -63.16365585595465, "Biopetrol Virgen de Cotoca"));
        ubicacionesLugar4.add(new Ubicacion(-17.794235924168344, -63.1606933971127, "Av. Tres pasos al frente"));
        ubicacionesLugar4.add(new Ubicacion(-17.806880151482417, -63.17177707948146, "Radial 12"));
        ubicacionesLugar4.add(new Ubicacion(-17.822927303180492, -63.165494623563916, "Ave. Colectora"));
        ubicacionesLugar4.add(new Ubicacion(-17.81382335114142, -63.182631252963176, "Av. Santos Dumont"));
        ubicacionesLugar4.add(new Ubicacion(-17.799970386039934, -63.195690482373564, "Av.Grigotá"));
        ubicacionesLugar4.add(new Ubicacion(-17.80956847693758, -63.20826717345417, "Doble Vía a la Guardia"));
        ubicacionesLugar4.add(new Ubicacion(-17.725563000215875, -63.16584527047101, "Hipermaxi Supercenter"));
        ubicacionesLugar4.add(new Ubicacion(-17.83028598590472, -63.18553839771136, "Av. Santos Dumont 5to anillo"));
        ubicacionesLugar4.add(new Ubicacion(-17.78343209077971, -63.171315037565215, "Av. Viedma"));
        mostrarMapa(ubicacionesLugar4);
    }
    public void mostrarMapaLugar5 (View view){// Banco BNB

    }
    public void mostrarMapaLugar6 (View view){ //Banco Economico

    }

    private void mostrarMapa(List<Ubicacion> ubicaciones) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("UBICACIONES", (ArrayList<Ubicacion>) ubicaciones);
        startActivity(intent);
    }


}