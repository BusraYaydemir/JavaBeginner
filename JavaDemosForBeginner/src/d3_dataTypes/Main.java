package d3_dataTypes;

public class Main {

	public static void main(String[] args) {
		
		/*
         * Primitive Types:
         * type name / kind of value              / memory  / size range
         *
         * boolean   / true or false              / 1 byte  / not applicable
         * char      / single character (Unicode) / 2 bytes / all Unicode characters
         * byte      / integer                    / 1 byte  / (-128 to 127)
         * short     / integer                    / 2 bytes / (-32768 to 32767)
         * int       / integer                    / 4 bytes / (-2147483648 to 2147483647)
         * long      / integer                    / 8 bytes / (-9223372036854775808 to 9223372036854775807)
         * float     / floating-point number      / 4 bytes / (-3.40282347 x 10^38 to 1.40282346 x 10^-45)
         * double    / floating-point number      / 8 bytes / (+- 1.76769313486231570 x 10^308 to +- 4.94065645841246544 x 10^-324)
         */

        boolean isItTrue = true;
        char character = 'A'; // it returns a number according to ASCII
        byte byteNumber = 120;
        short shortNumber = 12000;
        int intNumber = 1200000000;
        long longNumber = 1200000000;
        float floatNumber = 1.402f;
        double doubleNumber = 1.402;

        System.out.println(
                        "isItTrue: " + isItTrue +
                        "\ncharachter: " + character +
                        "\nbyteNumber: " + byteNumber +
                        "\nshortNumber: " + shortNumber +
                        "\nintNumber: " + intNumber +
                        "\nlongNumber: " + longNumber +
                        "\nfloatNumber: " + floatNumber +
                        "\ndoubleNumber: " + doubleNumber
        );
        
	}

}
