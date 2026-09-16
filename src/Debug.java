public class Debug {

    /* Hvis du kører programmet får du en række fejl.
     * Fix programmet så det kan køre
     * outputtet bliver:
     * "7 is the smallest!"
     *
     *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
     */


    void main() {

        int a = 7, b = 42;
        minimum(a,b);

        //Har fjernet hele if statement i main, det skal kun bruges og kaldes fra metoden minimum, ellers vil der blive printet det samme flere gange.

    }

    int minimum(int a, int b) { //Metoden var void, den er ændret til "int" så den kan "return"

        int smaller = 0; //Initialiserer "smaller", så man kan fjerne "int" ved de andre og samle en værdi.

        if (a < b) {

            smaller = a;
            System.out.println(smaller +" is the smallest");

        } else if (a > b) { //Skal lave else if, så man kan dække alle scenarier.

            smaller = b;
            System.out.println(smaller +" is the smallest");


        } else {

            System.out.println("They're equal"); //else så den kan fange hvis a=b/b=a

        }

        return smaller; //Fjernet "Int"

    }

}
