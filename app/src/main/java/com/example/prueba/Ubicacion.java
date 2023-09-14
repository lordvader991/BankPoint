package com.example.prueba;
import android.os.Parcel;
import android.os.Parcelable;

public class Ubicacion implements Parcelable {
    private double latitud;
    private double longitud;
    private String titulo;


    public Ubicacion(double latitud, double longitud, String titulo) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.titulo = titulo;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getTitulo() {
        return titulo;
    }


    protected Ubicacion(Parcel in) {
        latitud = in.readDouble();
        longitud = in.readDouble();
        titulo = in.readString();
    }

    public static final Creator<Ubicacion> CREATOR = new Creator<Ubicacion>() {
        @Override
        public Ubicacion createFromParcel(Parcel in) {
            return new Ubicacion(in);
        }

        @Override
        public Ubicacion[] newArray(int size) {
            return new Ubicacion[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(latitud);
        dest.writeDouble(longitud);
        dest.writeString(titulo);
    }
}
