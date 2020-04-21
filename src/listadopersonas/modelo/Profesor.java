/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadopersonas.modelo;

/**
 *
 * @author cloaiza
 */
public class Profesor extends AbstractPersona implements TrabajadorAble{
    private double salario;
    private byte numeroMaterias;

    public Profesor(double salario, byte numeroMaterias, String identificacion, String nombre, byte edad) {
        super(identificacion, nombre, edad);
        this.salario = salario;
        this.numeroMaterias = numeroMaterias;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public byte getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(byte numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    

    

    @Override
    public double calcularSalario(short numeroHoras) {
        return this.salario + (numeroHoras * 5000);        
    }

    @Override
    public Object[] obtenerArregloObjeto() {
        Object[] data={ getIdentificacion(),getNombre(),getEdad(), calcularSalario(numeroMaterias), getNumeroMaterias() };
        return data;
    }
    
    
}
