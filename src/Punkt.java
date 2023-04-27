class Punkt {
    public int x;
    public int y;

    Punkt() {
        x = 0;
        y = 0;
    }

    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }

    int getY() {
        return y;
    }

    void setY(int y) {
        this.y = y;
    }

    void zeruj() {
        x = 0;
        y = 0;
    }

    void opis() {
        System.out.println("Punkt(" + x + ", " + y + ")");
    }
    void przesun(int x, int y) {
        this.x += x;
        this.y += y;
    }
}