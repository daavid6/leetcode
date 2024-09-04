class Solution {
    public int getLucky(String s, int k) {
        int aux = 0;
        String numList = "";
        char[] numListCharArray;
        char[] originalStr = s.toCharArray();

        for (char c : originalStr) {
            aux = ((int)c - 96);
            numList += Integer.toString(aux);
        }

        System.out.println("numList: " + numList);


        while (numList.length() > 1 && k > 0) {
            System.out.println("k: " + k);

            aux = 0;
            numListCharArray = numList.toCharArray();
            
            for (int j = 0; j < numListCharArray.length; j++) {
                aux += ((int)numListCharArray[j] - 48);
            }
                
            numList = Integer.toString(aux);
            k--;
        }

        return aux;
    }
}

