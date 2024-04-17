package patrones.P06_decorator.ej002;

public class RedShapeDecorator extends ShapeDecorator {

	   public RedShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public void draw() {
	      decoratedShape.draw();	       
	      setRedBorder(decoratedShape);
	   }

	   private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }
}