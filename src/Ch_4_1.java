/**
 * Created by a on 08/11/2016.
 */
public class Ch_4_1 {

    /**When baffle is invoked at the end of the ping method,
     * then code will be running continuously between baffle() and ping()*/

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }
    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }
    public static void baffle() {
        System.out.print("wug");
        ping();
    }
    public static void ping() {
        System.out.println(".");
    }
}
