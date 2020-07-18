package hw05;

import java.io.*;


/**
 *
 * @author b10630315
 */
public class Hw05 {

    static Student pros[];
    static Student temp;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {

            FileReader fr = new FileReader("scores.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = null;//Read a line 
            StringBuilder data = new StringBuilder();

            while ((line = br.readLine()) != null) {
                data.append(line + "@");
            }
            br.close();
            fr.close();

            setPro(data.toString());
            System.out.println();
            System.out.println("After ranking:");
            setrank();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setPro(String str) {

        String line[] = str.split("@");

        pros = new Student[line.length];
        for (int i = 0; i < pros.length; i++) {
            String fea[] = line[i].split(",");
            pros[i] = new Student();
            pros[i].setName(fea[0]);
            pros[i].setChinese(Integer.parseInt(fea[1]));
            pros[i].setEnglish(Integer.parseInt(fea[2]));
            pros[i].setMath(Integer.parseInt(fea[3]));
            pros[i].setSum(Integer.parseInt(fea[1]) + Integer.parseInt(fea[2]) + Integer.parseInt(fea[3]));
            System.out.println(pros[i]);
        }

    }

    public static void setrank() {
        for (int i = 0; i < pros.length; i++) {
            for (int j = i + 1; j < pros.length; j++) {
                if (pros[j].getSum() > pros[i].getSum()) {
                    temp = pros[i];
                    pros[i] = pros[j];
                    pros[j] = temp;
                } else if (pros[j].getSum() == pros[i].getSum()) {
                    if (pros[j].getChinese() > pros[i].getChinese()) {
                        temp = pros[i];
                        pros[i] = pros[j];
                        pros[j] = temp;
                    } else if (pros[j].getChinese() == pros[i].getChinese()) {
                        if (pros[j].getEnglish() > pros[i].getEnglish()) {
                            temp = pros[i];
                            pros[i] = pros[j];
                            pros[j] = temp;
                        } else if (pros[j].getEnglish() == pros[i].getEnglish()) {
                            if (pros[j].getMath() > pros[i].getMath()) {
                                temp = pros[i];
                                pros[i] = pros[j];
                                pros[j] = temp;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < pros.length; i++) {
            System.out.println(pros[i]);
        }
    }
}
