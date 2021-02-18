/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluarcodigo;

/**
 *PRUEBA PARA ENTORNOS DE DESARROLLO
 * @author AARONTITOS
 */
public class EntradaBlogATC {
    /**
     * Separador es el carácter que separa ENTRADA del nombre del autor
     */

    public static char separador = ':';
    private int id;
    private String texto;
    private String autor;
/**
 * CONSTRUCTOR DE LA CLASE
 * recibe el número de entrada, el nombre del autor de la entrada y el texto 
 * que contiene la entrada. Si el número de entrada es negativo,
 * lanza una excepción.
 * @param id
 * @param autor
 * @param texto
 * @throws IllegalArgumentException 
 */
    //Constructor de la clase. recibe el número de entrada, el nombre del autor
    //de la entrada y el texto que contiene la entrada. Si el número de entrada
    //es negativo, lanza una excepción.
    public EntradaBlogATC(int id, String autor, String texto) throws IllegalArgumentException {
        if (id <= 0) {
            throw new IllegalArgumentException("El id no puede ser negativo");
        }
        this.id = id;
        this.autor = autor;
        this.texto = texto;
    }

    @Override
    public String toString() {
        String cad = "";
        cad += "\nENTRADA DE" + separador + autor;
        cad += "\n " + texto;
        return cad;
    }
/**
 * Devuelve el número de la entrada
 * @return 
 */
    public int getId() {
        return this.id;
    }
/**
 * devuelve el texto completo de la entrada
 * @return 
 */
    public String getTexto() {
        return this.texto;
    }
/**
 * devuelve el nombre del autor de la entrada en mayúsculas
 * @return 
 */
    
    public String getAutor() {
        return this.autor.toUpperCase();
    }
/**
 * devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
 * @return 
 */
    
    public String devuelveAutor() {
        return this.autor;
    }
/**
 * No tiene porqué tener argumentos.
 * @param args 
 */
    
    public static void main(String[] args) {
        //Modificar.
        EntradaBlogATC e1 = new EntradaBlogATC(3, "Aaron Titos", "Últimas noticias, ¡QUIERO APROBAR LA ASIGNATURA!");
        System.out.println(e1);
    }
}
