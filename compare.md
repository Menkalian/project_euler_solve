# Codevergleich zwischen Thomas und mir (Kilian):

### Thomas (Java):
```java
public class test {
    public static void main(String[] args) {
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        BigInteger result;
        for (int i = 1; i < 8871; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }
        System.out.println(b.toString(10));
        for (int i = 1; i < 671; i++) {
            c= c.multiply(BigInteger.valueOf(i));
        }
        System.out.println(c.toString(10));
        BigInteger d = BigInteger.valueOf(1);
        for (int i = 1; i < 8201; i++) {
            d = d.multiply(BigInteger.valueOf(i));
        }
        System.out.println(c.toString(10));
        d = c.multiply(d);
        BigInteger e = b.divide(d);
        System.out.println(e.toString(10));
    }
}
```
---
### Kilian (Java):
```java
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
```

### Kilian (Kotlin):
```kotlin
import java.math.BigInteger

fun fak(of: BigInteger): BigInteger {
    var prod = BigInteger.ONE
    var count = BigInteger.ONE

    while (count.compareTo(of) <= 0) {
        prod *= count
        count++
    }

    return prod
}

fun main(){
    val fak_1 = fak(BigInteger.valueOf(8871))
    val fak_2 = fak(BigInteger.valueOf(670))
    val fak_3 = fak(BigInteger.valueOf(8200))

    println("8871! = " + fak_1.toString(10) + "\n\n")
    println("670! = " + fak_1.toString(10) + "\n\n")
    println("8200! = " + fak_1.toString(10) + "\n\n")

    println("REsult: "+(fak_1/(fak_2*fak_3)).toString(10))
}
```
