package academy.atl.newsletters.controllers;

import academy.atl.newsletters.models.Lead;
import academy.atl.newsletters.repository.EmailRepository;
import academy.atl.newsletters.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewslettersController {

    @Autowired
    private EmailRepository repositorioDeEmails;

    @PostMapping("/api/newsletter")
    public String registrar(@RequestBody Lead lead) {

        String email = lead.getEmail();

        EmailValidator emailValidator = new EmailValidator();
        if (emailValidator.esValido(email) == false) {
            return "El email no es valido";
        }

        repositorioDeEmails.guardarEmail(email);

        return "Email guardado: " + email;
    }

    @PostMapping("/api/newsletter/unsuscribe")
    public String eliminar(@RequestBody Lead lead) {
        String email = lead.getEmail();
        repositorioDeEmails.eliminarEmail(email);

        return "Email borrado: " + email;
    }

}
