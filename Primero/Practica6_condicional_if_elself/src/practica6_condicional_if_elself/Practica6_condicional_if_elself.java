
package practica6_condicional_if_elself;

class Practica6_condicional_if_elself {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //sentencia if (condicional)
        int hora = -5;
        if (hora >=0 && hora <=12){
            System.out.println("Buenas dias");
        
        }
        else if(hora >12 && hora <=18){
            System.out.println("Buenos dias");
        }
        else {
            System.out.println("Buenas noches");
        }
        
    }
    
}
