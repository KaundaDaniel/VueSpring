package crudVue.CrudVue.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Empregado {
    @Id
    @Column(name = "id_empregado", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nome_empregado", length = 250)
    private String  nome;
    @Column(name = "email_empregado", length = 250)
    private String email;
    @Column(name = "senha_empregado", length = 250)
    private String senha;
}
