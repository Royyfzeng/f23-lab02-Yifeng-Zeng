import Shape from './shape';
export default class Rectangle implements Shape {
    #width: number;
    #height: number;
    constructor(width: number, height: number) {
        this.#width = width;
        this.#height = height;
    }
    computeArea = (): number => {
        return this.#width * this.#height
    }
}
