package Model;

public class Number {

    private int numerator;
    private int denominator;

    public Number(float number) {
        int unidades = (int) number;
        int decimales = (int)(number - (float) unidades);
        while (decimales!= 0){
            number *= 10;
            unidades = (int) number;
            decimales = (int)(number - (float) unidades);
        System.out.println(unidades + " " + decimales);
        }
        simplificate();
    }

    private void simplificate() {
        int[] primes = generatePrimes();
        for (int i = 0; i < primes.length; i++) {
            int prime = primes[i];
            if (numerator % prime == 0 && denominator % prime == 0) {
                numerator /= prime;
                denominator /= prime;
                i--;
            }
        }
    }

    private int[] generatePrimes() {
        return new int[] {1,2,3,5,7,11};       
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
