package poo_jsonfiles;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonManager {

    private static final String FILE_PATH = "data.json"; // Nombre del archivo JSON

    // Guardar objetos en el archivo JSON
    public static void guardarEnJSON(List<Persona> personas) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(FILE_PATH), personas);
            System.out.println("Personas guardadas en " + FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Cargar objetos desde el archivo JSON
    public static List<Persona> cargarDesdeJSON() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(FILE_PATH),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Persona.class));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}