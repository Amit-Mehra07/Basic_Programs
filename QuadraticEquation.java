package JavaProgram.BasicPrograms;

public class QuadraticEquation {
//Program to find roots of a quadratic equation : Ax^2 +/- Bx +/- C = 0
    public static void main(String[] args) {
        double a = 1, b = 9, c = 14;
        double determinant, root1, root2;

        //calculate the determinant
        determinant = b*b - 4*a*c; // it used to identify roots are real or i-complex(imaginary)

        if(determinant >=0){

            root1 = (-b + Math.sqrt(determinant))/2*a;
            root2 = (-b - Math.sqrt(determinant))/2*a;

            System.out.printf("Root1 =  %.2f  and Root2 = %.2f", root1, root2);

        }
        else {//determinant is less or equal then to determinant:

            double real = -b/2*a;
            double imaginary = Math.sqrt(-determinant)/2*a;

            System.out.printf("Root1 = %.2f + %.2fi", real,imaginary);
            System.out.printf("Root2 = %.2f - %.2fi", real,imaginary);
        }
    }
}
