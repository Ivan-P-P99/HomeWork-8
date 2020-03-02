package fmi.informatics.SortingPackage;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Sort sort = new Sort();
        String ask = "Ascending order (1) or Descending order (2)";
        System.out.println(ask);
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        if(answer == 1 ){
            sort.Ascending();
        }
        else if(answer == 2){
            sort.Descending();
        }
        sort.testFunction((something1, something2) -> something1 + something2);
    }
}
