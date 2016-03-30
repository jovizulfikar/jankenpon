package jankenpon;

public class Jankenpon {
    private int point;
    String weapon[] = {"Stone", "Paper", "Scissor"};
    private int pick;
    

    public Jankenpon() {
        point = 100;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    
    public int getPoint() {
        return point;
    }

    public void setPick(int pick) {
        this.pick = pick;
    }

    public int getPick() {
        return pick;
    }
    
    

    
    
    
    
    
    void versus(Jankenpon human, Jankenpon monster){
        
        
        if(human.getPick() == 0){
            if(monster.getPick() == 1) human.setPoint(human.getPoint() - 10);
            else if(monster.getPick() == 2) monster.setPoint(monster.getPoint() - 10);
        }
        
        if(human.getPick() == 1){
            if(monster.getPick() == 0) monster.setPoint(monster.getPoint() - 10);
            else if(monster.getPick() == 2) human.setPoint(human.getPoint() - 10);
        }
        
        if(human.getPick() == 2){
            if(monster.getPick() == 0) human.setPoint(human.getPoint() - 10);
            else if(monster.getPick() == 1) monster.setPoint(monster.getPoint() - 10);
        }
        
        
    }
    
    
    
    
    
}
