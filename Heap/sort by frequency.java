class Solution {
    public String frequencySort(String s) {
          Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);
        }
        
List<Map.Entry<Character, Integer>> entryList = new ArrayList<>((m.entrySet()));

        
         entryList.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder str = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            char c = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                str.append(c);
            }
        }
        return str.toString();
        }
    
}
