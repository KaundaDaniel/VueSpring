package crudVue.CrudVue.services.implementacao;

import crudVue.CrudVue.dto.EmpregadoDto;
import crudVue.CrudVue.model.Empregado;
import crudVue.CrudVue.repository.EmpregadoRepository;
import crudVue.CrudVue.services.EmpregadoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmpregadoImpl implements EmpregadoServico {
    private PasswordEncoder senhaCripto;
    @Autowired
    private EmpregadoRepository empregadoReposi;
    @Override
    public String addEmpregadoDto(EmpregadoDto empregadoDto) {

        Empregado empregado = new Empregado(

                empregadoDto.getId(),
        empregadoDto.getNome(),
        empregadoDto.getEmail(),
        this.senhaCripto.encode(empregadoDto.getSenha())
        );
        empregadoReposi.save(empregado);


        return empregado.getNome();
    }
}
