package revisão;
public class atv_8 {

    public static void main(String[] args) {

        int[][] matriz = {
            {210, 3, 399900},
            {160, 3, 329900},
            {240, 3, 369000},
            {141, 2, 232000},
            {300, 4, 539900},
            {198, 4, 299900},
            {153, 3, 314900},
            {142, 3, 199000},
            {138, 3, 212000},
            {149, 3, 242500},
            {194, 4, 240000},
            {200, 3, 347000},
            {189, 3, 330000},
            {447, 5, 699900},
            {126, 3, 259900}
        };

        double somaPrecos = 0;
        int menorPreco = matriz[0][2];

        int maiorQuartos = matriz[0][1];
        int menorQuartos = matriz[0][1];

        int tamanhoMaiorQuartos = matriz[0][0];
        int tamanhoMenorQuartos = matriz[0][0];

        int somaTamanhoMais300k = 0;
        int contadorMais300k = 0;

        for (int i = 0; i < matriz.length; i++) {

            int tamanho = matriz[i][0];
            int quartos = matriz[i][1];
            int preco = matriz[i][2];

           
            somaPrecos += preco;

            
            if (preco < menorPreco) {
                menorPreco = preco;
            }

           
            if (quartos > maiorQuartos) {
                maiorQuartos = quartos;
                tamanhoMaiorQuartos = tamanho;
            }

            
            if (quartos < menorQuartos) {
                menorQuartos = quartos;
                tamanhoMenorQuartos = tamanho;
            }

            
            if (preco > 300000) {
                somaTamanhoMais300k += tamanho;
                contadorMais300k++;
            }
        }

        double mediaPrecos = somaPrecos / matriz.length;
        double mediaTamanhoMais300k = (double) somaTamanhoMais300k / contadorMais300k;

        int diferencaTamanho = tamanhoMaiorQuartos - tamanhoMenorQuartos;

        
        System.out.println("a) Média dos preços: " + mediaPrecos);
        System.out.println("b) Menor preço: " + menorPreco);
        System.out.println("c) Diferença de tamanho: " + diferencaTamanho);
        System.out.println("d) Média do tamanho das casas > 300.000: " + mediaTamanhoMais300k);
    }
}