package academy.atl.trivia;

import academy.atl.trivia.entities.Category;
import academy.atl.trivia.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;

@RestController
public class TriviaController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/hola")
    public String prueba1() {
        return "Esta url usa un GET";
    }
    @DeleteMapping("/hola")
    public String prueba2() {
        return "Esta url usa un DELETE";
    }
    @PostMapping("/hola")
    public String prueba3() {
        return "Esta url usa un POST";
    }


    @GetMapping("/busqueda-{id}")
    public Category buscarPorId(@PathVariable Long id) {
        return categoryRepository.findById(id);
    }


    @GetMapping("/question/{categoria}")
    public Category getQuestion(@PathVariable String categoria) {



        List<Category> resultado = new ArrayList<>();
        Category ejemplo = categoryRepository.findById(1L);
        resultado.add(ejemplo);
        return ejemplo;
        //ObjectMapper convertidor = new ObjectMapper();
        //Pregunta preg = convertidor.convertValue(respuestaJson, Pregunta.class);
        //return preg;
    }


    @GetMapping("/categories")
    public Category[] getCategories() {

        Category cat = new Category();
        cat.setName("Arte");
        cat.setDescription("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");

        Category cat2 = new Category();
        cat2.setName("Deportes");
        cat2.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Category[] categories = new Category[2];
        categories[0] = cat;
        categories[1] = cat2;
        return categories;

        /*return "[\n" +
                "  {\n" +
                "    \"category\": \"Prueba\",\n" +
                "    \"description\": \"Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Deportes\",\n" +
                "    \"description\": \"Preguntas relacionadas con diversos deportes y eventos deportivos.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Arte\",\n" +
                "    \"description\": \"Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Cine\",\n" +
                "    \"description\": \"Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Historia\",\n" +
                "    \"description\": \"Preguntas relacionadas con eventos históricos, personajes y períodos importantes.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Ciencia\",\n" +
                "    \"description\": \"Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.\"\n" +
                "  }\n" +
                "]";*/
    }
}
