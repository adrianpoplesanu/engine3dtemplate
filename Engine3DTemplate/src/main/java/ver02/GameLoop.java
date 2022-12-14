package ver02;

import ver02.engine.Window;

public class GameLoop {
    private Window window;
    private static final int WIDTH = 1280, HEIGHT = 760;

    public void start() {

    }

    private void init() {
        window = new Window(WIDTH, HEIGHT, "Game");
        window.create();
    }

    private void update() {
        window.update();
    }

    private void render() {
        window.swapBuffers();
    }

    public void run() {
        init();
        while (!window.shouldClose()) {
            update();
            render();
        }
    }
}
