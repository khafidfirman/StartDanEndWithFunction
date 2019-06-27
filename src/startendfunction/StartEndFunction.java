/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startendfunction;

/**
 *
 * @author gsi
 */
public class StartEndFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] LigaInggris = {"Arsenal", "Chelsea", "Charlton Athletic", "Manchester City", "Manchester United", "Leicester City"};

        //menggunakan fungsi start with
        System.out.println("---------fungsi start.with-------");
        for (String s : LigaInggris) {
            if (s.startsWith("Ch")) {
                System.out.println(s + " Kata yang berawalan CH");
            }
        }

        //menggunakan fungsi end with
        System.out.println("--------fungsi ends.with--------");
        for (String s : LigaInggris) {
            if (s.endsWith("City")) {
                System.out.println(s + " Kata yang berakhiran City");
            }
        }
    }

}
