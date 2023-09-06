import Shape from "./shape";
export default class Circle implements Shape {
    #radius:number;
    constructor(r:number) {
        this.#radius = r;
    }
    computeArea = (): number => {
        return this.#radius * this.#radius * Math.PI;
    }
}