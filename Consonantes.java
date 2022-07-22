import java.util.Scanner;


public class App{
    
    static Scanner teclado= new Scanner(System.in);

    public static void main(String[] args) {
        Consonantes();
    }

    private static void Consonantes(){
        char[]consonantes={'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','x','z','w','y'};

        Palabra(consonantes);
    }

    private static void Palabra(char[]consonantes){
        String[]palabras;
        String word;
        int contador=0;

        System.out.println("Ingresar palabra");

        word=teclado.next().toLowerCase();

        for(int i=0;i<word.length();i++){

            char letter=word.charAt(i);

            for(int j=0;j<consonantes.length;j++){
                if(Character.compare(letter,consonantes[j])==0){
                    contador++;
                    System.out.println("Consonante N° "+contador+": ["+consonantes[j]+"]");
                }
            }
        }

        System.out.println("\nLa palabra: '"+word+"' 'contiene: "+contador+" consontantes");
    }

}
