package ch02_2_2_enum_digits_ex;

public class enum_digits {
    public static void main(String[] args) {
        enum NumberPrefix {
            MEDEN(0), UNI(1), BI(2), TRI(3), QUAD(4), PENTA(5), HEXA(6), SEPT(7), OCTA(8), NONA(9), DECA(10);
            private final int numPrefix_decimal;
            String[] NumPrefixStrings = {"Meden-", "Uni-", "Bi-/Di-", "Tri-", "Quad-", "Penta-", "Hexa-", "Sept-", "Octa-", "Nona-", "Deca-"};
            NumberPrefix(int no) {this.numPrefix_decimal = no;}
            int getNumPrefix_decimal() {return numPrefix_decimal;}
            String getNumPrefix_str() {return NumPrefixStrings[this.numPrefix_decimal];}
        }
        NumberPrefix[] numPrefixes = {NumberPrefix.MEDEN, NumberPrefix.UNI, NumberPrefix.BI, NumberPrefix.TRI,
                NumberPrefix.QUAD, NumberPrefix.PENTA,
                NumberPrefix.HEXA, NumberPrefix.SEPT, NumberPrefix.OCTA, NumberPrefix.NONA, NumberPrefix.DECA};
        for (int i=0; i<numPrefixes.length; i++) {
            System.out .printf("numPrefixes[%2d] = %10s => %2d\n", i, numPrefixes[i].getNumPrefix_str(),
                    numPrefixes[i].getNumPrefix_decimal());
        }
    }
}
