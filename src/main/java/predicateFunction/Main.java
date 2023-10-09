package predicateFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args){

        List<Student> studentDetails = new ArrayList<Student>();
        studentDetails.add(new Student("Rajesh", 79.5));
        studentDetails.add(new Student("Kannan", 80.0));
        studentDetails.add(new Student("kumar", 30.0));
        studentDetails.add(new Student("vijay", 40.0));

        Predicate<Student> checkPercentage = list->list.getPercentage()>50;
        for (Student studentDet:studentDetails) {
            if(checkPercentage.test(studentDet)){
                System.out.println(studentDet.getName());
            }
        }
    }
}
