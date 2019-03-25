package org.fasttrackit.lab3;

import java.util.Scanner;



        public class RezolvareLab32<result> {
            public static void main(String[] args) {


                int n=7,p=6,result=1;

                if(n>=0&&p==0)
                {
                    result=1;
                }
                else if(n==0&&p>=1)
                {
                    result=0;
                }
                else
                {
                    for(int i=1;i<=p;i++)
                    {
                        result=result*n;
                    }
                }
                System.out.println(n+"^"+p+"="+result);



            {

                long r=1;

                Scanner sc=new Scanner(System.in);

                System.out.println("enter number");

                n=sc.nextInt();

                System.out.println("enter power");

                p=sc.nextInt();

                if(n>=0&&p==0)
                {
                    r =1;
                }
                else if(n==0&&p>=1)
                {
                    r=0;
                }
                else
                {
                    for(int i=1;i<=p;i++)
                    {
                        r=r *n;
                    }
                }

                System.out.println(n+"^"+p+"="+r);

            }



            }
        }

