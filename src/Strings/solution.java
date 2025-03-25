package Strings;

//2678. Number of Senior Citizens

public class solution {
    public int countOver60(String[] details) {
        int count = 0;
        
        for (String detail : details) {
            String ageString = detail.substring(11,13);
            int age = Integer.parseInt(ageString);
            if (age > 60) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        solution solution = new solution();
        String[] details = {"7868190130F7522","5303914400F9211","9273338290F4010"};
        int result = solution.countOver60(details);
        System.out.println("Number of people over 60 years old: " + result);
    }
}
