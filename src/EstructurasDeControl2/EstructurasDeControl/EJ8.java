package EstructurasDeControl2.EstructurasDeControl;

public class EJ8 {
    /*
    * 8) Crear un programa Java que dibuje la siguiente pirámide:

    * */
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            if(i==1){
                System.out.println("* * * * * * * * *");
            }else if(i==2){
                System.out.println(" * * * * * * * *");
            }else if(i==3){
                System.out.println("  * * * * * * *");
            }
            else if (i==4){
                System.out.println("   * * * * * *");
            }
                else if (i==5){
                System.out.println("    * * * * *");
            }
                else if (i==6){
                System.out.println("     * * * *");
            }
                else if (i==7){
                System.out.println("      * * *");
            }
                else if (i==8){
                System.out.println("       * * ");
            }else if(i==9){
                System.out.println("        *");
            }

        }

        //While
        System.out.println("");
        int i=1;
        while (i<=9){
            i++;
            if(i==1){
                System.out.println("* * * * * * * * *");
            }else if(i==2){
                System.out.println(" * * * * * * * *");
            }else if(i==3){
                System.out.println("  * * * * * * *");
            }
            else if (i==4){
                System.out.println("   * * * * * *");
            }
            else if (i==5){
                System.out.println("    * * * * *");
            }
            else if (i==6){
                System.out.println("     * * * *");
            }
            else if (i==7){
                System.out.println("      * * *");
            }
            else if (i==8){
                System.out.println("       * * ");
            }else if(i==9){
                System.out.println("        *");
            }
        }

///DoWhile
     i=1;
        System.out.println("");
        do {
            i++;
            if(i==1){
                System.out.println("* * * * * * * * *");
            }else if(i==2){
                System.out.println(" * * * * * * * *");
            }else if(i==3){
                System.out.println("  * * * * * * *");
            }
            else if (i==4){
                System.out.println("   * * * * * *");
            }
            else if (i==5){
                System.out.println("    * * * * *");
            }
            else if (i==6){
                System.out.println("     * * * *");
            }
            else if (i==7){
                System.out.println("      * * *");
            }
            else if (i==8){
                System.out.println("       * * ");
            }else if(i==9){
                System.out.println("        *");
            }

        }while (i<=9);
    }

}
