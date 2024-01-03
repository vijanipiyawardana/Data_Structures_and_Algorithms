/**
 *  Integer reversion exercise
    Your task is to design an efficient algorithm to reverse a given integer. 
    For example if the input of the algorithm is 1234 then the output should be 4321.
    NOTE: the input is an integer (and not a string) !!!
 */
public class Exercise4 {

    public char[] solve(int num) {
        String numStr = String.valueOf(num);
        char[] charArr = numStr.toCharArray();
        this.print(charArr);
        this.reverse(charArr);
        this.print(charArr);
        return charArr;
    }

    private char[] reverse(char[] charArr) {
        int j = charArr.length - 1;
        for (int i = 0; i < charArr.length; i++) {
            if (i > j || i == j) 
                break;
            this.swap(charArr, i, j);
            j--;
        }
        return charArr;
    }

    private void swap(char[] charArr, int index1, int index2) {
        char temp = charArr[index1];
        charArr[index1] = charArr[index2];
        charArr[index2] = temp;
    }

    private void print(char[] charArr) {
        for (int i = 0; i < charArr.length; i++) {
            System.out.print(charArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Exercise4 e4 = new Exercise4();
        System.out.println(e4.solve(1234));
    }
    
}
