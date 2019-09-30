function create_turma(disciplina, vagas){
    let turma = {};
  
    turma.disciplina = disciplina;
    turma.vagas = vagas;
    turma.alunos = [];
  
    turma.matricule = function(aluno){
      if(turma.vagas >= 0){
        turma.alunos.push(aluno);
        turma.vagas --;
        return true;
      } else {
        return false;
      }
    }
  
    turma.totalVagas = function(){
        return vagas;
    }
  }
  