package sizeyunsuan;

import java.util.Random;
import java.util.Scanner;

public class Arithmetic {
		public static void main(String[] args){
			int x,y,z,p,g;
			int a,b,c,m,n;
			int h = 0;
			System.out.printf("��������Ҫ���ɵ���Ŀ������");
			Scanner d = new Scanner(System.in);
			x = d.nextInt();
			for(int i = 0 ; i < x ; i++){
				Random aa = new Random();
				Random bb = new Random();
				Random cc = new Random();
				Random mm = new Random();
				Random nn = new Random();
				a = aa.nextInt(10);
				b = bb.nextInt(10);
			    c = cc.nextInt(4);
			    m = mm.nextInt(10);
			    n = nn.nextInt(10);
				if(c==0){
					if(m==0&&n==0){
						m = mm.nextInt(10)+1;
						n = nn.nextInt(10)+1;
						if(a%m==0&&b%n==0){
							y = a + b;
							System.out.printf(a+"+"+b+"= ");
							Scanner e1 = new Scanner(System.in);
							z = e1.nextInt();
							if(z==y){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+y);
							}
						}else if(a%m==0&&b%n!=0){
							String l = b + "/" + n;
							y = a*n + b ;
							System.out.printf(a+"+"+l+"= ");
							String k = 	y + "/"+ n;
							Scanner e6 = new Scanner(System.in);
							String j = e6.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}else if(a%m!=0&&b%n==0){
							String l = a + "/" + m;
							y = a + b*m;
							System.out.printf(l+"+"+b+"= ");
							String k = 	y + "/"+ m;
							Scanner e7 = new Scanner(System.in);
							String j = e7.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}else{
							String l1 = a + "/" + m;
							String l2 = b + "/" + n;
							y = a*n + b*m;
							System.out.printf(l1+"+"+l2+"= ");
							String k = 	y + "/"+ n*m;
							Scanner e8 = new Scanner(System.in);
							String j = e8.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}
					}else if(m==0&&n!=0){
						m = mm.nextInt(10)+1;
						if(a%m==0&&b%n==0){
							y = a + b;
							System.out.printf(a+"+"+b+"= ");
							Scanner e1 = new Scanner(System.in);
							z = e1.nextInt();
							if(z==y){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+y);
							}
						}else if(a%m==0&&b%n!=0){
							String l = b + "/" + n;
							y = a*n + b ;
							System.out.printf(a+"+"+l+"= ");
							String k = 	y + "/"+ n;
							Scanner e6 = new Scanner(System.in);
							String j = e6.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}else if(a%m!=0&&b%n==0){
							String l = a + "/" + m;
							y = a + b*m;
							System.out.printf(l+"+"+b+"= ");
							String k = 	y + "/"+ m;
							Scanner e7 = new Scanner(System.in);
							String j = e7.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}else{
							String l1 = a + "/" + m;
							String l2 = b + "/" + n;
							y = a*n + b*m;
							System.out.printf(l1+"+"+l2+"= ");
							String k = 	y + "/"+ n*m;
							Scanner e8 = new Scanner(System.in);
							String j = e8.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}
					}else if(m!=0&&n==0){
						n = nn.nextInt(10)+1;
						if(a%m==0&&b%n==0){
							y = a + b;
							System.out.printf(a+"+"+b+"= ");
							Scanner e1 = new Scanner(System.in);
							z = e1.nextInt();
							if(z==y){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+y);
							}
						}else if(a%m==0&&b%n!=0){
							String l = b + "/" + n;
							y = a*n + b ;
							System.out.printf(a+"+"+l+"= ");
							String k = 	y + "/"+ n;
							Scanner e6 = new Scanner(System.in);
							String j = e6.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}else if(a%m!=0&&b%n==0){
							String l = a + "/" + m;
							y = a + b*m;
							System.out.printf(l+"+"+b+"= ");
							String k = 	y + "/"+ m;
							Scanner e7 = new Scanner(System.in);
							String j = e7.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}else{
							String l1 = a + "/" + m;
							String l2 = b + "/" + n;
							y = a*n + b*m;
							System.out.printf(l1+"+"+l2+"= ");
							String k = 	y + "/"+ n*m;
							Scanner e8 = new Scanner(System.in);
							String j = e8.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}
					}else{
						if(a%m==0&&b%n==0){
							y = a + b;
							System.out.printf(a+"+"+b+"= ");
							Scanner e1 = new Scanner(System.in);
							z = e1.nextInt();
							if(z==y){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+y);
							}
						}else if(a%m==0&&b%n!=0){
							String l = b + "/" + n;
							y = a*n + b ;
							System.out.printf(a+"+"+l+"= ");
							String k = 	y + "/"+ n;
							Scanner e6 = new Scanner(System.in);
							String j = e6.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}else if(a%m!=0&&b%n==0){
							String l = a + "/" + m;
							y = a + b*m;
							System.out.printf(l+"+"+b+"= ");
							String k = 	y + "/"+ m;
							Scanner e7 = new Scanner(System.in);
							String j = e7.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}else{
							String l1 = a + "/" + m;
							String l2 = b + "/" + n;
							y = a*n + b*m;
							System.out.printf(l1+"+"+l2+"= ");
							String k = 	y + "/"+ n*m;
							Scanner e8 = new Scanner(System.in);
							String j = e8.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}
					}
				}
				if(c==1){
					if(m==0&&n==0){
						m = mm.nextInt(10)+1;
						n = nn.nextInt(10)+1;
						if(a%m==0&&b%n==0){
							y = a - b;
							System.out.printf(a+"-"+b+"= ");
							Scanner e2 = new Scanner(System.in);
							z = e2.nextInt();
							if(z==y){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+y);
							}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						y = a*n - b ;
						System.out.printf(a+"-"+l+"= ");
						String k = 	y + "/"+ n;
						Scanner e6 = new Scanner(System.in);
						String j = e6.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = a - b*m;
						System.out.printf(l+"-"+b+"= ");
						String k = 	y + "/"+ m;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*n - b*m;
						System.out.printf(l1+"-"+l2+"= ");
						String k = 	y + "/"+ n*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
					}else if(m==0&&n!=0){
					m = mm.nextInt(10)+1;
					if(a%m==0&&b%n==0){
						y = a - b;
						System.out.printf(a+"-"+b+"= ");
						Scanner e1 = new Scanner(System.in);
						z = e1.nextInt();
						if(z==y){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+y);
						}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						y = a*n - b ;
						System.out.printf(a+"-"+l+"= ");
						String k = 	y + "/"+ n;
						Scanner e6 = new Scanner(System.in);
						String j = e6.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = a - b*m;
						System.out.printf(l+"-"+b+"= ");
						String k = 	y + "/"+ m;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*n - b*m;
						System.out.printf(l1+"-"+l2+"= ");
						String k = 	y + "/"+ n*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
				}else if(m!=0&&n==0){
					n = nn.nextInt(10)+1;
					if(a%m==0&&b%n==0){
						y = a - b;
						System.out.printf(a+"-"+b+"= ");
						Scanner e1 = new Scanner(System.in);
						z = e1.nextInt();
						if(z==y){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+y);
						}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						y = a*n - b ;
						System.out.printf(a+"-"+l+"= ");
						String k = 	y + "/"+ n;
						Scanner e6 = new Scanner(System.in);
						String j = e6.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = a - b*m;
						System.out.printf(l+"-"+b+"= ");
						String k = 	y + "/"+ m;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*n - b*m;
						System.out.printf(l1+"-"+l2+"= ");
						String k = 	y + "/"+ n*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
				}else{
					if(a%m==0&&b%n==0){
						y = a - b;
						System.out.printf(a+"-"+b+"= ");
						Scanner e1 = new Scanner(System.in);
						z = e1.nextInt();
						if(z==y){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+y);
						}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						y = a*n - b ;
						System.out.printf(a+"-"+l+"= ");
						String k = 	y + "/"+ n;
						Scanner e6 = new Scanner(System.in);
						String j = e6.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = a - b*m;
						System.out.printf(l+"-"+b+"= ");
						String k = 	y + "/"+ m;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*n - b*m;
						System.out.printf(l1+"-"+l2+"= ");
						String k = 	y + "/"+ n*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
				}
				}
			    if(c==2){
			    	if(m==0&&n==0){
						m = mm.nextInt(10)+1;
						n = nn.nextInt(10)+1;
						if(a%m==0&&b%n==0){
							y = a * b;
							System.out.printf(a+"x"+b+"= ");
							Scanner e3 = new Scanner(System.in);
							z = e3.nextInt();
							if(z==y){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+y);
							}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						y = a*b ;
						System.out.printf(a+"x"+l+"= ");
						String k = 	y + "/"+ n;
						Scanner e6 = new Scanner(System.in);
						String j = e6.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = b*a;
						System.out.printf(l+"x"+b+"= ");
						String k = 	y + "/"+ m;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*b;
						System.out.printf(l1+"x"+l2+"= ");
						String k = 	y + "/"+ n*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
					}else if(m==0&&n!=0){
					m = mm.nextInt(10)+1;
					if(a%m==0&&b%n==0){
						y = a * b;
						System.out.printf(a+"x"+b+"= ");
						Scanner e1 = new Scanner(System.in);
						z = e1.nextInt();
						if(z==y){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+y);
						}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						y = a*b;
						System.out.printf(a+"x"+l+"= ");
						String k = 	y + "/"+ n;
						Scanner e6 = new Scanner(System.in);
						String j = e6.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = a*b;
						System.out.printf(l+"x"+b+"= ");
						String k = 	y + "/"+ m;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*b;
						System.out.printf(l1+"x"+l2+"= ");
						String k = 	y + "/"+ n*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
				}else if(m!=0&&n==0){
					n = nn.nextInt(10)+1;
					if(a%m==0&&b%n==0){
						y = a * b;
						System.out.printf(a+"x"+b+"= ");
						Scanner e1 = new Scanner(System.in);
						z = e1.nextInt();
						if(z==y){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+y);
						}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						y = a*b ;
						System.out.printf(a+"x"+l+"= ");
						String k = 	y + "/"+ n;
						Scanner e6 = new Scanner(System.in);
						String j = e6.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = a*b;
						System.out.printf(l+"x"+b+"= ");
						String k = 	y + "/"+ m;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*b;
						System.out.printf(l1+"x"+l2+"= ");
						String k = 	y + "/"+ n*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
				}else{
					if(a%m==0&&b%n==0){
						y = a * b;
						System.out.printf(a+"x"+b+"= ");
						Scanner e1 = new Scanner(System.in);
						z = e1.nextInt();
						if(z==y){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+y);
						}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						y = a*b ;
						System.out.printf(a+"x"+l+"= ");
						String k = 	y + "/"+ n;
						Scanner e6 = new Scanner(System.in);
						String j = e6.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = a*b;
						System.out.printf(l+"x"+b+"= ");
						String k = 	y + "/"+ m;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*b;
						System.out.printf(l1+"x"+l2+"= ");
						String k = 	y + "/"+ n*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
				}
				}
				if(c==3){
					if(b==0){
						b = bb.nextInt(10)+1;
						if(m==0&&n==0){
							m = mm.nextInt(10)+1;
							n = nn.nextInt(10)+1;
							if(a%m==0&&b%n==0){
								if(a%b!=0){
									String l=a+"/"+b;
								System.out.printf(a+"��"+b+"= ");
								Scanner e4 = new Scanner(System.in);
								String p1 = e4.next();
								if(p1.equals(l)){
									System.out.println("�ش���ȷ��");
									h++;
								}else{
									System.out.println("�ش������ȷ����"+l);
								}
								}else{
									p = a / b;
									System.out.printf(a+"��"+b+"= ");
									Scanner e5 = new Scanner(System.in);
									g = e5.nextInt();
									if(p==g){
										System.out.println("�ش���ȷ��");
										h++;
									}else{
										System.out.println("�ش������ȷ����"+p);
									}
								}
						}else if(a%m==0&&b%n!=0){
							String l = b + "/" + n;
							if(a==0){System.out.println(a+"��"+l+"= ");
							Scanner e6 = new Scanner(System.in);
							p = e6.nextInt();
							if(p==0){System.out.println("�ش���ȷ��");h++;
							continue;}else{System.out.println("�ش������ȷ����0");continue;}
							}
							y = a*n ;
							System.out.printf(a+"��"+l+"= ");
							String k = 	y + "/"+ b;
							Scanner e6 = new Scanner(System.in);
							String j = e6.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}else if(a%m!=0&&b%n==0){
							String l = a + "/" + m;
							y = a;
							System.out.printf(l+"��"+b+"= ");
							String k = 	y + "/"+ m*b;
							Scanner e7 = new Scanner(System.in);
							String j = e7.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}else{
							String l1 = a + "/" + m;
							String l2 = b + "/" + n;
							y = a*n;
							System.out.printf(l1+"��"+l2+"= ");
							String k = 	y + "/"+ b*m;
							Scanner e8 = new Scanner(System.in);
							String j = e8.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}
						}else if(m==0&&n!=0){
						m = mm.nextInt(10)+1;
						if(a%m==0&&b%n==0){
							if(a%b!=0){
								String l=a+"/"+b;
							System.out.printf(a+"��"+b+"= ");
							Scanner e4 = new Scanner(System.in);
							String p1 = e4.next();
							if(p1.equals(l)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+l);
							}
							}else{
								p = a / b;
								System.out.printf(a+"��"+b+"= ");
								Scanner e5 = new Scanner(System.in);
								g = e5.nextInt();
								if(p==g){
									System.out.println("�ش���ȷ��");
									h++;
								}else{
									System.out.println("�ش������ȷ����"+p);
								}
							}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						if(a==0){System.out.println(a+"��"+l+"= ");
						Scanner e6 = new Scanner(System.in);
						p = e6.nextInt();
						if(p==0){System.out.println("�ش���ȷ��");h++;
						continue;}else{System.out.println("�ش������ȷ����0");continue;}
						}
						y = a*n ;
						System.out.printf(a+"��"+l+"= ");
						String k = 	y + "/"+ b;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = a;
						System.out.printf(l+"��"+b+"= ");
						String k = 	y + "/"+ m*b;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*n;
						System.out.printf(l1+"��"+l2+"= ");
						String k = 	y + "/"+ b*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
					}else if(m!=0&&n==0){
						n = nn.nextInt(10)+1;
						if(a%m==0&&b%n==0){
							if(a%b!=0){
								String l=a+"/"+b;
							System.out.printf(a+"��"+b+"= ");
							Scanner e4 = new Scanner(System.in);
							String p1 = e4.next();
							if(p1.equals(l)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+l);
							}
							}else{
								p = a / b;
								System.out.printf(a+"��"+b+"= ");
								Scanner e5 = new Scanner(System.in);
								g = e5.nextInt();
								if(p==g){
									System.out.println("�ش���ȷ��");
									h++;
								}else{
									System.out.println("�ش������ȷ����"+p);
								}
							}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						if(a==0){System.out.println(a+"��"+l+"= ");
						Scanner e6 = new Scanner(System.in);
						p = e6.nextInt();
						if(p==0){System.out.println("�ش���ȷ��");h++;
						continue;}else{System.out.println("�ش������ȷ����0");continue;}
						}
						y = a*n ;
						System.out.printf(a+"��"+l+"= ");
						String k = 	y + "/"+ b;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = a;
						System.out.printf(l+"��"+b+"= ");
						String k = 	y + "/"+ m*b;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*n;
						System.out.printf(l1+"��"+l2+"= ");
						String k = 	y + "/"+ b*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
					}else{
						if(a%m==0&&b%n==0){
							if(a%b!=0){
								String l=a+"/"+b;
							System.out.printf(a+"��"+b+"= ");
							Scanner e4 = new Scanner(System.in);
							String p1 = e4.next();
							if(p1.equals(l)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+l);
							}
							}else{
								p = a / b;
								System.out.printf(a+"��"+b+"= ");
								Scanner e5 = new Scanner(System.in);
								g = e5.nextInt();
								if(p==g){
									System.out.println("�ش���ȷ��");
									h++;
								}else{
									System.out.println("�ش������ȷ����"+p);
								}
							}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						if(a==0){System.out.println(a+"��"+l+"= ");
						Scanner e6 = new Scanner(System.in);
						p = e6.nextInt();
						if(p==0){System.out.println("�ش���ȷ��");h++;
						continue;}else{System.out.println("�ش������ȷ����0");continue;}
						}
						y = a*n ;
						System.out.printf(a+"��"+l+"= ");
						String k = 	y + "/"+ b;
						Scanner e6 = new Scanner(System.in);
						String j = e6.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = a;
						System.out.printf(l+"��"+b+"= ");
						String k = 	y + "/"+ m*b;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*n;
						System.out.printf(l1+"��"+l2+"= ");
						String k = 	y + "/"+ b*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
					}
					}else{
					//p =(float) a / b;
						if(m==0&&n==0){
							m = mm.nextInt(10)+1;
							n = nn.nextInt(10)+1;
							if(a%m==0&&b%n==0){
								if(a%b!=0){
									String l=a+"/"+b;
								System.out.printf(a+"��"+b+"= ");
								Scanner e4 = new Scanner(System.in);
								String p1 = e4.next();
								if(p1.equals(l)){
									System.out.println("�ش���ȷ��");
									h++;
								}else{
									System.out.println("�ش������ȷ����"+l);
								}
								}else{
									p = a / b;
									System.out.printf(a+"��"+b+"= ");
									Scanner e5 = new Scanner(System.in);
									g = e5.nextInt();
									if(p==g){
										System.out.println("�ش���ȷ��");
										h++;
									}else{
										System.out.println("�ش������ȷ����"+p);
									}
								}
						}else if(a%m==0&&b%n!=0){
							String l = b + "/" + n;
							y = a*n ;
							System.out.printf(a+"��"+l+"= ");
							String k = 	y + "/"+ b;
							Scanner e6 = new Scanner(System.in);
							String j = e6.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}else if(a%m!=0&&b%n==0){
							String l = a + "/" + m;
							if(a==0){System.out.println(a+"��"+l+"= ");
							Scanner e6 = new Scanner(System.in);
							p = e6.nextInt();
							if(p==0){System.out.println("�ش���ȷ��");h++;
							continue;}else{System.out.println("�ش������ȷ����0");continue;}
							}
							y = a;
							System.out.printf(l+"��"+b+"= ");
							String k = 	y + "/"+ m*b;
							Scanner e7 = new Scanner(System.in);
							String j = e7.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}else{
							String l1 = a + "/" + m;
							String l2 = b + "/" + n;
							y = a*n;
							System.out.printf(l1+"��"+l2+"= ");
							String k = 	y + "/"+ b*m;
							Scanner e8 = new Scanner(System.in);
							String j = e8.next();
							if(j.equals(k)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+k);
							}
						}
						}else if(m==0&&n!=0){
						m = mm.nextInt(10)+1;
						if(a%m==0&&b%n==0){
							if(a%b!=0){
								String l=a+"/"+b;
							System.out.printf(a+"��"+b+"= ");
							Scanner e4 = new Scanner(System.in);
							String p1 = e4.next();
							if(p1.equals(l)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+l);
							}
							}else{
								p = a / b;
								System.out.printf(a+"��"+b+"= ");
								Scanner e5 = new Scanner(System.in);
								g = e5.nextInt();
								if(p==g){
									System.out.println("�ش���ȷ��");
									h++;
								}else{
									System.out.println("�ش������ȷ����"+p);
								}
							}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						if(a==0){System.out.println(a+"��"+l+"= ");
						Scanner e6 = new Scanner(System.in);
						p = e6.nextInt();
						if(p==0){System.out.println("�ش���ȷ��");h++;
						continue;}else{System.out.println("�ش������ȷ����0");continue;}
						}
						y = a*n ;
						System.out.printf(a+"��"+l+"= ");
						String k = 	y + "/"+ b;
						Scanner e6 = new Scanner(System.in);
						String j = e6.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = a;
						System.out.printf(l+"��"+b+"= ");
						String k = 	y + "/"+ m*b;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*n;
						System.out.printf(l1+"��"+l2+"= ");
						String k = 	y + "/"+ b*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
					}else if(m!=0&&n==0){
						n = nn.nextInt(10)+1;
						if(a%m==0&&b%n==0){
							if(a%b!=0){
								String l=a+"/"+b;
							System.out.printf(a+"��"+b+"= ");
							Scanner e4 = new Scanner(System.in);
							String p1 = e4.next();
							if(p1.equals(l)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+l);
							}
							}else{
								p = a / b;
								System.out.printf(a+"��"+b+"= ");
								Scanner e5 = new Scanner(System.in);
								g = e5.nextInt();
								if(p==g){
									System.out.println("�ش���ȷ��");
									h++;
								}else{
									System.out.println("�ش������ȷ����"+p);
								}
							}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						if(a==0){System.out.println(a+"��"+l+"= ");
						Scanner e6 = new Scanner(System.in);
						p = e6.nextInt();
						if(p==0){System.out.println("�ش���ȷ��");h++;
						continue;}else{System.out.println("�ش������ȷ����0");continue;}
						}
						y = a*n ;
						System.out.printf(a+"��"+l+"= ");
						String k = 	y + "/"+ b;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = a;
						System.out.printf(l+"��"+b+"= ");
						String k = 	y + "/"+ m*b;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*n;
						System.out.printf(l1+"��"+l2+"= ");
						String k = 	y + "/"+ b*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
					}else{
						if(a%m==0&&b%n==0){
							if(a%b!=0){
								String l=a+"/"+b;
							System.out.printf(a+"��"+b+"= ");
							Scanner e4 = new Scanner(System.in);
							String p1 = e4.next();
							if(p1.equals(l)){
								System.out.println("�ش���ȷ��");
								h++;
							}else{
								System.out.println("�ش������ȷ����"+l);
							}
							}else{
								p = a / b;
								System.out.printf(a+"��"+b+"= ");
								Scanner e5 = new Scanner(System.in);
								g = e5.nextInt();
								if(p==g){
									System.out.println("�ش���ȷ��");
									h++;
								}else{
									System.out.println("�ش������ȷ����"+p);
								}
							}
					}else if(a%m==0&&b%n!=0){
						String l = b + "/" + n;
						if(a==0){System.out.println(a+"��"+l+"= ");
						Scanner e6 = new Scanner(System.in);
						p = e6.nextInt();
						if(p==0){System.out.println("�ش���ȷ��");h++;
						continue;}else{System.out.println("�ش������ȷ����0");continue;}
						}
						y = a*n ;
						System.out.printf(a+"��"+l+"= ");
						String k = 	y + "/"+ b;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else if(a%m!=0&&b%n==0){
						String l = a + "/" + m;
						y = a;
						System.out.printf(l+"��"+b+"= ");
						String k = 	y + "/"+ m*b;
						Scanner e7 = new Scanner(System.in);
						String j = e7.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}else{
						String l1 = a + "/" + m;
						String l2 = b + "/" + n;
						y = a*n;
						System.out.printf(l1+"��"+l2+"= ");
						String k = 	y + "/"+ b*m;
						Scanner e8 = new Scanner(System.in);
						String j = e8.next();
						if(j.equals(k)){
							System.out.println("�ش���ȷ��");
							h++;
						}else{
							System.out.println("�ش������ȷ����"+k);
						}
					}
					}
				    }
			    }
			}
			System.out.println("�ܹ�"+x+"�⣬"+"��ϲ���"+h+"��");
			System.out.println("��ȷ��Ϊ"+(float)h/x);
		}
	}

