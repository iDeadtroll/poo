package epdfinal2324;

class Pruebas{

    public static void main(String[] args) {
        int[] numeros = new int[10];

        for(int i = 0; i < 10; i++){
            numeros[i]= i + 1;
        }

        for(int num : numeros){
            System.out.println(num);
        }
    }
}