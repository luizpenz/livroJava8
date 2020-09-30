package interfaceFuncional;

public class ValidadorCEPImpl implements ValidadorCEP {
    @Override
    public boolean valida(String s) {
        return s.matches("[0-9]{5}-[0-9]{3}");
    }
}
