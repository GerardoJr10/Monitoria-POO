public class AnaliseCodigo {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 2, 9};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {

            int valor = numeros[i]++; // pega o valor original, depois incrementa numeros[i]
            ++valor;                  // incrementa valor mais uma vez -> valor = numeros[i]_original + 1

            if (valor % 2 == 0 && valor > 5) {
                soma += valor;
            } else if (valor % 2 != 0 || valor < 3) {
                soma += (valor % 2 == 0) ? valor : -valor;
            }
        }

        // Resultado esperado: soma = 15 (ver justificativa no arquivo de respostas teóricas)
        System.out.println("Resultado final: " + soma);
    }
}
