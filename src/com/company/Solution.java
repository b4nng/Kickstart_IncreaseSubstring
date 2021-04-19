package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {

        try{
            String alf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            ArrayList<String> ALFABETO = new ArrayList<>();
            ALFABETO.addAll(Arrays.asList(alf.split("")));

            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt(); // T testes

            ArrayList<String> testes = new ArrayList<>();

            for(int i = 0; i<T; i++){
                int N = scanner.nextInt(); // N tamanho string

                String input = scanner.next();
                if(input.length() != N){
                    throw new Exception();
                }
                testes.add(input);
            }

            RodarTestes(testes, ALFABETO);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void RodarTestes(ArrayList<String> testes, ArrayList<String> ALFABETO) throws Exception{
        try{
            for(int i = 0; i < testes.size(); i++){
                int caso = i+1;
                System.out.print("Case #"+caso+": ");

                int tamanhoValidoSubstring = 1;
                System.out.print(tamanhoValidoSubstring+" ");
                for(int j=0; j < testes.get(i).length(); j++){
                    if(j+1 == testes.get(i).length()) break;

                    if(ComparaValor(Character.toString(testes.get(i).charAt(j)),
                            Character.toString(testes.get(i).charAt(j+1)), ALFABETO)){;
                        tamanhoValidoSubstring ++;
                    }
                    else{
                        tamanhoValidoSubstring = 1;
                    }
                    System.out.print(tamanhoValidoSubstring+" ");
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static boolean ComparaValor(String a, String b, ArrayList<String> ALFABETO){
        return ALFABETO.indexOf(a) < ALFABETO.indexOf(b);
    }

}
