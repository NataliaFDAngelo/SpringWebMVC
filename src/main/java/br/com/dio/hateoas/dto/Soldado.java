package br.com.dio.hateoas.dto;

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

    private String raca;

    private String arma;

    private String status;

}
