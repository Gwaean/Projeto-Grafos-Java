import java.util.List;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe Grafo aqui.
 * 
 * @nicole 
 * @version (um número da versão ou uma data)
 */
public class Grafo
{ 
    private int [][] matrizAdj;
    private int V; // vértices
    /**
     * Construtor para objetos da classe Grafo
     * Constrói um grafo de tamanho maximo V x V
     * 
     */
    public Grafo(int V)
    {
        this.V = V;
        matrizAdj = new int [V][V];
        int i,j; //incializa a matriz sem nenhuma incidência
        for(i=0;i<V;i++){
            for(j=0;j<V;j++){
                matrizAdj[i][j] = 0; 
            }
        }

    }

    /**
     * permite que o usuario defina as arestas do grafo
     * sem permitir que haja uma conexão entre a origem e o destino se eles forem iguais
     * 
     *  
     */
    public void addAresta(int origem, int destino)
    {
        if(origem != destino){
            matrizAdj[origem][destino] = 1;
            matrizAdj[destino][origem] = 1;
        }
    }
    
     /* 
      * verifica se os vértices recebidos possuem uma aresta conectando eles,
      * ou seja, se são vizinhos
      */
    
    public boolean Vizinhos(int w1, int w2)
    {
        return matrizAdj[w1][w2] == 1;      

    }
    
    /**
     * retorna uma lista com os IDs de todos os vizinhos de um dado vértice w
     * 
     */
    public List<Integer> getVizinhos (int w)
    {
        List<Integer> vizinhos = new ArrayList <>();
        int i;
        for (i=0;i<V;i++){
         if(matrizAdj[w][i] == 1)
          vizinhos.add(i);
        }
        return vizinhos;
    }

    /**
     * imprime os vizinhos de um dado vértice
     *
     */
    public void imprimeVizinhos(int i)
    {
        int j = 0;
        while (j < V){
            if(matrizAdj[i][j] == 1)
                System.out.print("j  ");
            j++;
        }
    }

    /**
     * Imprime a matriz adjacente
     */
    public void imprimeMatriz(int matrizAdj)
    {   int i,j;
        int n = 0;
        for(j=1;j<V;j++)
        System.out.print("  j");
        System.out.print ("\n");
        i = 0; j = 0;
        while (i < V){
            if(i == n){
                 System.out.println ("n++");
                 n++;
            }
            System.out.print("  matrizAdj[i][j]");
            j++;
            if(j == V-1){
                i++;
                j = 0;
            }
        }
    }

}
