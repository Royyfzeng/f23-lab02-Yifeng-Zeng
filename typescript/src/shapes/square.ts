import Shape from "./shape";

export default class Square implements Shape {
    #sideLen:number;
    constructor(s:number) {
        this.#sideLen = s;
    }
    computeArea = () :number => {
        return this.#sideLen * this.#sideLen;
    }
}