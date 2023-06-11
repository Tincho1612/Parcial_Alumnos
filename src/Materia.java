import Exceptions.InstanciasMaximasException;
import Exceptions.NotaExisteException;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Materia {
    private String abreviacion;
    private String nombre;
    private String docente;
    private String ayudante;
    private String diasDeCursada;
    private LinkedHashSet<Nota>notas=new LinkedHashSet<>();

    public Materia(String abreviacion, String nombre, String docente, String ayudante, String diasDeCursada) {
        this.abreviacion = abreviacion;
        this.nombre = nombre;
        this.docente = docente;
        this.ayudante = ayudante;
        this.diasDeCursada = diasDeCursada;
    }

    public Materia() {
    }
    public void agregarNota(Nota dato)throws NotaExisteException, InstanciasMaximasException {

        for (Nota aux:notas){
            if (aux.equals(dato)){
                throw new NotaExisteException("La nota ya existe");
            }
        }
        if (notas.size() < 5){
            notas.add(dato);
        }else {
            throw new InstanciasMaximasException("Cantidad de instancias maximas alcanzadas");
        }

    }


    @Override
    public String toString() {
        return "Materia{" +
                "abreviacion='" + abreviacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", docente='" + docente + '\'' +
                ", ayudante='" + ayudante + '\'' +
                ", diasDeCursada='" + diasDeCursada + '\'' +
                ", notas=" + notas +
                '}';
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getAyudante() {
        return ayudante;
    }

    public void setAyudante(String ayudante) {
        this.ayudante = ayudante;
    }

    public String getDiasDeCursada() {
        return diasDeCursada;
    }

    public void setDiasDeCursada(String diasDeCursada) {
        this.diasDeCursada = diasDeCursada;
    }

    public LinkedHashSet<Nota> getNotas() {
        return notas;
    }

    public void setNotas(LinkedHashSet<Nota> notas) {
        this.notas = notas;
    }
}
