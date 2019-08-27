package psoft.lab1.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		return new ResponseEntity<Disciplina>(disciplinaService.addDisciplina(newDisciplina), HttpStatus.OK);
	}
	@RequestMapping("/v1/disciplinas")
	public ResponseEntity<Disciplinas> getDisciplinas(){
		return new ResponseEntity<Disciplinas>(disciplinaService.getDisciplinas(), HttpStatus.OK);
	}

	@RequestMapping("/v1/disciplinas/{id}")
	public ResponseEntity<Disciplina> getDisciplina(@PathVariable int id){
		return new ResponseEntity<Disciplina>(disciplinaService.getDisciplina(id), HttpStatus.OK);
	}
	
	@PutMapping("/v1/disciplinas/{id}/nome")
	public ResponseEntity<Disciplina> setNomeDisciplina(@PathVariable int id, @RequestBody Disciplina nome){
		return new ResponseEntity<Disciplina>(disciplinaService.setNomeDisciplina(id, nome), HttpStatus.OK);
	}
	
	@PutMapping("/v1/disciplinas/{id}/nota")
	public ResponseEntity<Disciplina> setNotaDisciplina(@PathVariable int id, @RequestBody Disciplina nota){
		return new ResponseEntity<Disciplina>(disciplinaService.setNotaDisciplina(nota), HttpStatus.OK);
	}
	@DeleteMapping("/v1/disciplinas/{id}")
	public ResponseEntity<Disciplina> deleteDisciplina(@PathVariable int id){
		return new ResponseEntity<Disciplina>(disciplinaService.deleteDisciplina(id), HttpStatus.OK);
	}
	@RequestMapping("/v1/disciplinas/ranking")
	public ResponseEntity<Disciplina> getDisciplinasRanking(){
		return new ResponseEntity<Disciplina>(disciplinaService.getDisciplinasRanking(), HttpStatus.OK);
	}
}
