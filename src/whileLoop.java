public class whileLoop {

    public static void main(String [] args) {

        boolean condition = true;
        int sum = 10;

        System.out.println("at the start sum is :"+ sum);
        System.out.println("at the start condition is :"+ condition);
        while (condition) {
            sum -= 1;
            if(sum ==0)
                condition=false;
            System.out.println("during the loop sum is: "+ sum);
        }

        System.out.println("at the end condition is: "+ condition);
        System.out.println("at the end sum is : "+ sum);


    }
}
