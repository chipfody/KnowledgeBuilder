package com.chipfody;

/*
Given a measured file transfer time in seconds and file size in mebibytes (MiB), write a program to calculate the network's bandwidth in Megabits per second (Mb/s).
        Assume that all network capacity is used for the file data transfer, there is no overhead, loss, congestion, or contention.
        Input:
        Two space-delimited positive integers:
        File size in MiB
        Transfer time in seconds
        For example:
        400 336
        Output:
        Print an integer number that is the network's bandwidth in Mb/s.
        Round the calculated real value up to the smallest integer that is not less than the result. For the example above, the output would be:
        10
        Test 1

        Test Input
        400 336
        Expected Output
        10

        Test 2
        Test Input
        1 1
        Expected Output
        9

        Test 3
        Test Input
        12 101
        Expected Output
        1

        Test 4
        Test Input
        16738461734167846 13
        Expected Output
        10800953385456482
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
//import java.nio.charset.StandardCharsets;


public class Bandwidth {
        /**
         * Iterate through each line of input.
         */
        public static void main(String[] args) throws IOException {


            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(reader);
            String line;
            while ((line = in.readLine()) != null) {
                String[] data = line.split(" ");

                double fileSize = Integer.parseInt(data[0]) * 1.048576;
                double bandWidth = Integer.parseInt(data[1]) * .125;
                System.out.println("fs = " + fileSize + " " + " bw =" + bandWidth);

                double transferTime = Math.ceil(fileSize / bandWidth);

                System.out.println((BigInteger)transferTime);
            }
        }
    }

