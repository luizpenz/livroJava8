package interfaceFuncional;

public class VariaveisLocais {

    public static void main(String[] args) {
        final int numero = 5; // ou
        // int numero = 5;
        new	Thread(()	->	{
            System.out.println(numero);
        }).start();

        // numero = 10;     //não pode haver alteração na variável, mesmo não tendo declaração de final,
                            // ela precisa ser efitivamente final, sem sofrer alterações.

    }
}
