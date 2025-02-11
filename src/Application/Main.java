package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of shapes: ");
		int vezes = scan.nextInt();
		scan.nextLine();
		List<Shape> areas = new ArrayList<>();
		
		for(int i = 0; i < vezes; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char escolha = scan.nextLine().trim().toUpperCase().charAt(0);
			if(escolha == 'R') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				String color = scan.nextLine();
				
				System.out.print("Width: ");
				double width = scan.nextDouble();
				scan.nextLine();
				
				System.out.print("Height: ");
				double height = scan.nextDouble();
				scan.nextLine();
				
				Shape retangulo = new Rectangle(width, height, color);
				areas.add(retangulo);
				
			}
			else if(escolha == 'C') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				String color = scan.nextLine();
				System.out.print("Radius: ");
				double radius = scan.nextDouble();
				scan.nextLine();
				
				Shape circulo = new Circle(radius, color);
				areas.add(circulo);
				
				
			}
			
		
		}
		
		System.out.println("SHAPE AREAS: ");
		for(Shape area: areas) {
			System.out.println(String.format("%.2f", area.area()));
		}
		
		
		
		
		
		
		scan.close();
	}

}
