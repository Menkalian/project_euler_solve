import java.math.BigInteger;

public class bigintfak {
    public static void main(String[] args) {
        BigInteger fak_1 = fak(BigInteger.valueOf(8870));
        BigInteger fak_2 = fak(BigInteger.valueOf(670));
        BigInteger fak_3 = fak(BigInteger.valueOf(8200));

        BigInteger result = fak_1.divide(fak_2.multiply(fak_3));

        System.out.println(result.toString());
    }

    public static BigInteger fak(BigInteger of){
        BigInteger result = BigInteger.ONE;
        for(BigInteger i = BigInteger.ONE; i.compareTo(of) <= 0; i = i.add(BigInteger.ONE))
            result = result.multiply(i);
        return result;
    }
}
