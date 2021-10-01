package br.com.dio.hateoas.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoldadoListResponse extends RepresentationModel {

    private Long id;

    private String nome;

    private String raca;

}
