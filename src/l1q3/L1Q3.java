package l1q3;

/**
 *
 * @author User
 */
public class L1Q3 {
    
    public static void main(String[] args) {
        
        //Square
        for(int i = 0; i <= 8; i++) {
            for(int j = 0; j <= 8; j++) {
                if(i == 0 || i == 8) {
                    System.out.print("*");
                } else {
                    if(j == 0 || j == 8) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        
        //Circle
        for(int i = 0; i <= 8; i++) {
            for(int j = 0; j <= 8; j++) {
                if(i == 0 || i == 8) {
                    if(j == 3 || j == 4 || j == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if(i == 1 || i == 7) {
                    if(j == 1 || j == 7) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if(j == 0 || j == 8) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }
        
        //Arrow
        //Top Pyramid
        for(int i = 0; i <= 2; i++) {
            for(int j = 3 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Bottom Downwards Line
        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j <= 5; j++) {
                if(j == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        //Diamond
        for(int i = 0; i <= 5; i++) {
            for(int j = 6 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= 5 * i; j++) {
                if(j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
        for(int i = 5; i >= 0; i--) {
            for(int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= 2 * i - 1; j++) {
                if(j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }
}
