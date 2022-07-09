# java-coding-interviews

### Challenge:
Create a function that takes as input two parameters: a text and an integer then return a boolean.
Examples of input -> output:
- "ABBDCA", 2 -> true
- "BAAABDBB", 3 -> true
- "BAABDB", 3 -> false
- "CABDDACCCA", 2 -> true
- "CABDACCCA", 2 -> true

### Proposed Solution:
The idea behind this challenge is to create a method or function that takes as input a sequence of letters and an integer N. if the text contains a repeating subsequence of N letters then it returns true else returns false.
```java
public static boolean solution(String sequence, int n) {
        if(sequence == null || n == 0) {
            return false;
        }
        for(char letter : CharHelper.toSet(sequence.toCharArray())) {
            String nLetter = CharHelper.nRepeat(letter, n);
            if(sequence.contains(nLetter)) {
                return true;
            }
        }
        return false;
    }
```

Check out the complete solution in Main class [here](https://github.com/saidRaiss/java-coding-interviews/blob/main/checking-consecutive-chars/Main.java).

### Try it out:
To test the propposed solution, visit any online Java compiler and put the Main class content. [Try it on Codingame platform](https://www.codingame.com/playgrounds/50785/test-java)
