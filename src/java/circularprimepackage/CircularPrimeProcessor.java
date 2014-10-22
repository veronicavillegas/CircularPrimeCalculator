/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularprimepackage;

/**
 *
 * @author vvillegas
 */
public class CircularPrimeProcessor {

    private int numberToCheck;
    private String isCircularPrime;

    public int getNumberToCheck() {
        return numberToCheck;
    }

    public void setNumberToCheck(int numberToCheck) {
        this.numberToCheck = numberToCheck;
    }

    public String getIsCircularPrime() {
        System.out.println(numberToCheck);
        return isCircularPrime() ? "yes" : "no";
    }

    public void setIsCircularPrime(String isCircularPrime) {
        this.isCircularPrime = isCircularPrime;
    }

    public CircularPrimeProcessor() {
        System.out.println("en constructor");
    }

    public boolean isCircularPrime() {
//if(!isValidNumber(numberToCheck)) return false;
        System.out.println(numberToCheck);
        boolean isCircularPrime = CircularPrimeCommon.isPrime(numberToCheck) && CircularPrimeCommon.isCircularNumber(numberToCheck);
        System.out.println(isCircularPrime);
        return isCircularPrime;
    }

    private boolean isValidNumber(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
