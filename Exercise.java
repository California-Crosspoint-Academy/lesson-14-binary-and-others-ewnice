//Eunice Chan
//2025-10-1

public class Exercise {
    public static void main(String[] args) {

        //2. 35

        //7. 91
        
        //11. 111011110

        //20. 2

        //21. 11000110

        //22. 10100010

        //23. the joke is that binary only has 2 digits

        //24.
        String s = "101101";
        int b = 2;      
        int i = Integer.parseInt(s, b);
        System.out.println(i);

        //25. 
        String x = "9322gf33";
        String y = x.toUpperCase();
        long decimalValue = Long.parseLong(y, 28);
        String S = String.valueOf(decimalValue);
        System.out.println(s);

        //30. 9
    }
}