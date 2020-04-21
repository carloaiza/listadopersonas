/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadopersonas.controlador;

import java.util.ArrayList;
import java.util.List;
import listadopersonas.modelo.AbstractPersona;
import listadopersonas.modelo.Empleado;
import listadopersonas.modelo.Estudiante;
import listadopersonas.modelo.Profesor;

/**
 *
 * @author cloaiza
 */
public class ControladorPersonas {
    private List<AbstractPersona> personas;

    public ControladorPersonas() {
        llenarPersonas();
    }
    
    private void llenarPersonas()
    {
        personas= new ArrayList<>();
        //Lleno estudiantes (Lee un archivo plano de estudiantes>
        personas.add(new Estudiante("82201913547", (byte)3, "305478963", 
                "Pedro Pérez", (byte)21));
        
        personas.add(new Profesor(1800000, (byte)6, "75147236", 
                "Carlos Loaiza", (byte)61));
        
        personas.add(new Estudiante("82201913549", (byte)3, "10535478978", 
                "Juan Juárez", (byte)20));
        
        personas.add(new Profesor(3800000, (byte)4, "75266987", 
                "Belisario Betancurth", (byte)61));
        
        personas.add(new Empleado(800000, "Registro Académico", "30359219", 
                "Mariana Martínez", (byte)28));
        
        personas.add(new Empleado(600000, "Servicios generales", "30145287", 
                "Petronila Pardo", (byte)48));
        
    }
    
    
    public List<AbstractPersona> obtenerPersonas(String tipo)
    {
        List<AbstractPersona> listaTemp = new ArrayList<>();
        //Recorrer todo el listado de personas , pero solo voy a adicionar a la lista la que me digan
        for(AbstractPersona persona: personas)
        {
            switch(tipo)
            {
                case "Estudiante":
                    if(persona instanceof Estudiante)
                    {
                        listaTemp.add(persona);
                    }
                    break;
                case "Profesor":
                    if(persona instanceof Profesor)
                    {
                        listaTemp.add(persona);
                    }
                    break;
                case "Empleado":
                    if(persona instanceof Empleado)
                    {
                        listaTemp.add(persona);
                    }
                    break;   
                default:
                    listaTemp.add(persona);
            }
        }
        return listaTemp;
    }
    
}
