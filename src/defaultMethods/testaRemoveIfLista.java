package defaultMethods;

import lambdas.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class testaRemoveIfLista {

    public static void main(String[] args) {
        lambdas.Usuario huguinho = new lambdas.Usuario("Huguinho", 150);
        lambdas.Usuario zezinho = new lambdas.Usuario("Zezinho", 160);
        lambdas.Usuario luizinho = new Usuario("Luizinho", 170);

        List<Usuario> sobinhos = new ArrayList<>();
        sobinhos.add(huguinho);
        sobinhos.add(zezinho);
        sobinhos.add(luizinho);

        Predicate<Usuario> predicate = new Predicate<Usuario>() {
            @Override
            public boolean test(Usuario usuario) {
                return usuario.getPontos() >= 160;
            }
        };
        System.out.println(sobinhos.size());
        sobinhos.removeIf(predicate);
        System.out.println(sobinhos.size());


        /* ---------------- adicionando zezinho e luizinho novamente, e utilizando lambda */
        sobinhos.add(zezinho);
        sobinhos.add(luizinho);

        System.out.println(sobinhos.size());
        sobinhos.removeIf(s -> s.getPontos() >= 170);
        System.out.println(sobinhos.size());

    }
}
