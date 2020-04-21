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
public abstract class AbstractPersona {
    private String identificacion;
    private String nombre;
    private byte edad;

    public AbstractPersona(String identificacion, String nombre, byte edad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    
   public abstract Object[] obtenerArregloObjeto();
   
   public Object[] obtenerArregloPersonaObjeto()
   {
       Object[] data={ getIdentificacion(),getNombre(),getEdad(), getClass().getSimpleName()};
        return data;
   }
   
    
}
