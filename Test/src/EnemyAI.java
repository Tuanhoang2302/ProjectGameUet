public class EnemyAI {
    public static EnemyRoute route;
    public static EnemyAIMove moveAI;
    public static int baseposX;
    public static int baseposY;
    public int id;

    public EnemyAI (Level level){
        route = new EnemyRoute(level);
        baseposX = route.base.xPos;
        baseposY = route.base.yPos;

        moveAI = new EnemyAIMove(0);
    }

    public EnemyAI(int id){
        this.id = id;
    }


}
