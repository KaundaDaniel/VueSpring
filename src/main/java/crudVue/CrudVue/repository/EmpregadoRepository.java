package crudVue.CrudVue.repository;

import crudVue.CrudVue.model.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository


public interface EmpregadoRepository extends JpaRepository<Empregado, Integer> {
     Optional<Empregado>findOneByEmailAndSenha(String email, String senha);
        Empregado findByEmail(String email);

}
