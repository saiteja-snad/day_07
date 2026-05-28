package day07part;
import java.util.*;
class mobile{
String brand;
String ram;
int price;

mobile(String brand,String ram,int price){
	this.brand=brand;
	this.ram=ram;
	this.price=price;
}
mobile(){
	
}
public String toString() {
	return "mobile [brand="+brand+",ram="+ram+",price="+price+"]";
}
}
public class Mobilephone {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	mobile obj=new mobile(sc.next(),sc.next(),sc.nextInt());
	System.out.println(obj);
	
	
}
}
