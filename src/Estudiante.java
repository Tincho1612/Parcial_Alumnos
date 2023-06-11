import Exceptions.InstanciasMaximasException;
import Exceptions.MateriasExisteException;
import Exceptions.NotaExisteException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private int legajo;
    private String mail;
    private ArrayList<Materia>materias=new ArrayList<>();

    public Estudiante(String nombre, String apellido, String fechaNacimiento, int legajo, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.legajo = legajo;
        this.mail = mail;
    }

    public Estudiante() {
    }
    public void agregarNota(Materia materia,Nota nota){
        for (Materia aux:materias){
            if (aux.equals(materia)){
                try {
                    aux.agregarNota(nota);
                }catch (NotaExisteException | InstanciasMaximasException e){
                    System.out.println(e.getMessage());
                }

            }
        }
    }
    public void agregarMateria(Materia dato)throws MateriasExisteException {
        for (Materia aux: materias){
            if (aux.equals(dato)){
                throw new MateriasExisteException("La materia" + dato.getNombre() +  " ya existe");
            }
        }
        materias.add(dato);
    }
    public void exportarTodo(String path){
        try{
            File file=new File(path);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file,materias);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", legajo=" + legajo +
                ", mail='" + mail + '\'' +
                ", materias=" + materias +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
}
