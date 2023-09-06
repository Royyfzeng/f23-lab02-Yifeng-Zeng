import newRenderer from "./renderer"
import Rectangle from "./shapes/rectangle";
import Shape from "./shapes/shape";
let rectangle: Shape = new Rectangle(2, 3)
let renderer = newRenderer(rectangle)
renderer.draw();