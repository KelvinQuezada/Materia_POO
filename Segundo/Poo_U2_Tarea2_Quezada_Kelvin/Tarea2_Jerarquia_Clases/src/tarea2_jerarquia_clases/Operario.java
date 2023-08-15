
package tarea2_jerarquia_clases;

import java.time.LocalDate;
//tendremos la clases hija que va heredar los atributos de la clase padre
class Operario extends Empleado {
    private int nivel;
    //creamos los contructores donde vamos a llamar los atributos de la clase padre y de la clase hija llamada Operario
    public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario, int nivel) {
        super(nombre, edad, fechaIngreso, salario);
        this.nivel = nivel;
    }
//creamos una sobre escritura incentivar para realizar un metodo 
    @Override
    public void incentivar() {
        /*
        Si tiene más de 30 años y su nivel es superior a 2, se le incrementará su salario con el doble del 
        bono. Si cumple solo una de las condiciones anteriores, se le incrementará su salario con el 
        bono y si no cumple ninguna, no se hará nada.
        */  
        //operdor and && asocia dos términos y busca un registro coincidente si ambos términos o frases existen en un registro
        if (getEdad() > 30 && nivel > 2) {
            //daremos a conocer el salario que sumaremos para dos y lo multiplicamos para el bono
            setSalario(getSalario() + 2 * BONO);
            //daremos a conocer la edad de la persona con el operador or || ya que va evalua dos operadores 
        } else if (getEdad() > 30 || nivel > 2) {
            //daremos a conocer el bono del salario 
            setSalario(getSalario() + BONO);
        }
    }
//creamos los metodos 
    public void actualizarNivel() {
        /*
        Dispondrá además de un método actualizarNivel(), que en caso de que el empleado lleve más 
        de dos años en la empresa se le subirá un nivel de seguridad. Si ya está en nivel 5 no se hará 
        nada
        plusYears es una sintaxi que Devuelve LocalDate después de agregar el número especificado de años 
        isBefore verifica si esta fecha es anterior a la fecha especificada.
        now obtener la fecha y la hora actuales en una zona horaria específica 
        operdor and && asocia dos términos y busca un registro coincidente si ambos términos o frases existen en un registro
        */
        if (getFechaIngresada().plusYears(2).isBefore(LocalDate.now()) && nivel < 5) {
            nivel++;
        }
    }
    // Getters y setters
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}