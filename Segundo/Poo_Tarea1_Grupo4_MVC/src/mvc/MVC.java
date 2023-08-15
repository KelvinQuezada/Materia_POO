
package mvc;
import model.Model;
import view.View;
import controller.Controller;

public class MVC {
    public static void main(String[] args) {
        //Instaciamos las clases crear los objetos de la clase
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        //establecemos las relaciones entre las clases
        view.setVisible(true);
    }
}