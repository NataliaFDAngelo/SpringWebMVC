package br.com.dio.hateoas.dto;

import br.com.dio.hateoas.enums.Raca;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Soldado {

    private Long id;

    private String cpf;

    private String nome;

    private Raca raca;

    private String arma;

    private String status;

}
