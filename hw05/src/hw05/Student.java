
package hw05;

/**
 *
 * @author b10630315
 */
public class Student {
    private String name;
    private int chinese;
    private int english;
    private int math;
    private int sum;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = getChinese()+getEnglish()+getMath();
    }

    
   
    @Override
    public String toString(){
        String str=name+" "+chinese+" "+english+" "+math+" "+sum;
        return str;
    }
    
}
