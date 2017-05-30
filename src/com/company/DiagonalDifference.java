package com.company;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    int N= Integer.parseInt(in.nextLine());
    long difference=0;
    for(int i=0; i<N;i++){
        String[] row=in.nextLine().split(" ");
        difference+=(Integer.parseInt(row[i])-Integer.parseInt(row[N-i-1]));
    }

    System.out.println(Math.abs(difference));
    }
}
