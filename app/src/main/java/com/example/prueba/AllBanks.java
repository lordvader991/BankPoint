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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;
import java.util.Map;

public class AllBanks extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private FusedLocationProviderClient fusedLocationProviderClient;
    private LocationCallback locationCallback;
    private boolean isFirstLocationUpdate = true;
    private HashMap<String, LatLng> coordinatesMap;
    private HashMap <String, LatLng> union;
    private HashMap <String, LatLng> bnb;
    private HashMap <String, LatLng> economico;
    private HashMap <String, LatLng> mercantil;
    private HashMap <String, LatLng> ganadero;
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

        coordinatesMap = new HashMap<>();
        coordinatesMap.put("sobre la avenida ARGOMOSA (Centro)", new LatLng(-17.782627207493658, -63.172503848082854));
        coordinatesMap.put("shopping fidalga por el avion pirata", new LatLng(-17.77666063548545, -63.17332352256182));
        coordinatesMap.put("av. Irala Casco Viejo",new LatLng(-17.792549343473127, -63.185273958744396));
        coordinatesMap.put("Mega Center",new LatLng(-17.797333866919363, -63.178360970189225));
        coordinatesMap.put("Hipermaxi pampa de la isla",new LatLng(-17.771326, -63.124664));
        coordinatesMap.put("Patio de Comidas Belen",new LatLng(-17.7330504,-63.1696092));
        coordinatesMap.put("Las Brisas",new LatLng(-17.749483, -63.176156));
        coordinatesMap.put("Av San Martín",new LatLng(-17.759927, -63.198875));
        coordinatesMap.put("Centro Comercial IC Norte",new LatLng(-17.7729421,-63.2042411));
        coordinatesMap.put("Hipermaxi Av Roca y Coronado",new LatLng(-17.785064, -63.211889));
        coordinatesMap.put("Hipermaxi Villa 1° de Mayo",new LatLng(-17.7980908,-63.1350641));
        coordinatesMap.put("Calle 24 de Septiembre",new LatLng(-17.775521, -63.182084));
        coordinatesMap.put("Av Mutualista",new LatLng(-17.765076, -63.161030));
        coordinatesMap.put("Av Cañoto",new LatLng(-17.781782, -63.189081));
        coordinatesMap.put("Av Grigotá 1er y 2do anillo",new LatLng(-17.796582, -63.190766));
        coordinatesMap.put("Av Paraguá entre 3er y 4to anillo",new LatLng(-17.768347, -63.153268));
        coordinatesMap.put("Hipermaxi 6to anillo",new LatLng(-17.728842, -63.166336));
        coordinatesMap.put("Av Virgen de Cotoca ",new LatLng(-17.771173, -63.124526));
        coordinatesMap.put("Terminal  Bimodal",new LatLng(-17.789398, -63.162193));
        coordinatesMap.put("Av Argomosa 1er anillo",new LatLng(-17.782664, -63.172458));


        union = new HashMap<>();
        union.put("Av. Cañoto",new LatLng(-17.781158356263802, -63.189053070563055));
        union.put("Av. Irala",new LatLng(-17.792060497455026, -63.17794603227116));
        union.put("IC NORTE - Av. 3er anillo",new LatLng(-17.772952549274446, -63.203545269061294));
        union.put("Av. Centenario",new LatLng(-17.77887193160621, -63.19124337872135));
        union.put("Calle Libertad",new LatLng(-17.781926110903164, -63.18276224320779));
        union.put("Avión Pirata",new LatLng(-17.77652618531688, -63.17325807117722));
        union.put("Biopetrol Virgen de Cotoca",new LatLng(-17.781250343326764, -63.16365585595465));
        union.put("Av. Tres pasos al frente",new LatLng(-17.794235924168344, -63.1606933971127));
        union.put("Radial 12",new LatLng(-17.806880151482417, -63.17177707948146));
        union.put("Ave Colectora",new LatLng(-17.822927303180492, -63.165494623563916));
        union.put("Av. Santos Dumont",new LatLng(-17.814425, -63.182739));
        union.put("Av. Grigotá",new LatLng(-17.799970386039934, -63.195690482373564));
        union.put("Doble Via la Guardia",new LatLng(-17.80956847693758, -63.20826717345417));
        union.put("Hipermaxi Supercenter",new LatLng(-17.728551, -63.166230));
        union.put("Av Santos Dumont 5to anillo",new LatLng(-17.832985, -63.184659));
        union.put("Av Viedma",new LatLng(-17.78343209077971, -63.171315037565215));

        bnb = new HashMap<>();
        bnb.put("Av. 4to Anillo; Av. Banzer",new LatLng(-17.74940184829504, -63.174700787350794));
       /* bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());
        bnb.put("",new LatLng());*/
        economico = new HashMap<>();
        mercantil = new HashMap<>();
        ganadero = new HashMap<>();



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
        //BANCO BCP
        for (Map.Entry<String, LatLng> entry : coordinatesMap.entrySet()) {
            String locationName = entry.getKey();
            LatLng latLng = entry.getValue();

            MarkerOptions markerOptions = new MarkerOptions()
                    .position(latLng)
                    .title(locationName)
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.bcpmarker));

            mMap.addMarker(markerOptions);
        }
        if (!coordinatesMap.isEmpty()) {
            LatLng firstLocation = coordinatesMap.values().iterator().next();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(firstLocation, 15f));
        }

        //BANCO UNION
        for (Map.Entry<String, LatLng> entry : union.entrySet()) {
            String locationName = entry.getKey();
            LatLng latLng = entry.getValue();

            MarkerOptions markerOptions1 = new MarkerOptions()
                    .position(latLng)
                    .title(locationName)
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.unionmarker));

            mMap.addMarker(markerOptions1);
        }

        if (!union.isEmpty()) {
            LatLng firstLocation = union.values().iterator().next();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(firstLocation, 15f));
        }

        //BANCO BNB
        for (Map.Entry<String, LatLng> entry : bnb.entrySet()) {
            String locationName = entry.getKey();
            LatLng latLng = entry.getValue();

            MarkerOptions markerOptions2 = new MarkerOptions()
                    .position(latLng)
                    .title(locationName)
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.bnbmarker));

            mMap.addMarker(markerOptions2);
        }

        if (!bnb.isEmpty()) {
            LatLng firstLocation = bnb.values().iterator().next();
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
        locationRequest.setInterval(1000);

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

    @Override
    protected void onPause() {
        super.onPause();
        stopLocationUpdates();
    }

    private void stopLocationUpdates() {
        fusedLocationProviderClient.removeLocationUpdates(locationCallback);
    }
}
