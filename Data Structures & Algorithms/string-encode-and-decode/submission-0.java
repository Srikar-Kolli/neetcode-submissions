class Solution {

    public String encode(List<String> strs) {


        String result = "";

        for (String s : strs) {

            result += s.length() + "#" + s;

        }

        return result;

    }

    public List<String> decode(String str) {

        List<String> newList = new LinkedList<>();

        int index = 0;

        while (str.length() > index) {
            
            int pos = index;

            while (str.charAt(index) != '#') {


                index++;

            }

            String length = str.substring(pos, index);

            int val = Integer.parseInt(length);

            index++;
            String s = "";

            for (int i = 0; i < val; i++) {
                s += str.charAt(index);
                index++;
            }

            newList.add(s);
        }

        return newList;
    }
}
