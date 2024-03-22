package lista.classes;

public class Seguro {
    private String nome;
    private int idade;
    private String grupoRisco;

    public Seguro(String nome, int idade, String grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public String determinarCategoria() {
        if (idade < 17 || idade > 70) {
            return "Não se enquadra em nenhuma categoria.";
        }

        if (grupoRisco.equalsIgnoreCase("baixo")) {
            if (idade >= 17 && idade <= 20) {
                return "Categoria 1";
            } else if (idade >= 21 && idade <= 24) {
                return "Categoria 2";
            } else if (idade >= 25 && idade <= 34) {
                return "Categoria 3";
            } else if (idade >= 35 && idade <= 64) {
                return "Categoria 4";
            } else if (idade >= 65 && idade <= 70) {
                return "Categoria 7";
            }
        } else if (grupoRisco.equalsIgnoreCase("médio")) {
            if (idade >= 17 && idade <= 20) {
                return "Categoria 2";
            } else if (idade >= 21 && idade <= 24) {
                return "Categoria 3";
            } else if (idade >= 25 && idade <= 34) {
                return "Categoria 4";
            } else if (idade >= 35 && idade <= 64) {
                return "Categoria 5";
            } else if (idade >= 65 && idade <= 70) {
                return "Categoria 8";
            }
        } else if (grupoRisco.equalsIgnoreCase("alto")) {
            if (idade >= 17 && idade <= 20) {
                return "Categoria 3";
            } else if (idade >= 21 && idade <= 24) {
                return "Categoria 4";
            } else if (idade >= 25 && idade <= 34) {
                return "Categoria 5";
            } else if (idade >= 35 && idade <= 64) {
                return "Categoria 6";
            } else if (idade >= 65 && idade <= 70) {
                return "Categoria 9";
            }
        }

        return "Não se enquadra em nenhuma categoria.";
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getGrupoRisco() {
        return grupoRisco;
    }
}
