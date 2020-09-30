package interfaceFuncional;

public class Capitulo3 {

    public static void main(String[] args) {

        /* usando implementação de ValidadorCEP */
        ValidadorCEPImpl imp = new ValidadorCEPImpl();
        System.out.println("Utilizando implements de ValidadorCEP: " + imp.valida("87023-130"));


        /*         usando classe anonima         */
        ValidadorCEP<String> validadorCEP =	new	ValidadorCEP<String>() {
            public boolean valida(String valor) {
                return valor.matches("[0-9]{5}-[0-9]{3}");
            }
        };
        System.out.println("CEP válido: " + validadorCEP.valida("87023-130"));

        /*         usando lambda          */
        ValidadorCEP<String> validadorCEPLambda = s -> s.matches("[0-9]{5}-[0-9]{3}");
        System.out.println("CEP válido lambda: " + validadorCEPLambda.valida("87023-130"));
    }
}
