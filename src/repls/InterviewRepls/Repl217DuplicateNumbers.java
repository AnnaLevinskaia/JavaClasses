package repls.InterviewRepls;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Repl217DuplicateNumbers {
    public static void main(String[] args ){
        List<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);



        System.out.println(countDuplicates(numbers));
    }

    static int countDuplicates(List<Integer> numbers){
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);

            for (int j = i + 1; j < numbers.size(); j++) {
                int num2 = numbers.get(j);

                if (num == num2) {
                    duplicates.add(num);
                }
            } //System.out.println(dupl);
        }

        HashSet<Integer> unique = new HashSet<Integer>(duplicates);

        return unique.size();
    }
}
