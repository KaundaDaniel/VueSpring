package crudVue.CrudVue.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpregadoDto {

    private Integer id;
    private String nome;
    private String email;
    private String senha;
}
