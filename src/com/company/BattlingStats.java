package com.company;

import java.util.Scanner;
import java.io.*;
import java.text.*;


public class BattlingStats {

    public static void main(String[] args) {


                PrintStream ps;

                float ab;

                float hits;

                float avg;



                String file = "C:\\Users\\Welcome Back\\Desktop\\BaseballData.txt";

                Scanner scanner = null;

                BufferedReader reader;

                reader = new BufferedReader(new InputStreamReader(System.in));


                DecimalFormat dec = new DecimalFormat("0.000");



                try {


                    System.out.println("How many at bats? ");

                    ps = new PrintStream(reader.readLine());


                    Scanner in = new Scanner(new FileReader(file));

                    while (in.hasNextLine())

                    {

                        String name = in.nextLine();

                        String[] temp = null;

                        temp = new String[3];

                        temp = name.split("\\s+");



                        for (int i = 0; i <= userinput; i++) {

                        {




                            name = temp[0];

                            ab = Float.parseFloat(temp[1]);

                            hits = Float.parseFloat(temp[2]);


                            avg = hits/ab;

                            ps.println(name + "    " + ab + "    " + hits + "    " + dec.format(avg));

                            //ps.println(ab);

                            //ps.println(hits);

                            //ps.println(avg);

                        }


                    }






                }


                catch (Exception e)

                {

                    System.out.println("ERROR. Could not open file!");

                }




            }



        }

