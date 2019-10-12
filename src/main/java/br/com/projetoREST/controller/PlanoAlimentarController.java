package br.com.projetoREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoREST.model.Item_Refeicao;
import br.com.projetoREST.model.PlanoAlimentar;
import br.com.projetoREST.model.Refeicao;
import br.com.projetoREST.service.PlanoAlimentarService;

@RestController
@RequestMapping("/alimento/planoAlimentar")
public class PlanoAlimentarController {

	@Autowired
	PlanoAlimentarService service;
	
	@RequestMapping(value="/salvar", method = RequestMethod.POST)
	public PlanoAlimentar salvar(@RequestBody PlanoAlimentar planoAlimentar) {
		
		for(Refeicao refeicao : planoAlimentar.getRefeicoes()) {
			
			refeicao.setPlanoAlimentar(planoAlimentar);
			
			for(Item_Refeicao item: refeicao.getItensRefeicao()) {
				
				item.setRefeicao_id(refeicao.getId());
			}
			
		}
		
		return service.salvar(planoAlimentar);
	}
}
