public class interfaces {
    public static void main(String[] args) {
           King q=new King();
            q.moves();
    }
}
interface Herbivore{

}

interface Carnivore{

}

class Bear implements Herbivore,Carnivore{

}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all 4 directions");
    }
}


class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(by 1 step")v;
    }
}