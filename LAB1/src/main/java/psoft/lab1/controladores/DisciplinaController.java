package psoft.lab1.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import psoft.lab1.service.DisciplinaService;
import psoft.lab1.disciplinas.Disciplina;
import psoft.lab1.disciplinas.Disciplinas;

@RestController
public class DisciplinaController {

	@Autowired
	private DisciplinaService disciplinaService;
	
	@PostMapping("/v1/disciplinas")
	public ResponseEntity<Disciplina> addDisciplina(@RequestBody Disciplina newDisciplina){
		return null;
	}
	
}
