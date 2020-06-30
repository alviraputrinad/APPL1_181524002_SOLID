package Program;

import Models.Circle;
import Models.GraphicsEditor;
import Models.Rectangle;
import Models.Square;

public class Startup {
	
	public static void main(String[] args) {
		
			Circle circle = new Circle();
			Rectangle rectangle = new Rectangle();
			Square square = new Square();
			
			GraphicsEditor editor = new GraphicsEditor();
			
			editor.DrawShape(circle);
			editor.DrawShape(rectangle);
			editor.DrawShape(square);
			
	}
}
