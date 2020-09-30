package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {

    public static void main(String[] args) {

        Usuario huguinho = new Usuario("Huguinho", 150);
        Usuario zezinho = new Usuario("Zezinho", 160);
        Usuario luizinho = new Usuario("Luizinho", 170);

        List<Usuario> sobrinhos = Arrays.asList(huguinho, zezinho, luizinho);

        System.out.println("********** for normal...");
        for(Usuario u : sobrinhos) {
            System.out.println(u.getNome());
        }

        System.out.println("********** usando classe anonima de consumer");
        Consumer<Usuario> imprime = new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        };
        sobrinhos.forEach(imprime);

        System.out.println("********** foreach lambda");
        sobrinhos.forEach(s -> System.out.println(s.getNome()));
    }
}
