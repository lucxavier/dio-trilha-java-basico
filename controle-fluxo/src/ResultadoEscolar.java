public class ResultadoEscolar {
      public static void main(String[] args) {

      //  int nota = 8;
       
      //  if(nota >= 7)
      //   System.out.println("Está Aprovado");

      // else if (nota >= 5 && nota < 7)
      //   System.out.println("Está de Recuperação");

      // else
      //   System.out.println("Está Reprovado");

      //ternário


		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
    }
}
