public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurrto2 = (short) numeroNormal; //casting, evitar;


        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // final usado para constante, para valor não mudar.
        System.out.println(VALOR_DE_PI);

        String meuNome = "Lucas Xavier";
        System.out.println(meuNome);

    }
}
