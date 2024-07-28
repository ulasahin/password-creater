package core.mappers;

import java.util.HashMap;
import java.util.Map;

public final class Mapper {
    public static  Map<Character, String> specialMappings = new HashMap<>();
    static {
        specialMappings.put('a', "rta43_");
        specialMappings.put('A', "R_TA43");
        specialMappings.put('b', "qw_e12");
        specialMappings.put('B', "QWE_12");
        specialMappings.put('c', "asd3?4");
        specialMappings.put('C', "A'SD34");
        specialMappings.put('d', "gd*a44");
        specialMappings.put('D', "GD/A44");
        specialMappings.put('e', "_aas60");
        specialMappings.put('E', "AA-S60");
        specialMappings.put('f', "isd+21");
        specialMappings.put('F', "İ-SD21");
        specialMappings.put('g', "pab4-5");
        specialMappings.put('G', "PA_B45");
        specialMappings.put('ğ', "opa9-8");
        specialMappings.put('Ğ', "OP%A98");
        specialMappings.put('h', "rte-00");
        specialMappings.put('H', "RTE;00");
        specialMappings.put('i', "fg!h89");
        specialMappings.put('İ', "FG{H89");
        specialMappings.put('ı', "ıyy)89");
        specialMappings.put('I', "IYY0]9");
        specialMappings.put('j', "jk^a81");
        specialMappings.put('J', "jka#81");
        specialMappings.put('k', "'sfg78");
        specialMappings.put('K', "S_FG78");
        specialMappings.put('l', "poa-01");
        specialMappings.put('L', "POA01_");
        specialMappings.put('m', "pu#t23");
        specialMappings.put('M', "PUT)23");
        specialMappings.put('n', "als5?1");
        specialMappings.put('N', "ALS+51");
        specialMappings.put('o', "a/aa31");
        specialMappings.put('O', "AAA31*");
        specialMappings.put('p', "nee3-4");
        specialMappings.put('P', "NE?E34");
        specialMappings.put('q', "lia9_1");
        specialMappings.put('Q', "Lİ-A91");
        specialMappings.put('r', "byz7{3");
        specialMappings.put('R', "BYZ73]");
        specialMappings.put('s', "hkn1)1");
        specialMappings.put('S', "HKN[11");
        specialMappings.put('t', "grk6(6");
        specialMappings.put('T', "gr+k66");
        specialMappings.put('u', "bkt-36");
        specialMappings.put('U', "BKT36_");
        specialMappings.put('ü', "a&sl99");
        specialMappings.put('Ü', "a%sl99");
        specialMappings.put('v', "sl&m23");
        specialMappings.put('V', "slm+23");
        specialMappings.put('w', "h-ee16");
        specialMappings.put('W', "HEE-16");
        specialMappings.put('x', "lka{83");
        specialMappings.put('X', "LKA8+3");
        specialMappings.put('y', "hjt^33");
        specialMappings.put('Y', "HJT^33");
        specialMappings.put('z', "yuh+61");
        specialMappings.put('Z', "YU#H61");
        specialMappings.put(' ', "_");
        specialMappings.put('1', "1");
        specialMappings.put('2', "2");
        specialMappings.put('3', "3");
        specialMappings.put('4', "4");
        specialMappings.put('5', "5");
        specialMappings.put('6', "6");
        specialMappings.put('7', "7");
        specialMappings.put('8', "8");
        specialMappings.put('9', "9");
        specialMappings.put('0', "0");
    }

    public static  Map<String, Character> reverseMappings = new HashMap<>();
    static {
        reverseMappings.put("rta43_", 'a');
        reverseMappings.put("R_TA43", 'A');
        reverseMappings.put("qw_e12", 'b');
        reverseMappings.put("QWE_12", 'B');
        reverseMappings.put("asd3?4", 'c');
        reverseMappings.put("A'SD34", 'C');
        reverseMappings.put("gd*a44", 'd');
        reverseMappings.put("GD/A44", 'D');
        reverseMappings.put("_aas60", 'e');
        reverseMappings.put("AA-S60", 'E');
        reverseMappings.put("isd+21", 'f');
        reverseMappings.put("İ-SD21", 'F');
        reverseMappings.put("pab4-5", 'g');
        reverseMappings.put("PA_B45", 'G');
        reverseMappings.put("opa9-8", 'ğ');
        reverseMappings.put("OP%A98", 'Ğ');
        reverseMappings.put("rte-00", 'h');
        reverseMappings.put("RTE;00", 'H');
        reverseMappings.put("fg!h89", 'i');
        reverseMappings.put("FG{H89", 'İ');
        reverseMappings.put("ıyy)89", 'ı');
        reverseMappings.put("IYY0]9", 'I');
        reverseMappings.put("jk^a81", 'j');
        reverseMappings.put("jka#81", 'J');
        reverseMappings.put("'sfg78", 'k');
        reverseMappings.put("S_FG78", 'K');
        reverseMappings.put("poa-01", 'l');
        reverseMappings.put("POA01_", 'L');
        reverseMappings.put("pu#t23", 'm');
        reverseMappings.put("PUT)23", 'M');
        reverseMappings.put("als5?1", 'n');
        reverseMappings.put("ALS+51", 'N');
        reverseMappings.put("a/aa31", 'o');
        reverseMappings.put("AAA31*", 'O');
        reverseMappings.put("nee3-4", 'p');
        reverseMappings.put("NE?E34", 'P');
        reverseMappings.put("lia9_1", 'q');
        reverseMappings.put("Lİ-A91", 'Q');
        reverseMappings.put("byz7{3", 'r');
        reverseMappings.put("BYZ73]", 'R');
        reverseMappings.put("hkn1)1", 's');
        reverseMappings.put("HKN[11", 'S');
        reverseMappings.put("grk6(6", 't');
        reverseMappings.put("gr+k66", 'T');
        reverseMappings.put("bkt-36", 'u');
        reverseMappings.put("BKT36_", 'U');
        reverseMappings.put("a&sl99", 'ü');
        reverseMappings.put("a%sl99", 'Ü');
        reverseMappings.put("sl&m23", 'v');
        reverseMappings.put("slm+23", 'V');
        reverseMappings.put("h-ee16", 'w');
        reverseMappings.put("HEE-16", 'W');
        reverseMappings.put("lka{83", 'x');
        reverseMappings.put("LKA8+3", 'X');
        reverseMappings.put("hjt^33", 'y');
        reverseMappings.put("HJT^33", 'Y');
        reverseMappings.put("yuh+61", 'z');
        reverseMappings.put("YU#H61", 'Z');
        reverseMappings.put(" ", '_');
        reverseMappings.put("1", '1');
        reverseMappings.put("2", '2');
        reverseMappings.put("3", '3');
        reverseMappings.put("4", '4');
        reverseMappings.put("5", '5');
        reverseMappings.put("6", '6');
        reverseMappings.put("7", '7');
        reverseMappings.put("8", '8');
        reverseMappings.put("9", '9');
        reverseMappings.put("0", '0');
    }

    public static String mapChar(char c) {
        if (Character.isUpperCase(c)) {
            return "XYZ89";
        } else {
            return "xyz67";
        }
    }
}
