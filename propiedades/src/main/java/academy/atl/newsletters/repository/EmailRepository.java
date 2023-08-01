package academy.atl.newsletters.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmailRepository {

    @PersistenceContext
    private EntityManager baseDeDatos;

    @Transactional
    public void guardarEmail(String emailDelUsuario) {
        String consultaSql = "INSERT INTO lead (email) VALUES (:paramEmail)";
        baseDeDatos.createQuery(consultaSql)
                .setParameter("paramEmail", emailDelUsuario)
                .executeUpdate();
    }

    @Transactional
    public void eliminarEmail(String emailDelUsuario) {
        String consultaSql = "DELETE FROM Lead WHERE email = :paramEmail";
        baseDeDatos.createQuery(consultaSql)
                .setParameter("paramEmail", emailDelUsuario)
                .getResultList();
    }
}
