public class Main {
    public static void main(String[] args) {
		Aluno rafhael = new Aluno();
		rafhael.setNome("Rafhael");

		Professor paulo = new Professor();
		paulo.setNome("Paulo");

        Professor biologia = new Professor();
        biologia.setCurso("Biologia");

        Appuniversidade.imprimirInfo();
}
