
package tarea2_jerarquia_clases;

import java.time.LocalDate;
//tendremos la clases hija que va heredar los atributos de la clase padre
class Director extends Empleado {
    //atritubo de la clase director
    private String departamento;
    private int personal;
//creamos los contructores donde vamos a llamar los atributos de la clase padre y de la clase hija llamada Director
    public Director(String nombre, int edad, LocalDate fechaIngresada, double salario, String departamento, int personal) {
        super(nombre, edad, fechaIngresada, salario);
        this.departamento = departamento;
        this.personal = personal;
    }
//realizamos una sobre escritura en el metodo incentivar 
    @Override
    public void incentivar() {
        /*
        Si el lleva más de 30 meses en la empresa y tiene más de 20 personas a su cargo, se le 
        incrementará su salario con el doble del bono. Si cumple solo una de las condiciones 
        anteriores, se le incrementará su salario con el bono y si no cumple ninguna, no se hará nada
        plusMonths() de la clase LocalDate se usa para agregar la cantidad de meses especificados en esta LocalDate
        isBefore verifica si esta fecha es anterior a la fecha especificada.
        now obtener la fecha y la hora actuales en una zona horaria específica 
        */
        if (getFechaIngresada().plusMonths(30).isBefore(LocalDate.now()) && personal > 20) {
            setSalario(getSalario() + 2 * BONO);
        } else if (getFechaIngresada().plusMonths(30).isBefore(LocalDate.now()) || personal > 20) {
            setSalario(getSalario() + BONO);
        }
    }
    // Cramos los metodos Getters y setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getPersonal() {
        return personal;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }
}