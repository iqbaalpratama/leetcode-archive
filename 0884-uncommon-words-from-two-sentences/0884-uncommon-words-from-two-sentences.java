class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer[]> sMap = new HashMap<>();
        for(String s : s1.split(" ")){
            if(sMap.isEmpty() || !sMap.containsKey(s)){
                Integer[] notes = new Integer[2];
                notes[0] = 1;
                notes[1] = 0;
                sMap.put(s, notes);
                continue;
            }
            if(sMap.containsKey(s)){
                Integer[] notes = sMap.get(s);
                notes[0] += 1;
                sMap.put(s, notes);
            }
        }
        for(String s : s2.split(" ")){
            if(sMap.isEmpty() || !sMap.containsKey(s)){
                Integer[] notes = new Integer[2];
                notes[0] = 0;
                notes[1] = 1;
                sMap.put(s, notes);
                continue;
            }
            if(sMap.containsKey(s)){
                Integer[] notes = sMap.get(s);
                notes[1] += 1;
                sMap.put(s, notes);
            }
        }
        sMap = sMap.entrySet().stream()
		    .filter(x -> (x.getValue()[0] == 1 && x.getValue()[1] == 0) || (x.getValue()[1] == 1 && x.getValue()[0] == 0))
		    .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
        String[] result = new String[sMap.keySet().size()];
        int i = 0;
        for(String s : sMap.keySet()){
            System.out.println(s + " map1");
            result[i] = s;
            i++;
        }
        return result;
    }
}