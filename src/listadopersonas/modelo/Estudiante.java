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
public class Estudiante extends AbstractPersona{
    private String codigo;
    private byte semestre;

    public Estudiante(String codigo, byte semestre, String identificacion, String nombre, byte edad) {
        super(identificacion, nombre, edad);
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    @Override
    public Object[] obtenerArregloObjeto() {
        Object[] data={ getCodigo(), getSemestre(), getIdentificacion(),getNombre(),getEdad() };
        return data;
    }
    
    

   

    
    
    
}
