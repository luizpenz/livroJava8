package interfaceFuncional;

@FunctionalInterface
public interface ValidadorCEP<T> {

    boolean valida(String s);
    //boolean outro(T t); sem corpo não pode... somende se for default method


}
