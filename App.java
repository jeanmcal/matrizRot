package EstudoMatriz;

public class App {

    public static void main(String[] args) {
        int [][] matriz = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        int [][] matrizX = new int [3][3];
        
        //Print matriz normal
        for (int l = 0; l < 3; l++){
            for (int c = 0; c < 3; c++){
                System.out.print(matriz[l][c] + " - ");
            }
            System.out.println("");
        }
       
        //Rotação da matriz
        for (int l = 0; l < 3; l++){
            for (int c = 0; c < 3; c++){   
                matrizX [c][3 - 1 - l] = matriz[l][c];                                    
            }     
        }
        System.out.println("*****************************");
        //Print da matriz rotacionada em 90º     
        for (int l = 0; l < 3; l++){
            for (int c = 0; c < 3; c++){ 
                System.out.print(matrizX[l][c] + " - ");
            }
            System.out.println("");
        }
        
    }
}
