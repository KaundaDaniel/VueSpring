package crudVue.CrudVue.control;

import crudVue.CrudVue.dto.EmpregadoDto;
import crudVue.CrudVue.services.EmpregadoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/empregados")


public class EmpregadoControl {
    @Autowired
    private EmpregadoServico empregadoServico;
    @PostMapping("/salvar")
    public String salvarEmpregado(@RequestBody EmpregadoDto empregadoDto){
        String id= empregadoServico.addEmpregadoDto(empregadoDto);
        return id;
    }
}
