package defaultMethods;

public class Capitulo4 {

    public static void main(String[] args) {

        /* usando classe anonima:

            ValidadorCEPComDefaultMethod<String> cep = new ValidadorCEPComDefaultMethod<String>() {
                @Override
                public boolean validaCEP(String s) {
                    return s.equals("87023-130");
                }
            };

        */

        // Aqui cep está sendo iniciado e escrevendo o metodo validaCEP. (Mesmo que acima)
        ValidadorCEPComDefaultMethod<String> cep = c -> c.equals("87023-130");

        System.out.println("CEP 87023-140 é valido: " + cep.validaCEP("87023-140"));
        System.out.println("CEP 87023-130 é valido: " + cep.validaCEP("87023-130"));

        cep.apenasImprimeCEP("87005-010");
    }
}
