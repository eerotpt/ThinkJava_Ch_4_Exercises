/**
 * Created by a on 08/11/2016.
 */
 public class Ch_4_3 {

        //exercise 4_3 part 1
        public static void printAmerican(String day,String month,int date, int year) {
            System.out.print("American version :\n") ;
            System.out.print(day);
            System.out.print(", ");
            System.out.print(month+" ");
            System.out.print(date);
            System.out.print(", ");
            System.out.println(year);
        }
        //exercise 4_3 part 2 and 3
        public static void main(String[] args) {
            String day="Sunday";
            String month="November";
            int date=6;
            int year=2016;
            printAmerican(day,month,date,year);
            printEuropean(date,month,year,day);
        }
        //exercise 4_3 part 3
        public static void printEuropean(int date,String month,int year,String day){
            System.out.print("\nEuropean version :\n") ;
            System.out.print(date+" ");
            System.out.print(month+" ");
            System.out.print(year+", ");
            System.out.println(day);

        }
    }


    

