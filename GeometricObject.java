
    public class GeometricObject {
        boolean filled;
        String color = "yellow";
        public GeometricObject(){
            this.color=color;
            this.filled= filled;
        }

        public boolean isFilled() {
            return true;
        }

        public String getColor() {
            return color;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {

                return "the color is: " +color + " filled " + filled;
            }
        }

