public class Prova {

    public static final int NUM_QUESTOES = 6;

    private String nome;
    private String matricula;
    private char[] respostas;

    public Prova(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.respostas = new char[NUM_QUESTOES];
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Armazena as respostas do aluno (6 questões)
    public void respostaAluno(char[] resposta) {
        for (int i = 0; i < NUM_QUESTOES && i < resposta.length; i++) {
            respostas[i] = resposta[i];
        }
    }

    // Retorna a quantidade de acertos comparando com o gabarito
    public int acertos(char[] gabarito) {
        int total = 0;
        for (int i = 0; i < NUM_QUESTOES; i++) {
            if (respostas[i] == gabarito[i]) {
                total++;
            }
        }
        return total;
    }

    // Retorna a nota, com pontuação diferenciada:
    // 3 primeiras questões valem 1 ponto, 3 últimas valem 2 pontos
    public double nota(char[] gabarito) {
        double notaFinal = 0;
        for (int i = 0; i < NUM_QUESTOES; i++) {
            if (respostas[i] == gabarito[i]) {
                notaFinal += (i < 3) ? 1 : 2;
            }
        }
        return notaFinal;
    }

    // DESAFIO: retorna a nota do aluno que acertou mais questões.
    // Em caso de empate nos acertos, retorna -1.
    // Obs: o enunciado indica "String[] gabarito", mas os métodos acertos()/nota()
    // já usam char[] gabarito (mesmo padrão do restante da classe); por isso,
    // o desafio também foi implementado recebendo char[] para manter a coerência.
    public double maior(Prova outra, char[] gabarito) {
        int meusAcertos = this.acertos(gabarito);
        int acertosOutra = outra.acertos(gabarito);

        if (meusAcertos == acertosOutra) {
            return -1;
        }
        return (meusAcertos > acertosOutra) ? this.nota(gabarito) : outra.nota(gabarito);
    }

    public static void main(String[] args) {
        char[] gabarito = {'A', 'B', 'C', 'D', 'E', 'A'};

        Prova prova1 = new Prova("João Silva", "20260001");
        prova1.respostaAluno(new char[]{'A', 'B', 'C', 'D', 'A', 'A'}); // acerta 5

        Prova prova2 = new Prova("Maria Souza", "20260002");
        prova2.respostaAluno(new char[]{'A', 'B', 'E', 'D', 'E', 'B'}); // acerta 4

        System.out.println(prova1.getNome() + " - acertos: " + prova1.acertos(gabarito)
                + " | nota: " + prova1.nota(gabarito));
        System.out.println(prova2.getNome() + " - acertos: " + prova2.acertos(gabarito)
                + " | nota: " + prova2.nota(gabarito));

        double resultadoDesafio = prova1.maior(prova2, gabarito);
        System.out.println("Resultado do desafio 'maior': " + resultadoDesafio);
    }
}
