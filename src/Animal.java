import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Animal {
    private String nombre;
    private String especie;
    private String raza;
    private Cliente propietario;
    private ArrayList<Consulta> historialConsultas;

    public Animal(String nombre, String especie, String raza, Cliente propietario) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.propietario = propietario;
        this.historialConsultas = new ArrayList<>();
    }

    //TODO: Completar agregar consulta al historial de consulta 
    public void agregarConsulta(Consulta consulta) {
        String especieNova=JOptionPane.showInputDialog("Introduce a especie do animal:");
        String motivoNovo=JOptionPane.showInputDialog("Introduce o motivo da consulta:");
        String diagnosticoNovo=JOptionPane.showInputDialog("Introduce o diagnostico do animal:");
        String TratamientoNovo=JOptionPane.showInputDialog("Introduce o tratamiento do animal:");
        String nomeVeterinario=JOptionPane.showInputDialog("Introduce o nome do veterinario:");
        String espeVeterinario=JOptionPane.showInputDialog("Introduce a especialidad do veterinario:");
        Veterinario novoVeterinario = new Veterinario(nomeVeterinario, espeVeterinario);
        Consulta consultaNueva = new Consulta(especieNova, motivoNovo, diagnosticoNovo, TratamientoNovo, novoVeterinario);
        historialConsultas.add(consultaNueva);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public ArrayList<Consulta> getHistorialConsultas() {
        return historialConsultas;
    }

    public void setHistorialConsultas(ArrayList<Consulta> historialConsultas) {
        this.historialConsultas = historialConsultas;
    }
}
