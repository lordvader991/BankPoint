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
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
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
        ubicacionesLugar1.add(new Ubicacion(-17.728719,-63.166313, "Hipermaxi Supercenter"));
        ubicacionesLugar1.add(new Ubicacion(-17.7557677,-63.1722757, "Domingo Savio"));
        ubicacionesLugar1.add(new Ubicacion(-17.7539786,-63.1996628, "Ventura Mall"));
        ubicacionesLugar1.add(new Ubicacion(-17.767475, -63.143535, "Distrito industrial por Av trasvesal 1"));
        ubicacionesLugar1.add(new Ubicacion(-17.781187,-63.3332507,"Av Cañoto"));
        ubicacionesLugar1.add(new Ubicacion(-17.8102584,-63.2082709,"Hipermaxi las palmas"));
        ubicacionesLugar1.add(new Ubicacion(-17.795368,-63.3048106,"Hipermaxi roca y coronado"));
        ubicacionesLugar1.add(new Ubicacion(-17.7748637,-63.1741118,"Mercado Chacarrilla"));
        ubicacionesLugar1.add(new Ubicacion(-17.7778833,-63.2093115,"cerca al monumento Cristo Redentor"));
        ubicacionesLugar1.add(new Ubicacion(-17.7824545,-63.1841092,"av Melchor Pinto"));
        ubicacionesLugar1.add(new Ubicacion(-17.8096168,-63.2135569,"4to anillo doble vía la guardia"));
        ubicacionesLugar1.add(new Ubicacion(-17.795368,-63.1966639,"Cerca feria Barrio Lindo"));
        ubicacionesLugar1.add(new Ubicacion(-17.7941421,-63.209281,"El trompillo"));
        ubicacionesLugar1.add(new Ubicacion(-17.7457207,-63.1661523,"av Alemana entrando por calle 4"));
        ubicacionesLugar1.add(new Ubicacion(-17.7794582,-63.1987071,"Frente a cenetrop"));
        ubicacionesLugar1.add(new Ubicacion(-17.7683284,-63.2054836,"utepsa"));
        ubicacionesLugar1.add(new Ubicacion(-17.795368,-63.1651211,"Rotonda de la avenida Pedro Marbán"));
        ubicacionesLugar1.add(new Ubicacion(-17.755191023015392, -63.1721025454328,"Beni entre 3er y 4to anillo"));
        ubicacionesLugar1.add(new Ubicacion(-17.766583811916213, -63.19417544588414,"Av San Martin"));
        ubicacionesLugar1.add(new Ubicacion(-17.77135863321891, -63.18733848610794,"2do anillo canal Isuto"));
        ubicacionesLugar1.add(new Ubicacion(-17.77908772893547, -63.19410211065381,"Hernando Sanabria 2do anillo"));
        ubicacionesLugar1.add(new Ubicacion(-17.788931958212167, -63.18778971396487,"Av cañoto casi llegando a la ramada"));
        ubicacionesLugar1.add(new Ubicacion(-17.798165648792388, -63.178970292333304,"El trompillo, Santos Dumont"));
        ubicacionesLugar1.add(new Ubicacion(-17.768598167981636, -63.17094344227245,"Alemana Av Japon"));
        ubicacionesLugar1.add(new Ubicacion(-17.7820151959431, -63.16350978458058,"Biopetrol virgen de cotoca"));
        ubicacionesLugar1.add(new Ubicacion(-17.795161593583817, -63.16063257653148,"Tres pasos al frente, pedro marban"));
        ubicacionesLugar1.add(new Ubicacion(-17.82336596934906, -63.16512933985187,"ave recolectora casi radial 12"));
        ubicacionesLugar1.add(new Ubicacion(-17.785386584236104, -63.204178762036136,"Roca y coronado, roque aguilera"));
        ubicacionesLugar1.add(new Ubicacion(-17.79278405829532, -63.20144867636005,"Av pirai, esq Moile"));
        ubicacionesLugar1.add(new Ubicacion(-17.78967661150342, -63.1622907085801,"Terminal bimodal"));
        ubicacionesLugar1.add(new Ubicacion(-17.71690785034076, -63.1625317929188,"Remanso 8vo anillo"));
        ubicacionesLugar1.add(new Ubicacion(-17.798188954916377, -63.17553249996259,"Madre India"));
        ubicacionesLugar1.add(new Ubicacion(-17.774902658272538, -63.18232631535522,"1er anillo palacio de justicia"));
        ubicacionesLugar1.add(new Ubicacion(-17.774855980683135, -63.174819815884014,"Av cañoto, justiniano"));
        ubicacionesLugar1.add(new Ubicacion(-17.75823572393573, -63.14175246295036,"Parque Industrial"));
        ubicacionesLugar1.add(new Ubicacion(-17.75591275380727, -63.16579671445474,"Alemana 3er anillo externo y 4to circunvalacion"));
        ubicacionesLugar1.add(new Ubicacion(-17.80545090901727, -63.15488461059469,"Radial 10 4to anillo"));
        ubicacionesLugar1.add(new Ubicacion(-17.746643693951114, -63.17561038373896,"Las brisas"));
        ubicacionesLugar1.add(new Ubicacion(-17.78319491404813, -63.18483134372722,"Sergio suarez figueroa"));
        ubicacionesLugar1.add(new Ubicacion(-17.784900550220325, -63.17099001208038,"Av viedma, moldes"));
        ubicacionesLugar1.add(new Ubicacion(-17.778229379942175, -63.14294393564685,"Virgen de cotoca, 4to anillo"));
        ubicacionesLugar1.add(new Ubicacion(-17.774050470325665, -63.215816191556954,"4to anillo av centenario"));
        ubicacionesLugar1.add(new Ubicacion(-17.761136064335663, -63.16260116425972,"3er anillo mutualista"));
        ubicacionesLugar1.add(new Ubicacion(-17.797915144316903, -63.195560148908335,"grigota entre roque aguilera y trompillo"));
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
        List<Ubicacion> ubicacionesLugar5 = new ArrayList<>();
       /* ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());
        ubicacionesLugar5.add(new Ubicacion());*/
        mostrarMapa(ubicacionesLugar5);
    }
    public void mostrarMapaLugar6 (View view){ //Banco Economico
        List<Ubicacion> ubicacionesLugar6 = new ArrayList<>();
        ubicacionesLugar6.add(new Ubicacion(-17.715260, -63.166225, "Av El remanso"));
        ubicacionesLugar6.add(new Ubicacion(-17.800527, -63.195131,"Av Grigotá"));
        ubicacionesLugar6.add(new Ubicacion(-17.749973, -63.185313,"Hipermaxi Radial 26"));
        ubicacionesLugar6.add(new Ubicacion(-17.774705, -63.165496,"A market 2do anillo"));
        ubicacionesLugar6.add(new Ubicacion(-17.737307, -63.153722, "Av Alemana 6to anillo"));
        ubicacionesLugar6.add(new Ubicacion(-17.751519, -63.163351,"Av Alemana 4to anillo"));
        ubicacionesLugar6.add(new Ubicacion(-17.822424, -63.145200,"Av Paurito"));
        ubicacionesLugar6.add(new Ubicacion(-17.780210, -63.148144,"Av virgen de Cotoca 4to anillo"));
        ubicacionesLugar6.add(new Ubicacion(-17.818503, -63.200034,"4to anillo"));
        ubicacionesLugar6.add(new Ubicacion(-17.794931, -63.160899,"Hipermaxi 3 pasos al frente"));
        ubicacionesLugar6.add(new Ubicacion(-17.757559, -63.166033,"Av Alemana Tercer y Cuarto anillo"));
        ubicacionesLugar6.add(new Ubicacion(-17.755359, -63.171943,"Av Beni"));
        ubicacionesLugar6.add(new Ubicacion(-17.715263, -63.166181,"Av el Remanso"));
        ubicacionesLugar6.add(new Ubicacion(-17.849698, -63.182609,"Av Santos Dumont"));
        ubicacionesLugar6.add(new Ubicacion(-17.771585, -63.124547,"Hipermaxi Pampa de la isla"));
        ubicacionesLugar6.add(new Ubicacion(-17.728470, -63.166400,"Hipermaxi 6to anillo"));
        ubicacionesLugar6.add(new Ubicacion(-17.772202, -63.188533,"Av Cristobal mendoza 2do anillo"));
        ubicacionesLugar6.add(new Ubicacion(-17.749437, -63.176234,"Las brisas"));
        ubicacionesLugar6.add(new Ubicacion(-17.759757, -63.178234,"Hipermaxi 3er anillo"));
        ubicacionesLugar6.add(new Ubicacion(-17.768934, -63.171066,"Surtidor Bio Petrol"));
        ubicacionesLugar6.add(new Ubicacion(-17.785502, -63.204234,"Av Roca y coronado"));
        ubicacionesLugar6.add(new Ubicacion(-17.841967, -63.195830,"Hipermaxi Suc. España"));
        ubicacionesLugar6.add(new Ubicacion(-17.765861, -63.159033,"Hipermaxi Mutualista"));
        ubicacionesLugar6.add(new Ubicacion(-17.771631, -63.182269,"Av Monseñor Rivero"));
        ubicacionesLugar6.add(new Ubicacion(-17.799595, -63.168679,"Av San Aurelio"));
        ubicacionesLugar6.add(new Ubicacion(-17.773015, -63.154218,"Tercer Anillo Externo"));
        ubicacionesLugar6.add(new Ubicacion(-17.798991, -63.149627,"Av tres Pasos al frente 4to anillo"));
        ubicacionesLugar6.add(new Ubicacion(-17.788614, -63.187678,"Av Cañoto Primer Anillo"));
        ubicacionesLugar6.add(new Ubicacion(-17.7863611,-63.185295,"Calle Camiri"));
        ubicacionesLugar6.add(new Ubicacion(-17.7840495,-63.1835585,"Calle Ayacucho"));
        ubicacionesLugar6.add(new Ubicacion(-17.756932, -63.200419,"Hipermaxi San Martin"));
        ubicacionesLugar6.add(new Ubicacion(-17.827669, -63.225934,"Doble Via la Guardia"));
        mostrarMapa(ubicacionesLugar6);

    }

    private void mostrarMapa(List<Ubicacion> ubicaciones) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("UBICACIONES", (ArrayList<Ubicacion>) ubicaciones);
        startActivity(intent);
    }


}