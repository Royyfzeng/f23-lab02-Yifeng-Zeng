import newRenderer from "./renderer"
import Rectangle from "./shapes/rectangle";
import Shape from "./shapes/shape";
const rectangle: Shape = new Rectangle(2, 3)
const renderer = newRenderer(rectangle)
renderer.draw();