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
public class Empleado extends AbstractPersona implements TrabajadorAble{
    private double salario;
    private String dependencia;
    
    
    public Empleado(double salario, String dependencia, String identificacion, String nombre, byte edad) {
        super(identificacion, nombre, edad);
        this.salario = salario;
        this.dependencia = dependencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    @Override
    public double calcularSalario(short numeroHoras) {
       return this.salario + (numeroHoras * 1000); 
    }

    @Override
    public Object[] obtenerArregloObjeto() {
        Object[] data={ getIdentificacion(),getNombre(),getEdad(),getSalario(), getDependencia() };
        return data;
    }
    
    
}
