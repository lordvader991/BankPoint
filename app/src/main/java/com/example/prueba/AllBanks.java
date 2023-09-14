package com.example.prueba;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.ArrayList;

public class AllBanks extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private FusedLocationProviderClient fusedLocationProviderClient;
    private LocationCallback locationCallback;
    private boolean isFirstLocationUpdate = true;
    private ArrayList<LatLng> coordinatesList; // ArrayList para almacenar las coordenadas
    ImageView image1, image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_banks);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);

        image1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(AllBanks.this, PantallaMenu.class);
                startActivity(intent);
                return false;
            }
        });
        image2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(AllBanks.this, Entidadesfinancieras.class);
                startActivity(intent);
                return false;
            }
        });

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

        coordinatesList = new ArrayList<>();

        coordinatesList.add(new LatLng(-17.728719,-63.166313)); //1 Hipermaxi Supercenter
        coordinatesList.add(new LatLng(-17.755711,-63.2688879)); //2 Domingo Savio
        coordinatesList.add(new LatLng(-17.8102584,-63.2082709));//3 Hipermaxi Las Palmas
        coordinatesList.add(new LatLng(-17.781187,-63.3332507)); //4 Av cañoto
        coordinatesList.add(new LatLng(-17.795368,-63.3048106)); //5 Hipermaxi roca y coronado
        coordinatesList.add(new LatLng(-17.7748637,-63.1741118)); //6 Mercado Chacarrilla
        coordinatesList.add(new LatLng(-17.7778833,-63.2093115)); //7 cerca al Cristo redentor
        coordinatesList.add(new LatLng(-17.7824545,-63.1841092)); //8 Av melchor pinto
        coordinatesList.add(new LatLng(-17.8096168,-63.2135569)); //9 4to anillo doble vía la guardia
        coordinatesList.add(new LatLng(-17.795368,-63.1966639)); //10 Cerca feria barrio lindo
        coordinatesList.add(new LatLng(-17.7941421,-63.209281)); //11 El trompillo
        coordinatesList.add(new LatLng(-17.7457207,-63.1661523)); //12 Av Alemana entrando por calle 4
        coordinatesList.add(new LatLng(-17.7794582,-63.1987071)); //13 Frente a cenetrop
        coordinatesList.add(new LatLng(-17.7683284,-63.2054836)); //14 utepsa
        coordinatesList.add(new LatLng(-17.795368,-63.1651211)); //15 Rotonda de la avenida Pedro marbán
        coordinatesList.add(new LatLng(-17.7539743,-63.2001593)); //16 Ventura


        locationCallback = new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                if (locationResult != null) {
                    Location location = locationResult.getLastLocation();
                    updateCurrentLocation(new LatLng(location.getLatitude(), location.getLongitude()));
                }
            }
        };
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (coordinatesList != null) {
            for (int i = 0; i < coordinatesList.size(); i++) {
                LatLng latLng = coordinatesList.get(i);
                mMap.addMarker(new MarkerOptions().position(latLng).title("Ubicación " + (i + 1))); // Título de cada Ubicación (empieza en 1)
            }

            LatLng firstLocation = coordinatesList.get(0);
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(firstLocation, 15f));
        }
        enableMyLocation();
    }


    private void enableMyLocation() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
            startLocationUpdates();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
        }
    }

    private void startLocationUpdates() {
        LocationRequest locationRequest = LocationRequest.create();
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        locationRequest.setInterval(1000); //aqui se modifica el delay de cuanto queremos que se actualice la ubicacion en milisegundos

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, null);
        }
    }

    private void updateCurrentLocation(LatLng latLng) {
        if (isFirstLocationUpdate) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15f));
            isFirstLocationUpdate = false;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                enableMyLocation();
            }
        }
    }

    @Override //PARA QUE SE PAUSE LA APP Y NO CONSUMA DATOS
    protected void onPause() {
        super.onPause();
        stopLocationUpdates();
    }

    private void stopLocationUpdates() { //IGUAL ESTO
        fusedLocationProviderClient.removeLocationUpdates(locationCallback);
    }
}



