 

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String str:array){
        if(str.equals(value)) return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int len = array.length;
        len = len -1;
        for(int i=0;i<array.length/2; i++){
            String tmp;
            tmp = array[i];
            array[i] = array[len];
            array[len] = tmp;
            len =len-1;
        } 
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int len = array.length;
        len = len -1;
        for(int i=0;i<array.length/2; i++){
            if(!(array[i].equals(array[len]))){ return false;}
            len = len -1;
        } 
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String ret = "ffffffffffffffffffffffffff";
        char t ='t';
        
        for (int i = 0; i<26; i++){
            
            for(String str:array){
                
                if (str.contains(Character.toString(alpha.charAt(i)))){    
                    ret = ret.replace(ret.charAt(i),t);
                    
                }
                
                
            }
        }
        if(ret.equals("tttttttttttttttttttttttttt")) return true;
        else return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (String str: array){
            if(str.contains(value)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
       int newLen = getNumberOfOccurrences(array, valueToRemove);
       String[] ret = new String[array.length - newLen];
       int j=0;
       for(int i =0;i<array.length;i++){
           if(!(array[i].equals(valueToRemove))){
               ret[j] = array[i];
               j++;
            }
        }
       
       
       return ret;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        
        int counter = 0;
        for (int i=0; i<array.length-1;i++){
            if (array[i] == array[i+1]){
                counter++;
            }
        }
        
        String [] ret = new String[array.length-counter];
        int j = 0;
        for(int i = 0; i<array.length-1; i++){
            if(array[i] != array[i+1]){
                ret[j] = array[i];
                j++;
            }
        }
        ret[ret.length-1] = array[array.length-1];
        return ret;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
         int counter = 0;
        for (int i=0; i<array.length-1;i++){
            if (array[i] == array[i+1]){
                counter++;
            }
        }
        
        String [] ret = new String[array.length-counter];
        int j = 0;
        ret[0] = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i] == array[i-1]){
                ret[j] = ret[j] + array[i];
            
            }else{
                j++;
                ret[j] = array[i];
            }
        }
        
        return ret;
        
     
    }


}
