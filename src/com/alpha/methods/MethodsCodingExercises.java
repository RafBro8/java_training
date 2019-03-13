package com.alpha.methods;

public class MethodsCodingExercises {


    public static void main(String[] args) {

    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int kilobytes = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes +
                    " KB = " + megaBytes +
                    " MB and " + kilobytes + " KB");
        }
    }

    public class BarkingDog {

    }
        public static boolean bark(boolean barking, int hourOfDay){
            if(barking == true){
                if(hourOfDay>=0 && hourOfDay<8 ){
                    return true;
                } else if(hourOfDay>22 && hourOfDay<=23){
                    return true;
                } else{
                    return false;
                }

            }
            return false;
        }

    }



