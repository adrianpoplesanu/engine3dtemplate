package ver01;

public class GameLoop implements Runnable {
    private Thread game;

    public void start() {
        game = new Thread(this, "Game");
        game.start();
    }

    private void init() {
        System.out.println("game loop ... init()");
    }

    private void update() {
        System.out.println("game loop ... update()");
    }

    private void render() {
        System.out.println("game loop ... render()");
    }

    @Override
    public void run() {
        init();
        while (true) {
            update();
            render();
        }
    }
}
