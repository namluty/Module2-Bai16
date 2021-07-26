package PracticeUnit16.Bai2;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src/PracticeUnit16/Bai2/numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src/PracticeUnit16/Bai2/result.txt", maxValue);
    }
}
