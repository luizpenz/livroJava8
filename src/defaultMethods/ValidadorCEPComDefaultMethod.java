package defaultMethods;

@FunctionalInterface
public interface ValidadorCEPComDefaultMethod<T> {

    boolean validaCEP(T t);

    default void apenasImprimeCEP(String cep) {
        System.out.println(cep);
    }
}
