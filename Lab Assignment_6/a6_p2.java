/* A pentagonal number is defined as n (3n–1)/2 for n = 1, 2, . . ., and so on. Therefore, the first 
few numbers are 1, 5, 12, 22, . . . .  
Write a method with the following header that returns a pentagonal number: 
public static int getPentagonalNumber(int n) 
Write a java program that uses this method to display the first 100 pentagonal numbers with 
10 numbers on each line. */

public class a6_p2 {

    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        final int TOTAL_NUMBERS = 100;

        for (int i = 1; i <= TOTAL_NUMBERS; i++) {
            System.out.print(getPentagonalNumber(i)+"\t");

            // Print newline after every NUMBERS_PER_LINE numbers
            if (i % NUMBERS_PER_LINE == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}


// 1       5       12      22      35      51      70      92      117     145
// 176     210     247     287     330     376     425     477     532     590
// 651     715     782     852     925     1001    1080    1162    1247    1335
// 1426    1520    1617    1717    1820    1926    2035    2147    2262    2380
// 2501    2625    2752    2882    3015    3151    3290    3432    3577    3725
// 3876    4030    4187    4347    4510    4676    4845    5017    5192    5370
// 5551    5735    5922    6112    6305    6501    6700    6902    7107    7315
// 7526    7740    7957    8177    8400    8626    8855    9087    9322    9560
// 9801    10045   10292   10542   10795   11051   11310   11572   11837   12105
// 12376   12650   12927   13207   13490   13776   14065   14357   14652   14950