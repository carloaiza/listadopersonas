/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadopersonas.modelo;

import java.io.Serializable;

/**
 *
 * @author cloaiza
 */
public class DatoReporte implements Serializable{
    private int edadInicial;
    private int edadFinal;
    private int cantidadEstudiantes;
    private int cantidadProfesores;
    private int cantidadEmpleados;
    private String textoColumna1;

    public DatoReporte(int edadInicial, int edadFinal, int cantidadEstudiantes, int cantidadProfesores, int cantidadEmpleados, String textoColumna1) {
        this.edadInicial = edadInicial;
        this.edadFinal = edadFinal;
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.cantidadProfesores = cantidadProfesores;
        this.cantidadEmpleados = cantidadEmpleados;
        this.textoColumna1 = textoColumna1;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public void setCantidadProfesores(int cantidadProfesores) {
        this.cantidadProfesores = cantidadProfesores;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }
  
    
    
    public Object[] obtenerArregloObjeto() {
        Object[] data={ this.textoColumna1,this.cantidadEstudiantes,this.cantidadProfesores,this.cantidadEmpleados };
        return data;
    }
    
    
}
