package br.com.dio.hateoas.controller.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoldadoEditRequest {

    private String nome;

    private String raca;

    private String arma;

}
