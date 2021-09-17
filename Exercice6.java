public class Exercice6 {
    /*This problem was asked by Amazon.
     Run-length encoding is a fast and simple method of encoding strings. 
     The basic idea is to represent repeated successive characters as a single count and character. 
     For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".
     Implement run-length encoding and decoding. 
     You can assume the string to be encoded have no digits and consists solely of alphabetic characters. 
     You can assume the string to be decoded is valid.*/

    public static void main(String[] args) throws Exception {
        
        System.out.println(EncodeMethod("AAAABBBCCDAA"));

        System.out.println(DecodeMethod(EncodeMethod("AAAABBBCCDAA")));
    }

    public static String EncodeMethod (String pInputStr){        
        String letter = "";
        String encodadedString = "";                
        int j = 0;
        int amountDigit = 0;

        for(int i = 0; i < pInputStr.length(); i++){ 

            for (j = i; j < pInputStr.length(); j++){                
                //System.out.println(pInputStr.charAt(i) + " = " + pInputStr.charAt(j));

                if (pInputStr.charAt(i) == pInputStr.charAt(j)){                                        
                    letter = Character.toString(pInputStr.charAt(i));
                    amountDigit++;                    
                }
                else{
                    
                    break;
                }               
            }
            i = j;            
            encodadedString = encodadedString + Integer.toString(amountDigit) + letter;                 
            amountDigit = 0;
            //System.out.println(encodadedString);
            //continue;

        }
        return encodadedString;
    }

    public static String DecodeMethod (String pInputStr){                
        String decodedString = "";                        
        Integer amountDigit = 0;

        for(int i = 0; i < pInputStr.length(); i++){
            System.out.println(pInputStr.charAt(i));
            if (Character.isDigit(pInputStr.charAt(i))){
                amountDigit = Integer.parseInt(Character.toString(pInputStr.charAt(i)));                
                
                for (int j = 0; j < amountDigit; j++){
                    decodedString = decodedString + pInputStr.charAt(i + 1);
                }
            }
        }
        return decodedString;
    }    
}