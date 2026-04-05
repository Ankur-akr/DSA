//Inverted half pyramid
/*public class patterns {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //System.out.println("*");
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}*/
//Solid Rectangle
/*public class patterns {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //System.out.println("*");
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}*/
//Right angled triangle
/*public class patterns {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //System.out.println("*");
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}*/
//number pyramid
/*public class patterns {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //System.out.println("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}*/
// number pyramid repeated
/*public class patterns {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //System.out.println("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }
}*/
//inverted number
/*public class patterns {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //System.out.println("*");
            for (int j = i; j <= 5; j++) {
                System.out.print(j-i+1 );
            }
            System.out.println();

        }
    }
}*/
//pyramid
/*public class patterns {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}*/
// inverted pyramid
/*public class patterns {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * 5 - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}*/
//Diamond
/*public class patterns {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        }


    }*/


// 0-1 triangle
/*public class patterns {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }System.out.println();
        }
    }
}*/
// butterfly pattern
/*public class patterns {
    public static void main(String[] args) {
        int n=5;
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            // Calculate stars for first half
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) spaces -= 2;
            else spaces += 2;
        }
        }
    }
*/
// solid rhombus
/*public class patterns {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/