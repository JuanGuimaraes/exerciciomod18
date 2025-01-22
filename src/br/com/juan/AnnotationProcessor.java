package br.com.juan;

public class AnnotationProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<Usuario> classe = Usuario.class;

        if (classe.isAnnotationPresent(Tabela.class)) {

            Tabela tablea = classe.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tablea.tabela());
        } else {
            System.out.println("A anotação @Tablea não está presente.");
        }
    }
}
