
package practica6_condicional_if_elself;

class Practica6_condicional_if_elself {
    public static void main(String[] args) {
        // Declaro las variables de tipo entero 
        //sentencia if (condicional)
        int hora = -5;/*
        if colocamos una condicion donde vamos evaluar hora es 
        >=0 && hora <=12 si esa condicion es verdadera dira los buenos dias
        */
        if (hora >=0 && hora <=12){
            System.out.println("Buenas dias");
        }
        /*else if colocamos la condicion donde vamos evaluar hora es 
        >=12 && hora <=18 si esa condicion es verdadera dira los buenos noches*/
        else if(hora >12 && hora <=18){
            System.out.println("Buenos dias");
        }else {
            System.out.println("Buenas noches");
        }
    }
    
}
