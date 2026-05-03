public class zigzad {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

    
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }


    public static void main(String[] args) {
        zigzad sol = new zigzad();

        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println("Input: " + s1 + ", numRows=" + numRows1);
        System.out.println("Output: " + sol.convert(s1, numRows1));

        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println("Input: " + s2 + ", numRows=" + numRows2);
        System.out.println("Output: " + sol.convert(s2, numRows2));

        String s3 = "HELLO";
        int numRows3 = 2;
        System.out.println("Input: " + s3 + ", numRows=" + numRows3);
        System.out.println("Output: " + sol.convert(s3, numRows3));
    }
}


    

