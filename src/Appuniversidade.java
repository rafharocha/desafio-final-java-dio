public class Appuniversidade {
    
    protected Aluno nome;
    protected Professor curso;
    protected Nota nota;
    protected Ementa ementa;
    protected Aluno aluno;
    protected Professor professor;
    

    public void aluno(Aluno nome) {
        this.nome = nome;
    }

    public void nota(Nota nota1) {
        this.nota = nota1;
    }

    public void ementa(Ementa eMENTA_PADRAO){
        this.ementa = eMENTA_PADRAO;
    }
    
    public void nomeprofessor(Professor professor) {
        this.professor = professor;
        
    }

    public void cursoprofessor(Professor curso) {
        this.curso = curso;
    }

    public Professor getCurso() {
		return curso;
	}
    public Professor getProfessor() {
		return professor;
	}
    public Aluno getNome() {
		return nome;
    }

    public Nota getNota(){
        return nota;
    }

    protected static void imprimirInfo() {
		System.out.println(String.format("Aluno: %s", this.nome.getnome()));
		System.out.println(String.format("Nota: %d", this.nota));
		System.out.println(String.format("Numero da Ementa: %d", this.ementa));
		System.out.println(String.format("Professor: %s do curso %s", this.professor.getProfessor(), this.curso.getCurso()));
	}
}
